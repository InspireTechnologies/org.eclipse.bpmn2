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
import org.eclipse.bpmn2.TextAnnotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.TextAnnotationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.TextAnnotationImpl#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class TextAnnotationImpl
	extends ArtifactImpl
	implements TextAnnotation
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAnnotationImpl()
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
			case Bpmn2Package.TEXT_ANNOTATION__TEXT :
			{
				return getText();
			}

			case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT :
			{
				return getTextFormat();
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
			case Bpmn2Package.TEXT_ANNOTATION__TEXT :
			{
				return ( TEXT_EDEFAULT == null ) ? ( text != null ) : ( ! TEXT_EDEFAULT.equals( text ));
			}

			case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT :
			{
				return ( TEXT_FORMAT_EDEFAULT == null ) ? ( textFormat != null ) : ( ! TEXT_FORMAT_EDEFAULT.equals( textFormat ));
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
			case Bpmn2Package.TEXT_ANNOTATION__TEXT :
			{
				setText((String) newValue );

				return;
			}

			case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT :
			{
				setTextFormat((String) newValue );

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
			case Bpmn2Package.TEXT_ANNOTATION__TEXT :
			{
				setText( TEXT_EDEFAULT );

				return;
			}

			case Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT :
			{
				setTextFormat( TEXT_FORMAT_EDEFAULT );

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
	@Override public String getText()
	{
		return text;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getTextFormat()
	{
		return textFormat;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newText  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setText( final String newText )
	{
		final String oldText = text;
		text = newText;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.TEXT_ANNOTATION__TEXT, oldText, text ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTextFormat  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTextFormat( final String newTextFormat )
	{
		final String oldTextFormat = textFormat;
		textFormat = newTextFormat;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.TEXT_ANNOTATION__TEXT_FORMAT, oldTextFormat, textFormat ));
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
		result.append( " (text: " );
		result.append( text );
		result.append( ", textFormat: " );
		result.append( textFormat );
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
		return Bpmn2Package.Literals.TEXT_ANNOTATION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getText()
	 * @generated
	 * @orderd
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTextFormat()
	 * @generated
	 * @orderd
	 */
	protected String textFormat = TEXT_FORMAT_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getText()
	 * @generated
	 * @orderd
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTextFormat()
	 * @generated
	 * @orderd
	 */
	protected static final String TEXT_FORMAT_EDEFAULT = "text/plain";
} //TextAnnotationImpl
