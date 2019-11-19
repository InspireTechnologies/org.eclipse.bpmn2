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
import org.eclipse.bpmn2.Extension;
import org.eclipse.bpmn2.ExtensionDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import javax.xml.namespace.QName;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionImpl#isMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.eclipse.bpmn2.impl.ExtensionImpl#getXsdDefinition <em>Xsd Definition</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class ExtensionImpl
	extends EObjectImpl
	implements Extension
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl()
	{
		super();
	}

	//~ Methods ................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDefinition  DOCUMENT ME!
	 * @param      msgs           DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	public NotificationChain basicSetDefinition( final ExtensionDefinition newDefinition, NotificationChain msgs )
	{
		final ExtensionDefinition oldDefinition = definition;
		definition = newDefinition;

		if( eNotificationRequired())
		{
			final ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION__DEFINITION, oldDefinition, newDefinition );

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
			case Bpmn2Package.EXTENSION__DEFINITION :
			{
				return getDefinition();
			}

			case Bpmn2Package.EXTENSION__MUST_UNDERSTAND :
			{
				return isMustUnderstand();
			}

			case Bpmn2Package.EXTENSION__XSD_DEFINITION :
			{
				return getXsdDefinition();
			}
		}

		return super.eGet( featureID, resolve, coreType );
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
			case Bpmn2Package.EXTENSION__DEFINITION :
			{
				return basicSetDefinition( null, msgs );
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
			case Bpmn2Package.EXTENSION__DEFINITION :
			{
				return definition != null;
			}

			case Bpmn2Package.EXTENSION__MUST_UNDERSTAND :
			{
				return mustUnderstand != MUST_UNDERSTAND_EDEFAULT;
			}

			case Bpmn2Package.EXTENSION__XSD_DEFINITION :
			{
				return ( XSD_DEFINITION_EDEFAULT == null ) ? ( xsdDefinition != null ) : ( ! XSD_DEFINITION_EDEFAULT.equals( xsdDefinition ));
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
			case Bpmn2Package.EXTENSION__DEFINITION :
			{
				setDefinition((ExtensionDefinition) newValue );

				return;
			}

			case Bpmn2Package.EXTENSION__MUST_UNDERSTAND :
			{
				setMustUnderstand((Boolean) newValue );

				return;
			}

			case Bpmn2Package.EXTENSION__XSD_DEFINITION :
			{
				setXsdDefinition((QName) newValue );

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
			case Bpmn2Package.EXTENSION__DEFINITION :
			{
				setDefinition((ExtensionDefinition) null );

				return;
			}

			case Bpmn2Package.EXTENSION__MUST_UNDERSTAND :
			{
				setMustUnderstand( MUST_UNDERSTAND_EDEFAULT );

				return;
			}

			case Bpmn2Package.EXTENSION__XSD_DEFINITION :
			{
				setXsdDefinition( XSD_DEFINITION_EDEFAULT );

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
	@Override public ExtensionDefinition getDefinition()
	{
		return definition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public QName getXsdDefinition()
	{
		return xsdDefinition;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isMustUnderstand()
	{
		return mustUnderstand;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newDefinition  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setDefinition( final ExtensionDefinition newDefinition )
	{
		if( newDefinition != definition )
		{
			NotificationChain msgs = null;

			if( definition != null )
			{
				msgs = ((InternalEObject) definition ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.EXTENSION__DEFINITION, null, msgs );
			}

			if( newDefinition != null )
			{
				msgs = ((InternalEObject) newDefinition ).eInverseAdd( this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.EXTENSION__DEFINITION, null, msgs );
			}

			msgs = basicSetDefinition( newDefinition, msgs );

			if( msgs != null )
			{
				msgs.dispatch();
			}
		}
		else if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION__DEFINITION, newDefinition, newDefinition ));
		}
	} // end method setDefinition

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newMustUnderstand  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setMustUnderstand( final boolean newMustUnderstand )
	{
		final boolean oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION__MUST_UNDERSTAND, oldMustUnderstand, mustUnderstand ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newXsdDefinition  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setXsdDefinition( final QName newXsdDefinition )
	{
		final QName oldXsdDefinition = xsdDefinition;
		xsdDefinition = newXsdDefinition;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, Bpmn2Package.EXTENSION__XSD_DEFINITION, oldXsdDefinition, xsdDefinition ));
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
		result.append( " (mustUnderstand: " );
		result.append( mustUnderstand );
		result.append( ", xsdDefinition: " );
		result.append( xsdDefinition );
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
		return Bpmn2Package.Literals.EXTENSION;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getDefinition()
	 * @generated
	 * @orderd
	 */
	protected ExtensionDefinition definition;

	/**
	 * The cached value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isMustUnderstand()
	 * @generated
	 * @orderd
	 */
	protected boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXsdDefinition() <em>Xsd Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getXsdDefinition()
	 * @generated
	 * @orderd
	 */
	protected QName xsdDefinition = XSD_DEFINITION_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isMustUnderstand()
	 * @generated
	 * @orderd
	 */
	protected static final boolean MUST_UNDERSTAND_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getXsdDefinition() <em>Xsd Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getXsdDefinition()
	 * @generated
	 * @orderd
	 */
	protected static final QName XSD_DEFINITION_EDEFAULT = null;
} //ExtensionImpl
