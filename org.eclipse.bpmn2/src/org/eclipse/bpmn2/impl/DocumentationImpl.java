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
import org.eclipse.bpmn2.Documentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.DocumentationImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DocumentationImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DocumentationImpl#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class DocumentationImpl
	extends BaseElementImpl
	implements Documentation
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl()
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
			case Bpmn2Package.DOCUMENTATION__MIXED :
			{
				if( coreType )
				{
					return getMixed();
				}

				return ((FeatureMap.Internal) getMixed()).getWrapper();
			}

			case Bpmn2Package.DOCUMENTATION__TEXT :
			{
				return getText();
			}

			case Bpmn2Package.DOCUMENTATION__TEXT_FORMAT :
			{
				return getTextFormat();
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
			case Bpmn2Package.DOCUMENTATION__MIXED :
			{
				return ((InternalEList<?>) getMixed()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.DOCUMENTATION__MIXED :
			{
				return ( mixed != null ) && ! mixed.isEmpty();
			}

			case Bpmn2Package.DOCUMENTATION__TEXT :
			{
				return ( TEXT_EDEFAULT == null ) ? ( getText() != null ) : ( ! TEXT_EDEFAULT.equals( getText()));
			}

			case Bpmn2Package.DOCUMENTATION__TEXT_FORMAT :
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
			case Bpmn2Package.DOCUMENTATION__MIXED :
			{
				((FeatureMap.Internal) getMixed()).set( newValue );

				return;
			}

			case Bpmn2Package.DOCUMENTATION__TEXT :
			{
				setText((String) newValue );

				return;
			}

			case Bpmn2Package.DOCUMENTATION__TEXT_FORMAT :
			{
				setTextFormat((String) newValue );

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
			case Bpmn2Package.DOCUMENTATION__MIXED :
			{
				getMixed().clear();

				return;
			}

			case Bpmn2Package.DOCUMENTATION__TEXT :
			{
				setText( TEXT_EDEFAULT );

				return;
			}

			case Bpmn2Package.DOCUMENTATION__TEXT_FORMAT :
			{
				setTextFormat( TEXT_FORMAT_EDEFAULT );

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
	@Override public FeatureMap getMixed()
	{
		if( mixed == null )
		{
			mixed = new BasicFeatureMap( this, Bpmn2Package.DOCUMENTATION__MIXED );
		}

		return mixed;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated  NOT
	 */
	@Override public String getText()
	{
		if( mixed != null )
		{
			final StringBuilder result = new StringBuilder();

			for( final FeatureMap.Entry cur : mixed )
			{
				switch( cur.getEStructuralFeature().getFeatureID())
				{
					case XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__CDATA :
					case XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__TEXT :
					{
						result.append( cur.getValue());

						break;
					}

					default :
					{
						break;
					}
				}
			}

			return result.toString();
		}

		return null;
	} // end method getText

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
	 * @generated  NOT
	 */
	@Override public void setText( final String newText )
	{
		getMixed().clear();
		getMixed().add( XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), newText );
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DOCUMENTATION__TEXT_FORMAT, oldTextFormat, textFormat ));
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
		result.append( " (mixed: " );
		result.append( mixed );
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
		return Bpmn2Package.Literals.DOCUMENTATION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMixed()
	 * @generated
	 * @orderd
	 */
	protected FeatureMap mixed;

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
} //DocumentationImpl
