/**
 */
package org.jbpm.uml2.dd.umldi.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.*;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.*;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.uml2.uml.*;
import org.jbpm.designer.dd.jbpmdd.CollapsibleShape;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.jbpm.designer.dd.jbpmdd.impl.*;
import org.jbpm.designer.dd.util.Collections;
import org.jbpm.uml2.dd.umldi.*;
import org.omg.dd.dc.*;
import org.omg.dd.di.*;

import java.util.HashMap;
import java.util.Collection;
/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLDIXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UMLDIXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        UMLDIPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the UMLDIResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new UMLDIResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new UMLDIResourceFactoryImpl());
        }
        return registrations;
    }

} //UMLDIXMLProcessor
