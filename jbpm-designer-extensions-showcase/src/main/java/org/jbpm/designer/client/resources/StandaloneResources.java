package org.jbpm.designer.client.resources;

import org.jbpm.designer.client.resources.css.StandaloneCss;
import org.jbpm.designer.client.resources.images.StandaloneImages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface StandaloneResources
        extends
        ClientBundle {

    StandaloneResources INSTANCE = GWT.create( StandaloneResources.class );

    @Source("css/Standalone.css")
    StandaloneCss CSS();

    StandaloneImages images();

}
