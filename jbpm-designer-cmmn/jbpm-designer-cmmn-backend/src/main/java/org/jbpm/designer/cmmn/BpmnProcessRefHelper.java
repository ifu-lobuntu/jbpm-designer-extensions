package org.jbpm.designer.cmmn;

import java.util.ArrayList;

import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.Property;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TImport;
import org.omg.cmmn.TProcess;
import org.omg.cmmn.TProcessParameter;
import org.omg.cmmn.TProcessTask;
import org.omg.cmmn.util.ImportHelper;

public class BpmnProcessRefHelper {
    private TProcessTask processTask;
    private Process externalProcess;
    private Definitions targetDefinitions;
    private TDefinitions sourceDefinitions;
    private TImport imp;

    public BpmnProcessRefHelper(TProcessTask processTask, Process externalProcess) {
        super();
        this.processTask = processTask;
        this.externalProcess = externalProcess;
        EObject o = this.processTask.eContainer();
        while (!(o instanceof TDefinitions)) {
            o = o.eContainer();
        }
        this.sourceDefinitions = (TDefinitions) o;
        this.targetDefinitions = (Definitions) this.externalProcess.eContainer();
    }

    public TImport findOrCreateImport() {
        if (this.imp == null) {
            String refNamespace = targetDefinitions.getTargetNamespace();
            this.imp = ImportHelper.findImportForNamespace(sourceDefinitions, refNamespace);
            if (this.imp == null) {
                this.imp = CMMNFactory.eINSTANCE.createTImport();
                this.imp.setImportType("BPMN2");
                this.imp.setLocation(this.externalProcess.eResource().getURI().toString());
                this.imp.setNamespace(refNamespace);
                sourceDefinitions.getImport().add(this.imp);
            }
        }
        return this.imp;
    }

    public TProcess syncProcessInDefinitions() {
        TProcess processInDefinitions = (TProcess) findImportedProcess();
        if (processInDefinitions == null) {
            processInDefinitions = CMMNFactory.eINSTANCE.createTProcess();
            processInDefinitions.setId(externalProcess.getId());
            processInDefinitions.setName(externalProcess.getName());
            sourceDefinitions.getProcess().add(processInDefinitions);
        }
        syncParameters(processInDefinitions.getInput());
        syncParameters(processInDefinitions.getOutput());
        processInDefinitions.setName(isEmpty(processInDefinitions.getName()) ? processInDefinitions.getId() : processInDefinitions.getName());
        return processInDefinitions;
    }

    private TProcess findImportedProcess() {
        for (TProcess tp : sourceDefinitions.getProcess()) {
            if (tp.getId().equals(externalProcess.getId()) || tp.getName().equals(externalProcess.getName())) {
                return tp;
            }
        }
        return null;
    }

    private void syncParameters(EList<TProcessParameter> input) {
        for (Property property : externalProcess.getProperties()) {
            String parameterId = externalProcess.getId() + "." + (isEmpty(property.getName()) ? property.getId() : property.getName());
            TProcessParameter parameter = (TProcessParameter) processTask.eResource().getEObject(parameterId);
            if (parameter == null) {
                parameter = CMMNFactory.eINSTANCE.createTProcessParameter();
                parameter.setId(parameterId);
                input.add(parameter);
            }
            parameter.setName(isEmpty(property.getName()) ? property.getId() : property.getName());
        }
        for (TProcessParameter p : new ArrayList<TProcessParameter>(input)) {
            if (!isParameterPresentInProcess(p)) {
                input.remove(p);
            }
        }
    }

    private boolean isParameterPresentInProcess(TProcessParameter p) {
        boolean found = false;
        for (Property property : externalProcess.getProperties()) {
            String parameterId = externalProcess.getId() + "." + (isEmpty(property.getName()) ? property.getId() : property.getName());
            if (p.getId().equals(parameterId)) {
                found = true;
                break;
            }
        }
        return found;
    }

    private static boolean isEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }

}
