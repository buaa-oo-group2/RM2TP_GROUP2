/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.AnnotatedElement;
import mARTE.MARTEPackage;
import mARTE.NFP;
import mARTE.ValueSpecification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.AnnotatedElementImpl#getNfpDeclaration <em>Nfp Declaration</em>}</li>
 *   <li>{@link mARTE.impl.AnnotatedElementImpl#getNfpValue <em>Nfp Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatedElementImpl extends ModelElementImpl implements AnnotatedElement {
	/**
	 * The cached value of the '{@link #getNfpDeclaration() <em>Nfp Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNfpDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<NFP> nfpDeclaration;

	/**
	 * The cached value of the '{@link #getNfpValue() <em>Nfp Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNfpValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> nfpValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.ANNOTATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP> getNfpDeclaration() {
		if (nfpDeclaration == null) {
			nfpDeclaration = new EObjectResolvingEList<NFP>(NFP.class, this,
					MARTEPackage.ANNOTATED_ELEMENT__NFP_DECLARATION);
		}
		return nfpDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getNfpValue() {
		if (nfpValue == null) {
			nfpValue = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this,
					MARTEPackage.ANNOTATED_ELEMENT__NFP_VALUE);
		}
		return nfpValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_VALUE:
			return ((InternalEList<?>) getNfpValue()).basicRemove(otherEnd, msgs);
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
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
			return getNfpDeclaration();
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_VALUE:
			return getNfpValue();
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
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
			getNfpDeclaration().clear();
			getNfpDeclaration().addAll((Collection<? extends NFP>) newValue);
			return;
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_VALUE:
			getNfpValue().clear();
			getNfpValue().addAll((Collection<? extends ValueSpecification>) newValue);
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
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
			getNfpDeclaration().clear();
			return;
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_VALUE:
			getNfpValue().clear();
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
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
			return nfpDeclaration != null && !nfpDeclaration.isEmpty();
		case MARTEPackage.ANNOTATED_ELEMENT__NFP_VALUE:
			return nfpValue != null && !nfpValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotatedElementImpl
