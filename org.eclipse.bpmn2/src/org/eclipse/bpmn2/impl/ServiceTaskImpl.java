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
import org.eclipse.bpmn2.Operation;
import org.eclipse.bpmn2.ServiceTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ServiceTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ServiceTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ServiceTaskImpl
	extends TaskImpl
	implements ServiceTask
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTaskImpl()
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
			case Bpmn2Package.SERVICE_TASK__IMPLEMENTATION :
			{
				return getImplementation();
			}

			case Bpmn2Package.SERVICE_TASK__OPERATION_REF :
			{
				if( resolve )
				{
					return getOperationRef();
				}

				return basicGetOperationRef();
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
			case Bpmn2Package.SERVICE_TASK__IMPLEMENTATION :
			{
				return ( IMPLEMENTATION_EDEFAULT == null ) ? ( implementation != null ) : ( ! IMPLEMENTATION_EDEFAULT.equals( implementation ));
			}

			case Bpmn2Package.SERVICE_TASK__OPERATION_REF :
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
			case Bpmn2Package.SERVICE_TASK__IMPLEMENTATION :
			{
				setImplementation((String) newValue );

				return;
			}

			case Bpmn2Package.SERVICE_TASK__OPERATION_REF :
			{
				setOperationRef((Operation) newValue );

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
			case Bpmn2Package.SERVICE_TASK__IMPLEMENTATION :
			{
				setImplementation( IMPLEMENTATION_EDEFAULT );

				return;
			}

			case Bpmn2Package.SERVICE_TASK__OPERATION_REF :
			{
				setOperationRef((Operation) null );

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
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.SERVICE_TASK__OPERATION_REF, oldOperationRef, operationRef ));
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.SERVICE_TASK__IMPLEMENTATION, oldImplementation, implementation ));
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.SERVICE_TASK__OPERATION_REF, oldOperationRef, operationRef ));
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
		return Bpmn2Package.Literals.SERVICE_TASK;
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
} //ServiceTaskImpl
