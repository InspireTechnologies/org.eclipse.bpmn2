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
package org.eclipse.bpmn2.impl;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.AdHocOrdering;
import org.eclipse.bpmn2.AdHocSubProcess;
import org.eclipse.bpmn2.Artifact;
import org.eclipse.bpmn2.Assignment;
import org.eclipse.bpmn2.Association;
import org.eclipse.bpmn2.AssociationDirection;
import org.eclipse.bpmn2.Auditing;
import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.BoundaryEvent;
import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.BusinessRuleTask;
import org.eclipse.bpmn2.CallActivity;
import org.eclipse.bpmn2.CallChoreography;
import org.eclipse.bpmn2.CallConversation;
import org.eclipse.bpmn2.CallableElement;
import org.eclipse.bpmn2.CancelEventDefinition;
import org.eclipse.bpmn2.Category;
import org.eclipse.bpmn2.CategoryValue;
import org.eclipse.bpmn2.Choreography;
import org.eclipse.bpmn2.ChoreographyLoopType;
import org.eclipse.bpmn2.ChoreographyTask;
import org.eclipse.bpmn2.Collaboration;
import org.eclipse.bpmn2.CompensateEventDefinition;
import org.eclipse.bpmn2.ComplexBehaviorDefinition;
import org.eclipse.bpmn2.ComplexGateway;
import org.eclipse.bpmn2.ConditionalEventDefinition;
import org.eclipse.bpmn2.Conversation;
import org.eclipse.bpmn2.ConversationAssociation;
import org.eclipse.bpmn2.ConversationLink;
import org.eclipse.bpmn2.ConversationNode;
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.CorrelationProperty;
import org.eclipse.bpmn2.CorrelationPropertyBinding;
import org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression;
import org.eclipse.bpmn2.CorrelationSubscription;
import org.eclipse.bpmn2.DataAssociation;
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.DataInputAssociation;
import org.eclipse.bpmn2.DataObject;
import org.eclipse.bpmn2.DataObjectReference;
import org.eclipse.bpmn2.DataOutput;
import org.eclipse.bpmn2.DataOutputAssociation;
import org.eclipse.bpmn2.DataState;
import org.eclipse.bpmn2.DataStore;
import org.eclipse.bpmn2.DataStoreReference;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.Documentation;
import org.eclipse.bpmn2.EndEvent;
import org.eclipse.bpmn2.EndPoint;
import org.eclipse.bpmn2.ErrorEventDefinition;
import org.eclipse.bpmn2.Escalation;
import org.eclipse.bpmn2.EscalationEventDefinition;
import org.eclipse.bpmn2.EventBasedGateway;
import org.eclipse.bpmn2.EventBasedGatewayType;
import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.ExclusiveGateway;
import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.Extension;
import org.eclipse.bpmn2.ExtensionAttributeDefinition;
import org.eclipse.bpmn2.ExtensionAttributeValue;
import org.eclipse.bpmn2.ExtensionDefinition;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.GatewayDirection;
import org.eclipse.bpmn2.GlobalBusinessRuleTask;
import org.eclipse.bpmn2.GlobalChoreographyTask;
import org.eclipse.bpmn2.GlobalConversation;
import org.eclipse.bpmn2.GlobalManualTask;
import org.eclipse.bpmn2.GlobalScriptTask;
import org.eclipse.bpmn2.GlobalTask;
import org.eclipse.bpmn2.GlobalUserTask;
import org.eclipse.bpmn2.Group;
import org.eclipse.bpmn2.HumanPerformer;
import org.eclipse.bpmn2.ImplicitThrowEvent;
import org.eclipse.bpmn2.Import;
import org.eclipse.bpmn2.InclusiveGateway;
import org.eclipse.bpmn2.InputOutputBinding;
import org.eclipse.bpmn2.InputOutputSpecification;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.InteractionNode;
import org.eclipse.bpmn2.Interface;
import org.eclipse.bpmn2.IntermediateCatchEvent;
import org.eclipse.bpmn2.IntermediateThrowEvent;
import org.eclipse.bpmn2.ItemAwareElement;
import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.bpmn2.ItemKind;
import org.eclipse.bpmn2.Lane;
import org.eclipse.bpmn2.LaneSet;
import org.eclipse.bpmn2.LinkEventDefinition;
import org.eclipse.bpmn2.ManualTask;
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.MessageEventDefinition;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.MessageFlowAssociation;
import org.eclipse.bpmn2.Monitoring;
import org.eclipse.bpmn2.MultiInstanceBehavior;
import org.eclipse.bpmn2.MultiInstanceLoopCharacteristics;
import org.eclipse.bpmn2.Operation;
import org.eclipse.bpmn2.OutputSet;
import org.eclipse.bpmn2.ParallelGateway;
import org.eclipse.bpmn2.Participant;
import org.eclipse.bpmn2.ParticipantAssociation;
import org.eclipse.bpmn2.ParticipantMultiplicity;
import org.eclipse.bpmn2.PartnerEntity;
import org.eclipse.bpmn2.PartnerRole;
import org.eclipse.bpmn2.Performer;
import org.eclipse.bpmn2.PotentialOwner;
import org.eclipse.bpmn2.ProcessType;
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.ReceiveTask;
import org.eclipse.bpmn2.Relationship;
import org.eclipse.bpmn2.RelationshipDirection;
import org.eclipse.bpmn2.Rendering;
import org.eclipse.bpmn2.Resource;
import org.eclipse.bpmn2.ResourceAssignmentExpression;
import org.eclipse.bpmn2.ResourceParameter;
import org.eclipse.bpmn2.ResourceParameterBinding;
import org.eclipse.bpmn2.ResourceRole;
import org.eclipse.bpmn2.RootElement;
import org.eclipse.bpmn2.ScriptTask;
import org.eclipse.bpmn2.SendTask;
import org.eclipse.bpmn2.SequenceFlow;
import org.eclipse.bpmn2.ServiceTask;
import org.eclipse.bpmn2.Signal;
import org.eclipse.bpmn2.SignalEventDefinition;
import org.eclipse.bpmn2.StandardLoopCharacteristics;
import org.eclipse.bpmn2.StartEvent;
import org.eclipse.bpmn2.SubChoreography;
import org.eclipse.bpmn2.SubConversation;
import org.eclipse.bpmn2.SubProcess;
import org.eclipse.bpmn2.Task;
import org.eclipse.bpmn2.TerminateEventDefinition;
import org.eclipse.bpmn2.TextAnnotation;
import org.eclipse.bpmn2.TimerEventDefinition;
import org.eclipse.bpmn2.Transaction;
import org.eclipse.bpmn2.UserTask;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @author     Harald
 * @generated
 */
