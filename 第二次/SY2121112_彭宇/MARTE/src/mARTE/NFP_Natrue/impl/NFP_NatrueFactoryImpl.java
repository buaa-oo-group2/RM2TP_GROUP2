/**
 */
package mARTE.NFP_Natrue.impl;

import mARTE.NFP_Natrue.*;

import org.eclipse.emf.ecore.EClass;
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
public class NFP_NatrueFactoryImpl extends EFactoryImpl implements NFP_NatrueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NFP_NatrueFactory init() {
		try {
			NFP_NatrueFactory theNFP_NatrueFactory = (NFP_NatrueFactory)EPackage.Registry.INSTANCE.getEFactory(NFP_NatruePackage.eNS_URI);
			if (theNFP_NatrueFactory != null) {
				return theNFP_NatrueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NFP_NatrueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_NatrueFactoryImpl() {
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
			case NFP_NatruePackage.DERIVED_QUANTITY: return createDerivedQuantity();
			case NFP_NatruePackage.BASE_QUANTITY: return createBaseQuantity();
			case NFP_NatruePackage.SAMPLE_REALIZATION: return createSampleRealization();
			case NFP_NatruePackage.QUANTITATIVE_NFP: return createQuantitativeNFP();
			case NFP_NatruePackage.MEASURE: return createMeasure();
			case NFP_NatruePackage.UNIT: return createUnit();
			case NFP_NatruePackage.QUALITATIVE_NFP: return createQualitativeNFP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
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
	public QualitativeNFP createQualitativeNFP() {
		QualitativeNFPImpl qualitativeNFP = new QualitativeNFPImpl();
		return qualitativeNFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_NatruePackage getNFP_NatruePackage() {
		return (NFP_NatruePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NFP_NatruePackage getPackage() {
		return NFP_NatruePackage.eINSTANCE;
	}

} //NFP_NatrueFactoryImpl
