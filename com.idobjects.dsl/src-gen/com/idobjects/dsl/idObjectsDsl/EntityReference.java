/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getListDestination <em>List Destination</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getSingleDestination <em>Single Destination</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getInverseName <em>Inverse Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityReference()
 * @model
 * @generated
 */
public interface EntityReference extends EObject
{
  /**
   * Returns the value of the '<em><b>List Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Destination</em>' reference.
   * @see #setListDestination(Entity)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityReference_ListDestination()
   * @model
   * @generated
   */
  Entity getListDestination();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getListDestination <em>List Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Destination</em>' reference.
   * @see #getListDestination()
   * @generated
   */
  void setListDestination(Entity value);

  /**
   * Returns the value of the '<em><b>Single Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Destination</em>' reference.
   * @see #setSingleDestination(Entity)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityReference_SingleDestination()
   * @model
   * @generated
   */
  Entity getSingleDestination();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getSingleDestination <em>Single Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Destination</em>' reference.
   * @see #getSingleDestination()
   * @generated
   */
  void setSingleDestination(Entity value);

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
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityReference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inverse Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inverse Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inverse Name</em>' attribute.
   * @see #setInverseName(String)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityReference_InverseName()
   * @model
   * @generated
   */
  String getInverseName();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getInverseName <em>Inverse Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inverse Name</em>' attribute.
   * @see #getInverseName()
   * @generated
   */
  void setInverseName(String value);

} // EntityReference
