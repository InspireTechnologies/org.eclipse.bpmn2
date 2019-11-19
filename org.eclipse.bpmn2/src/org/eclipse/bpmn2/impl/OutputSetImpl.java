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
import org.eclipse.bpmn2.DataOutput;
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
 * An implementation of the model object '<em><b>Output Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.OutputSetImpl#getDataOutputRefs <em>Data Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OutputSetImpl#getOptionalOutputRefs <em>Optional Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OutputSetImpl#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OutputSetImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OutputSetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class OutputSetImpl
	extends BaseElementImpl
	implements OutputSet
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputSetImpl()
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
			case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS :
			{
				return getDataOutputRefs();
			}

			case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS :
			{
				return getOptionalOutputRefs();
			}

			case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS :
			{
				return getWhileExecutingOutputRefs();
			}

			case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS :
			{
				return getInputSetRefs();
			}

			case Bpmn2Package.OUTPUT_SET__NAME :
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
			case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataOutputRefs()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptionalOutputRefs()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getWhileExecutingOutputRefs()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetRefs()).basicAdd( otherEnd, msgs );
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
			case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS :
			{
				return ((InternalEList<?>) getDataOutputRefs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS :
			{
				return ((InternalEList<?>) getOptionalOutputRefs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS :
			{
				return ((InternalEList<?>) getWhileExecutingOutputRefs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS :
			{
				return ((InternalEList<?>) getInputSetRefs()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS :
			{
				return ( dataOutputRefs != null ) && ! dataOutputRefs.isEmpty();
			}

			case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS :
			{
				return ( optionalOutputRefs != null ) && ! optionalOutputRefs.isEmpty();
			}

			case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS :
			{
				return ( whileExecutingOutputRefs != null ) && ! whileExecutingOutputRefs.isEmpty();
			}

			case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS :
			{
				return ( inputSetRefs != null ) && ! inputSetRefs.isEmpty();
			}

			case Bpmn2Package.OUTPUT_SET__NAME :
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
			case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS :
			{
				getDataOutputRefs().clear();
				getDataOutputRefs().addAll((Collection<? extends DataOutput>) newValue );

				return;
			}

			case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS :
			{
				getOptionalOutputRefs().clear();
				getOptionalOutputRefs().addAll((Collection<? extends DataOutput>) newValue );

				return;
			}

			case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS :
			{
				getWhileExecutingOutputRefs().clear();
				getWhileExecutingOutputRefs().addAll((Collection<? extends DataOutput>) newValue );

				return;
			}

			case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS :
			{
				getInputSetRefs().clear();
				getInputSetRefs().addAll((Collection<? extends InputSet>) newValue );

				return;
			}

			case Bpmn2Package.OUTPUT_SET__NAME :
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
			case Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS :
			{
				getDataOutputRefs().clear();

				return;
			}

			case Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS :
			{
				getOptionalOutputRefs().clear();

				return;
			}

			case Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS :
			{
				getWhileExecutingOutputRefs().clear();

				return;
			}

			case Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS :
			{
				getInputSetRefs().clear();

				return;
			}

			case Bpmn2Package.OUTPUT_SET__NAME :
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
	@Override public List<DataOutput> getDataOutputRefs()
	{
		if( dataOutputRefs == null )
		{
			dataOutputRefs = new EObjectWithInverseEList.ManyInverse<DataOutput>( DataOutput.class, this, Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS, Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS );
		}

		return dataOutputRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<InputSet> getInputSetRefs()
	{
		if( inputSetRefs == null )
		{
			inputSetRefs = new EObjectWithInverseEList.ManyInverse<InputSet>( InputSet.class, this, Bpmn2Package.OUTPUT_SET__INPUT_SET_REFS, Bpmn2Package.INPUT_SET__OUTPUT_SET_REFS );
		}

		return inputSetRefs;
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
	@Override public List<DataOutput> getOptionalOutputRefs()
	{
		if( optionalOutputRefs == null )
		{
			optionalOutputRefs = new EObjectWithInverseEList.ManyInverse<DataOutput>( DataOutput.class, this, Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS, Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL );
		}

		return optionalOutputRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<DataOutput> getWhileExecutingOutputRefs()
	{
		if( whileExecutingOutputRefs == null )
		{
			whileExecutingOutputRefs = new EObjectWithInverseEList.ManyInverse<DataOutput>( DataOutput.class, this, Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS, Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING );
		}

		return whileExecutingOutputRefs;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.OUTPUT_SET__NAME, oldName, name ));
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
		return Bpmn2Package.Literals.OUTPUT_SET;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getDataOutputRefs() <em>Data Output Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDataOutputRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<DataOutput> dataOutputRefs;

	/**
	 * The cached value of the '{@link #getInputSetRefs() <em>Input Set Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInputSetRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<InputSet> inputSetRefs;

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
	 * The cached value of the '{@link #getOptionalOutputRefs() <em>Optional Output Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOptionalOutputRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<DataOutput> optionalOutputRefs;

	/**
	 * The cached value of the '{@link #getWhileExecutingOutputRefs() <em>While Executing Output Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getWhileExecutingOutputRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<DataOutput> whileExecutingOutputRefs;

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
} //OutputSetImpl
