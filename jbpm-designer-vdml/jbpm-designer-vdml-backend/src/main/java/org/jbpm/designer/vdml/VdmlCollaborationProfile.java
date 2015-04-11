package org.jbpm.designer.vdml;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.AbstractEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.AbstractEmfProfile;
import org.jbpm.designer.extensions.emf.util.DefaultPotentialReferenceHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.jbpm.vdml.dd.vdmldi.util.VDMLDIResourceFactoryImpl;
import org.omg.smm.SMMPackage;
import org.omg.vdml.VDMLPackage;

@ApplicationScoped
public class VdmlCollaborationProfile extends AbstractEmfProfile {

    @Override
    public Factory getResourceFactory() {
        return new VDMLDIResourceFactoryImpl();
    }

    @Override
    public DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new VdmlPotentialReferenceHelper(this);
    }

    @Override
    public EPackage[] getEPackages() {
        return new EPackage[] { VDMLDIPackage.eINSTANCE, VDMLPackage.eINSTANCE, SMMPackage.eINSTANCE };
    }

    @Override
    public String getSerializedModelExtension() {
        return "vdcol";
    }

    @Override
    public String getName() {
        return "vdcol";
    }

    @Override
    public Map<String, Object> buildDefaultResourceOptions() {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
        options.put(XMLResource.OPTION_DISABLE_NOTIFY, true);
        options.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, true);
        options.put(XMLResource.OPTION_URI_HANDLER, AbstractEmfDiagramProfile.SIMPLE_URI_HANDLER);
        options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
        return options;
    }

}
