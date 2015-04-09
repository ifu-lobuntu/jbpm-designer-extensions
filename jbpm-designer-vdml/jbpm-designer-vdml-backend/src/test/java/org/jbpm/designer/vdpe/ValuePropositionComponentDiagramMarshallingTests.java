package org.jbpm.designer.vdpe;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.diagram.Diagram;
import org.jbpm.designer.extensions.diagram.Shape;
import org.jbpm.designer.vdml.VdmlHelper;
import org.junit.Test;
import org.omg.smm.Characteristic;
import org.omg.smm.Measure;
import org.omg.smm.SMMFactory;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Role;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueDeliveryModel;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;

public class ValuePropositionComponentDiagramMarshallingTests extends AbstractVdpeDiagramMarshallingTest {

    @Test
    public void testAggregatedTo() throws Exception {
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        Activity role1Activity = addActivity(role1, false);
        OutputPort op = addOutputPort(role1Activity, "port1");
        ValueAdd va1 = VDMLFactory.eINSTANCE.createValueAdd();
        va1.setName("SomeValueAdd1");
        op.getValueAdd().add(va1);
        ValueAdd va2 = VDMLFactory.eINSTANCE.createValueAdd();
        va2.setName("SomeValueAdd2");
        op.getValueAdd().add(va2);
        ValueProposition valueProposition = addValueProposition(role1, role2);
        ValuePropositionComponent valuePropositionComponent = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        valuePropositionComponent.setName("Component1");
        valueProposition.getComponent().add(valuePropositionComponent);
        valuePropositionComponent.getAggregatedFrom().add(va1);
        valuePropositionComponent.getAggregatedFrom().add(va2);
        addShapeFor(valueProposition, valuePropositionComponent);
        addEdge(null, role1, valueProposition);
        addEdge(null, valueProposition, role2);
        saveCollaborationResource();
        assertOutputValid();
        Diagram diagram = unmarshaller.convert(diagramResource);
        Shape vpShape = diagram.findChildShapeById(valuePropositionComponent.getId());
        String aggregatedFromStringValue=vpShape.getProperty("aggregatedFrom");
        vpShape.putProperty("aggregatedFrom", "");
        XMLResource foundResource = marshaller.convert(diagram);
        ValueDeliveryModel vdm = (ValueDeliveryModel) foundResource.getContents().get(0);
        ValuePropositionComponent found = (ValuePropositionComponent) vdm.getDiagram().get(0).getVdmlElement().eResource()
                .getEObject(valuePropositionComponent.getId());
        assertTrue(found.getAggregatedFrom().isEmpty());
        vpShape.putProperty("aggregatedFrom", aggregatedFromStringValue);
        foundResource = marshaller.convert(diagram);
        vdm = (ValueDeliveryModel) foundResource.getContents().get(0);
        found = (ValuePropositionComponent) vdm.getDiagram().get(0).getVdmlElement().eResource()
                .getEObject(valuePropositionComponent.getId());
        assertEquals(2, found.getAggregatedFrom().size());
    }
    @Test
    public void testDeletion() throws Exception {
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        ValueProposition valueProposition = addValueProposition(role1, role2);
        ValuePropositionComponent valuePropositionComponent1 = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        valuePropositionComponent1.setName("Component1");
        valueProposition.getComponent().add(valuePropositionComponent1);
        addShapeFor(valueProposition, valuePropositionComponent1);
        ValuePropositionComponent valuePropositionComponent2 = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        valuePropositionComponent2.setName("Component2");
        valueProposition.getComponent().add(valuePropositionComponent2);
        addShapeFor(valueProposition, valuePropositionComponent2);
        addEdge(null, role1, valueProposition);
        addEdge(null, valueProposition, role2);
        saveCollaborationResource();
        assertOutputValid();
        Diagram diagram = unmarshaller.convert(diagramResource);
        Shape vpShape = diagram.findChildShapeById(valueProposition.getId());
        vpShape.deleteShape(vpShape.findChildShapeById(valuePropositionComponent2.getId()));
        XMLResource foundResource = marshaller.convert(diagram);
        Collaboration foundCollaboration = VdmlHelper.getCollaboration(foundResource);
        assertNotNull(foundCollaboration.eResource().getEObject(valuePropositionComponent1.getId()));
        assertNull(foundCollaboration.eResource().getEObject(valuePropositionComponent2.getId()));
    }
    @Test
    public void testValueMeasure() throws Exception {
        Role role1 = addRole("MyRole", true);
        Role role2 = addRole("YourRole", true);
        ValueProposition valueProposition = addValueProposition(role1, role2);
        ValuePropositionComponent valuePropositionComponent = VDMLFactory.eINSTANCE.createValuePropositionComponent();
        valuePropositionComponent.setName("Component1");
        valueProposition.getComponent().add(valuePropositionComponent);
        addShapeFor(valueProposition, valuePropositionComponent);
        addEdge(null, role1, valueProposition);
        addEdge(null, valueProposition, role2);
        createMeasureCharacteristic("Motion");
        valuePropositionComponent.setValueMeasurement(createMeasureCharacteristic("Size"));
        saveMeasureLibraryResource();
        saveCollaborationResource();
        saveDiagramResource();
        Diagram diagram = unmarshaller.convert(diagramResource);
        Shape vpShape = diagram.findChildShapeById(valuePropositionComponent.getId());
        String valueMeasureStringValue=vpShape.getProperty("valueMeasure");
        assertTrue(valueMeasureStringValue.indexOf("SizeMeasure")>=0);
        vpShape.putProperty("valueMeasure", valueMeasureStringValue.replaceAll("Size", "Motion"));
        
        XMLResource foundResource = marshaller.convert(diagram);
        ValueDeliveryModel vdm = (ValueDeliveryModel) foundResource.getContents().get(0);
        ValuePropositionComponent found = (ValuePropositionComponent) vdm.getDiagram().get(0).getVdmlElement().eResource()
                .getEObject(valuePropositionComponent.getId());
        assertEquals("Motion",found.getValueMeasurement().getCharacteristicDefinition().getName());
        assertEquals("MotionMeasure",found.getValueMeasurement().getCharacteristicDefinition().getMeasure().get(0).getName());
    }
    protected MeasuredCharacteristic createMeasureCharacteristic(String value) {
        Characteristic characteristic = SMMFactory.eINSTANCE.createCharacteristic();
        characteristic.setName(value);
        measureLibrary.getMeasureElements().add(characteristic);
        Measure measure= SMMFactory.eINSTANCE.createDirectMeasure();
        measure.setName(value +"Measure");
        measureLibrary.getMeasureElements().add(measure);
        characteristic.getMeasure().add(measure);
        MeasuredCharacteristic measureCharacteristic=VDMLFactory.eINSTANCE.createMeasuredCharacteristic();
        measureCharacteristic.setCharacteristicDefinition(characteristic);
        return measureCharacteristic;
    }
}
