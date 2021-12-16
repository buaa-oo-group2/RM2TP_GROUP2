/**
 */
package mARTE_TIME;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mARTE_TIME.Clock#getCurrentTime <em>Current Time</em>}</li>
 * </ul>
 *
 * @see mARTE_TIME.MARTE_TIMEPackage#getClock()
 * @model abstract="true"
 * @generated
 */
public interface Clock extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Time</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time</em>' attribute.
	 * @see #setCurrentTime(float)
	 * @see mARTE_TIME.MARTE_TIMEPackage#getClock_CurrentTime()
	 * @model default="0.0"
	 * @generated
	 */
	float getCurrentTime();

	/**
	 * Sets the value of the '{@link mARTE_TIME.Clock#getCurrentTime <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time</em>' attribute.
	 * @see #getCurrentTime()
	 * @generated
	 */
	void setCurrentTime(float value);

} // Clock
