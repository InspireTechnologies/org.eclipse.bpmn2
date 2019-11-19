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
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.Operation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.OperationImpl#getInMessageRef <em>In Message Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OperationImpl#getOutMessageRef <em>Out Message Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OperationImpl#getErrorRefs <em>Error Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OperationImpl#getImplementationRef <em>Implementation Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.OperationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class OperationImpl
	extends BaseElementImpl
	implements Operation
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl()
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
	public Object basicGetImplementationRef()
	{
		return implementationRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public Message basicGetInMessageRef()
	{
		return inMessageRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public Message basicGetOutMessageRef()
	{
		return outMessageRef;
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
			case Bpmn2Package.OPERATION__IN_MESSAGE_REF :
			{
				if( resolve )
				{
					return getInMessageRef();
				}

				return basicGetInMessageRef();
			}

			case Bpmn2Package.OPERATION__OUT_MESSAGE_REF :
			{
				if( resolve )
				{
					return getOutMessageRef();
				}

				return basicGetOutMessageRef();
			}

			case Bpmn2Package.OPERATION__ERROR_REFS :
			{
				return getErrorRefs();
			}

			case Bpmn2Package.OPERATION__IMPLEMENTATION_REF :
			{
				if( resolve )
				{
					return getImplementationRef();
				}

				return basicGetImplementationRef();
			}

			case Bpmn2Package.OPERATION__NAME :
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
			case Bpmn2Package.OPERATION__IN_MESSAGE_REF :
			{
				return inMessageRef != null;
			}

			case Bpmn2Package.OPERATION__OUT_MESSAGE_REF :
			{
				return outMessageRef != null;
			}

			case Bpmn2Package.OPERATION__ERROR_REFS :
			{
				return ( errorRefs != null ) && ! errorRefs.isEmpty();
			}

			case Bpmn2Package.OPERATION__IMPLEMENTATION_REF :
			{
				return implementationRef != null;
			}

			case Bpmn2Package.OPERATION__NAME :
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
			case Bpmn2Package.OPERATION__IN_MESSAGE_REF :
			{
				setInMessageRef((Message) newValue );

				return;
			}

			case Bpmn2Package.OPERATION__OUT_MESSAGE_REF :
			{
				setOutMessageRef((Message) newValue );

				return;
			}

			case Bpmn2Package.OPERATION__ERROR_REFS :
			{
				getErrorRefs().clear();
				getErrorRefs().addAll((Collection<? extends org.eclipse.bpmn2.Error>) newValue );

				return;
			}

			case Bpmn2Package.OPERATION__IMPLEMENTATION_REF :
			{
				setImplementationRef( newValue );

				return;
			}

			case Bpmn2Package.OPERATION__NAME :
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
			case Bpmn2Package.OPERATION__IN_MESSAGE_REF :
			{
				setInMessageRef((Message) null );

				return;
			}

			case Bpmn2Package.OPERATION__OUT_MESSAGE_REF :
			{
				setOutMessageRef((Message) null );

				return;
			}

			case Bpmn2Package.OPERATION__ERROR_REFS :
			{
				getErrorRefs().clear();

				return;
			}

			case Bpmn2Package.OPERATION__IMPLEMENTATION_REF :
			{
				setImplementationRef((Object) null );

				return;
			}

			case Bpmn2Package.OPERATION__NAME :
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
	@Override public List<org.eclipse.bpmn2.Error> getErrorRefs()
	{
		if( errorRefs == null )
		{
			errorRefs = new EObjectResolvingEList<org.eclipse.bpmn2.Error>( org.eclipse.bpmn2.Error.class, this, Bpmn2Package.OPERATION__ERROR_REFS );
		}

		return errorRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Object getImplementationRef()
	{
		if(( implementationRef != null ) && implementationRef.eIsProxy())
		{
			final InternalEObject oldImplementationRef = (InternalEObject) implementationRef;
			implementationRef = eResolveProxy( oldImplementationRef );

			if( implementationRef != oldImplementationRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.OPERATION__IMPLEMENTATION_REF, oldImplementationRef, implementationRef ));
				}
			}
		}

		return implementationRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Message getInMessageRef()
	{
		if(( inMessageRef != null ) && inMessageRef.eIsProxy())
		{
			final InternalEObject oldInMessageRef = (InternalEObject) inMessageRef;
			inMessageRef = (Message) eResolveProxy( oldInMessageRef );

			if( inMessageRef != oldInMessageRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.OPERATION__IN_MESSAGE_REF, oldInMessageRef, inMessageRef ));
				}
			}
		}

		return inMessageRef;
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
	@Override public Message getOutMessageRef()
	{
		if(( outMessageRef != null ) && outMessageRef.eIsProxy())
		{
			final InternalEObject oldOutMessageRef = (InternalEObject) outMessageRef;
			outMessageRef = (Message) eResolveProxy( oldOutMessageRef );

			if( outMessageRef != oldOutMessageRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.OPERATION__OUT_MESSAGE_REF, oldOutMessageRef, outMessageRef ));
				}
			}
		}

		return outMessageRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newImplementationRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setImplementationRef( final Object newImplementationRef )
	{
		final Object oldImplementationRef = implementationRef;
		implementationRef = (EObject) newImplementationRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.OPERATION__IMPLEMENTATION_REF, oldImplementationRef, implementationRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newInMessageRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setInMessageRef( final Message newInMessageRef )
	{
		final Message oldInMessageRef = inMessageRef;
		inMessageRef = newInMessageRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.OPERATION__IN_MESSAGE_REF, oldInMessageRef, inMessageRef ));
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.OPERATION__NAME, oldName, name ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newOutMessageRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setOutMessageRef( final Message newOutMessageRef )
	{
		final Message oldOutMessageRef = outMessageRef;
		outMessageRef = newOutMessageRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.OPERATION__OUT_MESSAGE_REF, oldOutMessageRef, outMessageRef ));
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
		return Bpmn2Package.Literals.OPERATION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getErrorRefs() <em>Error Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getErrorRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<org.eclipse.bpmn2.Error> errorRefs;

	/**
	 * The cached value of the '{@link #getImplementationRef() <em>Implementation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getImplementationRef()
	 * @generated
	 * @orderd
	 */
	protected EObject implementationRef;

	/**
	 * The cached value of the '{@link #getInMessageRef() <em>In Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInMessageRef()
	 * @generated
	 * @orderd
	 */
	protected Message inMessageRef;

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
	 * The cached value of the '{@link #getOutMessageRef() <em>Out Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutMessageRef()
	 * @generated
	 * @orderd
	 */
	protected Message outMessageRef;

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
} //OperationImpl
