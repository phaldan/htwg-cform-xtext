package de.htwg.zeta.xtext.generator

import de.htwg.zeta.xtext.calculatorForm.FormElement
import java.util.List
import de.htwg.zeta.xtext.calculatorForm.Field
import de.htwg.zeta.xtext.calculatorForm.Group
import de.htwg.zeta.xtext.calculatorForm.Page
import de.htwg.zeta.xtext.calculatorForm.Button
import de.htwg.zeta.xtext.calculatorForm.FieldInput
import de.htwg.zeta.xtext.calculatorForm.FieldSelect
import de.htwg.zeta.xtext.calculatorForm.FieldChoice
import de.htwg.zeta.xtext.calculatorForm.PageChild
import de.htwg.zeta.xtext.calculatorForm.ButtonSubmit
import de.htwg.zeta.xtext.calculatorForm.FieldOption
import de.htwg.zeta.xtext.calculatorForm.FieldSelectChild
import de.htwg.zeta.xtext.calculatorForm.FieldOptionGroup
import de.htwg.zeta.xtext.calculatorForm.FieldChoiceOption

/**
 * Abstract generator for html
 */
abstract class FormTransformer {

    def String transform(List<FormElement> elements) '''
        «FOR element: elements»
            «processFormElement(element)»
        «ENDFOR»
    '''

    private def String processFormElement(FormElement element) {
        if (element instanceof Field) {
            processField(element)
        } else if (element instanceof Group) {
            processGroup(element)
        } else if (element instanceof Page) {
            processPage(element)
        } else {
            throw new UnsupportedOperationException("Unknown FormElement: " + element.getClass.getName)
        }
    }

    private def String processField(Field field) {
        if (field instanceof FieldInput) {
            transformFieldInput(field)
        } else if (field instanceof FieldChoice) {
            processFieldChoice(field)
        } else if (field instanceof FieldSelect) {
            processFieldSelect(field)
        } else if (field instanceof Button) {
            processFieldButton(field)
        } else {
            throw new UnsupportedOperationException("Unknown FieldType: " + field.getClass.getName)
        }
    }

    private def String processFieldChoice(FieldChoice choice) {
        val childs = processFieldChoiceOptions(choice)
        transformFieldChoice(choice, childs)
    }

    private def String processFieldChoiceOptions(FieldChoice choice) {
        var int index = 0
        '''
            «FOR option: choice.options»
                «IF choice.multiple»
                    «transformFieldCheckbox(choice, option, index++)»
                «ELSE»
                    «transformFieldRadio(choice, option, index++)»
                «ENDIF»
            «ENDFOR»
        '''
    }

    private def String processFieldSelect(FieldSelect select) {
        val childs = processFieldSelectChilds(select)
        transformFieldSelect(select, childs)
    }

    private def String processFieldSelectChilds(FieldSelect select) '''
        «FOR child: select.childs»
            «processFieldSelectChild(child)»
        «ENDFOR»
    '''

    private def String processFieldSelectChild(FieldSelectChild child) {
        if (child instanceof FieldOptionGroup) {
            processFieldOptionGroup(child)
        } else if (child instanceof FieldOption) {
            transformFieldOption(child)
        } else {
            throw new UnsupportedOperationException("Unknown FieldSelectChild: " + child.getClass.getName)
        }
    }

    private def String processFieldOptionGroup(FieldOptionGroup group) {
        val options = processFieldOptions(group)
        transformFieldOptionGroup(group, options)
    }

    private def String processFieldOptions(FieldOptionGroup group) '''
        «FOR option: group.options»
            «transformFieldOption(option)»
        «ENDFOR»
    '''

    private def String processFieldButton(Button button) {
        if (button instanceof ButtonSubmit) {
            transformFieldButtonSubmit(button)
        } else {
            throw new UnsupportedOperationException("Unknown Button: " + button.getClass.getName)
        }
    }

    private def String processGroup(Group group) {
        val fields = processFields(group.fields)
        transformGroup(group, fields)
    }


    private def String processFields(List<Field> fields) '''
        «FOR field: fields»
            «processField(field)»
        «ENDFOR»
    '''

    private def String processPage(Page page) {
        val childs = processPageChilds(page)
        transformPage(page, childs)
    }

    private def String processPageChilds(Page page) '''
        «FOR child: page.childs»
            «processPageChild(child)»
        «ENDFOR»
    '''

    private def String processPageChild(PageChild child) {
        if (child instanceof Group) {
            processGroup(child)
        } else if (child instanceof Field) {
            processField(child)
        } else {
            throw new UnsupportedOperationException("Unknown PageChild: " + child.getClass.getName)
        }
    }

    protected def String transformFieldInput(FieldInput input)

    protected def String transformFieldChoice(FieldChoice choice, String childs)

    protected def String transformFieldRadio(FieldChoice choice, FieldChoiceOption option, int index)

    protected def String transformFieldCheckbox(FieldChoice choice, FieldChoiceOption option, int index)

    protected def String transformFieldSelect(FieldSelect select, String childs)

    protected def String transformFieldOptionGroup(FieldOptionGroup group, String options)

    protected def String transformFieldOption(FieldOption option)

    protected def String transformFieldButtonSubmit(ButtonSubmit button)

    protected def String transformGroup(Group group, String fields)

    protected def String transformPage(Page page, String childs)
}