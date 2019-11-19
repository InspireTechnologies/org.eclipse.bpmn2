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
import org.eclipse.bpmn2.InputOutputBinding;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.Operation;
import org.eclipse.bpmn2.OutputSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.InputOutputBindingImpl#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.InputOutputBindingImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.InputOutputBindingImpl#getOutputDataRef <em>Output Data Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class InputOutputBindingImpl
	extends BaseElementImpl
	implements InputOutputBinding
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputBindingImpl()
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
	public Operation basicGetOperationRef()
	{
		return operationRef;
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
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF :
			{
				return getInputDataRef();
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF :
			{
				if( resolve )
				{
					return getOperationRef();
				}

				return basicGetOperationRef();
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF :
			{
				return getOutputDataRef();
			}
		}

		return super.eGet( featureID, resolve, coreType );
	} // end method eGet

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
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF :
			{
				return inputDataRef != null;
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF :
			{
				return operationRef != null;
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF :
			{
				return outputDataRef != null;
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
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF :
			{
				setInputDataRef((InputSet) newValue );

				return;
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF :
			{
				setOperationRef((Operation) newValue );

				return;
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF :
			{
				setOutputDataRef((OutputSet) newValue );

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
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF :
			{
				setInputDataRef((InputSet) null );

				return;
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF :
			{
				setOperationRef((Operation) null );

				return;
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF :
			{
				setOutputDataRef((OutputSet) null );

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
	@Override public InputSet getInputDataRef()
	{
		return inputDataRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Operation getOperationRef()
	{
		if(( operationRef != null ) && operationRef.eIsProxy())
		{
			final InternalEObject oldOperationRef = (InternalEObject) operationRef;
			operationRef = (Operation) eResolveProxy( oldOperationRef );

			if( operationRef != oldOperationRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF, oldOperationRef, operationRef ));
				}
			}
		}

		return operationRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public OutputSet getOutputDataRef()
	{
		return outputDataRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newInputDataRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setInputDataRef( final InputSet newInputDataRef )
	{
		final InputSet oldInputDataRef = inputDataRef;
		inputDataRef = newInputDataRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, oldInputDataRef, inputDataRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newOperationRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setOperationRef( final Operation newOperationRef )
	{
		final Operation oldOperationRef = operationRef;
		operationRef = newOperationRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF, oldOperationRef, operationRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newOutputDataRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setOutputDataRef( final OutputSet newOutputDataRef )
	{
		final OutputSet oldOutputDataRef = outputDataRef;
		outputDataRef = newOutputDataRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, oldOutputDataRef, outputDataRef ));
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
	@Override protected EClass eStaticClass()
	{
		return Bpmn2Package.Literals.INPUT_OUTPUT_BINDING;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getInputDataRef() <em>Input Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInputDataRef()
	 * @generated
	 * @orderd
	 */
	protected InputSet inputDataRef;

	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOperationRef()
	 * @generated
	 * @orderd
	 */
	protected Operation operationRef;

	/**
	 * The cached value of the '{@link #getOutputDataRef() <em>Output Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutputDataRef()
	 * @generated
	 * @orderd
	 */
	protected OutputSet outputDataRef;
} //InputOutputBindingImpl
