package org.jbpm.designer.client.cmmn;

import javax.enterprise.context.ApplicationScoped;

import org.jbpm.designer.client.resources.DesignerEditorResources;
import org.jbpm.designer.type.Cmmn1TypeDefinition;
import org.uberfire.client.workbench.type.ClientResourceType;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class Cmmn1Type
        extends Cmmn1TypeDefinition
        implements ClientResourceType {

    private static final Image IMAGE = new Image(DesignerEditorResources.INSTANCE.images().typeForm());

    @Override
    public IsWidget getIcon() {
        return IMAGE;
    }

    @Override
    public String getDescription() {
//        String desc = DesignerEditorConstants.INSTANCE.businessProcessResourceTypeDescription();
        String desc="Case Model";
        if ( desc == null || desc.isEmpty() ) return super.getDescription();
        return desc;
    }
}