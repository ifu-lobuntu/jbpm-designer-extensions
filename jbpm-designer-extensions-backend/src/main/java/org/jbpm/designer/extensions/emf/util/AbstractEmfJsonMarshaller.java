package org.jbpm.designer.extensions.emf.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.omg.dd.di.DiagramElement;

public class AbstractEmfJsonMarshaller {
    protected IEmfDiagramProfile profile;
    static public XMLResource.URIHandler SIMPLE_URI_HANDLER = new XMLResource.URIHandler() {
        
        private String[] baseUri;

        @Override
        public void setBaseURI(URI uri) {
            this.baseUri=uri.trimFragment().segments();
        }
        
        @Override
        public URI resolve(URI uri) {
            return uri;
        }
        
        @Override
        public URI deresolve(URI uri) {
            //Only deresolve uris hierarchically nested so that we can move trees
//            String[] segments = uri.segments();
//            for (int i = 0; i < baseUri.length; i++) {
//                if(segments.length<=i ||  !baseUri[i].equals(segments[i])){
//                    return uri;
//                }
//                
//            }
            return uri;
        }
    };
    protected void writeDiagram(Diagram d, String message) throws JsonGenerationException, JsonMappingException, IOException {
        profile.logInfo(message);
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        om.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
        String s = om.writeValueAsString(d);
        profile.logInfo(s);
    }
    protected void writeResource(XMLResource r, String message) throws JsonGenerationException, JsonMappingException, IOException {
        profile.logInfo(message);
        StringWriter s = new StringWriter();
        r.save(s, buildDefaultResourceOptions());
        profile.logInfo(s.toString());
    }


    public static Map<String, Object> buildDefaultResourceOptions() {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
        options.put(XMLResource.OPTION_DISABLE_NOTIFY, true);
        options.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, true);
        options.put(XMLResource.OPTION_URI_HANDLER, SIMPLE_URI_HANDLER);
        options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
        return options;
    }


    protected AbstractEmfJsonMarshaller(IEmfDiagramProfile profile) {
        this.profile = profile;
    }

    protected EObject getModelElement(DiagramElement de) {
        if (de == null) {
            // e.g. floating edges
            return null;
        } else {
            EList<EObject> modelElements = de.getModelElement();
            return modelElements.isEmpty() ? null : modelElements.get(0);
        }
    }
    protected Object getValue(Object currentTarget, EStructuralFeature sf) {
        Object currentValue = null;
        if (currentTarget instanceof EObject) {
            currentValue = ((EObject) currentTarget).eGet(sf);
        } else if (currentTarget instanceof FeatureMap) {
            currentValue = ((FeatureMap) currentTarget).get(sf,true);
        }
        return currentValue;
    }

    protected EStructuralFeature getStructuralFeature(Object currentTarget, String featureName) {
        EStructuralFeature sf =null;
        if (featureName.endsWith("]")) {
            featureName = featureName.substring(0, featureName.indexOf("["));
        }
        if (currentTarget instanceof EObject) {
            sf  = ((EObject) currentTarget).eClass().getEStructuralFeature(featureName);
        } else if (currentTarget instanceof FeatureMap) {
            sf = profile.demandFeature(featureName);
        }
        return sf;
    }

    protected boolean shouldHaveShape(EObject me) {
        if (me == null) {
            return true;
        } else {
            boolean isDeleted = me.eResource() == null;
            boolean isBrokenReference = me.eIsProxy();
            return !(isDeleted || isBrokenReference);
        }
    }


}
