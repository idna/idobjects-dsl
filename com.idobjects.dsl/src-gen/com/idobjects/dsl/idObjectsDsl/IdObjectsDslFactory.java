/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage
 * @generated
 */
public interface IdObjectsDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IdObjectsDslFactory eINSTANCE = com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Entity Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Reference</em>'.
   * @generated
   */
  EntityReference createEntityReference();

  /**
   * Returns a new object of class '<em>Persistence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persistence</em>'.
   * @generated
   */
  Persistence createPersistence();

  /**
   * Returns a new object of class '<em>Persistence Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persistence Package</em>'.
   * @generated
   */
  PersistencePackage createPersistencePackage();

  /**
   * Returns a new object of class '<em>Persistence Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persistence Entity</em>'.
   * @generated
   */
  PersistenceEntity createPersistenceEntity();

  /**
   * Returns a new object of class '<em>Persistence Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persistence Property</em>'.
   * @generated
   */
  PersistenceProperty createPersistenceProperty();

  /**
   * Returns a new object of class '<em>Persistence Property Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persistence Property Config</em>'.
   * @generated
   */
  PersistencePropertyConfig createPersistencePropertyConfig();

  /**
   * Returns a new object of class '<em>Entity Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Property</em>'.
   * @generated
   */
  EntityProperty createEntityProperty();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IdObjectsDslPackage getIdObjectsDslPackage();

} //IdObjectsDslFactory
