package org.jbpm.designer.extensions.api;



import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;

public interface IPotentialReferenceHelper {
    JSONObject findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception;

}
