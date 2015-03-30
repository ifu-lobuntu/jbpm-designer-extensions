package org.jbpm.designer.vdrc;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jboss.errai.bus.server.annotations.Service;
import org.jbpm.designer.extensions.emf.util.IEmfProfile;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.AssetBuilderFactory;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.impl.AssetBuilder;
import org.jbpm.designer.server.service.AssetHelper;
import org.jbpm.designer.util.Utils;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.omg.vdml.Collaboration;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueDeliveryModel;
import org.uberfire.backend.server.util.Paths;
import org.uberfire.backend.vfs.Path;
import org.uberfire.io.IOService;
import org.uberfire.java.nio.IOException;
import org.uberfire.java.nio.file.DirectoryStream;

@Service
@ApplicationScoped
public class DefaultCollaborationAssetService implements CollaborationAssetService {

    @Inject
    private Repository repository;

    @Inject
    @Named("ioStrategy")
    private IOService ioService;

    @Inject
    AssetHelper assetHelper;
    @Inject
    VdmlRoleCollaborationProfileImpl profile;

    @Override
    public Path createCollaborationDiagram(Path collaborationFile, String otherProfileName) {
        try {
            IEmfProfile otherProfile = profile.getOtherProfile(otherProfileName);
            org.uberfire.java.nio.file.Path directoryPath = Paths.convert(collaborationFile).getParent();
            URI otherUri = URI.createPlatformPluginURI(
                    collaborationFile.toURI().replace(profile.getSerializedModelExtension(), otherProfile.getSerializedModelExtension()), true);
            String fileName = otherUri.lastSegment();
            ResourceSet rst = new ResourceSetImpl();
            profile.prepareResourceSet(rst);
            otherProfile.prepareResourceSet(rst);
            Resource collaborationResource = rst.getResource(URI.createPlatformResourceURI(collaborationFile.toURI(), true), true);
            ValueDeliveryModel vdm = (ValueDeliveryModel) collaborationResource.getContents().get(0);
            Collaboration coll = vdm.getCollaboration().get(0);
            Resource otherResource = rst.createResource(otherUri);
            ValueDeliveryModel otherVdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
            VDMLDiagram otherDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
            otherDiagram.setVdmlElement(coll);
            otherVdm.getDiagram().add(otherDiagram);
            otherResource.getContents().add(otherVdm);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            otherResource.save(baos, new HashMap<Object, Object>());
            AssetBuilder builder = AssetBuilderFactory.getAssetBuilder(fileName);
            builder.location(directoryPath.toString()).content(baos.toString("UTF-8")).uniqueId(otherUri.toPlatformString(true));
            Asset<String> processAsset = builder.getAsset();
            repository.createAsset(processAsset);
            return Paths.convert(directoryPath.resolve(fileName));
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Path createCollaboration(Path context, String fileName, CollaborationType type) {
        final Path path = Paths.convert(Paths.convert(context).resolve(fileName));
        String location = Paths.convert(path).getParent().toString();
        String name = path.getFileName();
        String processId = buildProcessId(location, name);
        String processContent = assetHelper.getDefaultContentFor(fileName).replaceAll("\\$\\{processid\\}", processId.replaceAll("\\s", ""));
        AssetBuilder builder = AssetBuilderFactory.getAssetBuilder(name);
        builder.location(location).content(processContent).uniqueId(path.toURI());
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
                        return entry.getFileName().endsWith(".vdrc");
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
