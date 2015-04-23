package org.jbpm.designer.vdml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.impl.DefaultPotentialReferenceHelper;
import org.json.JSONObject;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.Measure;
import org.omg.smm.RescaledMeasure;
import org.omg.smm.RescaledMeasureRelationship;
import org.omg.vdml.Activity;
import org.omg.vdml.Assignment;
import org.omg.vdml.Collaboration;
import org.omg.vdml.DelegationContext;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;
import org.omg.vdml.PortContainer;
import org.omg.vdml.Role;
import org.omg.vdml.ValueAdd;
import org.omg.vdml.ValueElement;
import org.omg.vdml.ValueProposition;
import org.omg.vdml.ValuePropositionComponent;

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
            if ("valueElementAggregatedFrom".equals(filter)) {
                return toEobjectReferenceJson(findPotentialAggregatedFrom(req));
            } else if ("valueElementAggregatedTo".equals(filter)) {
                return toEobjectReferenceJson(findPotentialAggregatedTo(req));
            } else if ("valueElementMeasure".equals(filter)) {
                return toEobjectReferenceJson(findPotentialMeasure(req));
            } else if ("activitiesInCollaboration".equals(filter)) {
                return toEobjectReferenceJson(findActivitiesInCollaboration(req));
            }
        }
        return null;
    }

    protected JSONObject toEobjectReferenceJson(List<? extends EObject> results) {
        return toEobjectReferenceJson(results, "name");
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
        ValueElement ve = (ValueElement) getSourceElement(req);
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
            for (RescaledMeasureRelationship rel: rm.getRescalesFrom()) {
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
