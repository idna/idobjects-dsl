/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistenceProperty()
 * @model
 * @generated
 */
public interface PersistenceProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistenceProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Config</b></em>' containment reference list.
   * The list contents are of type {@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' containment reference list.
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistenceProperty_Config()
   * @model containment="true"
   * @generated
   */
  EList<PersistencePropertyConfig> getConfig();

} // PersistenceProperty
