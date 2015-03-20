package org.jbpm.designer.uml.codegen.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

public class StereotypesHelper {


	public static boolean hasStereotype(Element c, String string) {
		String lowerCase = string.toLowerCase();
		if (getStereotype(c, lowerCase) != null) {
			return true;
		}
		return hasKeyword(c, lowerCase);
	}

	public static boolean hasKeyword(Element c, String lowerCase) {
		lowerCase = lowerCase.toLowerCase();
		for (Object o : c.getKeywords()) {
			if (o.toString().toLowerCase().equals(lowerCase)) {
				return true;
			}
		}
		EAnnotation ann = c.getEAnnotation(StereotypeNames.VDFP_ANNOTATION);
		if (ann != null) {
			for (String string : ann.getDetails().keySet()) {
				if (string.toLowerCase().equals(lowerCase)) {
					return true;
				}
			}
		}
		return false;
	}

	public static Stereotype getStereotype(Element c, String... lowerCase) {
		for (String name : lowerCase) {
			name = name.toLowerCase();
			Iterator<Stereotype> iter = c.getAppliedStereotypes().iterator();
			Stereotype s = null;
			while (iter.hasNext()) {
				s = iter.next();
				if (s.getName().equalsIgnoreCase(name)) {
					if (!c.isStereotypeApplied(s)) {
						throw new IllegalStateException("Stereotype application corrupt:" + c + ":" + s);
					}
					return s;
				}
			}
		}
		return null;
	}
}
