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

@SuppressWarnings("all")
public class PsiInternalCalculatorFormParser extends AbstractPsiAntlrParser {
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
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:59:1: ruleModel returns [Boolean current=false] : ( (lv_formElements_0_0= ruleFormElement ) )* ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_formElements_0_0 = null;


        try {
            // PsiInternalCalculatorForm.g:60:1: ( ( (lv_formElements_0_0= ruleFormElement ) )* )
            // PsiInternalCalculatorForm.g:61:2: ( (lv_formElements_0_0= ruleFormElement ) )*
            {
            // PsiInternalCalculatorForm.g:61:2: ( (lv_formElements_0_0= ruleFormElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20||LA1_0==29||(LA1_0>=31 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:62:3: (lv_formElements_0_0= ruleFormElement )
            	    {
            	    // PsiInternalCalculatorForm.g:62:3: (lv_formElements_0_0= ruleFormElement )
            	    // PsiInternalCalculatorForm.g:63:4: lv_formElements_0_0= ruleFormElement
            	    {

            	    				markComposite(elementTypeProvider.getModel_FormElementsFormElementParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_formElements_0_0=ruleFormElement();

            	    state._fsp--;


            	    				doneComposite();
            	    				if(!current) {
            	    					associateWithSemanticElement();
            	    					current = true;
            	    				}
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // PsiInternalCalculatorForm.g:79:1: entryRuleFormElement returns [Boolean current=false] : iv_ruleFormElement= ruleFormElement EOF ;
    public final Boolean entryRuleFormElement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFormElement = null;


        try {
            // PsiInternalCalculatorForm.g:79:53: (iv_ruleFormElement= ruleFormElement EOF )
            // PsiInternalCalculatorForm.g:80:2: iv_ruleFormElement= ruleFormElement EOF
            {
             markComposite(elementTypeProvider.getFormElementElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormElement=ruleFormElement();

            state._fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:86:1: ruleFormElement returns [Boolean current=false] : (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) ;
    public final Boolean ruleFormElement() throws RecognitionException {
        Boolean current = false;

        Boolean this_Field_0 = null;

        Boolean this_Group_1 = null;

        Boolean this_Page_2 = null;


        try {
            // PsiInternalCalculatorForm.g:87:1: ( (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) )
            // PsiInternalCalculatorForm.g:88:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            {
            // PsiInternalCalculatorForm.g:88:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
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
                    // PsiInternalCalculatorForm.g:89:3: this_Field_0= ruleField
                    {

                    			markComposite(elementTypeProvider.getFormElement_FieldParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;


                    			current = this_Field_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:98:3: this_Group_1= ruleGroup
                    {

                    			markComposite(elementTypeProvider.getFormElement_GroupParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_1=ruleGroup();

                    state._fsp--;


                    			current = this_Group_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalCalculatorForm.g:107:3: this_Page_2= rulePage
                    {

                    			markComposite(elementTypeProvider.getFormElement_PageParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Page_2=rulePage();

                    state._fsp--;


                    			current = this_Page_2;
                    			doneComposite();
                    		

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
    // PsiInternalCalculatorForm.g:119:1: entryRuleField returns [Boolean current=false] : iv_ruleField= ruleField EOF ;
    public final Boolean entryRuleField() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleField = null;


        try {
            // PsiInternalCalculatorForm.g:119:47: (iv_ruleField= ruleField EOF )
            // PsiInternalCalculatorForm.g:120:2: iv_ruleField= ruleField EOF
            {
             markComposite(elementTypeProvider.getFieldElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:126:1: ruleField returns [Boolean current=false] : (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) ;
    public final Boolean ruleField() throws RecognitionException {
        Boolean current = false;

        Boolean this_FieldInput_0 = null;

        Boolean this_FieldSelect_1 = null;

        Boolean this_FieldChoice_2 = null;

        Boolean this_Button_3 = null;


        try {
            // PsiInternalCalculatorForm.g:127:1: ( (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) )
            // PsiInternalCalculatorForm.g:128:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            {
            // PsiInternalCalculatorForm.g:128:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
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
                    // PsiInternalCalculatorForm.g:129:3: this_FieldInput_0= ruleFieldInput
                    {

                    			markComposite(elementTypeProvider.getField_FieldInputParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldInput_0=ruleFieldInput();

                    state._fsp--;


                    			current = this_FieldInput_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:138:3: this_FieldSelect_1= ruleFieldSelect
                    {

                    			markComposite(elementTypeProvider.getField_FieldSelectParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldSelect_1=ruleFieldSelect();

                    state._fsp--;


                    			current = this_FieldSelect_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalCalculatorForm.g:147:3: this_FieldChoice_2= ruleFieldChoice
                    {

                    			markComposite(elementTypeProvider.getField_FieldChoiceParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldChoice_2=ruleFieldChoice();

                    state._fsp--;


                    			current = this_FieldChoice_2;
                    			doneComposite();
                    		

                    }
                    break;
                case 4 :
                    // PsiInternalCalculatorForm.g:156:3: this_Button_3= ruleButton
                    {

                    			markComposite(elementTypeProvider.getField_ButtonParserRuleCall_3ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_3=ruleButton();

                    state._fsp--;


                    			current = this_Button_3;
                    			doneComposite();
                    		

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
    // PsiInternalCalculatorForm.g:168:1: entryRuleFieldInput returns [Boolean current=false] : iv_ruleFieldInput= ruleFieldInput EOF ;
    public final Boolean entryRuleFieldInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldInput = null;


        try {
            // PsiInternalCalculatorForm.g:168:52: (iv_ruleFieldInput= ruleFieldInput EOF )
            // PsiInternalCalculatorForm.g:169:2: iv_ruleFieldInput= ruleFieldInput EOF
            {
             markComposite(elementTypeProvider.getFieldInputElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldInput=ruleFieldInput();

            state._fsp--;

             current =iv_ruleFieldInput; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:175:1: ruleFieldInput returns [Boolean current=false] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:176:1: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:177:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:177:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:178:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            {

            			markLeaf(elementTypeProvider.getFieldInput_FieldKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:185:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:186:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:186:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:187:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFieldInput_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:202:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalCalculatorForm.g:203:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:203:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:204:5: lv_autofocus_2_0= 'autofocus'
                    {

                    					markLeaf(elementTypeProvider.getFieldInput_AutofocusAutofocusKeyword_2_0ElementType());
                    				
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_6); 

                    					doneLeaf(lv_autofocus_2_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:219:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalCalculatorForm.g:220:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:220:4: (lv_disabled_3_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:221:5: lv_disabled_3_0= 'disabled'
                    {

                    					markLeaf(elementTypeProvider.getFieldInput_DisabledDisabledKeyword_3_0ElementType());
                    				
                    lv_disabled_3_0=(Token)match(input,13,FOLLOW_7); 

                    					doneLeaf(lv_disabled_3_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:236:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalCalculatorForm.g:237:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldInput_FormKeyword_4_0ElementType());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_8); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalCalculatorForm.g:244:4: ( (lv_form_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:245:5: (lv_form_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:245:5: (lv_form_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:246:6: lv_form_5_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldInput_FormSTRINGTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_form_5_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:262:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalCalculatorForm.g:263:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldInput_LabelKeyword_5_0ElementType());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalCalculatorForm.g:270:4: ( (lv_label_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:271:5: (lv_label_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:271:5: (lv_label_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:272:6: lv_label_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldInput_LabelSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_label_7_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:288:3: ( (lv_notdisplayed_8_0= 'notdisplayed' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalCalculatorForm.g:289:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    {
                    // PsiInternalCalculatorForm.g:289:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    // PsiInternalCalculatorForm.g:290:5: lv_notdisplayed_8_0= 'notdisplayed'
                    {

                    					markLeaf(elementTypeProvider.getFieldInput_NotdisplayedNotdisplayedKeyword_6_0ElementType());
                    				
                    lv_notdisplayed_8_0=(Token)match(input,16,FOLLOW_11); 

                    					doneLeaf(lv_notdisplayed_8_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:305:3: ( (lv_readonly_9_0= 'readonly' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalCalculatorForm.g:306:4: (lv_readonly_9_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:306:4: (lv_readonly_9_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:307:5: lv_readonly_9_0= 'readonly'
                    {

                    					markLeaf(elementTypeProvider.getFieldInput_ReadonlyReadonlyKeyword_7_0ElementType());
                    				
                    lv_readonly_9_0=(Token)match(input,17,FOLLOW_12); 

                    					doneLeaf(lv_readonly_9_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:322:3: ( (lv_required_10_0= 'required' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalCalculatorForm.g:323:4: (lv_required_10_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:323:4: (lv_required_10_0= 'required' )
                    // PsiInternalCalculatorForm.g:324:5: lv_required_10_0= 'required'
                    {

                    					markLeaf(elementTypeProvider.getFieldInput_RequiredRequiredKeyword_8_0ElementType());
                    				
                    lv_required_10_0=(Token)match(input,18,FOLLOW_13); 

                    					doneLeaf(lv_required_10_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:339:3: (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalCalculatorForm.g:340:4: otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldInput_ValueKeyword_9_0ElementType());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_8); 

                    				doneLeaf(otherlv_11);
                    			
                    // PsiInternalCalculatorForm.g:347:4: ( (lv_value_12_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:348:5: (lv_value_12_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:348:5: (lv_value_12_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:349:6: lv_value_12_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldInput_ValueSTRINGTerminalRuleCall_9_1_0ElementType());
                    					
                    lv_value_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_value_12_0);
                    					

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
    // PsiInternalCalculatorForm.g:369:1: entryRuleFieldSelect returns [Boolean current=false] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final Boolean entryRuleFieldSelect() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldSelect = null;


        try {
            // PsiInternalCalculatorForm.g:369:53: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // PsiInternalCalculatorForm.g:370:2: iv_ruleFieldSelect= ruleFieldSelect EOF
            {
             markComposite(elementTypeProvider.getFieldSelectElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelect=ruleFieldSelect();

            state._fsp--;

             current =iv_ruleFieldSelect; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:376:1: ruleFieldSelect returns [Boolean current=false] : (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) ;
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
            // PsiInternalCalculatorForm.g:377:1: ( (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) )
            // PsiInternalCalculatorForm.g:378:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            {
            // PsiInternalCalculatorForm.g:378:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            // PsiInternalCalculatorForm.g:379:3: otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}'
            {

            			markLeaf(elementTypeProvider.getFieldSelect_DropdownKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:386:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:387:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:387:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:388:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFieldSelect_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:403:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalCalculatorForm.g:404:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:404:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:405:5: lv_autofocus_2_0= 'autofocus'
                    {

                    					markLeaf(elementTypeProvider.getFieldSelect_AutofocusAutofocusKeyword_2_0ElementType());
                    				
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_15); 

                    					doneLeaf(lv_autofocus_2_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:420:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PsiInternalCalculatorForm.g:421:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:421:4: (lv_disabled_3_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:422:5: lv_disabled_3_0= 'disabled'
                    {

                    					markLeaf(elementTypeProvider.getFieldSelect_DisabledDisabledKeyword_3_0ElementType());
                    				
                    lv_disabled_3_0=(Token)match(input,13,FOLLOW_16); 

                    					doneLeaf(lv_disabled_3_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:437:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalCalculatorForm.g:438:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldSelect_FormKeyword_4_0ElementType());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_8); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalCalculatorForm.g:445:4: ( (lv_form_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:446:5: (lv_form_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:446:5: (lv_form_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:447:6: lv_form_5_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldSelect_FormSTRINGTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_form_5_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:463:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalCalculatorForm.g:464:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldSelect_LabelKeyword_5_0ElementType());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalCalculatorForm.g:471:4: ( (lv_label_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:472:5: (lv_label_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:472:5: (lv_label_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:473:6: lv_label_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldSelect_LabelSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_label_7_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:489:3: ( (lv_multiple_8_0= 'multiple' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalCalculatorForm.g:490:4: (lv_multiple_8_0= 'multiple' )
                    {
                    // PsiInternalCalculatorForm.g:490:4: (lv_multiple_8_0= 'multiple' )
                    // PsiInternalCalculatorForm.g:491:5: lv_multiple_8_0= 'multiple'
                    {

                    					markLeaf(elementTypeProvider.getFieldSelect_MultipleMultipleKeyword_6_0ElementType());
                    				
                    lv_multiple_8_0=(Token)match(input,21,FOLLOW_19); 

                    					doneLeaf(lv_multiple_8_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:506:3: ( (lv_required_9_0= 'required' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalCalculatorForm.g:507:4: (lv_required_9_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:507:4: (lv_required_9_0= 'required' )
                    // PsiInternalCalculatorForm.g:508:5: lv_required_9_0= 'required'
                    {

                    					markLeaf(elementTypeProvider.getFieldSelect_RequiredRequiredKeyword_7_0ElementType());
                    				
                    lv_required_9_0=(Token)match(input,18,FOLLOW_20); 

                    					doneLeaf(lv_required_9_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:523:3: (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalCalculatorForm.g:524:4: otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldSelect_SizeKeyword_8_0ElementType());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_21); 

                    				doneLeaf(otherlv_10);
                    			
                    // PsiInternalCalculatorForm.g:531:4: ( (lv_size_11_0= RULE_INT ) )
                    // PsiInternalCalculatorForm.g:532:5: (lv_size_11_0= RULE_INT )
                    {
                    // PsiInternalCalculatorForm.g:532:5: (lv_size_11_0= RULE_INT )
                    // PsiInternalCalculatorForm.g:533:6: lv_size_11_0= RULE_INT
                    {

                    						markLeaf(elementTypeProvider.getFieldSelect_SizeINTTerminalRuleCall_8_1_0ElementType());
                    					
                    lv_size_11_0=(Token)match(input,RULE_INT,FOLLOW_22); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_size_11_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getFieldSelect_LeftCurlyBracketKeyword_9ElementType());
            		
            otherlv_12=(Token)match(input,23,FOLLOW_23); 

            			doneLeaf(otherlv_12);
            		
            // PsiInternalCalculatorForm.g:556:3: ( (lv_childs_13_0= ruleFieldSelectChild ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25||LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:557:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    {
            	    // PsiInternalCalculatorForm.g:557:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    // PsiInternalCalculatorForm.g:558:5: lv_childs_13_0= ruleFieldSelectChild
            	    {

            	    					markComposite(elementTypeProvider.getFieldSelect_ChildsFieldSelectChildParserRuleCall_10_0ElementType());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_childs_13_0=ruleFieldSelectChild();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getFieldSelect_RightCurlyBracketKeyword_11ElementType());
            		
            otherlv_14=(Token)match(input,24,FOLLOW_2); 

            			doneLeaf(otherlv_14);
            		

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
    // PsiInternalCalculatorForm.g:582:1: entryRuleFieldSelectChild returns [Boolean current=false] : iv_ruleFieldSelectChild= ruleFieldSelectChild EOF ;
    public final Boolean entryRuleFieldSelectChild() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldSelectChild = null;


        try {
            // PsiInternalCalculatorForm.g:582:58: (iv_ruleFieldSelectChild= ruleFieldSelectChild EOF )
            // PsiInternalCalculatorForm.g:583:2: iv_ruleFieldSelectChild= ruleFieldSelectChild EOF
            {
             markComposite(elementTypeProvider.getFieldSelectChildElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSelectChild=ruleFieldSelectChild();

            state._fsp--;

             current =iv_ruleFieldSelectChild; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:589:1: ruleFieldSelectChild returns [Boolean current=false] : (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) ;
    public final Boolean ruleFieldSelectChild() throws RecognitionException {
        Boolean current = false;

        Boolean this_FieldOption_0 = null;

        Boolean this_FieldOptionGroup_1 = null;


        try {
            // PsiInternalCalculatorForm.g:590:1: ( (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) )
            // PsiInternalCalculatorForm.g:591:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            {
            // PsiInternalCalculatorForm.g:591:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
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
                    // PsiInternalCalculatorForm.g:592:3: this_FieldOption_0= ruleFieldOption
                    {

                    			markComposite(elementTypeProvider.getFieldSelectChild_FieldOptionParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldOption_0=ruleFieldOption();

                    state._fsp--;


                    			current = this_FieldOption_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:601:3: this_FieldOptionGroup_1= ruleFieldOptionGroup
                    {

                    			markComposite(elementTypeProvider.getFieldSelectChild_FieldOptionGroupParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldOptionGroup_1=ruleFieldOptionGroup();

                    state._fsp--;


                    			current = this_FieldOptionGroup_1;
                    			doneComposite();
                    		

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
    // PsiInternalCalculatorForm.g:613:1: entryRuleFieldOption returns [Boolean current=false] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final Boolean entryRuleFieldOption() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldOption = null;


        try {
            // PsiInternalCalculatorForm.g:613:53: (iv_ruleFieldOption= ruleFieldOption EOF )
            // PsiInternalCalculatorForm.g:614:2: iv_ruleFieldOption= ruleFieldOption EOF
            {
             markComposite(elementTypeProvider.getFieldOptionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldOption=ruleFieldOption();

            state._fsp--;

             current =iv_ruleFieldOption; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:620:1: ruleFieldOption returns [Boolean current=false] : (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:621:1: ( (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:622:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:622:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:623:3: otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            {

            			markLeaf(elementTypeProvider.getFieldOption_OptionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:630:3: ( (lv_text_1_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:631:4: (lv_text_1_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:631:4: (lv_text_1_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:632:5: lv_text_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getFieldOption_TextSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_text_1_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:647:3: ( (lv_disabled_2_0= 'disabled' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalCalculatorForm.g:648:4: (lv_disabled_2_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:648:4: (lv_disabled_2_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:649:5: lv_disabled_2_0= 'disabled'
                    {

                    					markLeaf(elementTypeProvider.getFieldOption_DisabledDisabledKeyword_2_0ElementType());
                    				
                    lv_disabled_2_0=(Token)match(input,13,FOLLOW_25); 

                    					doneLeaf(lv_disabled_2_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:664:3: ( (lv_selected_3_0= 'selected' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalCalculatorForm.g:665:4: (lv_selected_3_0= 'selected' )
                    {
                    // PsiInternalCalculatorForm.g:665:4: (lv_selected_3_0= 'selected' )
                    // PsiInternalCalculatorForm.g:666:5: lv_selected_3_0= 'selected'
                    {

                    					markLeaf(elementTypeProvider.getFieldOption_SelectedSelectedKeyword_3_0ElementType());
                    				
                    lv_selected_3_0=(Token)match(input,26,FOLLOW_26); 

                    					doneLeaf(lv_selected_3_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:681:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalCalculatorForm.g:682:4: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldOption_TextKeyword_4_0ElementType());
                    			
                    otherlv_4=(Token)match(input,27,FOLLOW_8); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalCalculatorForm.g:689:4: ( (lv_text_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:690:5: (lv_text_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:690:5: (lv_text_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:691:6: lv_text_5_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldOption_TextSTRINGTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_text_5_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:707:3: (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalCalculatorForm.g:708:4: otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldOption_ValueKeyword_5_0ElementType());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_8); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalCalculatorForm.g:715:4: ( (lv_value_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:716:5: (lv_value_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:716:5: (lv_value_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:717:6: lv_value_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldOption_ValueSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_value_7_0);
                    					

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
    // PsiInternalCalculatorForm.g:737:1: entryRuleFieldOptionGroup returns [Boolean current=false] : iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF ;
    public final Boolean entryRuleFieldOptionGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldOptionGroup = null;


        try {
            // PsiInternalCalculatorForm.g:737:58: (iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF )
            // PsiInternalCalculatorForm.g:738:2: iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF
            {
             markComposite(elementTypeProvider.getFieldOptionGroupElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldOptionGroup=ruleFieldOptionGroup();

            state._fsp--;

             current =iv_ruleFieldOptionGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:744:1: ruleFieldOptionGroup returns [Boolean current=false] : (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) ;
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
            // PsiInternalCalculatorForm.g:745:1: ( (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) )
            // PsiInternalCalculatorForm.g:746:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            {
            // PsiInternalCalculatorForm.g:746:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            // PsiInternalCalculatorForm.g:747:3: otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getFieldOptionGroup_OptionGroupKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,28,FOLLOW_27); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:754:3: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalCalculatorForm.g:755:4: (lv_disabled_1_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:755:4: (lv_disabled_1_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:756:5: lv_disabled_1_0= 'disabled'
                    {

                    					markLeaf(elementTypeProvider.getFieldOptionGroup_DisabledDisabledKeyword_1_0ElementType());
                    				
                    lv_disabled_1_0=(Token)match(input,13,FOLLOW_28); 

                    					doneLeaf(lv_disabled_1_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:771:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalCalculatorForm.g:772:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldOptionGroup_LabelKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalCalculatorForm.g:779:4: ( (lv_label_3_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:780:5: (lv_label_3_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:780:5: (lv_label_3_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:781:6: lv_label_3_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldOptionGroup_LabelSTRINGTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_label_3_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getFieldOptionGroup_LeftCurlyBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_29); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalCalculatorForm.g:804:3: ( (lv_options_5_0= ruleFieldOption ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:805:4: (lv_options_5_0= ruleFieldOption )
            	    {
            	    // PsiInternalCalculatorForm.g:805:4: (lv_options_5_0= ruleFieldOption )
            	    // PsiInternalCalculatorForm.g:806:5: lv_options_5_0= ruleFieldOption
            	    {

            	    					markComposite(elementTypeProvider.getFieldOptionGroup_OptionsFieldOptionParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_options_5_0=ruleFieldOption();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getFieldOptionGroup_RightCurlyBracketKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

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
    // PsiInternalCalculatorForm.g:830:1: entryRuleFieldChoice returns [Boolean current=false] : iv_ruleFieldChoice= ruleFieldChoice EOF ;
    public final Boolean entryRuleFieldChoice() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldChoice = null;


        try {
            // PsiInternalCalculatorForm.g:830:53: (iv_ruleFieldChoice= ruleFieldChoice EOF )
            // PsiInternalCalculatorForm.g:831:2: iv_ruleFieldChoice= ruleFieldChoice EOF
            {
             markComposite(elementTypeProvider.getFieldChoiceElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldChoice=ruleFieldChoice();

            state._fsp--;

             current =iv_ruleFieldChoice; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:837:1: ruleFieldChoice returns [Boolean current=false] : (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) ;
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
            // PsiInternalCalculatorForm.g:838:1: ( (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) )
            // PsiInternalCalculatorForm.g:839:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            {
            // PsiInternalCalculatorForm.g:839:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            // PsiInternalCalculatorForm.g:840:3: otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            {

            			markLeaf(elementTypeProvider.getFieldChoice_ChoiceKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:847:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:848:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:848:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:849:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFieldChoice_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:864:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalCalculatorForm.g:865:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:865:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:866:5: lv_autofocus_2_0= 'autofocus'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoice_AutofocusAutofocusKeyword_2_0ElementType());
                    				
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_31); 

                    					doneLeaf(lv_autofocus_2_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:881:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // PsiInternalCalculatorForm.g:882:4: (lv_checked_3_0= 'checked' )
                    {
                    // PsiInternalCalculatorForm.g:882:4: (lv_checked_3_0= 'checked' )
                    // PsiInternalCalculatorForm.g:883:5: lv_checked_3_0= 'checked'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoice_CheckedCheckedKeyword_3_0ElementType());
                    				
                    lv_checked_3_0=(Token)match(input,30,FOLLOW_32); 

                    					doneLeaf(lv_checked_3_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:898:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalCalculatorForm.g:899:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:899:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:900:5: lv_disabled_4_0= 'disabled'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoice_DisabledDisabledKeyword_4_0ElementType());
                    				
                    lv_disabled_4_0=(Token)match(input,13,FOLLOW_33); 

                    					doneLeaf(lv_disabled_4_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:915:3: (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalCalculatorForm.g:916:4: otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldChoice_FormKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalCalculatorForm.g:923:4: ( (lv_form_6_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:924:5: (lv_form_6_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:924:5: (lv_form_6_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:925:6: lv_form_6_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldChoice_FormSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_form_6_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_form_6_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:941:3: (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalCalculatorForm.g:942:4: otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldChoice_LabelKeyword_6_0ElementType());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalCalculatorForm.g:949:4: ( (lv_label_8_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:950:5: (lv_label_8_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:950:5: (lv_label_8_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:951:6: lv_label_8_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldChoice_LabelSTRINGTerminalRuleCall_6_1_0ElementType());
                    					
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_label_8_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:967:3: ( (lv_multiple_9_0= 'multiple' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalCalculatorForm.g:968:4: (lv_multiple_9_0= 'multiple' )
                    {
                    // PsiInternalCalculatorForm.g:968:4: (lv_multiple_9_0= 'multiple' )
                    // PsiInternalCalculatorForm.g:969:5: lv_multiple_9_0= 'multiple'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoice_MultipleMultipleKeyword_7_0ElementType());
                    				
                    lv_multiple_9_0=(Token)match(input,21,FOLLOW_36); 

                    					doneLeaf(lv_multiple_9_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:984:3: ( (lv_notdisplayed_10_0= 'notdisplayed' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // PsiInternalCalculatorForm.g:985:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    {
                    // PsiInternalCalculatorForm.g:985:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    // PsiInternalCalculatorForm.g:986:5: lv_notdisplayed_10_0= 'notdisplayed'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoice_NotdisplayedNotdisplayedKeyword_8_0ElementType());
                    				
                    lv_notdisplayed_10_0=(Token)match(input,16,FOLLOW_37); 

                    					doneLeaf(lv_notdisplayed_10_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1001:3: ( (lv_readonly_11_0= 'readonly' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1002:4: (lv_readonly_11_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:1002:4: (lv_readonly_11_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:1003:5: lv_readonly_11_0= 'readonly'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoice_ReadonlyReadonlyKeyword_9_0ElementType());
                    				
                    lv_readonly_11_0=(Token)match(input,17,FOLLOW_38); 

                    					doneLeaf(lv_readonly_11_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1018:3: ( (lv_required_12_0= 'required' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1019:4: (lv_required_12_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:1019:4: (lv_required_12_0= 'required' )
                    // PsiInternalCalculatorForm.g:1020:5: lv_required_12_0= 'required'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoice_RequiredRequiredKeyword_10_0ElementType());
                    				
                    lv_required_12_0=(Token)match(input,18,FOLLOW_39); 

                    					doneLeaf(lv_required_12_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1035:3: (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1036:4: otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldChoice_ValueKeyword_11_0ElementType());
                    			
                    otherlv_13=(Token)match(input,19,FOLLOW_8); 

                    				doneLeaf(otherlv_13);
                    			
                    // PsiInternalCalculatorForm.g:1043:4: ( (lv_value_14_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1044:5: (lv_value_14_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1044:5: (lv_value_14_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1045:6: lv_value_14_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldChoice_ValueSTRINGTerminalRuleCall_11_1_0ElementType());
                    					
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_value_14_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1061:3: (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1062:4: otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}'
                    {

                    				markLeaf(elementTypeProvider.getFieldChoice_LeftCurlyBracketKeyword_12_0ElementType());
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_29); 

                    				doneLeaf(otherlv_15);
                    			
                    // PsiInternalCalculatorForm.g:1069:4: ( (lv_options_16_0= ruleFieldChoiceOption ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==25) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // PsiInternalCalculatorForm.g:1070:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    {
                    	    // PsiInternalCalculatorForm.g:1070:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    // PsiInternalCalculatorForm.g:1071:6: lv_options_16_0= ruleFieldChoiceOption
                    	    {

                    	    						markComposite(elementTypeProvider.getFieldChoice_OptionsFieldChoiceOptionParserRuleCall_12_1_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_options_16_0=ruleFieldChoiceOption();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    				markLeaf(elementTypeProvider.getFieldChoice_RightCurlyBracketKeyword_12_2ElementType());
                    			
                    otherlv_17=(Token)match(input,24,FOLLOW_2); 

                    				doneLeaf(otherlv_17);
                    			

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
    // PsiInternalCalculatorForm.g:1096:1: entryRuleFieldChoiceOption returns [Boolean current=false] : iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF ;
    public final Boolean entryRuleFieldChoiceOption() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldChoiceOption = null;


        try {
            // PsiInternalCalculatorForm.g:1096:59: (iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF )
            // PsiInternalCalculatorForm.g:1097:2: iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF
            {
             markComposite(elementTypeProvider.getFieldChoiceOptionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldChoiceOption=ruleFieldChoiceOption();

            state._fsp--;

             current =iv_ruleFieldChoiceOption; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:1103:1: ruleFieldChoiceOption returns [Boolean current=false] : (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:1104:1: ( (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:1105:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:1105:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:1106:3: otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            {

            			markLeaf(elementTypeProvider.getFieldChoiceOption_OptionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:1113:3: ( (lv_label_1_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:1114:4: (lv_label_1_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:1114:4: (lv_label_1_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:1115:5: lv_label_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getFieldChoiceOption_LabelSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_label_1_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:1130:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1131:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:1131:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:1132:5: lv_autofocus_2_0= 'autofocus'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoiceOption_AutofocusAutofocusKeyword_2_0ElementType());
                    				
                    lv_autofocus_2_0=(Token)match(input,12,FOLLOW_42); 

                    					doneLeaf(lv_autofocus_2_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1147:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==30) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1148:4: (lv_checked_3_0= 'checked' )
                    {
                    // PsiInternalCalculatorForm.g:1148:4: (lv_checked_3_0= 'checked' )
                    // PsiInternalCalculatorForm.g:1149:5: lv_checked_3_0= 'checked'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoiceOption_CheckedCheckedKeyword_3_0ElementType());
                    				
                    lv_checked_3_0=(Token)match(input,30,FOLLOW_43); 

                    					doneLeaf(lv_checked_3_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1164:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==13) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1165:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:1165:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:1166:5: lv_disabled_4_0= 'disabled'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoiceOption_DisabledDisabledKeyword_4_0ElementType());
                    				
                    lv_disabled_4_0=(Token)match(input,13,FOLLOW_11); 

                    					doneLeaf(lv_disabled_4_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1181:3: ( (lv_readonly_5_0= 'readonly' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1182:4: (lv_readonly_5_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:1182:4: (lv_readonly_5_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:1183:5: lv_readonly_5_0= 'readonly'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoiceOption_ReadonlyReadonlyKeyword_5_0ElementType());
                    				
                    lv_readonly_5_0=(Token)match(input,17,FOLLOW_12); 

                    					doneLeaf(lv_readonly_5_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1198:3: ( (lv_required_6_0= 'required' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1199:4: (lv_required_6_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:1199:4: (lv_required_6_0= 'required' )
                    // PsiInternalCalculatorForm.g:1200:5: lv_required_6_0= 'required'
                    {

                    					markLeaf(elementTypeProvider.getFieldChoiceOption_RequiredRequiredKeyword_6_0ElementType());
                    				
                    lv_required_6_0=(Token)match(input,18,FOLLOW_13); 

                    					doneLeaf(lv_required_6_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1215:3: (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1216:4: otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getFieldChoiceOption_ValueKeyword_7_0ElementType());
                    			
                    otherlv_7=(Token)match(input,19,FOLLOW_8); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalCalculatorForm.g:1223:4: ( (lv_value_8_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1224:5: (lv_value_8_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1224:5: (lv_value_8_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1225:6: lv_value_8_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getFieldChoiceOption_ValueSTRINGTerminalRuleCall_7_1_0ElementType());
                    					
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_value_8_0);
                    					

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
    // PsiInternalCalculatorForm.g:1245:1: entryRuleGroup returns [Boolean current=false] : iv_ruleGroup= ruleGroup EOF ;
    public final Boolean entryRuleGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleGroup = null;


        try {
            // PsiInternalCalculatorForm.g:1245:47: (iv_ruleGroup= ruleGroup EOF )
            // PsiInternalCalculatorForm.g:1246:2: iv_ruleGroup= ruleGroup EOF
            {
             markComposite(elementTypeProvider.getGroupElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:1252:1: ruleGroup returns [Boolean current=false] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
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
            // PsiInternalCalculatorForm.g:1253:1: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // PsiInternalCalculatorForm.g:1254:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // PsiInternalCalculatorForm.g:1254:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // PsiInternalCalculatorForm.g:1255:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getGroup_GroupKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:1262:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:1263:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:1263:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:1264:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getGroup_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:1279:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==15) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1280:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getGroup_LabelKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalCalculatorForm.g:1287:4: ( (lv_label_3_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1288:5: (lv_label_3_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1288:5: (lv_label_3_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1289:6: lv_label_3_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getGroup_LabelSTRINGTerminalRuleCall_2_1_0ElementType());
                    					
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_label_3_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getGroup_LeftCurlyBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_44); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalCalculatorForm.g:1312:3: ( (lv_fields_5_0= ruleField ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==11||LA47_0==20||LA47_0==29||LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1313:4: (lv_fields_5_0= ruleField )
            	    {
            	    // PsiInternalCalculatorForm.g:1313:4: (lv_fields_5_0= ruleField )
            	    // PsiInternalCalculatorForm.g:1314:5: lv_fields_5_0= ruleField
            	    {

            	    					markComposite(elementTypeProvider.getGroup_FieldsFieldParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getGroup_RightCurlyBracketKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

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
    // PsiInternalCalculatorForm.g:1338:1: entryRulePage returns [Boolean current=false] : iv_rulePage= rulePage EOF ;
    public final Boolean entryRulePage() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePage = null;


        try {
            // PsiInternalCalculatorForm.g:1338:46: (iv_rulePage= rulePage EOF )
            // PsiInternalCalculatorForm.g:1339:2: iv_rulePage= rulePage EOF
            {
             markComposite(elementTypeProvider.getPageElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:1345:1: rulePage returns [Boolean current=false] : (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) ;
    public final Boolean rulePage() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_childs_2_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1346:1: ( (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) )
            // PsiInternalCalculatorForm.g:1347:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            {
            // PsiInternalCalculatorForm.g:1347:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            // PsiInternalCalculatorForm.g:1348:3: otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}'
            {

            			markLeaf(elementTypeProvider.getPage_PageKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getPage_LeftCurlyBracketKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_45); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalCalculatorForm.g:1362:3: ( (lv_childs_2_0= rulePageChild ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==11||LA48_0==20||LA48_0==29||LA48_0==31||LA48_0==33) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1363:4: (lv_childs_2_0= rulePageChild )
            	    {
            	    // PsiInternalCalculatorForm.g:1363:4: (lv_childs_2_0= rulePageChild )
            	    // PsiInternalCalculatorForm.g:1364:5: lv_childs_2_0= rulePageChild
            	    {

            	    					markComposite(elementTypeProvider.getPage_ChildsPageChildParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_childs_2_0=rulePageChild();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getPage_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			doneLeaf(otherlv_3);
            		

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
    // PsiInternalCalculatorForm.g:1388:1: entryRulePageChild returns [Boolean current=false] : iv_rulePageChild= rulePageChild EOF ;
    public final Boolean entryRulePageChild() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePageChild = null;


        try {
            // PsiInternalCalculatorForm.g:1388:51: (iv_rulePageChild= rulePageChild EOF )
            // PsiInternalCalculatorForm.g:1389:2: iv_rulePageChild= rulePageChild EOF
            {
             markComposite(elementTypeProvider.getPageChildElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePageChild=rulePageChild();

            state._fsp--;

             current =iv_rulePageChild; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:1395:1: rulePageChild returns [Boolean current=false] : (this_Group_0= ruleGroup | this_Field_1= ruleField ) ;
    public final Boolean rulePageChild() throws RecognitionException {
        Boolean current = false;

        Boolean this_Group_0 = null;

        Boolean this_Field_1 = null;


        try {
            // PsiInternalCalculatorForm.g:1396:1: ( (this_Group_0= ruleGroup | this_Field_1= ruleField ) )
            // PsiInternalCalculatorForm.g:1397:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            {
            // PsiInternalCalculatorForm.g:1397:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
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
                    // PsiInternalCalculatorForm.g:1398:3: this_Group_0= ruleGroup
                    {

                    			markComposite(elementTypeProvider.getPageChild_GroupParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Group_0=ruleGroup();

                    state._fsp--;


                    			current = this_Group_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:1407:3: this_Field_1= ruleField
                    {

                    			markComposite(elementTypeProvider.getPageChild_FieldParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_1=ruleField();

                    state._fsp--;


                    			current = this_Field_1;
                    			doneComposite();
                    		

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
    // PsiInternalCalculatorForm.g:1419:1: entryRuleButton returns [Boolean current=false] : iv_ruleButton= ruleButton EOF ;
    public final Boolean entryRuleButton() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleButton = null;


        try {
            // PsiInternalCalculatorForm.g:1419:48: (iv_ruleButton= ruleButton EOF )
            // PsiInternalCalculatorForm.g:1420:2: iv_ruleButton= ruleButton EOF
            {
             markComposite(elementTypeProvider.getButtonElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:1426:1: ruleButton returns [Boolean current=false] : this_ButtonSubmit_0= ruleButtonSubmit ;
    public final Boolean ruleButton() throws RecognitionException {
        Boolean current = false;

        Boolean this_ButtonSubmit_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1427:1: (this_ButtonSubmit_0= ruleButtonSubmit )
            // PsiInternalCalculatorForm.g:1428:2: this_ButtonSubmit_0= ruleButtonSubmit
            {

            		markComposite(elementTypeProvider.getButton_ButtonSubmitParserRuleCallElementType());
            	
            pushFollow(FOLLOW_2);
            this_ButtonSubmit_0=ruleButtonSubmit();

            state._fsp--;


            		current = this_ButtonSubmit_0;
            		doneComposite();
            	

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
    // PsiInternalCalculatorForm.g:1439:1: entryRuleButtonSubmit returns [Boolean current=false] : iv_ruleButtonSubmit= ruleButtonSubmit EOF ;
    public final Boolean entryRuleButtonSubmit() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleButtonSubmit = null;


        try {
            // PsiInternalCalculatorForm.g:1439:54: (iv_ruleButtonSubmit= ruleButtonSubmit EOF )
            // PsiInternalCalculatorForm.g:1440:2: iv_ruleButtonSubmit= ruleButtonSubmit EOF
            {
             markComposite(elementTypeProvider.getButtonSubmitElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleButtonSubmit=ruleButtonSubmit();

            state._fsp--;

             current =iv_ruleButtonSubmit; 
            match(input,EOF,FOLLOW_2); 

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
    // PsiInternalCalculatorForm.g:1446:1: ruleButtonSubmit returns [Boolean current=false] : (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:1447:1: ( (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:1448:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:1448:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:1449:3: otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            {

            			markLeaf(elementTypeProvider.getButtonSubmit_SubmitButtonKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalCalculatorForm.g:1456:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:1457:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:1457:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:1458:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getButtonSubmit_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:1473:3: ( (lv_text_2_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:1474:4: (lv_text_2_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:1474:4: (lv_text_2_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:1475:5: lv_text_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getButtonSubmit_TextSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_text_2_0);
            				

            }


            }

            // PsiInternalCalculatorForm.g:1490:3: ( (lv_autofocus_3_0= 'autofocus' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==12) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1491:4: (lv_autofocus_3_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:1491:4: (lv_autofocus_3_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:1492:5: lv_autofocus_3_0= 'autofocus'
                    {

                    					markLeaf(elementTypeProvider.getButtonSubmit_AutofocusAutofocusKeyword_3_0ElementType());
                    				
                    lv_autofocus_3_0=(Token)match(input,12,FOLLOW_47); 

                    					doneLeaf(lv_autofocus_3_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1507:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==13) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1508:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:1508:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:1509:5: lv_disabled_4_0= 'disabled'
                    {

                    					markLeaf(elementTypeProvider.getButtonSubmit_DisabledDisabledKeyword_4_0ElementType());
                    				
                    lv_disabled_4_0=(Token)match(input,13,FOLLOW_13); 

                    					doneLeaf(lv_disabled_4_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalCalculatorForm.g:1524:3: (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1525:4: otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) )
                    {

                    				markLeaf(elementTypeProvider.getButtonSubmit_ValueKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalCalculatorForm.g:1532:4: ( (lv_value_6_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1533:5: (lv_value_6_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1533:5: (lv_value_6_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1534:6: lv_value_6_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getButtonSubmit_ValueSTRINGTerminalRuleCall_5_1_0ElementType());
                    					
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_value_6_0);
                    					

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