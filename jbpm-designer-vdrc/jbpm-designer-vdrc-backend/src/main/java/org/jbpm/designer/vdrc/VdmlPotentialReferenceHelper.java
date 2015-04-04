package org.jbpm.designer.vdrc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.emf.util.DefaultPotentialReferenceHelper;
import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.repository.UriUtils;
import org.jbpm.designer.util.Utils;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.omg.smm.BaseNMeasureRelationship;
import org.omg.smm.BinaryMeasure;
import org.omg.smm.CollectiveMeasure;
import org.omg.smm.Measure;
import org.omg.smm.RescaledMeasure;
import org.omg.vdml.Activity;
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

    public VdmlPotentialReferenceHelper(IEmfDiagramProfile profile) {
        super(profile);
    }

    @Override
    public String findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception {
        String result = super.findPotentialReferences(req, action, processId);
        if (result == null) {
            String filter = req.getParameter("filter");
            if ("valueElementAggregatedFrom".equals(filter)) {
                List<? extends EObject> results = findPotentialAggregatedFrom(req);
                result = toEobjectReferenceJson(results, "name").toString();
            } else if ("valueElementAggregatedTo".equals(filter)) {
                List<? extends EObject> results = findPotentialAggregatedTo(req);
                result = toEobjectReferenceJson(results, "name").toString();
            } else if ("valueElementMeasure".equals(filter)) {
                List<? extends EObject> results = findPotentialMeasure(req);
                result = toEobjectReferenceJson(results, "name").toString();
            }
        }
        return result;
    }

    private List<? extends EObject> findPotentialMeasure(HttpServletRequest req) throws Exception {
        String sourceElementId = req.getParameter("sourceElementId");
        Collaboration collaboration = getCollaborationInScope(req);
        ValueElement ve = (ValueElement) collaboration.eResource().getEObject(sourceElementId);
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
            if(rm.getRescalesFrom()!=null){
                results.add(rm.getRescalesFrom().getFromDimensionalMeasure());
            }
        }else{
            //TODO Ranking measure, 
        }
    }

    private Collaboration getCollaborationInScope(HttpServletRequest req) throws Exception {
        String assetContent = UriUtils.decode(Utils.getEncodedParam(req, "json"));
        String assetId = Utils.getEncodedParam(req, "assetid");
        XMLResource res = (XMLResource) profile.createMarshaller(EMFVFSURIConverter.toPlatformResourceURI(assetId)).getResource(assetContent, "");
        return VdmlHelper.getCollaboration(res);
    }

    private List<ValueElement> findPotentialAggregatedFrom(HttpServletRequest req) throws Exception {
        String sourceElementId = req.getParameter("sourceElementId");
        Collaboration collaboration = getCollaborationInScope(req);
        ValueElement ve = (ValueElement) collaboration.eResource().getEObject(sourceElementId);
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
        String sourceElementId = req.getParameter("sourceElementId");
        Collaboration collaboration = getCollaborationInScope(req);
        ValueElement ve = (ValueElement) collaboration.eResource().getEObject(sourceElementId);
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
                addPropositionComponents(results, childActivity.getPerformingRole());
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
