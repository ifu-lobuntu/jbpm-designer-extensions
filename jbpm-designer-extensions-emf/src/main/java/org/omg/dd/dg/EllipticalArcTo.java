/**
 */
package org.omg.dd.dg;

import org.omg.dd.dc.Dimension;
import org.omg.dd.dc.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elliptical Arc To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.dd.dg.EllipticalArcTo#getPoint <em>Point</em>}</li>
 *   <li>{@link org.omg.dd.dg.EllipticalArcTo#getRadii <em>Radii</em>}</li>
 *   <li>{@link org.omg.dd.dg.EllipticalArcTo#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.omg.dd.dg.EllipticalArcTo#getIsLargeArc <em>Is Large Arc</em>}</li>
 *   <li>{@link org.omg.dd.dg.EllipticalArcTo#getIsSweep <em>Is Sweep</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.dd.dg.DGPackage#getEllipticalArcTo()
 * @model
 * @generated
 */
public interface EllipticalArcTo extends PathCommand {
    /**
     * Returns the value of the '<em><b>Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Point</em>' containment reference.
     * @see #setPoint(Point)
     * @see org.omg.dd.dg.DGPackage#getEllipticalArcTo_Point()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Point getPoint();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.EllipticalArcTo#getPoint <em>Point</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Point</em>' containment reference.
     * @see #getPoint()
     * @generated
     */
    void setPoint(Point value);

    /**
     * Returns the value of the '<em><b>Radii</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Radii</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Radii</em>' containment reference.
     * @see #setRadii(Dimension)
     * @see org.omg.dd.dg.DGPackage#getEllipticalArcTo_Radii()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    Dimension getRadii();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.EllipticalArcTo#getRadii <em>Radii</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Radii</em>' containment reference.
     * @see #getRadii()
     * @generated
     */
    void setRadii(Dimension value);

    /**
     * Returns the value of the '<em><b>Rotation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rotation</em>' attribute.
     * @see #setRotation(Double)
     * @see org.omg.dd.dg.DGPackage#getEllipticalArcTo_Rotation()
     * @model dataType="org.omg.dd.primitivetypes.Real" required="true" ordered="false"
     * @generated
     */
    Double getRotation();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.EllipticalArcTo#getRotation <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotation</em>' attribute.
     * @see #getRotation()
     * @generated
     */
    void setRotation(Double value);

    /**
     * Returns the value of the '<em><b>Is Large Arc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Large Arc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Large Arc</em>' attribute.
     * @see #setIsLargeArc(Boolean)
     * @see org.omg.dd.dg.DGPackage#getEllipticalArcTo_IsLargeArc()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsLargeArc();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.EllipticalArcTo#getIsLargeArc <em>Is Large Arc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Large Arc</em>' attribute.
     * @see #getIsLargeArc()
     * @generated
     */
    void setIsLargeArc(Boolean value);

    /**
     * Returns the value of the '<em><b>Is Sweep</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Sweep</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Sweep</em>' attribute.
     * @see #setIsSweep(Boolean)
     * @see org.omg.dd.dg.DGPackage#getEllipticalArcTo_IsSweep()
     * @model dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsSweep();

    /**
     * Sets the value of the '{@link org.omg.dd.dg.EllipticalArcTo#getIsSweep <em>Is Sweep</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Sweep</em>' attribute.
     * @see #getIsSweep()
     * @generated
     */
    void setIsSweep(Boolean value);

} // EllipticalArcTo
