package org.jbpm.designer.extensions.stencilset.linkage;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.diagram.ShapeReference;
import org.jbpm.designer.extensions.emf.util.ShapeMap;

public class LinkedStencilSet {
    private StencilSet stencilSet;
    private Map<String, LinkedStencil> stencils = new HashMap<String, LinkedStencil>();
    private Map<String, PropertyPackage> propertyPackages = new HashMap<String, PropertyPackage>();
    private Map<String, Set<Stencil>> roles = new HashMap<String, Set<Stencil>>();

    public LinkedStencilSet(StencilSet stencilSet) {
        super();
        this.stencilSet = stencilSet;
        for (PropertyPackage pp : this.stencilSet.getPropertyPackages()) {
            propertyPackages.put(pp.getName(), pp);
        }
        for (Stencil stencil : stencilSet.getStencils()) {
            LinkedStencil sv = new LinkedStencil(stencil);
            this.stencils.put(stencil.getId(), sv);
            List<String> roles = stencil.getRoles();
            for (String string : roles) {
                Set<Stencil> stencilsInRole = this.roles.get(string);
                if (stencilsInRole == null) {
                    this.roles.put(string, stencilsInRole = new HashSet<Stencil>());
                }
                stencilsInRole.add(stencil);
            }
            for (String string : stencil.getPropertyPackages()) {
                PropertyPackage propertyPackage = propertyPackages.get(string);
                if (propertyPackage == null) {
                    throw new IllegalStateException("Property Package " + string + " not found for " + stencil.getId());
                }
                List<Property> props = propertyPackage.getProperties();
                for (Property property : props) {
                    sv.putProperty(property);
                }
            }
            for (ContainmentRule containmentRule : this.stencilSet.getRules().getContainmentRules()) {
                if(stencil.getRoles().contains(containmentRule.getRole())){
                    sv.getContainmentRules().add(containmentRule);
                }
            }
            for (ConnectionRule connectionRule : this.stencilSet.getRules().getConnectionRules()) {
                if(stencil.getRoles().contains(connectionRule.getRole())){
                    sv.getConnectionRules().add(connectionRule);
                }
            }

        }
    }

    public void validateDiagram(Diagram diagram, ShapeMap diagramStateHolder) {
        LinkedStencil root = stencils.get(diagram.getStencilId());
        validate("Stencil '" + root.getStencil().getId() + "' cannot be root", root.getStencil().getMayBeRoot());
        applyContainmentRules(diagram, root);
        applyConnectionRules(diagramStateHolder);
        applyCardinality(diagramStateHolder);
    }
    public void validateSupportingFiles(File dir){
        for (LinkedStencil stencil : stencils.values()) {
            File iconFile = new File(dir,"icons/" + stencil.getStencil().getIcon());
            if(!iconFile.exists()){
                System.out.println(iconFile.getAbsolutePath());
            }
            File viewFile = new File(dir,"view/" + stencil.getStencil().getView());
            if(!viewFile.exists()){
                System.out.println(viewFile.getAbsolutePath());
            }
        }
    }

    private void applyConnectionRules(ShapeMap shapeMap) {
        for (Shape fromShape : shapeMap.values()) {
            LinkedStencil fromStencil = stencils.get(fromShape.getStencilId());
            if (fromStencil.getStencil().getType().equals("node")) {
                for (ShapeReference connectingShapeReference : fromShape.getOutgoing()) {
                    Shape connectingShape = shapeMap.get(connectingShapeReference);
                    LinkedStencil connectingStencil = stencils.get(connectingShape.getStencilId());
                    if (connectingStencil.getStencil().getType().equals("edge")) {
                        for (ShapeReference toShapeReference : connectingShape.getOutgoing()) {
                            Shape toShape = shapeMap.get(toShapeReference);
                            LinkedStencil toStencil = stencils.get(toShape.getStencilId());
                            String msg = "Edge of type '" + connectingStencil.getStencil().getId() + "' cannot connect a '" + fromStencil.getStencil().getId()
                                    + "' to a '" + toStencil.getStencil().getId() + "'";
                            validate(msg, canBeOutgoing(fromStencil, connectingStencil, toStencil));
                        }
                    } else {
                        String msg = "Boundary node of type '" + connectingStencil.getStencil().getId() + "' cannot reside on the boundary of a '"
                                + fromStencil.getStencil().getId() + "'";
                        validate(msg, canBeOutgoing(fromStencil, connectingStencil, connectingStencil));
                    }
                }
            }
        }
    }

    private boolean applyCardinality(ShapeMap shapeMap) {
        Map<Shape, Set<Shape>> incomingMap = shapeMap.buildIncomingMap();
        for (CardinalityRule cardinalityRule : this.stencilSet.getRules().getCardinalityRules()) {
            for (Shape shape : shapeMap.values()) {
                LinkedStencil fromStencil = stencils.get(shape.getStencilId());
                if (isInRole(fromStencil, cardinalityRule.getRole())) {
                    validateOutgoingEdges(shapeMap, cardinalityRule, shape, fromStencil);
                    validateIncomingEdges(cardinalityRule, shape, fromStencil, shapeMap, incomingMap);
                }
            }
        }
        return false;
    }

    private void validateIncomingEdges(CardinalityRule cardinalityRule, Shape shape, LinkedStencil fromStencil, ShapeMap shapeMap,
            Map<Shape, Set<Shape>> incomingMap) {
        for (EdgeMultiplicity edgeMultiplicity : cardinalityRule.getIncomingEdges()) {
            Map<String, Integer> counts = new HashMap<String, Integer>();
            Set<Shape> incoming = incomingMap.get(shape);
            if (incoming != null) {
                for (Shape toShape : incoming) {
                    validateCount(fromStencil, edgeMultiplicity, counts, toShape);
                }
            }
        }

    }

