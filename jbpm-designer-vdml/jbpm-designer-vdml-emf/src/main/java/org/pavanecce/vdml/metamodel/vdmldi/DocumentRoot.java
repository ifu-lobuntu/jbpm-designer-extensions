/**
 */
package org.pavanecce.vdml.metamodel.vdmldi;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' containment reference.
     * @see #setDiagram(VDMLDiagram)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_Diagram()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='VDMLDiagram' namespace='##targetNamespace'"
     * @generated
     */
    VDMLDiagram getDiagram();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getDiagram <em>Diagram</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' containment reference.
     * @see #getDiagram()
     * @generated
     */
    void setDiagram(VDMLDiagram value);

    /**
     * Returns the value of the '<em><b>Edge</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Edge</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Edge</em>' containment reference.
     * @see #setEdge(VDMLEdge)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_Edge()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='VDMLEdge' namespace='##targetNamespace' affiliation='http://www.omg.org/spec/DD/20100524/DI#DiagramElement'"
     * @generated
     */
    VDMLEdge getEdge();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getEdge <em>Edge</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Edge</em>' containment reference.
     * @see #getEdge()
     * @generated
     */
    void setEdge(VDMLEdge value);

    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' containment reference.
     * @see #setLabel(VDMLLabel)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_Label()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='VDMLLabel' namespace='##targetNamespace'"
     * @generated
     */
    VDMLLabel getLabel();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabel <em>Label</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' containment reference.
     * @see #getLabel()
     * @generated
     */
    void setLabel(VDMLLabel value);

    /**
     * Returns the value of the '<em><b>Label Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label Style</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label Style</em>' containment reference.
     * @see #setLabelStyle(VDMLLabelStyle)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_LabelStyle()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='VDMLLabelStyle' namespace='##targetNamespace'"
     * @generated
     */
    VDMLLabelStyle getLabelStyle();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getLabelStyle <em>Label Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label Style</em>' containment reference.
     * @see #getLabelStyle()
     * @generated
     */
    void setLabelStyle(VDMLLabelStyle value);

    /**
     * Returns the value of the '<em><b>Plane</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plane</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plane</em>' containment reference.
     * @see #setPlane(VDMLPlane)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_Plane()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='VDMLPlane' namespace='##targetNamespace'"
     * @generated
     */
    VDMLPlane getPlane();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getPlane <em>Plane</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plane</em>' containment reference.
     * @see #getPlane()
     * @generated
     */
    void setPlane(VDMLPlane value);

    /**
     * Returns the value of the '<em><b>Shape</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shape</em>' containment reference.
     * @see #setShape(VDMLShape)
     * @see org.pavanecce.vdml.metamodel.vdmldi.VdmlDiPackage#getDocumentRoot_Shape()
     * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='VDMLShape' namespace='##targetNamespace' affiliation='http://www.omg.org/spec/DD/20100524/DI#DiagramElement'"
     * @generated
     */
    VDMLShape getShape();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdmldi.DocumentRoot#getShape <em>Shape</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shape</em>' containment reference.
     * @see #getShape()
     * @generated
     */
    void setShape(VDMLShape value);

} // DocumentRoot
