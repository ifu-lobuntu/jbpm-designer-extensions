package org.jbpm.designer.emf.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.dd.cmmn.dc.DcPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class GenericEcoreComparator {
    Map<String, EObject> outputMap = new HashMap<String, EObject>();
    Map<String, EObject> inputMap = new HashMap<String, EObject>();
    Set<EClass> ignoreIdsFrom = new HashSet<EClass>();
    {
        ignoreIdsFrom.add(DcPackage.eINSTANCE.getPoint());
        ignoreIdsFrom.add(DcPackage.eINSTANCE.getBounds());
    }

    public GenericEcoreComparator(XMLResource inputResource, XMLResource outputResource) {
        populateMap(inputResource, this.inputMap);
        populateMap(outputResource, this.outputMap);
    }

    public GenericEcoreComparator(XMLResource inputResource, XMLResource outputResource, Set<EClass> moreIdsToIgnore) {
        ignoreIdsFrom.addAll(moreIdsToIgnore);
        populateMap(inputResource, this.inputMap);
        populateMap(outputResource, this.outputMap);
    }

    private void populateMap(XMLResource sourceResource, Map<String, EObject> targetMap) {
        TreeIterator<EObject> allContents = sourceResource.getAllContents();
        while (allContents.hasNext()) {
            EObject eObject = (EObject) allContents.next();
            if (!ignoreIdsFrom.contains(eObject.eClass())) {
                EStructuralFeature id = eObject.eClass().getEIDAttribute();
                String idVal = null;
                if (id instanceof EAttribute) {
                    idVal = (String) eObject.eGet(id);
                }
                if (idVal == null) {
                    idVal = (String) sourceResource.getID(eObject);
                }
                if (idVal != null) {
                    targetMap.put(idVal, eObject);
                }
            }
        }
    }

    public void validate() {
        assertEquals(inputMap.size(), outputMap.size());
        for (Entry<String, EObject> entry : inputMap.entrySet()) {
            EObject found = outputMap.get(entry.getKey());
            EObject expected = entry.getValue();
            fail("Entry " + describeIdentity(expected) + " not found", found!=null);
            validateAllFeatures(found, expected);
        }
    }

    private void fail(String string, boolean b) {
        if(!b){
            throw new AssertionError(string);
        }
    }

    private void assertEquals(int size, int size2) {
        if(size!=size2){
            throw new AssertionError(size + "<>" + size2);
        }

    }

    private void validateAllFeatures(EObject found, EObject expected) {
        for (EStructuralFeature f : expected.eClass().getEAllStructuralFeatures()) {
            if (!f.isDerived()) {
                assertEquals("Element not of the same type!", expected.eClass(), found.eClass());
                validate(expected, f, expected.eGet(f), found.eGet(f));
            }
        }
    }

    private void assertEquals(String string, Object eClass, Object eClass2) {
        if(eClass!=null && eClass2 !=null){
            if(!eClass.equals(eClass2)){
                throw new AssertionError(string + ": " + eClass +"<>" + eClass2);
            }
        }else if(!(eClass == null && eClass2==null)){
            throw new AssertionError(string + ": " + eClass +"<>" + eClass2);
        }
    }

    private void validate(EObject value, EStructuralFeature f, Object expected, Object found) {
        String evaluating = "Feature " + f.getName() + " of " + describeIdentity(value);
        if (expected == null) {
            fail(evaluating + "Both values should be null:", found==null);
        } else {
            fail(evaluating + "Both values should be not-null:", found!=null);
            assertEquals(evaluating + "Value not of the same type!", expected.getClass(), found.getClass());
            if (expected instanceof Number || expected instanceof String || expected instanceof Boolean || expected instanceof Enumerator) {
                assertEquals(evaluating + "Values not the same.", expected, found);
            } else if (expected instanceof EObject) {
                EObject eObject = (EObject) expected;
                EObject eObject2 = (EObject) found;
                assertEquals(evaluating + "Element not of the same type!", eObject.eClass(), eObject2.eClass());
                EStructuralFeature id = eObject.eClass().getEIDAttribute();
                if (id instanceof EAttribute) {
                    Object id1 = eObject.eGet(id);
                    Object id2 = eObject2.eGet(id);
                    if (id1 != null && id2 != null) {
                        assertEquals("", id1, id2);
                    } else if (id1 == null && id2 == null) {
                        assertEObjectDirectStateEquals(eObject, eObject2);
                    } else {
                        fail("Both IDs must either be null or not-null",false);
                    }
                } else {
                    assertEObjectDirectStateEquals(eObject, eObject2);
                }
                if(f instanceof EReference && ((EReference) f).isContainment()){
                    validateAllFeatures(eObject, eObject2);
                }
            } else if (expected instanceof EList) {
                List<Object> eList = new ArrayList<Object>((EList<?>) expected);
                List<Object> eList2 = new ArrayList<Object>((EList<?>) found);
                if (f.getEType() instanceof EClass) {
                    EClass ec = (EClass) f.getEType();
                    EAttribute comparableFeature = ec.getEIDAttribute();
                    if (comparableFeature == null) {
                        comparableFeature = (EAttribute) ec.getEStructuralFeature("name");
                    }
                    if (comparableFeature != null) {
                        Comparator<Object> comparator = new Comparator<Object>() {
                            @SuppressWarnings({ "unchecked", "rawtypes" })
                            @Override
                            public int compare(Object arg0, Object arg1) {
                                EObject eObject1 = (EObject) arg0;
                                EObject eObject2 = (EObject) arg1;
                                int result=describeIdentity(eObject1).compareTo(describeIdentity(eObject2));
                                if(result==0){
                                    result=describeState(eObject1).compareTo(describeState(eObject2));
                                }
                                return result;
                            }

                        };
                        Collections.sort(eList, comparator);
                        Collections.sort(eList2, comparator);
                    }
                }
                assertEquals(evaluating + " lists not the same size: ", eList.size(), eList2.size());
                for (int i = 0; i < eList.size(); i++) {
                    validate(value, f, eList.get(i), eList2.get(i));
                    if(f instanceof EReference && ((EReference) f).isContainment()){
                        validateAllFeatures((EObject) eList.get(i), (EObject)eList2.get(i));
                    }
                }
            }
        }
    }

    private String describeIdentity(EObject value) {
        if(value==null){
            return "null";
        }
        EStructuralFeature name = value.eClass().getEStructuralFeature("name");
        String identifyingString = null;
        if (name != null) {
            identifyingString = (String) value.eGet(name);
        }
        if (identifyingString == null) {
            if (value.eClass().getEIDAttribute() != null) {
                identifyingString = (String) value.eGet(value.eClass().getEIDAttribute());
            }
        }
        if (identifyingString == null) {
            identifyingString= ((XMLResource) value.eResource()).getID(value);
        }
        if (identifyingString == null) {
            identifyingString=describeState(value);
        }
        return value.eClass().getName() + "[" + identifyingString + "]";
    }

    private void assertEObjectDirectStateEquals(EObject eObject, EObject eObject2) {
        EList<EAttribute> eAllAttributes = eObject.eClass().getEAllAttributes();
        for (EAttribute eAttribute : eAllAttributes) {
            Object attr2 = eObject2.eGet(eAttribute);
            Object attr1 = eObject.eGet(eAttribute);
            if (attr1 != null && attr2 != null) {
                if (attr1 instanceof EList) {
                    // todo
                } else {
                    assertEquals("", attr1, attr2);
                }
            } else {
                assertEquals("Attribute " + eAttribute.getName() + " not equal", attr1,attr2);
            }
        }
    }

    private String describeState(EObject eObject) {
        StringBuilder sb = new StringBuilder();
        for (EAttribute a : eObject.eClass().getEAllAttributes()) {
            sb.append(a.getName());
            sb.append("=");
            sb.append(eObject.eGet(a));
            sb.append(";");
        }
        for (EReference a : eObject.eClass().getEAllReferences()) {
            if (!a.isContainment() && !a.isDerived() && !a.isMany()) {
                sb.append(a.getName());
                sb.append("=");
                sb.append(describeIdentity((EObject) eObject.eGet(a)));
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
