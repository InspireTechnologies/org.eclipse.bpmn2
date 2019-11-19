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

import org.eclipse.bpmn2.Auditing;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.CategoryValue;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.Monitoring;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowElementImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowElementImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowElementImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class FlowElementImpl
	extends BaseElementImpl
	implements FlowElement
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newAuditing  DOCUMENT ME!
	 * @param      msgs         DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetAuditing( final Auditing newAuditing, NotificationChain msgs )
	{
		final Auditing oldAuditing = auditing;
		auditing = newAuditing;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.FLOW_ELEMENT__AUDITING, oldAuditing, newAuditing );

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
	 * @param      newMonitoring  DOCUMENT ME!
	 * @param      msgs           DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetMonitoring( final Monitoring newMonitoring, NotificationChain msgs )
	{
		final Monitoring oldMonitoring = monitoring;
		monitoring = newMonitoring;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.FLOW_ELEMENT__MONITORING, oldMonitoring, newMonitoring );

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
			case Bpmn2Package.FLOW_ELEMENT__AUDITING :
			{
				return getAuditing();
			}

			case Bpmn2Package.FLOW_ELEMENT__MONITORING :
			{
				return getMonitoring();
			}

			case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF :
			{
				return getCategoryValueRef();
			}

			case Bpmn2Package.FLOW_ELEMENT__NAME :
			{
				return getName();
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
			case Bpmn2Package.FLOW_ELEMENT__AUDITING :
			{
				return basicSetAuditing( null, msgs );
			}

			case Bpmn2Package.FLOW_ELEMENT__MONITORING :
			{
				return basicSetMonitoring( null, msgs );
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
			case Bpmn2Package.FLOW_ELEMENT__AUDITING :
			{
				return auditing != null;
			}

			case Bpmn2Package.FLOW_ELEMENT__MONITORING :
			{
				return monitoring != null;
			}

			case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF :
			{
				return ( categoryValueRef != null ) && ! categoryValueRef.isEmpty();
			}

			case Bpmn2Package.FLOW_ELEMENT__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
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
			case Bpmn2Package.FLOW_ELEMENT__AUDITING :
			{
				setAuditing((Auditing) newValue );

				return;
			}

			case Bpmn2Package.FLOW_ELEMENT__MONITORING :
			{
				setMonitoring((Monitoring) newValue );

				return;
			}

			case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF :
			{
				getCategoryValueRef().clear();
				getCategoryValueRef().addAll((Collection<? extends CategoryValue>) newValue );

				return;
			}

			case Bpmn2Package.FLOW_ELEMENT__NAME :
			{
				setName((String) newValue );

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
			case Bpmn2Package.FLOW_ELEMENT__AUDITING :
			{
				setAuditing((Auditing) null );

				return;
			}

			case Bpmn2Package.FLOW_ELEMENT__MONITORING :
			{
				setMonitoring((Monitoring) null );

				return;
			}

			case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF :
			{
				getCategoryValueRef().clear();

				return;
			}

			case Bpmn2Package.FLOW_ELEMENT__NAME :
			{
				setName( NAME_EDEFAULT );

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
	@Override public Auditing getAuditing()
	{
		return auditing;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<CategoryValue> getCategoryValueRef()
	{
		if( categoryValueRef == null )
		{
			categoryValueRef = new EObjectResolvingEList<CategoryValue>( CategoryValue.class, this, Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF );
		}

		return categoryValueRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Monitoring getMonitoring()
	{
		return monitoring;
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
	 * @param      newAuditing  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setAuditing( final Auditing newAuditing )
	{
		if( newAuditing != auditing )
		{
			NotificationChain msgs = null;

			if( auditing != null )
			{
				msgs = ((InternalEObject) auditing ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.FLOW_ELEMENT__AUDITING, null, msgs );
			}

			if( newAuditing != null )
			{
				msgs = ((InternalEObject) newAuditing ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.FLOW_ELEMENT__AUDITING, null, msgs );
			}

			msgs = basicSetAuditing( newAuditing, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.FLOW_ELEMENT__AUDITING, newAuditing, newAuditing ));
		}
	} // end method setAuditing

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newMonitoring  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setMonitoring( final Monitoring newMonitoring )
	{
		if( newMonitoring != monitoring )
		{
			NotificationChain msgs = null;

			if( monitoring != null )
			{
				msgs = ((InternalEObject) monitoring ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.FLOW_ELEMENT__MONITORING, null, msgs );
			}

			if( newMonitoring != null )
			{
				msgs = ((InternalEObject) newMonitoring ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.FLOW_ELEMENT__MONITORING, null, msgs );
			}

			msgs = basicSetMonitoring( newMonitoring, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.FLOW_ELEMENT__MONITORING, newMonitoring, newMonitoring ));
		}
	} // end method setMonitoring

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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.FLOW_ELEMENT__NAME, oldName, name ));
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
		return Bpmn2Package.Literals.FLOW_ELEMENT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getAuditing()
	 * @generated
	 * @orderd
	 */
	protected Auditing auditing;

	/**
	 * The cached value of the '{@link #getCategoryValueRef() <em>Category Value Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCategoryValueRef()
	 * @generated
	 * @orderd
	 */
	protected EList<CategoryValue> categoryValueRef;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMonitoring()
	 * @generated
	 * @orderd
	 */
	protected Monitoring monitoring;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected String name = NAME_EDEFAULT;

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
} //FlowElementImpl
