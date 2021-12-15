/**
 */
package mARTE.NFP_Annotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mARTE.NFP_Annotation.NFP_AnnotationFactory
 * @model kind="package"
 * @generated
 */
public interface NFP_AnnotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NFP_Annotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mARTE/NFP_Annotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "annotation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NFP_AnnotationPackage eINSTANCE = mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link mARTE.NFP_Annotation.impl.NFP_ConstraintImpl <em>NFP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Annotation.impl.NFP_ConstraintImpl
	 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getNFP_Constraint()
	 * @generated
	 */
	int NFP_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT__KIND = 0;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT__CONSTRAINED_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>NFP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>NFP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Annotation.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Annotation.impl.AnnotatedElementImpl
	 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Nfp Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__NFP_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__ELEMENT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Annotation.impl.AnnotatedModelImpl <em>Annotated Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Annotation.impl.AnnotatedModelImpl
	 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getAnnotatedModel()
	 * @generated
	 */
	int ANNOTATED_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Annotation Concern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL__ANNOTATION_CONCERN = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL__CONTEXT = 2;

	/**
	 * The number of structural features of the '<em>Annotated Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotated Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Annotation.impl.ModelingConcernImpl <em>Modeling Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Annotation.impl.ModelingConcernImpl
	 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getModelingConcern()
	 * @generated
	 */
	int MODELING_CONCERN = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Relevant Nfp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN__RELEVANT_NFP = 1;

	/**
	 * The number of structural features of the '<em>Modeling Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modeling Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_CONCERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Annotation.ConstrainKind <em>Constrain Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Annotation.ConstrainKind
	 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getConstrainKind()
	 * @generated
	 */
	int CONSTRAIN_KIND = 4;


	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Annotation.NFP_Constraint <em>NFP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Constraint</em>'.
	 * @see mARTE.NFP_Annotation.NFP_Constraint
	 * @generated
	 */
	EClass getNFP_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Annotation.NFP_Constraint#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see mARTE.NFP_Annotation.NFP_Constraint#getKind()
	 * @see #getNFP_Constraint()
	 * @generated
	 */
	EAttribute getNFP_Constraint_Kind();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Annotation.NFP_Constraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Element</em>'.
	 * @see mARTE.NFP_Annotation.NFP_Constraint#getConstrainedElement()
	 * @see #getNFP_Constraint()
	 * @generated
	 */
	EReference getNFP_Constraint_ConstrainedElement();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Annotation.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see mARTE.NFP_Annotation.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Annotation.AnnotatedElement#getNfpDeclaration <em>Nfp Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nfp Declaration</em>'.
	 * @see mARTE.NFP_Annotation.AnnotatedElement#getNfpDeclaration()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_NfpDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Annotation.AnnotatedElement#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see mARTE.NFP_Annotation.AnnotatedElement#getElementName()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EAttribute getAnnotatedElement_ElementName();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Annotation.AnnotatedModel <em>Annotated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Model</em>'.
	 * @see mARTE.NFP_Annotation.AnnotatedModel
	 * @generated
	 */
	EClass getAnnotatedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.NFP_Annotation.AnnotatedModel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owner</em>'.
	 * @see mARTE.NFP_Annotation.AnnotatedModel#getOwner()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_Owner();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Annotation.AnnotatedModel#getAnnotationConcern <em>Annotation Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotation Concern</em>'.
	 * @see mARTE.NFP_Annotation.AnnotatedModel#getAnnotationConcern()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_AnnotationConcern();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE.NFP_Annotation.AnnotatedModel#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see mARTE.NFP_Annotation.AnnotatedModel#getContext()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_Context();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Annotation.ModelingConcern <em>Modeling Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Concern</em>'.
	 * @see mARTE.NFP_Annotation.ModelingConcern
	 * @generated
	 */
	EClass getModelingConcern();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Annotation.ModelingConcern#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mARTE.NFP_Annotation.ModelingConcern#getDescription()
	 * @see #getModelingConcern()
	 * @generated
	 */
	EAttribute getModelingConcern_Description();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Annotation.ModelingConcern#getRelevantNfp <em>Relevant Nfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relevant Nfp</em>'.
	 * @see mARTE.NFP_Annotation.ModelingConcern#getRelevantNfp()
	 * @see #getModelingConcern()
	 * @generated
	 */
	EReference getModelingConcern_RelevantNfp();

	/**
	 * Returns the meta object for enum '{@link mARTE.NFP_Annotation.ConstrainKind <em>Constrain Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constrain Kind</em>'.
	 * @see mARTE.NFP_Annotation.ConstrainKind
	 * @generated
	 */
	EEnum getConstrainKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NFP_AnnotationFactory getNFP_AnnotationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mARTE.NFP_Annotation.impl.NFP_ConstraintImpl <em>NFP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Annotation.impl.NFP_ConstraintImpl
		 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getNFP_Constraint()
		 * @generated
		 */
		EClass NFP_CONSTRAINT = eINSTANCE.getNFP_Constraint();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_CONSTRAINT__KIND = eINSTANCE.getNFP_Constraint_Kind();

		/**
		 * The meta object literal for the '<em><b>Constrained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_CONSTRAINT__CONSTRAINED_ELEMENT = eINSTANCE.getNFP_Constraint_ConstrainedElement();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Annotation.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Annotation.impl.AnnotatedElementImpl
		 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Nfp Declaration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_ELEMENT__NFP_DECLARATION = eINSTANCE.getAnnotatedElement_NfpDeclaration();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATED_ELEMENT__ELEMENT_NAME = eINSTANCE.getAnnotatedElement_ElementName();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Annotation.impl.AnnotatedModelImpl <em>Annotated Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Annotation.impl.AnnotatedModelImpl
		 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getAnnotatedModel()
		 * @generated
		 */
		EClass ANNOTATED_MODEL = eINSTANCE.getAnnotatedModel();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_MODEL__OWNER = eINSTANCE.getAnnotatedModel_Owner();

		/**
		 * The meta object literal for the '<em><b>Annotation Concern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_MODEL__ANNOTATION_CONCERN = eINSTANCE.getAnnotatedModel_AnnotationConcern();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_MODEL__CONTEXT = eINSTANCE.getAnnotatedModel_Context();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Annotation.impl.ModelingConcernImpl <em>Modeling Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Annotation.impl.ModelingConcernImpl
		 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getModelingConcern()
		 * @generated
		 */
		EClass MODELING_CONCERN = eINSTANCE.getModelingConcern();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELING_CONCERN__DESCRIPTION = eINSTANCE.getModelingConcern_Description();

		/**
		 * The meta object literal for the '<em><b>Relevant Nfp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_CONCERN__RELEVANT_NFP = eINSTANCE.getModelingConcern_RelevantNfp();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Annotation.ConstrainKind <em>Constrain Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Annotation.ConstrainKind
		 * @see mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl#getConstrainKind()
		 * @generated
		 */
		EEnum CONSTRAIN_KIND = eINSTANCE.getConstrainKind();

	}

} //NFP_AnnotationPackage
