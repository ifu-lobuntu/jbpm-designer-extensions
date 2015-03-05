/**
 */
package org.pavanecce.vdml.metamodel.smm.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.pavanecce.vdml.metamodel.smm.SmmPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmmXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        SmmPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the SmmResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new SmmResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new SmmResourceFactoryImpl());
        }
        return registrations;
    }

} //SmmXMLProcessor
