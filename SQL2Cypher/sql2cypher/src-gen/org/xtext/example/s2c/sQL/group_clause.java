/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.sQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>group clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.sQL.group_clause#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.sQL.SQLPackage#getgroup_clause()
 * @model
 * @generated
 */
public interface group_clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.s2c.sQL.expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.example.s2c.sQL.SQLPackage#getgroup_clause_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpressions();

} // group_clause