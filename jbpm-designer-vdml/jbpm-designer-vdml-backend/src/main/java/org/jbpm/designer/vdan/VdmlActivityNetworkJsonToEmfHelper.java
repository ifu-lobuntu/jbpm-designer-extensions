package org.jbpm.designer.vdan;

import org.eclipse.emf.common.util.EList;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdml.AbstractVdmlJsonToEmfHelper;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.designer.vdml.VdmlUmlHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.omg.vdml.*;

public class VdmlActivityNetworkJsonToEmfHelper extends AbstractVdmlJsonToEmfHelper {
    public VdmlActivityNetworkJsonToEmfHelper(ShapeMap resource) {
        super(resource, VdmlActivityNetworkStencil.class);
    }

    @Override
    public Object caseCollaboration(Collaboration object) {
        return super.caseCollaboration(object);
    }

    @Override
    public Object caseRole(Role object) {
        owningCollaboration.getActivity().addAll(object.getPerformedWork());
        owningCollaboration.getSupplyingStore().addAll(object.getSupplyingStore());
        return super.caseRole(object);
    }

    @Override
    public Object caseActivity(Activity object) {
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        object.setRecurrenceInterval(buildMeasuredCharacteristic("recurrenceIntervalMeasure"));
        setMeasuredCharacteristics("measures", object.getMeasuredCharacteristic());
        Collaboration delegatedCollaboration= (Collaboration) sourceShape.getUnboundProperty("delegatedCollaboration");
        if(delegatedCollaboration!=null){
            ValueDeliveryModel vdm= VdmlHelper.getValueDeliveryModelIn(object.eResource());
            Scenario scenario = VdmlUmlHelper.findOrCreateDefaultScenario(vdm);
            DelegationContext delegationContext=VdmlHelper.getDefaultDelegationContext(object);
            if(delegationContext==null){
                delegationContext=VDMLFactory.eINSTANCE.createDelegationContext();
                scenario.getDelegationtContext().add(delegationContext);
                delegationContext.setDelegatedActivity(object);
            }
            delegationContext.setContextCollaboration(delegatedCollaboration);
            String roleMappingString= sourceShape.getProperty("roleMappings");
            if(roleMappingString!=null && roleMappingString.trim().length()>0){
                setContextBasedAssignments(delegatedCollaboration, delegationContext, roleMappingString);
            }
            delegationContext.setName(object.getName() + "DelegationContext");
        }
        return super.caseActivity(object);
    }

