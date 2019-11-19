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
import org.eclipse.bpmn2.Choreography;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.FlowElementsContainer;
import org.eclipse.bpmn2.LaneSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ChoreographyImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ChoreographyImpl#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ChoreographyImpl
	extends CollaborationImpl
	implements Choreography
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoreographyImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      derivedFeatureID  DOCUMENT ME!
	 * @param      baseClass         DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int eBaseStructuralFeatureID( final int derivedFeatureID, final Class<?> baseClass )
	{
		if( baseClass == FlowElementsContainer.class )
		{
			switch( derivedFeatureID )
			{
				case Bpmn2Package.CHOREOGRAPHY__LANE_SETS :
				{
					return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
				}

				case Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS :
				{
					return Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
				}

				default :
				{
					return -1;
				}
			}
		}

		return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      baseFeatureID  DOCUMENT ME!
	 * @param      baseClass      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int eDerivedStructuralFeatureID( final int baseFeatureID, final Class<?> baseClass )
	{
		if( baseClass == FlowElementsContainer.class )
		{
			switch( baseFeatureID )
			{
				case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__LANE_SETS :
				{
					return Bpmn2Package.CHOREOGRAPHY__LANE_SETS;
				}

				case Bpmn2Package.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS :
				{
					return Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS;
				}

				default :
				{
					return -1;
				}
			}
		}

		return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
			case Bpmn2Package.CHOREOGRAPHY__LANE_SETS :
			{
				return getLaneSets();
			}

			case Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS :
			{
				return getFlowElements();
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
	@Override public NotificationChain eInverseRemove( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.CHOREOGRAPHY__LANE_SETS :
			{
				return ((InternalEList<?>) getLaneSets()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS :
			{
				return ((InternalEList<?>) getFlowElements()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.CHOREOGRAPHY__LANE_SETS :
			{
				return ( laneSets != null ) && ! laneSets.isEmpty();
			}

			case Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS :
			{
				return ( flowElements != null ) && ! flowElements.isEmpty();
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
			case Bpmn2Package.CHOREOGRAPHY__LANE_SETS :
			{
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>) newValue );

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS :
			{
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>) newValue );

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
			case Bpmn2Package.CHOREOGRAPHY__LANE_SETS :
			{
				getLaneSets().clear();

				return;
			}

			case Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS :
			{
				getFlowElements().clear();

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
	@Override public List<FlowElement> getFlowElements()
	{
		if( flowElements == null )
		{
			flowElements = new EObjectContainmentEList<FlowElement>( FlowElement.class, this, Bpmn2Package.CHOREOGRAPHY__FLOW_ELEMENTS );
		}

		return flowElements;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<LaneSet> getLaneSets()
	{
		if( laneSets == null )
		{
			laneSets = new EObjectContainmentEList<LaneSet>( LaneSet.class, this, Bpmn2Package.CHOREOGRAPHY__LANE_SETS );
		}

		return laneSets;
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
		return Bpmn2Package.Literals.CHOREOGRAPHY;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getFlowElements() <em>Flow Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getFlowElements()
	 * @generated
	 * @orderd
	 */
	protected EList<FlowElement> flowElements;

	/**
	 * The cached value of the '{@link #getLaneSets() <em>Lane Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLaneSets()
	 * @generated
	 * @orderd
	 */
	protected EList<LaneSet> laneSets;
} //ChoreographyImpl
