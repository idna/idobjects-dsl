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
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.Entity#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.Entity#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.Entity#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.Entity#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
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
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Entity</em>' reference.
   * @see #setSuperEntity(Entity)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntity_SuperEntity()
   * @model
   * @generated
   */
  Entity getSuperEntity();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.Entity#getSuperEntity <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Entity</em>' reference.
   * @see #getSuperEntity()
   * @generated
   */
  void setSuperEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.idobjects.dsl.idObjectsDsl.EntityProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntity_Properties()
   * @model containment="true"
   * @generated
   */
  EList<EntityProperty> getProperties();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link com.idobjects.dsl.idObjectsDsl.EntityReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntity_References()
   * @model containment="true"
   * @generated
   */
  EList<EntityReference> getReferences();

} // Entity
