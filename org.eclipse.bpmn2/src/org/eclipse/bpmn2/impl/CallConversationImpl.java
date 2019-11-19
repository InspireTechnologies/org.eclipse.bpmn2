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
import org.eclipse.bpmn2.CallConversation;
import org.eclipse.bpmn2.Collaboration;
import org.eclipse.bpmn2.ParticipantAssociation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CallConversationImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CallConversationImpl#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class CallConversationImpl
	extends ConversationNodeImpl
	implements CallConversation
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallConversationImpl()
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
	public Collaboration basicGetCalledCollaborationRef()
	{
		return calledCollaborationRef;
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
			case Bpmn2Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS :
			{
				return getParticipantAssociations();
			}

			case Bpmn2Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF :
			{
				if( resolve )
				{
					return getCalledCollaborationRef();
				}

				return basicGetCalledCollaborationRef();
			}
		}

		return super.eGet( featureID, resolve, coreType );
	}

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
			case Bpmn2Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS :
			{
				return ((InternalEList<?>) getParticipantAssociations()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS :
			{
				return ( participantAssociations != null ) && ! participantAssociations.isEmpty();
			}

			case Bpmn2Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF :
			{
				return calledCollaborationRef != null;
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
	@Override
	@SuppressWarnings( "unchecked" )
	public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case Bpmn2Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS :
			{
				getParticipantAssociations().clear();
				getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>) newValue );

				return;
			}

			case Bpmn2Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF :
			{
				setCalledCollaborationRef((Collaboration) newValue );

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
			case Bpmn2Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS :
			{
				getParticipantAssociations().clear();

				return;
			}

			case Bpmn2Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF :
			{
				setCalledCollaborationRef((Collaboration) null );

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
	@Override public Collaboration getCalledCollaborationRef()
	{
		if(( calledCollaborationRef != null ) && calledCollaborationRef.eIsProxy())
		{
			final InternalEObject oldCalledCollaborationRef = (InternalEObject) calledCollaborationRef;
			calledCollaborationRef = (Collaboration) eResolveProxy( oldCalledCollaborationRef );

			if( calledCollaborationRef != oldCalledCollaborationRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF, oldCalledCollaborationRef, calledCollaborationRef ));
				}
			}
		}

		return calledCollaborationRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<ParticipantAssociation> getParticipantAssociations()
	{
		if( participantAssociations == null )
		{
			participantAssociations = new EObjectContainmentEList<ParticipantAssociation>( ParticipantAssociation.class, this, Bpmn2Package.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS );
		}

		return participantAssociations;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newCalledCollaborationRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setCalledCollaborationRef( final Collaboration newCalledCollaborationRef )
	{
		final Collaboration oldCalledCollaborationRef = calledCollaborationRef;
		calledCollaborationRef = newCalledCollaborationRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CALL_CONVERSATION__CALLED_COLLABORATION_REF, oldCalledCollaborationRef, calledCollaborationRef ));
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
		return Bpmn2Package.Literals.CALL_CONVERSATION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getCalledCollaborationRef() <em>Called Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCalledCollaborationRef()
	 * @generated
	 * @orderd
	 */
	protected Collaboration calledCollaborationRef;

	/**
	 * The cached value of the '{@link #getParticipantAssociations() <em>Participant Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getParticipantAssociations()
	 * @generated
	 * @orderd
	 */
	protected EList<ParticipantAssociation> participantAssociations;
} //CallConversationImpl
