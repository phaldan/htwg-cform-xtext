/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.Page#getChilds <em>Childs</em>}</li>
 * </ul>
 *
 * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends FormElement
{
  /**
   * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
   * The list contents are of type {@link de.htwg.zeta.xtext.calculatorForm.PageChild}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Childs</em>' containment reference list.
   * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getPage_Childs()
   * @model containment="true"
   * @generated
   */
  EList<PageChild> getChilds();

} // Page
