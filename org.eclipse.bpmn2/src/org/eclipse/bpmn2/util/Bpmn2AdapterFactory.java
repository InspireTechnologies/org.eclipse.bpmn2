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
package org.eclipse.bpmn2.util;

import org.eclipse.bpmn2.Activity;
import org.eclipse.bpmn2.AdHocSubProcess;
import org.eclipse.bpmn2.Artifact;
import org.eclipse.bpmn2.Assignment;
import org.eclipse.bpmn2.Association;
import org.eclipse.bpmn2.Auditing;
import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.BoundaryEvent;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.BusinessRuleTask;
import org.eclipse.bpmn2.CallActivity;
import org.eclipse.bpmn2.CallChoreography;
import org.eclipse.bpmn2.CallConversation;
import org.eclipse.bpmn2.CallableElement;
import org.eclipse.bpmn2.CancelEventDefinition;
import org.eclipse.bpmn2.CatchEvent;
import org.eclipse.bpmn2.Category;
import org.eclipse.bpmn2.CategoryValue;
import org.eclipse.bpmn2.Choreography;
import org.eclipse.bpmn2.ChoreographyActivity;
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
import org.eclipse.bpmn2.Event;
import org.eclipse.bpmn2.EventBasedGateway;
import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.ExclusiveGateway;
import org.eclipse.bpmn2.Expression;
import org.eclipse.bpmn2.Extension;
import org.eclipse.bpmn2.ExtensionAttributeDefinition;
import org.eclipse.bpmn2.ExtensionAttributeValue;
import org.eclipse.bpmn2.ExtensionDefinition;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.FlowElementsContainer;
import org.eclipse.bpmn2.FlowNode;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.Gateway;
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
import org.eclipse.bpmn2.Lane;
import org.eclipse.bpmn2.LaneSet;
import org.eclipse.bpmn2.LinkEventDefinition;
import org.eclipse.bpmn2.LoopCharacteristics;
import org.eclipse.bpmn2.ManualTask;
import org.eclipse.bpmn2.Message;
import org.eclipse.bpmn2.MessageEventDefinition;
import org.eclipse.bpmn2.MessageFlow;
import org.eclipse.bpmn2.MessageFlowAssociation;
import org.eclipse.bpmn2.Monitoring;
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
import org.eclipse.bpmn2.Property;
import org.eclipse.bpmn2.ReceiveTask;
import org.eclipse.bpmn2.Relationship;
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
import org.eclipse.bpmn2.ThrowEvent;
import org.eclipse.bpmn2.TimerEventDefinition;
import org.eclipse.bpmn2.Transaction;
import org.eclipse.bpmn2.UserTask;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @author     Harald
 * @see        org.eclipse.bpmn2.Bpmn2Package
 * @generated
 */
