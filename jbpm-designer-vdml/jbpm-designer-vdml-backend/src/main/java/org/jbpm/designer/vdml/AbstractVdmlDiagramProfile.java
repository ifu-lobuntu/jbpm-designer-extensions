package org.jbpm.designer.vdml;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.smm.dd.smmdi.impl.SMMDIPackageImpl;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.impl.VDMLDIPackageImpl;
import org.jbpm.vdml.dd.vdmldi.util.VDMLDIResourceFactoryImpl;
import org.omg.smm.SMMPackage;
import org.omg.smm.impl.SMMPackageImpl;
import org.omg.vdml.Collaboration;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.impl.VDMLPackageImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractVdmlDiagramProfile extends AbstractEmfDiagramProfile implements IVdmlDiagramProfile {
    static Logger LOGGER = LoggerFactory.getLogger(AbstractVdmlDiagramProfile.class);
    static {
        try {
            ensureVfsUriHandlerPresent();
            VDMLPackageImpl.init();
            VDMLDIPackageImpl.init();
            SMMPackageImpl.init();
            SMMDIPackageImpl.init();
        } catch (Throwable t) {
            LOGGER.error("Could not initialize VDML EMF", t);
        }
    }

    @Override
    public Factory getResourceFactory() {
        return new VDMLDIResourceFactoryImpl();
    }

    @Override
    public void prepareResourceSet(ResourceSet resourceSet) {
        super.prepareResourceSet(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdcol", getResourceFactory());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdcm", getResourceFactory());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdrc", getResourceFactory());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdpe", getResourceFactory());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("vdlib", new UMLDIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("meas", new SMMDIResourceFactoryImpl());
    }

    @Override
    public EPackage[] getEPackages() {
        return ddPackages(VDMLPackage.eINSTANCE, VDMLDIPackage.eINSTANCE, SMMPackage.eINSTANCE, UMLPackage.eINSTANCE);
    }

    public VDMLDiagram buildDiagramStub(ResourceSet rst, URI uri) {
        prepareResourceSet(rst);
        Resource otherResource = rst.createResource(uri);
        Collaboration coll = null;
        outer: for (Resource resource : rst.getResources()) {
            for (EObject eo : resource.getContents()) {
                if (eo instanceof ValueDeliveryModel) {
                    for (Collaboration c : ((ValueDeliveryModel) eo).getCollaboration()) {
                        coll = c;
                        break outer;
                    }
                }
            }
        }
        VDMLDiagram otherDiagram = VDMLDIFactory.eINSTANCE.createVDMLDiagram();
        otherResource.getContents().add(otherDiagram);
        otherDiagram.setVdmlElement(coll);
        otherDiagram.setId(coll.getId() + getName() + "Diagram");
        return otherDiagram;
    }

}
