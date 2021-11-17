/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.AnnotatedElement;
import mARTE.ConstrainKind;
import mARTE.MARTEPackage;
import mARTE.Mode;
import mARTE.NFP_Constrain;
import mARTE.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFP Constrain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.NFP_ConstrainImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link mARTE.impl.NFP_ConstrainImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link mARTE.impl.NFP_ConstrainImpl#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link mARTE.impl.NFP_ConstrainImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NFP_ConstrainImpl extends MinimalEObjectImpl.Container implements NFP_Constrain {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConstrainKind KIND_EDEFAULT = ConstrainKind.REQUIRED;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConstrainKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Mode> mode;

	/**
	 * The cached value of the '{@link #getConstrainedElement() <em>Constrained Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotatedElement> constrainedElement;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> specification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_ConstrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.NFP_CONSTRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConstrainKind newKind) {
		ConstrainKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.NFP_CONSTRAIN__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mode> getMode() {
		if (mode == null) {
			mode = new EObjectResolvingEList<Mode>(Mode.class, this, MARTEPackage.NFP_CONSTRAIN__MODE);
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotatedElement> getConstrainedElement() {
		if (constrainedElement == null) {
			constrainedElement = new EObjectResolvingEList<AnnotatedElement>(AnnotatedElement.class, this,
					MARTEPackage.NFP_CONSTRAIN__CONSTRAINED_ELEMENT);
		}
		return constrainedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getSpecification() {
		if (specification == null) {
			specification = new EObjectContainmentEList<ValueSpecification>(ValueSpecification.class, this,
					MARTEPackage.NFP_CONSTRAIN__SPECIFICATION);
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MARTEPackage.NFP_CONSTRAIN__SPECIFICATION:
			return ((InternalEList<?>) getSpecification()).basicRemove(otherEnd, msgs);
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
		case MARTEPackage.NFP_CONSTRAIN__KIND:
			return getKind();
		case MARTEPackage.NFP_CONSTRAIN__MODE:
			return getMode();
		case MARTEPackage.NFP_CONSTRAIN__CONSTRAINED_ELEMENT:
			return getConstrainedElement();
		case MARTEPackage.NFP_CONSTRAIN__SPECIFICATION:
			return getSpecification();
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
		case MARTEPackage.NFP_CONSTRAIN__KIND:
			setKind((ConstrainKind) newValue);
			return;
		case MARTEPackage.NFP_CONSTRAIN__MODE:
			getMode().clear();
			getMode().addAll((Collection<? extends Mode>) newValue);
			return;
		case MARTEPackage.NFP_CONSTRAIN__CONSTRAINED_ELEMENT:
			getConstrainedElement().clear();
			getConstrainedElement().addAll((Collection<? extends AnnotatedElement>) newValue);
			return;
		case MARTEPackage.NFP_CONSTRAIN__SPECIFICATION:
			getSpecification().clear();
			getSpecification().addAll((Collection<? extends ValueSpecification>) newValue);
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
		case MARTEPackage.NFP_CONSTRAIN__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case MARTEPackage.NFP_CONSTRAIN__MODE:
			getMode().clear();
			return;
		case MARTEPackage.NFP_CONSTRAIN__CONSTRAINED_ELEMENT:
			getConstrainedElement().clear();
			return;
		case MARTEPackage.NFP_CONSTRAIN__SPECIFICATION:
			getSpecification().clear();
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
		case MARTEPackage.NFP_CONSTRAIN__KIND:
			return kind != KIND_EDEFAULT;
		case MARTEPackage.NFP_CONSTRAIN__MODE:
			return mode != null && !mode.isEmpty();
		case MARTEPackage.NFP_CONSTRAIN__CONSTRAINED_ELEMENT:
			return constrainedElement != null && !constrainedElement.isEmpty();
		case MARTEPackage.NFP_CONSTRAIN__SPECIFICATION:
			return specification != null && !specification.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //NFP_ConstrainImpl
