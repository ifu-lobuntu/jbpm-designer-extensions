package org.jbpm.designer.client.vdlib;


import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;
import org.uberfire.client.annotations.WorkbenchMenu;
import org.uberfire.workbench.model.menu.Menus;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;


@Dependent
@WorkbenchEditor(identifier = "jbpm.vdlib.designer", supportedTypes = { VdmlLibraryType.class })
public class VdmlLibraryDesignerPresenter extends DesignerPresenter {

    @Inject
    private VdmlLibraryType resourceType;
    @WorkbenchMenu
    public Menus getMenus() {
        return super.getMenus();
    }

    @Inject
    public VdmlLibraryDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public VdmlLibraryType getResourceType() {
        return resourceType;
    }
}
