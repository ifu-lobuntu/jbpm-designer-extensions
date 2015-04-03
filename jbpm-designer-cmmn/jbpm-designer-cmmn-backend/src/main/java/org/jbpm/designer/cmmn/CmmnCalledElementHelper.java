package org.jbpm.designer.cmmn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.impl.Bpmn2PackageImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jboss.drools.impl.DroolsPackageImpl;
import org.jbpm.designer.bpmn2.resource.JBPMBpmn2ResourceFactoryImpl;
import org.jbpm.designer.extensions.emf.util.DefaultPotentialReferenceHelper;
import org.jbpm.designer.extensions.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.extensions.emf.util.VFSURIHandler;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.designer.web.server.ServletUtil;
import org.omg.cmmn.TCase;

import bpsim.impl.BpsimPackageImpl;

public class CmmnCalledElementHelper extends DefaultPotentialReferenceHelper {

    public CmmnCalledElementHelper(IEmfDiagramProfile profile) {
        super(profile);
    }

    public boolean findPotentialReferences(HttpServletRequest req, HttpServletResponse resp, String action, String processId)
            throws IOException {
        if (action != null) {
            try {
                String retValue = null;
                resp.setCharacterEncoding("UTF-8");
                resp.setContentType("application/json");
                retValue = super.findPotentialReferences(req, action, processId);
                if (retValue == null) {
                    if (action.equals("showprocessinput")) {
                        if (profile.getName().equals("cmmn")) {
                            retValue = getCaseInputParametersJson(processId);
                        } else {
                            retValue = getProcessParametersJson(processId);
                        }
                    } else if (action.equals("showprocessoutput")) {
                        if (profile.getName().equals("cmmn")) {
                            retValue = getCaseOutputParametersJson(processId);
                        } else {
                            retValue = getProcessParametersJson(processId);
                        }
                    } else if (action.equals("getCallableCMMNElement")) {
                        retValue = getAllProcessIds(processId);
                    }
                }
                if (retValue != null) {
                    resp.getWriter().write(retValue);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private String getAllProcessIds(String processId) {
        String retValue;
        List<String> allPackageNames = ServletUtil.getPackageNamesFromRepository(profile);
        Map<String, String> processInfo = new HashMap<String, String>();
        for (String packageName : allPackageNames) {
            List<String> allProcessesInPackage = null;
            if (profile.getName().equals("cmmn")) {
                Collection<Asset> listAssetsRecursively = profile.getRepository().listAssetsRecursively(packageName, new FilterByExtension("cmmn"));
                allProcessesInPackage = new ArrayList<String>();
                for (Asset asset : listAssetsRecursively) {
                    allProcessesInPackage.add(asset.getUniqueId());
                }
            } else {
                allProcessesInPackage = ServletUtil.getAllProcessesInPackage(packageName, profile);
            }
            for (String p : allProcessesInPackage) {
                Asset<String> processContent = ServletUtil.getProcessSourceContent(p, profile);
                String processElement = profile.getName().equals("cmmn") ? "cmmn1\\:case" : "process";
                Pattern idPattern = Pattern.compile("<\\S*" + processElement + "[^\"]+id=\"([^_\"]+)\"", Pattern.MULTILINE);
                Matcher idMatcher = idPattern.matcher(processContent.getAssetContent());
                if (idMatcher.find()) {
                    String pid = idMatcher.group(1);
                    String pidcontent = ServletUtil.getProcessImageContent(processContent.getAssetLocation(), pid, profile);
                    if (pid != null && !pid.equals(processId)) {
                        String id = EMFVFSURIConverter.toPlatformRelativeString(processContent.getUniqueId());
                        processInfo.put(pid + "|" + id, pidcontent != null ? pidcontent : "");
                    }
                }
            }
        }
        retValue = getMapAsJSON(processInfo).toString();
        return retValue;
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

    public String getProcessParametersJson(String casePath) {
        Process theProcess = getTheProcess(casePath);
        if (theProcess == null) {
            return "";
        }
        return parametersToJson(theProcess.getProperties());
    }

    private String parametersToJson(List<Property> parameterlist) {
        String s = "";
        try {
            CaseParametersJson params = new CaseParametersJson();
            params.setParameters(new ArrayList<CaseParameterJson>());
            for (Property cp : parameterlist) {
                CaseParameterJson p = new CaseParameterJson();
                p.setName((cp.getName() == null || cp.getName().trim().length() == 0) ? cp.getId() : cp.getName());
                p.setId(cp.getId());
                if (cp.getItemSubjectRef() != null) {
                    p.setExpectedType(cp.getItemSubjectRef().getStructureRef());
                }
                params.getParameters().add(p);
            }
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            om.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
            om.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
            s = om.writeValueAsString(params);
        } catch (Exception e) {
            // TODO handle properly
            e.printStackTrace();
        }
        return s;
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

    private Process getTheProcess(String casePath) {
        String[] split = casePath.split("\\|");
        String caseId = split[0];
        String path2 = split[1];
        DroolsPackageImpl.init();
        BpsimPackageImpl.init();
        Bpmn2PackageImpl.init();
        ResourceSetImpl rst = new ResourceSetImpl();
        rst.getResourceFactoryRegistry().getExtensionToFactoryMap().put("bpmn2", new JBPMBpmn2ResourceFactoryImpl());
        rst.getURIConverter().getURIHandlers().clear();
        rst.getURIConverter().getURIHandlers().add(new VFSURIHandler(profile.getRepository()));
        Resource resource = rst.getResource(URI.createPlatformResourceURI(path2, true), true);
        if (resource == null || resource.getContents().size() == 0) {
            // TODO Yeah this won't work as planned. Remember to catch all those
            // exceptions
            return null;
        }
        return (Process) resource.getEObject(caseId);
    }

}
