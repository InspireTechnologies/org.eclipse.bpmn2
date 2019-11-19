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
package org.eclipse.dd.di.impl;

import org.eclipse.dd.dc.Point;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.Edge;

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
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.dd.di.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.EdgeImpl#getWaypoint <em>Waypoint</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class EdgeImpl
	extends DiagramElementImpl
	implements Edge
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl()
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
	public DiagramElement basicGetSource()
	{
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
	public DiagramElement basicGetTarget()
	{
		return target;
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
			case DiPackage.EDGE__SOURCE :
			{
				if( resolve )
				{
					return getSource();
				}

				return basicGetSource();
			}

			case DiPackage.EDGE__TARGET :
			{
				if( resolve )
				{
					return getTarget();
				}

				return basicGetTarget();
			}

			case DiPackage.EDGE__WAYPOINT :
			{
				return getWaypoint();
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
			case DiPackage.EDGE__WAYPOINT :
			{
				return ((InternalEList<?>) getWaypoint()).basicRemove( otherEnd, msgs );
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
			case DiPackage.EDGE__SOURCE :
			{
				return source != null;
			}

			case DiPackage.EDGE__TARGET :
			{
				return target != null;
			}

			case DiPackage.EDGE__WAYPOINT :
			{
				return ( waypoint != null ) && ! waypoint.isEmpty();
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
			case DiPackage.EDGE__WAYPOINT :
			{
				getWaypoint().clear();
				getWaypoint().addAll((Collection<? extends Point>) newValue );

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
			case DiPackage.EDGE__WAYPOINT :
			{
				getWaypoint().clear();

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
	@Override public DiagramElement getSource()
	{
		if(( source != null ) && source.eIsProxy())
		{
			final InternalEObject oldSource = (InternalEObject) source;
			source = (DiagramElement) eResolveProxy( oldSource );

			if( source != oldSource )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, DiPackage.EDGE__SOURCE, oldSource, source ));
				}
			}
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
	@Override public DiagramElement getTarget()
	{
		if(( target != null ) && target.eIsProxy())
		{
			final InternalEObject oldTarget = (InternalEObject) target;
			target = (DiagramElement) eResolveProxy( oldTarget );

			if( target != oldTarget )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, DiPackage.EDGE__TARGET, oldTarget, target ));
				}
			}
		}

		return target;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<Point> getWaypoint()
	{
		if( waypoint == null )
		{
			waypoint = new EObjectContainmentEList<Point>( Point.class, this, DiPackage.EDGE__WAYPOINT );
		}

		return waypoint;
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
		return DiPackage.Literals.EDGE;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSource()
	 * @generated
	 * @orderd
	 */
	protected DiagramElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTarget()
	 * @generated
	 * @orderd
	 */
	protected DiagramElement target;

	/**
	 * The cached value of the '{@link #getWaypoint() <em>Waypoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getWaypoint()
	 * @generated
	 * @orderd
	 */
	protected EList<Point> waypoint;
} //EdgeImpl
