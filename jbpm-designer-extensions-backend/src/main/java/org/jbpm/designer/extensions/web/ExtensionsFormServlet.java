package org.jbpm.designer.extensions.web;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.AssetBuilderFactory;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.impl.AssetBuilder;
import org.jbpm.designer.taskforms.TaskFormInfo;
import org.jbpm.designer.util.Base64Backport;
import org.jbpm.designer.util.ConfigurationProvider;
import org.jbpm.designer.util.Utils;
import org.jbpm.designer.web.profile.IDiagramProfileService;
import org.jbpm.designer.web.profile.IExtensionDiagramProfile;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uberfire.backend.vfs.VFSService;
import org.uberfire.java.nio.file.NoSuchFileException;

/**
 * 
 * Creates/updates forms for a class diagram.
 * 
 */
public class ExtensionsFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger _logger = LoggerFactory.getLogger(ExtensionsFormServlet.class);
    private static final String FORMMODELER_FILE_EXTENSION = "form";
    public static final String DESIGNER_PATH = ConfigurationProvider.getInstance().getDesignerContext();

    @Inject
    private IDiagramProfileService profileService;
    @Inject
    private VFSService vfsServices;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String json = req.getParameter("json");
        String uuid = Utils.getUUID(req);
        String elementId = req.getParameter("elementId");
        String formType = req.getParameter("formType");
        IExtensionDiagramProfile profile = (IExtensionDiagramProfile) profileService.findProfile(req, req.getParameter("profile"));
        Repository repository = profile.getRepository();
        String action = req.getParameter("action");
        try {
            resp.setContentType("application/json");
            String folderUri = vfsServices.get(uuid).toURI();
            Asset<String> processAsset = repository.loadAsset(uuid);
            // folderUri = folderUri.substring(0, folderUri.lastIndexOf("/"));
            folderUri = processAsset.getAssetLocation();
            XMLResource resource = (XMLResource) profile.createMarshaller().getResource(json, "");
            URI uri = URI.createPlatformResourceURI(folderUri + "/" + processAsset.getFullName(), true);
            resource.setURI(uri);
            if (action.equals("generateAllForms")) {
                Collection<TaskFormInfo> forms = profile.generateAllForms(vfsServices.get(uuid), resource);
                resp.getWriter().write(storeInRepository(forms, folderUri, repository).toString());
            } else if (action.equalsIgnoreCase("generateForm")) {
                TaskFormInfo form = profile.generateFormFor(vfsServices.get(uuid), resource, elementId, formType);
                resp.getWriter().write(storeTaskForm(form, folderUri, repository).toString());
            } else if (action.equalsIgnoreCase("openForm")) {
                try {
                    String formName = profile.getFormId(resource, elementId, formType) + "." + FORMMODELER_FILE_EXTENSION;
                    Asset newModelerFormAsset = repository.loadAssetFromPath(folderUri + "/" + formName);
                    JSONObject retObj = new JSONObject();
                    String modelerUniqueId = newModelerFormAsset.getUniqueId();
                    if (Base64Backport.isBase64(modelerUniqueId)) {
                        byte[] decoded = Base64.decodeBase64(modelerUniqueId);
                        try {
                            modelerUniqueId = new String(decoded, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                    retObj.put("uri", modelerUniqueId);
                    retObj.put("fileName", formName);
                    resp.getWriter().write(retObj.toString());
                } catch (NoSuchFileException e) {
                    TaskFormInfo form = profile.generateFormFor(vfsServices.get(uuid), resource, elementId, formType);
                    resp.getWriter().write(storeTaskForm(form, folderUri, repository).toString());
                }
            }
            resp.setContentType("application/json");
        } catch (Exception e) {
            e.printStackTrace();
            _logger.error(e.getMessage());
            // displayErrorResponse(resp, e.getMessage());
            resp.setContentType("text/plain");
            resp.getWriter().write("fail");
        }
    }

    public JSONObject storeTaskForm(TaskFormInfo taskForm, String location, Repository repository) throws Exception {
        try {
            JSONObject retObj = new JSONObject();

            // create the modeler form asset
            String formFileName = taskForm.getId() + "." + FORMMODELER_FILE_EXTENSION;
            try {
                repository.deleteAssetFromPath(location + "/" + formFileName);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            AssetBuilder modelerBuilder = AssetBuilderFactory.getAssetBuilder(Asset.AssetType.Byte);
            modelerBuilder.name(taskForm.getId()).location(location).type(FORMMODELER_FILE_EXTENSION).content(taskForm.getModelerOutput().getBytes("UTF-8"));
            repository.createAsset(modelerBuilder.getAsset());
            Asset newModelerFormAsset = repository.loadAssetFromPath(location + "/" + formFileName);
            String modelerUniqueId = newModelerFormAsset.getUniqueId();
            if (Base64Backport.isBase64(modelerUniqueId)) {
                byte[] decoded = Base64.decodeBase64(modelerUniqueId);
                try {
                    modelerUniqueId = new String(decoded, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            retObj.put("uri", modelerUniqueId);
            retObj.put("fileName", formFileName);
            return retObj;

        } catch (Exception e) {
            e.printStackTrace();
            _logger.error(e.getMessage());
            return new JSONObject();
        }
    }

    private JSONArray storeInRepository(Collection<TaskFormInfo> forms, String location, Repository repository) throws Exception {
        JSONArray retArray = new JSONArray();
        for (TaskFormInfo taskForm : forms) {
            retArray.put(storeTaskForm(taskForm, location, repository));
        }

        return retArray;
    }

}
