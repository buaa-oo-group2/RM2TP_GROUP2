/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.BaseQuantity;
import mARTE.Dimension;
import mARTE.MARTEPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.DimensionImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link mARTE.impl.DimensionImpl#getBaseExponents <em>Base Exponents</em>}</li>
 *   <li>{@link mARTE.impl.DimensionImpl#getBasequantity <em>Basequantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseExponents() <em>Base Exponents</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseExponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> baseExponents;

	/**
	 * The cached value of the '{@link #getBasequantity() <em>Basequantity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasequantity()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseQuantity> basequantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.DIMENSION__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getBaseExponents() {
		if (baseExponents == null) {
			baseExponents = new EDataTypeUniqueEList<Integer>(Integer.class, this,
					MARTEPackage.DIMENSION__BASE_EXPONENTS);
		}
		return baseExponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseQuantity> getBasequantity() {
		if (basequantity == null) {
			basequantity = new EObjectResolvingEList<BaseQuantity>(BaseQuantity.class, this,
					MARTEPackage.DIMENSION__BASEQUANTITY);
		}
		return basequantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MARTEPackage.DIMENSION__SYMBOL:
			return getSymbol();
		case MARTEPackage.DIMENSION__BASE_EXPONENTS:
			return getBaseExponents();
		case MARTEPackage.DIMENSION__BASEQUANTITY:
			return getBasequantity();
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
		case MARTEPackage.DIMENSION__SYMBOL:
			setSymbol((String) newValue);
			return;
		case MARTEPackage.DIMENSION__BASE_EXPONENTS:
			getBaseExponents().clear();
			getBaseExponents().addAll((Collection<? extends Integer>) newValue);
			return;
		case MARTEPackage.DIMENSION__BASEQUANTITY:
			getBasequantity().clear();
			getBasequantity().addAll((Collection<? extends BaseQuantity>) newValue);
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
		case MARTEPackage.DIMENSION__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case MARTEPackage.DIMENSION__BASE_EXPONENTS:
			getBaseExponents().clear();
			return;
		case MARTEPackage.DIMENSION__BASEQUANTITY:
			getBasequantity().clear();
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
		case MARTEPackage.DIMENSION__SYMBOL:
			return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
		case MARTEPackage.DIMENSION__BASE_EXPONENTS:
			return baseExponents != null && !baseExponents.isEmpty();
		case MARTEPackage.DIMENSION__BASEQUANTITY:
			return basequantity != null && !basequantity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(", baseExponents: ");
		result.append(baseExponents);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
