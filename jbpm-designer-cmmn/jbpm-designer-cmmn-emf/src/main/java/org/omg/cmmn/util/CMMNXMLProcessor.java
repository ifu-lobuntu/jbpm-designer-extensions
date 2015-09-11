/**
 */
package org.omg.cmmn.util;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.emf.ecore.xmi.impl.*;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.jbpm.cmmn.dd.cmmndi.*;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.*;
import org.omg.dd.di.impl.*;
import org.omg.dd.di.*;
import org.xml.sax.helpers.DefaultHandler;
/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CMMNXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CMMNXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        CMMNPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the CMMNResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new CMMNResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new CMMNResourceFactoryImpl());
        }
        return registrations;
    }

} //CMMNXMLProcessor
