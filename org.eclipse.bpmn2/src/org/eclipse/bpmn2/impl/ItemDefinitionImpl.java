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
import org.eclipse.bpmn2.Import;
import org.eclipse.bpmn2.ItemDefinition;
import org.eclipse.bpmn2.ItemKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ItemDefinitionImpl#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ItemDefinitionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ItemDefinitionImpl#getItemKind <em>Item Kind</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ItemDefinitionImpl#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ItemDefinitionImpl
	extends RootElementImpl
	implements ItemDefinition
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemDefinitionImpl()
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
	public Import basicGetImport()
	{
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
	public Object basicGetStructureRef()
	{
		return structureRef;
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
			case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION :
			{
				return isIsCollection();
			}

			case Bpmn2Package.ITEM_DEFINITION__IMPORT :
			{
				if( resolve )
				{
					return getImport();
				}

				return basicGetImport();
			}

			case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND :
			{
				return getItemKind();
			}

			case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF :
			{
				if( resolve )
				{
					return getStructureRef();
				}

				return basicGetStructureRef();
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
			case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION :
			{
				return isCollection != IS_COLLECTION_EDEFAULT;
			}

			case Bpmn2Package.ITEM_DEFINITION__IMPORT :
			{
				return import_ != null;
			}

			case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND :
			{
				return itemKind != ITEM_KIND_EDEFAULT;
			}

			case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF :
			{
				return structureRef != null;
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
			case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION :
			{
				setIsCollection((Boolean) newValue );

				return;
			}

			case Bpmn2Package.ITEM_DEFINITION__IMPORT :
			{
				setImport((Import) newValue );

				return;
			}

			case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND :
			{
				setItemKind((ItemKind) newValue );

				return;
			}

			case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF :
			{
				setStructureRef( newValue );

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
			case Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION :
			{
				setIsCollection( IS_COLLECTION_EDEFAULT );

				return;
			}

			case Bpmn2Package.ITEM_DEFINITION__IMPORT :
			{
				setImport((Import) null );

				return;
			}

			case Bpmn2Package.ITEM_DEFINITION__ITEM_KIND :
			{
				setItemKind( ITEM_KIND_EDEFAULT );

				return;
			}

			case Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF :
			{
				setStructureRef((Object) null );

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
	@Override public Import getImport()
	{
		if(( import_ != null ) && import_.eIsProxy())
		{
			final InternalEObject oldImport = (InternalEObject) import_;
			import_ = (Import) eResolveProxy( oldImport );

			if( import_ != oldImport )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.ITEM_DEFINITION__IMPORT, oldImport, import_ ));
				}
			}
		}

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
	@Override public ItemKind getItemKind()
	{
		return itemKind;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * TODO: cautious resolution of proxy
	 * <!-- end-user-doc -->
	 * @return     tODO:
	 *
	 * @generated
	 */
	@Override public Object getStructureRef()
	{
		if(( structureRef != null ) && structureRef.eIsProxy())
		{
			final InternalEObject oldStructureRef = (InternalEObject) structureRef;
			structureRef = eResolveProxy( oldStructureRef );

			if( structureRef != oldStructureRef )
			{
				if( eNotificationRequired())
				{
					eNotify( new ENotificationImpl( this, Notification.RESOLVE, Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF, oldStructureRef, structureRef ));
				}
			}
		}

		return structureRef;
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
	 * @param      newImport  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setImport( final Import newImport )
	{
		final Import oldImport = import_;
		import_ = newImport;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ITEM_DEFINITION__IMPORT, oldImport, import_ ));
		}
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
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ITEM_DEFINITION__IS_COLLECTION, oldIsCollection, isCollection ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newItemKind  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setItemKind( final ItemKind newItemKind )
	{
		final ItemKind oldItemKind = itemKind;
		itemKind = ( newItemKind == null ) ? ITEM_KIND_EDEFAULT : newItemKind;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ITEM_DEFINITION__ITEM_KIND, oldItemKind, itemKind ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newStructureRef  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setStructureRef( final Object newStructureRef )
	{
		final Object oldStructureRef = structureRef;
		structureRef = (EObject) newStructureRef;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.ITEM_DEFINITION__STRUCTURE_REF, oldStructureRef, structureRef ));
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
		result.append( ", itemKind: " );
		result.append( itemKind );
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
		return Bpmn2Package.Literals.ITEM_DEFINITION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getImport()
	 * @generated
	 * @orderd
	 */
	protected Import import_;

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
	 * The cached value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getItemKind()
	 * @generated
	 * @orderd
	 */
	protected ItemKind itemKind = ITEM_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructureRef() <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getStructureRef()
	 * @generated
	 * @orderd
	 */
	protected EObject structureRef;

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
	 * The default value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getItemKind()
	 * @generated
	 * @orderd
	 */
	protected static final ItemKind ITEM_KIND_EDEFAULT = ItemKind.INFORMATION;
} //ItemDefinitionImpl
