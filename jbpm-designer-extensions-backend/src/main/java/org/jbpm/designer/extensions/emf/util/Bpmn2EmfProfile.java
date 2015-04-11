package org.jbpm.designer.extensions.emf.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.impl.Bpmn2PackageImpl;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jboss.drools.DroolsPackage;
import org.jboss.drools.impl.DroolsPackageImpl;
import org.jbpm.designer.bpmn2.resource.JBPMBpmn2ResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.spec.bpmn.non.normative.color.ColorPackage;

import bpsim.BpsimPackage;
import bpsim.impl.BpsimPackageImpl;

@ApplicationScoped
public class Bpmn2EmfProfile extends AbstractEmfProfile {

    @Override
    public Factory getResourceFactory() {
        return new Bpmn2ResourceFactoryImpl();
    }

    @Override
    public EPackage[] getEPackages() {
        return new EPackage[] { Bpmn2Package.eINSTANCE, BpmnDiPackage.eINSTANCE, DroolsPackage.eINSTANCE, BpsimPackage.eINSTANCE, ColorPackage.eINSTANCE };
    }

    @Override
    public String getSerializedModelExtension() {
        return "bpmn2";
    }

    @Override
    public String getName() {
        return "jbpm";
    }

    @Override
    public DefaultPotentialReferenceHelper createPotentialReferenceHelper() {
        return new DefaultPotentialReferenceHelper(this) {
            @Override
            public String findPotentialReferences(HttpServletRequest req, String action, String processId) throws Exception {
                String retVal = null;
                if (action != null) {
                    if (action.equals("showprocessinput")) {
                        retVal = getProcessParametersJson(processId);
                    } else if (action.equals("showprocessoutput")) {
                        retVal = getProcessParametersJson(processId);
                    }
                }
                if (retVal == null) {
                    retVal = super.findPotentialReferences(req, action, processId);
                }
                return retVal;
            }

            public String getProcessParametersJson(String casePath) {
                Process theProcess = getTheProcess(casePath);
                if (theProcess == null) {
                    return "";
                }
                return parametersToJson(theProcess.getProperties());
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

            private String parametersToJson(List<Property> parameterlist) {
                String s = "";
                try {
                    JSONObject params = new JSONObject();
                    JSONArray paramsArray=new JSONArray();
                    params.put("parameters", paramsArray);
                    for (Property cp : parameterlist) {
                        JSONObject p = new JSONObject();
                        p.put("name", (cp.getName() == null || cp.getName().trim().length() == 0) ? cp.getId() : cp.getName());
                        p.put("id", cp.getId());
                        if (cp.getItemSubjectRef() != null) {
                            p.put("expectedType", cp.getItemSubjectRef().getStructureRef());
                        }
                        paramsArray.put(p);
                    }
                    return params.toString();
                } catch (Exception e) {
                    // TODO handle properly
                    e.printStackTrace();
                }
                return s;
            }


        };

    }

    @Override
    public Map<String, Object> buildDefaultResourceOptions() {
        return Collections.emptyMap();
    }

}
