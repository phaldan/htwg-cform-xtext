package de.htwg.zeta.xtext.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import de.htwg.zeta.xtext.idea.lang.CalculatorFormElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import de.htwg.zeta.xtext.services.CalculatorFormGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class PsiInternalCalculatorFormParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'field'", "'autofocus'", "'disabled'", "'form'", "'label'", "'notdisplayed'", "'readonly'", "'required'", "'value'", "'dropdown'", "'multiple'", "'size'", "'{'", "'}'", "'option'", "'selected'", "'text'", "'option-group'", "'choice'", "'checked'", "'group'", "'page'", "'submit-button'", "'calculate'", "'='", "'.'", "'+'", "'-'", "'*'", "'/'", "'!'", "'('", "')'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int RULE_FLOAT=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public PsiInternalCalculatorFormParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalCalculatorFormParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalCalculatorFormParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalCalculatorForm.g"; }



    	protected CalculatorFormGrammarAccess grammarAccess;

    	protected CalculatorFormElementTypeProvider elementTypeProvider;

    	public PsiInternalCalculatorFormParser(PsiBuilder builder, TokenStream input, CalculatorFormElementTypeProvider elementTypeProvider, CalculatorFormGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // PsiInternalCalculatorForm.g:52:1: entryRuleModel returns [Boolean current=false] : iv_ruleModel= ruleModel EOF ;
    public final Boolean entryRuleModel() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleModel = null;


        try {
            // PsiInternalCalculatorForm.g:52:47: (iv_ruleModel= ruleModel EOF )
            // PsiInternalCalculatorForm.g:53:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getModelElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalCalculatorForm.g:59:1: ruleModel returns [Boolean current=false] : ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* ) ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_formElements_0_0 = null;

        Boolean lv_calculations_1_0 = null;


        try {
            // PsiInternalCalculatorForm.g:60:1: ( ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* ) )
            // PsiInternalCalculatorForm.g:61:2: ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* )
            {
            // PsiInternalCalculatorForm.g:61:2: ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* )
            // PsiInternalCalculatorForm.g:62:3: ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )*
            {
            // PsiInternalCalculatorForm.g:62:3: ( (lv_formElements_0_0= ruleFormElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==21||LA1_0==30||(LA1_0>=32 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:63:4: (lv_formElements_0_0= ruleFormElement )
            	    {
            	    // PsiInternalCalculatorForm.g:63:4: (lv_formElements_0_0= ruleFormElement )
            	    // PsiInternalCalculatorForm.g:64:5: lv_formElements_0_0= ruleFormElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getModel_FormElementsFormElementParserRuleCall_0_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_formElements_0_0=ruleFormElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // PsiInternalCalculatorForm.g:77:3: ( (lv_calculations_1_0= ruleCalculate ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:78:4: (lv_calculations_1_0= ruleCalculate )
            	    {
            	    // PsiInternalCalculatorForm.g:78:4: (lv_calculations_1_0= ruleCalculate )
            	    // PsiInternalCalculatorForm.g:79:5: lv_calculations_1_0= ruleCalculate
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getModel_CalculationsCalculateParserRuleCall_1_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_calculations_1_0=ruleCalculate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFormElement"
    // PsiInternalCalculatorForm.g:96:1: entryRuleFormElement returns [Boolean current=false] : iv_ruleFormElement= ruleFormElement EOF ;
    public final Boolean entryRuleFormElement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFormElement = null;


        try {
            // PsiInternalCalculatorForm.g:96:53: (iv_ruleFormElement= ruleFormElement EOF )
            // PsiInternalCalculatorForm.g:97:2: iv_ruleFormElement= ruleFormElement EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFormElementElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormElement=ruleFormElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormElement"


    // $ANTLR start "ruleFormElement"
    // PsiInternalCalculatorForm.g:103:1: ruleFormElement returns [Boolean current=false] : (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) ;
    public final Boolean ruleFormElement() throws RecognitionException {
        Boolean current = false;

        Boolean this_Field_0 = null;

        Boolean this_Group_1 = null;

        Boolean this_Page_2 = null;


        try {
            // PsiInternalCalculatorForm.g:104:1: ( (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) )
            // PsiInternalCalculatorForm.g:105:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            {
            // PsiInternalCalculatorForm.g:105:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
            case 21:
            case 30:
            case 34:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // PsiInternalCalculatorForm.g:106:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getFormElement_FieldParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:115:3: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getFormElement_GroupParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Group_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCalculatorForm.g:124:3: this_Page_2= rulePage
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getFormElement_PageParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Page_2=rulePage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Page_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormElement"


    // $ANTLR start "entryRuleField"
    // PsiInternalCalculatorForm.g:136:1: entryRuleField returns [Boolean current=false] : iv_ruleField= ruleField EOF ;
    public final Boolean entryRuleField() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleField = null;


        try {
            // PsiInternalCalculatorForm.g:136:47: (iv_ruleField= ruleField EOF )
            // PsiInternalCalculatorForm.g:137:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // PsiInternalCalculatorForm.g:143:1: ruleField returns [Boolean current=false] : (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) ;
    public final Boolean ruleField() throws RecognitionException {
        Boolean current = false;

        Boolean this_FieldInput_0 = null;

        Boolean this_FieldSelect_1 = null;

        Boolean this_FieldChoice_2 = null;

        Boolean this_Button_3 = null;


        try {
            // PsiInternalCalculatorForm.g:144:1: ( (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) )
            // PsiInternalCalculatorForm.g:145:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            {
            // PsiInternalCalculatorForm.g:145:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // PsiInternalCalculatorForm.g:146:3: this_FieldInput_0= ruleFieldInput
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getField_FieldInputParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldInput_0=ruleFieldInput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldInput_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:155:3: this_FieldSelect_1= ruleFieldSelect
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getField_FieldSelectParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldSelect_1=ruleFieldSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldSelect_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalCalculatorForm.g:164:3: this_FieldChoice_2= ruleFieldChoice
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getField_FieldChoiceParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldChoice_2=ruleFieldChoice();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldChoice_2;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 4 :
                    // PsiInternalCalculatorForm.g:173:3: this_Button_3= ruleButton
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getField_ButtonParserRuleCall_3ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Button_3=ruleButton();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Button_3;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldInput"
    // PsiInternalCalculatorForm.g:185:1: entryRuleFieldInput returns [Boolean current=false] : iv_ruleFieldInput= ruleFieldInput EOF ;
    public final Boolean entryRuleFieldInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldInput = null;


        try {
            // PsiInternalCalculatorForm.g:185:52: (iv_ruleFieldInput= ruleFieldInput EOF )
            // PsiInternalCalculatorForm.g:186:2: iv_ruleFieldInput= ruleFieldInput EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldInputElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldInput=ruleFieldInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldInput"


    // $ANTLR start "ruleFieldInput"
    // PsiInternalCalculatorForm.g:192:1: ruleFieldInput returns [Boolean current=false] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) ;
    public final Boolean ruleFieldInput() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_autofocus_2_0=null;
        Token lv_disabled_3_0=null;
        Token otherlv_4=null;
        Token lv_form_5_0=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token lv_notdisplayed_8_0=null;
        Token lv_readonly_9_0=null;
        Token lv_required_10_0=null;
        Token otherlv_11=null;
        Token lv_value_12_0=null;

        try {
            // PsiInternalCalculatorForm.g:193:1: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:194:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:194:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:195:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldInput_FieldKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:202:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:203:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:203:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:204:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldInput_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:219:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalCalculatorForm.g:220:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:220:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:221:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_autofocus_2_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:236:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalCalculatorForm.g:237:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:237:4: (lv_disabled_3_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:238:5: lv_disabled_3_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_DisabledDisabledKeyword_3_0ElementType());
                      				
                    }
                    lv_disabled_3_0=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_disabled_3_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:253:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalCalculatorForm.g:254:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldInput_FormKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCalculatorForm.g:261:4: ( (lv_form_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:262:5: (lv_form_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:262:5: (lv_form_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:263:6: lv_form_5_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldInput_FormSTRINGTerminalRuleCall_4_1_0ElementType());
                      					
                    }
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_form_5_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:279:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalCalculatorForm.g:280:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldInput_LabelKeyword_5_0ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }
                    // PsiInternalCalculatorForm.g:287:4: ( (lv_label_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:288:5: (lv_label_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:288:5: (lv_label_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:289:6: lv_label_7_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldInput_LabelSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_label_7_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:305:3: ( (lv_notdisplayed_8_0= 'notdisplayed' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalCalculatorForm.g:306:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    {
                    // PsiInternalCalculatorForm.g:306:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    // PsiInternalCalculatorForm.g:307:5: lv_notdisplayed_8_0= 'notdisplayed'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_NotdisplayedNotdisplayedKeyword_6_0ElementType());
                      				
                    }
                    lv_notdisplayed_8_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_notdisplayed_8_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:322:3: ( (lv_readonly_9_0= 'readonly' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalCalculatorForm.g:323:4: (lv_readonly_9_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:323:4: (lv_readonly_9_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:324:5: lv_readonly_9_0= 'readonly'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_ReadonlyReadonlyKeyword_7_0ElementType());
                      				
                    }
                    lv_readonly_9_0=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_readonly_9_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:339:3: ( (lv_required_10_0= 'required' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalCalculatorForm.g:340:4: (lv_required_10_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:340:4: (lv_required_10_0= 'required' )
                    // PsiInternalCalculatorForm.g:341:5: lv_required_10_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_RequiredRequiredKeyword_8_0ElementType());
                      				
                    }
                    lv_required_10_0=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_required_10_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:356:3: (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalCalculatorForm.g:357:4: otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldInput_ValueKeyword_9_0ElementType());
                      			
                    }
                    otherlv_11=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_11);
                      			
                    }
                    // PsiInternalCalculatorForm.g:364:4: ( (lv_value_12_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:365:5: (lv_value_12_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:365:5: (lv_value_12_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:366:6: lv_value_12_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldInput_ValueSTRINGTerminalRuleCall_9_1_0ElementType());
                      					
                    }
                    lv_value_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_12_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldInput"


    // $ANTLR start "entryRuleFieldSelect"
    // PsiInternalCalculatorForm.g:386:1: entryRuleFieldSelect returns [Boolean current=false] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final Boolean entryRuleFieldSelect() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldSelect = null;


        try {
            // PsiInternalCalculatorForm.g:386:53: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // PsiInternalCalculatorForm.g:387:2: iv_ruleFieldSelect= ruleFieldSelect EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldSelectElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelect=ruleFieldSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldSelect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldSelect"


    // $ANTLR start "ruleFieldSelect"
    // PsiInternalCalculatorForm.g:393:1: ruleFieldSelect returns [Boolean current=false] : (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) ;
    public final Boolean ruleFieldSelect() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_autofocus_2_0=null;
        Token lv_disabled_3_0=null;
        Token otherlv_4=null;
        Token lv_form_5_0=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token lv_multiple_8_0=null;
        Token lv_required_9_0=null;
        Token otherlv_10=null;
        Token lv_size_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Boolean lv_childs_13_0 = null;


        try {
            // PsiInternalCalculatorForm.g:394:1: ( (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) )
            // PsiInternalCalculatorForm.g:395:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            {
            // PsiInternalCalculatorForm.g:395:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            // PsiInternalCalculatorForm.g:396:3: otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldSelect_DropdownKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:403:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:404:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:404:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:405:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldSelect_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:420:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PsiInternalCalculatorForm.g:421:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:421:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:422:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_autofocus_2_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:437:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalCalculatorForm.g:438:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:438:4: (lv_disabled_3_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:439:5: lv_disabled_3_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_DisabledDisabledKeyword_3_0ElementType());
                      				
                    }
                    lv_disabled_3_0=(Token)match(input,14,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_disabled_3_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:454:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalCalculatorForm.g:455:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldSelect_FormKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCalculatorForm.g:462:4: ( (lv_form_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:463:5: (lv_form_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:463:5: (lv_form_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:464:6: lv_form_5_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldSelect_FormSTRINGTerminalRuleCall_4_1_0ElementType());
                      					
                    }
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_form_5_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:480:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalCalculatorForm.g:481:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldSelect_LabelKeyword_5_0ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }
                    // PsiInternalCalculatorForm.g:488:4: ( (lv_label_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:489:5: (lv_label_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:489:5: (lv_label_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:490:6: lv_label_7_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldSelect_LabelSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_label_7_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:506:3: ( (lv_multiple_8_0= 'multiple' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalCalculatorForm.g:507:4: (lv_multiple_8_0= 'multiple' )
                    {
                    // PsiInternalCalculatorForm.g:507:4: (lv_multiple_8_0= 'multiple' )
                    // PsiInternalCalculatorForm.g:508:5: lv_multiple_8_0= 'multiple'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_MultipleMultipleKeyword_6_0ElementType());
                      				
                    }
                    lv_multiple_8_0=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_multiple_8_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:523:3: ( (lv_required_9_0= 'required' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalCalculatorForm.g:524:4: (lv_required_9_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:524:4: (lv_required_9_0= 'required' )
                    // PsiInternalCalculatorForm.g:525:5: lv_required_9_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_RequiredRequiredKeyword_7_0ElementType());
                      				
                    }
                    lv_required_9_0=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_required_9_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:540:3: (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalCalculatorForm.g:541:4: otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldSelect_SizeKeyword_8_0ElementType());
                      			
                    }
                    otherlv_10=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_10);
                      			
                    }
                    // PsiInternalCalculatorForm.g:548:4: ( (lv_size_11_0= RULE_INT ) )
                    // PsiInternalCalculatorForm.g:549:5: (lv_size_11_0= RULE_INT )
                    {
                    // PsiInternalCalculatorForm.g:549:5: (lv_size_11_0= RULE_INT )
                    // PsiInternalCalculatorForm.g:550:6: lv_size_11_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldSelect_SizeINTTerminalRuleCall_8_1_0ElementType());
                      					
                    }
                    lv_size_11_0=(Token)match(input,RULE_INT,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_size_11_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldSelect_LeftCurlyBracketKeyword_9ElementType());
              		
            }
            otherlv_12=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_12);
              		
            }
            // PsiInternalCalculatorForm.g:573:3: ( (lv_childs_13_0= ruleFieldSelectChild ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26||LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:574:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    {
            	    // PsiInternalCalculatorForm.g:574:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    // PsiInternalCalculatorForm.g:575:5: lv_childs_13_0= ruleFieldSelectChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getFieldSelect_ChildsFieldSelectChildParserRuleCall_10_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_childs_13_0=ruleFieldSelectChild();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldSelect_RightCurlyBracketKeyword_11ElementType());
              		
            }
            otherlv_14=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_14);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldSelect"


    // $ANTLR start "entryRuleFieldSelectChild"
    // PsiInternalCalculatorForm.g:599:1: entryRuleFieldSelectChild returns [Boolean current=false] : iv_ruleFieldSelectChild= ruleFieldSelectChild EOF ;
    public final Boolean entryRuleFieldSelectChild() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldSelectChild = null;


        try {
            // PsiInternalCalculatorForm.g:599:58: (iv_ruleFieldSelectChild= ruleFieldSelectChild EOF )
            // PsiInternalCalculatorForm.g:600:2: iv_ruleFieldSelectChild= ruleFieldSelectChild EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldSelectChildElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelectChild=ruleFieldSelectChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldSelectChild; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldSelectChild"


    // $ANTLR start "ruleFieldSelectChild"
    // PsiInternalCalculatorForm.g:606:1: ruleFieldSelectChild returns [Boolean current=false] : (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) ;
    public final Boolean ruleFieldSelectChild() throws RecognitionException {
        Boolean current = false;

        Boolean this_FieldOption_0 = null;

        Boolean this_FieldOptionGroup_1 = null;


        try {
            // PsiInternalCalculatorForm.g:607:1: ( (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) )
            // PsiInternalCalculatorForm.g:608:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            {
            // PsiInternalCalculatorForm.g:608:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalCalculatorForm.g:609:3: this_FieldOption_0= ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getFieldSelectChild_FieldOptionParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldOption_0=ruleFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldOption_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:618:3: this_FieldOptionGroup_1= ruleFieldOptionGroup
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getFieldSelectChild_FieldOptionGroupParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldOptionGroup_1=ruleFieldOptionGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldOptionGroup_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldSelectChild"


    // $ANTLR start "entryRuleFieldOption"
    // PsiInternalCalculatorForm.g:630:1: entryRuleFieldOption returns [Boolean current=false] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final Boolean entryRuleFieldOption() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldOption = null;


        try {
            // PsiInternalCalculatorForm.g:630:53: (iv_ruleFieldOption= ruleFieldOption EOF )
            // PsiInternalCalculatorForm.g:631:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldOptionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOption; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldOption"


    // $ANTLR start "ruleFieldOption"
    // PsiInternalCalculatorForm.g:637:1: ruleFieldOption returns [Boolean current=false] : (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
    public final Boolean ruleFieldOption() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token lv_disabled_2_0=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;

        try {
            // PsiInternalCalculatorForm.g:638:1: ( (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:639:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:639:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:640:3: otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldOption_OptionKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:647:3: ( (lv_text_1_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:648:4: (lv_text_1_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:648:4: (lv_text_1_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:649:5: lv_text_1_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldOption_TextSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_text_1_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:664:3: ( (lv_disabled_2_0= 'disabled' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalCalculatorForm.g:665:4: (lv_disabled_2_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:665:4: (lv_disabled_2_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:666:5: lv_disabled_2_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldOption_DisabledDisabledKeyword_2_0ElementType());
                      				
                    }
                    lv_disabled_2_0=(Token)match(input,14,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_disabled_2_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:681:3: ( (lv_selected_3_0= 'selected' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalCalculatorForm.g:682:4: (lv_selected_3_0= 'selected' )
                    {
                    // PsiInternalCalculatorForm.g:682:4: (lv_selected_3_0= 'selected' )
                    // PsiInternalCalculatorForm.g:683:5: lv_selected_3_0= 'selected'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldOption_SelectedSelectedKeyword_3_0ElementType());
                      				
                    }
                    lv_selected_3_0=(Token)match(input,27,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_selected_3_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:698:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalCalculatorForm.g:699:4: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldOption_TextKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCalculatorForm.g:706:4: ( (lv_text_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:707:5: (lv_text_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:707:5: (lv_text_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:708:6: lv_text_5_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldOption_TextSTRINGTerminalRuleCall_4_1_0ElementType());
                      					
                    }
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_text_5_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:724:3: (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalCalculatorForm.g:725:4: otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldOption_ValueKeyword_5_0ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }
                    // PsiInternalCalculatorForm.g:732:4: ( (lv_value_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:733:5: (lv_value_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:733:5: (lv_value_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:734:6: lv_value_7_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldOption_ValueSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_7_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldOption"


    // $ANTLR start "entryRuleFieldOptionGroup"
    // PsiInternalCalculatorForm.g:754:1: entryRuleFieldOptionGroup returns [Boolean current=false] : iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF ;
    public final Boolean entryRuleFieldOptionGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldOptionGroup = null;


        try {
            // PsiInternalCalculatorForm.g:754:58: (iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF )
            // PsiInternalCalculatorForm.g:755:2: iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldOptionGroupElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldOptionGroup=ruleFieldOptionGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldOptionGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldOptionGroup"


    // $ANTLR start "ruleFieldOptionGroup"
    // PsiInternalCalculatorForm.g:761:1: ruleFieldOptionGroup returns [Boolean current=false] : (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) ;
    public final Boolean ruleFieldOptionGroup() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_disabled_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_options_5_0 = null;


        try {
            // PsiInternalCalculatorForm.g:762:1: ( (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) )
            // PsiInternalCalculatorForm.g:763:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            {
            // PsiInternalCalculatorForm.g:763:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            // PsiInternalCalculatorForm.g:764:3: otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldOptionGroup_OptionGroupKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,29,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:771:3: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalCalculatorForm.g:772:4: (lv_disabled_1_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:772:4: (lv_disabled_1_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:773:5: lv_disabled_1_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldOptionGroup_DisabledDisabledKeyword_1_0ElementType());
                      				
                    }
                    lv_disabled_1_0=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_disabled_1_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:788:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalCalculatorForm.g:789:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldOptionGroup_LabelKeyword_2_0ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalCalculatorForm.g:796:4: ( (lv_label_3_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:797:5: (lv_label_3_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:797:5: (lv_label_3_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:798:6: lv_label_3_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldOptionGroup_LabelSTRINGTerminalRuleCall_2_1_0ElementType());
                      					
                    }
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_label_3_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldOptionGroup_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_4=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalCalculatorForm.g:821:3: ( (lv_options_5_0= ruleFieldOption ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:822:4: (lv_options_5_0= ruleFieldOption )
            	    {
            	    // PsiInternalCalculatorForm.g:822:4: (lv_options_5_0= ruleFieldOption )
            	    // PsiInternalCalculatorForm.g:823:5: lv_options_5_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getFieldOptionGroup_OptionsFieldOptionParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_options_5_0=ruleFieldOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldOptionGroup_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldOptionGroup"


    // $ANTLR start "entryRuleFieldChoice"
    // PsiInternalCalculatorForm.g:847:1: entryRuleFieldChoice returns [Boolean current=false] : iv_ruleFieldChoice= ruleFieldChoice EOF ;
    public final Boolean entryRuleFieldChoice() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldChoice = null;


        try {
            // PsiInternalCalculatorForm.g:847:53: (iv_ruleFieldChoice= ruleFieldChoice EOF )
            // PsiInternalCalculatorForm.g:848:2: iv_ruleFieldChoice= ruleFieldChoice EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldChoiceElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldChoice=ruleFieldChoice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldChoice; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldChoice"


    // $ANTLR start "ruleFieldChoice"
    // PsiInternalCalculatorForm.g:854:1: ruleFieldChoice returns [Boolean current=false] : (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) ;
    public final Boolean ruleFieldChoice() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_autofocus_2_0=null;
        Token lv_checked_3_0=null;
        Token lv_disabled_4_0=null;
        Token otherlv_5=null;
        Token lv_form_6_0=null;
        Token otherlv_7=null;
        Token lv_label_8_0=null;
        Token lv_multiple_9_0=null;
        Token lv_notdisplayed_10_0=null;
        Token lv_readonly_11_0=null;
        Token lv_required_12_0=null;
        Token otherlv_13=null;
        Token lv_value_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Boolean lv_options_16_0 = null;


        try {
            // PsiInternalCalculatorForm.g:855:1: ( (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) )
            // PsiInternalCalculatorForm.g:856:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            {
            // PsiInternalCalculatorForm.g:856:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            // PsiInternalCalculatorForm.g:857:3: otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldChoice_ChoiceKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:864:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:865:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:865:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:866:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldChoice_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:881:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // PsiInternalCalculatorForm.g:882:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:882:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:883:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_autofocus_2_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:898:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalCalculatorForm.g:899:4: (lv_checked_3_0= 'checked' )
                    {
                    // PsiInternalCalculatorForm.g:899:4: (lv_checked_3_0= 'checked' )
                    // PsiInternalCalculatorForm.g:900:5: lv_checked_3_0= 'checked'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_CheckedCheckedKeyword_3_0ElementType());
                      				
                    }
                    lv_checked_3_0=(Token)match(input,31,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_checked_3_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:915:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalCalculatorForm.g:916:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:916:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:917:5: lv_disabled_4_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_DisabledDisabledKeyword_4_0ElementType());
                      				
                    }
                    lv_disabled_4_0=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_disabled_4_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:932:3: (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalCalculatorForm.g:933:4: otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_FormKeyword_5_0ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalCalculatorForm.g:940:4: ( (lv_form_6_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:941:5: (lv_form_6_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:941:5: (lv_form_6_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:942:6: lv_form_6_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldChoice_FormSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_form_6_0=(Token)match(input,RULE_STRING,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_form_6_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:958:3: (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalCalculatorForm.g:959:4: otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_LabelKeyword_6_0ElementType());
                      			
                    }
                    otherlv_7=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_7);
                      			
                    }
                    // PsiInternalCalculatorForm.g:966:4: ( (lv_label_8_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:967:5: (lv_label_8_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:967:5: (lv_label_8_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:968:6: lv_label_8_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldChoice_LabelSTRINGTerminalRuleCall_6_1_0ElementType());
                      					
                    }
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_label_8_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:984:3: ( (lv_multiple_9_0= 'multiple' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // PsiInternalCalculatorForm.g:985:4: (lv_multiple_9_0= 'multiple' )
                    {
                    // PsiInternalCalculatorForm.g:985:4: (lv_multiple_9_0= 'multiple' )
                    // PsiInternalCalculatorForm.g:986:5: lv_multiple_9_0= 'multiple'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_MultipleMultipleKeyword_7_0ElementType());
                      				
                    }
                    lv_multiple_9_0=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_multiple_9_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1001:3: ( (lv_notdisplayed_10_0= 'notdisplayed' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1002:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    {
                    // PsiInternalCalculatorForm.g:1002:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    // PsiInternalCalculatorForm.g:1003:5: lv_notdisplayed_10_0= 'notdisplayed'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_NotdisplayedNotdisplayedKeyword_8_0ElementType());
                      				
                    }
                    lv_notdisplayed_10_0=(Token)match(input,17,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_notdisplayed_10_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1018:3: ( (lv_readonly_11_0= 'readonly' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1019:4: (lv_readonly_11_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:1019:4: (lv_readonly_11_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:1020:5: lv_readonly_11_0= 'readonly'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_ReadonlyReadonlyKeyword_9_0ElementType());
                      				
                    }
                    lv_readonly_11_0=(Token)match(input,18,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_readonly_11_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1035:3: ( (lv_required_12_0= 'required' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1036:4: (lv_required_12_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:1036:4: (lv_required_12_0= 'required' )
                    // PsiInternalCalculatorForm.g:1037:5: lv_required_12_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_RequiredRequiredKeyword_10_0ElementType());
                      				
                    }
                    lv_required_12_0=(Token)match(input,19,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_required_12_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1052:3: (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1053:4: otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_ValueKeyword_11_0ElementType());
                      			
                    }
                    otherlv_13=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_13);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1060:4: ( (lv_value_14_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1061:5: (lv_value_14_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1061:5: (lv_value_14_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1062:6: lv_value_14_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldChoice_ValueSTRINGTerminalRuleCall_11_1_0ElementType());
                      					
                    }
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_14_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1078:3: (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1079:4: otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_LeftCurlyBracketKeyword_12_0ElementType());
                      			
                    }
                    otherlv_15=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_15);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1086:4: ( (lv_options_16_0= ruleFieldChoiceOption ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==26) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // PsiInternalCalculatorForm.g:1087:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    {
                    	    // PsiInternalCalculatorForm.g:1087:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    // PsiInternalCalculatorForm.g:1088:6: lv_options_16_0= ruleFieldChoiceOption
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getFieldChoice_OptionsFieldChoiceOptionParserRuleCall_12_1_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_options_16_0=ruleFieldChoiceOption();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						doneComposite();
                    	      						if(!current) {
                    	      							associateWithSemanticElement();
                    	      							current = true;
                    	      						}
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_RightCurlyBracketKeyword_12_2ElementType());
                      			
                    }
                    otherlv_17=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_17);
                      			
                    }

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldChoice"


    // $ANTLR start "entryRuleFieldChoiceOption"
    // PsiInternalCalculatorForm.g:1113:1: entryRuleFieldChoiceOption returns [Boolean current=false] : iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF ;
    public final Boolean entryRuleFieldChoiceOption() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldChoiceOption = null;


        try {
            // PsiInternalCalculatorForm.g:1113:59: (iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF )
            // PsiInternalCalculatorForm.g:1114:2: iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldChoiceOptionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldChoiceOption=ruleFieldChoiceOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldChoiceOption; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldChoiceOption"


    // $ANTLR start "ruleFieldChoiceOption"
    // PsiInternalCalculatorForm.g:1120:1: ruleFieldChoiceOption returns [Boolean current=false] : (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) ;
    public final Boolean ruleFieldChoiceOption() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_autofocus_2_0=null;
        Token lv_checked_3_0=null;
        Token lv_disabled_4_0=null;
        Token lv_readonly_5_0=null;
        Token lv_required_6_0=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;

        try {
            // PsiInternalCalculatorForm.g:1121:1: ( (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:1122:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:1122:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:1123:3: otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldChoiceOption_OptionKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1130:3: ( (lv_label_1_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:1131:4: (lv_label_1_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:1131:4: (lv_label_1_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:1132:5: lv_label_1_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldChoiceOption_LabelSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_label_1_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:1147:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1148:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:1148:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:1149:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_autofocus_2_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1164:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1165:4: (lv_checked_3_0= 'checked' )
                    {
                    // PsiInternalCalculatorForm.g:1165:4: (lv_checked_3_0= 'checked' )
                    // PsiInternalCalculatorForm.g:1166:5: lv_checked_3_0= 'checked'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_CheckedCheckedKeyword_3_0ElementType());
                      				
                    }
                    lv_checked_3_0=(Token)match(input,31,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_checked_3_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1181:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1182:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:1182:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:1183:5: lv_disabled_4_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_DisabledDisabledKeyword_4_0ElementType());
                      				
                    }
                    lv_disabled_4_0=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_disabled_4_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1198:3: ( (lv_readonly_5_0= 'readonly' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1199:4: (lv_readonly_5_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:1199:4: (lv_readonly_5_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:1200:5: lv_readonly_5_0= 'readonly'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_ReadonlyReadonlyKeyword_5_0ElementType());
                      				
                    }
                    lv_readonly_5_0=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_readonly_5_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1215:3: ( (lv_required_6_0= 'required' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1216:4: (lv_required_6_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:1216:4: (lv_required_6_0= 'required' )
                    // PsiInternalCalculatorForm.g:1217:5: lv_required_6_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_RequiredRequiredKeyword_6_0ElementType());
                      				
                    }
                    lv_required_6_0=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_required_6_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1232:3: (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1233:4: otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoiceOption_ValueKeyword_7_0ElementType());
                      			
                    }
                    otherlv_7=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_7);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1240:4: ( (lv_value_8_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1241:5: (lv_value_8_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1241:5: (lv_value_8_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1242:6: lv_value_8_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldChoiceOption_ValueSTRINGTerminalRuleCall_7_1_0ElementType());
                      					
                    }
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_8_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldChoiceOption"


    // $ANTLR start "entryRuleGroup"
    // PsiInternalCalculatorForm.g:1262:1: entryRuleGroup returns [Boolean current=false] : iv_ruleGroup= ruleGroup EOF ;
    public final Boolean entryRuleGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleGroup = null;


        try {
            // PsiInternalCalculatorForm.g:1262:47: (iv_ruleGroup= ruleGroup EOF )
            // PsiInternalCalculatorForm.g:1263:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getGroupElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // PsiInternalCalculatorForm.g:1269:1: ruleGroup returns [Boolean current=false] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
    public final Boolean ruleGroup() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_fields_5_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1270:1: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // PsiInternalCalculatorForm.g:1271:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // PsiInternalCalculatorForm.g:1271:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // PsiInternalCalculatorForm.g:1272:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getGroup_GroupKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1279:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:1280:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:1280:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:1281:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getGroup_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:1296:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1297:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getGroup_LabelKeyword_2_0ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1304:4: ( (lv_label_3_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1305:5: (lv_label_3_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1305:5: (lv_label_3_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1306:6: lv_label_3_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getGroup_LabelSTRINGTerminalRuleCall_2_1_0ElementType());
                      					
                    }
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_label_3_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getGroup_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_4=(Token)match(input,24,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalCalculatorForm.g:1329:3: ( (lv_fields_5_0= ruleField ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==12||LA48_0==21||LA48_0==30||LA48_0==34) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1330:4: (lv_fields_5_0= ruleField )
            	    {
            	    // PsiInternalCalculatorForm.g:1330:4: (lv_fields_5_0= ruleField )
            	    // PsiInternalCalculatorForm.g:1331:5: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getGroup_FieldsFieldParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getGroup_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePage"
    // PsiInternalCalculatorForm.g:1355:1: entryRulePage returns [Boolean current=false] : iv_rulePage= rulePage EOF ;
    public final Boolean entryRulePage() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePage = null;


        try {
            // PsiInternalCalculatorForm.g:1355:46: (iv_rulePage= rulePage EOF )
            // PsiInternalCalculatorForm.g:1356:2: iv_rulePage= rulePage EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPageElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePage; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // PsiInternalCalculatorForm.g:1362:1: rulePage returns [Boolean current=false] : (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) ;
    public final Boolean rulePage() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_childs_2_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1363:1: ( (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) )
            // PsiInternalCalculatorForm.g:1364:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            {
            // PsiInternalCalculatorForm.g:1364:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            // PsiInternalCalculatorForm.g:1365:3: otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPage_PageKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPage_LeftCurlyBracketKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCalculatorForm.g:1379:3: ( (lv_childs_2_0= rulePageChild ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==12||LA49_0==21||LA49_0==30||LA49_0==32||LA49_0==34) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1380:4: (lv_childs_2_0= rulePageChild )
            	    {
            	    // PsiInternalCalculatorForm.g:1380:4: (lv_childs_2_0= rulePageChild )
            	    // PsiInternalCalculatorForm.g:1381:5: lv_childs_2_0= rulePageChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getPage_ChildsPageChildParserRuleCall_2_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_childs_2_0=rulePageChild();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPage_RightCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRulePageChild"
    // PsiInternalCalculatorForm.g:1405:1: entryRulePageChild returns [Boolean current=false] : iv_rulePageChild= rulePageChild EOF ;
    public final Boolean entryRulePageChild() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePageChild = null;


        try {
            // PsiInternalCalculatorForm.g:1405:51: (iv_rulePageChild= rulePageChild EOF )
            // PsiInternalCalculatorForm.g:1406:2: iv_rulePageChild= rulePageChild EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPageChildElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePageChild=rulePageChild();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePageChild; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageChild"


    // $ANTLR start "rulePageChild"
    // PsiInternalCalculatorForm.g:1412:1: rulePageChild returns [Boolean current=false] : (this_Group_0= ruleGroup | this_Field_1= ruleField ) ;
    public final Boolean rulePageChild() throws RecognitionException {
        Boolean current = false;

        Boolean this_Group_0 = null;

        Boolean this_Field_1 = null;


        try {
            // PsiInternalCalculatorForm.g:1413:1: ( (this_Group_0= ruleGroup | this_Field_1= ruleField ) )
            // PsiInternalCalculatorForm.g:1414:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            {
            // PsiInternalCalculatorForm.g:1414:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==32) ) {
                alt50=1;
            }
            else if ( (LA50_0==12||LA50_0==21||LA50_0==30||LA50_0==34) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1415:3: this_Group_0= ruleGroup
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPageChild_GroupParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Group_0=ruleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Group_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:1424:3: this_Field_1= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPageChild_FieldParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_1=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageChild"


    // $ANTLR start "entryRuleButton"
    // PsiInternalCalculatorForm.g:1436:1: entryRuleButton returns [Boolean current=false] : iv_ruleButton= ruleButton EOF ;
    public final Boolean entryRuleButton() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleButton = null;


        try {
            // PsiInternalCalculatorForm.g:1436:48: (iv_ruleButton= ruleButton EOF )
            // PsiInternalCalculatorForm.g:1437:2: iv_ruleButton= ruleButton EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getButtonElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleButton; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // PsiInternalCalculatorForm.g:1443:1: ruleButton returns [Boolean current=false] : this_ButtonSubmit_0= ruleButtonSubmit ;
    public final Boolean ruleButton() throws RecognitionException {
        Boolean current = false;

        Boolean this_ButtonSubmit_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1444:1: (this_ButtonSubmit_0= ruleButtonSubmit )
            // PsiInternalCalculatorForm.g:1445:2: this_ButtonSubmit_0= ruleButtonSubmit
            {
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getButton_ButtonSubmitParserRuleCallElementType());
              	
            }
            pushFollow(FOLLOW_2);
            this_ButtonSubmit_0=ruleButtonSubmit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ButtonSubmit_0;
              		doneComposite();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonSubmit"
    // PsiInternalCalculatorForm.g:1456:1: entryRuleButtonSubmit returns [Boolean current=false] : iv_ruleButtonSubmit= ruleButtonSubmit EOF ;
    public final Boolean entryRuleButtonSubmit() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleButtonSubmit = null;


        try {
            // PsiInternalCalculatorForm.g:1456:54: (iv_ruleButtonSubmit= ruleButtonSubmit EOF )
            // PsiInternalCalculatorForm.g:1457:2: iv_ruleButtonSubmit= ruleButtonSubmit EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getButtonSubmitElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleButtonSubmit=ruleButtonSubmit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleButtonSubmit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonSubmit"


    // $ANTLR start "ruleButtonSubmit"
    // PsiInternalCalculatorForm.g:1463:1: ruleButtonSubmit returns [Boolean current=false] : (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) ;
    public final Boolean ruleButtonSubmit() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Token lv_autofocus_3_0=null;
        Token lv_disabled_4_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;

        try {
            // PsiInternalCalculatorForm.g:1464:1: ( (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:1465:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:1465:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:1466:3: otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getButtonSubmit_SubmitButtonKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1473:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:1474:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:1474:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:1475:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getButtonSubmit_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:1490:3: ( (lv_text_2_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:1491:4: (lv_text_2_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:1491:4: (lv_text_2_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:1492:5: lv_text_2_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getButtonSubmit_TextSTRINGTerminalRuleCall_2_0ElementType());
              				
            }
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_text_2_0);
              				
            }

            }


            }

            // PsiInternalCalculatorForm.g:1507:3: ( (lv_autofocus_3_0= 'autofocus' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1508:4: (lv_autofocus_3_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:1508:4: (lv_autofocus_3_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:1509:5: lv_autofocus_3_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getButtonSubmit_AutofocusAutofocusKeyword_3_0ElementType());
                      				
                    }
                    lv_autofocus_3_0=(Token)match(input,13,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_autofocus_3_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1524:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==14) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1525:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:1525:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:1526:5: lv_disabled_4_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getButtonSubmit_DisabledDisabledKeyword_4_0ElementType());
                      				
                    }
                    lv_disabled_4_0=(Token)match(input,14,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_disabled_4_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (!current) {
                      						associateWithSemanticElement();
                      						current = true;
                      					}
                      				
                    }

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1541:3: (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1542:4: otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getButtonSubmit_ValueKeyword_5_0ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1549:4: ( (lv_value_6_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1550:5: (lv_value_6_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1550:5: (lv_value_6_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1551:6: lv_value_6_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getButtonSubmit_ValueSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_6_0);
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonSubmit"


    // $ANTLR start "entryRuleCalculate"
    // PsiInternalCalculatorForm.g:1571:1: entryRuleCalculate returns [Boolean current=false] : iv_ruleCalculate= ruleCalculate EOF ;
    public final Boolean entryRuleCalculate() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCalculate = null;


        try {
            // PsiInternalCalculatorForm.g:1571:51: (iv_ruleCalculate= ruleCalculate EOF )
            // PsiInternalCalculatorForm.g:1572:2: iv_ruleCalculate= ruleCalculate EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCalculateElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCalculate=ruleCalculate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCalculate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculate"


    // $ANTLR start "ruleCalculate"
    // PsiInternalCalculatorForm.g:1578:1: ruleCalculate returns [Boolean current=false] : (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final Boolean ruleCalculate() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean lv_expression_3_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1579:1: ( (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // PsiInternalCalculatorForm.g:1580:2: (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // PsiInternalCalculatorForm.g:1580:2: (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // PsiInternalCalculatorForm.g:1581:3: otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCalculate_CalculateKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1588:3: ( ( ruleQualifiedName ) )
            // PsiInternalCalculatorForm.g:1589:4: ( ruleQualifiedName )
            {
            // PsiInternalCalculatorForm.g:1589:4: ( ruleQualifiedName )
            // PsiInternalCalculatorForm.g:1590:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCalculate_ResultFieldCrossReference_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_49);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCalculate_EqualsSignKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,36,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCalculatorForm.g:1612:3: ( (lv_expression_3_0= ruleExpression ) )
            // PsiInternalCalculatorForm.g:1613:4: (lv_expression_3_0= ruleExpression )
            {
            // PsiInternalCalculatorForm.g:1613:4: (lv_expression_3_0= ruleExpression )
            // PsiInternalCalculatorForm.g:1614:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCalculate_ExpressionExpressionParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculate"


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalCalculatorForm.g:1631:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalCalculatorForm.g:1631:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalCalculatorForm.g:1632:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // PsiInternalCalculatorForm.g:1638:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalCalculatorForm.g:1639:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalCalculatorForm.g:1640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalCalculatorForm.g:1640:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalCalculatorForm.g:1641:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
              		
            }
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_ID_0);
              		
            }
            // PsiInternalCalculatorForm.g:1648:3: (kw= '.' this_ID_2= RULE_ID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==37) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1649:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	      			
            	    }
            	    kw=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(kw);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_ID_2);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExpression"
    // PsiInternalCalculatorForm.g:1668:1: entryRuleExpression returns [Boolean current=false] : iv_ruleExpression= ruleExpression EOF ;
    public final Boolean entryRuleExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExpression = null;


        try {
            // PsiInternalCalculatorForm.g:1668:52: (iv_ruleExpression= ruleExpression EOF )
            // PsiInternalCalculatorForm.g:1669:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getExpressionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // PsiInternalCalculatorForm.g:1675:1: ruleExpression returns [Boolean current=false] : this_Addition_0= ruleAddition ;
    public final Boolean ruleExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_Addition_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1676:1: (this_Addition_0= ruleAddition )
            // PsiInternalCalculatorForm.g:1677:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getExpression_AdditionParserRuleCallElementType());
              	
            }
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Addition_0;
              		doneComposite();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // PsiInternalCalculatorForm.g:1688:1: entryRuleAddition returns [Boolean current=false] : iv_ruleAddition= ruleAddition EOF ;
    public final Boolean entryRuleAddition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAddition = null;


        try {
            // PsiInternalCalculatorForm.g:1688:50: (iv_ruleAddition= ruleAddition EOF )
            // PsiInternalCalculatorForm.g:1689:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getAdditionElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // PsiInternalCalculatorForm.g:1695:1: ruleAddition returns [Boolean current=false] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final Boolean ruleAddition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean this_Multiplication_0 = null;

        Boolean lv_right_5_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1696:1: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // PsiInternalCalculatorForm.g:1697:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // PsiInternalCalculatorForm.g:1697:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // PsiInternalCalculatorForm.g:1698:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getAddition_MultiplicationParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_52);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			doneComposite();
              		
            }
            // PsiInternalCalculatorForm.g:1706:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=38 && LA56_0<=39)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1707:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // PsiInternalCalculatorForm.g:1707:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==38) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==39) ) {
            	        alt55=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // PsiInternalCalculatorForm.g:1708:5: ( () otherlv_2= '+' )
            	            {
            	            // PsiInternalCalculatorForm.g:1708:5: ( () otherlv_2= '+' )
            	            // PsiInternalCalculatorForm.g:1709:6: () otherlv_2= '+'
            	            {
            	            // PsiInternalCalculatorForm.g:1709:6: ()
            	            // PsiInternalCalculatorForm.g:1710:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getAddition_PlusLeftAction_1_0_0_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getAddition_PlusSignKeyword_1_0_0_1ElementType());
            	              					
            	            }
            	            otherlv_2=(Token)match(input,38,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_2);
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalCalculatorForm.g:1725:5: ( () otherlv_4= '-' )
            	            {
            	            // PsiInternalCalculatorForm.g:1725:5: ( () otherlv_4= '-' )
            	            // PsiInternalCalculatorForm.g:1726:6: () otherlv_4= '-'
            	            {
            	            // PsiInternalCalculatorForm.g:1726:6: ()
            	            // PsiInternalCalculatorForm.g:1727:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getAddition_MinusLeftAction_1_0_1_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getAddition_HyphenMinusKeyword_1_0_1_1ElementType());
            	              					
            	            }
            	            otherlv_4=(Token)match(input,39,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_4);
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // PsiInternalCalculatorForm.g:1742:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // PsiInternalCalculatorForm.g:1743:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // PsiInternalCalculatorForm.g:1743:5: (lv_right_5_0= ruleMultiplication )
            	    // PsiInternalCalculatorForm.g:1744:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getAddition_RightMultiplicationParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // PsiInternalCalculatorForm.g:1762:1: entryRuleMultiplication returns [Boolean current=false] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final Boolean entryRuleMultiplication() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMultiplication = null;


        try {
            // PsiInternalCalculatorForm.g:1762:56: (iv_ruleMultiplication= ruleMultiplication EOF )
            // PsiInternalCalculatorForm.g:1763:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMultiplicationElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // PsiInternalCalculatorForm.g:1769:1: ruleMultiplication returns [Boolean current=false] : (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) ;
    public final Boolean ruleMultiplication() throws RecognitionException {
        Boolean current = false;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Boolean this_Prefixed_0 = null;

        Boolean lv_right_3_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1770:1: ( (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) )
            // PsiInternalCalculatorForm.g:1771:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            {
            // PsiInternalCalculatorForm.g:1771:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            // PsiInternalCalculatorForm.g:1772:3: this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getMultiplication_PrefixedParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_53);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Prefixed_0;
              			doneComposite();
              		
            }
            // PsiInternalCalculatorForm.g:1780:3: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=40 && LA58_0<=41)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1781:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) )
            	    {
            	    // PsiInternalCalculatorForm.g:1781:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) )
            	    // PsiInternalCalculatorForm.g:1782:5: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    {
            	    // PsiInternalCalculatorForm.g:1782:5: ()
            	    // PsiInternalCalculatorForm.g:1783:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						precedeComposite(elementTypeProvider.getMultiplication_MultiOrDivLeftAction_1_0_0ElementType());
            	      						doneComposite();
            	      						associateWithSemanticElement();
            	      					
            	    }

            	    }

            	    // PsiInternalCalculatorForm.g:1789:5: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // PsiInternalCalculatorForm.g:1790:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // PsiInternalCalculatorForm.g:1790:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // PsiInternalCalculatorForm.g:1791:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // PsiInternalCalculatorForm.g:1791:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==40) ) {
            	        alt57=1;
            	    }
            	    else if ( (LA57_0==41) ) {
            	        alt57=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // PsiInternalCalculatorForm.g:1792:8: lv_op_2_1= '*'
            	            {
            	            if ( state.backtracking==0 ) {

            	              								markLeaf(elementTypeProvider.getMultiplication_OpAsteriskKeyword_1_0_1_0_0ElementType());
            	              							
            	            }
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								doneLeaf(lv_op_2_1);
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (!current) {
            	              									associateWithSemanticElement();
            	              									current = true;
            	              								}
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalCalculatorForm.g:1806:8: lv_op_2_2= '/'
            	            {
            	            if ( state.backtracking==0 ) {

            	              								markLeaf(elementTypeProvider.getMultiplication_OpSolidusKeyword_1_0_1_0_1ElementType());
            	              							
            	            }
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								doneLeaf(lv_op_2_2);
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (!current) {
            	              									associateWithSemanticElement();
            	              									current = true;
            	              								}
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // PsiInternalCalculatorForm.g:1823:4: ( (lv_right_3_0= rulePrefixed ) )
            	    // PsiInternalCalculatorForm.g:1824:5: (lv_right_3_0= rulePrefixed )
            	    {
            	    // PsiInternalCalculatorForm.g:1824:5: (lv_right_3_0= rulePrefixed )
            	    // PsiInternalCalculatorForm.g:1825:6: lv_right_3_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getMultiplication_RightPrefixedParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_right_3_0=rulePrefixed();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrefixed"
    // PsiInternalCalculatorForm.g:1843:1: entryRulePrefixed returns [Boolean current=false] : iv_rulePrefixed= rulePrefixed EOF ;
    public final Boolean entryRulePrefixed() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePrefixed = null;


        try {
            // PsiInternalCalculatorForm.g:1843:50: (iv_rulePrefixed= rulePrefixed EOF )
            // PsiInternalCalculatorForm.g:1844:2: iv_rulePrefixed= rulePrefixed EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPrefixedElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixed=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixed; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixed"


    // $ANTLR start "rulePrefixed"
    // PsiInternalCalculatorForm.g:1850:1: rulePrefixed returns [Boolean current=false] : ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final Boolean rulePrefixed() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Boolean lv_expression_2_0 = null;

        Boolean lv_expression_5_0 = null;

        Boolean this_Atomic_6 = null;


        try {
            // PsiInternalCalculatorForm.g:1851:1: ( ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) )
            // PsiInternalCalculatorForm.g:1852:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // PsiInternalCalculatorForm.g:1852:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt59=1;
                }
                break;
            case 39:
                {
                alt59=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 43:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1853:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // PsiInternalCalculatorForm.g:1853:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // PsiInternalCalculatorForm.g:1854:4: () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // PsiInternalCalculatorForm.g:1854:4: ()
                    // PsiInternalCalculatorForm.g:1855:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrefixed_BooleanNegationAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:1861:4: ( ( '!' )=>otherlv_1= '!' )
                    // PsiInternalCalculatorForm.g:1862:5: ( '!' )=>otherlv_1= '!'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getPrefixed_ExclamationMarkKeyword_0_1ElementType());
                      				
                    }
                    otherlv_1=(Token)match(input,42,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_1);
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:1871:4: ( (lv_expression_2_0= ruleAtomic ) )
                    // PsiInternalCalculatorForm.g:1872:5: (lv_expression_2_0= ruleAtomic )
                    {
                    // PsiInternalCalculatorForm.g:1872:5: (lv_expression_2_0= ruleAtomic )
                    // PsiInternalCalculatorForm.g:1873:6: lv_expression_2_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPrefixed_ExpressionAtomicParserRuleCall_0_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:1888:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    {
                    // PsiInternalCalculatorForm.g:1888:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    // PsiInternalCalculatorForm.g:1889:4: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) )
                    {
                    // PsiInternalCalculatorForm.g:1889:4: ()
                    // PsiInternalCalculatorForm.g:1890:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrefixed_ArithmeticSignedAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:1896:4: ( ( '-' )=>otherlv_4= '-' )
                    // PsiInternalCalculatorForm.g:1897:5: ( '-' )=>otherlv_4= '-'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getPrefixed_HyphenMinusKeyword_1_1ElementType());
                      				
                    }
                    otherlv_4=(Token)match(input,39,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_4);
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:1906:4: ( (lv_expression_5_0= ruleAtomic ) )
                    // PsiInternalCalculatorForm.g:1907:5: (lv_expression_5_0= ruleAtomic )
                    {
                    // PsiInternalCalculatorForm.g:1907:5: (lv_expression_5_0= ruleAtomic )
                    // PsiInternalCalculatorForm.g:1908:6: lv_expression_5_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPrefixed_ExpressionAtomicParserRuleCall_1_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalCalculatorForm.g:1923:3: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPrefixed_AtomicParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_6;
                      			doneComposite();
                      		
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixed"


    // $ANTLR start "entryRuleAtomic"
    // PsiInternalCalculatorForm.g:1935:1: entryRuleAtomic returns [Boolean current=false] : iv_ruleAtomic= ruleAtomic EOF ;
    public final Boolean entryRuleAtomic() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAtomic = null;


        try {
            // PsiInternalCalculatorForm.g:1935:48: (iv_ruleAtomic= ruleAtomic EOF )
            // PsiInternalCalculatorForm.g:1936:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getAtomicElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // PsiInternalCalculatorForm.g:1942:1: ruleAtomic returns [Boolean current=false] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) ;
    public final Boolean ruleAtomic() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        Boolean this_Expression_1 = null;


        try {
            // PsiInternalCalculatorForm.g:1943:1: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) )
            // PsiInternalCalculatorForm.g:1944:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            {
            // PsiInternalCalculatorForm.g:1944:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt60=1;
                }
                break;
            case RULE_INT:
                {
                alt60=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt60=3;
                }
                break;
            case RULE_ID:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1945:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // PsiInternalCalculatorForm.g:1945:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // PsiInternalCalculatorForm.g:1946:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getAtomic_LeftParenthesisKeyword_0_0ElementType());
                      			
                    }
                    otherlv_0=(Token)match(input,43,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getAtomic_ExpressionParserRuleCall_0_1ElementType());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				doneComposite();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getAtomic_RightParenthesisKeyword_0_2ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:1970:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // PsiInternalCalculatorForm.g:1970:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // PsiInternalCalculatorForm.g:1971:4: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // PsiInternalCalculatorForm.g:1971:4: ()
                    // PsiInternalCalculatorForm.g:1972:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getAtomic_NumberLiteralAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:1978:4: ( (lv_value_4_0= RULE_INT ) )
                    // PsiInternalCalculatorForm.g:1979:5: (lv_value_4_0= RULE_INT )
                    {
                    // PsiInternalCalculatorForm.g:1979:5: (lv_value_4_0= RULE_INT )
                    // PsiInternalCalculatorForm.g:1980:6: lv_value_4_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getAtomic_ValueINTTerminalRuleCall_1_1_0ElementType());
                      					
                    }
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_4_0);
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalCalculatorForm.g:1997:3: ( () ( (lv_value_6_0= RULE_FLOAT ) ) )
                    {
                    // PsiInternalCalculatorForm.g:1997:3: ( () ( (lv_value_6_0= RULE_FLOAT ) ) )
                    // PsiInternalCalculatorForm.g:1998:4: () ( (lv_value_6_0= RULE_FLOAT ) )
                    {
                    // PsiInternalCalculatorForm.g:1998:4: ()
                    // PsiInternalCalculatorForm.g:1999:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getAtomic_FloatLiteralAction_2_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2005:4: ( (lv_value_6_0= RULE_FLOAT ) )
                    // PsiInternalCalculatorForm.g:2006:5: (lv_value_6_0= RULE_FLOAT )
                    {
                    // PsiInternalCalculatorForm.g:2006:5: (lv_value_6_0= RULE_FLOAT )
                    // PsiInternalCalculatorForm.g:2007:6: lv_value_6_0= RULE_FLOAT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getAtomic_ValueFLOATTerminalRuleCall_2_1_0ElementType());
                      					
                    }
                    lv_value_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_6_0);
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalCalculatorForm.g:2024:3: ( () ( ( ruleQualifiedName ) ) )
                    {
                    // PsiInternalCalculatorForm.g:2024:3: ( () ( ( ruleQualifiedName ) ) )
                    // PsiInternalCalculatorForm.g:2025:4: () ( ( ruleQualifiedName ) )
                    {
                    // PsiInternalCalculatorForm.g:2025:4: ()
                    // PsiInternalCalculatorForm.g:2026:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getAtomic_FieldReferenceAction_3_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2032:4: ( ( ruleQualifiedName ) )
                    // PsiInternalCalculatorForm.g:2033:5: ( ruleQualifiedName )
                    {
                    // PsiInternalCalculatorForm.g:2033:5: ( ruleQualifiedName )
                    // PsiInternalCalculatorForm.g:2034:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getAtomic_RefFieldCrossReference_3_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000F40201002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FE002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001FC002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C9E000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C9C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001C98000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001C90000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001C80000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001880000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000026000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018104002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000018100002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010100002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000815FE002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000815FC002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000015FC002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000015F8002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000015F0002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000015E0002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000011E0002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000011C0002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000001180002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000801C6002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000801C4002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000000001C4002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000442201000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000542201000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000106002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000104002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000C80000000D0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000000000L});

}