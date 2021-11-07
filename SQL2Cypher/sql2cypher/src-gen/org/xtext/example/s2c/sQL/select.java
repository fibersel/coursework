/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.sQL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.sQL.select#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.example.s2c.sQL.select#getFrom_section <em>From section</em>}</li>
 *   <li>{@link org.xtext.example.s2c.sQL.select#getWhere_section <em>Where section</em>}</li>
 *   <li>{@link org.xtext.example.s2c.sQL.select#getGroup_section <em>Group section</em>}</li>
 *   <li>{@link org.xtext.example.s2c.sQL.select#getHaving_section <em>Having section</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.sQL.SQLPackage#getselect()
 * @model
 * @generated
 */
public interface select extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.s2c.sQL.expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.example.s2c.sQL.SQLPackage#getselect_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpressions();

  /**
   * Returns the value of the '<em><b>From section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From section</em>' containment reference.
   * @see #setFrom_section(fromSection)
   * @see org.xtext.example.s2c.sQL.SQLPackage#getselect_From_section()
   * @model containment="true"
   * @generated
   */
  fromSection getFrom_section();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.select#getFrom_section <em>From section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From section</em>' containment reference.
   * @see #getFrom_section()
   * @generated
   */
  void setFrom_section(fromSection value);

  /**
   * Returns the value of the '<em><b>Where section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where section</em>' containment reference.
   * @see #setWhere_section(where_clause)
   * @see org.xtext.example.s2c.sQL.SQLPackage#getselect_Where_section()
   * @model containment="true"
   * @generated
   */
  where_clause getWhere_section();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.select#getWhere_section <em>Where section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where section</em>' containment reference.
   * @see #getWhere_section()
   * @generated
   */
  void setWhere_section(where_clause value);

  /**
   * Returns the value of the '<em><b>Group section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group section</em>' containment reference.
   * @see #setGroup_section(group_clause)
   * @see org.xtext.example.s2c.sQL.SQLPackage#getselect_Group_section()
   * @model containment="true"
   * @generated
   */
  group_clause getGroup_section();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.select#getGroup_section <em>Group section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group section</em>' containment reference.
   * @see #getGroup_section()
   * @generated
   */
  void setGroup_section(group_clause value);

  /**
   * Returns the value of the '<em><b>Having section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having section</em>' containment reference.
   * @see #setHaving_section(having_clause)
   * @see org.xtext.example.s2c.sQL.SQLPackage#getselect_Having_section()
   * @model containment="true"
   * @generated
   */
  having_clause getHaving_section();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.select#getHaving_section <em>Having section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having section</em>' containment reference.
   * @see #getHaving_section()
   * @generated
   */
  void setHaving_section(having_clause value);

} // select
