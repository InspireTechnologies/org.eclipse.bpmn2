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
import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.StandardLoopCharacteristics;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.StandardLoopCharacteristicsImpl#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.StandardLoopCharacteristicsImpl#getLoopMaximum <em>Loop Maximum</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.StandardLoopCharacteristicsImpl#isTestBefore <em>Test Before</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class StandardLoopCharacteristicsImpl
	extends LoopCharacteristicsImpl
	implements StandardLoopCharacteristics
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardLoopCharacteristicsImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLoopCondition  DOCUMENT ME!
	 * @param      msgs              DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetLoopCondition( final Expression newLoopCondition, NotificationChain msgs )
	{
		final Expression oldLoopCondition = loopCondition;
		loopCondition = newLoopCondition;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, oldLoopCondition, newLoopCondition );

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
			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION :
			{
				return getLoopCondition();
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM :
			{
				return getLoopMaximum();
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE :
			{
				return isTestBefore();
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
			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION :
			{
				return basicSetLoopCondition( null, msgs );
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
			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION :
			{
				return loopCondition != null;
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM :
			{
				return loopMaximum != LOOP_MAXIMUM_EDEFAULT;
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE :
			{
				return testBefore != TEST_BEFORE_EDEFAULT;
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
			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION :
			{
				setLoopCondition((Expression) newValue );

				return;
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM :
			{
				setLoopMaximum((Integer) newValue );

				return;
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE :
			{
				setTestBefore((Boolean) newValue );

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
			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION :
			{
				setLoopCondition((Expression) null );

				return;
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM :
			{
				setLoopMaximum( LOOP_MAXIMUM_EDEFAULT );

				return;
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE :
			{
				setTestBefore( TEST_BEFORE_EDEFAULT );

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
	@Override public Expression getLoopCondition()
	{
		return loopCondition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int getLoopMaximum()
	{
		return loopMaximum;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isTestBefore()
	{
		return testBefore;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLoopCondition  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLoopCondition( final Expression newLoopCondition )
	{
		if( newLoopCondition != loopCondition )
		{
			NotificationChain msgs = null;

			if( loopCondition != null )
			{
				msgs = ((InternalEObject) loopCondition ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, null, msgs );
			}

			if( newLoopCondition != null )
			{
				msgs = ((InternalEObject) newLoopCondition ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, null, msgs );
			}

			msgs = basicSetLoopCondition( newLoopCondition, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION, newLoopCondition, newLoopCondition ));
		}
	} // end method setLoopCondition

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLoopMaximum  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLoopMaximum( final int newLoopMaximum )
	{
		final int oldLoopMaximum = loopMaximum;
		loopMaximum = newLoopMaximum;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM, oldLoopMaximum, loopMaximum ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTestBefore  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTestBefore( final boolean newTestBefore )
	{
		final boolean oldTestBefore = testBefore;
		testBefore = newTestBefore;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE, oldTestBefore, testBefore ));
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
		result.append( " (loopMaximum: " );
		result.append( loopMaximum );
		result.append( ", testBefore: " );
		result.append( testBefore );
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
		return Bpmn2Package.Literals.STANDARD_LOOP_CHARACTERISTICS;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getLoopCondition() <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopCondition()
	 * @generated
	 * @orderd
	 */
	protected Expression loopCondition;

	/**
	 * The cached value of the '{@link #getLoopMaximum() <em>Loop Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopMaximum()
	 * @generated
	 * @orderd
	 */
	protected int loopMaximum = LOOP_MAXIMUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isTestBefore()
	 * @generated
	 * @orderd
	 */
	protected boolean testBefore = TEST_BEFORE_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getLoopMaximum() <em>Loop Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLoopMaximum()
	 * @generated
	 * @orderd
	 */
	protected static final int LOOP_MAXIMUM_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isTestBefore() <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isTestBefore()
	 * @generated
	 * @orderd
	 */
	protected static final boolean TEST_BEFORE_EDEFAULT = false;
} //StandardLoopCharacteristicsImpl
