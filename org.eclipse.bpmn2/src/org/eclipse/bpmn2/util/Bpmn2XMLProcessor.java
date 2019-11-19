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
package org.eclipse.bpmn2.util;

import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import java.util.Map;


/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @author     Harald
 * @generated
 */
public class Bpmn2XMLProcessor
	extends XMLProcessor
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated  NOT
	 */
	public Bpmn2XMLProcessor()
	{
		super(( EPackage.Registry.INSTANCE ));
		Bpmn2Package.eINSTANCE.eClass();

		// Use option from Bpmn2ResourceFactory
		saveOptions.remove( XMLResource.OPTION_EXTENDED_META_DATA );
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Register for "*" and "xml" file extensions the Bpmn2ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     register for "*" and "xml" file extensions the Bpmn2ResourceFactoryImpl factory.
	 *
	 * @generated
	 */
	@Override protected Map<String, Resource.Factory> getRegistrations()
	{
		if( registrations == null )
		{
			super.getRegistrations();
			registrations.put( XML_EXTENSION, new Bpmn2ResourceFactoryImpl());
			registrations.put( STAR_EXTENSION, new Bpmn2ResourceFactoryImpl());
		}

		return registrations;
	}
} //Bpmn2XMLProcessor
