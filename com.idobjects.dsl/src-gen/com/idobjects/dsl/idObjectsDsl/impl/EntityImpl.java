/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityProperty;
import com.idobjects.dsl.idObjectsDsl.EntityReference;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
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
   * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperEntity()
   * @generated
   * @ordered
   */
  protected Entity superEntity;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<EntityProperty> properties;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<EntityReference> references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return IdObjectsDslPackage.Literals.ENTITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getSuperEntity()
  {
    if (superEntity != null && superEntity.eIsProxy())
    {
      InternalEObject oldSuperEntity = (InternalEObject)superEntity;
      superEntity = (Entity)eResolveProxy(oldSuperEntity);
      if (superEntity != oldSuperEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdObjectsDslPackage.ENTITY__SUPER_ENTITY, oldSuperEntity, superEntity));
      }
    }
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSuperEntity()
  {
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperEntity(Entity newSuperEntity)
  {
    Entity oldSuperEntity = superEntity;
    superEntity = newSuperEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY__SUPER_ENTITY, oldSuperEntity, superEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<EntityProperty>(EntityProperty.class, this, IdObjectsDslPackage.ENTITY__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityReference> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<EntityReference>(EntityReference.class, this, IdObjectsDslPackage.ENTITY__REFERENCES);
    }
    return references;
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
      case IdObjectsDslPackage.ENTITY__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case IdObjectsDslPackage.ENTITY__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
      case IdObjectsDslPackage.ENTITY__NAME:
        return getName();
      case IdObjectsDslPackage.ENTITY__SUPER_ENTITY:
        if (resolve) return getSuperEntity();
        return basicGetSuperEntity();
      case IdObjectsDslPackage.ENTITY__PROPERTIES:
        return getProperties();
      case IdObjectsDslPackage.ENTITY__REFERENCES:
        return getReferences();
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
      case IdObjectsDslPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case IdObjectsDslPackage.ENTITY__SUPER_ENTITY:
        setSuperEntity((Entity)newValue);
        return;
      case IdObjectsDslPackage.ENTITY__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends EntityProperty>)newValue);
        return;
      case IdObjectsDslPackage.ENTITY__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends EntityReference>)newValue);
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
      case IdObjectsDslPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdObjectsDslPackage.ENTITY__SUPER_ENTITY:
        setSuperEntity((Entity)null);
        return;
      case IdObjectsDslPackage.ENTITY__PROPERTIES:
        getProperties().clear();
        return;
      case IdObjectsDslPackage.ENTITY__REFERENCES:
        getReferences().clear();
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
      case IdObjectsDslPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdObjectsDslPackage.ENTITY__SUPER_ENTITY:
        return superEntity != null;
      case IdObjectsDslPackage.ENTITY__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case IdObjectsDslPackage.ENTITY__REFERENCES:
        return references != null && !references.isEmpty();
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

} //EntityImpl