    protected void setContextBasedAssignments(Collaboration delegatedCollaboration, DelegationContext delegationContext, String roleMappingString) {
        try {
            JSONObject roleMappings=new JSONObject(roleMappingString);
            JSONArray jsonArray = roleMappings.getJSONArray("roleMappings");
            for(int i=0; i < jsonArray.length();i++){
                JSONObject mapping=jsonArray.getJSONObject(i);
                Role fromRole = findRole(owningCollaboration, mapping, "fromRole");
                Role toRole = findRole(delegatedCollaboration, mapping, "toRole");
                Assignment assignment = VDMLFactory.eINSTANCE.createAssignment();
                assignment.setAssignedRole(toRole);
                assignment.setParticipant(fromRole);
                delegationContext.getContextBasedAssignment().add(assignment);
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    protected Role findRole(Collaboration delegatedCollaboration, JSONObject mapping, String roleType2) throws JSONException {
        Role toRole=null;
        EList<Role> collaborationRole2 = delegatedCollaboration.getCollaborationRole();
        for (Role role : collaborationRole2) {
            if(role.getName().equals(mapping.getString(roleType2))){
                toRole=role;
                break;
            }
        }
        return toRole;
    }

    @Override
    public Object casePool(Pool object) {
        return super.casePool(object);
    }

    @Override
    public Object caseSupplyingPool(SupplyingPool object) {
        return super.caseSupplyingPool(object);
    }

    @Override
    public Object caseSupplyingStore(SupplyingStore object) {
        setMeasuredCharacteristics("measures", object.getMeasuredCharacteristic());
        return super.caseSupplyingStore(object);
    }

    @Override
    public Object caseValueAdd(ValueAdd object) {
        object.setValueMeasurement(buildMeasuredCharacteristic("valueMeasure"));
        setMeasuredCharacteristics("measures", object.getMeasuredCharacteristic());
        return super.caseValueAdd(object);
    }

    @Override
    public Object caseStore(Store object) {
        return super.caseStore(object);
    }

    @Override
    public Object caseResourceUse(ResourceUse object) {
        Activity a = (Activity) object.getDeliverable().eContainer();
        a.getResourceUse().add(object);
        object.setQuantity(buildMeasuredCharacteristic("quantityMeasure"));
        object.setPlanningPercentage(buildMeasuredCharacteristic("planningPercentageMeasure"));
        setMeasuredCharacteristics("measures", object.getMeasuredCharacteristic());
        return super.caseResourceUse(object);
    }

    @Override
    public Object caseDeliverableFlow(DeliverableFlow object) {
        object.setDuration(buildMeasuredCharacteristic("durationMeasure"));
        object.setDeliverable(buildBusinessItem("deliverableDefinition"));
        return super.caseDeliverableFlow(object);
    }

    @Override
    public Object caseInputDelegation(InputDelegation object) {
        return super.caseInputDelegation(object);
    }

    @Override
    public Object caseOutputDelegation(OutputDelegation object) {
        return super.caseOutputDelegation(object);
    }

    @Override
    public Object casePort(Port object) {
        object.setBatchSize(buildMeasuredCharacteristic("batchSizeMeasure"));
        object.setPlanningPercentage(buildMeasuredCharacteristic("planningPercentageMeasure"));
        object.setOffset(buildMeasuredCharacteristic("offsetMeasure"));
        if (object.eResource() == null) {
            if (sourceShape.getStencilId().equals(VdmlActivityNetworkStencil.COLLABORATION_INPUT_PORT.getStencilId()) || sourceShape.getStencilId().equals(VdmlActivityNetworkStencil.COLLABORATION_OUTPUT_PORT.getStencilId())) {
                owningCollaboration.getContainedPort().add(object);
            }
        }
        setMeasuredCharacteristics("measures", object.getMeasuredCharacteristic());
        if (object.eResource() != null) {
            object.eResource().setModified(true);//for stores
            VDMLShape shape = (VDMLShape) shapeMap.getDiagramElement(sourceShape).eContainer();
            if (shape.getVdmlElement() instanceof Role) {
                object.setHandler((Role) shape.getVdmlElement());
            }
        }
        return super.casePort(object);
    }

    @Override
    public Object caseInputPort(InputPort object) {
        InputPort dp=(InputPort) sourceShape.getUnboundProperty("delegatedPort");
        if(dp!=null){
            InputDelegation delegation = VdmlHelper.getDefaultDelegation(object);
            if(delegation==null) {
                DelegationContext dc = VdmlHelper.getDefaultDelegationContext((Activity) object.eContainer());
                delegation=VDMLFactory.eINSTANCE.createInputDelegation();
                dc.getContextBasedPortDelegation().add(delegation);
                delegation.setSource(object);
            }
            delegation.setTarget(dp);
        }
        return super.caseInputPort(object);
    }

    @Override
    public Object caseOutputPort(OutputPort object) {
        OutputPort dp=(OutputPort) sourceShape.getUnboundProperty("delegatedPort");
        if(dp!=null){
            OutputDelegation delegation = VdmlHelper.getDefaultDelegation(object);
            if(delegation==null) {
                DelegationContext dc = VdmlHelper.getDefaultDelegationContext((Activity) object.eContainer());
                delegation=VDMLFactory.eINSTANCE.createOutputDelegation();
                dc.getContextBasedPortDelegation().add(delegation);
                delegation.setTarget(object);
            }
            delegation.setSource(dp);
        }
        return super.caseOutputPort(object);
    }

    @Override
    protected VDMLDiagramElement createDiagramElement(String stencilId) {
        return VdmlActivityNetworkStencil.createDiagramElement(stencilId);
    }

    @Override
    protected VdmlElement createElement(String stencilId) {
        VdmlActivityNetworkStencil stencil = VdmlActivityNetworkStencil.findStencilById(stencilId);
        if (stencil != null && stencil.getElementType() != null) {
            return (VdmlElement) super.create(stencil.getElementType());
        } else {
            return null;
        }
    }

}
