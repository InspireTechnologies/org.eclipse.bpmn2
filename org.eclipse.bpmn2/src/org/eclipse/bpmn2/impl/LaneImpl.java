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

import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.FlowNode;
import org.eclipse.bpmn2.Lane;
import org.eclipse.bpmn2.LaneSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.LaneImpl#getPartitionElement <em>Partition Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.LaneImpl#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.LaneImpl#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.LaneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.LaneImpl#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class LaneImpl
	extends BaseElementImpl
	implements Lane
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public BaseElement basicGetPartitionElementRef()
	{
		return partitionElementRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newChildLaneSet  DOCUMENT ME!
	 * @param      msgs             DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetChildLaneSet( final LaneSet newChildLaneSet, NotificationChain msgs )
	{
		final LaneSet oldChildLaneSet = childLaneSet;
		childLaneSet = newChildLaneSet;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.LANE__CHILD_LANE_SET, oldChildLaneSet, newChildLaneSet );

			if( msgs == null )
			{
				msgs = notification;
			}
			else
			{
				msgs.add( notification );
			}
		}

		return msgs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPartitionElement  DOCUMENT ME!
	 * @param      msgs                 DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetPartitionElement( final BaseElement newPartitionElement, NotificationChain msgs )
	{
		final BaseElement oldPartitionElement = partitionElement;
		partitionElement = newPartitionElement;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.LANE__PARTITION_ELEMENT, oldPartitionElement, newPartitionElement );

			if( msgs == null )
			{
				msgs = notification;
			}
			else
			{
				msgs.add( notification );
			}
		}

		return msgs;
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
			case Bpmn2Package.LANE__PARTITION_ELEMENT :
			{
				return getPartitionElement();
			}

			case Bpmn2Package.LANE__FLOW_NODE_REFS :
			{
				return getFlowNodeRefs();
			}

			case Bpmn2Package.LANE__CHILD_LANE_SET :
			{
				return getChildLaneSet();
			}

			case Bpmn2Package.LANE__NAME :
			{
				return getName();
			}

			case Bpmn2Package.LANE__PARTITION_ELEMENT_REF :
			{
				if( resolve )
				{
					return getPartitionElementRef();
				}

				return basicGetPartitionElementRef();
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
	@Override
	@SuppressWarnings( "unchecked" )
	public NotificationChain eInverseAdd( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.LANE__FLOW_NODE_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getFlowNodeRefs()).basicAdd( otherEnd, msgs );
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
			case Bpmn2Package.LANE__PARTITION_ELEMENT :
			{
				return basicSetPartitionElement( null, msgs );
			}

			case Bpmn2Package.LANE__FLOW_NODE_REFS :
			{
				return ((InternalEList<?>) getFlowNodeRefs()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.LANE__CHILD_LANE_SET :
			{
				return basicSetChildLaneSet( null, msgs );
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
			case Bpmn2Package.LANE__PARTITION_ELEMENT :
			{
				return partitionElement != null;
			}

			case Bpmn2Package.LANE__FLOW_NODE_REFS :
			{
				return ( flowNodeRefs != null ) && ! flowNodeRefs.isEmpty();
			}

			case Bpmn2Package.LANE__CHILD_LANE_SET :
			{
				return childLaneSet != null;
			}

			case Bpmn2Package.LANE__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
			}

			case Bpmn2Package.LANE__PARTITION_ELEMENT_REF :
			{
				return partitionElementRef != null;
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
	@Override
	@SuppressWarnings( "unchecked" )
	public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case Bpmn2Package.LANE__PARTITION_ELEMENT :
			{
				setPartitionElement((BaseElement) newValue );

				return;
			}

			case Bpmn2Package.LANE__FLOW_NODE_REFS :
			{
				getFlowNodeRefs().clear();
				getFlowNodeRefs().addAll((Collection<? extends FlowNode>) newValue );

				return;
			}

			case Bpmn2Package.LANE__CHILD_LANE_SET :
			{
				setChildLaneSet((LaneSet) newValue );

				return;
			}

			case Bpmn2Package.LANE__NAME :
			{
				setName((String) newValue );

				return;
			}

			case Bpmn2Package.LANE__PARTITION_ELEMENT_REF :
			{
				setPartitionElementRef((BaseElement) newValue );

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
			case Bpmn2Package.LANE__PARTITION_ELEMENT :
			{
				setPartitionElement((BaseElement) null );

				return;
			}

			case Bpmn2Package.LANE__FLOW_NODE_REFS :
			{
				getFlowNodeRefs().clear();

				return;
			}

			case Bpmn2Package.LANE__CHILD_LANE_SET :
			{
				setChildLaneSet((LaneSet) null );

				return;
			}

			case Bpmn2Package.LANE__NAME :
			{
				setName( NAME_EDEFAULT );

				return;
			}

			case Bpmn2Package.LANE__PARTITION_ELEMENT_REF :
			{
				setPartitionElementRef((BaseElement) null );

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
	@Override public LaneSet getChildLaneSet()
	{
		return childLaneSet;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<FlowNode> getFlowNodeRefs()
	{
		if( flowNodeRefs == null )
		{
			flowNodeRefs = new EObjectWithInverseEList.ManyInverse<FlowNode>( FlowNode.class, this, Bpmn2Package.LANE__FLOW_NODE_REFS, Bpmn2Package.FLOW_NODE__LANES );
		}

		return flowNodeRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getName()
	{
		return name;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BaseElement getPartitionElement()
	{
		return partitionElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BaseElement getPartitionElementRef()
	{
		if(( partitionElementRef != null ) && partitionElementRef.eIsProxy())
		{
			final InternalEObject oldPartitionElementRef = (InternalEObject) partitionElementRef;
			partitionElementRef = (BaseElement) eResolveProxy( oldPartitionElementRef );

			if( partitionElementRef != oldPartitionElementRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.LANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef ));
				}
			}
		}

		return partitionElementRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newChildLaneSet  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setChildLaneSet( final LaneSet newChildLaneSet )
	{
		if( newChildLaneSet != childLaneSet )
		{
			NotificationChain msgs = null;

			if( childLaneSet != null )
			{
				msgs = ((InternalEObject) childLaneSet ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.LANE__CHILD_LANE_SET, null, msgs );
			}

			if( newChildLaneSet != null )
			{
				msgs = ((InternalEObject) newChildLaneSet ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.LANE__CHILD_LANE_SET, null, msgs );
			}

			msgs = basicSetChildLaneSet( newChildLaneSet, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.LANE__CHILD_LANE_SET, newChildLaneSet, newChildLaneSet ));
		}
	} // end method setChildLaneSet

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newName  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setName( final String newName )
	{
		final String oldName = name;
		name = newName;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.LANE__NAME, oldName, name ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPartitionElement  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setPartitionElement( final BaseElement newPartitionElement )
	{
		if( newPartitionElement != partitionElement )
		{
			NotificationChain msgs = null;

			if( partitionElement != null )
			{
				msgs = ((InternalEObject) partitionElement ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.LANE__PARTITION_ELEMENT, null, msgs );
			}

			if( newPartitionElement != null )
			{
				msgs = ((InternalEObject) newPartitionElement ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.LANE__PARTITION_ELEMENT, null, msgs );
			}

			msgs = basicSetPartitionElement( newPartitionElement, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.LANE__PARTITION_ELEMENT, newPartitionElement, newPartitionElement ));
		}
	} // end method setPartitionElement

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newPartitionElementRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setPartitionElementRef( final BaseElement newPartitionElementRef )
	{
		final BaseElement oldPartitionElementRef = partitionElementRef;
		partitionElementRef = newPartitionElementRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.LANE__PARTITION_ELEMENT_REF, oldPartitionElementRef, partitionElementRef ));
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
		result.append( " (name: " );
		result.append( name );
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
		return Bpmn2Package.Literals.LANE;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getChildLaneSet() <em>Child Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getChildLaneSet()
	 * @generated
	 * @orderd
	 */
	protected LaneSet childLaneSet;

	/**
	 * The cached value of the '{@link #getFlowNodeRefs() <em>Flow Node Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getFlowNodeRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<FlowNode> flowNodeRefs;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartitionElement() <em>Partition Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getPartitionElement()
	 * @generated
	 * @orderd
	 */
	protected BaseElement partitionElement;

	/**
	 * The cached value of the '{@link #getPartitionElementRef() <em>Partition Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getPartitionElementRef()
	 * @generated
	 * @orderd
	 */
	protected BaseElement partitionElementRef;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected static final String NAME_EDEFAULT = null;
} //LaneImpl
