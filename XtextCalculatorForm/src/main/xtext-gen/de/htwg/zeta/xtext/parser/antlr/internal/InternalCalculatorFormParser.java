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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_PERCENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'{'", "'}'", "'field'", "'autofocus'", "'disabled'", "'label'", "'notdisplayed'", "'readonly'", "'required'", "'value'", "'dropdown'", "'multiple'", "'size'", "'option'", "'selected'", "'text'", "'option-group'", "'choice'", "'checked'", "'group'", "'page'", "'submit-button'", "'calculate'", "'='", "'var'", "'.'", "'+'", "'-'", "'*'", "'/'", "'!'", "'('", "')'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_PERCENT=8;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
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
    // InternalCalculatorForm.g:71:1: ruleModel returns [EObject current=null] : ( (lv_forms_0_0= ruleForm ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_forms_0_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:77:2: ( ( (lv_forms_0_0= ruleForm ) )* )
            // InternalCalculatorForm.g:78:2: ( (lv_forms_0_0= ruleForm ) )*
            {
            // InternalCalculatorForm.g:78:2: ( (lv_forms_0_0= ruleForm ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculatorForm.g:79:3: (lv_forms_0_0= ruleForm )
            	    {
            	    // InternalCalculatorForm.g:79:3: (lv_forms_0_0= ruleForm )
            	    // InternalCalculatorForm.g:80:4: lv_forms_0_0= ruleForm
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getFormsFormParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_forms_0_0=ruleForm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"forms",
            	      					lv_forms_0_0,
            	      					"de.htwg.zeta.xtext.CalculatorForm.Form");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleForm"
    // InternalCalculatorForm.g:100:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalCalculatorForm.g:100:45: (iv_ruleForm= ruleForm EOF )
            // InternalCalculatorForm.g:101:2: iv_ruleForm= ruleForm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForm; 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalCalculatorForm.g:107:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_formElements_3_0 = null;

        EObject lv_calculations_4_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:113:2: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' ) )
            // InternalCalculatorForm.g:114:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' )
            {
            // InternalCalculatorForm.g:114:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' )
            // InternalCalculatorForm.g:115:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
              		
            }
            // InternalCalculatorForm.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFormRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCalculatorForm.g:141:3: ( (lv_formElements_3_0= ruleFormElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==24||LA2_0==31||(LA2_0>=33 && LA2_0<=35)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCalculatorForm.g:142:4: (lv_formElements_3_0= ruleFormElement )
            	    {
            	    // InternalCalculatorForm.g:142:4: (lv_formElements_3_0= ruleFormElement )
            	    // InternalCalculatorForm.g:143:5: lv_formElements_3_0= ruleFormElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFormAccess().getFormElementsFormElementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_formElements_3_0=ruleFormElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFormRule());
            	      					}
            	      					add(
            	      						current,
            	      						"formElements",
            	      						lv_formElements_3_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.FormElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCalculatorForm.g:160:3: ( (lv_calculations_4_0= ruleCalculate ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCalculatorForm.g:161:4: (lv_calculations_4_0= ruleCalculate )
            	    {
            	    // InternalCalculatorForm.g:161:4: (lv_calculations_4_0= ruleCalculate )
            	    // InternalCalculatorForm.g:162:5: lv_calculations_4_0= ruleCalculate
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFormAccess().getCalculationsCalculateParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_calculations_4_0=ruleCalculate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFormRule());
            	      					}
            	      					add(
            	      						current,
            	      						"calculations",
            	      						lv_calculations_4_0,
            	      						"de.htwg.zeta.xtext.CalculatorForm.Calculate");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5());
              		
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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleFormElement"
    // InternalCalculatorForm.g:187:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // InternalCalculatorForm.g:187:52: (iv_ruleFormElement= ruleFormElement EOF )
            // InternalCalculatorForm.g:188:2: iv_ruleFormElement= ruleFormElement EOF
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
    // InternalCalculatorForm.g:194:1: ruleFormElement returns [EObject current=null] : (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Group_1 = null;

        EObject this_Page_2 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:200:2: ( (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) )
            // InternalCalculatorForm.g:201:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            {
            // InternalCalculatorForm.g:201:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
            case 24:
            case 31:
            case 35:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
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
                    // InternalCalculatorForm.g:202:3: this_Field_0= ruleField
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
                    // InternalCalculatorForm.g:211:3: this_Group_1= ruleGroup
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
                    // InternalCalculatorForm.g:220:3: this_Page_2= rulePage
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
    // InternalCalculatorForm.g:232:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalCalculatorForm.g:232:46: (iv_ruleField= ruleField EOF )
            // InternalCalculatorForm.g:233:2: iv_ruleField= ruleField EOF
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
    // InternalCalculatorForm.g:239:1: ruleField returns [EObject current=null] : (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_FieldInput_0 = null;

        EObject this_FieldSelect_1 = null;

        EObject this_FieldChoice_2 = null;

        EObject this_Button_3 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:245:2: ( (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) )
            // InternalCalculatorForm.g:246:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            {
            // InternalCalculatorForm.g:246:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 35:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCalculatorForm.g:247:3: this_FieldInput_0= ruleFieldInput
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
                    // InternalCalculatorForm.g:256:3: this_FieldSelect_1= ruleFieldSelect
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
                    // InternalCalculatorForm.g:265:3: this_FieldChoice_2= ruleFieldChoice
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
                    // InternalCalculatorForm.g:274:3: this_Button_3= ruleButton
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
    // InternalCalculatorForm.g:286:1: entryRuleFieldInput returns [EObject current=null] : iv_ruleFieldInput= ruleFieldInput EOF ;
    public final EObject entryRuleFieldInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInput = null;


        try {
            // InternalCalculatorForm.g:286:51: (iv_ruleFieldInput= ruleFieldInput EOF )
            // InternalCalculatorForm.g:287:2: iv_ruleFieldInput= ruleFieldInput EOF
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
    // InternalCalculatorForm.g:293:1: ruleFieldInput returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:299:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:300:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:300:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:301:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldInputAccess().getFieldKeyword_0());
              		
            }
            // InternalCalculatorForm.g:305:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:306:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:306:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:307:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            // InternalCalculatorForm.g:323:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculatorForm.g:324:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:324:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:325:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
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

            // InternalCalculatorForm.g:337:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCalculatorForm.g:338:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:338:4: (lv_disabled_3_0= 'disabled' )
                    // InternalCalculatorForm.g:339:5: lv_disabled_3_0= 'disabled'
                    {
                    lv_disabled_3_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
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

            // InternalCalculatorForm.g:351:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculatorForm.g:352:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFieldInputAccess().getFormKeyword_4_0());
                      			
                    }
                    // InternalCalculatorForm.g:356:4: ( (lv_form_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:357:5: (lv_form_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:357:5: (lv_form_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:358:6: lv_form_5_0= RULE_STRING
                    {
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
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

            // InternalCalculatorForm.g:375:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCalculatorForm.g:376:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFieldInputAccess().getLabelKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:380:4: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:381:5: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:381:5: (lv_label_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:382:6: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); if (state.failed) return current;
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

            // InternalCalculatorForm.g:399:3: ( (lv_notdisplayed_8_0= 'notdisplayed' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCalculatorForm.g:400:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    {
                    // InternalCalculatorForm.g:400:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    // InternalCalculatorForm.g:401:5: lv_notdisplayed_8_0= 'notdisplayed'
                    {
                    lv_notdisplayed_8_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
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

            // InternalCalculatorForm.g:413:3: ( (lv_readonly_9_0= 'readonly' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:414:4: (lv_readonly_9_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:414:4: (lv_readonly_9_0= 'readonly' )
                    // InternalCalculatorForm.g:415:5: lv_readonly_9_0= 'readonly'
                    {
                    lv_readonly_9_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
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

            // InternalCalculatorForm.g:427:3: ( (lv_required_10_0= 'required' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCalculatorForm.g:428:4: (lv_required_10_0= 'required' )
                    {
                    // InternalCalculatorForm.g:428:4: (lv_required_10_0= 'required' )
                    // InternalCalculatorForm.g:429:5: lv_required_10_0= 'required'
                    {
                    lv_required_10_0=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
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

            // InternalCalculatorForm.g:441:3: (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculatorForm.g:442:4: otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFieldInputAccess().getValueKeyword_9_0());
                      			
                    }
                    // InternalCalculatorForm.g:446:4: ( (lv_value_12_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:447:5: (lv_value_12_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:447:5: (lv_value_12_0= RULE_STRING )
                    // InternalCalculatorForm.g:448:6: lv_value_12_0= RULE_STRING
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
    // InternalCalculatorForm.g:469:1: entryRuleFieldSelect returns [EObject current=null] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final EObject entryRuleFieldSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelect = null;


        try {
            // InternalCalculatorForm.g:469:52: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // InternalCalculatorForm.g:470:2: iv_ruleFieldSelect= ruleFieldSelect EOF
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
    // InternalCalculatorForm.g:476:1: ruleFieldSelect returns [EObject current=null] : (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) ;
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
            // InternalCalculatorForm.g:482:2: ( (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) )
            // InternalCalculatorForm.g:483:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            {
            // InternalCalculatorForm.g:483:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            // InternalCalculatorForm.g:484:3: otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldSelectAccess().getDropdownKeyword_0());
              		
            }
            // InternalCalculatorForm.g:488:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:489:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:489:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:490:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            // InternalCalculatorForm.g:506:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCalculatorForm.g:507:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:507:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:508:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
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

            // InternalCalculatorForm.g:520:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatorForm.g:521:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:521:4: (lv_disabled_3_0= 'disabled' )
                    // InternalCalculatorForm.g:522:5: lv_disabled_3_0= 'disabled'
                    {
                    lv_disabled_3_0=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
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

            // InternalCalculatorForm.g:534:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculatorForm.g:535:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFieldSelectAccess().getFormKeyword_4_0());
                      			
                    }
                    // InternalCalculatorForm.g:539:4: ( (lv_form_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:540:5: (lv_form_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:540:5: (lv_form_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:541:6: lv_form_5_0= RULE_STRING
                    {
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); if (state.failed) return current;
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

            // InternalCalculatorForm.g:558:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCalculatorForm.g:559:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:563:4: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:564:5: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:564:5: (lv_label_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:565:6: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); if (state.failed) return current;
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

            // InternalCalculatorForm.g:582:3: ( (lv_multiple_8_0= 'multiple' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculatorForm.g:583:4: (lv_multiple_8_0= 'multiple' )
                    {
                    // InternalCalculatorForm.g:583:4: (lv_multiple_8_0= 'multiple' )
                    // InternalCalculatorForm.g:584:5: lv_multiple_8_0= 'multiple'
                    {
                    lv_multiple_8_0=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
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

            // InternalCalculatorForm.g:596:3: ( (lv_required_9_0= 'required' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCalculatorForm.g:597:4: (lv_required_9_0= 'required' )
                    {
                    // InternalCalculatorForm.g:597:4: (lv_required_9_0= 'required' )
                    // InternalCalculatorForm.g:598:5: lv_required_9_0= 'required'
                    {
                    lv_required_9_0=(Token)match(input,22,FOLLOW_23); if (state.failed) return current;
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

            // InternalCalculatorForm.g:610:3: (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCalculatorForm.g:611:4: otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0());
                      			
                    }
                    // InternalCalculatorForm.g:615:4: ( (lv_size_11_0= RULE_INT ) )
                    // InternalCalculatorForm.g:616:5: (lv_size_11_0= RULE_INT )
                    {
                    // InternalCalculatorForm.g:616:5: (lv_size_11_0= RULE_INT )
                    // InternalCalculatorForm.g:617:6: lv_size_11_0= RULE_INT
                    {
                    lv_size_11_0=(Token)match(input,RULE_INT,FOLLOW_5); if (state.failed) return current;
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

            otherlv_12=(Token)match(input,14,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9());
              		
            }
            // InternalCalculatorForm.g:638:3: ( (lv_childs_13_0= ruleFieldSelectChild ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27||LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCalculatorForm.g:639:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    {
            	    // InternalCalculatorForm.g:639:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    // InternalCalculatorForm.g:640:5: lv_childs_13_0= ruleFieldSelectChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFieldSelectAccess().getChildsFieldSelectChildParserRuleCall_10_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop21;
                }
            } while (true);

            otherlv_14=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalCalculatorForm.g:665:1: entryRuleFieldSelectChild returns [EObject current=null] : iv_ruleFieldSelectChild= ruleFieldSelectChild EOF ;
    public final EObject entryRuleFieldSelectChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelectChild = null;


        try {
            // InternalCalculatorForm.g:665:57: (iv_ruleFieldSelectChild= ruleFieldSelectChild EOF )
            // InternalCalculatorForm.g:666:2: iv_ruleFieldSelectChild= ruleFieldSelectChild EOF
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
    // InternalCalculatorForm.g:672:1: ruleFieldSelectChild returns [EObject current=null] : (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) ;
    public final EObject ruleFieldSelectChild() throws RecognitionException {
        EObject current = null;

        EObject this_FieldOption_0 = null;

        EObject this_FieldOptionGroup_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:678:2: ( (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) )
            // InternalCalculatorForm.g:679:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            {
            // InternalCalculatorForm.g:679:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCalculatorForm.g:680:3: this_FieldOption_0= ruleFieldOption
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
                    // InternalCalculatorForm.g:689:3: this_FieldOptionGroup_1= ruleFieldOptionGroup
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
    // InternalCalculatorForm.g:701:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // InternalCalculatorForm.g:701:52: (iv_ruleFieldOption= ruleFieldOption EOF )
            // InternalCalculatorForm.g:702:2: iv_ruleFieldOption= ruleFieldOption EOF
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
    // InternalCalculatorForm.g:708:1: ruleFieldOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:714:2: ( (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:715:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:715:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:716:3: otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldOptionAccess().getOptionKeyword_0());
              		
            }
            // InternalCalculatorForm.g:720:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalCalculatorForm.g:721:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:721:4: (lv_text_1_0= RULE_STRING )
            // InternalCalculatorForm.g:722:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
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

            // InternalCalculatorForm.g:738:3: ( (lv_disabled_2_0= 'disabled' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCalculatorForm.g:739:4: (lv_disabled_2_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:739:4: (lv_disabled_2_0= 'disabled' )
                    // InternalCalculatorForm.g:740:5: lv_disabled_2_0= 'disabled'
                    {
                    lv_disabled_2_0=(Token)match(input,18,FOLLOW_27); if (state.failed) return current;
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

            // InternalCalculatorForm.g:752:3: ( (lv_selected_3_0= 'selected' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCalculatorForm.g:753:4: (lv_selected_3_0= 'selected' )
                    {
                    // InternalCalculatorForm.g:753:4: (lv_selected_3_0= 'selected' )
                    // InternalCalculatorForm.g:754:5: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
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

            // InternalCalculatorForm.g:766:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCalculatorForm.g:767:4: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getFieldOptionAccess().getTextKeyword_4_0());
                      			
                    }
                    // InternalCalculatorForm.g:771:4: ( (lv_text_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:772:5: (lv_text_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:772:5: (lv_text_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:773:6: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
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

            // InternalCalculatorForm.g:790:3: (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCalculatorForm.g:791:4: otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFieldOptionAccess().getValueKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:795:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:796:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:796:5: (lv_value_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:797:6: lv_value_7_0= RULE_STRING
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
    // InternalCalculatorForm.g:818:1: entryRuleFieldOptionGroup returns [EObject current=null] : iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF ;
    public final EObject entryRuleFieldOptionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptionGroup = null;


        try {
            // InternalCalculatorForm.g:818:57: (iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF )
            // InternalCalculatorForm.g:819:2: iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF
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
    // InternalCalculatorForm.g:825:1: ruleFieldOptionGroup returns [EObject current=null] : (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) ;
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
            // InternalCalculatorForm.g:831:2: ( (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) )
            // InternalCalculatorForm.g:832:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            {
            // InternalCalculatorForm.g:832:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            // InternalCalculatorForm.g:833:3: otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0());
              		
            }
            // InternalCalculatorForm.g:837:3: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCalculatorForm.g:838:4: (lv_disabled_1_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:838:4: (lv_disabled_1_0= 'disabled' )
                    // InternalCalculatorForm.g:839:5: lv_disabled_1_0= 'disabled'
                    {
                    lv_disabled_1_0=(Token)match(input,18,FOLLOW_30); if (state.failed) return current;
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

            // InternalCalculatorForm.g:851:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCalculatorForm.g:852:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0());
                      			
                    }
                    // InternalCalculatorForm.g:856:4: ( (lv_label_3_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:857:5: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:857:5: (lv_label_3_0= RULE_STRING )
                    // InternalCalculatorForm.g:858:6: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCalculatorForm.g:879:3: ( (lv_options_5_0= ruleFieldOption ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCalculatorForm.g:880:4: (lv_options_5_0= ruleFieldOption )
            	    {
            	    // InternalCalculatorForm.g:880:4: (lv_options_5_0= ruleFieldOption )
            	    // InternalCalculatorForm.g:881:5: lv_options_5_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFieldOptionGroupAccess().getOptionsFieldOptionParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop29;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalCalculatorForm.g:906:1: entryRuleFieldChoice returns [EObject current=null] : iv_ruleFieldChoice= ruleFieldChoice EOF ;
    public final EObject entryRuleFieldChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldChoice = null;


        try {
            // InternalCalculatorForm.g:906:52: (iv_ruleFieldChoice= ruleFieldChoice EOF )
            // InternalCalculatorForm.g:907:2: iv_ruleFieldChoice= ruleFieldChoice EOF
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
    // InternalCalculatorForm.g:913:1: ruleFieldChoice returns [EObject current=null] : (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) ;
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
            // InternalCalculatorForm.g:919:2: ( (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) )
            // InternalCalculatorForm.g:920:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            {
            // InternalCalculatorForm.g:920:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            // InternalCalculatorForm.g:921:3: otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0());
              		
            }
            // InternalCalculatorForm.g:925:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:926:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:926:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:927:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            // InternalCalculatorForm.g:943:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCalculatorForm.g:944:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:944:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:945:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_33); if (state.failed) return current;
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

            // InternalCalculatorForm.g:957:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCalculatorForm.g:958:4: (lv_checked_3_0= 'checked' )
                    {
                    // InternalCalculatorForm.g:958:4: (lv_checked_3_0= 'checked' )
                    // InternalCalculatorForm.g:959:5: lv_checked_3_0= 'checked'
                    {
                    lv_checked_3_0=(Token)match(input,32,FOLLOW_34); if (state.failed) return current;
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

            // InternalCalculatorForm.g:971:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCalculatorForm.g:972:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:972:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:973:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,18,FOLLOW_35); if (state.failed) return current;
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

            // InternalCalculatorForm.g:985:3: (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCalculatorForm.g:986:4: otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:990:4: ( (lv_form_6_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:991:5: (lv_form_6_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:991:5: (lv_form_6_0= RULE_STRING )
                    // InternalCalculatorForm.g:992:6: lv_form_6_0= RULE_STRING
                    {
                    lv_form_6_0=(Token)match(input,RULE_STRING,FOLLOW_36); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1009:3: (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCalculatorForm.g:1010:4: otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0());
                      			
                    }
                    // InternalCalculatorForm.g:1014:4: ( (lv_label_8_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1015:5: (lv_label_8_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1015:5: (lv_label_8_0= RULE_STRING )
                    // InternalCalculatorForm.g:1016:6: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_37); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1033:3: ( (lv_multiple_9_0= 'multiple' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCalculatorForm.g:1034:4: (lv_multiple_9_0= 'multiple' )
                    {
                    // InternalCalculatorForm.g:1034:4: (lv_multiple_9_0= 'multiple' )
                    // InternalCalculatorForm.g:1035:5: lv_multiple_9_0= 'multiple'
                    {
                    lv_multiple_9_0=(Token)match(input,25,FOLLOW_38); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1047:3: ( (lv_notdisplayed_10_0= 'notdisplayed' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCalculatorForm.g:1048:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    {
                    // InternalCalculatorForm.g:1048:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    // InternalCalculatorForm.g:1049:5: lv_notdisplayed_10_0= 'notdisplayed'
                    {
                    lv_notdisplayed_10_0=(Token)match(input,20,FOLLOW_39); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1061:3: ( (lv_readonly_11_0= 'readonly' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCalculatorForm.g:1062:4: (lv_readonly_11_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:1062:4: (lv_readonly_11_0= 'readonly' )
                    // InternalCalculatorForm.g:1063:5: lv_readonly_11_0= 'readonly'
                    {
                    lv_readonly_11_0=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1075:3: ( (lv_required_12_0= 'required' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCalculatorForm.g:1076:4: (lv_required_12_0= 'required' )
                    {
                    // InternalCalculatorForm.g:1076:4: (lv_required_12_0= 'required' )
                    // InternalCalculatorForm.g:1077:5: lv_required_12_0= 'required'
                    {
                    lv_required_12_0=(Token)match(input,22,FOLLOW_41); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1089:3: (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCalculatorForm.g:1090:4: otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0());
                      			
                    }
                    // InternalCalculatorForm.g:1094:4: ( (lv_value_14_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1095:5: (lv_value_14_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1095:5: (lv_value_14_0= RULE_STRING )
                    // InternalCalculatorForm.g:1096:6: lv_value_14_0= RULE_STRING
                    {
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_42); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1113:3: (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCalculatorForm.g:1114:4: otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0());
                      			
                    }
                    // InternalCalculatorForm.g:1118:4: ( (lv_options_16_0= ruleFieldChoiceOption ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalCalculatorForm.g:1119:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    {
                    	    // InternalCalculatorForm.g:1119:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    // InternalCalculatorForm.g:1120:6: lv_options_16_0= ruleFieldChoiceOption
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getFieldChoiceAccess().getOptionsFieldChoiceOptionParserRuleCall_12_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalCalculatorForm.g:1146:1: entryRuleFieldChoiceOption returns [EObject current=null] : iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF ;
    public final EObject entryRuleFieldChoiceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldChoiceOption = null;


        try {
            // InternalCalculatorForm.g:1146:58: (iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF )
            // InternalCalculatorForm.g:1147:2: iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF
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
    // InternalCalculatorForm.g:1153:1: ruleFieldChoiceOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:1159:2: ( (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:1160:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:1160:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:1161:3: otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1165:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalCalculatorForm.g:1166:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:1166:4: (lv_label_1_0= RULE_STRING )
            // InternalCalculatorForm.g:1167:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_43); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1183:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCalculatorForm.g:1184:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:1184:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:1185:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_44); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1197:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCalculatorForm.g:1198:4: (lv_checked_3_0= 'checked' )
                    {
                    // InternalCalculatorForm.g:1198:4: (lv_checked_3_0= 'checked' )
                    // InternalCalculatorForm.g:1199:5: lv_checked_3_0= 'checked'
                    {
                    lv_checked_3_0=(Token)match(input,32,FOLLOW_45); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1211:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCalculatorForm.g:1212:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:1212:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:1213:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1225:3: ( (lv_readonly_5_0= 'readonly' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCalculatorForm.g:1226:4: (lv_readonly_5_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:1226:4: (lv_readonly_5_0= 'readonly' )
                    // InternalCalculatorForm.g:1227:5: lv_readonly_5_0= 'readonly'
                    {
                    lv_readonly_5_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1239:3: ( (lv_required_6_0= 'required' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCalculatorForm.g:1240:4: (lv_required_6_0= 'required' )
                    {
                    // InternalCalculatorForm.g:1240:4: (lv_required_6_0= 'required' )
                    // InternalCalculatorForm.g:1241:5: lv_required_6_0= 'required'
                    {
                    lv_required_6_0=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1253:3: (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCalculatorForm.g:1254:4: otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0());
                      			
                    }
                    // InternalCalculatorForm.g:1258:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1259:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1259:5: (lv_value_8_0= RULE_STRING )
                    // InternalCalculatorForm.g:1260:6: lv_value_8_0= RULE_STRING
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
    // InternalCalculatorForm.g:1281:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalCalculatorForm.g:1281:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalCalculatorForm.g:1282:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalCalculatorForm.g:1288:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
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
            // InternalCalculatorForm.g:1294:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // InternalCalculatorForm.g:1295:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // InternalCalculatorForm.g:1295:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // InternalCalculatorForm.g:1296:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:1301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:1301:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:1302:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1318:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCalculatorForm.g:1319:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLabelKeyword_2_0());
                      			
                    }
                    // InternalCalculatorForm.g:1323:4: ( (lv_label_3_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1324:5: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1324:5: (lv_label_3_0= RULE_STRING )
                    // InternalCalculatorForm.g:1325:6: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,14,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalCalculatorForm.g:1346:3: ( (lv_fields_5_0= ruleField ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==16||LA49_0==24||LA49_0==31||LA49_0==35) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCalculatorForm.g:1347:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalCalculatorForm.g:1347:4: (lv_fields_5_0= ruleField )
            	    // InternalCalculatorForm.g:1348:5: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGroupAccess().getFieldsFieldParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop49;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalCalculatorForm.g:1373:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalCalculatorForm.g:1373:45: (iv_rulePage= rulePage EOF )
            // InternalCalculatorForm.g:1374:2: iv_rulePage= rulePage EOF
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
    // InternalCalculatorForm.g:1380:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_childs_2_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1386:2: ( (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) )
            // InternalCalculatorForm.g:1387:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            {
            // InternalCalculatorForm.g:1387:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            // InternalCalculatorForm.g:1388:3: otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCalculatorForm.g:1396:3: ( (lv_childs_2_0= rulePageChild ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==16||LA50_0==24||LA50_0==31||LA50_0==33||LA50_0==35) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCalculatorForm.g:1397:4: (lv_childs_2_0= rulePageChild )
            	    {
            	    // InternalCalculatorForm.g:1397:4: (lv_childs_2_0= rulePageChild )
            	    // InternalCalculatorForm.g:1398:5: lv_childs_2_0= rulePageChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPageAccess().getChildsPageChildParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    break loop50;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalCalculatorForm.g:1423:1: entryRulePageChild returns [EObject current=null] : iv_rulePageChild= rulePageChild EOF ;
    public final EObject entryRulePageChild() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageChild = null;


        try {
            // InternalCalculatorForm.g:1423:50: (iv_rulePageChild= rulePageChild EOF )
            // InternalCalculatorForm.g:1424:2: iv_rulePageChild= rulePageChild EOF
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
    // InternalCalculatorForm.g:1430:1: rulePageChild returns [EObject current=null] : (this_Group_0= ruleGroup | this_Field_1= ruleField ) ;
    public final EObject rulePageChild() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Field_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1436:2: ( (this_Group_0= ruleGroup | this_Field_1= ruleField ) )
            // InternalCalculatorForm.g:1437:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            {
            // InternalCalculatorForm.g:1437:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==33) ) {
                alt51=1;
            }
            else if ( (LA51_0==16||LA51_0==24||LA51_0==31||LA51_0==35) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCalculatorForm.g:1438:3: this_Group_0= ruleGroup
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
                    // InternalCalculatorForm.g:1447:3: this_Field_1= ruleField
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
    // InternalCalculatorForm.g:1459:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalCalculatorForm.g:1459:47: (iv_ruleButton= ruleButton EOF )
            // InternalCalculatorForm.g:1460:2: iv_ruleButton= ruleButton EOF
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
    // InternalCalculatorForm.g:1466:1: ruleButton returns [EObject current=null] : this_ButtonSubmit_0= ruleButtonSubmit ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        EObject this_ButtonSubmit_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1472:2: (this_ButtonSubmit_0= ruleButtonSubmit )
            // InternalCalculatorForm.g:1473:2: this_ButtonSubmit_0= ruleButtonSubmit
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
    // InternalCalculatorForm.g:1484:1: entryRuleButtonSubmit returns [EObject current=null] : iv_ruleButtonSubmit= ruleButtonSubmit EOF ;
    public final EObject entryRuleButtonSubmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonSubmit = null;


        try {
            // InternalCalculatorForm.g:1484:53: (iv_ruleButtonSubmit= ruleButtonSubmit EOF )
            // InternalCalculatorForm.g:1485:2: iv_ruleButtonSubmit= ruleButtonSubmit EOF
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
    // InternalCalculatorForm.g:1491:1: ruleButtonSubmit returns [EObject current=null] : (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:1497:2: ( (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:1498:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:1498:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:1499:3: otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1503:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:1504:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:1504:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:1505:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1521:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalCalculatorForm.g:1522:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:1522:4: (lv_text_2_0= RULE_STRING )
            // InternalCalculatorForm.g:1523:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_48); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1539:3: ( (lv_autofocus_3_0= 'autofocus' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==17) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCalculatorForm.g:1540:4: (lv_autofocus_3_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:1540:4: (lv_autofocus_3_0= 'autofocus' )
                    // InternalCalculatorForm.g:1541:5: lv_autofocus_3_0= 'autofocus'
                    {
                    lv_autofocus_3_0=(Token)match(input,17,FOLLOW_49); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1553:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCalculatorForm.g:1554:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:1554:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:1555:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
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

            // InternalCalculatorForm.g:1567:3: (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCalculatorForm.g:1568:4: otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0());
                      			
                    }
                    // InternalCalculatorForm.g:1572:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1573:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1573:5: (lv_value_6_0= RULE_STRING )
                    // InternalCalculatorForm.g:1574:6: lv_value_6_0= RULE_STRING
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
    // InternalCalculatorForm.g:1595:1: entryRuleCalculate returns [EObject current=null] : iv_ruleCalculate= ruleCalculate EOF ;
    public final EObject entryRuleCalculate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculate = null;


        try {
            // InternalCalculatorForm.g:1595:50: (iv_ruleCalculate= ruleCalculate EOF )
            // InternalCalculatorForm.g:1596:2: iv_ruleCalculate= ruleCalculate EOF
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
    // InternalCalculatorForm.g:1602:1: ruleCalculate returns [EObject current=null] : (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCalculate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_output_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1608:2: ( (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalCalculatorForm.g:1609:2: (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalCalculatorForm.g:1609:2: (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalCalculatorForm.g:1610:3: otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getCalculateAccess().getCalculateKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1614:3: ( (lv_output_1_0= ruleResultOutput ) )
            // InternalCalculatorForm.g:1615:4: (lv_output_1_0= ruleResultOutput )
            {
            // InternalCalculatorForm.g:1615:4: (lv_output_1_0= ruleResultOutput )
            // InternalCalculatorForm.g:1616:5: lv_output_1_0= ruleResultOutput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCalculateAccess().getOutputResultOutputParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_51);
            lv_output_1_0=ruleResultOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCalculateRule());
              					}
              					set(
              						current,
              						"output",
              						lv_output_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ResultOutput");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getCalculateAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalCalculatorForm.g:1637:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalCalculatorForm.g:1638:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalCalculatorForm.g:1638:4: (lv_expression_3_0= ruleExpression )
            // InternalCalculatorForm.g:1639:5: lv_expression_3_0= ruleExpression
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


    // $ANTLR start "entryRuleResultOutput"
    // InternalCalculatorForm.g:1660:1: entryRuleResultOutput returns [EObject current=null] : iv_ruleResultOutput= ruleResultOutput EOF ;
    public final EObject entryRuleResultOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultOutput = null;


        try {
            // InternalCalculatorForm.g:1660:53: (iv_ruleResultOutput= ruleResultOutput EOF )
            // InternalCalculatorForm.g:1661:2: iv_ruleResultOutput= ruleResultOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResultOutput=ruleResultOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResultOutput; 
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
    // $ANTLR end "entryRuleResultOutput"


    // $ANTLR start "ruleResultOutput"
    // InternalCalculatorForm.g:1667:1: ruleResultOutput returns [EObject current=null] : (this_OutputVariable_0= ruleOutputVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleResultOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OutputVariable_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1673:2: ( (this_OutputVariable_0= ruleOutputVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) ) )
            // InternalCalculatorForm.g:1674:2: (this_OutputVariable_0= ruleOutputVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) )
            {
            // InternalCalculatorForm.g:1674:2: (this_OutputVariable_0= ruleOutputVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            else if ( (LA55_0==16) ) {
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
                    // InternalCalculatorForm.g:1675:3: this_OutputVariable_0= ruleOutputVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultOutputAccess().getOutputVariableParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OutputVariable_0=ruleOutputVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OutputVariable_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:1684:3: ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) )
                    {
                    // InternalCalculatorForm.g:1684:3: ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) )
                    // InternalCalculatorForm.g:1685:4: () otherlv_2= 'field' ( ( ruleQualifiedName ) )
                    {
                    // InternalCalculatorForm.g:1685:4: ()
                    // InternalCalculatorForm.g:1686:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getResultOutputAccess().getOutputFieldAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getResultOutputAccess().getFieldKeyword_1_1());
                      			
                    }
                    // InternalCalculatorForm.g:1696:4: ( ( ruleQualifiedName ) )
                    // InternalCalculatorForm.g:1697:5: ( ruleQualifiedName )
                    {
                    // InternalCalculatorForm.g:1697:5: ( ruleQualifiedName )
                    // InternalCalculatorForm.g:1698:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getResultOutputRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getResultOutputAccess().getFieldFieldCrossReference_1_2_0());
                      					
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
    // $ANTLR end "ruleResultOutput"


    // $ANTLR start "entryRuleOutputVariable"
    // InternalCalculatorForm.g:1717:1: entryRuleOutputVariable returns [EObject current=null] : iv_ruleOutputVariable= ruleOutputVariable EOF ;
    public final EObject entryRuleOutputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputVariable = null;


        try {
            // InternalCalculatorForm.g:1717:55: (iv_ruleOutputVariable= ruleOutputVariable EOF )
            // InternalCalculatorForm.g:1718:2: iv_ruleOutputVariable= ruleOutputVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutputVariable=ruleOutputVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputVariable; 
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
    // $ANTLR end "entryRuleOutputVariable"


    // $ANTLR start "ruleOutputVariable"
    // InternalCalculatorForm.g:1724:1: ruleOutputVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOutputVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCalculatorForm.g:1730:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCalculatorForm.g:1731:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCalculatorForm.g:1731:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCalculatorForm.g:1732:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOutputVariableAccess().getVarKeyword_0());
              		
            }
            // InternalCalculatorForm.g:1736:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:1737:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:1737:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:1738:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getOutputVariableAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.htwg.zeta.xtext.CalculatorForm.ID");
              				
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
    // $ANTLR end "ruleOutputVariable"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCalculatorForm.g:1758:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCalculatorForm.g:1758:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCalculatorForm.g:1759:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCalculatorForm.g:1765:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCalculatorForm.g:1771:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCalculatorForm.g:1772:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCalculatorForm.g:1772:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCalculatorForm.g:1773:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCalculatorForm.g:1780:3: (kw= '.' this_ID_2= RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==39) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCalculatorForm.g:1781:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExpression"
    // InternalCalculatorForm.g:1798:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCalculatorForm.g:1798:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCalculatorForm.g:1799:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalCalculatorForm.g:1805:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1811:2: (this_Addition_0= ruleAddition )
            // InternalCalculatorForm.g:1812:2: this_Addition_0= ruleAddition
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
    // InternalCalculatorForm.g:1823:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalCalculatorForm.g:1823:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalCalculatorForm.g:1824:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalCalculatorForm.g:1830:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1836:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalCalculatorForm.g:1837:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalCalculatorForm.g:1837:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalCalculatorForm.g:1838:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalculatorForm.g:1846:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=40 && LA58_0<=41)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCalculatorForm.g:1847:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalCalculatorForm.g:1847:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // InternalCalculatorForm.g:1848:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalCalculatorForm.g:1848:5: ( () otherlv_2= '+' )
            	            // InternalCalculatorForm.g:1849:6: () otherlv_2= '+'
            	            {
            	            // InternalCalculatorForm.g:1849:6: ()
            	            // InternalCalculatorForm.g:1850:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,40,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCalculatorForm.g:1862:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalCalculatorForm.g:1862:5: ( () otherlv_4= '-' )
            	            // InternalCalculatorForm.g:1863:6: () otherlv_4= '-'
            	            {
            	            // InternalCalculatorForm.g:1863:6: ()
            	            // InternalCalculatorForm.g:1864:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCalculatorForm.g:1876:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalCalculatorForm.g:1877:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalCalculatorForm.g:1877:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalCalculatorForm.g:1878:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalCalculatorForm.g:1900:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalCalculatorForm.g:1900:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalCalculatorForm.g:1901:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalCalculatorForm.g:1907:1: ruleMultiplication returns [EObject current=null] : (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Prefixed_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1913:2: ( (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* ) )
            // InternalCalculatorForm.g:1914:2: (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* )
            {
            // InternalCalculatorForm.g:1914:2: (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* )
            // InternalCalculatorForm.g:1915:3: this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Prefixed_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalculatorForm.g:1923:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=42 && LA60_0<=43)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalCalculatorForm.g:1924:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) )
            	    {
            	    // InternalCalculatorForm.g:1924:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==42) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==43) ) {
            	        alt59=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalCalculatorForm.g:1925:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalCalculatorForm.g:1925:5: ( () otherlv_2= '*' )
            	            // InternalCalculatorForm.g:1926:6: () otherlv_2= '*'
            	            {
            	            // InternalCalculatorForm.g:1926:6: ()
            	            // InternalCalculatorForm.g:1927:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,42,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCalculatorForm.g:1939:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalCalculatorForm.g:1939:5: ( () otherlv_4= '/' )
            	            // InternalCalculatorForm.g:1940:6: () otherlv_4= '/'
            	            {
            	            // InternalCalculatorForm.g:1940:6: ()
            	            // InternalCalculatorForm.g:1941:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,43,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalCalculatorForm.g:1953:4: ( (lv_right_5_0= rulePrefixed ) )
            	    // InternalCalculatorForm.g:1954:5: (lv_right_5_0= rulePrefixed )
            	    {
            	    // InternalCalculatorForm.g:1954:5: (lv_right_5_0= rulePrefixed )
            	    // InternalCalculatorForm.g:1955:6: lv_right_5_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_right_5_0=rulePrefixed();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"de.htwg.zeta.xtext.CalculatorForm.Prefixed");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalCalculatorForm.g:1977:1: entryRulePrefixed returns [EObject current=null] : iv_rulePrefixed= rulePrefixed EOF ;
    public final EObject entryRulePrefixed() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixed = null;


        try {
            // InternalCalculatorForm.g:1977:49: (iv_rulePrefixed= rulePrefixed EOF )
            // InternalCalculatorForm.g:1978:2: iv_rulePrefixed= rulePrefixed EOF
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
    // InternalCalculatorForm.g:1984:1: rulePrefixed returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic ) ;
    public final EObject rulePrefixed() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        EObject this_Atomic_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1990:2: ( (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic ) )
            // InternalCalculatorForm.g:1991:2: (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic )
            {
            // InternalCalculatorForm.g:1991:2: (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==41||LA61_0==44) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID||(LA61_0>=RULE_INT && LA61_0<=RULE_PERCENT)||LA61_0==45) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalCalculatorForm.g:1992:3: this_UnaryOperation_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedAccess().getUnaryOperationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryOperation_0=ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryOperation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:2001:3: this_Atomic_1= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_1=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_1;
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


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalCalculatorForm.g:2013:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // InternalCalculatorForm.g:2013:55: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // InternalCalculatorForm.g:2014:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
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
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // InternalCalculatorForm.g:2020:1: ruleUnaryOperation returns [EObject current=null] : ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:2026:2: ( ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) ) )
            // InternalCalculatorForm.g:2027:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) )
            {
            // InternalCalculatorForm.g:2027:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==44) ) {
                alt62=1;
            }
            else if ( (LA62_0==41) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalCalculatorForm.g:2028:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // InternalCalculatorForm.g:2028:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // InternalCalculatorForm.g:2029:4: () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // InternalCalculatorForm.g:2029:4: ()
                    // InternalCalculatorForm.g:2030:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getBooleanNegationAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2036:4: ( ( '!' )=>otherlv_1= '!' )
                    // InternalCalculatorForm.g:2037:5: ( '!' )=>otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getUnaryOperationAccess().getExclamationMarkKeyword_0_1());
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2043:4: ( (lv_expression_2_0= ruleAtomic ) )
                    // InternalCalculatorForm.g:2044:5: (lv_expression_2_0= ruleAtomic )
                    {
                    // InternalCalculatorForm.g:2044:5: (lv_expression_2_0= ruleAtomic )
                    // InternalCalculatorForm.g:2045:6: lv_expression_2_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionAtomicParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
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
                    // InternalCalculatorForm.g:2064:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    {
                    // InternalCalculatorForm.g:2064:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    // InternalCalculatorForm.g:2065:4: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) )
                    {
                    // InternalCalculatorForm.g:2065:4: ()
                    // InternalCalculatorForm.g:2066:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryOperationAccess().getArithmeticSignedAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2072:4: ( ( '-' )=>otherlv_4= '-' )
                    // InternalCalculatorForm.g:2073:5: ( '-' )=>otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getUnaryOperationAccess().getHyphenMinusKeyword_1_1());
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2079:4: ( (lv_expression_5_0= ruleAtomic ) )
                    // InternalCalculatorForm.g:2080:5: (lv_expression_5_0= ruleAtomic )
                    {
                    // InternalCalculatorForm.g:2080:5: (lv_expression_5_0= ruleAtomic )
                    // InternalCalculatorForm.g:2081:6: lv_expression_5_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpressionAtomicParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleAtomic"
    // InternalCalculatorForm.g:2103:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCalculatorForm.g:2103:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCalculatorForm.g:2104:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalCalculatorForm.g:2110:1: ruleAtomic returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:2116:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) )
            // InternalCalculatorForm.g:2117:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            {
            // InternalCalculatorForm.g:2117:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==45) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID||(LA63_0>=RULE_INT && LA63_0<=RULE_PERCENT)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalCalculatorForm.g:2118:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalCalculatorForm.g:2118:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalCalculatorForm.g:2119:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:2137:3: this_Literal_3= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_3;
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleLiteral"
    // InternalCalculatorForm.g:2149:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalCalculatorForm.g:2149:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalCalculatorForm.g:2150:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalCalculatorForm.g:2156:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalCalculatorForm.g:2162:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) )
            // InternalCalculatorForm.g:2163:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            {
            // InternalCalculatorForm.g:2163:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt64=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt64=2;
                }
                break;
            case RULE_PERCENT:
                {
                alt64=3;
                }
                break;
            case RULE_ID:
                {
                alt64=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalCalculatorForm.g:2164:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCalculatorForm.g:2164:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCalculatorForm.g:2165:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCalculatorForm.g:2165:4: ()
                    // InternalCalculatorForm.g:2166:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getNumberLiteralAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2172:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCalculatorForm.g:2173:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCalculatorForm.g:2173:5: (lv_value_1_0= RULE_INT )
                    // InternalCalculatorForm.g:2174:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:2192:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalCalculatorForm.g:2192:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // InternalCalculatorForm.g:2193:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // InternalCalculatorForm.g:2193:4: ()
                    // InternalCalculatorForm.g:2194:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getFloatLiteralAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2200:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // InternalCalculatorForm.g:2201:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // InternalCalculatorForm.g:2201:5: (lv_value_3_0= RULE_FLOAT )
                    // InternalCalculatorForm.g:2202:6: lv_value_3_0= RULE_FLOAT
                    {
                    lv_value_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getLiteralAccess().getValueFLOATTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.FLOAT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:2220:3: ( () ( (lv_value_5_0= RULE_PERCENT ) ) )
                    {
                    // InternalCalculatorForm.g:2220:3: ( () ( (lv_value_5_0= RULE_PERCENT ) ) )
                    // InternalCalculatorForm.g:2221:4: () ( (lv_value_5_0= RULE_PERCENT ) )
                    {
                    // InternalCalculatorForm.g:2221:4: ()
                    // InternalCalculatorForm.g:2222:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getPercentLiteralAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2228:4: ( (lv_value_5_0= RULE_PERCENT ) )
                    // InternalCalculatorForm.g:2229:5: (lv_value_5_0= RULE_PERCENT )
                    {
                    // InternalCalculatorForm.g:2229:5: (lv_value_5_0= RULE_PERCENT )
                    // InternalCalculatorForm.g:2230:6: lv_value_5_0= RULE_PERCENT
                    {
                    lv_value_5_0=(Token)match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getLiteralAccess().getValuePERCENTTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteralRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"de.htwg.zeta.xtext.CalculatorForm.PERCENT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCalculatorForm.g:2248:3: ( () ( ( ruleQualifiedName ) ) )
                    {
                    // InternalCalculatorForm.g:2248:3: ( () ( ( ruleQualifiedName ) ) )
                    // InternalCalculatorForm.g:2249:4: () ( ( ruleQualifiedName ) )
                    {
                    // InternalCalculatorForm.g:2249:4: ()
                    // InternalCalculatorForm.g:2250:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralAccess().getReferenceLiteralAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCalculatorForm.g:2256:4: ( ( ruleQualifiedName ) )
                    // InternalCalculatorForm.g:2257:5: ( ruleQualifiedName )
                    {
                    // InternalCalculatorForm.g:2257:5: ( ruleQualifiedName )
                    // InternalCalculatorForm.g:2258:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteralRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLiteralAccess().getRefExpressionVariableCrossReference_3_1_0());
                      					
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
    // $ANTLR end "ruleLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001E81018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FE2002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000FC2002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F82002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000064E6000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000064C6000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006486000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006484000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006404000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004404000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000048008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030840002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000030800002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020800002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000102FE6002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000102FC6002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002FC6002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002F86002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002F84002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000002F04002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000F04002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000E04002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000C04002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000804002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100E60002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100E40002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000E40002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000881018000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000A81018000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000860002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00003200000001D0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400000000000L});

}