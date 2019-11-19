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
 *
 */
package org.eclipse.bpmn2.di.impl;

import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.di.BPMNEdge;
import org.eclipse.bpmn2.di.BPMNLabel;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.di.MessageVisibleKind;

import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.impl.LabeledEdgeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNEdgeImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNEdgeImpl#getMessageVisibleKind <em>Message Visible Kind</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNEdgeImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNEdgeImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class BPMNEdgeImpl
	extends LabeledEdgeImpl
	implements BPMNEdge
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNEdgeImpl()
	{
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
	public BaseElement basicGetBpmnElement()
	{
		return bpmnElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public DiagramElement basicGetSourceElement()
	{
		return sourceElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public DiagramElement basicGetTargetElement()
	{
		return targetElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabel  DOCUMENT ME!
	 * @param      msgs      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetLabel( final BPMNLabel newLabel, NotificationChain msgs )
	{
		final BPMNLabel oldLabel = label;
		label = newLabel;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_EDGE__LABEL, oldLabel, newLabel );

			if( msgs == null )
			{
				msgs = notification;
			}
			else
			{
				msgs.add( notification );
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
	@Override public Object eGet( final int featureID, final boolean resolve, final boolean coreType )
	{
		switch( featureID )
		{
			case BpmnDiPackage.BPMN_EDGE__LABEL :
			{
				return getLabel();
			}

			case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT :
			{
				if( resolve )
				{
					return getBpmnElement();
				}

				return basicGetBpmnElement();
			}

			case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND :
			{
				return getMessageVisibleKind();
			}

			case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT :
			{
				if( resolve )
				{
					return getSourceElement();
				}

				return basicGetSourceElement();
			}

			case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT :
			{
				if( resolve )
				{
					return getTargetElement();
				}

				return basicGetTargetElement();
			}
		}

		return super.eGet( featureID, resolve, coreType );
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
	@Override public NotificationChain eInverseRemove( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case BpmnDiPackage.BPMN_EDGE__LABEL :
			{
				return basicSetLabel( null, msgs );
			}
		}

		return super.eInverseRemove( otherEnd, featureID, msgs );
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
	@Override public boolean eIsSet( final int featureID )
	{
		switch( featureID )
		{
			case BpmnDiPackage.BPMN_EDGE__LABEL :
			{
				return label != null;
			}

			case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT :
			{
				return bpmnElement != null;
			}

			case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND :
			{
				return messageVisibleKind != MESSAGE_VISIBLE_KIND_EDEFAULT;
			}

			case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT :
			{
				return sourceElement != null;
			}

			case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT :
			{
				return targetElement != null;
			}
		}

		return super.eIsSet( featureID );
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
	@Override public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case BpmnDiPackage.BPMN_EDGE__LABEL :
			{
				setLabel((BPMNLabel) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT :
			{
				setBpmnElement((BaseElement) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND :
			{
				setMessageVisibleKind((MessageVisibleKind) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT :
			{
				setSourceElement((DiagramElement) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT :
			{
				setTargetElement((DiagramElement) newValue );

				return;
			}
		}

		super.eSet( featureID, newValue );
	} // end method eSet

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      featureID  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void eUnset( final int featureID )
	{
		switch( featureID )
		{
			case BpmnDiPackage.BPMN_EDGE__LABEL :
			{
				setLabel((BPMNLabel) null );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT :
			{
				setBpmnElement((BaseElement) null );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND :
			{
				setMessageVisibleKind( MESSAGE_VISIBLE_KIND_EDEFAULT );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT :
			{
				setSourceElement((DiagramElement) null );

				return;
			}

			case BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT :
			{
				setTargetElement((DiagramElement) null );

				return;
			}
		}

		super.eUnset( featureID );
	} // end method eUnset

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BaseElement getBpmnElement()
	{
		if(( bpmnElement != null ) && bpmnElement.eIsProxy())
		{
			final InternalEObject oldBpmnElement = (InternalEObject) bpmnElement;
			bpmnElement = (BaseElement) eResolveProxy( oldBpmnElement );

			if( bpmnElement != oldBpmnElement )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT, oldBpmnElement, bpmnElement ));
				}
			}
		}

		return bpmnElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BPMNLabel getLabel()
	{
		return label;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public MessageVisibleKind getMessageVisibleKind()
	{
		return messageVisibleKind;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DiagramElement getSourceElement()
	{
		if(( sourceElement != null ) && sourceElement.eIsProxy())
		{
			final InternalEObject oldSourceElement = (InternalEObject) sourceElement;
			sourceElement = (DiagramElement) eResolveProxy( oldSourceElement );

			if( sourceElement != oldSourceElement )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT, oldSourceElement, sourceElement ));
				}
			}
		}

		return sourceElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public DiagramElement getTargetElement()
	{
		if(( targetElement != null ) && targetElement.eIsProxy())
		{
			final InternalEObject oldTargetElement = (InternalEObject) targetElement;
			targetElement = (DiagramElement) eResolveProxy( oldTargetElement );

			if( targetElement != oldTargetElement )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT, oldTargetElement, targetElement ));
				}
			}
		}

		return targetElement;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newBpmnElement  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setBpmnElement( final BaseElement newBpmnElement )
	{
		final BaseElement oldBpmnElement = bpmnElement;
		bpmnElement = newBpmnElement;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_EDGE__BPMN_ELEMENT, oldBpmnElement, bpmnElement ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newLabel  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setLabel( final BPMNLabel newLabel )
	{
		if( newLabel != label )
		{
			NotificationChain msgs = null;

			if( label != null )
			{
				msgs = ((InternalEObject) label ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - BpmnDiPackage.BPMN_EDGE__LABEL, null, msgs );
			}

			if( newLabel != null )
			{
				msgs = ((InternalEObject) newLabel ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - BpmnDiPackage.BPMN_EDGE__LABEL, null, msgs );
			}

			msgs = basicSetLabel( newLabel, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_EDGE__LABEL, newLabel, newLabel ));
		}
	} // end method setLabel

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newMessageVisibleKind  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setMessageVisibleKind( final MessageVisibleKind newMessageVisibleKind )
	{
		final MessageVisibleKind oldMessageVisibleKind = messageVisibleKind;
		messageVisibleKind = ( newMessageVisibleKind == null ) ? MESSAGE_VISIBLE_KIND_EDEFAULT : newMessageVisibleKind;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_EDGE__MESSAGE_VISIBLE_KIND, oldMessageVisibleKind, messageVisibleKind ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newSourceElement  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setSourceElement( final DiagramElement newSourceElement )
	{
		final DiagramElement oldSourceElement = sourceElement;
		sourceElement = newSourceElement;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_EDGE__SOURCE_ELEMENT, oldSourceElement, sourceElement ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTargetElement  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTargetElement( final DiagramElement newTargetElement )
	{
		final DiagramElement oldTargetElement = targetElement;
		targetElement = newTargetElement;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_EDGE__TARGET_ELEMENT, oldTargetElement, targetElement ));
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
	@Override public String toString()
	{
		if( eIsProxy())
		{
			return super.toString();
		}

		final StringBuilder result = new StringBuilder( super.toString());
		result.append( " (messageVisibleKind: " );
		result.append( messageVisibleKind );
		result.append( ')' );

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
	@Override protected EClass eStaticClass()
	{
		return BpmnDiPackage.Literals.BPMN_EDGE;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getBpmnElement() <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getBpmnElement()
	 * @generated
	 * @orderd
	 */
	protected BaseElement bpmnElement;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getLabel()
	 * @generated
	 * @orderd
	 */
	protected BPMNLabel label;

	/**
	 * The cached value of the '{@link #getMessageVisibleKind() <em>Message Visible Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessageVisibleKind()
	 * @generated
	 * @orderd
	 */
	protected MessageVisibleKind messageVisibleKind = MESSAGE_VISIBLE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSourceElement()
	 * @generated
	 * @orderd
	 */
	protected DiagramElement sourceElement;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTargetElement()
	 * @generated
	 * @orderd
	 */
	protected DiagramElement targetElement;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getMessageVisibleKind() <em>Message Visible Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getMessageVisibleKind()
	 * @generated
	 * @orderd
	 */
	protected static final MessageVisibleKind MESSAGE_VISIBLE_KIND_EDEFAULT = MessageVisibleKind.INITIATING;
} //BPMNEdgeImpl
