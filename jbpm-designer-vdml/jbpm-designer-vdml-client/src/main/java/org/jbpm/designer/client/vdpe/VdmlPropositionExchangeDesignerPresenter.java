package org.jbpm.designer.client.vdpe;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;


@Dependent
@WorkbenchEditor(identifier = "jbpm.vdpe.designer", supportedTypes = { VdmlPropositionExchangeType.class })
public class VdmlPropositionExchangeDesignerPresenter extends DesignerPresenter {

    @Inject
    private VdmlPropositionExchangeType resourceType;

    @Inject
    public VdmlPropositionExchangeDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public VdmlPropositionExchangeType getResourceType() {
        return resourceType;
    }
}
