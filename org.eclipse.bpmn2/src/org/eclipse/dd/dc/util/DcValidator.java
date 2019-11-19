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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.dd.dc.DcPackage
 * @generated
 */
public class DcValidator
	extends EObjectValidator
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcValidator()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     the resource locator that will be used to fetch messages for this validator's diagnostics.
	 *
	 * @generated
	 */
	@Override public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      bounds       DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateBounds( final Bounds bounds, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( bounds, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      documentRoot  DOCUMENT ME!
	 * @param      diagnostics   DOCUMENT ME!
	 * @param      context       DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateDocumentRoot( final DocumentRoot documentRoot, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( documentRoot, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      font         DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateFont( final Font font, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		if( ! validate_NoCircularContainment( font, diagnostics, context ))
		{
			return false;
		}

		boolean result = validate_EveryMultiplicityConforms( font, diagnostics, context );

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryDataValueConforms( font, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryReferenceIsContained( font, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryBidirectionalReferenceIsPaired( font, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryProxyResolves( font, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_UniqueID( font, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryKeyUnique( font, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryMapEntryUnique( font, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validateFont_non_negative_size( font, diagnostics, context );
		}

		return result;
	} // end method validateFont

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Validates the non_negative_size constraint of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      font         DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     validates the non_negative_size constraint of '<em>Font</em>'.
	 *
	 * @generated
	 */
	public boolean validateFont_non_negative_size( final Font font, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return font.non_negative_size( diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      point        DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validatePoint( final Point point, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( point, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     the package of this validator switch.
	 *
	 * @generated
	 */
	@Override protected EPackage getEPackage()
	{
		return DcPackage.eINSTANCE;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      classifierID  DOCUMENT ME!
	 * @param      value         DOCUMENT ME!
	 * @param      diagnostics   DOCUMENT ME!
	 * @param      context       DOCUMENT ME!
	 *
	 * @return     calls <code>validateXXX</code> for the corresponding classifier of the model.
	 *
	 * @generated
	 */
	@Override protected boolean validate( final int classifierID, final Object value, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		switch( classifierID )
		{
			case DcPackage.DOCUMENT_ROOT :
			{
				return validateDocumentRoot((DocumentRoot) value, diagnostics, context );
			}

			case DcPackage.BOUNDS :
			{
				return validateBounds((Bounds) value, diagnostics, context );
			}

			case DcPackage.FONT :
			{
				return validateFont((Font) value, diagnostics, context );
			}

			case DcPackage.POINT :
			{
				return validatePoint((Point) value, diagnostics, context );
			}

			default :
			{
				return true;
			}
		}
	} // end method validate

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DcValidator INSTANCE = new DcValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see        org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.dd.dc";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non negative size' of 'Font'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FONT__NON_NEGATIVE_SIZE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;
} //DcValidator
