package org.jbpm.designer.uml.codegen.util;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.jbpm.designer.uml.codegen.util.emulated.AbstractEmulatedProperty;
import org.jbpm.designer.uml.codegen.util.emulated.EndToAssociationClass;

public class EmfElementFinder {

    public static EObject getContainer(EObject s) {
        if (s instanceof EndToAssociationClass) {
            return ((EndToAssociationClass) s).getOtherEnd().getType();
        } else if (s == null) {
            return null;
        } else if (s instanceof AbstractEmulatedProperty) {
            return getContainer(((AbstractEmulatedProperty) s).getOriginalElement());
        } else if (s instanceof DynamicEObjectImpl) {
            return UMLUtil.getBaseElement(s);
        } else if (s.eContainer() instanceof DynamicEObjectImpl) {
            return UMLUtil.getBaseElement(s.eContainer());
        } else if (s.eContainer() instanceof EAnnotation) {
            return ((EAnnotation) s.eContainer()).getEModelElement();
        } else if (s instanceof Property && s.eContainer() instanceof Association) {
            Property p = (Property) s;
            if (p.getOtherEnd() != null && EmfPropertyUtil.isNavigable(p)) {
                return p.getOtherEnd().getType();
            } else {
                return s.eContainer();
            }
        } else if (s instanceof InterfaceRealization) {
            return ((InterfaceRealization) s).getImplementingClassifier();
        } else if (s instanceof Generalization) {
            return ((Generalization) s).getSpecific();
        }
        return s.eContainer();
    }
}
