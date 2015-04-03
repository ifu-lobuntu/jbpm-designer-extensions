package org.jbpm.designer.extensions.emf.util;

import java.util.Collections;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.jboss.drools.DroolsPackage;
import org.omg.spec.bpmn.non.normative.color.ColorPackage;

import bpsim.BpsimPackage;

@ApplicationScoped
public class Bpmn2EmfProfile extends AbstractEmfProfile {

    @Override
    public Factory getResourceFactory() {
        return new Bpmn2ResourceFactoryImpl();
    }

    @Override
    public EPackage[] getEPackages() {
        return new EPackage[]{Bpmn2Package.eINSTANCE, BpmnDiPackage.eINSTANCE, DroolsPackage.eINSTANCE, BpsimPackage.eINSTANCE, ColorPackage.eINSTANCE};
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
    public Map<String, Object> buildDefaultResourceOptions() {
        return Collections.emptyMap();
    }

}
