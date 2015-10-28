package org.jbpm.designer.vdlib;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.jbpm.designer.dd.jbpmdd.Compartment;
import org.jbpm.designer.extensions.api.StencilInfo;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.util.ShapeLayoutHelper;
import org.jbpm.designer.ucd.ClassDiagramEmfToJsonHelper;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.omg.dd.dc.DCFactory;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.vdml.*;

public class VdmlLibraryEmfToJsonHelper extends ClassDiagramEmfToJsonHelper {

    private Package owningPackage;

    public VdmlLibraryEmfToJsonHelper(ShapeMap resource) {
        super(resource);
    }

    @Override
    public void preprocessResource() {
        UMLDiagram umlDiagram = (UMLDiagram) getDiagram();
        owningPackage = (Package) umlDiagram.getUmlElement();
        Map<Element, UMLDiagramElement> map = new HashMap<Element, UMLDiagramElement>();
        TreeIterator<EObject> eAllContents = getDiagram().eAllContents();
        while (eAllContents.hasNext()) {
            EObject eObject = eAllContents.next();
            if (eObject instanceof UMLDiagramElement) {
                UMLDiagramElement de = (UMLDiagramElement) eObject;
                map.put(de.getUmlElement(), de);
            }
        }
        for (Type type : owningPackage.getOwnedTypes()) {
            if (type instanceof Association) {
                // TODO create edge
            } else {
                UMLShape shape = (UMLShape) map.get(type);
                if (shape == null) {
                    shape = UMLDIFactory.eINSTANCE.createUMLShape();
                    map.put(type, shape);
                    umlDiagram.getOwnedUmlDiagramElement().add(shape);
                    shape.setLocalStyle(VDMLDIFactory.eINSTANCE.createVDMLStyle());
                    ShapeLayoutHelper.positionElementOn(umlDiagram, shape);
                    shape.setUmlElement(type);
                }
                UMLCompartment attributes = null;
                UMLCompartment characteristics = null;
                for (UMLCompartment c : shape.getOwnedCompartment()) {
                    if (c.getFeatureName().equalsIgnoreCase("ownedattribute")) {
                        attributes = c;
                    } else if (c.getFeatureName().equalsIgnoreCase("characteristicDefinition")) {
                        characteristics = c;
                    }
                }
                if (attributes == null) {
                    attributes = addCompartment(shape, "ownedAttribute");
                }
                if (type.getEAnnotation(VdmlLibraryStencil.VDLIB_URI) != null && characteristics == null) {
                    characteristics = addCompartment(shape, "characteristicDefinition");
                }
                if (type instanceof Classifier) {
                    for (Property property : ((Classifier) type).getAttributes()) {
                        if (!map.containsKey(property)) {
                            EAnnotation ann = property.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
                            if (ann != null) {
                                if (ann.getReferences().size() > 0 && ann.getReferences().get(0) instanceof Characteristic) {
                                    addPropertyShape(characteristics, property);
                                }
                            } else if (property.getAssociation() == null) {
                                addPropertyShape(attributes, property);
                            }
                        }
                    }
                }
            }
        }
        super.shapeMap.getResource().getResourceSet();
    }

    protected void addPropertyShape(UMLCompartment characteristics, Property property) {
        UMLShape cShape = UMLDIFactory.eINSTANCE.createUMLShape();
        cShape.setUmlElement(property);
        cShape.setBounds(DCFactory.eINSTANCE.createBounds());
        cShape.getBounds().setHeight(20d);
        cShape.getBounds().setWidth(200d);
        cShape.getBounds().setY(characteristics.getOwnedShape().size() * 50d);
        characteristics.getOwnedShape().add(cShape);
    }

    protected UMLCompartment addCompartment(UMLShape shape, String NAME2) {
        UMLCompartment attributes = UMLDIFactory.eINSTANCE.createUMLCompartment();
        attributes.setFeatureName(NAME2);
        attributes.setBounds(DCFactory.eINSTANCE.createBounds());
        attributes.getBounds().setHeight(40d);
        attributes.getBounds().setWidth(200d);
        attributes.getBounds().setY(shape.getOwnedCompartment().size() * 50d);
        attributes.getBounds().setX(0d);
        shape.getOwnedCompartment().add(attributes);
        attributes.setIsExpanded(true);
        return attributes;
    }

