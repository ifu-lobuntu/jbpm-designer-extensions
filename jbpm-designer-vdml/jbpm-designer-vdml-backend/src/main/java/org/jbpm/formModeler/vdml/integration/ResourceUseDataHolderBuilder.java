package org.jbpm.formModeler.vdml.integration;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuildConfig;
import org.jbpm.formModeler.core.config.builders.dataHolder.RangedDataHolderBuilder;
import org.jbpm.formModeler.emf.EmfBasedDataHolderBuilder;
import org.jbpm.formModeler.vdml.model.ResourceUseDataHolder;
import org.omg.vdml.Activity;
import org.omg.vdml.ResourceUse;

import javax.enterprise.context.ApplicationScoped;
import java.util.Locale;

@ApplicationScoped
public class ResourceUseDataHolderBuilder extends EmfBasedDataHolderBuilder<Activity, ResourceUseDataHolder> implements RangedDataHolderBuilder{


    protected String[] getElementTypes() {
        return new String[]{"Activity"};
    }

    @Override
    protected ResourceUseDataHolder buildDataHolder(DataHolderBuildConfig config, Activity eObject) {
        return new ResourceUseDataHolder(eObject,config.getHolderId());
    }

    @Override
    protected String[] getProfiles() {
        return new String[]{"vdcol"};
    }

    @Override
    protected void loadEObject(Activity a) {
        super.loadEObject(a);
        EcoreUtil.resolveAll(a);
        for (ResourceUse eObject : a.getResourceUse()) {
            EcoreUtil.resolveAll(eObject.getDeliverable());
        }
    }


    @Override
    public String getId() {
        return ResourceUseDataHolder.TYPE;
    }

    @Override
    public int getPriority() {
        return 1234;
    }

    @Override
    public String[] getSupportedHolderTypes() {
        return new String[]{ResourceUseDataHolder.TYPE};
    }

    @Override
    public String getDataHolderName(Locale locale) {
        return "Resource Use Holder";
        // ResourceBundle bundle =
        // ResourceBundle.getBundle("org.jbpm.formModeler.dataModeler.messages",
        // locale);
        // return bundle.getString("dataHolder_dataModeler");
    }
}
