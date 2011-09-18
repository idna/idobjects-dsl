/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslFactory
 * @model kind="package"
 * @generated
 */
public interface IdObjectsDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "idObjectsDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.idobjects.com/IdObjectsDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "idObjectsDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IdObjectsDslPackage eINSTANCE = com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.ModelImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.PackageImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ENTITIES = 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.EntityImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl <em>Entity Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getEntityProperty()
   * @generated
   */
  int ENTITY_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Property Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_PROPERTY__PROPERTY_TYPE = 0;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_PROPERTY__PROPERTY_NAME = 1;

  /**
   * The number of structural features of the '<em>Entity Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_PROPERTY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.Package#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Package#getEntities()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Entities();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.EntityProperty <em>Entity Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Property</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityProperty
   * @generated
   */
  EClass getEntityProperty();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Type</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyType()
   * @see #getEntityProperty()
   * @generated
   */
  EAttribute getEntityProperty_PropertyType();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityProperty#getPropertyName()
   * @see #getEntityProperty()
   * @generated
   */
  EAttribute getEntityProperty_PropertyName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IdObjectsDslFactory getIdObjectsDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.ModelImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.PackageImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ENTITIES = eINSTANCE.getPackage_Entities();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.EntityImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl <em>Entity Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getEntityProperty()
     * @generated
     */
    EClass ENTITY_PROPERTY = eINSTANCE.getEntityProperty();

    /**
     * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_PROPERTY__PROPERTY_TYPE = eINSTANCE.getEntityProperty_PropertyType();

    /**
     * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_PROPERTY__PROPERTY_NAME = eINSTANCE.getEntityProperty_PropertyName();

  }

} //IdObjectsDslPackage
