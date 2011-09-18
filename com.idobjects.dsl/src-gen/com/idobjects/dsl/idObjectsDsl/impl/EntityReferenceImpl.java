/**
 * <copyright>
 * </copyright>
 *
 */
package com.idobjects.dsl.idObjectsDsl.impl;

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
   * The default value of the '{@link #getListDestination() <em>List Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListDestination()
   * @generated
   * @ordered
   */
  protected static final String LIST_DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getListDestination() <em>List Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListDestination()
   * @generated
   * @ordered
   */
  protected String listDestination = LIST_DESTINATION_EDEFAULT;

  /**
   * The default value of the '{@link #getSingleDestination() <em>Single Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleDestination()
   * @generated
   * @ordered
   */
  protected static final String SINGLE_DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSingleDestination() <em>Single Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleDestination()
   * @generated
   * @ordered
   */
  protected String singleDestination = SINGLE_DESTINATION_EDEFAULT;

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
   * The cached value of the '{@link #getInverseName() <em>Inverse Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInverseName()
   * @generated
   * @ordered
   */
  protected EntityReference inverseName;

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
  public String getListDestination()
  {
    return listDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListDestination(String newListDestination)
  {
    String oldListDestination = listDestination;
    listDestination = newListDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IdObjectsDslPackage.ENTITY_REFERENCE__LIST_DESTINATION, oldListDestination, listDestination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSingleDestination()
  {
    return singleDestination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleDestination(String newSingleDestination)
  {
    String oldSingleDestination = singleDestination;
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
  public EntityReference getInverseName()
  {
    if (inverseName != null && inverseName.eIsProxy())
    {
      InternalEObject oldInverseName = (InternalEObject)inverseName;
      inverseName = (EntityReference)eResolveProxy(oldInverseName);
      if (inverseName != oldInverseName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME, oldInverseName, inverseName));
      }
    }
    return inverseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityReference basicGetInverseName()
  {
    return inverseName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInverseName(EntityReference newInverseName)
  {
    EntityReference oldInverseName = inverseName;
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
        return getListDestination();
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        return getSingleDestination();
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        return getName();
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        if (resolve) return getInverseName();
        return basicGetInverseName();
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
        setListDestination((String)newValue);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        setSingleDestination((String)newValue);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        setName((String)newValue);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        setInverseName((EntityReference)newValue);
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
        setListDestination(LIST_DESTINATION_EDEFAULT);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        setSingleDestination(SINGLE_DESTINATION_EDEFAULT);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        setInverseName((EntityReference)null);
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
        return LIST_DESTINATION_EDEFAULT == null ? listDestination != null : !LIST_DESTINATION_EDEFAULT.equals(listDestination);
      case IdObjectsDslPackage.ENTITY_REFERENCE__SINGLE_DESTINATION:
        return SINGLE_DESTINATION_EDEFAULT == null ? singleDestination != null : !SINGLE_DESTINATION_EDEFAULT.equals(singleDestination);
      case IdObjectsDslPackage.ENTITY_REFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IdObjectsDslPackage.ENTITY_REFERENCE__INVERSE_NAME:
        return inverseName != null;
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
    result.append(" (listDestination: ");
    result.append(listDestination);
    result.append(", singleDestination: ");
    result.append(singleDestination);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityReferenceImpl
