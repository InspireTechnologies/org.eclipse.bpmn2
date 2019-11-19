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
import org.eclipse.bpmn2.ComplexGateway;
import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.SequenceFlow;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ComplexGatewayImpl#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ComplexGatewayImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ComplexGatewayImpl
	extends GatewayImpl
	implements ComplexGateway
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexGatewayImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newActivationCondition  DOCUMENT ME!
	 * @param      msgs                    DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetActivationCondition( final Expression newActivationCondition, NotificationChain msgs )
	{
		final Expression oldActivationCondition = activationCondition;
		activationCondition = newActivationCondition;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, oldActivationCondition, newActivationCondition );

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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION :
			{
				return getActivationCondition();
			}

			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT :
			{
				return getDefault();
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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION :
			{
				return basicSetActivationCondition( null, msgs );
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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION :
			{
				return activationCondition != null;
			}

			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT :
			{
				return default_ != null;
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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION :
			{
				setActivationCondition((Expression) newValue );

				return;
			}

			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT :
			{
				setDefault((SequenceFlow) newValue );

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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION :
			{
				setActivationCondition((Expression) null );

				return;
			}

			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT :
			{
				setDefault((SequenceFlow) null );

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
	@Override public Expression getActivationCondition()
	{
		return activationCondition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public SequenceFlow getDefault()
	{
		return default_;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newActivationCondition  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setActivationCondition( final Expression newActivationCondition )
	{
		if( newActivationCondition != activationCondition )
		{
			NotificationChain msgs = null;

			if( activationCondition != null )
			{
				msgs = ((InternalEObject) activationCondition ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, null, msgs );
			}

			if( newActivationCondition != null )
			{
				msgs = ((InternalEObject) newActivationCondition ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, null, msgs );
			}

			msgs = basicSetActivationCondition( newActivationCondition, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, newActivationCondition, newActivationCondition ));
		}
	} // end method setActivationCondition

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDefault  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setDefault( final SequenceFlow newDefault )
	{
		final SequenceFlow oldDefault = default_;
		default_ = newDefault;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.COMPLEX_GATEWAY__DEFAULT, oldDefault, default_ ));
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
		return Bpmn2Package.Literals.COMPLEX_GATEWAY;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getActivationCondition() <em>Activation Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getActivationCondition()
	 * @generated
	 * @orderd
	 */
	protected Expression activationCondition;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDefault()
	 * @generated
	 * @orderd
	 */
	protected SequenceFlow default_;
} //ComplexGatewayImpl
