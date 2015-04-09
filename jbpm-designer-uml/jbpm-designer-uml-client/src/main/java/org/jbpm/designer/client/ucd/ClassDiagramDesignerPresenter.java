package org.jbpm.designer.client.ucd;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.jbpm.designer.client.DesignerPresenter;
import org.jbpm.designer.client.DesignerView;
import org.uberfire.client.annotations.WorkbenchEditor;

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
}
