//**********************************************************
//*
//*    %%SUITE_PRODUCT_NAME%% %%MAJOR_VERSION%%.%%MINOR_VERSION%%.%%RELEASE_NUMBER%%
//*
//*    %%COPYRIGHT%% 
//*
//*    %%VENDOR%%
//*
//*    All rights reserved.
//*
//*    %%VENDOR_HOMEPAGE%%
//*
//**********************************************************
/**
 * <copyright>
 *
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 *
 * </copyright>
 */
package org.eclipse.dd.dc.impl;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.di.impl.BpmnDiPackageImpl;
import org.eclipse.bpmn2.impl.Bpmn2PackageImpl;
import org.eclipse.bpmn2.util.NamespaceHelper;

import org.eclipse.dd.dc.Bounds;
import org.eclipse.dd.dc.DcFactory;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.dc.DocumentRoot;
import org.eclipse.dd.dc.Font;
import org.eclipse.dd.dc.Point;
import org.eclipse.dd.dc.util.DcValidator;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.impl.DiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @author     Harald
 * @generated
 */
public class DcPackageImpl
	extends EPackageImpl
	implements DcPackage
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
	 *
	 * <p>Note: the correct way to create the package is via the static factory method {@link #init init()}, which also performs initialization of the package, or returns the registered package, if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * </p>
	 *
	 * @see        org.eclipse.emf.ecore.EPackage.Registry
	 * @see        org.eclipse.dd.dc.DcPackage#eNS_URI
	 * @see        #init()
	 * @generated
	 */
	private DcPackageImpl()
	{
		super( eNS_URI, DcFactory.eINSTANCE );
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * @see  #initGen()
	 */
	public static DcPackage init()
	{
		final DcPackage result = initGen();
		EPackage.Registry.INSTANCE.put( NamespaceHelper.xmiToXsdNamespaceUri( DcPackage.eNS_URI ), result );

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DcPackage#eINSTANCE} when that field is accessed. Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * </p>
	 *
	 * @return     creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * @see        #eNS_URI
	 * @see        #createPackageContents()
	 * @see        #initializePackageContents()
	 * @generated
	 */
	public static DcPackage initGen()
	{
		if( isInited )
		{
			return (DcPackage) EPackage.Registry.INSTANCE.getEPackage( DcPackage.eNS_URI );
		}

		// Obtain or create and register package
		final Object	    registeredDcPackage = EPackage.Registry.INSTANCE.get( eNS_URI );
		final DcPackageImpl theDcPackage	    = ( registeredDcPackage instanceof DcPackageImpl ) ? (DcPackageImpl) registeredDcPackage : new DcPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object				   registeredPackage = EPackage.Registry.INSTANCE.getEPackage( Bpmn2Package.eNS_URI );
		final Bpmn2PackageImpl theBpmn2Package   = (Bpmn2PackageImpl) (( registeredPackage instanceof Bpmn2PackageImpl ) ? registeredPackage : Bpmn2Package.eINSTANCE );
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage( BpmnDiPackage.eNS_URI );

		final BpmnDiPackageImpl theBpmnDiPackage = (BpmnDiPackageImpl) (( registeredPackage instanceof BpmnDiPackageImpl ) ? registeredPackage : BpmnDiPackage.eINSTANCE );
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage( DiPackage.eNS_URI );

		final DiPackageImpl theDiPackage = (DiPackageImpl) (( registeredPackage instanceof DiPackageImpl ) ? registeredPackage : DiPackage.eINSTANCE );

		// Load packages
		theBpmn2Package.loadPackage();

		// Create package meta-data objects
		theDcPackage.createPackageContents();
		theBpmnDiPackage.createPackageContents();
		theDiPackage.createPackageContents();

		// Initialize created meta-data
		theDcPackage.initializePackageContents();
		theBpmnDiPackage.initializePackageContents();
		theDiPackage.initializePackageContents();

		// Fix loaded packages
		theBpmn2Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put( theDcPackage, new EValidator.Descriptor()
			{
				@Override public EValidator getEValidator()
				{
					return DcValidator.INSTANCE;
				}
			} );

		// Mark meta-data to indicate it can't be changed
		theDcPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put( DcPackage.eNS_URI, theDcPackage );

		return theDcPackage;
	} // end method initGen

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if( isCreated )
		{
			return;
		}

		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass( DOCUMENT_ROOT );
		createEAttribute( documentRootEClass, DOCUMENT_ROOT__MIXED );
		createEReference( documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
		createEReference( documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
		createEReference( documentRootEClass, DOCUMENT_ROOT__BOUNDS );
		createEReference( documentRootEClass, DOCUMENT_ROOT__FONT );
		createEReference( documentRootEClass, DOCUMENT_ROOT__POINT );

		boundsEClass = createEClass( BOUNDS );
		createEAttribute( boundsEClass, BOUNDS__HEIGHT );
		createEAttribute( boundsEClass, BOUNDS__WIDTH );
		createEAttribute( boundsEClass, BOUNDS__X );
		createEAttribute( boundsEClass, BOUNDS__Y );

		fontEClass = createEClass( FONT );
		createEAttribute( fontEClass, FONT__IS_BOLD );
		createEAttribute( fontEClass, FONT__IS_ITALIC );
		createEAttribute( fontEClass, FONT__IS_STRIKE_THROUGH );
		createEAttribute( fontEClass, FONT__IS_UNDERLINE );
		createEAttribute( fontEClass, FONT__NAME );
		createEAttribute( fontEClass, FONT__SIZE );

		pointEClass = createEClass( POINT );
		createEAttribute( pointEClass, POINT__X );
		createEAttribute( pointEClass, POINT__Y );
	} // end method createPackageContents

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EClass getBounds()
	{
		return boundsEClass;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getBounds_Height()
	{
		return (EAttribute) boundsEClass.getEStructuralFeatures().get( 0 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getBounds_Width()
	{
		return (EAttribute) boundsEClass.getEStructuralFeatures().get( 1 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getBounds_X()
	{
		return (EAttribute) boundsEClass.getEStructuralFeatures().get( 2 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getBounds_Y()
	{
		return (EAttribute) boundsEClass.getEStructuralFeatures().get( 3 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DcFactory getDcFactory()
	{
		return (DcFactory) getEFactoryInstance();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EClass getDocumentRoot()
	{
		return documentRootEClass;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EReference getDocumentRoot_Bounds()
	{
		return (EReference) documentRootEClass.getEStructuralFeatures().get( 3 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EReference getDocumentRoot_Font()
	{
		return (EReference) documentRootEClass.getEStructuralFeatures().get( 4 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getDocumentRoot_Mixed()
	{
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get( 0 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EReference getDocumentRoot_Point()
	{
		return (EReference) documentRootEClass.getEStructuralFeatures().get( 5 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EReference getDocumentRoot_XMLNSPrefixMap()
	{
		return (EReference) documentRootEClass.getEStructuralFeatures().get( 1 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EReference getDocumentRoot_XSISchemaLocation()
	{
		return (EReference) documentRootEClass.getEStructuralFeatures().get( 2 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EClass getFont()
	{
		return fontEClass;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getFont_IsBold()
	{
		return (EAttribute) fontEClass.getEStructuralFeatures().get( 0 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getFont_IsItalic()
	{
		return (EAttribute) fontEClass.getEStructuralFeatures().get( 1 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getFont_IsStrikeThrough()
	{
		return (EAttribute) fontEClass.getEStructuralFeatures().get( 2 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getFont_IsUnderline()
	{
		return (EAttribute) fontEClass.getEStructuralFeatures().get( 3 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getFont_Name()
	{
		return (EAttribute) fontEClass.getEStructuralFeatures().get( 4 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getFont_Size()
	{
		return (EAttribute) fontEClass.getEStructuralFeatures().get( 5 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EClass getPoint()
	{
		return pointEClass;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getPoint_X()
	{
		return (EAttribute) pointEClass.getEStructuralFeatures().get( 0 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EAttribute getPoint_Y()
	{
		return (EAttribute) pointEClass.getEStructuralFeatures().get( 1 );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if( isInitialized )
		{
			return;
		}

		isInitialized = true;

		// Initialize package
		setName( eNAME );
		setNsPrefix( eNS_PREFIX );
		setNsURI( eNS_URI );

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass( documentRootEClass, DocumentRoot.class, "DocumentRoot", ! IS_ABSTRACT, ! IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
		initEAttribute( getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, ! IS_UNIQUE, ! IS_DERIVED, IS_ORDERED );
		initEReference( getDocumentRoot_XMLNSPrefixMap(),
			ecorePackage.getEStringToStringMapEntry(),
			null,
			"xMLNSPrefixMap",
			null,
			0,
			-1,
			null,
			IS_TRANSIENT,
			! IS_VOLATILE,
			IS_CHANGEABLE,
			IS_COMPOSITE,
			! IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE,
			IS_UNIQUE,
			! IS_DERIVED,
			IS_ORDERED );
		initEReference( getDocumentRoot_XSISchemaLocation(),
			ecorePackage.getEStringToStringMapEntry(),
			null,
			"xSISchemaLocation",
			null,
			0,
			-1,
			null,
			IS_TRANSIENT,
			! IS_VOLATILE,
			IS_CHANGEABLE,
			IS_COMPOSITE,
			! IS_RESOLVE_PROXIES,
			! IS_UNSETTABLE,
			IS_UNIQUE,
			! IS_DERIVED,
			IS_ORDERED );
		initEReference( getDocumentRoot_Bounds(), this.getBounds(), null, "bounds", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES, ! IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
		initEReference( getDocumentRoot_Font(), this.getFont(), null, "font", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES, ! IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );
		initEReference( getDocumentRoot_Point(), this.getPoint(), null, "point", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, ! IS_RESOLVE_PROXIES, ! IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED );

		initEClass( boundsEClass, Bounds.class, "Bounds", ! IS_ABSTRACT, ! IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
		initEAttribute( getBounds_Height(), ecorePackage.getEFloat(), "height", null, 1, 1, Bounds.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getBounds_Width(), ecorePackage.getEFloat(), "width", null, 1, 1, Bounds.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getBounds_X(), ecorePackage.getEFloat(), "x", "0", 1, 1, Bounds.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getBounds_Y(), ecorePackage.getEFloat(), "y", "0", 1, 1, Bounds.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );

		initEClass( fontEClass, Font.class, "Font", ! IS_ABSTRACT, ! IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
		initEAttribute( getFont_IsBold(), ecorePackage.getEBoolean(), "isBold", null, 0, 1, Font.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getFont_IsItalic(), ecorePackage.getEBoolean(), "isItalic", null, 0, 1, Font.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getFont_IsStrikeThrough(), ecorePackage.getEBoolean(), "isStrikeThrough", null, 0, 1, Font.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getFont_IsUnderline(), ecorePackage.getEBoolean(), "isUnderline", null, 0, 1, Font.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getFont_Name(), ecorePackage.getEString(), "name", null, 0, 1, Font.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getFont_Size(), ecorePackage.getEFloat(), "size", null, 0, 1, Font.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );

		final EOperation op = addEOperation( fontEClass, ecorePackage.getEBoolean(), "non_negative_size", 0, 1, IS_UNIQUE, IS_ORDERED );
		addEParameter( op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED );

		final EGenericType g1 = createEGenericType( ecorePackage.getEMap());
		EGenericType	   g2 = createEGenericType( ecorePackage.getEJavaObject());
		g1.getETypeArguments().add( g2 );
		g2 = createEGenericType( ecorePackage.getEJavaObject());
		g1.getETypeArguments().add( g2 );
		addEParameter( op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED );

		initEClass( pointEClass, Point.class, "Point", ! IS_ABSTRACT, ! IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
		initEAttribute( getPoint_X(), ecorePackage.getEFloat(), "x", "0", 1, 1, Point.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );
		initEAttribute( getPoint_Y(), ecorePackage.getEFloat(), "y", "0", 1, 1, Point.class, ! IS_TRANSIENT, ! IS_VOLATILE, IS_CHANGEABLE, ! IS_UNSETTABLE, ! IS_ID, IS_UNIQUE, ! IS_DERIVED, ! IS_ORDERED );

		// Create resource
		createResource( eNS_URI );

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	} // end method initializePackageContents

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations()
	{
		final String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation( documentRootEClass, source, new String[]
			{
				"name",
				"",
				"kind",
				"mixed"
			} );
		addAnnotation( getDocumentRoot_Mixed(), source, new String[]
			{
				"kind",
				"elementWildcard",
				"name",
				":mixed"
			} );
		addAnnotation( getDocumentRoot_XMLNSPrefixMap(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"xmlns:prefix"
			} );
		addAnnotation( getDocumentRoot_XSISchemaLocation(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"xsi:schemaLocation"
			} );
		addAnnotation( getDocumentRoot_Bounds(), source, new String[]
			{
				"kind",
				"element",
				"name",
				"Bounds",
				"namespace",
				"http://www.omg.org/spec/DD/20100524/DC"
			} );
		addAnnotation( getDocumentRoot_Font(), source, new String[]
			{
				"kind",
				"element",
				"name",
				"Font",
				"namespace",
				"http://www.omg.org/spec/DD/20100524/DC"
			} );
		addAnnotation( getDocumentRoot_Point(), source, new String[]
			{
				"kind",
				"element",
				"name",
				"Point",
				"namespace",
				"http://www.omg.org/spec/DD/20100524/DC"
			} );
		addAnnotation( boundsEClass, source, new String[]
			{
				"name",
				"Bounds",
				"kind",
				"empty"
			} );
		addAnnotation( getBounds_Height(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"height"
			} );
		addAnnotation( getBounds_Width(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"width"
			} );
		addAnnotation( getBounds_X(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"x"
			} );
		addAnnotation( getBounds_Y(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"y"
			} );
		addAnnotation( fontEClass, source, new String[]
			{
				"name",
				"Font",
				"kind",
				"empty"
			} );
		addAnnotation( getFont_IsBold(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"isBold"
			} );
		addAnnotation( getFont_IsItalic(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"isItalic"
			} );
		addAnnotation( getFont_IsStrikeThrough(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"isStrikeThrough"
			} );
		addAnnotation( getFont_IsUnderline(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"isUnderline"
			} );
		addAnnotation( getFont_Name(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"name"
			} );
		addAnnotation( getFont_Size(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"size"
			} );
		addAnnotation( pointEClass, source, new String[]
			{
				"name",
				"Point",
				"kind",
				"empty"
			} );
		addAnnotation( getPoint_X(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"x"
			} );
		addAnnotation( getPoint_Y(), source, new String[]
			{
				"kind",
				"attribute",
				"name",
				"y"
			} );
	} // end method createExtendedMetaDataAnnotations

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;
} //DcPackageImpl
