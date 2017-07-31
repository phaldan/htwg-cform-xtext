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

@SuppressWarnings("all")
public class InternalCalculatorFormParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'field'", "'autofocus'", "'disabled'", "'form'", "'label'", "'notdisplayed'", "'readonly'", "'required'", "'value'", "'dropdown'", "'multiple'", "'size'", "'{'", "'}'", "'option'", "'selected'", "'text'", "'option-group'", "'choice'", "'checked'", "'group'", "'page'", "'submit-button'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:71:1: ruleModel returns [EObject current=null] : ( (lv_formElements_0_0= ruleFormElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_formElements_0_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:77:2: ( ( (lv_formElements_0_0= ruleFormElement ) )* )
            // InternalCalculatorForm.g:78:2: ( (lv_formElements_0_0= ruleFormElement ) )*
            {
            // InternalCalculatorForm.g:78:2: ( (lv_formElements_0_0= ruleFormElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20||LA1_0==29||(LA1_0>=31 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculatorForm.g:79:3: (lv_formElements_0_0= ruleFormElement )
            	    {
            	    // InternalCalculatorForm.g:79:3: (lv_formElements_0_0= ruleFormElement )
            	    // InternalCalculatorForm.g:80:4: lv_formElements_0_0= ruleFormElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getFormElementsFormElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_formElements_0_0=ruleFormElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:100:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // InternalCalculatorForm.g:100:52: (iv_ruleFormElement= ruleFormElement EOF )
            // InternalCalculatorForm.g:101:2: iv_ruleFormElement= ruleFormElement EOF
            {
             newCompositeNode(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormElement=ruleFormElement();

            state._fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:107:1: ruleFormElement returns [EObject current=null] : (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Group_1 = null;

        EObject this_Page_2 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:113:2: ( (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) )
            // InternalCalculatorForm.g:114:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            {
            // InternalCalculatorForm.g:114:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 20:
            case 29:
            case 33:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCalculatorForm.g:115:3: this_Field_0= ruleField
                    {

                    			newCompositeNode(grammarAccess.getFormElementAccess().getFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;


                    			current = this_Field_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:124:3: this_Group_1= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getFormElementAccess().getGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;


                    			current = this_Group_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:133:3: this_Page_2= rulePage
                    {

                    			newCompositeNode(grammarAccess.getFormElementAccess().getPageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Page_2=rulePage();

                    state._fsp--;


                    			current = this_Page_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:145:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalCalculatorForm.g:145:46: (iv_ruleField= ruleField EOF )
            // InternalCalculatorForm.g:146:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:152:1: ruleField returns [EObject current=null] : (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_FieldInput_0 = null;

        EObject this_FieldSelect_1 = null;

        EObject this_FieldChoice_2 = null;

        EObject this_Button_3 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:158:2: ( (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) )
            // InternalCalculatorForm.g:159:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            {
            // InternalCalculatorForm.g:159:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCalculatorForm.g:160:3: this_FieldInput_0= ruleFieldInput
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getFieldInputParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldInput_0=ruleFieldInput();

                    state._fsp--;


                    			current = this_FieldInput_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:169:3: this_FieldSelect_1= ruleFieldSelect
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getFieldSelectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldSelect_1=ruleFieldSelect();

                    state._fsp--;


                    			current = this_FieldSelect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:178:3: this_FieldChoice_2= ruleFieldChoice
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getFieldChoiceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldChoice_2=ruleFieldChoice();

                    state._fsp--;


                    			current = this_FieldChoice_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCalculatorForm.g:187:3: this_Button_3= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getFieldAccess().getButtonParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_3=ruleButton();

                    state._fsp--;


                    			current = this_Button_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:199:1: entryRuleFieldInput returns [EObject current=null] : iv_ruleFieldInput= ruleFieldInput EOF ;
    public final EObject entryRuleFieldInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldInput = null;


        try {
            // InternalCalculatorForm.g:199:51: (iv_ruleFieldInput= ruleFieldInput EOF )
            // InternalCalculatorForm.g:200:2: iv_ruleFieldInput= ruleFieldInput EOF
            {
             newCompositeNode(grammarAccess.getFieldInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInput=ruleFieldInput();

            state._fsp--;

             current =iv_ruleFieldInput; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:206:1: ruleFieldInput returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:212:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:213:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:213:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:214:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldInputAccess().getFieldKeyword_0());
            		
            // InternalCalculatorForm.g:218:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:219:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:219:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:220:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldInputAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalCalculatorForm.g:236:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCalculatorForm.g:237:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:237:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:238:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_6); 

                    					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldInputRule());
                    					}
                    					setWithLastConsumed(current, "autofocus", true, "autofocus");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:250:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCalculatorForm.g:251:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:251:4: (lv_disabled_3_0= 'disabled' )
                    // InternalCalculatorForm.g:252:5: lv_disabled_3_0= 'disabled'
                    {
                    lv_disabled_3_0=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(lv_disabled_3_0, grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldInputRule());
                    					}
                    					setWithLastConsumed(current, "disabled", true, "disabled");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:264:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculatorForm.g:265:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldInputAccess().getFormKeyword_4_0());
                    			
                    // InternalCalculatorForm.g:269:4: ( (lv_form_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:270:5: (lv_form_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:270:5: (lv_form_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:271:6: lv_form_5_0= RULE_STRING
                    {
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_form_5_0, grammarAccess.getFieldInputAccess().getFormSTRINGTerminalRuleCall_4_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:288:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCalculatorForm.g:289:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldInputAccess().getLabelKeyword_5_0());
                    			
                    // InternalCalculatorForm.g:293:4: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:294:5: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:294:5: (lv_label_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:295:6: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_label_7_0, grammarAccess.getFieldInputAccess().getLabelSTRINGTerminalRuleCall_5_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:312:3: ( (lv_notdisplayed_8_0= 'notdisplayed' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculatorForm.g:313:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    {
                    // InternalCalculatorForm.g:313:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    // InternalCalculatorForm.g:314:5: lv_notdisplayed_8_0= 'notdisplayed'
                    {
                    lv_notdisplayed_8_0=(Token)match(input,16,FOLLOW_11); 

                    					newLeafNode(lv_notdisplayed_8_0, grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldInputRule());
                    					}
                    					setWithLastConsumed(current, "notdisplayed", true, "notdisplayed");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:326:3: ( (lv_readonly_9_0= 'readonly' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCalculatorForm.g:327:4: (lv_readonly_9_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:327:4: (lv_readonly_9_0= 'readonly' )
                    // InternalCalculatorForm.g:328:5: lv_readonly_9_0= 'readonly'
                    {
                    lv_readonly_9_0=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(lv_readonly_9_0, grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldInputRule());
                    					}
                    					setWithLastConsumed(current, "readonly", true, "readonly");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:340:3: ( (lv_required_10_0= 'required' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCalculatorForm.g:341:4: (lv_required_10_0= 'required' )
                    {
                    // InternalCalculatorForm.g:341:4: (lv_required_10_0= 'required' )
                    // InternalCalculatorForm.g:342:5: lv_required_10_0= 'required'
                    {
                    lv_required_10_0=(Token)match(input,18,FOLLOW_13); 

                    					newLeafNode(lv_required_10_0, grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldInputRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:354:3: (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:355:4: otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getFieldInputAccess().getValueKeyword_9_0());
                    			
                    // InternalCalculatorForm.g:359:4: ( (lv_value_12_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:360:5: (lv_value_12_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:360:5: (lv_value_12_0= RULE_STRING )
                    // InternalCalculatorForm.g:361:6: lv_value_12_0= RULE_STRING
                    {
                    lv_value_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_12_0, grammarAccess.getFieldInputAccess().getValueSTRINGTerminalRuleCall_9_1_0());
                    					

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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:382:1: entryRuleFieldSelect returns [EObject current=null] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final EObject entryRuleFieldSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelect = null;


        try {
            // InternalCalculatorForm.g:382:52: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // InternalCalculatorForm.g:383:2: iv_ruleFieldSelect= ruleFieldSelect EOF
            {
             newCompositeNode(grammarAccess.getFieldSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelect=ruleFieldSelect();

            state._fsp--;

             current =iv_ruleFieldSelect; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:389:1: ruleFieldSelect returns [EObject current=null] : (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) ;
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
            // InternalCalculatorForm.g:395:2: ( (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) )
            // InternalCalculatorForm.g:396:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            {
            // InternalCalculatorForm.g:396:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            // InternalCalculatorForm.g:397:3: otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSelectAccess().getDropdownKeyword_0());
            		
            // InternalCalculatorForm.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldSelectAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalCalculatorForm.g:419:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCalculatorForm.g:420:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:420:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:421:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_15); 

                    					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldSelectRule());
                    					}
                    					setWithLastConsumed(current, "autofocus", true, "autofocus");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:433:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculatorForm.g:434:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:434:4: (lv_disabled_3_0= 'disabled' )
                    // InternalCalculatorForm.g:435:5: lv_disabled_3_0= 'disabled'
                    {
                    lv_disabled_3_0=(Token)match(input,13,FOLLOW_16); 

                    					newLeafNode(lv_disabled_3_0, grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldSelectRule());
                    					}
                    					setWithLastConsumed(current, "disabled", true, "disabled");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:447:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCalculatorForm.g:448:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldSelectAccess().getFormKeyword_4_0());
                    			
                    // InternalCalculatorForm.g:452:4: ( (lv_form_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:453:5: (lv_form_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:453:5: (lv_form_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:454:6: lv_form_5_0= RULE_STRING
                    {
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_form_5_0, grammarAccess.getFieldSelectAccess().getFormSTRINGTerminalRuleCall_4_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:471:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatorForm.g:472:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0());
                    			
                    // InternalCalculatorForm.g:476:4: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:477:5: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:477:5: (lv_label_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:478:6: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_label_7_0, grammarAccess.getFieldSelectAccess().getLabelSTRINGTerminalRuleCall_5_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:495:3: ( (lv_multiple_8_0= 'multiple' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculatorForm.g:496:4: (lv_multiple_8_0= 'multiple' )
                    {
                    // InternalCalculatorForm.g:496:4: (lv_multiple_8_0= 'multiple' )
                    // InternalCalculatorForm.g:497:5: lv_multiple_8_0= 'multiple'
                    {
                    lv_multiple_8_0=(Token)match(input,21,FOLLOW_19); 

                    					newLeafNode(lv_multiple_8_0, grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldSelectRule());
                    					}
                    					setWithLastConsumed(current, "multiple", true, "multiple");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:509:3: ( (lv_required_9_0= 'required' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCalculatorForm.g:510:4: (lv_required_9_0= 'required' )
                    {
                    // InternalCalculatorForm.g:510:4: (lv_required_9_0= 'required' )
                    // InternalCalculatorForm.g:511:5: lv_required_9_0= 'required'
                    {
                    lv_required_9_0=(Token)match(input,18,FOLLOW_20); 

                    					newLeafNode(lv_required_9_0, grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldSelectRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:523:3: (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculatorForm.g:524:4: otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0());
                    			
                    // InternalCalculatorForm.g:528:4: ( (lv_size_11_0= RULE_INT ) )
                    // InternalCalculatorForm.g:529:5: (lv_size_11_0= RULE_INT )
                    {
                    // InternalCalculatorForm.g:529:5: (lv_size_11_0= RULE_INT )
                    // InternalCalculatorForm.g:530:6: lv_size_11_0= RULE_INT
                    {
                    lv_size_11_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						newLeafNode(lv_size_11_0, grammarAccess.getFieldSelectAccess().getSizeINTTerminalRuleCall_8_1_0());
                    					

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
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_12, grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalCalculatorForm.g:551:3: ( (lv_childs_13_0= ruleFieldSelectChild ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25||LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCalculatorForm.g:552:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    {
            	    // InternalCalculatorForm.g:552:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    // InternalCalculatorForm.g:553:5: lv_childs_13_0= ruleFieldSelectChild
            	    {

            	    					newCompositeNode(grammarAccess.getFieldSelectAccess().getChildsFieldSelectChildParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_childs_13_0=ruleFieldSelectChild();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_14=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getFieldSelectAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:578:1: entryRuleFieldSelectChild returns [EObject current=null] : iv_ruleFieldSelectChild= ruleFieldSelectChild EOF ;
    public final EObject entryRuleFieldSelectChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSelectChild = null;


        try {
            // InternalCalculatorForm.g:578:57: (iv_ruleFieldSelectChild= ruleFieldSelectChild EOF )
            // InternalCalculatorForm.g:579:2: iv_ruleFieldSelectChild= ruleFieldSelectChild EOF
            {
             newCompositeNode(grammarAccess.getFieldSelectChildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelectChild=ruleFieldSelectChild();

            state._fsp--;

             current =iv_ruleFieldSelectChild; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:585:1: ruleFieldSelectChild returns [EObject current=null] : (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) ;
    public final EObject ruleFieldSelectChild() throws RecognitionException {
        EObject current = null;

        EObject this_FieldOption_0 = null;

        EObject this_FieldOptionGroup_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:591:2: ( (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) )
            // InternalCalculatorForm.g:592:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            {
            // InternalCalculatorForm.g:592:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            else if ( (LA20_0==28) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCalculatorForm.g:593:3: this_FieldOption_0= ruleFieldOption
                    {

                    			newCompositeNode(grammarAccess.getFieldSelectChildAccess().getFieldOptionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldOption_0=ruleFieldOption();

                    state._fsp--;


                    			current = this_FieldOption_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:602:3: this_FieldOptionGroup_1= ruleFieldOptionGroup
                    {

                    			newCompositeNode(grammarAccess.getFieldSelectChildAccess().getFieldOptionGroupParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldOptionGroup_1=ruleFieldOptionGroup();

                    state._fsp--;


                    			current = this_FieldOptionGroup_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:614:1: entryRuleFieldOption returns [EObject current=null] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final EObject entryRuleFieldOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOption = null;


        try {
            // InternalCalculatorForm.g:614:52: (iv_ruleFieldOption= ruleFieldOption EOF )
            // InternalCalculatorForm.g:615:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
             newCompositeNode(grammarAccess.getFieldOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;

             current =iv_ruleFieldOption; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:621:1: ruleFieldOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:627:2: ( (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:628:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:628:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:629:3: otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldOptionAccess().getOptionKeyword_0());
            		
            // InternalCalculatorForm.g:633:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalCalculatorForm.g:634:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:634:4: (lv_text_1_0= RULE_STRING )
            // InternalCalculatorForm.g:635:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_text_1_0, grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

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

            // InternalCalculatorForm.g:651:3: ( (lv_disabled_2_0= 'disabled' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCalculatorForm.g:652:4: (lv_disabled_2_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:652:4: (lv_disabled_2_0= 'disabled' )
                    // InternalCalculatorForm.g:653:5: lv_disabled_2_0= 'disabled'
                    {
                    lv_disabled_2_0=(Token)match(input,13,FOLLOW_25); 

                    					newLeafNode(lv_disabled_2_0, grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldOptionRule());
                    					}
                    					setWithLastConsumed(current, "disabled", true, "disabled");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:665:3: ( (lv_selected_3_0= 'selected' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCalculatorForm.g:666:4: (lv_selected_3_0= 'selected' )
                    {
                    // InternalCalculatorForm.g:666:4: (lv_selected_3_0= 'selected' )
                    // InternalCalculatorForm.g:667:5: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,26,FOLLOW_26); 

                    					newLeafNode(lv_selected_3_0, grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldOptionRule());
                    					}
                    					setWithLastConsumed(current, "selected", true, "selected");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:679:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCalculatorForm.g:680:4: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldOptionAccess().getTextKeyword_4_0());
                    			
                    // InternalCalculatorForm.g:684:4: ( (lv_text_5_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:685:5: (lv_text_5_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:685:5: (lv_text_5_0= RULE_STRING )
                    // InternalCalculatorForm.g:686:6: lv_text_5_0= RULE_STRING
                    {
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_text_5_0, grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_4_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:703:3: (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCalculatorForm.g:704:4: otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldOptionAccess().getValueKeyword_5_0());
                    			
                    // InternalCalculatorForm.g:708:4: ( (lv_value_7_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:709:5: (lv_value_7_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:709:5: (lv_value_7_0= RULE_STRING )
                    // InternalCalculatorForm.g:710:6: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_7_0, grammarAccess.getFieldOptionAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                    					

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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:731:1: entryRuleFieldOptionGroup returns [EObject current=null] : iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF ;
    public final EObject entryRuleFieldOptionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldOptionGroup = null;


        try {
            // InternalCalculatorForm.g:731:57: (iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF )
            // InternalCalculatorForm.g:732:2: iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF
            {
             newCompositeNode(grammarAccess.getFieldOptionGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldOptionGroup=ruleFieldOptionGroup();

            state._fsp--;

             current =iv_ruleFieldOptionGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:738:1: ruleFieldOptionGroup returns [EObject current=null] : (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) ;
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
            // InternalCalculatorForm.g:744:2: ( (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) )
            // InternalCalculatorForm.g:745:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            {
            // InternalCalculatorForm.g:745:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            // InternalCalculatorForm.g:746:3: otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0());
            		
            // InternalCalculatorForm.g:750:3: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCalculatorForm.g:751:4: (lv_disabled_1_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:751:4: (lv_disabled_1_0= 'disabled' )
                    // InternalCalculatorForm.g:752:5: lv_disabled_1_0= 'disabled'
                    {
                    lv_disabled_1_0=(Token)match(input,13,FOLLOW_28); 

                    					newLeafNode(lv_disabled_1_0, grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldOptionGroupRule());
                    					}
                    					setWithLastConsumed(current, "disabled", true, "disabled");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:764:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCalculatorForm.g:765:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0());
                    			
                    // InternalCalculatorForm.g:769:4: ( (lv_label_3_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:770:5: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:770:5: (lv_label_3_0= RULE_STRING )
                    // InternalCalculatorForm.g:771:6: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_label_3_0, grammarAccess.getFieldOptionGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0());
                    					

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
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCalculatorForm.g:792:3: ( (lv_options_5_0= ruleFieldOption ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCalculatorForm.g:793:4: (lv_options_5_0= ruleFieldOption )
            	    {
            	    // InternalCalculatorForm.g:793:4: (lv_options_5_0= ruleFieldOption )
            	    // InternalCalculatorForm.g:794:5: lv_options_5_0= ruleFieldOption
            	    {

            	    					newCompositeNode(grammarAccess.getFieldOptionGroupAccess().getOptionsFieldOptionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_options_5_0=ruleFieldOption();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFieldOptionGroupAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:819:1: entryRuleFieldChoice returns [EObject current=null] : iv_ruleFieldChoice= ruleFieldChoice EOF ;
    public final EObject entryRuleFieldChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldChoice = null;


        try {
            // InternalCalculatorForm.g:819:52: (iv_ruleFieldChoice= ruleFieldChoice EOF )
            // InternalCalculatorForm.g:820:2: iv_ruleFieldChoice= ruleFieldChoice EOF
            {
             newCompositeNode(grammarAccess.getFieldChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldChoice=ruleFieldChoice();

            state._fsp--;

             current =iv_ruleFieldChoice; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:826:1: ruleFieldChoice returns [EObject current=null] : (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) ;
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
            // InternalCalculatorForm.g:832:2: ( (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) )
            // InternalCalculatorForm.g:833:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            {
            // InternalCalculatorForm.g:833:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            // InternalCalculatorForm.g:834:3: otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0());
            		
            // InternalCalculatorForm.g:838:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:839:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:839:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:840:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldChoiceAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalCalculatorForm.g:856:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCalculatorForm.g:857:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:857:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:858:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_31); 

                    					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceRule());
                    					}
                    					setWithLastConsumed(current, "autofocus", true, "autofocus");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:870:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCalculatorForm.g:871:4: (lv_checked_3_0= 'checked' )
                    {
                    // InternalCalculatorForm.g:871:4: (lv_checked_3_0= 'checked' )
                    // InternalCalculatorForm.g:872:5: lv_checked_3_0= 'checked'
                    {
                    lv_checked_3_0=(Token)match(input,30,FOLLOW_32); 

                    					newLeafNode(lv_checked_3_0, grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceRule());
                    					}
                    					setWithLastConsumed(current, "checked", true, "checked");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:884:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCalculatorForm.g:885:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:885:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:886:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,13,FOLLOW_33); 

                    					newLeafNode(lv_disabled_4_0, grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceRule());
                    					}
                    					setWithLastConsumed(current, "disabled", true, "disabled");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:898:3: (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCalculatorForm.g:899:4: otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0());
                    			
                    // InternalCalculatorForm.g:903:4: ( (lv_form_6_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:904:5: (lv_form_6_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:904:5: (lv_form_6_0= RULE_STRING )
                    // InternalCalculatorForm.g:905:6: lv_form_6_0= RULE_STRING
                    {
                    lv_form_6_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_form_6_0, grammarAccess.getFieldChoiceAccess().getFormSTRINGTerminalRuleCall_5_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:922:3: (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCalculatorForm.g:923:4: otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0());
                    			
                    // InternalCalculatorForm.g:927:4: ( (lv_label_8_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:928:5: (lv_label_8_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:928:5: (lv_label_8_0= RULE_STRING )
                    // InternalCalculatorForm.g:929:6: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_label_8_0, grammarAccess.getFieldChoiceAccess().getLabelSTRINGTerminalRuleCall_6_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:946:3: ( (lv_multiple_9_0= 'multiple' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCalculatorForm.g:947:4: (lv_multiple_9_0= 'multiple' )
                    {
                    // InternalCalculatorForm.g:947:4: (lv_multiple_9_0= 'multiple' )
                    // InternalCalculatorForm.g:948:5: lv_multiple_9_0= 'multiple'
                    {
                    lv_multiple_9_0=(Token)match(input,21,FOLLOW_36); 

                    					newLeafNode(lv_multiple_9_0, grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceRule());
                    					}
                    					setWithLastConsumed(current, "multiple", true, "multiple");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:960:3: ( (lv_notdisplayed_10_0= 'notdisplayed' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCalculatorForm.g:961:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    {
                    // InternalCalculatorForm.g:961:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    // InternalCalculatorForm.g:962:5: lv_notdisplayed_10_0= 'notdisplayed'
                    {
                    lv_notdisplayed_10_0=(Token)match(input,16,FOLLOW_37); 

                    					newLeafNode(lv_notdisplayed_10_0, grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceRule());
                    					}
                    					setWithLastConsumed(current, "notdisplayed", true, "notdisplayed");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:974:3: ( (lv_readonly_11_0= 'readonly' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCalculatorForm.g:975:4: (lv_readonly_11_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:975:4: (lv_readonly_11_0= 'readonly' )
                    // InternalCalculatorForm.g:976:5: lv_readonly_11_0= 'readonly'
                    {
                    lv_readonly_11_0=(Token)match(input,17,FOLLOW_38); 

                    					newLeafNode(lv_readonly_11_0, grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceRule());
                    					}
                    					setWithLastConsumed(current, "readonly", true, "readonly");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:988:3: ( (lv_required_12_0= 'required' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCalculatorForm.g:989:4: (lv_required_12_0= 'required' )
                    {
                    // InternalCalculatorForm.g:989:4: (lv_required_12_0= 'required' )
                    // InternalCalculatorForm.g:990:5: lv_required_12_0= 'required'
                    {
                    lv_required_12_0=(Token)match(input,18,FOLLOW_39); 

                    					newLeafNode(lv_required_12_0, grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1002:3: (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCalculatorForm.g:1003:4: otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0());
                    			
                    // InternalCalculatorForm.g:1007:4: ( (lv_value_14_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1008:5: (lv_value_14_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1008:5: (lv_value_14_0= RULE_STRING )
                    // InternalCalculatorForm.g:1009:6: lv_value_14_0= RULE_STRING
                    {
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_value_14_0, grammarAccess.getFieldChoiceAccess().getValueSTRINGTerminalRuleCall_11_1_0());
                    					

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
                    break;

            }

            // InternalCalculatorForm.g:1026:3: (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCalculatorForm.g:1027:4: otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_29); 

                    				newLeafNode(otherlv_15, grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0());
                    			
                    // InternalCalculatorForm.g:1031:4: ( (lv_options_16_0= ruleFieldChoiceOption ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==25) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalCalculatorForm.g:1032:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    {
                    	    // InternalCalculatorForm.g:1032:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    // InternalCalculatorForm.g:1033:6: lv_options_16_0= ruleFieldChoiceOption
                    	    {

                    	    						newCompositeNode(grammarAccess.getFieldChoiceAccess().getOptionsFieldChoiceOptionParserRuleCall_12_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_options_16_0=ruleFieldChoiceOption();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:1059:1: entryRuleFieldChoiceOption returns [EObject current=null] : iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF ;
    public final EObject entryRuleFieldChoiceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldChoiceOption = null;


        try {
            // InternalCalculatorForm.g:1059:58: (iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF )
            // InternalCalculatorForm.g:1060:2: iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF
            {
             newCompositeNode(grammarAccess.getFieldChoiceOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldChoiceOption=ruleFieldChoiceOption();

            state._fsp--;

             current =iv_ruleFieldChoiceOption; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:1066:1: ruleFieldChoiceOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:1072:2: ( (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:1073:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:1073:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:1074:3: otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0());
            		
            // InternalCalculatorForm.g:1078:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalCalculatorForm.g:1079:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:1079:4: (lv_label_1_0= RULE_STRING )
            // InternalCalculatorForm.g:1080:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_label_1_0, grammarAccess.getFieldChoiceOptionAccess().getLabelSTRINGTerminalRuleCall_1_0());
            				

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

            // InternalCalculatorForm.g:1096:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCalculatorForm.g:1097:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:1097:4: (lv_autofocus_2_0= 'autofocus' )
                    // InternalCalculatorForm.g:1098:5: lv_autofocus_2_0= 'autofocus'
                    {
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_42); 

                    					newLeafNode(lv_autofocus_2_0, grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                    					}
                    					setWithLastConsumed(current, "autofocus", true, "autofocus");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1110:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCalculatorForm.g:1111:4: (lv_checked_3_0= 'checked' )
                    {
                    // InternalCalculatorForm.g:1111:4: (lv_checked_3_0= 'checked' )
                    // InternalCalculatorForm.g:1112:5: lv_checked_3_0= 'checked'
                    {
                    lv_checked_3_0=(Token)match(input,30,FOLLOW_43); 

                    					newLeafNode(lv_checked_3_0, grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                    					}
                    					setWithLastConsumed(current, "checked", true, "checked");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1124:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCalculatorForm.g:1125:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:1125:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:1126:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,13,FOLLOW_11); 

                    					newLeafNode(lv_disabled_4_0, grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                    					}
                    					setWithLastConsumed(current, "disabled", true, "disabled");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1138:3: ( (lv_readonly_5_0= 'readonly' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCalculatorForm.g:1139:4: (lv_readonly_5_0= 'readonly' )
                    {
                    // InternalCalculatorForm.g:1139:4: (lv_readonly_5_0= 'readonly' )
                    // InternalCalculatorForm.g:1140:5: lv_readonly_5_0= 'readonly'
                    {
                    lv_readonly_5_0=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(lv_readonly_5_0, grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                    					}
                    					setWithLastConsumed(current, "readonly", true, "readonly");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1152:3: ( (lv_required_6_0= 'required' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCalculatorForm.g:1153:4: (lv_required_6_0= 'required' )
                    {
                    // InternalCalculatorForm.g:1153:4: (lv_required_6_0= 'required' )
                    // InternalCalculatorForm.g:1154:5: lv_required_6_0= 'required'
                    {
                    lv_required_6_0=(Token)match(input,18,FOLLOW_13); 

                    					newLeafNode(lv_required_6_0, grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldChoiceOptionRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1166:3: (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCalculatorForm.g:1167:4: otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0());
                    			
                    // InternalCalculatorForm.g:1171:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1172:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1172:5: (lv_value_8_0= RULE_STRING )
                    // InternalCalculatorForm.g:1173:6: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_8_0, grammarAccess.getFieldChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_1_0());
                    					

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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:1194:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalCalculatorForm.g:1194:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalCalculatorForm.g:1195:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:1201:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
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
            // InternalCalculatorForm.g:1207:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // InternalCalculatorForm.g:1208:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // InternalCalculatorForm.g:1208:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // InternalCalculatorForm.g:1209:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalCalculatorForm.g:1213:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:1214:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:1214:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:1215:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalCalculatorForm.g:1231:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==15) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCalculatorForm.g:1232:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLabelKeyword_2_0());
                    			
                    // InternalCalculatorForm.g:1236:4: ( (lv_label_3_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1237:5: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1237:5: (lv_label_3_0= RULE_STRING )
                    // InternalCalculatorForm.g:1238:6: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_label_3_0, grammarAccess.getGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0());
                    					

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
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_44); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCalculatorForm.g:1259:3: ( (lv_fields_5_0= ruleField ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==11||LA47_0==20||LA47_0==29||LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCalculatorForm.g:1260:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalCalculatorForm.g:1260:4: (lv_fields_5_0= ruleField )
            	    // InternalCalculatorForm.g:1261:5: lv_fields_5_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getGroupAccess().getFieldsFieldParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:1286:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalCalculatorForm.g:1286:45: (iv_rulePage= rulePage EOF )
            // InternalCalculatorForm.g:1287:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:1293:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_childs_2_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1299:2: ( (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) )
            // InternalCalculatorForm.g:1300:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            {
            // InternalCalculatorForm.g:1300:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            // InternalCalculatorForm.g:1301:3: otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCalculatorForm.g:1309:3: ( (lv_childs_2_0= rulePageChild ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==11||LA48_0==20||LA48_0==29||LA48_0==31||LA48_0==33) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCalculatorForm.g:1310:4: (lv_childs_2_0= rulePageChild )
            	    {
            	    // InternalCalculatorForm.g:1310:4: (lv_childs_2_0= rulePageChild )
            	    // InternalCalculatorForm.g:1311:5: lv_childs_2_0= rulePageChild
            	    {

            	    					newCompositeNode(grammarAccess.getPageAccess().getChildsPageChildParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_childs_2_0=rulePageChild();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:1336:1: entryRulePageChild returns [EObject current=null] : iv_rulePageChild= rulePageChild EOF ;
    public final EObject entryRulePageChild() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageChild = null;


        try {
            // InternalCalculatorForm.g:1336:50: (iv_rulePageChild= rulePageChild EOF )
            // InternalCalculatorForm.g:1337:2: iv_rulePageChild= rulePageChild EOF
            {
             newCompositeNode(grammarAccess.getPageChildRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageChild=rulePageChild();

            state._fsp--;

             current =iv_rulePageChild; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:1343:1: rulePageChild returns [EObject current=null] : (this_Group_0= ruleGroup | this_Field_1= ruleField ) ;
    public final EObject rulePageChild() throws RecognitionException {
        EObject current = null;

        EObject this_Group_0 = null;

        EObject this_Field_1 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1349:2: ( (this_Group_0= ruleGroup | this_Field_1= ruleField ) )
            // InternalCalculatorForm.g:1350:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            {
            // InternalCalculatorForm.g:1350:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31) ) {
                alt49=1;
            }
            else if ( (LA49_0==11||LA49_0==20||LA49_0==29||LA49_0==33) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalCalculatorForm.g:1351:3: this_Group_0= ruleGroup
                    {

                    			newCompositeNode(grammarAccess.getPageChildAccess().getGroupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_0=ruleGroup();

                    state._fsp--;


                    			current = this_Group_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:1360:3: this_Field_1= ruleField
                    {

                    			newCompositeNode(grammarAccess.getPageChildAccess().getFieldParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_1=ruleField();

                    state._fsp--;


                    			current = this_Field_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalCalculatorForm.g:1372:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalCalculatorForm.g:1372:47: (iv_ruleButton= ruleButton EOF )
            // InternalCalculatorForm.g:1373:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:1379:1: ruleButton returns [EObject current=null] : this_ButtonSubmit_0= ruleButtonSubmit ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        EObject this_ButtonSubmit_0 = null;



        	enterRule();

        try {
            // InternalCalculatorForm.g:1385:2: (this_ButtonSubmit_0= ruleButtonSubmit )
            // InternalCalculatorForm.g:1386:2: this_ButtonSubmit_0= ruleButtonSubmit
            {

            		newCompositeNode(grammarAccess.getButtonAccess().getButtonSubmitParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ButtonSubmit_0=ruleButtonSubmit();

            state._fsp--;


            		current = this_ButtonSubmit_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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
    // InternalCalculatorForm.g:1397:1: entryRuleButtonSubmit returns [EObject current=null] : iv_ruleButtonSubmit= ruleButtonSubmit EOF ;
    public final EObject entryRuleButtonSubmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButtonSubmit = null;


        try {
            // InternalCalculatorForm.g:1397:53: (iv_ruleButtonSubmit= ruleButtonSubmit EOF )
            // InternalCalculatorForm.g:1398:2: iv_ruleButtonSubmit= ruleButtonSubmit EOF
            {
             newCompositeNode(grammarAccess.getButtonSubmitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonSubmit=ruleButtonSubmit();

            state._fsp--;

             current =iv_ruleButtonSubmit; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:1404:1: ruleButtonSubmit returns [EObject current=null] : (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) ;
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
            // InternalCalculatorForm.g:1410:2: ( (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) )
            // InternalCalculatorForm.g:1411:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            {
            // InternalCalculatorForm.g:1411:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            // InternalCalculatorForm.g:1412:3: otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0());
            		
            // InternalCalculatorForm.g:1416:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCalculatorForm.g:1417:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCalculatorForm.g:1417:4: (lv_name_1_0= RULE_ID )
            // InternalCalculatorForm.g:1418:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonSubmitAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalCalculatorForm.g:1434:3: ( (lv_text_2_0= RULE_STRING ) )
            // InternalCalculatorForm.g:1435:4: (lv_text_2_0= RULE_STRING )
            {
            // InternalCalculatorForm.g:1435:4: (lv_text_2_0= RULE_STRING )
            // InternalCalculatorForm.g:1436:5: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_text_2_0, grammarAccess.getButtonSubmitAccess().getTextSTRINGTerminalRuleCall_2_0());
            				

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

            // InternalCalculatorForm.g:1452:3: ( (lv_autofocus_3_0= 'autofocus' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==12) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCalculatorForm.g:1453:4: (lv_autofocus_3_0= 'autofocus' )
                    {
                    // InternalCalculatorForm.g:1453:4: (lv_autofocus_3_0= 'autofocus' )
                    // InternalCalculatorForm.g:1454:5: lv_autofocus_3_0= 'autofocus'
                    {
                    lv_autofocus_3_0=(Token)match(input,12,FOLLOW_47); 

                    					newLeafNode(lv_autofocus_3_0, grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getButtonSubmitRule());
                    					}
                    					setWithLastConsumed(current, "autofocus", true, "autofocus");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1466:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCalculatorForm.g:1467:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // InternalCalculatorForm.g:1467:4: (lv_disabled_4_0= 'disabled' )
                    // InternalCalculatorForm.g:1468:5: lv_disabled_4_0= 'disabled'
                    {
                    lv_disabled_4_0=(Token)match(input,13,FOLLOW_13); 

                    					newLeafNode(lv_disabled_4_0, grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getButtonSubmitRule());
                    					}
                    					setWithLastConsumed(current, "disabled", true, "disabled");
                    				

                    }


                    }
                    break;

            }

            // InternalCalculatorForm.g:1480:3: (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCalculatorForm.g:1481:4: otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0());
                    			
                    // InternalCalculatorForm.g:1485:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalCalculatorForm.g:1486:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalCalculatorForm.g:1486:5: (lv_value_6_0= RULE_STRING )
                    // InternalCalculatorForm.g:1487:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getButtonSubmitAccess().getValueSTRINGTerminalRuleCall_5_1_0());
                    					

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
                    break;

            }


            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003A0100802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FF002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FE002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E4F000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E4E000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000E4C000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000E48000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000E40000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000013000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000C082002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C080002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000080A000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040AFF002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040AFE002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000AFE002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000AFC002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000AF8002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000AF0002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000008F0002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000008E0002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000008C0002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000880002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000400E3002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000400E2002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000E2002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000221100800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000002A1100800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000083002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000082002L});

}