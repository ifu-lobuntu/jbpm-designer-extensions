package org.jbpm.designer.client.vdlib;


import com.google.gwt.user.client.ui.IsWidget;
import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.*;
import org.uberfire.workbench.model.menu.Menus;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;


@Dependent
@WorkbenchEditor(identifier = "jbpm.vdlib.designer", supportedTypes = { VdmlLibraryType.class })
public class VdmlLibraryDesignerPresenter extends DesignerPresenter {

    @Inject
    private VdmlLibraryType resourceType;
    @WorkbenchPartTitle
    public String getTitleText() {
        return super.getTitleText();
    }

    @WorkbenchPartTitleDecoration
    public IsWidget getTitle() {
        return super.getTitle();
    }

    @WorkbenchPartView
    public IsWidget getView() {
        return super.getWidget();
    }
    @WorkbenchMenu
    public Menus getMenus() {
        return menus;
    }


    @Inject
    public VdmlLibraryDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public VdmlLibraryType getResourceType() {
        return resourceType;
    }
}
