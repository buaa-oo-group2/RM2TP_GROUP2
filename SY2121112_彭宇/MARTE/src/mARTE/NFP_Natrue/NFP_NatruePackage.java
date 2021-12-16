/**
 */
package mARTE.NFP_Natrue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see mARTE.NFP_Natrue.NFP_NatrueFactory
 * @model kind="package"
 * @generated
 */
public interface NFP_NatruePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NFP_Natrue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mARTE/NFP_Natrue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "natrue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NFP_NatruePackage eINSTANCE = mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl.init();

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.QuantityImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ALLOWED_UNITS = 0;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.DerivedQuantityImpl <em>Derived Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.DerivedQuantityImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getDerivedQuantity()
	 * @generated
	 */
	int DERIVED_QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY__ALLOWED_UNITS = QUANTITY__ALLOWED_UNITS;

	/**
	 * The number of structural features of the '<em>Derived Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Derived Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.BaseQuantityImpl <em>Base Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.BaseQuantityImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getBaseQuantity()
	 * @generated
	 */
	int BASE_QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_QUANTITY__ALLOWED_UNITS = QUANTITY__ALLOWED_UNITS;

	/**
	 * The number of structural features of the '<em>Base Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_QUANTITY_FEATURE_COUNT = QUANTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_QUANTITY_OPERATION_COUNT = QUANTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.SampleRealizationImpl <em>Sample Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.SampleRealizationImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getSampleRealization()
	 * @generated
	 */
	int SAMPLE_REALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REALIZATION__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Measure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REALIZATION__MEASURE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Sample Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sample Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.AbstractNFPImpl <em>Abstract NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.AbstractNFPImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getAbstractNFP()
	 * @generated
	 */
	int ABSTRACT_NFP = 3;

	/**
	 * The number of structural features of the '<em>Abstract NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NFP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NFP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.QuantitativeNFPImpl <em>Quantitative NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.QuantitativeNFPImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getQuantitativeNFP()
	 * @generated
	 */
	int QUANTITATIVE_NFP = 5;

	/**
	 * The feature id for the '<em><b>Realization Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_NFP__REALIZATION_VALUES = ABSTRACT_NFP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_NFP__MEASURE = ABSTRACT_NFP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_NFP__NUMBERS = ABSTRACT_NFP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_NFP_FEATURE_COUNT = ABSTRACT_NFP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quantitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_NFP_OPERATION_COUNT = ABSTRACT_NFP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.MeasureImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 6;

	/**
	 * The feature id for the '<em><b>Measurement Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASUREMENT_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Physical Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__PHYSICAL_QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Measure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.UnitImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 7;

	/**
	 * The feature id for the '<em><b>Conv Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__CONV_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Conv Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__CONV_OFFSET = 1;

	/**
	 * The feature id for the '<em><b>Base Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__BASE_UNIT = 2;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Natrue.impl.QualitativeNFPImpl <em>Qualitative NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Natrue.impl.QualitativeNFPImpl
	 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getQualitativeNFP()
	 * @generated
	 */
	int QUALITATIVE_NFP = 8;

	/**
	 * The number of structural features of the '<em>Qualitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_NFP_FEATURE_COUNT = ABSTRACT_NFP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qualitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_NFP_OPERATION_COUNT = ABSTRACT_NFP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.DerivedQuantity <em>Derived Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Quantity</em>'.
	 * @see mARTE.NFP_Natrue.DerivedQuantity
	 * @generated
	 */
	EClass getDerivedQuantity();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.BaseQuantity <em>Base Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Quantity</em>'.
	 * @see mARTE.NFP_Natrue.BaseQuantity
	 * @generated
	 */
	EClass getBaseQuantity();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.SampleRealization <em>Sample Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Realization</em>'.
	 * @see mARTE.NFP_Natrue.SampleRealization
	 * @generated
	 */
	EClass getSampleRealization();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Natrue.SampleRealization#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function</em>'.
	 * @see mARTE.NFP_Natrue.SampleRealization#getFunction()
	 * @see #getSampleRealization()
	 * @generated
	 */
	EReference getSampleRealization_Function();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Natrue.SampleRealization#getMeasureName <em>Measure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Name</em>'.
	 * @see mARTE.NFP_Natrue.SampleRealization#getMeasureName()
	 * @see #getSampleRealization()
	 * @generated
	 */
	EAttribute getSampleRealization_MeasureName();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.AbstractNFP <em>Abstract NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract NFP</em>'.
	 * @see mARTE.NFP_Natrue.AbstractNFP
	 * @generated
	 */
	EClass getAbstractNFP();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see mARTE.NFP_Natrue.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Natrue.Quantity#getAllowedUnits <em>Allowed Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Units</em>'.
	 * @see mARTE.NFP_Natrue.Quantity#getAllowedUnits()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_AllowedUnits();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.QuantitativeNFP <em>Quantitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative NFP</em>'.
	 * @see mARTE.NFP_Natrue.QuantitativeNFP
	 * @generated
	 */
	EClass getQuantitativeNFP();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.NFP_Natrue.QuantitativeNFP#getRealizationValues <em>Realization Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realization Values</em>'.
	 * @see mARTE.NFP_Natrue.QuantitativeNFP#getRealizationValues()
	 * @see #getQuantitativeNFP()
	 * @generated
	 */
	EReference getQuantitativeNFP_RealizationValues();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.NFP_Natrue.QuantitativeNFP#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see mARTE.NFP_Natrue.QuantitativeNFP#getMeasure()
	 * @see #getQuantitativeNFP()
	 * @generated
	 */
	EReference getQuantitativeNFP_Measure();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Natrue.QuantitativeNFP#getNumbers <em>Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers</em>'.
	 * @see mARTE.NFP_Natrue.QuantitativeNFP#getNumbers()
	 * @see #getQuantitativeNFP()
	 * @generated
	 */
	EAttribute getQuantitativeNFP_Numbers();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see mARTE.NFP_Natrue.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the reference '{@link mARTE.NFP_Natrue.Measure#getMeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Unit</em>'.
	 * @see mARTE.NFP_Natrue.Measure#getMeasurementUnit()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_MeasurementUnit();

	/**
	 * Returns the meta object for the reference '{@link mARTE.NFP_Natrue.Measure#getPhysicalQuantity <em>Physical Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Quantity</em>'.
	 * @see mARTE.NFP_Natrue.Measure#getPhysicalQuantity()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_PhysicalQuantity();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Natrue.Measure#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain</em>'.
	 * @see mARTE.NFP_Natrue.Measure#getDomain()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Domain();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Natrue.Measure#getMeasureName <em>Measure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Name</em>'.
	 * @see mARTE.NFP_Natrue.Measure#getMeasureName()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_MeasureName();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see mARTE.NFP_Natrue.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Natrue.Unit#getConvFactor <em>Conv Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conv Factor</em>'.
	 * @see mARTE.NFP_Natrue.Unit#getConvFactor()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_ConvFactor();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Natrue.Unit#getConvOffset <em>Conv Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conv Offset</em>'.
	 * @see mARTE.NFP_Natrue.Unit#getConvOffset()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_ConvOffset();

	/**
	 * Returns the meta object for the reference '{@link mARTE.NFP_Natrue.Unit#getBaseUnit <em>Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Unit</em>'.
	 * @see mARTE.NFP_Natrue.Unit#getBaseUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_BaseUnit();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Natrue.QualitativeNFP <em>Qualitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative NFP</em>'.
	 * @see mARTE.NFP_Natrue.QualitativeNFP
	 * @generated
	 */
	EClass getQualitativeNFP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NFP_NatrueFactory getNFP_NatrueFactory();

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
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.DerivedQuantityImpl <em>Derived Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.DerivedQuantityImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getDerivedQuantity()
		 * @generated
		 */
		EClass DERIVED_QUANTITY = eINSTANCE.getDerivedQuantity();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.BaseQuantityImpl <em>Base Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.BaseQuantityImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getBaseQuantity()
		 * @generated
		 */
		EClass BASE_QUANTITY = eINSTANCE.getBaseQuantity();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.SampleRealizationImpl <em>Sample Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.SampleRealizationImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getSampleRealization()
		 * @generated
		 */
		EClass SAMPLE_REALIZATION = eINSTANCE.getSampleRealization();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAMPLE_REALIZATION__FUNCTION = eINSTANCE.getSampleRealization_Function();

		/**
		 * The meta object literal for the '<em><b>Measure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMPLE_REALIZATION__MEASURE_NAME = eINSTANCE.getSampleRealization_MeasureName();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.AbstractNFPImpl <em>Abstract NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.AbstractNFPImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getAbstractNFP()
		 * @generated
		 */
		EClass ABSTRACT_NFP = eINSTANCE.getAbstractNFP();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.QuantityImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getQuantity()
		 * @generated
		 */
		EClass QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '<em><b>Allowed Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__ALLOWED_UNITS = eINSTANCE.getQuantity_AllowedUnits();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.QuantitativeNFPImpl <em>Quantitative NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.QuantitativeNFPImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getQuantitativeNFP()
		 * @generated
		 */
		EClass QUANTITATIVE_NFP = eINSTANCE.getQuantitativeNFP();

		/**
		 * The meta object literal for the '<em><b>Realization Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITATIVE_NFP__REALIZATION_VALUES = eINSTANCE.getQuantitativeNFP_RealizationValues();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITATIVE_NFP__MEASURE = eINSTANCE.getQuantitativeNFP_Measure();

		/**
		 * The meta object literal for the '<em><b>Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_NFP__NUMBERS = eINSTANCE.getQuantitativeNFP_Numbers();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.MeasureImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Measurement Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__MEASUREMENT_UNIT = eINSTANCE.getMeasure_MeasurementUnit();

		/**
		 * The meta object literal for the '<em><b>Physical Quantity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__PHYSICAL_QUANTITY = eINSTANCE.getMeasure_PhysicalQuantity();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__DOMAIN = eINSTANCE.getMeasure_Domain();

		/**
		 * The meta object literal for the '<em><b>Measure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__MEASURE_NAME = eINSTANCE.getMeasure_MeasureName();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.UnitImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Conv Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__CONV_FACTOR = eINSTANCE.getUnit_ConvFactor();

		/**
		 * The meta object literal for the '<em><b>Conv Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__CONV_OFFSET = eINSTANCE.getUnit_ConvOffset();

		/**
		 * The meta object literal for the '<em><b>Base Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__BASE_UNIT = eINSTANCE.getUnit_BaseUnit();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Natrue.impl.QualitativeNFPImpl <em>Qualitative NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Natrue.impl.QualitativeNFPImpl
		 * @see mARTE.NFP_Natrue.impl.NFP_NatruePackageImpl#getQualitativeNFP()
		 * @generated
		 */
		EClass QUALITATIVE_NFP = eINSTANCE.getQualitativeNFP();

	}

} //NFP_NatruePackage
