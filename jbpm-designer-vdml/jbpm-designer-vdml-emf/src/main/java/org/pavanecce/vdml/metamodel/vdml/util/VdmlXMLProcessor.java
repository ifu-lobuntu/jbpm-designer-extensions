/**
 */
package org.pavanecce.vdml.metamodel.vdml.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VdmlXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        VdmlPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the VdmlResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new VdmlResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new VdmlResourceFactoryImpl());
        }
        return registrations;
    }

} //VdmlXMLProcessor
