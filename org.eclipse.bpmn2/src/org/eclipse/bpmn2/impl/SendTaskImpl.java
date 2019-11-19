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
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.Operation;
import org.eclipse.bpmn2.SendTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.SendTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.SendTaskImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.SendTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class SendTaskImpl
	extends TaskImpl
	implements SendTask
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendTaskImpl()
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
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public Operation basicGetOperationRef()
	{
		return operationRef;
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
			case Bpmn2Package.SEND_TASK__IMPLEMENTATION :
			{
				return getImplementation();
			}

			case Bpmn2Package.SEND_TASK__MESSAGE_REF :
			{
				if( resolve )
				{
					return getMessageRef();
				}

				return basicGetMessageRef();
			}

			case Bpmn2Package.SEND_TASK__OPERATION_REF :
			{
				if( resolve )
				{
					return getOperationRef();
				}

				return basicGetOperationRef();
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
			case Bpmn2Package.SEND_TASK__IMPLEMENTATION :
			{
				return ( IMPLEMENTATION_EDEFAULT == null ) ? ( implementation != null ) : ( ! IMPLEMENTATION_EDEFAULT.equals( implementation ));
			}

			case Bpmn2Package.SEND_TASK__MESSAGE_REF :
			{
				return messageRef != null;
			}

			case Bpmn2Package.SEND_TASK__OPERATION_REF :
			{
				return operationRef != null;
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
			case Bpmn2Package.SEND_TASK__IMPLEMENTATION :
			{
				setImplementation((String) newValue );

				return;
			}

			case Bpmn2Package.SEND_TASK__MESSAGE_REF :
			{
				setMessageRef((Message) newValue );

				return;
			}

			case Bpmn2Package.SEND_TASK__OPERATION_REF :
			{
				setOperationRef((Operation) newValue );

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
			case Bpmn2Package.SEND_TASK__IMPLEMENTATION :
			{
				setImplementation( IMPLEMENTATION_EDEFAULT );

				return;
			}

			case Bpmn2Package.SEND_TASK__MESSAGE_REF :
			{
				setMessageRef((Message) null );

				return;
			}

			case Bpmn2Package.SEND_TASK__OPERATION_REF :
			{
				setOperationRef((Operation) null );

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
	@Override public String getImplementation()
	{
		return implementation;
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
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.SEND_TASK__MESSAGE_REF, oldMessageRef, messageRef ));
				}
			}
		}

		return messageRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Operation getOperationRef()
	{
		if(( operationRef != null ) && operationRef.eIsProxy())
		{
			final InternalEObject oldOperationRef = (InternalEObject) operationRef;
			operationRef = (Operation) eResolveProxy( oldOperationRef );

			if( operationRef != oldOperationRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.SEND_TASK__OPERATION_REF, oldOperationRef, operationRef ));
				}
			}
		}

		return operationRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newImplementation  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setImplementation( final String newImplementation )
	{
		final String oldImplementation = implementation;
		implementation = newImplementation;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.SEND_TASK__IMPLEMENTATION, oldImplementation, implementation ));
		}
	}

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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.SEND_TASK__MESSAGE_REF, oldMessageRef, messageRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newOperationRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setOperationRef( final Operation newOperationRef )
	{
		final Operation oldOperationRef = operationRef;
		operationRef = newOperationRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.SEND_TASK__OPERATION_REF, oldOperationRef, operationRef ));
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
		result.append( " (implementation: " );
		result.append( implementation );
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
		return Bpmn2Package.Literals.SEND_TASK;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getImplementation()
	 * @generated
	 * @orderd
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessageRef()
	 * @generated
	 * @orderd
	 */
	protected Message messageRef;

	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOperationRef()
	 * @generated
	 * @orderd
	 */
	protected Operation operationRef;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getImplementation()
	 * @generated
	 * @orderd
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;
} //SendTaskImpl
