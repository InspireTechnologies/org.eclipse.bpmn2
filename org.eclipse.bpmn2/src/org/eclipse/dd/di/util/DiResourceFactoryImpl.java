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
package org.eclipse.dd.di.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;


/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.dd.di.util.DiResourceImpl
 * @generated
 */
public class DiResourceFactoryImpl
	extends ResourceFactoryImpl
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiResourceFactoryImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      uri  DOCUMENT ME!
	 *
	 * @return     creates an instance of the resource.
	 *
	 * @generated
	 */
	@Override public Resource createResource( final URI uri )
	{
		final XMLResource result = new DiResourceImpl( uri );
		result.getDefaultSaveOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );
		result.getDefaultLoadOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );

		result.getDefaultSaveOptions().put( XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE );

		result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );
		result.getDefaultSaveOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );

		result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE );

		return result;
	}
} //DiResourceFactoryImpl
