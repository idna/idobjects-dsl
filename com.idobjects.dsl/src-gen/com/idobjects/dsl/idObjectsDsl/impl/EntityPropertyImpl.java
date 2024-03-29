/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityPropertyImpl extends MinimalEObjectImpl.Container implements EntityProperty
{
  /**
   * The default value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyType()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyType()
   * @generated
   * @ordered
   */
  protected String propertyType = PROPERTY_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityPropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IdObjectsDslPackage.Literals.ENTITY_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyType()
  {
    return propertyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyType(String newPropertyType)
  {
    String oldPropertyType = propertyType;
    propertyType = newPropertyType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY_PROPERTY__PROPERTY_TYPE, oldPropertyType, propertyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY_PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.ENTITY_PROPERTY__PROPERTY_TYPE:
        return getPropertyType();
      case IdObjectsDslPackage.ENTITY_PROPERTY__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.ENTITY_PROPERTY__PROPERTY_TYPE:
        setPropertyType((String)newValue);
        return;
      case IdObjectsDslPackage.ENTITY_PROPERTY__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.ENTITY_PROPERTY__PROPERTY_TYPE:
        setPropertyType(PROPERTY_TYPE_EDEFAULT);
        return;
      case IdObjectsDslPackage.ENTITY_PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.ENTITY_PROPERTY__PROPERTY_TYPE:
        return PROPERTY_TYPE_EDEFAULT == null ? propertyType != null : !PROPERTY_TYPE_EDEFAULT.equals(propertyType);
      case IdObjectsDslPackage.ENTITY_PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (propertyType: ");
    result.append(propertyType);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityPropertyImpl
