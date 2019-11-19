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
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.CorrelationPropertyBinding;
import org.eclipse.bpmn2.CorrelationSubscription;

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
 * An implementation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CorrelationSubscriptionImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CorrelationSubscriptionImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class CorrelationSubscriptionImpl
	extends BaseElementImpl
	implements CorrelationSubscription
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationSubscriptionImpl()
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
	public CorrelationKey basicGetCorrelationKeyRef()
	{
		return correlationKeyRef;
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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING :
			{
				return getCorrelationPropertyBinding();
			}

			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF :
			{
				if( resolve )
				{
					return getCorrelationKeyRef();
				}

				return basicGetCorrelationKeyRef();
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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING :
			{
				return ((InternalEList<?>) getCorrelationPropertyBinding()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING :
			{
				return ( correlationPropertyBinding != null ) && ! correlationPropertyBinding.isEmpty();
			}

			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF :
			{
				return correlationKeyRef != null;
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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING :
			{
				getCorrelationPropertyBinding().clear();
				getCorrelationPropertyBinding().addAll((Collection<? extends CorrelationPropertyBinding>) newValue );

				return;
			}

			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF :
			{
				setCorrelationKeyRef((CorrelationKey) newValue );

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
			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING :
			{
				getCorrelationPropertyBinding().clear();

				return;
			}

			case Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF :
			{
				setCorrelationKeyRef((CorrelationKey) null );

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
	@Override public CorrelationKey getCorrelationKeyRef()
	{
		if(( correlationKeyRef != null ) && correlationKeyRef.eIsProxy())
		{
			final InternalEObject oldCorrelationKeyRef = (InternalEObject) correlationKeyRef;
			correlationKeyRef = (CorrelationKey) eResolveProxy( oldCorrelationKeyRef );

			if( correlationKeyRef != oldCorrelationKeyRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef ));
				}
			}
		}

		return correlationKeyRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<CorrelationPropertyBinding> getCorrelationPropertyBinding()
	{
		if( correlationPropertyBinding == null )
		{
			correlationPropertyBinding = new EObjectContainmentEList<CorrelationPropertyBinding>( CorrelationPropertyBinding.class, this, Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING );
		}

		return correlationPropertyBinding;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newCorrelationKeyRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setCorrelationKeyRef( final CorrelationKey newCorrelationKeyRef )
	{
		final CorrelationKey oldCorrelationKeyRef = correlationKeyRef;
		correlationKeyRef = newCorrelationKeyRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF, oldCorrelationKeyRef, correlationKeyRef ));
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
		return Bpmn2Package.Literals.CORRELATION_SUBSCRIPTION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getCorrelationKeyRef() <em>Correlation Key Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCorrelationKeyRef()
	 * @generated
	 * @orderd
	 */
	protected CorrelationKey correlationKeyRef;

	/**
	 * The cached value of the '{@link #getCorrelationPropertyBinding() <em>Correlation Property Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCorrelationPropertyBinding()
	 * @generated
	 * @orderd
	 */
	protected EList<CorrelationPropertyBinding> correlationPropertyBinding;
} //CorrelationSubscriptionImpl