public class Bpmn2FactoryImpl
	extends EFactoryImpl
	implements Bpmn2Factory
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2FactoryImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return      DOCUMENT ME!
	 *
	 * @deprecated  DOCUMENT ME!
	 * @generated
	 */
	@Deprecated public static Bpmn2Package getPackage()
	{
		return Bpmn2Package.eINSTANCE;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     creates the default factory implementation.
	 *
	 * @generated
	 */
	public static Bpmn2Factory init()
	{
		try
		{
			final Bpmn2Factory theBpmn2Factory = (Bpmn2Factory) EPackage.Registry.INSTANCE.getEFactory( "http://www.omg.org/spec/BPMN/20100524/MODEL" );

			if( theBpmn2Factory != null )
			{
				return theBpmn2Factory;
			}
		}
		catch( Exception exception )
		{
			EcorePlugin.INSTANCE.log( exception );
		}

		return new Bpmn2FactoryImpl();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertAdHocOrderingToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertAssociationDirectionToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertChoreographyLoopTypeToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertEventBasedGatewayTypeToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertGatewayDirectionToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertItemKindToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertMultiInstanceBehaviorToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertProcessTypeToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public String convertRelationshipDirectionToString( final EDataType eDataType, final Object instanceValue )
	{
		return ( instanceValue == null ) ? null : instanceValue.toString();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType      DOCUMENT ME!
	 * @param      instanceValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String convertToString( final EDataType eDataType, final Object instanceValue )
	{
		switch( eDataType.getClassifierID())
		{
			case Bpmn2Package.AD_HOC_ORDERING :
			{
				return convertAdHocOrderingToString( eDataType, instanceValue );
			}

			case Bpmn2Package.ASSOCIATION_DIRECTION :
			{
				return convertAssociationDirectionToString( eDataType, instanceValue );
			}

			case Bpmn2Package.CHOREOGRAPHY_LOOP_TYPE :
			{
				return convertChoreographyLoopTypeToString( eDataType, instanceValue );
			}

			case Bpmn2Package.EVENT_BASED_GATEWAY_TYPE :
			{
				return convertEventBasedGatewayTypeToString( eDataType, instanceValue );
			}

			case Bpmn2Package.GATEWAY_DIRECTION :
			{
				return convertGatewayDirectionToString( eDataType, instanceValue );
			}

			case Bpmn2Package.ITEM_KIND :
			{
				return convertItemKindToString( eDataType, instanceValue );
			}

			case Bpmn2Package.MULTI_INSTANCE_BEHAVIOR :
			{
				return convertMultiInstanceBehaviorToString( eDataType, instanceValue );
			}

			case Bpmn2Package.PROCESS_TYPE :
			{
				return convertProcessTypeToString( eDataType, instanceValue );
			}

			case Bpmn2Package.RELATIONSHIP_DIRECTION :
			{
				return convertRelationshipDirectionToString( eDataType, instanceValue );
			}

			default :
			{
				throw new IllegalArgumentException( "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
			}
		}
	} // end method convertToString

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eClass  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EObject create( final EClass eClass )
	{
		switch( eClass.getClassifierID())
		{
			case Bpmn2Package.DOCUMENT_ROOT :
			{
				return createDocumentRoot();
			}

			case Bpmn2Package.ACTIVITY :
			{
				return createActivity();
			}

			case Bpmn2Package.AD_HOC_SUB_PROCESS :
			{
				return createAdHocSubProcess();
			}

			case Bpmn2Package.ARTIFACT :
			{
				return createArtifact();
			}

			case Bpmn2Package.ASSIGNMENT :
			{
				return createAssignment();
			}

			case Bpmn2Package.ASSOCIATION :
			{
				return createAssociation();
			}

			case Bpmn2Package.AUDITING :
			{
				return createAuditing();
			}

			case Bpmn2Package.BASE_ELEMENT :
			{
				return createBaseElement();
			}

			case Bpmn2Package.BOUNDARY_EVENT :
			{
				return createBoundaryEvent();
			}

			case Bpmn2Package.BUSINESS_RULE_TASK :
			{
				return createBusinessRuleTask();
			}

			case Bpmn2Package.CALL_ACTIVITY :
			{
				return createCallActivity();
			}

			case Bpmn2Package.CALL_CHOREOGRAPHY :
			{
				return createCallChoreography();
			}

			case Bpmn2Package.CALL_CONVERSATION :
			{
				return createCallConversation();
			}

			case Bpmn2Package.CALLABLE_ELEMENT :
			{
				return createCallableElement();
			}

			case Bpmn2Package.CANCEL_EVENT_DEFINITION :
			{
				return createCancelEventDefinition();
			}

			case Bpmn2Package.CATEGORY :
			{
				return createCategory();
			}

			case Bpmn2Package.CATEGORY_VALUE :
			{
				return createCategoryValue();
			}

			case Bpmn2Package.CHOREOGRAPHY :
			{
				return createChoreography();
			}

			case Bpmn2Package.CHOREOGRAPHY_TASK :
			{
				return createChoreographyTask();
			}

			case Bpmn2Package.COLLABORATION :
			{
				return createCollaboration();
			}

			case Bpmn2Package.COMPENSATE_EVENT_DEFINITION :
			{
				return createCompensateEventDefinition();
			}

			case Bpmn2Package.COMPLEX_BEHAVIOR_DEFINITION :
			{
				return createComplexBehaviorDefinition();
			}

			case Bpmn2Package.COMPLEX_GATEWAY :
			{
				return createComplexGateway();
			}

			case Bpmn2Package.CONDITIONAL_EVENT_DEFINITION :
			{
				return createConditionalEventDefinition();
			}

			case Bpmn2Package.CONVERSATION :
			{
				return createConversation();
			}

			case Bpmn2Package.CONVERSATION_ASSOCIATION :
			{
				return createConversationAssociation();
			}

			case Bpmn2Package.CONVERSATION_LINK :
			{
				return createConversationLink();
			}

			case Bpmn2Package.CONVERSATION_NODE :
			{
				return createConversationNode();
			}

			case Bpmn2Package.CORRELATION_KEY :
			{
				return createCorrelationKey();
			}

			case Bpmn2Package.CORRELATION_PROPERTY :
			{
				return createCorrelationProperty();
			}

			case Bpmn2Package.CORRELATION_PROPERTY_BINDING :
			{
				return createCorrelationPropertyBinding();
			}

			case Bpmn2Package.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION :
			{
				return createCorrelationPropertyRetrievalExpression();
			}

			case Bpmn2Package.CORRELATION_SUBSCRIPTION :
			{
				return createCorrelationSubscription();
			}

			case Bpmn2Package.DATA_ASSOCIATION :
			{
				return createDataAssociation();
			}

			case Bpmn2Package.DATA_INPUT :
			{
				return createDataInput();
			}

			case Bpmn2Package.DATA_INPUT_ASSOCIATION :
			{
				return createDataInputAssociation();
			}

			case Bpmn2Package.DATA_OBJECT :
			{
				return createDataObject();
			}

			case Bpmn2Package.DATA_OBJECT_REFERENCE :
			{
				return createDataObjectReference();
			}

			case Bpmn2Package.DATA_OUTPUT :
			{
				return createDataOutput();
			}

			case Bpmn2Package.DATA_OUTPUT_ASSOCIATION :
			{
				return createDataOutputAssociation();
			}

			case Bpmn2Package.DATA_STATE :
			{
				return createDataState();
			}

			case Bpmn2Package.DATA_STORE :
			{
				return createDataStore();
			}

			case Bpmn2Package.DATA_STORE_REFERENCE :
			{
				return createDataStoreReference();
			}

			case Bpmn2Package.DEFINITIONS :
			{
				return createDefinitions();
			}

			case Bpmn2Package.DOCUMENTATION :
			{
				return createDocumentation();
			}

			case Bpmn2Package.END_EVENT :
			{
				return createEndEvent();
			}

			case Bpmn2Package.END_POINT :
			{
				return createEndPoint();
			}

			case Bpmn2Package.ERROR :
			{
				return createError();
			}

			case Bpmn2Package.ERROR_EVENT_DEFINITION :
			{
				return createErrorEventDefinition();
			}

			case Bpmn2Package.ESCALATION :
			{
				return createEscalation();
			}

			case Bpmn2Package.ESCALATION_EVENT_DEFINITION :
			{
				return createEscalationEventDefinition();
			}

			case Bpmn2Package.EVENT_BASED_GATEWAY :
			{
				return createEventBasedGateway();
			}

			case Bpmn2Package.EVENT_DEFINITION :
			{
				return createEventDefinition();
			}

			case Bpmn2Package.EXCLUSIVE_GATEWAY :
			{
				return createExclusiveGateway();
			}

			case Bpmn2Package.EXPRESSION :
			{
				return createExpression();
			}

			case Bpmn2Package.EXTENSION :
			{
				return createExtension();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_DEFINITION :
			{
				return createExtensionAttributeDefinition();
			}

			case Bpmn2Package.EXTENSION_ATTRIBUTE_VALUE :
			{
				return createExtensionAttributeValue();
			}

			case Bpmn2Package.EXTENSION_DEFINITION :
			{
				return createExtensionDefinition();
			}

			case Bpmn2Package.FORMAL_EXPRESSION :
			{
				return createFormalExpression();
			}

			case Bpmn2Package.GLOBAL_BUSINESS_RULE_TASK :
			{
				return createGlobalBusinessRuleTask();
			}

			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK :
			{
				return createGlobalChoreographyTask();
			}

			case Bpmn2Package.GLOBAL_CONVERSATION :
			{
				return createGlobalConversation();
			}

			case Bpmn2Package.GLOBAL_MANUAL_TASK :
			{
				return createGlobalManualTask();
			}

			case Bpmn2Package.GLOBAL_SCRIPT_TASK :
			{
				return createGlobalScriptTask();
			}

			case Bpmn2Package.GLOBAL_TASK :
			{
				return createGlobalTask();
			}

			case Bpmn2Package.GLOBAL_USER_TASK :
			{
				return createGlobalUserTask();
			}

			case Bpmn2Package.GROUP :
			{
				return createGroup();
			}

			case Bpmn2Package.HUMAN_PERFORMER :
			{
				return createHumanPerformer();
			}

			case Bpmn2Package.IMPLICIT_THROW_EVENT :
			{
				return createImplicitThrowEvent();
			}

			case Bpmn2Package.IMPORT :
			{
				return createImport();
			}

			case Bpmn2Package.INCLUSIVE_GATEWAY :
			{
				return createInclusiveGateway();
			}

			case Bpmn2Package.INPUT_OUTPUT_BINDING :
			{
				return createInputOutputBinding();
			}

			case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION :
			{
				return createInputOutputSpecification();
			}

			case Bpmn2Package.INPUT_SET :
			{
				return createInputSet();
			}

			case Bpmn2Package.INTERACTION_NODE :
			{
				return createInteractionNode();
			}

			case Bpmn2Package.INTERFACE :
			{
				return createInterface();
			}

			case Bpmn2Package.INTERMEDIATE_CATCH_EVENT :
			{
				return createIntermediateCatchEvent();
			}

			case Bpmn2Package.INTERMEDIATE_THROW_EVENT :
			{
				return createIntermediateThrowEvent();
			}

			case Bpmn2Package.ITEM_AWARE_ELEMENT :
			{
				return createItemAwareElement();
			}

			case Bpmn2Package.ITEM_DEFINITION :
			{
				return createItemDefinition();
			}

			case Bpmn2Package.LANE :
			{
				return createLane();
			}

			case Bpmn2Package.LANE_SET :
			{
				return createLaneSet();
			}

			case Bpmn2Package.LINK_EVENT_DEFINITION :
			{
				return createLinkEventDefinition();
			}

			case Bpmn2Package.MANUAL_TASK :
			{
				return createManualTask();
			}

			case Bpmn2Package.MESSAGE :
			{
				return createMessage();
			}

			case Bpmn2Package.MESSAGE_EVENT_DEFINITION :
			{
				return createMessageEventDefinition();
			}

			case Bpmn2Package.MESSAGE_FLOW :
			{
				return createMessageFlow();
			}

			case Bpmn2Package.MESSAGE_FLOW_ASSOCIATION :
			{
				return createMessageFlowAssociation();
			}

			case Bpmn2Package.MONITORING :
			{
				return createMonitoring();
			}

			case Bpmn2Package.MULTI_INSTANCE_LOOP_CHARACTERISTICS :
			{
				return createMultiInstanceLoopCharacteristics();
			}

			case Bpmn2Package.OPERATION :
			{
				return createOperation();
			}

			case Bpmn2Package.OUTPUT_SET :
			{
				return createOutputSet();
			}

			case Bpmn2Package.PARALLEL_GATEWAY :
			{
				return createParallelGateway();
			}

			case Bpmn2Package.PARTICIPANT :
			{
				return createParticipant();
			}

			case Bpmn2Package.PARTICIPANT_ASSOCIATION :
			{
				return createParticipantAssociation();
			}

			case Bpmn2Package.PARTICIPANT_MULTIPLICITY :
			{
				return createParticipantMultiplicity();
			}

			case Bpmn2Package.PARTNER_ENTITY :
			{
				return createPartnerEntity();
			}

			case Bpmn2Package.PARTNER_ROLE :
			{
				return createPartnerRole();
			}

			case Bpmn2Package.PERFORMER :
			{
				return createPerformer();
			}

			case Bpmn2Package.POTENTIAL_OWNER :
			{
				return createPotentialOwner();
			}

			case Bpmn2Package.PROCESS :
			{
				return createProcess();
			}

			case Bpmn2Package.PROPERTY :
			{
				return createProperty();
			}

			case Bpmn2Package.RECEIVE_TASK :
			{
				return createReceiveTask();
			}

			case Bpmn2Package.RELATIONSHIP :
			{
				return createRelationship();
			}

			case Bpmn2Package.RENDERING :
			{
				return createRendering();
			}

			case Bpmn2Package.RESOURCE :
			{
				return createResource();
			}

			case Bpmn2Package.RESOURCE_ASSIGNMENT_EXPRESSION :
			{
				return createResourceAssignmentExpression();
			}

			case Bpmn2Package.RESOURCE_PARAMETER :
			{
				return createResourceParameter();
			}

			case Bpmn2Package.RESOURCE_PARAMETER_BINDING :
			{
				return createResourceParameterBinding();
			}

			case Bpmn2Package.RESOURCE_ROLE :
			{
				return createResourceRole();
			}

			case Bpmn2Package.ROOT_ELEMENT :
			{
				return createRootElement();
			}

			case Bpmn2Package.SCRIPT_TASK :
			{
				return createScriptTask();
			}

			case Bpmn2Package.SEND_TASK :
			{
				return createSendTask();
			}

			case Bpmn2Package.SEQUENCE_FLOW :
			{
				return createSequenceFlow();
			}

			case Bpmn2Package.SERVICE_TASK :
			{
				return createServiceTask();
			}

			case Bpmn2Package.SIGNAL :
			{
				return createSignal();
			}

			case Bpmn2Package.SIGNAL_EVENT_DEFINITION :
			{
				return createSignalEventDefinition();
			}

			case Bpmn2Package.STANDARD_LOOP_CHARACTERISTICS :
			{
				return createStandardLoopCharacteristics();
			}

			case Bpmn2Package.START_EVENT :
			{
				return createStartEvent();
			}

			case Bpmn2Package.SUB_CHOREOGRAPHY :
			{
				return createSubChoreography();
			}

			case Bpmn2Package.SUB_CONVERSATION :
			{
				return createSubConversation();
			}

			case Bpmn2Package.SUB_PROCESS :
			{
				return createSubProcess();
			}

			case Bpmn2Package.TASK :
			{
				return createTask();
			}

			case Bpmn2Package.TERMINATE_EVENT_DEFINITION :
			{
				return createTerminateEventDefinition();
			}

			case Bpmn2Package.TEXT_ANNOTATION :
			{
				return createTextAnnotation();
			}

			case Bpmn2Package.TIMER_EVENT_DEFINITION :
			{
				return createTimerEventDefinition();
			}

			case Bpmn2Package.TRANSACTION :
			{
				return createTransaction();
			}

			case Bpmn2Package.USER_TASK :
			{
				return createUserTask();
			}

			default :
			{
				throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
			}
		}
	} // end method create

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public AdHocOrdering createAdHocOrderingFromString( final EDataType eDataType, final String initialValue )
	{
		final AdHocOrdering result = AdHocOrdering.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public AdHocSubProcess createAdHocSubProcess()
	{
		final AdHocSubProcessImpl adHocSubProcess = new AdHocSubProcessImpl();

		return adHocSubProcess;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Assignment createAssignment()
	{
		final AssignmentImpl assignment = new AssignmentImpl();

		return assignment;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Association createAssociation()
	{
		final AssociationImpl association = new AssociationImpl();

		return association;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionFromString( final EDataType eDataType, final String initialValue )
	{
		final AssociationDirection result = AssociationDirection.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Auditing createAuditing()
	{
		final AuditingImpl auditing = new AuditingImpl();

		return auditing;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BoundaryEvent createBoundaryEvent()
	{
		final BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();

		return boundaryEvent;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BusinessRuleTask createBusinessRuleTask()
	{
		final BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();

		return businessRuleTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CallActivity createCallActivity()
	{
		final CallActivityImpl callActivity = new CallActivityImpl();

		return callActivity;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CallChoreography createCallChoreography()
	{
		final CallChoreographyImpl callChoreography = new CallChoreographyImpl();

		return callChoreography;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CallConversation createCallConversation()
	{
		final CallConversationImpl callConversation = new CallConversationImpl();

		return callConversation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CancelEventDefinition createCancelEventDefinition()
	{
		final CancelEventDefinitionImpl cancelEventDefinition = new CancelEventDefinitionImpl();

		return cancelEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Category createCategory()
	{
		final CategoryImpl category = new CategoryImpl();

		return category;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CategoryValue createCategoryValue()
	{
		final CategoryValueImpl categoryValue = new CategoryValueImpl();

		return categoryValue;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Choreography createChoreography()
	{
		final ChoreographyImpl choreography = new ChoreographyImpl();

		return choreography;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public ChoreographyLoopType createChoreographyLoopTypeFromString( final EDataType eDataType, final String initialValue )
	{
		final ChoreographyLoopType result = ChoreographyLoopType.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ChoreographyTask createChoreographyTask()
	{
		final ChoreographyTaskImpl choreographyTask = new ChoreographyTaskImpl();

		return choreographyTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Collaboration createCollaboration()
	{
		final CollaborationImpl collaboration = new CollaborationImpl();

		return collaboration;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CompensateEventDefinition createCompensateEventDefinition()
	{
		final CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();

		return compensateEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ComplexBehaviorDefinition createComplexBehaviorDefinition()
	{
		final ComplexBehaviorDefinitionImpl complexBehaviorDefinition = new ComplexBehaviorDefinitionImpl();

		return complexBehaviorDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ComplexGateway createComplexGateway()
	{
		final ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();

		return complexGateway;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ConditionalEventDefinition createConditionalEventDefinition()
	{
		final ConditionalEventDefinitionImpl conditionalEventDefinition = new ConditionalEventDefinitionImpl();

		return conditionalEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Conversation createConversation()
	{
		final ConversationImpl conversation = new ConversationImpl();

		return conversation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ConversationAssociation createConversationAssociation()
	{
		final ConversationAssociationImpl conversationAssociation = new ConversationAssociationImpl();

		return conversationAssociation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ConversationLink createConversationLink()
	{
		final ConversationLinkImpl conversationLink = new ConversationLinkImpl();

		return conversationLink;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CorrelationKey createCorrelationKey()
	{
		final CorrelationKeyImpl correlationKey = new CorrelationKeyImpl();

		return correlationKey;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CorrelationProperty createCorrelationProperty()
	{
		final CorrelationPropertyImpl correlationProperty = new CorrelationPropertyImpl();

		return correlationProperty;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CorrelationPropertyBinding createCorrelationPropertyBinding()
	{
		final CorrelationPropertyBindingImpl correlationPropertyBinding = new CorrelationPropertyBindingImpl();

		return correlationPropertyBinding;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression()
	{
		final CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();

		return correlationPropertyRetrievalExpression;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public CorrelationSubscription createCorrelationSubscription()
	{
		final CorrelationSubscriptionImpl correlationSubscription = new CorrelationSubscriptionImpl();

		return correlationSubscription;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataAssociation createDataAssociation()
	{
		final DataAssociationImpl dataAssociation = new DataAssociationImpl();

		return dataAssociation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataInput createDataInput()
	{
		final DataInputImpl dataInput = new DataInputImpl();

		return dataInput;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataInputAssociation createDataInputAssociation()
	{
		final DataInputAssociationImpl dataInputAssociation = new DataInputAssociationImpl();

		return dataInputAssociation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataObject createDataObject()
	{
		final DataObjectImpl dataObject = new DataObjectImpl();

		return dataObject;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataObjectReference createDataObjectReference()
	{
		final DataObjectReferenceImpl dataObjectReference = new DataObjectReferenceImpl();

		return dataObjectReference;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataOutput createDataOutput()
	{
		final DataOutputImpl dataOutput = new DataOutputImpl();

		return dataOutput;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataOutputAssociation createDataOutputAssociation()
	{
		final DataOutputAssociationImpl dataOutputAssociation = new DataOutputAssociationImpl();

		return dataOutputAssociation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataState createDataState()
	{
		final DataStateImpl dataState = new DataStateImpl();

		return dataState;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataStore createDataStore()
	{
		final DataStoreImpl dataStore = new DataStoreImpl();

		return dataStore;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DataStoreReference createDataStoreReference()
	{
		final DataStoreReferenceImpl dataStoreReference = new DataStoreReferenceImpl();

		return dataStoreReference;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Definitions createDefinitions()
	{
		final DefinitionsImpl definitions = new DefinitionsImpl();

		return definitions;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Documentation createDocumentation()
	{
		final DocumentationImpl documentation = new DocumentationImpl();

		return documentation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DocumentRoot createDocumentRoot()
	{
		final DocumentRootImpl documentRoot = new DocumentRootImpl();

		return documentRoot;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EndEvent createEndEvent()
	{
		final EndEventImpl endEvent = new EndEventImpl();

		return endEvent;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EndPoint createEndPoint()
	{
		final EndPointImpl endPoint = new EndPointImpl();

		return endPoint;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public org.eclipse.bpmn2.Error createError()
	{
		final ErrorImpl error = new ErrorImpl();

		return error;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ErrorEventDefinition createErrorEventDefinition()
	{
		final ErrorEventDefinitionImpl errorEventDefinition = new ErrorEventDefinitionImpl();

		return errorEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Escalation createEscalation()
	{
		final EscalationImpl escalation = new EscalationImpl();

		return escalation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EscalationEventDefinition createEscalationEventDefinition()
	{
		final EscalationEventDefinitionImpl escalationEventDefinition = new EscalationEventDefinitionImpl();

		return escalationEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public EventBasedGateway createEventBasedGateway()
	{
		final EventBasedGatewayImpl eventBasedGateway = new EventBasedGatewayImpl();

		return eventBasedGateway;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public EventBasedGatewayType createEventBasedGatewayTypeFromString( final EDataType eDataType, final String initialValue )
	{
		final EventBasedGatewayType result = EventBasedGatewayType.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ExclusiveGateway createExclusiveGateway()
	{
		final ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();

		return exclusiveGateway;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Expression createExpression()
	{
		final ExpressionImpl expression = new ExpressionImpl();

		return expression;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Extension createExtension()
	{
		final ExtensionImpl extension = new ExtensionImpl();

		return extension;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ExtensionAttributeDefinition createExtensionAttributeDefinition()
	{
		final ExtensionAttributeDefinitionImpl extensionAttributeDefinition = new ExtensionAttributeDefinitionImpl();

		return extensionAttributeDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ExtensionAttributeValue createExtensionAttributeValue()
	{
		final ExtensionAttributeValueImpl extensionAttributeValue = new ExtensionAttributeValueImpl();

		return extensionAttributeValue;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ExtensionDefinition createExtensionDefinition()
	{
		final ExtensionDefinitionImpl extensionDefinition = new ExtensionDefinitionImpl();

		return extensionDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public FormalExpression createFormalExpression()
	{
		final FormalExpressionImpl formalExpression = new FormalExpressionImpl();

		return formalExpression;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Object createFromString( final EDataType eDataType, final String initialValue )
	{
		switch( eDataType.getClassifierID())
		{
			case Bpmn2Package.AD_HOC_ORDERING :
			{
				return createAdHocOrderingFromString( eDataType, initialValue );
			}

			case Bpmn2Package.ASSOCIATION_DIRECTION :
			{
				return createAssociationDirectionFromString( eDataType, initialValue );
			}

			case Bpmn2Package.CHOREOGRAPHY_LOOP_TYPE :
			{
				return createChoreographyLoopTypeFromString( eDataType, initialValue );
			}

			case Bpmn2Package.EVENT_BASED_GATEWAY_TYPE :
			{
				return createEventBasedGatewayTypeFromString( eDataType, initialValue );
			}

			case Bpmn2Package.GATEWAY_DIRECTION :
			{
				return createGatewayDirectionFromString( eDataType, initialValue );
			}

			case Bpmn2Package.ITEM_KIND :
			{
				return createItemKindFromString( eDataType, initialValue );
			}

			case Bpmn2Package.MULTI_INSTANCE_BEHAVIOR :
			{
				return createMultiInstanceBehaviorFromString( eDataType, initialValue );
			}

			case Bpmn2Package.PROCESS_TYPE :
			{
				return createProcessTypeFromString( eDataType, initialValue );
			}

			case Bpmn2Package.RELATIONSHIP_DIRECTION :
			{
				return createRelationshipDirectionFromString( eDataType, initialValue );
			}

			default :
			{
				throw new IllegalArgumentException( "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
			}
		}
	} // end method createFromString

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString( final EDataType eDataType, final String initialValue )
	{
		final GatewayDirection result = GatewayDirection.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public GlobalBusinessRuleTask createGlobalBusinessRuleTask()
	{
		final GlobalBusinessRuleTaskImpl globalBusinessRuleTask = new GlobalBusinessRuleTaskImpl();

		return globalBusinessRuleTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public GlobalChoreographyTask createGlobalChoreographyTask()
	{
		final GlobalChoreographyTaskImpl globalChoreographyTask = new GlobalChoreographyTaskImpl();

		return globalChoreographyTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public GlobalConversation createGlobalConversation()
	{
		final GlobalConversationImpl globalConversation = new GlobalConversationImpl();

		return globalConversation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public GlobalManualTask createGlobalManualTask()
	{
		final GlobalManualTaskImpl globalManualTask = new GlobalManualTaskImpl();

		return globalManualTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public GlobalScriptTask createGlobalScriptTask()
	{
		final GlobalScriptTaskImpl globalScriptTask = new GlobalScriptTaskImpl();

		return globalScriptTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public GlobalTask createGlobalTask()
	{
		final GlobalTaskImpl globalTask = new GlobalTaskImpl();

		return globalTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public GlobalUserTask createGlobalUserTask()
	{
		final GlobalUserTaskImpl globalUserTask = new GlobalUserTaskImpl();

		return globalUserTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Group createGroup()
	{
		final GroupImpl group = new GroupImpl();

		return group;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public HumanPerformer createHumanPerformer()
	{
		final HumanPerformerImpl humanPerformer = new HumanPerformerImpl();

		return humanPerformer;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ImplicitThrowEvent createImplicitThrowEvent()
	{
		final ImplicitThrowEventImpl implicitThrowEvent = new ImplicitThrowEventImpl();

		return implicitThrowEvent;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Import createImport()
	{
		final ImportImpl import_ = new ImportImpl();

		return import_;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public InclusiveGateway createInclusiveGateway()
	{
		final InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();

		return inclusiveGateway;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public InputOutputBinding createInputOutputBinding()
	{
		final InputOutputBindingImpl inputOutputBinding = new InputOutputBindingImpl();

		return inputOutputBinding;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public InputOutputSpecification createInputOutputSpecification()
	{
		final InputOutputSpecificationImpl inputOutputSpecification = new InputOutputSpecificationImpl();

		return inputOutputSpecification;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public InputSet createInputSet()
	{
		final InputSetImpl inputSet = new InputSetImpl();

		return inputSet;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Interface createInterface()
	{
		final InterfaceImpl interface_ = new InterfaceImpl();

		return interface_;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public IntermediateCatchEvent createIntermediateCatchEvent()
	{
		final IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();

		return intermediateCatchEvent;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public IntermediateThrowEvent createIntermediateThrowEvent()
	{
		final IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();

		return intermediateThrowEvent;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ItemAwareElement createItemAwareElement()
	{
		final ItemAwareElementImpl itemAwareElement = new ItemAwareElementImpl();

		return itemAwareElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ItemDefinition createItemDefinition()
	{
		final ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();

		return itemDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public ItemKind createItemKindFromString( final EDataType eDataType, final String initialValue )
	{
		final ItemKind result = ItemKind.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Lane createLane()
	{
		final LaneImpl lane = new LaneImpl();

		return lane;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public LaneSet createLaneSet()
	{
		final LaneSetImpl laneSet = new LaneSetImpl();

		return laneSet;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public LinkEventDefinition createLinkEventDefinition()
	{
		final LinkEventDefinitionImpl linkEventDefinition = new LinkEventDefinitionImpl();

		return linkEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ManualTask createManualTask()
	{
		final ManualTaskImpl manualTask = new ManualTaskImpl();

		return manualTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Message createMessage()
	{
		final MessageImpl message = new MessageImpl();

		return message;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public MessageEventDefinition createMessageEventDefinition()
	{
		final MessageEventDefinitionImpl messageEventDefinition = new MessageEventDefinitionImpl();

		return messageEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public MessageFlow createMessageFlow()
	{
		final MessageFlowImpl messageFlow = new MessageFlowImpl();

		return messageFlow;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public MessageFlowAssociation createMessageFlowAssociation()
	{
		final MessageFlowAssociationImpl messageFlowAssociation = new MessageFlowAssociationImpl();

		return messageFlowAssociation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Monitoring createMonitoring()
	{
		final MonitoringImpl monitoring = new MonitoringImpl();

		return monitoring;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public MultiInstanceBehavior createMultiInstanceBehaviorFromString( final EDataType eDataType, final String initialValue )
	{
		final MultiInstanceBehavior result = MultiInstanceBehavior.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics()
	{
		final MultiInstanceLoopCharacteristicsImpl multiInstanceLoopCharacteristics = new MultiInstanceLoopCharacteristicsImpl();

		return multiInstanceLoopCharacteristics;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Operation createOperation()
	{
		final OperationImpl operation = new OperationImpl();

		return operation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public OutputSet createOutputSet()
	{
		final OutputSetImpl outputSet = new OutputSetImpl();

		return outputSet;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ParallelGateway createParallelGateway()
	{
		final ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();

		return parallelGateway;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Participant createParticipant()
	{
		final ParticipantImpl participant = new ParticipantImpl();

		return participant;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ParticipantAssociation createParticipantAssociation()
	{
		final ParticipantAssociationImpl participantAssociation = new ParticipantAssociationImpl();

		return participantAssociation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ParticipantMultiplicity createParticipantMultiplicity()
	{
		final ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();

		return participantMultiplicity;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public PartnerEntity createPartnerEntity()
	{
		final PartnerEntityImpl partnerEntity = new PartnerEntityImpl();

		return partnerEntity;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public PartnerRole createPartnerRole()
	{
		final PartnerRoleImpl partnerRole = new PartnerRoleImpl();

		return partnerRole;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Performer createPerformer()
	{
		final PerformerImpl performer = new PerformerImpl();

		return performer;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public PotentialOwner createPotentialOwner()
	{
		final PotentialOwnerImpl potentialOwner = new PotentialOwnerImpl();

		return potentialOwner;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public org.eclipse.bpmn2.Process createProcess()
	{
		final ProcessImpl process = new ProcessImpl();

		return process;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public ProcessType createProcessTypeFromString( final EDataType eDataType, final String initialValue )
	{
		final ProcessType result = ProcessType.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Property createProperty()
	{
		final PropertyImpl property = new PropertyImpl();

		return property;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ReceiveTask createReceiveTask()
	{
		final ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();

		return receiveTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Relationship createRelationship()
	{
		final RelationshipImpl relationship = new RelationshipImpl();

		return relationship;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      eDataType     DOCUMENT ME!
	 * @param      initialValue  DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @throws     IllegalArgumentException  DOCUMENT ME!
	 *
	 * @generated
	 */
	public RelationshipDirection createRelationshipDirectionFromString( final EDataType eDataType, final String initialValue )
	{
		final RelationshipDirection result = RelationshipDirection.get( initialValue );

		if( result == null )
		{
			throw new IllegalArgumentException( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
		}

		return result;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Rendering createRendering()
	{
		final RenderingImpl rendering = new RenderingImpl();

		return rendering;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Resource createResource()
	{
		final ResourceImpl resource = new ResourceImpl();

		return resource;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ResourceAssignmentExpression createResourceAssignmentExpression()
	{
		final ResourceAssignmentExpressionImpl resourceAssignmentExpression = new ResourceAssignmentExpressionImpl();

		return resourceAssignmentExpression;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ResourceParameter createResourceParameter()
	{
		final ResourceParameterImpl resourceParameter = new ResourceParameterImpl();

		return resourceParameter;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ResourceParameterBinding createResourceParameterBinding()
	{
		final ResourceParameterBindingImpl resourceParameterBinding = new ResourceParameterBindingImpl();

		return resourceParameterBinding;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ResourceRole createResourceRole()
	{
		final ResourceRoleImpl resourceRole = new ResourceRoleImpl();

		return resourceRole;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ScriptTask createScriptTask()
	{
		final ScriptTaskImpl scriptTask = new ScriptTaskImpl();

		return scriptTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public SendTask createSendTask()
	{
		final SendTaskImpl sendTask = new SendTaskImpl();

		return sendTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public SequenceFlow createSequenceFlow()
	{
		final SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();

		return sequenceFlow;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public ServiceTask createServiceTask()
	{
		final ServiceTaskImpl serviceTask = new ServiceTaskImpl();

		return serviceTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Signal createSignal()
	{
		final SignalImpl signal = new SignalImpl();

		return signal;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public SignalEventDefinition createSignalEventDefinition()
	{
		final SignalEventDefinitionImpl signalEventDefinition = new SignalEventDefinitionImpl();

		return signalEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public StandardLoopCharacteristics createStandardLoopCharacteristics()
	{
		final StandardLoopCharacteristicsImpl standardLoopCharacteristics = new StandardLoopCharacteristicsImpl();

		return standardLoopCharacteristics;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public StartEvent createStartEvent()
	{
		final StartEventImpl startEvent = new StartEventImpl();

		return startEvent;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public SubChoreography createSubChoreography()
	{
		final SubChoreographyImpl subChoreography = new SubChoreographyImpl();

		return subChoreography;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public SubConversation createSubConversation()
	{
		final SubConversationImpl subConversation = new SubConversationImpl();

		return subConversation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public SubProcess createSubProcess()
	{
		final SubProcessImpl subProcess = new SubProcessImpl();

		return subProcess;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Task createTask()
	{
		final TaskImpl task = new TaskImpl();

		return task;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public TerminateEventDefinition createTerminateEventDefinition()
	{
		final TerminateEventDefinitionImpl terminateEventDefinition = new TerminateEventDefinitionImpl();

		return terminateEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public TextAnnotation createTextAnnotation()
	{
		final TextAnnotationImpl textAnnotation = new TextAnnotationImpl();

		return textAnnotation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public TimerEventDefinition createTimerEventDefinition()
	{
		final TimerEventDefinitionImpl timerEventDefinition = new TimerEventDefinitionImpl();

		return timerEventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Transaction createTransaction()
	{
		final TransactionImpl transaction = new TransactionImpl();

		return transaction;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public UserTask createUserTask()
	{
		final UserTaskImpl userTask = new UserTaskImpl();

		return userTask;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public Bpmn2Package getBpmn2Package()
	{
		return (Bpmn2Package) getEPackage();
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected Activity createActivity()
	{
		final ActivityImpl activity = new ActivityImpl();

		return activity;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected Artifact createArtifact()
	{
		final ArtifactImpl artifact = new ArtifactImpl();

		return artifact;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected BaseElement createBaseElement()
	{
		final BaseElementImpl baseElement = new BaseElementImpl();

		return baseElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected CallableElement createCallableElement()
	{
		final CallableElementImpl callableElement = new CallableElementImpl();

		return callableElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected ConversationNode createConversationNode()
	{
		final ConversationNodeImpl conversationNode = new ConversationNodeImpl();

		return conversationNode;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected EventDefinition createEventDefinition()
	{
		final EventDefinitionImpl eventDefinition = new EventDefinitionImpl();

		return eventDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected InteractionNode createInteractionNode()
	{
		final InteractionNodeImpl interactionNode = new InteractionNodeImpl();

		return interactionNode;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	protected RootElement createRootElement()
	{
		final RootElementImpl rootElement = new RootElementImpl();

		return rootElement;
	}
} //Bpmn2FactoryImpl
