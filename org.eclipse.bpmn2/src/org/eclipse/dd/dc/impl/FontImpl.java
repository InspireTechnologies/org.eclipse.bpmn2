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
package org.eclipse.dd.dc.impl;

import org.eclipse.dd.dc.DcPackage;
import org.eclipse.dd.dc.Font;
import org.eclipse.dd.dc.util.DcValidator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;

import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:</p>
 *
 * <ul>
 *   <li>{@link org.eclipse.dd.dc.impl.FontImpl#isIsBold <em>Is Bold</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.FontImpl#isIsItalic <em>Is Italic</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.FontImpl#isIsStrikeThrough <em>Is Strike Through</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.FontImpl#isIsUnderline <em>Is Underline</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.FontImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.dd.dc.impl.FontImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @author     Harald
 * @generated
 */
public class FontImpl
	extends EObjectImpl
	implements Font
{
	//~ Constructors ...........................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImpl()
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
			case DcPackage.FONT__IS_BOLD :
			{
				return isIsBold();
			}

			case DcPackage.FONT__IS_ITALIC :
			{
				return isIsItalic();
			}

			case DcPackage.FONT__IS_STRIKE_THROUGH :
			{
				return isIsStrikeThrough();
			}

			case DcPackage.FONT__IS_UNDERLINE :
			{
				return isIsUnderline();
			}

			case DcPackage.FONT__NAME :
			{
				return getName();
			}

			case DcPackage.FONT__SIZE :
			{
				return getSize();
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
			case DcPackage.FONT__IS_BOLD :
			{
				return isBold != IS_BOLD_EDEFAULT;
			}

			case DcPackage.FONT__IS_ITALIC :
			{
				return isItalic != IS_ITALIC_EDEFAULT;
			}

			case DcPackage.FONT__IS_STRIKE_THROUGH :
			{
				return isStrikeThrough != IS_STRIKE_THROUGH_EDEFAULT;
			}

			case DcPackage.FONT__IS_UNDERLINE :
			{
				return isUnderline != IS_UNDERLINE_EDEFAULT;
			}

			case DcPackage.FONT__NAME :
			{
				return ( NAME_EDEFAULT == null ) ? ( name != null ) : ( ! NAME_EDEFAULT.equals( name ));
			}

			case DcPackage.FONT__SIZE :
			{
				return size != SIZE_EDEFAULT;
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
			case DcPackage.FONT__IS_BOLD :
			{
				setIsBold((Boolean) newValue );

				return;
			}

			case DcPackage.FONT__IS_ITALIC :
			{
				setIsItalic((Boolean) newValue );

				return;
			}

			case DcPackage.FONT__IS_STRIKE_THROUGH :
			{
				setIsStrikeThrough((Boolean) newValue );

				return;
			}

			case DcPackage.FONT__IS_UNDERLINE :
			{
				setIsUnderline((Boolean) newValue );

				return;
			}

			case DcPackage.FONT__NAME :
			{
				setName((String) newValue );

				return;
			}

			case DcPackage.FONT__SIZE :
			{
				setSize((Float) newValue );

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
			case DcPackage.FONT__IS_BOLD :
			{
				setIsBold( IS_BOLD_EDEFAULT );

				return;
			}

			case DcPackage.FONT__IS_ITALIC :
			{
				setIsItalic( IS_ITALIC_EDEFAULT );

				return;
			}

			case DcPackage.FONT__IS_STRIKE_THROUGH :
			{
				setIsStrikeThrough( IS_STRIKE_THROUGH_EDEFAULT );

				return;
			}

			case DcPackage.FONT__IS_UNDERLINE :
			{
				setIsUnderline( IS_UNDERLINE_EDEFAULT );

				return;
			}

			case DcPackage.FONT__NAME :
			{
				setName( NAME_EDEFAULT );

				return;
			}

			case DcPackage.FONT__SIZE :
			{
				setSize( SIZE_EDEFAULT );

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
	@Override public float getSize()
	{
		return size;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsBold()
	{
		return isBold;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsItalic()
	{
		return isItalic;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsStrikeThrough()
	{
		return isStrikeThrough;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean isIsUnderline()
	{
		return isUnderline;
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      diagnostics  DOCUMENT ME!
	 * @param      context      DOCUMENT ME!
	 *
	 * @return     DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public boolean non_negative_size( final DiagnosticChain diagnostics, final Map<Object, Object> context )
	{
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if( false )
		{
			if( diagnostics != null )
			{
				diagnostics.add(
					new BasicDiagnostic( Diagnostic.ERROR,
						DcValidator.DIAGNOSTIC_SOURCE,
						DcValidator.FONT__NON_NEGATIVE_SIZE,
						EcorePlugin.INSTANCE.getString( "_UI_GenericInvariant_diagnostic", new Object[]
							{
								"non_negative_size",
								EObjectValidator.getObjectLabel( this, context )
							} ),
						new Object[] { this } ));
			}

			return false;
		}

		return true;
	} // end method non_negative_size

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsBold  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsBold( final boolean newIsBold )
	{
		final boolean oldIsBold = isBold;
		isBold = newIsBold;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, DcPackage.FONT__IS_BOLD, oldIsBold, isBold ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsItalic  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsItalic( final boolean newIsItalic )
	{
		final boolean oldIsItalic = isItalic;
		isItalic = newIsItalic;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, DcPackage.FONT__IS_ITALIC, oldIsItalic, isItalic ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsStrikeThrough  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsStrikeThrough( final boolean newIsStrikeThrough )
	{
		final boolean oldIsStrikeThrough = isStrikeThrough;
		isStrikeThrough = newIsStrikeThrough;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, DcPackage.FONT__IS_STRIKE_THROUGH, oldIsStrikeThrough, isStrikeThrough ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newIsUnderline  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setIsUnderline( final boolean newIsUnderline )
	{
		final boolean oldIsUnderline = isUnderline;
		isUnderline = newIsUnderline;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, DcPackage.FONT__IS_UNDERLINE, oldIsUnderline, isUnderline ));
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
			eNotify( new ENotificationImpl( this, Notification.SET, DcPackage.FONT__NAME, oldName, name ));
		}
	}

	//~ ........................................................................................................................................................................................................................................................

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param      newSize  DOCUMENT ME!
	 *
	 * @generated
	 */
	@Override public void setSize( final float newSize )
	{
		final float oldSize = size;
		size = newSize;

		if( eNotificationRequired())
		{
			eNotify( new ENotificationImpl( this, Notification.SET, DcPackage.FONT__SIZE, oldSize, size ));
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
		result.append( " (isBold: " );
		result.append( isBold );
		result.append( ", isItalic: " );
		result.append( isItalic );
		result.append( ", isStrikeThrough: " );
		result.append( isStrikeThrough );
		result.append( ", isUnderline: " );
		result.append( isUnderline );
		result.append( ", name: " );
		result.append( name );
		result.append( ", size: " );
		result.append( size );
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
		return DcPackage.Literals.FONT;
	}

	//~ Instance variables .....................................................................................................................................................................................................................................

	/**
	 * The cached value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsBold()
	 * @generated
	 * @orderd
	 */
	protected boolean isBold = IS_BOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsItalic()
	 * @generated
	 * @orderd
	 */
	protected boolean isItalic = IS_ITALIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #isIsStrikeThrough() <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsStrikeThrough()
	 * @generated
	 * @orderd
	 */
	protected boolean isStrikeThrough = IS_STRIKE_THROUGH_EDEFAULT;

	/**
	 * The cached value of the '{@link #isIsUnderline() <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsUnderline()
	 * @generated
	 * @orderd
	 */
	protected boolean isUnderline = IS_UNDERLINE_EDEFAULT;

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
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSize()
	 * @generated
	 * @orderd
	 */
	protected float size = SIZE_EDEFAULT;

	//~ Static variables/initializers ..........................................................................................................................................................................................................................

	/**
	 * The default value of the '{@link #isIsBold() <em>Is Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsBold()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_BOLD_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsItalic() <em>Is Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsItalic()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_ITALIC_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsStrikeThrough() <em>Is Strike Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsStrikeThrough()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_STRIKE_THROUGH_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsUnderline() <em>Is Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #isIsUnderline()
	 * @generated
	 * @orderd
	 */
	protected static final boolean IS_UNDERLINE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getName()
	 * @generated
	 * @orderd
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see        #getSize()
	 * @generated
	 * @orderd
	 */
	protected static final float SIZE_EDEFAULT = 0.0F;
} //FontImpl
