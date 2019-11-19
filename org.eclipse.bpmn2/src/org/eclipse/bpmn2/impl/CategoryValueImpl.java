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
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.util.Bpmn2Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CategoryValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CategoryValueImpl#getCategorizedFlowElements <em>Categorized Flow Elements</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class CategoryValueImpl
	extends BaseElementImpl
	implements CategoryValue
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryValueImpl()
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
			case Bpmn2Package.CATEGORY_VALUE__VALUE :
			{
				return getValue();
			}

			case Bpmn2Package.CATEGORY_VALUE__CATEGORIZED_FLOW_ELEMENTS :
			{
				return getCategorizedFlowElements();
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
			case Bpmn2Package.CATEGORY_VALUE__VALUE :
			{
				return ( VALUE_EDEFAULT == null ) ? ( value != null ) : ( ! VALUE_EDEFAULT.equals( value ));
			}

			case Bpmn2Package.CATEGORY_VALUE__CATEGORIZED_FLOW_ELEMENTS :
			{
				return ! getCategorizedFlowElements().isEmpty();
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
			case Bpmn2Package.CATEGORY_VALUE__VALUE :
			{
				setValue((String) newValue );

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
			case Bpmn2Package.CATEGORY_VALUE__VALUE :
			{
				setValue( VALUE_EDEFAULT );

				return;
			}
		}

		super.eUnset( featureID );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * Returns a computed list of flow elements where {@link FlowElement#getCategoryValueRef()} contains this CategoryValue.
	 *
	 * <p>This object has to be contained in a BPMN2 resource. The resource needs to have attached a {@linkplain Bpmn2Resource#getOppositeReferenceAdapter() OppositeReferenceAdapter} that observes (probably among others) the reference {@link
	 * FlowElement#getCategoryValueRef()}, which is the default state.</p>
	 *
	 * <p>The result only includes those FlowElements that are contained in the same resource or resource set.
	 * <!-- end-user-doc -->
	 * </p>
	 *
	 * @return     a computed list of flow elements where {@link FlowElement#getCategoryValueRef()} contains this CategoryValue.
	 *
	 * @throws     UnsupportedOperationException  DOCUMENT ME!
	 *
	 * @generated  NOT
	 */
	@Override public List<FlowElement> getCategorizedFlowElements()
	{
		if( eResource() instanceof Bpmn2Resource )
		{
			return ((Bpmn2Resource) eResource()).getOppositeReferenceAdapter().getOppositeList( FlowElement.class, this, Bpmn2Package.Literals.FLOW_ELEMENT__CATEGORY_VALUE_REF );
		}

		throw new UnsupportedOperationException();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getValue()
	{
		return value;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newValue  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setValue( final String newValue )
	{
		final String oldValue = value;
		value = newValue;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.CATEGORY_VALUE__VALUE, oldValue, value ));
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
		return Bpmn2Package.Literals.CATEGORY_VALUE;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getValue()
	 * @generated
	 * @orderd
	 */
	protected String value = VALUE_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getValue()
	 * @generated
	 * @orderd
	 */
	protected static final String VALUE_EDEFAULT = null;
} //CategoryValueImpl
