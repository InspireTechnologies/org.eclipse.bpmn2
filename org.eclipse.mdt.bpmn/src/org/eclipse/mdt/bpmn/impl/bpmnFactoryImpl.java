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
package org.eclipse.mdt.bpmn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdt.bpmn.ActivityResource;
import org.eclipse.mdt.bpmn.AdHocOrdering;
import org.eclipse.mdt.bpmn.AdHocSubProcess;
import org.eclipse.mdt.bpmn.Assignment;
import org.eclipse.mdt.bpmn.Association;
import org.eclipse.mdt.bpmn.AssociationDirection;
import org.eclipse.mdt.bpmn.Auditing;
import org.eclipse.mdt.bpmn.BoundaryEvent;
import org.eclipse.mdt.bpmn.BusinessRuleTask;
import org.eclipse.mdt.bpmn.CallActivity;
import org.eclipse.mdt.bpmn.CallChoreographyActivity;
import org.eclipse.mdt.bpmn.CallConversation;
import org.eclipse.mdt.bpmn.CallableElement;
import org.eclipse.mdt.bpmn.CancelEventDefinition;
import org.eclipse.mdt.bpmn.Category;
import org.eclipse.mdt.bpmn.CategoryValue;
import org.eclipse.mdt.bpmn.Choreography;
import org.eclipse.mdt.bpmn.ChoreographySubProcess;
import org.eclipse.mdt.bpmn.ChoreographyTask;
import org.eclipse.mdt.bpmn.Collaboration;
import org.eclipse.mdt.bpmn.Communication;
import org.eclipse.mdt.bpmn.CompensateEventDefinition;
import org.eclipse.mdt.bpmn.ComplexBehaviorDefinition;
import org.eclipse.mdt.bpmn.ComplexGateway;
import org.eclipse.mdt.bpmn.ConditionalEventDefinition;
import org.eclipse.mdt.bpmn.Conversation;
import org.eclipse.mdt.bpmn.ConversationAssociation;
import org.eclipse.mdt.bpmn.CorrelationKey;
import org.eclipse.mdt.bpmn.CorrelationProperty;
import org.eclipse.mdt.bpmn.CorrelationPropertyBinding;
import org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression;
import org.eclipse.mdt.bpmn.CorrelationSubscription;
import org.eclipse.mdt.bpmn.DataInput;
import org.eclipse.mdt.bpmn.DataInputAssociation;
import org.eclipse.mdt.bpmn.DataObject;
import org.eclipse.mdt.bpmn.DataOutput;
import org.eclipse.mdt.bpmn.DataOutputAssociation;
import org.eclipse.mdt.bpmn.DataState;
import org.eclipse.mdt.bpmn.DataStore;
import org.eclipse.mdt.bpmn.DataStoreReference;
import org.eclipse.mdt.bpmn.Definitions;
import org.eclipse.mdt.bpmn.DocumentRoot;
import org.eclipse.mdt.bpmn.Documentation;
import org.eclipse.mdt.bpmn.EndEvent;
import org.eclipse.mdt.bpmn.EndPoint;
import org.eclipse.mdt.bpmn.ErrorEventDefinition;
import org.eclipse.mdt.bpmn.Escalation;
import org.eclipse.mdt.bpmn.EscalationEventDefinition;
import org.eclipse.mdt.bpmn.EventBasedGateway;
import org.eclipse.mdt.bpmn.EventBasedGatewayType;
import org.eclipse.mdt.bpmn.ExclusiveGateway;
import org.eclipse.mdt.bpmn.Expression;
import org.eclipse.mdt.bpmn.Extension;
import org.eclipse.mdt.bpmn.FormalExpression;
import org.eclipse.mdt.bpmn.Gateway;
import org.eclipse.mdt.bpmn.GatewayDirection;
import org.eclipse.mdt.bpmn.GlobalBusinessRuleTask;
import org.eclipse.mdt.bpmn.GlobalChoreographyTask;
import org.eclipse.mdt.bpmn.GlobalCommunication;
import org.eclipse.mdt.bpmn.GlobalManualTask;
import org.eclipse.mdt.bpmn.GlobalScriptTask;
import org.eclipse.mdt.bpmn.GlobalTask;
import org.eclipse.mdt.bpmn.GlobalUserTask;
import org.eclipse.mdt.bpmn.Group;
import org.eclipse.mdt.bpmn.HumanPerformer;
import org.eclipse.mdt.bpmn.ImplicitThrowEvent;
import org.eclipse.mdt.bpmn.Import;
import org.eclipse.mdt.bpmn.InclusiveGateway;
import org.eclipse.mdt.bpmn.InputOutputBinding;
import org.eclipse.mdt.bpmn.InputOutputSpecification;
import org.eclipse.mdt.bpmn.InputSet;
import org.eclipse.mdt.bpmn.Interface;
import org.eclipse.mdt.bpmn.IntermediateCatchEvent;
import org.eclipse.mdt.bpmn.IntermediateThrowEvent;
import org.eclipse.mdt.bpmn.ItemDefinition;
import org.eclipse.mdt.bpmn.ItemKind;
import org.eclipse.mdt.bpmn.Lane;
import org.eclipse.mdt.bpmn.LaneSet;
import org.eclipse.mdt.bpmn.LinkEventDefinition;
import org.eclipse.mdt.bpmn.ManualTask;
import org.eclipse.mdt.bpmn.Message;
import org.eclipse.mdt.bpmn.MessageEventDefinition;
import org.eclipse.mdt.bpmn.MessageFlow;
import org.eclipse.mdt.bpmn.MessageFlowAssociation;
import org.eclipse.mdt.bpmn.Monitoring;
import org.eclipse.mdt.bpmn.MultiInstanceFlowCondition;
import org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics;
import org.eclipse.mdt.bpmn.Operation;
import org.eclipse.mdt.bpmn.OutputSet;
import org.eclipse.mdt.bpmn.ParallelGateway;
import org.eclipse.mdt.bpmn.Participant;
import org.eclipse.mdt.bpmn.ParticipantAssociation;
import org.eclipse.mdt.bpmn.ParticipantMultiplicity;
import org.eclipse.mdt.bpmn.PartnerEntity;
import org.eclipse.mdt.bpmn.PartnerRole;
import org.eclipse.mdt.bpmn.Performer;
import org.eclipse.mdt.bpmn.PotentialOwner;
import org.eclipse.mdt.bpmn.ProcessType;
import org.eclipse.mdt.bpmn.Property;
import org.eclipse.mdt.bpmn.ReceiveTask;
import org.eclipse.mdt.bpmn.Relationship;
import org.eclipse.mdt.bpmn.RelationshipDirection;
import org.eclipse.mdt.bpmn.Rendering;
import org.eclipse.mdt.bpmn.Resource;
import org.eclipse.mdt.bpmn.ResourceAssignmentExpression;
import org.eclipse.mdt.bpmn.ResourceParameter;
import org.eclipse.mdt.bpmn.ResourceParameterBinding;
import org.eclipse.mdt.bpmn.Script;
import org.eclipse.mdt.bpmn.ScriptTask;
import org.eclipse.mdt.bpmn.SendTask;
import org.eclipse.mdt.bpmn.SequenceFlow;
import org.eclipse.mdt.bpmn.ServiceImplementation;
import org.eclipse.mdt.bpmn.ServiceTask;
import org.eclipse.mdt.bpmn.Signal;
import org.eclipse.mdt.bpmn.SignalEventDefinition;
import org.eclipse.mdt.bpmn.StandardLoopCharacteristics;
import org.eclipse.mdt.bpmn.StartEvent;
import org.eclipse.mdt.bpmn.SubConversation;
import org.eclipse.mdt.bpmn.SubProcess;
import org.eclipse.mdt.bpmn.Task;
import org.eclipse.mdt.bpmn.TerminateEventDefinition;
import org.eclipse.mdt.bpmn.Text;
import org.eclipse.mdt.bpmn.TextAnnotation;
import org.eclipse.mdt.bpmn.TimerEventDefinition;
import org.eclipse.mdt.bpmn.Transaction;
import org.eclipse.mdt.bpmn.TransactionMethod;
import org.eclipse.mdt.bpmn.UserTask;
import org.eclipse.mdt.bpmn.UserTaskImplementation;
import org.eclipse.mdt.bpmn.bpmnFactory;
import org.eclipse.mdt.bpmn.bpmnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class bpmnFactoryImpl extends EFactoryImpl implements bpmnFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static bpmnFactory init() {
        try {
            bpmnFactory thebpmnFactory = (bpmnFactory)EPackage.Registry.INSTANCE.getEFactory("http://schema.omg.org/spec/BPMN/2.0"); //$NON-NLS-1$ 
            if (thebpmnFactory != null) {
                return thebpmnFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new bpmnFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public bpmnFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case bpmnPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case bpmnPackage.ACTIVITY_RESOURCE: return createActivityResource();
            case bpmnPackage.AD_HOC_SUB_PROCESS: return createAdHocSubProcess();
            case bpmnPackage.ASSIGNMENT: return createAssignment();
            case bpmnPackage.ASSOCIATION: return createAssociation();
            case bpmnPackage.AUDITING: return createAuditing();
            case bpmnPackage.BOUNDARY_EVENT: return createBoundaryEvent();
            case bpmnPackage.BUSINESS_RULE_TASK: return createBusinessRuleTask();
            case bpmnPackage.CALLABLE_ELEMENT: return createCallableElement();
            case bpmnPackage.CALL_ACTIVITY: return createCallActivity();
            case bpmnPackage.CALL_CHOREOGRAPHY_ACTIVITY: return createCallChoreographyActivity();
            case bpmnPackage.CALL_CONVERSATION: return createCallConversation();
            case bpmnPackage.CANCEL_EVENT_DEFINITION: return createCancelEventDefinition();
            case bpmnPackage.CATEGORY: return createCategory();
            case bpmnPackage.CATEGORY_VALUE: return createCategoryValue();
            case bpmnPackage.CHOREOGRAPHY: return createChoreography();
            case bpmnPackage.CHOREOGRAPHY_SUB_PROCESS: return createChoreographySubProcess();
            case bpmnPackage.CHOREOGRAPHY_TASK: return createChoreographyTask();
            case bpmnPackage.COLLABORATION: return createCollaboration();
            case bpmnPackage.COMMUNICATION: return createCommunication();
            case bpmnPackage.COMPENSATE_EVENT_DEFINITION: return createCompensateEventDefinition();
            case bpmnPackage.COMPLEX_BEHAVIOR_DEFINITION: return createComplexBehaviorDefinition();
            case bpmnPackage.COMPLEX_GATEWAY: return createComplexGateway();
            case bpmnPackage.CONDITIONAL_EVENT_DEFINITION: return createConditionalEventDefinition();
            case bpmnPackage.CONVERSATION: return createConversation();
            case bpmnPackage.CONVERSATION_ASSOCIATION: return createConversationAssociation();
            case bpmnPackage.CORRELATION_KEY: return createCorrelationKey();
            case bpmnPackage.CORRELATION_PROPERTY: return createCorrelationProperty();
            case bpmnPackage.CORRELATION_PROPERTY_BINDING: return createCorrelationPropertyBinding();
            case bpmnPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION: return createCorrelationPropertyRetrievalExpression();
            case bpmnPackage.CORRELATION_SUBSCRIPTION: return createCorrelationSubscription();
            case bpmnPackage.DATA_INPUT: return createDataInput();
            case bpmnPackage.DATA_INPUT_ASSOCIATION: return createDataInputAssociation();
            case bpmnPackage.DATA_OBJECT: return createDataObject();
            case bpmnPackage.DATA_OUTPUT: return createDataOutput();
            case bpmnPackage.DATA_OUTPUT_ASSOCIATION: return createDataOutputAssociation();
            case bpmnPackage.DATA_STATE: return createDataState();
            case bpmnPackage.DATA_STORE: return createDataStore();
            case bpmnPackage.DATA_STORE_REFERENCE: return createDataStoreReference();
            case bpmnPackage.DEFINITIONS: return createDefinitions();
            case bpmnPackage.DOCUMENTATION: return createDocumentation();
            case bpmnPackage.END_EVENT: return createEndEvent();
            case bpmnPackage.END_POINT: return createEndPoint();
            case bpmnPackage.ERROR: return createError();
            case bpmnPackage.ERROR_EVENT_DEFINITION: return createErrorEventDefinition();
            case bpmnPackage.ESCALATION: return createEscalation();
            case bpmnPackage.ESCALATION_EVENT_DEFINITION: return createEscalationEventDefinition();
            case bpmnPackage.EVENT_BASED_GATEWAY: return createEventBasedGateway();
            case bpmnPackage.EXCLUSIVE_GATEWAY: return createExclusiveGateway();
            case bpmnPackage.EXPRESSION: return createExpression();
            case bpmnPackage.EXTENSION: return createExtension();
            case bpmnPackage.FORMAL_EXPRESSION: return createFormalExpression();
            case bpmnPackage.GATEWAY: return createGateway();
            case bpmnPackage.GLOBAL_BUSINESS_RULE_TASK: return createGlobalBusinessRuleTask();
            case bpmnPackage.GLOBAL_CHOREOGRAPHY_TASK: return createGlobalChoreographyTask();
            case bpmnPackage.GLOBAL_COMMUNICATION: return createGlobalCommunication();
            case bpmnPackage.GLOBAL_MANUAL_TASK: return createGlobalManualTask();
            case bpmnPackage.GLOBAL_SCRIPT_TASK: return createGlobalScriptTask();
            case bpmnPackage.GLOBAL_TASK: return createGlobalTask();
            case bpmnPackage.GLOBAL_USER_TASK: return createGlobalUserTask();
            case bpmnPackage.GROUP: return createGroup();
            case bpmnPackage.HUMAN_PERFORMER: return createHumanPerformer();
            case bpmnPackage.IMPLICIT_THROW_EVENT: return createImplicitThrowEvent();
            case bpmnPackage.IMPORT: return createImport();
            case bpmnPackage.INCLUSIVE_GATEWAY: return createInclusiveGateway();
            case bpmnPackage.INPUT_OUTPUT_BINDING: return createInputOutputBinding();
            case bpmnPackage.INPUT_OUTPUT_SPECIFICATION: return createInputOutputSpecification();
            case bpmnPackage.INPUT_SET: return createInputSet();
            case bpmnPackage.INTERFACE: return createInterface();
            case bpmnPackage.INTERMEDIATE_CATCH_EVENT: return createIntermediateCatchEvent();
            case bpmnPackage.INTERMEDIATE_THROW_EVENT: return createIntermediateThrowEvent();
            case bpmnPackage.ITEM_DEFINITION: return createItemDefinition();
            case bpmnPackage.LANE: return createLane();
            case bpmnPackage.LANE_SET: return createLaneSet();
            case bpmnPackage.LINK_EVENT_DEFINITION: return createLinkEventDefinition();
            case bpmnPackage.MANUAL_TASK: return createManualTask();
            case bpmnPackage.MESSAGE: return createMessage();
            case bpmnPackage.MESSAGE_EVENT_DEFINITION: return createMessageEventDefinition();
            case bpmnPackage.MESSAGE_FLOW: return createMessageFlow();
            case bpmnPackage.MESSAGE_FLOW_ASSOCIATION: return createMessageFlowAssociation();
            case bpmnPackage.MONITORING: return createMonitoring();
            case bpmnPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS: return createMultiInstanceLoopCharacteristics();
            case bpmnPackage.OPERATION: return createOperation();
            case bpmnPackage.OUTPUT_SET: return createOutputSet();
            case bpmnPackage.PARALLEL_GATEWAY: return createParallelGateway();
            case bpmnPackage.PARTICIPANT: return createParticipant();
            case bpmnPackage.PARTICIPANT_ASSOCIATION: return createParticipantAssociation();
            case bpmnPackage.PARTICIPANT_MULTIPLICITY: return createParticipantMultiplicity();
            case bpmnPackage.PARTNER_ENTITY: return createPartnerEntity();
            case bpmnPackage.PARTNER_ROLE: return createPartnerRole();
            case bpmnPackage.PERFORMER: return createPerformer();
            case bpmnPackage.POTENTIAL_OWNER: return createPotentialOwner();
            case bpmnPackage.PROCESS: return createProcess();
            case bpmnPackage.PROPERTY: return createProperty();
            case bpmnPackage.RECEIVE_TASK: return createReceiveTask();
            case bpmnPackage.RELATIONSHIP: return createRelationship();
            case bpmnPackage.RENDERING: return createRendering();
            case bpmnPackage.RESOURCE: return createResource();
            case bpmnPackage.RESOURCE_ASSIGNMENT_EXPRESSION: return createResourceAssignmentExpression();
            case bpmnPackage.RESOURCE_PARAMETER: return createResourceParameter();
            case bpmnPackage.RESOURCE_PARAMETER_BINDING: return createResourceParameterBinding();
            case bpmnPackage.SCRIPT: return createScript();
            case bpmnPackage.SCRIPT_TASK: return createScriptTask();
            case bpmnPackage.SEND_TASK: return createSendTask();
            case bpmnPackage.SEQUENCE_FLOW: return createSequenceFlow();
            case bpmnPackage.SERVICE_TASK: return createServiceTask();
            case bpmnPackage.SIGNAL: return createSignal();
            case bpmnPackage.SIGNAL_EVENT_DEFINITION: return createSignalEventDefinition();
            case bpmnPackage.STANDARD_LOOP_CHARACTERISTICS: return createStandardLoopCharacteristics();
            case bpmnPackage.START_EVENT: return createStartEvent();
            case bpmnPackage.SUB_CONVERSATION: return createSubConversation();
            case bpmnPackage.SUB_PROCESS: return createSubProcess();
            case bpmnPackage.TASK: return createTask();
            case bpmnPackage.TERMINATE_EVENT_DEFINITION: return createTerminateEventDefinition();
            case bpmnPackage.TEXT: return createText();
            case bpmnPackage.TEXT_ANNOTATION: return createTextAnnotation();
            case bpmnPackage.TIMER_EVENT_DEFINITION: return createTimerEventDefinition();
            case bpmnPackage.TRANSACTION: return createTransaction();
            case bpmnPackage.USER_TASK: return createUserTask();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case bpmnPackage.AD_HOC_ORDERING:
                return createAdHocOrderingFromString(eDataType, initialValue);
            case bpmnPackage.ASSOCIATION_DIRECTION:
                return createAssociationDirectionFromString(eDataType, initialValue);
            case bpmnPackage.EVENT_BASED_GATEWAY_TYPE:
                return createEventBasedGatewayTypeFromString(eDataType, initialValue);
            case bpmnPackage.GATEWAY_DIRECTION:
                return createGatewayDirectionFromString(eDataType, initialValue);
            case bpmnPackage.ITEM_KIND:
                return createItemKindFromString(eDataType, initialValue);
            case bpmnPackage.MULTI_INSTANCE_FLOW_CONDITION:
                return createMultiInstanceFlowConditionFromString(eDataType, initialValue);
            case bpmnPackage.PROCESS_TYPE:
                return createProcessTypeFromString(eDataType, initialValue);
            case bpmnPackage.RELATIONSHIP_DIRECTION:
                return createRelationshipDirectionFromString(eDataType, initialValue);
            case bpmnPackage.SERVICE_IMPLEMENTATION:
                return createServiceImplementationFromString(eDataType, initialValue);
            case bpmnPackage.TRANSACTION_METHOD:
                return createTransactionMethodFromString(eDataType, initialValue);
            case bpmnPackage.USER_TASK_IMPLEMENTATION:
                return createUserTaskImplementationFromString(eDataType, initialValue);
            case bpmnPackage.AD_HOC_ORDERING_OBJECT:
                return createAdHocOrderingObjectFromString(eDataType, initialValue);
            case bpmnPackage.ASSOCIATION_DIRECTION_OBJECT:
                return createAssociationDirectionObjectFromString(eDataType, initialValue);
            case bpmnPackage.EVENT_BASED_GATEWAY_TYPE_OBJECT:
                return createEventBasedGatewayTypeObjectFromString(eDataType, initialValue);
            case bpmnPackage.GATEWAY_DIRECTION_OBJECT:
                return createGatewayDirectionObjectFromString(eDataType, initialValue);
            case bpmnPackage.ITEM_KIND_OBJECT:
                return createItemKindObjectFromString(eDataType, initialValue);
            case bpmnPackage.MULTI_INSTANCE_FLOW_CONDITION_OBJECT:
                return createMultiInstanceFlowConditionObjectFromString(eDataType, initialValue);
            case bpmnPackage.PROCESS_TYPE_OBJECT:
                return createProcessTypeObjectFromString(eDataType, initialValue);
            case bpmnPackage.RELATIONSHIP_DIRECTION_OBJECT:
                return createRelationshipDirectionObjectFromString(eDataType, initialValue);
            case bpmnPackage.SERVICE_IMPLEMENTATION_OBJECT:
                return createServiceImplementationObjectFromString(eDataType, initialValue);
            case bpmnPackage.TRANSACTION_METHOD_OBJECT:
                return createTransactionMethodObjectFromString(eDataType, initialValue);
            case bpmnPackage.USER_TASK_IMPLEMENTATION_OBJECT:
                return createUserTaskImplementationObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case bpmnPackage.AD_HOC_ORDERING:
                return convertAdHocOrderingToString(eDataType, instanceValue);
            case bpmnPackage.ASSOCIATION_DIRECTION:
                return convertAssociationDirectionToString(eDataType, instanceValue);
            case bpmnPackage.EVENT_BASED_GATEWAY_TYPE:
                return convertEventBasedGatewayTypeToString(eDataType, instanceValue);
            case bpmnPackage.GATEWAY_DIRECTION:
                return convertGatewayDirectionToString(eDataType, instanceValue);
            case bpmnPackage.ITEM_KIND:
                return convertItemKindToString(eDataType, instanceValue);
            case bpmnPackage.MULTI_INSTANCE_FLOW_CONDITION:
                return convertMultiInstanceFlowConditionToString(eDataType, instanceValue);
            case bpmnPackage.PROCESS_TYPE:
                return convertProcessTypeToString(eDataType, instanceValue);
            case bpmnPackage.RELATIONSHIP_DIRECTION:
                return convertRelationshipDirectionToString(eDataType, instanceValue);
            case bpmnPackage.SERVICE_IMPLEMENTATION:
                return convertServiceImplementationToString(eDataType, instanceValue);
            case bpmnPackage.TRANSACTION_METHOD:
                return convertTransactionMethodToString(eDataType, instanceValue);
            case bpmnPackage.USER_TASK_IMPLEMENTATION:
                return convertUserTaskImplementationToString(eDataType, instanceValue);
            case bpmnPackage.AD_HOC_ORDERING_OBJECT:
                return convertAdHocOrderingObjectToString(eDataType, instanceValue);
            case bpmnPackage.ASSOCIATION_DIRECTION_OBJECT:
                return convertAssociationDirectionObjectToString(eDataType, instanceValue);
            case bpmnPackage.EVENT_BASED_GATEWAY_TYPE_OBJECT:
                return convertEventBasedGatewayTypeObjectToString(eDataType, instanceValue);
            case bpmnPackage.GATEWAY_DIRECTION_OBJECT:
                return convertGatewayDirectionObjectToString(eDataType, instanceValue);
            case bpmnPackage.ITEM_KIND_OBJECT:
                return convertItemKindObjectToString(eDataType, instanceValue);
            case bpmnPackage.MULTI_INSTANCE_FLOW_CONDITION_OBJECT:
                return convertMultiInstanceFlowConditionObjectToString(eDataType, instanceValue);
            case bpmnPackage.PROCESS_TYPE_OBJECT:
                return convertProcessTypeObjectToString(eDataType, instanceValue);
            case bpmnPackage.RELATIONSHIP_DIRECTION_OBJECT:
                return convertRelationshipDirectionObjectToString(eDataType, instanceValue);
            case bpmnPackage.SERVICE_IMPLEMENTATION_OBJECT:
                return convertServiceImplementationObjectToString(eDataType, instanceValue);
            case bpmnPackage.TRANSACTION_METHOD_OBJECT:
                return convertTransactionMethodObjectToString(eDataType, instanceValue);
            case bpmnPackage.USER_TASK_IMPLEMENTATION_OBJECT:
                return convertUserTaskImplementationObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityResource createActivityResource() {
        ActivityResourceImpl activityResource = new ActivityResourceImpl();
        return activityResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocSubProcess createAdHocSubProcess() {
        AdHocSubProcessImpl adHocSubProcess = new AdHocSubProcessImpl();
        return adHocSubProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Auditing createAuditing() {
        AuditingImpl auditing = new AuditingImpl();
        return auditing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoundaryEvent createBoundaryEvent() {
        BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
        return boundaryEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BusinessRuleTask createBusinessRuleTask() {
        BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();
        return businessRuleTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallableElement createCallableElement() {
        CallableElementImpl callableElement = new CallableElementImpl();
        return callableElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallActivity createCallActivity() {
        CallActivityImpl callActivity = new CallActivityImpl();
        return callActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallChoreographyActivity createCallChoreographyActivity() {
        CallChoreographyActivityImpl callChoreographyActivity = new CallChoreographyActivityImpl();
        return callChoreographyActivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallConversation createCallConversation() {
        CallConversationImpl callConversation = new CallConversationImpl();
        return callConversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CancelEventDefinition createCancelEventDefinition() {
        CancelEventDefinitionImpl cancelEventDefinition = new CancelEventDefinitionImpl();
        return cancelEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Category createCategory() {
        CategoryImpl category = new CategoryImpl();
        return category;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CategoryValue createCategoryValue() {
        CategoryValueImpl categoryValue = new CategoryValueImpl();
        return categoryValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Choreography createChoreography() {
        ChoreographyImpl choreography = new ChoreographyImpl();
        return choreography;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChoreographySubProcess createChoreographySubProcess() {
        ChoreographySubProcessImpl choreographySubProcess = new ChoreographySubProcessImpl();
        return choreographySubProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChoreographyTask createChoreographyTask() {
        ChoreographyTaskImpl choreographyTask = new ChoreographyTaskImpl();
        return choreographyTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collaboration createCollaboration() {
        CollaborationImpl collaboration = new CollaborationImpl();
        return collaboration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Communication createCommunication() {
        CommunicationImpl communication = new CommunicationImpl();
        return communication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompensateEventDefinition createCompensateEventDefinition() {
        CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();
        return compensateEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
        ComplexBehaviorDefinitionImpl complexBehaviorDefinition = new ComplexBehaviorDefinitionImpl();
        return complexBehaviorDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexGateway createComplexGateway() {
        ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();
        return complexGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionalEventDefinition createConditionalEventDefinition() {
        ConditionalEventDefinitionImpl conditionalEventDefinition = new ConditionalEventDefinitionImpl();
        return conditionalEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Conversation createConversation() {
        ConversationImpl conversation = new ConversationImpl();
        return conversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConversationAssociation createConversationAssociation() {
        ConversationAssociationImpl conversationAssociation = new ConversationAssociationImpl();
        return conversationAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationKey createCorrelationKey() {
        CorrelationKeyImpl correlationKey = new CorrelationKeyImpl();
        return correlationKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationProperty createCorrelationProperty() {
        CorrelationPropertyImpl correlationProperty = new CorrelationPropertyImpl();
        return correlationProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationPropertyBinding createCorrelationPropertyBinding() {
        CorrelationPropertyBindingImpl correlationPropertyBinding = new CorrelationPropertyBindingImpl();
        return correlationPropertyBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
        CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();
        return correlationPropertyRetrievalExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CorrelationSubscription createCorrelationSubscription() {
        CorrelationSubscriptionImpl correlationSubscription = new CorrelationSubscriptionImpl();
        return correlationSubscription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInput createDataInput() {
        DataInputImpl dataInput = new DataInputImpl();
        return dataInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataInputAssociation createDataInputAssociation() {
        DataInputAssociationImpl dataInputAssociation = new DataInputAssociationImpl();
        return dataInputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataObject createDataObject() {
        DataObjectImpl dataObject = new DataObjectImpl();
        return dataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutput createDataOutput() {
        DataOutputImpl dataOutput = new DataOutputImpl();
        return dataOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataOutputAssociation createDataOutputAssociation() {
        DataOutputAssociationImpl dataOutputAssociation = new DataOutputAssociationImpl();
        return dataOutputAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataState createDataState() {
        DataStateImpl dataState = new DataStateImpl();
        return dataState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataStore createDataStore() {
        DataStoreImpl dataStore = new DataStoreImpl();
        return dataStore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataStoreReference createDataStoreReference() {
        DataStoreReferenceImpl dataStoreReference = new DataStoreReferenceImpl();
        return dataStoreReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Definitions createDefinitions() {
        DefinitionsImpl definitions = new DefinitionsImpl();
        return definitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation createDocumentation() {
        DocumentationImpl documentation = new DocumentationImpl();
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndEvent createEndEvent() {
        EndEventImpl endEvent = new EndEventImpl();
        return endEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EndPoint createEndPoint() {
        EndPointImpl endPoint = new EndPointImpl();
        return endPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.mdt.bpmn.Error createError() {
        ErrorImpl error = new ErrorImpl();
        return error;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ErrorEventDefinition createErrorEventDefinition() {
        ErrorEventDefinitionImpl errorEventDefinition = new ErrorEventDefinitionImpl();
        return errorEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Escalation createEscalation() {
        EscalationImpl escalation = new EscalationImpl();
        return escalation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EscalationEventDefinition createEscalationEventDefinition() {
        EscalationEventDefinitionImpl escalationEventDefinition = new EscalationEventDefinitionImpl();
        return escalationEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGateway createEventBasedGateway() {
        EventBasedGatewayImpl eventBasedGateway = new EventBasedGatewayImpl();
        return eventBasedGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExclusiveGateway createExclusiveGateway() {
        ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
        return exclusiveGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression createExpression() {
        ExpressionImpl expression = new ExpressionImpl();
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Extension createExtension() {
        ExtensionImpl extension = new ExtensionImpl();
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormalExpression createFormalExpression() {
        FormalExpressionImpl formalExpression = new FormalExpressionImpl();
        return formalExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gateway createGateway() {
        GatewayImpl gateway = new GatewayImpl();
        return gateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
        GlobalBusinessRuleTaskImpl globalBusinessRuleTask = new GlobalBusinessRuleTaskImpl();
        return globalBusinessRuleTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalChoreographyTask createGlobalChoreographyTask() {
        GlobalChoreographyTaskImpl globalChoreographyTask = new GlobalChoreographyTaskImpl();
        return globalChoreographyTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalCommunication createGlobalCommunication() {
        GlobalCommunicationImpl globalCommunication = new GlobalCommunicationImpl();
        return globalCommunication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalManualTask createGlobalManualTask() {
        GlobalManualTaskImpl globalManualTask = new GlobalManualTaskImpl();
        return globalManualTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalScriptTask createGlobalScriptTask() {
        GlobalScriptTaskImpl globalScriptTask = new GlobalScriptTaskImpl();
        return globalScriptTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalTask createGlobalTask() {
        GlobalTaskImpl globalTask = new GlobalTaskImpl();
        return globalTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalUserTask createGlobalUserTask() {
        GlobalUserTaskImpl globalUserTask = new GlobalUserTaskImpl();
        return globalUserTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group createGroup() {
        GroupImpl group = new GroupImpl();
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HumanPerformer createHumanPerformer() {
        HumanPerformerImpl humanPerformer = new HumanPerformerImpl();
        return humanPerformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplicitThrowEvent createImplicitThrowEvent() {
        ImplicitThrowEventImpl implicitThrowEvent = new ImplicitThrowEventImpl();
        return implicitThrowEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Import createImport() {
        ImportImpl import_ = new ImportImpl();
        return import_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InclusiveGateway createInclusiveGateway() {
        InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
        return inclusiveGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputBinding createInputOutputBinding() {
        InputOutputBindingImpl inputOutputBinding = new InputOutputBindingImpl();
        return inputOutputBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputOutputSpecification createInputOutputSpecification() {
        InputOutputSpecificationImpl inputOutputSpecification = new InputOutputSpecificationImpl();
        return inputOutputSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputSet createInputSet() {
        InputSetImpl inputSet = new InputSetImpl();
        return inputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateCatchEvent createIntermediateCatchEvent() {
        IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
        return intermediateCatchEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntermediateThrowEvent createIntermediateThrowEvent() {
        IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();
        return intermediateThrowEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemDefinition createItemDefinition() {
        ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
        return itemDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Lane createLane() {
        LaneImpl lane = new LaneImpl();
        return lane;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LaneSet createLaneSet() {
        LaneSetImpl laneSet = new LaneSetImpl();
        return laneSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkEventDefinition createLinkEventDefinition() {
        LinkEventDefinitionImpl linkEventDefinition = new LinkEventDefinitionImpl();
        return linkEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ManualTask createManualTask() {
        ManualTaskImpl manualTask = new ManualTaskImpl();
        return manualTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message createMessage() {
        MessageImpl message = new MessageImpl();
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageEventDefinition createMessageEventDefinition() {
        MessageEventDefinitionImpl messageEventDefinition = new MessageEventDefinitionImpl();
        return messageEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageFlow createMessageFlow() {
        MessageFlowImpl messageFlow = new MessageFlowImpl();
        return messageFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageFlowAssociation createMessageFlowAssociation() {
        MessageFlowAssociationImpl messageFlowAssociation = new MessageFlowAssociationImpl();
        return messageFlowAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Monitoring createMonitoring() {
        MonitoringImpl monitoring = new MonitoringImpl();
        return monitoring;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
        MultiInstanceLoopCharacteristicsImpl multiInstanceLoopCharacteristics = new MultiInstanceLoopCharacteristicsImpl();
        return multiInstanceLoopCharacteristics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSet createOutputSet() {
        OutputSetImpl outputSet = new OutputSetImpl();
        return outputSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParallelGateway createParallelGateway() {
        ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
        return parallelGateway;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Participant createParticipant() {
        ParticipantImpl participant = new ParticipantImpl();
        return participant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantAssociation createParticipantAssociation() {
        ParticipantAssociationImpl participantAssociation = new ParticipantAssociationImpl();
        return participantAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParticipantMultiplicity createParticipantMultiplicity() {
        ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();
        return participantMultiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartnerEntity createPartnerEntity() {
        PartnerEntityImpl partnerEntity = new PartnerEntityImpl();
        return partnerEntity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartnerRole createPartnerRole() {
        PartnerRoleImpl partnerRole = new PartnerRoleImpl();
        return partnerRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Performer createPerformer() {
        PerformerImpl performer = new PerformerImpl();
        return performer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PotentialOwner createPotentialOwner() {
        PotentialOwnerImpl potentialOwner = new PotentialOwnerImpl();
        return potentialOwner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.mdt.bpmn.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReceiveTask createReceiveTask() {
        ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();
        return receiveTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relationship createRelationship() {
        RelationshipImpl relationship = new RelationshipImpl();
        return relationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rendering createRendering() {
        RenderingImpl rendering = new RenderingImpl();
        return rendering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Resource createResource() {
        ResourceImpl resource = new ResourceImpl();
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceAssignmentExpression createResourceAssignmentExpression() {
        ResourceAssignmentExpressionImpl resourceAssignmentExpression = new ResourceAssignmentExpressionImpl();
        return resourceAssignmentExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceParameter createResourceParameter() {
        ResourceParameterImpl resourceParameter = new ResourceParameterImpl();
        return resourceParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceParameterBinding createResourceParameterBinding() {
        ResourceParameterBindingImpl resourceParameterBinding = new ResourceParameterBindingImpl();
        return resourceParameterBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Script createScript() {
        ScriptImpl script = new ScriptImpl();
        return script;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptTask createScriptTask() {
        ScriptTaskImpl scriptTask = new ScriptTaskImpl();
        return scriptTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SendTask createSendTask() {
        SendTaskImpl sendTask = new SendTaskImpl();
        return sendTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceFlow createSequenceFlow() {
        SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
        return sequenceFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceTask createServiceTask() {
        ServiceTaskImpl serviceTask = new ServiceTaskImpl();
        return serviceTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal createSignal() {
        SignalImpl signal = new SignalImpl();
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SignalEventDefinition createSignalEventDefinition() {
        SignalEventDefinitionImpl signalEventDefinition = new SignalEventDefinitionImpl();
        return signalEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StandardLoopCharacteristics createStandardLoopCharacteristics() {
        StandardLoopCharacteristicsImpl standardLoopCharacteristics = new StandardLoopCharacteristicsImpl();
        return standardLoopCharacteristics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartEvent createStartEvent() {
        StartEventImpl startEvent = new StartEventImpl();
        return startEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubConversation createSubConversation() {
        SubConversationImpl subConversation = new SubConversationImpl();
        return subConversation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubProcess createSubProcess() {
        SubProcessImpl subProcess = new SubProcessImpl();
        return subProcess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task createTask() {
        TaskImpl task = new TaskImpl();
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TerminateEventDefinition createTerminateEventDefinition() {
        TerminateEventDefinitionImpl terminateEventDefinition = new TerminateEventDefinitionImpl();
        return terminateEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Text createText() {
        TextImpl text = new TextImpl();
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextAnnotation createTextAnnotation() {
        TextAnnotationImpl textAnnotation = new TextAnnotationImpl();
        return textAnnotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimerEventDefinition createTimerEventDefinition() {
        TimerEventDefinitionImpl timerEventDefinition = new TimerEventDefinitionImpl();
        return timerEventDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transaction createTransaction() {
        TransactionImpl transaction = new TransactionImpl();
        return transaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTask createUserTask() {
        UserTaskImpl userTask = new UserTaskImpl();
        return userTask;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType, String initialValue) {
        AdHocOrdering result = AdHocOrdering.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
        AssociationDirection result = AssociationDirection.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGatewayType createEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
        EventBasedGatewayType result = EventBasedGatewayType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
        GatewayDirection result = GatewayDirection.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemKind createItemKindFromString(EDataType eDataType, String initialValue) {
        ItemKind result = ItemKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertItemKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceFlowCondition createMultiInstanceFlowConditionFromString(EDataType eDataType, String initialValue) {
        MultiInstanceFlowCondition result = MultiInstanceFlowCondition.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiInstanceFlowConditionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
        ProcessType result = ProcessType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipDirection createRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
        RelationshipDirection result = RelationshipDirection.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation createServiceImplementationFromString(EDataType eDataType, String initialValue) {
        ServiceImplementation result = ServiceImplementation.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceImplementationToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransactionMethod createTransactionMethodFromString(EDataType eDataType, String initialValue) {
        TransactionMethod result = TransactionMethod.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransactionMethodToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTaskImplementation createUserTaskImplementationFromString(EDataType eDataType, String initialValue) {
        UserTaskImplementation result = UserTaskImplementation.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUserTaskImplementationToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AdHocOrdering createAdHocOrderingObjectFromString(EDataType eDataType, String initialValue) {
        return createAdHocOrderingFromString(bpmnPackage.eINSTANCE.getAdHocOrdering(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAdHocOrderingObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAdHocOrderingToString(bpmnPackage.eINSTANCE.getAdHocOrdering(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationDirection createAssociationDirectionObjectFromString(EDataType eDataType, String initialValue) {
        return createAssociationDirectionFromString(bpmnPackage.eINSTANCE.getAssociationDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssociationDirectionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAssociationDirectionToString(bpmnPackage.eINSTANCE.getAssociationDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventBasedGatewayType createEventBasedGatewayTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createEventBasedGatewayTypeFromString(bpmnPackage.eINSTANCE.getEventBasedGatewayType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEventBasedGatewayTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertEventBasedGatewayTypeToString(bpmnPackage.eINSTANCE.getEventBasedGatewayType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayDirection createGatewayDirectionObjectFromString(EDataType eDataType, String initialValue) {
        return createGatewayDirectionFromString(bpmnPackage.eINSTANCE.getGatewayDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGatewayDirectionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertGatewayDirectionToString(bpmnPackage.eINSTANCE.getGatewayDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ItemKind createItemKindObjectFromString(EDataType eDataType, String initialValue) {
        return createItemKindFromString(bpmnPackage.eINSTANCE.getItemKind(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertItemKindObjectToString(EDataType eDataType, Object instanceValue) {
        return convertItemKindToString(bpmnPackage.eINSTANCE.getItemKind(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiInstanceFlowCondition createMultiInstanceFlowConditionObjectFromString(EDataType eDataType, String initialValue) {
        return createMultiInstanceFlowConditionFromString(bpmnPackage.eINSTANCE.getMultiInstanceFlowCondition(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMultiInstanceFlowConditionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertMultiInstanceFlowConditionToString(bpmnPackage.eINSTANCE.getMultiInstanceFlowCondition(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessType createProcessTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createProcessTypeFromString(bpmnPackage.eINSTANCE.getProcessType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertProcessTypeToString(bpmnPackage.eINSTANCE.getProcessType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipDirection createRelationshipDirectionObjectFromString(EDataType eDataType, String initialValue) {
        return createRelationshipDirectionFromString(bpmnPackage.eINSTANCE.getRelationshipDirection(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRelationshipDirectionObjectToString(EDataType eDataType, Object instanceValue) {
        return convertRelationshipDirectionToString(bpmnPackage.eINSTANCE.getRelationshipDirection(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceImplementation createServiceImplementationObjectFromString(EDataType eDataType, String initialValue) {
        return createServiceImplementationFromString(bpmnPackage.eINSTANCE.getServiceImplementation(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceImplementationObjectToString(EDataType eDataType, Object instanceValue) {
        return convertServiceImplementationToString(bpmnPackage.eINSTANCE.getServiceImplementation(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransactionMethod createTransactionMethodObjectFromString(EDataType eDataType, String initialValue) {
        return createTransactionMethodFromString(bpmnPackage.eINSTANCE.getTransactionMethod(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransactionMethodObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTransactionMethodToString(bpmnPackage.eINSTANCE.getTransactionMethod(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UserTaskImplementation createUserTaskImplementationObjectFromString(EDataType eDataType, String initialValue) {
        return createUserTaskImplementationFromString(bpmnPackage.eINSTANCE.getUserTaskImplementation(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUserTaskImplementationObjectToString(EDataType eDataType, Object instanceValue) {
        return convertUserTaskImplementationToString(bpmnPackage.eINSTANCE.getUserTaskImplementation(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public bpmnPackage getbpmnPackage() {
        return (bpmnPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static bpmnPackage getPackage() {
        return bpmnPackage.eINSTANCE;
    }

} //bpmnFactoryImpl