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

import org.xtext.example.s2c.sQL.Binary;
import org.xtext.example.s2c.sQL.Factor;
import org.xtext.example.s2c.sQL.SQLPackage;
import org.xtext.example.s2c.sQL.boolExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.sQL.impl.FactorImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.xtext.example.s2c.sQL.impl.FactorImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.s2c.sQL.impl.FactorImpl#getBinexp <em>Binexp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactorImpl extends MinimalEObjectImpl.Container implements Factor
{
  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected Factor factor;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected boolExpression expr;

  /**
   * The cached value of the '{@link #getBinexp() <em>Binexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinexp()
   * @generated
   * @ordered
   */
  protected Binary binexp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactorImpl()
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
    return SQLPackage.Literals.FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Factor getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactor(Factor newFactor, NotificationChain msgs)
  {
    Factor oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLPackage.FACTOR__FACTOR, oldFactor, newFactor);
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
  public void setFactor(Factor newFactor)
  {
    if (newFactor != factor)
    {
      NotificationChain msgs = null;
      if (factor != null)
        msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLPackage.FACTOR__FACTOR, null, msgs);
      if (newFactor != null)
        msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLPackage.FACTOR__FACTOR, null, msgs);
      msgs = basicSetFactor(newFactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.FACTOR__FACTOR, newFactor, newFactor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(boolExpression newExpr, NotificationChain msgs)
  {
    boolExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLPackage.FACTOR__EXPR, oldExpr, newExpr);
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
  public void setExpr(boolExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLPackage.FACTOR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLPackage.FACTOR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.FACTOR__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Binary getBinexp()
  {
    return binexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinexp(Binary newBinexp, NotificationChain msgs)
  {
    Binary oldBinexp = binexp;
    binexp = newBinexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLPackage.FACTOR__BINEXP, oldBinexp, newBinexp);
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
  public void setBinexp(Binary newBinexp)
  {
    if (newBinexp != binexp)
    {
      NotificationChain msgs = null;
      if (binexp != null)
        msgs = ((InternalEObject)binexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLPackage.FACTOR__BINEXP, null, msgs);
      if (newBinexp != null)
        msgs = ((InternalEObject)newBinexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SQLPackage.FACTOR__BINEXP, null, msgs);
      msgs = basicSetBinexp(newBinexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SQLPackage.FACTOR__BINEXP, newBinexp, newBinexp));
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
      case SQLPackage.FACTOR__FACTOR:
        return basicSetFactor(null, msgs);
      case SQLPackage.FACTOR__EXPR:
        return basicSetExpr(null, msgs);
      case SQLPackage.FACTOR__BINEXP:
        return basicSetBinexp(null, msgs);
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
      case SQLPackage.FACTOR__FACTOR:
        return getFactor();
      case SQLPackage.FACTOR__EXPR:
        return getExpr();
      case SQLPackage.FACTOR__BINEXP:
        return getBinexp();
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
      case SQLPackage.FACTOR__FACTOR:
        setFactor((Factor)newValue);
        return;
      case SQLPackage.FACTOR__EXPR:
        setExpr((boolExpression)newValue);
        return;
      case SQLPackage.FACTOR__BINEXP:
        setBinexp((Binary)newValue);
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
      case SQLPackage.FACTOR__FACTOR:
        setFactor((Factor)null);
        return;
      case SQLPackage.FACTOR__EXPR:
        setExpr((boolExpression)null);
        return;
      case SQLPackage.FACTOR__BINEXP:
        setBinexp((Binary)null);
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
      case SQLPackage.FACTOR__FACTOR:
        return factor != null;
      case SQLPackage.FACTOR__EXPR:
        return expr != null;
      case SQLPackage.FACTOR__BINEXP:
        return binexp != null;
    }
    return super.eIsSet(featureID);
  }

} //FactorImpl
