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
import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.InputSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.DataInputImpl#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataInputImpl#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataInputImpl#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataInputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataInputImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class DataInputImpl
	extends ItemAwareElementImpl
	implements DataInput
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataInputImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

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
			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL :
			{
				return getInputSetWithOptional();
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING :
			{
				return getInputSetWithWhileExecuting();
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS :
			{
				return getInputSetRefs();
			}

			case Bpmn2Package.DATA_INPUT__IS_COLLECTION :
			{
				return isIsCollection();
			}

			case Bpmn2Package.DATA_INPUT__NAME :
			{
				return getName();
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
	@Override
	@SuppressWarnings( "unchecked" )
	public NotificationChain eInverseAdd( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
	{
		switch( featureID )
		{
			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetWithOptional()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetWithWhileExecuting()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputSetRefs()).basicAdd( otherEnd, msgs );
			}
		}

		return super.eInverseAdd( otherEnd, featureID, msgs );
	}

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
			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL :
			{
				return ((InternalEList<?>) getInputSetWithOptional()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING :
			{
				return ((InternalEList<?>) getInputSetWithWhileExecuting()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS :
			{
				return ((InternalEList<?>) getInputSetRefs()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL :
			{
				return ( inputSetWithOptional != null ) && ! inputSetWithOptional.isEmpty();
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING :
			{
				return ( inputSetWithWhileExecuting != null ) && ! inputSetWithWhileExecuting.isEmpty();
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS :
			{
				return ( inputSetRefs != null ) && ! inputSetRefs.isEmpty();
			}

			case Bpmn2Package.DATA_INPUT__IS_COLLECTION :
			{
				return isCollection != IS_COLLECTION_EDEFAULT;
			}

			case Bpmn2Package.DATA_INPUT__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
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
			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL :
			{
				getInputSetWithOptional().clear();
				getInputSetWithOptional().addAll((Collection<? extends InputSet>) newValue );

				return;
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING :
			{
				getInputSetWithWhileExecuting().clear();
				getInputSetWithWhileExecuting().addAll((Collection<? extends InputSet>) newValue );

				return;
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS :
			{
				getInputSetRefs().clear();
				getInputSetRefs().addAll((Collection<? extends InputSet>) newValue );

				return;
			}

			case Bpmn2Package.DATA_INPUT__IS_COLLECTION :
			{
				setIsCollection((Boolean) newValue );

				return;
			}

			case Bpmn2Package.DATA_INPUT__NAME :
			{
				setName((String) newValue );

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
			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL :
			{
				getInputSetWithOptional().clear();

				return;
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING :
			{
				getInputSetWithWhileExecuting().clear();

				return;
			}

			case Bpmn2Package.DATA_INPUT__INPUT_SET_REFS :
			{
				getInputSetRefs().clear();

				return;
			}

			case Bpmn2Package.DATA_INPUT__IS_COLLECTION :
			{
				setIsCollection( IS_COLLECTION_EDEFAULT );

				return;
			}

			case Bpmn2Package.DATA_INPUT__NAME :
			{
				setName( NAME_EDEFAULT );

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
	@Override public List<InputSet> getInputSetRefs()
	{
		if( inputSetRefs == null )
		{
			inputSetRefs = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>( InputSet.class, this, Bpmn2Package.DATA_INPUT__INPUT_SET_REFS, Bpmn2Package.INPUT_SET__DATA_INPUT_REFS );
		}

		return inputSetRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<InputSet> getInputSetWithOptional()
	{
		if( inputSetWithOptional == null )
		{
			inputSetWithOptional = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>( InputSet.class, this, Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_OPTIONAL, Bpmn2Package.INPUT_SET__OPTIONAL_INPUT_REFS );
		}

		return inputSetWithOptional;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<InputSet> getInputSetWithWhileExecuting()
	{
		if( inputSetWithWhileExecuting == null )
		{
			inputSetWithWhileExecuting = new EObjectWithInverseResolvingEList.ManyInverse<InputSet>( InputSet.class, this, Bpmn2Package.DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING, Bpmn2Package.INPUT_SET__WHILE_EXECUTING_INPUT_REFS );
		}

		return inputSetWithWhileExecuting;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public String getName()
	{
		return name;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_INPUT__IS_COLLECTION, oldIsCollection, isCollection ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newName  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setName( final String newName )
	{
		final String oldName = name;
		name = newName;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_INPUT__NAME, oldName, name ));
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
		result.append( ", name: " );
		result.append( name );
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
		return Bpmn2Package.Literals.DATA_INPUT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getInputSetRefs() <em>Input Set Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInputSetRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<InputSet> inputSetRefs;

	/**
	 * The cached value of the '{@link #getInputSetWithOptional() <em>Input Set With Optional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInputSetWithOptional()
	 * @generated
	 * @orderd
	 */
	protected EList<InputSet> inputSetWithOptional;

	/**
	 * The cached value of the '{@link #getInputSetWithWhileExecuting() <em>Input Set With While Executing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getInputSetWithWhileExecuting()
	 * @generated
	 * @orderd
	 */
	protected EList<InputSet> inputSetWithWhileExecuting;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected String name = NAME_EDEFAULT;

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

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected static final String NAME_EDEFAULT = null;
} //DataInputImpl
