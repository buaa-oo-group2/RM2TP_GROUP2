/**
 */
package mARTE_TIME;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.Root#getTimedelement <em>Timedelement</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Timedelement</b></em>' containment reference list.
	 * The list contents are of type {@link mARTE_TIME.TimedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timedelement</em>' containment reference list.
	 * @see mARTE_TIME.MARTE_TIMEPackage#getRoot_Timedelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimedElement> getTimedelement();

} // Root
