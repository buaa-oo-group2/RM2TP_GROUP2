/**
 */
package mARTE.util;

import mARTE.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mARTE.MARTEPackage
 * @generated
 */
public class MARTEAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MARTEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTEAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MARTEPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MARTESwitch<Adapter> modelSwitch = new MARTESwitch<Adapter>() {
		@Override
		public Adapter caseDimension(Dimension object) {
			return createDimensionAdapter();
		}

		@Override
		public Adapter caseUnit(Unit object) {
			return createUnitAdapter();
		}

		@Override
		public Adapter caseMeasure(Measure object) {
			return createMeasureAdapter();
		}

		@Override
		public Adapter caseSampleRealization(SampleRealization object) {
			return createSampleRealizationAdapter();
		}

		@Override
		public Adapter caseQuantitativeNFP(QuantitativeNFP object) {
			return createQuantitativeNFPAdapter();
		}

		@Override
		public Adapter caseQualitativeNFP(QualitativeNFP object) {
			return createQualitativeNFPAdapter();
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
		public Adapter caseDerivedQuantity(DerivedQuantity object) {
			return createDerivedQuantityAdapter();
		}

		@Override
		public Adapter caseBaseQuantity(BaseQuantity object) {
			return createBaseQuantityAdapter();
		}

		@Override
		public Adapter caseTupleType(TupleType object) {
			return createTupleTypeAdapter();
		}

		@Override
		public Adapter caseValueType(ValueType object) {
			return createValueTypeAdapter();
		}

		@Override
		public Adapter caseValueProperty(ValueProperty object) {
			return createValuePropertyAdapter();
		}

		@Override
		public Adapter caseNFP(NFP object) {
			return createNFPAdapter();
		}

		@Override
		public Adapter caseNFP_Type(NFP_Type object) {
			return createNFP_TypeAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseAnnotatedElement(AnnotatedElement object) {
			return createAnnotatedElementAdapter();
		}

		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseAnnotatedModel(AnnotatedModel object) {
			return createAnnotatedModelAdapter();
		}

		@Override
		public Adapter caseModelingConcern(ModelingConcern object) {
			return createModelingConcernAdapter();
		}

		@Override
		public Adapter caseNFP_Constrain(NFP_Constrain object) {
			return createNFP_ConstrainAdapter();
		}

		@Override
		public Adapter caseMode(Mode object) {
			return createModeAdapter();
		}

		@Override
		public Adapter caseValueSpecification(ValueSpecification object) {
			return createValueSpecificationAdapter();
		}

		@Override
		public Adapter caseAllocation(Allocation object) {
			return createAllocationAdapter();
		}

		@Override
		public Adapter caseNFP_Constraint(NFP_Constraint object) {
			return createNFP_ConstraintAdapter();
		}

		@Override
		public Adapter caseApplicationAllocationEnd(ApplicationAllocationEnd object) {
			return createApplicationAllocationEndAdapter();
		}

		@Override
		public Adapter caseExecutionPlatformAllocationEnd(ExecutionPlatformAllocationEnd object) {
			return createExecutionPlatformAllocationEndAdapter();
		}

		@Override
		public Adapter caseRefinement(Refinement object) {
			return createRefinementAdapter();
		}

		@Override
		public Adapter caseAllocationEnd(AllocationEnd object) {
			return createAllocationEndAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.SampleRealization <em>Sample Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.SampleRealization
	 * @generated
	 */
	public Adapter createSampleRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.QuantitativeNFP <em>Quantitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.QuantitativeNFP
	 * @generated
	 */
	public Adapter createQuantitativeNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.QualitativeNFP <em>Qualitative NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.QualitativeNFP
	 * @generated
	 */
	public Adapter createQualitativeNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.AbstractNFP <em>Abstract NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.AbstractNFP
	 * @generated
	 */
	public Adapter createAbstractNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.DerivedQuantity <em>Derived Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.DerivedQuantity
	 * @generated
	 */
	public Adapter createDerivedQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.BaseQuantity <em>Base Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.BaseQuantity
	 * @generated
	 */
	public Adapter createBaseQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.TupleType
	 * @generated
	 */
	public Adapter createTupleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.ValueProperty <em>Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.ValueProperty
	 * @generated
	 */
	public Adapter createValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP <em>NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP
	 * @generated
	 */
	public Adapter createNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Type <em>NFP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Type
	 * @generated
	 */
	public Adapter createNFP_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.AnnotatedModel <em>Annotated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.AnnotatedModel
	 * @generated
	 */
	public Adapter createAnnotatedModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.ModelingConcern <em>Modeling Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.ModelingConcern
	 * @generated
	 */
	public Adapter createModelingConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Constrain <em>NFP Constrain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Constrain
	 * @generated
	 */
	public Adapter createNFP_ConstrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Mode
	 * @generated
	 */
	public Adapter createModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Allocation
	 * @generated
	 */
	public Adapter createAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.NFP_Constraint <em>NFP Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.NFP_Constraint
	 * @generated
	 */
	public Adapter createNFP_ConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.ApplicationAllocationEnd <em>Application Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.ApplicationAllocationEnd
	 * @generated
	 */
	public Adapter createApplicationAllocationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.ExecutionPlatformAllocationEnd <em>Execution Platform Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.ExecutionPlatformAllocationEnd
	 * @generated
	 */
	public Adapter createExecutionPlatformAllocationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.Refinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.Refinement
	 * @generated
	 */
	public Adapter createRefinementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mARTE.AllocationEnd <em>Allocation End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mARTE.AllocationEnd
	 * @generated
	 */
	public Adapter createAllocationEndAdapter() {
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

} //MARTEAdapterFactory
