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
 * A representation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression()
 * @model      extendedMetaData="name='tCorrelationPropertyRetrievalExpression' kind='elementOnly'"
 * @generated
 */
public interface CorrelationPropertyRetrievalExpression
	extends BaseElement
{
	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Returns the value of the '<em><b>Message Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of the '<em>Message Path</em>' containment reference isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @return     the value of the '<em>Message Path</em>' containment reference.
	 *
	 * @see        #setMessagePath(FormalExpression)
	 * @see        org.eclipse.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression_MessagePath()
	 * @model      containment="true" required="true" ordered="false" extendedMetaData="kind='element' name='messagePath' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	FormalExpression getMessagePath();

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 *
	 * <p>If the meaning of the '<em>Message Ref</em>' reference isn't clear, there really should be more of a description here...</p>
	 * <!-- end-user-doc -->
	 * @return     the value of the '<em>Message Ref</em>' reference.
	 *
	 * @see        #setMessageRef(Message)
	 * @see        org.eclipse.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression_MessageRef()
	 * @model      required="true" ordered="false" extendedMetaData="kind='attribute' name='messageRef'"
	 * @generated
	 */
	Message getMessageRef();

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the new value of the '<em>Message Path</em>' containment reference.
	 *
	 * @see        #getMessagePath()
	 * @generated
	 */
	void setMessagePath( FormalExpression value );

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Sets the value of the '{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      value  the new value of the '<em>Message Ref</em>' reference.
	 *
	 * @see        #getMessageRef()
	 * @generated
	 */
	void setMessageRef( Message value );
} // CorrelationPropertyRetrievalExpression
