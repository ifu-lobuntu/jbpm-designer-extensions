package org.jbpm.designer.vdrc;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jboss.errai.bus.server.annotations.Service;
import org.jbpm.designer.extensions.emf.util.AbstractEmfJsonMarshaller;
import org.jbpm.designer.extensions.emf.util.IEmfProfile;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.AssetBuilderFactory;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.impl.AssetBuilder;
import org.jbpm.designer.server.service.AssetHelper;
import org.jbpm.designer.server.service.PathEvent;
import org.jbpm.designer.util.Utils;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.omg.vdml.Collaboration;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.uberfire.backend.server.util.Paths;
import org.uberfire.backend.vfs.Path;
import org.uberfire.backend.vfs.PathFactory;
import org.uberfire.io.IOService;
import org.uberfire.java.nio.IOException;
import org.uberfire.java.nio.file.DirectoryStream;

@Service
@ApplicationScoped
public class DefaultCollaborationAssetService implements CollaborationAssetService {
    private Map<CollaborationType, EClass> collaborationTypeMap = new HashMap<CollaborationType, EClass>();
    {
        collaborationTypeMap.put(CollaborationType.BUSINESS_NETWORK, VDMLPackage.eINSTANCE.getBusinessNetwork());
        collaborationTypeMap.put(CollaborationType.CAPABILITY_METHOD, VDMLPackage.eINSTANCE.getCapabilityMethod());
        collaborationTypeMap.put(CollaborationType.COMMUNITY, VDMLPackage.eINSTANCE.getCommunity());
        collaborationTypeMap.put(CollaborationType.ORG_UNIT, VDMLPackage.eINSTANCE.getOrgUnit());
    }

    @Inject
    private Repository repository;

    @Inject
    @Named("ioStrategy")
    private IOService ioService;
    @Inject
    Event<PathEvent> pathEvent;
    @Inject
    AssetHelper assetHelper;
    @Inject
    VdmlRoleCollaborationProfileImpl profile;

    @Override
    public Path createCollaborationDiagram(Path collaborationFile, String otherProfileName) {
        pathEvent.fire(new PathEvent(collaborationFile.toURI()));
        Path directory = Paths.convert(Paths.convert(collaborationFile).getParent());
        IEmfProfile otherProfile = profile.getOtherProfile(otherProfileName);
        String diagramUuid = collaborationFile.toURI().replace(profile.getSerializedModelExtension(), otherProfile.getSerializedModelExtension());
        URI otherUri = EMFVFSURIConverter.toPlatformResourceURI(diagramUuid);
        String fileName = otherUri.lastSegment();
        String processId = buildProcessId(EMFVFSURIConverter.toPlatformRelativeString(directory), fileName);
        VDMLDiagram otherDiagram = buildDiagramInValueDeliveryModel(otherProfile, otherUri, processId + otherProfileName);
        Resource collaborationResource = otherDiagram.eResource().getResourceSet().getResource(EMFVFSURIConverter.toPlatformResourceURI(collaborationFile), true);
        ValueDeliveryModel vdm = (ValueDeliveryModel) collaborationResource.getContents().get(0);
        Collaboration coll = vdm.getCollaboration().get(0);
        otherDiagram.setVdmlElement(coll);
        AssetBuilder builder = AssetBuilderFactory.getAssetBuilder(fileName);
        builder.location(directory.toURI()).content(toString(otherDiagram)).uniqueId(diagramUuid);
        Asset<String> processAsset = builder.getAsset();
        repository.createAsset(processAsset);
        return PathFactory.newPath(fileName, diagramUuid);
    }

    private String toString(VDMLDiagram otherDiagram) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            otherDiagram.eResource().save(baos, AbstractEmfJsonMarshaller.buildDefaultResourceOptions());
            String string = baos.toString("UTF-8");
            return string;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private VDMLDiagram buildDiagramInValueDeliveryModel(IEmfProfile otherProfile, URI uri, String modelId) {
        ResourceSet rst = new ResourceSetImpl();
        profile.prepareResourceSet(rst);
        otherProfile.prepareResourceSet(rst);
        Resource otherResource = rst.createResource(uri);
        ValueDeliveryModel otherVdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        otherVdm.setId(modelId);
        otherVdm.setName(modelId);
        VDMLDiagram otherDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        otherVdm.getDiagram().add(otherDiagram);
        otherResource.getContents().add(otherVdm);
        return otherDiagram;
    }

    @Override
    public Path createCollaboration(Path directory, String fileName, CollaborationType type) {
        final Path path = Paths.convert(Paths.convert(directory).resolve(fileName));
        String uuid = path.toURI();
        pathEvent.fire(new PathEvent(uuid));
        String processId = buildProcessId(EMFVFSURIConverter.toPlatformRelativeString(directory), fileName);
        VDMLDiagram diagram = buildDiagramInValueDeliveryModel(profile, EMFVFSURIConverter.toPlatformResourceURI(uuid), processId + "ValueDeliveryModel");
        Collaboration coll = (Collaboration) VDMLFactory.eINSTANCE.create(collaborationTypeMap.get(type));
        coll.setId(processId);
        coll.setName(processId);
        ValueDeliveryModel vdm = (ValueDeliveryModel) diagram.eContainer();
        vdm.getCollaboration().add(coll);
        diagram.setVdmlElement(coll);
        AssetBuilder builder = AssetBuilderFactory.getAssetBuilder(fileName);
        builder.location(directory.toURI()).content(toString(diagram)).uniqueId(uuid);
        Asset<String> processAsset = builder.getAsset();
        repository.createAsset(processAsset);
        return path;
    }

    private String buildProcessId(String location, String name) {
        if (location.startsWith("/")) {
            location = location.replaceFirst("/", "");
        }
        location = location.replaceAll("/", ".");
        if (location.length() > 0) {
            String[] locationParts = location.split("\\.");
            location = locationParts[0];
        }
        name = name.substring(0, name.lastIndexOf("."));
        name = Utils.toBPMNIdentifier(name);
        return location + "." + name;
    }

    @Override
    public Collection<Path> resolveCollaborations(Path context) {
        DirectoryStream<org.uberfire.java.nio.file.Path> p = ioService.newDirectoryStream(Paths.convert(context),
                new DirectoryStream.Filter<org.uberfire.java.nio.file.Path>() {

                    @Override
                    public boolean accept(org.uberfire.java.nio.file.Path entry) throws IOException {
                        boolean accept = entry.toString().endsWith(".vdrc");
                        return accept;
                    }

                });
        Collection<Path> result = new ArrayList<Path>();
        Iterator<org.uberfire.java.nio.file.Path> iterator = p.iterator();
        while (iterator.hasNext()) {
            result.add(Paths.convert(iterator.next()));
        }
        return result;
    }

}