    private void validateCount(LinkedStencil fromStencil, EdgeMultiplicity edgeMultiplicity, Map<String, Integer> counts, Shape toShape) {
        LinkedStencil toStencil = stencils.get(toShape.getStencil().getId());
        if (isInRole(toStencil, edgeMultiplicity.getRole())) {
            int count = counts.containsKey(edgeMultiplicity.getRole()) ? counts.get(edgeMultiplicity.getRole()) + 1 : 1;
            if (count > edgeMultiplicity.getMaximum()) {
                throw new IllegalStateException("A '" + fromStencil.getStencil().getId() + "' can only contain " + edgeMultiplicity.getMaximum() + " of '"
                        + toStencil.getStencil().getId() + "'");
            }
            counts.put(edgeMultiplicity.getRole(), count);
        }
    }

    private void validateOutgoingEdges(ShapeMap shapeMap, CardinalityRule cardinalityRule, Shape shape, LinkedStencil fromStencil) {
        for (EdgeMultiplicity edgeMultiplicity : cardinalityRule.getOutgoingEdges()) {
            Map<String, Integer> counts = new HashMap<String, Integer>();
            for (ShapeReference sr : shape.getOutgoing()) {
                Shape toShape = shapeMap.get(sr.getResourceId());
                validateCount(fromStencil, edgeMultiplicity, counts, toShape);
            }
        }
    }

    private boolean canBeOutgoing(LinkedStencil fromStencil, LinkedStencil edgeStencil, LinkedStencil toStencil) {
        for (ConnectionRule connectionRule : this.stencilSet.getRules().getConnectionRules()) {
            if (isInRole(edgeStencil, connectionRule.getRole())) {
                for (Connects connects : connectionRule.getConnects()) {
                    if (isInRole(fromStencil, connects.getFrom())) {
                        for (String toRole : connects.getTo()) {
                            if (isInRole(toStencil, toRole)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private void applyContainmentRules(Shape parentShape, LinkedStencil parentStencil) {
        for (Shape childShape : parentShape.getChildShapes()) {
            LinkedStencil childStencil = stencils.get(childShape.getStencilId());
            if (childStencil.getStencil().getType().equals("node")) {
                String msg = "Node of type '" + childShape.getStencil().getId() + "' cannot be contained by node of type '"
                        + parentStencil.getStencil().getId() + "'";
                validate(msg, canContain(parentStencil, childStencil));
                applyContainmentRules(childShape, childStencil);
            } else if (childStencil.getStencil().getType().equals("edge")) {

            } else {
                throw new IllegalStateException("Invalid stencil type: " + childStencil.getStencil().getType());
            }
        }
    }

    private boolean canContain(LinkedStencil parentStencil, LinkedStencil childStencil) {
        for (ContainmentRule containmentRule : this.stencilSet.getRules().getContainmentRules()) {
            if (isInRole(parentStencil, containmentRule.getRole())) {
                for (String role : containmentRule.getContains()) {
                    if (isInRole(childStencil, role)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isInRole(LinkedStencil stencil, String roleName) {
        Set<Stencil> set = roles.get(roleName);
        if (set == null) {
            return false;
        }
        return set.contains(stencil.getStencil());
    }

    private void validate(String string, Boolean mayBeRoot) {
        if (!Boolean.TRUE.equals(mayBeRoot)) {
            throw new IllegalStateException(string);
        }
    }

    public void validateStencilSet() {
        for (CardinalityRule cr : stencilSet.getRules().getCardinalityRules()) {
            String role = cr.getRole();
            validateRole(role);
            if (cr.getIncomingEdges().size() + cr.getOutgoingEdges().size() == 0) {
                throw new IllegalStateException("No edges specified: " + role);
            }
            validateEdgeMultiplicity(cr.getIncomingEdges());
            validateEdgeMultiplicity(cr.getOutgoingEdges());
        }
        for (ConnectionRule cr : stencilSet.getRules().getConnectionRules()) {
            validateRole(cr.getRole());
            for (Connects c : cr.getConnects()) {
                validateRole(c.getFrom());
                List<String> to = c.getTo();
                for (String string : to) {
                    validateRole(string);
                }
            }
        }
        for (ContainmentRule cr : stencilSet.getRules().getContainmentRules()) {
            validateRole(cr.getRole());
            List<String> contains = cr.getContains();
            for (String string : contains) {
                validateRole(string);
                Set<Stencil> containing = roles.get(cr.getRole());
                Set<Stencil> contained = roles.get(string);
                for (Stencil child : contained) {
                    for (Stencil parent : containing) {
                        stencils.get(child.getId()).getAllowableParents().add(stencils.get(parent.getId()));
                    }
                }
            }
        }
    }

    private void validateEdgeMultiplicity(List<EdgeMultiplicity> incomingEdges) {
        for (EdgeMultiplicity incomingEdge : incomingEdges) {
            validateRole(incomingEdge.getRole());
        }
    }

    private void validateRole(String role) {
        if (roles.get(role) == null) {
            throw new IllegalStateException(role);
        }
    }

    public LinkedStencil getLinkedStencil(String stencilId) {
        return stencils.get(stencilId);
    }

    public StencilSet getStencilSet() {
        return this.stencilSet;
    }

    public Collection<LinkedStencil> getLinkedStencils() {
        return this.stencils.values();
    }
}
