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
 *
 */
package org.eclipse.bpmn2.di.impl;

import org.eclipse.bpmn2.di.BPMNDiagram;
import org.eclipse.bpmn2.di.BPMNLabelStyle;
import org.eclipse.bpmn2.di.BPMNPlane;
import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.impl.DiagramImpl;

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
 * An implementation of the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNDiagramImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNDiagramImpl#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class BPMNDiagramImpl
	extends DiagramImpl
	implements BPMNDiagram
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNDiagramImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPlane  DOCUMENT ME!
	 * @param      msgs      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetPlane( final BPMNPlane newPlane, NotificationChain msgs )
	{
		final BPMNPlane oldPlane = plane;
		plane = newPlane;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_DIAGRAM__PLANE, oldPlane, newPlane );

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
			case BpmnDiPackage.BPMN_DIAGRAM__PLANE :
			{
				return getPlane();
			}

			case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE :
			{
				return getLabelStyle();
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
			case BpmnDiPackage.BPMN_DIAGRAM__PLANE :
			{
				return basicSetPlane( null, msgs );
			}

			case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE :
			{
				return ((InternalEList<?>) getLabelStyle()).basicRemove( otherEnd, msgs );
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
			case BpmnDiPackage.BPMN_DIAGRAM__PLANE :
			{
				return plane != null;
			}

			case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE :
			{
				return ( labelStyle != null ) && ! labelStyle.isEmpty();
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
			case BpmnDiPackage.BPMN_DIAGRAM__PLANE :
			{
				setPlane((BPMNPlane) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE :
			{
				getLabelStyle().clear();
				getLabelStyle().addAll((Collection<? extends BPMNLabelStyle>) newValue );

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
			case BpmnDiPackage.BPMN_DIAGRAM__PLANE :
			{
				setPlane((BPMNPlane) null );

				return;
			}

			case BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE :
			{
				getLabelStyle().clear();

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
	@Override public List<BPMNLabelStyle> getLabelStyle()
	{
		if( labelStyle == null )
		{
			labelStyle = new EObjectContainmentEList<BPMNLabelStyle>( BPMNLabelStyle.class, this, BpmnDiPackage.BPMN_DIAGRAM__LABEL_STYLE );
		}

		return labelStyle;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNPlane getPlane()
	{
		return plane;
	}

	//~ ........................................................................................................................................................................................................................................................

	@Override public DiagramElement getRootElement()
	{
		return getPlane();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPlane  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setPlane( final BPMNPlane newPlane )
	{
		if( newPlane != plane )
		{
			NotificationChain msgs = null;

			if( plane != null )
			{
				msgs = ((InternalEObject) plane ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - BpmnDiPackage.BPMN_DIAGRAM__PLANE, null, msgs );
			}

			if( newPlane != null )
			{
				msgs = ((InternalEObject) newPlane ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - BpmnDiPackage.BPMN_DIAGRAM__PLANE, null, msgs );
			}

			msgs = basicSetPlane( newPlane, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_DIAGRAM__PLANE, newPlane, newPlane ));
		}
	} // end method setPlane

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
		return BpmnDiPackage.Literals.BPMN_DIAGRAM;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLabelStyle()
	 * @generated
	 * @orderd
	 */
	protected EList<BPMNLabelStyle> labelStyle;

	/**
	 * The cached value of the '{@link #getPlane() <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getPlane()
	 * @generated
	 * @orderd
	 */
	protected BPMNPlane plane;
} //BPMNDiagramImpl
