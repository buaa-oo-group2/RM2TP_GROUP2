/**
 */
package mARTE.util;

import mARTE.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mARTE.MARTEPackage
 * @generated
 */
public class MARTESwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MARTEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARTESwitch() {
		if (modelPackage == null) {
			modelPackage = MARTEPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MARTEPackage.DIMENSION: {
			Dimension dimension = (Dimension) theEObject;
			T result = caseDimension(dimension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.UNIT: {
			Unit unit = (Unit) theEObject;
			T result = caseUnit(unit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.MEASURE: {
			Measure measure = (Measure) theEObject;
			T result = caseMeasure(measure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.SAMPLE_REALIZATION: {
			SampleRealization sampleRealization = (SampleRealization) theEObject;
			T result = caseSampleRealization(sampleRealization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.QUANTITATIVE_NFP: {
			QuantitativeNFP quantitativeNFP = (QuantitativeNFP) theEObject;
			T result = caseQuantitativeNFP(quantitativeNFP);
			if (result == null)
				result = caseAbstractNFP(quantitativeNFP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.QUALITATIVE_NFP: {
			QualitativeNFP qualitativeNFP = (QualitativeNFP) theEObject;
			T result = caseQualitativeNFP(qualitativeNFP);
			if (result == null)
				result = caseAbstractNFP(qualitativeNFP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.ABSTRACT_NFP: {
			AbstractNFP abstractNFP = (AbstractNFP) theEObject;
			T result = caseAbstractNFP(abstractNFP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.QUANTITY: {
			Quantity quantity = (Quantity) theEObject;
			T result = caseQuantity(quantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.DERIVED_QUANTITY: {
			DerivedQuantity derivedQuantity = (DerivedQuantity) theEObject;
			T result = caseDerivedQuantity(derivedQuantity);
			if (result == null)
				result = caseQuantity(derivedQuantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.BASE_QUANTITY: {
			BaseQuantity baseQuantity = (BaseQuantity) theEObject;
			T result = caseBaseQuantity(baseQuantity);
			if (result == null)
				result = caseQuantity(baseQuantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.TUPLE_TYPE: {
			TupleType tupleType = (TupleType) theEObject;
			T result = caseTupleType(tupleType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.VALUE_TYPE: {
			ValueType valueType = (ValueType) theEObject;
			T result = caseValueType(valueType);
			if (result == null)
				result = caseTupleType(valueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.VALUE_PROPERTY: {
			ValueProperty valueProperty = (ValueProperty) theEObject;
			T result = caseValueProperty(valueProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.NFP: {
			NFP nfp = (NFP) theEObject;
			T result = caseNFP(nfp);
			if (result == null)
				result = caseValueProperty(nfp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.NFP_TYPE: {
			NFP_Type nfP_Type = (NFP_Type) theEObject;
			T result = caseNFP_Type(nfP_Type);
			if (result == null)
				result = caseValueType(nfP_Type);
			if (result == null)
				result = caseTupleType(nfP_Type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.ANNOTATED_ELEMENT: {
			AnnotatedElement annotatedElement = (AnnotatedElement) theEObject;
			T result = caseAnnotatedElement(annotatedElement);
			if (result == null)
				result = caseModelElement(annotatedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T result = caseModelElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.ANNOTATED_MODEL: {
			AnnotatedModel annotatedModel = (AnnotatedModel) theEObject;
			T result = caseAnnotatedModel(annotatedModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.MODELING_CONCERN: {
			ModelingConcern modelingConcern = (ModelingConcern) theEObject;
			T result = caseModelingConcern(modelingConcern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.NFP_CONSTRAIN: {
			NFP_Constrain nfP_Constrain = (NFP_Constrain) theEObject;
			T result = caseNFP_Constrain(nfP_Constrain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.MODE: {
			Mode mode = (Mode) theEObject;
			T result = caseMode(mode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.VALUE_SPECIFICATION: {
			ValueSpecification valueSpecification = (ValueSpecification) theEObject;
			T result = caseValueSpecification(valueSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.ALLOCATION: {
			Allocation allocation = (Allocation) theEObject;
			T result = caseAllocation(allocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.NFP_CONSTRAINT: {
			NFP_Constraint nfP_Constraint = (NFP_Constraint) theEObject;
			T result = caseNFP_Constraint(nfP_Constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.APPLICATION_ALLOCATION_END: {
			ApplicationAllocationEnd applicationAllocationEnd = (ApplicationAllocationEnd) theEObject;
			T result = caseApplicationAllocationEnd(applicationAllocationEnd);
			if (result == null)
				result = caseAllocationEnd(applicationAllocationEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.EXECUTION_PLATFORM_ALLOCATION_END: {
			ExecutionPlatformAllocationEnd executionPlatformAllocationEnd = (ExecutionPlatformAllocationEnd) theEObject;
			T result = caseExecutionPlatformAllocationEnd(executionPlatformAllocationEnd);
			if (result == null)
				result = caseAllocationEnd(executionPlatformAllocationEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.REFINEMENT: {
			Refinement refinement = (Refinement) theEObject;
			T result = caseRefinement(refinement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MARTEPackage.ALLOCATION_END: {
			AllocationEnd allocationEnd = (AllocationEnd) theEObject;
			T result = caseAllocationEnd(allocationEnd);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sample Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sample Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampleRealization(SampleRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantitative NFP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantitative NFP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantitativeNFP(QuantitativeNFP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative NFP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative NFP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeNFP(QualitativeNFP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract NFP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract NFP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNFP(AbstractNFP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantity(Quantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedQuantity(DerivedQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseQuantity(BaseQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTupleType(TupleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueProperty(ValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP(NFP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Type(NFP_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedElement(AnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedModel(AnnotatedModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingConcern(ModelingConcern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Constrain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Constrain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Constrain(NFP_Constrain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMode(Mode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocation(Allocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFP Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFP Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFP_Constraint(NFP_Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Allocation End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Allocation End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationAllocationEnd(ApplicationAllocationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Platform Allocation End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Platform Allocation End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPlatformAllocationEnd(ExecutionPlatformAllocationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinement(Refinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationEnd(AllocationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MARTESwitch
