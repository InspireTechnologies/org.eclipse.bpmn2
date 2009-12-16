/**
 *  Copyright (c) 2000-2009, Intalio Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *  Contributors:
 *     Intalio Inc. - initial API and implementation
 *
 * $Id$
 */
package org.eclipse.mdt.bpmn.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

import org.eclipse.mdt.bpmn.di.diPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.mdt.bpmn.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends CallableElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider,
        ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessItemProvider(AdapterFactory adapterFactory) {
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

            addSupportsPropertyDescriptor(object);
            addDefinitionalCollaborationRefPropertyDescriptor(object);
            addIsClosedPropertyDescriptor(object);
            addProcessTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Supports feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSupportsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_supports_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_supports_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getProcess_Supports(), true,
                        false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Definitional Collaboration Ref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefinitionalCollaborationRefPropertyDescriptor(
            Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_definitionalCollaborationRef_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_definitionalCollaborationRef_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE
                                .getProcess_DefinitionalCollaborationRef(),
                        true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Is Closed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsClosedPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_isClosed_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_isClosed_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getProcess_IsClosed(), true,
                        false, false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Process Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcessTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(
                        ((ComposeableAdapterFactory) adapterFactory)
                                .getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Process_processType_feature"), //$NON-NLS-1$
                        getString(
                                "_UI_PropertyDescriptor_description", "_UI_Process_processType_feature", "_UI_Process_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        bpmnPackage.eINSTANCE.getProcess_ProcessType(), true,
                        false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(
            Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(bpmnPackage.eINSTANCE.getProcess_Auditing());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getProcess_Monitoring());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getProcess_Property());
            childrenFeatures.add(bpmnPackage.eINSTANCE.getProcess_LaneSet());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getProcess_FlowElementGroup());
            childrenFeatures.add(bpmnPackage.eINSTANCE
                    .getProcess_ArtifactGroup());
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Process.png.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage(
                "full/obj16/Process.png")); //$NON-NLS-1$
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((org.eclipse.mdt.bpmn.Process) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Process_type") : //$NON-NLS-1$
                getString("_UI_Process_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch (notification.getFeatureID(org.eclipse.mdt.bpmn.Process.class)) {
        case bpmnPackage.PROCESS__SUPPORTS:
        case bpmnPackage.PROCESS__DEFINITIONAL_COLLABORATION_REF:
        case bpmnPackage.PROCESS__IS_CLOSED:
        case bpmnPackage.PROCESS__PROCESS_TYPE:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), false, true));
            return;
        case bpmnPackage.PROCESS__AUDITING:
        case bpmnPackage.PROCESS__MONITORING:
        case bpmnPackage.PROCESS__PROPERTY:
        case bpmnPackage.PROCESS__LANE_SET:
        case bpmnPackage.PROCESS__FLOW_ELEMENT_GROUP:
        case bpmnPackage.PROCESS__ARTIFACT_GROUP:
            fireNotifyChanged(new ViewerNotification(notification, notification
                    .getNotifier(), true, false));
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
    protected void collectNewChildDescriptors(
            Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getProcess_Auditing(), bpmnFactory.eINSTANCE
                        .createAuditing()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_Monitoring(), bpmnFactory.eINSTANCE
                .createMonitoring()));

        newChildDescriptors
                .add(createChildParameter(bpmnPackage.eINSTANCE
                        .getProcess_Property(), bpmnFactory.eINSTANCE
                        .createProperty()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_LaneSet(), bpmnFactory.eINSTANCE.createLaneSet()));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_FlowElement(),
                bpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_AdHocSubProcess(),
                bpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_BoundaryEvent(),
                bpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_BusinessRuleTask(),
                bpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_CallActivity(),
                bpmnFactory.eINSTANCE.createCallActivity())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity(),
                bpmnFactory.eINSTANCE.createCallChoreographyActivity())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ChoreographySubProcess(),
                bpmnFactory.eINSTANCE.createChoreographySubProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ChoreographyTask(),
                bpmnFactory.eINSTANCE.createChoreographyTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ComplexGateway(),
                bpmnFactory.eINSTANCE.createComplexGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_DataObject(),
                bpmnFactory.eINSTANCE.createDataObject())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_DataStoreReference(),
                bpmnFactory.eINSTANCE.createDataStoreReference())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EndEvent(),
                bpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                bpmnFactory.eINSTANCE.createBoundaryEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                bpmnFactory.eINSTANCE.createEndEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                bpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                bpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                bpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Event(),
                bpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_EventBasedGateway(),
                bpmnFactory.eINSTANCE.createEventBasedGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ExclusiveGateway(),
                bpmnFactory.eINSTANCE.createExclusiveGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(),
                bpmnFactory.eINSTANCE.createImplicitThrowEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_InclusiveGateway(),
                bpmnFactory.eINSTANCE.createInclusiveGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(),
                bpmnFactory.eINSTANCE.createIntermediateCatchEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(),
                bpmnFactory.eINSTANCE.createIntermediateThrowEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ManualTask(),
                bpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ParallelGateway(),
                bpmnFactory.eINSTANCE.createParallelGateway())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ReceiveTask(),
                bpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ScriptTask(),
                bpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_SendTask(),
                bpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_SequenceFlow(),
                bpmnFactory.eINSTANCE.createSequenceFlow())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_ServiceTask(),
                bpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_StartEvent(),
                bpmnFactory.eINSTANCE.createStartEvent())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(),
                bpmnFactory.eINSTANCE.createSubProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_SubProcess(),
                bpmnFactory.eINSTANCE.createAdHocSubProcess())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createBusinessRuleTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createManualTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createReceiveTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createScriptTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createSendTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createServiceTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Task(),
                bpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Transaction(),
                bpmnFactory.eINSTANCE.createTransaction())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_FlowElementGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_UserTask(),
                bpmnFactory.eINSTANCE.createUserTask())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_Artifact(),
                bpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_Artifact(),
                bpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getProcess_Artifact(),
                bpmnFactory.eINSTANCE.createTextAnnotation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Association(),
                bpmnFactory.eINSTANCE.createAssociation())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_Group(),
                bpmnFactory.eINSTANCE.createGroup())));

        newChildDescriptors.add(createChildParameter(bpmnPackage.eINSTANCE
                .getProcess_ArtifactGroup(), FeatureMapUtil.createEntry(
                bpmnPackage.eINSTANCE.getDocumentRoot_TextAnnotation(),
                bpmnFactory.eINSTANCE.createTextAnnotation())));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature,
            Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature
                && FeatureMapUtil
                        .isFeatureMap((EStructuralFeature) childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry) childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify = childFeature == diPackage.Literals.DOCUMENT_ROOT__CONNECTOR
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__VIEW
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__DIAGRAM
                || childFeature == diPackage.Literals.DOCUMENT_ROOT__NODE
                || childFeature == bpmnPackage.eINSTANCE
                        .getProcess_FlowElement()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SubProcess()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_AdHocSubProcess()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BoundaryEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Event()
                || childFeature == bpmnPackage.eINSTANCE.getDocumentRoot_Task()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_BusinessRuleTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallActivity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_CallChoreographyActivity()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographySubProcess()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ChoreographyTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ComplexGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataObject()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_DataStoreReference()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EndEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_EventBasedGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ExclusiveGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ImplicitThrowEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_InclusiveGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_IntermediateCatchEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_IntermediateThrowEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ManualTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ParallelGateway()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ReceiveTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ScriptTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SendTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_SequenceFlow()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_ServiceTask()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_StartEvent()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Transaction()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_UserTask()
                || childFeature == bpmnPackage.eINSTANCE.getProcess_Artifact()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Association()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_Group()
                || childFeature == bpmnPackage.eINSTANCE
                        .getDocumentRoot_TextAnnotation();

        if (qualify) {
            return getString("_UI_CreateChild_text2", //$NON-NLS-1$
                    new Object[] { getTypeText(childObject),
                            getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}