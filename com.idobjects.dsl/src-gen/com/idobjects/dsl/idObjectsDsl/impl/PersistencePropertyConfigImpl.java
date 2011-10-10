/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Property Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyConfigImpl#getPropertyConfigKey <em>Property Config Key</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyConfigImpl#getPropertyConfigValue <em>Property Config Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistencePropertyConfigImpl extends MinimalEObjectImpl.Container implements PersistencePropertyConfig
{
  /**
   * The default value of the '{@link #getPropertyConfigKey() <em>Property Config Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyConfigKey()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_CONFIG_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyConfigKey() <em>Property Config Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyConfigKey()
   * @generated
   * @ordered
   */
  protected String propertyConfigKey = PROPERTY_CONFIG_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getPropertyConfigValue() <em>Property Config Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyConfigValue()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_CONFIG_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyConfigValue() <em>Property Config Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyConfigValue()
   * @generated
   * @ordered
   */
  protected String propertyConfigValue = PROPERTY_CONFIG_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersistencePropertyConfigImpl()
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
    return IdObjectsDslPackage.Literals.PERSISTENCE_PROPERTY_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyConfigKey()
  {
    return propertyConfigKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyConfigKey(String newPropertyConfigKey)
  {
    String oldPropertyConfigKey = propertyConfigKey;
    propertyConfigKey = newPropertyConfigKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY, oldPropertyConfigKey, propertyConfigKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyConfigValue()
  {
    return propertyConfigValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyConfigValue(String newPropertyConfigValue)
  {
    String oldPropertyConfigValue = propertyConfigValue;
    propertyConfigValue = newPropertyConfigValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE, oldPropertyConfigValue, propertyConfigValue));
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
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY:
        return getPropertyConfigKey();
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE:
        return getPropertyConfigValue();
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
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY:
        setPropertyConfigKey((String)newValue);
        return;
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE:
        setPropertyConfigValue((String)newValue);
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
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY:
        setPropertyConfigKey(PROPERTY_CONFIG_KEY_EDEFAULT);
        return;
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE:
        setPropertyConfigValue(PROPERTY_CONFIG_VALUE_EDEFAULT);
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
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY:
        return PROPERTY_CONFIG_KEY_EDEFAULT == null ? propertyConfigKey != null : !PROPERTY_CONFIG_KEY_EDEFAULT.equals(propertyConfigKey);
      case IdObjectsDslPackage.PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE:
        return PROPERTY_CONFIG_VALUE_EDEFAULT == null ? propertyConfigValue != null : !PROPERTY_CONFIG_VALUE_EDEFAULT.equals(propertyConfigValue);
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
    result.append(" (propertyConfigKey: ");
    result.append(propertyConfigKey);
    result.append(", propertyConfigValue: ");
    result.append(propertyConfigValue);
    result.append(')');
    return result.toString();
  }

} //PersistencePropertyConfigImpl
