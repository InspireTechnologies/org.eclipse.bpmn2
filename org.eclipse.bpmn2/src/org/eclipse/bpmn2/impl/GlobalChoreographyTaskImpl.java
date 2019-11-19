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
import org.eclipse.bpmn2.GlobalChoreographyTask;
import org.eclipse.bpmn2.Participant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.GlobalChoreographyTaskImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class GlobalChoreographyTaskImpl
	extends ChoreographyImpl
	implements GlobalChoreographyTask
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalChoreographyTaskImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public Participant basicGetInitiatingParticipantRef()
	{
		return initiatingParticipantRef;
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
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF :
			{
				if( resolve )
				{
					return getInitiatingParticipantRef();
				}

				return basicGetInitiatingParticipantRef();
			}
		}

		return super.eGet( featureID, resolve, coreType );
	}

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
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF :
			{
				return initiatingParticipantRef != null;
			}
		}

		return super.eIsSet( featureID );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      featureID  DOCUMENT ME!
	 * @param      newValue   DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF :
			{
				setInitiatingParticipantRef((Participant) newValue );

				return;
			}
		}

		super.eSet( featureID, newValue );
	}

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
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF :
			{
				setInitiatingParticipantRef((Participant) null );

				return;
			}
		}

		super.eUnset( featureID );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Participant getInitiatingParticipantRef()
	{
		if(( initiatingParticipantRef != null ) && initiatingParticipantRef.eIsProxy())
		{
			final InternalEObject oldInitiatingParticipantRef = (InternalEObject) initiatingParticipantRef;
			initiatingParticipantRef = (Participant) eResolveProxy( oldInitiatingParticipantRef );

			if( initiatingParticipantRef != oldInitiatingParticipantRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef ));
				}
			}
		}

		return initiatingParticipantRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newInitiatingParticipantRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setInitiatingParticipantRef( final Participant newInitiatingParticipantRef )
	{
		final Participant oldInitiatingParticipantRef = initiatingParticipantRef;
		initiatingParticipantRef = newInitiatingParticipantRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef ));
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
	@Override protected EClass eStaticClass()
	{
		return Bpmn2Package.Literals.GLOBAL_CHOREOGRAPHY_TASK;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getInitiatingParticipantRef() <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInitiatingParticipantRef()
	 * @generated
	 * @orderd
	 */
	protected Participant initiatingParticipantRef;
} //GlobalChoreographyTaskImpl
