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

import java.util.List;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.CallActivity;
import org.eclipse.bpmn2.CallableElement;
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.util.Bpmn2Resource;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.CallActivityImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CallActivityImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.CallActivityImpl#getCalledElementRef <em>Called Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallActivityImpl extends ActivityImpl implements CallActivity {
    /**
     * The cached value of the '{@link #getCalledElementRef() <em>Called Element Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalledElementRef()
     * @generated
     * @ordered
     */
    protected CallableElement calledElementRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CallActivityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Bpmn2Package.Literals.CALL_ACTIVITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public List<ConversationLink> getIncomingConversationLinks() {
        if (eResource() instanceof Bpmn2Resource) {
            return ((Bpmn2Resource) eResource()).getOppositeReferenceAdapter().getOppositeList(
                    ConversationLink.class, this,
                    Bpmn2Package.Literals.CONVERSATION_LINK__TARGET_REF);
        }
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public List<ConversationLink> getOutgoingConversationLinks() {
        if (eResource() instanceof Bpmn2Resource) {
            return ((Bpmn2Resource) eResource()).getOppositeReferenceAdapter().getOppositeList(
                    ConversationLink.class, this,
                    Bpmn2Package.Literals.CONVERSATION_LINK__SOURCE_REF);
        }
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableElement getCalledElementRef() {
        if (calledElementRef != null && calledElementRef.eIsProxy()) {
            InternalEObject oldCalledElementRef = (InternalEObject) calledElementRef;
            calledElementRef = (CallableElement) eResolveProxy(oldCalledElementRef);
            if (calledElementRef != oldCalledElementRef) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF, oldCalledElementRef,
                            calledElementRef));
            }
        }
        return calledElementRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableElement basicGetCalledElementRef() {
        return calledElementRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCalledElementRef(CallableElement newCalledElementRef) {
        CallableElement oldCalledElementRef = calledElementRef;
        calledElementRef = newCalledElementRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF, oldCalledElementRef,
                    calledElementRef));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case Bpmn2Package.CALL_ACTIVITY__INCOMING_CONVERSATION_LINKS:
            return getIncomingConversationLinks();
        case Bpmn2Package.CALL_ACTIVITY__OUTGOING_CONVERSATION_LINKS:
            return getOutgoingConversationLinks();
        case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
            if (resolve)
                return getCalledElementRef();
            return basicGetCalledElementRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
            setCalledElementRef((CallableElement) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
            setCalledElementRef((CallableElement) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case Bpmn2Package.CALL_ACTIVITY__INCOMING_CONVERSATION_LINKS:
            return !getIncomingConversationLinks().isEmpty();
        case Bpmn2Package.CALL_ACTIVITY__OUTGOING_CONVERSATION_LINKS:
            return !getOutgoingConversationLinks().isEmpty();
        case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
            return calledElementRef != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == InteractionNode.class) {
            switch (derivedFeatureID) {
            case Bpmn2Package.CALL_ACTIVITY__INCOMING_CONVERSATION_LINKS:
                return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.CALL_ACTIVITY__OUTGOING_CONVERSATION_LINKS:
                return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == InteractionNode.class) {
            switch (baseFeatureID) {
            case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS:
                return Bpmn2Package.CALL_ACTIVITY__INCOMING_CONVERSATION_LINKS;
            case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS:
                return Bpmn2Package.CALL_ACTIVITY__OUTGOING_CONVERSATION_LINKS;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //CallActivityImpl
