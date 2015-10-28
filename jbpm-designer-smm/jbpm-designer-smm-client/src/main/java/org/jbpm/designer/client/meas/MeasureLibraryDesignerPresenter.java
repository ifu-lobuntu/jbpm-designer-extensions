package org.jbpm.designer.client.meas;

import javax.enterprise.context.Dependent;

import com.google.gwt.user.client.ui.IsWidget;
import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.*;
import org.uberfire.workbench.model.menu.Menus;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;


@Dependent
@WorkbenchEditor(identifier = "jbpm.meas.designer", supportedTypes = { MeasureLibraryType.class })
public class MeasureLibraryDesignerPresenter extends DesignerPresenter {

    @Inject
    private MeasureLibraryType resourceType;

    @Inject
    public MeasureLibraryDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public MeasureLibraryType getResourceType() {
        return resourceType;
    }
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

}
