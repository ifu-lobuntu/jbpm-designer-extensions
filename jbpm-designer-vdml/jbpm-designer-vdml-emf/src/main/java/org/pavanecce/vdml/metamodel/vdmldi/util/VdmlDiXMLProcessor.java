/**
 */
package org.pavanecce.vdml.metamodel.vdmldi.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VdmlDiXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlDiXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        VdmlDiPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the VdmlDiResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new VdmlDiResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new VdmlDiResourceFactoryImpl());
        }
        return registrations;
    }

} //VdmlDiXMLProcessor
