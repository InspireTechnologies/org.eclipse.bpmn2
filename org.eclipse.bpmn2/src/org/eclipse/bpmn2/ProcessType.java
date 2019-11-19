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
 * A representation of the literals of the enumeration '<em><b>Process Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package#getProcessType()
 * @model      extendedMetaData="name='tProcessType'"
 * @generated
 */
public enum ProcessType
	implements Enumerator
{
	//~ Enum constants .........................................................................................................................................................................................................................................

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #NONE_VALUE
	 * @generated
	 * @orderd
	 */
	NONE( 0, "None", "None" ),

	/**
	 * The '<em><b>Public</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #PUBLIC_VALUE
	 * @generated
	 * @orderd
	 */
	PUBLIC( 1, "Public", "Public" ),

	/**
	 * The '<em><b>Private</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #PRIVATE_VALUE
	 * @generated
	 * @orderd
	 */
	PRIVATE( 2, "Private", "Private" );

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
	private ProcessType( final int value, final String name, final String literal )
	{
		this.value   = value;
		this.name    = name;
		this.literal = literal;
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Process Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      literal  the literal.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static ProcessType get( final String literal )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final ProcessType result = VALUES_ARRAY[i];

			if( result.toString().equals( literal ))
			{
				return result;
			}
		}

		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Process Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the integer value.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static ProcessType get( final int value )
	{
		switch( value )
		{
			case NONE_VALUE :
			{
				return NONE;
			}

			case PUBLIC_VALUE :
			{
				return PUBLIC;
			}

			case PRIVATE_VALUE :
			{
				return PRIVATE;
			}
		}

		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Process Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      name  the name.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static ProcessType getByName( final String name )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final ProcessType result = VALUES_ARRAY[i];

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
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>None</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #NONE
	 * @model      name="None"
	 * @generated
	 * @orderd
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Public</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Public</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #PUBLIC
	 * @model      name="Public"
	 * @generated
	 * @orderd
	 */
	public static final int PUBLIC_VALUE = 1;

	/**
	 * The '<em><b>Private</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Private</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #PRIVATE
	 * @model      name="Private"
	 * @generated
	 * @orderd
	 */
	public static final int PRIVATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Process Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessType VALUES_ARRAY[] =
		new ProcessType[]
		{
			NONE,
			PUBLIC,
			PRIVATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Process Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessType> VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ));
} //ProcessType
