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
import org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.Message;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class CorrelationPropertyRetrievalExpressionImpl
	extends BaseElementImpl
	implements CorrelationPropertyRetrievalExpression
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyRetrievalExpressionImpl()
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
	public Message basicGetMessageRef()
	{
		return messageRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newMessagePath  DOCUMENT ME!
	 * @param      msgs            DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetMessagePath( final FormalExpression newMessagePath, NotificationChain msgs )
	{
		final FormalExpression oldMessagePath = messagePath;
		messagePath = newMessagePath;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, oldMessagePath, newMessagePath );

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
			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH :
			{
				return getMessagePath();
			}

			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF :
			{
				if( resolve )
				{
					return getMessageRef();
				}

				return basicGetMessageRef();
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
			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH :
			{
				return basicSetMessagePath( null, msgs );
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
			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH :
			{
				return messagePath != null;
			}

			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF :
			{
				return messageRef != null;
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
			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH :
			{
				setMessagePath((FormalExpression) newValue );

				return;
			}

			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF :
			{
				setMessageRef((Message) newValue );

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
			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH :
			{
				setMessagePath((FormalExpression) null );

				return;
			}

			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF :
			{
				setMessageRef((Message) null );

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
	@Override public FormalExpression getMessagePath()
	{
		return messagePath;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Message getMessageRef()
	{
		if(( messageRef != null ) && messageRef.eIsProxy())
		{
			final InternalEObject oldMessageRef = (InternalEObject) messageRef;
			messageRef = (Message) eResolveProxy( oldMessageRef );

			if( messageRef != oldMessageRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, oldMessageRef, messageRef ));
				}
			}
		}

		return messageRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newMessagePath  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setMessagePath( final FormalExpression newMessagePath )
	{
		if( newMessagePath != messagePath )
		{
			NotificationChain msgs = null;

			if( messagePath != null )
			{
				msgs = ((InternalEObject) messagePath ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs );
			}

			if( newMessagePath != null )
			{
				msgs = ((InternalEObject) newMessagePath ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, null, msgs );
			}

			msgs = basicSetMessagePath( newMessagePath, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH, newMessagePath, newMessagePath ));
		}
	} // end method setMessagePath

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newMessageRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setMessageRef( final Message newMessageRef )
	{
		final Message oldMessageRef = messageRef;
		messageRef = newMessageRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF, oldMessageRef, messageRef ));
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
		return Bpmn2Package.Literals.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getMessagePath() <em>Message Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessagePath()
	 * @generated
	 * @orderd
	 */
	protected FormalExpression messagePath;

	/**
	 * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessageRef()
	 * @generated
	 * @orderd
	 */
	protected Message messageRef;
} //CorrelationPropertyRetrievalExpressionImpl
