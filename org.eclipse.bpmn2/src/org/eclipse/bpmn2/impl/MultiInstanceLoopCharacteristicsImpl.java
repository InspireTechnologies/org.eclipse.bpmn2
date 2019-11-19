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
import org.eclipse.bpmn2.ComplexBehaviorDefinition;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.DataOutput;
import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.ItemAwareElement;
import org.eclipse.bpmn2.MultiInstanceBehavior;
import org.eclipse.bpmn2.MultiInstanceLoopCharacteristics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataInputRef <em>Loop Data Input Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataOutputRef <em>Loop Data Output Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#isIsSequential <em>Is Sequential</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class MultiInstanceLoopCharacteristicsImpl
	extends LoopCharacteristicsImpl
	implements MultiInstanceLoopCharacteristics
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiInstanceLoopCharacteristicsImpl()
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
	public ItemAwareElement basicGetLoopDataInputRef()
	{
		return loopDataInputRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public ItemAwareElement basicGetLoopDataOutputRef()
	{
		return loopDataOutputRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public EventDefinition basicGetNoneBehaviorEventRef()
	{
		return noneBehaviorEventRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public EventDefinition basicGetOneBehaviorEventRef()
	{
		return oneBehaviorEventRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newCompletionCondition  DOCUMENT ME!
	 * @param      msgs                    DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetCompletionCondition( final Expression newCompletionCondition, NotificationChain msgs )
	{
		final Expression oldCompletionCondition = completionCondition;
		completionCondition = newCompletionCondition;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition );

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
	 * @param      newInputDataItem  DOCUMENT ME!
	 * @param      msgs              DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetInputDataItem( final DataInput newInputDataItem, NotificationChain msgs )
	{
		final DataInput oldInputDataItem = inputDataItem;
		inputDataItem = newInputDataItem;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, oldInputDataItem, newInputDataItem );

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
	 * @param      newLoopCardinality  DOCUMENT ME!
	 * @param      msgs                DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetLoopCardinality( final Expression newLoopCardinality, NotificationChain msgs )
	{
		final Expression oldLoopCardinality = loopCardinality;
		loopCardinality = newLoopCardinality;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, oldLoopCardinality, newLoopCardinality );

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
	 * @param      newOutputDataItem  DOCUMENT ME!
	 * @param      msgs               DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetOutputDataItem( final DataOutput newOutputDataItem, NotificationChain msgs )
	{
		final DataOutput oldOutputDataItem = outputDataItem;
		outputDataItem = newOutputDataItem;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, oldOutputDataItem, newOutputDataItem );

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
			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY :
			{
				return getLoopCardinality();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF :
			{
				if( resolve )
				{
					return getLoopDataInputRef();
				}

				return basicGetLoopDataInputRef();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF :
			{
				if( resolve )
				{
					return getLoopDataOutputRef();
				}

				return basicGetLoopDataOutputRef();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM :
			{
				return getInputDataItem();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM :
			{
				return getOutputDataItem();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION :
			{
				return getComplexBehaviorDefinition();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION :
			{
				return getCompletionCondition();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR :
			{
				return getBehavior();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL :
			{
				return isIsSequential();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF :
			{
				if( resolve )
				{
					return getNoneBehaviorEventRef();
				}

				return basicGetNoneBehaviorEventRef();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF :
			{
				if( resolve )
				{
					return getOneBehaviorEventRef();
				}

				return basicGetOneBehaviorEventRef();
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
			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY :
			{
				return basicSetLoopCardinality( null, msgs );
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM :
			{
				return basicSetInputDataItem( null, msgs );
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM :
			{
				return basicSetOutputDataItem( null, msgs );
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION :
			{
				return ((InternalEList<?>) getComplexBehaviorDefinition()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION :
			{
				return basicSetCompletionCondition( null, msgs );
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
			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY :
			{
				return loopCardinality != null;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF :
			{
				return loopDataInputRef != null;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF :
			{
				return loopDataOutputRef != null;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM :
			{
				return inputDataItem != null;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM :
			{
				return outputDataItem != null;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION :
			{
				return ( complexBehaviorDefinition != null ) && ! complexBehaviorDefinition.isEmpty();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION :
			{
				return completionCondition != null;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR :
			{
				return behavior != BEHAVIOR_EDEFAULT;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL :
			{
				return isSequential != IS_SEQUENTIAL_EDEFAULT;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF :
			{
				return noneBehaviorEventRef != null;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF :
			{
				return oneBehaviorEventRef != null;
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
			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY :
			{
				setLoopCardinality((Expression) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF :
			{
				setLoopDataInputRef((ItemAwareElement) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF :
			{
				setLoopDataOutputRef((ItemAwareElement) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM :
			{
				setInputDataItem((DataInput) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM :
			{
				setOutputDataItem((DataOutput) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION :
			{
				getComplexBehaviorDefinition().clear();
				getComplexBehaviorDefinition().addAll((Collection<? extends ComplexBehaviorDefinition>) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION :
			{
				setCompletionCondition((Expression) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR :
			{
				setBehavior((MultiInstanceBehavior) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL :
			{
				setIsSequential((Boolean) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF :
			{
				setNoneBehaviorEventRef((EventDefinition) newValue );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF :
			{
				setOneBehaviorEventRef((EventDefinition) newValue );

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
			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY :
			{
				setLoopCardinality((Expression) null );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF :
			{
				setLoopDataInputRef((ItemAwareElement) null );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF :
			{
				setLoopDataOutputRef((ItemAwareElement) null );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM :
			{
				setInputDataItem((DataInput) null );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM :
			{
				setOutputDataItem((DataOutput) null );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION :
			{
				getComplexBehaviorDefinition().clear();

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION :
			{
				setCompletionCondition((Expression) null );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR :
			{
				setBehavior( BEHAVIOR_EDEFAULT );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL :
			{
				setIsSequential( IS_SEQUENTIAL_EDEFAULT );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF :
			{
				setNoneBehaviorEventRef((EventDefinition) null );

				return;
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF :
			{
				setOneBehaviorEventRef((EventDefinition) null );

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
	@Override public MultiInstanceBehavior getBehavior()
	{
		return behavior;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Expression getCompletionCondition()
	{
		return completionCondition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<ComplexBehaviorDefinition> getComplexBehaviorDefinition()
	{
		if( complexBehaviorDefinition == null )
		{
			complexBehaviorDefinition = new EObjectContainmentEList<ComplexBehaviorDefinition>( ComplexBehaviorDefinition.class, this, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION );
		}

		return complexBehaviorDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataInput getInputDataItem()
	{
		return inputDataItem;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Expression getLoopCardinality()
	{
		return loopCardinality;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ItemAwareElement getLoopDataInputRef()
	{
		if(( loopDataInputRef != null ) && loopDataInputRef.eIsProxy())
		{
			final InternalEObject oldLoopDataInputRef = (InternalEObject) loopDataInputRef;
			loopDataInputRef = (ItemAwareElement) eResolveProxy( oldLoopDataInputRef );

			if( loopDataInputRef != oldLoopDataInputRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, oldLoopDataInputRef, loopDataInputRef ));
				}
			}
		}

		return loopDataInputRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ItemAwareElement getLoopDataOutputRef()
	{
		if(( loopDataOutputRef != null ) && loopDataOutputRef.eIsProxy())
		{
			final InternalEObject oldLoopDataOutputRef = (InternalEObject) loopDataOutputRef;
			loopDataOutputRef = (ItemAwareElement) eResolveProxy( oldLoopDataOutputRef );

			if( loopDataOutputRef != oldLoopDataOutputRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, oldLoopDataOutputRef, loopDataOutputRef ));
				}
			}
		}

		return loopDataOutputRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EventDefinition getNoneBehaviorEventRef()
	{
		if(( noneBehaviorEventRef != null ) && noneBehaviorEventRef.eIsProxy())
		{
			final InternalEObject oldNoneBehaviorEventRef = (InternalEObject) noneBehaviorEventRef;
			noneBehaviorEventRef = (EventDefinition) eResolveProxy( oldNoneBehaviorEventRef );

			if( noneBehaviorEventRef != oldNoneBehaviorEventRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, oldNoneBehaviorEventRef, noneBehaviorEventRef ));
				}
			}
		}

		return noneBehaviorEventRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EventDefinition getOneBehaviorEventRef()
	{
		if(( oneBehaviorEventRef != null ) && oneBehaviorEventRef.eIsProxy())
		{
			final InternalEObject oldOneBehaviorEventRef = (InternalEObject) oneBehaviorEventRef;
			oneBehaviorEventRef = (EventDefinition) eResolveProxy( oldOneBehaviorEventRef );

			if( oneBehaviorEventRef != oldOneBehaviorEventRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, oldOneBehaviorEventRef, oneBehaviorEventRef ));
				}
			}
		}

		return oneBehaviorEventRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataOutput getOutputDataItem()
	{
		return outputDataItem;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsSequential()
	{
		return isSequential;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newBehavior  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setBehavior( final MultiInstanceBehavior newBehavior )
	{
		final MultiInstanceBehavior oldBehavior = behavior;
		behavior = ( newBehavior == null ) ? BEHAVIOR_EDEFAULT : newBehavior;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, oldBehavior, behavior ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newCompletionCondition  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setCompletionCondition( final Expression newCompletionCondition )
	{
		if( newCompletionCondition != completionCondition )
		{
			NotificationChain msgs = null;

			if( completionCondition != null )
			{
				msgs = ((InternalEObject) completionCondition ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs );
			}

			if( newCompletionCondition != null )
			{
				msgs = ((InternalEObject) newCompletionCondition ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs );
			}

			msgs = basicSetCompletionCondition( newCompletionCondition, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, newCompletionCondition, newCompletionCondition ));
		}
	} // end method setCompletionCondition

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newInputDataItem  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setInputDataItem( final DataInput newInputDataItem )
	{
		if( newInputDataItem != inputDataItem )
		{
			NotificationChain msgs = null;

			if( inputDataItem != null )
			{
				msgs = ((InternalEObject) inputDataItem ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs );
			}

			if( newInputDataItem != null )
			{
				msgs = ((InternalEObject) newInputDataItem ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs );
			}

			msgs = basicSetInputDataItem( newInputDataItem, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, newInputDataItem, newInputDataItem ));
		}
	} // end method setInputDataItem

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsSequential  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsSequential( final boolean newIsSequential )
	{
		final boolean oldIsSequential = isSequential;
		isSequential = newIsSequential;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, oldIsSequential, isSequential ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLoopCardinality  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLoopCardinality( final Expression newLoopCardinality )
	{
		if( newLoopCardinality != loopCardinality )
		{
			NotificationChain msgs = null;

			if( loopCardinality != null )
			{
				msgs = ((InternalEObject) loopCardinality ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs );
			}

			if( newLoopCardinality != null )
			{
				msgs = ((InternalEObject) newLoopCardinality ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs );
			}

			msgs = basicSetLoopCardinality( newLoopCardinality, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, newLoopCardinality, newLoopCardinality ));
		}
	} // end method setLoopCardinality

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLoopDataInputRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLoopDataInputRef( final ItemAwareElement newLoopDataInputRef )
	{
		final ItemAwareElement oldLoopDataInputRef = loopDataInputRef;
		loopDataInputRef = newLoopDataInputRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, oldLoopDataInputRef, loopDataInputRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLoopDataOutputRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLoopDataOutputRef( final ItemAwareElement newLoopDataOutputRef )
	{
		final ItemAwareElement oldLoopDataOutputRef = loopDataOutputRef;
		loopDataOutputRef = newLoopDataOutputRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, oldLoopDataOutputRef, loopDataOutputRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newNoneBehaviorEventRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setNoneBehaviorEventRef( final EventDefinition newNoneBehaviorEventRef )
	{
		final EventDefinition oldNoneBehaviorEventRef = noneBehaviorEventRef;
		noneBehaviorEventRef = newNoneBehaviorEventRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, oldNoneBehaviorEventRef, noneBehaviorEventRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newOneBehaviorEventRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setOneBehaviorEventRef( final EventDefinition newOneBehaviorEventRef )
	{
		final EventDefinition oldOneBehaviorEventRef = oneBehaviorEventRef;
		oneBehaviorEventRef = newOneBehaviorEventRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, oldOneBehaviorEventRef, oneBehaviorEventRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newOutputDataItem  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setOutputDataItem( final DataOutput newOutputDataItem )
	{
		if( newOutputDataItem != outputDataItem )
		{
			NotificationChain msgs = null;

			if( outputDataItem != null )
			{
				msgs = ((InternalEObject) outputDataItem ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs );
			}

			if( newOutputDataItem != null )
			{
				msgs = ((InternalEObject) newOutputDataItem ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs );
			}

			msgs = basicSetOutputDataItem( newOutputDataItem, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, newOutputDataItem, newOutputDataItem ));
		}
	} // end method setOutputDataItem

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
		result.append( " (behavior: " );
		result.append( behavior );
		result.append( ", isSequential: " );
		result.append( isSequential );
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
		return Bpmn2Package.Literals.MULTI_INSTANCE_LOOP_CHARACTERISTICS;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getBehavior()
	 * @generated
	 * @orderd
	 */
	protected MultiInstanceBehavior behavior = BEHAVIOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getCompletionCondition()
	 * @generated
	 * @orderd
	 */
	protected Expression completionCondition;

	/**
	 * The cached value of the '{@link #getComplexBehaviorDefinition() <em>Complex Behavior Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getComplexBehaviorDefinition()
	 * @generated
	 * @orderd
	 */
	protected EList<ComplexBehaviorDefinition> complexBehaviorDefinition;

	/**
	 * The cached value of the '{@link #getInputDataItem() <em>Input Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInputDataItem()
	 * @generated
	 * @orderd
	 */
	protected DataInput inputDataItem;

	/**
	 * The cached value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsSequential()
	 * @generated
	 * @orderd
	 */
	protected boolean isSequential = IS_SEQUENTIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopCardinality() <em>Loop Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopCardinality()
	 * @generated
	 * @orderd
	 */
	protected Expression loopCardinality;

	/**
	 * The cached value of the '{@link #getLoopDataInputRef() <em>Loop Data Input Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopDataInputRef()
	 * @generated
	 * @orderd
	 */
	protected ItemAwareElement loopDataInputRef;

	/**
	 * The cached value of the '{@link #getLoopDataOutputRef() <em>Loop Data Output Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopDataOutputRef()
	 * @generated
	 * @orderd
	 */
	protected ItemAwareElement loopDataOutputRef;

	/**
	 * The cached value of the '{@link #getNoneBehaviorEventRef() <em>None Behavior Event Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getNoneBehaviorEventRef()
	 * @generated
	 * @orderd
	 */
	protected EventDefinition noneBehaviorEventRef;

	/**
	 * The cached value of the '{@link #getOneBehaviorEventRef() <em>One Behavior Event Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOneBehaviorEventRef()
	 * @generated
	 * @orderd
	 */
	protected EventDefinition oneBehaviorEventRef;

	/**
	 * The cached value of the '{@link #getOutputDataItem() <em>Output Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutputDataItem()
	 * @generated
	 * @orderd
	 */
	protected DataOutput outputDataItem;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getBehavior()
	 * @generated
	 * @orderd
	 */
	protected static final MultiInstanceBehavior BEHAVIOR_EDEFAULT = MultiInstanceBehavior.ALL;

	/**
	 * The default value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsSequential()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_SEQUENTIAL_EDEFAULT = false;
} //MultiInstanceLoopCharacteristicsImpl
