/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.StartPoint#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.StartPoint#getLookup <em>Lookup</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getStartPoint()
 * @model
 * @generated
 */
public interface StartPoint extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getStartPoint_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.StartPoint#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Lookup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lookup</em>' containment reference.
   * @see #setLookup(Lookup)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getStartPoint_Lookup()
   * @model containment="true"
   * @generated
   */
  Lookup getLookup();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.StartPoint#getLookup <em>Lookup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lookup</em>' containment reference.
   * @see #getLookup()
   * @generated
   */
  void setLookup(Lookup value);

} // StartPoint