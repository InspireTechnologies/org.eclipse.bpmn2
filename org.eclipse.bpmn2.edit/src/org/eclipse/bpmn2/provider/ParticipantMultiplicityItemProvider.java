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
 *
 */
package org.eclipse.bpmn2.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.ParticipantMultiplicity;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.ParticipantMultiplicity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParticipantMultiplicityItemProvider extends BaseElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantMultiplicityItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addMaximumPropertyDescriptor(object);
            addMinimumPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Maximum feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ParticipantMultiplicity_maximum_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_ParticipantMultiplicity_maximum_feature",
                        "_UI_ParticipantMultiplicity_type"),
                Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__MAXIMUM, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Minimum feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimumPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_ParticipantMultiplicity_minimum_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_ParticipantMultiplicity_minimum_feature",
                        "_UI_ParticipantMultiplicity_type"),
                Bpmn2Package.Literals.PARTICIPANT_MULTIPLICITY__MINIMUM, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This returns ParticipantMultiplicity.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        try {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/ParticipantMultiplicity.png"));
        } catch (java.util.MissingResourceException e) {
            return overlayImage(object,
                    getResourceLocator().getImage("full/obj16/ParticipantMultiplicity.gif"));
        }
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ParticipantMultiplicity) object).getId();
        return label == null || label.length() == 0 ? getString("_UI_ParticipantMultiplicity_type")
                : getString("_UI_ParticipantMultiplicity_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(ParticipantMultiplicity.class)) {
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MAXIMUM:
        case Bpmn2Package.PARTICIPANT_MULTIPLICITY__MINIMUM:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
                    false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
