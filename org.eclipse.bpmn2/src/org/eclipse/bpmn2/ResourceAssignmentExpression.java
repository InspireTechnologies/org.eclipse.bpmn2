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
 * A representation of the model object '<em><b>Resource Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.ResourceAssignmentExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package#getResourceAssignmentExpression()
 * @model      extendedMetaData="name='tResourceAssignmentExpression' kind='elementOnly'"
 * @generated
 */
public interface ResourceAssignmentExpression
	extends BaseElement
{
	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of the '<em>Expression</em>' containment reference isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @return     the value of the '<em>Expression</em>' containment reference.
	 *
	 * @see        #setExpression(Expression)
	 * @see        org.eclipse.bpmn2.Bpmn2Package#getResourceAssignmentExpression_Expression()
	 * @model      containment="true" required="true" ordered="false" extendedMetaData="kind='element' name='expression' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getExpression();

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.ResourceAssignmentExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the new value of the '<em>Expression</em>' containment reference.
	 *
	 * @see        #getExpression()
	 * @generated
	 */
	void setExpression( Expression value );
} // ResourceAssignmentExpression
