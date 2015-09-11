/**
 */
package org.omg.vdml;

import org.eclipse.emf.common.util.EList;
import org.jbpm.vdml.dd.vdmldi.VDMLDiagram;
import org.omg.smm.SmmModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Delivery Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getMetricsModel <em>Metrics Model</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getValueLibrary <em>Value Library</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getCapabilitylibrary <em>Capabilitylibrary</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getBusinessItemLibrary <em>Business Item Library</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getActor <em>Actor</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getPracticeLibrary <em>Practice Library</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getRoleLibrary <em>Role Library</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.omg.vdml.ValueDeliveryModel#getStoreLibrary <em>Store Library</em>}</li>
 * </ul>
 *
 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel()
 * @model
 * @generated
 */
public interface ValueDeliveryModel extends VdmlElement {
    /**
	 * Returns the value of the '<em><b>Metrics Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.smm.SmmModel}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metrics Model</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Model</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_MetricsModel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<SmmModel> getMetricsModel();

    /**
	 * Returns the value of the '<em><b>Value Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.ValueLibrary}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Library</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_ValueLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<ValueLibrary> getValueLibrary();

    /**
	 * Returns the value of the '<em><b>Capabilitylibrary</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.CapabilityLibrary}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capabilitylibrary</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilitylibrary</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_Capabilitylibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<CapabilityLibrary> getCapabilitylibrary();

    /**
	 * Returns the value of the '<em><b>Business Item Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.BusinessItemLibrary}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Item Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Item Library</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_BusinessItemLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<BusinessItemLibrary> getBusinessItemLibrary();

    /**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Actor}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_Actor()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<Actor> getActor();

    /**
	 * Returns the value of the '<em><b>Practice Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.PracticeLibrary}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Practice Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Library</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_PracticeLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<PracticeLibrary> getPracticeLibrary();

    /**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Scenario}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_Scenario()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
    EList<Scenario> getScenario();

    /**
	 * Returns the value of the '<em><b>Collaboration</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.Collaboration}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collaboration</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_Collaboration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<Collaboration> getCollaboration();

    /**
	 * Returns the value of the '<em><b>Role Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.RoleLibrary}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Library</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_RoleLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
    EList<RoleLibrary> getRoleLibrary();

    /**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link org.jbpm.vdml.dd.vdmldi.VDMLDiagram}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_Diagram()
	 * @model containment="true"
	 * @generated
	 */
    EList<VDMLDiagram> getDiagram();

				/**
	 * Returns the value of the '<em><b>Store Library</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.vdml.StoreLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Library</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Library</em>' containment reference list.
	 * @see org.omg.vdml.VDMLPackage#getValueDeliveryModel_StoreLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StoreLibrary> getStoreLibrary();

} // ValueDeliveryModel
