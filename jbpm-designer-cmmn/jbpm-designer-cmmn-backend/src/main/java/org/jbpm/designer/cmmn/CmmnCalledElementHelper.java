package org.jbpm.designer.cmmn;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.jbpm.designer.extensions.impl.DefaultPotentialReferenceHelper;
import org.omg.cmmn.TCase;

public class CmmnCalledElementHelper extends DefaultPotentialReferenceHelper {

    public CmmnCalledElementHelper(IEmfDiagramProfile profile) {
        super(profile);
    }

    public String findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception {
        if (action != null) {
            try {
                String retValue = null;
                if (action.equals("showprocessinput")) {
                        retValue = getCaseInputParametersJson(processId);
                } else if (action.equals("showprocessoutput")) {
                        retValue = getCaseOutputParametersJson(processId);
                }
                if (retValue == null) {
                    retValue = super.findPotentialReferences(req, action, processId);
                }
                return retValue;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public String getCaseInputParametersJson(String casePath) {
        TCase theCase = getTheCase(casePath);
        if (theCase == null) {
            return "";
        }
        return CmmnEmfToJsonHelper.parametersToJson(theCase.getInput(), null);
    }

    public String getCaseOutputParametersJson(String casePath) {
        TCase theCase = getTheCase(casePath);
        if (theCase == null) {
            return "";
        }
        return CmmnEmfToJsonHelper.parametersToJson(theCase.getOutput(), null);
    }

    private TCase getTheCase(String casePath) {
        String[] split = casePath.split("\\|");
        String caseId = split[0];
        String path2 = split[1];
        ResourceSetImpl rst = new ResourceSetImpl();
        profile.prepareResourceSet(rst);
        rst.getURIConverter().getURIHandlers().clear();
        rst.getURIConverter().getURIHandlers().add(profile.getUriHandler());
        Resource resource = rst.getResource(URI.createPlatformResourceURI(path2, true), true);
        if (resource == null || resource.getContents().size() == 0) {
            // TODO Yeah this won't work as planned. Remember to catch all those
            // exceptions
            return null;
        }
        return (TCase) resource.getEObject(caseId);
    }


}
