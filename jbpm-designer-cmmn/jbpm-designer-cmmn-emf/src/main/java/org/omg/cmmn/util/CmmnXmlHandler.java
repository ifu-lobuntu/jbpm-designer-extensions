package org.omg.cmmn.util;

import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;

public class CmmnXmlHandler extends SAXXMLHandler {

    public CmmnXmlHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
        super(xmiResource, helper, options);
    }

    /**
     * Overridden to be able to convert QName references in attributes to URIs
     * during load.
     *
     * @param ids
     *            In our case the parameter will contain exactly one QName that
     *            we resolve to URI.
     */
    @Override
    protected void setValueFromId(EObject object, EReference eReference, String ids) {
        String convertQNameToUri = ((QNameURIHandler) uriHandler).convertQNameToUri(ids);
        String ids2 = eReference.isResolveProxies()? convertQNameToUri : ids;
        super.setValueFromId(object, eReference, ids2);
    }

    /**
     * Used from the <extension><impl> tag to load referenced extension
     * schemes. The extension scheme will be loaded and converted to EMF Ecore
     * on the fly.
     *
     * @param id
     */
    private EObject loadExtensionSchema(QName xsdQname) {
        EPackage extensionPackage = extendedMetaData.getPackage(xsdQname.getNamespaceURI());
        if (extensionPackage == null) {
            //
            // try {
            // @SuppressWarnings("unchecked")
            // Class<XSDEcoreBuilder> theXSDEcoreBuilderClass =
            // (Class<XSDEcoreBuilder>)
            // CommonPlugin.loadClass("org.eclipse.xsd",
            // "org.eclipse.xsd.ecore.XSDEcoreBuilder");
            //
            // Constructor<XSDEcoreBuilder> theXSDEcoreBuilderConstructor =
            // theXSDEcoreBuilderClass.getConstructor(new Class[] {
            // ExtendedMetaData.class,
            // Map.class });
            // Field theOptionField =
            // theXSDEcoreBuilderClass.getField("OPTION_REUSE_REGISTERED_PACKAGES");
            // Object theXsdOption = theOptionField.get(null);
            //
            // URI location = urisToLocations.get(xsdQname.getNamespaceURI());
            // Map<Object, Object> options = new HashMap<Object, Object>();
            // options.put(theXsdOption, Boolean.TRUE);
            // XSDEcoreBuilder builder =
            // theXSDEcoreBuilderConstructor.newInstance(extendedMetaData,
            // options);
            // builder.generate(location);
            // } catch (Exception e) {
            // }
        }

        return extendedMetaData.getElement(xsdQname.getNamespaceURI(), xsdQname.getLocalPart());
    }

    @Override
    public void endElement(String uri, String localName, String name) {
        // Detect Extension object
        EObject peekObject = objects.peek();
//        if (peekObject instanceof Extension) {
//            Extension extension = (Extension) peekObject;
//            if (extension.isMustUnderstand() && null != extension.getXsdDefinition()) {
//                loadExtensionSchema(extension.getXsdDefinition());
//            }
//        }
        super.endElement(uri, localName, name);
    }
}