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

import org.eclipse.dd.dc.DcPackage;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import java.util.Map;


/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @author     Harald
 * @generated
 */
public class DcXMLProcessor
	extends XMLProcessor
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcXMLProcessor()
	{
		super(( EPackage.Registry.INSTANCE ));
		DcPackage.eINSTANCE.eClass();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Register for "*" and "xml" file extensions the DcResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     register for "*" and "xml" file extensions the DcResourceFactoryImpl factory.
	 *
	 * @generated
	 */
	@Override protected Map<String, Resource.Factory> getRegistrations()
	{
		if( registrations == null )
		{
			super.getRegistrations();
			registrations.put( XML_EXTENSION, new DcResourceFactoryImpl());
			registrations.put( STAR_EXTENSION, new DcResourceFactoryImpl());
		}

		return registrations;
	}
} //DcXMLProcessor
