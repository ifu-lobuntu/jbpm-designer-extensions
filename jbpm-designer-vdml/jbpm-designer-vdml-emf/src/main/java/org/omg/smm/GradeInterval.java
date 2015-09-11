/**
 */
package org.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.smm.GradeInterval#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see org.omg.smm.SMMPackage#getGradeInterval()
 * @model
 * @generated
 */
public interface GradeInterval extends Interval {
    /**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Symbol</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.omg.smm.SMMPackage#getGradeInterval_Symbol()
	 * @model dataType="org.omg.dd.primitivetypes.String" required="true" ordered="false"
	 * @generated
	 */
    String getSymbol();

    /**
	 * Sets the value of the '{@link org.omg.smm.GradeInterval#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
    void setSymbol(String value);

} // GradeInterval
