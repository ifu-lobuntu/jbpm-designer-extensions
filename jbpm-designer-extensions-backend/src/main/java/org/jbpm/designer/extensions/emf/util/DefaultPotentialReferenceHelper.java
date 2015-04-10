package org.jbpm.designer.extensions.emf.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.jbpm.designer.web.server.ServletUtil;
import org.json.JSONException;
import org.json.JSONObject;
import org.omg.dd.di.DiagramElement;

public class DefaultPotentialReferenceHelper {

    protected IEmfDiagramProfile profile;

    public DefaultPotentialReferenceHelper(IEmfDiagramProfile profile) {
        super();
        this.profile = profile;
    }

    public String findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception {
        if (action.equals("getEmfElements")) {
            String targetProfile = req.getParameter("targetProfile");
            String nameFeature = req.getParameter("nameFeature");
            String[] elementTypes = req.getParameter("elementTypes").split("\\|");
            List<String> allPackageNames = ServletUtil.getPackageNamesFromRepository(profile);
            IEmfProfile targetDiagramProfile = ((IEmfProfile) profile).getOtherProfile(targetProfile);
            ResourceSet rst = new ResourceSetImpl();
            targetDiagramProfile.prepareResourceSet(rst);
            UriHelper.setPlatformUriHandler(rst, targetDiagramProfile.getUriHandler());
            for (String packageName : allPackageNames) {
                @SuppressWarnings("rawtypes")
                Collection<Asset> listAssetsRecursively = profile.getRepository().listAssetsRecursively(packageName,
                        new FilterByExtension(targetDiagramProfile.getSerializedModelExtension()));
                for (Asset<?> asset : listAssetsRecursively) {
                    String id = EMFVFSURIConverter.toPlatformRelativeString(asset.getUniqueId());
                    URI uri = URI.createPlatformResourceURI(id, true);
                    rst.getResource(uri, true);
                }
            }
            Collection<EObject> results = new ArrayList<EObject>();
            for (Resource resource : new ArrayList<Resource>( rst.getResources())) {
                TreeIterator<EObject> ti = resource.getContents().get(0).eAllContents();
                while (ti.hasNext()) {
                    EObject eObject = (EObject) ti.next();
                    if(eObject instanceof DiagramElement){
                        EList<EObject> mes = ((DiagramElement) eObject).getModelElement();
                        if(mes.size()>0){
                            eObject=mes.get(0);
                        }
                    }
                    for (String string : elementTypes) {
                        String className = eObject.eClass().getName();
                        if (className.equals(string)) {
                            String platformString = resource.getURI().toPlatformString(true);
                            if (platformString == null) {
                                platformString = resource.getURI().toString();
                            }
                            results.add(eObject);
                        }
                    }
                }

            }
            return toEobjectReferenceJson(results,nameFeature).toString();
        }
        return null;
    }
    @Deprecated
    protected JSONObject getMapAsJSON(Map<String, String> processInfo) {
        JSONObject jsonObject = new JSONObject();
        for (Entry<String, String> error : processInfo.entrySet()) {
            try {
                jsonObject.put(error.getKey(), error.getValue());
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

    protected JSONObject toEobjectReferenceJson(Collection<? extends EObject> results, String nameFeature) {
        JSONObject jsonObject = new JSONObject();
        for (EObject eObject : results) {
            try {
                jsonObject.put(eObject.eGet(eObject.eClass().getEStructuralFeature(nameFeature)) + "|" + eObject.eResource().getURI().toPlatformString(true), "");
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

}