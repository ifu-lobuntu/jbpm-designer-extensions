package org.jbpm.designer.vdlib;

import java.beans.Introspector;
import java.util.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.designer.ucd.ClassDiagramJsonToEmfHelper;
import org.jbpm.designer.ucd.ClassDiagramStencil;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.uml2.dd.umldi.UMLCompartment;
import org.jbpm.uml2.dd.umldi.UMLDIFactory;
import org.jbpm.uml2.dd.umldi.UMLDiagram;
import org.jbpm.uml2.dd.umldi.UMLDiagramElement;
import org.jbpm.uml2.dd.umldi.UMLEdge;
import org.jbpm.uml2.dd.umldi.UMLShape;
import org.jbpm.vdml.dd.vdmldi.VDMLDIFactory;
import org.jbpm.vdml.dd.vdmldi.VDMLEdge;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.*;
import org.omg.vdml.*;

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
            BusinessItemDefinition bid = createBusinessDefinition(object, owningBusinessItemLibrary);
            bid.setIsFungible("true".equals(sourceShape.getProperty("isFungible")));
            bid.setIsShareable("true".equals(sourceShape.getProperty("isShareable")));
            bid.eResource().setModified(true);
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CAPABILITY_CATEGORY.getStencilId())) {
            CapabilityCategory cc = createCapabilityCategory(object, owningCapabilityLibrary);
            cc.eResource().setModified(true);
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.CAPABILITY_DEFINITION.getStencilId())) {
            CapabilityDefinition cd = createCapabilityDefinition(object, owningCapabilityLibrary);
            cd.eResource().setModified(true);
        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.STORE_DEFINITION.getStencilId())) {
            StoreDefinition cd = createStoreDefinition(object, owningStoreLibrary);
            cd.eResource().setModified(true);
            Measure inventoryLevel = (Measure) sourceShape.getUnboundProperty("inventoryLevel");
            if(inventoryLevel!=null && inventoryLevel.getTrait()!=null){
                cd.setInventoryLevel(inventoryLevel.getTrait());
            }
            CapabilityMethod exchangeMethod= (CapabilityMethod) sourceShape.getUnboundProperty("exchangeMethod");
            if(exchangeMethod!=null) {
                Milestone exchangeMilestone = (Milestone) sourceShape.getUnboundProperty("exchangeMilestone");
                Performer supplierRole = (Performer) sourceShape.getUnboundProperty("supplierRole");
                cd.setExchangeConfiguration(VDMLFactory.eINSTANCE.createExchangeConfiguration());
                cd.getExchangeConfiguration().setExchangeMethod(exchangeMethod);
                cd.getExchangeConfiguration().setSupplierRole(supplierRole);
                cd.getExchangeConfiguration().setExchangeMilestone(exchangeMilestone);
            }

        } else if (sourceShape.getStencilId().equalsIgnoreCase(VdmlLibraryStencil.POOL_DEFINITION.getStencilId())) {
            StoreDefinition cd = createPoolDefinition(object, owningStoreLibrary);
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
                EList<EObject> references = forceGetAnnotation(object).getReferences();
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
                } else if (ref instanceof StoreDefinition) {
                    ((StoreDefinition) ref).getCharacteristicDefinition().add(measure.getTrait());
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
            }
            if (de instanceof UMLShape || de instanceof UMLEdge) {
                de.setUmlElement(modelElement);
            }
        }
        return de;
    }

    @Override
    public void postprocessResource() {
        super.postprocessResource();
        Map<Element, UMLDiagramElement> map = buildDiagramElementMap();
        Set<Property> propertiesToDelete = deleteTypes(map);
        deleteProperties(propertiesToDelete);
    }

    protected Map<Element, UMLDiagramElement> buildDiagramElementMap() {
        thisPackage = (Package) this.diagram.getUmlElement();
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

    protected Set<Property> deleteTypes(Map<Element, UMLDiagramElement> map) {
        Set<Property> propertiesToDelete = new HashSet<Property>();
        for (Type type : new ArrayList<Type>(thisPackage.getOwnedTypes())) {
            boolean remove = false;
            if (!map.containsKey(type)) {
                remove=true;
                EAnnotation ann = type.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
                if (ann != null) {
                    if (ann.getReferences().size() > 0) {
                        EObject eObject = ann.getReferences().get(0);
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
                            this.owningStoreLibrary.getStoreDefinitions().remove(eObject);
                        } else if (eObject instanceof Store || eObject instanceof OrgUnit || eObject instanceof CapabilityOffer) {
                            remove = false;
                        }
                    }
                }
            }
            if (remove) {
                thisPackage.getOwnedTypes().remove(type);
                EList<Association> associations = type.getAssociations();
                for (Association association : associations) {
                    association.getOwnedEnds().clear();
                    propertiesToDelete.addAll(association.getMemberEnds());
                }
                thisPackage.getPackagedElements().removeAll(associations);
                propertiesToDelete.addAll(((Classifier) type).getAttributes());
            } else {
                EList<Property> attributes = ((Classifier) type).getAttributes();
                for (Property property : attributes) {
                    if (!map.containsKey(property) && property.getAssociation()==null) {
                        propertiesToDelete.add(property);
                    }
                }
            }
        }
        return propertiesToDelete;
    }

    protected void deleteProperties(Set<Property> propertiesToDelete) {
        for (Property property : propertiesToDelete) {
            if (property.getEAnnotation(VdmlLibraryStencil.VDLIB_URI) != null) {
                EAnnotation ann = property.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
                if (ann.getReferences().size() > 0 && ann.getReferences().get(0) instanceof Characteristic) {
                    Classifier cls= (Classifier) property.getOwner();
                    Characteristic characteristicDef= (Characteristic) ann.getReferences().get(0);
                    VdmlElement parentObject = (VdmlElement) cls.getEAnnotation(VdmlLibraryStencil.VDLIB_URI).getReferences().get(0);
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
        ValueDeliveryModel vdm = findOrcreateValueDeliveryModel(pkg);
        CapabilityLibrary cl = findOrCreateCapabilityLibrary(pkg, vdm);
        cl.setName(json.getProperty("name"));
        owningCapabilityLibrary = cl;
        BusinessItemLibrary bil = findOrCreateBusinessItemLibrary(pkg, vdm);
        bil.setName(json.getProperty("name"));
        owningBusinessItemLibrary = bil;
        StoreLibrary sl = findOrCreateStoreLibrary(pkg, vdm);
        sl.setName(json.getProperty("name"));
        owningStoreLibrary = sl;
        this.cmmnTypes = AbstractClassDiagramProfileImpl.getCmmnTypes(result.getResourceSet());
        return diagram;
    }

    public static BusinessItemLibrary findOrCreateBusinessItemLibrary(Package pkg, ValueDeliveryModel vdm) {
        for (BusinessItemLibrary bil : vdm.getBusinessItemLibrary()) {
            return bil;
        }
        BusinessItemLibrary bil = VDMLFactory.eINSTANCE.createBusinessItemLibrary();
        bil.setId(((XMLResource) vdm.eResource()).getID(pkg) + "bil");
        vdm.getBusinessItemLibrary().add(bil);
        return bil;
    }

    public static StoreLibrary findOrCreateStoreLibrary(Package pkg, ValueDeliveryModel vdm) {
        for (StoreLibrary bil : vdm.getStoreLibrary()) {
            return bil;
        }
        StoreLibrary bil = VDMLFactory.eINSTANCE.createStoreLibrary();
        bil.setId(((XMLResource) vdm.eResource()).getID(pkg) + "bil");
        vdm.getStoreLibrary().add(bil);
        return bil;
    }

    public static CapabilityLibrary findOrCreateCapabilityLibrary(Package pkg, ValueDeliveryModel vdm) {
        XMLResource resource = (XMLResource) pkg.eResource();
        for (CapabilityLibrary cl : vdm.getCapabilitylibrary()) {
            return cl;
        }
        CapabilityLibrary cl = VDMLFactory.eINSTANCE.createCapabilityLibrary();
        cl.setId(resource.getID(pkg) + "cl");
        vdm.getCapabilitylibrary().add(cl);
        return cl;
    }

    public static ValueDeliveryModel findOrcreateValueDeliveryModel(Package pkg) {
        XMLResource resource = (XMLResource) pkg.eResource();
        for (EObject eo : resource.getContents()) {
            if (eo instanceof ValueDeliveryModel) {
                return (ValueDeliveryModel) eo;
            }
        }
        ValueDeliveryModel vdm = VDMLFactory.eINSTANCE.createValueDeliveryModel();
        vdm.setId(resource.getID(pkg) + "vdm");
        resource.getContents().add(vdm);
        return vdm;
    }

    public static BusinessItemDefinition createBusinessDefinition(Class clss, BusinessItemLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getBusinessItemDefinition(), library.getBusinessItemLibraryElement());
    }

    public static CapabilityDefinition createCapabilityDefinition(Class clss, CapabilityLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getCapabilityDefinition(), library.getCapability());
    }

    public static <T extends VdmlElement> T createStoreDefinition(Class clss, StoreLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getStoreDefinition(), library.getStoreDefinitions());
    }

    protected static <T extends VdmlElement> T findOrCreateReference(Class clss, EClass eCls, EList list) {
        if(JBPMECoreHelper.getID(clss)==null){
            ((XMLResource)clss.eResource()).setID(clss,EcoreUtil.generateUUID());

        }
        EAnnotation annotation = forceGetAnnotation(clss);
        for (EObject eObject : annotation.getReferences()) {
            if (eCls.isInstance(eObject)) {
                return (T) eObject;
            }
        }
        for (Object o : list) {
            if (o instanceof VdmlElement && ((VdmlElement) o).getName().equals(clss.getName())) {
                annotation.getReferences().add((VdmlElement) o);
                return (T) o;
            }
        }
        T cd = (T) VDMLFactory.eINSTANCE.create(eCls);
        cd.setName(clss.getName());
        list.add(cd);
        cd.setId(((XMLResource) clss.eResource()).getID(clss) + eCls.getName());
        annotation.getReferences().add(cd);
        return cd;
    }

    public static PoolDefinition createPoolDefinition(Class clss, StoreLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getPoolDefinition(), library.getStoreDefinitions());
    }

    public static CapabilityCategory createCapabilityCategory(Class clss, CapabilityLibrary library) {
        return findOrCreateReference(clss, VDMLPackage.eINSTANCE.getCapabilityCategory(), library.getCapability());
    }

    protected static EAnnotation forceGetAnnotation(Element clss) {
        EAnnotation a = clss.getEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        if (a == null) {
            a = clss.createEAnnotation(VdmlLibraryStencil.VDLIB_URI);
        }
        return a;
    }
}