public class Bpmn2AdapterFactory
	extends AdapterFactoryImpl
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bpmn2AdapterFactory()
	{
		if( modelPackage == null )
		{
			modelPackage = Bpmn2Package.eINSTANCE;
		}
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      target  the object to adapt.
	 *
	 * @return     the adapter for the <code>target</code>.
	 *
	 * @generated
	 */
	@Override public Adapter createAdapter( final Notifier target )
	{
		return modelSwitch.doSwitch((EObject) target );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.AdHocSubProcess
	 * @generated
	 */
	public Adapter createAdHocSubProcessAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Auditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Auditing
	 * @generated
	 */
	public Adapter createAuditingAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.BoundaryEvent
	 * @generated
	 */
	public Adapter createBoundaryEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.BusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.BusinessRuleTask
	 * @generated
	 */
	public Adapter createBusinessRuleTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CallableElement
	 * @generated
	 */
	public Adapter createCallableElementAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CallActivity
	 * @generated
	 */
	public Adapter createCallActivityAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CallChoreography <em>Call Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CallChoreography
	 * @generated
	 */
	public Adapter createCallChoreographyAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CallConversation <em>Call Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CallConversation
	 * @generated
	 */
	public Adapter createCallConversationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CancelEventDefinition <em>Cancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CancelEventDefinition
	 * @generated
	 */
	public Adapter createCancelEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CatchEvent
	 * @generated
	 */
	public Adapter createCatchEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CategoryValue
	 * @generated
	 */
	public Adapter createCategoryValueAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ChoreographyActivity <em>Choreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ChoreographyActivity
	 * @generated
	 */
	public Adapter createChoreographyActivityAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Choreography
	 * @generated
	 */
	public Adapter createChoreographyAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ChoreographyTask
	 * @generated
	 */
	public Adapter createChoreographyTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Collaboration
	 * @generated
	 */
	public Adapter createCollaborationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CompensateEventDefinition
	 * @generated
	 */
	public Adapter createCompensateEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ComplexBehaviorDefinition
	 * @generated
	 */
	public Adapter createComplexBehaviorDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ComplexGateway
	 * @generated
	 */
	public Adapter createComplexGatewayAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ConditionalEventDefinition
	 * @generated
	 */
	public Adapter createConditionalEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Conversation
	 * @generated
	 */
	public Adapter createConversationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ConversationAssociation
	 * @generated
	 */
	public Adapter createConversationAssociationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ConversationLink
	 * @generated
	 */
	public Adapter createConversationLinkAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ConversationNode
	 * @generated
	 */
	public Adapter createConversationNodeAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CorrelationKey
	 * @generated
	 */
	public Adapter createCorrelationKeyAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CorrelationProperty <em>Correlation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CorrelationProperty
	 * @generated
	 */
	public Adapter createCorrelationPropertyAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CorrelationPropertyBinding
	 * @generated
	 */
	public Adapter createCorrelationPropertyBindingAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CorrelationPropertyRetrievalExpression
	 * @generated
	 */
	public Adapter createCorrelationPropertyRetrievalExpressionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.CorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.CorrelationSubscription
	 * @generated
	 */
	public Adapter createCorrelationSubscriptionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataAssociation
	 * @generated
	 */
	public Adapter createDataAssociationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataInput
	 * @generated
	 */
	public Adapter createDataInputAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataInputAssociation
	 * @generated
	 */
	public Adapter createDataInputAssociationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataObjectReference
	 * @generated
	 */
	public Adapter createDataObjectReferenceAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataOutput
	 * @generated
	 */
	public Adapter createDataOutputAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataOutputAssociation
	 * @generated
	 */
	public Adapter createDataOutputAssociationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataState
	 * @generated
	 */
	public Adapter createDataStateAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DataStoreReference <em>Data Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DataStoreReference
	 * @generated
	 */
	public Adapter createDataStoreReferenceAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Definitions
	 * @generated
	 */
	public Adapter createDefinitionsAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.EndEvent
	 * @generated
	 */
	public Adapter createEndEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Error
	 * @generated
	 */
	public Adapter createErrorAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ErrorEventDefinition <em>Error Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ErrorEventDefinition
	 * @generated
	 */
	public Adapter createErrorEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Escalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Escalation
	 * @generated
	 */
	public Adapter createEscalationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.EscalationEventDefinition
	 * @generated
	 */
	public Adapter createEscalationEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Event
	 * @generated
	 */
	public Adapter createEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.EventBasedGateway <em>Event Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.EventBasedGateway
	 * @generated
	 */
	public Adapter createEventBasedGatewayAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.EventDefinition
	 * @generated
	 */
	public Adapter createEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ExclusiveGateway
	 * @generated
	 */
	public Adapter createExclusiveGatewayAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ExtensionAttributeDefinition <em>Extension Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ExtensionAttributeDefinition
	 * @generated
	 */
	public Adapter createExtensionAttributeDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ExtensionAttributeValue <em>Extension Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ExtensionAttributeValue
	 * @generated
	 */
	public Adapter createExtensionAttributeValueAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ExtensionDefinition
	 * @generated
	 */
	public Adapter createExtensionDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.FlowElementsContainer
	 * @generated
	 */
	public Adapter createFlowElementsContainerAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.FormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.FormalExpression
	 * @generated
	 */
	public Adapter createFormalExpressionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.GlobalBusinessRuleTask
	 * @generated
	 */
	public Adapter createGlobalBusinessRuleTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.GlobalChoreographyTask
	 * @generated
	 */
	public Adapter createGlobalChoreographyTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.GlobalConversation <em>Global Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.GlobalConversation
	 * @generated
	 */
	public Adapter createGlobalConversationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.GlobalManualTask <em>Global Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.GlobalManualTask
	 * @generated
	 */
	public Adapter createGlobalManualTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.GlobalScriptTask <em>Global Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.GlobalScriptTask
	 * @generated
	 */
	public Adapter createGlobalScriptTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.GlobalTask <em>Global Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.GlobalTask
	 * @generated
	 */
	public Adapter createGlobalTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.GlobalUserTask <em>Global User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.GlobalUserTask
	 * @generated
	 */
	public Adapter createGlobalUserTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Group
	 * @generated
	 */
	public Adapter createGroupAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.HumanPerformer <em>Human Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.HumanPerformer
	 * @generated
	 */
	public Adapter createHumanPerformerAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ImplicitThrowEvent
	 * @generated
	 */
	public Adapter createImplicitThrowEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Import
	 * @generated
	 */
	public Adapter createImportAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.InclusiveGateway
	 * @generated
	 */
	public Adapter createInclusiveGatewayAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.InputOutputBinding <em>Input Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.InputOutputBinding
	 * @generated
	 */
	public Adapter createInputOutputBindingAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.InputOutputSpecification <em>Input Output Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.InputOutputSpecification
	 * @generated
	 */
	public Adapter createInputOutputSpecificationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.InputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.InputSet
	 * @generated
	 */
	public Adapter createInputSetAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.InteractionNode <em>Interaction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.InteractionNode
	 * @generated
	 */
	public Adapter createInteractionNodeAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.IntermediateCatchEvent
	 * @generated
	 */
	public Adapter createIntermediateCatchEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.IntermediateThrowEvent
	 * @generated
	 */
	public Adapter createIntermediateThrowEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ItemAwareElement <em>Item Aware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ItemAwareElement
	 * @generated
	 */
	public Adapter createItemAwareElementAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ItemDefinition
	 * @generated
	 */
	public Adapter createItemDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.LaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.LaneSet
	 * @generated
	 */
	public Adapter createLaneSetAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.LinkEventDefinition <em>Link Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.LinkEventDefinition
	 * @generated
	 */
	public Adapter createLinkEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.LoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.LoopCharacteristics
	 * @generated
	 */
	public Adapter createLoopCharacteristicsAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ManualTask
	 * @generated
	 */
	public Adapter createManualTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Message
	 * @generated
	 */
	public Adapter createMessageAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.MessageEventDefinition <em>Message Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.MessageEventDefinition
	 * @generated
	 */
	public Adapter createMessageEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.MessageFlow
	 * @generated
	 */
	public Adapter createMessageFlowAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.MessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.MessageFlowAssociation
	 * @generated
	 */
	public Adapter createMessageFlowAssociationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Monitoring
	 * @generated
	 */
	public Adapter createMonitoringAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.MultiInstanceLoopCharacteristics
	 * @generated
	 */
	public Adapter createMultiInstanceLoopCharacteristicsAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.OutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.OutputSet
	 * @generated
	 */
	public Adapter createOutputSetAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ParallelGateway
	 * @generated
	 */
	public Adapter createParallelGatewayAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ParticipantAssociation
	 * @generated
	 */
	public Adapter createParticipantAssociationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ParticipantMultiplicity
	 * @generated
	 */
	public Adapter createParticipantMultiplicityAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.PartnerEntity <em>Partner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.PartnerEntity
	 * @generated
	 */
	public Adapter createPartnerEntityAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.PartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.PartnerRole
	 * @generated
	 */
	public Adapter createPartnerRoleAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Performer
	 * @generated
	 */
	public Adapter createPerformerAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.PotentialOwner <em>Potential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.PotentialOwner
	 * @generated
	 */
	public Adapter createPotentialOwnerAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Process
	 * @generated
	 */
	public Adapter createProcessAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ReceiveTask
	 * @generated
	 */
	public Adapter createReceiveTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Rendering
	 * @generated
	 */
	public Adapter createRenderingAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ResourceAssignmentExpression
	 * @generated
	 */
	public Adapter createResourceAssignmentExpressionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ResourceParameter
	 * @generated
	 */
	public Adapter createResourceParameterAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ResourceParameterBinding
	 * @generated
	 */
	public Adapter createResourceParameterBindingAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ResourceRole
	 * @generated
	 */
	public Adapter createResourceRoleAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.RootElement
	 * @generated
	 */
	public Adapter createRootElementAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ScriptTask
	 * @generated
	 */
	public Adapter createScriptTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.SendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.SendTask
	 * @generated
	 */
	public Adapter createSendTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ServiceTask
	 * @generated
	 */
	public Adapter createServiceTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.SignalEventDefinition <em>Signal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.SignalEventDefinition
	 * @generated
	 */
	public Adapter createSignalEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.StandardLoopCharacteristics
	 * @generated
	 */
	public Adapter createStandardLoopCharacteristicsAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.StartEvent
	 * @generated
	 */
	public Adapter createStartEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.SubChoreography <em>Sub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.SubChoreography
	 * @generated
	 */
	public Adapter createSubChoreographyAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.SubConversation <em>Sub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.SubConversation
	 * @generated
	 */
	public Adapter createSubConversationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.SubProcess
	 * @generated
	 */
	public Adapter createSubProcessAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Task
	 * @generated
	 */
	public Adapter createTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.TerminateEventDefinition
	 * @generated
	 */
	public Adapter createTerminateEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.TextAnnotation
	 * @generated
	 */
	public Adapter createTextAnnotationAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.ThrowEvent
	 * @generated
	 */
	public Adapter createThrowEventAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.TimerEventDefinition <em>Timer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.TimerEventDefinition
	 * @generated
	 */
	public Adapter createTimerEventDefinitionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.bpmn2.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return     the new adapter.
	 *
	 * @see        org.eclipse.bpmn2.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter()
	{
		return null;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @param      object  DOCUMENT ME!
	 *
	 * @return     whether this factory is applicable for the type of the object.
	 *
	 * @generated
	 */
	@Override public boolean isFactoryForType( final Object object )
	{
		if( object == modelPackage )
		{
			return true;
		}

		if( object instanceof EObject )
		{
			return ((EObject) object ).eClass().getEPackage() == modelPackage;
		}

		return false;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bpmn2Switch<Adapter> modelSwitch =
		new Bpmn2Switch<Adapter>()
		{
			@Override public Adapter caseDocumentRoot( final DocumentRoot object )
			{
				return createDocumentRootAdapter();
			}

			@Override public Adapter caseActivity( final Activity object )
			{
				return createActivityAdapter();
			}

			@Override public Adapter caseAdHocSubProcess( final AdHocSubProcess object )
			{
				return createAdHocSubProcessAdapter();
			}

			@Override public Adapter caseArtifact( final Artifact object )
			{
				return createArtifactAdapter();
			}

			@Override public Adapter caseAssignment( final Assignment object )
			{
				return createAssignmentAdapter();
			}

			@Override public Adapter caseAssociation( final Association object )
			{
				return createAssociationAdapter();
			}

			@Override public Adapter caseAuditing( final Auditing object )
			{
				return createAuditingAdapter();
			}

			@Override public Adapter caseBaseElement( final BaseElement object )
			{
				return createBaseElementAdapter();
			}

			@Override public Adapter caseBoundaryEvent( final BoundaryEvent object )
			{
				return createBoundaryEventAdapter();
			}

			@Override public Adapter caseBusinessRuleTask( final BusinessRuleTask object )
			{
				return createBusinessRuleTaskAdapter();
			}

			@Override public Adapter caseCallActivity( final CallActivity object )
			{
				return createCallActivityAdapter();
			}

			@Override public Adapter caseCallChoreography( final CallChoreography object )
			{
				return createCallChoreographyAdapter();
			}

			@Override public Adapter caseCallConversation( final CallConversation object )
			{
				return createCallConversationAdapter();
			}

			@Override public Adapter caseCallableElement( final CallableElement object )
			{
				return createCallableElementAdapter();
			}

			@Override public Adapter caseCancelEventDefinition( final CancelEventDefinition object )
			{
				return createCancelEventDefinitionAdapter();
			}

			@Override public Adapter caseCatchEvent( final CatchEvent object )
			{
				return createCatchEventAdapter();
			}

			@Override public Adapter caseCategory( final Category object )
			{
				return createCategoryAdapter();
			}

			@Override public Adapter caseCategoryValue( final CategoryValue object )
			{
				return createCategoryValueAdapter();
			}

			@Override public Adapter caseChoreography( final Choreography object )
			{
				return createChoreographyAdapter();
			}

			@Override public Adapter caseChoreographyActivity( final ChoreographyActivity object )
			{
				return createChoreographyActivityAdapter();
			}

			@Override public Adapter caseChoreographyTask( final ChoreographyTask object )
			{
				return createChoreographyTaskAdapter();
			}

			@Override public Adapter caseCollaboration( final Collaboration object )
			{
				return createCollaborationAdapter();
			}

			@Override public Adapter caseCompensateEventDefinition( final CompensateEventDefinition object )
			{
				return createCompensateEventDefinitionAdapter();
			}

			@Override public Adapter caseComplexBehaviorDefinition( final ComplexBehaviorDefinition object )
			{
				return createComplexBehaviorDefinitionAdapter();
			}

			@Override public Adapter caseComplexGateway( final ComplexGateway object )
			{
				return createComplexGatewayAdapter();
			}

			@Override public Adapter caseConditionalEventDefinition( final ConditionalEventDefinition object )
			{
				return createConditionalEventDefinitionAdapter();
			}

			@Override public Adapter caseConversation( final Conversation object )
			{
				return createConversationAdapter();
			}

			@Override public Adapter caseConversationAssociation( final ConversationAssociation object )
			{
				return createConversationAssociationAdapter();
			}

			@Override public Adapter caseConversationLink( final ConversationLink object )
			{
				return createConversationLinkAdapter();
			}

			@Override public Adapter caseConversationNode( final ConversationNode object )
			{
				return createConversationNodeAdapter();
			}

			@Override public Adapter caseCorrelationKey( final CorrelationKey object )
			{
				return createCorrelationKeyAdapter();
			}

			@Override public Adapter caseCorrelationProperty( final CorrelationProperty object )
			{
				return createCorrelationPropertyAdapter();
			}

			@Override public Adapter caseCorrelationPropertyBinding( final CorrelationPropertyBinding object )
			{
				return createCorrelationPropertyBindingAdapter();
			}

			@Override public Adapter caseCorrelationPropertyRetrievalExpression( final CorrelationPropertyRetrievalExpression object )
			{
				return createCorrelationPropertyRetrievalExpressionAdapter();
			}

			@Override public Adapter caseCorrelationSubscription( final CorrelationSubscription object )
			{
				return createCorrelationSubscriptionAdapter();
			}

			@Override public Adapter caseDataAssociation( final DataAssociation object )
			{
				return createDataAssociationAdapter();
			}

			@Override public Adapter caseDataInput( final DataInput object )
			{
				return createDataInputAdapter();
			}

			@Override public Adapter caseDataInputAssociation( final DataInputAssociation object )
			{
				return createDataInputAssociationAdapter();
			}

			@Override public Adapter caseDataObject( final DataObject object )
			{
				return createDataObjectAdapter();
			}

			@Override public Adapter caseDataObjectReference( final DataObjectReference object )
			{
				return createDataObjectReferenceAdapter();
			}

			@Override public Adapter caseDataOutput( final DataOutput object )
			{
				return createDataOutputAdapter();
			}

			@Override public Adapter caseDataOutputAssociation( final DataOutputAssociation object )
			{
				return createDataOutputAssociationAdapter();
			}

			@Override public Adapter caseDataState( final DataState object )
			{
				return createDataStateAdapter();
			}

			@Override public Adapter caseDataStore( final DataStore object )
			{
				return createDataStoreAdapter();
			}

			@Override public Adapter caseDataStoreReference( final DataStoreReference object )
			{
				return createDataStoreReferenceAdapter();
			}

			@Override public Adapter caseDefinitions( final Definitions object )
			{
				return createDefinitionsAdapter();
			}

			@Override public Adapter caseDocumentation( final Documentation object )
			{
				return createDocumentationAdapter();
			}

			@Override public Adapter caseEndEvent( final EndEvent object )
			{
				return createEndEventAdapter();
			}

			@Override public Adapter caseEndPoint( final EndPoint object )
			{
				return createEndPointAdapter();
			}

			@Override public Adapter caseError( final org.eclipse.bpmn2.Error object )
			{
				return createErrorAdapter();
			}

			@Override public Adapter caseErrorEventDefinition( final ErrorEventDefinition object )
			{
				return createErrorEventDefinitionAdapter();
			}

			@Override public Adapter caseEscalation( final Escalation object )
			{
				return createEscalationAdapter();
			}

			@Override public Adapter caseEscalationEventDefinition( final EscalationEventDefinition object )
			{
				return createEscalationEventDefinitionAdapter();
			}

			@Override public Adapter caseEvent( final Event object )
			{
				return createEventAdapter();
			}

			@Override public Adapter caseEventBasedGateway( final EventBasedGateway object )
			{
				return createEventBasedGatewayAdapter();
			}

			@Override public Adapter caseEventDefinition( final EventDefinition object )
			{
				return createEventDefinitionAdapter();
			}

			@Override public Adapter caseExclusiveGateway( final ExclusiveGateway object )
			{
				return createExclusiveGatewayAdapter();
			}

			@Override public Adapter caseExpression( final Expression object )
			{
				return createExpressionAdapter();
			}

			@Override public Adapter caseExtension( final Extension object )
			{
				return createExtensionAdapter();
			}

			@Override public Adapter caseExtensionAttributeDefinition( final ExtensionAttributeDefinition object )
			{
				return createExtensionAttributeDefinitionAdapter();
			}

			@Override public Adapter caseExtensionAttributeValue( final ExtensionAttributeValue object )
			{
				return createExtensionAttributeValueAdapter();
			}

			@Override public Adapter caseExtensionDefinition( final ExtensionDefinition object )
			{
				return createExtensionDefinitionAdapter();
			}

			@Override public Adapter caseFlowElement( final FlowElement object )
			{
				return createFlowElementAdapter();
			}

			@Override public Adapter caseFlowElementsContainer( final FlowElementsContainer object )
			{
				return createFlowElementsContainerAdapter();
			}

			@Override public Adapter caseFlowNode( final FlowNode object )
			{
				return createFlowNodeAdapter();
			}

			@Override public Adapter caseFormalExpression( final FormalExpression object )
			{
				return createFormalExpressionAdapter();
			}

			@Override public Adapter caseGateway( final Gateway object )
			{
				return createGatewayAdapter();
			}

			@Override public Adapter caseGlobalBusinessRuleTask( final GlobalBusinessRuleTask object )
			{
				return createGlobalBusinessRuleTaskAdapter();
			}

			@Override public Adapter caseGlobalChoreographyTask( final GlobalChoreographyTask object )
			{
				return createGlobalChoreographyTaskAdapter();
			}

			@Override public Adapter caseGlobalConversation( final GlobalConversation object )
			{
				return createGlobalConversationAdapter();
			}

			@Override public Adapter caseGlobalManualTask( final GlobalManualTask object )
			{
				return createGlobalManualTaskAdapter();
			}

			@Override public Adapter caseGlobalScriptTask( final GlobalScriptTask object )
			{
				return createGlobalScriptTaskAdapter();
			}

			@Override public Adapter caseGlobalTask( final GlobalTask object )
			{
				return createGlobalTaskAdapter();
			}

			@Override public Adapter caseGlobalUserTask( final GlobalUserTask object )
			{
				return createGlobalUserTaskAdapter();
			}

			@Override public Adapter caseGroup( final Group object )
			{
				return createGroupAdapter();
			}

			@Override public Adapter caseHumanPerformer( final HumanPerformer object )
			{
				return createHumanPerformerAdapter();
			}

			@Override public Adapter caseImplicitThrowEvent( final ImplicitThrowEvent object )
			{
				return createImplicitThrowEventAdapter();
			}

			@Override public Adapter caseImport( final Import object )
			{
				return createImportAdapter();
			}

			@Override public Adapter caseInclusiveGateway( final InclusiveGateway object )
			{
				return createInclusiveGatewayAdapter();
			}

			@Override public Adapter caseInputOutputBinding( final InputOutputBinding object )
			{
				return createInputOutputBindingAdapter();
			}

			@Override public Adapter caseInputOutputSpecification( final InputOutputSpecification object )
			{
				return createInputOutputSpecificationAdapter();
			}

			@Override public Adapter caseInputSet( final InputSet object )
			{
				return createInputSetAdapter();
			}

			@Override public Adapter caseInteractionNode( final InteractionNode object )
			{
				return createInteractionNodeAdapter();
			}

			@Override public Adapter caseInterface( final Interface object )
			{
				return createInterfaceAdapter();
			}

			@Override public Adapter caseIntermediateCatchEvent( final IntermediateCatchEvent object )
			{
				return createIntermediateCatchEventAdapter();
			}

			@Override public Adapter caseIntermediateThrowEvent( final IntermediateThrowEvent object )
			{
				return createIntermediateThrowEventAdapter();
			}

			@Override public Adapter caseItemAwareElement( final ItemAwareElement object )
			{
				return createItemAwareElementAdapter();
			}

			@Override public Adapter caseItemDefinition( final ItemDefinition object )
			{
				return createItemDefinitionAdapter();
			}

			@Override public Adapter caseLane( final Lane object )
			{
				return createLaneAdapter();
			}

			@Override public Adapter caseLaneSet( final LaneSet object )
			{
				return createLaneSetAdapter();
			}

			@Override public Adapter caseLinkEventDefinition( final LinkEventDefinition object )
			{
				return createLinkEventDefinitionAdapter();
			}

			@Override public Adapter caseLoopCharacteristics( final LoopCharacteristics object )
			{
				return createLoopCharacteristicsAdapter();
			}

			@Override public Adapter caseManualTask( final ManualTask object )
			{
				return createManualTaskAdapter();
			}

			@Override public Adapter caseMessage( final Message object )
			{
				return createMessageAdapter();
			}

			@Override public Adapter caseMessageEventDefinition( final MessageEventDefinition object )
			{
				return createMessageEventDefinitionAdapter();
			}

			@Override public Adapter caseMessageFlow( final MessageFlow object )
			{
				return createMessageFlowAdapter();
			}

			@Override public Adapter caseMessageFlowAssociation( final MessageFlowAssociation object )
			{
				return createMessageFlowAssociationAdapter();
			}

			@Override public Adapter caseMonitoring( final Monitoring object )
			{
				return createMonitoringAdapter();
			}

			@Override public Adapter caseMultiInstanceLoopCharacteristics( final MultiInstanceLoopCharacteristics object )
			{
				return createMultiInstanceLoopCharacteristicsAdapter();
			}

			@Override public Adapter caseOperation( final Operation object )
			{
				return createOperationAdapter();
			}

			@Override public Adapter caseOutputSet( final OutputSet object )
			{
				return createOutputSetAdapter();
			}

			@Override public Adapter caseParallelGateway( final ParallelGateway object )
			{
				return createParallelGatewayAdapter();
			}

			@Override public Adapter caseParticipant( final Participant object )
			{
				return createParticipantAdapter();
			}

			@Override public Adapter caseParticipantAssociation( final ParticipantAssociation object )
			{
				return createParticipantAssociationAdapter();
			}

			@Override public Adapter caseParticipantMultiplicity( final ParticipantMultiplicity object )
			{
				return createParticipantMultiplicityAdapter();
			}

			@Override public Adapter casePartnerEntity( final PartnerEntity object )
			{
				return createPartnerEntityAdapter();
			}

			@Override public Adapter casePartnerRole( final PartnerRole object )
			{
				return createPartnerRoleAdapter();
			}

			@Override public Adapter casePerformer( final Performer object )
			{
				return createPerformerAdapter();
			}

			@Override public Adapter casePotentialOwner( final PotentialOwner object )
			{
				return createPotentialOwnerAdapter();
			}

			@Override public Adapter caseProcess( final org.eclipse.bpmn2.Process object )
			{
				return createProcessAdapter();
			}

			@Override public Adapter caseProperty( final Property object )
			{
				return createPropertyAdapter();
			}

			@Override public Adapter caseReceiveTask( final ReceiveTask object )
			{
				return createReceiveTaskAdapter();
			}

			@Override public Adapter caseRelationship( final Relationship object )
			{
				return createRelationshipAdapter();
			}

			@Override public Adapter caseRendering( final Rendering object )
			{
				return createRenderingAdapter();
			}

			@Override public Adapter caseResource( final Resource object )
			{
				return createResourceAdapter();
			}

			@Override public Adapter caseResourceAssignmentExpression( final ResourceAssignmentExpression object )
			{
				return createResourceAssignmentExpressionAdapter();
			}

			@Override public Adapter caseResourceParameter( final ResourceParameter object )
			{
				return createResourceParameterAdapter();
			}

			@Override public Adapter caseResourceParameterBinding( final ResourceParameterBinding object )
			{
				return createResourceParameterBindingAdapter();
			}

			@Override public Adapter caseResourceRole( final ResourceRole object )
			{
				return createResourceRoleAdapter();
			}

			@Override public Adapter caseRootElement( final RootElement object )
			{
				return createRootElementAdapter();
			}

			@Override public Adapter caseScriptTask( final ScriptTask object )
			{
				return createScriptTaskAdapter();
			}

			@Override public Adapter caseSendTask( final SendTask object )
			{
				return createSendTaskAdapter();
			}

			@Override public Adapter caseSequenceFlow( final SequenceFlow object )
			{
				return createSequenceFlowAdapter();
			}

			@Override public Adapter caseServiceTask( final ServiceTask object )
			{
				return createServiceTaskAdapter();
			}

			@Override public Adapter caseSignal( final Signal object )
			{
				return createSignalAdapter();
			}

			@Override public Adapter caseSignalEventDefinition( final SignalEventDefinition object )
			{
				return createSignalEventDefinitionAdapter();
			}

			@Override public Adapter caseStandardLoopCharacteristics( final StandardLoopCharacteristics object )
			{
				return createStandardLoopCharacteristicsAdapter();
			}

			@Override public Adapter caseStartEvent( final StartEvent object )
			{
				return createStartEventAdapter();
			}

			@Override public Adapter caseSubChoreography( final SubChoreography object )
			{
				return createSubChoreographyAdapter();
			}

			@Override public Adapter caseSubConversation( final SubConversation object )
			{
				return createSubConversationAdapter();
			}

			@Override public Adapter caseSubProcess( final SubProcess object )
			{
				return createSubProcessAdapter();
			}

			@Override public Adapter caseTask( final Task object )
			{
				return createTaskAdapter();
			}

			@Override public Adapter caseTerminateEventDefinition( final TerminateEventDefinition object )
			{
				return createTerminateEventDefinitionAdapter();
			}

			@Override public Adapter caseTextAnnotation( final TextAnnotation object )
			{
				return createTextAnnotationAdapter();
			}

			@Override public Adapter caseThrowEvent( final ThrowEvent object )
			{
				return createThrowEventAdapter();
			}

			@Override public Adapter caseTimerEventDefinition( final TimerEventDefinition object )
			{
				return createTimerEventDefinitionAdapter();
			}

			@Override public Adapter caseTransaction( final Transaction object )
			{
				return createTransactionAdapter();
			}

			@Override public Adapter caseUserTask( final UserTask object )
			{
				return createUserTaskAdapter();
			}

			@Override public Adapter defaultCase( final EObject object )
			{
				return createEObjectAdapter();
			}
		};

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Bpmn2Package modelPackage;
} //Bpmn2AdapterFactory
