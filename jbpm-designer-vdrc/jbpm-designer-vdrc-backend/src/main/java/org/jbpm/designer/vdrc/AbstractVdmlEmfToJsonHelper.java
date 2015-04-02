package org.jbpm.designer.vdrc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
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
import org.omg.vdml.Role;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.VdmlElement;
import org.omg.vdml.util.VDMLSwitch;

public abstract class AbstractVdmlEmfToJsonHelper extends VDMLSwitch<Object> implements EmfToJsonHelper {

    protected Shape targetShape;
    protected ShapeMap shapeMap;

    public AbstractVdmlEmfToJsonHelper(ShapeMap shapeMap) {
        super();
        this.shapeMap=shapeMap;
    }

    @Override
    public void doSwitch(LinkedStencil validator, Shape targetShape, EObject me) {
        this.targetShape = targetShape;
        doSwitch(me);
    }

    protected void buildRoleShapes(XMLResource resource, Map<VdmlElement, VDMLDiagramElement> map, VDMLDiagram vd, double roleHeight) {
        TreeIterator<EObject> allContents = vd.getVdmlElement().eAllContents();
        double lowestRoleBoundary=0;
        double roleWidth=100;
        for (Entry<VdmlElement, VDMLDiagramElement> entry : map.entrySet()) {
            if(entry.getKey() instanceof Role && entry.getValue() instanceof VDMLShape){
                VDMLShape s=(VDMLShape) entry.getValue();
                if(s.getBounds()!=null){
                    double y=s.getBounds().getY() + s.getBounds().getHeight();
                    if(y>lowestRoleBoundary){
                        lowestRoleBoundary=y;
                        roleWidth=s.getBounds().getWidth();
                    }
                }
            }
        }
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
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
                    vd.getOwnedVdmlDiagramElement().add(shape);
                    map.put(role, shape);
                    lowestRoleBoundary += 150;
                }
            }
        }
    }

    protected Map<VdmlElement, VDMLDiagramElement> buildMap(XMLResource resource) {
        Map<VdmlElement, VDMLDiagramElement> map = new HashMap<VdmlElement, VDMLDiagramElement>();
        TreeIterator<EObject> allContents = resource.getAllContents();
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