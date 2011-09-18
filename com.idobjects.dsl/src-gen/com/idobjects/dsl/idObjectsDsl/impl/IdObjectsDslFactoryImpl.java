/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.AbstractReference;
import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.EntityReference;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslFactory;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.Model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdObjectsDslFactoryImpl extends EFactoryImpl implements IdObjectsDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IdObjectsDslFactory init()
  {
    try
    {
      IdObjectsDslFactory theIdObjectsDslFactory = (IdObjectsDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.idobjects.com/IdObjectsDsl"); 
      if (theIdObjectsDslFactory != null)
      {
        return theIdObjectsDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IdObjectsDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdObjectsDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case IdObjectsDslPackage.MODEL: return createModel();
      case IdObjectsDslPackage.PACKAGE: return createPackage();
      case IdObjectsDslPackage.ENTITY: return createEntity();
      case IdObjectsDslPackage.ENTITY_REFERENCE: return createEntityReference();
      case IdObjectsDslPackage.ABSTRACT_REFERENCE: return createAbstractReference();
      case IdObjectsDslPackage.ENTITY_PROPERTY: return createEntityProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.idobjects.dsl.idObjectsDsl.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityReference createEntityReference()
  {
    EntityReferenceImpl entityReference = new EntityReferenceImpl();
    return entityReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractReference createAbstractReference()
  {
    AbstractReferenceImpl abstractReference = new AbstractReferenceImpl();
    return abstractReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityProperty createEntityProperty()
  {
    EntityPropertyImpl entityProperty = new EntityPropertyImpl();
    return entityProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdObjectsDslPackage getIdObjectsDslPackage()
  {
    return (IdObjectsDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IdObjectsDslPackage getPackage()
  {
    return IdObjectsDslPackage.eINSTANCE;
  }

} //IdObjectsDslFactoryImpl
