/**
 */
package twitterRESTAPI.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import twitterRESTAPI.ExprSimple;
import twitterRESTAPI.TwitterRESTAPIFactory;
import twitterRESTAPI.TwitterRESTAPIPackage;

/**
 * This is the item provider adapter for a {@link twitterRESTAPI.ExprSimple} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExprSimpleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprSimpleItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExprSimple_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExprSimple_value_feature", "_UI_ExprSimple_type"),
				 TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__TYPE);
			childrenFeatures.add(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__OPERATION);
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
	 * This returns ExprSimple.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExprSimple"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExprSimple)object).getValue();
		return label == null || label.length() == 0 ?
			getString("_UI_ExprSimple_type") :
			getString("_UI_ExprSimple_type") + " " + label;
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

		switch (notification.getFeatureID(ExprSimple.class)) {
			case TwitterRESTAPIPackage.EXPR_SIMPLE__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TwitterRESTAPIPackage.EXPR_SIMPLE__TYPE:
			case TwitterRESTAPIPackage.EXPR_SIMPLE__OPERATION:
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

		newChildDescriptors.add
			(createChildParameter
				(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__TYPE,
				 TwitterRESTAPIFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__TYPE,
				 TwitterRESTAPIFactory.eINSTANCE.createHashtag()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__TYPE,
				 TwitterRESTAPIFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__TYPE,
				 TwitterRESTAPIFactory.eINSTANCE.createPlace()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__OPERATION,
				 TwitterRESTAPIFactory.eINSTANCE.createequals()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__OPERATION,
				 TwitterRESTAPIFactory.eINSTANCE.createlessThan()));

		newChildDescriptors.add
			(createChildParameter
				(TwitterRESTAPIPackage.Literals.EXPR_SIMPLE__OPERATION,
				 TwitterRESTAPIFactory.eINSTANCE.createupperThan()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TwitterRESTAPIEditPlugin.INSTANCE;
	}

}
