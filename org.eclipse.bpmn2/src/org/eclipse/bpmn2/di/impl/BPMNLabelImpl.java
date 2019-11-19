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

import org.eclipse.bpmn2.di.BPMNLabel;
import org.eclipse.bpmn2.di.BPMNLabelStyle;
import org.eclipse.bpmn2.di.BpmnDiPackage;

import org.eclipse.dd.di.impl.LabelImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNLabelImpl#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class BPMNLabelImpl
	extends LabelImpl
	implements BPMNLabel
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNLabelImpl()
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
	public BPMNLabelStyle basicGetLabelStyle()
	{
		return labelStyle;
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
			case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE :
			{
				if( resolve )
				{
					return getLabelStyle();
				}

				return basicGetLabelStyle();
			}
		}

		return super.eGet( featureID, resolve, coreType );
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
			case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE :
			{
				return labelStyle != null;
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
			case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE :
			{
				setLabelStyle((BPMNLabelStyle) newValue );

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
			case BpmnDiPackage.BPMN_LABEL__LABEL_STYLE :
			{
				setLabelStyle((BPMNLabelStyle) null );

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
	@Override public BPMNLabelStyle getLabelStyle()
	{
		if(( labelStyle != null ) && labelStyle.eIsProxy())
		{
			final InternalEObject oldLabelStyle = (InternalEObject) labelStyle;
			labelStyle = (BPMNLabelStyle) eResolveProxy( oldLabelStyle );

			if( labelStyle != oldLabelStyle )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, BpmnDiPackage.BPMN_LABEL__LABEL_STYLE, oldLabelStyle, labelStyle ));
				}
			}
		}

		return labelStyle;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabelStyle  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLabelStyle( final BPMNLabelStyle newLabelStyle )
	{
		final BPMNLabelStyle oldLabelStyle = labelStyle;
		labelStyle = newLabelStyle;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_LABEL__LABEL_STYLE, oldLabelStyle, labelStyle ));
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
	@Override protected EClass eStaticClass()
	{
		return BpmnDiPackage.Literals.BPMN_LABEL;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLabelStyle()
	 * @generated
	 * @orderd
	 */
	protected BPMNLabelStyle labelStyle;
} //BPMNLabelImpl
