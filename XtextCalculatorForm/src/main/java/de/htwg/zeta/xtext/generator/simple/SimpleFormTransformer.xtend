package de.htwg.zeta.xtext.generator.simple

import de.htwg.zeta.xtext.calculatorForm.ButtonSubmit
import de.htwg.zeta.xtext.calculatorForm.FieldChoice
import de.htwg.zeta.xtext.calculatorForm.FieldChoiceOption
import de.htwg.zeta.xtext.calculatorForm.FieldInput
import de.htwg.zeta.xtext.calculatorForm.FieldOption
import de.htwg.zeta.xtext.calculatorForm.FieldOptionGroup
import de.htwg.zeta.xtext.calculatorForm.FieldSelect
import de.htwg.zeta.xtext.calculatorForm.Group
import de.htwg.zeta.xtext.calculatorForm.Page
import de.htwg.zeta.xtext.generator.FormTransformer

/**
 * Create a html with basic html.
 */
class SimpleFormTransformer extends FormTransformer {

    private def String cssClass(String name) {
        name.replace('_', '-').toLowerCase
    }

    override transformFieldInput(FieldInput input) '''
        <label class="cform-element cform-element-«cssClass(input.name)»">
            «IF input.label != null»
            <span class="cform-label">«input.label»</span>
            «ENDIF»
            <input type="text" name="«input.name»" class="cform-field cform-input"«
                IF input.autofocus» autofocus«ENDIF»«
                IF input.disabled» disabled«ENDIF»«
                IF input.form != null» form="«input.form»"«ENDIF»«
                IF input.readonly» readonly«ENDIF»«
                IF input.required» required«ENDIF»«
                IF input.value != null» value="«input.value»"«ENDIF»«
            »>
        </label>
    '''

    override transformFieldSelect(FieldSelect select, String childs) '''
        <label class="cform-element cform-element-«cssClass(select.name)»">
            «IF select.label != null»
            <span class="cform-label">«select.label»</span>
            «ENDIF»
            <select name="«select.name»" class="cform-field cform-select"«
                IF select.autofocus» autofocus«ENDIF»«
                IF select.disabled» disabled«ENDIF»«
                IF select.form != null» form="«select.form»"«ENDIF»«
                IF select.multiple» multiple«ENDIF»«
                IF select.required» required«ENDIF»«
                IF select.size != null» size="«select.size»"«ENDIF»«
            »>
                «childs»
            </select>
        </label>
    '''

    override transformFieldOptionGroup(FieldOptionGroup group, String options) '''
        <optgroup«
            IF group.label != null» value="«group.label»"«ENDIF»«
            IF group.disabled» disabled«ENDIF»«
        »>«options»</optgroup>
    '''

    override transformFieldOption(FieldOption option) '''
        <option«
            IF option.value != null» value="«option.value»"«ENDIF»«
            IF option.selected» selected«ENDIF»«
        »>«option.text»</option>
    '''

    override transformFieldChoice(FieldChoice choice, String childs) '''
        «IF choice.multiple»
        <div class="cform-element cform-element-«cssClass(choice.name)»">
        «ELSE»
        <div class="cform-element cform-element-«cssClass(choice.name)»">
        «ENDIF»
            <span class="cform-label">«choice.label»</span>
            «childs»
        </div>
    '''

    override transformFieldRadio(FieldChoice choice, FieldChoiceOption option, int index) '''
        <label class="cform-element">
            <input type="radio" name="«choice.name»" value="«option.value»" class="cform-field cform-choice-option cform-radio-option"«
                IF option.checked» checked«ENDIF»«
            »>
            <span class="cform-label">«option.label»</span>
        </label>
    '''

    override transformFieldCheckbox(FieldChoice choice, FieldChoiceOption option, int index) '''
        <label class="cform-element">
            <input type="checkbox" name="«choice.name»" value="«option.value»" class="cform-field cform-choice-option cform-checkbox-option"«
                IF option.checked» checked«ENDIF»«
            »>
            <span class="cform-label">«option.label»</span>
        </label>
    '''

    override transformFieldButtonSubmit(ButtonSubmit button) '''
        <div class="cform-element cform-element-«cssClass(button.name)»">
            <button type="submit" name="«button.name»" class="cform-button cform-button-submit"«
            IF button.autofocus» autofocus«ENDIF»«
            IF button.disabled» disabled«ENDIF»«
            IF button.value != null» value="«button.value»"«ENDIF»«
            »>«button.text»</button>
        </div>
    '''

    override transformGroup(Group group, String fields) '''
        <fieldset class="cform-group cform-group-«cssClass(group.name)»">
            «IF group.label != null»
                <legend>«group.label»</legend>
            «ENDIF»
            «fields»
        </fieldset>
    '''

    override transformPage(Page page, String childs) '''
        <section class="cform-page">
            «childs»
        </section>
    '''
}
