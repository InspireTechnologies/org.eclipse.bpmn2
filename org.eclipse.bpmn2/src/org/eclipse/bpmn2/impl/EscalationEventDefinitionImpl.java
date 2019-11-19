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
import org.eclipse.bpmn2.Escalation;
import org.eclipse.bpmn2.EscalationEventDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escalation Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.EscalationEventDefinitionImpl#getEscalationRef <em>Escalation Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class EscalationEventDefinitionImpl
	extends EventDefinitionImpl
	implements EscalationEventDefinition
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscalationEventDefinitionImpl()
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
	public Escalation basicGetEscalationRef()
	{
		return escalationRef;
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
			case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF :
			{
				if( resolve )
				{
					return getEscalationRef();
				}

				return basicGetEscalationRef();
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
			case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF :
			{
				return escalationRef != null;
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
			case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF :
			{
				setEscalationRef((Escalation) newValue );

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
			case Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF :
			{
				setEscalationRef((Escalation) null );

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
	@Override public Escalation getEscalationRef()
	{
		if(( escalationRef != null ) && escalationRef.eIsProxy())
		{
			final InternalEObject oldEscalationRef = (InternalEObject) escalationRef;
			escalationRef = (Escalation) eResolveProxy( oldEscalationRef );

			if( escalationRef != oldEscalationRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF, oldEscalationRef, escalationRef ));
				}
			}
		}

		return escalationRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newEscalationRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setEscalationRef( final Escalation newEscalationRef )
	{
		final Escalation oldEscalationRef = escalationRef;
		escalationRef = newEscalationRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ESCALATION_EVENT_DEFINITION__ESCALATION_REF, oldEscalationRef, escalationRef ));
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
		return Bpmn2Package.Literals.ESCALATION_EVENT_DEFINITION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getEscalationRef() <em>Escalation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getEscalationRef()
	 * @generated
	 * @orderd
	 */
	protected Escalation escalationRef;
} //EscalationEventDefinitionImpl
