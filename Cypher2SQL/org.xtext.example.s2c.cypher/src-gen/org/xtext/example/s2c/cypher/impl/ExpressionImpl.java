/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.s2c.cypher.CypherPackage;
import org.xtext.example.s2c.cypher.Expression;
import org.xtext.example.s2c.cypher.PropertyLookup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.ExpressionImpl#getPropertyLookups <em>Property Lookups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends NodeLabelsImpl implements Expression
{
  /**
   * The cached value of the '{@link #getPropertyLookups() <em>Property Lookups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyLookups()
   * @generated
   * @ordered
   */
  protected EList<PropertyLookup> propertyLookups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return CypherPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyLookup> getPropertyLookups()
  {
    if (propertyLookups == null)
    {
      propertyLookups = new EObjectContainmentEList<PropertyLookup>(PropertyLookup.class, this, CypherPackage.EXPRESSION__PROPERTY_LOOKUPS);
    }
    return propertyLookups;
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
      case CypherPackage.EXPRESSION__PROPERTY_LOOKUPS:
        return ((InternalEList<?>)getPropertyLookups()).basicRemove(otherEnd, msgs);
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
      case CypherPackage.EXPRESSION__PROPERTY_LOOKUPS:
        return getPropertyLookups();
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
      case CypherPackage.EXPRESSION__PROPERTY_LOOKUPS:
        getPropertyLookups().clear();
        getPropertyLookups().addAll((Collection<? extends PropertyLookup>)newValue);
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
      case CypherPackage.EXPRESSION__PROPERTY_LOOKUPS:
        getPropertyLookups().clear();
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
      case CypherPackage.EXPRESSION__PROPERTY_LOOKUPS:
        return propertyLookups != null && !propertyLookups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl