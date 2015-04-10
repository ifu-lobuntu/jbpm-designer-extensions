package org.jbpm.designer.client.vdlib;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

@Dependent
@WorkbenchEditor(identifier = "jbpm.vdlib.designer", supportedTypes = { VdmlLibraryType.class })
public class VdmlLibraryDesignerPresenter extends DesignerPresenter {

    @Inject
    private VdmlLibraryType resourceType;

    @Inject
    public VdmlLibraryDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public VdmlLibraryType getResourceType() {
        return resourceType;
    }
}
