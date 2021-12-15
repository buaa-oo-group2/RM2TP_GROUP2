/**
 */
package mARTE.NFP_Annotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage
 * @generated
 */
public interface NFP_AnnotationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NFP_AnnotationFactory eINSTANCE = mARTE.NFP_Annotation.impl.NFP_AnnotationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NFP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Constraint</em>'.
	 * @generated
	 */
	NFP_Constraint createNFP_Constraint();

	/**
	 * Returns a new object of class '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Element</em>'.
	 * @generated
	 */
	AnnotatedElement createAnnotatedElement();

	/**
	 * Returns a new object of class '<em>Annotated Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Model</em>'.
	 * @generated
	 */
	AnnotatedModel createAnnotatedModel();

	/**
	 * Returns a new object of class '<em>Modeling Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modeling Concern</em>'.
	 * @generated
	 */
	ModelingConcern createModelingConcern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NFP_AnnotationPackage getNFP_AnnotationPackage();

} //NFP_AnnotationFactory
