package org.jbpm.designer.extensions.api;

import javax.servlet.http.HttpServletRequest;

public interface IPotentialReferenceHelper {
    String findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception;

}
