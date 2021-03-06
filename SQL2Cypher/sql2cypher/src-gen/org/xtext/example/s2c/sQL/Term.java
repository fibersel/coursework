/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.sQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.sQL.Term#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.xtext.example.s2c.sQL.Term#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.sQL.SQLPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Factor)
   * @see org.xtext.example.s2c.sQL.SQLPackage#getTerm_Lhs()
   * @model containment="true"
   * @generated
   */
  Factor getLhs();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.Term#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Factor value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Factor)
   * @see org.xtext.example.s2c.sQL.SQLPackage#getTerm_Rhs()
   * @model containment="true"
   * @generated
   */
  Factor getRhs();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.Term#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Factor value);

} // Term
