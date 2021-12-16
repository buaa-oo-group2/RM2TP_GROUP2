/**
 */
package mARTE.NFP_Annotation.impl;

import java.util.Collection;

import mARTE.NFP_Annotation.AnnotatedElement;
import mARTE.NFP_Annotation.ConstrainKind;
import mARTE.NFP_Annotation.NFP_AnnotationPackage;
import mARTE.NFP_Annotation.NFP_Constraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFP Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Annotation.impl.NFP_ConstraintImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link mARTE.NFP_Annotation.impl.NFP_ConstraintImpl#getConstrainedElement <em>Constrained Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NFP_ConstraintImpl extends MinimalEObjectImpl.Container implements NFP_Constraint {
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
	 * The cached value of the '{@link #getConstrainedElement() <em>Constrained Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotatedElement> constrainedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NFP_AnnotationPackage.Literals.NFP_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_AnnotationPackage.NFP_CONSTRAINT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotatedElement> getConstrainedElement() {
		if (constrainedElement == null) {
			constrainedElement = new EObjectResolvingEList<AnnotatedElement>(AnnotatedElement.class, this, NFP_AnnotationPackage.NFP_CONSTRAINT__CONSTRAINED_ELEMENT);
		}
		return constrainedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NFP_AnnotationPackage.NFP_CONSTRAINT__KIND:
				return getKind();
			case NFP_AnnotationPackage.NFP_CONSTRAINT__CONSTRAINED_ELEMENT:
				return getConstrainedElement();
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
			case NFP_AnnotationPackage.NFP_CONSTRAINT__KIND:
				setKind((ConstrainKind)newValue);
				return;
			case NFP_AnnotationPackage.NFP_CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElement().clear();
				getConstrainedElement().addAll((Collection<? extends AnnotatedElement>)newValue);
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
			case NFP_AnnotationPackage.NFP_CONSTRAINT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case NFP_AnnotationPackage.NFP_CONSTRAINT__CONSTRAINED_ELEMENT:
				getConstrainedElement().clear();
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
			case NFP_AnnotationPackage.NFP_CONSTRAINT__KIND:
				return kind != KIND_EDEFAULT;
			case NFP_AnnotationPackage.NFP_CONSTRAINT__CONSTRAINED_ELEMENT:
				return constrainedElement != null && !constrainedElement.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //NFP_ConstraintImpl
