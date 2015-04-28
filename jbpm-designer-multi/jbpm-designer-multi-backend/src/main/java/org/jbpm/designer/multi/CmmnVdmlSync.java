package org.jbpm.designer.multi;

import org.jbpm.cmmn.dd.cmmndi.CMMNDIFactory;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagram;
import org.jbpm.cmmn.dd.cmmndi.CMMNDiagramElement;
import org.jbpm.cmmn.dd.cmmndi.CMMNShape;
import org.jbpm.cmmn.jbpmext.JbpmextPackage;
import org.jbpm.designer.extensions.util.ShapeLayoutHelper;
import org.jbpm.designer.vdml.VdmlHelper;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.jbpm.vdml.dd.vdmldi.VDMLShape;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TPlanItem;
import org.omg.cmmn.util.CMMNResourceImpl;
import org.omg.cmmn.util.ImportHelper;
import org.omg.dd.dc.Bounds;
import org.omg.dd.dc.DCFactory;
import org.omg.vdml.Activity;
import org.omg.vdml.Collaboration;
import org.omg.vdml.util.VDMLResourceImpl;

public class CmmnVdmlSync {
    public void sync(CMMNResourceImpl cmmnResource, VDMLResourceImpl vdanResource) {
        TDefinitions defs = ImportHelper.getDefinitions(cmmnResource);
        Collaboration coll = VdmlHelper.getCollaboration(vdanResource);
        VDMLDiagram vdanDiagram = VdmlHelper.getDiagram(vdanResource);
        TCase theCase = syncCase(defs, coll);
        CMMNDiagram theDiagram = ensureDiagramPresent(defs);
        CMMNShape caseShape = ensureShapePresent(theCase, theDiagram);
        for (VDMLDiagramElement vde : vdanDiagram.getOwnedVdmlDiagramElement()) {
            if (vde instanceof Activity) {
                Activity a = (Activity) vde.getVdmlElement();
                TPlanItem thePlanItem = syncPlanItem(theCase, a);
                ensureShapePresent(caseShape, thePlanItem,(VDMLShape) vde);
                //TODO
                //For each business item coming from another activity, create
                //1. An Entry Sentry
                //2. Create A CaseFileItem for the BusinessItem
                //3. Create a TaskParameter
                //4. Create an PlanItemOnPart on complete
                //For each business item coming from another store, create
                //1. Create A CaseFileItem representing the store
                //2. Create a TaskParameter
            }
        }
    }

    protected CMMNDiagram ensureDiagramPresent(TDefinitions defs) {
        CMMNDiagram theDiagram = null;
        for (CMMNDiagram d : defs.getDiagram()) {
            if (defs.equals(d.getCmmnElement())) {
                theDiagram = d;
                break;
            }
        }
        if (theDiagram == null) {
            theDiagram = CMMNDIFactory.eINSTANCE.createCMMNDiagram();
            defs.getDiagram().add(theDiagram);
            theDiagram.setCmmnElement(defs);
        }
        return theDiagram;
    }

    protected CMMNShape ensureShapePresent(TCase theCase, CMMNDiagram theDiagram) {
        CMMNShape caseShape = null;
        for (CMMNDiagramElement de : theDiagram.getOwnedCmmnDiagramElement()) {
            if (de instanceof CMMNShape && theCase.equals(((CMMNShape) de).getCmmnElement())) {
                caseShape = (CMMNShape) de;
                break;
            }
        }
        if (caseShape == null) {
            caseShape = CMMNDIFactory.eINSTANCE.createCMMNShape();
            theDiagram.getOwnedElement().add(caseShape);
            caseShape.setCmmnElement(theCase);
            ShapeLayoutHelper.positionElementOn(theDiagram, caseShape);
        }
        return caseShape;
    }

    protected void ensureShapePresent(CMMNShape caseShape, TPlanItem thePlanItem, VDMLShape vde) {
        CMMNShape thePlanItemShape = null;
        for (CMMNShape s : caseShape.getOwnedShape()) {
            if (thePlanItem.equals(s.getCmmnElement())) {
                thePlanItemShape = s;
                break;
            }
        }
        if (thePlanItemShape == null) {
            thePlanItemShape = CMMNDIFactory.eINSTANCE.createCMMNShape();
            thePlanItemShape.setCmmnElement(thePlanItem);
            caseShape.getOwnedShape().add(thePlanItemShape);
            thePlanItemShape.setLocalStyle(CMMNDIFactory.eINSTANCE.createCMMNStyle());
            Bounds b = DCFactory.eINSTANCE.createBounds();
            b.setHeight(vde.getBounds().getHeight());
            b.setWidth(vde.getBounds().getWidth());
            b.setX(vde.getBounds().getX());
            b.setY(vde.getBounds().getY());
            thePlanItemShape.setBounds(b);
        }
    }

    protected TPlanItem syncPlanItem(TCase theCase, Activity a) {
        TPlanItem thePlanItem = null;
        for (TPlanItem pi : theCase.getCasePlanModel().getPlanItem()) {
            if (a.equals(pi.getAnyAttribute().get(JbpmextPackage.eINSTANCE.getDocumentRoot_VdmlElement(), true))) {
                thePlanItem = pi;
                break;
            }
        }
        if (thePlanItem == null) {
            thePlanItem = CMMNFactory.eINSTANCE.createTPlanItem();
            thePlanItem.getAnyAttribute().set(JbpmextPackage.eINSTANCE.getDocumentRoot_VdmlElement(), a);
        }
        thePlanItem.setName(a.getName());
        return thePlanItem;
    }

    protected TCase syncCase(TDefinitions defs, Collaboration coll) {
        TCase theCase = null;
        for (TCase c : defs.getCase()) {
            if (coll.equals(c.getAnyAttribute().get(JbpmextPackage.eINSTANCE.getDocumentRoot_VdmlElement(), true))) {
                theCase = c;
                break;
            }
        }
        if (theCase == null) {
            if (defs.getCase().size() == 1) {
                theCase = defs.getCase().get(0);
            } else {
                theCase = CMMNFactory.eINSTANCE.createTCase();
                defs.getCase().add(theCase);
            }
            theCase.getAnyAttribute().set(JbpmextPackage.eINSTANCE.getDocumentRoot_VdmlElement(), coll);
            theCase.setCaseFileModel(CMMNFactory.eINSTANCE.createTCaseFile());
            theCase.setCasePlanModel(CMMNFactory.eINSTANCE.createTStage());
        }
        theCase.setName(coll.getName());
        return theCase;
    }
}
