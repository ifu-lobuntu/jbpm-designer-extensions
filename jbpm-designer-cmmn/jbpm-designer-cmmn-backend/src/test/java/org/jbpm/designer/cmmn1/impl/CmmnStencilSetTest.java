package org.jbpm.designer.cmmn1.impl;

import java.io.BufferedReader;
import java.io.FileReader;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.jbpm.designer.stencilset.linkage.LinkedStencilSet;
import org.jbpm.designer.stencilset.linkage.StencilSet;
import org.junit.Test;

public class CmmnStencilSetTest {
    @Test
    public void testStencilset() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(
                "../jbpm-designer-cmmn-client/src/main/resources/org/jbpm/designer/public/stencilsets/cmmn1.0/cmmn1.0.json"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line + "\n");
        }
        ObjectMapper om = new ObjectMapper();
        om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        StencilSet stencilSet = om.readValue(sb.toString(), StencilSet.class);
        new LinkedStencilSet(stencilSet).validateStencilSet();
    }

}