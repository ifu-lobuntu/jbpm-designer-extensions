package org.jbpm.formModeler.vdml.integration;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuildConfig;
import org.jbpm.formModeler.emf.EmfBasedDataHolderBuilder;
import org.jbpm.formModeler.vdml.model.DeliverableFlowDataHolder;
import org.omg.vdml.DeliverableFlow;

import javax.enterprise.context.ApplicationScoped;
import java.util.Locale;

@ApplicationScoped
public class DeliverableFlowDataHolderBuilder extends EmfBasedDataHolderBuilder<DeliverableFlow, DeliverableFlowDataHolder> {


    protected String[] getElementTypes() {
        return new String[]{"InputPort", "OutputPort"};
    }

    @Override
    protected DeliverableFlowDataHolder buildDataHolder(DataHolderBuildConfig config, DeliverableFlow eObject) {
        return new DeliverableFlowDataHolder(eObject,config.getHolderId());
    }

    @Override
    protected String[] getProfiles() {
        return new String[]{"vdcol"};
    }

    @Override
    protected void loadEObject(DeliverableFlow eObject) {
        super.loadEObject(eObject);
        EcoreUtil.resolveAll(eObject);
        EcoreUtil.resolveAll(eObject.getProvider());
        EcoreUtil.resolveAll(eObject.getRecipient());
    }


    @Override
    public String getId() {
        return DeliverableFlowDataHolder.TYPE;
    }

    @Override
    public int getPriority() {
        return 1234;
    }

    @Override
    public String[] getSupportedHolderTypes() {
        return new String[]{DeliverableFlowDataHolder.TYPE};
    }

    @Override
    public String getDataHolderName(Locale locale) {
        return "Deliverable Flow Holder";
        // ResourceBundle bundle =
        // ResourceBundle.getBundle("org.jbpm.formModeler.dataModeler.messages",
        // locale);
        // return bundle.getString("dataHolder_dataModeler");
    }
}
