package org.jbpm.vdml.services.impl;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import org.geotools.geometry.jts.JTSFactoryFinder;
import org.jbpm.vdml.services.api.model.ReusableBusinessItemAvailability;
import org.jbpm.vdml.services.api.model.ReusableBusinessItemRequirement;
import org.jbpm.vdml.services.impl.model.meta.Capability;
import org.jbpm.vdml.services.impl.model.meta.Collaboration;
import org.jbpm.vdml.services.impl.model.runtime.*;
import org.jbpm.vdml.services.impl.model.scheduling.PlannedUnavailability;
import org.jbpm.vdml.services.impl.scheduling.Booking;
import org.jbpm.vdml.services.impl.scheduling.BookingSolution;
import org.jbpm.vdml.services.impl.scheduling.ScheduleSlot;
import org.jbpm.vdml.services.impl.scheduling.SchedulingUtil;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * As a consumer/supplier, I would like to exchange value with another in order to gain a benefit from the network. Isolated exchanges based on a single Store, Pool or Capability
 */
public class ExchangeService extends AbstractRuntimeService {
    private CollaborationService collaborationService;

    public ExchangeService() {
    }

    public ExchangeService(EntityManager em) {
        super(em);
        this.collaborationService = new CollaborationService(em);
    }

    public void commitToExchange(Long collaborationId) {
        MilestoneObservation mo = findExchangeMilestone(collaborationId);
        collaborationService.commitToMilestone(mo);
    }

    public void scheduleExchange(Long collaborationId) {
        //???
    }

    public void fulfillExchange(Long collaborationId) {
        MilestoneObservation mo = findExchangeMilestone(collaborationId);
        collaborationService.fulfillMilestone(mo);
    }

    protected MilestoneObservation findExchangeMilestone(Long collaborationId) {
        CollaborationObservation collaborationObservation = entityManager.find(CollaborationObservation.class, collaborationId);
        MilestoneObservation mo = null;
        Collection<DirectlyExchangable> offer = new ArrayList<DirectlyExchangable>();
        offer.addAll(collaborationObservation.getStoresUsed());
        offer.addAll(collaborationObservation.getCapabilityOffersUsed());
        for (DirectlyExchangable ao : offer) {
            ExchangeConfiguration ec = ao.getExchangeConfiguration();
            if (ec != null && ec.getCollaborationToUse().equals(collaborationObservation.getCollaboration())) {
                if (ao.getSupplier().equals(collaborationObservation.findRole(ec.getSupplierRole()).getParticipant())) {
                    mo = collaborationObservation.findMilestone(ec.getExchangeMilestone());
                    break;
                }
            }
        }
        return mo;
    }

    public CollaborationObservation startExchangeForService(Long requestorId, Long capabilityPerformanceId) {
        CapabilityPerformance cp = entityManager.find(CapabilityPerformance.class, capabilityPerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        Capability cpd = cp.getCapability();
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, cpd.getExchangeConfiguration().getCollaborationToUse().getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getParticipant(), cpd.getExchangeConfiguration().getSupplierRole());
        return collaborationService.startCollaboration(cpd.getExchangeConfiguration().getCollaborationToUse(), Arrays.asList(requestorRolePerformance, supplierRolePerformance));
    }

