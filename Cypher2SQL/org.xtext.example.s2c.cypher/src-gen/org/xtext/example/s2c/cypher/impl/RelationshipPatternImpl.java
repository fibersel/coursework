/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.s2c.cypher.CypherPackage;
import org.xtext.example.s2c.cypher.RelationshipDetail;
import org.xtext.example.s2c.cypher.RelationshipPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.RelationshipPatternImpl#isIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.RelationshipPatternImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.RelationshipPatternImpl#isOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipPatternImpl extends MinimalEObjectImpl.Container implements RelationshipPattern
{
  /**
   * The default value of the '{@link #isIncoming() <em>Incoming</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncoming()
   * @generated
   * @ordered
   */
  protected static final boolean INCOMING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncoming() <em>Incoming</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncoming()
   * @generated
   * @ordered
   */
  protected boolean incoming = INCOMING_EDEFAULT;

  /**
   * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetail()
   * @generated
   * @ordered
   */
  protected RelationshipDetail detail;

  /**
   * The default value of the '{@link #isOutgoing() <em>Outgoing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOutgoing()
   * @generated
   * @ordered
   */
  protected static final boolean OUTGOING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOutgoing() <em>Outgoing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOutgoing()
   * @generated
   * @ordered
   */
  protected boolean outgoing = OUTGOING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipPatternImpl()
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
    return CypherPackage.Literals.RELATIONSHIP_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIncoming()
  {
    return incoming;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIncoming(boolean newIncoming)
  {
    boolean oldIncoming = incoming;
    incoming = newIncoming;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.RELATIONSHIP_PATTERN__INCOMING, oldIncoming, incoming));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationshipDetail getDetail()
  {
    return detail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDetail(RelationshipDetail newDetail, NotificationChain msgs)
  {
    RelationshipDetail oldDetail = detail;
    detail = newDetail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.RELATIONSHIP_PATTERN__DETAIL, oldDetail, newDetail);
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
  public void setDetail(RelationshipDetail newDetail)
  {
    if (newDetail != detail)
    {
      NotificationChain msgs = null;
      if (detail != null)
        msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.RELATIONSHIP_PATTERN__DETAIL, null, msgs);
      if (newDetail != null)
        msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.RELATIONSHIP_PATTERN__DETAIL, null, msgs);
      msgs = basicSetDetail(newDetail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.RELATIONSHIP_PATTERN__DETAIL, newDetail, newDetail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isOutgoing()
  {
    return outgoing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOutgoing(boolean newOutgoing)
  {
    boolean oldOutgoing = outgoing;
    outgoing = newOutgoing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.RELATIONSHIP_PATTERN__OUTGOING, oldOutgoing, outgoing));
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
      case CypherPackage.RELATIONSHIP_PATTERN__DETAIL:
        return basicSetDetail(null, msgs);
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
      case CypherPackage.RELATIONSHIP_PATTERN__INCOMING:
        return isIncoming();
      case CypherPackage.RELATIONSHIP_PATTERN__DETAIL:
        return getDetail();
      case CypherPackage.RELATIONSHIP_PATTERN__OUTGOING:
        return isOutgoing();
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
      case CypherPackage.RELATIONSHIP_PATTERN__INCOMING:
        setIncoming((Boolean)newValue);
        return;
      case CypherPackage.RELATIONSHIP_PATTERN__DETAIL:
        setDetail((RelationshipDetail)newValue);
        return;
      case CypherPackage.RELATIONSHIP_PATTERN__OUTGOING:
        setOutgoing((Boolean)newValue);
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
      case CypherPackage.RELATIONSHIP_PATTERN__INCOMING:
        setIncoming(INCOMING_EDEFAULT);
        return;
      case CypherPackage.RELATIONSHIP_PATTERN__DETAIL:
        setDetail((RelationshipDetail)null);
        return;
      case CypherPackage.RELATIONSHIP_PATTERN__OUTGOING:
        setOutgoing(OUTGOING_EDEFAULT);
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
      case CypherPackage.RELATIONSHIP_PATTERN__INCOMING:
        return incoming != INCOMING_EDEFAULT;
      case CypherPackage.RELATIONSHIP_PATTERN__DETAIL:
        return detail != null;
      case CypherPackage.RELATIONSHIP_PATTERN__OUTGOING:
        return outgoing != OUTGOING_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (incoming: ");
    result.append(incoming);
    result.append(", outgoing: ");
    result.append(outgoing);
    result.append(')');
    return result.toString();
  }

} //RelationshipPatternImpl