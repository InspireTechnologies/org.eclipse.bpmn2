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
import org.eclipse.bpmn2.TimerEventDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.TimerEventDefinitionImpl#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.TimerEventDefinitionImpl#getTimeDuration <em>Time Duration</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.TimerEventDefinitionImpl#getTimeCycle <em>Time Cycle</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class TimerEventDefinitionImpl
	extends EventDefinitionImpl
	implements TimerEventDefinition
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEventDefinitionImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTimeCycle  DOCUMENT ME!
	 * @param      msgs          DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetTimeCycle( final Expression newTimeCycle, NotificationChain msgs )
	{
		final Expression oldTimeCycle = timeCycle;
		timeCycle = newTimeCycle;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE, oldTimeCycle, newTimeCycle );

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
	 * @param      newTimeDate  DOCUMENT ME!
	 * @param      msgs         DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetTimeDate( final Expression newTimeDate, NotificationChain msgs )
	{
		final Expression oldTimeDate = timeDate;
		timeDate = newTimeDate;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE, oldTimeDate, newTimeDate );

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
	 * @param      newTimeDuration  DOCUMENT ME!
	 * @param      msgs             DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetTimeDuration( final Expression newTimeDuration, NotificationChain msgs )
	{
		final Expression oldTimeDuration = timeDuration;
		timeDuration = newTimeDuration;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION, oldTimeDuration, newTimeDuration );

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
			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE :
			{
				return getTimeDate();
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION :
			{
				return getTimeDuration();
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE :
			{
				return getTimeCycle();
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
			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE :
			{
				return basicSetTimeDate( null, msgs );
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION :
			{
				return basicSetTimeDuration( null, msgs );
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE :
			{
				return basicSetTimeCycle( null, msgs );
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
			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE :
			{
				return timeDate != null;
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION :
			{
				return timeDuration != null;
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE :
			{
				return timeCycle != null;
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
			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE :
			{
				setTimeDate((Expression) newValue );

				return;
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION :
			{
				setTimeDuration((Expression) newValue );

				return;
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE :
			{
				setTimeCycle((Expression) newValue );

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
			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE :
			{
				setTimeDate((Expression) null );

				return;
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION :
			{
				setTimeDuration((Expression) null );

				return;
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE :
			{
				setTimeCycle((Expression) null );

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
	@Override public Expression getTimeCycle()
	{
		return timeCycle;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Expression getTimeDate()
	{
		return timeDate;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Expression getTimeDuration()
	{
		return timeDuration;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTimeCycle  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTimeCycle( final Expression newTimeCycle )
	{
		if( newTimeCycle != timeCycle )
		{
			NotificationChain msgs = null;

			if( timeCycle != null )
			{
				msgs = ((InternalEObject) timeCycle ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE, null, msgs );
			}

			if( newTimeCycle != null )
			{
				msgs = ((InternalEObject) newTimeCycle ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE, null, msgs );
			}

			msgs = basicSetTimeCycle( newTimeCycle, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_CYCLE, newTimeCycle, newTimeCycle ));
		}
	} // end method setTimeCycle

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTimeDate  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTimeDate( final Expression newTimeDate )
	{
		if( newTimeDate != timeDate )
		{
			NotificationChain msgs = null;

			if( timeDate != null )
			{
				msgs = ((InternalEObject) timeDate ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE, null, msgs );
			}

			if( newTimeDate != null )
			{
				msgs = ((InternalEObject) newTimeDate ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE, null, msgs );
			}

			msgs = basicSetTimeDate( newTimeDate, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DATE, newTimeDate, newTimeDate ));
		}
	} // end method setTimeDate

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTimeDuration  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTimeDuration( final Expression newTimeDuration )
	{
		if( newTimeDuration != timeDuration )
		{
			NotificationChain msgs = null;

			if( timeDuration != null )
			{
				msgs = ((InternalEObject) timeDuration ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION, null, msgs );
			}

			if( newTimeDuration != null )
			{
				msgs = ((InternalEObject) newTimeDuration ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION, null, msgs );
			}

			msgs = basicSetTimeDuration( newTimeDuration, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.TIMER_EVENT_DEFINITION__TIME_DURATION, newTimeDuration, newTimeDuration ));
		}
	} // end method setTimeDuration

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
		return Bpmn2Package.Literals.TIMER_EVENT_DEFINITION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getTimeCycle() <em>Time Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTimeCycle()
	 * @generated
	 * @orderd
	 */
	protected Expression timeCycle;

	/**
	 * The cached value of the '{@link #getTimeDate() <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTimeDate()
	 * @generated
	 * @orderd
	 */
	protected Expression timeDate;

	/**
	 * The cached value of the '{@link #getTimeDuration() <em>Time Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTimeDuration()
	 * @generated
	 * @orderd
	 */
	protected Expression timeDuration;
} //TimerEventDefinitionImpl
