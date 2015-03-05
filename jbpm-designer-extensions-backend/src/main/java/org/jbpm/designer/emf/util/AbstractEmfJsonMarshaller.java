package org.jbpm.designer.emf.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.dd.color.color.ColorPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;

public class AbstractEmfJsonMarshaller {
    protected static Map<String, EAttribute> colorAttributes = new HashMap<String, EAttribute>();
//    static
    {
        colorAttributes.put("bgcolor", ColorPackage.eINSTANCE.getDocumentRoot_BackgroundColor());
        colorAttributes.put("fontsize", ColorPackage.eINSTANCE.getDocumentRoot_FontSize());
        colorAttributes.put("fontcolor", ColorPackage.eINSTANCE.getDocumentRoot_Color());
        colorAttributes.put("bordercolor", ColorPackage.eINSTANCE.getDocumentRoot_BorderColor());
//        colorAttributes=Collections.unmodifiableMap(colorAttributes);
    }
    protected IEmfDiagramProfile profile;
    protected AbstractEmfJsonMarshaller(IEmfDiagramProfile profile){
        this.profile=profile;
    }
    protected void setUriHandler(ResourceSet resourceSet) {
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        URI testPlatformURI = URI.createPlatformResourceURI("/project1/src/test.xmi", true);
        for (URIHandler uriHandler : new ArrayList<URIHandler>(uriHandlers)) {
            if (uriHandler.canHandle(testPlatformURI)) {
                uriHandlers.remove(uriHandler);
            }
        }
        uriHandlers.add(profile.getUriHandler());
    }
//    protected FeatureMap getAnyAttribute(DiagramElement me) {
//        FeatureMap map=null;
//        EStructuralFeature anyAttribute = me.eClass().getEStructuralFeature("anyAttribute");
//        if(anyAttribute!=null){
//            Object anyAttributeValue = me.eGet(anyAttribute);
//            if(anyAttributeValue instanceof FeatureMap){
//                map=(FeatureMap) anyAttributeValue;
//            }
//        }
//        return map;
//    }

}
