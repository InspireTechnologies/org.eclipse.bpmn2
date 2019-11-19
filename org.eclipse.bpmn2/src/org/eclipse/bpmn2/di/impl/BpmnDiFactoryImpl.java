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

import org.eclipse.bpmn2.di.BPMNDiagram;
import org.eclipse.bpmn2.di.BPMNEdge;
import org.eclipse.bpmn2.di.BPMNLabel;
import org.eclipse.bpmn2.di.BPMNLabelStyle;
import org.eclipse.bpmn2.di.BPMNPlane;
import org.eclipse.bpmn2.di.BPMNShape;
import org.eclipse.bpmn2.di.BpmnDiFactory;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.di.DocumentRoot;
import org.eclipse.bpmn2.di.MessageVisibleKind;
import org.eclipse.bpmn2.di.ParticipantBandKind;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @author     Harald
 * @generated
 */
public class BpmnDiFactoryImpl
	extends EFactoryImpl
	implements BpmnDiFactory
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnDiFactoryImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return      DOCUMENT ME!
	 *
	 * @deprecated  DOCUMENT ME!
	 * @generated
	 */
	@Deprecated public static BpmnDiPackage getPackage()
	{
		return BpmnDiPackage.eINSTANCE;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     creates the default factory implementation.
	 *
	 * @generated
	 */
	public static BpmnDiFactory init()
	{
		try
		{
			final BpmnDiFactory theBpmnDiFactory = (BpmnDiFactory) EPackage.Registry.INSTANCE.getEFactory( "http://www.omg.org/spec/BPMN/20100524/DI" );

			if( theBpmnDiFactory != null )
			{
				return theBpmnDiFactory;
			}
		}
		catch( Exception exception )
		{
			EcorePlugin.INSTANCE.log( exception );
		}

		return new BpmnDiFactoryImpl();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertMessageVisibleKindToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertParticipantBandKindToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String convertToString( final EDataType eDataType, final Object instanceValue )
	{
		switch( eDataType.getClassifierID())
		{
			case BpmnDiPackage.MESSAGE_VISIBLE_KIND :
			{
				return convertMessageVisibleKindToString( eDataType, instanceValue );
			}

			case BpmnDiPackage.PARTICIPANT_BAND_KIND :
			{
				return convertParticipantBandKindToString( eDataType, instanceValue );
			}

			default :
			{
				throw new IllegalArgumentException( "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
			}
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eClass  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EObject create( final EClass eClass )
	{
		switch( eClass.getClassifierID())
		{
			case BpmnDiPackage.DOCUMENT_ROOT :
			{
				return createDocumentRoot();
			}

			case BpmnDiPackage.BPMN_DIAGRAM :
			{
				return createBPMNDiagram();
			}

			case BpmnDiPackage.BPMN_EDGE :
			{
				return createBPMNEdge();
			}

			case BpmnDiPackage.BPMN_LABEL :
			{
				return createBPMNLabel();
			}

			case BpmnDiPackage.BPMN_LABEL_STYLE :
			{
				return createBPMNLabelStyle();
			}

			case BpmnDiPackage.BPMN_PLANE :
			{
				return createBPMNPlane();
			}

			case BpmnDiPackage.BPMN_SHAPE :
			{
				return createBPMNShape();
			}

			default :
			{
				throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
			}
		}
	} // end method create

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNDiagram createBPMNDiagram()
	{
		final BPMNDiagramImpl bpmnDiagram = new BPMNDiagramImpl();

		return bpmnDiagram;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNEdge createBPMNEdge()
	{
		final BPMNEdgeImpl bpmnEdge = new BPMNEdgeImpl();

		return bpmnEdge;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNLabel createBPMNLabel()
	{
		final BPMNLabelImpl bpmnLabel = new BPMNLabelImpl();

		return bpmnLabel;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNLabelStyle createBPMNLabelStyle()
	{
		final BPMNLabelStyleImpl bpmnLabelStyle = new BPMNLabelStyleImpl();

		return bpmnLabelStyle;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNPlane createBPMNPlane()
	{
		final BPMNPlaneImpl bpmnPlane = new BPMNPlaneImpl();

		return bpmnPlane;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNShape createBPMNShape()
	{
		final BPMNShapeImpl bpmnShape = new BPMNShapeImpl();

		return bpmnShape;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DocumentRoot createDocumentRoot()
	{
		final DocumentRootImpl documentRoot = new DocumentRootImpl();

		return documentRoot;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Object createFromString( final EDataType eDataType, final String initialValue )
	{
		switch( eDataType.getClassifierID())
		{
			case BpmnDiPackage.MESSAGE_VISIBLE_KIND :
			{
				return createMessageVisibleKindFromString( eDataType, initialValue );
			}

			case BpmnDiPackage.PARTICIPANT_BAND_KIND :
			{
				return createParticipantBandKindFromString( eDataType, initialValue );
			}

			default :
			{
				throw new IllegalArgumentException( "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
			}
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public MessageVisibleKind createMessageVisibleKindFromString( final EDataType eDataType, final String initialValue )
	{
		final MessageVisibleKind result = MessageVisibleKind.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public ParticipantBandKind createParticipantBandKindFromString( final EDataType eDataType, final String initialValue )
	{
		final ParticipantBandKind result = ParticipantBandKind.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BpmnDiPackage getBpmnDiPackage()
	{
		return (BpmnDiPackage) getEPackage();
	}
} //BpmnDiFactoryImpl
