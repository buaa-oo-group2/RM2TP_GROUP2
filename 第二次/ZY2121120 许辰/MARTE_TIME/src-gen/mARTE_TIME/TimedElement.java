/**
 */
package mARTE_TIME;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.TimedElement#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedElement()
 * @model abstract="true"
 * @generated
 */
public interface TimedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' reference.
	 * @see #setClock(Clock)
	 * @see mARTE_TIME.MARTE_TIMEPackage#getTimedElement_Clock()
	 * @model
	 * @generated
	 */
	Clock getClock();

	/**
	 * Sets the value of the '{@link mARTE_TIME.TimedElement#getClock <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' reference.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Clock value);

} // TimedElement
