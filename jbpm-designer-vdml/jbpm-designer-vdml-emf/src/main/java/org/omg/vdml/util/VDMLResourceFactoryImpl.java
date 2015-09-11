/**
 */
package org.omg.vdml.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.*;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.vdml.dd.vdmldi.VDMLDIPackage;
import org.omg.dd.dc.DCPackage;
import org.omg.dd.dg.DGPackage;
import org.omg.dd.di.*;
import org.omg.vdml.*;
/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.omg.vdml.util.VDMLResourceImpl
 * @generated
 */
public class VDMLResourceFactoryImpl extends ResourceFactoryImpl {
    /**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VDMLResourceFactoryImpl() {
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

} //VDMLResourceFactoryImpl
