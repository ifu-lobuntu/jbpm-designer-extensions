package org.jbpm.designer.extensions.api;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

public interface IPotentialReferenceHelper {
    JSONObject findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception;

}
