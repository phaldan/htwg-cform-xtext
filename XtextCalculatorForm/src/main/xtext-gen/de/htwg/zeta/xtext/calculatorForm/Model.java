/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.Model#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
   * The list contents are of type {@link de.htwg.zeta.xtext.calculatorForm.Form}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forms</em>' containment reference list.
   * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getModel_Forms()
   * @model containment="true"
   * @generated
   */
  EList<Form> getForms();

} // Model
