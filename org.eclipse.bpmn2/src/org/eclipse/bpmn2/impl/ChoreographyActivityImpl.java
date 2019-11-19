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
import org.eclipse.bpmn2.ChoreographyActivity;
import org.eclipse.bpmn2.ChoreographyLoopType;
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.Participant;

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
 * An implementation of the model object '<em><b>Choreography Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ChoreographyActivityImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ChoreographyActivityImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ChoreographyActivityImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ChoreographyActivityImpl#getLoopType <em>Loop Type</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class ChoreographyActivityImpl
	extends FlowNodeImpl
	implements ChoreographyActivity
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyActivityImpl()
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
			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS :
			{
				return getParticipantRefs();
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS :
			{
				return getCorrelationKeys();
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF :
			{
				if( resolve )
				{
					return getInitiatingParticipantRef();
				}

				return basicGetInitiatingParticipantRef();
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE :
			{
				return getLoopType();
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
			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS :
			{
				return ((InternalEList<?>) getCorrelationKeys()).basicRemove( otherEnd, msgs );
			}
		}

		return super.eInverseRemove( otherEnd, featureID, msgs );
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
			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS :
			{
				return ( participantRefs != null ) && ! participantRefs.isEmpty();
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS :
			{
				return ( correlationKeys != null ) && ! correlationKeys.isEmpty();
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF :
			{
				return initiatingParticipantRef != null;
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE :
			{
				return loopType != LOOP_TYPE_EDEFAULT;
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
			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS :
			{
				getParticipantRefs().clear();
				getParticipantRefs().addAll((Collection<? extends Participant>) newValue );

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS :
			{
				getCorrelationKeys().clear();
				getCorrelationKeys().addAll((Collection<? extends CorrelationKey>) newValue );

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF :
			{
				setInitiatingParticipantRef((Participant) newValue );

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE :
			{
				setLoopType((ChoreographyLoopType) newValue );

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
			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS :
			{
				getParticipantRefs().clear();

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS :
			{
				getCorrelationKeys().clear();

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF :
			{
				setInitiatingParticipantRef((Participant) null );

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE :
			{
				setLoopType( LOOP_TYPE_EDEFAULT );

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
	@Override public List<CorrelationKey> getCorrelationKeys()
	{
		if( correlationKeys == null )
		{
			correlationKeys = new EObjectContainmentEList<CorrelationKey>( CorrelationKey.class, this, Bpmn2Package.CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS );
		}

		return correlationKeys;
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
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef ));
				}
			}
		}

		return initiatingParticipantRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ChoreographyLoopType getLoopType()
	{
		return loopType;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<Participant> getParticipantRefs()
	{
		if( participantRefs == null )
		{
			participantRefs = new EObjectResolvingEList<Participant>( Participant.class, this, Bpmn2Package.CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS );
		}

		return participantRefs;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLoopType  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLoopType( final ChoreographyLoopType newLoopType )
	{
		final ChoreographyLoopType oldLoopType = loopType;
		loopType = ( newLoopType == null ) ? LOOP_TYPE_EDEFAULT : newLoopType;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CHOREOGRAPHY_ACTIVITY__LOOP_TYPE, oldLoopType, loopType ));
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
		result.append( " (loopType: " );
		result.append( loopType );
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
		return Bpmn2Package.Literals.CHOREOGRAPHY_ACTIVITY;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getCorrelationKeys() <em>Correlation Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCorrelationKeys()
	 * @generated
	 * @orderd
	 */
	protected EList<CorrelationKey> correlationKeys;

	/**
	 * The cached value of the '{@link #getInitiatingParticipantRef() <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInitiatingParticipantRef()
	 * @generated
	 * @orderd
	 */
	protected Participant initiatingParticipantRef;

	/**
	 * The cached value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopType()
	 * @generated
	 * @orderd
	 */
	protected ChoreographyLoopType loopType = LOOP_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParticipantRefs() <em>Participant Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getParticipantRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<Participant> participantRefs;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getLoopType() <em>Loop Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopType()
	 * @generated
	 * @orderd
	 */
	protected static final ChoreographyLoopType LOOP_TYPE_EDEFAULT = ChoreographyLoopType.NONE;
} //ChoreographyActivityImpl
