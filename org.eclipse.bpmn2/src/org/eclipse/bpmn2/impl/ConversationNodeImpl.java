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
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.ConversationNode;
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.util.Bpmn2Resource;

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
 * An implementation of the model object '<em><b>Conversation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getParticipantRefs <em>Participant Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getMessageFlowRefs <em>Message Flow Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationNodeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ConversationNodeImpl
	extends BaseElementImpl
	implements ConversationNode
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationNodeImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      derivedFeatureID  DOCUMENT ME!
	 * @param      baseClass         DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int eBaseStructuralFeatureID( final int derivedFeatureID, final Class<?> baseClass )
	{
		if( baseClass == InteractionNode.class )
		{
			switch( derivedFeatureID )
			{
				case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
				}

				case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
				}

				default :
				{
					return -1;
				}
			}
		}

		return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      baseFeatureID  DOCUMENT ME!
	 * @param      baseClass      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int eDerivedStructuralFeatureID( final int baseFeatureID, final Class<?> baseClass )
	{
		if( baseClass == InteractionNode.class )
		{
			switch( baseFeatureID )
			{
				case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;
				}

				case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;
				}

				default :
				{
					return -1;
				}
			}
		}

		return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
			case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS :
			{
				return getIncomingConversationLinks();
			}

			case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS :
			{
				return getOutgoingConversationLinks();
			}

			case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS :
			{
				return getParticipantRefs();
			}

			case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS :
			{
				return getMessageFlowRefs();
			}

			case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS :
			{
				return getCorrelationKeys();
			}

			case Bpmn2Package.CONVERSATION_NODE__NAME :
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
			case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS :
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
			case Bpmn2Package.CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS :
			{
				return ! getIncomingConversationLinks().isEmpty();
			}

			case Bpmn2Package.CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS :
			{
				return ! getOutgoingConversationLinks().isEmpty();
			}

			case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS :
			{
				return ( participantRefs != null ) && ! participantRefs.isEmpty();
			}

			case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS :
			{
				return ( messageFlowRefs != null ) && ! messageFlowRefs.isEmpty();
			}

			case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS :
			{
				return ( correlationKeys != null ) && ! correlationKeys.isEmpty();
			}

			case Bpmn2Package.CONVERSATION_NODE__NAME :
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
			case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS :
			{
				getParticipantRefs().clear();
				getParticipantRefs().addAll((Collection<? extends Participant>) newValue );

				return;
			}

			case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS :
			{
				getMessageFlowRefs().clear();
				getMessageFlowRefs().addAll((Collection<? extends MessageFlow>) newValue );

				return;
			}

			case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS :
			{
				getCorrelationKeys().clear();
				getCorrelationKeys().addAll((Collection<? extends CorrelationKey>) newValue );

				return;
			}

			case Bpmn2Package.CONVERSATION_NODE__NAME :
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
			case Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS :
			{
				getParticipantRefs().clear();

				return;
			}

			case Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS :
			{
				getMessageFlowRefs().clear();

				return;
			}

			case Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS :
			{
				getCorrelationKeys().clear();

				return;
			}

			case Bpmn2Package.CONVERSATION_NODE__NAME :
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
	@Override public List<CorrelationKey> getCorrelationKeys()
	{
		if( correlationKeys == null )
		{
			correlationKeys = new EObjectContainmentEList<CorrelationKey>( CorrelationKey.class, this, Bpmn2Package.CONVERSATION_NODE__CORRELATION_KEYS );
		}

		return correlationKeys;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * Virtual opposite of {@link ConversationLink#getTargetRef()}. For general information about virtual opposites see {@link CategoryValueImpl#getCategorizedFlowElements()}
	 * <!-- end-user-doc -->
	 * @return     virtual opposite of {@link ConversationLink#getTargetRef()}.
	 *
	 * @throws     UnsupportedOperationException  DOCUMENT ME!
	 *
	 * @generated  NOT
	 */
	@Override public List<ConversationLink> getIncomingConversationLinks()
	{
		if( eResource() instanceof Bpmn2Resource )
		{
			return ((Bpmn2Resource) eResource()).getOppositeReferenceAdapter().getOppositeList( ConversationLink.class, this, Bpmn2Package.Literals.CONVERSATION_LINK__TARGET_REF );
		}

		throw new UnsupportedOperationException();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<MessageFlow> getMessageFlowRefs()
	{
		if( messageFlowRefs == null )
		{
			messageFlowRefs = new EObjectResolvingEList<MessageFlow>( MessageFlow.class, this, Bpmn2Package.CONVERSATION_NODE__MESSAGE_FLOW_REFS );
		}

		return messageFlowRefs;
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
	 * Virtual opposite of {@link ConversationLink#getSourceRef()}. For general information about virtual opposites see {@link CategoryValueImpl#getCategorizedFlowElements()}
	 * <!-- end-user-doc -->
	 * @return     virtual opposite of {@link ConversationLink#getSourceRef()}.
	 *
	 * @throws     UnsupportedOperationException  DOCUMENT ME!
	 *
	 * @generated  NOT
	 */
	@Override public List<ConversationLink> getOutgoingConversationLinks()
	{
		if( eResource() instanceof Bpmn2Resource )
		{
			return ((Bpmn2Resource) eResource()).getOppositeReferenceAdapter().getOppositeList( ConversationLink.class, this, Bpmn2Package.Literals.CONVERSATION_LINK__SOURCE_REF );
		}

		throw new UnsupportedOperationException();
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
			participantRefs = new EObjectResolvingEList<Participant>( Participant.class, this, Bpmn2Package.CONVERSATION_NODE__PARTICIPANT_REFS );
		}

		return participantRefs;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CONVERSATION_NODE__NAME, oldName, name ));
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
		return Bpmn2Package.Literals.CONVERSATION_NODE;
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
	 * The cached value of the '{@link #getMessageFlowRefs() <em>Message Flow Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessageFlowRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<MessageFlow> messageFlowRefs;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected static final String NAME_EDEFAULT = null;
} //ConversationNodeImpl
