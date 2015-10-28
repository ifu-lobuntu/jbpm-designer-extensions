package org.jbpm.designer.vdml;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.impl.DefaultPotentialReferenceHelper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.Measure;
import org.omg.smm.RescaledMeasure;
import org.omg.smm.RescaledMeasureRelationship;
import org.omg.vdml.*;

public class VdmlPotentialReferenceHelper extends DefaultPotentialReferenceHelper {

    public VdmlPotentialReferenceHelper(IEmfProfile profile) {
        super(profile);
    }

    @Override
    public JSONObject findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception {
        String filter = req.getParameter("filter");
        if (isEmpty(filter)) {
            try {
                return super.findPotentialReferences(req, action, processId);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            if ("inScopeMeasures".equals(filter)) {
                return toEobjectReferenceJson(findInScopeMeasures(req, action, processId));
            } else if ("valueElementAggregatedFrom".equals(filter)) {
                return toEobjectReferenceJson(findPotentialAggregatedFrom(req));
            } else if ("valueElementAggregatedTo".equals(filter)) {
                return toEobjectReferenceJson(findPotentialAggregatedTo(req));
            } else if ("valueElementMeasure".equals(filter)) {
                return toEobjectReferenceJson(findPotentialMeasure(req));
            } else if ("activitiesInCollaboration".equals(filter)) {
                return toEobjectReferenceJson(findActivitiesInCollaboration(req));
            } else if ("roleMappings".equals(filter)) {
                Activity activity= getSourceElement(req);
                Map<String,String> mapping = new HashMap<String,String>();
                if(activity.getDelegationContext().size()==1){
                    Collaboration contextCollaboration = activity.getDelegationContext().get(0).getContextCollaboration();
                    if(contextCollaboration!=null){
                        for (Assignment assignment : activity.getDelegationContext().get(0).getContextBasedAssignment()) {
                            mapping.put(assignment.getAssignedRole().getName(), assignment.getParticipant().getName());
                        }
                        for (Role role : contextCollaboration.getCollaborationRole()) {
                            if(!mapping.containsKey(role.getName())){
                                mapping.put(role.getName(), "");
                            }
                        }
                    }
                }
                JSONArray a=new JSONArray();
                for (Map.Entry<String, String> stringStringEntry : mapping.entrySet()) {
                    JSONObject row = new JSONObject();
                    row.put("toRole", stringStringEntry.getKey());
                    row.put("fromRole", stringStringEntry.getValue());
                    a.put(row);
                }
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("roleMappings", a);
                return jsonObject;
            }
        }
        return null;
    }

    protected JSONObject toEobjectReferenceJson(Collection<? extends EObject> results) {
        return toEobjectReferenceJson(results, "name");
    }
    private Collection<? extends EObject> findInScopeMeasures(HttpServletRequest req,String action, String processId ) throws Exception {
        EObject ve = getSourceElement(req);
        IEmfDiagramProfile sourceProfile = getSourceProfile(req);
        if(ve instanceof Activity ){
            //AggregatedMeasures from CapabilityDefinition
            //CalculatedMeasures from ValueAdds
        }else if(ve instanceof OutputPort){
            //CalculatedMeasures from ValueAdds, receiving inputs, other OutputPorts
        }else if(ve instanceof ValueAdd){
            //AggregatedMeasures from ValuePropositionComponent
        }else if(ve instanceof ValuePropositionComponent){
            //Top level scope - no constraints.
        }else if(ve instanceof InputPort){
            //CalculatedMeasures from ValueAdds, other inputs
        }else if(ve instanceof ResourceUse){
        }else if(ve instanceof DeliverableFlow){
        }else if(ve instanceof BusinessItemDefinition || ve instanceof Capability || ve instanceof StoreDefinition ){
            //TODO remember these would be UML Properties
            //Top level scope - no constraints.
        }
        ResourceSet rst = buildResourceSet(req);
        List<String> allPackageNames = getPackagesInScope(req);
        loadApplicableResourcesInto(rst, allPackageNames);
        Collection<EObject> results = findPotentialReferencesIn(req, rst);
        return results;
    }

    /**
     * NB!! Expects calling EObjects to have a "vdmlElement" feature
     *
     * @param req
     * @return
     * @throws Exception
     */
    private List<? extends EObject> findActivitiesInCollaboration(HttpServletRequest req) throws Exception {
        EObject ve = getSourceElement(req);
        IEmfDiagramProfile sourceProfile = getSourceProfile(req);
        String vdmlElementBinding = req.getParameter("vdmlElementBinding");
        Object vdmlElement = null;
        EObject parent = ve;
        while (!(vdmlElement instanceof Collaboration || parent == null)) {
            vdmlElement = getValue(sourceProfile, parent, vdmlElementBinding);
            parent = parent.eContainer();
        }
        if (vdmlElement instanceof Collaboration) {
            return ((Collaboration) vdmlElement).getActivity();
        } else {
            return Collections.emptyList();
        }
    }

    private List<? extends EObject> findPotentialMeasure(HttpServletRequest req) throws Exception {
        ValueElement ve = getSourceElement(req);
        List<Measure> results = new ArrayList<Measure>();
        for (ValueElement valueElement : ve.getAggregatedTo()) {
            if (valueElement.getValueMeasurement() != null && valueElement.getValueMeasurement().getCharacteristicDefinition() != null) {
                for (Measure measure : valueElement.getValueMeasurement().getCharacteristicDefinition().getMeasure()) {
                    addAllSubMeasures(results, measure);
                }
            }
        }
        return results;
    }

    private void addAllSubMeasures(List<Measure> results, Measure measure) {
        if (measure instanceof CollectiveMeasure) {
            for (BaseNMeasureRelationship r : ((CollectiveMeasure) measure).getBaseMeasureTo()) {
                results.add(r.getToDimensionalMeasure());
            }
        } else if (measure instanceof BinaryMeasure) {
            BinaryMeasure bm = (BinaryMeasure) measure;
            if (bm.getBaseMeasure1To() != null) {
                results.add(bm.getBaseMeasure1To().getToDimensionalMeasure());
            }
            if (bm.getBaseMeasure2To() != null) {
                results.add(bm.getBaseMeasure2To().getToDimensionalMeasure());
            }
        } else if (measure instanceof RescaledMeasure) {
            RescaledMeasure rm = (RescaledMeasure) measure;
            for (RescaledMeasureRelationship rel : rm.getRescalesFrom()) {
                results.add(rel.getFromDimensionalMeasure());
            }
        } else {
            // TODO Ranking measure,
        }
    }

    private List<ValueElement> findPotentialAggregatedFrom(HttpServletRequest req) throws Exception {
        ValueElement ve = (ValueElement) getSourceElement(req);
        if (ve instanceof ValueAdd) {
            if (ve.eContainer().eContainer() instanceof Collaboration) {
                List<ValueElement> results = new ArrayList<ValueElement>();
                Collaboration parentCollaboration = (Collaboration) ve.eContainer().eContainer();
                addValueAdds(results, parentCollaboration);
                addPropositionComponents(results, parentCollaboration);
                return results;
            } else if (ve.eContainer().eContainer() instanceof Activity) {
                List<ValueElement> results = new ArrayList<ValueElement>();
                Activity parentActivity = (Activity) ve.eContainer().eContainer();
                for (DelegationContext dc : parentActivity.getDelegationContext()) {
                    addValueAdds(results, dc.getContextCollaboration());
                }
                return results;
            }
        } else if (ve instanceof ValuePropositionComponent) {
            Role responsibleRole = ((ValueProposition) ve.eContainer()).getProvider();
            List<ValueElement> results = new ArrayList<ValueElement>();
            if (responsibleRole != null) {
                for (Activity activity : responsibleRole.getPerformedWork()) {
                    addValueAdds(results, activity);
                }
                for (Assignment as : responsibleRole.getAssignment()) {
                    if (as.eContainer() instanceof Collaboration && as.getAssignedRole() != null) {
                        for (Activity activity : as.getAssignedRole().getPerformedWork()) {
                            addValueAdds(results, activity);
                        }
                    }
                }
            }
            return results;
        }
        return Collections.emptyList();
    }

    private void addPropositionComponents(List<ValueElement> results, Collaboration parentCollaboration) {
        for (Role role : parentCollaboration.getCollaborationRole()) {
            addPropositionComponents(results, role);
        }
    }

    private void addPropositionComponents(List<ValueElement> results, Role role) {
        if (role != null) {
            for (ValueProposition vp : role.getProvidedProposition()) {
                results.addAll(vp.getComponent());
            }
        }
    }

    private void addValueAdds(List<ValueElement> results, PortContainer pc) {
        for (Port port : pc.getContainedPort()) {
            if (port instanceof OutputPort) {
                results.addAll(((OutputPort) port).getValueAdd());
            }
        }
    }

    private List<ValueElement> findPotentialAggregatedTo(HttpServletRequest req) throws Exception {
        ValueElement ve = (ValueElement) getSourceElement(req);
        if (ve instanceof ValueAdd) {
            if (ve.eContainer().eContainer() instanceof Collaboration) {
                List<ValueElement> results = new ArrayList<ValueElement>();
                Collaboration child = (Collaboration) ve.eContainer().eContainer();
                for (DelegationContext dc : child.getDelegationContext()) {
                    addValueAdds(results, dc.getDelegatedActivity());
                }
                return results;
            } else if (ve.eContainer().eContainer() instanceof Activity) {
                List<ValueElement> results = new ArrayList<ValueElement>();
                Activity childActivity = (Activity) ve.eContainer().eContainer();
                Collaboration parentCollaboration = (Collaboration) childActivity.eContainer();
                addValueAdds(results, parentCollaboration);
                Role responsibleRole = childActivity.getPerformingRole();
                addPropositionComponents(results, responsibleRole);
                for (Assignment ass : responsibleRole.getRoleAssignment()) {
                    if (ass.eContainer() instanceof Collaboration && ass.getParticipant() instanceof Role) {
                        Role assignedTo = (Role) ass.getParticipant();
                        addPropositionComponents(results, assignedTo);
                    }
                }
                return results;
            }
        } else if (ve instanceof ValuePropositionComponent) {
            Role responsibleRole = ((ValueProposition) ve.eContainer()).getProvider();
            List<ValueElement> results = new ArrayList<ValueElement>();
            if (responsibleRole != null) {
                Collaboration parentCollaboration = (Collaboration) responsibleRole.eContainer();
                addValueAdds(results, parentCollaboration);
            }
            return results;
        }
        return Collections.emptyList();
    }
}
