package org.jbpm.designer.vdcm;

import org.junit.Test;
import org.omg.vdml.Activity;
import org.omg.vdml.DeliverableFlow;
import org.omg.vdml.InputDelegation;
import org.omg.vdml.InputPort;
import org.omg.vdml.OrgUnit;
import org.omg.vdml.OutputDelegation;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Pool;
import org.omg.vdml.PortContainer;
import org.omg.vdml.ResourceUse;
import org.omg.vdml.Role;
import org.omg.vdml.Store;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.VdmlElement;

public class CapabilityManagementDiagramMarshallingTest extends AbstractVdcmDiagramMarshallingTest {
    @Test
    public void testValueAdd() throws Exception{
        Role role = VDMLFactory.eINSTANCE.createRole();
        role.setName("myRole");
        role.setDescription("My Role's Description");
        collaboration.getCollaborationRole().add(role);
        addShapeFor(collaboration, role);
        Activity activity1 = VDMLFactory.eINSTANCE.createActivity();
        activity1.setName("MyActivity1");
        activity1.setDescription("My Activity's description");
        role.getPerformedWork().add(activity1);
        collaboration.getActivity().add(activity1);
        addShapeFor(role, activity1);
        ValueAdd valueAdd = VDMLFactory.eINSTANCE.createValueAdd();
        valueAdd.setName("myValueAdd");
        OutputPort op= (OutputPort) activity1.getContainedPort().get(1);
        op.getValueAdd().add(valueAdd);
        addShapeFor(op, valueAdd);
        saveCollaborationResource();
        super.assertOutputValid();
    }
}
