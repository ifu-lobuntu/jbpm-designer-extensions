package org.jbpm.designer.client.vdpe;

import com.google.gwt.user.client.ui.IsWidget;
import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.*;
import org.uberfire.workbench.model.menu.Menus;

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
