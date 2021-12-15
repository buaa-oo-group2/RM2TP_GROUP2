/**
 */
package mARTE.NFP_Annotation.impl;

import mARTE.Allocations.AllocationsPackage;

import mARTE.Allocations.impl.AllocationsPackageImpl;

import mARTE.NFP_Annotation.AnnotatedElement;
import mARTE.NFP_Annotation.AnnotatedModel;
import mARTE.NFP_Annotation.ConstrainKind;
import mARTE.NFP_Annotation.ModelingConcern;
import mARTE.NFP_Annotation.NFP_AnnotationFactory;
import mARTE.NFP_Annotation.NFP_AnnotationPackage;
import mARTE.NFP_Annotation.NFP_Constraint;

import mARTE.NFP_Declaration.NFP_DeclarationPackage;

import mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl;

import mARTE.NFP_Natrue.NFP_NatruePackage;

import mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFP_AnnotationPackageImpl extends EPackageImpl implements NFP_AnnotationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_ConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingConcernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constrainKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mARTE.NFP_Annotation.NFP_AnnotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NFP_AnnotationPackageImpl() {
		super(eNS_URI, NFP_AnnotationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NFP_AnnotationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NFP_AnnotationPackage init() {
		if (isInited) return (NFP_AnnotationPackage)EPackage.Registry.INSTANCE.getEPackage(NFP_AnnotationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNFP_AnnotationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NFP_AnnotationPackageImpl theNFP_AnnotationPackage = registeredNFP_AnnotationPackage instanceof NFP_AnnotationPackageImpl ? (NFP_AnnotationPackageImpl)registeredNFP_AnnotationPackage : new NFP_AnnotationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_NatruePackage.eNS_URI);
		NFP_NatruePackageImpl theNFP_NatruePackage = (NFP_NatruePackageImpl)(registeredPackage instanceof NFP_NatruePackageImpl ? registeredPackage : NFP_NatruePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_DeclarationPackage.eNS_URI);
		NFP_DeclarationPackageImpl theNFP_DeclarationPackage = (NFP_DeclarationPackageImpl)(registeredPackage instanceof NFP_DeclarationPackageImpl ? registeredPackage : NFP_DeclarationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(registeredPackage instanceof AllocationsPackageImpl ? registeredPackage : AllocationsPackage.eINSTANCE);

		// Create package meta-data objects
		theNFP_AnnotationPackage.createPackageContents();
		theNFP_NatruePackage.createPackageContents();
		theNFP_DeclarationPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();

		// Initialize created meta-data
		theNFP_AnnotationPackage.initializePackageContents();
		theNFP_NatruePackage.initializePackageContents();
		theNFP_DeclarationPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNFP_AnnotationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NFP_AnnotationPackage.eNS_URI, theNFP_AnnotationPackage);
		return theNFP_AnnotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Constraint() {
		return nfP_ConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Constraint_Kind() {
		return (EAttribute)nfP_ConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Constraint_ConstrainedElement() {
		return (EReference)nfP_ConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedElement_NfpDeclaration() {
		return (EReference)annotatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatedElement_ElementName() {
		return (EAttribute)annotatedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedModel() {
		return annotatedModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedModel_Owner() {
		return (EReference)annotatedModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedModel_AnnotationConcern() {
		return (EReference)annotatedModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedModel_Context() {
		return (EReference)annotatedModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingConcern() {
		return modelingConcernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelingConcern_Description() {
		return (EAttribute)modelingConcernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingConcern_RelevantNfp() {
		return (EReference)modelingConcernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstrainKind() {
		return constrainKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_AnnotationFactory getNFP_AnnotationFactory() {
		return (NFP_AnnotationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nfP_ConstraintEClass = createEClass(NFP_CONSTRAINT);
		createEAttribute(nfP_ConstraintEClass, NFP_CONSTRAINT__KIND);
		createEReference(nfP_ConstraintEClass, NFP_CONSTRAINT__CONSTRAINED_ELEMENT);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);
		createEReference(annotatedElementEClass, ANNOTATED_ELEMENT__NFP_DECLARATION);
		createEAttribute(annotatedElementEClass, ANNOTATED_ELEMENT__ELEMENT_NAME);

		annotatedModelEClass = createEClass(ANNOTATED_MODEL);
		createEReference(annotatedModelEClass, ANNOTATED_MODEL__OWNER);
		createEReference(annotatedModelEClass, ANNOTATED_MODEL__ANNOTATION_CONCERN);
		createEReference(annotatedModelEClass, ANNOTATED_MODEL__CONTEXT);

		modelingConcernEClass = createEClass(MODELING_CONCERN);
		createEAttribute(modelingConcernEClass, MODELING_CONCERN__DESCRIPTION);
		createEReference(modelingConcernEClass, MODELING_CONCERN__RELEVANT_NFP);

		// Create enums
		constrainKindEEnum = createEEnum(CONSTRAIN_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NFP_DeclarationPackage theNFP_DeclarationPackage = (NFP_DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(NFP_DeclarationPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(nfP_ConstraintEClass, NFP_Constraint.class, "NFP_Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Constraint_Kind(), this.getConstrainKind(), "kind", null, 0, 1, NFP_Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Constraint_ConstrainedElement(), this.getAnnotatedElement(), null, "constrainedElement", null, 0, -1, NFP_Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedElement_NfpDeclaration(), theNFP_DeclarationPackage.getNFP(), null, "nfpDeclaration", null, 0, -1, AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotatedElement_ElementName(), theXMLTypePackage.getString(), "elementName", null, 0, 1, AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedModelEClass, AnnotatedModel.class, "AnnotatedModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedModel_Owner(), this.getAnnotatedElement(), null, "owner", null, 1, -1, AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedModel_AnnotationConcern(), this.getModelingConcern(), null, "annotationConcern", null, 1, -1, AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedModel_Context(), this.getNFP_Constraint(), null, "context", null, 0, 1, AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingConcernEClass, ModelingConcern.class, "ModelingConcern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelingConcern_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelingConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingConcern_RelevantNfp(), theNFP_DeclarationPackage.getNFP(), null, "relevantNfp", null, 0, -1, ModelingConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(constrainKindEEnum, ConstrainKind.class, "ConstrainKind");
		addEEnumLiteral(constrainKindEEnum, ConstrainKind.REQUIRED);
		addEEnumLiteral(constrainKindEEnum, ConstrainKind.OFFERED);
		addEEnumLiteral(constrainKindEEnum, ConstrainKind.CONTRACT);

		// Create resource
		createResource(eNS_URI);
	}

} //NFP_AnnotationPackageImpl
