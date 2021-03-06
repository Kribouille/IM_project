/**
 */
package twitterRESTAPI.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import twitterRESTAPI.Date;
import twitterRESTAPI.Deck;
import twitterRESTAPI.DeckSet;
import twitterRESTAPI.Hashtag;
import twitterRESTAPI.Instruction;
import twitterRESTAPI.Retweet;
import twitterRESTAPI.TwitterRESTAPIFactory;
import twitterRESTAPI.TwitterRESTAPIPackage;
import twitterRESTAPI.UnOp;
import twitterRESTAPI.User;
import twitterRESTAPI.Word;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterRESTAPIPackageImpl extends EPackageImpl implements TwitterRESTAPIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashtagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deckSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retweetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unOpEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see twitterRESTAPI.TwitterRESTAPIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TwitterRESTAPIPackageImpl() {
		super(eNS_URI, TwitterRESTAPIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TwitterRESTAPIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TwitterRESTAPIPackage init() {
		if (isInited) return (TwitterRESTAPIPackage)EPackage.Registry.INSTANCE.getEPackage(TwitterRESTAPIPackage.eNS_URI);

		// Obtain or create and register package
		TwitterRESTAPIPackageImpl theTwitterRESTAPIPackage = (TwitterRESTAPIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TwitterRESTAPIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TwitterRESTAPIPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTwitterRESTAPIPackage.createPackageContents();

		// Initialize created meta-data
		theTwitterRESTAPIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTwitterRESTAPIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TwitterRESTAPIPackage.eNS_URI, theTwitterRESTAPIPackage);
		return theTwitterRESTAPIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Value() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHashtag() {
		return hashtagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHashtag_Value() {
		return (EAttribute)hashtagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Value() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeck() {
		return deckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeck_Name() {
		return (EAttribute)deckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_Instructions() {
		return (EReference)deckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_InitFilters() {
		return (EReference)deckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_IsNot() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Next() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_UnOp() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Previous() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWord() {
		return wordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWord_Value() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeckSet() {
		return deckSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeckSet_Deck() {
		return (EReference)deckSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetweet() {
		return retweetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetweet_Value() {
		return (EAttribute)retweetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnOp() {
		return unOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterRESTAPIFactory getTwitterRESTAPIFactory() {
		return (TwitterRESTAPIFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__VALUE);

		hashtagEClass = createEClass(HASHTAG);
		createEAttribute(hashtagEClass, HASHTAG__VALUE);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__VALUE);

		deckEClass = createEClass(DECK);
		createEAttribute(deckEClass, DECK__NAME);
		createEReference(deckEClass, DECK__INSTRUCTIONS);
		createEReference(deckEClass, DECK__INIT_FILTERS);

		instructionEClass = createEClass(INSTRUCTION);
		createEAttribute(instructionEClass, INSTRUCTION__IS_NOT);
		createEReference(instructionEClass, INSTRUCTION__NEXT);
		createEAttribute(instructionEClass, INSTRUCTION__UN_OP);
		createEReference(instructionEClass, INSTRUCTION__PREVIOUS);

		wordEClass = createEClass(WORD);
		createEAttribute(wordEClass, WORD__VALUE);

		deckSetEClass = createEClass(DECK_SET);
		createEReference(deckSetEClass, DECK_SET__DECK);

		retweetEClass = createEClass(RETWEET);
		createEAttribute(retweetEClass, RETWEET__VALUE);

		// Create enums
		unOpEEnum = createEEnum(UN_OP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userEClass.getESuperTypes().add(this.getInstruction());
		hashtagEClass.getESuperTypes().add(this.getInstruction());
		dateEClass.getESuperTypes().add(this.getInstruction());
		wordEClass.getESuperTypes().add(this.getInstruction());
		retweetEClass.getESuperTypes().add(this.getInstruction());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Value(), ecorePackage.getEString(), "value", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hashtagEClass, Hashtag.class, "Hashtag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHashtag_Value(), ecorePackage.getEString(), "value", null, 1, 1, Hashtag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Value(), ecorePackage.getEDate(), "value", null, 1, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deckEClass, Deck.class, "Deck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeck_Name(), ecorePackage.getEString(), "name", null, 1, 1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_InitFilters(), this.getInstruction(), null, "initFilters", null, 0, -1, Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstruction_IsNot(), ecorePackage.getEBooleanObject(), "isNot", "false", 1, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Next(), this.getInstruction(), this.getInstruction_Previous(), "next", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_UnOp(), this.getUnOp(), "unOp", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Previous(), this.getInstruction(), this.getInstruction_Next(), "previous", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wordEClass, Word.class, "Word", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWord_Value(), ecorePackage.getEString(), "value", null, 1, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deckSetEClass, DeckSet.class, "DeckSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeckSet_Deck(), this.getDeck(), null, "deck", null, 1, -1, DeckSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retweetEClass, Retweet.class, "Retweet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetweet_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Retweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unOpEEnum, UnOp.class, "UnOp");
		addEEnumLiteral(unOpEEnum, UnOp.EQUALS);
		addEEnumLiteral(unOpEEnum, UnOp.LESS_THAN);
		addEEnumLiteral(unOpEEnum, UnOp.UPPER_THAN);

		// Create resource
		createResource(eNS_URI);
	}

} //TwitterRESTAPIPackageImpl
