package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class LinkedProperty {
    private Property property;
    private Map<EClass, EAttribute> elementNameFeatureMap = new HashMap<EClass, EAttribute>();

    public LinkedProperty(Property p) {
        this.property=p;
    }

    public void init(EPackage... packages) {
        if (property.getReference() != null) {
            String allowedElementTypes = property.getReference().getAllowedElementTypes();
            String[] elementTypes = allowedElementTypes.split("\\|");
            for (String string : elementTypes) {
                for (EPackage ePackage : packages) {
                    EClass eClassifier = (EClass) ePackage.getEClassifier(string);
                    if (eClassifier!=null) {
                        EStructuralFeature f = eClassifier.getEStructuralFeature(property.getReference().getNameFeature());
                        elementNameFeatureMap.put(eClassifier,(EAttribute) f);
                    }
                }
            }
        }
    }

    public Property getProperty() {
        return property;
    }

    public String getId() {
        return property.getId();
    }

    public String getBinding() {
        return property.getBinding();
    }

    public String getViewBinding() {
        return property.getViewBinding();
    }

    public EObjectReference getReference() {
        return property.getReference();
    }

    public Map<EClass, EAttribute> getClassFeatureMap() {
        return elementNameFeatureMap;
    }
    
}
