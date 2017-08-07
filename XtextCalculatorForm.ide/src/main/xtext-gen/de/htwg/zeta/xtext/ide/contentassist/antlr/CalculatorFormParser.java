/*
 * generated by Xtext 2.9.2
 */
package de.htwg.zeta.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.htwg.zeta.xtext.ide.contentassist.antlr.internal.InternalCalculatorFormParser;
import de.htwg.zeta.xtext.services.CalculatorFormGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class CalculatorFormParser extends AbstractContentAssistParser {

	@Inject
	private CalculatorFormGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCalculatorFormParser createParser() {
		InternalCalculatorFormParser result = new InternalCalculatorFormParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFormElementAccess().getAlternatives(), "rule__FormElement__Alternatives");
					put(grammarAccess.getFieldAccess().getAlternatives(), "rule__Field__Alternatives");
					put(grammarAccess.getFieldSelectChildAccess().getAlternatives(), "rule__FieldSelectChild__Alternatives");
					put(grammarAccess.getPageChildAccess().getAlternatives(), "rule__PageChild__Alternatives");
					put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0(), "rule__Multiplication__Alternatives_1_0");
					put(grammarAccess.getPrefixedAccess().getAlternatives(), "rule__Prefixed__Alternatives");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getFormAccess().getGroup(), "rule__Form__Group__0");
					put(grammarAccess.getFieldInputAccess().getGroup(), "rule__FieldInput__Group__0");
					put(grammarAccess.getFieldInputAccess().getGroup_4(), "rule__FieldInput__Group_4__0");
					put(grammarAccess.getFieldInputAccess().getGroup_5(), "rule__FieldInput__Group_5__0");
					put(grammarAccess.getFieldInputAccess().getGroup_9(), "rule__FieldInput__Group_9__0");
					put(grammarAccess.getFieldSelectAccess().getGroup(), "rule__FieldSelect__Group__0");
					put(grammarAccess.getFieldSelectAccess().getGroup_4(), "rule__FieldSelect__Group_4__0");
					put(grammarAccess.getFieldSelectAccess().getGroup_5(), "rule__FieldSelect__Group_5__0");
					put(grammarAccess.getFieldSelectAccess().getGroup_8(), "rule__FieldSelect__Group_8__0");
					put(grammarAccess.getFieldOptionAccess().getGroup(), "rule__FieldOption__Group__0");
					put(grammarAccess.getFieldOptionAccess().getGroup_4(), "rule__FieldOption__Group_4__0");
					put(grammarAccess.getFieldOptionAccess().getGroup_5(), "rule__FieldOption__Group_5__0");
					put(grammarAccess.getFieldOptionGroupAccess().getGroup(), "rule__FieldOptionGroup__Group__0");
					put(grammarAccess.getFieldOptionGroupAccess().getGroup_2(), "rule__FieldOptionGroup__Group_2__0");
					put(grammarAccess.getFieldChoiceAccess().getGroup(), "rule__FieldChoice__Group__0");
					put(grammarAccess.getFieldChoiceAccess().getGroup_5(), "rule__FieldChoice__Group_5__0");
					put(grammarAccess.getFieldChoiceAccess().getGroup_6(), "rule__FieldChoice__Group_6__0");
					put(grammarAccess.getFieldChoiceAccess().getGroup_11(), "rule__FieldChoice__Group_11__0");
					put(grammarAccess.getFieldChoiceAccess().getGroup_12(), "rule__FieldChoice__Group_12__0");
					put(grammarAccess.getFieldChoiceOptionAccess().getGroup(), "rule__FieldChoiceOption__Group__0");
					put(grammarAccess.getFieldChoiceOptionAccess().getGroup_7(), "rule__FieldChoiceOption__Group_7__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_2(), "rule__Group__Group_2__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getButtonSubmitAccess().getGroup(), "rule__ButtonSubmit__Group__0");
					put(grammarAccess.getButtonSubmitAccess().getGroup_5(), "rule__ButtonSubmit__Group_5__0");
					put(grammarAccess.getCalculateAccess().getGroup(), "rule__Calculate__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0(), "rule__Multiplication__Group_1_0_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0_1(), "rule__Multiplication__Group_1_0_1__0");
					put(grammarAccess.getPrefixedAccess().getGroup_0(), "rule__Prefixed__Group_0__0");
					put(grammarAccess.getPrefixedAccess().getGroup_1(), "rule__Prefixed__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
					put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
					put(grammarAccess.getModelAccess().getFormsAssignment(), "rule__Model__FormsAssignment");
					put(grammarAccess.getFormAccess().getNameAssignment_1(), "rule__Form__NameAssignment_1");
					put(grammarAccess.getFormAccess().getFormElementsAssignment_3(), "rule__Form__FormElementsAssignment_3");
					put(grammarAccess.getFormAccess().getCalculationsAssignment_4(), "rule__Form__CalculationsAssignment_4");
					put(grammarAccess.getFieldInputAccess().getNameAssignment_1(), "rule__FieldInput__NameAssignment_1");
					put(grammarAccess.getFieldInputAccess().getAutofocusAssignment_2(), "rule__FieldInput__AutofocusAssignment_2");
					put(grammarAccess.getFieldInputAccess().getDisabledAssignment_3(), "rule__FieldInput__DisabledAssignment_3");
					put(grammarAccess.getFieldInputAccess().getFormAssignment_4_1(), "rule__FieldInput__FormAssignment_4_1");
					put(grammarAccess.getFieldInputAccess().getLabelAssignment_5_1(), "rule__FieldInput__LabelAssignment_5_1");
					put(grammarAccess.getFieldInputAccess().getNotdisplayedAssignment_6(), "rule__FieldInput__NotdisplayedAssignment_6");
					put(grammarAccess.getFieldInputAccess().getReadonlyAssignment_7(), "rule__FieldInput__ReadonlyAssignment_7");
					put(grammarAccess.getFieldInputAccess().getRequiredAssignment_8(), "rule__FieldInput__RequiredAssignment_8");
					put(grammarAccess.getFieldInputAccess().getValueAssignment_9_1(), "rule__FieldInput__ValueAssignment_9_1");
					put(grammarAccess.getFieldSelectAccess().getNameAssignment_1(), "rule__FieldSelect__NameAssignment_1");
					put(grammarAccess.getFieldSelectAccess().getAutofocusAssignment_2(), "rule__FieldSelect__AutofocusAssignment_2");
					put(grammarAccess.getFieldSelectAccess().getDisabledAssignment_3(), "rule__FieldSelect__DisabledAssignment_3");
					put(grammarAccess.getFieldSelectAccess().getFormAssignment_4_1(), "rule__FieldSelect__FormAssignment_4_1");
					put(grammarAccess.getFieldSelectAccess().getLabelAssignment_5_1(), "rule__FieldSelect__LabelAssignment_5_1");
					put(grammarAccess.getFieldSelectAccess().getMultipleAssignment_6(), "rule__FieldSelect__MultipleAssignment_6");
					put(grammarAccess.getFieldSelectAccess().getRequiredAssignment_7(), "rule__FieldSelect__RequiredAssignment_7");
					put(grammarAccess.getFieldSelectAccess().getSizeAssignment_8_1(), "rule__FieldSelect__SizeAssignment_8_1");
					put(grammarAccess.getFieldSelectAccess().getChildsAssignment_10(), "rule__FieldSelect__ChildsAssignment_10");
					put(grammarAccess.getFieldOptionAccess().getTextAssignment_1(), "rule__FieldOption__TextAssignment_1");
					put(grammarAccess.getFieldOptionAccess().getDisabledAssignment_2(), "rule__FieldOption__DisabledAssignment_2");
					put(grammarAccess.getFieldOptionAccess().getSelectedAssignment_3(), "rule__FieldOption__SelectedAssignment_3");
					put(grammarAccess.getFieldOptionAccess().getTextAssignment_4_1(), "rule__FieldOption__TextAssignment_4_1");
					put(grammarAccess.getFieldOptionAccess().getValueAssignment_5_1(), "rule__FieldOption__ValueAssignment_5_1");
					put(grammarAccess.getFieldOptionGroupAccess().getDisabledAssignment_1(), "rule__FieldOptionGroup__DisabledAssignment_1");
					put(grammarAccess.getFieldOptionGroupAccess().getLabelAssignment_2_1(), "rule__FieldOptionGroup__LabelAssignment_2_1");
					put(grammarAccess.getFieldOptionGroupAccess().getOptionsAssignment_4(), "rule__FieldOptionGroup__OptionsAssignment_4");
					put(grammarAccess.getFieldChoiceAccess().getNameAssignment_1(), "rule__FieldChoice__NameAssignment_1");
					put(grammarAccess.getFieldChoiceAccess().getAutofocusAssignment_2(), "rule__FieldChoice__AutofocusAssignment_2");
					put(grammarAccess.getFieldChoiceAccess().getCheckedAssignment_3(), "rule__FieldChoice__CheckedAssignment_3");
					put(grammarAccess.getFieldChoiceAccess().getDisabledAssignment_4(), "rule__FieldChoice__DisabledAssignment_4");
					put(grammarAccess.getFieldChoiceAccess().getFormAssignment_5_1(), "rule__FieldChoice__FormAssignment_5_1");
					put(grammarAccess.getFieldChoiceAccess().getLabelAssignment_6_1(), "rule__FieldChoice__LabelAssignment_6_1");
					put(grammarAccess.getFieldChoiceAccess().getMultipleAssignment_7(), "rule__FieldChoice__MultipleAssignment_7");
					put(grammarAccess.getFieldChoiceAccess().getNotdisplayedAssignment_8(), "rule__FieldChoice__NotdisplayedAssignment_8");
					put(grammarAccess.getFieldChoiceAccess().getReadonlyAssignment_9(), "rule__FieldChoice__ReadonlyAssignment_9");
					put(grammarAccess.getFieldChoiceAccess().getRequiredAssignment_10(), "rule__FieldChoice__RequiredAssignment_10");
					put(grammarAccess.getFieldChoiceAccess().getValueAssignment_11_1(), "rule__FieldChoice__ValueAssignment_11_1");
					put(grammarAccess.getFieldChoiceAccess().getOptionsAssignment_12_1(), "rule__FieldChoice__OptionsAssignment_12_1");
					put(grammarAccess.getFieldChoiceOptionAccess().getLabelAssignment_1(), "rule__FieldChoiceOption__LabelAssignment_1");
					put(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAssignment_2(), "rule__FieldChoiceOption__AutofocusAssignment_2");
					put(grammarAccess.getFieldChoiceOptionAccess().getCheckedAssignment_3(), "rule__FieldChoiceOption__CheckedAssignment_3");
					put(grammarAccess.getFieldChoiceOptionAccess().getDisabledAssignment_4(), "rule__FieldChoiceOption__DisabledAssignment_4");
					put(grammarAccess.getFieldChoiceOptionAccess().getReadonlyAssignment_5(), "rule__FieldChoiceOption__ReadonlyAssignment_5");
					put(grammarAccess.getFieldChoiceOptionAccess().getRequiredAssignment_6(), "rule__FieldChoiceOption__RequiredAssignment_6");
					put(grammarAccess.getFieldChoiceOptionAccess().getValueAssignment_7_1(), "rule__FieldChoiceOption__ValueAssignment_7_1");
					put(grammarAccess.getGroupAccess().getNameAssignment_1(), "rule__Group__NameAssignment_1");
					put(grammarAccess.getGroupAccess().getLabelAssignment_2_1(), "rule__Group__LabelAssignment_2_1");
					put(grammarAccess.getGroupAccess().getFieldsAssignment_4(), "rule__Group__FieldsAssignment_4");
					put(grammarAccess.getPageAccess().getChildsAssignment_2(), "rule__Page__ChildsAssignment_2");
					put(grammarAccess.getButtonSubmitAccess().getNameAssignment_1(), "rule__ButtonSubmit__NameAssignment_1");
					put(grammarAccess.getButtonSubmitAccess().getTextAssignment_2(), "rule__ButtonSubmit__TextAssignment_2");
					put(grammarAccess.getButtonSubmitAccess().getAutofocusAssignment_3(), "rule__ButtonSubmit__AutofocusAssignment_3");
					put(grammarAccess.getButtonSubmitAccess().getDisabledAssignment_4(), "rule__ButtonSubmit__DisabledAssignment_4");
					put(grammarAccess.getButtonSubmitAccess().getValueAssignment_5_1(), "rule__ButtonSubmit__ValueAssignment_5_1");
					put(grammarAccess.getCalculateAccess().getResultAssignment_1(), "rule__Calculate__ResultAssignment_1");
					put(grammarAccess.getCalculateAccess().getExpressionAssignment_3(), "rule__Calculate__ExpressionAssignment_3");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
					put(grammarAccess.getPrefixedAccess().getExpressionAssignment_0_2(), "rule__Prefixed__ExpressionAssignment_0_2");
					put(grammarAccess.getPrefixedAccess().getExpressionAssignment_1_2(), "rule__Prefixed__ExpressionAssignment_1_2");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
					put(grammarAccess.getAtomicAccess().getRefAssignment_4_1(), "rule__Atomic__RefAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalCalculatorFormParser typedParser = (InternalCalculatorFormParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CalculatorFormGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CalculatorFormGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
