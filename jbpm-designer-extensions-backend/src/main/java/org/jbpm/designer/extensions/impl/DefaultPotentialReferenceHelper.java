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
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.jbpm.designer.extensions.api.IEmfDiagramProfile;
import org.jbpm.designer.extensions.api.IEmfProfile;
import org.jbpm.designer.extensions.api.IPotentialReferenceHelper;
import org.jbpm.designer.repository.Asset;
import org.jbpm.designer.repository.Directory;
import org.jbpm.designer.repository.Repository;
import org.jbpm.designer.repository.filters.FilterByExtension;
import org.jbpm.designer.util.Utils;
import org.jbpm.designer.web.profile.impl.EMFVFSURIConverter;
import org.json.JSONException;
import org.json.JSONObject;
import org.omg.dd.di.DiagramElement;

public class DefaultPotentialReferenceHelper implements IPotentialReferenceHelper {
    static final String SOURCE_ELEMENT = "sourceElement";
    static final String SOURCE_RESOURCE = "sourceResource";
    static final String SOURCE_PROFILE = "sourceProfile";

    protected IEmfProfile profile;

    public DefaultPotentialReferenceHelper(IEmfProfile abstractEmfProfile) {
        super();
        this.profile = abstractEmfProfile;
    }

    public JSONObject findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception {
        if (action.equals("getEmfElements")) {
            ResourceSet rst = buildResourceSet(req);
            List<String> allPackageNames = getPackagesInScope(req);
            loadApplicableResourcesInto(rst, allPackageNames);
            Collection<EObject> results = findPotentialReferencesIn(req, rst);
            return toEobjectReferenceJson(results, req.getParameter("nameFeature"));
        }
        return null;
    }

    private Collection<EObject> findPotentialReferencesIn(HttpServletRequest req, ResourceSet rst) {
        Collection<EObject> results = new ArrayList<EObject>();
        String[] elementTypes = req.getParameter("elementTypes").split("\\|");
        for (Resource resource : new ArrayList<Resource>(rst.getResources())) {
            addPotentialReferencesTo(resource, results, elementTypes);
        }
        return results;
    }

    private void addPotentialReferencesTo(Resource resource, Collection<EObject> results, String[] elementTypes) {
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
                if (eObject.eClass().getName().equals(string)) {
                    results.add(eObject);
                }
            }
        }
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

    private void loadApplicableResourcesInto(ResourceSet rst, List<String> allPackageNames) {
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
    }

    private List<String> getPackagesInScope(HttpServletRequest req) {
        List<String> packageNames = new ArrayList<String>();
        Repository repository = profile.getRepository();
        String assetId = Utils.getEncodedParam(req, "assetid");
        String projectName = EMFVFSURIConverter.getProjectName(EMFVFSURIConverter.toPlatformResourceURI(assetId));
        Collection<Directory> directories = repository.listDirectories(projectName);
        for (Directory directory : directories) {
            String location = directory.getLocation();
            if (!location.endsWith("/")) {
                location = location + "/";
            }
            packageNames.add(location + directory.getName());
        }
        return packageNames;
    }

    private ResourceSet buildResourceSet(HttpServletRequest req) {
        XMLResource rs = getSourceResource(req);
        ResourceSet rst;
        if (rs == null) {
            rst = new ResourceSetImpl();
        } else {
            rst = rs.getResourceSet();
        }
        profile.prepareResourceSet(rst);
        return rst;
    }

    private XMLResource getSourceResource(HttpServletRequest req) {
        return (XMLResource) req.getAttribute(SOURCE_RESOURCE);
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
                String className=eObject.eClass().getName();
                if(eObject instanceof EModelElement){
                    EModelElement em = (EModelElement) eObject;
                    if(em.getEAnnotations().size()==1 && em.getEAnnotations().get(0).getReferences().size()==1){
                        className=em.getEAnnotations().get(0).getReferences().get(0).eClass().getName();
                    }
                }
                jsonObject.put(eObject.eGet(eObject.eClass().getEStructuralFeature(nameFeature)) + "|" + eObject.eResource().getURI().toPlatformString(true) + "|" + className,
                        "");
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return jsonObject;
    }

    protected Object getValue(IEmfDiagramProfile profile, Object currentTarget, String binding) {
        String[] split = binding.split("\\.");
        Object currentValue = currentTarget;
        for (String string : split) {
            currentValue = getStructuralFeatureValue(profile, currentValue, string);
        }
        return currentValue;
    }

    private Object getStructuralFeatureValue(IEmfDiagramProfile profile, Object currentTarget, String featureName) {
        if (currentTarget instanceof EObject) {
            EStructuralFeature sf = ((EObject) currentTarget).eClass().getEStructuralFeature(featureName);
            return ((EObject) currentTarget).eGet(sf);
        } else if (currentTarget instanceof FeatureMap) {
            EStructuralFeature sf = profile.demandFeature(featureName);
            return ((FeatureMap) currentTarget).get(sf, true);
        }
        return null;
    }

}