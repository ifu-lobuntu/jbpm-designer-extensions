/**
 */
package org.pavanecce.vdml.metamodel.cmof.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.pavanecce.vdml.metamodel.cmof.CmofPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CmofXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmofXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        CmofPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the CmofResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new CmofResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new CmofResourceFactoryImpl());
        }
        return registrations;
    }

} //CmofXMLProcessor
