/**
 */
package mARTE.impl;

import java.util.Collection;

import mARTE.AnnotatedElement;
import mARTE.AnnotatedModel;
import mARTE.MARTEPackage;
import mARTE.ModelingConcern;
import mARTE.NFP_Constrain;

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
 * An implementation of the model object '<em><b>Annotated Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mARTE.impl.AnnotatedModelImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link mARTE.impl.AnnotatedModelImpl#getAnnotationConcern <em>Annotation Concern</em>}</li>
 *   <li>{@link mARTE.impl.AnnotatedModelImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatedModelImpl extends MinimalEObjectImpl.Container implements AnnotatedModel {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotatedElement> owner;

	/**
	 * The cached value of the '{@link #getAnnotationConcern() <em>Annotation Concern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationConcern()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingConcern> annotationConcern;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected NFP_Constrain context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTEPackage.Literals.ANNOTATED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotatedElement> getOwner() {
		if (owner == null) {
			owner = new EObjectContainmentEList<AnnotatedElement>(AnnotatedElement.class, this,
					MARTEPackage.ANNOTATED_MODEL__OWNER);
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingConcern> getAnnotationConcern() {
		if (annotationConcern == null) {
			annotationConcern = new EObjectResolvingEList<ModelingConcern>(ModelingConcern.class, this,
					MARTEPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN);
		}
		return annotationConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Constrain getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(NFP_Constrain newContext, NotificationChain msgs) {
		NFP_Constrain oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MARTEPackage.ANNOTATED_MODEL__CONTEXT, oldContext, newContext);
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
	public void setContext(NFP_Constrain newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.ANNOTATED_MODEL__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MARTEPackage.ANNOTATED_MODEL__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MARTEPackage.ANNOTATED_MODEL__CONTEXT, newContext,
					newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MARTEPackage.ANNOTATED_MODEL__OWNER:
			return ((InternalEList<?>) getOwner()).basicRemove(otherEnd, msgs);
		case MARTEPackage.ANNOTATED_MODEL__CONTEXT:
			return basicSetContext(null, msgs);
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
		case MARTEPackage.ANNOTATED_MODEL__OWNER:
			return getOwner();
		case MARTEPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
			return getAnnotationConcern();
		case MARTEPackage.ANNOTATED_MODEL__CONTEXT:
			return getContext();
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
		case MARTEPackage.ANNOTATED_MODEL__OWNER:
			getOwner().clear();
			getOwner().addAll((Collection<? extends AnnotatedElement>) newValue);
			return;
		case MARTEPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
			getAnnotationConcern().clear();
			getAnnotationConcern().addAll((Collection<? extends ModelingConcern>) newValue);
			return;
		case MARTEPackage.ANNOTATED_MODEL__CONTEXT:
			setContext((NFP_Constrain) newValue);
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
		case MARTEPackage.ANNOTATED_MODEL__OWNER:
			getOwner().clear();
			return;
		case MARTEPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
			getAnnotationConcern().clear();
			return;
		case MARTEPackage.ANNOTATED_MODEL__CONTEXT:
			setContext((NFP_Constrain) null);
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
		case MARTEPackage.ANNOTATED_MODEL__OWNER:
			return owner != null && !owner.isEmpty();
		case MARTEPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
			return annotationConcern != null && !annotationConcern.isEmpty();
		case MARTEPackage.ANNOTATED_MODEL__CONTEXT:
			return context != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotatedModelImpl
