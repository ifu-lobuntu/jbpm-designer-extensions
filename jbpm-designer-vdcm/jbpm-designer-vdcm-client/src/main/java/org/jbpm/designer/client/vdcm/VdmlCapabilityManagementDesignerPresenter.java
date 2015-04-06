package org.jbpm.designer.client.vdcm;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

@Dependent
@WorkbenchEditor(identifier = "jbpm.vdcm.designer", supportedTypes = { VdmlCapabilityManagementType.class })
public class VdmlCapabilityManagementDesignerPresenter extends DesignerPresenter {

    @Inject
    private VdmlCapabilityManagementType resourceType;

    @Inject
    public VdmlCapabilityManagementDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public VdmlCapabilityManagementType getResourceType() {
        return resourceType;
    }
}
