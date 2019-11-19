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
import org.eclipse.bpmn2.Event;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.util.Bpmn2Resource;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.EventImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.EventImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.EventImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class EventImpl
	extends FlowNodeImpl
	implements Event
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl()
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
				case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
				}

				case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS :
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
					return Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS;
				}

				case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS :
				{
					return Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS;
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
			case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS :
			{
				return getIncomingConversationLinks();
			}

			case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS :
			{
				return getOutgoingConversationLinks();
			}

			case Bpmn2Package.EVENT__PROPERTIES :
			{
				return getProperties();
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
			case Bpmn2Package.EVENT__PROPERTIES :
			{
				return ((InternalEList<?>) getProperties()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.EVENT__INCOMING_CONVERSATION_LINKS :
			{
				return ! getIncomingConversationLinks().isEmpty();
			}

			case Bpmn2Package.EVENT__OUTGOING_CONVERSATION_LINKS :
			{
				return ! getOutgoingConversationLinks().isEmpty();
			}

			case Bpmn2Package.EVENT__PROPERTIES :
			{
				return ( properties != null ) && ! properties.isEmpty();
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
			case Bpmn2Package.EVENT__PROPERTIES :
			{
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>) newValue );

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
			case Bpmn2Package.EVENT__PROPERTIES :
			{
				getProperties().clear();

				return;
			}
		}

		super.eUnset( featureID );
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
	@Override public List<Property> getProperties()
	{
		if( properties == null )
		{
			properties = new EObjectContainmentEList<Property>( Property.class, this, Bpmn2Package.EVENT__PROPERTIES );
		}

		return properties;
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
		return Bpmn2Package.Literals.EVENT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getProperties()
	 * @generated
	 * @orderd
	 */
	protected EList<Property> properties;
} //EventImpl
