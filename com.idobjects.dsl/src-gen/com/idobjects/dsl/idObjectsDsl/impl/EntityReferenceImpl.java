/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

import com.idobjects.dsl.idObjectsDsl.Entity;
import com.idobjects.dsl.idObjectsDsl.EntityReference;
import com.idobjects.dsl.idObjectsDsl.IdObjectsDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl#getListDestination <em>List Destination</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl#getSingleDestination <em>Single Destination</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.idobjects.dsl.idObjectsDsl.impl.EntityReferenceImpl#getInverseName <em>Inverse Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityReferenceImpl extends MinimalEObjectImpl.Container implements EntityReference
{
  /**
   * The cached value of the '{@link #getListDestination() <em>List Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListDestination()
   * @generated
   * @ordered
   */
  protected Entity listDestination;

  /**
   * The cached value of the '{@link #getSingleDestination() <em>Single Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleDestination()
   * @generated
   * @ordered
   */
  protected Entity singleDestination;

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
   * The default value of the '{@link #getInverseName() <em>Inverse Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInverseName()
   * @generated
   * @ordered
   */
  protected static final String INVERSE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInverseName() <em>Inverse Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInverseName()
   * @generated
   * @ordered
   */
  protected String inverseName = INVERSE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityReferenceImpl()
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
    return IdObjectsDslPackage.Literals.ENTITY_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getListDestination()
  {
    if (listDestination != null && listDestination.eIsProxy())
    {
      InternalEObject oldListDestination = (InternalEObject)listDestination;
      listDestination = (Entity)eResolveProxy(oldListDestination);
      if (listDestination != oldListDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdObjectsDslPackage.ENTITY_REFERENCE__LIST_DESTINATION, oldListDestination, listDestination));
      }
    }
    return listDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetListDestination()
  {
    return listDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListDestination(Entity newListDestination)
  {
    Entity oldListDestination = listDestination;
    listDestination = newListDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY_REFERENCE__LIST_DESTINATION, oldListDestination, listDestination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getSingleDestination()
  {
    if (singleDestination != null && singleDestination.eIsProxy())
    {
      InternalEObject oldSingleDestination = (InternalEObject)singleDestination;
      singleDestination = (Entity)eResolveProxy(oldSingleDestination);
      if (singleDestination != oldSingleDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION, oldSingleDestination, singleDestination));
      }
    }
    return singleDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSingleDestination()
  {
    return singleDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleDestination(Entity newSingleDestination)
  {
    Entity oldSingleDestination = singleDestination;
    singleDestination = newSingleDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION, oldSingleDestination, singleDestination));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY_REFERENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInverseName()
  {
    return inverseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInverseName(String newInverseName)
  {
    String oldInverseName = inverseName;
    inverseName = newInverseName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME, oldInverseName, inverseName));
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
      case IdObjectsDslPackage.ENTITY_REFERENCE__LIST_DESTINATION:
        if (resolve) return getListDestination();
        return basicGetListDestination();
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        if (resolve) return getSingleDestination();
        return basicGetSingleDestination();
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        return getName();
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        return getInverseName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IdObjectsDslPackage.ENTITY_REFERENCE__LIST_DESTINATION:
        setListDestination((Entity)newValue);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        setSingleDestination((Entity)newValue);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        setName((String)newValue);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        setInverseName((String)newValue);
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
      case IdObjectsDslPackage.ENTITY_REFERENCE__LIST_DESTINATION:
        setListDestination((Entity)null);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        setSingleDestination((Entity)null);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        setInverseName(INVERSE_NAME_EDEFAULT);
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
      case IdObjectsDslPackage.ENTITY_REFERENCE__LIST_DESTINATION:
        return listDestination != null;
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        return singleDestination != null;
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        return INVERSE_NAME_EDEFAULT == null ? inverseName != null : !INVERSE_NAME_EDEFAULT.equals(inverseName);
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
    result.append(", inverseName: ");
    result.append(inverseName);
    result.append(')');
    return result.toString();
  }

} //EntityReferenceImpl
