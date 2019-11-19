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
import org.eclipse.bpmn2.CategoryValue;
import org.eclipse.bpmn2.Group;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.GroupImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class GroupImpl
	extends ArtifactImpl
	implements Group
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl()
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
	public CategoryValue basicGetCategoryValueRef()
	{
		return categoryValueRef;
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
			case Bpmn2Package.GROUP__CATEGORY_VALUE_REF :
			{
				if( resolve )
				{
					return getCategoryValueRef();
				}

				return basicGetCategoryValueRef();
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
			case Bpmn2Package.GROUP__CATEGORY_VALUE_REF :
			{
				return categoryValueRef != null;
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
			case Bpmn2Package.GROUP__CATEGORY_VALUE_REF :
			{
				setCategoryValueRef((CategoryValue) newValue );

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
			case Bpmn2Package.GROUP__CATEGORY_VALUE_REF :
			{
				setCategoryValueRef((CategoryValue) null );

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
	@Override public CategoryValue getCategoryValueRef()
	{
		if(( categoryValueRef != null ) && categoryValueRef.eIsProxy())
		{
			final InternalEObject oldCategoryValueRef = (InternalEObject) categoryValueRef;
			categoryValueRef = (CategoryValue) eResolveProxy( oldCategoryValueRef );

			if( categoryValueRef != oldCategoryValueRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.GROUP__CATEGORY_VALUE_REF, oldCategoryValueRef, categoryValueRef ));
				}
			}
		}

		return categoryValueRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newCategoryValueRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setCategoryValueRef( final CategoryValue newCategoryValueRef )
	{
		final CategoryValue oldCategoryValueRef = categoryValueRef;
		categoryValueRef = newCategoryValueRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.GROUP__CATEGORY_VALUE_REF, oldCategoryValueRef, categoryValueRef ));
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
		return Bpmn2Package.Literals.GROUP;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getCategoryValueRef() <em>Category Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCategoryValueRef()
	 * @generated
	 * @orderd
	 */
	protected CategoryValue categoryValueRef;
} //GroupImpl
