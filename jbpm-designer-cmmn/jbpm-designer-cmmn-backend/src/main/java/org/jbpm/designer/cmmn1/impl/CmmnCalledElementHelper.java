package org.jbpm.designer.cmmn1.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.impl.Bpmn2PackageImpl;
import org.eclipse.cmmn1.TCase;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jboss.drools.impl.DroolsPackageImpl;
import org.jbpm.designer.bpmn2.resource.JBPMBpmn2ResourceFactoryImpl;
import org.jbpm.designer.emf.util.IEmfDiagramProfile;
import org.jbpm.designer.emf.util.VFSUriHandler;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.UriUtils;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.server.service.PathEvent;
import org.jbpm.designer.util.Base64Backport;
import org.jbpm.designer.web.profile.IDiagramProfile;
import org.jbpm.designer.web.server.ServletUtil;
import org.json.JSONObject;

import bpsim.impl.BpsimPackageImpl;

public class CmmnCalledElementHelper {
    @Inject
    private Event<PathEvent> event;

    public boolean processRequest(HttpServletRequest req, HttpServletResponse resp, String action, String processId, IDiagramProfile profile)
            throws IOException {
        if (action != null) {
            try {
                if (action.equals("showprocessinput")) {
                    resp.setCharacterEncoding("UTF-8");
                    resp.setContentType("application/json");
                    if(profile.getName().equals("cmmn1.0")){
                        resp.getWriter().write(getCaseInputParametersJson(processId, profile));
                    }else{
                        resp.getWriter().write(getProcessParametersJson(processId, profile));
                    }
                    return true;
                } else if (action.equals("showprocessoutput")) {
                    resp.setCharacterEncoding("UTF-8");
                    resp.setContentType("application/json");
                    if(profile.getName().equals("cmmn1.0")){
                        resp.getWriter().write(getCaseOutputParametersJson(processId, profile));
                    }else{
                        resp.getWriter().write(getProcessParametersJson(processId, profile));
                    }
                    return true;
                } else if (action.equals("getCallableCMMNElement")) {
                    String retValue = "false";
                    List<String> allPackageNames = ServletUtil.getPackageNamesFromRepository(profile);
                    Map<String, String> processInfo = new HashMap<String, String>();
                    if (allPackageNames != null && allPackageNames.size() > 0) {
                        for (String packageName : allPackageNames) {
                            List<String> allProcessesInPackage = null;
                            if (profile.getName().equals("cmmn1.0")) {
                                Collection<Asset> listAssetsRecursively = profile.getRepository().listAssetsRecursively(packageName,
                                        new FilterByExtension("cmmn"));
                                allProcessesInPackage = new ArrayList<String>();
                                for (Asset asset : listAssetsRecursively) {
                                    allProcessesInPackage.add(asset.getUniqueId());
                                }
                            } else {
                                allProcessesInPackage = ServletUtil.getAllProcessesInPackage(packageName, profile);
                            }
                            if (allProcessesInPackage != null && allProcessesInPackage.size() > 0) {
                                for (String p : allProcessesInPackage) {
                                    Asset<String> processContent = ServletUtil.getProcessSourceContent(p, profile);
                                    String processElement = profile.getName().equals("cmmn1.0") ? "cmmn1\\:case" : "process";
                                    Pattern idPattern = Pattern.compile("<\\S*" + processElement + "[^\"]+id=\"([^_\"]+)\"", Pattern.MULTILINE);
                                    Matcher idMatcher = idPattern.matcher(processContent.getAssetContent());
                                    if (idMatcher.find()) {
                                        String pid = idMatcher.group(1);
                                        String pidcontent = ServletUtil.getProcessImageContent(processContent.getAssetLocation(), pid, profile);
                                        if (pid != null && !pid.equals(processId)) {
                                            String id = null;
                                            if (Base64Backport.isBase64(processContent.getUniqueId())) {
                                                byte[] decoded = Base64.decodeBase64(processContent.getUniqueId());
                                                try {
                                                    String uri = new String(decoded, "UTF-8");
                                                    id = UriUtils.encode(uri);
                                                } catch (UnsupportedEncodingException e) {

                                                }
                                            }
                                            if (id == null) {
                                                id = UriUtils.encode(processContent.getUniqueId());
                                            }
                                            processInfo.put(pid + "|" + id, pidcontent != null ? pidcontent : "");
                                        }
                                    }
                                }

                            }
                        }
                    }
                    retValue = getProcessInfoAsJSON(processInfo).toString();
                    resp.setCharacterEncoding("UTF-8");
                    resp.setContentType("application/json");
                    resp.getWriter().write(retValue);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public String getCaseInputParametersJson(String casePath, IDiagramProfile p) {
        TCase theCase = getTheCase(casePath, p);
        if (theCase == null) {
            return "";
        }
        return CmmnEmfToJsonHelper.parametersToJson(theCase.getInput(), null);
    }

    public String getCaseOutputParametersJson(String casePath, IDiagramProfile p) {
        TCase theCase = getTheCase(casePath, p);
        if (theCase == null) {
            return "";
        }
        return CmmnEmfToJsonHelper.parametersToJson(theCase.getOutput(), null);
    }
    public String getProcessParametersJson(String casePath, IDiagramProfile p) {
        Process theProcess = getTheProcess(casePath, p);
        if (theProcess == null) {
            return "";
        }
        return parametersToJson(theProcess.getProperties());
    }
    private String parametersToJson(List<Property> parameterlist) {
        String s="";
        try {
            CaseParametersJson params = new CaseParametersJson();
            params.setParameters(new ArrayList<CaseParameterJson>());
            for (Property cp : parameterlist) {
                CaseParameterJson p = new CaseParameterJson();
                p.setName((cp.getName()==null || cp.getName().trim().length()==0)?cp.getId():cp.getName());
                p.setId(cp.getId());
                if(cp.getItemSubjectRef()!=null){
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
            //TODO handle properly
            e.printStackTrace();
        }
        return s;
    }

    private TCase getTheCase(String casePath, IDiagramProfile p) {
        IEmfDiagramProfile profile = (IEmfDiagramProfile) p;
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

    private Process getTheProcess(String casePath, IDiagramProfile profile) {
        String[] split = casePath.split("\\|");
        String caseId = split[0];
        String path2 = split[1];
        DroolsPackageImpl.init();
        BpsimPackageImpl.init();
        Bpmn2PackageImpl.init();
        ResourceSetImpl rst = new ResourceSetImpl();
        rst.getResourceFactoryRegistry().getExtensionToFactoryMap().put("bpmn2", new JBPMBpmn2ResourceFactoryImpl());
        rst.getURIConverter().getURIHandlers().clear();
        rst.getURIConverter().getURIHandlers().add(new VFSUriHandler(profile.getRepository(), event));
        Resource resource = rst.getResource(URI.createPlatformResourceURI(path2, true), true);
        if (resource == null || resource.getContents().size() == 0) {
            // TODO Yeah this won't work as planned. Remember to catch all those
            // exceptions
            return null;
        }
        return (Process) resource.getEObject(caseId);
    }

    public JSONObject getProcessInfoAsJSON(Map<String, String> processInfo) {
        JSONObject jsonObject = new JSONObject();
        for (Entry<String, String> error : processInfo.entrySet()) {
            try {
                jsonObject.put(error.getKey(), error.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonObject;
    }
}