    @Override
    public Object caseClass(Class object) {
        EAnnotation ann = object.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if (targetShape.getStencilId().equals(VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION.getStencilId())) {
            BusinessItemDefinition bid = (BusinessItemDefinition) ann.getReferences().get(0);
//            targetShape.putProperty("isShareable", bid.getIsShareable().toString());
//            targetShape.putProperty("isFungible", bid.getIsFungible().toString());
        } else if (targetShape.getStencilId().equals(VdmlLibraryStencil.STORE_DEFINITION.getStencilId()) ||  targetShape.getStencilId().equals(VdmlLibraryStencil.POOL_DEFINITION.getStencilId())) {
            StoreDefinition sd = (StoreDefinition) ann.getReferences().get(0);
            if(VdmlHelper.hasMeasure(sd.getInventoryLevel())) {
                Measure measure = sd.getInventoryLevel().getMeasure().get(0);
//                targetShape.putProperty("inventoryLevel", measure.getName() +  "|" + measure.eResource().getURI().toPlatformString(true));
            }
            if(sd.getExchangeConfiguration()!=null){
                if(sd.getExchangeConfiguration().getExchangeMethod()!=null) {
                    CapabilityMethod cm =sd.getExchangeConfiguration().getExchangeMethod();
//                    targetShape.putProperty("exchangeMethod", cm.getName() + "|" + cm.eResource().getURI().toPlatformString(true));
                }
                if(sd.getExchangeConfiguration().getExchangeMilestone()!=null) {
                    Milestone cm =sd.getExchangeConfiguration().getExchangeMilestone();
//                    targetShape.putProperty("exchangeMilestone", cm.getName() + "|" + cm.eResource().getURI().toPlatformString(true));
                }
                if(sd.getExchangeConfiguration().getSupplierRole()!=null) {
                    Role cm =sd.getExchangeConfiguration().getSupplierRole();
//                    targetShape.putProperty("supplierRole", cm.getName() + "|" + cm.eResource().getURI().toPlatformString(true));
                }

            }
        }

        if (ann != null) {
            if (ann.getReferences().size() > 0) {
                EObject ref = ann.getReferences().get(0);
                String name = ref.eClass().getName();
                if (ref.eResource() != owningPackage.eResource()) {
                    name = "Imported " + name;
                }
                targetShape.putProperty("vdmlElementType", name);
            }
        }
        return super.caseClass(object);
    }

    @Override
    public Object caseProperty(Property object) {
        if (targetShape.getStencilId().equals(VdmlLibraryStencil.CHARACTERISTIC.getStencilId())) {
            EAnnotation ann = object.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            Measure measure = null;
            if (ann != null && ann.getReferences().size() > 0) {
                Characteristic ch = (Characteristic) ann.getReferences().get(0);
                if (ch.eResource() != null && ch.getMeasure().size() > 0) {
                    measure = ch.getMeasure().get(0);
                    targetShape.putProperty("measure", measure.getName() + "|" + ch.eResource().getURI().toPlatformString(true));
                }
            }
            if (measure == null) {
                targetShape.putProperty("name", object.getName());
            } else {
                targetShape.putProperty("name", measure.getName());
            }
        }
        return super.caseProperty(object);
    }

    @Override
    public StencilInfo findStencilByElement(EObject me, DiagramElement de) {
        if (me instanceof EModelElement) {
            EAnnotation ann = ((EModelElement) me).getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            if (ann == null) {
                if (me instanceof Property && de.eContainer() instanceof Compartment) {
                    UMLCompartment uc = (UMLCompartment) de.eContainer();
                    if (VdmlLibraryStencil.CHARACTERISTIC_DEFINITION.getStencilId().equalsIgnoreCase(uc.getFeatureName())) {
                        return VdmlLibraryStencil.CHARACTERISTIC;
                    }
                }
                return ClassDiagramStencil.findStencilByElement(me, de, me.eResource() != owningPackage.eResource());
            } else {
                EObject ref = ann.getReferences().get(0);
                return VdmlLibraryStencil.findStencilByElement(ref, de, ref.eResource() != owningPackage.eResource());
            }
        } else if (de instanceof Compartment && ((UMLShape) de.eContainer()).getUmlElement() != null) {
            EAnnotation ann = ((UMLShape) de.eContainer()).getUmlElement().getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
            if (ann != null) {
                if (VdmlLibraryStencil.CHARACTERISTIC_DEFINITION.getStencilId().equalsIgnoreCase(((UMLCompartment) de).getFeatureName())) {
                    return VdmlLibraryStencil.CHARACTERISTIC_DEFINITION;
                }
            }
        }
        return super.findStencilByElement(me, de);
    }
}
