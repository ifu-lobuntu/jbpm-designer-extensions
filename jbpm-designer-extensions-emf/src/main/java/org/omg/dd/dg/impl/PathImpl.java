/**
 */
package org.omg.dd.dg.impl;

import org.eclipse.emf.common.notify.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.*;
import org.eclipse.emf.ecore.plugin.*;
import org.eclipse.emf.ecore.util.*;
import org.omg.dd.dc.*;
import org.omg.dd.dg.*;
import org.omg.dd.dg.util.*;
import org.omg.dd.di.util.*;
import org.omg.dd.dc.util.*;
import org.omg.dd.di.*;

import java.lang.reflect.*;
import java.util.*;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.dd.dg.impl.PathImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathImpl extends MarkedElementImpl implements Path {
    /**
     * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
    protected EList<PathCommand> command;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PathImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DGPackage.Literals.PATH;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PathCommand> getCommand() {
        if (command == null) {
            command = new EObjectContainmentEList<PathCommand>(PathCommand.class, this, DGPackage.PATH__COMMAND);
        }
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DGPackage.PATH__COMMAND:
                return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DGPackage.PATH__COMMAND:
                return getCommand();
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
            case DGPackage.PATH__COMMAND:
                getCommand().clear();
                getCommand().addAll((Collection<? extends PathCommand>)newValue);
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
            case DGPackage.PATH__COMMAND:
                getCommand().clear();
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
            case DGPackage.PATH__COMMAND:
                return command != null && !command.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PathImpl
