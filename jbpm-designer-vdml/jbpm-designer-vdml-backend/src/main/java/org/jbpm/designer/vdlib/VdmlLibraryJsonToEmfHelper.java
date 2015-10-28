package org.jbpm.designer.vdlib;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.*;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.ucd.ClassDiagramJsonToEmfHelper;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.designer.vdml.VdmlUmlHelper;
import org.jbpm.uml2.dd.umldi.*;
import org.omg.smm.*;
import org.omg.vdml.*;
import org.omg.vdml.Collaboration;

import java.beans.Introspector;
import java.util.*;

public class VdmlLibraryJsonToEmfHelper extends ClassDiagramJsonToEmfHelper {
    private BusinessItemLibrary owningBusinessItemLibrary;
    private CapabilityLibrary owningCapabilityLibrary;
    private StoreLibrary owningStoreLibrary;
    private Package cmmnTypes;
    private Collaboration owningCollaboration;
    private UMLDiagram diagram;

    public VdmlLibraryJsonToEmfHelper(ShapeMap resource) {
        super(resource);
    }


    @Override
    public Object caseClass(Class object) {
        object.eResource().setModified(true);
        if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.BUSINESS_ITEM_DEFINITION.getStencilId())) {
//            BusinessItemDefinition bid = createBusinessDefinition(object, owningBusinessItemLibrary);
//            bid.setIsFungible("true".equals(sourceShape.getProperty("isFungible")));
//            bid.setIsShareable("true".equals(sourceShape.getProperty("isShareable")));
//            bid.eResource().setModified(true);
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CAPABILITY_CATEGORY.getStencilId())) {
            CapabilityCategory cc = VdmlUmlHelper.createCapabilityCategory(object, owningCapabilityLibrary);
            cc.eResource().setModified(true);
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CAPABILITY_DEFINITION.getStencilId())) {
            CapabilityDefinition cd = VdmlUmlHelper.createCapabilityDefinition(object, owningCapabilityLibrary);
            cd.eResource().setModified(true);
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.STORE_DEFINITION.getStencilId())) {
            StoreDefinition cd = VdmlUmlHelper.createStoreDefinition(object, owningStoreLibrary);
            cd.eResource().setModified(true);
//            Measure inventoryLevel = (Measure) sourceShape.getUnboundProperty("inventoryLevel");
//            if(inventoryLevel!=null && inventoryLevel.getTrait()!=null){
//                cd.setInventoryLevel(inventoryLevel.getTrait());
//            }
//            CapabilityMethod exchangeMethod= (CapabilityMethod) sourceShape.getUnboundProperty("exchangeMethod");
//            if(exchangeMethod!=null) {
//                Milestone exchangeMilestone = (Milestone) sourceShape.getUnboundProperty("exchangeMilestone");
//                Performer supplierRole = (Performer) sourceShape.getUnboundProperty("supplierRole");
//                cd.setExchangeConfiguration(VDMLFactory.eINSTANCE.createExchangeConfiguration());
//                cd.getExchangeConfiguration().setExchangeMethod(exchangeMethod);
//                cd.getExchangeConfiguration().setSupplierRole(supplierRole);
//                cd.getExchangeConfiguration().setExchangeMilestone(exchangeMilestone);
//            }

        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.POOL_DEFINITION.getStencilId())) {
            StoreDefinition cd = VdmlUmlHelper.createPoolDefinition(object, owningStoreLibrary);
            cd.eResource().setModified(true);
        }
        return super.caseClass(object);
    }

    @Override
    public void refineEmfElements(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        EObject modelElement = shapeMap.getModelElement(sourceShape.getResourceId());
        if (modelElement instanceof Element) {
            super.doSwitch(modelElement);
        } else {

        }
    }

    @Override
    public Object caseProperty(Property object) {
        if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CHARACTERISTIC.getStencilId())) {
            Measure measure = (Measure) sourceShape.getUnboundProperty("measure");
            if (measure != null) {
                EList<EObject> references = VdmlUmlHelper.forceGetAnnotation(object).getReferences();
                if (references.size() > 0) {
                    references.set(0, measure.getTrait());
                } else {
                    references.add(measure.getTrait());
                }
                Class clss = (Class) object.getOwner();
                EObject ref = clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
                object.setName(measure.getName());
                if (ref instanceof BusinessItemLibraryElement) {
                    ((BusinessItemLibraryElement) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof Capability) {
                    ((Capability) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof RoleDefinition) {
                    ((RoleDefinition) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof ValueDefinition) {
                    ((ValueDefinition) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof StoreLibraryElement) {
                    ((StoreLibraryElement) ref).getCharacteristicDefinition().add(measure.getTrait());
                } else if (ref instanceof MeasurableElement) {
                    object.eResource().setModified(true);
                    MeasurableElement me = (MeasurableElement) ref;
                    boolean found = false;
                    for (MeasuredCharacteristic mc : me.getMeasuredCharacteristic()) {
                        if (mc.getCharacteristicDefinition().equals(measure.getTrait())) {
                            found = true;
                        }
                    }
                    if (!found) {
                        me.eResource().setModified(true);
                        MeasuredCharacteristic mc = VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
                        mc.setCharacteristicDefinition(measure.getTrait());
                        mc.setName(measure.getTrait().getName());
                        me.getMeasuredCharacteristic().add(mc);
                    }
                    XMLResource resource = (XMLResource) object.eResource();
                    if (resource.getID(object) == null) {
                        resource.setID(object, EcoreUtil.generateUUID());
                    }
                }
                if (measure instanceof GradeMeasure || measure instanceof RankingMeasure) {
                    for (EObject e : measure.eResource().getContents()) {
                        if (e instanceof Package) {
                            object.setType(((Package) e).getOwnedType(measure.getName()));
                        }
                    }
                } else if (measure instanceof DimensionalMeasure) {
                    if (cmmnTypes != null) {
                        object.setType(cmmnTypes.getOwnedType("Double"));
                    }
                }
            }
        }
        return null;
    }

    @Override
    public UMLDiagramElement createElements(Shape shape) {
        VdmlLibraryStencil st = VdmlLibraryStencil.findStencilById(shape.getStencilId());
        String umlStencilId = st == null ? shape.getStencilId() : st.getBaseStencil().getStencilId();
        UMLDiagramElement de = ClassDiagramStencil.createDiagramElement(umlStencilId);
        de.setLocalStyle(UMLDIFactory.eINSTANCE.createUMLStyle());
        if (de instanceof UMLCompartment) {
            ((UMLCompartment) de).setFeatureName(Introspector.decapitalize(shape.getStencilId()));
        } else {
            Element modelElement = shapeMap.findEObjectById(shape.getResourceId());
            if (modelElement == null) {
                modelElement = ClassDiagramStencil.createElement(umlStencilId);
                ((XMLResource) getOwningPackage().eResource()).setID(modelElement, shape.getResourceId());
            }
            if (de instanceof UMLShape || de instanceof UMLEdge) {
                de.setUmlElement(modelElement);
            }
            if (st != null && st.getVdmlClass() != null) {
                findOrCreateAssociatedVdmlElement(shape, st, modelElement);
            }
        }
        return de;
    }

    protected void findOrCreateAssociatedVdmlElement(Shape shape, VdmlLibraryStencil st, Element modelElement) {
        EList targetList = null;
        switch (st) {
            case BUSINESS_ITEM_DEFINITION:
            case BUSINESS_ITEM_CATEGORY:
                targetList = owningBusinessItemLibrary.getBusinessItemLibraryElement();
                break;
            case STORE_DEFINITION:
            case POOL_DEFINITION:
            case STORE_CATEGORY:
                targetList = owningStoreLibrary.getStoreLibraryElement();
                break;
            case CAPABILITY_CATEGORY:
            case CAPABILITY_DEFINITION:
                targetList = owningCapabilityLibrary.getCapability();
                break;
        }
        if (modelElement instanceof Class && targetList != null) {
            Class umlClass = (Class) modelElement;
            umlClass.setName(shape.getProperty("name"));
            if (umlClass.eResource() == null) {
                //new, need to associate it to the containment tree before generating an id
                getOwningPackage().getOwnedTypes().add(umlClass);
                ((XMLResource) umlClass.eResource()).setID(umlClass, shape.getResourceId());
            }
            VdmlUmlHelper.findOrCreateReference(umlClass, st.getVdmlClass(), targetList);
        }
    }

    @Override
    public Object caseGeneralization(Generalization object) {
        VdmlElement general = VdmlUmlHelper.getLinkedVdmlElement(object.getGeneral());
        VdmlElement specific = VdmlUmlHelper.getLinkedVdmlElement(object.getSpecific());
        if (general instanceof BusinessItemCategory && specific instanceof BusinessItemLibraryElement) {
            BusinessItemCategory generalBic = (BusinessItemCategory) general;
            if (specific instanceof BusinessItemDefinition) {
                generalBic.getCategoryItem().add((BusinessItemDefinition) specific);
            } else {
                generalBic.getChildCategory().add((BusinessItemCategory) specific);
            }
        }
        if (general instanceof Capability && specific instanceof Capability) {
            Capability generalCapability = (Capability) general;
            generalCapability.getChildCapability().add((Capability) specific);
        }
        if (general instanceof StoreCategory && specific instanceof StoreDefinition) {
            StoreCategory generalStore = (StoreCategory) general;
            if (specific instanceof StoreDefinition) {
                generalStore.getCategoryStore().add((StoreDefinition) specific);
            } else {
                generalStore.getChildCategory().add((StoreCategory) specific);
            }
        }
        return super.caseGeneralization(object);
    }

    @Override
    public void postprocessResource() {
        super.postprocessResource();
        Map<Element, UMLDiagramElement> map = buildDiagramElementMap();
        Set<Property> propertiesToDelete = deleteTypes(map);
        deleteProperties(propertiesToDelete);
    }

    protected Map<Element, UMLDiagramElement> buildDiagramElementMap() {
        thisPackage = getOwningPackage();
        TreeIterator<EObject> eAllContents2 = this.diagram.eAllContents();
        Map<Element, UMLDiagramElement> map = new HashMap<Element, UMLDiagramElement>();
        while (eAllContents2.hasNext()) {
            EObject eObject = eAllContents2.next();
            if (eObject instanceof UMLDiagramElement) {
                UMLDiagramElement de = (UMLDiagramElement) eObject;
                map.put(de.getUmlElement(), (UMLDiagramElement) eObject);
            }
        }
        return map;
    }

    private Package getOwningPackage() {
        return (Package) this.diagram.getUmlElement();
    }

    protected Set<Property> deleteTypes(Map<Element, UMLDiagramElement> map) {
        Set<Property> propertiesToDelete = new HashSet<Property>();
        for (Type type : new ArrayList<Type>(thisPackage.getOwnedTypes())) {
            boolean remove = false;
            if (!map.containsKey(type)) {
                remove = deleteVdmlElement(type);
            }
            if (remove) {
                deleteType(propertiesToDelete, type);
            } else {
                delteOrphanedProperties(map, propertiesToDelete, (Classifier) type);
            }
        }
        return propertiesToDelete;
    }

    private void delteOrphanedProperties(Map<Element, UMLDiagramElement> map, Set<Property> propertiesToDelete, Classifier type) {
        EList<Property> attributes = type.getAttributes();
        for (Property property : attributes) {
            if (!map.containsKey(property) && property.getAssociation() == null) {
                propertiesToDelete.add(property);
            }
        }
    }

    private void deleteType(Set<Property> propertiesToDelete, Type type) {
        thisPackage.getOwnedTypes().remove(type);
        EList<Association> associations = type.getAssociations();
        for (Association association : associations) {
            association.getOwnedEnds().clear();
            propertiesToDelete.addAll(association.getMemberEnds());
        }
        thisPackage.getPackagedElements().removeAll(associations);
        propertiesToDelete.addAll(((Classifier) type).getAttributes());
    }

    private boolean deleteVdmlElement(Type type) {
        boolean deleteType = true;
        VdmlElement eObject = VdmlUmlHelper.getVdmlElement((Classifier) type);
        if (eObject instanceof BusinessItemDefinition) {
            for (DeliverableFlow f : this.owningCollaboration.getFlow()) {
                if (f.getDeliverable() != null && f.getDeliverable().getDefinition() != null
                        && f.getDeliverable().getDefinition().equals(eObject)) {
                    f.setDeliverable(null);
                }
            }
            for (BusinessItem f : new ArrayList<BusinessItem>(this.owningCollaboration.getBusinessItem())) {
                if (f.getDefinition() != null && f.getDefinition().equals(eObject)) {
                    this.owningCollaboration.getBusinessItem().remove(f);
                }
            }
            this.owningBusinessItemLibrary.getBusinessItemLibraryElement().remove(eObject);
        } else if (eObject instanceof Capability) {
            this.owningCapabilityLibrary.getCapability().remove(eObject);
        } else if (eObject instanceof StoreDefinition) {
            this.owningStoreLibrary.getStoreLibraryElement().remove(eObject);
        } else if (eObject instanceof Store || eObject instanceof OrgUnit || eObject instanceof CapabilityOffer) {
            deleteType = false;
        }
        return deleteType;
    }

    protected void deleteProperties(Set<Property> propertiesToDelete) {
        for (Property property : propertiesToDelete) {
            Characteristic characteristicDef = VdmlUmlHelper.getCharacteristic(property);
            VdmlElement parentObject = VdmlUmlHelper.getVdmlElement((Classifier) property.getOwner());
            if (parentObject instanceof BusinessItemDefinition) {
                ((BusinessItemDefinition) parentObject).getCharacteristicDefinition().remove(characteristicDef);
            } else if (parentObject instanceof Capability) {
                ((Capability) parentObject).getCharacteristicDefinition().remove(characteristicDef);
            } else if (parentObject instanceof StoreDefinition) {
                ((StoreDefinition) parentObject).getCharacteristicDefinition().remove(characteristicDef);
            } else if (parentObject instanceof MeasurableElement) {
                MeasurableElement meas = (MeasurableElement) parentObject;
                for (MeasuredCharacteristic mc : new ArrayList<MeasuredCharacteristic>(meas.getMeasuredCharacteristic())) {
                    if (mc.getCharacteristicDefinition() != null && mc.getCharacteristicDefinition().equals(characteristicDef)) {
                        meas.getMeasuredCharacteristic().remove(mc);
                    }
                }
            }
            deleteProperty(property);
        }
    }

    protected void deleteProperty(Property property) {
        if (property.getOwner() instanceof Class) {
            ((Class) property.getOwner()).getOwnedAttributes().remove(property);
        } else if (property.getOwner() instanceof Interface) {
            ((Interface) property.getOwner()).getOwnedAttributes().remove(property);
        } else if (property.getOwner() instanceof Enumeration) {
            ((Enumeration) property.getOwner()).getOwnedAttributes().remove(property);
        }
    }

    @Override
    public UMLDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        this.diagram = UMLDIFactory.eINSTANCE.createUMLDiagram();
        result.getContents().add(diagram);
        URI collaborationUri = result.getURI().trimFileExtension().appendFileExtension("vdcol");
        this.owningCollaboration = VdmlHelper.getCollaboration((XMLResource) result.getResourceSet().getResource(collaborationUri, true));
        Package pkg = null;
        for (EObject eo : owningCollaboration.eResource().getContents()) {
            if (eo instanceof Package) {
                pkg = (Package) eo;
                break;
            }
        }
        if (pkg == null) {
            pkg = UMLFactory.eINSTANCE.createPackage();
            pkg.setName(this.owningCollaboration.getName().toLowerCase());
            this.owningCollaboration.eResource().getContents().add(pkg);
        }
        diagram.setUmlElement(pkg);
        ValueDeliveryModel vdm = VdmlUmlHelper.findOrcreateValueDeliveryModel(pkg);
        CapabilityLibrary cl = VdmlUmlHelper.findOrCreateCapabilityLibrary(pkg, vdm);
        cl.setName(json.getProperty("name"));
        owningCapabilityLibrary = cl;
        BusinessItemLibrary bil = VdmlUmlHelper.findOrCreateBusinessItemLibrary(pkg, vdm);
        bil.setName(json.getProperty("name"));
        owningBusinessItemLibrary = bil;
        StoreLibrary sl = VdmlUmlHelper.findOrCreateStoreLibrary(pkg, vdm);
        sl.setName(json.getProperty("name"));
        owningStoreLibrary = sl;
        this.cmmnTypes = AbstractClassDiagramProfileImpl.getCmmnTypes(result.getResourceSet());
        return diagram;
    }
}
