package org.jbpm.designer.client.cmmn;


import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;


@Dependent
@WorkbenchEditor(identifier = "jbpm.cmmn.designer", supportedTypes = { CmmnType.class })
public class CmmnDesignerPresenter extends DesignerPresenter {
    @Inject
    private CmmnType resourceType;

    @Inject
    public CmmnDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public CmmnType getResourceType() {
        return resourceType;
    }
}
