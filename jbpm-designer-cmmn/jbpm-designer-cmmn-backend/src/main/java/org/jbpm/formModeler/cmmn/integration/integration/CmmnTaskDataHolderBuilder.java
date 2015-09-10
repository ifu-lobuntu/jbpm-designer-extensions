/**
 * Copyright (C) 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jbpm.formModeler.cmmn.integration.integration;

import org.jbpm.designer.server.service.PathEvent;
import org.jbpm.formModeler.cmmn.model.CmmnTaskDataHolder;
import org.jbpm.formModeler.core.config.builders.dataHolder.DataHolderBuildConfig;
import org.jbpm.formModeler.core.config.builders.dataHolder.RangedDataHolderBuilder;
import org.jbpm.formModeler.emf.EmfBasedDataHolderBuilder;
import org.omg.cmmn.TCmmnElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.Locale;

@ApplicationScoped
public class CmmnTaskDataHolderBuilder extends EmfBasedDataHolderBuilder<TCmmnElement,CmmnTaskDataHolder> implements RangedDataHolderBuilder {


    private Logger log = LoggerFactory.getLogger(CmmnTaskDataHolderBuilder.class);

    @Inject
    Event<PathEvent> event;


    @Override
    protected String[] getElementTypes() {
        return new String[]{"TTask", "TCase"};
    }

    @Override
    protected CmmnTaskDataHolder buildDataHolder(DataHolderBuildConfig config, TCmmnElement eObject) {
        return new CmmnTaskDataHolder(eObject,config.getHolderId());
    }

    @Override
    protected String[] getProfiles() {
        return new String[]{"cmmn"};
    }

    @Override
    public String getId() {
        return CmmnTaskDataHolder.TYPE;
    }

    @Override
    public int getPriority() {
        return 123123321;
    }

    @Override
    public String[] getSupportedHolderTypes() {
        return new String[] { CmmnTaskDataHolder.TYPE};
    }

    @Override
    public String getDataHolderName(Locale locale) {
        return "CMMN Task Input Holder";
        // ResourceBundle bundle =
        // ResourceBundle.getBundle("org.jbpm.formModeler.dataModeler.messages",
        // locale);
        // return bundle.getString("dataHolder_dataModeler");
    }
}
