/**
 */
package org.jbpm.uml2.dd.umldi.util;

import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.uml2.uml.*;
import org.jbpm.uml2.dd.umldi.*;
import org.omg.dd.dc.*;
import org.omg.dd.di.*;
import java.util.HashMap;
import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.jbpm.uml2.dd.umldi.util.UMLDIResourceImpl
 * @generated
 */
public class UMLDIResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLDIResourceFactoryImpl() {
        super();
    }

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public Resource createResource(URI uri) {
        UMLDIResourceImpl result = new UMLDIResourceImpl(uri);
        HashMap<String, Object> options = new HashMap<String, Object>();
        ExtendedMetaData emd = new BasicExtendedMetaData();
        emd.setQualified(UMLPackage.eINSTANCE, true);
        emd.setQualified(UMLDIPackage.eINSTANCE, true);
        emd.setQualified(DIPackage.eINSTANCE, true);
        emd.setQualified(DCPackage.eINSTANCE, true);
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, emd);
        options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, true);
        result.getDefaultLoadOptions().putAll(options);
        result.getDefaultSaveOptions().putAll(options);
        return result;

    }

} //UMLDIResourceFactoryImpl
