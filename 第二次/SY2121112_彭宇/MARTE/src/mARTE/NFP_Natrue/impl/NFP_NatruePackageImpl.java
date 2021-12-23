/**
 */
package mARTE.NFP_Natrue.impl;

import mARTE.Allocations.AllocationsPackage;

import mARTE.Allocations.impl.AllocationsPackageImpl;

import mARTE.NFP_Annotation.NFP_AnnotationPackage;

import mARTE.NFP_Annotation.impl.NFP_AnnotationPackageImpl;

import mARTE.NFP_Declaration.NFP_DeclarationPackage;

import mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl;

import mARTE.NFP_Natrue.AbstractNFP;
import mARTE.NFP_Natrue.BaseQuantity;
import mARTE.NFP_Natrue.DerivedQuantity;
import mARTE.NFP_Natrue.Measure;
import mARTE.NFP_Natrue.NFP_NatrueFactory;
import mARTE.NFP_Natrue.NFP_NatruePackage;
import mARTE.NFP_Natrue.QualitativeNFP;
import mARTE.NFP_Natrue.QuantitativeNFP;
import mARTE.NFP_Natrue.Quantity;
import mARTE.NFP_Natrue.SampleRealization;
import mARTE.NFP_Natrue.Unit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class NFP_NatruePackageImpl extends EPackageImpl implements NFP_NatruePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNFPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativeNFPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeNFPEClass = null;

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
	 * @see mARTE.NFP_Natrue.NFP_NatruePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NFP_NatruePackageImpl() {
		super(eNS_URI, NFP_NatrueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NFP_NatruePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NFP_NatruePackage init() {
		if (isInited) return (NFP_NatruePackage)EPackage.Registry.INSTANCE.getEPackage(NFP_NatruePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNFP_NatruePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NFP_NatruePackageImpl theNFP_NatruePackage = registeredNFP_NatruePackage instanceof NFP_NatruePackageImpl ? (NFP_NatruePackageImpl)registeredNFP_NatruePackage : new NFP_NatruePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_AnnotationPackage.eNS_URI);
		NFP_AnnotationPackageImpl theNFP_AnnotationPackage = (NFP_AnnotationPackageImpl)(registeredPackage instanceof NFP_AnnotationPackageImpl ? registeredPackage : NFP_AnnotationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NFP_DeclarationPackage.eNS_URI);
		NFP_DeclarationPackageImpl theNFP_DeclarationPackage = (NFP_DeclarationPackageImpl)(registeredPackage instanceof NFP_DeclarationPackageImpl ? registeredPackage : NFP_DeclarationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AllocationsPackage.eNS_URI);
		AllocationsPackageImpl theAllocationsPackage = (AllocationsPackageImpl)(registeredPackage instanceof AllocationsPackageImpl ? registeredPackage : AllocationsPackage.eINSTANCE);

		// Create package meta-data objects
		theNFP_NatruePackage.createPackageContents();
		theNFP_AnnotationPackage.createPackageContents();
		theNFP_DeclarationPackage.createPackageContents();
		theAllocationsPackage.createPackageContents();

		// Initialize created meta-data
		theNFP_NatruePackage.initializePackageContents();
		theNFP_AnnotationPackage.initializePackageContents();
		theNFP_DeclarationPackage.initializePackageContents();
		theAllocationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNFP_NatruePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NFP_NatruePackage.eNS_URI, theNFP_NatruePackage);
		return theNFP_NatruePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedQuantity() {
		return derivedQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseQuantity() {
		return baseQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampleRealization() {
		return sampleRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampleRealization_Function() {
		return (EReference)sampleRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampleRealization_MeasureName() {
		return (EAttribute)sampleRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNFP() {
		return abstractNFPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_AllowedUnits() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantitativeNFP() {
		return quantitativeNFPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantitativeNFP_RealizationValues() {
		return (EReference)quantitativeNFPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantitativeNFP_Measure() {
		return (EReference)quantitativeNFPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeNFP_Numbers() {
		return (EAttribute)quantitativeNFPEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_MeasurementUnit() {
		return (EReference)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_PhysicalQuantity() {
		return (EReference)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Domain() {
		return (EReference)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_MeasureName() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_ConvFactor() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_ConvOffset() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_BaseUnit() {
		return (EReference)unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualitativeNFP() {
		return qualitativeNFPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_NatrueFactory getNFP_NatrueFactory() {
		return (NFP_NatrueFactory)getEFactoryInstance();
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
		derivedQuantityEClass = createEClass(DERIVED_QUANTITY);

		baseQuantityEClass = createEClass(BASE_QUANTITY);

		sampleRealizationEClass = createEClass(SAMPLE_REALIZATION);
		createEReference(sampleRealizationEClass, SAMPLE_REALIZATION__FUNCTION);
		createEAttribute(sampleRealizationEClass, SAMPLE_REALIZATION__MEASURE_NAME);

		abstractNFPEClass = createEClass(ABSTRACT_NFP);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__ALLOWED_UNITS);

		quantitativeNFPEClass = createEClass(QUANTITATIVE_NFP);
		createEReference(quantitativeNFPEClass, QUANTITATIVE_NFP__REALIZATION_VALUES);
		createEReference(quantitativeNFPEClass, QUANTITATIVE_NFP__MEASURE);
		createEAttribute(quantitativeNFPEClass, QUANTITATIVE_NFP__NUMBERS);

		measureEClass = createEClass(MEASURE);
		createEReference(measureEClass, MEASURE__MEASUREMENT_UNIT);
		createEReference(measureEClass, MEASURE__PHYSICAL_QUANTITY);
		createEReference(measureEClass, MEASURE__DOMAIN);
		createEAttribute(measureEClass, MEASURE__MEASURE_NAME);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__CONV_FACTOR);
		createEAttribute(unitEClass, UNIT__CONV_OFFSET);
		createEReference(unitEClass, UNIT__BASE_UNIT);

		qualitativeNFPEClass = createEClass(QUALITATIVE_NFP);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		derivedQuantityEClass.getESuperTypes().add(this.getQuantity());
		baseQuantityEClass.getESuperTypes().add(this.getQuantity());
		quantitativeNFPEClass.getESuperTypes().add(this.getAbstractNFP());
		qualitativeNFPEClass.getESuperTypes().add(this.getAbstractNFP());

		// Initialize classes, features, and operations; add parameters
		initEClass(derivedQuantityEClass, DerivedQuantity.class, "DerivedQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseQuantityEClass, BaseQuantity.class, "BaseQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sampleRealizationEClass, SampleRealization.class, "SampleRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampleRealization_Function(), this.getMeasure(), this.getMeasure_Domain(), "function", null, 0, -1, SampleRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampleRealization_MeasureName(), theXMLTypePackage.getString(), "measureName", null, 0, 1, SampleRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNFPEClass, AbstractNFP.class, "AbstractNFP", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_AllowedUnits(), this.getUnit(), null, "allowedUnits", null, 0, -1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativeNFPEClass, QuantitativeNFP.class, "QuantitativeNFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantitativeNFP_RealizationValues(), this.getSampleRealization(), null, "realizationValues", null, 0, -1, QuantitativeNFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantitativeNFP_Measure(), this.getMeasure(), null, "measure", null, 0, -1, QuantitativeNFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeNFP_Numbers(), theXMLTypePackage.getIntObject(), "numbers", null, 0, 1, QuantitativeNFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasure_MeasurementUnit(), this.getUnit(), null, "measurementUnit", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_PhysicalQuantity(), this.getQuantity(), null, "physicalQuantity", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Domain(), this.getSampleRealization(), this.getSampleRealization_Function(), "domain", null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_MeasureName(), theXMLTypePackage.getString(), "measureName", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_ConvFactor(), ecorePackage.getEDoubleObject(), "convFactor", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_ConvOffset(), theXMLTypePackage.getDoubleObject(), "convOffset", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_BaseUnit(), this.getUnit(), null, "baseUnit", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualitativeNFPEClass, QualitativeNFP.class, "QualitativeNFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //NFP_NatruePackageImpl
