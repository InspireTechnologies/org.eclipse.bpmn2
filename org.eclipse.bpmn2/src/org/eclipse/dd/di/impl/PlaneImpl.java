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

import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.Plane;
import org.eclipse.dd.di.util.DiValidator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;
import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.dd.di.impl.PlaneImpl#getPlaneElement <em>Plane Element</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class PlaneImpl
	extends NodeImpl
	implements Plane
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaneImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

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
			case DiPackage.PLANE__PLANE_ELEMENT :
			{
				return getPlaneElement();
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
			case DiPackage.PLANE__PLANE_ELEMENT :
			{
				return ((InternalEList<?>) getPlaneElement()).basicRemove( otherEnd, msgs );
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
			case DiPackage.PLANE__PLANE_ELEMENT :
			{
				return ( planeElement != null ) && ! planeElement.isEmpty();
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
			case DiPackage.PLANE__PLANE_ELEMENT :
			{
				getPlaneElement().clear();
				getPlaneElement().addAll((Collection<? extends DiagramElement>) newValue );

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
			case DiPackage.PLANE__PLANE_ELEMENT :
			{
				getPlaneElement().clear();

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
	@Override public List<DiagramElement> getPlaneElement()
	{
		if( planeElement == null )
		{
			planeElement = new EObjectContainmentEList<DiagramElement>( DiagramElement.class, this, DiPackage.PLANE__PLANE_ELEMENT );
		}

		return planeElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean plane_element_type( final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if( false )
		{
			if( diagnostics != null )
			{
				diagnostics.add(
					new BasicDiagnostic( Diagnostic.ERROR,
						DiValidator.DIAGNOSTIC_SOURCE,
						DiValidator.PLANE__PLANE_ELEMENT_TYPE,
						EcorePlugin.INSTANCE.getString( "_UI_GenericInvariant_diagnostic", new Object[]
							{
								"plane_element_type",
								EObjectValidator.getObjectLabel( this, context )
							} ),
						new Object[] { this } ));
			}

			return false;
		}

		return true;
	} // end method plane_element_type

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
		return DiPackage.Literals.PLANE;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getPlaneElement() <em>Plane Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getPlaneElement()
	 * @generated
	 * @orderd
	 */
	protected EList<DiagramElement> planeElement;
} //PlaneImpl
