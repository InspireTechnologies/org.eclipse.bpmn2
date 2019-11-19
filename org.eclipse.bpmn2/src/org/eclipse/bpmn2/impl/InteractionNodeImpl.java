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
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.util.Bpmn2Resource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.InteractionNodeImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.InteractionNodeImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class InteractionNodeImpl
	extends EObjectImpl
	implements InteractionNode
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionNodeImpl()
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
			case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS :
			{
				return getIncomingConversationLinks();
			}

			case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS :
			{
				return getOutgoingConversationLinks();
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
			case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS :
			{
				return ! getIncomingConversationLinks().isEmpty();
			}

			case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS :
			{
				return ! getOutgoingConversationLinks().isEmpty();
			}
		}

		return super.eIsSet( featureID );
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
	@Override protected EClass eStaticClass()
	{
		return Bpmn2Package.Literals.INTERACTION_NODE;
	}
} //InteractionNodeImpl
