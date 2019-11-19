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
 *
 */
package org.eclipse.bpmn2.di;

import org.eclipse.emf.common.util.Enumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Visible Kind</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.bpmn2.di.BpmnDiPackage#getMessageVisibleKind()
 * @model
 * @generated
 */
public enum MessageVisibleKind
	implements Enumerator
{
	//~ Enum constants .........................................................................................................................................................................................................................................

	/**
	 * The '<em><b>Initiating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #INITIATING_VALUE
	 * @generated
	 * @orderd
	 */
	INITIATING( 0, "initiating", "initiating" ),

	/**
	 * The '<em><b>Non initiating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #NON_INITIATING_VALUE
	 * @generated
	 * @orderd
	 */
	NON_INITIATING( 1, "non_initiating", "non_initiating" );

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
	private MessageVisibleKind( final int value, final String name, final String literal )
	{
		this.value   = value;
		this.name    = name;
		this.literal = literal;
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Message Visible Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      literal  the literal.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static MessageVisibleKind get( final String literal )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final MessageVisibleKind result = VALUES_ARRAY[i];

			if( result.toString().equals( literal ))
			{
				return result;
			}
		}

		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Message Visible Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the integer value.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static MessageVisibleKind get( final int value )
	{
		switch( value )
		{
			case INITIATING_VALUE :
			{
				return INITIATING;
			}

			case NON_INITIATING_VALUE :
			{
				return NON_INITIATING;
			}
		}

		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Message Visible Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      name  the name.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static MessageVisibleKind getByName( final String name )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final MessageVisibleKind result = VALUES_ARRAY[i];

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
	 * The '<em><b>Initiating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Initiating</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #INITIATING
	 * @model      name="initiating"
	 * @generated
	 * @orderd
	 */
	public static final int INITIATING_VALUE = 0;

	/**
	 * The '<em><b>Non initiating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Non initiating</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #NON_INITIATING
	 * @model      name="non_initiating"
	 * @generated
	 * @orderd
	 */
	public static final int NON_INITIATING_VALUE = 1;

	/**
	 * An array of all the '<em><b>Message Visible Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageVisibleKind VALUES_ARRAY[] =
		new MessageVisibleKind[]
		{
			INITIATING,
			NON_INITIATING,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Visible Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageVisibleKind> VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ));
} //MessageVisibleKind
