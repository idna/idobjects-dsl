/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityProperty()
 * @model
 * @generated
 */
public interface EntityProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Type</em>' attribute.
   * @see #setPropertyType(String)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityProperty_PropertyType()
   * @model
   * @generated
   */
  String getPropertyType();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyType <em>Property Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Type</em>' attribute.
   * @see #getPropertyType()
   * @generated
   */
  void setPropertyType(String value);

  /**
   * Returns the value of the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' attribute.
   * @see #setPropertyName(String)
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getEntityProperty_PropertyName()
   * @model
   * @generated
   */
  String getPropertyName();

  /**
   * Sets the value of the '{@link com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyName <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' attribute.
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(String value);

} // EntityProperty
