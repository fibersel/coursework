/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.MapLiteral#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getMapLiteral()
 * @model
 * @generated
 */
public interface MapLiteral extends Properties, Literal
{
  /**
   * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.s2c.cypher.MapLiteralEntry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entries</em>' containment reference list.
   * @see org.xtext.example.s2c.cypher.CypherPackage#getMapLiteral_Entries()
   * @model containment="true"
   * @generated
   */
  EList<MapLiteralEntry> getEntries();

} // MapLiteral