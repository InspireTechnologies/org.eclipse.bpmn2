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
import org.eclipse.dd.di.Style;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.dd.di.impl.StyleImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public abstract class StyleImpl extends EObjectImpl implements Style {
    //~ Constructors ...........................................................................................................................................................................................................................................

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StyleImpl() {
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
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case DiPackage.STYLE__ID: {
            return getId();
        }
        }

        return super.eGet(featureID, resolve, coreType);
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
        case DiPackage.STYLE__ID: {
            return (ID_EDEFAULT == null) ? (id != null) : (!ID_EDEFAULT.equals(id));
        }
        }

        return super.eIsSet(featureID);
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
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case DiPackage.STYLE__ID: {
            setId((String) newValue);

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
        case DiPackage.STYLE__ID: {
            setId(ID_EDEFAULT);

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
    public String getId() {
        return id;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DiPackage.STYLE__ID, oldId, id));
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
        return DiPackage.Literals.STYLE;
    }

    //~ Instance variables .....................................................................................................................................................................................................................................

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see        #getId()
     * @generated
     * @orderd
     */
    protected String id = EcoreUtil.generateUUID();

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
} //StyleImpl
