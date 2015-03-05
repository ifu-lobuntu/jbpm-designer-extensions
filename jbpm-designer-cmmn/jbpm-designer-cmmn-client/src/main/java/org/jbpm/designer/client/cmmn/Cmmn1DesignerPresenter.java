package org.jbpm.designer.client.cmmn;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

@Dependent
@WorkbenchEditor(identifier = "jbpm.cmmn.designer", supportedTypes = { Cmmn1Type.class })
public class Cmmn1DesignerPresenter extends DesignerPresenter {
    @Inject
    private Cmmn1Type resourceType;

    @Inject
    public Cmmn1DesignerPresenter(final DesignerView view) {
        super(view);
    }

    public Cmmn1Type getResourceType() {
        return resourceType;
    }
}
