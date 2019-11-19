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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationLinkImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ConversationLinkImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ConversationLinkImpl
	extends BaseElementImpl
	implements ConversationLink
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationLinkImpl()
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
	public InteractionNode basicGetSourceRef()
	{
		return sourceRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public InteractionNode basicGetTargetRef()
	{
		return targetRef;
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
			case Bpmn2Package.CONVERSATION_LINK__NAME :
			{
				return getName();
			}

			case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF :
			{
				if( resolve )
				{
					return getSourceRef();
				}

				return basicGetSourceRef();
			}

			case Bpmn2Package.CONVERSATION_LINK__TARGET_REF :
			{
				if( resolve )
				{
					return getTargetRef();
				}

				return basicGetTargetRef();
			}
		}

		return super.eGet( featureID, resolve, coreType );
	} // end method eGet

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
			case Bpmn2Package.CONVERSATION_LINK__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
			}

			case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF :
			{
				return sourceRef != null;
			}

			case Bpmn2Package.CONVERSATION_LINK__TARGET_REF :
			{
				return targetRef != null;
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
			case Bpmn2Package.CONVERSATION_LINK__NAME :
			{
				setName((String) newValue );

				return;
			}

			case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF :
			{
				setSourceRef((InteractionNode) newValue );

				return;
			}

			case Bpmn2Package.CONVERSATION_LINK__TARGET_REF :
			{
				setTargetRef((InteractionNode) newValue );

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
			case Bpmn2Package.CONVERSATION_LINK__NAME :
			{
				setName( NAME_EDEFAULT );

				return;
			}

			case Bpmn2Package.CONVERSATION_LINK__SOURCE_REF :
			{
				setSourceRef((InteractionNode) null );

				return;
			}

			case Bpmn2Package.CONVERSATION_LINK__TARGET_REF :
			{
				setTargetRef((InteractionNode) null );

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
	@Override public InteractionNode getSourceRef()
	{
		if(( sourceRef != null ) && sourceRef.eIsProxy())
		{
			final InternalEObject oldSourceRef = (InternalEObject) sourceRef;
			sourceRef = (InteractionNode) eResolveProxy( oldSourceRef );

			if( sourceRef != oldSourceRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.CONVERSATION_LINK__SOURCE_REF, oldSourceRef, sourceRef ));
				}
			}
		}

		return sourceRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public InteractionNode getTargetRef()
	{
		if(( targetRef != null ) && targetRef.eIsProxy())
		{
			final InternalEObject oldTargetRef = (InternalEObject) targetRef;
			targetRef = (InteractionNode) eResolveProxy( oldTargetRef );

			if( targetRef != oldTargetRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.CONVERSATION_LINK__TARGET_REF, oldTargetRef, targetRef ));
				}
			}
		}

		return targetRef;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CONVERSATION_LINK__NAME, oldName, name ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newSourceRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setSourceRef( final InteractionNode newSourceRef )
	{
		final InteractionNode oldSourceRef = sourceRef;
		sourceRef = newSourceRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CONVERSATION_LINK__SOURCE_REF, oldSourceRef, sourceRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTargetRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTargetRef( final InteractionNode newTargetRef )
	{
		final InteractionNode oldTargetRef = targetRef;
		targetRef = newTargetRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CONVERSATION_LINK__TARGET_REF, oldTargetRef, targetRef ));
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
		return Bpmn2Package.Literals.CONVERSATION_LINK;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

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
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSourceRef()
	 * @generated
	 * @orderd
	 */
	protected InteractionNode sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTargetRef()
	 * @generated
	 * @orderd
	 */
	protected InteractionNode targetRef;

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
} //ConversationLinkImpl
