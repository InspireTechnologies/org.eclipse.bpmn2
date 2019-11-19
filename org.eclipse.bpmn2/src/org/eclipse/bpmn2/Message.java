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
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.Message#getItemRef <em>Item Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.Message#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package#getMessage()
 * @model      extendedMetaData="name='tMessage' kind='elementOnly'"
 * @generated
 */
public interface Message
	extends RootElement
{
	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the value of the '<em><b>Item Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of the '<em>Item Ref</em>' reference isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @return     the value of the '<em>Item Ref</em>' reference.
	 *
	 * @see        #setItemRef(ItemDefinition)
	 * @see        org.eclipse.bpmn2.Bpmn2Package#getMessage_ItemRef()
	 * @model      ordered="false" extendedMetaData="kind='attribute' name='itemRef'"
	 * @generated
	 */
	ItemDefinition getItemRef();

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @return     the value of the '<em>Name</em>' attribute.
	 *
	 * @see        #setName(String)
	 * @see        org.eclipse.bpmn2.Bpmn2Package#getMessage_Name()
	 * @model      ordered="false" extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.Message#getItemRef <em>Item Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the new value of the '<em>Item Ref</em>' reference.
	 *
	 * @see        #getItemRef()
	 * @generated
	 */
	void setItemRef( ItemDefinition value );

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the new value of the '<em>Name</em>' attribute.
	 *
	 * @see        #getName()
	 * @generated
	 */
	void setName( String value );
} // Message
