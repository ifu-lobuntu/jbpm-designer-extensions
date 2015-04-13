/**
 */
package org.omg.vdml.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.vdml.VDMLPackage;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * 
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
        referrables.add(VDMLPackage.eINSTANCE.getStore());
        referrables.add(VDMLPackage.eINSTANCE.getValueAdd());
        referrables.add(VDMLPackage.eINSTANCE.getValueProposition());
        referrables.add(VDMLPackage.eINSTANCE.getValuePropositionComponent());
        referrables.add(VDMLDIPackage.eINSTANCE.getVDMLShape());
        referrables.add(VDMLDIPackage.eINSTANCE.getVDMLDiagram());
        referrables.add(VDMLDIPackage.eINSTANCE.getVDMLEdge());
    }

    /**
     * Creates an instance of the resource. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param uri
     *            the URI of the new resource.
     * @generated
     */
    public VDMLResourceImpl(URI uri) {
        super(uri);
    }

    protected XMLSave createXMLSave() {
        prepareSave();
        return super.createXMLSave();
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
                    eResource.setID(obj, EcoreUtil.generateUUID());
                }
            }
        }
    }

} // VDMLResourceImpl
