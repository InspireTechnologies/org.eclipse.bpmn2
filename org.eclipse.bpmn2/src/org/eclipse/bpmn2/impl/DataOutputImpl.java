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
import org.eclipse.bpmn2.DataOutput;
import org.eclipse.bpmn2.OutputSet;

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
 * An implementation of the model object '<em><b>Data Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.DataOutputImpl#getOutputSetWithOptional <em>Output Set With Optional</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataOutputImpl#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataOutputImpl#getOutputSetRefs <em>Output Set Refs</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataOutputImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.DataOutputImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class DataOutputImpl
	extends ItemAwareElementImpl
	implements DataOutput
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataOutputImpl()
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
			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL :
			{
				return getOutputSetWithOptional();
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING :
			{
				return getOutputSetWithWhileExecuting();
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS :
			{
				return getOutputSetRefs();
			}

			case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION :
			{
				return isIsCollection();
			}

			case Bpmn2Package.DATA_OUTPUT__NAME :
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
			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputSetWithOptional()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputSetWithWhileExecuting()).basicAdd( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS :
			{
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputSetRefs()).basicAdd( otherEnd, msgs );
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
			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL :
			{
				return ((InternalEList<?>) getOutputSetWithOptional()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING :
			{
				return ((InternalEList<?>) getOutputSetWithWhileExecuting()).basicRemove( otherEnd, msgs );
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS :
			{
				return ((InternalEList<?>) getOutputSetRefs()).basicRemove( otherEnd, msgs );
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
			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL :
			{
				return ( outputSetWithOptional != null ) && ! outputSetWithOptional.isEmpty();
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING :
			{
				return ( outputSetWithWhileExecuting != null ) && ! outputSetWithWhileExecuting.isEmpty();
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS :
			{
				return ( outputSetRefs != null ) && ! outputSetRefs.isEmpty();
			}

			case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION :
			{
				return isCollection != IS_COLLECTION_EDEFAULT;
			}

			case Bpmn2Package.DATA_OUTPUT__NAME :
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
			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL :
			{
				getOutputSetWithOptional().clear();
				getOutputSetWithOptional().addAll((Collection<? extends OutputSet>) newValue );

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING :
			{
				getOutputSetWithWhileExecuting().clear();
				getOutputSetWithWhileExecuting().addAll((Collection<? extends OutputSet>) newValue );

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS :
			{
				getOutputSetRefs().clear();
				getOutputSetRefs().addAll((Collection<? extends OutputSet>) newValue );

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION :
			{
				setIsCollection((Boolean) newValue );

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__NAME :
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
			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL :
			{
				getOutputSetWithOptional().clear();

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING :
			{
				getOutputSetWithWhileExecuting().clear();

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS :
			{
				getOutputSetRefs().clear();

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__IS_COLLECTION :
			{
				setIsCollection( IS_COLLECTION_EDEFAULT );

				return;
			}

			case Bpmn2Package.DATA_OUTPUT__NAME :
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
	@Override public List<OutputSet> getOutputSetRefs()
	{
		if( outputSetRefs == null )
		{
			outputSetRefs = new EObjectWithInverseResolvingEList.ManyInverse<OutputSet>( OutputSet.class, this, Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_REFS, Bpmn2Package.OUTPUT_SET__DATA_OUTPUT_REFS );
		}

		return outputSetRefs;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<OutputSet> getOutputSetWithOptional()
	{
		if( outputSetWithOptional == null )
		{
			outputSetWithOptional = new EObjectWithInverseResolvingEList.ManyInverse<OutputSet>( OutputSet.class, this, Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL, Bpmn2Package.OUTPUT_SET__OPTIONAL_OUTPUT_REFS );
		}

		return outputSetWithOptional;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public List<OutputSet> getOutputSetWithWhileExecuting()
	{
		if( outputSetWithWhileExecuting == null )
		{
			outputSetWithWhileExecuting = new EObjectWithInverseResolvingEList.ManyInverse<OutputSet>( OutputSet.class, this, Bpmn2Package.DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING, Bpmn2Package.OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS );
		}

		return outputSetWithWhileExecuting;
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_OUTPUT__IS_COLLECTION, oldIsCollection, isCollection ));
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.DATA_OUTPUT__NAME, oldName, name ));
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
		return Bpmn2Package.Literals.DATA_OUTPUT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

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

	/**
	 * The cached value of the '{@link #getOutputSetRefs() <em>Output Set Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutputSetRefs()
	 * @generated
	 * @orderd
	 */
	protected EList<OutputSet> outputSetRefs;

	/**
	 * The cached value of the '{@link #getOutputSetWithOptional() <em>Output Set With Optional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutputSetWithOptional()
	 * @generated
	 * @orderd
	 */
	protected EList<OutputSet> outputSetWithOptional;

	/**
	 * The cached value of the '{@link #getOutputSetWithWhileExecuting() <em>Output Set With While Executing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getOutputSetWithWhileExecuting()
	 * @generated
	 * @orderd
	 */
	protected EList<OutputSet> outputSetWithWhileExecuting;

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
} //DataOutputImpl
