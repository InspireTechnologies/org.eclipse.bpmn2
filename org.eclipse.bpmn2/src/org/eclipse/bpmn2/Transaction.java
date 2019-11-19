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
package org.eclipse.bpmn2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.Transaction#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Transaction#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package#getTransaction()
 * @model      extendedMetaData="name='tTransaction' kind='elementOnly'"
 * @generated
 */
public interface Transaction
	extends SubProcess
{
	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of the '<em>Method</em>' attribute isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @return     the value of the '<em>Method</em>' attribute.
	 *
	 * @see        #setMethod(String)
	 * @see        org.eclipse.bpmn2.Bpmn2Package#getTransaction_Method()
	 * @model      ordered="false" extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	String getMethod();

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of the '<em>Protocol</em>' attribute isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @return     the value of the '<em>Protocol</em>' attribute.
	 *
	 * @see        #setProtocol(String)
	 * @see        org.eclipse.bpmn2.Bpmn2Package#getTransaction_Protocol()
	 * @model      ordered="false"
	 * @generated
	 */
	String getProtocol();

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.Transaction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the new value of the '<em>Method</em>' attribute.
	 *
	 * @see        #getMethod()
	 * @generated
	 */
	void setMethod( String value );

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.Transaction#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the new value of the '<em>Protocol</em>' attribute.
	 *
	 * @see        #getProtocol()
	 * @generated
	 */
	void setProtocol( String value );
} // Transaction
