package org.jbpm.designer.vdrc;

import org.eclipse.emf.ecore.EClass;
import org.jbpm.designer.extensions.emf.util.StencilInfo;

public interface VdmlStencilInfo extends StencilInfo {
    EClass getElementType();
}
