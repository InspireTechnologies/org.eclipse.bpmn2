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
import org.eclipse.dd.di.Diagram;
import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.DocumentRoot;
import org.eclipse.dd.di.Edge;
import org.eclipse.dd.di.Label;
import org.eclipse.dd.di.LabeledEdge;
import org.eclipse.dd.di.LabeledShape;
import org.eclipse.dd.di.Node;
import org.eclipse.dd.di.Plane;
import org.eclipse.dd.di.Shape;
import org.eclipse.dd.di.Style;

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
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getDiagramElement <em>Diagram Element</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getLabeledEdge <em>Labeled Edge</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getLabeledShape <em>Labeled Shape</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
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
	 * @param      newDiagram  DOCUMENT ME!
	 * @param      msgs        DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetDiagram( final Diagram newDiagram, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDiagramElement  DOCUMENT ME!
	 * @param      msgs               DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetDiagramElement( final DiagramElement newDiagramElement, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT, newDiagramElement, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newEdge  DOCUMENT ME!
	 * @param      msgs     DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetEdge( final Edge newEdge, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__EDGE, newEdge, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabel  DOCUMENT ME!
	 * @param      msgs      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetLabel( final Label newLabel, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabeledEdge  DOCUMENT ME!
	 * @param      msgs            DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetLabeledEdge( final LabeledEdge newLabeledEdge, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE, newLabeledEdge, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabeledShape  DOCUMENT ME!
	 * @param      msgs             DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetLabeledShape( final LabeledShape newLabeledShape, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE, newLabeledShape, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newNode  DOCUMENT ME!
	 * @param      msgs     DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetNode( final Node newNode, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__NODE, newNode, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

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
	public NotificationChain basicSetPlane( final Plane newPlane, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__PLANE, newPlane, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newShape  DOCUMENT ME!
	 * @param      msgs      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetShape( final Shape newShape, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__SHAPE, newShape, msgs );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newStyle  DOCUMENT ME!
	 * @param      msgs      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetStyle( final Style newStyle, final NotificationChain msgs )
	{
		return ((FeatureMap.Internal) getMixed()).basicAdd( DiPackage.Literals.DOCUMENT_ROOT__STYLE, newStyle, msgs );
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
			case DiPackage.DOCUMENT_ROOT__MIXED :
			{
				if( coreType )
				{
					return getMixed();
				}

				return ((FeatureMap.Internal) getMixed()).getWrapper();
			}

			case DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
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

			case DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
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

			case DiPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT :
			{
				return getDiagramElement();
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM :
			{
				return getDiagram();
			}

			case DiPackage.DOCUMENT_ROOT__EDGE :
			{
				return getEdge();
			}

			case DiPackage.DOCUMENT_ROOT__LABEL :
			{
				return getLabel();
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_EDGE :
			{
				return getLabeledEdge();
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_SHAPE :
			{
				return getLabeledShape();
			}

			case DiPackage.DOCUMENT_ROOT__NODE :
			{
				return getNode();
			}

			case DiPackage.DOCUMENT_ROOT__PLANE :
			{
				return getPlane();
			}

			case DiPackage.DOCUMENT_ROOT__SHAPE :
			{
				return getShape();
			}

			case DiPackage.DOCUMENT_ROOT__STYLE :
			{
				return getStyle();
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
			case DiPackage.DOCUMENT_ROOT__MIXED :
			{
				return ((InternalEList<?>) getMixed()).basicRemove( otherEnd, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).basicRemove( otherEnd, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				return ((InternalEList<?>) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).basicRemove( otherEnd, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT :
			{
				return basicSetDiagramElement( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM :
			{
				return basicSetDiagram( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__EDGE :
			{
				return basicSetEdge( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__LABEL :
			{
				return basicSetLabel( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_EDGE :
			{
				return basicSetLabeledEdge( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_SHAPE :
			{
				return basicSetLabeledShape( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__NODE :
			{
				return basicSetNode( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__PLANE :
			{
				return basicSetPlane( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__SHAPE :
			{
				return basicSetShape( null, msgs );
			}

			case DiPackage.DOCUMENT_ROOT__STYLE :
			{
				return basicSetStyle( null, msgs );
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
			case DiPackage.DOCUMENT_ROOT__MIXED :
			{
				return ( mixed != null ) && ! mixed.isEmpty();
			}

			case DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				return ( xMLNSPrefixMap != null ) && ! xMLNSPrefixMap.isEmpty();
			}

			case DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				return ( xSISchemaLocation != null ) && ! xSISchemaLocation.isEmpty();
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT :
			{
				return getDiagramElement() != null;
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM :
			{
				return getDiagram() != null;
			}

			case DiPackage.DOCUMENT_ROOT__EDGE :
			{
				return getEdge() != null;
			}

			case DiPackage.DOCUMENT_ROOT__LABEL :
			{
				return getLabel() != null;
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_EDGE :
			{
				return getLabeledEdge() != null;
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_SHAPE :
			{
				return getLabeledShape() != null;
			}

			case DiPackage.DOCUMENT_ROOT__NODE :
			{
				return getNode() != null;
			}

			case DiPackage.DOCUMENT_ROOT__PLANE :
			{
				return getPlane() != null;
			}

			case DiPackage.DOCUMENT_ROOT__SHAPE :
			{
				return getShape() != null;
			}

			case DiPackage.DOCUMENT_ROOT__STYLE :
			{
				return getStyle() != null;
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
			case DiPackage.DOCUMENT_ROOT__MIXED :
			{
				((FeatureMap.Internal) getMixed()).set( newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXMLNSPrefixMap()).eMap()).set( newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				((EStructuralFeature.Setting) ((EMap.InternalMapView<String, String>) getXSISchemaLocation()).eMap()).set( newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT :
			{
				setDiagramElement((DiagramElement) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM :
			{
				setDiagram((Diagram) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__EDGE :
			{
				setEdge((Edge) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__LABEL :
			{
				setLabel((Label) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_EDGE :
			{
				setLabeledEdge((LabeledEdge) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_SHAPE :
			{
				setLabeledShape((LabeledShape) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__NODE :
			{
				setNode((Node) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__PLANE :
			{
				setPlane((Plane) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__SHAPE :
			{
				setShape((Shape) newValue );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__STYLE :
			{
				setStyle((Style) newValue );

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
			case DiPackage.DOCUMENT_ROOT__MIXED :
			{
				getMixed().clear();

				return;
			}

			case DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP :
			{
				getXMLNSPrefixMap().clear();

				return;
			}

			case DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION :
			{
				getXSISchemaLocation().clear();

				return;
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT :
			{
				setDiagramElement((DiagramElement) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__DIAGRAM :
			{
				setDiagram((Diagram) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__EDGE :
			{
				setEdge((Edge) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__LABEL :
			{
				setLabel((Label) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_EDGE :
			{
				setLabeledEdge((LabeledEdge) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__LABELED_SHAPE :
			{
				setLabeledShape((LabeledShape) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__NODE :
			{
				setNode((Node) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__PLANE :
			{
				setPlane((Plane) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__SHAPE :
			{
				setShape((Shape) null );

				return;
			}

			case DiPackage.DOCUMENT_ROOT__STYLE :
			{
				setStyle((Style) null );

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
	@Override public Diagram getDiagram()
	{
		return (Diagram) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DiagramElement getDiagramElement()
	{
		return (DiagramElement) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Edge getEdge()
	{
		return (Edge) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__EDGE, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Label getLabel()
	{
		return (Label) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__LABEL, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public LabeledEdge getLabeledEdge()
	{
		return (LabeledEdge) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public LabeledShape getLabeledShape()
	{
		return (LabeledShape) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE, true );
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
			mixed = new BasicFeatureMap( this, DiPackage.DOCUMENT_ROOT__MIXED );
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
	@Override public Node getNode()
	{
		return (Node) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__NODE, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Plane getPlane()
	{
		return (Plane) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__PLANE, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Shape getShape()
	{
		return (Shape) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__SHAPE, true );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Style getStyle()
	{
		return (Style) getMixed().get( DiPackage.Literals.DOCUMENT_ROOT__STYLE, true );
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
			xMLNSPrefixMap = new EcoreEMap<String, String>( EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DiPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP );
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
			xSISchemaLocation = new EcoreEMap<String, String>( EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DiPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION );
		}

		return xSISchemaLocation.map();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDiagram  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setDiagram( final Diagram newDiagram )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM, newDiagram );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDiagramElement  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setDiagramElement( final DiagramElement newDiagramElement )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT, newDiagramElement );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newEdge  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setEdge( final Edge newEdge )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__EDGE, newEdge );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabel  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLabel( final Label newLabel )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__LABEL, newLabel );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabeledEdge  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLabeledEdge( final LabeledEdge newLabeledEdge )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE, newLabeledEdge );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabeledShape  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLabeledShape( final LabeledShape newLabeledShape )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE, newLabeledShape );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newNode  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setNode( final Node newNode )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__NODE, newNode );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPlane  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setPlane( final Plane newPlane )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__PLANE, newPlane );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newShape  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setShape( final Shape newShape )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__SHAPE, newShape );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newStyle  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setStyle( final Style newStyle )
	{
		((FeatureMap.Internal) getMixed()).set( DiPackage.Literals.DOCUMENT_ROOT__STYLE, newStyle );
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
		return DiPackage.Literals.DOCUMENT_ROOT;
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
