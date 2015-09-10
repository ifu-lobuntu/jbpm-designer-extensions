package org.jbpm.formModeler.vdml.integration;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuildConfig;
import org.jbpm.formModeler.core.config.builders.dataHolder.RangedDataHolderBuilder;
import org.jbpm.formModeler.emf.EmfBasedDataHolderBuilder;
import org.jbpm.formModeler.vdml.model.ValueOutputDataHolder;
import org.omg.vdml.Activity;
import org.omg.vdml.InputPort;
import org.omg.vdml.OutputPort;
import org.omg.vdml.Port;

import javax.enterprise.context.ApplicationScoped;
import java.util.Locale;

@ApplicationScoped
public class ValueOutputDataHolderBuilder extends EmfBasedDataHolderBuilder<Activity, ValueOutputDataHolder> implements RangedDataHolderBuilder{


    protected String[] getElementTypes() {
        return new String[]{"Activity"};
    }

    @Override
    protected ValueOutputDataHolder buildDataHolder(DataHolderBuildConfig config, Activity eObject) {
        return new ValueOutputDataHolder(eObject,config.getHolderId());
    }

    @Override
    protected String[] getProfiles() {
        return new String[]{"vdcol"};
    }

    @Override
    protected void loadEObject(Activity a) {
        super.loadEObject(a);
        EcoreUtil.resolveAll(a);
        for (Port eObject : a.getContainedPort()) {
            if (eObject instanceof InputPort) {
                InputPort ip = (InputPort) eObject;
                EcoreUtil.resolveAll(ip.getInput().getProvider());
                EcoreUtil.resolveAll(ip.getInput());
            } else {
                OutputPort ip = (OutputPort) eObject;
                EcoreUtil.resolveAll(ip.getOutput().getRecipient());
                EcoreUtil.resolveAll(ip.getOutput());
            }
        }
    }


    @Override
    public String getId() {
        return ValueOutputDataHolder.TYPE;
    }

    @Override
    public int getPriority() {
        return 1234;
    }

    @Override
    public String[] getSupportedHolderTypes() {
        return new String[]{ValueOutputDataHolder.TYPE};
    }

    @Override
    public String getDataHolderName(Locale locale) {
        return "Value Output Holder";
        // ResourceBundle bundle =
        // ResourceBundle.getBundle("org.jbpm.formModeler.dataModeler.messages",
        // locale);
        // return bundle.getString("dataHolder_dataModeler");
    }
}
