package org.jbpm.designer.vdrc;

import org.eclipse.emf.ecore.EClass;
import org.jbpm.designer.extensions.api.StencilInfo;

public interface VdmlStencilInfo extends StencilInfo {
    EClass getElementType();
}
