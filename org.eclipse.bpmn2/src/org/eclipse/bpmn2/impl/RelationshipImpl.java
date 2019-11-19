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
import org.eclipse.bpmn2.Relationship;
import org.eclipse.bpmn2.RelationshipDirection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.RelationshipImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.RelationshipImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.RelationshipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.RelationshipImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class RelationshipImpl
	extends BaseElementImpl
	implements Relationship
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl()
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
			case Bpmn2Package.RELATIONSHIP__SOURCES :
			{
				return getSources();
			}

			case Bpmn2Package.RELATIONSHIP__TARGETS :
			{
				return getTargets();
			}

			case Bpmn2Package.RELATIONSHIP__DIRECTION :
			{
				return getDirection();
			}

			case Bpmn2Package.RELATIONSHIP__TYPE :
			{
				return getType();
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
			case Bpmn2Package.RELATIONSHIP__SOURCES :
			{
				return ( sources != null ) && ! sources.isEmpty();
			}

			case Bpmn2Package.RELATIONSHIP__TARGETS :
			{
				return ( targets != null ) && ! targets.isEmpty();
			}

			case Bpmn2Package.RELATIONSHIP__DIRECTION :
			{
				return direction != DIRECTION_EDEFAULT;
			}

			case Bpmn2Package.RELATIONSHIP__TYPE :
			{
				return ( TYPE_EDEFAULT == null ) ? ( type != null ) : ( ! TYPE_EDEFAULT.equals( type ));
			}
		}

		return super.eIsSet( featureID );
	} // end method eIsSet

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
			case Bpmn2Package.RELATIONSHIP__SOURCES :
			{
				getSources().clear();
				getSources().addAll((Collection<? extends EObject>) newValue );

				return;
			}

			case Bpmn2Package.RELATIONSHIP__TARGETS :
			{
				getTargets().clear();
				getTargets().addAll((Collection<? extends EObject>) newValue );

				return;
			}

			case Bpmn2Package.RELATIONSHIP__DIRECTION :
			{
				setDirection((RelationshipDirection) newValue );

				return;
			}

			case Bpmn2Package.RELATIONSHIP__TYPE :
			{
				setType((String) newValue );

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
			case Bpmn2Package.RELATIONSHIP__SOURCES :
			{
				getSources().clear();

				return;
			}

			case Bpmn2Package.RELATIONSHIP__TARGETS :
			{
				getTargets().clear();

				return;
			}

			case Bpmn2Package.RELATIONSHIP__DIRECTION :
			{
				setDirection( DIRECTION_EDEFAULT );

				return;
			}

			case Bpmn2Package.RELATIONSHIP__TYPE :
			{
				setType( TYPE_EDEFAULT );

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
	@Override public RelationshipDirection getDirection()
	{
		return direction;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<EObject> getSources()
	{
		if( sources == null )
		{
			sources = new EObjectResolvingEList<EObject>( EObject.class, this, Bpmn2Package.RELATIONSHIP__SOURCES );
		}

		return sources;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<EObject> getTargets()
	{
		if( targets == null )
		{
			targets = new EObjectResolvingEList<EObject>( EObject.class, this, Bpmn2Package.RELATIONSHIP__TARGETS );
		}

		return targets;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getType()
	{
		return type;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDirection  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setDirection( final RelationshipDirection newDirection )
	{
		final RelationshipDirection oldDirection = direction;
		direction = ( newDirection == null ) ? DIRECTION_EDEFAULT : newDirection;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.RELATIONSHIP__DIRECTION, oldDirection, direction ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newType  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setType( final String newType )
	{
		final String oldType = type;
		type = newType;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.RELATIONSHIP__TYPE, oldType, type ));
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
		result.append( " (direction: " );
		result.append( direction );
		result.append( ", type: " );
		result.append( type );
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
		return Bpmn2Package.Literals.RELATIONSHIP;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDirection()
	 * @generated
	 * @orderd
	 */
	protected RelationshipDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSources()
	 * @generated
	 * @orderd
	 */
	protected EList<EObject> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTargets()
	 * @generated
	 * @orderd
	 */
	protected EList<EObject> targets;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getType()
	 * @generated
	 * @orderd
	 */
	protected String type = TYPE_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDirection()
	 * @generated
	 * @orderd
	 */
	protected static final RelationshipDirection DIRECTION_EDEFAULT = RelationshipDirection.NONE;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getType()
	 * @generated
	 * @orderd
	 */
	protected static final String TYPE_EDEFAULT = null;
} //RelationshipImpl
