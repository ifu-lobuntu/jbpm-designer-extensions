/**
 */
package org.jbpm.vdml.dd.vdmldi.util;

import java.util.HashMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;

import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.dd.jbpmdd.*;
import org.jbpm.designer.dd.util.*;
import org.jbpm.smm.dd.smmdi.*;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.di.*;
import org.omg.dd.di.impl.*;
import org.omg.smm.*;
import org.omg.vdml.*;
import org.omg.vdml.util.VDMLResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.jbpm.vdml.dd.vdmldi.util.VDMLDIResourceImpl
 * @generated
 */
public class VDMLDIResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VDMLDIResourceFactoryImpl() {
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
        HashMap<String, Object> options = new HashMap<String, Object>();
        XMLResource result = new VDMLResourceImpl(uri);
        ExtendedMetaData emd = new BasicExtendedMetaData();
        emd.setQualified(VDMLPackage.eINSTANCE, true);
        emd.setQualified(VDMLDIPackage.eINSTANCE, true);
        emd.setQualified(DIPackage.eINSTANCE, true);
        emd.setQualified(DGPackage.eINSTANCE, true);
        emd.setQualified(DCPackage.eINSTANCE, true);
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, emd);
        options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, true);
        result.getDefaultLoadOptions().putAll(options);
        result.getDefaultSaveOptions().putAll(options);
        return result;
    }

} //VDMLDIResourceFactoryImpl
