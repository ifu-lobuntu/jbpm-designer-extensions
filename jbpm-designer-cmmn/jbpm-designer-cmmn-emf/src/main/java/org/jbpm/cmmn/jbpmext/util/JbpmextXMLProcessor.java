/**
 */
package org.jbpm.cmmn.jbpmext.util;

import java.util.Map;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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
import org.jbpm.cmmn.jbpmext.JbpmextPackage;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.util.Collections;
import org.omg.cmmn.*;
import org.omg.dd.di.impl.*;
import org.omg.dd.di.*;
import org.xml.sax.helpers.DefaultHandler;

import org.eclipse.emf.ecore.util.*;
import org.omg.cmmn.*;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JbpmextXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JbpmextXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        JbpmextPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the JbpmextResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new JbpmextResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new JbpmextResourceFactoryImpl());
        }
        return registrations;
    }

} //JbpmextXMLProcessor