    public CollaborationObservation startExchangeForProduct(Long requestorId, Long storePerformanceId) {
        StorePerformance cp = entityManager.find(StorePerformance.class, storePerformanceId);
        Participant participant = entityManager.find(Participant.class, requestorId);
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, cp.getStoreDefinition().getExchangeConfiguration().getCollaborationToUse().getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getOwner(), cp.getStoreDefinition().getExchangeConfiguration().getSupplierRole());
        return collaborationService.startCollaboration(cp.getStoreDefinition().getExchangeConfiguration().getCollaborationToUse(), Arrays.asList(requestorRolePerformance, supplierRolePerformance));
    }
    public ReusableBusinessItemAvailability findAvailability(ReusableBusinessItemRequirement requirement){
//        Query q = entityManager.createQuery("select rbip from ReusableBusinessItemPerformance  rbip where rbip.definition.uri = :businessItemDefinitionId and distance(rbip.address.location ,:to) < :maxDistance order by distance(rbip.address.location ,:to) ");
        Query q = entityManager.createQuery("select rbip from ReusableBusinessItemPerformance  rbip where rbip.definition.uri = :businessItemDefinitionId order by distance(rbip.address.location ,:to) ");
        q.setParameter("businessItemDefinitionId",requirement.getBusinessItemDefinitionId());
//        q.setParameter("maxDistance", LocationUtil.meterToEstimatedDegrees(requirement.getMaxDistanceInMeter()));
        GeometryFactory geometryFactory= JTSFactoryFinder.getGeometryFactory(null);
        Point location = geometryFactory.createPoint(new Coordinate(requirement.getLongitude(), requirement.getLattitude()));
        q.setParameter("to", location);
        List<ReusableBusinessItemPerformance> matches = q.getResultList();
        SchedulingUtil ssc=new SchedulingUtil();
        List<ScheduleSlot> slots = new ArrayList<ScheduleSlot>();
        for (ReusableBusinessItemPerformance match : matches) {
            slots.addAll(ssc.calculate(match, match.getSchedule(), requirement.getNotBefore(), requirement.getNotAfter()));
        }
        SolverFactory solverFactory = SolverFactory.createFromXmlResource("org/jbpm/vdml/services/impl/scheduling/Booking.xml");
        Solver solver = solverFactory.buildSolver();
        BookingSolution booking = new BookingSolution();
        booking.setScheduleSlots(slots);
        Booking problemBooking= new Booking(requirement.getNotBefore(), requirement.getNotAfter(), SchedulingUtil.durationToMillis(requirement.getDuration(), requirement.getDurationTimeUnit()) , location);
        booking.setBookings(Arrays.asList(problemBooking));
        booking.setScheduleSlots(slots);
        solver.solve(booking);
        BookingSolution solution = (BookingSolution) solver.getBestSolution();
        Booking bestBooking = solution.getBookings().get(0);
        Object scheduledObject = bestBooking.getStartScheduleSlot().getScheduledObject();
        return new ReusableBusinessItemAvailability(((RuntimeEntity)scheduledObject).getId(),bestBooking.getStartScheduleSlot().getFrom(),bestBooking.getEndScheduleSlot().getTo());
    }

    public CollaborationObservation scheduleReusableProductUse(Long requestorId, ReusableBusinessItemAvailability requiredAvailability) {
        ReusableBusinessItemPerformance reusableResource = entityManager.find(ReusableBusinessItemPerformance.class, requiredAvailability.getReusableBusinessItemId());
        PoolPerformance cp = reusableResource.getHostingPool();
        Participant participant = entityManager.find(Participant.class, requestorId);
        Collaboration collaboration1 = cp.getStoreDefinition().getExchangeConfiguration().getCollaborationToUse();
        RolePerformance requestorRolePerformance = findOrCreateRole(participant, collaboration1.getInitiatorRole());
        RolePerformance supplierRolePerformance = findOrCreateRole(cp.getOwner(), cp.getStoreDefinition().getExchangeConfiguration().getSupplierRole());
        CollaborationObservation observation = collaborationService.startCollaboration(collaboration1, Arrays.asList(requestorRolePerformance, supplierRolePerformance));
        ActivityObservation ao = observation.findActivity(cp.getStoreDefinition().getExchangeConfiguration().getPoolBooking().getActivity());
        ResourceUseObservation resourceUse = ao.findResourceUse(cp.getStoreDefinition().getExchangeConfiguration().getPoolBooking());
        resourceUse.setFrom(requiredAvailability.getFrom());
        resourceUse.setTo(requiredAvailability.getTo());
        resourceUse.setQuantity(1);
        resourceUse.setReusableResource(reusableResource);
        resourceUse.setPool(cp);
        PlannedUnavailability pu = new PlannedUnavailability(reusableResource.getSchedule());
        pu.setFrom(resourceUse.getFrom());
        resourceUse.setPlannedUnavailability(pu);
        switch(resourceUse.getResourceUse().getResourceUseLocation()){
            case COLLABORATION:
                resourceUse.setAddress(collaboration1.getAddress());
                break;
            case PROVIDING_STORE:
                SupplyingStoreObservation sourcePortContainer = (SupplyingStoreObservation) resourceUse.getInput().getSourcePortContainer();
                resourceUse.setAddress(sourcePortContainer.getStore().getAddress());
                break;
            case RECEIVING_STORE:
                SupplyingStoreObservation targetPortContainer = (SupplyingStoreObservation) resourceUse.getOutput().getTargetPortContainer();
                resourceUse.setAddress(targetPortContainer.getStore().getAddress());
                break;
            case ROLE_PARTICIPANT:
                resourceUse.setAddress(ao.getPerformingRole().getParticipant().getAddress());
                break;
        }
        pu.setAddress(resourceUse.getAddress());
        entityManager.flush();
        return observation;
    }

    public CollaborationObservation findExchange(Long id) {
        return entityManager.find(CollaborationObservation.class, id);
    }
}
