/**
 */
package mARTE.impl;

import mARTE.*;

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
public class MARTEFactoryImpl extends EFactoryImpl implements MARTEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MARTEFactory init() {
		try {
			MARTEFactory theMARTEFactory = (MARTEFactory) EPackage.Registry.INSTANCE.getEFactory(MARTEPackage.eNS_URI);
			if (theMARTEFactory != null) {
				return theMARTEFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MARTEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTEFactoryImpl() {
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
		case MARTEPackage.DIMENSION:
			return createDimension();
		case MARTEPackage.UNIT:
			return createUnit();
		case MARTEPackage.MEASURE:
			return createMeasure();
		case MARTEPackage.SAMPLE_REALIZATION:
			return createSampleRealization();
		case MARTEPackage.QUANTITATIVE_NFP:
			return createQuantitativeNFP();
		case MARTEPackage.QUALITATIVE_NFP:
			return createQualitativeNFP();
		case MARTEPackage.DERIVED_QUANTITY:
			return createDerivedQuantity();
		case MARTEPackage.BASE_QUANTITY:
			return createBaseQuantity();
		case MARTEPackage.NFP:
			return createNFP();
		case MARTEPackage.NFP_TYPE:
			return createNFP_Type();
		case MARTEPackage.PROPERTY:
			return createProperty();
		case MARTEPackage.ANNOTATED_ELEMENT:
			return createAnnotatedElement();
		case MARTEPackage.ANNOTATED_MODEL:
			return createAnnotatedModel();
		case MARTEPackage.MODELING_CONCERN:
			return createModelingConcern();
		case MARTEPackage.NFP_CONSTRAIN:
			return createNFP_Constrain();
		case MARTEPackage.MODE:
			return createMode();
		case MARTEPackage.VALUE_SPECIFICATION:
			return createValueSpecification();
		case MARTEPackage.ALLOCATION:
			return createAllocation();
		case MARTEPackage.NFP_CONSTRAINT:
			return createNFP_Constraint();
		case MARTEPackage.APPLICATION_ALLOCATION_END:
			return createApplicationAllocationEnd();
		case MARTEPackage.EXECUTION_PLATFORM_ALLOCATION_END:
			return createExecutionPlatformAllocationEnd();
		case MARTEPackage.REFINEMENT:
			return createRefinement();
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
		case MARTEPackage.CONSTRAIN_KIND:
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
		case MARTEPackage.CONSTRAIN_KIND:
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
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampleRealization createSampleRealization() {
		SampleRealizationImpl sampleRealization = new SampleRealizationImpl();
		return sampleRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeNFP createQuantitativeNFP() {
		QuantitativeNFPImpl quantitativeNFP = new QuantitativeNFPImpl();
		return quantitativeNFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeNFP createQualitativeNFP() {
		QualitativeNFPImpl qualitativeNFP = new QualitativeNFPImpl();
		return qualitativeNFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedQuantity createDerivedQuantity() {
		DerivedQuantityImpl derivedQuantity = new DerivedQuantityImpl();
		return derivedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseQuantity createBaseQuantity() {
		BaseQuantityImpl baseQuantity = new BaseQuantityImpl();
		return baseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP createNFP() {
		NFPImpl nfp = new NFPImpl();
		return nfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Type createNFP_Type() {
		NFP_TypeImpl nfP_Type = new NFP_TypeImpl();
		return nfP_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
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
	public NFP_Constrain createNFP_Constrain() {
		NFP_ConstrainImpl nfP_Constrain = new NFP_ConstrainImpl();
		return nfP_Constrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createValueSpecification() {
		ValueSpecificationImpl valueSpecification = new ValueSpecificationImpl();
		return valueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Allocation createAllocation() {
		AllocationImpl allocation = new AllocationImpl();
		return allocation;
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
	public ApplicationAllocationEnd createApplicationAllocationEnd() {
		ApplicationAllocationEndImpl applicationAllocationEnd = new ApplicationAllocationEndImpl();
		return applicationAllocationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPlatformAllocationEnd createExecutionPlatformAllocationEnd() {
		ExecutionPlatformAllocationEndImpl executionPlatformAllocationEnd = new ExecutionPlatformAllocationEndImpl();
		return executionPlatformAllocationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refinement createRefinement() {
		RefinementImpl refinement = new RefinementImpl();
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainKind createConstrainKindFromString(EDataType eDataType, String initialValue) {
		ConstrainKind result = ConstrainKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public MARTEPackage getMARTEPackage() {
		return (MARTEPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MARTEPackage getPackage() {
		return MARTEPackage.eINSTANCE;
	}

} //MARTEFactoryImpl
