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
import org.eclipse.bpmn2.CallableElement;
import org.eclipse.bpmn2.InputOutputBinding;
import org.eclipse.bpmn2.InputOutputSpecification;
import org.eclipse.bpmn2.Interface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CallableElementImpl#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CallableElementImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CallableElementImpl#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CallableElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class CallableElementImpl
	extends RootElementImpl
	implements CallableElement
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableElementImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIoSpecification  DOCUMENT ME!
	 * @param      msgs                DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification( final InputOutputSpecification newIoSpecification, NotificationChain msgs )
	{
		final InputOutputSpecification oldIoSpecification = ioSpecification;
		ioSpecification = newIoSpecification;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION, oldIoSpecification, newIoSpecification );

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
			case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS :
			{
				return getSupportedInterfaceRefs();
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION :
			{
				return getIoSpecification();
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING :
			{
				return getIoBinding();
			}

			case Bpmn2Package.CALLABLE_ELEMENT__NAME :
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
			case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION :
			{
				return basicSetIoSpecification( null, msgs );
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING :
			{
				return ((InternalEList<?>) getIoBinding()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS :
			{
				return ( supportedInterfaceRefs != null ) && ! supportedInterfaceRefs.isEmpty();
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION :
			{
				return ioSpecification != null;
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING :
			{
				return ( ioBinding != null ) && ! ioBinding.isEmpty();
			}

			case Bpmn2Package.CALLABLE_ELEMENT__NAME :
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
			case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS :
			{
				getSupportedInterfaceRefs().clear();
				getSupportedInterfaceRefs().addAll((Collection<? extends Interface>) newValue );

				return;
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION :
			{
				setIoSpecification((InputOutputSpecification) newValue );

				return;
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING :
			{
				getIoBinding().clear();
				getIoBinding().addAll((Collection<? extends InputOutputBinding>) newValue );

				return;
			}

			case Bpmn2Package.CALLABLE_ELEMENT__NAME :
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
			case Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS :
			{
				getSupportedInterfaceRefs().clear();

				return;
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION :
			{
				setIoSpecification((InputOutputSpecification) null );

				return;
			}

			case Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING :
			{
				getIoBinding().clear();

				return;
			}

			case Bpmn2Package.CALLABLE_ELEMENT__NAME :
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
	@Override public List<InputOutputBinding> getIoBinding()
	{
		if( ioBinding == null )
		{
			ioBinding = new EObjectContainmentEList<InputOutputBinding>( InputOutputBinding.class, this, Bpmn2Package.CALLABLE_ELEMENT__IO_BINDING );
		}

		return ioBinding;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public InputOutputSpecification getIoSpecification()
	{
		return ioSpecification;
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
	@Override public List<Interface> getSupportedInterfaceRefs()
	{
		if( supportedInterfaceRefs == null )
		{
			supportedInterfaceRefs = new EObjectResolvingEList<Interface>( Interface.class, this, Bpmn2Package.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS );
		}

		return supportedInterfaceRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIoSpecification  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIoSpecification( final InputOutputSpecification newIoSpecification )
	{
		if( newIoSpecification != ioSpecification )
		{
			NotificationChain msgs = null;

			if( ioSpecification != null )
			{
				msgs = ((InternalEObject) ioSpecification ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION, null, msgs );
			}

			if( newIoSpecification != null )
			{
				msgs = ((InternalEObject) newIoSpecification ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION, null, msgs );
			}

			msgs = basicSetIoSpecification( newIoSpecification, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CALLABLE_ELEMENT__IO_SPECIFICATION, newIoSpecification, newIoSpecification ));
		}
	} // end method setIoSpecification

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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CALLABLE_ELEMENT__NAME, oldName, name ));
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
		return Bpmn2Package.Literals.CALLABLE_ELEMENT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getIoBinding() <em>Io Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getIoBinding()
	 * @generated
	 * @orderd
	 */
	protected EList<InputOutputBinding> ioBinding;

	/**
	 * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getIoSpecification()
	 * @generated
	 * @orderd
	 */
	protected InputOutputSpecification ioSpecification;

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
	 * The cached value of the '{@link #getSupportedInterfaceRefs() <em>Supported Interface Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSupportedInterfaceRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<Interface> supportedInterfaceRefs;

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
} //CallableElementImpl
