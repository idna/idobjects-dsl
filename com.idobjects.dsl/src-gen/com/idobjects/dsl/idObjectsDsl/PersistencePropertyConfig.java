/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Property Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigKey <em>Property Config Key</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigValue <em>Property Config Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistencePropertyConfig()
 * @model
 * @generated
 */
public interface PersistencePropertyConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Config Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Config Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Config Key</em>' attribute.
   * @see #setPropertyConfigKey(String)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistencePropertyConfig_PropertyConfigKey()
   * @model
   * @generated
   */
  String getPropertyConfigKey();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigKey <em>Property Config Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Config Key</em>' attribute.
   * @see #getPropertyConfigKey()
   * @generated
   */
  void setPropertyConfigKey(String value);

  /**
   * Returns the value of the '<em><b>Property Config Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Config Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Config Value</em>' attribute.
   * @see #setPropertyConfigValue(String)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistencePropertyConfig_PropertyConfigValue()
   * @model
   * @generated
   */
  String getPropertyConfigValue();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigValue <em>Property Config Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Config Value</em>' attribute.
   * @see #getPropertyConfigValue()
   * @generated
   */
  void setPropertyConfigValue(String value);

} // PersistencePropertyConfig
