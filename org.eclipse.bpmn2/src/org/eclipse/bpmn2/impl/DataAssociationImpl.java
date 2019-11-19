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

import org.eclipse.bpmn2.Assignment;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DataAssociation;
import org.eclipse.bpmn2.FormalExpression;
import org.eclipse.bpmn2.ItemAwareElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.DataAssociationImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataAssociationImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataAssociationImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataAssociationImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class DataAssociationImpl
	extends BaseElementImpl
	implements DataAssociation
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAssociationImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTransformation  DOCUMENT ME!
	 * @param      msgs               DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetTransformation( final FormalExpression newTransformation, NotificationChain msgs )
	{
		final FormalExpression oldTransformation = transformation;
		transformation = newTransformation;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION, oldTransformation, newTransformation );

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
			case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF :
			{
				return getSourceRef();
			}

			case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF :
			{
				return getTargetRef();
			}

			case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION :
			{
				return getTransformation();
			}

			case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT :
			{
				return getAssignment();
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
			case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION :
			{
				return basicSetTransformation( null, msgs );
			}

			case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT :
			{
				return ((InternalEList<?>) getAssignment()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF :
			{
				return ( sourceRef != null ) && ! sourceRef.isEmpty();
			}

			case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF :
			{
				return targetRef != null;
			}

			case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION :
			{
				return transformation != null;
			}

			case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT :
			{
				return ( assignment != null ) && ! assignment.isEmpty();
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
	@Override
	@SuppressWarnings( "unchecked" )
	public void eSet( final int featureID, final Object newValue )
	{
		switch( featureID )
		{
			case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF :
			{
				getSourceRef().clear();
				getSourceRef().addAll((Collection<? extends ItemAwareElement>) newValue );

				return;
			}

			case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF :
			{
				setTargetRef((ItemAwareElement) newValue );

				return;
			}

			case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION :
			{
				setTransformation((FormalExpression) newValue );

				return;
			}

			case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT :
			{
				getAssignment().clear();
				getAssignment().addAll((Collection<? extends Assignment>) newValue );

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
			case Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF :
			{
				getSourceRef().clear();

				return;
			}

			case Bpmn2Package.DATA_ASSOCIATION__TARGET_REF :
			{
				setTargetRef((ItemAwareElement) null );

				return;
			}

			case Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION :
			{
				setTransformation((FormalExpression) null );

				return;
			}

			case Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT :
			{
				getAssignment().clear();

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
	@Override public List<Assignment> getAssignment()
	{
		if( assignment == null )
		{
			assignment = new EObjectContainmentEList<Assignment>( Assignment.class, this, Bpmn2Package.DATA_ASSOCIATION__ASSIGNMENT );
		}

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
	@Override public List<ItemAwareElement> getSourceRef()
	{
		if( sourceRef == null )
		{
			sourceRef = new EObjectEList<ItemAwareElement>( ItemAwareElement.class, this, Bpmn2Package.DATA_ASSOCIATION__SOURCE_REF );
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
	@Override public ItemAwareElement getTargetRef()
	{
		return targetRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public FormalExpression getTransformation()
	{
		return transformation;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTargetRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTargetRef( final ItemAwareElement newTargetRef )
	{
		final ItemAwareElement oldTargetRef = targetRef;
		targetRef = newTargetRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_ASSOCIATION__TARGET_REF, oldTargetRef, targetRef ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newTransformation  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setTransformation( final FormalExpression newTransformation )
	{
		if( newTransformation != transformation )
		{
			NotificationChain msgs = null;

			if( transformation != null )
			{
				msgs = ((InternalEObject) transformation ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION, null, msgs );
			}

			if( newTransformation != null )
			{
				msgs = ((InternalEObject) newTransformation ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION, null, msgs );
			}

			msgs = basicSetTransformation( newTransformation, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_ASSOCIATION__TRANSFORMATION, newTransformation, newTransformation ));
		}
	} // end method setTransformation

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
		return Bpmn2Package.Literals.DATA_ASSOCIATION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getAssignment()
	 * @generated
	 * @orderd
	 */
	protected EList<Assignment> assignment;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSourceRef()
	 * @generated
	 * @orderd
	 */
	protected EList<ItemAwareElement> sourceRef;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTargetRef()
	 * @generated
	 * @orderd
	 */
	protected ItemAwareElement targetRef;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getTransformation()
	 * @generated
	 * @orderd
	 */
	protected FormalExpression transformation;
} //DataAssociationImpl
