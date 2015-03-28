package org.jbpm.designer.extensions.emf.util;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.omg.dd.di.DiagramElement;

public class AbstractEmfJsonMarshaller {
    protected IEmfDiagramProfile profile;

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


}
