/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.sQL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.s2c.sQL.BoolExpression;
import org.xtext.example.s2c.sQL.SQLPackage;
import org.xtext.example.s2c.sQL.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.sQL.impl.WhereClauseImpl#getBoolExpression <em>Bool Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereClauseImpl extends MinimalEObjectImpl.Container implements WhereClause
{
  /**
   * The cached value of the '{@link #getBoolExpression() <em>Bool Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolExpression()
   * @generated
   * @ordered
   */
  protected BoolExpression boolExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhereClauseImpl()
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
    return SQLPackage.Literals.WHERE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolExpression getBoolExpression()
  {
    return boolExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoolExpression(BoolExpression newBoolExpression, NotificationChain msgs)
  {
    BoolExpression oldBoolExpression = boolExpression;
    boolExpression = newBoolExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION, oldBoolExpression, newBoolExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolExpression(BoolExpression newBoolExpression)
  {
    if (newBoolExpression != boolExpression)
    {
      NotificationChain msgs = null;
      if (boolExpression != null)
        msgs = ((InternalEObject)boolExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION, null, msgs);
      if (newBoolExpression != null)
        msgs = ((InternalEObject)newBoolExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION, null, msgs);
      msgs = basicSetBoolExpression(newBoolExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION, newBoolExpression, newBoolExpression));
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
      case SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION:
        return basicSetBoolExpression(null, msgs);
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
      case SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION:
        return getBoolExpression();
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
      case SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION:
        setBoolExpression((BoolExpression)newValue);
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
      case SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION:
        setBoolExpression((BoolExpression)null);
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
      case SQLPackage.WHERE_CLAUSE__BOOL_EXPRESSION:
        return boolExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //WhereClauseImpl
