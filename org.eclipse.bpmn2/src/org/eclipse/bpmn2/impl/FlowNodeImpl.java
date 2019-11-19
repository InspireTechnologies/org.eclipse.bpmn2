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
import org.eclipse.bpmn2.FlowNode;
import org.eclipse.bpmn2.Lane;
import org.eclipse.bpmn2.SequenceFlow;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowNodeImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.FlowNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class FlowNodeImpl
	extends FlowElementImpl
	implements FlowNode
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowNodeImpl()
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
			case Bpmn2Package.FLOW_NODE__INCOMING :
			{
				return getIncoming();
			}

			case Bpmn2Package.FLOW_NODE__LANES :
			{
				return getLanes();
			}

			case Bpmn2Package.FLOW_NODE__OUTGOING :
			{
				return getOutgoing();
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
	@Override
	@SuppressWarnings( "unchecked" )
	public NotificationChain eInverseAdd( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.FLOW_NODE__INCOMING :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.FLOW_NODE__LANES :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getLanes()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.FLOW_NODE__OUTGOING :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd( otherEnd, msgs );
			}
		}

		return super.eInverseAdd( otherEnd, featureID, msgs );
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
			case Bpmn2Package.FLOW_NODE__INCOMING :
			{
				return ((InternalEList<?>) getIncoming()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.FLOW_NODE__LANES :
			{
				return ((InternalEList<?>) getLanes()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.FLOW_NODE__OUTGOING :
			{
				return ((InternalEList<?>) getOutgoing()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.FLOW_NODE__INCOMING :
			{
				return ( incoming != null ) && ! incoming.isEmpty();
			}

			case Bpmn2Package.FLOW_NODE__LANES :
			{
				return ( lanes != null ) && ! lanes.isEmpty();
			}

			case Bpmn2Package.FLOW_NODE__OUTGOING :
			{
				return ( outgoing != null ) && ! outgoing.isEmpty();
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
			case Bpmn2Package.FLOW_NODE__INCOMING :
			{
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends SequenceFlow>) newValue );

				return;
			}

			case Bpmn2Package.FLOW_NODE__LANES :
			{
				getLanes().clear();
				getLanes().addAll((Collection<? extends Lane>) newValue );

				return;
			}

			case Bpmn2Package.FLOW_NODE__OUTGOING :
			{
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends SequenceFlow>) newValue );

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
			case Bpmn2Package.FLOW_NODE__INCOMING :
			{
				getIncoming().clear();

				return;
			}

			case Bpmn2Package.FLOW_NODE__LANES :
			{
				getLanes().clear();

				return;
			}

			case Bpmn2Package.FLOW_NODE__OUTGOING :
			{
				getOutgoing().clear();

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
	@Override public List<SequenceFlow> getIncoming()
	{
		if( incoming == null )
		{
			incoming = new EObjectWithInverseEList<SequenceFlow>( SequenceFlow.class, this, Bpmn2Package.FLOW_NODE__INCOMING, Bpmn2Package.SEQUENCE_FLOW__TARGET_REF );
		}

		return incoming;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<Lane> getLanes()
	{
		if( lanes == null )
		{
			lanes = new EObjectWithInverseResolvingEList.ManyInverse<Lane>( Lane.class, this, Bpmn2Package.FLOW_NODE__LANES, Bpmn2Package.LANE__FLOW_NODE_REFS );
		}

		return lanes;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<SequenceFlow> getOutgoing()
	{
		if( outgoing == null )
		{
			outgoing = new EObjectWithInverseEList<SequenceFlow>( SequenceFlow.class, this, Bpmn2Package.FLOW_NODE__OUTGOING, Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF );
		}

		return outgoing;
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
		return Bpmn2Package.Literals.FLOW_NODE;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getIncoming()
	 * @generated
	 * @orderd
	 */
	protected EList<SequenceFlow> incoming;

	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLanes()
	 * @generated
	 * @orderd
	 */
	protected EList<Lane> lanes;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutgoing()
	 * @generated
	 * @orderd
	 */
	protected EList<SequenceFlow> outgoing;
} //FlowNodeImpl
