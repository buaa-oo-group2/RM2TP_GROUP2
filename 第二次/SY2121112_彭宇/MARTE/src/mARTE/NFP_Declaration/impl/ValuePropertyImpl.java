/**
 */
package mARTE.NFP_Declaration.impl;

import mARTE.NFP_Declaration.NFP_DeclarationPackage;
import mARTE.NFP_Declaration.ValueProperty;
import mARTE.NFP_Declaration.ValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Declaration.impl.ValuePropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValuePropertyImpl extends MinimalEObjectImpl.Container implements ValueProperty {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ValueType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NFP_DeclarationPackage.Literals.VALUE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ValueType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NFP_DeclarationPackage.VALUE_PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ValueType newType) {
		ValueType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_DeclarationPackage.VALUE_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NFP_DeclarationPackage.VALUE_PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NFP_DeclarationPackage.VALUE_PROPERTY__TYPE:
				setType((ValueType)newValue);
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
			case NFP_DeclarationPackage.VALUE_PROPERTY__TYPE:
				setType((ValueType)null);
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
			case NFP_DeclarationPackage.VALUE_PROPERTY__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ValuePropertyImpl
