package org.jbpm.designer.meas;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.JBPMECoreHelper;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.designer.ucd.AbstractClassDiagramProfileImpl;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.SMMEdge;
import org.jbpm.smm.dd.smmdi.SMMShape;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Characteristic;
import org.omg.smm.CountingMeasure;
import org.omg.smm.GradeInterval;
import org.omg.smm.GradeMeasure;
import org.omg.smm.Interval;
import org.omg.smm.Measure;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.NamedMeasure;
import org.omg.smm.RankingInterval;
import org.omg.smm.RankingMeasure;
import org.omg.smm.SMMFactory;
import org.omg.smm.SmmElement;
import org.omg.smm.util.SMMSwitch;

public class MeasureLibraryJsonToEmfHelper extends SMMSwitch<Object> implements JsonToEmfHelper {
    public static final String CMMNTYPES_PATHMAP = "pathmap://jbpm-cmmn/libraries/cmmntypes.uml";
    private ShapeMap shapeMap;
    protected Shape sourceShape;
    private MeasureLibrary owningLibrary;
    private LinkedStencil currentStencil;
    private Map<SmmElement, NamedElement> smmUmlElementMap = new HashMap<SmmElement, NamedElement>();
    private Package umlPackage;
    private Package cmmnTypes;

    public MeasureLibraryJsonToEmfHelper(ShapeMap resource) {
        this.shapeMap = resource;
    }

    public void refineEmfElements(LinkedStencil sv, Shape sourceShape) {
        this.sourceShape = sourceShape;
        this.currentStencil = sv;
        super.doSwitch(shapeMap.getModelElement(sourceShape.getResourceId()));
    }

    public SMMDiagram prepareEmfDiagram(Diagram json, XMLResource result) {
        SMMDiagram smmDiagram = SMMDIFactory.eINSTANCE.createSMMDiagram();
        owningLibrary = SMMFactory.eINSTANCE.createMeasureLibrary();
        result.getContents().add(owningLibrary);
        result.setID(owningLibrary, json.getResourceId());
        smmDiagram.setSmmElement(owningLibrary);
        owningLibrary.getOwnedDiagram().add(smmDiagram);
        this.cmmnTypes = AbstractClassDiagramProfileImpl.getCmmnTypes(result.getResourceSet());
        this.umlPackage = UMLFactory.eINSTANCE.createPackage();
        this.umlPackage.setName(json.getProperty("name"));
        result.getContents().add(this.umlPackage);
        return smmDiagram;
    }

    @Override
    public Object caseGradeMeasure(GradeMeasure object) {
        addEnumeration(object);
        return super.caseGradeMeasure(object);
    }

    @Override
    public Object caseGradeInterval(GradeInterval object) {
        addLiteral(object);
        return super.caseGradeInterval(object);
    }

    @Override
    public Object caseRankingMeasure(RankingMeasure object) {
        addEnumeration(object);
        return super.caseRankingMeasure(object);
    }
    @Override
    public Object caseCountingMeasure(CountingMeasure object) {
        return super.caseCountingMeasure(object);
    }

    @Override
    public Object caseNamedMeasure(NamedMeasure object) {
        return super.caseNamedMeasure(object);
    }

    private void addEnumeration(Measure object) {
        Enumeration enumeration = this.<Enumeration> syncUmlElement(object, UMLPackage.eINSTANCE.getEnumeration());
        if (enumeration.getOwnedAttributes().isEmpty()) {
            enumeration.getOwnedAttribute("minimumOpen", cmmnTypes.getOwnedType("Boolean"), false, UMLPackage.eINSTANCE.getProperty(), true);
            enumeration.getOwnedAttribute("maximumOpen", cmmnTypes.getOwnedType("Boolean"), false, UMLPackage.eINSTANCE.getProperty(), true);
            enumeration.getOwnedAttribute("maximumEndpoint", cmmnTypes.getOwnedType("Double"), false, UMLPackage.eINSTANCE.getProperty(), true);
            enumeration.getOwnedAttribute("minimumEndpoint", cmmnTypes.getOwnedType("Double"), false, UMLPackage.eINSTANCE.getProperty(), true);
            if (object instanceof RankingMeasure) {
                enumeration.getOwnedAttribute("value", cmmnTypes.getOwnedType("Double"), false, UMLPackage.eINSTANCE.getProperty(), true);
            }
            umlPackage.getOwnedTypes().add(enumeration);
        }
    }

