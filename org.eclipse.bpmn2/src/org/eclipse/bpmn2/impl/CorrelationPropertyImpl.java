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
import org.eclipse.bpmn2.CorrelationProperty;
import org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression;
import org.eclipse.bpmn2.ItemDefinition;

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
 * An implementation of the model object '<em><b>Correlation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CorrelationPropertyImpl#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CorrelationPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CorrelationPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class CorrelationPropertyImpl
	extends RootElementImpl
	implements CorrelationProperty
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyImpl()
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
	public ItemDefinition basicGetType()
	{
		return type;
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
			case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION :
			{
				return getCorrelationPropertyRetrievalExpression();
			}

			case Bpmn2Package.CORRELATION_PROPERTY__NAME :
			{
				return getName();
			}

			case Bpmn2Package.CORRELATION_PROPERTY__TYPE :
			{
				if( resolve )
				{
					return getType();
				}

				return basicGetType();
			}
		}

		return super.eGet( featureID, resolve, coreType );
	} // end method eGet

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
			case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION :
			{
				return ((InternalEList<?>) getCorrelationPropertyRetrievalExpression()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION :
			{
				return ( correlationPropertyRetrievalExpression != null ) && ! correlationPropertyRetrievalExpression.isEmpty();
			}

			case Bpmn2Package.CORRELATION_PROPERTY__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
			}

			case Bpmn2Package.CORRELATION_PROPERTY__TYPE :
			{
				return type != null;
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
			case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION :
			{
				getCorrelationPropertyRetrievalExpression().clear();
				getCorrelationPropertyRetrievalExpression().addAll((Collection<? extends CorrelationPropertyRetrievalExpression>) newValue );

				return;
			}

			case Bpmn2Package.CORRELATION_PROPERTY__NAME :
			{
				setName((String) newValue );

				return;
			}

			case Bpmn2Package.CORRELATION_PROPERTY__TYPE :
			{
				setType((ItemDefinition) newValue );

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
			case Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION :
			{
				getCorrelationPropertyRetrievalExpression().clear();

				return;
			}

			case Bpmn2Package.CORRELATION_PROPERTY__NAME :
			{
				setName( NAME_EDEFAULT );

				return;
			}

			case Bpmn2Package.CORRELATION_PROPERTY__TYPE :
			{
				setType((ItemDefinition) null );

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
	@Override public List<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression()
	{
		if( correlationPropertyRetrievalExpression == null )
		{
			correlationPropertyRetrievalExpression = new EObjectContainmentEList<CorrelationPropertyRetrievalExpression>( CorrelationPropertyRetrievalExpression.class, this, Bpmn2Package.CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION );
		}

		return correlationPropertyRetrievalExpression;
	}

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
	@Override public ItemDefinition getType()
	{
		if(( type != null ) && type.eIsProxy())
		{
			final InternalEObject oldType = (InternalEObject) type;
			type = (ItemDefinition) eResolveProxy( oldType );

			if( type != oldType )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.CORRELATION_PROPERTY__TYPE, oldType, type ));
				}
			}
		}

		return type;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CORRELATION_PROPERTY__NAME, oldName, name ));
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
	@Override public void setType( final ItemDefinition newType )
	{
		final ItemDefinition oldType = type;
		type = newType;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CORRELATION_PROPERTY__TYPE, oldType, type ));
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
		return Bpmn2Package.Literals.CORRELATION_PROPERTY;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getCorrelationPropertyRetrievalExpression() <em>Correlation Property Retrieval Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCorrelationPropertyRetrievalExpression()
	 * @generated
	 * @orderd
	 */
	protected EList<CorrelationPropertyRetrievalExpression> correlationPropertyRetrievalExpression;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getType()
	 * @generated
	 * @orderd
	 */
	protected ItemDefinition type;

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
} //CorrelationPropertyImpl
