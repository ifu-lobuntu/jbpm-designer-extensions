package org.jbpm.designer.meas;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.JsonToEmfHelper;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedProperty;
import org.jbpm.designer.extensions.stencilset.linkage.LinkedStencil;
import org.jbpm.smm.dd.smmdi.SMMDIFactory;
import org.jbpm.smm.dd.smmdi.SMMDiagram;
import org.jbpm.smm.dd.smmdi.SMMEdge;
import org.jbpm.smm.dd.smmdi.SMMShape;
import org.omg.dd.di.DiagramElement;
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.smm.MeasureLibrary;
import org.omg.smm.SMMFactory;
import org.omg.smm.SmmElement;
import org.omg.smm.util.SMMSwitch;

public class MeasureLibraryJsonToEmfHelper extends SMMSwitch<Object> implements JsonToEmfHelper {
    private ShapeMap shapeMap;
    protected Shape sourceShape;
    private MeasureLibrary owningLibrary;
    private LinkedStencil currentStencil;

    public MeasureLibraryJsonToEmfHelper(ShapeMap resource) {
        this.shapeMap = resource;
    }

    public void doSwitch(LinkedStencil sv, Shape sourceShape) {
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
        return smmDiagram;
    }

    public Object caseMeasure(Measure m) {
        if (m.getTrait() == null) {
            Characteristic ch = SMMFactory.eINSTANCE.createCharacteristic();
            ch.setName(m.getName());
            owningLibrary.getMeasureElements().add(ch);
            shapeMap.getResource().setID(ch, EcoreUtil.generateUUID());
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
    public Object convertFromString(LinkedProperty property, String string, Class<?> targetType) {
        return null;
    }

    @Override
    public void postprocessResource() {
    }

}
