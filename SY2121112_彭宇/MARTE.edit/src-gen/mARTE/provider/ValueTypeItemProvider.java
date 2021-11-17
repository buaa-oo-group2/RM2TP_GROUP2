/**
 */
package mARTE.provider;

import java.util.Collection;
import java.util.List;

import mARTE.MARTEFactory;
import mARTE.MARTEPackage;
import mARTE.ValueType;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mARTE.ValueType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueTypeItemProvider extends TupleTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAllowedUnitsPropertyDescriptor(object);
			addDefaultUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allowed Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValueType_allowedUnits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValueType_allowedUnits_feature",
								"_UI_ValueType_type"),
						MARTEPackage.Literals.VALUE_TYPE__ALLOWED_UNITS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ValueType_defaultUnit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ValueType_defaultUnit_feature",
								"_UI_ValueType_type"),
						MARTEPackage.Literals.VALUE_TYPE__DEFAULT_UNIT, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MARTEPackage.Literals.VALUE_TYPE__VALUE_ATTRIBUTE);
			childrenFeatures.add(MARTEPackage.Literals.VALUE_TYPE__UNIT_ATTRIBUTE);
			childrenFeatures.add(MARTEPackage.Literals.VALUE_TYPE__EXPR_ATTRIBUTE);
			childrenFeatures.add(MARTEPackage.Literals.VALUE_TYPE__QUALIFIER_ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ValueType_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ValueType.class)) {
		case MARTEPackage.VALUE_TYPE__VALUE_ATTRIBUTE:
		case MARTEPackage.VALUE_TYPE__UNIT_ATTRIBUTE:
		case MARTEPackage.VALUE_TYPE__EXPR_ATTRIBUTE:
		case MARTEPackage.VALUE_TYPE__QUALIFIER_ATTRIBUTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MARTEPackage.Literals.VALUE_TYPE__VALUE_ATTRIBUTE,
				MARTEFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(MARTEPackage.Literals.VALUE_TYPE__UNIT_ATTRIBUTE,
				MARTEFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(MARTEPackage.Literals.VALUE_TYPE__EXPR_ATTRIBUTE,
				MARTEFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add(createChildParameter(MARTEPackage.Literals.VALUE_TYPE__QUALIFIER_ATTRIBUTES,
				MARTEFactory.eINSTANCE.createProperty()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == MARTEPackage.Literals.VALUE_TYPE__VALUE_ATTRIBUTE
				|| childFeature == MARTEPackage.Literals.VALUE_TYPE__UNIT_ATTRIBUTE
				|| childFeature == MARTEPackage.Literals.VALUE_TYPE__EXPR_ATTRIBUTE
				|| childFeature == MARTEPackage.Literals.VALUE_TYPE__QUALIFIER_ATTRIBUTES;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
