/**
 */
package org.pavanecce.vdml.metamodel.vdml.util;

import java.util.HashMap;

import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.dd.cmmn.di.DiPackage;
import org.eclipse.dd.color.color.ColorPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.pavanecce.vdml.metamodel.vdml.VdmlPackage;
import org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.pavanecce.vdml.metamodel.vdml.util.VdmlResourceImpl
 * @generated
 */
public class VdmlResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VdmlResourceFactoryImpl() {
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
        XMLResource result = new VdmlResourceImpl(uri);
        ExtendedMetaData emd = new BasicExtendedMetaData();
        emd.setQualified(VdmlPackage.eINSTANCE, true);
        emd.setQualified(VdmlDiPackage.eINSTANCE, true);
        emd.setQualified(DiPackage.eINSTANCE, true);
        emd.setQualified(DcPackage.eINSTANCE, true);
        emd.setQualified(ColorPackage.eINSTANCE, true);
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, emd);
        options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, true);
        result.getDefaultLoadOptions().putAll(options);
        result.getDefaultSaveOptions().putAll(options);
        return result;
    }

} //VdmlResourceFactoryImpl
