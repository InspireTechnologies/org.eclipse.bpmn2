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
import org.eclipse.bpmn2.ExtensionDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeDefinitionImpl#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionAttributeDefinitionImpl#getExtensionDefinition <em>Extension Definition</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ExtensionAttributeDefinitionImpl
	extends EObjectImpl
	implements ExtensionAttributeDefinition
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionAttributeDefinitionImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newExtensionDefinition  DOCUMENT ME!
	 * @param      msgs                    DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetExtensionDefinition( final ExtensionDefinition newExtensionDefinition, NotificationChain msgs )
	{
		msgs = eBasicSetContainer((InternalEObject) newExtensionDefinition, Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION, msgs );

		return msgs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      msgs  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public NotificationChain eBasicRemoveFromContainerFeature( final NotificationChain msgs )
	{
		switch( eContainerFeatureID())
		{
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION :
			{
				return eInternalContainer().eInverseRemove( this, Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS, ExtensionDefinition.class, msgs );
			}
		}

		return super.eBasicRemoveFromContainerFeature( msgs );
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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME :
			{
				return getName();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE :
			{
				return getType();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE :
			{
				return isIsReference();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION :
			{
				return getExtensionDefinition();
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
	@Override public NotificationChain eInverseAdd( final InternalEObject otherEnd, final int featureID, NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION :
			{
				if( eInternalContainer() != null )
				{
					msgs = eBasicRemoveFromContainer( msgs );
				}

				return basicSetExtensionDefinition((ExtensionDefinition) otherEnd, msgs );
			}
		}

		return super.eInverseAdd( otherEnd, featureID, msgs );
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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION :
			{
				return basicSetExtensionDefinition( null, msgs );
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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE :
			{
				return ( TYPE_EDEFAULT == null ) ? ( type != null ) : ( ! TYPE_EDEFAULT.equals( type ));
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE :
			{
				return isReference != IS_REFERENCE_EDEFAULT;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION :
			{
				return getExtensionDefinition() != null;
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
	@Override public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME :
			{
				setName((String) newValue );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE :
			{
				setType((String) newValue );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE :
			{
				setIsReference((Boolean) newValue );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION :
			{
				setExtensionDefinition((ExtensionDefinition) newValue );

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
			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME :
			{
				setName( NAME_EDEFAULT );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE :
			{
				setType( TYPE_EDEFAULT );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE :
			{
				setIsReference( IS_REFERENCE_EDEFAULT );

				return;
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION :
			{
				setExtensionDefinition((ExtensionDefinition) null );

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
	@Override public ExtensionDefinition getExtensionDefinition()
	{
		if( eContainerFeatureID() != Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION )
		{
			return null;
		}

		return (ExtensionDefinition) eInternalContainer();
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
	@Override public String getType()
	{
		return type;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsReference()
	{
		return isReference;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newExtensionDefinition  DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setExtensionDefinition( final ExtensionDefinition newExtensionDefinition )
	{
		if(( newExtensionDefinition != eInternalContainer()) || (( eContainerFeatureID() != Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION ) && ( newExtensionDefinition != null )))
		{
			if( EcoreUtil.isAncestor( this, newExtensionDefinition ))
			{
				throw new IllegalArgumentException( "Recursive containment not allowed for " + toString());
			}

			NotificationChain msgs = null;

			if( eInternalContainer() != null )
			{
				msgs = eBasicRemoveFromContainer( msgs );
			}

			if( newExtensionDefinition != null )
			{
				msgs = ((InternalEObject) newExtensionDefinition ).eInverseAdd( this, Bpmn2Package.EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS, ExtensionDefinition.class, msgs );
			}

			msgs = basicSetExtensionDefinition( newExtensionDefinition, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION, newExtensionDefinition, newExtensionDefinition ));
		} // end if-else
	} // end method setExtensionDefinition

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsReference  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsReference( final boolean newIsReference )
	{
		final boolean oldIsReference = isReference;
		isReference = newIsReference;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE, oldIsReference, isReference ));
		}
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__NAME, oldName, name ));
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION__TYPE, oldType, type ));
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
		result.append( ", type: " );
		result.append( type );
		result.append( ", isReference: " );
		result.append( isReference );
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
		return Bpmn2Package.Literals.EXTENSION_ATTRIBUTE_DEFINITION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsReference()
	 * @generated
	 * @orderd
	 */
	protected boolean isReference = IS_REFERENCE_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getType()
	 * @generated
	 * @orderd
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsReference()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_REFERENCE_EDEFAULT = false;
} //ExtensionAttributeDefinitionImpl
