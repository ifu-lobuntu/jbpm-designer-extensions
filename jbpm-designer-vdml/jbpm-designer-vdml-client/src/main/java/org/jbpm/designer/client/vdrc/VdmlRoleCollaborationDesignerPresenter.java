package org.jbpm.designer.client.vdrc;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

@Dependent
@WorkbenchEditor(identifier = "jbpm.vdrc.designer", supportedTypes = { VdmlRoleCollaborationType.class })
public class VdmlRoleCollaborationDesignerPresenter extends DesignerPresenter {

    @Inject
    private VdmlRoleCollaborationType resourceType;

    @Inject
    public VdmlRoleCollaborationDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public VdmlRoleCollaborationType getResourceType() {
        return resourceType;
    }
}
