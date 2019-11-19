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
package org.eclipse.bpmn2.impl;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.OutputSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.InputSetImpl#getDataInputRefs <em>Data Input Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.InputSetImpl#getOptionalInputRefs <em>Optional Input Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.InputSetImpl#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.InputSetImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.InputSetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class InputSetImpl
	extends BaseElementImpl
	implements InputSet
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSetImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      featureID  DOCUMENT ME!
	 * @param      resolve    DOCUMENT ME!
	 * @param      coreType   DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Object eGet( final int featureID, final boolean resolve, final boolean coreType )
	{
		switch( featureID )
		{
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS :
			{
				return getDataInputRefs();
			}

			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS :
			{
				return getOptionalInputRefs();
			}

			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS :
			{
				return getWhileExecutingInputRefs();
			}

			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS :
			{
				return getOutputSetRefs();
			}

			case Bpmn2Package.INPUT_SET__NAME :
			{
				return getName();
			}
		}

		return super.eGet( featureID, resolve, coreType );
	} // end method eGet

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      otherEnd   DOCUMENT ME!
	 * @param      featureID  DOCUMENT ME!
	 * @param      msgs       DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override
	@SuppressWarnings( "unchecked" )
	public NotificationChain eInverseAdd( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataInputRefs()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptionalInputRefs()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getWhileExecutingInputRefs()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputSetRefs()).basicAdd( otherEnd, msgs );
			}
		}

		return super.eInverseAdd( otherEnd, featureID, msgs );
	} // end method eInverseAdd

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      otherEnd   DOCUMENT ME!
	 * @param      featureID  DOCUMENT ME!
	 * @param      msgs       DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public NotificationChain eInverseRemove( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS :
			{
				return ((InternalEList<?>) getDataInputRefs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS :
			{
				return ((InternalEList<?>) getOptionalInputRefs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS :
			{
				return ((InternalEList<?>) getWhileExecutingInputRefs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS :
			{
				return ((InternalEList<?>) getOutputSetRefs()).basicRemove( otherEnd, msgs );
			}
		}

		return super.eInverseRemove( otherEnd, featureID, msgs );
	} // end method eInverseRemove

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      featureID  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean eIsSet( final int featureID )
	{
		switch( featureID )
		{
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS :
			{
				return ( dataInputRefs != null ) && ! dataInputRefs.isEmpty();
			}

			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS :
			{
				return ( optionalInputRefs != null ) && ! optionalInputRefs.isEmpty();
			}

			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS :
			{
				return ( whileExecutingInputRefs != null ) && ! whileExecutingInputRefs.isEmpty();
			}

			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS :
			{
				return ( outputSetRefs != null ) && ! outputSetRefs.isEmpty();
			}

			case Bpmn2Package.INPUT_SET__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
			}
		}

		return super.eIsSet( featureID );
	} // end method eIsSet

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      featureID  DOCUMENT ME!
	 * @param      newValue   DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override
	@SuppressWarnings( "unchecked" )
	public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS :
			{
				getDataInputRefs().clear();
				getDataInputRefs().addAll((Collection<? extends DataInput>) newValue );

				return;
			}

			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS :
			{
				getOptionalInputRefs().clear();
				getOptionalInputRefs().addAll((Collection<? extends DataInput>) newValue );

				return;
			}

			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS :
			{
				getWhileExecutingInputRefs().clear();
				getWhileExecutingInputRefs().addAll((Collection<? extends DataInput>) newValue );

				return;
			}

			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS :
			{
				getOutputSetRefs().clear();
				getOutputSetRefs().addAll((Collection<? extends OutputSet>) newValue );

				return;
			}

			case Bpmn2Package.INPUT_SET__NAME :
			{
				setName((String) newValue );

				return;
			}
		}

		super.eSet( featureID, newValue );
	} // end method eSet

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      featureID  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void eUnset( final int featureID )
	{
		switch( featureID )
		{
			case Bpmn2Package.INPUT_SET__DATA_INPUT_REFS :
			{
				getDataInputRefs().clear();

				return;
			}

			case Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS :
			{
				getOptionalInputRefs().clear();

				return;
			}

			case Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS :
			{
				getWhileExecutingInputRefs().clear();

				return;
			}

			case Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS :
			{
				getOutputSetRefs().clear();

				return;
			}

			case Bpmn2Package.INPUT_SET__NAME :
			{
				setName( NAME_EDEFAULT );

				return;
			}
		}

		super.eUnset( featureID );
	} // end method eUnset

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<DataInput> getDataInputRefs()
	{
		if( dataInputRefs == null )
		{
			dataInputRefs = new EObjectWithInverseEList.ManyInverse<DataInput>( DataInput.class, this, Bpmn2Package.INPUT_SET__DATA_INPUT_REFS, Bpmn2Package.DATA_INPUT__INPUT_SET_REFS );
		}

		return dataInputRefs;
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
	@Override public List<DataInput> getOptionalInputRefs()
	{
		if( optionalInputRefs == null )
		{
			optionalInputRefs = new EObjectWithInverseEList.ManyInverse<DataInput>( DataInput.class, this, Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS, Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL );
		}

		return optionalInputRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<OutputSet> getOutputSetRefs()
	{
		if( outputSetRefs == null )
		{
			outputSetRefs = new EObjectWithInverseEList.ManyInverse<OutputSet>( OutputSet.class, this, Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS, Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS );
		}

		return outputSetRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<DataInput> getWhileExecutingInputRefs()
	{
		if( whileExecutingInputRefs == null )
		{
			whileExecutingInputRefs = new EObjectWithInverseEList.ManyInverse<DataInput>( DataInput.class, this, Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS, Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING );
		}

		return whileExecutingInputRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newName  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setName( final String newName )
	{
		final String oldName = name;
		name = newName;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.INPUT_SET__NAME, oldName, name ));
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
	@Override public String toString()
	{
		if( eIsProxy())
		{
			return super.toString();
		}

		final StringBuilder result = new StringBuilder( super.toString());
		result.append( " (name: " );
		result.append( name );
		result.append( ')' );

		return result.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override protected EClass eStaticClass()
	{
		return Bpmn2Package.Literals.INPUT_SET;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getDataInputRefs() <em>Data Input Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDataInputRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<DataInput> dataInputRefs;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionalInputRefs() <em>Optional Input Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOptionalInputRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<DataInput> optionalInputRefs;

	/**
	 * The cached value of the '{@link #getOutputSetRefs() <em>Output Set Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutputSetRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<OutputSet> outputSetRefs;

	/**
	 * The cached value of the '{@link #getWhileExecutingInputRefs() <em>While Executing Input Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getWhileExecutingInputRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<DataInput> whileExecutingInputRefs;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected static final String NAME_EDEFAULT = null;
} //InputSetImpl
