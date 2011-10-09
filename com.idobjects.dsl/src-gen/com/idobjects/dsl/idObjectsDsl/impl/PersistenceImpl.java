/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.Persistence;
import com.idobjects.dsl.idObjectsDsl.PersistencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.PersistenceImpl#getPersistencePackage <em>Persistence Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceImpl extends MinimalEObjectImpl.Container implements Persistence
{
  /**
   * The cached value of the '{@link #getPersistencePackage() <em>Persistence Package</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistencePackage()
   * @generated
   * @ordered
   */
  protected EList<PersistencePackage> persistencePackage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersistenceImpl()
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
    return IdObjectsDslPackage.Literals.PERSISTENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PersistencePackage> getPersistencePackage()
  {
    if (persistencePackage == null)
    {
      persistencePackage = new EObjectContainmentEList<PersistencePackage>(PersistencePackage.class, this, IdObjectsDslPackage.PERSISTENCE__PERSISTENCE_PACKAGE);
    }
    return persistencePackage;
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
      case IdObjectsDslPackage.PERSISTENCE__PERSISTENCE_PACKAGE:
        return ((InternalEList<?>)getPersistencePackage()).basicRemove(otherEnd, msgs);
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
      case IdObjectsDslPackage.PERSISTENCE__PERSISTENCE_PACKAGE:
        return getPersistencePackage();
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
      case IdObjectsDslPackage.PERSISTENCE__PERSISTENCE_PACKAGE:
        getPersistencePackage().clear();
        getPersistencePackage().addAll((Collection<? extends PersistencePackage>)newValue);
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
      case IdObjectsDslPackage.PERSISTENCE__PERSISTENCE_PACKAGE:
        getPersistencePackage().clear();
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
      case IdObjectsDslPackage.PERSISTENCE__PERSISTENCE_PACKAGE:
        return persistencePackage != null && !persistencePackage.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PersistenceImpl
