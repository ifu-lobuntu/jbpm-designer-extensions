package org.jbpm.designer.extensions.stencilset.linkage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class LinkedProperty {
    private Property property;
    private Map<EClass, EAttribute> elementNameFeatureMap = new HashMap<EClass, EAttribute>();
    private Class<?> expectedType;

    public LinkedProperty(Property p) {
        this.property = p;
    }

    public void init(EPackage... packages) {
        if (property.getReference() != null) {
            String allowedElementTypes = property.getReference().getAllowedElementTypes();
            String[] elementTypes = allowedElementTypes.split("\\|");
            for (EPackage ePackage : packages) {
                if (this.property.getReference().isMatchFirstReference()) {
                    findSuperMostClassifiersWithNameFeature(ePackage);
                } else {
                    for (String string : elementTypes) {
                        EClass eClassifier = (EClass) ePackage.getEClassifier(string);
                        if (eClassifier == null) {
                        } else {
                            EStructuralFeature f = eClassifier.getEStructuralFeature(property.getReference().getNameFeature());
                            elementNameFeatureMap.put(eClassifier, (EAttribute) f);

                        }
                    }
                }
            }
        }
        if (property.getExpectedType() != null && expectedType == null) {
            for (EPackage ePackage : packages) {
                EClass eClassifier = (EClass) ePackage.getEClassifier(property.getExpectedType());
                if (eClassifier != null) {
                    this.expectedType = eClassifier.getInstanceClass();
                    break;
                }
            }
            if (this.expectedType == null) {
                EClassifier eClassifier = EcorePackage.eINSTANCE.getEClassifier(property.getExpectedType());
                if (eClassifier == null) {
                    eClassifier = EcorePackage.eINSTANCE.getEClassifier("E" + property.getExpectedType());
                }
                if (eClassifier != null) {
                    this.expectedType = eClassifier.getInstanceClass();
                }
            }
        }
    }

    protected void findSuperMostClassifiersWithNameFeature(EPackage ePackage) {
        for (EClassifier ec : ePackage.getEClassifiers()) {
            if (ec instanceof EClass) {
                EClass eclass = (EClass) ec;
                String nameFeature = property.getReference().getNameFeature();
                if (EcorePackage.eINSTANCE.getEModelElement().isSuperTypeOf(eclass)) {
                    EStructuralFeature f = eclass.getEStructuralFeature(nameFeature);
                    if (f != null && f.getEContainingClass().equals(ec)) {
                        elementNameFeatureMap.put(eclass, (EAttribute) f);
                    }
                }
            }
        }
    }

    public Class<?> getExpectedType() {
        return this.expectedType;
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
