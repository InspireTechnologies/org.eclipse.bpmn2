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
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.FlowElementsContainer;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.LaneSet;
import org.eclipse.bpmn2.SubProcess;
import org.eclipse.bpmn2.util.Bpmn2Resource;

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
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.SubProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.SubProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.SubProcessImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.SubProcessImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.SubProcessImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.SubProcessImpl#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class SubProcessImpl
	extends ActivityImpl
	implements SubProcess
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl()
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
		if( baseClass == FlowElementsContainer.class )
		{
			switch( derivedFeatureID )
			{
				case Bpmn2Package.SUB_PROCESS__LANE_SETS :
				{
					return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
				}

				case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS :
				{
					return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
				}

				default :
				{
					return -1;
				}
			}
		}

		if( baseClass == InteractionNode.class )
		{
			switch( derivedFeatureID )
			{
				case Bpmn2Package.SUB_PROCESS__INCOMING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
				}

				case Bpmn2Package.SUB_PROCESS__OUTGOING_CONVERSATION_LINKS :
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
	} // end method eBaseStructuralFeatureID

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
		if( baseClass == FlowElementsContainer.class )
		{
			switch( baseFeatureID )
			{
				case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS :
				{
					return Bpmn2Package.SUB_PROCESS__LANE_SETS;
				}

				case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS :
				{
					return Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS;
				}

				default :
				{
					return -1;
				}
			}
		}

		if( baseClass == InteractionNode.class )
		{
			switch( baseFeatureID )
			{
				case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.SUB_PROCESS__INCOMING_CONVERSATION_LINKS;
				}

				case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.SUB_PROCESS__OUTGOING_CONVERSATION_LINKS;
				}

				default :
				{
					return -1;
				}
			}
		}

		return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
	} // end method eDerivedStructuralFeatureID

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
			case Bpmn2Package.SUB_PROCESS__LANE_SETS :
			{
				return getLaneSets();
			}

			case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS :
			{
				return getFlowElements();
			}

			case Bpmn2Package.SUB_PROCESS__INCOMING_CONVERSATION_LINKS :
			{
				return getIncomingConversationLinks();
			}

			case Bpmn2Package.SUB_PROCESS__OUTGOING_CONVERSATION_LINKS :
			{
				return getOutgoingConversationLinks();
			}

			case Bpmn2Package.SUB_PROCESS__ARTIFACTS :
			{
				return getArtifacts();
			}

			case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT :
			{
				return isTriggeredByEvent();
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
			case Bpmn2Package.SUB_PROCESS__LANE_SETS :
			{
				return ((InternalEList<?>) getLaneSets()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS :
			{
				return ((InternalEList<?>) getFlowElements()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.SUB_PROCESS__ARTIFACTS :
			{
				return ((InternalEList<?>) getArtifacts()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.SUB_PROCESS__LANE_SETS :
			{
				return ( laneSets != null ) && ! laneSets.isEmpty();
			}

			case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS :
			{
				return ( flowElements != null ) && ! flowElements.isEmpty();
			}

			case Bpmn2Package.SUB_PROCESS__INCOMING_CONVERSATION_LINKS :
			{
				return ! getIncomingConversationLinks().isEmpty();
			}

			case Bpmn2Package.SUB_PROCESS__OUTGOING_CONVERSATION_LINKS :
			{
				return ! getOutgoingConversationLinks().isEmpty();
			}

			case Bpmn2Package.SUB_PROCESS__ARTIFACTS :
			{
				return ( artifacts != null ) && ! artifacts.isEmpty();
			}

			case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT :
			{
				return triggeredByEvent != TRIGGERED_BY_EVENT_EDEFAULT;
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
			case Bpmn2Package.SUB_PROCESS__LANE_SETS :
			{
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>) newValue );

				return;
			}

			case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS :
			{
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>) newValue );

				return;
			}

			case Bpmn2Package.SUB_PROCESS__ARTIFACTS :
			{
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>) newValue );

				return;
			}

			case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT :
			{
				setTriggeredByEvent((Boolean) newValue );

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
			case Bpmn2Package.SUB_PROCESS__LANE_SETS :
			{
				getLaneSets().clear();

				return;
			}

			case Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS :
			{
				getFlowElements().clear();

				return;
			}

			case Bpmn2Package.SUB_PROCESS__ARTIFACTS :
			{
				getArtifacts().clear();

				return;
			}

			case Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT :
			{
				setTriggeredByEvent( TRIGGERED_BY_EVENT_EDEFAULT );

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
			artifacts = new EObjectContainmentEList<Artifact>( Artifact.class, this, Bpmn2Package.SUB_PROCESS__ARTIFACTS );
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
	@Override public List<FlowElement> getFlowElements()
	{
		if( flowElements == null )
		{
			flowElements = new EObjectContainmentEList<FlowElement>( FlowElement.class, this, Bpmn2Package.SUB_PROCESS__FLOW_ELEMENTS );
		}

		return flowElements;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
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
	@Override public List<LaneSet> getLaneSets()
	{
		if( laneSets == null )
		{
			laneSets = new EObjectContainmentEList<LaneSet>( LaneSet.class, this, Bpmn2Package.SUB_PROCESS__LANE_SETS );
		}

		return laneSets;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
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
	@Override public boolean isTriggeredByEvent()
	{
		return triggeredByEvent;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTriggeredByEvent  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTriggeredByEvent( final boolean newTriggeredByEvent )
	{
		final boolean oldTriggeredByEvent = triggeredByEvent;
		triggeredByEvent = newTriggeredByEvent;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.SUB_PROCESS__TRIGGERED_BY_EVENT, oldTriggeredByEvent, triggeredByEvent ));
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
		result.append( " (triggeredByEvent: " );
		result.append( triggeredByEvent );
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
		return Bpmn2Package.Literals.SUB_PROCESS;
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
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getFlowElements()
	 * @generated
	 * @orderd
	 */
	protected EList<FlowElement> flowElements;

	/**
	 * The cached value of the '{@link #getLaneSets() <em>Lane Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLaneSets()
	 * @generated
	 * @orderd
	 */
	protected EList<LaneSet> laneSets;

	/**
	 * The cached value of the '{@link #isTriggeredByEvent() <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isTriggeredByEvent()
	 * @generated
	 * @orderd
	 */
	protected boolean triggeredByEvent = TRIGGERED_BY_EVENT_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #isTriggeredByEvent() <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isTriggeredByEvent()
	 * @generated
	 * @orderd
	 */
	protected static final boolean TRIGGERED_BY_EVENT_EDEFAULT = false;
} //SubProcessImpl
