package org.jbpm.designer.vdml;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.api.EmfToJsonHelper;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.smm.SmmElement;
import org.omg.smm.util.SmmHelper;
import org.omg.vdml.Assignment;
import org.omg.vdml.Attribute;
import org.omg.vdml.BusinessItem;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.Participant;
import org.omg.vdml.Role;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;

public abstract class AbstractVdmlEmfToJsonHelper extends AbstractVdmlJsonEmfHelper implements EmfToJsonHelper {

    protected Shape targetShape;

    public AbstractVdmlEmfToJsonHelper(ShapeMap shapeMap, Class<? extends VdmlStencilInfo> stencil) {
        super(shapeMap, stencil);
        this.owningCollaboration = (Collaboration) getDiagram().getVdmlElement();
    }

    @Override
    public void refineJsonShape(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
    }

    private String toString(SmmElement s) {
        return s.getName() + "|" + s.eResource().getURI().toPlatformString(true);
    }
    protected void putMeasuredCharacteristic(String key, MeasuredCharacteristic vm) {
        if (SmmHelper.hasMeasure(vm )) {
            targetShape.putProperty(key, toString(vm.getCharacteristicDefinition().getMeasure().get(0)));
        }
    }
    protected void putMeasuredCharacteristics(String measures, EList<MeasuredCharacteristic> measuredCharacteristic) {
        StringBuilder sb = new StringBuilder();
        for (MeasuredCharacteristic valueMeasure : measuredCharacteristic) {
            if(VdmlHelper.hasMeasure(valueMeasure)){
                Measure m = valueMeasure.getCharacteristicDefinition().getMeasure().get(0);
                sb.append(m.getName());
                sb.append("|");
                sb.append(m.eResource().getURI().toPlatformString(true));
                sb.append(",");
            }
        }
        if(sb.length()>0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        targetShape.putProperty(measures, sb.toString());
    }
    protected void putCharacteristicDefinitions(String measures, EList<Characteristic> measuredCharacteristic) {
        StringBuilder sb = new StringBuilder();
        for (Characteristic valueMeasure : measuredCharacteristic) {
            if(VdmlHelper.hasMeasure(valueMeasure)){
                Measure m = valueMeasure.getMeasure().get(0);
                sb.append(m.getName());
                sb.append("|");
                sb.append(m.eResource().getURI().toPlatformString(true));
                sb.append(",");
            }
        }
        if(sb.length()>0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        targetShape.putProperty(measures, sb.toString());
    }

    private String toString(VdmlElement s) {
        return s.getQualifiedName() + "|" + s.eResource().getURI().toPlatformString(true);
    }
    @Override
    public Object caseVdmlElement(VdmlElement object) {
        for (Attribute a : object.getAttribute()) {
           targetShape.putProperty("isTemplate", a.getValue());
        }
        return super.caseVdmlElement(object);
    }
    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        if(object.getDeliverable()!=null){
            if(object.getDeliverable().getDefinition()!=null){
                targetShape.putProperty("name", object.getDeliverable().getDefinition().getName());
            }else{
                targetShape.putProperty("name", object.getDeliverable().getName());
            }
        }else{
            targetShape.putProperty("name", object.getName());
        }
        putBusinessItem(object.getDeliverable(), "deliverableDefinition");
        putMeasuredCharacteristic("durationMeasure", object.getDuration());
        return super.caseDeliverableFlow(object);
    }

    @Override
    public Object caseRole(Role object) {
        putAssignedParticipants(object);
        return super.caseRole(object);
    }
    private void putAssignedParticipants(Role object) {
        EList<Participant> assignedParticipants = new BasicEList<Participant>();
        for (Assignment assignment : object.getRoleAssignment()) {
            if(assignment.getParticipant().eResource()!=null){
                assignedParticipants.add(assignment.getParticipant());
            }
        }
        targetShape.putProperty("assignedParticipants",toString(assignedParticipants));
    }

    protected void putBusinessItem(BusinessItem bi, String key) {
        if (bi != null && bi.getDefinition() != null) {
            if(bi.getDefinition().eResource()!=null){
                targetShape.putProperty(key, toString(bi.getDefinition()));
            }
        }
    }

    protected void buildRoleShapes(Map<VdmlElement, VDMLDiagramElement> map, double roleWidth, double roleHeight) {
        buildRoleShapes(map, roleWidth, roleHeight, getDiagram());
    }

    protected void buildRoleShapes(Map<VdmlElement, VDMLDiagramElement> map, double roleWidth, double roleHeight, VDMLDiagramElement owningShape) {
        TreeIterator<EObject> allContents = owningCollaboration.eAllContents();
        double lowestRoleBoundary = 0;
        while (allContents.hasNext()) {
            EObject eObject = (EObject) allContents.next();
            if (eObject instanceof VDMLShape && ((VDMLDiagramElement) eObject).getVdmlElement() instanceof Role) {
                VDMLShape s = (VDMLShape) eObject;
                if (s.getBounds() != null) {
                    double y = s.getBounds().getY() + s.getBounds().getHeight();
                    if (y > lowestRoleBoundary) {
                        lowestRoleBoundary = y;
                    }
                }
            }
        }
        TreeIterator<EObject> vdmlElements = owningCollaboration.eAllContents();
        while (vdmlElements.hasNext()) {
            EObject eObject = vdmlElements.next();
            if (eObject instanceof Role) {
                Role role = (Role) eObject;
                if (!map.containsKey(role)) {
                    VDMLShape shape = VDMLDIFactory.eINSTANCE.createVDMLShape();
                    shape.setVdmlElement(role);
                    shape.setId(EcoreUtil.generateUUID());
                    org.omg.dd.dc.Bounds bounds = DCFactory.eINSTANCE.createBounds();
                    bounds.setX(0d);
                    bounds.setY(lowestRoleBoundary);
                    bounds.setWidth(roleWidth);
                    bounds.setHeight(roleHeight);
                    shape.setBounds(bounds);
                    shape.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
                    if (owningShape instanceof VDMLDiagram) {
                        ((VDMLDiagram) owningShape).getOwnedVdmlDiagramElement().add(shape);
                    } else {
                        ((VDMLShape) owningShape).getOwnedShape().add(shape);
                    }

                    map.put(role, shape);
                    lowestRoleBoundary += roleHeight;
                }
            }
        }
    }

    protected Map<VdmlElement, VDMLDiagramElement> buildVdmlElementToDiagramElementMap() {
        Map<VdmlElement, VDMLDiagramElement> map = new HashMap<VdmlElement, VDMLDiagramElement>();
        TreeIterator<EObject> allContents = getDiagram().eAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof VDMLDiagramElement) {
                VDMLDiagramElement vde = (VDMLDiagramElement) eObject;
                map.put(vde.getVdmlElement(), vde);
            }
        }
        return map;
    }

    @Override
    public void linkElements(DiagramElement diagramElement, Shape shape) {
    }

    @Override
    public VDMLDiagram getDiagram() {
        return VdmlHelper.getDiagram(shapeMap.getResource());
    }

    @Override
    public String convertToString(LinkedProperty property, Object val) {
        // TODO Auto-generated method stub
        return null;
    }

    protected String toString(EList<? extends VdmlElement> asdf) {
        StringBuilder sb = new StringBuilder();
        Iterator<? extends VdmlElement> iterator = asdf.iterator();
        while (iterator.hasNext()) {
            VdmlElement valueElement = iterator.next();
            sb.append(toString(valueElement));
            if (iterator.hasNext()) {
                sb.append(",");
            }
        }
        String string = sb.toString();
        return string;
    }

}