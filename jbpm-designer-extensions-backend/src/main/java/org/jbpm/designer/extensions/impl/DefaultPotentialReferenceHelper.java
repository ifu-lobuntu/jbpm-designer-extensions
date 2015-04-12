package org.jbpm.designer.extensions.impl;

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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.api.IPotentialReferenceHelper;
import org.jbpm.designer.extensions.emf.util.UriHelper;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.Directory;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.json.JSONException;
import org.json.JSONObject;
import org.omg.dd.di.DiagramElement;

public class DefaultPotentialReferenceHelper implements IPotentialReferenceHelper {
    public static final String SOURCE_ELEMENT = "sourceElement";
    public static final String SOURCE_RESOURCE = "sourceResource";
    public static final String SOURCE_PROFILE = "sourceProfile";

    protected IEmfProfile profile;

    public DefaultPotentialReferenceHelper(IEmfProfile abstractEmfProfile) {
        super();
        this.profile = abstractEmfProfile;
    }

    @SuppressWarnings("unchecked")
    protected <T extends EObject> T getSourceElement(HttpServletRequest req) {
        return (T) req.getAttribute(SOURCE_ELEMENT);
    }
    protected IEmfDiagramProfile getSourceProfile(HttpServletRequest req) {
        return (IEmfDiagramProfile) req.getAttribute(SOURCE_PROFILE);
    }

    protected boolean isEmpty(String targetProfileName) {
        return targetProfileName == null || targetProfileName.trim().isEmpty();
    }

    public String findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception {
        if (action.equals("getEmfElements")) {
            String nameFeature = req.getParameter("nameFeature");
            String[] elementTypes = req.getParameter("elementTypes").split("\\|");
            List<String> allPackageNames = getPackageNamesFromRepository(profile);
            ResourceSet rst = new ResourceSetImpl();
            profile.prepareResourceSet(rst);
            UriHelper.setPlatformUriHandler(rst, profile.getUriHandler());
            for (String packageName : allPackageNames) {
                @SuppressWarnings("rawtypes")
                Collection<Asset> listAssetsRecursively = profile.getRepository().listAssetsRecursively(packageName,
                        new FilterByExtension(profile.getSerializedModelExtension()));
                for (Asset<?> asset : listAssetsRecursively) {
                    String id = EMFVFSURIConverter.toPlatformRelativeString(asset.getUniqueId());
                    URI uri = URI.createPlatformResourceURI(id, true);
                    rst.getResource(uri, true);
                }
            }
            Collection<EObject> results = new ArrayList<EObject>();
            for (Resource resource : new ArrayList<Resource>(rst.getResources())) {
                TreeIterator<EObject> ti = resource.getAllContents();
                while (ti.hasNext()) {
                    EObject eObject = (EObject) ti.next();
                    if (eObject instanceof DiagramElement) {
                        EList<EObject> mes = ((DiagramElement) eObject).getModelElement();
                        if (mes.size() > 0) {
                            eObject = mes.get(0);
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
            return toEobjectReferenceJson(results, nameFeature).toString();
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
                jsonObject.put(eObject.eGet(eObject.eClass().getEStructuralFeature(nameFeature)) + "|" + eObject.eResource().getURI().toPlatformString(true),
                        "");
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

    private List<String> getPackageNamesFromRepository(IEmfProfile profile) {
        List<String> packages = new ArrayList<String>();

        Repository repository = profile.getRepository();
        Collection<Directory> directories = repository.listDirectories("/");
        for (Directory directory : directories) {
            packages.add(directory.getLocation() + directory.getName());
        }

        return packages;
    }
    protected Object getValue(IEmfDiagramProfile profile, Object currentTarget, String binding){
        String[] split = binding.split("\\.");
        Object currentValue=currentTarget;
        for (String string : split) {
            currentValue=getStructuralFeatureValue(profile, currentValue, string);
        }
        return currentValue;
    }
    private Object getStructuralFeatureValue(IEmfDiagramProfile profile, Object currentTarget, String featureName) {
        if (currentTarget instanceof EObject) {
            EStructuralFeature sf  = ((EObject) currentTarget).eClass().getEStructuralFeature(featureName);
            return ((EObject) currentTarget).eGet(sf);
        } else if (currentTarget instanceof FeatureMap) {
            EStructuralFeature sf = profile.demandFeature(featureName);
            return ((FeatureMap) currentTarget).get(sf,true);
        }
        return null;
    }

}