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

import org.eclipse.dd.dc.Bounds;
import org.eclipse.dd.dc.DcFactory;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.dc.DocumentRoot;
import org.eclipse.dd.dc.Font;
import org.eclipse.dd.dc.Point;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @author     Harald
 * @generated
 */
public class DcFactoryImpl
	extends EFactoryImpl
	implements DcFactory
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcFactoryImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return      DOCUMENT ME!
	 *
	 * @deprecated  DOCUMENT ME!
	 * @generated
	 */
	@Deprecated public static DcPackage getPackage()
	{
		return DcPackage.eINSTANCE;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     creates the default factory implementation.
	 *
	 * @generated
	 */
	public static DcFactory init()
	{
		try
		{
			final DcFactory theDcFactory = (DcFactory) EPackage.Registry.INSTANCE.getEFactory( "http://www.omg.org/spec/DD/20100524/DC" );

			if( theDcFactory != null )
			{
				return theDcFactory;
			}
		}
		catch( Exception exception )
		{
			EcorePlugin.INSTANCE.log( exception );
		}

		return new DcFactoryImpl();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eClass  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EObject create( final EClass eClass )
	{
		switch( eClass.getClassifierID())
		{
			case DcPackage.DOCUMENT_ROOT :
			{
				return createDocumentRoot();
			}

			case DcPackage.BOUNDS :
			{
				return createBounds();
			}

			case DcPackage.FONT :
			{
				return createFont();
			}

			case DcPackage.POINT :
			{
				return createPoint();
			}

			default :
			{
				throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
			}
		}
	} // end method create

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Bounds createBounds()
	{
		final BoundsImpl bounds = new BoundsImpl();

		return bounds;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DocumentRoot createDocumentRoot()
	{
		final DocumentRootImpl documentRoot = new DocumentRootImpl();

		return documentRoot;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Font createFont()
	{
		final FontImpl font = new FontImpl();

		return font;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Point createPoint()
	{
		final PointImpl point = new PointImpl();

		return point;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DcPackage getDcPackage()
	{
		return (DcPackage) getEPackage();
	}
} //DcFactoryImpl
