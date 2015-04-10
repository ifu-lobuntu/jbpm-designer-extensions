package org.jbpm.designer.client.vdlib;

import javax.enterprise.context.ApplicationScoped;

import org.jbpm.designer.client.resources.DesignerEditorResources;
import org.jbpm.designer.type.VdmlLibraryTypeDefinition;
import org.uberfire.client.workbench.type.ClientResourceType;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;

@ApplicationScoped
public class VdmlLibraryType
        extends VdmlLibraryTypeDefinition
        implements ClientResourceType {

    private static final Image IMAGE = new Image(DesignerEditorResources.INSTANCE.images().typeForm());

    @Override
    public IsWidget getIcon() {
        return IMAGE;
    }

    @Override
    public String getDescription() {
//        String desc = DesignerEditorConstants.INSTANCE.businessProcessResourceTypeDescription();
        String desc="VDML Library";
        if ( desc == null || desc.isEmpty() ) return super.getDescription();
        return desc;
    }
}