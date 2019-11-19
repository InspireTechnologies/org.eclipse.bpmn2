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

import org.eclipse.bpmn2.Association;
import org.eclipse.bpmn2.AssociationDirection;
import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.Bpmn2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.AssociationImpl#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.AssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.AssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class AssociationImpl
	extends ArtifactImpl
	implements Association
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl()
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
	public BaseElement basicGetSourceRef()
	{
		return sourceRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public BaseElement basicGetTargetRef()
	{
		return targetRef;
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
			case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION :
			{
				return getAssociationDirection();
			}

			case Bpmn2Package.ASSOCIATION__SOURCE_REF :
			{
				if( resolve )
				{
					return getSourceRef();
				}

				return basicGetSourceRef();
			}

			case Bpmn2Package.ASSOCIATION__TARGET_REF :
			{
				if( resolve )
				{
					return getTargetRef();
				}

				return basicGetTargetRef();
			}
		}

		return super.eGet( featureID, resolve, coreType );
	} // end method eGet

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
			case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION :
			{
				return associationDirection != ASSOCIATION_DIRECTION_EDEFAULT;
			}

			case Bpmn2Package.ASSOCIATION__SOURCE_REF :
			{
				return sourceRef != null;
			}

			case Bpmn2Package.ASSOCIATION__TARGET_REF :
			{
				return targetRef != null;
			}
		}

		return super.eIsSet( featureID );
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
	@Override public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION :
			{
				setAssociationDirection((AssociationDirection) newValue );

				return;
			}

			case Bpmn2Package.ASSOCIATION__SOURCE_REF :
			{
				setSourceRef((BaseElement) newValue );

				return;
			}

			case Bpmn2Package.ASSOCIATION__TARGET_REF :
			{
				setTargetRef((BaseElement) newValue );

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
			case Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION :
			{
				setAssociationDirection( ASSOCIATION_DIRECTION_EDEFAULT );

				return;
			}

			case Bpmn2Package.ASSOCIATION__SOURCE_REF :
			{
				setSourceRef((BaseElement) null );

				return;
			}

			case Bpmn2Package.ASSOCIATION__TARGET_REF :
			{
				setTargetRef((BaseElement) null );

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
	@Override public AssociationDirection getAssociationDirection()
	{
		return associationDirection;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BaseElement getSourceRef()
	{
		if(( sourceRef != null ) && sourceRef.eIsProxy())
		{
			final InternalEObject oldSourceRef = (InternalEObject) sourceRef;
			sourceRef = (BaseElement) eResolveProxy( oldSourceRef );

			if( sourceRef != oldSourceRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.ASSOCIATION__SOURCE_REF, oldSourceRef, sourceRef ));
				}
			}
		}

		return sourceRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public BaseElement getTargetRef()
	{
		if(( targetRef != null ) && targetRef.eIsProxy())
		{
			final InternalEObject oldTargetRef = (InternalEObject) targetRef;
			targetRef = (BaseElement) eResolveProxy( oldTargetRef );

			if( targetRef != oldTargetRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.ASSOCIATION__TARGET_REF, oldTargetRef, targetRef ));
				}
			}
		}

		return targetRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newAssociationDirection  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setAssociationDirection( final AssociationDirection newAssociationDirection )
	{
		final AssociationDirection oldAssociationDirection = associationDirection;
		associationDirection = ( newAssociationDirection == null ) ? ASSOCIATION_DIRECTION_EDEFAULT : newAssociationDirection;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ASSOCIATION__ASSOCIATION_DIRECTION, oldAssociationDirection, associationDirection ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newSourceRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setSourceRef( final BaseElement newSourceRef )
	{
		final BaseElement oldSourceRef = sourceRef;
		sourceRef = newSourceRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ASSOCIATION__SOURCE_REF, oldSourceRef, sourceRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTargetRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTargetRef( final BaseElement newTargetRef )
	{
		final BaseElement oldTargetRef = targetRef;
		targetRef = newTargetRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ASSOCIATION__TARGET_REF, oldTargetRef, targetRef ));
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
		result.append( " (associationDirection: " );
		result.append( associationDirection );
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
		return Bpmn2Package.Literals.ASSOCIATION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getAssociationDirection()
	 * @generated
	 * @orderd
	 */
	protected AssociationDirection associationDirection = ASSOCIATION_DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSourceRef()
	 * @generated
	 * @orderd
	 */
	protected BaseElement sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTargetRef()
	 * @generated
	 * @orderd
	 */
	protected BaseElement targetRef;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #getAssociationDirection() <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getAssociationDirection()
	 * @generated
	 * @orderd
	 */
	protected static final AssociationDirection ASSOCIATION_DIRECTION_EDEFAULT = AssociationDirection.NONE;
} //AssociationImpl
