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
        <div class="cform-element cform-field cform-input cform-element-«cssClass(input.name)»">
            «IF input.label != null»
            <label for="cform-element-«cssClass(input.name)»">«input.label»</label>
            «ENDIF»
            <input type="text" id="cform-element-«cssClass(input.name)»" name="«input.name»"«
                IF input.autofocus» autofocus«ENDIF»«
                IF input.disabled» disabled«ENDIF»«
                IF input.form != null» form="«input.form»"«ENDIF»«
                IF input.readonly» readonly«ENDIF»«
                IF input.required» required«ENDIF»«
                IF input.value != null» value="«input.value»"«ENDIF»«
            »>
        </div>
    '''

    override transformFieldSelect(FieldSelect select, String childs) '''
        <div class="cform-element cform-field cform-select cform-element-«cssClass(select.name)»">
            «IF select.label != null»
            <label for="cform-element-«cssClass(select.name)»">«select.label»</label>
            «ENDIF»
            <select id="cform-element-«cssClass(select.name)»" name="«select.name»"«
                IF select.autofocus» autofocus«ENDIF»«
                IF select.disabled» disabled«ENDIF»«
                IF select.form != null» form="«select.form»"«ENDIF»«
                IF select.multiple» multiple«ENDIF»«
                IF select.required» required«ENDIF»«
                IF select.size != null» size="«select.size»"«ENDIF»«
            »>
                «childs»
            </select>
        </div>
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
        <div class="cform-element cform-field cform-choice cform-radio cform-element-«cssClass(choice.name)»">
        «ELSE»
        <div class="cform-element cform-field cform-choice cform-checkbox cform-element-«cssClass(choice.name)»">
        «ENDIF»
            <label for="cform-element-«cssClass(choice.name)»-0">«choice.label»</label>
            «childs»
        </div>
    '''

    override transformFieldRadio(FieldChoice choice, FieldChoiceOption option, int index) '''
        <div class="cform-element cform-choice-option cform-radio-option">
            <input type="radio" id="cform-element-«cssClass(choice.name)»-«index»" name="«choice.name»" value="«option.value»">
            <label for="cform-element-«cssClass(choice.name)»-«index»">«option.label»</label>
        </div>
    '''

    override transformFieldCheckbox(FieldChoice choice, FieldChoiceOption option, int index) '''
        <div class="cform-element cform-choice-option cform-checkbox-option">
            <input type="checkbox" id="cform-element-«cssClass(choice.name)»-«index»" name="«choice.name»" value="«option.value»">
            <label for="cform-element-«cssClass(choice.name)»-«index»">«option.label»</label>
        </div>
    '''

    override transformFieldButtonSubmit(ButtonSubmit button) '''
        <div class="cform-element cform-button cform-button-submit cform-element-«cssClass(button.name)»">
            <button type="submit" name="«button.name»"«
            IF button.autofocus» autofocus«ENDIF»«
            IF button.disabled» disabled«ENDIF»«
            IF button.value != null» value="«button.value»"«ENDIF»«
            »>«button.text»</button>
        </div>
    '''

    override transformGroup(Group group, String fields) '''
        <fieldset class="cform-element cform-group cform-element-«cssClass(group.name)»">
            «IF group.label != null»
                <legend>«group.label»</legend>
            «ENDIF»
            «fields»
        </fieldset>
    '''

    override transformPage(Page page, String childs) '''
        <section class="cform-element cform-page">
            «childs»
        </section>
    '''
}
