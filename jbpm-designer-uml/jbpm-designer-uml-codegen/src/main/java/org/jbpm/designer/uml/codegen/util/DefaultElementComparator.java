package org.jbpm.designer.uml.codegen.util;

import org.eclipse.uml2.uml.Element;

import java.util.Comparator;



public class DefaultElementComparator implements Comparator<Element> {
	@Override
	public int compare(Element o1, Element o2) {
		return EmfWorkspace.getId(o1).compareTo(EmfWorkspace.getId(o2));
	}
}
