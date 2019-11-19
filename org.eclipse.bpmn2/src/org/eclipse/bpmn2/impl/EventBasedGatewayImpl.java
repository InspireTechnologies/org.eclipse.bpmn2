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
import org.eclipse.bpmn2.EventBasedGateway;
import org.eclipse.bpmn2.EventBasedGatewayType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.EventBasedGatewayImpl#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.EventBasedGatewayImpl#isInstantiate <em>Instantiate</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class EventBasedGatewayImpl
	extends GatewayImpl
	implements EventBasedGateway
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBasedGatewayImpl()
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
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE :
			{
				return getEventGatewayType();
			}

			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE :
			{
				return isInstantiate();
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
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE :
			{
				return eventGatewayType != EVENT_GATEWAY_TYPE_EDEFAULT;
			}

			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE :
			{
				return instantiate != INSTANTIATE_EDEFAULT;
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
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE :
			{
				setEventGatewayType((EventBasedGatewayType) newValue );

				return;
			}

			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE :
			{
				setInstantiate((Boolean) newValue );

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
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE :
			{
				setEventGatewayType( EVENT_GATEWAY_TYPE_EDEFAULT );

				return;
			}

			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE :
			{
				setInstantiate( INSTANTIATE_EDEFAULT );

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
	@Override public EventBasedGatewayType getEventGatewayType()
	{
		return eventGatewayType;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isInstantiate()
	{
		return instantiate;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newEventGatewayType  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setEventGatewayType( final EventBasedGatewayType newEventGatewayType )
	{
		final EventBasedGatewayType oldEventGatewayType = eventGatewayType;
		eventGatewayType = ( newEventGatewayType == null ) ? EVENT_GATEWAY_TYPE_EDEFAULT : newEventGatewayType;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE, oldEventGatewayType, eventGatewayType ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newInstantiate  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setInstantiate( final boolean newInstantiate )
	{
		final boolean oldInstantiate = instantiate;
		instantiate = newInstantiate;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE, oldInstantiate, instantiate ));
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
		result.append( " (eventGatewayType: " );
		result.append( eventGatewayType );
		result.append( ", instantiate: " );
		result.append( instantiate );
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
		return Bpmn2Package.Literals.EVENT_BASED_GATEWAY;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getEventGatewayType()
	 * @generated
	 * @orderd
	 */
	protected EventBasedGatewayType eventGatewayType = EVENT_GATEWAY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isInstantiate()
	 * @generated
	 * @orderd
	 */
	protected boolean instantiate = INSTANTIATE_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getEventGatewayType()
	 * @generated
	 * @orderd
	 */
	protected static final EventBasedGatewayType EVENT_GATEWAY_TYPE_EDEFAULT = EventBasedGatewayType.EXCLUSIVE;

	/**
	 * The default value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isInstantiate()
	 * @generated
	 * @orderd
	 */
	protected static final boolean INSTANTIATE_EDEFAULT = false;
} //EventBasedGatewayImpl
