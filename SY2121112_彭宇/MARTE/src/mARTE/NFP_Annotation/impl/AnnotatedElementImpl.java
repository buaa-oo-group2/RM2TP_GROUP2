/**
 */
package mARTE.NFP_Annotation.impl;

import java.util.Collection;

import mARTE.NFP_Annotation.AnnotatedElement;
import mARTE.NFP_Annotation.NFP_AnnotationPackage;

import mARTE.NFP_Declaration.NFP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.NFP_Annotation.impl.AnnotatedElementImpl#getNfpDeclaration <em>Nfp Declaration</em>}</li>
 *   <li>{@link mARTE.NFP_Annotation.impl.AnnotatedElementImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatedElementImpl extends MinimalEObjectImpl.Container implements AnnotatedElement {
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
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

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
		return NFP_AnnotationPackage.Literals.ANNOTATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP> getNfpDeclaration() {
		if (nfpDeclaration == null) {
			nfpDeclaration = new EObjectResolvingEList<NFP>(NFP.class, this, NFP_AnnotationPackage.ANNOTATED_ELEMENT__NFP_DECLARATION);
		}
		return nfpDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NFP_AnnotationPackage.ANNOTATED_ELEMENT__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
				return getNfpDeclaration();
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__ELEMENT_NAME:
				return getElementName();
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
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
				getNfpDeclaration().clear();
				getNfpDeclaration().addAll((Collection<? extends NFP>)newValue);
				return;
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__ELEMENT_NAME:
				setElementName((String)newValue);
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
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
				getNfpDeclaration().clear();
				return;
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
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
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__NFP_DECLARATION:
				return nfpDeclaration != null && !nfpDeclaration.isEmpty();
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
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
		result.append(" (elementName: ");
		result.append(elementName);
		result.append(')');
		return result.toString();
	}

} //AnnotatedElementImpl
