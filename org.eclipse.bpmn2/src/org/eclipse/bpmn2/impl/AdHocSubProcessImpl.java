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

import org.eclipse.bpmn2.AdHocOrdering;
import org.eclipse.bpmn2.AdHocSubProcess;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad Hoc Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.AdHocSubProcessImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.AdHocSubProcessImpl#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.AdHocSubProcessImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class AdHocSubProcessImpl
	extends SubProcessImpl
	implements AdHocSubProcess
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdHocSubProcessImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

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
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition );

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
			case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION :
			{
				return getCompletionCondition();
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES :
			{
				return isCancelRemainingInstances();
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING :
			{
				return getOrdering();
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
			case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION :
			{
				return basicSetCompletionCondition( null, msgs );
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
			case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION :
			{
				return completionCondition != null;
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES :
			{
				return cancelRemainingInstances != CANCEL_REMAINING_INSTANCES_EDEFAULT;
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING :
			{
				return ordering != ORDERING_EDEFAULT;
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
			case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION :
			{
				setCompletionCondition((Expression) newValue );

				return;
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES :
			{
				setCancelRemainingInstances((Boolean) newValue );

				return;
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING :
			{
				setOrdering((AdHocOrdering) newValue );

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
			case Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION :
			{
				setCompletionCondition((Expression) null );

				return;
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES :
			{
				setCancelRemainingInstances( CANCEL_REMAINING_INSTANCES_EDEFAULT );

				return;
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING :
			{
				setOrdering( ORDERING_EDEFAULT );

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
	@Override public AdHocOrdering getOrdering()
	{
		return ordering;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isCancelRemainingInstances()
	{
		return cancelRemainingInstances;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newCancelRemainingInstances  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setCancelRemainingInstances( final boolean newCancelRemainingInstances )
	{
		final boolean oldCancelRemainingInstances = cancelRemainingInstances;
		cancelRemainingInstances = newCancelRemainingInstances;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES, oldCancelRemainingInstances, cancelRemainingInstances ));
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
				msgs = ((InternalEObject) completionCondition ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, null, msgs );
			}

			if( newCompletionCondition != null )
			{
				msgs = ((InternalEObject) newCompletionCondition ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, null, msgs );
			}

			msgs = basicSetCompletionCondition( newCompletionCondition, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.AD_HOC_SUB_PROCESS__COMPLETION_CONDITION, newCompletionCondition, newCompletionCondition ));
		}
	} // end method setCompletionCondition

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newOrdering  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setOrdering( final AdHocOrdering newOrdering )
	{
		final AdHocOrdering oldOrdering = ordering;
		ordering = ( newOrdering == null ) ? ORDERING_EDEFAULT : newOrdering;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.AD_HOC_SUB_PROCESS__ORDERING, oldOrdering, ordering ));
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
		result.append( " (cancelRemainingInstances: " );
		result.append( cancelRemainingInstances );
		result.append( ", ordering: " );
		result.append( ordering );
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
		return Bpmn2Package.Literals.AD_HOC_SUB_PROCESS;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isCancelRemainingInstances()
	 * @generated
	 * @orderd
	 */
	protected boolean cancelRemainingInstances = CANCEL_REMAINING_INSTANCES_EDEFAULT;

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
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOrdering()
	 * @generated
	 * @orderd
	 */
	protected AdHocOrdering ordering = ORDERING_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #isCancelRemainingInstances() <em>Cancel Remaining Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isCancelRemainingInstances()
	 * @generated
	 * @orderd
	 */
	protected static final boolean CANCEL_REMAINING_INSTANCES_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOrdering()
	 * @generated
	 * @orderd
	 */
	protected static final AdHocOrdering ORDERING_EDEFAULT = AdHocOrdering.PARALLEL;
} //AdHocSubProcessImpl
