package de.htwg.zeta.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwg.zeta.xtext.services.CalculatorFormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCalculatorFormParser extends AbstractInternalAntlrParser {
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


        public InternalCalculatorFormParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCalculatorFormParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCalculatorFormParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCalculatorForm.g"; }



     	private CalculatorFormGrammarAccess grammarAccess;

        public InternalCalculatorFormParser(TokenStream input, CalculatorFormGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CalculatorFormGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCalculatorForm.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCalculatorForm.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCalculatorForm.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCalculatorForm.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_formElements_0_0 = null;

        EObject lv_calculations_1_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:77:2: ( ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* ) )
            // InternalCalculatorForm.g:78:2: ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* )
            {
            // InternalCalculatorForm.g:78:2: ( ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )* )
            // InternalCalculatorForm.g:79:3: ( (lv_formElements_0_0= ruleFormElement ) )* ( (lv_calculations_1_0= ruleCalculate ) )*
            {
            // InternalCalculatorForm.g:79:3: ( (lv_formElements_0_0= ruleFormElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==21||LA1_0==30||(LA1_0>=32 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculatorForm.g:80:4: (lv_formElements_0_0= ruleFormElement )
            	    {
            	    // InternalCalculatorForm.g:80:4: (lv_formElements_0_0= ruleFormElement )
            	    // InternalCalculatorForm.g:81:5: lv_formElements_0_0= ruleFormElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getFormElementsFormElementParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_formElements_0_0=ruleFormElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"formElements",
            	      						lv_formElements_0_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.FormElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCalculatorForm.g:98:3: ( (lv_calculations_1_0= ruleCalculate ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCalculatorForm.g:99:4: (lv_calculations_1_0= ruleCalculate )
            	    {
            	    // InternalCalculatorForm.g:99:4: (lv_calculations_1_0= ruleCalculate )
            	    // InternalCalculatorForm.g:100:5: lv_calculations_1_0= ruleCalculate
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getCalculationsCalculateParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_calculations_1_0=ruleCalculate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"calculations",
            	      						lv_calculations_1_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.Calculate");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFormElement"
    // InternalCalculatorForm.g:121:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // InternalCalculatorForm.g:121:52: (iv_ruleFormElement= ruleFormElement EOF )
            // InternalCalculatorForm.g:122:2: iv_ruleFormElement= ruleFormElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormElementRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormElement"


    // $ANTLR start "ruleFormElement"
    // InternalCalculatorForm.g:128:1: ruleFormElement returns [EObject current=null] : (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Group_1 = null;

        EObject this_Page_2 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:134:2: ( (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) )
            // InternalCalculatorForm.g:135:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            {
            // InternalCalculatorForm.g:135:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
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
                    // InternalCalculatorForm.g:136:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFormElementAccess().getFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:145:3: this_Group_1= ruleGroup
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFormElementAccess().getGroupParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Group_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:154:3: this_Page_2= rulePage
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFormElementAccess().getPageParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Page_2=rulePage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Page_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormElement"


    // $ANTLR start "entryRuleField"
    // InternalCalculatorForm.g:166:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalCalculatorForm.g:166:46: (iv_ruleField= ruleField EOF )
            // InternalCalculatorForm.g:167:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalCalculatorForm.g:173:1: ruleField returns [EObject current=null] : (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_FieldInput_0 = null;

        EObject this_FieldSelect_1 = null;

        EObject this_FieldChoice_2 = null;

        EObject this_Button_3 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:179:2: ( (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) )
            // InternalCalculatorForm.g:180:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            {
            // InternalCalculatorForm.g:180:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
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
                    // InternalCalculatorForm.g:181:3: this_FieldInput_0= ruleFieldInput
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFieldAccess().getFieldInputParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldInput_0=ruleFieldInput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldInput_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:190:3: this_FieldSelect_1= ruleFieldSelect
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFieldAccess().getFieldSelectParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldSelect_1=ruleFieldSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldSelect_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:199:3: this_FieldChoice_2= ruleFieldChoice
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFieldAccess().getFieldChoiceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldChoice_2=ruleFieldChoice();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldChoice_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCalculatorForm.g:208:3: this_Button_3= ruleButton
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFieldAccess().getButtonParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Button_3=ruleButton();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Button_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldInput"
    // InternalCalculatorForm.g:220:1: entryRuleFieldInput returns [EObject current=null] : iv_ruleFieldInput= ruleFieldInput EOF ;
    public final EObject entryRuleFieldInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInput = null;


        try {
            // InternalCalculatorForm.g:220:51: (iv_ruleFieldInput= ruleFieldInput EOF )
            // InternalCalculatorForm.g:221:2: iv_ruleFieldInput= ruleFieldInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldInputRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldInput"


    // $ANTLR start "ruleFieldInput"
    // InternalCalculatorForm.g:227:1: ruleFieldInput returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFieldInput() throws RecognitionException {
        EObject current = null;

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


        	enterRule();

        try {
            // InternalCalculatorForm.g:233:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:234:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:234:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:235:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldInputAccess().getFieldKeyword_0());
              		
            }
            // InternalCalculatorForm.g:239:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:240:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:240:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:241:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFieldInputAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldInputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ID");
              				
            }

            }


            }

            // InternalCalculatorForm.g:257:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCalculatorForm.g:258:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:258:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:259:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldInputRule());
                      					}
                      					setWithLastConsumed(current, "autofocus", true, "autofocus");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:271:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculatorForm.g:272:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:272:4: (lv_disabled_3_0= 'disabled' )
                    // InternalCalculatorForm.g:273:5: lv_disabled_3_0= 'disabled'
                    {
                    lv_disabled_3_0=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_disabled_3_0, grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldInputRule());
                      					}
                      					setWithLastConsumed(current, "disabled", true, "disabled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:285:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCalculatorForm.g:286:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFieldInputAccess().getFormKeyword_4_0());
                      			
                    }
                    // InternalCalculatorForm.g:290:4: ( (lv_form_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:291:5: (lv_form_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:291:5: (lv_form_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:292:6: lv_form_5_0= RULE_STRING
                    {
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_form_5_0, grammarAccess.getFieldInputAccess().getFormSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldInputRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"form",
                      							lv_form_5_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:309:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculatorForm.g:310:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFieldInputAccess().getLabelKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:314:4: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:315:5: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:315:5: (lv_label_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:316:6: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_7_0, grammarAccess.getFieldInputAccess().getLabelSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldInputRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_7_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:333:3: ( (lv_notdisplayed_8_0= 'notdisplayed' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCalculatorForm.g:334:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    {
                    // InternalCalculatorForm.g:334:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    // InternalCalculatorForm.g:335:5: lv_notdisplayed_8_0= 'notdisplayed'
                    {
                    lv_notdisplayed_8_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_notdisplayed_8_0, grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldInputRule());
                      					}
                      					setWithLastConsumed(current, "notdisplayed", true, "notdisplayed");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:347:3: ( (lv_readonly_9_0= 'readonly' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCalculatorForm.g:348:4: (lv_readonly_9_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:348:4: (lv_readonly_9_0= 'readonly' )
                    // InternalCalculatorForm.g:349:5: lv_readonly_9_0= 'readonly'
                    {
                    lv_readonly_9_0=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_readonly_9_0, grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldInputRule());
                      					}
                      					setWithLastConsumed(current, "readonly", true, "readonly");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:361:3: ( (lv_required_10_0= 'required' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:362:4: (lv_required_10_0= 'required' )
                    {
                    // InternalCalculatorForm.g:362:4: (lv_required_10_0= 'required' )
                    // InternalCalculatorForm.g:363:5: lv_required_10_0= 'required'
                    {
                    lv_required_10_0=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_required_10_0, grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldInputRule());
                      					}
                      					setWithLastConsumed(current, "required", true, "required");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:375:3: (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCalculatorForm.g:376:4: otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFieldInputAccess().getValueKeyword_9_0());
                      			
                    }
                    // InternalCalculatorForm.g:380:4: ( (lv_value_12_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:381:5: (lv_value_12_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:381:5: (lv_value_12_0= RULE_STRING )
                    // InternalCalculatorForm.g:382:6: lv_value_12_0= RULE_STRING
                    {
                    lv_value_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_12_0, grammarAccess.getFieldInputAccess().getValueSTRINGTerminalRuleCall_9_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldInputRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_12_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldInput"


    // $ANTLR start "entryRuleFieldSelect"
    // InternalCalculatorForm.g:403:1: entryRuleFieldSelect returns [EObject current=null] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final EObject entryRuleFieldSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelect = null;


        try {
            // InternalCalculatorForm.g:403:52: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // InternalCalculatorForm.g:404:2: iv_ruleFieldSelect= ruleFieldSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldSelectRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldSelect"


    // $ANTLR start "ruleFieldSelect"
    // InternalCalculatorForm.g:410:1: ruleFieldSelect returns [EObject current=null] : (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) ;
    public final EObject ruleFieldSelect() throws RecognitionException {
        EObject current = null;

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
        EObject lv_childs_13_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:416:2: ( (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) )
            // InternalCalculatorForm.g:417:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            {
            // InternalCalculatorForm.g:417:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            // InternalCalculatorForm.g:418:3: otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldSelectAccess().getDropdownKeyword_0());
              		
            }
            // InternalCalculatorForm.g:422:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:423:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:423:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:424:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFieldSelectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldSelectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ID");
              				
            }

            }


            }

            // InternalCalculatorForm.g:440:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculatorForm.g:441:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:441:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:442:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldSelectRule());
                      					}
                      					setWithLastConsumed(current, "autofocus", true, "autofocus");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:454:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCalculatorForm.g:455:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:455:4: (lv_disabled_3_0= 'disabled' )
                    // InternalCalculatorForm.g:456:5: lv_disabled_3_0= 'disabled'
                    {
                    lv_disabled_3_0=(Token)match(input,14,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_disabled_3_0, grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldSelectRule());
                      					}
                      					setWithLastConsumed(current, "disabled", true, "disabled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:468:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatorForm.g:469:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFieldSelectAccess().getFormKeyword_4_0());
                      			
                    }
                    // InternalCalculatorForm.g:473:4: ( (lv_form_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:474:5: (lv_form_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:474:5: (lv_form_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:475:6: lv_form_5_0= RULE_STRING
                    {
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_form_5_0, grammarAccess.getFieldSelectAccess().getFormSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldSelectRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"form",
                      							lv_form_5_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:492:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculatorForm.g:493:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:497:4: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:498:5: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:498:5: (lv_label_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:499:6: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_7_0, grammarAccess.getFieldSelectAccess().getLabelSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldSelectRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_7_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:516:3: ( (lv_multiple_8_0= 'multiple' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCalculatorForm.g:517:4: (lv_multiple_8_0= 'multiple' )
                    {
                    // InternalCalculatorForm.g:517:4: (lv_multiple_8_0= 'multiple' )
                    // InternalCalculatorForm.g:518:5: lv_multiple_8_0= 'multiple'
                    {
                    lv_multiple_8_0=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_multiple_8_0, grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldSelectRule());
                      					}
                      					setWithLastConsumed(current, "multiple", true, "multiple");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:530:3: ( (lv_required_9_0= 'required' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculatorForm.g:531:4: (lv_required_9_0= 'required' )
                    {
                    // InternalCalculatorForm.g:531:4: (lv_required_9_0= 'required' )
                    // InternalCalculatorForm.g:532:5: lv_required_9_0= 'required'
                    {
                    lv_required_9_0=(Token)match(input,19,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_required_9_0, grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldSelectRule());
                      					}
                      					setWithLastConsumed(current, "required", true, "required");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:544:3: (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCalculatorForm.g:545:4: otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0());
                      			
                    }
                    // InternalCalculatorForm.g:549:4: ( (lv_size_11_0= RULE_INT ) )
                    // InternalCalculatorForm.g:550:5: (lv_size_11_0= RULE_INT )
                    {
                    // InternalCalculatorForm.g:550:5: (lv_size_11_0= RULE_INT )
                    // InternalCalculatorForm.g:551:6: lv_size_11_0= RULE_INT
                    {
                    lv_size_11_0=(Token)match(input,RULE_INT,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_size_11_0, grammarAccess.getFieldSelectAccess().getSizeINTTerminalRuleCall_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldSelectRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"size",
                      							lv_size_11_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.INT");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9());
              		
            }
            // InternalCalculatorForm.g:572:3: ( (lv_childs_13_0= ruleFieldSelectChild ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26||LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCalculatorForm.g:573:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    {
            	    // InternalCalculatorForm.g:573:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    // InternalCalculatorForm.g:574:5: lv_childs_13_0= ruleFieldSelectChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFieldSelectAccess().getChildsFieldSelectChildParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_childs_13_0=ruleFieldSelectChild();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFieldSelectRule());
            	      					}
            	      					add(
            	      						current,
            	      						"childs",
            	      						lv_childs_13_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.FieldSelectChild");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_14=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getFieldSelectAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldSelect"


    // $ANTLR start "entryRuleFieldSelectChild"
    // InternalCalculatorForm.g:599:1: entryRuleFieldSelectChild returns [EObject current=null] : iv_ruleFieldSelectChild= ruleFieldSelectChild EOF ;
    public final EObject entryRuleFieldSelectChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelectChild = null;


        try {
            // InternalCalculatorForm.g:599:57: (iv_ruleFieldSelectChild= ruleFieldSelectChild EOF )
            // InternalCalculatorForm.g:600:2: iv_ruleFieldSelectChild= ruleFieldSelectChild EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldSelectChildRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldSelectChild"


    // $ANTLR start "ruleFieldSelectChild"
    // InternalCalculatorForm.g:606:1: ruleFieldSelectChild returns [EObject current=null] : (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) ;
    public final EObject ruleFieldSelectChild() throws RecognitionException {
        EObject current = null;

        EObject this_FieldOption_0 = null;

        EObject this_FieldOptionGroup_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:612:2: ( (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) )
            // InternalCalculatorForm.g:613:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            {
            // InternalCalculatorForm.g:613:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
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
                    // InternalCalculatorForm.g:614:3: this_FieldOption_0= ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFieldSelectChildAccess().getFieldOptionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldOption_0=ruleFieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldOption_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:623:3: this_FieldOptionGroup_1= ruleFieldOptionGroup
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFieldSelectChildAccess().getFieldOptionGroupParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldOptionGroup_1=ruleFieldOptionGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FieldOptionGroup_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldSelectChild"


    // $ANTLR start "entryRuleFieldOption"
    // InternalCalculatorForm.g:635:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // InternalCalculatorForm.g:635:52: (iv_ruleFieldOption= ruleFieldOption EOF )
            // InternalCalculatorForm.g:636:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldOption"


    // $ANTLR start "ruleFieldOption"
    // InternalCalculatorForm.g:642:1: ruleFieldOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFieldOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token lv_disabled_2_0=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token lv_text_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;


        	enterRule();

        try {
            // InternalCalculatorForm.g:648:2: ( (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:649:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:649:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:650:3: otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldOptionAccess().getOptionKeyword_0());
              		
            }
            // InternalCalculatorForm.g:654:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalCalculatorForm.g:655:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:655:4: (lv_text_1_0= RULE_STRING )
            // InternalCalculatorForm.g:656:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_1_0, grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldOptionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.STRING");
              				
            }

            }


            }

            // InternalCalculatorForm.g:672:3: ( (lv_disabled_2_0= 'disabled' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCalculatorForm.g:673:4: (lv_disabled_2_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:673:4: (lv_disabled_2_0= 'disabled' )
                    // InternalCalculatorForm.g:674:5: lv_disabled_2_0= 'disabled'
                    {
                    lv_disabled_2_0=(Token)match(input,14,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_disabled_2_0, grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldOptionRule());
                      					}
                      					setWithLastConsumed(current, "disabled", true, "disabled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:686:3: ( (lv_selected_3_0= 'selected' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCalculatorForm.g:687:4: (lv_selected_3_0= 'selected' )
                    {
                    // InternalCalculatorForm.g:687:4: (lv_selected_3_0= 'selected' )
                    // InternalCalculatorForm.g:688:5: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,27,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_selected_3_0, grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldOptionRule());
                      					}
                      					setWithLastConsumed(current, "selected", true, "selected");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:700:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCalculatorForm.g:701:4: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFieldOptionAccess().getTextKeyword_4_0());
                      			
                    }
                    // InternalCalculatorForm.g:705:4: ( (lv_text_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:706:5: (lv_text_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:706:5: (lv_text_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:707:6: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_text_5_0, grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldOptionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"text",
                      							lv_text_5_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:724:3: (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCalculatorForm.g:725:4: otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFieldOptionAccess().getValueKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:729:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:730:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:730:5: (lv_value_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:731:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_7_0, grammarAccess.getFieldOptionAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldOptionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldOption"


    // $ANTLR start "entryRuleFieldOptionGroup"
    // InternalCalculatorForm.g:752:1: entryRuleFieldOptionGroup returns [EObject current=null] : iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF ;
    public final EObject entryRuleFieldOptionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptionGroup = null;


        try {
            // InternalCalculatorForm.g:752:57: (iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF )
            // InternalCalculatorForm.g:753:2: iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldOptionGroupRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldOptionGroup"


    // $ANTLR start "ruleFieldOptionGroup"
    // InternalCalculatorForm.g:759:1: ruleFieldOptionGroup returns [EObject current=null] : (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) ;
    public final EObject ruleFieldOptionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_disabled_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_options_5_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:765:2: ( (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) )
            // InternalCalculatorForm.g:766:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            {
            // InternalCalculatorForm.g:766:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            // InternalCalculatorForm.g:767:3: otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0());
              		
            }
            // InternalCalculatorForm.g:771:3: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCalculatorForm.g:772:4: (lv_disabled_1_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:772:4: (lv_disabled_1_0= 'disabled' )
                    // InternalCalculatorForm.g:773:5: lv_disabled_1_0= 'disabled'
                    {
                    lv_disabled_1_0=(Token)match(input,14,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_disabled_1_0, grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldOptionGroupRule());
                      					}
                      					setWithLastConsumed(current, "disabled", true, "disabled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:785:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCalculatorForm.g:786:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0());
                      			
                    }
                    // InternalCalculatorForm.g:790:4: ( (lv_label_3_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:791:5: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:791:5: (lv_label_3_0= RULE_STRING )
                    // InternalCalculatorForm.g:792:6: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_3_0, grammarAccess.getFieldOptionGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldOptionGroupRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_3_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCalculatorForm.g:813:3: ( (lv_options_5_0= ruleFieldOption ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==26) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCalculatorForm.g:814:4: (lv_options_5_0= ruleFieldOption )
            	    {
            	    // InternalCalculatorForm.g:814:4: (lv_options_5_0= ruleFieldOption )
            	    // InternalCalculatorForm.g:815:5: lv_options_5_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFieldOptionGroupAccess().getOptionsFieldOptionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_options_5_0=ruleFieldOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFieldOptionGroupRule());
            	      					}
            	      					add(
            	      						current,
            	      						"options",
            	      						lv_options_5_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.FieldOption");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFieldOptionGroupAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldOptionGroup"


    // $ANTLR start "entryRuleFieldChoice"
    // InternalCalculatorForm.g:840:1: entryRuleFieldChoice returns [EObject current=null] : iv_ruleFieldChoice= ruleFieldChoice EOF ;
    public final EObject entryRuleFieldChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldChoice = null;


        try {
            // InternalCalculatorForm.g:840:52: (iv_ruleFieldChoice= ruleFieldChoice EOF )
            // InternalCalculatorForm.g:841:2: iv_ruleFieldChoice= ruleFieldChoice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldChoiceRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldChoice"


    // $ANTLR start "ruleFieldChoice"
    // InternalCalculatorForm.g:847:1: ruleFieldChoice returns [EObject current=null] : (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) ;
    public final EObject ruleFieldChoice() throws RecognitionException {
        EObject current = null;

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
        EObject lv_options_16_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:853:2: ( (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) )
            // InternalCalculatorForm.g:854:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            {
            // InternalCalculatorForm.g:854:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            // InternalCalculatorForm.g:855:3: otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0());
              		
            }
            // InternalCalculatorForm.g:859:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:860:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:860:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:861:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFieldChoiceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldChoiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ID");
              				
            }

            }


            }

            // InternalCalculatorForm.g:877:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCalculatorForm.g:878:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:878:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:879:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceRule());
                      					}
                      					setWithLastConsumed(current, "autofocus", true, "autofocus");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:891:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCalculatorForm.g:892:4: (lv_checked_3_0= 'checked' )
                    {
                    // InternalCalculatorForm.g:892:4: (lv_checked_3_0= 'checked' )
                    // InternalCalculatorForm.g:893:5: lv_checked_3_0= 'checked'
                    {
                    lv_checked_3_0=(Token)match(input,31,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_checked_3_0, grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceRule());
                      					}
                      					setWithLastConsumed(current, "checked", true, "checked");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:905:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCalculatorForm.g:906:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:906:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:907:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_disabled_4_0, grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceRule());
                      					}
                      					setWithLastConsumed(current, "disabled", true, "disabled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:919:3: (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCalculatorForm.g:920:4: otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:924:4: ( (lv_form_6_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:925:5: (lv_form_6_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:925:5: (lv_form_6_0= RULE_STRING )
                    // InternalCalculatorForm.g:926:6: lv_form_6_0= RULE_STRING
                    {
                    lv_form_6_0=(Token)match(input,RULE_STRING,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_form_6_0, grammarAccess.getFieldChoiceAccess().getFormSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldChoiceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"form",
                      							lv_form_6_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:943:3: (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCalculatorForm.g:944:4: otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0());
                      			
                    }
                    // InternalCalculatorForm.g:948:4: ( (lv_label_8_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:949:5: (lv_label_8_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:949:5: (lv_label_8_0= RULE_STRING )
                    // InternalCalculatorForm.g:950:6: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_8_0, grammarAccess.getFieldChoiceAccess().getLabelSTRINGTerminalRuleCall_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldChoiceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_8_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:967:3: ( (lv_multiple_9_0= 'multiple' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCalculatorForm.g:968:4: (lv_multiple_9_0= 'multiple' )
                    {
                    // InternalCalculatorForm.g:968:4: (lv_multiple_9_0= 'multiple' )
                    // InternalCalculatorForm.g:969:5: lv_multiple_9_0= 'multiple'
                    {
                    lv_multiple_9_0=(Token)match(input,22,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_multiple_9_0, grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceRule());
                      					}
                      					setWithLastConsumed(current, "multiple", true, "multiple");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:981:3: ( (lv_notdisplayed_10_0= 'notdisplayed' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCalculatorForm.g:982:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    {
                    // InternalCalculatorForm.g:982:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    // InternalCalculatorForm.g:983:5: lv_notdisplayed_10_0= 'notdisplayed'
                    {
                    lv_notdisplayed_10_0=(Token)match(input,17,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_notdisplayed_10_0, grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceRule());
                      					}
                      					setWithLastConsumed(current, "notdisplayed", true, "notdisplayed");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:995:3: ( (lv_readonly_11_0= 'readonly' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCalculatorForm.g:996:4: (lv_readonly_11_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:996:4: (lv_readonly_11_0= 'readonly' )
                    // InternalCalculatorForm.g:997:5: lv_readonly_11_0= 'readonly'
                    {
                    lv_readonly_11_0=(Token)match(input,18,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_readonly_11_0, grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceRule());
                      					}
                      					setWithLastConsumed(current, "readonly", true, "readonly");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1009:3: ( (lv_required_12_0= 'required' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCalculatorForm.g:1010:4: (lv_required_12_0= 'required' )
                    {
                    // InternalCalculatorForm.g:1010:4: (lv_required_12_0= 'required' )
                    // InternalCalculatorForm.g:1011:5: lv_required_12_0= 'required'
                    {
                    lv_required_12_0=(Token)match(input,19,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_required_12_0, grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceRule());
                      					}
                      					setWithLastConsumed(current, "required", true, "required");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1023:3: (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCalculatorForm.g:1024:4: otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0());
                      			
                    }
                    // InternalCalculatorForm.g:1028:4: ( (lv_value_14_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1029:5: (lv_value_14_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1029:5: (lv_value_14_0= RULE_STRING )
                    // InternalCalculatorForm.g:1030:6: lv_value_14_0= RULE_STRING
                    {
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_14_0, grammarAccess.getFieldChoiceAccess().getValueSTRINGTerminalRuleCall_11_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldChoiceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_14_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1047:3: (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==24) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCalculatorForm.g:1048:4: otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0());
                      			
                    }
                    // InternalCalculatorForm.g:1052:4: ( (lv_options_16_0= ruleFieldChoiceOption ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==26) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalCalculatorForm.g:1053:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    {
                    	    // InternalCalculatorForm.g:1053:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    // InternalCalculatorForm.g:1054:6: lv_options_16_0= ruleFieldChoiceOption
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getFieldChoiceAccess().getOptionsFieldChoiceOptionParserRuleCall_12_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_options_16_0=ruleFieldChoiceOption();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getFieldChoiceRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"options",
                    	      							lv_options_16_0,
                    	      							"de.htwg.zeta.xtext.CalculatorForm.FieldChoiceOption");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldChoice"


    // $ANTLR start "entryRuleFieldChoiceOption"
    // InternalCalculatorForm.g:1080:1: entryRuleFieldChoiceOption returns [EObject current=null] : iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF ;
    public final EObject entryRuleFieldChoiceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldChoiceOption = null;


        try {
            // InternalCalculatorForm.g:1080:58: (iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF )
            // InternalCalculatorForm.g:1081:2: iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldChoiceOptionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldChoiceOption"


    // $ANTLR start "ruleFieldChoiceOption"
    // InternalCalculatorForm.g:1087:1: ruleFieldChoiceOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFieldChoiceOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token lv_autofocus_2_0=null;
        Token lv_checked_3_0=null;
        Token lv_disabled_4_0=null;
        Token lv_readonly_5_0=null;
        Token lv_required_6_0=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;


        	enterRule();

        try {
            // InternalCalculatorForm.g:1093:2: ( (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:1094:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:1094:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:1095:3: otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1099:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalCalculatorForm.g:1100:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:1100:4: (lv_label_1_0= RULE_STRING )
            // InternalCalculatorForm.g:1101:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_label_1_0, grammarAccess.getFieldChoiceOptionAccess().getLabelSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"label",
              						lv_label_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.STRING");
              				
            }

            }


            }

            // InternalCalculatorForm.g:1117:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCalculatorForm.g:1118:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:1118:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:1119:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,13,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                      					}
                      					setWithLastConsumed(current, "autofocus", true, "autofocus");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1131:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCalculatorForm.g:1132:4: (lv_checked_3_0= 'checked' )
                    {
                    // InternalCalculatorForm.g:1132:4: (lv_checked_3_0= 'checked' )
                    // InternalCalculatorForm.g:1133:5: lv_checked_3_0= 'checked'
                    {
                    lv_checked_3_0=(Token)match(input,31,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_checked_3_0, grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                      					}
                      					setWithLastConsumed(current, "checked", true, "checked");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1145:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCalculatorForm.g:1146:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:1146:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:1147:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_disabled_4_0, grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                      					}
                      					setWithLastConsumed(current, "disabled", true, "disabled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1159:3: ( (lv_readonly_5_0= 'readonly' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCalculatorForm.g:1160:4: (lv_readonly_5_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:1160:4: (lv_readonly_5_0= 'readonly' )
                    // InternalCalculatorForm.g:1161:5: lv_readonly_5_0= 'readonly'
                    {
                    lv_readonly_5_0=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_readonly_5_0, grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                      					}
                      					setWithLastConsumed(current, "readonly", true, "readonly");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1173:3: ( (lv_required_6_0= 'required' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCalculatorForm.g:1174:4: (lv_required_6_0= 'required' )
                    {
                    // InternalCalculatorForm.g:1174:4: (lv_required_6_0= 'required' )
                    // InternalCalculatorForm.g:1175:5: lv_required_6_0= 'required'
                    {
                    lv_required_6_0=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_required_6_0, grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                      					}
                      					setWithLastConsumed(current, "required", true, "required");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1187:3: (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCalculatorForm.g:1188:4: otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0());
                      			
                    }
                    // InternalCalculatorForm.g:1192:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1193:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1193:5: (lv_value_8_0= RULE_STRING )
                    // InternalCalculatorForm.g:1194:6: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_8_0, grammarAccess.getFieldChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldChoiceOption"


    // $ANTLR start "entryRuleGroup"
    // InternalCalculatorForm.g:1215:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalCalculatorForm.g:1215:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalCalculatorForm.g:1216:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalCalculatorForm.g:1222:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1228:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // InternalCalculatorForm.g:1229:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // InternalCalculatorForm.g:1229:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // InternalCalculatorForm.g:1230:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:1235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:1235:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:1236:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGroupRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ID");
              				
            }

            }


            }

            // InternalCalculatorForm.g:1252:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCalculatorForm.g:1253:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLabelKeyword_2_0());
                      			
                    }
                    // InternalCalculatorForm.g:1257:4: ( (lv_label_3_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1258:5: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1258:5: (lv_label_3_0= RULE_STRING )
                    // InternalCalculatorForm.g:1259:6: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_label_3_0, grammarAccess.getGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGroupRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"label",
                      							lv_label_3_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCalculatorForm.g:1280:3: ( (lv_fields_5_0= ruleField ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==12||LA48_0==21||LA48_0==30||LA48_0==34) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCalculatorForm.g:1281:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalCalculatorForm.g:1281:4: (lv_fields_5_0= ruleField )
            	    // InternalCalculatorForm.g:1282:5: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGroupAccess().getFieldsFieldParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGroupRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_5_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.Field");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePage"
    // InternalCalculatorForm.g:1307:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalCalculatorForm.g:1307:45: (iv_rulePage= rulePage EOF )
            // InternalCalculatorForm.g:1308:2: iv_rulePage= rulePage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalCalculatorForm.g:1314:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_childs_2_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1320:2: ( (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) )
            // InternalCalculatorForm.g:1321:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            {
            // InternalCalculatorForm.g:1321:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            // InternalCalculatorForm.g:1322:3: otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCalculatorForm.g:1330:3: ( (lv_childs_2_0= rulePageChild ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==12||LA49_0==21||LA49_0==30||LA49_0==32||LA49_0==34) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCalculatorForm.g:1331:4: (lv_childs_2_0= rulePageChild )
            	    {
            	    // InternalCalculatorForm.g:1331:4: (lv_childs_2_0= rulePageChild )
            	    // InternalCalculatorForm.g:1332:5: lv_childs_2_0= rulePageChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPageAccess().getChildsPageChildParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_childs_2_0=rulePageChild();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPageRule());
            	      					}
            	      					add(
            	      						current,
            	      						"childs",
            	      						lv_childs_2_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.PageChild");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRulePageChild"
    // InternalCalculatorForm.g:1357:1: entryRulePageChild returns [EObject current=null] : iv_rulePageChild= rulePageChild EOF ;
    public final EObject entryRulePageChild() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageChild = null;


        try {
            // InternalCalculatorForm.g:1357:50: (iv_rulePageChild= rulePageChild EOF )
            // InternalCalculatorForm.g:1358:2: iv_rulePageChild= rulePageChild EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageChildRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageChild"


    // $ANTLR start "rulePageChild"
    // InternalCalculatorForm.g:1364:1: rulePageChild returns [EObject current=null] : (this_Group_0= ruleGroup | this_Field_1= ruleField ) ;
    public final EObject rulePageChild() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Field_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1370:2: ( (this_Group_0= ruleGroup | this_Field_1= ruleField ) )
            // InternalCalculatorForm.g:1371:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            {
            // InternalCalculatorForm.g:1371:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
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
                    // InternalCalculatorForm.g:1372:3: this_Group_0= ruleGroup
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPageChildAccess().getGroupParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Group_0=ruleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Group_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:1381:3: this_Field_1= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPageChildAccess().getFieldParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_1=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageChild"


    // $ANTLR start "entryRuleButton"
    // InternalCalculatorForm.g:1393:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalCalculatorForm.g:1393:47: (iv_ruleButton= ruleButton EOF )
            // InternalCalculatorForm.g:1394:2: iv_ruleButton= ruleButton EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getButtonRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalCalculatorForm.g:1400:1: ruleButton returns [EObject current=null] : this_ButtonSubmit_0= ruleButtonSubmit ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        EObject this_ButtonSubmit_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1406:2: (this_ButtonSubmit_0= ruleButtonSubmit )
            // InternalCalculatorForm.g:1407:2: this_ButtonSubmit_0= ruleButtonSubmit
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getButtonAccess().getButtonSubmitParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ButtonSubmit_0=ruleButtonSubmit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ButtonSubmit_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonSubmit"
    // InternalCalculatorForm.g:1418:1: entryRuleButtonSubmit returns [EObject current=null] : iv_ruleButtonSubmit= ruleButtonSubmit EOF ;
    public final EObject entryRuleButtonSubmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonSubmit = null;


        try {
            // InternalCalculatorForm.g:1418:53: (iv_ruleButtonSubmit= ruleButtonSubmit EOF )
            // InternalCalculatorForm.g:1419:2: iv_ruleButtonSubmit= ruleButtonSubmit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getButtonSubmitRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButtonSubmit"


    // $ANTLR start "ruleButtonSubmit"
    // InternalCalculatorForm.g:1425:1: ruleButtonSubmit returns [EObject current=null] : (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleButtonSubmit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;
        Token lv_autofocus_3_0=null;
        Token lv_disabled_4_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;


        	enterRule();

        try {
            // InternalCalculatorForm.g:1431:2: ( (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:1432:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:1432:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:1433:3: otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:1438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:1438:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:1439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getButtonSubmitAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getButtonSubmitRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ID");
              				
            }

            }


            }

            // InternalCalculatorForm.g:1455:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalCalculatorForm.g:1456:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:1456:4: (lv_text_2_0= RULE_STRING )
            // InternalCalculatorForm.g:1457:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_2_0, grammarAccess.getButtonSubmitAccess().getTextSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getButtonSubmitRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_2_0,
              						"de.htwg.zeta.xtext.CalculatorForm.STRING");
              				
            }

            }


            }

            // InternalCalculatorForm.g:1473:3: ( (lv_autofocus_3_0= 'autofocus' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCalculatorForm.g:1474:4: (lv_autofocus_3_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:1474:4: (lv_autofocus_3_0= 'autofocus' )
                    // InternalCalculatorForm.g:1475:5: lv_autofocus_3_0= 'autofocus'
                    {
                    lv_autofocus_3_0=(Token)match(input,13,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_autofocus_3_0, grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getButtonSubmitRule());
                      					}
                      					setWithLastConsumed(current, "autofocus", true, "autofocus");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1487:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==14) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCalculatorForm.g:1488:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:1488:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:1489:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,14,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_disabled_4_0, grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getButtonSubmitRule());
                      					}
                      					setWithLastConsumed(current, "disabled", true, "disabled");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1501:3: (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCalculatorForm.g:1502:4: otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:1506:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1507:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1507:5: (lv_value_6_0= RULE_STRING )
                    // InternalCalculatorForm.g:1508:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_6_0, grammarAccess.getButtonSubmitAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getButtonSubmitRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButtonSubmit"


    // $ANTLR start "entryRuleCalculate"
    // InternalCalculatorForm.g:1529:1: entryRuleCalculate returns [EObject current=null] : iv_ruleCalculate= ruleCalculate EOF ;
    public final EObject entryRuleCalculate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculate = null;


        try {
            // InternalCalculatorForm.g:1529:50: (iv_ruleCalculate= ruleCalculate EOF )
            // InternalCalculatorForm.g:1530:2: iv_ruleCalculate= ruleCalculate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCalculateRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalculate"


    // $ANTLR start "ruleCalculate"
    // InternalCalculatorForm.g:1536:1: ruleCalculate returns [EObject current=null] : (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCalculate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1542:2: ( (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalCalculatorForm.g:1543:2: (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalCalculatorForm.g:1543:2: (otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalCalculatorForm.g:1544:3: otherlv_0= 'calculate' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCalculateAccess().getCalculateKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1548:3: ( ( ruleQualifiedName ) )
            // InternalCalculatorForm.g:1549:4: ( ruleQualifiedName )
            {
            // InternalCalculatorForm.g:1549:4: ( ruleQualifiedName )
            // InternalCalculatorForm.g:1550:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCalculateRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCalculateAccess().getResultFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_49);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCalculateAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalCalculatorForm.g:1568:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalCalculatorForm.g:1569:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalCalculatorForm.g:1569:4: (lv_expression_3_0= ruleExpression )
            // InternalCalculatorForm.g:1570:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCalculateAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCalculateRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"de.htwg.zeta.xtext.CalculatorForm.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalculate"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCalculatorForm.g:1591:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCalculatorForm.g:1591:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCalculatorForm.g:1592:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCalculatorForm.g:1598:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCalculatorForm.g:1604:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCalculatorForm.g:1605:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCalculatorForm.g:1605:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCalculatorForm.g:1606:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCalculatorForm.g:1613:3: (kw= '.' this_ID_2= RULE_ID )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==37) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalCalculatorForm.g:1614:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExpression"
    // InternalCalculatorForm.g:1631:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCalculatorForm.g:1631:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCalculatorForm.g:1632:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCalculatorForm.g:1638:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1644:2: (this_Addition_0= ruleAddition )
            // InternalCalculatorForm.g:1645:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Addition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalCalculatorForm.g:1656:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalCalculatorForm.g:1656:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalCalculatorForm.g:1657:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalCalculatorForm.g:1663:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1669:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalCalculatorForm.g:1670:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalCalculatorForm.g:1670:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalCalculatorForm.g:1671:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalculatorForm.g:1679:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=38 && LA56_0<=39)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCalculatorForm.g:1680:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalCalculatorForm.g:1680:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // InternalCalculatorForm.g:1681:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalCalculatorForm.g:1681:5: ( () otherlv_2= '+' )
            	            // InternalCalculatorForm.g:1682:6: () otherlv_2= '+'
            	            {
            	            // InternalCalculatorForm.g:1682:6: ()
            	            // InternalCalculatorForm.g:1683:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,38,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCalculatorForm.g:1695:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalCalculatorForm.g:1695:5: ( () otherlv_4= '-' )
            	            // InternalCalculatorForm.g:1696:6: () otherlv_4= '-'
            	            {
            	            // InternalCalculatorForm.g:1696:6: ()
            	            // InternalCalculatorForm.g:1697:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,39,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCalculatorForm.g:1709:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalCalculatorForm.g:1710:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalCalculatorForm.g:1710:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalCalculatorForm.g:1711:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"de.htwg.zeta.xtext.CalculatorForm.Multiplication");
            	      						afterParserOrEnumRuleCall();
            	      					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalCalculatorForm.g:1733:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalCalculatorForm.g:1733:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalCalculatorForm.g:1734:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalCalculatorForm.g:1740:1: ruleMultiplication returns [EObject current=null] : (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Prefixed_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1746:2: ( (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* ) )
            // InternalCalculatorForm.g:1747:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            {
            // InternalCalculatorForm.g:1747:2: (this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )* )
            // InternalCalculatorForm.g:1748:3: this_Prefixed_0= rulePrefixed ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Prefixed_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalculatorForm.g:1756:3: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=40 && LA58_0<=41)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCalculatorForm.g:1757:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrefixed ) )
            	    {
            	    // InternalCalculatorForm.g:1757:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) )
            	    // InternalCalculatorForm.g:1758:5: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    {
            	    // InternalCalculatorForm.g:1758:5: ()
            	    // InternalCalculatorForm.g:1759:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalCalculatorForm.g:1765:5: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalCalculatorForm.g:1766:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalCalculatorForm.g:1766:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalCalculatorForm.g:1767:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalCalculatorForm.g:1767:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
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
            	            // InternalCalculatorForm.g:1768:8: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,40,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMultiplicationRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCalculatorForm.g:1779:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,41,FOLLOW_50); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMultiplicationRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalCalculatorForm.g:1793:4: ( (lv_right_3_0= rulePrefixed ) )
            	    // InternalCalculatorForm.g:1794:5: (lv_right_3_0= rulePrefixed )
            	    {
            	    // InternalCalculatorForm.g:1794:5: (lv_right_3_0= rulePrefixed )
            	    // InternalCalculatorForm.g:1795:6: lv_right_3_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_right_3_0=rulePrefixed();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"de.htwg.zeta.xtext.CalculatorForm.Prefixed");
            	      						afterParserOrEnumRuleCall();
            	      					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrefixed"
    // InternalCalculatorForm.g:1817:1: entryRulePrefixed returns [EObject current=null] : iv_rulePrefixed= rulePrefixed EOF ;
    public final EObject entryRulePrefixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixed = null;


        try {
            // InternalCalculatorForm.g:1817:49: (iv_rulePrefixed= rulePrefixed EOF )
            // InternalCalculatorForm.g:1818:2: iv_rulePrefixed= rulePrefixed EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixed"


    // $ANTLR start "rulePrefixed"
    // InternalCalculatorForm.g:1824:1: rulePrefixed returns [EObject current=null] : ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrefixed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1830:2: ( ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalCalculatorForm.g:1831:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalCalculatorForm.g:1831:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) | this_Atomic_6= ruleAtomic )
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
                    // InternalCalculatorForm.g:1832:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // InternalCalculatorForm.g:1832:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // InternalCalculatorForm.g:1833:4: () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // InternalCalculatorForm.g:1833:4: ()
                    // InternalCalculatorForm.g:1834:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:1840:4: ( ( '!' )=>otherlv_1= '!' )
                    // InternalCalculatorForm.g:1841:5: ( '!' )=>otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1());
                      				
                    }

                    }

                    // InternalCalculatorForm.g:1847:4: ( (lv_expression_2_0= ruleAtomic ) )
                    // InternalCalculatorForm.g:1848:5: (lv_expression_2_0= ruleAtomic )
                    {
                    // InternalCalculatorForm.g:1848:5: (lv_expression_2_0= ruleAtomic )
                    // InternalCalculatorForm.g:1849:6: lv_expression_2_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.Atomic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:1868:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    {
                    // InternalCalculatorForm.g:1868:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    // InternalCalculatorForm.g:1869:4: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) )
                    {
                    // InternalCalculatorForm.g:1869:4: ()
                    // InternalCalculatorForm.g:1870:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:1876:4: ( ( '-' )=>otherlv_4= '-' )
                    // InternalCalculatorForm.g:1877:5: ( '-' )=>otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getPrefixedAccess().getHyphenMinusKeyword_1_1());
                      				
                    }

                    }

                    // InternalCalculatorForm.g:1883:4: ( (lv_expression_5_0= ruleAtomic ) )
                    // InternalCalculatorForm.g:1884:5: (lv_expression_5_0= ruleAtomic )
                    {
                    // InternalCalculatorForm.g:1884:5: (lv_expression_5_0= ruleAtomic )
                    // InternalCalculatorForm.g:1885:6: lv_expression_5_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_5_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.Atomic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:1904:3: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixed"


    // $ANTLR start "entryRuleAtomic"
    // InternalCalculatorForm.g:1916:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCalculatorForm.g:1916:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCalculatorForm.g:1917:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalCalculatorForm.g:1923:1: ruleAtomic returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1929:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) )
            // InternalCalculatorForm.g:1930:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            {
            // InternalCalculatorForm.g:1930:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_FLOAT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
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
                    // InternalCalculatorForm.g:1931:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalCalculatorForm.g:1931:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalCalculatorForm.g:1932:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_54);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:1950:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // InternalCalculatorForm.g:1950:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // InternalCalculatorForm.g:1951:4: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalCalculatorForm.g:1951:4: ()
                    // InternalCalculatorForm.g:1952:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:1958:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalCalculatorForm.g:1959:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalCalculatorForm.g:1959:5: (lv_value_4_0= RULE_INT )
                    // InternalCalculatorForm.g:1960:6: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_4_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:1978:3: ( () ( (lv_value_6_0= RULE_FLOAT ) ) )
                    {
                    // InternalCalculatorForm.g:1978:3: ( () ( (lv_value_6_0= RULE_FLOAT ) ) )
                    // InternalCalculatorForm.g:1979:4: () ( (lv_value_6_0= RULE_FLOAT ) )
                    {
                    // InternalCalculatorForm.g:1979:4: ()
                    // InternalCalculatorForm.g:1980:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getFloatLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:1986:4: ( (lv_value_6_0= RULE_FLOAT ) )
                    // InternalCalculatorForm.g:1987:5: (lv_value_6_0= RULE_FLOAT )
                    {
                    // InternalCalculatorForm.g:1987:5: (lv_value_6_0= RULE_FLOAT )
                    // InternalCalculatorForm.g:1988:6: lv_value_6_0= RULE_FLOAT
                    {
                    lv_value_6_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_6_0, grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_6_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.FLOAT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCalculatorForm.g:2006:3: ( () ( ( ruleQualifiedName ) ) )
                    {
                    // InternalCalculatorForm.g:2006:3: ( () ( ( ruleQualifiedName ) ) )
                    // InternalCalculatorForm.g:2007:4: () ( ( ruleQualifiedName ) )
                    {
                    // InternalCalculatorForm.g:2007:4: ()
                    // InternalCalculatorForm.g:2008:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getFieldReferenceAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2014:4: ( ( ruleQualifiedName ) )
                    // InternalCalculatorForm.g:2015:5: ( ruleQualifiedName )
                    {
                    // InternalCalculatorForm.g:2015:5: ( ruleQualifiedName )
                    // InternalCalculatorForm.g:2016:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getRefFieldCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
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