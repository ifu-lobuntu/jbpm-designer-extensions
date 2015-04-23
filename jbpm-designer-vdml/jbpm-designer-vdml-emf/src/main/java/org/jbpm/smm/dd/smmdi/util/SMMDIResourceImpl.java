/**
 */
package org.jbpm.smm.dd.smmdi.util;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.jbpm.designer.dd.jbpmdd.SaveResourceListener;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.jbpm.smm.dd.smmdi.util.SMMDIResourceFactoryImpl
 * @generated
 */
public class SMMDIResourceImpl extends XMIResourceImpl {
    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public SMMDIResourceImpl(URI uri) {
        super(uri);
    }
    @Override
    protected boolean useIDs() {
        return super.useIDs();
    }
    
    @Override
    protected boolean useUUIDs() {
        return true;
    }
    protected XMLSave createXMLSave() {
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

} //SMMDIResourceImpl
