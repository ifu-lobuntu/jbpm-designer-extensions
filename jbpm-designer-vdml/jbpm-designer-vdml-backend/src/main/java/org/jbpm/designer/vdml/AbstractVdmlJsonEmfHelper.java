package org.jbpm.designer.vdml;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.designer.extensions.emf.util.ShapeMap;
import org.jbpm.designer.vdrc.VdmlStencilInfo;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagramElement;
import org.omg.smm.Measure;
import org.omg.vdml.Collaboration;
import org.omg.vdml.MeasuredCharacteristic;
import org.omg.vdml.VDMLFactory;
import org.omg.vdml.VDMLPackage;
import org.omg.vdml.VdmlElement;
import org.omg.vdml.util.VDMLSwitch;

public abstract class AbstractVdmlJsonEmfHelper extends VDMLSwitch<Object> {
    protected static final VDMLPackage PACKAGE = VDMLPackage.eINSTANCE;
    protected static final Map<EClass, EAttribute> COLLABORATION_FEATURE_MAP = new HashMap<EClass, EAttribute>();
    protected ShapeMap shapeMap;
    protected Collaboration owningCollaboration;
    private VDMLDiagram diagram;
    private Set<EClass> managedClassSet;

    public AbstractVdmlJsonEmfHelper(ShapeMap shapeMap, Class<? extends VdmlStencilInfo> stencil) {
        super();
        this.shapeMap = shapeMap;
        this.managedClassSet = new HashSet<EClass>();
        for (Field field : stencil.getDeclaredFields()) {
            if (field.isEnumConstant()) {
                try {
                    VdmlStencilInfo si = (VdmlStencilInfo) field.get(null);
                    if (si.getElementType() != null) {
                        this.managedClassSet.add(si.getElementType());
                    }
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        this.managedClassSet.add(PACKAGE.getPosition());
        this.managedClassSet.add(PACKAGE.getMember());
        this.managedClassSet.add(PACKAGE.getPerformer());
        this.managedClassSet.add(PACKAGE.getParty());
    }

    protected interface OrphanFilter {
        boolean shouldHaveDiagramElement(VdmlElement e);
    }

    private Collection<VdmlElement> collectOrphans(VDMLDiagram diagram, Map<VdmlElement, VDMLDiagramElement> map, Set<EClass> classes) {
        Collection<VdmlElement> orphans = new HashSet<VdmlElement>();
        OrphanFilter orphanFilter = getOrphanFilter();
        TreeIterator<EObject> eAllContents = diagram.getVdmlElement().eAllContents();
        while (eAllContents.hasNext()) {
            EObject eObject = (EObject) eAllContents.next();
            if (eObject instanceof VdmlElement && classes.contains(eObject.eClass())) {
                VdmlElement ve = (VdmlElement) eObject;
                if (!map.containsKey(eObject) && orphanFilter.shouldHaveDiagramElement(ve)) {
                    orphans.add(ve);
                }
            }
        }
        Set<VdmlElement> duplicates = new HashSet<VdmlElement>();
        for (VdmlElement potentialParent : orphans) {
            for (VdmlElement potentialChild : orphans) {
                if (potentialChild != potentialParent && EcoreUtil.isAncestor(potentialParent, potentialChild)) {
                    duplicates.add(potentialChild);
                }
            }
        }
        orphans.removeAll(duplicates);
        return orphans;
    }

    protected Collection<VdmlElement> collectOrphans() {
        Map<VdmlElement, VDMLDiagramElement> map = new HashMap<VdmlElement, VDMLDiagramElement>();
        populateDiagramElementMap(getDiagram(), map, getManagedClassSet());
        Collection<VdmlElement> orphans = collectOrphans(getDiagram(), map, getManagedClassSet());
        return orphans;
    }

    protected Set<EClass> getManagedClassSet() {
        return this.managedClassSet;
    }

    protected VDMLDiagram getDiagram() {
        if (this.diagram == null) {
            setDiagram(VdmlHelper.getDiagram(shapeMap.getResource()));
        }
        return this.diagram;
    }

    protected void setDiagram(VDMLDiagram diagram2) {
        this.diagram = diagram2;
    }

    protected void buildMap(VDMLDiagram diagram, Map<VdmlElement, VDMLDiagramElement> map, EClass... cls) {
        Set<EClass> classes = new HashSet<EClass>(Arrays.asList(cls));
        populateDiagramElementMap(diagram, map, classes);
    }

    protected void populateDiagramElementMap(VDMLDiagram diagram, Map<VdmlElement, VDMLDiagramElement> map, Set<EClass> classes) {
        TreeIterator<EObject> allContents = diagram.eAllContents();
        while (allContents.hasNext()) {
            EObject eObject = allContents.next();
            if (eObject instanceof VDMLDiagramElement) {
                EList<EObject> modelElement = ((VDMLDiagramElement) eObject).getModelElement();
                for (EObject me : modelElement) {
                    if (classes.contains(me.eClass())) {
                        map.put((VdmlElement) me, (VDMLDiagramElement) eObject);
                    }
                }
            }
        }
    }

    protected OrphanFilter getOrphanFilter() {
        return new OrphanFilter() {

            @Override
            public boolean shouldHaveDiagramElement(VdmlElement e) {
                return true;
            }
        };
    }
}