/**
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.calculatorForm.impl;

import de.htwg.zeta.xtext.calculatorForm.CalculatorFormPackage;
import de.htwg.zeta.xtext.calculatorForm.FieldInput;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#isAutofocus <em>Autofocus</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#getForm <em>Form</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#isNotdisplayed <em>Notdisplayed</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.htwg.zeta.xtext.calculatorForm.impl.FieldInputImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldInputImpl extends FieldImpl implements FieldInput
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutofocus()
   * @generated
   * @ordered
   */
  protected static final boolean AUTOFOCUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutofocus() <em>Autofocus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutofocus()
   * @generated
   * @ordered
   */
  protected boolean autofocus = AUTOFOCUS_EDEFAULT;

  /**
   * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisabled()
   * @generated
   * @ordered
   */
  protected static final boolean DISABLED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisabled()
   * @generated
   * @ordered
   */
  protected boolean disabled = DISABLED_EDEFAULT;

  /**
   * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected static final String FORM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected String form = FORM_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #isNotdisplayed() <em>Notdisplayed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotdisplayed()
   * @generated
   * @ordered
   */
  protected static final boolean NOTDISPLAYED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotdisplayed() <em>Notdisplayed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotdisplayed()
   * @generated
   * @ordered
   */
  protected boolean notdisplayed = NOTDISPLAYED_EDEFAULT;

  /**
   * The default value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonly()
   * @generated
   * @ordered
   */
  protected static final boolean READONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReadonly() <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReadonly()
   * @generated
   * @ordered
   */
  protected boolean readonly = READONLY_EDEFAULT;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldInputImpl()
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
    return CalculatorFormPackage.Literals.FIELD_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutofocus()
  {
    return autofocus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutofocus(boolean newAutofocus)
  {
    boolean oldAutofocus = autofocus;
    autofocus = newAutofocus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__AUTOFOCUS, oldAutofocus, autofocus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDisabled()
  {
    return disabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisabled(boolean newDisabled)
  {
    boolean oldDisabled = disabled;
    disabled = newDisabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__DISABLED, oldDisabled, disabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getForm()
  {
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForm(String newForm)
  {
    String oldForm = form;
    form = newForm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__FORM, oldForm, form));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotdisplayed()
  {
    return notdisplayed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotdisplayed(boolean newNotdisplayed)
  {
    boolean oldNotdisplayed = notdisplayed;
    notdisplayed = newNotdisplayed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__NOTDISPLAYED, oldNotdisplayed, notdisplayed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReadonly()
  {
    return readonly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadonly(boolean newReadonly)
  {
    boolean oldReadonly = readonly;
    readonly = newReadonly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__READONLY, oldReadonly, readonly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CalculatorFormPackage.FIELD_INPUT__VALUE, oldValue, value));
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
      case CalculatorFormPackage.FIELD_INPUT__NAME:
        return getName();
      case CalculatorFormPackage.FIELD_INPUT__AUTOFOCUS:
        return isAutofocus();
      case CalculatorFormPackage.FIELD_INPUT__DISABLED:
        return isDisabled();
      case CalculatorFormPackage.FIELD_INPUT__FORM:
        return getForm();
      case CalculatorFormPackage.FIELD_INPUT__LABEL:
        return getLabel();
      case CalculatorFormPackage.FIELD_INPUT__NOTDISPLAYED:
        return isNotdisplayed();
      case CalculatorFormPackage.FIELD_INPUT__READONLY:
        return isReadonly();
      case CalculatorFormPackage.FIELD_INPUT__REQUIRED:
        return isRequired();
      case CalculatorFormPackage.FIELD_INPUT__VALUE:
        return getValue();
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
      case CalculatorFormPackage.FIELD_INPUT__NAME:
        setName((String)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__AUTOFOCUS:
        setAutofocus((Boolean)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__DISABLED:
        setDisabled((Boolean)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__FORM:
        setForm((String)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__LABEL:
        setLabel((String)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__NOTDISPLAYED:
        setNotdisplayed((Boolean)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__READONLY:
        setReadonly((Boolean)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case CalculatorFormPackage.FIELD_INPUT__VALUE:
        setValue((String)newValue);
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
      case CalculatorFormPackage.FIELD_INPUT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__AUTOFOCUS:
        setAutofocus(AUTOFOCUS_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__DISABLED:
        setDisabled(DISABLED_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__FORM:
        setForm(FORM_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__NOTDISPLAYED:
        setNotdisplayed(NOTDISPLAYED_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__READONLY:
        setReadonly(READONLY_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case CalculatorFormPackage.FIELD_INPUT__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case CalculatorFormPackage.FIELD_INPUT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CalculatorFormPackage.FIELD_INPUT__AUTOFOCUS:
        return autofocus != AUTOFOCUS_EDEFAULT;
      case CalculatorFormPackage.FIELD_INPUT__DISABLED:
        return disabled != DISABLED_EDEFAULT;
      case CalculatorFormPackage.FIELD_INPUT__FORM:
        return FORM_EDEFAULT == null ? form != null : !FORM_EDEFAULT.equals(form);
      case CalculatorFormPackage.FIELD_INPUT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case CalculatorFormPackage.FIELD_INPUT__NOTDISPLAYED:
        return notdisplayed != NOTDISPLAYED_EDEFAULT;
      case CalculatorFormPackage.FIELD_INPUT__READONLY:
        return readonly != READONLY_EDEFAULT;
      case CalculatorFormPackage.FIELD_INPUT__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case CalculatorFormPackage.FIELD_INPUT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", autofocus: ");
    result.append(autofocus);
    result.append(", disabled: ");
    result.append(disabled);
    result.append(", form: ");
    result.append(form);
    result.append(", label: ");
    result.append(label);
    result.append(", notdisplayed: ");
    result.append(notdisplayed);
    result.append(", readonly: ");
    result.append(readonly);
    result.append(", required: ");
    result.append(required);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //FieldInputImpl