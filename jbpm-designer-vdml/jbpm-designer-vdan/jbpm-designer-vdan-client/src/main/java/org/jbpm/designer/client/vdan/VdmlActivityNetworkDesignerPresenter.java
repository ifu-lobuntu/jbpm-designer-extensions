package org.jbpm.designer.client.vdan;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

@Dependent
@WorkbenchEditor(identifier = "jbpm.vdan.designer", supportedTypes = { VdmlActivityNetworkType.class })
public class VdmlActivityNetworkDesignerPresenter extends DesignerPresenter {

    @Inject
    private VdmlActivityNetworkType resourceType;

    @Inject
    public VdmlActivityNetworkDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public VdmlActivityNetworkType getResourceType() {
        return resourceType;
    }
}
