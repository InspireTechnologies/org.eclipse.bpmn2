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
package org.eclipse.dd.di.impl;

import org.eclipse.dd.di.DiFactory;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.DocumentRoot;

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
public class DiFactoryImpl
	extends EFactoryImpl
	implements DiFactory
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiFactoryImpl()
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
	@Deprecated public static DiPackage getPackage()
	{
		return DiPackage.eINSTANCE;
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
	public static DiFactory init()
	{
		try
		{
			final DiFactory theDiFactory = (DiFactory) EPackage.Registry.INSTANCE.getEFactory( "http://www.omg.org/spec/DD/20100524/DI" );

			if( theDiFactory != null )
			{
				return theDiFactory;
			}
		}
		catch( Exception exception )
		{
			EcorePlugin.INSTANCE.log( exception );
		}

		return new DiFactoryImpl();
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
			case DiPackage.DOCUMENT_ROOT :
			{
				return createDocumentRoot();
			}

			case DiPackage.DIAGRAM_ELEMENT :
			{
				return createDiagramElement();
			}

			default :
			{
				throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
			}
		}
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
	@Override public DiPackage getDiPackage()
	{
		return (DiPackage) getEPackage();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected DiagramElement createDiagramElement()
	{
		final DiagramElementImpl diagramElement = new DiagramElementImpl();

		return diagramElement;
	}
} //DiFactoryImpl
