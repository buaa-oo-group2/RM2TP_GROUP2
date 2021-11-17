/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.MARTEPackage;
import mARTE.Property;
import mARTE.Unit;
import mARTE.ValueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.ValueTypeImpl#getAllowedUnits <em>Allowed Units</em>}</li>
 *   <li>{@link mARTE.impl.ValueTypeImpl#getDefaultUnit <em>Default Unit</em>}</li>
 *   <li>{@link mARTE.impl.ValueTypeImpl#getValueAttribute <em>Value Attribute</em>}</li>
 *   <li>{@link mARTE.impl.ValueTypeImpl#getUnitAttribute <em>Unit Attribute</em>}</li>
 *   <li>{@link mARTE.impl.ValueTypeImpl#getExprAttribute <em>Expr Attribute</em>}</li>
 *   <li>{@link mARTE.impl.ValueTypeImpl#getQualifierAttributes <em>Qualifier Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueTypeImpl extends TupleTypeImpl implements ValueType {
	/**
	 * The cached value of the '{@link #getAllowedUnits() <em>Allowed Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> allowedUnits;

	/**
	 * The cached value of the '{@link #getDefaultUnit() <em>Default Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit defaultUnit;

	/**
	 * The cached value of the '{@link #getValueAttribute() <em>Value Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAttribute()
	 * @generated
	 * @ordered
	 */
	protected Property valueAttribute;

	/**
	 * The cached value of the '{@link #getUnitAttribute() <em>Unit Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAttribute()
	 * @generated
	 * @ordered
	 */
	protected Property unitAttribute;

	/**
	 * The cached value of the '{@link #getExprAttribute() <em>Expr Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExprAttribute()
	 * @generated
	 * @ordered
	 */
	protected Property exprAttribute;

	/**
	 * The cached value of the '{@link #getQualifierAttributes() <em>Qualifier Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> qualifierAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getAllowedUnits() {
		if (allowedUnits == null) {
			allowedUnits = new EObjectResolvingEList<Unit>(Unit.class, this, MARTEPackage.VALUE_TYPE__ALLOWED_UNITS);
		}
		return allowedUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getDefaultUnit() {
		if (defaultUnit != null && defaultUnit.eIsProxy()) {
			InternalEObject oldDefaultUnit = (InternalEObject) defaultUnit;
			defaultUnit = (Unit) eResolveProxy(oldDefaultUnit);
			if (defaultUnit != oldDefaultUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MARTEPackage.VALUE_TYPE__DEFAULT_UNIT,
							oldDefaultUnit, defaultUnit));
			}
		}
		return defaultUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetDefaultUnit() {
		return defaultUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultUnit(Unit newDefaultUnit) {
		Unit oldDefaultUnit = defaultUnit;
		defaultUnit = newDefaultUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.VALUE_TYPE__DEFAULT_UNIT, oldDefaultUnit,
					defaultUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getValueAttribute() {
		return valueAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAttribute(Property newValueAttribute, NotificationChain msgs) {
		Property oldValueAttribute = valueAttribute;
		valueAttribute = newValueAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE, oldValueAttribute, newValueAttribute);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAttribute(Property newValueAttribute) {
		if (newValueAttribute != valueAttribute) {
			NotificationChain msgs = null;
			if (valueAttribute != null)
				msgs = ((InternalEObject) valueAttribute).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE, null, msgs);
			if (newValueAttribute != null)
				msgs = ((InternalEObject) newValueAttribute).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE, null, msgs);
			msgs = basicSetValueAttribute(newValueAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE,
					newValueAttribute, newValueAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getUnitAttribute() {
		return unitAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitAttribute(Property newUnitAttribute, NotificationChain msgs) {
		Property oldUnitAttribute = unitAttribute;
		unitAttribute = newUnitAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE, oldUnitAttribute, newUnitAttribute);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitAttribute(Property newUnitAttribute) {
		if (newUnitAttribute != unitAttribute) {
			NotificationChain msgs = null;
			if (unitAttribute != null)
				msgs = ((InternalEObject) unitAttribute).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE, null, msgs);
			if (newUnitAttribute != null)
				msgs = ((InternalEObject) newUnitAttribute).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE, null, msgs);
			msgs = basicSetUnitAttribute(newUnitAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE,
					newUnitAttribute, newUnitAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getExprAttribute() {
		return exprAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExprAttribute(Property newExprAttribute, NotificationChain msgs) {
		Property oldExprAttribute = exprAttribute;
		exprAttribute = newExprAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE, oldExprAttribute, newExprAttribute);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExprAttribute(Property newExprAttribute) {
		if (newExprAttribute != exprAttribute) {
			NotificationChain msgs = null;
			if (exprAttribute != null)
				msgs = ((InternalEObject) exprAttribute).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE, null, msgs);
			if (newExprAttribute != null)
				msgs = ((InternalEObject) newExprAttribute).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE, null, msgs);
			msgs = basicSetExprAttribute(newExprAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE,
					newExprAttribute, newExprAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getQualifierAttributes() {
		if (qualifierAttributes == null) {
			qualifierAttributes = new EObjectContainmentEList<Property>(Property.class, this,
					MARTEPackage.VALUE_TYPE__QUALIFIER_ATTRIBUTES);
		}
		return qualifierAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE:
			return basicSetValueAttribute(null, msgs);
		case MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE:
			return basicSetUnitAttribute(null, msgs);
		case MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE:
			return basicSetExprAttribute(null, msgs);
		case MARTEPackage.VALUE_TYPE__QUALIFIER_ATTRIBUTES:
			return ((InternalEList<?>) getQualifierAttributes()).basicRemove(otherEnd, msgs);
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
		case MARTEPackage.VALUE_TYPE__ALLOWED_UNITS:
			return getAllowedUnits();
		case MARTEPackage.VALUE_TYPE__DEFAULT_UNIT:
			if (resolve)
				return getDefaultUnit();
			return basicGetDefaultUnit();
		case MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE:
			return getValueAttribute();
		case MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE:
			return getUnitAttribute();
		case MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE:
			return getExprAttribute();
		case MARTEPackage.VALUE_TYPE__QUALIFIER_ATTRIBUTES:
			return getQualifierAttributes();
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
		case MARTEPackage.VALUE_TYPE__ALLOWED_UNITS:
			getAllowedUnits().clear();
			getAllowedUnits().addAll((Collection<? extends Unit>) newValue);
			return;
		case MARTEPackage.VALUE_TYPE__DEFAULT_UNIT:
			setDefaultUnit((Unit) newValue);
			return;
		case MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE:
			setValueAttribute((Property) newValue);
			return;
		case MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE:
			setUnitAttribute((Property) newValue);
			return;
		case MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE:
			setExprAttribute((Property) newValue);
			return;
		case MARTEPackage.VALUE_TYPE__QUALIFIER_ATTRIBUTES:
			getQualifierAttributes().clear();
			getQualifierAttributes().addAll((Collection<? extends Property>) newValue);
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
		case MARTEPackage.VALUE_TYPE__ALLOWED_UNITS:
			getAllowedUnits().clear();
			return;
		case MARTEPackage.VALUE_TYPE__DEFAULT_UNIT:
			setDefaultUnit((Unit) null);
			return;
		case MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE:
			setValueAttribute((Property) null);
			return;
		case MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE:
			setUnitAttribute((Property) null);
			return;
		case MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE:
			setExprAttribute((Property) null);
			return;
		case MARTEPackage.VALUE_TYPE__QUALIFIER_ATTRIBUTES:
			getQualifierAttributes().clear();
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
		case MARTEPackage.VALUE_TYPE__ALLOWED_UNITS:
			return allowedUnits != null && !allowedUnits.isEmpty();
		case MARTEPackage.VALUE_TYPE__DEFAULT_UNIT:
			return defaultUnit != null;
		case MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE:
			return valueAttribute != null;
		case MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE:
			return unitAttribute != null;
		case MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE:
			return exprAttribute != null;
		case MARTEPackage.VALUE_TYPE__QUALIFIER_ATTRIBUTES:
			return qualifierAttributes != null && !qualifierAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueTypeImpl
