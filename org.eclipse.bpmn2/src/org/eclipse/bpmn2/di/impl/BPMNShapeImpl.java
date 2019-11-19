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
import org.eclipse.bpmn2.di.BPMNLabel;
import org.eclipse.bpmn2.di.BPMNShape;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.di.ParticipantBandKind;

import org.eclipse.dd.di.impl.LabeledShapeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#getChoreographyActivityShape <em>Choreography Activity Shape</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#isIsExpanded <em>Is Expanded</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#isIsHorizontal <em>Is Horizontal</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#isIsMarkerVisible <em>Is Marker Visible</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#isIsMessageVisible <em>Is Message Visible</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.di.impl.BPMNShapeImpl#getParticipantBandKind <em>Participant Band Kind</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class BPMNShapeImpl
	extends LabeledShapeImpl
	implements BPMNShape
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNShapeImpl()
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
	public BPMNShape basicGetChoreographyActivityShape()
	{
		return choreographyActivityShape;
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
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__LABEL, oldLabel, newLabel );

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
			case BpmnDiPackage.BPMN_SHAPE__LABEL :
			{
				return getLabel();
			}

			case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT :
			{
				if( resolve )
				{
					return getBpmnElement();
				}

				return basicGetBpmnElement();
			}

			case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE :
			{
				if( resolve )
				{
					return getChoreographyActivityShape();
				}

				return basicGetChoreographyActivityShape();
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED :
			{
				return isIsExpanded();
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL :
			{
				return isIsHorizontal();
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE :
			{
				return isIsMarkerVisible();
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE :
			{
				return isIsMessageVisible();
			}

			case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND :
			{
				return getParticipantBandKind();
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
			case BpmnDiPackage.BPMN_SHAPE__LABEL :
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
			case BpmnDiPackage.BPMN_SHAPE__LABEL :
			{
				return label != null;
			}

			case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT :
			{
				return bpmnElement != null;
			}

			case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE :
			{
				return choreographyActivityShape != null;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED :
			{
				return isExpanded != IS_EXPANDED_EDEFAULT;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL :
			{
				return isHorizontal != IS_HORIZONTAL_EDEFAULT;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE :
			{
				return isMarkerVisible != IS_MARKER_VISIBLE_EDEFAULT;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE :
			{
				return isMessageVisible != IS_MESSAGE_VISIBLE_EDEFAULT;
			}

			case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND :
			{
				return participantBandKind != PARTICIPANT_BAND_KIND_EDEFAULT;
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
			case BpmnDiPackage.BPMN_SHAPE__LABEL :
			{
				setLabel((BPMNLabel) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT :
			{
				setBpmnElement((BaseElement) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE :
			{
				setChoreographyActivityShape((BPMNShape) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED :
			{
				setIsExpanded((Boolean) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL :
			{
				setIsHorizontal((Boolean) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE :
			{
				setIsMarkerVisible((Boolean) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE :
			{
				setIsMessageVisible((Boolean) newValue );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND :
			{
				setParticipantBandKind((ParticipantBandKind) newValue );

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
			case BpmnDiPackage.BPMN_SHAPE__LABEL :
			{
				setLabel((BPMNLabel) null );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT :
			{
				setBpmnElement((BaseElement) null );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE :
			{
				setChoreographyActivityShape((BPMNShape) null );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED :
			{
				setIsExpanded( IS_EXPANDED_EDEFAULT );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL :
			{
				setIsHorizontal( IS_HORIZONTAL_EDEFAULT );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE :
			{
				setIsMarkerVisible( IS_MARKER_VISIBLE_EDEFAULT );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE :
			{
				setIsMessageVisible( IS_MESSAGE_VISIBLE_EDEFAULT );

				return;
			}

			case BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND :
			{
				setParticipantBandKind( PARTICIPANT_BAND_KIND_EDEFAULT );

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
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT, oldBpmnElement, bpmnElement ));
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
	@Override public BPMNShape getChoreographyActivityShape()
	{
		if(( choreographyActivityShape != null ) && choreographyActivityShape.eIsProxy())
		{
			final InternalEObject oldChoreographyActivityShape = (InternalEObject) choreographyActivityShape;
			choreographyActivityShape = (BPMNShape) eResolveProxy( oldChoreographyActivityShape );

			if( choreographyActivityShape != oldChoreographyActivityShape )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, oldChoreographyActivityShape, choreographyActivityShape ));
				}
			}
		}

		return choreographyActivityShape;
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
	@Override public ParticipantBandKind getParticipantBandKind()
	{
		return participantBandKind;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsExpanded()
	{
		return isExpanded;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsHorizontal()
	{
		return isHorizontal;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsMarkerVisible()
	{
		return isMarkerVisible;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsMessageVisible()
	{
		return isMessageVisible;
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
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__BPMN_ELEMENT, oldBpmnElement, bpmnElement ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newChoreographyActivityShape  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setChoreographyActivityShape( final BPMNShape newChoreographyActivityShape )
	{
		final BPMNShape oldChoreographyActivityShape = choreographyActivityShape;
		choreographyActivityShape = newChoreographyActivityShape;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__CHOREOGRAPHY_ACTIVITY_SHAPE, oldChoreographyActivityShape, choreographyActivityShape ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsExpanded  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsExpanded( final boolean newIsExpanded )
	{
		final boolean oldIsExpanded = isExpanded;
		isExpanded = newIsExpanded;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__IS_EXPANDED, oldIsExpanded, isExpanded ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsHorizontal  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsHorizontal( final boolean newIsHorizontal )
	{
		final boolean oldIsHorizontal = isHorizontal;
		isHorizontal = newIsHorizontal;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__IS_HORIZONTAL, oldIsHorizontal, isHorizontal ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsMarkerVisible  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsMarkerVisible( final boolean newIsMarkerVisible )
	{
		final boolean oldIsMarkerVisible = isMarkerVisible;
		isMarkerVisible = newIsMarkerVisible;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__IS_MARKER_VISIBLE, oldIsMarkerVisible, isMarkerVisible ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsMessageVisible  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsMessageVisible( final boolean newIsMessageVisible )
	{
		final boolean oldIsMessageVisible = isMessageVisible;
		isMessageVisible = newIsMessageVisible;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__IS_MESSAGE_VISIBLE, oldIsMessageVisible, isMessageVisible ));
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
				msgs = ((InternalEObject) label ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - BpmnDiPackage.BPMN_SHAPE__LABEL, null, msgs );
			}

			if( newLabel != null )
			{
				msgs = ((InternalEObject) newLabel ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - BpmnDiPackage.BPMN_SHAPE__LABEL, null, msgs );
			}

			msgs = basicSetLabel( newLabel, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__LABEL, newLabel, newLabel ));
		}
	} // end method setLabel

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newParticipantBandKind  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setParticipantBandKind( final ParticipantBandKind newParticipantBandKind )
	{
		final ParticipantBandKind oldParticipantBandKind = participantBandKind;
		participantBandKind = ( newParticipantBandKind == null ) ? PARTICIPANT_BAND_KIND_EDEFAULT : newParticipantBandKind;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, BpmnDiPackage.BPMN_SHAPE__PARTICIPANT_BAND_KIND, oldParticipantBandKind, participantBandKind ));
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
		result.append( " (isExpanded: " );
		result.append( isExpanded );
		result.append( ", isHorizontal: " );
		result.append( isHorizontal );
		result.append( ", isMarkerVisible: " );
		result.append( isMarkerVisible );
		result.append( ", isMessageVisible: " );
		result.append( isMessageVisible );
		result.append( ", participantBandKind: " );
		result.append( participantBandKind );
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
		return BpmnDiPackage.Literals.BPMN_SHAPE;
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
	 * The cached value of the '{@link #getChoreographyActivityShape() <em>Choreography Activity Shape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getChoreographyActivityShape()
	 * @generated
	 * @orderd
	 */
	protected BPMNShape choreographyActivityShape;

	/**
	 * The cached value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsExpanded()
	 * @generated
	 * @orderd
	 */
	protected boolean isExpanded = IS_EXPANDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #isIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsHorizontal()
	 * @generated
	 * @orderd
	 */
	protected boolean isHorizontal = IS_HORIZONTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #isIsMarkerVisible() <em>Is Marker Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsMarkerVisible()
	 * @generated
	 * @orderd
	 */
	protected boolean isMarkerVisible = IS_MARKER_VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #isIsMessageVisible() <em>Is Message Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsMessageVisible()
	 * @generated
	 * @orderd
	 */
	protected boolean isMessageVisible = IS_MESSAGE_VISIBLE_EDEFAULT;

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
	 * The cached value of the '{@link #getParticipantBandKind() <em>Participant Band Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getParticipantBandKind()
	 * @generated
	 * @orderd
	 */
	protected ParticipantBandKind participantBandKind = PARTICIPANT_BAND_KIND_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsExpanded()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_EXPANDED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsHorizontal() <em>Is Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsHorizontal()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_HORIZONTAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsMarkerVisible() <em>Is Marker Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsMarkerVisible()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_MARKER_VISIBLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsMessageVisible() <em>Is Message Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsMessageVisible()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_MESSAGE_VISIBLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getParticipantBandKind() <em>Participant Band Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getParticipantBandKind()
	 * @generated
	 * @orderd
	 */
	protected static final ParticipantBandKind PARTICIPANT_BAND_KIND_EDEFAULT = ParticipantBandKind.TOP_INITIATING;
} //BPMNShapeImpl
