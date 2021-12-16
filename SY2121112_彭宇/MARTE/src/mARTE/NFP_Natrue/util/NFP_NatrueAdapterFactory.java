/**
 */
package mARTE.NFP_Natrue.util;

import mARTE.NFP_Natrue.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mARTE.NFP_Natrue.NFP_NatruePackage
 * @generated
 */
public class NFP_NatrueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NFP_NatruePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_NatrueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NFP_NatruePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_NatrueSwitch<Adapter> modelSwitch =
		new NFP_NatrueSwitch<Adapter>() {
			@Override
			public Adapter caseDerivedQuantity(DerivedQuantity object) {
				return createDerivedQuantityAdapter();
			}
			@Override
			public Adapter caseBaseQuantity(BaseQuantity object) {
				return createBaseQuantityAdapter();
			}
			@Override
			public Adapter caseSampleRealization(SampleRealization object) {
				return createSampleRealizationAdapter();
			}
			@Override
			public Adapter caseAbstractNFP(AbstractNFP object) {
				return createAbstractNFPAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseQuantitativeNFP(QuantitativeNFP object) {
				return createQuantitativeNFPAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseQualitativeNFP(QualitativeNFP object) {
				return createQualitativeNFPAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.DerivedQuantity <em>Derived Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.DerivedQuantity
	 * @generated
	 */
	public Adapter createDerivedQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.BaseQuantity <em>Base Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.BaseQuantity
	 * @generated
	 */
	public Adapter createBaseQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.SampleRealization <em>Sample Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.SampleRealization
	 * @generated
	 */
	public Adapter createSampleRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.AbstractNFP <em>Abstract NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.AbstractNFP
	 * @generated
	 */
	public Adapter createAbstractNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.QuantitativeNFP <em>Quantitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.QuantitativeNFP
	 * @generated
	 */
	public Adapter createQuantitativeNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Natrue.QualitativeNFP <em>Qualitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Natrue.QualitativeNFP
	 * @generated
	 */
	public Adapter createQualitativeNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NFP_NatrueAdapterFactory
