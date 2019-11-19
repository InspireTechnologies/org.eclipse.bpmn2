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
 * A representation of the literals of the enumeration '<em><b>Choreography Loop Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package#getChoreographyLoopType()
 * @model      extendedMetaData="name='tChoreographyLoopType'"
 * @generated
 */
public enum ChoreographyLoopType
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
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #STANDARD_VALUE
	 * @generated
	 * @orderd
	 */
	STANDARD( 1, "Standard", "Standard" ),

	/**
	 * The '<em><b>Multi Instance Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #MULTI_INSTANCE_SEQUENTIAL_VALUE
	 * @generated
	 * @orderd
	 */
	MULTI_INSTANCE_SEQUENTIAL( 2, "MultiInstanceSequential", "MultiInstanceSequential" ),

	/**
	 * The '<em><b>Multi Instance Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #MULTI_INSTANCE_PARALLEL_VALUE
	 * @generated
	 * @orderd
	 */
	MULTI_INSTANCE_PARALLEL( 3, "MultiInstanceParallel", "MultiInstanceParallel" );

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
	private ChoreographyLoopType( final int value, final String name, final String literal )
	{
		this.value   = value;
		this.name    = name;
		this.literal = literal;
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Choreography Loop Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      literal  the literal.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static ChoreographyLoopType get( final String literal )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final ChoreographyLoopType result = VALUES_ARRAY[i];

			if( result.toString().equals( literal ))
			{
				return result;
			}
		}

		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Choreography Loop Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the integer value.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static ChoreographyLoopType get( final int value )
	{
		switch( value )
		{
			case NONE_VALUE :
			{
				return NONE;
			}

			case STANDARD_VALUE :
			{
				return STANDARD;
			}

			case MULTI_INSTANCE_SEQUENTIAL_VALUE :
			{
				return MULTI_INSTANCE_SEQUENTIAL;
			}

			case MULTI_INSTANCE_PARALLEL_VALUE :
			{
				return MULTI_INSTANCE_PARALLEL;
			}
		}

		return null;
	} // end method get

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the '<em><b>Choreography Loop Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      name  the name.
	 *
	 * @return     the matching enumerator or <code>null</code>.
	 *
	 * @generated
	 */
	public static ChoreographyLoopType getByName( final String name )
	{
		for( int i = 0; i < VALUES_ARRAY.length; ++i )
		{
			final ChoreographyLoopType result = VALUES_ARRAY[i];

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
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Standard</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #STANDARD
	 * @model      name="Standard"
	 * @generated
	 * @orderd
	 */
	public static final int STANDARD_VALUE = 1;

	/**
	 * The '<em><b>Multi Instance Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Multi Instance Sequential</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #MULTI_INSTANCE_SEQUENTIAL
	 * @model      name="MultiInstanceSequential"
	 * @generated
	 * @orderd
	 */
	public static final int MULTI_INSTANCE_SEQUENTIAL_VALUE = 2;

	/**
	 * The '<em><b>Multi Instance Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of '<em><b>Multi Instance Parallel</b></em>' literal object isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @see        #MULTI_INSTANCE_PARALLEL
	 * @model      name="MultiInstanceParallel"
	 * @generated
	 * @orderd
	 */
	public static final int MULTI_INSTANCE_PARALLEL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Choreography Loop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChoreographyLoopType VALUES_ARRAY[] =
		new ChoreographyLoopType[]
		{
			NONE,
			STANDARD,
			MULTI_INSTANCE_SEQUENTIAL,
			MULTI_INSTANCE_PARALLEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Choreography Loop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChoreographyLoopType> VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ));
} //ChoreographyLoopType
