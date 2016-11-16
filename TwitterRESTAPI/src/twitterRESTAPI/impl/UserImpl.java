/**
 */
package twitterRESTAPI.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import twitterRESTAPI.Place;
import twitterRESTAPI.Tweet;
import twitterRESTAPI.TwitterRESTAPIPackage;
import twitterRESTAPI.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterRESTAPI.impl.UserImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.UserImpl#getFriends <em>Friends</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.UserImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link twitterRESTAPI.impl.UserImpl#getPlace <em>Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> followers;

	/**
	 * The cached value of the '{@link #getFriends() <em>Friends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriends()
	 * @generated
	 * @ordered
	 */
	protected EList<User> friends;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Tweet> status;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterRESTAPIPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getFollowers() {
		if (followers == null) {
			followers = new EObjectResolvingEList<User>(User.class, this, TwitterRESTAPIPackage.USER__FOLLOWERS);
		}
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getFriends() {
		if (friends == null) {
			friends = new EObjectResolvingEList<User>(User.class, this, TwitterRESTAPIPackage.USER__FRIENDS);
		}
		return friends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tweet> getStatus() {
		if (status == null) {
			status = new EObjectResolvingEList<Tweet>(Tweet.class, this, TwitterRESTAPIPackage.USER__STATUS);
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Place)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterRESTAPIPackage.USER__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.USER__PLACE, oldPlace, newPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject)place).eInverseRemove(this, TwitterRESTAPIPackage.PLACE__USER, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, TwitterRESTAPIPackage.PLACE__USER, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterRESTAPIPackage.USER__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterRESTAPIPackage.USER__PLACE:
				if (place != null)
					msgs = ((InternalEObject)place).eInverseRemove(this, TwitterRESTAPIPackage.PLACE__USER, Place.class, msgs);
				return basicSetPlace((Place)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterRESTAPIPackage.USER__PLACE:
				return basicSetPlace(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterRESTAPIPackage.USER__FOLLOWERS:
				return getFollowers();
			case TwitterRESTAPIPackage.USER__FRIENDS:
				return getFriends();
			case TwitterRESTAPIPackage.USER__STATUS:
				return getStatus();
			case TwitterRESTAPIPackage.USER__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterRESTAPIPackage.USER__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends User>)newValue);
				return;
			case TwitterRESTAPIPackage.USER__FRIENDS:
				getFriends().clear();
				getFriends().addAll((Collection<? extends User>)newValue);
				return;
			case TwitterRESTAPIPackage.USER__STATUS:
				getStatus().clear();
				getStatus().addAll((Collection<? extends Tweet>)newValue);
				return;
			case TwitterRESTAPIPackage.USER__PLACE:
				setPlace((Place)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TwitterRESTAPIPackage.USER__FOLLOWERS:
				getFollowers().clear();
				return;
			case TwitterRESTAPIPackage.USER__FRIENDS:
				getFriends().clear();
				return;
			case TwitterRESTAPIPackage.USER__STATUS:
				getStatus().clear();
				return;
			case TwitterRESTAPIPackage.USER__PLACE:
				setPlace((Place)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TwitterRESTAPIPackage.USER__FOLLOWERS:
				return followers != null && !followers.isEmpty();
			case TwitterRESTAPIPackage.USER__FRIENDS:
				return friends != null && !friends.isEmpty();
			case TwitterRESTAPIPackage.USER__STATUS:
				return status != null && !status.isEmpty();
			case TwitterRESTAPIPackage.USER__PLACE:
				return place != null;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
