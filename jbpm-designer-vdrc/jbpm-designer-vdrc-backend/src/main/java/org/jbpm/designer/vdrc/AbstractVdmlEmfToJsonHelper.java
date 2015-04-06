package org.jbpm.designer.vdrc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.EmfToJsonHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.di.Diagram;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.SmmElement;
import org.omg.vdml.Collaboration;
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
    public void doSwitch(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
    }

    protected String toString(SmmElement s) {
        return s.getName() + "|" + s.eResource().getURI().toPlatformString(true);
    }

    protected String toString(VdmlElement s) {
        return s.getQualifiedName() + "|" + s.eResource().getURI().toPlatformString(true);
    }

    protected void buildRoleShapes(Map<VdmlElement, VDMLDiagramElement> map, double roleWidth, double roleHeight) {
        buildRoleShapes(map, roleWidth, roleHeight, getDiagram());
    }

    protected void buildRoleShapes(Map<VdmlElement, VDMLDiagramElement> map, double roleWidth, double roleHeight, VDMLDiagramElement owningElement) {
        TreeIterator<EObject> allContents = owningElement.getVdmlElement().eAllContents();
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
                    if (owningElement instanceof VDMLDiagram) {
                        ((VDMLDiagram) owningElement).getOwnedVdmlDiagramElement().add(shape);
                    } else {
                        ((VDMLShape) owningElement).getOwnedShape().add(shape);
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
    public Diagram getDiagram(int i) {
        ValueDeliveryModel dr = (ValueDeliveryModel) shapeMap.getResource().getContents().get(0);
        return dr.getDiagram().get(i);
    }

    @Override
    public String convertToString(LinkedProperty property, Object val) {
        // TODO Auto-generated method stub
        return null;
    }

}