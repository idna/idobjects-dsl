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
 * A representation of the model object '<em><b>Persistence Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.PersistenceEntity#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.PersistenceEntity#getPersistenceProperties <em>Persistence Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistenceEntity()
 * @model
 * @generated
 */
public interface PersistenceEntity extends EObject
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
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistenceEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.PersistenceEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Persistence Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistence Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistence Properties</em>' containment reference list.
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistenceEntity_PersistenceProperties()
   * @model containment="true"
   * @generated
   */
  EList<PersistenceProperty> getPersistenceProperties();

} // PersistenceEntity
