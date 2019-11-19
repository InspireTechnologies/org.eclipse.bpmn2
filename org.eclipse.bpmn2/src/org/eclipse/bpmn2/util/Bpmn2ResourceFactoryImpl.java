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

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.DocumentRoot;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.ElementHandlerImpl;


/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.bpmn2.util.Bpmn2ResourceImpl
 * @generated
 */
public class Bpmn2ResourceFactoryImpl
	extends ResourceFactoryImpl
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2ResourceFactoryImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Creates a new BpmnResourceImpl and initializes it. The method creates a DocumentRoot and a Definitions element, as both are mandatory.
	 *
	 * @param   uri  DOCUMENT ME!
	 *
	 * @return  DOCUMENT ME!
	 */
	public Definitions createAndInitResource( final URI uri )
	{
		final Resource     resource		 = createResource( uri );
		final Bpmn2Factory factory		 = Bpmn2Factory.eINSTANCE;
		final Definitions  definitions   = factory.createDefinitions();
		final DocumentRoot docummentRoot = factory.createDocumentRoot();
		docummentRoot.setDefinitions( definitions );
		resource.getContents().add( docummentRoot );

		return definitions;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      uri  DOCUMENT ME!
	 *
	 * @return     creates an instance of the resource.
	 *
	 * @generated  NOT
	 */
	@Override public Resource createResource( final URI uri )
	{
		final Bpmn2ResourceImpl result			 = new Bpmn2ResourceImpl( uri );
		final ExtendedMetaData  extendedMetadata = new XmlExtendedMetadata();
		result.getDefaultSaveOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, extendedMetadata );
		result.getDefaultLoadOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, extendedMetadata );

		result.getDefaultSaveOptions().put( XMLResource.OPTION_SAVE_TYPE_INFORMATION, new OnlyContainmentTypeInfo());

		result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );
		result.getDefaultSaveOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );

		result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE );

		result.getDefaultSaveOptions().put( XMLResource.OPTION_ELEMENT_HANDLER, new ElementHandlerImpl( true ));

		result.getDefaultSaveOptions().put( XMLResource.OPTION_ENCODING, "UTF-8" );

		return result;
	}
} //Bpmn2ResourceFactoryImpl
