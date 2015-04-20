package org.jbpm.designer.vdml;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.jboss.errai.bus.server.annotations.Service;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.AssetBuilderFactory;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.impl.AssetBuilder;
import org.jbpm.designer.server.service.AssetHelper;
import org.jbpm.designer.server.service.PathEvent;
import org.jbpm.designer.type.VdmlCollaborationTypeDefinition;
import org.jbpm.designer.util.Utils;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.omg.dd.di.Diagram;
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
public class DefaultVdmlCollaborationAssetService implements VdmlCollaborationAssetService {
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
    VdmlCollaborationTypeDefinition collaborationResourceType;
    @Inject
    Instance<IVdmlDiagramProfile> profiles;

    @Override
    public Path createCollaborationDiagram(Path collaborationFile, String otherProfileName) {
        ResourceSet rst = new ResourceSetImpl();
        pathEvent.fire(new PathEvent(collaborationFile.toURI()));
        IVdmlDiagramProfile otherProfile = getOtherProfile(otherProfileName);
        return createCollaborationDiagram(collaborationFile, rst, otherProfile);
    }

    private Path createCollaborationDiagram(Path collaborationFile, ResourceSet rst, IVdmlDiagramProfile otherProfile) {
        Path directory = Paths.convert(Paths.convert(collaborationFile).getParent());
        String diagramUuid = collaborationFile.toURI().replace(collaborationResourceType.getSuffix(), otherProfile.getSerializedModelExtension());
        URI otherUri =  EMFVFSURIConverter.toPlatformResourceURI(diagramUuid);
        String fileName = otherUri.lastSegment();
        otherProfile.prepareResourceSet(rst);
        URI collaborationUri = EMFVFSURIConverter.toPlatformResourceURI(collaborationFile);
        rst.getResource(collaborationUri,true);
        Diagram otherDiagram = otherProfile.buildDiagramStub(rst, otherUri);
        AssetBuilder builder = AssetBuilderFactory.getAssetBuilder(fileName);
        builder.location(directory.toURI()).content(toString(otherDiagram, otherProfile)).uniqueId(diagramUuid);
        @SuppressWarnings("unchecked")
        Asset<String> processAsset = builder.getAsset();
        repository.createAsset(processAsset);
        return PathFactory.newPath(fileName, diagramUuid);
    }

    private IVdmlDiagramProfile getOtherProfile(String otherProfileName) {
        for (IVdmlDiagramProfile p : this.profiles) {
            if (p.getName().equals(otherProfileName)) {
                return p;
            }
        }
        return null;
    }

    private String toString(EObject eObject, IEmfProfile profile) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            eObject.eResource().save(baos, profile.buildDefaultResourceOptions());
            String string = baos.toString("UTF-8");
            return string;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Path createCollaboration(Path directory, String fileName, CollaborationType type, String initialDiagramProfileName) {
        final Path path = Paths.convert(Paths.convert(directory).resolve(fileName));
        String uuid = path.toURI();
        pathEvent.fire(new PathEvent(uuid));
        String collaborationId = buildCollaborationId(fileName);
        IVdmlDiagramProfile selectedProfile = getOtherProfile(initialDiagramProfileName);
        ResourceSet rst = new ResourceSetImpl();
        selectedProfile.prepareResourceSet(rst);
        Resource resource = rst.createResource(EMFVFSURIConverter.toPlatformResourceURI(path));
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        resource.getContents().add(vdm);
        vdm.setName(collaborationId + "ValueDeliveryModel");
        Collaboration coll = (Collaboration) VDMLFactory.eINSTANCE.create(collaborationTypeMap.get(type));
        vdm.getCollaboration().add(coll);
        coll.setId(collaborationId);
        coll.setName(collaborationId);
        Package pkg = UMLFactory.eINSTANCE.createPackage();
        pkg.setName(collaborationId.toLowerCase());
        resource.getContents().add(pkg);
        AssetBuilder builder = AssetBuilderFactory.getAssetBuilder(fileName);
        builder.location(directory.toURI()).content(toString(vdm, selectedProfile)).uniqueId(uuid);
        @SuppressWarnings("unchecked")
        Asset<String> processAsset = builder.getAsset();
        repository.createAsset(processAsset);
        return createCollaborationDiagram(path, rst, selectedProfile);
    }

    private String buildCollaborationId(String name) {
        name = name.substring(0, name.lastIndexOf("."));
        name = Utils.toBPMNIdentifier(name);
        return name;
    }

    @Override
    public Collection<Path> resolveCollaborations(Path context) {
        DirectoryStream<org.uberfire.java.nio.file.Path> p = ioService.newDirectoryStream(Paths.convert(context),
                new DirectoryStream.Filter<org.uberfire.java.nio.file.Path>() {

                    @Override
                    public boolean accept(org.uberfire.java.nio.file.Path entry) throws IOException {
                        boolean accept = entry.toString().endsWith(".vdcol");
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

    @Override
    public List<CollaborationDiagramType> getAvailableDiagramTypes() {
        List<CollaborationDiagramType> result = new ArrayList<CollaborationDiagramType>();
        for (IVdmlDiagramProfile p : this.profiles) {
            CollaborationDiagramType t = new CollaborationDiagramType();
            t.setDefaultForCollaborationType(p.getDefaultForCollaborationType());
            t.setDescription(p.getTitle());
            t.setProfileName(p.getName());
            result.add(t);
        }
        return result;
    }

}
