/**
 */
package mARTE.NFP_Declaration.impl;

import mARTE.Allocations.AllocationsPackage;

import mARTE.Allocations.impl.AllocationsPackageImpl;

import mARTE.NFP_Annotation.NFP_AnnotationPackage;

import mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl;

import mARTE.NFP_Declaration.NFP_DeclarationFactory;
import mARTE.NFP_Declaration.NFP_DeclarationPackage;
import mARTE.NFP_Declaration.NFP_Type;
import mARTE.NFP_Declaration.ValueProperty;
import mARTE.NFP_Declaration.ValueType;

import mARTE.NFP_Natrue.NFP_NatruePackage;

import mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFP_DeclarationPackageImpl extends EPackageImpl implements NFP_DeclarationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_TypeEClass = null;

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
	 * @see mARTE.NFP_Declaration.NFP_DeclarationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NFP_DeclarationPackageImpl() {
		super(eNS_URI, NFP_DeclarationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NFP_DeclarationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NFP_DeclarationPackage init() {
		if (isInited) return (NFP_DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(NFP_DeclarationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNFP_DeclarationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NFP_DeclarationPackageImpl theNFP_DeclarationPackage = registeredNFP_DeclarationPackage instanceof NFP_DeclarationPackageImpl ? (NFP_DeclarationPackageImpl)registeredNFP_DeclarationPackage : new NFP_DeclarationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_NatruePackage.eNS_URI);
		NFP_NatruePackageImpl theNFP_NatruePackage = (NFP_NatruePackageImpl)(registeredPackage instanceof NFP_NatruePackageImpl ? registeredPackage : NFP_NatruePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_AnnotationPackage.eNS_URI);
		NFP_AnnotationPackageImpl theNFP_AnnotationPackage = (NFP_AnnotationPackageImpl)(registeredPackage instanceof NFP_AnnotationPackageImpl ? registeredPackage : NFP_AnnotationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(registeredPackage instanceof AllocationsPackageImpl ? registeredPackage : AllocationsPackage.eINSTANCE);

		// Create package meta-data objects
		theNFP_DeclarationPackage.createPackageContents();
		theNFP_NatruePackage.createPackageContents();
		theNFP_AnnotationPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();

		// Initialize created meta-data
		theNFP_DeclarationPackage.initializePackageContents();
		theNFP_NatruePackage.initializePackageContents();
		theNFP_AnnotationPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNFP_DeclarationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NFP_DeclarationPackage.eNS_URI, theNFP_DeclarationPackage);
		return theNFP_DeclarationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP() {
		return nfpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_AllowedUnits() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_DefaultUnit() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueProperty() {
		return valuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueProperty_Type() {
		return (EReference)valuePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Type() {
		return nfP_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DeclarationFactory getNFP_DeclarationFactory() {
		return (NFP_DeclarationFactory)getEFactoryInstance();
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
		nfpEClass = createEClass(NFP);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__ALLOWED_UNITS);
		createEReference(valueTypeEClass, VALUE_TYPE__DEFAULT_UNIT);

		valuePropertyEClass = createEClass(VALUE_PROPERTY);
		createEReference(valuePropertyEClass, VALUE_PROPERTY__TYPE);

		nfP_TypeEClass = createEClass(NFP_TYPE);
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
		NFP_NatruePackage theNFP_NatruePackage = (NFP_NatruePackage)EPackage.Registry.INSTANCE.getEPackage(NFP_NatruePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nfpEClass.getESuperTypes().add(this.getValueProperty());
		nfP_TypeEClass.getESuperTypes().add(this.getValueType());

		// Initialize classes, features, and operations; add parameters
		initEClass(nfpEClass, mARTE.NFP_Declaration.NFP.class, "NFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueType_AllowedUnits(), theNFP_NatruePackage.getUnit(), null, "allowedUnits", null, 0, -1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueType_DefaultUnit(), theNFP_NatruePackage.getUnit(), null, "defaultUnit", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePropertyEClass, ValueProperty.class, "ValueProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueProperty_Type(), this.getValueType(), null, "type", null, 0, 1, ValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfP_TypeEClass, NFP_Type.class, "NFP_Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //NFP_DeclarationPackageImpl
