/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.FieldOption#getText <em>Text</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.FieldOption#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.FieldOption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getFieldOption()
 * @model
 * @generated
 */
public interface FieldOption extends FieldSelectChild
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getFieldOption_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link de.htwg.zeta.xtext.calculatorForm.FieldOption#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Selected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected</em>' attribute.
   * @see #setSelected(boolean)
   * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getFieldOption_Selected()
   * @model
   * @generated
   */
  boolean isSelected();

  /**
   * Sets the value of the '{@link de.htwg.zeta.xtext.calculatorForm.FieldOption#isSelected <em>Selected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected</em>' attribute.
   * @see #isSelected()
   * @generated
   */
  void setSelected(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage#getFieldOption_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.htwg.zeta.xtext.calculatorForm.FieldOption#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // FieldOption