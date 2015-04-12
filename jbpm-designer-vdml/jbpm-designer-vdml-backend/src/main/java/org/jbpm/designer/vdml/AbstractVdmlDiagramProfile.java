package org.jbpm.designer.vdml;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.jbpm.designer.extensions.impl.AbstractEmfDiagramProfile;
import org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl;
import org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.util.VDMLDIResourceFactoryImpl;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;

public abstract class AbstractVdmlDiagramProfile extends AbstractEmfDiagramProfile {


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
        return ddPackages(VDMLPackage.eINSTANCE, VDMLDIPackage.eINSTANCE,SMMPackage.eINSTANCE);
    }


}
