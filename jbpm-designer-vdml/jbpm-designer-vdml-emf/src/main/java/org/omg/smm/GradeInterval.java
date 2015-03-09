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
 * <ul>
 *   <li>{@link org.omg.smm.GradeInterval#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.smm.SMMPackage#getGradeInterval()
 * @model
 * @generated
 */
public interface GradeInterval extends Interval {
    /**
     * Returns the value of the '<em><b>Symbol</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Symbol</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Symbol</em>' reference.
     * @see #setSymbol(string)
     * @see org.omg.smm.SMMPackage#getGradeInterval_Symbol()
     * @model required="true" ordered="false"
     * @generated
     */
    string getSymbol();

    /**
     * Sets the value of the '{@link org.omg.smm.GradeInterval#getSymbol <em>Symbol</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Symbol</em>' reference.
     * @see #getSymbol()
     * @generated
     */
    void setSymbol(string value);

} // GradeInterval
