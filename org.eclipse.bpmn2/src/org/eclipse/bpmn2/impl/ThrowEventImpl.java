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
import org.eclipse.bpmn2.DataInputAssociation;
import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.ThrowEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ThrowEventImpl#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ThrowEventImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ThrowEventImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ThrowEventImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ThrowEventImpl#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class ThrowEventImpl
	extends EventImpl
	implements ThrowEvent
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowEventImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newInputSet  DOCUMENT ME!
	 * @param      msgs         DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetInputSet( final InputSet newInputSet, NotificationChain msgs )
	{
		final InputSet oldInputSet = inputSet;
		inputSet = newInputSet;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.THROW_EVENT__INPUT_SET, oldInputSet, newInputSet );

			if( msgs == null )
			{
				msgs = notification;
			}
			else
			{
				msgs.add( notification );
			}
		}

		return msgs;
	}

	//~ ........................................................................................................................................................................................................................................................

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
			case Bpmn2Package.THROW_EVENT__DATA_INPUTS :
			{
				return getDataInputs();
			}

			case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION :
			{
				return getDataInputAssociation();
			}

			case Bpmn2Package.THROW_EVENT__INPUT_SET :
			{
				return getInputSet();
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS :
			{
				return getEventDefinitions();
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS :
			{
				return getEventDefinitionRefs();
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
	@Override public NotificationChain eInverseRemove( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.THROW_EVENT__DATA_INPUTS :
			{
				return ((InternalEList<?>) getDataInputs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION :
			{
				return ((InternalEList<?>) getDataInputAssociation()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.THROW_EVENT__INPUT_SET :
			{
				return basicSetInputSet( null, msgs );
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS :
			{
				return ((InternalEList<?>) getEventDefinitions()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.THROW_EVENT__DATA_INPUTS :
			{
				return ( dataInputs != null ) && ! dataInputs.isEmpty();
			}

			case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION :
			{
				return ( dataInputAssociation != null ) && ! dataInputAssociation.isEmpty();
			}

			case Bpmn2Package.THROW_EVENT__INPUT_SET :
			{
				return inputSet != null;
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS :
			{
				return ( eventDefinitions != null ) && ! eventDefinitions.isEmpty();
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS :
			{
				return ( eventDefinitionRefs != null ) && ! eventDefinitionRefs.isEmpty();
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
			case Bpmn2Package.THROW_EVENT__DATA_INPUTS :
			{
				getDataInputs().clear();
				getDataInputs().addAll((Collection<? extends DataInput>) newValue );

				return;
			}

			case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION :
			{
				getDataInputAssociation().clear();
				getDataInputAssociation().addAll((Collection<? extends DataInputAssociation>) newValue );

				return;
			}

			case Bpmn2Package.THROW_EVENT__INPUT_SET :
			{
				setInputSet((InputSet) newValue );

				return;
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS :
			{
				getEventDefinitions().clear();
				getEventDefinitions().addAll((Collection<? extends EventDefinition>) newValue );

				return;
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS :
			{
				getEventDefinitionRefs().clear();
				getEventDefinitionRefs().addAll((Collection<? extends EventDefinition>) newValue );

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
			case Bpmn2Package.THROW_EVENT__DATA_INPUTS :
			{
				getDataInputs().clear();

				return;
			}

			case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION :
			{
				getDataInputAssociation().clear();

				return;
			}

			case Bpmn2Package.THROW_EVENT__INPUT_SET :
			{
				setInputSet((InputSet) null );

				return;
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS :
			{
				getEventDefinitions().clear();

				return;
			}

			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS :
			{
				getEventDefinitionRefs().clear();

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
	@Override public List<DataInputAssociation> getDataInputAssociation()
	{
		if( dataInputAssociation == null )
		{
			dataInputAssociation = new EObjectContainmentEList<DataInputAssociation>( DataInputAssociation.class, this, Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION );
		}

		return dataInputAssociation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<DataInput> getDataInputs()
	{
		if( dataInputs == null )
		{
			dataInputs = new EObjectContainmentEList<DataInput>( DataInput.class, this, Bpmn2Package.THROW_EVENT__DATA_INPUTS );
		}

		return dataInputs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<EventDefinition> getEventDefinitionRefs()
	{
		if( eventDefinitionRefs == null )
		{
			eventDefinitionRefs = new EObjectResolvingEList<EventDefinition>( EventDefinition.class, this, Bpmn2Package.THROW_EVENT__EVENT_DEFINITION_REFS );
		}

		return eventDefinitionRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<EventDefinition> getEventDefinitions()
	{
		if( eventDefinitions == null )
		{
			eventDefinitions = new EObjectContainmentEList<EventDefinition>( EventDefinition.class, this, Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS );
		}

		return eventDefinitions;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public InputSet getInputSet()
	{
		return inputSet;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newInputSet  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setInputSet( final InputSet newInputSet )
	{
		if( newInputSet != inputSet )
		{
			NotificationChain msgs = null;

			if( inputSet != null )
			{
				msgs = ((InternalEObject) inputSet ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.THROW_EVENT__INPUT_SET, null, msgs );
			}

			if( newInputSet != null )
			{
				msgs = ((InternalEObject) newInputSet ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.THROW_EVENT__INPUT_SET, null, msgs );
			}

			msgs = basicSetInputSet( newInputSet, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.THROW_EVENT__INPUT_SET, newInputSet, newInputSet ));
		}
	} // end method setInputSet

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
		return Bpmn2Package.Literals.THROW_EVENT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getDataInputAssociation() <em>Data Input Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDataInputAssociation()
	 * @generated
	 * @orderd
	 */
	protected EList<DataInputAssociation> dataInputAssociation;

	/**
	 * The cached value of the '{@link #getDataInputs() <em>Data Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDataInputs()
	 * @generated
	 * @orderd
	 */
	protected EList<DataInput> dataInputs;

	/**
	 * The cached value of the '{@link #getEventDefinitionRefs() <em>Event Definition Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getEventDefinitionRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<EventDefinition> eventDefinitionRefs;

	/**
	 * The cached value of the '{@link #getEventDefinitions() <em>Event Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getEventDefinitions()
	 * @generated
	 * @orderd
	 */
	protected EList<EventDefinition> eventDefinitions;

	/**
	 * The cached value of the '{@link #getInputSet() <em>Input Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInputSet()
	 * @generated
	 * @orderd
	 */
	protected InputSet inputSet;
} //ThrowEventImpl
