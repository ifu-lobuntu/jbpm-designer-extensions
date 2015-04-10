package org.jbpm.designer.extensions.emf.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.omg.dd.dc.DCPackage;

public class GenericEcoreComparator {
    Map<String, EObject> outputMap = new HashMap<String, EObject>();
    Map<String, EObject> inputMap = new HashMap<String, EObject>();
    Set<EClassifier> ignoreIdsFrom = new HashSet<EClassifier>();
    {
        ignoreIdsFrom.add(DCPackage.eINSTANCE.getPoint());
        ignoreIdsFrom.add(DCPackage.eINSTANCE.getBounds());
    }

    public GenericEcoreComparator(XMLResource inputResource, XMLResource outputResource) {
        populateMap(inputResource, this.inputMap);
        populateMap(outputResource, this.outputMap);
    }

    public GenericEcoreComparator(XMLResource inputResource, XMLResource outputResource, Set<EClassifier> moreIdsToIgnore) {
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
        for (Entry<String, EObject> entry : inputMap.entrySet()) {
            EObject found = outputMap.get(entry.getKey());
            EObject expected = entry.getValue();
            fail("Entry " + describeIdentity(expected) + " not found", found != null);
            validateAllFeatures( expected,found);
        }
        assertEquals(inputMap.size(), outputMap.size());
    }

    private void fail(String string, boolean b) {
        if (!b) {
            throw new AssertionError(string);
        }
    }

    private void assertEquals(int size, int size2) {
        if (size != size2) {
            throw new AssertionError(size + "<>" + size2);
        }

    }

    private void validateAllFeatures(EObject expected,EObject found) {
        for (EStructuralFeature f : expected.eClass().getEAllStructuralFeatures()) {
            if (!(f.isDerived() || f instanceof EAttribute && ((EAttribute) f).isID())) {
                assertEquals("Element not of the same type!", expected.eClass(), found.eClass());
                validate(expected, f, expected.eGet(f), found.eGet(f));
            }
        }
    }

    private void assertEquals(String string, Object expected, Object found) {
        if (expected != null && found != null) {
            if (!expected.equals(found)) {
                throw new AssertionError(string + ": " + expected + "<>" + found);
            }
        } else if (!(expected == null && found == null)) {
            throw new AssertionError(string + ": " + expected + "<>" + found);
        }
    }

    private void validate(EObject value, EStructuralFeature f, Object expectedObject, Object foundObject) {
        String evaluating = "Feature " + f.getName() + " of " + describeIdentity(value);
        if (expectedObject == null) {
            fail(evaluating + "Both values should be null:", foundObject == null);
        } else {
            fail(evaluating + "Both values should be not-null:", foundObject != null);
            assertEquals(evaluating + "Value not of the same type!", expectedObject.getClass(), foundObject.getClass());
            if (expectedObject instanceof Number || expectedObject instanceof String || expectedObject instanceof Boolean || expectedObject instanceof Enumerator) {
                assertEquals(evaluating + "Values not the same.", expectedObject, foundObject);
            } else if (expectedObject instanceof EObject) {
                EObject expected = (EObject) expectedObject;
                EObject found = (EObject) foundObject;
                assertEquals(evaluating + "Element not of the same type!", expected.eClass(), found.eClass());
                EStructuralFeature id = expected.eClass().getEIDAttribute();
                if (id instanceof EAttribute && !(this.ignoreIdsFrom.contains(expected.eClass()))) {
                    Object id1 = expected.eGet(id);
                    Object id2 = found.eGet(id);
                    if (id1 != null && id2 != null) {
                        assertEquals("", id1, id2);
                    } else if (id1 == null && id2 == null) {
                        assertEObjectDirectStateEquals(expected, found);
                    } else {
                        fail("Both IDs must either be null or not-null", false);
                    }
                } else {
                    assertEObjectDirectStateEquals(expected, found);
                }
                if (f instanceof EReference && ((EReference) f).isContainment()) {
                    validateAllFeatures(expected, found);
                }
            } else if (expectedObject instanceof EList) {
                List<Object> eList = new ArrayList<Object>((EList<?>) expectedObject);
                List<Object> eList2 = new ArrayList<Object>((EList<?>) foundObject);
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
                                int result = describeIdentity(eObject1).compareTo(describeIdentity(eObject2));
                                if (result == 0) {
                                    result = describeState(eObject1).compareTo(describeState(eObject2));
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
                    if (f instanceof EReference && ((EReference) f).isContainment()) {
                        validateAllFeatures((EObject) eList.get(i), (EObject) eList2.get(i));
                    }
                }
            }
        }
    }

    private String describeIdentity(EObject value) {
        if (value == null) {
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
            identifyingString = ((XMLResource) value.eResource()).getID(value);
        }
        if (identifyingString == null) {
            identifyingString = describeState(value);
        }
        return value.eClass().getName() + "[" + identifyingString + "]";
    }

    private void assertEObjectDirectStateEquals(EObject expected, EObject found) {
        EList<EAttribute> eAllAttributes = expected.eClass().getEAllAttributes();
        for (EAttribute eAttribute : eAllAttributes) {
            if (!eAttribute.isID()) {
                Object expectedAttributeValue = expected.eGet(eAttribute);
                Object foundAttributeValue = found.eGet(eAttribute);
                String msg = "Attribute " + expected.eClass().getName() + ":" + eAttribute.getName() + " not equal";
                if (expectedAttributeValue != null && foundAttributeValue != null) {
                    if (expectedAttributeValue instanceof EList) {
                        // todo
                    } else {
                        assertEquals(msg, expectedAttributeValue, foundAttributeValue);
                    }
                } else {
                    assertEquals(msg, expectedAttributeValue, foundAttributeValue);
                }
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
