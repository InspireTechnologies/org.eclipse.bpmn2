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
package org.eclipse.dd.di.util;

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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.dd.di.DiPackage
 * @generated
 */
public class DiValidator
	extends EObjectValidator
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiValidator()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     the resource locator that will be used to fetch messages for this validator's diagnostics.
	 *
	 * @generated
	 */
	@Override public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      diagram      DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateDiagram( final Diagram diagram, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( diagram, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      diagramElement  DOCUMENT ME!
	 * @param      diagnostics     DOCUMENT ME!
	 * @param      context         DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateDiagramElement( final DiagramElement diagramElement, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( diagramElement, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      documentRoot  DOCUMENT ME!
	 * @param      diagnostics   DOCUMENT ME!
	 * @param      context       DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateDocumentRoot( final DocumentRoot documentRoot, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( documentRoot, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      edge         DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateEdge( final Edge edge, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( edge, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      label        DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateLabel( final Label label, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( label, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      labeledEdge  DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateLabeledEdge( final LabeledEdge labeledEdge, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( labeledEdge, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      labeledShape  DOCUMENT ME!
	 * @param      diagnostics   DOCUMENT ME!
	 * @param      context       DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateLabeledShape( final LabeledShape labeledShape, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( labeledShape, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      node         DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateNode( final Node node, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( node, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      plane        DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validatePlane( final Plane plane, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		if( ! validate_NoCircularContainment( plane, diagnostics, context ))
		{
			return false;
		}

		boolean result = validate_EveryMultiplicityConforms( plane, diagnostics, context );

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryDataValueConforms( plane, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryReferenceIsContained( plane, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryBidirectionalReferenceIsPaired( plane, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryProxyResolves( plane, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_UniqueID( plane, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryKeyUnique( plane, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validate_EveryMapEntryUnique( plane, diagnostics, context );
		}

		if( result || ( diagnostics != null ))
		{
			result &= validatePlane_plane_element_type( plane, diagnostics, context );
		}

		return result;
	} // end method validatePlane

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Validates the plane_element_type constraint of '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      plane        DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     validates the plane_element_type constraint of '<em>Plane</em>'.
	 *
	 * @generated
	 */
	public boolean validatePlane_plane_element_type( final Plane plane, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return plane.plane_element_type( diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      shape        DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateShape( final Shape shape, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( shape, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      style        DOCUMENT ME!
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public boolean validateStyle( final Style style, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		return validate_EveryDefaultConstraint( style, diagnostics, context );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     the package of this validator switch.
	 *
	 * @generated
	 */
	@Override protected EPackage getEPackage()
	{
		return DiPackage.eINSTANCE;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      classifierID  DOCUMENT ME!
	 * @param      value         DOCUMENT ME!
	 * @param      diagnostics   DOCUMENT ME!
	 * @param      context       DOCUMENT ME!
	 *
	 * @return     calls <code>validateXXX</code> for the corresponding classifier of the model.
	 *
	 * @generated
	 */
	@Override protected boolean validate( final int classifierID, final Object value, final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		switch( classifierID )
		{
			case DiPackage.DOCUMENT_ROOT :
			{
				return validateDocumentRoot((DocumentRoot) value, diagnostics, context );
			}

			case DiPackage.DIAGRAM :
			{
				return validateDiagram((Diagram) value, diagnostics, context );
			}

			case DiPackage.DIAGRAM_ELEMENT :
			{
				return validateDiagramElement((DiagramElement) value, diagnostics, context );
			}

			case DiPackage.EDGE :
			{
				return validateEdge((Edge) value, diagnostics, context );
			}

			case DiPackage.LABEL :
			{
				return validateLabel((Label) value, diagnostics, context );
			}

			case DiPackage.LABELED_EDGE :
			{
				return validateLabeledEdge((LabeledEdge) value, diagnostics, context );
			}

			case DiPackage.LABELED_SHAPE :
			{
				return validateLabeledShape((LabeledShape) value, diagnostics, context );
			}

			case DiPackage.NODE :
			{
				return validateNode((Node) value, diagnostics, context );
			}

			case DiPackage.PLANE :
			{
				return validatePlane((Plane) value, diagnostics, context );
			}

			case DiPackage.SHAPE :
			{
				return validateShape((Shape) value, diagnostics, context );
			}

			case DiPackage.STYLE :
			{
				return validateStyle((Style) value, diagnostics, context );
			}

			default :
			{
				return true;
			}
		}
	} // end method validate

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DiValidator INSTANCE = new DiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see        org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.dd.di";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plane element type' of 'Plane'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANE__PLANE_ELEMENT_TYPE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;
} //DiValidator
