/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.util;

import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.EntityReference;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.Model;
import com.idobjects.dsl.idObjectsDsl.Persistence;
import com.idobjects.dsl.idObjectsDsl.PersistenceEntity;
import com.idobjects.dsl.idObjectsDsl.PersistencePackage;
import com.idobjects.dsl.idObjectsDsl.PersistenceProperty;
import com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage
 * @generated
 */
public class IdObjectsDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IdObjectsDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdObjectsDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IdObjectsDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdObjectsDslSwitch<Adapter> modelSwitch =
    new IdObjectsDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackage(com.idobjects.dsl.idObjectsDsl.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEntityReference(EntityReference object)
      {
        return createEntityReferenceAdapter();
      }
      @Override
      public Adapter casePersistence(Persistence object)
      {
        return createPersistenceAdapter();
      }
      @Override
      public Adapter casePersistencePackage(PersistencePackage object)
      {
        return createPersistencePackageAdapter();
      }
      @Override
      public Adapter casePersistenceEntity(PersistenceEntity object)
      {
        return createPersistenceEntityAdapter();
      }
      @Override
      public Adapter casePersistenceProperty(PersistenceProperty object)
      {
        return createPersistencePropertyAdapter();
      }
      @Override
      public Adapter casePersistencePropertyConfig(PersistencePropertyConfig object)
      {
        return createPersistencePropertyConfigAdapter();
      }
      @Override
      public Adapter caseEntityProperty(EntityProperty object)
      {
        return createEntityPropertyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.EntityReference <em>Entity Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.EntityReference
   * @generated
   */
  public Adapter createEntityReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.Persistence <em>Persistence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.Persistence
   * @generated
   */
  public Adapter createPersistenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.PersistencePackage <em>Persistence Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePackage
   * @generated
   */
  public Adapter createPersistencePackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.PersistenceEntity <em>Persistence Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceEntity
   * @generated
   */
  public Adapter createPersistenceEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.PersistenceProperty <em>Persistence Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.PersistenceProperty
   * @generated
   */
  public Adapter createPersistencePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig <em>Persistence Property Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.PersistencePropertyConfig
   * @generated
   */
  public Adapter createPersistencePropertyConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.idobjects.dsl.idObjectsDsl.EntityProperty <em>Entity Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.idobjects.dsl.idObjectsDsl.EntityProperty
   * @generated
   */
  public Adapter createEntityPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //IdObjectsDslAdapterFactory
