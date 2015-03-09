/**
 */
package org.jbpm.designer.dd.jbpmdd.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.jbpm.designer.dd.jbpmdd.BoundariedShape;
import org.jbpm.designer.dd.jbpmdd.JBPMDDPackage;
import org.omg.dd.di.Shape;
import org.omg.dd.di.impl.ShapeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundaried Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.jbpm.designer.dd.jbpmdd.impl.BoundariedShapeImpl#getBoundaryShapes <em>Boundary Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundariedShapeImpl extends ShapeImpl implements BoundariedShape {
    /**
     * The cached value of the '{@link #getBoundaryShapes() <em>Boundary Shapes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoundaryShapes()
     * @generated
     * @ordered
     */
    protected EList<Shape> boundaryShapes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BoundariedShapeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return JBPMDDPackage.Literals.BOUNDARIED_SHAPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Shape> getBoundaryShapes() {
        if (boundaryShapes == null) {
            boundaryShapes = new EObjectResolvingEList<Shape>(Shape.class, this, JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES);
        }
        return boundaryShapes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES:
                return getBoundaryShapes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES:
                getBoundaryShapes().clear();
                getBoundaryShapes().addAll((Collection<? extends Shape>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES:
                getBoundaryShapes().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case JBPMDDPackage.BOUNDARIED_SHAPE__BOUNDARY_SHAPES:
                return boundaryShapes != null && !boundaryShapes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //BoundariedShapeImpl
