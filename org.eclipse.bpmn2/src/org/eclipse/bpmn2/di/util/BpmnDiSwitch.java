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
package org.eclipse.bpmn2.di.util;

import org.eclipse.bpmn2.di.BPMNDiagram;
import org.eclipse.bpmn2.di.BPMNEdge;
import org.eclipse.bpmn2.di.BPMNLabel;
import org.eclipse.bpmn2.di.BPMNLabelStyle;
import org.eclipse.bpmn2.di.BPMNPlane;
import org.eclipse.bpmn2.di.BPMNShape;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.di.DocumentRoot;

import org.eclipse.dd.di.Diagram;
import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.Edge;
import org.eclipse.dd.di.Label;
import org.eclipse.dd.di.LabeledEdge;
import org.eclipse.dd.di.LabeledShape;
import org.eclipse.dd.di.Node;
import org.eclipse.dd.di.Plane;
import org.eclipse.dd.di.Shape;
import org.eclipse.dd.di.Style;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model, starting with the actual class of the object and proceeding
 * up the inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.bpmn2.di.BpmnDiPackage
 * @generated
 */
public class BpmnDiSwitch<T>
	extends Switch<T>
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnDiSwitch()
	{
		if( modelPackage == null )
		{
			modelPackage = BpmnDiPackage.eINSTANCE;
		}
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>BPMN Diagram</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNDiagram( final BPMNDiagram object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>BPMN Edge</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNEdge( final BPMNEdge object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>BPMN Label</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNLabel( final BPMNLabel object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>BPMN Label Style</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNLabelStyle( final BPMNLabelStyle object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Plane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>BPMN Plane</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNPlane( final BPMNPlane object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPMN Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>BPMN Shape</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMNShape( final BPMNShape object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram( final Diagram object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement( final DiagramElement object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot( final DocumentRoot object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Edge</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge( final Edge object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Label</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel( final Label object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledEdge( final LabeledEdge object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Labeled Shape</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledShape( final LabeledShape object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Node</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode( final Node object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Plane</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlane( final Plane object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Shape</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape( final Shape object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>Style</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle( final Style object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param      object  the target of the switch.
	 *
	 * @return     the result of interpreting the object as an instance of '<em>EObject</em>'.
	 *
	 * @see        #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override public T defaultCase( final EObject object )
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      classifierID  DOCUMENT ME!
	 * @param      theEObject    DOCUMENT ME!
	 *
	 * @return     the first non-null result returned by a <code>caseXXX</code> call.
	 *
	 * @generated
	 */
	@Override protected T doSwitch( final int classifierID, final EObject theEObject )
	{
		switch( classifierID )
		{
			case BpmnDiPackage.DOCUMENT_ROOT :
			{
				final DocumentRoot documentRoot = (DocumentRoot) theEObject;
				T				   result	    = caseDocumentRoot( documentRoot );

				if( result == null )
				{
					result = defaultCase( theEObject );
				}

				return result;
			}

			case BpmnDiPackage.BPMN_DIAGRAM :
			{
				final BPMNDiagram bpmnDiagram = (BPMNDiagram) theEObject;
				T				  result	  = caseBPMNDiagram( bpmnDiagram );

				if( result == null )
				{
					result = caseDiagram( bpmnDiagram );
				}

				if( result == null )
				{
					result = defaultCase( theEObject );
				}

				return result;
			}

			case BpmnDiPackage.BPMN_EDGE :
			{
				final BPMNEdge bpmnEdge = (BPMNEdge) theEObject;
				T			   result   = caseBPMNEdge( bpmnEdge );

				if( result == null )
				{
					result = caseLabeledEdge( bpmnEdge );
				}

				if( result == null )
				{
					result = caseEdge( bpmnEdge );
				}

				if( result == null )
				{
					result = caseDiagramElement( bpmnEdge );
				}

				if( result == null )
				{
					result = defaultCase( theEObject );
				}

				return result;
			}

			case BpmnDiPackage.BPMN_LABEL :
			{
				final BPMNLabel bpmnLabel = (BPMNLabel) theEObject;
				T			    result    = caseBPMNLabel( bpmnLabel );

				if( result == null )
				{
					result = caseLabel( bpmnLabel );
				}

				if( result == null )
				{
					result = caseNode( bpmnLabel );
				}

				if( result == null )
				{
					result = caseDiagramElement( bpmnLabel );
				}

				if( result == null )
				{
					result = defaultCase( theEObject );
				}

				return result;
			}

			case BpmnDiPackage.BPMN_LABEL_STYLE :
			{
				final BPMNLabelStyle bpmnLabelStyle = (BPMNLabelStyle) theEObject;
				T					 result		    = caseBPMNLabelStyle( bpmnLabelStyle );

				if( result == null )
				{
					result = caseStyle( bpmnLabelStyle );
				}

				if( result == null )
				{
					result = defaultCase( theEObject );
				}

				return result;
			}

			case BpmnDiPackage.BPMN_PLANE :
			{
				final BPMNPlane bpmnPlane = (BPMNPlane) theEObject;
				T			    result    = caseBPMNPlane( bpmnPlane );

				if( result == null )
				{
					result = casePlane( bpmnPlane );
				}

				if( result == null )
				{
					result = caseNode( bpmnPlane );
				}

				if( result == null )
				{
					result = caseDiagramElement( bpmnPlane );
				}

				if( result == null )
				{
					result = defaultCase( theEObject );
				}

				return result;
			}

			case BpmnDiPackage.BPMN_SHAPE :
			{
				final BPMNShape bpmnShape = (BPMNShape) theEObject;
				T			    result    = caseBPMNShape( bpmnShape );

				if( result == null )
				{
					result = caseLabeledShape( bpmnShape );
				}

				if( result == null )
				{
					result = caseShape( bpmnShape );
				}

				if( result == null )
				{
					result = caseNode( bpmnShape );
				}

				if( result == null )
				{
					result = caseDiagramElement( bpmnShape );
				}

				if( result == null )
				{
					result = defaultCase( theEObject );
				}

				return result;
			}

			default :
			{
				return defaultCase( theEObject );
			}
		}
	} // end method doSwitch

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      ePackage  the package in question.
	 *
	 * @return     whether this is a switch for the given package.
	 *
	 * @generated
	 */
	@Override protected boolean isSwitchFor( final EPackage ePackage )
	{
		return ePackage == modelPackage;
	}

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpmnDiPackage modelPackage;
} //BpmnDiSwitch
