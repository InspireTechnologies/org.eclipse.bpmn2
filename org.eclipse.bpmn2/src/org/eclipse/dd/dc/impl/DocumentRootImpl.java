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
package org.eclipse.dd.dc.impl;

import org.eclipse.dd.dc.Bounds;
import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.dc.DocumentRoot;
import org.eclipse.dd.dc.Font;
import org.eclipse.dd.dc.Point;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.dd.dc.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.DocumentRootImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.DocumentRootImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.DocumentRootImpl#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class DocumentRootImpl
	extends EObjectImpl
	implements DocumentRoot
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newBounds  DOCUMENT ME!
	 * @param      msgs       DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetBounds( final Bounds newBounds, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DcPackage.Literals.DOCUMENT_ROOT__BOUNDS, newBounds, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newFont  DOCUMENT ME!
	 * @param      msgs     DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetFont( final Font newFont, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DcPackage.Literals.DOCUMENT_ROOT__FONT, newFont, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPoint  DOCUMENT ME!
	 * @param      msgs      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetPoint( final Point newPoint, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DcPackage.Literals.DOCUMENT_ROOT__POINT, newPoint, msgs );
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
			case DcPackage.DOCUMENT_ROOT__MIXED :
			{
				if( coreType )
				{
					return getMixed();
				}

				return ((FeatureMap.Internal) getMixed()).getWrapper();
			}

			case DcPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				if( coreType )
				{
					return ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap();
				}
				else
				{
					return getXMLNSPrefixMap();
				}
			}

			case DcPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				if( coreType )
				{
					return ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap();
				}
				else
				{
					return getXSISchemaLocation();
				}
			}

			case DcPackage.DOCUMENT_ROOT__BOUNDS :
			{
				return getBounds();
			}

			case DcPackage.DOCUMENT_ROOT__FONT :
			{
				return getFont();
			}

			case DcPackage.DOCUMENT_ROOT__POINT :
			{
				return getPoint();
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
			case DcPackage.DOCUMENT_ROOT__MIXED :
			{
				return ((InternalEList<?>) getMixed()).basicRemove( otherEnd, msgs );
			}

			case DcPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).basicRemove( otherEnd, msgs );
			}

			case DcPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).basicRemove( otherEnd, msgs );
			}

			case DcPackage.DOCUMENT_ROOT__BOUNDS :
			{
				return basicSetBounds( null, msgs );
			}

			case DcPackage.DOCUMENT_ROOT__FONT :
			{
				return basicSetFont( null, msgs );
			}

			case DcPackage.DOCUMENT_ROOT__POINT :
			{
				return basicSetPoint( null, msgs );
			}
		}

		return super.eInverseRemove( otherEnd, featureID, msgs );
	} // end method eInverseRemove

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
			case DcPackage.DOCUMENT_ROOT__MIXED :
			{
				return ( mixed != null ) && ! mixed.isEmpty();
			}

			case DcPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				return ( xMLNSPrefixMap != null ) && ! xMLNSPrefixMap.isEmpty();
			}

			case DcPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				return ( xSISchemaLocation != null ) && ! xSISchemaLocation.isEmpty();
			}

			case DcPackage.DOCUMENT_ROOT__BOUNDS :
			{
				return getBounds() != null;
			}

			case DcPackage.DOCUMENT_ROOT__FONT :
			{
				return getFont() != null;
			}

			case DcPackage.DOCUMENT_ROOT__POINT :
			{
				return getPoint() != null;
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
	@Override public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case DcPackage.DOCUMENT_ROOT__MIXED :
			{
				((FeatureMap.Internal) getMixed()).set( newValue );

				return;
			}

			case DcPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).set( newValue );

				return;
			}

			case DcPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).set( newValue );

				return;
			}

			case DcPackage.DOCUMENT_ROOT__BOUNDS :
			{
				setBounds((Bounds) newValue );

				return;
			}

			case DcPackage.DOCUMENT_ROOT__FONT :
			{
				setFont((Font) newValue );

				return;
			}

			case DcPackage.DOCUMENT_ROOT__POINT :
			{
				setPoint((Point) newValue );

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
			case DcPackage.DOCUMENT_ROOT__MIXED :
			{
				getMixed().clear();

				return;
			}

			case DcPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				getXMLNSPrefixMap().clear();

				return;
			}

			case DcPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				getXSISchemaLocation().clear();

				return;
			}

			case DcPackage.DOCUMENT_ROOT__BOUNDS :
			{
				setBounds((Bounds) null );

				return;
			}

			case DcPackage.DOCUMENT_ROOT__FONT :
			{
				setFont((Font) null );

				return;
			}

			case DcPackage.DOCUMENT_ROOT__POINT :
			{
				setPoint((Point) null );

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
	@Override public Bounds getBounds()
	{
		return (Bounds) getMixed().get( DcPackage.Literals.DOCUMENT_ROOT__BOUNDS, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Font getFont()
	{
		return (Font) getMixed().get( DcPackage.Literals.DOCUMENT_ROOT__FONT, true );
	}

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
			mixed = new BasicFeatureMap( this, DcPackage.DOCUMENT_ROOT__MIXED );
		}

		return mixed;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Point getPoint()
	{
		return (Point) getMixed().get( DcPackage.Literals.DOCUMENT_ROOT__POINT, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Map<String, String> getXMLNSPrefixMap()
	{
		if( xMLNSPrefixMap == null )
		{
			xMLNSPrefixMap = new EcoreEMap<String, String>( EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DcPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
		}

		return xMLNSPrefixMap.map();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Map<String, String> getXSISchemaLocation()
	{
		if( xSISchemaLocation == null )
		{
			xSISchemaLocation = new EcoreEMap<String, String>( EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DcPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
		}

		return xSISchemaLocation.map();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newBounds  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setBounds( final Bounds newBounds )
	{
		((FeatureMap.Internal) getMixed()).set( DcPackage.Literals.DOCUMENT_ROOT__BOUNDS, newBounds );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newFont  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setFont( final Font newFont )
	{
		((FeatureMap.Internal) getMixed()).set( DcPackage.Literals.DOCUMENT_ROOT__FONT, newFont );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPoint  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setPoint( final Point newPoint )
	{
		((FeatureMap.Internal) getMixed()).set( DcPackage.Literals.DOCUMENT_ROOT__POINT, newPoint );
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
		return DcPackage.Literals.DOCUMENT_ROOT;
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getXMLNSPrefixMap()
	 * @generated
	 * @orderd
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getXSISchemaLocation()
	 * @generated
	 * @orderd
	 */
	protected EMap<String, String> xSISchemaLocation;
} //DocumentRootImpl
