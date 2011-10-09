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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 1;

  /**
   * The feature id for the '<em><b>Persistence Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PERSISTENCE_MODEL = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__REFERENCES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getEntityReference()
   * @generated
   */
  int ENTITY_REFERENCE = 3;

  /**
   * The feature id for the '<em><b>List Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE__LIST_DESTINATION = 0;

  /**
   * The feature id for the '<em><b>Single Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE__SINGLE_DESTINATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE__NAME = 2;

  /**
   * The feature id for the '<em><b>Inverse Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE__INVERSE_NAME = 3;

  /**
   * The number of structural features of the '<em>Entity Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistenceImpl <em>Persistence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.PersistenceImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistence()
   * @generated
   */
  int PERSISTENCE = 4;

  /**
   * The feature id for the '<em><b>Persistence Package</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE__PERSISTENCE_PACKAGE = 0;

  /**
   * The number of structural features of the '<em>Persistence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePackageImpl <em>Persistence Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.PersistencePackageImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistencePackage()
   * @generated
   */
  int PERSISTENCE_PACKAGE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Persistence Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES = 1;

  /**
   * The number of structural features of the '<em>Persistence Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistenceEntityImpl <em>Persistence Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.PersistenceEntityImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistenceEntity()
   * @generated
   */
  int PERSISTENCE_ENTITY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Persistence Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY__PERSISTENCE_PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Persistence Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyImpl <em>Persistence Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistenceProperty()
   * @generated
   */
  int PERSISTENCE_PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Config</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PROPERTY__CONFIG = 1;

  /**
   * The number of structural features of the '<em>Persistence Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyConfigImpl <em>Persistence Property Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyConfigImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistencePropertyConfig()
   * @generated
   */
  int PERSISTENCE_PROPERTY_CONFIG = 8;

  /**
   * The feature id for the '<em><b>Property Config Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY = 0;

  /**
   * The feature id for the '<em><b>Property Config Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE = 1;

  /**
   * The number of structural features of the '<em>Persistence Property Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_PROPERTY_CONFIG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl <em>Entity Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.idobjects.dsl.idObjectsDsl.impl.EntityPropertyImpl
   * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getEntityProperty()
   * @generated
   */
  int ENTITY_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Property Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_PROPERTY__PROPERTY_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_PROPERTY__NAME = 1;

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
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

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
   * Returns the meta object for the containment reference '{@link com.idobjects.dsl.idObjectsDsl.Model#getPersistenceModel <em>Persistence Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Persistence Model</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Model#getPersistenceModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_PersistenceModel();

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
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.Entity#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Entity#getReferences()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_References();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.EntityReference <em>Entity Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Reference</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityReference
   * @generated
   */
  EClass getEntityReference();

  /**
   * Returns the meta object for the reference '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getListDestination <em>List Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>List Destination</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityReference#getListDestination()
   * @see #getEntityReference()
   * @generated
   */
  EReference getEntityReference_ListDestination();

  /**
   * Returns the meta object for the reference '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getSingleDestination <em>Single Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Single Destination</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityReference#getSingleDestination()
   * @see #getEntityReference()
   * @generated
   */
  EReference getEntityReference_SingleDestination();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityReference#getName()
   * @see #getEntityReference()
   * @generated
   */
  EAttribute getEntityReference_Name();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.EntityReference#getInverseName <em>Inverse Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inverse Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityReference#getInverseName()
   * @see #getEntityReference()
   * @generated
   */
  EAttribute getEntityReference_InverseName();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.Persistence <em>Persistence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistence</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Persistence
   * @generated
   */
  EClass getPersistence();

  /**
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.Persistence#getPersistencePackage <em>Persistence Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persistence Package</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.Persistence#getPersistencePackage()
   * @see #getPersistence()
   * @generated
   */
  EReference getPersistence_PersistencePackage();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.PersistencePackage <em>Persistence Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistence Package</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePackage
   * @generated
   */
  EClass getPersistencePackage();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.PersistencePackage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePackage#getName()
   * @see #getPersistencePackage()
   * @generated
   */
  EAttribute getPersistencePackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.PersistencePackage#getPersistenceEntities <em>Persistence Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persistence Entities</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePackage#getPersistenceEntities()
   * @see #getPersistencePackage()
   * @generated
   */
  EReference getPersistencePackage_PersistenceEntities();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.PersistenceEntity <em>Persistence Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistence Entity</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceEntity
   * @generated
   */
  EClass getPersistenceEntity();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.PersistenceEntity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceEntity#getName()
   * @see #getPersistenceEntity()
   * @generated
   */
  EAttribute getPersistenceEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.PersistenceEntity#getPersistenceProperties <em>Persistence Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persistence Properties</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceEntity#getPersistenceProperties()
   * @see #getPersistenceEntity()
   * @generated
   */
  EReference getPersistenceEntity_PersistenceProperties();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty <em>Persistence Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistence Property</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceProperty
   * @generated
   */
  EClass getPersistenceProperty();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceProperty#getName()
   * @see #getPersistenceProperty()
   * @generated
   */
  EAttribute getPersistenceProperty_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Config</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceProperty#getConfig()
   * @see #getPersistenceProperty()
   * @generated
   */
  EReference getPersistenceProperty_Config();

  /**
   * Returns the meta object for class '{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig <em>Persistence Property Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistence Property Config</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig
   * @generated
   */
  EClass getPersistencePropertyConfig();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigKey <em>Property Config Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Config Key</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigKey()
   * @see #getPersistencePropertyConfig()
   * @generated
   */
  EAttribute getPersistencePropertyConfig_PropertyConfigKey();

  /**
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigValue <em>Property Config Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Config Value</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig#getPropertyConfigValue()
   * @see #getPersistencePropertyConfig()
   * @generated
   */
  EAttribute getPersistencePropertyConfig_PropertyConfigValue();

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
   * Returns the meta object for the attribute '{@link com.idobjects.dsl.idObjectsDsl.EntityProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.idobjects.dsl.idObjectsDsl.EntityProperty#getName()
   * @see #getEntityProperty()
   * @generated
   */
  EAttribute getEntityProperty_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '<em><b>Persistence Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PERSISTENCE_MODEL = eINSTANCE.getModel_PersistenceModel();

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
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__REFERENCES = eINSTANCE.getEntity_References();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getEntityReference()
     * @generated
     */
    EClass ENTITY_REFERENCE = eINSTANCE.getEntityReference();

    /**
     * The meta object literal for the '<em><b>List Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_REFERENCE__LIST_DESTINATION = eINSTANCE.getEntityReference_ListDestination();

    /**
     * The meta object literal for the '<em><b>Single Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_REFERENCE__SINGLE_DESTINATION = eINSTANCE.getEntityReference_SingleDestination();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_REFERENCE__NAME = eINSTANCE.getEntityReference_Name();

    /**
     * The meta object literal for the '<em><b>Inverse Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_REFERENCE__INVERSE_NAME = eINSTANCE.getEntityReference_InverseName();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistenceImpl <em>Persistence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.PersistenceImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistence()
     * @generated
     */
    EClass PERSISTENCE = eINSTANCE.getPersistence();

    /**
     * The meta object literal for the '<em><b>Persistence Package</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE__PERSISTENCE_PACKAGE = eINSTANCE.getPersistence_PersistencePackage();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePackageImpl <em>Persistence Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.PersistencePackageImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistencePackage()
     * @generated
     */
    EClass PERSISTENCE_PACKAGE = eINSTANCE.getPersistencePackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_PACKAGE__NAME = eINSTANCE.getPersistencePackage_Name();

    /**
     * The meta object literal for the '<em><b>Persistence Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES = eINSTANCE.getPersistencePackage_PersistenceEntities();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistenceEntityImpl <em>Persistence Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.PersistenceEntityImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistenceEntity()
     * @generated
     */
    EClass PERSISTENCE_ENTITY = eINSTANCE.getPersistenceEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_ENTITY__NAME = eINSTANCE.getPersistenceEntity_Name();

    /**
     * The meta object literal for the '<em><b>Persistence Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_ENTITY__PERSISTENCE_PROPERTIES = eINSTANCE.getPersistenceEntity_PersistenceProperties();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyImpl <em>Persistence Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistenceProperty()
     * @generated
     */
    EClass PERSISTENCE_PROPERTY = eINSTANCE.getPersistenceProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_PROPERTY__NAME = eINSTANCE.getPersistenceProperty_Name();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSISTENCE_PROPERTY__CONFIG = eINSTANCE.getPersistenceProperty_Config();

    /**
     * The meta object literal for the '{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyConfigImpl <em>Persistence Property Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.idobjects.dsl.idObjectsDsl.impl.PersistencePropertyConfigImpl
     * @see com.idobjects.dsl.idObjectsDsl.impl.IdObjectsDslPackageImpl#getPersistencePropertyConfig()
     * @generated
     */
    EClass PERSISTENCE_PROPERTY_CONFIG = eINSTANCE.getPersistencePropertyConfig();

    /**
     * The meta object literal for the '<em><b>Property Config Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_KEY = eINSTANCE.getPersistencePropertyConfig_PropertyConfigKey();

    /**
     * The meta object literal for the '<em><b>Property Config Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSISTENCE_PROPERTY_CONFIG__PROPERTY_CONFIG_VALUE = eINSTANCE.getPersistencePropertyConfig_PropertyConfigValue();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_PROPERTY__NAME = eINSTANCE.getEntityProperty_Name();

  }

} //IdObjectsDslPackage
