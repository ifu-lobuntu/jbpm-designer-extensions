/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#isFungible <em>Is Fungible</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getStore <em>Store</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getMethod <em>Method</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#isShareable <em>Is Shareable</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getFlow <em>Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItem()
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
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItem_Definition()
     * @model ordered="false"
     * @generated
     */
    BusinessItemDefinition getDefinition();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#getDefinition <em>Definition</em>}' reference.
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
     * @see #setIsFungible(boolean)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItem_IsFungible()
     * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isFungible();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#isFungible <em>Is Fungible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Fungible</em>' attribute.
     * @see #isFungible()
     * @generated
     */
    void setIsFungible(boolean value);

    /**
     * Returns the value of the '<em><b>Store</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Store}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.Store#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Store</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Store</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItem_Store()
     * @see org.pavanecce.vdml.metamodel.vdml.Store#getResource
     * @model opposite="resource" ordered="false"
     * @generated
     */
    EList<Store> getStore();

    /**
     * Returns the value of the '<em><b>Method</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getMethodResource <em>Method Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItem_Method()
     * @see org.pavanecce.vdml.metamodel.vdml.CapabilityMethod#getMethodResource
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
     * @see #setIsShareable(boolean)
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItem_IsShareable()
     * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true" ordered="false"
     * @generated
     */
    boolean isShareable();

    /**
     * Sets the value of the '{@link org.pavanecce.vdml.metamodel.vdml.BusinessItem#isShareable <em>Is Shareable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Shareable</em>' attribute.
     * @see #isShareable()
     * @generated
     */
    void setIsShareable(boolean value);

    /**
     * Returns the value of the '<em><b>Flow</b></em>' reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow}.
     * It is bidirectional and its opposite is '{@link org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDeliverable <em>Deliverable</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flow</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flow</em>' reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getBusinessItem_Flow()
     * @see org.pavanecce.vdml.metamodel.vdml.DeliverableFlow#getDeliverable
     * @model opposite="deliverable" ordered="false"
     * @generated
     */
    EList<DeliverableFlow> getFlow();

} // BusinessItem
