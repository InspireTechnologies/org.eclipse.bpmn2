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
import org.eclipse.bpmn2.LinkEventDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.LinkEventDefinitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.LinkEventDefinitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.LinkEventDefinitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class LinkEventDefinitionImpl
	extends EventDefinitionImpl
	implements LinkEventDefinition
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEventDefinitionImpl()
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
	public LinkEventDefinition basicGetTarget()
	{
		return target;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTarget  DOCUMENT ME!
	 * @param      msgs       DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetTarget( final LinkEventDefinition newTarget, NotificationChain msgs )
	{
		final LinkEventDefinition oldTarget = target;
		target = newTarget;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.LINK_EVENT_DEFINITION__TARGET, oldTarget, newTarget );

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
			case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE :
			{
				return getSource();
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET :
			{
				if( resolve )
				{
					return getTarget();
				}

				return basicGetTarget();
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__NAME :
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
	@Override
	@SuppressWarnings( "unchecked" )
	public NotificationChain eInverseAdd( final InternalEObject otherEnd, final int featureID, NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSource()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET :
			{
				if( target != null )
				{
					msgs = ((InternalEObject) target ).eInverseRemove( this, Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE, LinkEventDefinition.class, msgs );
				}

				return basicSetTarget((LinkEventDefinition) otherEnd, msgs );
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
			case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE :
			{
				return ((InternalEList<?>) getSource()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET :
			{
				return basicSetTarget( null, msgs );
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
			case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE :
			{
				return ( source != null ) && ! source.isEmpty();
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET :
			{
				return target != null;
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
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
			case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE :
			{
				getSource().clear();
				getSource().addAll((Collection<? extends LinkEventDefinition>) newValue );

				return;
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET :
			{
				setTarget((LinkEventDefinition) newValue );

				return;
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__NAME :
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
			case Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE :
			{
				getSource().clear();

				return;
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__TARGET :
			{
				setTarget((LinkEventDefinition) null );

				return;
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION__NAME :
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
	@Override public List<LinkEventDefinition> getSource()
	{
		if( source == null )
		{
			source = new EObjectWithInverseResolvingEList<LinkEventDefinition>( LinkEventDefinition.class, this, Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE, Bpmn2Package.LINK_EVENT_DEFINITION__TARGET );
		}

		return source;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public LinkEventDefinition getTarget()
	{
		if(( target != null ) && target.eIsProxy())
		{
			final InternalEObject oldTarget = (InternalEObject) target;
			target = (LinkEventDefinition) eResolveProxy( oldTarget );

			if( target != oldTarget )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.LINK_EVENT_DEFINITION__TARGET, oldTarget, target ));
				}
			}
		}

		return target;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.LINK_EVENT_DEFINITION__NAME, oldName, name ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTarget  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTarget( final LinkEventDefinition newTarget )
	{
		if( newTarget != target )
		{
			NotificationChain msgs = null;

			if( target != null )
			{
				msgs = ((InternalEObject) target ).eInverseRemove( this, Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE, LinkEventDefinition.class, msgs );
			}

			if( newTarget != null )
			{
				msgs = ((InternalEObject) newTarget ).eInverseAdd( this, Bpmn2Package.LINK_EVENT_DEFINITION__SOURCE, LinkEventDefinition.class, msgs );
			}

			msgs = basicSetTarget( newTarget, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.LINK_EVENT_DEFINITION__TARGET, newTarget, newTarget ));
		}
	} // end method setTarget

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
		return Bpmn2Package.Literals.LINK_EVENT_DEFINITION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSource()
	 * @generated
	 * @orderd
	 */
	protected EList<LinkEventDefinition> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTarget()
	 * @generated
	 * @orderd
	 */
	protected LinkEventDefinition target;

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
} //LinkEventDefinitionImpl
