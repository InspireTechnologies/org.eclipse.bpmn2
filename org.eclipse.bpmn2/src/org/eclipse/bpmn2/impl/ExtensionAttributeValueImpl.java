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
import org.eclipse.bpmn2.ExtensionAttributeDefinition;
import org.eclipse.bpmn2.ExtensionAttributeValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeValueImpl#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeValueImpl#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ExtensionAttributeValueImpl
	extends EObjectImpl
	implements ExtensionAttributeValue
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionAttributeValueImpl()
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
	public ExtensionAttributeDefinition basicGetExtensionAttributeDefinition()
	{
		return extensionAttributeDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public Object basicGetValueRef()
	{
		return valueRef;
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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF :
			{
				if( resolve )
				{
					return getValueRef();
				}

				return basicGetValueRef();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE :
			{
				if( coreType )
				{
					return getValue();
				}

				return ((FeatureMap.Internal) getValue()).getWrapper();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION :
			{
				if( resolve )
				{
					return getExtensionAttributeDefinition();
				}

				return basicGetExtensionAttributeDefinition();
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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE :
			{
				return ((InternalEList<?>) getValue()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF :
			{
				return valueRef != null;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE :
			{
				return ( value != null ) && ! value.isEmpty();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION :
			{
				return extensionAttributeDefinition != null;
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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF :
			{
				setValueRef( newValue );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE :
			{
				((FeatureMap.Internal) getValue()).set( newValue );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION :
			{
				setExtensionAttributeDefinition((ExtensionAttributeDefinition) newValue );

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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF :
			{
				setValueRef((Object) null );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE :
			{
				getValue().clear();

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION :
			{
				setExtensionAttributeDefinition((ExtensionAttributeDefinition) null );

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
	@Override public ExtensionAttributeDefinition getExtensionAttributeDefinition()
	{
		if(( extensionAttributeDefinition != null ) && extensionAttributeDefinition.eIsProxy())
		{
			final InternalEObject oldExtensionAttributeDefinition = (InternalEObject) extensionAttributeDefinition;
			extensionAttributeDefinition = (ExtensionAttributeDefinition) eResolveProxy( oldExtensionAttributeDefinition );

			if( extensionAttributeDefinition != oldExtensionAttributeDefinition )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION, oldExtensionAttributeDefinition, extensionAttributeDefinition ));
				}
			}
		}

		return extensionAttributeDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public FeatureMap getValue()
	{
		if( value == null )
		{
			value = new BasicFeatureMap( this, Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE );
		}

		return value;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Object getValueRef()
	{
		if(( valueRef != null ) && valueRef.eIsProxy())
		{
			final InternalEObject oldValueRef = (InternalEObject) valueRef;
			valueRef = eResolveProxy( oldValueRef );

			if( valueRef != oldValueRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, oldValueRef, valueRef ));
				}
			}
		}

		return valueRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newExtensionAttributeDefinition  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setExtensionAttributeDefinition( final ExtensionAttributeDefinition newExtensionAttributeDefinition )
	{
		final ExtensionAttributeDefinition oldExtensionAttributeDefinition = extensionAttributeDefinition;
		extensionAttributeDefinition = newExtensionAttributeDefinition;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION, oldExtensionAttributeDefinition, extensionAttributeDefinition ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newValueRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setValueRef( final Object newValueRef )
	{
		final Object oldValueRef = valueRef;
		valueRef = (EObject) newValueRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, oldValueRef, valueRef ));
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
		result.append( " (value: " );
		result.append( value );
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
		return Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_VALUE;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getExtensionAttributeDefinition() <em>Extension Attribute Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getExtensionAttributeDefinition()
	 * @generated
	 * @orderd
	 */
	protected ExtensionAttributeDefinition extensionAttributeDefinition;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getValue()
	 * @generated
	 * @orderd
	 */
	protected FeatureMap value;

	/**
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getValueRef()
	 * @generated
	 * @orderd
	 */
	protected EObject valueRef;
} //ExtensionAttributeValueImpl
