/**
 */
package org.pavanecce.vdml.metamodel.vdml;

import org.eclipse.emf.common.util.EList;
import org.pavanecce.vdml.metamodel.smm.SmmModel;
import org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Delivery Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getMetricsModel <em>Metrics Model</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getValueLibrary <em>Value Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getCapabilitylibrary <em>Capabilitylibrary</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getBusinessItemLibrary <em>Business Item Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getActor <em>Actor</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getPracticeLibrary <em>Practice Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getRoleLibrary <em>Role Library</em>}</li>
 *   <li>{@link org.pavanecce.vdml.metamodel.vdml.ValueDeliveryModel#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel()
 * @model
 * @generated
 */
public interface ValueDeliveryModel extends VdmlElement {
    /**
     * Returns the value of the '<em><b>Metrics Model</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.smm.SmmModel}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metrics Model</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metrics Model</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_MetricsModel()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<SmmModel> getMetricsModel();

    /**
     * Returns the value of the '<em><b>Value Library</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.ValueLibrary}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Library</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_ValueLibrary()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ValueLibrary> getValueLibrary();

    /**
     * Returns the value of the '<em><b>Capabilitylibrary</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.CapabilityLibrary}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capabilitylibrary</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capabilitylibrary</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_Capabilitylibrary()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<CapabilityLibrary> getCapabilitylibrary();

    /**
     * Returns the value of the '<em><b>Business Item Library</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.BusinessItemLibrary}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Business Item Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Business Item Library</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_BusinessItemLibrary()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<BusinessItemLibrary> getBusinessItemLibrary();

    /**
     * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Actor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Actor</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_Actor()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Actor> getActor();

    /**
     * Returns the value of the '<em><b>Practice Library</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.PracticeLibrary}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Practice Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Practice Library</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_PracticeLibrary()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<PracticeLibrary> getPracticeLibrary();

    /**
     * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Scenario}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scenario</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_Scenario()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    EList<Scenario> getScenario();

    /**
     * Returns the value of the '<em><b>Collaboration</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.Collaboration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Collaboration</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collaboration</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_Collaboration()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Collaboration> getCollaboration();

    /**
     * Returns the value of the '<em><b>Role Library</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdml.RoleLibrary}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role Library</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role Library</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_RoleLibrary()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<RoleLibrary> getRoleLibrary();

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' containment reference list.
     * The list contents are of type {@link org.pavanecce.vdml.metamodel.vdmldi.VDMLDiagram}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' containment reference list.
     * @see org.pavanecce.vdml.metamodel.vdml.VdmlPackage#getValueDeliveryModel_Diagram()
     * @model containment="true"
     * @generated
     */
    EList<VDMLDiagram> getDiagram();

} // ValueDeliveryModel
