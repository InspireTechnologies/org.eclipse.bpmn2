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
import org.eclipse.bpmn2.Rendering;
import org.eclipse.bpmn2.UserTask;

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
 * An implementation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.UserTaskImpl#getRenderings <em>Renderings</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.UserTaskImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class UserTaskImpl
	extends TaskImpl
	implements UserTask
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTaskImpl()
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
			case Bpmn2Package.USER_TASK__RENDERINGS :
			{
				return getRenderings();
			}

			case Bpmn2Package.USER_TASK__IMPLEMENTATION :
			{
				return getImplementation();
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
			case Bpmn2Package.USER_TASK__RENDERINGS :
			{
				return ((InternalEList<?>) getRenderings()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.USER_TASK__RENDERINGS :
			{
				return ( renderings != null ) && ! renderings.isEmpty();
			}

			case Bpmn2Package.USER_TASK__IMPLEMENTATION :
			{
				return ( IMPLEMENTATION_EDEFAULT == null ) ? ( implementation != null ) : ( ! IMPLEMENTATION_EDEFAULT.equals( implementation ));
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
			case Bpmn2Package.USER_TASK__RENDERINGS :
			{
				getRenderings().clear();
				getRenderings().addAll((Collection<? extends Rendering>) newValue );

				return;
			}

			case Bpmn2Package.USER_TASK__IMPLEMENTATION :
			{
				setImplementation((String) newValue );

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
			case Bpmn2Package.USER_TASK__RENDERINGS :
			{
				getRenderings().clear();

				return;
			}

			case Bpmn2Package.USER_TASK__IMPLEMENTATION :
			{
				setImplementation( IMPLEMENTATION_EDEFAULT );

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
	@Override public List<Rendering> getRenderings()
	{
		if( renderings == null )
		{
			renderings = new EObjectContainmentEList<Rendering>( Rendering.class, this, Bpmn2Package.USER_TASK__RENDERINGS );
		}

		return renderings;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.USER_TASK__IMPLEMENTATION, oldImplementation, implementation ));
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
		return Bpmn2Package.Literals.USER_TASK;
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
	 * The cached value of the '{@link #getRenderings() <em>Renderings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getRenderings()
	 * @generated
	 * @orderd
	 */
	protected EList<Rendering> renderings;

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
} //UserTaskImpl
