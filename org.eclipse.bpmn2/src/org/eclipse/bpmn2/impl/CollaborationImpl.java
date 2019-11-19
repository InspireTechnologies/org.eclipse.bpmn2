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

import org.eclipse.bpmn2.Artifact;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Choreography;
import org.eclipse.bpmn2.Collaboration;
import org.eclipse.bpmn2.ConversationAssociation;
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.ConversationNode;
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.MessageFlowAssociation;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.ParticipantAssociation;

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
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getMessageFlows <em>Message Flows</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getConversations <em>Conversations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getConversationAssociations <em>Conversation Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getMessageFlowAssociations <em>Message Flow Associations</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getChoreographyRef <em>Choreography Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getConversationLinks <em>Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CollaborationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class CollaborationImpl
	extends RootElementImpl
	implements Collaboration
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl()
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
			case Bpmn2Package.COLLABORATION__PARTICIPANTS :
			{
				return getParticipants();
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS :
			{
				return getMessageFlows();
			}

			case Bpmn2Package.COLLABORATION__ARTIFACTS :
			{
				return getArtifacts();
			}

			case Bpmn2Package.COLLABORATION__CONVERSATIONS :
			{
				return getConversations();
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS :
			{
				return getConversationAssociations();
			}

			case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS :
			{
				return getParticipantAssociations();
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS :
			{
				return getMessageFlowAssociations();
			}

			case Bpmn2Package.COLLABORATION__CORRELATION_KEYS :
			{
				return getCorrelationKeys();
			}

			case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF :
			{
				return getChoreographyRef();
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS :
			{
				return getConversationLinks();
			}

			case Bpmn2Package.COLLABORATION__IS_CLOSED :
			{
				return isIsClosed();
			}

			case Bpmn2Package.COLLABORATION__NAME :
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
	@Override public NotificationChain eInverseRemove( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.COLLABORATION__PARTICIPANTS :
			{
				return ((InternalEList<?>) getParticipants()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS :
			{
				return ((InternalEList<?>) getMessageFlows()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__ARTIFACTS :
			{
				return ((InternalEList<?>) getArtifacts()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__CONVERSATIONS :
			{
				return ((InternalEList<?>) getConversations()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS :
			{
				return ((InternalEList<?>) getConversationAssociations()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS :
			{
				return ((InternalEList<?>) getParticipantAssociations()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS :
			{
				return ((InternalEList<?>) getMessageFlowAssociations()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__CORRELATION_KEYS :
			{
				return ((InternalEList<?>) getCorrelationKeys()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS :
			{
				return ((InternalEList<?>) getConversationLinks()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.COLLABORATION__PARTICIPANTS :
			{
				return ( participants != null ) && ! participants.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS :
			{
				return ( messageFlows != null ) && ! messageFlows.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__ARTIFACTS :
			{
				return ( artifacts != null ) && ! artifacts.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__CONVERSATIONS :
			{
				return ( conversations != null ) && ! conversations.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS :
			{
				return ( conversationAssociations != null ) && ! conversationAssociations.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS :
			{
				return ( participantAssociations != null ) && ! participantAssociations.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS :
			{
				return ( messageFlowAssociations != null ) && ! messageFlowAssociations.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__CORRELATION_KEYS :
			{
				return ( correlationKeys != null ) && ! correlationKeys.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF :
			{
				return ( choreographyRef != null ) && ! choreographyRef.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS :
			{
				return ( conversationLinks != null ) && ! conversationLinks.isEmpty();
			}

			case Bpmn2Package.COLLABORATION__IS_CLOSED :
			{
				return isClosed != IS_CLOSED_EDEFAULT;
			}

			case Bpmn2Package.COLLABORATION__NAME :
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
			case Bpmn2Package.COLLABORATION__PARTICIPANTS :
			{
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Participant>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS :
			{
				getMessageFlows().clear();
				getMessageFlows().addAll((Collection<? extends MessageFlow>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__ARTIFACTS :
			{
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__CONVERSATIONS :
			{
				getConversations().clear();
				getConversations().addAll((Collection<? extends ConversationNode>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS :
			{
				getConversationAssociations().clear();
				getConversationAssociations().addAll((Collection<? extends ConversationAssociation>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS :
			{
				getParticipantAssociations().clear();
				getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS :
			{
				getMessageFlowAssociations().clear();
				getMessageFlowAssociations().addAll((Collection<? extends MessageFlowAssociation>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__CORRELATION_KEYS :
			{
				getCorrelationKeys().clear();
				getCorrelationKeys().addAll((Collection<? extends CorrelationKey>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF :
			{
				getChoreographyRef().clear();
				getChoreographyRef().addAll((Collection<? extends Choreography>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS :
			{
				getConversationLinks().clear();
				getConversationLinks().addAll((Collection<? extends ConversationLink>) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__IS_CLOSED :
			{
				setIsClosed((Boolean) newValue );

				return;
			}

			case Bpmn2Package.COLLABORATION__NAME :
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
			case Bpmn2Package.COLLABORATION__PARTICIPANTS :
			{
				getParticipants().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOWS :
			{
				getMessageFlows().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__ARTIFACTS :
			{
				getArtifacts().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__CONVERSATIONS :
			{
				getConversations().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS :
			{
				getConversationAssociations().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS :
			{
				getParticipantAssociations().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS :
			{
				getMessageFlowAssociations().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__CORRELATION_KEYS :
			{
				getCorrelationKeys().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF :
			{
				getChoreographyRef().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__CONVERSATION_LINKS :
			{
				getConversationLinks().clear();

				return;
			}

			case Bpmn2Package.COLLABORATION__IS_CLOSED :
			{
				setIsClosed( IS_CLOSED_EDEFAULT );

				return;
			}

			case Bpmn2Package.COLLABORATION__NAME :
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
	@Override public List<Artifact> getArtifacts()
	{
		if( artifacts == null )
		{
			artifacts = new EObjectContainmentEList<Artifact>( Artifact.class, this, Bpmn2Package.COLLABORATION__ARTIFACTS );
		}

		return artifacts;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<Choreography> getChoreographyRef()
	{
		if( choreographyRef == null )
		{
			choreographyRef = new EObjectResolvingEList<Choreography>( Choreography.class, this, Bpmn2Package.COLLABORATION__CHOREOGRAPHY_REF );
		}

		return choreographyRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<ConversationAssociation> getConversationAssociations()
	{
		if( conversationAssociations == null )
		{
			conversationAssociations = new EObjectContainmentEList<ConversationAssociation>( ConversationAssociation.class, this, Bpmn2Package.COLLABORATION__CONVERSATION_ASSOCIATIONS );
		}

		return conversationAssociations;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<ConversationLink> getConversationLinks()
	{
		if( conversationLinks == null )
		{
			conversationLinks = new EObjectContainmentEList<ConversationLink>( ConversationLink.class, this, Bpmn2Package.COLLABORATION__CONVERSATION_LINKS );
		}

		return conversationLinks;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<ConversationNode> getConversations()
	{
		if( conversations == null )
		{
			conversations = new EObjectContainmentEList<ConversationNode>( ConversationNode.class, this, Bpmn2Package.COLLABORATION__CONVERSATIONS );
		}

		return conversations;
	}

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
			correlationKeys = new EObjectContainmentEList<CorrelationKey>( CorrelationKey.class, this, Bpmn2Package.COLLABORATION__CORRELATION_KEYS );
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
	@Override public List<MessageFlowAssociation> getMessageFlowAssociations()
	{
		if( messageFlowAssociations == null )
		{
			messageFlowAssociations = new EObjectContainmentEList<MessageFlowAssociation>( MessageFlowAssociation.class, this, Bpmn2Package.COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS );
		}

		return messageFlowAssociations;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<MessageFlow> getMessageFlows()
	{
		if( messageFlows == null )
		{
			messageFlows = new EObjectContainmentEList<MessageFlow>( MessageFlow.class, this, Bpmn2Package.COLLABORATION__MESSAGE_FLOWS );
		}

		return messageFlows;
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
	@Override public List<ParticipantAssociation> getParticipantAssociations()
	{
		if( participantAssociations == null )
		{
			participantAssociations = new EObjectContainmentEList<ParticipantAssociation>( ParticipantAssociation.class, this, Bpmn2Package.COLLABORATION__PARTICIPANT_ASSOCIATIONS );
		}

		return participantAssociations;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<Participant> getParticipants()
	{
		if( participants == null )
		{
			participants = new EObjectContainmentEList<Participant>( Participant.class, this, Bpmn2Package.COLLABORATION__PARTICIPANTS );
		}

		return participants;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsClosed()
	{
		return isClosed;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsClosed  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsClosed( final boolean newIsClosed )
	{
		final boolean oldIsClosed = isClosed;
		isClosed = newIsClosed;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.COLLABORATION__IS_CLOSED, oldIsClosed, isClosed ));
		}
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.COLLABORATION__NAME, oldName, name ));
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
		result.append( " (isClosed: " );
		result.append( isClosed );
		result.append( ", name: " );
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
		return Bpmn2Package.Literals.COLLABORATION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getArtifacts()
	 * @generated
	 * @orderd
	 */
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getChoreographyRef() <em>Choreography Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getChoreographyRef()
	 * @generated
	 * @orderd
	 */
	protected EList<Choreography> choreographyRef;

	/**
	 * The cached value of the '{@link #getConversationAssociations() <em>Conversation Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getConversationAssociations()
	 * @generated
	 * @orderd
	 */
	protected EList<ConversationAssociation> conversationAssociations;

	/**
	 * The cached value of the '{@link #getConversationLinks() <em>Conversation Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getConversationLinks()
	 * @generated
	 * @orderd
	 */
	protected EList<ConversationLink> conversationLinks;

	/**
	 * The cached value of the '{@link #getConversations() <em>Conversations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getConversations()
	 * @generated
	 * @orderd
	 */
	protected EList<ConversationNode> conversations;

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
	 * The cached value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsClosed()
	 * @generated
	 * @orderd
	 */
	protected boolean isClosed = IS_CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageFlowAssociations() <em>Message Flow Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessageFlowAssociations()
	 * @generated
	 * @orderd
	 */
	protected EList<MessageFlowAssociation> messageFlowAssociations;

	/**
	 * The cached value of the '{@link #getMessageFlows() <em>Message Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessageFlows()
	 * @generated
	 * @orderd
	 */
	protected EList<MessageFlow> messageFlows;

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
	 * The cached value of the '{@link #getParticipantAssociations() <em>Participant Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getParticipantAssociations()
	 * @generated
	 * @orderd
	 */
	protected EList<ParticipantAssociation> participantAssociations;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getParticipants()
	 * @generated
	 * @orderd
	 */
	protected EList<Participant> participants;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsClosed()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_CLOSED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected static final String NAME_EDEFAULT = null;
} //CollaborationImpl
