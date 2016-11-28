/**
 */
package twitterRESTAPI.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import twitterRESTAPI.util.TwitterRESTAPIAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterRESTAPIItemProviderAdapterFactory extends TwitterRESTAPIAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterRESTAPIItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserItemProvider userItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserAdapter() {
		if (userItemProvider == null) {
			userItemProvider = new UserItemProvider(this);
		}

		return userItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.Hashtag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashtagItemProvider hashtagItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.Hashtag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHashtagAdapter() {
		if (hashtagItemProvider == null) {
			hashtagItemProvider = new HashtagItemProvider(this);
		}

		return hashtagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.Date} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateItemProvider dateItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateAdapter() {
		if (dateItemProvider == null) {
			dateItemProvider = new DateItemProvider(this);
		}

		return dateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.Deck} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckItemProvider deckItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.Deck}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeckAdapter() {
		if (deckItemProvider == null) {
			deckItemProvider = new DeckItemProvider(this);
		}

		return deckItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.Place} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceItemProvider placeItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaceAdapter() {
		if (placeItemProvider == null) {
			placeItemProvider = new PlaceItemProvider(this);
		}

		return placeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.Or} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.Or}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.equals} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected equalsItemProvider equalsItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.equals}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createequalsAdapter() {
		if (equalsItemProvider == null) {
			equalsItemProvider = new equalsItemProvider(this);
		}

		return equalsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.lessThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected lessThanItemProvider lessThanItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.lessThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createlessThanAdapter() {
		if (lessThanItemProvider == null) {
			lessThanItemProvider = new lessThanItemProvider(this);
		}

		return lessThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.ExprSimple} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExprSimpleItemProvider exprSimpleItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.ExprSimple}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExprSimpleAdapter() {
		if (exprSimpleItemProvider == null) {
			exprSimpleItemProvider = new ExprSimpleItemProvider(this);
		}

		return exprSimpleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.upperThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected upperThanItemProvider upperThanItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.upperThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createupperThanAdapter() {
		if (upperThanItemProvider == null) {
			upperThanItemProvider = new upperThanItemProvider(this);
		}

		return upperThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link twitterRESTAPI.WebPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPageItemProvider webPageItemProvider;

	/**
	 * This creates an adapter for a {@link twitterRESTAPI.WebPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebPageAdapter() {
		if (webPageItemProvider == null) {
			webPageItemProvider = new WebPageItemProvider(this);
		}

		return webPageItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (userItemProvider != null) userItemProvider.dispose();
		if (hashtagItemProvider != null) hashtagItemProvider.dispose();
		if (dateItemProvider != null) dateItemProvider.dispose();
		if (deckItemProvider != null) deckItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (placeItemProvider != null) placeItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (equalsItemProvider != null) equalsItemProvider.dispose();
		if (lessThanItemProvider != null) lessThanItemProvider.dispose();
		if (exprSimpleItemProvider != null) exprSimpleItemProvider.dispose();
		if (upperThanItemProvider != null) upperThanItemProvider.dispose();
		if (webPageItemProvider != null) webPageItemProvider.dispose();
	}

}
