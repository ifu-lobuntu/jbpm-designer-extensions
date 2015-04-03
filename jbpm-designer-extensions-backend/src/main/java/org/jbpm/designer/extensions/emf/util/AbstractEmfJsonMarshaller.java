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
        r.save(s, profile.buildDefaultResourceOptions());
        profile.logInfo(s.toString());
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
