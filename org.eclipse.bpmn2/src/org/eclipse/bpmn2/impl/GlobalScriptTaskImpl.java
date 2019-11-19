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
import org.eclipse.bpmn2.GlobalScriptTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Script Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.GlobalScriptTaskImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.GlobalScriptTaskImpl#getScriptLanguage <em>Script Language</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class GlobalScriptTaskImpl
	extends GlobalTaskImpl
	implements GlobalScriptTask
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalScriptTaskImpl()
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
			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT :
			{
				return getScript();
			}

			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE :
			{
				return getScriptLanguage();
			}
		}

		return super.eGet( featureID, resolve, coreType );
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
			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT :
			{
				return ( SCRIPT_EDEFAULT == null ) ? ( script != null ) : ( ! SCRIPT_EDEFAULT.equals( script ));
			}

			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE :
			{
				return ( SCRIPT_LANGUAGE_EDEFAULT == null ) ? ( scriptLanguage != null ) : ( ! SCRIPT_LANGUAGE_EDEFAULT.equals( scriptLanguage ));
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
			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT :
			{
				setScript((String) newValue );

				return;
			}

			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE :
			{
				setScriptLanguage((String) newValue );

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
			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT :
			{
				setScript( SCRIPT_EDEFAULT );

				return;
			}

			case Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE :
			{
				setScriptLanguage( SCRIPT_LANGUAGE_EDEFAULT );

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
	@Override public String getScript()
	{
		return script;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getScriptLanguage()
	{
		return scriptLanguage;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newScript  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setScript( final String newScript )
	{
		final String oldScript = script;
		script = newScript;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT, oldScript, script ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newScriptLanguage  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setScriptLanguage( final String newScriptLanguage )
	{
		final String oldScriptLanguage = scriptLanguage;
		scriptLanguage = newScriptLanguage;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE, oldScriptLanguage, scriptLanguage ));
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
		result.append( " (script: " );
		result.append( script );
		result.append( ", scriptLanguage: " );
		result.append( scriptLanguage );
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
		return Bpmn2Package.Literals.GLOBAL_SCRIPT_TASK;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getScript()
	 * @generated
	 * @orderd
	 */
	protected String script = SCRIPT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getScriptLanguage()
	 * @generated
	 * @orderd
	 */
	protected String scriptLanguage = SCRIPT_LANGUAGE_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getScript()
	 * @generated
	 * @orderd
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScriptLanguage() <em>Script Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getScriptLanguage()
	 * @generated
	 * @orderd
	 */
	protected static final String SCRIPT_LANGUAGE_EDEFAULT = null;
} //GlobalScriptTaskImpl
