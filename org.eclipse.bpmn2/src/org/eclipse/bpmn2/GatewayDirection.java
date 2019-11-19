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
package org.eclipse.bpmn2;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gateway Direction</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package#getGatewayDirection()
 * @model      extendedMetaData="name='tGatewayDirection'"
 * @generated
 */
public enum GatewayDirection
	implements Enumerator
{
	//~ Enum constants .........................................................................................................................................................................................................................................

	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #UNSPECIFIED_VALUE
	 * @generated
	 * @orderd
	 */
	UNSPECIFIED( 0, "Unspecified", "Unspecified" ),

	/**
	 * The '<em><b>Converging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #CONVERGING_VALUE
	 * @generated
	 * @orderd
	 */
	CONVERGING( 1, "Converging", "Converging" ),

	/**
	 * The '<em><b>Diverging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #DIVERGING_VALUE
	 * @generated
	 * @orderd
	 */
	DIVERGING( 2, "Diverging", "Diverging" ),

	/**
	 * The '<em><b>Mixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #MIXED_VALUE
	 * @generated
	 * @orderd
	 */
	MIXED( 3, "Mixed", "Mixed" );

	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value    DOCUMENT ME!
	 * @param      name     DOCUMENT ME!
	 * @param      literal  DOCUMENT ME!
	 *
	 * @generated
	 */
	private GatewayDirection( final int value, final String name, final String literal )
	{
		this.value   = value;
		this.name    = name;
		this.literal = literal;
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Gateway Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      literal  the literal.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static GatewayDirection get( final String literal )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final GatewayDirection result = VALUES_ARRAY[i];

			if( result.toString().equals( literal ))
			{
				return result;
			}
		}

		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Gateway Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the integer value.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static GatewayDirection get( final int value )
	{
		switch( value )
		{
			case UNSPECIFIED_VALUE :
			{
				return UNSPECIFIED;
			}

			case CONVERGING_VALUE :
			{
				return CONVERGING;
			}

			case DIVERGING_VALUE :
			{
				return DIVERGING;
			}

			case MIXED_VALUE :
			{
				return MIXED;
			}
		}

		return null;
	} // end method get

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Gateway Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      name  the name.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static GatewayDirection getByName( final String name )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final GatewayDirection result = VALUES_ARRAY[i];

			if( result.getName().equals( name ))
			{
				return result;
			}
		}

		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getLiteral()
	{
		return literal;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getName()
	{
		return name;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int getValue()
	{
		return value;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     the literal value of the enumerator, which is its string representation.
	 *
	 * @generated
	 */
	@Override public String toString()
	{
		return literal;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Unspecified</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #UNSPECIFIED
	 * @model      name="Unspecified"
	 * @generated
	 * @orderd
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Converging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Converging</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #CONVERGING
	 * @model      name="Converging"
	 * @generated
	 * @orderd
	 */
	public static final int CONVERGING_VALUE = 1;

	/**
	 * The '<em><b>Diverging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Diverging</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #DIVERGING
	 * @model      name="Diverging"
	 * @generated
	 * @orderd
	 */
	public static final int DIVERGING_VALUE = 2;

	/**
	 * The '<em><b>Mixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Mixed</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #MIXED
	 * @model      name="Mixed"
	 * @generated
	 * @orderd
	 */
	public static final int MIXED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Gateway Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GatewayDirection VALUES_ARRAY[] =
		new GatewayDirection[]
		{
			UNSPECIFIED,
			CONVERGING,
			DIVERGING,
			MIXED,
		};

	/**
	 * A public read-only list of all the '<em><b>Gateway Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GatewayDirection> VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ));
} //GatewayDirection
