package org.jbpm.designer.client.ucd;


import com.google.gwt.user.client.ui.IsWidget;
import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.*;
import org.uberfire.workbench.model.menu.Menus;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;


@Dependent
@WorkbenchEditor(identifier = "jbpm.ucd.designer", supportedTypes = { ClassDiagramType.class })
public class ClassDiagramDesignerPresenter extends DesignerPresenter {
    @Inject
    private ClassDiagramType resourceType;

    @Inject
    public ClassDiagramDesignerPresenter(final DesignerView view) {
        super(view);
    }

    public ClassDiagramType getResourceType() {
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
