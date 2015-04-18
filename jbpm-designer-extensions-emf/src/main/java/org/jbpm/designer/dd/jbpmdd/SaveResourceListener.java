package org.jbpm.designer.dd.jbpmdd;

import org.eclipse.emf.ecore.xmi.XMLResource;

public interface SaveResourceListener {
    String OPTION_SAVE_RESOURCE_LISTENER = "option.save.resource.listener";

    void onSave(XMLResource resource);
}
