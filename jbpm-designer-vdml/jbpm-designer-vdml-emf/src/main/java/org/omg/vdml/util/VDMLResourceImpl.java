/**
 */
package org.omg.vdml.util;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.jbpm.designer.dd.jbpmdd.SaveResourceListener;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.omg.vdml.util.VDMLResourceFactoryImpl
 * @generated
 */
public class VDMLResourceImpl extends XMIResourceImpl {
    private static Set<String> externalPackages = new HashSet<String>();
    static{
        externalPackages.add("uml");
    }
    private static Set<EClass> referrables = new HashSet<EClass>();
    static {
        referrables.add(VDMLPackage.eINSTANCE.getActivity());
        referrables.add(VDMLPackage.eINSTANCE.getAssignment());
        referrables.add(VDMLPackage.eINSTANCE.getBusinessItem());
        referrables.add(VDMLPackage.eINSTANCE.getBusinessItemDefinition());
        referrables.add(VDMLPackage.eINSTANCE.getBusinessItemLibrary());
        referrables.add(VDMLPackage.eINSTANCE.getCapabilityDefinition());
        referrables.add(VDMLPackage.eINSTANCE.getCapabilityCategory());
        referrables.add(VDMLPackage.eINSTANCE.getCapabilityLibrary());
        referrables.add(VDMLPackage.eINSTANCE.getCapabilityMethod());
        referrables.add(VDMLPackage.eINSTANCE.getCapabilityOffer());
        referrables.add(VDMLPackage.eINSTANCE.getDeliverableFlow());
        referrables.add(VDMLPackage.eINSTANCE.getInputDelegation());
        referrables.add(VDMLPackage.eINSTANCE.getInputPort());
        referrables.add(VDMLPackage.eINSTANCE.getMember());
        referrables.add(VDMLPackage.eINSTANCE.getOrgUnit());
        referrables.add(VDMLPackage.eINSTANCE.getOutputDelegation());
        referrables.add(VDMLPackage.eINSTANCE.getOutputPort());
        referrables.add(VDMLPackage.eINSTANCE.getParty());
        referrables.add(VDMLPackage.eINSTANCE.getPerformer());
        referrables.add(VDMLPackage.eINSTANCE.getPosition());
        referrables.add(VDMLPackage.eINSTANCE.getPool());
        referrables.add(VDMLPackage.eINSTANCE.getResourceUse());
        referrables.add(VDMLPackage.eINSTANCE.getRole());
        referrables.add(VDMLPackage.eINSTANCE.getRoleCategory());
        referrables.add(VDMLPackage.eINSTANCE.getRoleDefinition());
        referrables.add(VDMLPackage.eINSTANCE.getRoleLibrary());
        referrables.add(VDMLPackage.eINSTANCE.getStore());
        referrables.add(VDMLPackage.eINSTANCE.getValueAdd());
        referrables.add(VDMLPackage.eINSTANCE.getValueCategory());
        referrables.add(VDMLPackage.eINSTANCE.getValueDefinition());
        referrables.add(VDMLPackage.eINSTANCE.getValueLibrary());
        referrables.add(VDMLPackage.eINSTANCE.getValueProposition());
        referrables.add(VDMLPackage.eINSTANCE.getValuePropositionComponent());
        referrables.add(VDMLDIPackage.eINSTANCE.getVDMLShape());
        referrables.add(VDMLDIPackage.eINSTANCE.getVDMLDiagram());
        referrables.add(VDMLDIPackage.eINSTANCE.getVDMLEdge());
    }

    /**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
    public VDMLResourceImpl(URI uri) {
		super(uri);
	}

    protected XMLSave createXMLSave() {
        prepareSave();
        return new XMISaveImpl(createXMLHelper()){
            private SaveResourceListener saveListener;
            @Override
            protected void init(XMLResource resource, Map<?, ?> options) {
                super.init(resource, options);
                this.saveListener=(SaveResourceListener)options.get(SaveResourceListener.OPTION_SAVE_RESOURCE_LISTENER);
            }
            @Override
            protected void endSave(List<? extends EObject> contents) throws IOException {
                super.endSave(contents);
                if(saveListener!=null){
                    try{
                        saveListener.onSave(this.xmlResource);
                    }catch(Exception e){
                        e.printStackTrace();
                        getWarnings().add(new XMIException(e));
                    }
                }
            }
        };
    }

    protected void prepareSave() {
        EObject cur;
        for (Iterator<EObject> iter = getAllContents(); iter.hasNext();) {
            cur = iter.next();
            setIdIfNotSet(cur);
        }
    }

    protected static void setIdIfNotSet(EObject obj) {
        if (obj.eClass() != null) {
            if (referrables.contains(obj.eClass())) {
                EStructuralFeature idAttr = obj.eClass().getEIDAttribute();
                if (idAttr != null && !obj.eIsSet(idAttr)) {
                    obj.eSet(idAttr, EcoreUtil.generateUUID());
                }
            } else {
                EStructuralFeature idAttr = obj.eClass().getEIDAttribute();
                if(idAttr==null && externalPackages.contains(obj.eClass().getEPackage().getName())){
                    //From other emf package
                    VDMLResourceImpl eResource = (VDMLResourceImpl) obj.eResource();
                    if(eResource.getID(obj)==null){
                        eResource.setID(obj, EcoreUtil.generateUUID());
                    }
                }else{
                    if (idAttr != null && !obj.eIsSet(idAttr)) {
                        System.out.println(obj.eClass().getName() +" does not have an id?");
//                        obj.eSet(idAttr, EcoreUtil.generateUUID());
                    }
                }
            }
        }
    }

} // VDMLResourceImpl
