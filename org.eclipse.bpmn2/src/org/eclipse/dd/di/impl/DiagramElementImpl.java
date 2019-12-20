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
package org.eclipse.dd.di.impl;

import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.Diagram;
import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.Style;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.dd.di.impl.DiagramElementImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class DiagramElementImpl extends EObjectImpl implements DiagramElement {
    //~ Constructors ...........................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramElementImpl() {
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
    public Object basicGetModelElement() {
        return modelElement;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    public Style basicGetStyle() {
        return style;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param      newOwningElement  DOCUMENT ME!
     * @param      msgs              DOCUMENT ME!
     *
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    public NotificationChain basicSetOwningElement(final DiagramElement newOwningElement,
            NotificationChain msgs) {
        final DiagramElement oldOwningElement = owningElement;
        owningElement = newOwningElement;

        if (eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT, oldOwningElement, newOwningElement);

            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
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
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM: {
            return getOwningDiagram();
        }

        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT: {
            return getOwningElement();
        }

        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT: {
            return getOwnedElement();
        }

        case DiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT: {
            if (resolve) {
                return getModelElement();
            }

            return basicGetModelElement();
        }

        case DiPackage.DIAGRAM_ELEMENT__STYLE: {
            if (resolve) {
                return getStyle();
            }

            return basicGetStyle();
        }

        case DiPackage.DIAGRAM_ELEMENT__ID: {
            return getId();
        }

        case DiPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE: {
            if (coreType) {
                return getAnyAttribute();
            }

            return ((FeatureMap.Internal) getAnyAttribute()).getWrapper();
        }
        }

        return super.eGet(featureID, resolve, coreType);
    } // end method eGet

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
    @Override
    @SuppressWarnings("unchecked")
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            NotificationChain msgs) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT: {
            if (owningElement != null) {
                msgs = ((InternalEObject) owningElement).eInverseRemove(this,
                        DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT, DiagramElement.class, msgs);
            }

            return basicSetOwningElement((DiagramElement) otherEnd, msgs);
        }

        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT: {
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedElement())
                    .basicAdd(otherEnd, msgs);
        }
        }

        return super.eInverseAdd(otherEnd, featureID, msgs);
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
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT: {
            return basicSetOwningElement(null, msgs);
        }

        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT: {
            return ((InternalEList<?>) getOwnedElement()).basicRemove(otherEnd, msgs);
        }

        case DiPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE: {
            return ((InternalEList<?>) getAnyAttribute()).basicRemove(otherEnd, msgs);
        }
        }

        return super.eInverseRemove(otherEnd, featureID, msgs);
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
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM: {
            return getOwningDiagram() != null;
        }

        case DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT: {
            return owningElement != null;
        }

        case DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT: {
            return (ownedElement != null) && !ownedElement.isEmpty();
        }

        case DiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT: {
            return modelElement != null;
        }

        case DiPackage.DIAGRAM_ELEMENT__STYLE: {
            return style != null;
        }

        case DiPackage.DIAGRAM_ELEMENT__ID: {
            return (ID_EDEFAULT == null) ? (id != null) : (!ID_EDEFAULT.equals(id));
        }

        case DiPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE: {
            return (anyAttribute != null) && !anyAttribute.isEmpty();
        }
        }

        return super.eIsSet(featureID);
    } // end method eIsSet

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param      featureID  DOCUMENT ME!
     * @param      newValue   DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__ID: {
            setId((String) newValue);

            return;
        }

        case DiPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE: {
            ((FeatureMap.Internal) getAnyAttribute()).set(newValue);

            return;
        }
        }

        super.eSet(featureID, newValue);
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param      featureID  DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case DiPackage.DIAGRAM_ELEMENT__ID: {
            setId(ID_EDEFAULT);

            return;
        }

        case DiPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE: {
            getAnyAttribute().clear();

            return;
        }
        }

        super.eUnset(featureID);
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public FeatureMap getAnyAttribute() {
        if (anyAttribute == null) {
            anyAttribute = new BasicFeatureMap(this, DiPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE);
        }

        return anyAttribute;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public String getId() {
        return id;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public Object getModelElement() {
        if ((modelElement != null) && modelElement.eIsProxy()) {
            final InternalEObject oldModelElement = (InternalEObject) modelElement;
            modelElement = eResolveProxy(oldModelElement);

            if (modelElement != oldModelElement) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            DiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT, oldModelElement,
                            modelElement));
                }
            }
        }

        return modelElement;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public List<DiagramElement> getOwnedElement() {
        if (ownedElement == null) {
            ownedElement = new EObjectWithInverseEList<DiagramElement>(DiagramElement.class, this,
                    DiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT,
                    DiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT);
        }

        return ownedElement;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated  NOT
     */
    @Override
    public Diagram getOwningDiagram() {
        final EObject container = eContainer();

        if (container instanceof Diagram) {
            return (Diagram) container;
        }

        return null;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public DiagramElement getOwningElement() {
        return owningElement;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return     DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public Style getStyle() {
        if ((style != null) && style.eIsProxy()) {
            final InternalEObject oldStyle = (InternalEObject) style;
            style = (Style) eResolveProxy(oldStyle);

            if (style != oldStyle) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            DiPackage.DIAGRAM_ELEMENT__STYLE, oldStyle, style));
                }
            }
        }

        return style;
    }

    //~ ........................................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param      newId  DOCUMENT ME!
     *
     * @generated
     */
    @Override
    public void setId(final String newId) {
        final String oldId = id;
        id = newId;

        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, DiPackage.DIAGRAM_ELEMENT__ID,
                    oldId, id));
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
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        final StringBuilder result = new StringBuilder(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", anyAttribute: ");
        result.append(anyAttribute);
        result.append(')');

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
    @Override
    protected EClass eStaticClass() {
        return DiPackage.Literals.DIAGRAM_ELEMENT;
    }

    //~ Instance variables .....................................................................................................................................................................................................................................

    /**
     * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getAnyAttribute()
     * @generated
     * @orderd
     */
    protected FeatureMap anyAttribute;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getId()
     * @generated
     * @orderd
     */
    protected String id = EcoreUtil.generateUUID();

    /**
     * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getModelElement()
     * @generated
     * @orderd
     */
    protected EObject modelElement;

    /**
     * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getOwnedElement()
     * @generated
     * @orderd
     */
    protected EList<DiagramElement> ownedElement;

    /**
     * The cached value of the '{@link #getOwningElement() <em>Owning Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getOwningElement()
     * @generated
     * @orderd
     */
    protected DiagramElement owningElement;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getStyle()
     * @generated
     * @orderd
     */
    protected Style style;

    //~ Static variables/initializers ..........................................................................................................................................................................................................................

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getId()
     * @generated
     * @orderd
     */
    protected static final String ID_EDEFAULT = null;
} //DiagramElementImpl
