/**
 */
package mARTE;

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
 * @see mARTE.MARTEFactory
 * @model kind="package"
 * @generated
 */
public interface MARTEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mARTE";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mARTE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mARTE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MARTEPackage eINSTANCE = mARTE.impl.MARTEPackageImpl.init();

	/**
	 * The meta object id for the '{@link mARTE.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.DimensionImpl
	 * @see mARTE.impl.MARTEPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Base Exponents</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__BASE_EXPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Basequantity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__BASEQUANTITY = 2;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.UnitImpl
	 * @see mARTE.impl.MARTEPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

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
	 * The meta object id for the '{@link mARTE.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.MeasureImpl
	 * @see mARTE.impl.MARTEPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 2;

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
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.SampleRealizationImpl <em>Sample Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.SampleRealizationImpl
	 * @see mARTE.impl.MARTEPackageImpl#getSampleRealization()
	 * @generated
	 */
	int SAMPLE_REALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REALIZATION__FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Sample Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sample Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMPLE_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.AbstractNFPImpl <em>Abstract NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.AbstractNFPImpl
	 * @see mARTE.impl.MARTEPackageImpl#getAbstractNFP()
	 * @generated
	 */
	int ABSTRACT_NFP = 6;

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
	 * The meta object id for the '{@link mARTE.impl.QuantitativeNFPImpl <em>Quantitative NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.QuantitativeNFPImpl
	 * @see mARTE.impl.MARTEPackageImpl#getQuantitativeNFP()
	 * @generated
	 */
	int QUANTITATIVE_NFP = 4;

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
	 * The number of structural features of the '<em>Quantitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_NFP_FEATURE_COUNT = ABSTRACT_NFP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_NFP_OPERATION_COUNT = ABSTRACT_NFP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.QualitativeNFPImpl <em>Qualitative NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.QualitativeNFPImpl
	 * @see mARTE.impl.MARTEPackageImpl#getQualitativeNFP()
	 * @generated
	 */
	int QUALITATIVE_NFP = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_NFP__PARAMETER = ABSTRACT_NFP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_NFP_FEATURE_COUNT = ABSTRACT_NFP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Qualitative NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_NFP_OPERATION_COUNT = ABSTRACT_NFP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.QuantityImpl <em>Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.QuantityImpl
	 * @see mARTE.impl.MARTEPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 7;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__ALLOWED_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.DerivedQuantityImpl <em>Derived Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.DerivedQuantityImpl
	 * @see mARTE.impl.MARTEPackageImpl#getDerivedQuantity()
	 * @generated
	 */
	int DERIVED_QUANTITY = 8;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY__ALLOWED_UNITS = QUANTITY__ALLOWED_UNITS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_QUANTITY__DIMENSION = QUANTITY__DIMENSION;

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
	 * The meta object id for the '{@link mARTE.impl.BaseQuantityImpl <em>Base Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.BaseQuantityImpl
	 * @see mARTE.impl.MARTEPackageImpl#getBaseQuantity()
	 * @generated
	 */
	int BASE_QUANTITY = 9;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_QUANTITY__ALLOWED_UNITS = QUANTITY__ALLOWED_UNITS;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_QUANTITY__DIMENSION = QUANTITY__DIMENSION;

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
	 * The meta object id for the '{@link mARTE.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.TupleTypeImpl
	 * @see mARTE.impl.MARTEPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 10;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ValueTypeImpl
	 * @see mARTE.impl.MARTEPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ALLOWED_UNITS = TUPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DEFAULT_UNIT = TUPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE_ATTRIBUTE = TUPLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__UNIT_ATTRIBUTE = TUPLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expr Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__EXPR_ATTRIBUTE = TUPLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Qualifier Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__QUALIFIER_ATTRIBUTES = TUPLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = TUPLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = TUPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.ValuePropertyImpl <em>Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ValuePropertyImpl
	 * @see mARTE.impl.MARTEPackageImpl#getValueProperty()
	 * @generated
	 */
	int VALUE_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY__DEFAULT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.NFPImpl <em>NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.NFPImpl
	 * @see mARTE.impl.MARTEPackageImpl#getNFP()
	 * @generated
	 */
	int NFP = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP__TYPE = VALUE_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP__DEFAULT_VALUE = VALUE_PROPERTY__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_OPERATION_COUNT = VALUE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.NFP_TypeImpl <em>NFP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.NFP_TypeImpl
	 * @see mARTE.impl.MARTEPackageImpl#getNFP_Type()
	 * @generated
	 */
	int NFP_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE__ALLOWED_UNITS = VALUE_TYPE__ALLOWED_UNITS;

	/**
	 * The feature id for the '<em><b>Default Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE__DEFAULT_UNIT = VALUE_TYPE__DEFAULT_UNIT;

	/**
	 * The feature id for the '<em><b>Value Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE__VALUE_ATTRIBUTE = VALUE_TYPE__VALUE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Unit Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE__UNIT_ATTRIBUTE = VALUE_TYPE__UNIT_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Expr Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE__EXPR_ATTRIBUTE = VALUE_TYPE__EXPR_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Qualifier Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE__QUALIFIER_ATTRIBUTES = VALUE_TYPE__QUALIFIER_ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>NFP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NFP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.PropertyImpl
	 * @see mARTE.impl.MARTEPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 15;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ModelElementImpl
	 * @see mARTE.impl.MARTEPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 17;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.AnnotatedElementImpl
	 * @see mARTE.impl.MARTEPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Nfp Declaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__NFP_DECLARATION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nfp Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__NFP_VALUE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.AnnotatedModelImpl <em>Annotated Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.AnnotatedModelImpl
	 * @see mARTE.impl.MARTEPackageImpl#getAnnotatedModel()
	 * @generated
	 */
	int ANNOTATED_MODEL = 18;

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
	 * The meta object id for the '{@link mARTE.impl.ModelingConcernImpl <em>Modeling Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ModelingConcernImpl
	 * @see mARTE.impl.MARTEPackageImpl#getModelingConcern()
	 * @generated
	 */
	int MODELING_CONCERN = 19;

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
	 * The meta object id for the '{@link mARTE.impl.NFP_ConstrainImpl <em>NFP Constrain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.NFP_ConstrainImpl
	 * @see mARTE.impl.MARTEPackageImpl#getNFP_Constrain()
	 * @generated
	 */
	int NFP_CONSTRAIN = 20;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAIN__KIND = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAIN__MODE = 1;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAIN__CONSTRAINED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAIN__SPECIFICATION = 3;

	/**
	 * The number of structural features of the '<em>NFP Constrain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>NFP Constrain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ModeImpl
	 * @see mARTE.impl.MARTEPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 21;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ValueSpecificationImpl
	 * @see mARTE.impl.MARTEPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 22;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.AllocationImpl
	 * @see mARTE.impl.MARTEPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 23;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Inplied Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION__INPLIED_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.NFP_ConstraintImpl <em>NFP Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.NFP_ConstraintImpl
	 * @see mARTE.impl.MARTEPackageImpl#getNFP_Constraint()
	 * @generated
	 */
	int NFP_CONSTRAINT = 24;

	/**
	 * The number of structural features of the '<em>NFP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>NFP Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.AllocationEndImpl <em>Allocation End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.AllocationEndImpl
	 * @see mARTE.impl.MARTEPackageImpl#getAllocationEnd()
	 * @generated
	 */
	int ALLOCATION_END = 28;

	/**
	 * The number of structural features of the '<em>Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_END_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.ApplicationAllocationEndImpl <em>Application Allocation End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ApplicationAllocationEndImpl
	 * @see mARTE.impl.MARTEPackageImpl#getApplicationAllocationEnd()
	 * @generated
	 */
	int APPLICATION_ALLOCATION_END = 25;

	/**
	 * The number of structural features of the '<em>Application Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ALLOCATION_END_FEATURE_COUNT = ALLOCATION_END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ALLOCATION_END_OPERATION_COUNT = ALLOCATION_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.ExecutionPlatformAllocationEndImpl <em>Execution Platform Allocation End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.ExecutionPlatformAllocationEndImpl
	 * @see mARTE.impl.MARTEPackageImpl#getExecutionPlatformAllocationEnd()
	 * @generated
	 */
	int EXECUTION_PLATFORM_ALLOCATION_END = 26;

	/**
	 * The number of structural features of the '<em>Execution Platform Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_ALLOCATION_END_FEATURE_COUNT = ALLOCATION_END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Platform Allocation End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_ALLOCATION_END_OPERATION_COUNT = ALLOCATION_END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mARTE.impl.RefinementImpl <em>Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.impl.RefinementImpl
	 * @see mARTE.impl.MARTEPackageImpl#getRefinement()
	 * @generated
	 */
	int REFINEMENT = 27;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__GENERAL = 0;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__REFINED = 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT__CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.ConstrainKind <em>Constrain Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.ConstrainKind
	 * @see mARTE.impl.MARTEPackageImpl#getConstrainKind()
	 * @generated
	 */
	int CONSTRAIN_KIND = 29;

	/**
	 * Returns the meta object for class '{@link mARTE.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see mARTE.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.Dimension#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see mARTE.Dimension#getSymbol()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Symbol();

	/**
	 * Returns the meta object for the attribute list '{@link mARTE.Dimension#getBaseExponents <em>Base Exponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Base Exponents</em>'.
	 * @see mARTE.Dimension#getBaseExponents()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_BaseExponents();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Dimension#getBasequantity <em>Basequantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basequantity</em>'.
	 * @see mARTE.Dimension#getBasequantity()
	 * @see #getDimension()
	 * @generated
	 */
	EReference getDimension_Basequantity();

	/**
	 * Returns the meta object for class '{@link mARTE.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see mARTE.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.Unit#getConvFactor <em>Conv Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conv Factor</em>'.
	 * @see mARTE.Unit#getConvFactor()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_ConvFactor();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.Unit#getConvOffset <em>Conv Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conv Offset</em>'.
	 * @see mARTE.Unit#getConvOffset()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_ConvOffset();

	/**
	 * Returns the meta object for the reference '{@link mARTE.Unit#getBaseUnit <em>Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Unit</em>'.
	 * @see mARTE.Unit#getBaseUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_BaseUnit();

	/**
	 * Returns the meta object for class '{@link mARTE.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see mARTE.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the reference '{@link mARTE.Measure#getMeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Unit</em>'.
	 * @see mARTE.Measure#getMeasurementUnit()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_MeasurementUnit();

	/**
	 * Returns the meta object for the reference '{@link mARTE.Measure#getPhysicalQuantity <em>Physical Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Quantity</em>'.
	 * @see mARTE.Measure#getPhysicalQuantity()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_PhysicalQuantity();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Measure#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain</em>'.
	 * @see mARTE.Measure#getDomain()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Domain();

	/**
	 * Returns the meta object for class '{@link mARTE.SampleRealization <em>Sample Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sample Realization</em>'.
	 * @see mARTE.SampleRealization
	 * @generated
	 */
	EClass getSampleRealization();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.SampleRealization#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function</em>'.
	 * @see mARTE.SampleRealization#getFunction()
	 * @see #getSampleRealization()
	 * @generated
	 */
	EReference getSampleRealization_Function();

	/**
	 * Returns the meta object for class '{@link mARTE.QuantitativeNFP <em>Quantitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative NFP</em>'.
	 * @see mARTE.QuantitativeNFP
	 * @generated
	 */
	EClass getQuantitativeNFP();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.QuantitativeNFP#getRealizationValues <em>Realization Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realization Values</em>'.
	 * @see mARTE.QuantitativeNFP#getRealizationValues()
	 * @see #getQuantitativeNFP()
	 * @generated
	 */
	EReference getQuantitativeNFP_RealizationValues();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.QuantitativeNFP#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure</em>'.
	 * @see mARTE.QuantitativeNFP#getMeasure()
	 * @see #getQuantitativeNFP()
	 * @generated
	 */
	EReference getQuantitativeNFP_Measure();

	/**
	 * Returns the meta object for class '{@link mARTE.QualitativeNFP <em>Qualitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative NFP</em>'.
	 * @see mARTE.QualitativeNFP
	 * @generated
	 */
	EClass getQualitativeNFP();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.QualitativeNFP#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see mARTE.QualitativeNFP#getParameter()
	 * @see #getQualitativeNFP()
	 * @generated
	 */
	EReference getQualitativeNFP_Parameter();

	/**
	 * Returns the meta object for class '{@link mARTE.AbstractNFP <em>Abstract NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract NFP</em>'.
	 * @see mARTE.AbstractNFP
	 * @generated
	 */
	EClass getAbstractNFP();

	/**
	 * Returns the meta object for class '{@link mARTE.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity</em>'.
	 * @see mARTE.Quantity
	 * @generated
	 */
	EClass getQuantity();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Quantity#getAllowedUnits <em>Allowed Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Units</em>'.
	 * @see mARTE.Quantity#getAllowedUnits()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_AllowedUnits();

	/**
	 * Returns the meta object for the reference '{@link mARTE.Quantity#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see mARTE.Quantity#getDimension()
	 * @see #getQuantity()
	 * @generated
	 */
	EReference getQuantity_Dimension();

	/**
	 * Returns the meta object for class '{@link mARTE.DerivedQuantity <em>Derived Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Quantity</em>'.
	 * @see mARTE.DerivedQuantity
	 * @generated
	 */
	EClass getDerivedQuantity();

	/**
	 * Returns the meta object for class '{@link mARTE.BaseQuantity <em>Base Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Quantity</em>'.
	 * @see mARTE.BaseQuantity
	 * @generated
	 */
	EClass getBaseQuantity();

	/**
	 * Returns the meta object for class '{@link mARTE.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see mARTE.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for class '{@link mARTE.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see mARTE.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.ValueType#getAllowedUnits <em>Allowed Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Units</em>'.
	 * @see mARTE.ValueType#getAllowedUnits()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_AllowedUnits();

	/**
	 * Returns the meta object for the reference '{@link mARTE.ValueType#getDefaultUnit <em>Default Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Unit</em>'.
	 * @see mARTE.ValueType#getDefaultUnit()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_DefaultUnit();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE.ValueType#getValueAttribute <em>Value Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Attribute</em>'.
	 * @see mARTE.ValueType#getValueAttribute()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_ValueAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE.ValueType#getUnitAttribute <em>Unit Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Attribute</em>'.
	 * @see mARTE.ValueType#getUnitAttribute()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_UnitAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE.ValueType#getExprAttribute <em>Expr Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr Attribute</em>'.
	 * @see mARTE.ValueType#getExprAttribute()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_ExprAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.ValueType#getQualifierAttributes <em>Qualifier Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier Attributes</em>'.
	 * @see mARTE.ValueType#getQualifierAttributes()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_QualifierAttributes();

	/**
	 * Returns the meta object for class '{@link mARTE.ValueProperty <em>Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Property</em>'.
	 * @see mARTE.ValueProperty
	 * @generated
	 */
	EClass getValueProperty();

	/**
	 * Returns the meta object for the reference '{@link mARTE.ValueProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see mARTE.ValueProperty#getType()
	 * @see #getValueProperty()
	 * @generated
	 */
	EReference getValueProperty_Type();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE.ValueProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see mARTE.ValueProperty#getDefaultValue()
	 * @see #getValueProperty()
	 * @generated
	 */
	EReference getValueProperty_DefaultValue();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP <em>NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP</em>'.
	 * @see mARTE.NFP
	 * @generated
	 */
	EClass getNFP();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Type <em>NFP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Type</em>'.
	 * @see mARTE.NFP_Type
	 * @generated
	 */
	EClass getNFP_Type();

	/**
	 * Returns the meta object for class '{@link mARTE.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see mARTE.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link mARTE.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see mARTE.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.AnnotatedElement#getNfpDeclaration <em>Nfp Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nfp Declaration</em>'.
	 * @see mARTE.AnnotatedElement#getNfpDeclaration()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_NfpDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.AnnotatedElement#getNfpValue <em>Nfp Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nfp Value</em>'.
	 * @see mARTE.AnnotatedElement#getNfpValue()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EReference getAnnotatedElement_NfpValue();

	/**
	 * Returns the meta object for class '{@link mARTE.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see mARTE.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for class '{@link mARTE.AnnotatedModel <em>Annotated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Model</em>'.
	 * @see mARTE.AnnotatedModel
	 * @generated
	 */
	EClass getAnnotatedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.AnnotatedModel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owner</em>'.
	 * @see mARTE.AnnotatedModel#getOwner()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_Owner();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.AnnotatedModel#getAnnotationConcern <em>Annotation Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotation Concern</em>'.
	 * @see mARTE.AnnotatedModel#getAnnotationConcern()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_AnnotationConcern();

	/**
	 * Returns the meta object for the containment reference '{@link mARTE.AnnotatedModel#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see mARTE.AnnotatedModel#getContext()
	 * @see #getAnnotatedModel()
	 * @generated
	 */
	EReference getAnnotatedModel_Context();

	/**
	 * Returns the meta object for class '{@link mARTE.ModelingConcern <em>Modeling Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Concern</em>'.
	 * @see mARTE.ModelingConcern
	 * @generated
	 */
	EClass getModelingConcern();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.ModelingConcern#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mARTE.ModelingConcern#getDescription()
	 * @see #getModelingConcern()
	 * @generated
	 */
	EAttribute getModelingConcern_Description();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.ModelingConcern#getRelevantNfp <em>Relevant Nfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relevant Nfp</em>'.
	 * @see mARTE.ModelingConcern#getRelevantNfp()
	 * @see #getModelingConcern()
	 * @generated
	 */
	EReference getModelingConcern_RelevantNfp();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Constrain <em>NFP Constrain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Constrain</em>'.
	 * @see mARTE.NFP_Constrain
	 * @generated
	 */
	EClass getNFP_Constrain();

	/**
	 * Returns the meta object for the attribute '{@link mARTE.NFP_Constrain#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see mARTE.NFP_Constrain#getKind()
	 * @see #getNFP_Constrain()
	 * @generated
	 */
	EAttribute getNFP_Constrain_Kind();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Constrain#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mode</em>'.
	 * @see mARTE.NFP_Constrain#getMode()
	 * @see #getNFP_Constrain()
	 * @generated
	 */
	EReference getNFP_Constrain_Mode();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Constrain#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Element</em>'.
	 * @see mARTE.NFP_Constrain#getConstrainedElement()
	 * @see #getNFP_Constrain()
	 * @generated
	 */
	EReference getNFP_Constrain_ConstrainedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mARTE.NFP_Constrain#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specification</em>'.
	 * @see mARTE.NFP_Constrain#getSpecification()
	 * @see #getNFP_Constrain()
	 * @generated
	 */
	EReference getNFP_Constrain_Specification();

	/**
	 * Returns the meta object for class '{@link mARTE.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see mARTE.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for class '{@link mARTE.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see mARTE.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link mARTE.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see mARTE.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see mARTE.Allocation#getTarget()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Target();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see mARTE.Allocation#getSource()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_Source();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Allocation#getInpliedConstraint <em>Inplied Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inplied Constraint</em>'.
	 * @see mARTE.Allocation#getInpliedConstraint()
	 * @see #getAllocation()
	 * @generated
	 */
	EReference getAllocation_InpliedConstraint();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Constraint <em>NFP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Constraint</em>'.
	 * @see mARTE.NFP_Constraint
	 * @generated
	 */
	EClass getNFP_Constraint();

	/**
	 * Returns the meta object for class '{@link mARTE.ApplicationAllocationEnd <em>Application Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Allocation End</em>'.
	 * @see mARTE.ApplicationAllocationEnd
	 * @generated
	 */
	EClass getApplicationAllocationEnd();

	/**
	 * Returns the meta object for class '{@link mARTE.ExecutionPlatformAllocationEnd <em>Execution Platform Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Platform Allocation End</em>'.
	 * @see mARTE.ExecutionPlatformAllocationEnd
	 * @generated
	 */
	EClass getExecutionPlatformAllocationEnd();

	/**
	 * Returns the meta object for class '{@link mARTE.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement</em>'.
	 * @see mARTE.Refinement
	 * @generated
	 */
	EClass getRefinement();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Refinement#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see mARTE.Refinement#getGeneral()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_General();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Refinement#getRefined <em>Refined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refined</em>'.
	 * @see mARTE.Refinement#getRefined()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Refined();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.Refinement#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see mARTE.Refinement#getConstraint()
	 * @see #getRefinement()
	 * @generated
	 */
	EReference getRefinement_Constraint();

	/**
	 * Returns the meta object for class '{@link mARTE.AllocationEnd <em>Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation End</em>'.
	 * @see mARTE.AllocationEnd
	 * @generated
	 */
	EClass getAllocationEnd();

	/**
	 * Returns the meta object for enum '{@link mARTE.ConstrainKind <em>Constrain Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constrain Kind</em>'.
	 * @see mARTE.ConstrainKind
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
	MARTEFactory getMARTEFactory();

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
		 * The meta object literal for the '{@link mARTE.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.DimensionImpl
		 * @see mARTE.impl.MARTEPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__SYMBOL = eINSTANCE.getDimension_Symbol();

		/**
		 * The meta object literal for the '<em><b>Base Exponents</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__BASE_EXPONENTS = eINSTANCE.getDimension_BaseExponents();

		/**
		 * The meta object literal for the '<em><b>Basequantity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSION__BASEQUANTITY = eINSTANCE.getDimension_Basequantity();

		/**
		 * The meta object literal for the '{@link mARTE.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.UnitImpl
		 * @see mARTE.impl.MARTEPackageImpl#getUnit()
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
		 * The meta object literal for the '{@link mARTE.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.MeasureImpl
		 * @see mARTE.impl.MARTEPackageImpl#getMeasure()
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
		 * The meta object literal for the '{@link mARTE.impl.SampleRealizationImpl <em>Sample Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.SampleRealizationImpl
		 * @see mARTE.impl.MARTEPackageImpl#getSampleRealization()
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
		 * The meta object literal for the '{@link mARTE.impl.QuantitativeNFPImpl <em>Quantitative NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.QuantitativeNFPImpl
		 * @see mARTE.impl.MARTEPackageImpl#getQuantitativeNFP()
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
		 * The meta object literal for the '{@link mARTE.impl.QualitativeNFPImpl <em>Qualitative NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.QualitativeNFPImpl
		 * @see mARTE.impl.MARTEPackageImpl#getQualitativeNFP()
		 * @generated
		 */
		EClass QUALITATIVE_NFP = eINSTANCE.getQualitativeNFP();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITATIVE_NFP__PARAMETER = eINSTANCE.getQualitativeNFP_Parameter();

		/**
		 * The meta object literal for the '{@link mARTE.impl.AbstractNFPImpl <em>Abstract NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.AbstractNFPImpl
		 * @see mARTE.impl.MARTEPackageImpl#getAbstractNFP()
		 * @generated
		 */
		EClass ABSTRACT_NFP = eINSTANCE.getAbstractNFP();

		/**
		 * The meta object literal for the '{@link mARTE.impl.QuantityImpl <em>Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.QuantityImpl
		 * @see mARTE.impl.MARTEPackageImpl#getQuantity()
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
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY__DIMENSION = eINSTANCE.getQuantity_Dimension();

		/**
		 * The meta object literal for the '{@link mARTE.impl.DerivedQuantityImpl <em>Derived Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.DerivedQuantityImpl
		 * @see mARTE.impl.MARTEPackageImpl#getDerivedQuantity()
		 * @generated
		 */
		EClass DERIVED_QUANTITY = eINSTANCE.getDerivedQuantity();

		/**
		 * The meta object literal for the '{@link mARTE.impl.BaseQuantityImpl <em>Base Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.BaseQuantityImpl
		 * @see mARTE.impl.MARTEPackageImpl#getBaseQuantity()
		 * @generated
		 */
		EClass BASE_QUANTITY = eINSTANCE.getBaseQuantity();

		/**
		 * The meta object literal for the '{@link mARTE.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.TupleTypeImpl
		 * @see mARTE.impl.MARTEPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '{@link mARTE.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ValueTypeImpl
		 * @see mARTE.impl.MARTEPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Allowed Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__ALLOWED_UNITS = eINSTANCE.getValueType_AllowedUnits();

		/**
		 * The meta object literal for the '<em><b>Default Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__DEFAULT_UNIT = eINSTANCE.getValueType_DefaultUnit();

		/**
		 * The meta object literal for the '<em><b>Value Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__VALUE_ATTRIBUTE = eINSTANCE.getValueType_ValueAttribute();

		/**
		 * The meta object literal for the '<em><b>Unit Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__UNIT_ATTRIBUTE = eINSTANCE.getValueType_UnitAttribute();

		/**
		 * The meta object literal for the '<em><b>Expr Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__EXPR_ATTRIBUTE = eINSTANCE.getValueType_ExprAttribute();

		/**
		 * The meta object literal for the '<em><b>Qualifier Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__QUALIFIER_ATTRIBUTES = eINSTANCE.getValueType_QualifierAttributes();

		/**
		 * The meta object literal for the '{@link mARTE.impl.ValuePropertyImpl <em>Value Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ValuePropertyImpl
		 * @see mARTE.impl.MARTEPackageImpl#getValueProperty()
		 * @generated
		 */
		EClass VALUE_PROPERTY = eINSTANCE.getValueProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPERTY__TYPE = eINSTANCE.getValueProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PROPERTY__DEFAULT_VALUE = eINSTANCE.getValueProperty_DefaultValue();

		/**
		 * The meta object literal for the '{@link mARTE.impl.NFPImpl <em>NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.NFPImpl
		 * @see mARTE.impl.MARTEPackageImpl#getNFP()
		 * @generated
		 */
		EClass NFP = eINSTANCE.getNFP();

		/**
		 * The meta object literal for the '{@link mARTE.impl.NFP_TypeImpl <em>NFP Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.NFP_TypeImpl
		 * @see mARTE.impl.MARTEPackageImpl#getNFP_Type()
		 * @generated
		 */
		EClass NFP_TYPE = eINSTANCE.getNFP_Type();

		/**
		 * The meta object literal for the '{@link mARTE.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.PropertyImpl
		 * @see mARTE.impl.MARTEPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link mARTE.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.AnnotatedElementImpl
		 * @see mARTE.impl.MARTEPackageImpl#getAnnotatedElement()
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
		 * The meta object literal for the '<em><b>Nfp Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATED_ELEMENT__NFP_VALUE = eINSTANCE.getAnnotatedElement_NfpValue();

		/**
		 * The meta object literal for the '{@link mARTE.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ModelElementImpl
		 * @see mARTE.impl.MARTEPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '{@link mARTE.impl.AnnotatedModelImpl <em>Annotated Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.AnnotatedModelImpl
		 * @see mARTE.impl.MARTEPackageImpl#getAnnotatedModel()
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
		 * The meta object literal for the '{@link mARTE.impl.ModelingConcernImpl <em>Modeling Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ModelingConcernImpl
		 * @see mARTE.impl.MARTEPackageImpl#getModelingConcern()
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
		 * The meta object literal for the '{@link mARTE.impl.NFP_ConstrainImpl <em>NFP Constrain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.NFP_ConstrainImpl
		 * @see mARTE.impl.MARTEPackageImpl#getNFP_Constrain()
		 * @generated
		 */
		EClass NFP_CONSTRAIN = eINSTANCE.getNFP_Constrain();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_CONSTRAIN__KIND = eINSTANCE.getNFP_Constrain_Kind();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_CONSTRAIN__MODE = eINSTANCE.getNFP_Constrain_Mode();

		/**
		 * The meta object literal for the '<em><b>Constrained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_CONSTRAIN__CONSTRAINED_ELEMENT = eINSTANCE.getNFP_Constrain_ConstrainedElement();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_CONSTRAIN__SPECIFICATION = eINSTANCE.getNFP_Constrain_Specification();

		/**
		 * The meta object literal for the '{@link mARTE.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ModeImpl
		 * @see mARTE.impl.MARTEPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link mARTE.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ValueSpecificationImpl
		 * @see mARTE.impl.MARTEPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link mARTE.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.AllocationImpl
		 * @see mARTE.impl.MARTEPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__TARGET = eINSTANCE.getAllocation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__SOURCE = eINSTANCE.getAllocation_Source();

		/**
		 * The meta object literal for the '<em><b>Inplied Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION__INPLIED_CONSTRAINT = eINSTANCE.getAllocation_InpliedConstraint();

		/**
		 * The meta object literal for the '{@link mARTE.impl.NFP_ConstraintImpl <em>NFP Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.NFP_ConstraintImpl
		 * @see mARTE.impl.MARTEPackageImpl#getNFP_Constraint()
		 * @generated
		 */
		EClass NFP_CONSTRAINT = eINSTANCE.getNFP_Constraint();

		/**
		 * The meta object literal for the '{@link mARTE.impl.ApplicationAllocationEndImpl <em>Application Allocation End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ApplicationAllocationEndImpl
		 * @see mARTE.impl.MARTEPackageImpl#getApplicationAllocationEnd()
		 * @generated
		 */
		EClass APPLICATION_ALLOCATION_END = eINSTANCE.getApplicationAllocationEnd();

		/**
		 * The meta object literal for the '{@link mARTE.impl.ExecutionPlatformAllocationEndImpl <em>Execution Platform Allocation End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.ExecutionPlatformAllocationEndImpl
		 * @see mARTE.impl.MARTEPackageImpl#getExecutionPlatformAllocationEnd()
		 * @generated
		 */
		EClass EXECUTION_PLATFORM_ALLOCATION_END = eINSTANCE.getExecutionPlatformAllocationEnd();

		/**
		 * The meta object literal for the '{@link mARTE.impl.RefinementImpl <em>Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.RefinementImpl
		 * @see mARTE.impl.MARTEPackageImpl#getRefinement()
		 * @generated
		 */
		EClass REFINEMENT = eINSTANCE.getRefinement();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__GENERAL = eINSTANCE.getRefinement_General();

		/**
		 * The meta object literal for the '<em><b>Refined</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__REFINED = eINSTANCE.getRefinement_Refined();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT__CONSTRAINT = eINSTANCE.getRefinement_Constraint();

		/**
		 * The meta object literal for the '{@link mARTE.impl.AllocationEndImpl <em>Allocation End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.impl.AllocationEndImpl
		 * @see mARTE.impl.MARTEPackageImpl#getAllocationEnd()
		 * @generated
		 */
		EClass ALLOCATION_END = eINSTANCE.getAllocationEnd();

		/**
		 * The meta object literal for the '{@link mARTE.ConstrainKind <em>Constrain Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.ConstrainKind
		 * @see mARTE.impl.MARTEPackageImpl#getConstrainKind()
		 * @generated
		 */
		EEnum CONSTRAIN_KIND = eINSTANCE.getConstrainKind();

	}

} //MARTEPackage