    @Override
    public Object caseRankingInterval(RankingInterval object) {
        addLiteral(object);
        return super.caseRankingInterval(object);
    }

    private void addLiteral(Interval object) {
        Enumeration en = (Enumeration) smmUmlElementMap.get(object.eContainer());
        EnumerationLiteral lit = syncUmlElement(object, UMLPackage.eINSTANCE.getEnumerationLiteral());
        if (!en.getOwnedLiterals().contains(en)) {
            en.getOwnedLiterals().add(lit);
        }
        setBooleanSlot(lit, "minimumOpen", object.getMinimumOpen());
        setBooleanSlot(lit, "maximumOpen", object.getMaximumOpen());
        setDoubleSlot(lit, "maximumEndpoint", object.getMaximumEndpoint());
        setDoubleSlot(lit, "minimumEndpoint", object.getMinimumEndpoint());
        if (object instanceof RankingInterval) {
            setDoubleSlot(lit, "value", ((RankingInterval) object).getValue());
        }
    }

    private void setBooleanSlot(EnumerationLiteral lit, String name, Boolean val) {
        Slot slot = findOrCreateSlot(lit, name);
        LiteralBoolean boolValue = UMLFactory.eINSTANCE.createLiteralBoolean();
        boolValue.setValue(Boolean.TRUE.equals(val));
        slot.getValues().add(boolValue);
    }

    private void setDoubleSlot(EnumerationLiteral lit, String name, Double val) {
        Slot slot = findOrCreateSlot(lit, name);
        if (val != null) {
            OpaqueExpression exp = UMLFactory.eINSTANCE.createOpaqueExpression();
            exp.getLanguages().add("java");
            exp.getBodies().add(val.toString());
            slot.getValues().add(exp);
        } else {
            slot.getValues().add(UMLFactory.eINSTANCE.createLiteralNull());
        }
    }

    private Slot findOrCreateSlot(EnumerationLiteral lit, String name) {
        Slot slot = null;
        for (Slot s : lit.getSlots()) {
            if (s.getDefiningFeature().getName().equals(name)) {
                slot = s;
                slot.getValues().clear();
                break;
            }
        }
        if (slot == null) {
            slot = UMLFactory.eINSTANCE.createSlot();
            slot.setDefiningFeature(lit.getEnumeration().getOwnedAttribute(name, null));
            lit.getSlots().add(slot);
        }
        return slot;
    }

    private <T extends NamedElement> T syncUmlElement(SmmElement object, EClass type) {
        NamedElement cls = this.smmUmlElementMap.get(object);
        if (cls == null) {
            cls = (NamedElement) UMLFactory.eINSTANCE.create(type);
            cls.createEAnnotation(MeasureLibraryStencil.MEAS_URI).getReferences().add(object);
            XMLResource r = (XMLResource) umlPackage.eResource();
            r.setID(cls, JBPMECoreHelper.getID(object) + "MEAS");
            this.smmUmlElementMap.put(object, cls);
        }
        cls.setName(object.getName());
        return (T) cls;
    }

    public Object caseMeasure(Measure m) {
        if (m.getTrait() == null) {
            // Probably always null
            Characteristic ch = SMMFactory.eINSTANCE.createCharacteristic();
            ch.setName(m.getName());
            owningLibrary.getMeasureElements().add(ch);
            // NB!!! need to keep it static
            shapeMap.getResource().setID(ch, shapeMap.getId(m) + "trait");
            m.setTrait(ch);
        }
        return super.caseMeasure(m);
    }

    public DiagramElement createElements(Shape shape) {
        DiagramElement de = MeasureLibraryStencil.createDiagramElement(shape.getStencilId());
        SmmElement el = MeasureLibraryStencil.createElement(shape.getStencilId());
        if (de instanceof SMMShape) {
            ((SMMShape) de).setSmmElement((SmmElement) el);
        } else if (de instanceof SMMEdge) {
            ((SMMEdge) de).setSmmElement((SmmElement) el);
        }
        de.setLocalStyle(SMMDIFactory.eINSTANCE.createSMMStyle());
        return de;
    }

    @Override
    public EObject create(EClass eType) {
        return SMMFactory.eINSTANCE.create(eType);
    }

    @Override
    public Object convertFromString(LinkedProperty property, String string, java.lang.Class<?> targetType) {
        return null;
    }

    @Override
    public void postprocessResource() {
    }

}
