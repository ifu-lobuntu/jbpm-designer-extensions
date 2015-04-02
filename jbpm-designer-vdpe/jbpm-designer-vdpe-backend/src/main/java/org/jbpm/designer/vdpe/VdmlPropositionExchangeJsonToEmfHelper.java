package org.jbpm.designer.vdpe;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdrc.AbstractVdmlJsonToEmfHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.vdml.Collaboration;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.VdmlElement;

public class VdmlPropositionExchangeJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    public VdmlPropositionExchangeJsonToEmfHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        return super.caseRole(object);
    }

    @Override
    public Object caseValueProposition(ValueProposition object) {
        return super.caseValueProposition(object);
    }

    @Override
    public void postprocessResource(XMLResource resource) {
        ValueDeliveryModel vdm = (ValueDeliveryModel) resource.getContents().get(0);
        Map<VdmlElement, VDMLDiagramElement> map = new HashMap<VdmlElement, VDMLDiagramElement>();
        VDMLDiagram vdmlDiagram = vdm.getDiagram().get(0);
        buildMap(vdmlDiagram, map, VDMLPackage.eINSTANCE.getRole());
        Collaboration coll = (Collaboration) vdmlDiagram.getVdmlElement();
        ((XMLResource)coll.eResource()).setModified(true);
        removeOrphanedRoles(map, coll);

    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlPropositionExchangeStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        return VdmlPropositionExchangeStencil.createElement(stencilId);
    }
}
