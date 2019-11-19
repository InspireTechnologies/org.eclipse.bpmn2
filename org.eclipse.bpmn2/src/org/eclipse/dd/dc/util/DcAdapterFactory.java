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
package org.eclipse.dd.dc.util;

import org.eclipse.dd.dc.Bounds;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.dc.DocumentRoot;
import org.eclipse.dd.dc.Font;
import org.eclipse.dd.dc.Point;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.dd.dc.DcPackage
 * @generated
 */
public class DcAdapterFactory
	extends AdapterFactoryImpl
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcAdapterFactory()
	{
		if( modelPackage == null )
		{
			modelPackage = DcPackage.eINSTANCE;
		}
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      target  the object to adapt.
	 *
	 * @return     the adapter for the <code>target</code>.
	 *
	 * @generated
	 */
	@Override public Adapter createAdapter( final Notifier target )
	{
		return modelSwitch.doSwitch((EObject) target );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dd.dc.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.dd.dc.Bounds
	 * @generated
	 */
	public Adapter createBoundsAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dd.dc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.dd.dc.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dd.dc.Font <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.dd.dc.Font
	 * @generated
	 */
	public Adapter createFontAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.dd.dc.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.dd.dc.Point
	 * @generated
	 */
	public Adapter createPointAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @param      object  DOCUMENT ME!
	 *
	 * @return     whether this factory is applicable for the type of the object.
	 *
	 * @generated
	 */
	@Override public boolean isFactoryForType( final Object object )
	{
		if( object == modelPackage )
		{
			return true;
		}

		if( object instanceof EObject )
		{
			return ((EObject) object ).eClass().getEPackage() == modelPackage;
		}

		return false;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcSwitch<Adapter> modelSwitch =
		new DcSwitch<Adapter>()
		{
			@Override public Adapter caseDocumentRoot( final DocumentRoot object )
			{
				return createDocumentRootAdapter();
			}

			@Override public Adapter caseBounds( final Bounds object )
			{
				return createBoundsAdapter();
			}

			@Override public Adapter caseFont( final Font object )
			{
				return createFontAdapter();
			}

			@Override public Adapter casePoint( final Point object )
			{
				return createPointAdapter();
			}

			@Override public Adapter defaultCase( final EObject object )
			{
				return createEObjectAdapter();
			}
		};

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DcPackage modelPackage;
} //DcAdapterFactory
