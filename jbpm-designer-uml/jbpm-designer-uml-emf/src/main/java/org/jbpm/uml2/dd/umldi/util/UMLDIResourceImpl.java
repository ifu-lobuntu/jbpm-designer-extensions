/**
 */
package org.jbpm.uml2.dd.umldi.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.uml2.uml.internal.resource.UMLLoadImpl;
import org.jbpm.designer.dd.jbpmdd.SaveResourceListener;
import org.jbpm.uml2.dd.umldi.UMLDIPackage;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.jbpm.uml2.dd.umldi.util.UMLDIResourceFactoryImpl
 * @generated
 */
public class UMLDIResourceImpl extends XMIResourceImpl {
    private static List<EClass> referrables = new ArrayList<EClass>();
    static {
        referrables.add(UMLDIPackage.eINSTANCE.getUMLEdge());
        referrables.add(UMLDIPackage.eINSTANCE.getUMLShape());
        referrables.add(UMLDIPackage.eINSTANCE.getUMLDiagram());
    }

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public UMLDIResourceImpl(URI uri) {
        super(uri);
    }

    @Override
    protected XMLLoad createXMLLoad() {
        return new UMLLoadImpl(createXMLHelper());
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

    protected void setIdIfNotSet(EObject obj) {
        if (obj.eClass() != null && referrables.contains(obj.eClass())) {
            if (getID(obj) == null) {
                setID(obj, EcoreUtil.generateUUID());
            }
        }
    }

    @Override
    protected boolean useIDAttributes() {
        return false;
    }

    @Override
    protected boolean useUUIDs() {
        return true;
    }
} // UMLDIResourceImpl
