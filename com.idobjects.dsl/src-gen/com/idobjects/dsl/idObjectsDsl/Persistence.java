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
 * A representation of the model object '<em><b>Persistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.Persistence#getPersistencePackage <em>Persistence Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistence()
 * @model
 * @generated
 */
public interface Persistence extends EObject
{
  /**
   * Returns the value of the '<em><b>Persistence Package</b></em>' containment reference list.
   * The list contents are of type {@link com.idobjects.dsl.idObjectsDsl.PersistencePackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistence Package</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistence Package</em>' containment reference list.
   * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage#getPersistence_PersistencePackage()
   * @model containment="true"
   * @generated
   */
  EList<PersistencePackage> getPersistencePackage();

} // Persistence
