/**
 */
package mARTE.impl;

import mARTE.AbstractNFP;
import mARTE.Allocation;
import mARTE.AllocationEnd;
import mARTE.AnnotatedElement;
import mARTE.AnnotatedModel;
import mARTE.ApplicationAllocationEnd;
import mARTE.BaseQuantity;
import mARTE.ConstrainKind;
import mARTE.DerivedQuantity;
import mARTE.Dimension;
import mARTE.ExecutionPlatformAllocationEnd;
import mARTE.MARTEFactory;
import mARTE.MARTEPackage;
import mARTE.Measure;
import mARTE.Mode;
import mARTE.ModelElement;
import mARTE.ModelingConcern;
import mARTE.NFP_Constrain;
import mARTE.NFP_Constraint;
import mARTE.NFP_Type;
import mARTE.Property;
import mARTE.QualitativeNFP;
import mARTE.QuantitativeNFP;
import mARTE.Quantity;
import mARTE.Refinement;
import mARTE.SampleRealization;
import mARTE.TupleType;
import mARTE.Unit;
import mARTE.ValueProperty;
import mARTE.ValueSpecification;
import mARTE.ValueType;

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
public class MARTEPackageImpl extends EPackageImpl implements MARTEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

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
	private EClass measureEClass = null;

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
	private EClass quantitativeNFPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeNFPEClass = null;

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
	private EClass tupleTypeEClass = null;

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
	private EClass nfpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

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
	private EClass modelElementEClass = null;

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
	private EClass nfP_ConstrainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

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
	private EClass applicationAllocationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionPlatformAllocationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEndEClass = null;

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
	 * @see mARTE.MARTEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MARTEPackageImpl() {
		super(eNS_URI, MARTEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MARTEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MARTEPackage init() {
		if (isInited)
			return (MARTEPackage) EPackage.Registry.INSTANCE.getEPackage(MARTEPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMARTEPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MARTEPackageImpl theMARTEPackage = registeredMARTEPackage instanceof MARTEPackageImpl
				? (MARTEPackageImpl) registeredMARTEPackage
				: new MARTEPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMARTEPackage.createPackageContents();

		// Initialize created meta-data
		theMARTEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMARTEPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MARTEPackage.eNS_URI, theMARTEPackage);
		return theMARTEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_Symbol() {
		return (EAttribute) dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimension_BaseExponents() {
		return (EAttribute) dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_Basequantity() {
		return (EReference) dimensionEClass.getEStructuralFeatures().get(2);
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
		return (EAttribute) unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_ConvOffset() {
		return (EAttribute) unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnit_BaseUnit() {
		return (EReference) unitEClass.getEStructuralFeatures().get(2);
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
		return (EReference) measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_PhysicalQuantity() {
		return (EReference) measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Domain() {
		return (EReference) measureEClass.getEStructuralFeatures().get(2);
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
		return (EReference) sampleRealizationEClass.getEStructuralFeatures().get(0);
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
		return (EReference) quantitativeNFPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantitativeNFP_Measure() {
		return (EReference) quantitativeNFPEClass.getEStructuralFeatures().get(1);
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
	public EReference getQualitativeNFP_Parameter() {
		return (EReference) qualitativeNFPEClass.getEStructuralFeatures().get(0);
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
		return (EReference) quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Dimension() {
		return (EReference) quantityEClass.getEStructuralFeatures().get(1);
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
	public EClass getTupleType() {
		return tupleTypeEClass;
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
		return (EReference) valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_DefaultUnit() {
		return (EReference) valueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_ValueAttribute() {
		return (EReference) valueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_UnitAttribute() {
		return (EReference) valueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_ExprAttribute() {
		return (EReference) valueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueType_QualifierAttributes() {
		return (EReference) valueTypeEClass.getEStructuralFeatures().get(5);
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
		return (EReference) valuePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueProperty_DefaultValue() {
		return (EReference) valuePropertyEClass.getEStructuralFeatures().get(1);
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
	public EClass getNFP_Type() {
		return nfP_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
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
		return (EReference) annotatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedElement_NfpValue() {
		return (EReference) annotatedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
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
		return (EReference) annotatedModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedModel_AnnotationConcern() {
		return (EReference) annotatedModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedModel_Context() {
		return (EReference) annotatedModelEClass.getEStructuralFeatures().get(2);
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
		return (EAttribute) modelingConcernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingConcern_RelevantNfp() {
		return (EReference) modelingConcernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Constrain() {
		return nfP_ConstrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Constrain_Kind() {
		return (EAttribute) nfP_ConstrainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Constrain_Mode() {
		return (EReference) nfP_ConstrainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Constrain_ConstrainedElement() {
		return (EReference) nfP_ConstrainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Constrain_Specification() {
		return (EReference) nfP_ConstrainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_Target() {
		return (EReference) allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_Source() {
		return (EReference) allocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocation_InpliedConstraint() {
		return (EReference) allocationEClass.getEStructuralFeatures().get(2);
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
	public EClass getApplicationAllocationEnd() {
		return applicationAllocationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionPlatformAllocationEnd() {
		return executionPlatformAllocationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinement() {
		return refinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinement_General() {
		return (EReference) refinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinement_Refined() {
		return (EReference) refinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinement_Constraint() {
		return (EReference) refinementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationEnd() {
		return allocationEndEClass;
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
	public MARTEFactory getMARTEFactory() {
		return (MARTEFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__SYMBOL);
		createEAttribute(dimensionEClass, DIMENSION__BASE_EXPONENTS);
		createEReference(dimensionEClass, DIMENSION__BASEQUANTITY);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__CONV_FACTOR);
		createEAttribute(unitEClass, UNIT__CONV_OFFSET);
		createEReference(unitEClass, UNIT__BASE_UNIT);

		measureEClass = createEClass(MEASURE);
		createEReference(measureEClass, MEASURE__MEASUREMENT_UNIT);
		createEReference(measureEClass, MEASURE__PHYSICAL_QUANTITY);
		createEReference(measureEClass, MEASURE__DOMAIN);

		sampleRealizationEClass = createEClass(SAMPLE_REALIZATION);
		createEReference(sampleRealizationEClass, SAMPLE_REALIZATION__FUNCTION);

		quantitativeNFPEClass = createEClass(QUANTITATIVE_NFP);
		createEReference(quantitativeNFPEClass, QUANTITATIVE_NFP__REALIZATION_VALUES);
		createEReference(quantitativeNFPEClass, QUANTITATIVE_NFP__MEASURE);

		qualitativeNFPEClass = createEClass(QUALITATIVE_NFP);
		createEReference(qualitativeNFPEClass, QUALITATIVE_NFP__PARAMETER);

		abstractNFPEClass = createEClass(ABSTRACT_NFP);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__ALLOWED_UNITS);
		createEReference(quantityEClass, QUANTITY__DIMENSION);

		derivedQuantityEClass = createEClass(DERIVED_QUANTITY);

		baseQuantityEClass = createEClass(BASE_QUANTITY);

		tupleTypeEClass = createEClass(TUPLE_TYPE);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__ALLOWED_UNITS);
		createEReference(valueTypeEClass, VALUE_TYPE__DEFAULT_UNIT);
		createEReference(valueTypeEClass, VALUE_TYPE__VALUE_ATTRIBUTE);
		createEReference(valueTypeEClass, VALUE_TYPE__UNIT_ATTRIBUTE);
		createEReference(valueTypeEClass, VALUE_TYPE__EXPR_ATTRIBUTE);
		createEReference(valueTypeEClass, VALUE_TYPE__QUALIFIER_ATTRIBUTES);

		valuePropertyEClass = createEClass(VALUE_PROPERTY);
		createEReference(valuePropertyEClass, VALUE_PROPERTY__TYPE);
		createEReference(valuePropertyEClass, VALUE_PROPERTY__DEFAULT_VALUE);

		nfpEClass = createEClass(NFP);

		nfP_TypeEClass = createEClass(NFP_TYPE);

		propertyEClass = createEClass(PROPERTY);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);
		createEReference(annotatedElementEClass, ANNOTATED_ELEMENT__NFP_DECLARATION);
		createEReference(annotatedElementEClass, ANNOTATED_ELEMENT__NFP_VALUE);

		modelElementEClass = createEClass(MODEL_ELEMENT);

		annotatedModelEClass = createEClass(ANNOTATED_MODEL);
		createEReference(annotatedModelEClass, ANNOTATED_MODEL__OWNER);
		createEReference(annotatedModelEClass, ANNOTATED_MODEL__ANNOTATION_CONCERN);
		createEReference(annotatedModelEClass, ANNOTATED_MODEL__CONTEXT);

		modelingConcernEClass = createEClass(MODELING_CONCERN);
		createEAttribute(modelingConcernEClass, MODELING_CONCERN__DESCRIPTION);
		createEReference(modelingConcernEClass, MODELING_CONCERN__RELEVANT_NFP);

		nfP_ConstrainEClass = createEClass(NFP_CONSTRAIN);
		createEAttribute(nfP_ConstrainEClass, NFP_CONSTRAIN__KIND);
		createEReference(nfP_ConstrainEClass, NFP_CONSTRAIN__MODE);
		createEReference(nfP_ConstrainEClass, NFP_CONSTRAIN__CONSTRAINED_ELEMENT);
		createEReference(nfP_ConstrainEClass, NFP_CONSTRAIN__SPECIFICATION);

		modeEClass = createEClass(MODE);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		allocationEClass = createEClass(ALLOCATION);
		createEReference(allocationEClass, ALLOCATION__TARGET);
		createEReference(allocationEClass, ALLOCATION__SOURCE);
		createEReference(allocationEClass, ALLOCATION__INPLIED_CONSTRAINT);

		nfP_ConstraintEClass = createEClass(NFP_CONSTRAINT);

		applicationAllocationEndEClass = createEClass(APPLICATION_ALLOCATION_END);

		executionPlatformAllocationEndEClass = createEClass(EXECUTION_PLATFORM_ALLOCATION_END);

		refinementEClass = createEClass(REFINEMENT);
		createEReference(refinementEClass, REFINEMENT__GENERAL);
		createEReference(refinementEClass, REFINEMENT__REFINED);
		createEReference(refinementEClass, REFINEMENT__CONSTRAINT);

		allocationEndEClass = createEClass(ALLOCATION_END);

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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		quantitativeNFPEClass.getESuperTypes().add(this.getAbstractNFP());
		qualitativeNFPEClass.getESuperTypes().add(this.getAbstractNFP());
		derivedQuantityEClass.getESuperTypes().add(this.getQuantity());
		baseQuantityEClass.getESuperTypes().add(this.getQuantity());
		valueTypeEClass.getESuperTypes().add(this.getTupleType());
		nfpEClass.getESuperTypes().add(this.getValueProperty());
		nfP_TypeEClass.getESuperTypes().add(this.getValueType());
		annotatedElementEClass.getESuperTypes().add(this.getModelElement());
		applicationAllocationEndEClass.getESuperTypes().add(this.getAllocationEnd());
		executionPlatformAllocationEndEClass.getESuperTypes().add(this.getAllocationEnd());

		// Initialize classes, features, and operations; add parameters
		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Dimension.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_BaseExponents(), ecorePackage.getEIntegerObject(), "baseExponents", null, 0, -1,
				Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDimension_Basequantity(), this.getBaseQuantity(), null, "basequantity", null, 0, -1,
				Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_ConvFactor(), ecorePackage.getEDoubleObject(), "convFactor", null, 0, 1, Unit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_ConvOffset(), theXMLTypePackage.getDoubleObject(), "convOffset", null, 0, 1, Unit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnit_BaseUnit(), this.getUnit(), null, "baseUnit", null, 0, 1, Unit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasure_MeasurementUnit(), this.getUnit(), null, "measurementUnit", null, 0, 1, Measure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_PhysicalQuantity(), this.getQuantity(), null, "physicalQuantity", null, 0, 1,
				Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Domain(), this.getSampleRealization(), this.getSampleRealization_Function(), "domain",
				null, 1, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleRealizationEClass, SampleRealization.class, "SampleRealization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampleRealization_Function(), this.getMeasure(), this.getMeasure_Domain(), "function", null,
				0, -1, SampleRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativeNFPEClass, QuantitativeNFP.class, "QuantitativeNFP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantitativeNFP_RealizationValues(), this.getSampleRealization(), null, "realizationValues",
				null, 0, -1, QuantitativeNFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantitativeNFP_Measure(), this.getMeasure(), null, "measure", null, 0, -1,
				QuantitativeNFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualitativeNFPEClass, QualitativeNFP.class, "QualitativeNFP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualitativeNFP_Parameter(), this.getAbstractNFP(), null, "parameter", null, 0, -1,
				QualitativeNFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNFPEClass, AbstractNFP.class, "AbstractNFP", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_AllowedUnits(), this.getUnit(), null, "allowedUnits", null, 0, -1, Quantity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Dimension(), this.getDimension(), null, "dimension", null, 0, 1, Quantity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedQuantityEClass, DerivedQuantity.class, "DerivedQuantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseQuantityEClass, BaseQuantity.class, "BaseQuantity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleTypeEClass, TupleType.class, "TupleType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueType_AllowedUnits(), this.getUnit(), null, "allowedUnits", null, 0, -1, ValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueType_DefaultUnit(), this.getUnit(), null, "defaultUnit", null, 0, 1, ValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueType_ValueAttribute(), this.getProperty(), null, "valueAttribute", null, 0, 1,
				ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueType_UnitAttribute(), this.getProperty(), null, "unitAttribute", null, 0, 1,
				ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueType_ExprAttribute(), this.getProperty(), null, "exprAttribute", null, 0, 1,
				ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueType_QualifierAttributes(), this.getProperty(), null, "qualifierAttributes", null, 0, -1,
				ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePropertyEClass, ValueProperty.class, "ValueProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueProperty_Type(), this.getValueType(), null, "type", null, 0, 1, ValueProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueProperty_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1,
				ValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfpEClass, mARTE.NFP.class, "NFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nfP_TypeEClass, NFP_Type.class, "NFP_Type", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedElement_NfpDeclaration(), this.getNFP(), null, "nfpDeclaration", null, 0, -1,
				AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedElement_NfpValue(), this.getValueSpecification(), null, "nfpValue", null, 0, -1,
				AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotatedModelEClass, AnnotatedModel.class, "AnnotatedModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedModel_Owner(), this.getAnnotatedElement(), null, "owner", null, 1, -1,
				AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedModel_AnnotationConcern(), this.getModelingConcern(), null, "annotationConcern",
				null, 1, -1, AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatedModel_Context(), this.getNFP_Constrain(), null, "context", null, 0, 1,
				AnnotatedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingConcernEClass, ModelingConcern.class, "ModelingConcern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelingConcern_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ModelingConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModelingConcern_RelevantNfp(), this.getNFP(), null, "relevantNfp", null, 0, -1,
				ModelingConcern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfP_ConstrainEClass, NFP_Constrain.class, "NFP_Constrain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Constrain_Kind(), this.getConstrainKind(), "kind", null, 0, 1, NFP_Constrain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Constrain_Mode(), this.getMode(), null, "mode", null, 0, -1, NFP_Constrain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Constrain_ConstrainedElement(), this.getAnnotatedElement(), null, "constrainedElement",
				null, 0, -1, NFP_Constrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Constrain_Specification(), this.getValueSpecification(), null, "specification", null, 0,
				-1, NFP_Constrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocation_Target(), this.getExecutionPlatformAllocationEnd(), null, "target", null, 1, -1,
				Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocation_Source(), this.getApplicationAllocationEnd(), null, "source", null, 1, -1,
				Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocation_InpliedConstraint(), this.getNFP_Constraint(), null, "inpliedConstraint", null, 0,
				-1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfP_ConstraintEClass, NFP_Constraint.class, "NFP_Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationAllocationEndEClass, ApplicationAllocationEnd.class, "ApplicationAllocationEnd",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionPlatformAllocationEndEClass, ExecutionPlatformAllocationEnd.class,
				"ExecutionPlatformAllocationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refinementEClass, Refinement.class, "Refinement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinement_General(), this.getAllocationEnd(), null, "general", null, 1, -1, Refinement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinement_Refined(), this.getAllocationEnd(), null, "refined", null, 1, -1, Refinement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinement_Constraint(), this.getNFP_Constraint(), null, "constraint", null, 0, -1,
				Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEndEClass, AllocationEnd.class, "AllocationEnd", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(constrainKindEEnum, ConstrainKind.class, "ConstrainKind");
		addEEnumLiteral(constrainKindEEnum, ConstrainKind.REQUIRED);
		addEEnumLiteral(constrainKindEEnum, ConstrainKind.OFFERED);
		addEEnumLiteral(constrainKindEEnum, ConstrainKind.CONTRACT);

		// Create resource
		createResource(eNS_URI);
	}

} //MARTEPackageImpl
