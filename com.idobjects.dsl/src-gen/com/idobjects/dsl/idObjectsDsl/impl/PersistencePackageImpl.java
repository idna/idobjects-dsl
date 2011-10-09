/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.PersistenceEntity;
import com.idobjects.dsl.idObjectsDsl.PersistencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.PersistencePackageImpl#getPersistenceEntities <em>Persistence Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistencePackageImpl extends MinimalEObjectImpl.Container implements PersistencePackage
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPersistenceEntities() <em>Persistence Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistenceEntities()
   * @generated
   * @ordered
   */
  protected EList<PersistenceEntity> persistenceEntities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersistencePackageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IdObjectsDslPackage.Literals.PERSISTENCE_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.PERSISTENCE_PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PersistenceEntity> getPersistenceEntities()
  {
    if (persistenceEntities == null)
    {
      persistenceEntities = new EObjectContainmentEList<PersistenceEntity>(PersistenceEntity.class, this, IdObjectsDslPackage.PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES);
    }
    return persistenceEntities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES:
        return ((InternalEList<?>)getPersistenceEntities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__NAME:
        return getName();
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES:
        return getPersistenceEntities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__NAME:
        setName((String)newValue);
        return;
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES:
        getPersistenceEntities().clear();
        getPersistenceEntities().addAll((Collection<? extends PersistenceEntity>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES:
        getPersistenceEntities().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdObjectsDslPackage.PERSISTENCE_PACKAGE__PERSISTENCE_ENTITIES:
        return persistenceEntities != null && !persistenceEntities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PersistencePackageImpl
