/**
 */
package mARTE.NFP_Declaration;

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
 * @see mARTE.NFP_Declaration.NFP_DeclarationFactory
 * @model kind="package"
 * @generated
 */
public interface NFP_DeclarationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "NFP_Declaration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mARTE/NFP_Declaration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declaration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NFP_DeclarationPackage eINSTANCE = mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl.init();

	/**
	 * The meta object id for the '{@link mARTE.NFP_Declaration.impl.ValuePropertyImpl <em>Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Declaration.impl.ValuePropertyImpl
	 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getValueProperty()
	 * @generated
	 */
	int VALUE_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Declaration.impl.NFPImpl <em>NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Declaration.impl.NFPImpl
	 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getNFP()
	 * @generated
	 */
	int NFP = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP__TYPE = VALUE_PROPERTY__TYPE;

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
	 * The meta object id for the '{@link mARTE.NFP_Declaration.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Declaration.impl.ValueTypeImpl
	 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Allowed Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ALLOWED_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Default Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DEFAULT_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mARTE.NFP_Declaration.impl.NFP_TypeImpl <em>NFP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mARTE.NFP_Declaration.impl.NFP_TypeImpl
	 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getNFP_Type()
	 * @generated
	 */
	int NFP_TYPE = 3;

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
	 * Returns the meta object for class '{@link mARTE.NFP_Declaration.NFP <em>NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP</em>'.
	 * @see mARTE.NFP_Declaration.NFP
	 * @generated
	 */
	EClass getNFP();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Declaration.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see mARTE.NFP_Declaration.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the reference list '{@link mARTE.NFP_Declaration.ValueType#getAllowedUnits <em>Allowed Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Units</em>'.
	 * @see mARTE.NFP_Declaration.ValueType#getAllowedUnits()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_AllowedUnits();

	/**
	 * Returns the meta object for the reference '{@link mARTE.NFP_Declaration.ValueType#getDefaultUnit <em>Default Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Unit</em>'.
	 * @see mARTE.NFP_Declaration.ValueType#getDefaultUnit()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_DefaultUnit();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Declaration.ValueProperty <em>Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Property</em>'.
	 * @see mARTE.NFP_Declaration.ValueProperty
	 * @generated
	 */
	EClass getValueProperty();

	/**
	 * Returns the meta object for the reference '{@link mARTE.NFP_Declaration.ValueProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see mARTE.NFP_Declaration.ValueProperty#getType()
	 * @see #getValueProperty()
	 * @generated
	 */
	EReference getValueProperty_Type();

	/**
	 * Returns the meta object for class '{@link mARTE.NFP_Declaration.NFP_Type <em>NFP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Type</em>'.
	 * @see mARTE.NFP_Declaration.NFP_Type
	 * @generated
	 */
	EClass getNFP_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NFP_DeclarationFactory getNFP_DeclarationFactory();

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
		 * The meta object literal for the '{@link mARTE.NFP_Declaration.impl.NFPImpl <em>NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Declaration.impl.NFPImpl
		 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getNFP()
		 * @generated
		 */
		EClass NFP = eINSTANCE.getNFP();

		/**
		 * The meta object literal for the '{@link mARTE.NFP_Declaration.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Declaration.impl.ValueTypeImpl
		 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getValueType()
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
		 * The meta object literal for the '{@link mARTE.NFP_Declaration.impl.ValuePropertyImpl <em>Value Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Declaration.impl.ValuePropertyImpl
		 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getValueProperty()
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
		 * The meta object literal for the '{@link mARTE.NFP_Declaration.impl.NFP_TypeImpl <em>NFP Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mARTE.NFP_Declaration.impl.NFP_TypeImpl
		 * @see mARTE.NFP_Declaration.impl.NFP_DeclarationPackageImpl#getNFP_Type()
		 * @generated
		 */
		EClass NFP_TYPE = eINSTANCE.getNFP_Type();

	}

} //NFP_DeclarationPackage
