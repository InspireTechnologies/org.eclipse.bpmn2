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

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DataObject;
import org.eclipse.bpmn2.DataState;
import org.eclipse.bpmn2.ItemAwareElement;
import org.eclipse.bpmn2.ItemDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.DataObjectImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataObjectImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataObjectImpl#isIsCollection <em>Is Collection</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class DataObjectImpl
	extends FlowElementImpl
	implements DataObject
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectImpl()
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
	public ItemDefinition basicGetItemSubjectRef()
	{
		return itemSubjectRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDataState  DOCUMENT ME!
	 * @param      msgs          DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetDataState( final DataState newDataState, NotificationChain msgs )
	{
		final DataState oldDataState = dataState;
		dataState = newDataState;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_OBJECT__DATA_STATE, oldDataState, newDataState );

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
	 * @param      derivedFeatureID  DOCUMENT ME!
	 * @param      baseClass         DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int eBaseStructuralFeatureID( final int derivedFeatureID, final Class<?> baseClass )
	{
		if( baseClass == ItemAwareElement.class )
		{
			switch( derivedFeatureID )
			{
				case Bpmn2Package.DATA_OBJECT__DATA_STATE :
				{
					return Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE;
				}

				case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF :
				{
					return Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;
				}

				default :
				{
					return -1;
				}
			}
		}

		return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      baseFeatureID  DOCUMENT ME!
	 * @param      baseClass      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public int eDerivedStructuralFeatureID( final int baseFeatureID, final Class<?> baseClass )
	{
		if( baseClass == ItemAwareElement.class )
		{
			switch( baseFeatureID )
			{
				case Bpmn2Package.ITEM_AWARE_ELEMENT__DATA_STATE :
				{
					return Bpmn2Package.DATA_OBJECT__DATA_STATE;
				}

				case Bpmn2Package.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF :
				{
					return Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF;
				}

				default :
				{
					return -1;
				}
			}
		}

		return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
			case Bpmn2Package.DATA_OBJECT__DATA_STATE :
			{
				return getDataState();
			}

			case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF :
			{
				if( resolve )
				{
					return getItemSubjectRef();
				}

				return basicGetItemSubjectRef();
			}

			case Bpmn2Package.DATA_OBJECT__IS_COLLECTION :
			{
				return isIsCollection();
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
			case Bpmn2Package.DATA_OBJECT__DATA_STATE :
			{
				return basicSetDataState( null, msgs );
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
			case Bpmn2Package.DATA_OBJECT__DATA_STATE :
			{
				return dataState != null;
			}

			case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF :
			{
				return itemSubjectRef != null;
			}

			case Bpmn2Package.DATA_OBJECT__IS_COLLECTION :
			{
				return isCollection != IS_COLLECTION_EDEFAULT;
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
			case Bpmn2Package.DATA_OBJECT__DATA_STATE :
			{
				setDataState((DataState) newValue );

				return;
			}

			case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF :
			{
				setItemSubjectRef((ItemDefinition) newValue );

				return;
			}

			case Bpmn2Package.DATA_OBJECT__IS_COLLECTION :
			{
				setIsCollection((Boolean) newValue );

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
			case Bpmn2Package.DATA_OBJECT__DATA_STATE :
			{
				setDataState((DataState) null );

				return;
			}

			case Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF :
			{
				setItemSubjectRef((ItemDefinition) null );

				return;
			}

			case Bpmn2Package.DATA_OBJECT__IS_COLLECTION :
			{
				setIsCollection( IS_COLLECTION_EDEFAULT );

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
	@Override public DataState getDataState()
	{
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
	@Override public ItemDefinition getItemSubjectRef()
	{
		if(( itemSubjectRef != null ) && itemSubjectRef.eIsProxy())
		{
			final InternalEObject oldItemSubjectRef = (InternalEObject) itemSubjectRef;
			itemSubjectRef = (ItemDefinition) eResolveProxy( oldItemSubjectRef );

			if( itemSubjectRef != oldItemSubjectRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF, oldItemSubjectRef, itemSubjectRef ));
				}
			}
		}

		return itemSubjectRef;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsCollection()
	{
		return isCollection;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDataState  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setDataState( final DataState newDataState )
	{
		if( newDataState != dataState )
		{
			NotificationChain msgs = null;

			if( dataState != null )
			{
				msgs = ((InternalEObject) dataState ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.DATA_OBJECT__DATA_STATE, null, msgs );
			}

			if( newDataState != null )
			{
				msgs = ((InternalEObject) newDataState ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.DATA_OBJECT__DATA_STATE, null, msgs );
			}

			msgs = basicSetDataState( newDataState, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_OBJECT__DATA_STATE, newDataState, newDataState ));
		}
	} // end method setDataState

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsCollection  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsCollection( final boolean newIsCollection )
	{
		final boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_OBJECT__IS_COLLECTION, oldIsCollection, isCollection ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newItemSubjectRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setItemSubjectRef( final ItemDefinition newItemSubjectRef )
	{
		final ItemDefinition oldItemSubjectRef = itemSubjectRef;
		itemSubjectRef = newItemSubjectRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_OBJECT__ITEM_SUBJECT_REF, oldItemSubjectRef, itemSubjectRef ));
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
		result.append( " (isCollection: " );
		result.append( isCollection );
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
		return Bpmn2Package.Literals.DATA_OBJECT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getDataState() <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDataState()
	 * @generated
	 * @orderd
	 */
	protected DataState dataState;

	/**
	 * The cached value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsCollection()
	 * @generated
	 * @orderd
	 */
	protected boolean isCollection = IS_COLLECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemSubjectRef() <em>Item Subject Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getItemSubjectRef()
	 * @generated
	 * @orderd
	 */
	protected ItemDefinition itemSubjectRef;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #isIsCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsCollection()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;
} //DataObjectImpl
