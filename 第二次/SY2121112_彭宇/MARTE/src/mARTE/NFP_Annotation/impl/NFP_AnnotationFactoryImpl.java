/**
 */
package mARTE.NFP_Annotation.impl;

import mARTE.NFP_Annotation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFP_AnnotationFactoryImpl extends EFactoryImpl implements NFP_AnnotationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NFP_AnnotationFactory init() {
		try {
			NFP_AnnotationFactory theNFP_AnnotationFactory = (NFP_AnnotationFactory)EPackage.Registry.INSTANCE.getEFactory(NFP_AnnotationPackage.eNS_URI);
			if (theNFP_AnnotationFactory != null) {
				return theNFP_AnnotationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NFP_AnnotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_AnnotationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NFP_AnnotationPackage.NFP_CONSTRAINT: return createNFP_Constraint();
			case NFP_AnnotationPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case NFP_AnnotationPackage.ANNOTATED_MODEL: return createAnnotatedModel();
			case NFP_AnnotationPackage.MODELING_CONCERN: return createModelingConcern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NFP_AnnotationPackage.CONSTRAIN_KIND:
				return createConstrainKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NFP_AnnotationPackage.CONSTRAIN_KIND:
				return convertConstrainKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Constraint createNFP_Constraint() {
		NFP_ConstraintImpl nfP_Constraint = new NFP_ConstraintImpl();
		return nfP_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedElement createAnnotatedElement() {
		AnnotatedElementImpl annotatedElement = new AnnotatedElementImpl();
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedModel createAnnotatedModel() {
		AnnotatedModelImpl annotatedModel = new AnnotatedModelImpl();
		return annotatedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingConcern createModelingConcern() {
		ModelingConcernImpl modelingConcern = new ModelingConcernImpl();
		return modelingConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainKind createConstrainKindFromString(EDataType eDataType, String initialValue) {
		ConstrainKind result = ConstrainKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstrainKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_AnnotationPackage getNFP_AnnotationPackage() {
		return (NFP_AnnotationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NFP_AnnotationPackage getPackage() {
		return NFP_AnnotationPackage.eINSTANCE;
	}

} //NFP_AnnotationFactoryImpl
