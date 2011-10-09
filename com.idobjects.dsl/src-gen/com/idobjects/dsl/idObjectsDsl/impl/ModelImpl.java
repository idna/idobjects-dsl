/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;
import com.idobjects.dsl.idObjectsDsl.Model;
import com.idobjects.dsl.idObjectsDsl.Persistence;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.ModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.ModelImpl#getPersistenceModel <em>Persistence Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<com.idobjects.dsl.idObjectsDsl.Package> packages;

  /**
   * The cached value of the '{@link #getPersistenceModel() <em>Persistence Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistenceModel()
   * @generated
   * @ordered
   */
  protected Persistence persistenceModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return IdObjectsDslPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.idobjects.dsl.idObjectsDsl.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<com.idobjects.dsl.idObjectsDsl.Package>(com.idobjects.dsl.idObjectsDsl.Package.class, this, IdObjectsDslPackage.MODEL__PACKAGES);
    }
    return packages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Persistence getPersistenceModel()
  {
    return persistenceModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPersistenceModel(Persistence newPersistenceModel, NotificationChain msgs)
  {
    Persistence oldPersistenceModel = persistenceModel;
    persistenceModel = newPersistenceModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL, oldPersistenceModel, newPersistenceModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersistenceModel(Persistence newPersistenceModel)
  {
    if (newPersistenceModel != persistenceModel)
    {
      NotificationChain msgs = null;
      if (persistenceModel != null)
        msgs = ((InternalEObject)persistenceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL, null, msgs);
      if (newPersistenceModel != null)
        msgs = ((InternalEObject)newPersistenceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL, null, msgs);
      msgs = basicSetPersistenceModel(newPersistenceModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL, newPersistenceModel, newPersistenceModel));
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
      case IdObjectsDslPackage.MODEL__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
      case IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL:
        return basicSetPersistenceModel(null, msgs);
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
      case IdObjectsDslPackage.MODEL__NAME:
        return getName();
      case IdObjectsDslPackage.MODEL__PACKAGES:
        return getPackages();
      case IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL:
        return getPersistenceModel();
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
      case IdObjectsDslPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case IdObjectsDslPackage.MODEL__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends com.idobjects.dsl.idObjectsDsl.Package>)newValue);
        return;
      case IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL:
        setPersistenceModel((Persistence)newValue);
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
      case IdObjectsDslPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdObjectsDslPackage.MODEL__PACKAGES:
        getPackages().clear();
        return;
      case IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL:
        setPersistenceModel((Persistence)null);
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
      case IdObjectsDslPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdObjectsDslPackage.MODEL__PACKAGES:
        return packages != null && !packages.isEmpty();
      case IdObjectsDslPackage.MODEL__PERSISTENCE_MODEL:
        return persistenceModel != null;
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

} //ModelImpl
