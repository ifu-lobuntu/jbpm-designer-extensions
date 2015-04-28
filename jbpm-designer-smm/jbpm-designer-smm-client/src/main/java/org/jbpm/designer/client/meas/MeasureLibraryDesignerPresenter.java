package org.jbpm.designer.client.meas;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

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
}
