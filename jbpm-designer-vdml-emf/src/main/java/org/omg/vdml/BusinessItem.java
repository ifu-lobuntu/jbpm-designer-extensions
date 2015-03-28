/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.vdml.BusinessItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItem#getIsFungible <em>Is Fungible</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItem#getStore <em>Store</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItem#getMethod <em>Method</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItem#getIsShareable <em>Is Shareable</em>}</li>
 *   <li>{@link org.omg.vdml.BusinessItem#getFlow <em>Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.vdml.VDMLPackage#getBusinessItem()
 * @model
 * @generated
 */
public interface BusinessItem extends MeasurableElement {
    /**
     * Returns the value of the '<em><b>Definition</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definition</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Definition</em>' reference.
     * @see #setDefinition(BusinessItemDefinition)
     * @see org.omg.vdml.VDMLPackage#getBusinessItem_Definition()
     * @model ordered="false"
     * @generated
     */
    BusinessItemDefinition getDefinition();

    /**
     * Sets the value of the '{@link org.omg.vdml.BusinessItem#getDefinition <em>Definition</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Definition</em>' reference.
     * @see #getDefinition()
     * @generated
     */
    void setDefinition(BusinessItemDefinition value);

    /**
     * Returns the value of the '<em><b>Is Fungible</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Fungible</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Fungible</em>' attribute.
     * @see #setIsFungible(Boolean)
     * @see org.omg.vdml.VDMLPackage#getBusinessItem_IsFungible()
     * @model default="true" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsFungible();

    /**
     * Sets the value of the '{@link org.omg.vdml.BusinessItem#getIsFungible <em>Is Fungible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Fungible</em>' attribute.
     * @see #getIsFungible()
     * @generated
     */
    void setIsFungible(Boolean value);

    /**
     * Returns the value of the '<em><b>Store</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.Store}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.Store#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Store</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Store</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getBusinessItem_Store()
     * @see org.omg.vdml.Store#getResource
     * @model opposite="resource" ordered="false"
     * @generated
     */
    EList<Store> getStore();

    /**
     * Returns the value of the '<em><b>Method</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.CapabilityMethod}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.CapabilityMethod#getMethodResource <em>Method Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getBusinessItem_Method()
     * @see org.omg.vdml.CapabilityMethod#getMethodResource
     * @model opposite="methodResource" ordered="false"
     * @generated
     */
    EList<CapabilityMethod> getMethod();

    /**
     * Returns the value of the '<em><b>Is Shareable</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Shareable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Shareable</em>' attribute.
     * @see #setIsShareable(Boolean)
     * @see org.omg.vdml.VDMLPackage#getBusinessItem_IsShareable()
     * @model default="false" dataType="org.omg.dd.primitivetypes.Boolean" required="true" ordered="false"
     * @generated
     */
    Boolean getIsShareable();

    /**
     * Sets the value of the '{@link org.omg.vdml.BusinessItem#getIsShareable <em>Is Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Shareable</em>' attribute.
     * @see #getIsShareable()
     * @generated
     */
    void setIsShareable(Boolean value);

    /**
     * Returns the value of the '<em><b>Flow</b></em>' reference list.
     * The list contents are of type {@link org.omg.vdml.DeliverableFlow}.
     * It is bidirectional and its opposite is '{@link org.omg.vdml.DeliverableFlow#getDeliverable <em>Deliverable</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow</em>' reference list.
     * @see org.omg.vdml.VDMLPackage#getBusinessItem_Flow()
     * @see org.omg.vdml.DeliverableFlow#getDeliverable
     * @model opposite="deliverable" ordered="false"
     * @generated
     */
    EList<DeliverableFlow> getFlow();

} // BusinessItem
