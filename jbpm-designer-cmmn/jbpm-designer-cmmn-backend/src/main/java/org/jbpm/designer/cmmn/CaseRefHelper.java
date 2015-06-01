package org.jbpm.designer.cmmn;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.omg.cmmn.CMMNFactory;
import org.omg.cmmn.TCase;
import org.omg.cmmn.TCaseParameter;
import org.omg.cmmn.TCaseTask;
import org.omg.cmmn.TDefinitions;
import org.omg.cmmn.TImport;
import org.omg.cmmn.util.ImportHelper;

public class CaseRefHelper {
    private TCase externalCase;
    private TDefinitions sourceDefinitions;
    private TImport imp;
    private TDefinitions targetDefinitions;
    private TCaseTask caseTask;

    public CaseRefHelper(TCaseTask caseTask, TCase externalCase) {
        super();
        this.caseTask=caseTask;
        EObject o=this.caseTask.eContainer();
        while(!(o instanceof TDefinitions)){
            o=o.eContainer();
        }
        this.sourceDefinitions = (TDefinitions) o;
        this.externalCase = externalCase;
        this.targetDefinitions = (TDefinitions) this.externalCase.eContainer();
    }

    public TImport findOrCreateImport() {
        if (this.imp == null) {
            String refNamespace = targetDefinitions.getTargetNamespace();
            this.imp = ImportHelper.findImportForNamespace(sourceDefinitions, refNamespace);
            if (this.imp == null) {
                this.imp = CMMNFactory.eINSTANCE.createTImport();
                this.imp.setImportType("CMMN");
                this.imp.setLocation(this.externalCase.eResource().getURI().toString());
                this.imp.setNamespace(refNamespace);
                sourceDefinitions.getImport().add(this.imp);
            }
        }
        return this.imp;
    }

    public TCase syncCaseInDefinitions() {
        TCase caseInDefinitions = findImportedCaseInDefinitions();
        if (caseInDefinitions == null) {
            caseInDefinitions = CMMNFactory.eINSTANCE.createTCase();
            caseInDefinitions.setId(externalCase.getId());
            caseInDefinitions.setName(externalCase.getName());
            sourceDefinitions.getCase().add(caseInDefinitions);
        }
        syncParameters(externalCase.getInput(), caseInDefinitions.getInput());
        syncParameters(externalCase.getOutput(), caseInDefinitions.getOutput());
        caseInDefinitions.setName(isEmpty(caseInDefinitions.getName()) ? caseInDefinitions.getId() : caseInDefinitions.getName());
        return caseInDefinitions;
    }

    private TCase findImportedCaseInDefinitions() {
        for (TCase tCase : sourceDefinitions.getCase()) {
            if(tCase.getName().equals(externalCase.getName())){
                return tCase;
            }
        }
        return null;
    }

    private void syncParameters(EList<TCaseParameter> sourceParames, EList<TCaseParameter> targetParameters) {
        for (TCaseParameter sourceParameter : sourceParames) {
            TCaseParameter parameter=null;
            if (!isParameterPresent(targetParameters, sourceParameter)) {
                parameter = CMMNFactory.eINSTANCE.createTCaseParameter();
                parameter.setId(sourceParameter.getId());
                targetParameters.add(parameter);
                parameter.setName(sourceParameter.getName());
            }
        }
        for (TCaseParameter p : new ArrayList<TCaseParameter>(targetParameters)) {
            if (!isParameterPresent(sourceParames, p)) {
                targetParameters.remove(p);
            }
        }
    }

    private boolean isParameterPresent(EList<TCaseParameter> searchField, TCaseParameter p) {
        boolean found = false;
        for (TCaseParameter property : searchField) {
            if (p.getName().equals(property.getName())) {
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
