/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.Union#isAll <em>All</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.Union#getSingleQuery <em>Single Query</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends EObject
{
  /**
   * Returns the value of the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>All</em>' attribute.
   * @see #setAll(boolean)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getUnion_All()
   * @model
   * @generated
   */
  boolean isAll();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.Union#isAll <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All</em>' attribute.
   * @see #isAll()
   * @generated
   */
  void setAll(boolean value);

  /**
   * Returns the value of the '<em><b>Single Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Query</em>' containment reference.
   * @see #setSingleQuery(SingleQuery)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getUnion_SingleQuery()
   * @model containment="true"
   * @generated
   */
  SingleQuery getSingleQuery();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.Union#getSingleQuery <em>Single Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Query</em>' containment reference.
   * @see #getSingleQuery()
   * @generated
   */
  void setSingleQuery(SingleQuery value);

} // Union