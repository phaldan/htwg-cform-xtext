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
    // PsiInternalCalculatorForm.g:59:1: ruleModel returns [Boolean current=false] : ( (lv_forms_0_0= ruleForm ) )* ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_forms_0_0 = null;


        try {
            // PsiInternalCalculatorForm.g:60:1: ( ( (lv_forms_0_0= ruleForm ) )* )
            // PsiInternalCalculatorForm.g:61:2: ( (lv_forms_0_0= ruleForm ) )*
            {
            // PsiInternalCalculatorForm.g:61:2: ( (lv_forms_0_0= ruleForm ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:62:3: (lv_forms_0_0= ruleForm )
            	    {
            	    // PsiInternalCalculatorForm.g:62:3: (lv_forms_0_0= ruleForm )
            	    // PsiInternalCalculatorForm.g:63:4: lv_forms_0_0= ruleForm
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markComposite(elementTypeProvider.getModel_FormsFormParserRuleCall_0ElementType());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_forms_0_0=ruleForm();

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


    // $ANTLR start "entryRuleForm"
    // PsiInternalCalculatorForm.g:79:1: entryRuleForm returns [Boolean current=false] : iv_ruleForm= ruleForm EOF ;
    public final Boolean entryRuleForm() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleForm = null;


        try {
            // PsiInternalCalculatorForm.g:79:46: (iv_ruleForm= ruleForm EOF )
            // PsiInternalCalculatorForm.g:80:2: iv_ruleForm= ruleForm EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFormElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // PsiInternalCalculatorForm.g:86:1: ruleForm returns [Boolean current=false] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' ) ;
    public final Boolean ruleForm() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Boolean lv_formElements_3_0 = null;

        Boolean lv_calculations_4_0 = null;


        try {
            // PsiInternalCalculatorForm.g:87:1: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' ) )
            // PsiInternalCalculatorForm.g:88:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' )
            {
            // PsiInternalCalculatorForm.g:88:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}' )
            // PsiInternalCalculatorForm.g:89:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_formElements_3_0= ruleFormElement ) )* ( (lv_calculations_4_0= ruleCalculate ) )* otherlv_5= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getForm_FormKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:96:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:97:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:97:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:98:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getForm_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getForm_LeftCurlyBracketKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCalculatorForm.g:120:3: ( (lv_formElements_3_0= ruleFormElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==24||LA2_0==31||(LA2_0>=33 && LA2_0<=35)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:121:4: (lv_formElements_3_0= ruleFormElement )
            	    {
            	    // PsiInternalCalculatorForm.g:121:4: (lv_formElements_3_0= ruleFormElement )
            	    // PsiInternalCalculatorForm.g:122:5: lv_formElements_3_0= ruleFormElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getForm_FormElementsFormElementParserRuleCall_3_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_formElements_3_0=ruleFormElement();

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

            // PsiInternalCalculatorForm.g:135:3: ( (lv_calculations_4_0= ruleCalculate ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:136:4: (lv_calculations_4_0= ruleCalculate )
            	    {
            	    // PsiInternalCalculatorForm.g:136:4: (lv_calculations_4_0= ruleCalculate )
            	    // PsiInternalCalculatorForm.g:137:5: lv_calculations_4_0= ruleCalculate
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getForm_CalculationsCalculateParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_calculations_4_0=ruleCalculate();

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
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getForm_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_5);
              		
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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleFormElement"
    // PsiInternalCalculatorForm.g:161:1: entryRuleFormElement returns [Boolean current=false] : iv_ruleFormElement= ruleFormElement EOF ;
    public final Boolean entryRuleFormElement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFormElement = null;


        try {
            // PsiInternalCalculatorForm.g:161:53: (iv_ruleFormElement= ruleFormElement EOF )
            // PsiInternalCalculatorForm.g:162:2: iv_ruleFormElement= ruleFormElement EOF
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
    // PsiInternalCalculatorForm.g:168:1: ruleFormElement returns [Boolean current=false] : (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) ;
    public final Boolean ruleFormElement() throws RecognitionException {
        Boolean current = false;

        Boolean this_Field_0 = null;

        Boolean this_Group_1 = null;

        Boolean this_Page_2 = null;


        try {
            // PsiInternalCalculatorForm.g:169:1: ( (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage ) )
            // PsiInternalCalculatorForm.g:170:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
            {
            // PsiInternalCalculatorForm.g:170:2: (this_Field_0= ruleField | this_Group_1= ruleGroup | this_Page_2= rulePage )
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
                    // PsiInternalCalculatorForm.g:171:3: this_Field_0= ruleField
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
                    // PsiInternalCalculatorForm.g:180:3: this_Group_1= ruleGroup
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
                    // PsiInternalCalculatorForm.g:189:3: this_Page_2= rulePage
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
    // PsiInternalCalculatorForm.g:201:1: entryRuleField returns [Boolean current=false] : iv_ruleField= ruleField EOF ;
    public final Boolean entryRuleField() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleField = null;


        try {
            // PsiInternalCalculatorForm.g:201:47: (iv_ruleField= ruleField EOF )
            // PsiInternalCalculatorForm.g:202:2: iv_ruleField= ruleField EOF
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
    // PsiInternalCalculatorForm.g:208:1: ruleField returns [Boolean current=false] : (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) ;
    public final Boolean ruleField() throws RecognitionException {
        Boolean current = false;

        Boolean this_FieldInput_0 = null;

        Boolean this_FieldSelect_1 = null;

        Boolean this_FieldChoice_2 = null;

        Boolean this_Button_3 = null;


        try {
            // PsiInternalCalculatorForm.g:209:1: ( (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton ) )
            // PsiInternalCalculatorForm.g:210:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
            {
            // PsiInternalCalculatorForm.g:210:2: (this_FieldInput_0= ruleFieldInput | this_FieldSelect_1= ruleFieldSelect | this_FieldChoice_2= ruleFieldChoice | this_Button_3= ruleButton )
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
                    // PsiInternalCalculatorForm.g:211:3: this_FieldInput_0= ruleFieldInput
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
                    // PsiInternalCalculatorForm.g:220:3: this_FieldSelect_1= ruleFieldSelect
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
                    // PsiInternalCalculatorForm.g:229:3: this_FieldChoice_2= ruleFieldChoice
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
                    // PsiInternalCalculatorForm.g:238:3: this_Button_3= ruleButton
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
    // PsiInternalCalculatorForm.g:250:1: entryRuleFieldInput returns [Boolean current=false] : iv_ruleFieldInput= ruleFieldInput EOF ;
    public final Boolean entryRuleFieldInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldInput = null;


        try {
            // PsiInternalCalculatorForm.g:250:52: (iv_ruleFieldInput= ruleFieldInput EOF )
            // PsiInternalCalculatorForm.g:251:2: iv_ruleFieldInput= ruleFieldInput EOF
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
    // PsiInternalCalculatorForm.g:257:1: ruleFieldInput returns [Boolean current=false] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:258:1: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:259:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:259:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:260:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_notdisplayed_8_0= 'notdisplayed' ) )? ( (lv_readonly_9_0= 'readonly' ) )? ( (lv_required_10_0= 'required' ) )? (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldInput_FieldKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:267:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:268:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:268:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:269:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldInput_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:284:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalCalculatorForm.g:285:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:285:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:286:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:301:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalCalculatorForm.g:302:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:302:4: (lv_disabled_3_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:303:5: lv_disabled_3_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_DisabledDisabledKeyword_3_0ElementType());
                      				
                    }
                    lv_disabled_3_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:318:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalCalculatorForm.g:319:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldInput_FormKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCalculatorForm.g:326:4: ( (lv_form_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:327:5: (lv_form_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:327:5: (lv_form_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:328:6: lv_form_5_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldInput_FormSTRINGTerminalRuleCall_4_1_0ElementType());
                      					
                    }
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:344:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalCalculatorForm.g:345:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldInput_LabelKeyword_5_0ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }
                    // PsiInternalCalculatorForm.g:352:4: ( (lv_label_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:353:5: (lv_label_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:353:5: (lv_label_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:354:6: lv_label_7_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldInput_LabelSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_13); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:370:3: ( (lv_notdisplayed_8_0= 'notdisplayed' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalCalculatorForm.g:371:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    {
                    // PsiInternalCalculatorForm.g:371:4: (lv_notdisplayed_8_0= 'notdisplayed' )
                    // PsiInternalCalculatorForm.g:372:5: lv_notdisplayed_8_0= 'notdisplayed'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_NotdisplayedNotdisplayedKeyword_6_0ElementType());
                      				
                    }
                    lv_notdisplayed_8_0=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:387:3: ( (lv_readonly_9_0= 'readonly' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalCalculatorForm.g:388:4: (lv_readonly_9_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:388:4: (lv_readonly_9_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:389:5: lv_readonly_9_0= 'readonly'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_ReadonlyReadonlyKeyword_7_0ElementType());
                      				
                    }
                    lv_readonly_9_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:404:3: ( (lv_required_10_0= 'required' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalCalculatorForm.g:405:4: (lv_required_10_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:405:4: (lv_required_10_0= 'required' )
                    // PsiInternalCalculatorForm.g:406:5: lv_required_10_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldInput_RequiredRequiredKeyword_8_0ElementType());
                      				
                    }
                    lv_required_10_0=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:421:3: (otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PsiInternalCalculatorForm.g:422:4: otherlv_11= 'value' ( (lv_value_12_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldInput_ValueKeyword_9_0ElementType());
                      			
                    }
                    otherlv_11=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_11);
                      			
                    }
                    // PsiInternalCalculatorForm.g:429:4: ( (lv_value_12_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:430:5: (lv_value_12_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:430:5: (lv_value_12_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:431:6: lv_value_12_0= RULE_STRING
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
    // PsiInternalCalculatorForm.g:451:1: entryRuleFieldSelect returns [Boolean current=false] : iv_ruleFieldSelect= ruleFieldSelect EOF ;
    public final Boolean entryRuleFieldSelect() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldSelect = null;


        try {
            // PsiInternalCalculatorForm.g:451:53: (iv_ruleFieldSelect= ruleFieldSelect EOF )
            // PsiInternalCalculatorForm.g:452:2: iv_ruleFieldSelect= ruleFieldSelect EOF
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
    // PsiInternalCalculatorForm.g:458:1: ruleFieldSelect returns [Boolean current=false] : (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) ;
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
            // PsiInternalCalculatorForm.g:459:1: ( (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' ) )
            // PsiInternalCalculatorForm.g:460:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            {
            // PsiInternalCalculatorForm.g:460:2: (otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}' )
            // PsiInternalCalculatorForm.g:461:3: otherlv_0= 'dropdown' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_disabled_3_0= 'disabled' ) )? (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )? (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )? ( (lv_multiple_8_0= 'multiple' ) )? ( (lv_required_9_0= 'required' ) )? (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )? otherlv_12= '{' ( (lv_childs_13_0= ruleFieldSelectChild ) )* otherlv_14= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldSelect_DropdownKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:468:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:469:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:469:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:470:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldSelect_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:485:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalCalculatorForm.g:486:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:486:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:487:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:502:3: ( (lv_disabled_3_0= 'disabled' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalCalculatorForm.g:503:4: (lv_disabled_3_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:503:4: (lv_disabled_3_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:504:5: lv_disabled_3_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_DisabledDisabledKeyword_3_0ElementType());
                      				
                    }
                    lv_disabled_3_0=(Token)match(input,18,FOLLOW_19); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:519:3: (otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalCalculatorForm.g:520:4: otherlv_4= 'form' ( (lv_form_5_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldSelect_FormKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCalculatorForm.g:527:4: ( (lv_form_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:528:5: (lv_form_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:528:5: (lv_form_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:529:6: lv_form_5_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldSelect_FormSTRINGTerminalRuleCall_4_1_0ElementType());
                      					
                    }
                    lv_form_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:545:3: (otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalCalculatorForm.g:546:4: otherlv_6= 'label' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldSelect_LabelKeyword_5_0ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }
                    // PsiInternalCalculatorForm.g:553:4: ( (lv_label_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:554:5: (lv_label_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:554:5: (lv_label_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:555:6: lv_label_7_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldSelect_LabelSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_21); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:571:3: ( (lv_multiple_8_0= 'multiple' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalCalculatorForm.g:572:4: (lv_multiple_8_0= 'multiple' )
                    {
                    // PsiInternalCalculatorForm.g:572:4: (lv_multiple_8_0= 'multiple' )
                    // PsiInternalCalculatorForm.g:573:5: lv_multiple_8_0= 'multiple'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_MultipleMultipleKeyword_6_0ElementType());
                      				
                    }
                    lv_multiple_8_0=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:588:3: ( (lv_required_9_0= 'required' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalCalculatorForm.g:589:4: (lv_required_9_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:589:4: (lv_required_9_0= 'required' )
                    // PsiInternalCalculatorForm.g:590:5: lv_required_9_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldSelect_RequiredRequiredKeyword_7_0ElementType());
                      				
                    }
                    lv_required_9_0=(Token)match(input,22,FOLLOW_23); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:605:3: (otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalCalculatorForm.g:606:4: otherlv_10= 'size' ( (lv_size_11_0= RULE_INT ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldSelect_SizeKeyword_8_0ElementType());
                      			
                    }
                    otherlv_10=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_10);
                      			
                    }
                    // PsiInternalCalculatorForm.g:613:4: ( (lv_size_11_0= RULE_INT ) )
                    // PsiInternalCalculatorForm.g:614:5: (lv_size_11_0= RULE_INT )
                    {
                    // PsiInternalCalculatorForm.g:614:5: (lv_size_11_0= RULE_INT )
                    // PsiInternalCalculatorForm.g:615:6: lv_size_11_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldSelect_SizeINTTerminalRuleCall_8_1_0ElementType());
                      					
                    }
                    lv_size_11_0=(Token)match(input,RULE_INT,FOLLOW_5); if (state.failed) return current;
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
            otherlv_12=(Token)match(input,14,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_12);
              		
            }
            // PsiInternalCalculatorForm.g:638:3: ( (lv_childs_13_0= ruleFieldSelectChild ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27||LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:639:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    {
            	    // PsiInternalCalculatorForm.g:639:4: (lv_childs_13_0= ruleFieldSelectChild )
            	    // PsiInternalCalculatorForm.g:640:5: lv_childs_13_0= ruleFieldSelectChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getFieldSelect_ChildsFieldSelectChildParserRuleCall_10_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
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
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldSelect_RightCurlyBracketKeyword_11ElementType());
              		
            }
            otherlv_14=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // PsiInternalCalculatorForm.g:664:1: entryRuleFieldSelectChild returns [Boolean current=false] : iv_ruleFieldSelectChild= ruleFieldSelectChild EOF ;
    public final Boolean entryRuleFieldSelectChild() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldSelectChild = null;


        try {
            // PsiInternalCalculatorForm.g:664:58: (iv_ruleFieldSelectChild= ruleFieldSelectChild EOF )
            // PsiInternalCalculatorForm.g:665:2: iv_ruleFieldSelectChild= ruleFieldSelectChild EOF
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
    // PsiInternalCalculatorForm.g:671:1: ruleFieldSelectChild returns [Boolean current=false] : (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) ;
    public final Boolean ruleFieldSelectChild() throws RecognitionException {
        Boolean current = false;

        Boolean this_FieldOption_0 = null;

        Boolean this_FieldOptionGroup_1 = null;


        try {
            // PsiInternalCalculatorForm.g:672:1: ( (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup ) )
            // PsiInternalCalculatorForm.g:673:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
            {
            // PsiInternalCalculatorForm.g:673:2: (this_FieldOption_0= ruleFieldOption | this_FieldOptionGroup_1= ruleFieldOptionGroup )
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
                    // PsiInternalCalculatorForm.g:674:3: this_FieldOption_0= ruleFieldOption
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
                    // PsiInternalCalculatorForm.g:683:3: this_FieldOptionGroup_1= ruleFieldOptionGroup
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
    // PsiInternalCalculatorForm.g:695:1: entryRuleFieldOption returns [Boolean current=false] : iv_ruleFieldOption= ruleFieldOption EOF ;
    public final Boolean entryRuleFieldOption() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldOption = null;


        try {
            // PsiInternalCalculatorForm.g:695:53: (iv_ruleFieldOption= ruleFieldOption EOF )
            // PsiInternalCalculatorForm.g:696:2: iv_ruleFieldOption= ruleFieldOption EOF
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
    // PsiInternalCalculatorForm.g:702:1: ruleFieldOption returns [Boolean current=false] : (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:703:1: ( (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:704:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:704:2: (otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:705:3: otherlv_0= 'option' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_disabled_2_0= 'disabled' ) )? ( (lv_selected_3_0= 'selected' ) )? (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )? (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldOption_OptionKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:712:3: ( (lv_text_1_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:713:4: (lv_text_1_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:713:4: (lv_text_1_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:714:5: lv_text_1_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldOption_TextSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:729:3: ( (lv_disabled_2_0= 'disabled' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalCalculatorForm.g:730:4: (lv_disabled_2_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:730:4: (lv_disabled_2_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:731:5: lv_disabled_2_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldOption_DisabledDisabledKeyword_2_0ElementType());
                      				
                    }
                    lv_disabled_2_0=(Token)match(input,18,FOLLOW_27); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:746:3: ( (lv_selected_3_0= 'selected' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalCalculatorForm.g:747:4: (lv_selected_3_0= 'selected' )
                    {
                    // PsiInternalCalculatorForm.g:747:4: (lv_selected_3_0= 'selected' )
                    // PsiInternalCalculatorForm.g:748:5: lv_selected_3_0= 'selected'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldOption_SelectedSelectedKeyword_3_0ElementType());
                      				
                    }
                    lv_selected_3_0=(Token)match(input,28,FOLLOW_28); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:763:3: (otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalCalculatorForm.g:764:4: otherlv_4= 'text' ( (lv_text_5_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldOption_TextKeyword_4_0ElementType());
                      			
                    }
                    otherlv_4=(Token)match(input,29,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_4);
                      			
                    }
                    // PsiInternalCalculatorForm.g:771:4: ( (lv_text_5_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:772:5: (lv_text_5_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:772:5: (lv_text_5_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:773:6: lv_text_5_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldOption_TextSTRINGTerminalRuleCall_4_1_0ElementType());
                      					
                    }
                    lv_text_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:789:3: (otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalCalculatorForm.g:790:4: otherlv_6= 'value' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldOption_ValueKeyword_5_0ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }
                    // PsiInternalCalculatorForm.g:797:4: ( (lv_value_7_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:798:5: (lv_value_7_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:798:5: (lv_value_7_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:799:6: lv_value_7_0= RULE_STRING
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
    // PsiInternalCalculatorForm.g:819:1: entryRuleFieldOptionGroup returns [Boolean current=false] : iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF ;
    public final Boolean entryRuleFieldOptionGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldOptionGroup = null;


        try {
            // PsiInternalCalculatorForm.g:819:58: (iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF )
            // PsiInternalCalculatorForm.g:820:2: iv_ruleFieldOptionGroup= ruleFieldOptionGroup EOF
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
    // PsiInternalCalculatorForm.g:826:1: ruleFieldOptionGroup returns [Boolean current=false] : (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) ;
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
            // PsiInternalCalculatorForm.g:827:1: ( (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' ) )
            // PsiInternalCalculatorForm.g:828:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            {
            // PsiInternalCalculatorForm.g:828:2: (otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}' )
            // PsiInternalCalculatorForm.g:829:3: otherlv_0= 'option-group' ( (lv_disabled_1_0= 'disabled' ) )? (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_options_5_0= ruleFieldOption ) )* otherlv_6= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldOptionGroup_OptionGroupKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,30,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:836:3: ( (lv_disabled_1_0= 'disabled' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalCalculatorForm.g:837:4: (lv_disabled_1_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:837:4: (lv_disabled_1_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:838:5: lv_disabled_1_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldOptionGroup_DisabledDisabledKeyword_1_0ElementType());
                      				
                    }
                    lv_disabled_1_0=(Token)match(input,18,FOLLOW_30); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:853:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalCalculatorForm.g:854:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldOptionGroup_LabelKeyword_2_0ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalCalculatorForm.g:861:4: ( (lv_label_3_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:862:5: (lv_label_3_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:862:5: (lv_label_3_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:863:6: lv_label_3_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldOptionGroup_LabelSTRINGTerminalRuleCall_2_1_0ElementType());
                      					
                    }
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
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
            otherlv_4=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalCalculatorForm.g:886:3: ( (lv_options_5_0= ruleFieldOption ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:887:4: (lv_options_5_0= ruleFieldOption )
            	    {
            	    // PsiInternalCalculatorForm.g:887:4: (lv_options_5_0= ruleFieldOption )
            	    // PsiInternalCalculatorForm.g:888:5: lv_options_5_0= ruleFieldOption
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getFieldOptionGroup_OptionsFieldOptionParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldOptionGroup_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // PsiInternalCalculatorForm.g:912:1: entryRuleFieldChoice returns [Boolean current=false] : iv_ruleFieldChoice= ruleFieldChoice EOF ;
    public final Boolean entryRuleFieldChoice() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldChoice = null;


        try {
            // PsiInternalCalculatorForm.g:912:53: (iv_ruleFieldChoice= ruleFieldChoice EOF )
            // PsiInternalCalculatorForm.g:913:2: iv_ruleFieldChoice= ruleFieldChoice EOF
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
    // PsiInternalCalculatorForm.g:919:1: ruleFieldChoice returns [Boolean current=false] : (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) ;
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
            // PsiInternalCalculatorForm.g:920:1: ( (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? ) )
            // PsiInternalCalculatorForm.g:921:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            {
            // PsiInternalCalculatorForm.g:921:2: (otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )? )
            // PsiInternalCalculatorForm.g:922:3: otherlv_0= 'choice' ( (lv_name_1_0= RULE_ID ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )? (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )? ( (lv_multiple_9_0= 'multiple' ) )? ( (lv_notdisplayed_10_0= 'notdisplayed' ) )? ( (lv_readonly_11_0= 'readonly' ) )? ( (lv_required_12_0= 'required' ) )? (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )? (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldChoice_ChoiceKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:929:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:930:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:930:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:931:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldChoice_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:946:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // PsiInternalCalculatorForm.g:947:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:947:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:948:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_33); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:963:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalCalculatorForm.g:964:4: (lv_checked_3_0= 'checked' )
                    {
                    // PsiInternalCalculatorForm.g:964:4: (lv_checked_3_0= 'checked' )
                    // PsiInternalCalculatorForm.g:965:5: lv_checked_3_0= 'checked'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_CheckedCheckedKeyword_3_0ElementType());
                      				
                    }
                    lv_checked_3_0=(Token)match(input,32,FOLLOW_34); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:980:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalCalculatorForm.g:981:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:981:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:982:5: lv_disabled_4_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_DisabledDisabledKeyword_4_0ElementType());
                      				
                    }
                    lv_disabled_4_0=(Token)match(input,18,FOLLOW_35); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:997:3: (otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // PsiInternalCalculatorForm.g:998:4: otherlv_5= 'form' ( (lv_form_6_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_FormKeyword_5_0ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,13,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1005:4: ( (lv_form_6_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1006:5: (lv_form_6_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1006:5: (lv_form_6_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1007:6: lv_form_6_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldChoice_FormSTRINGTerminalRuleCall_5_1_0ElementType());
                      					
                    }
                    lv_form_6_0=(Token)match(input,RULE_STRING,FOLLOW_36); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1023:3: (otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1024:4: otherlv_7= 'label' ( (lv_label_8_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_LabelKeyword_6_0ElementType());
                      			
                    }
                    otherlv_7=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_7);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1031:4: ( (lv_label_8_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1032:5: (lv_label_8_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1032:5: (lv_label_8_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1033:6: lv_label_8_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldChoice_LabelSTRINGTerminalRuleCall_6_1_0ElementType());
                      					
                    }
                    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_37); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1049:3: ( (lv_multiple_9_0= 'multiple' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1050:4: (lv_multiple_9_0= 'multiple' )
                    {
                    // PsiInternalCalculatorForm.g:1050:4: (lv_multiple_9_0= 'multiple' )
                    // PsiInternalCalculatorForm.g:1051:5: lv_multiple_9_0= 'multiple'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_MultipleMultipleKeyword_7_0ElementType());
                      				
                    }
                    lv_multiple_9_0=(Token)match(input,25,FOLLOW_38); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1066:3: ( (lv_notdisplayed_10_0= 'notdisplayed' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1067:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    {
                    // PsiInternalCalculatorForm.g:1067:4: (lv_notdisplayed_10_0= 'notdisplayed' )
                    // PsiInternalCalculatorForm.g:1068:5: lv_notdisplayed_10_0= 'notdisplayed'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_NotdisplayedNotdisplayedKeyword_8_0ElementType());
                      				
                    }
                    lv_notdisplayed_10_0=(Token)match(input,20,FOLLOW_39); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1083:3: ( (lv_readonly_11_0= 'readonly' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1084:4: (lv_readonly_11_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:1084:4: (lv_readonly_11_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:1085:5: lv_readonly_11_0= 'readonly'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_ReadonlyReadonlyKeyword_9_0ElementType());
                      				
                    }
                    lv_readonly_11_0=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1100:3: ( (lv_required_12_0= 'required' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1101:4: (lv_required_12_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:1101:4: (lv_required_12_0= 'required' )
                    // PsiInternalCalculatorForm.g:1102:5: lv_required_12_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoice_RequiredRequiredKeyword_10_0ElementType());
                      				
                    }
                    lv_required_12_0=(Token)match(input,22,FOLLOW_41); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1117:3: (otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==23) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1118:4: otherlv_13= 'value' ( (lv_value_14_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_ValueKeyword_11_0ElementType());
                      			
                    }
                    otherlv_13=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_13);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1125:4: ( (lv_value_14_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1126:5: (lv_value_14_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1126:5: (lv_value_14_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1127:6: lv_value_14_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getFieldChoice_ValueSTRINGTerminalRuleCall_11_1_0ElementType());
                      					
                    }
                    lv_value_14_0=(Token)match(input,RULE_STRING,FOLLOW_42); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1143:3: (otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1144:4: otherlv_15= '{' ( (lv_options_16_0= ruleFieldChoiceOption ) )* otherlv_17= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_LeftCurlyBracketKeyword_12_0ElementType());
                      			
                    }
                    otherlv_15=(Token)match(input,14,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_15);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1151:4: ( (lv_options_16_0= ruleFieldChoiceOption ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // PsiInternalCalculatorForm.g:1152:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    {
                    	    // PsiInternalCalculatorForm.g:1152:5: (lv_options_16_0= ruleFieldChoiceOption )
                    	    // PsiInternalCalculatorForm.g:1153:6: lv_options_16_0= ruleFieldChoiceOption
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						markComposite(elementTypeProvider.getFieldChoice_OptionsFieldChoiceOptionParserRuleCall_12_1_0ElementType());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop40;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoice_RightCurlyBracketKeyword_12_2ElementType());
                      			
                    }
                    otherlv_17=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // PsiInternalCalculatorForm.g:1178:1: entryRuleFieldChoiceOption returns [Boolean current=false] : iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF ;
    public final Boolean entryRuleFieldChoiceOption() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFieldChoiceOption = null;


        try {
            // PsiInternalCalculatorForm.g:1178:59: (iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF )
            // PsiInternalCalculatorForm.g:1179:2: iv_ruleFieldChoiceOption= ruleFieldChoiceOption EOF
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
    // PsiInternalCalculatorForm.g:1185:1: ruleFieldChoiceOption returns [Boolean current=false] : (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:1186:1: ( (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:1187:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:1187:2: (otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:1188:3: otherlv_0= 'option' ( (lv_label_1_0= RULE_STRING ) ) ( (lv_autofocus_2_0= 'autofocus' ) )? ( (lv_checked_3_0= 'checked' ) )? ( (lv_disabled_4_0= 'disabled' ) )? ( (lv_readonly_5_0= 'readonly' ) )? ( (lv_required_6_0= 'required' ) )? (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getFieldChoiceOption_OptionKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,27,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1195:3: ( (lv_label_1_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:1196:4: (lv_label_1_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:1196:4: (lv_label_1_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:1197:5: lv_label_1_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getFieldChoiceOption_LabelSTRINGTerminalRuleCall_1_0ElementType());
              				
            }
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_43); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1212:3: ( (lv_autofocus_2_0= 'autofocus' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1213:4: (lv_autofocus_2_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:1213:4: (lv_autofocus_2_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:1214:5: lv_autofocus_2_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_AutofocusAutofocusKeyword_2_0ElementType());
                      				
                    }
                    lv_autofocus_2_0=(Token)match(input,17,FOLLOW_44); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1229:3: ( (lv_checked_3_0= 'checked' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1230:4: (lv_checked_3_0= 'checked' )
                    {
                    // PsiInternalCalculatorForm.g:1230:4: (lv_checked_3_0= 'checked' )
                    // PsiInternalCalculatorForm.g:1231:5: lv_checked_3_0= 'checked'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_CheckedCheckedKeyword_3_0ElementType());
                      				
                    }
                    lv_checked_3_0=(Token)match(input,32,FOLLOW_45); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1246:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==18) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1247:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:1247:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:1248:5: lv_disabled_4_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_DisabledDisabledKeyword_4_0ElementType());
                      				
                    }
                    lv_disabled_4_0=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1263:3: ( (lv_readonly_5_0= 'readonly' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==21) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1264:4: (lv_readonly_5_0= 'readonly' )
                    {
                    // PsiInternalCalculatorForm.g:1264:4: (lv_readonly_5_0= 'readonly' )
                    // PsiInternalCalculatorForm.g:1265:5: lv_readonly_5_0= 'readonly'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_ReadonlyReadonlyKeyword_5_0ElementType());
                      				
                    }
                    lv_readonly_5_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1280:3: ( (lv_required_6_0= 'required' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==22) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1281:4: (lv_required_6_0= 'required' )
                    {
                    // PsiInternalCalculatorForm.g:1281:4: (lv_required_6_0= 'required' )
                    // PsiInternalCalculatorForm.g:1282:5: lv_required_6_0= 'required'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getFieldChoiceOption_RequiredRequiredKeyword_6_0ElementType());
                      				
                    }
                    lv_required_6_0=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1297:3: (otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1298:4: otherlv_7= 'value' ( (lv_value_8_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getFieldChoiceOption_ValueKeyword_7_0ElementType());
                      			
                    }
                    otherlv_7=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_7);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1305:4: ( (lv_value_8_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1306:5: (lv_value_8_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1306:5: (lv_value_8_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1307:6: lv_value_8_0= RULE_STRING
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
    // PsiInternalCalculatorForm.g:1327:1: entryRuleGroup returns [Boolean current=false] : iv_ruleGroup= ruleGroup EOF ;
    public final Boolean entryRuleGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleGroup = null;


        try {
            // PsiInternalCalculatorForm.g:1327:47: (iv_ruleGroup= ruleGroup EOF )
            // PsiInternalCalculatorForm.g:1328:2: iv_ruleGroup= ruleGroup EOF
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
    // PsiInternalCalculatorForm.g:1334:1: ruleGroup returns [Boolean current=false] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
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
            // PsiInternalCalculatorForm.g:1335:1: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // PsiInternalCalculatorForm.g:1336:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // PsiInternalCalculatorForm.g:1336:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // PsiInternalCalculatorForm.g:1337:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getGroup_GroupKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1344:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:1345:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:1345:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:1346:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getGroup_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1361:3: (otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1362:4: otherlv_2= 'label' ( (lv_label_3_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getGroup_LabelKeyword_2_0ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1369:4: ( (lv_label_3_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1370:5: (lv_label_3_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1370:5: (lv_label_3_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1371:6: lv_label_3_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getGroup_LabelSTRINGTerminalRuleCall_2_1_0ElementType());
                      					
                    }
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); if (state.failed) return current;
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
            otherlv_4=(Token)match(input,14,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalCalculatorForm.g:1394:3: ( (lv_fields_5_0= ruleField ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==16||LA49_0==24||LA49_0==31||LA49_0==35) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1395:4: (lv_fields_5_0= ruleField )
            	    {
            	    // PsiInternalCalculatorForm.g:1395:4: (lv_fields_5_0= ruleField )
            	    // PsiInternalCalculatorForm.g:1396:5: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getGroup_FieldsFieldParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
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
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getGroup_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // PsiInternalCalculatorForm.g:1420:1: entryRulePage returns [Boolean current=false] : iv_rulePage= rulePage EOF ;
    public final Boolean entryRulePage() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePage = null;


        try {
            // PsiInternalCalculatorForm.g:1420:46: (iv_rulePage= rulePage EOF )
            // PsiInternalCalculatorForm.g:1421:2: iv_rulePage= rulePage EOF
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
    // PsiInternalCalculatorForm.g:1427:1: rulePage returns [Boolean current=false] : (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) ;
    public final Boolean rulePage() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Boolean lv_childs_2_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1428:1: ( (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' ) )
            // PsiInternalCalculatorForm.g:1429:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            {
            // PsiInternalCalculatorForm.g:1429:2: (otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}' )
            // PsiInternalCalculatorForm.g:1430:3: otherlv_0= 'page' otherlv_1= '{' ( (lv_childs_2_0= rulePageChild ) )* otherlv_3= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPage_PageKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPage_LeftCurlyBracketKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,14,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalCalculatorForm.g:1444:3: ( (lv_childs_2_0= rulePageChild ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==16||LA50_0==24||LA50_0==31||LA50_0==33||LA50_0==35) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1445:4: (lv_childs_2_0= rulePageChild )
            	    {
            	    // PsiInternalCalculatorForm.g:1445:4: (lv_childs_2_0= rulePageChild )
            	    // PsiInternalCalculatorForm.g:1446:5: lv_childs_2_0= rulePageChild
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getPage_ChildsPageChildParserRuleCall_2_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getPage_RightCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // PsiInternalCalculatorForm.g:1470:1: entryRulePageChild returns [Boolean current=false] : iv_rulePageChild= rulePageChild EOF ;
    public final Boolean entryRulePageChild() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePageChild = null;


        try {
            // PsiInternalCalculatorForm.g:1470:51: (iv_rulePageChild= rulePageChild EOF )
            // PsiInternalCalculatorForm.g:1471:2: iv_rulePageChild= rulePageChild EOF
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
    // PsiInternalCalculatorForm.g:1477:1: rulePageChild returns [Boolean current=false] : (this_Group_0= ruleGroup | this_Field_1= ruleField ) ;
    public final Boolean rulePageChild() throws RecognitionException {
        Boolean current = false;

        Boolean this_Group_0 = null;

        Boolean this_Field_1 = null;


        try {
            // PsiInternalCalculatorForm.g:1478:1: ( (this_Group_0= ruleGroup | this_Field_1= ruleField ) )
            // PsiInternalCalculatorForm.g:1479:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
            {
            // PsiInternalCalculatorForm.g:1479:2: (this_Group_0= ruleGroup | this_Field_1= ruleField )
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
                    // PsiInternalCalculatorForm.g:1480:3: this_Group_0= ruleGroup
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
                    // PsiInternalCalculatorForm.g:1489:3: this_Field_1= ruleField
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
    // PsiInternalCalculatorForm.g:1501:1: entryRuleButton returns [Boolean current=false] : iv_ruleButton= ruleButton EOF ;
    public final Boolean entryRuleButton() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleButton = null;


        try {
            // PsiInternalCalculatorForm.g:1501:48: (iv_ruleButton= ruleButton EOF )
            // PsiInternalCalculatorForm.g:1502:2: iv_ruleButton= ruleButton EOF
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
    // PsiInternalCalculatorForm.g:1508:1: ruleButton returns [Boolean current=false] : this_ButtonSubmit_0= ruleButtonSubmit ;
    public final Boolean ruleButton() throws RecognitionException {
        Boolean current = false;

        Boolean this_ButtonSubmit_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1509:1: (this_ButtonSubmit_0= ruleButtonSubmit )
            // PsiInternalCalculatorForm.g:1510:2: this_ButtonSubmit_0= ruleButtonSubmit
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
    // PsiInternalCalculatorForm.g:1521:1: entryRuleButtonSubmit returns [Boolean current=false] : iv_ruleButtonSubmit= ruleButtonSubmit EOF ;
    public final Boolean entryRuleButtonSubmit() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleButtonSubmit = null;


        try {
            // PsiInternalCalculatorForm.g:1521:54: (iv_ruleButtonSubmit= ruleButtonSubmit EOF )
            // PsiInternalCalculatorForm.g:1522:2: iv_ruleButtonSubmit= ruleButtonSubmit EOF
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
    // PsiInternalCalculatorForm.g:1528:1: ruleButtonSubmit returns [Boolean current=false] : (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) ;
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
            // PsiInternalCalculatorForm.g:1529:1: ( (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? ) )
            // PsiInternalCalculatorForm.g:1530:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            {
            // PsiInternalCalculatorForm.g:1530:2: (otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )? )
            // PsiInternalCalculatorForm.g:1531:3: otherlv_0= 'submit-button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ( (lv_autofocus_3_0= 'autofocus' ) )? ( (lv_disabled_4_0= 'disabled' ) )? (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getButtonSubmit_SubmitButtonKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1538:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:1539:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:1539:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:1540:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getButtonSubmit_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1555:3: ( (lv_text_2_0= RULE_STRING ) )
            // PsiInternalCalculatorForm.g:1556:4: (lv_text_2_0= RULE_STRING )
            {
            // PsiInternalCalculatorForm.g:1556:4: (lv_text_2_0= RULE_STRING )
            // PsiInternalCalculatorForm.g:1557:5: lv_text_2_0= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getButtonSubmit_TextSTRINGTerminalRuleCall_2_0ElementType());
              				
            }
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_48); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1572:3: ( (lv_autofocus_3_0= 'autofocus' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==17) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1573:4: (lv_autofocus_3_0= 'autofocus' )
                    {
                    // PsiInternalCalculatorForm.g:1573:4: (lv_autofocus_3_0= 'autofocus' )
                    // PsiInternalCalculatorForm.g:1574:5: lv_autofocus_3_0= 'autofocus'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getButtonSubmit_AutofocusAutofocusKeyword_3_0ElementType());
                      				
                    }
                    lv_autofocus_3_0=(Token)match(input,17,FOLLOW_49); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1589:3: ( (lv_disabled_4_0= 'disabled' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==18) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1590:4: (lv_disabled_4_0= 'disabled' )
                    {
                    // PsiInternalCalculatorForm.g:1590:4: (lv_disabled_4_0= 'disabled' )
                    // PsiInternalCalculatorForm.g:1591:5: lv_disabled_4_0= 'disabled'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getButtonSubmit_DisabledDisabledKeyword_4_0ElementType());
                      				
                    }
                    lv_disabled_4_0=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
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

            // PsiInternalCalculatorForm.g:1606:3: (otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // PsiInternalCalculatorForm.g:1607:4: otherlv_5= 'value' ( (lv_value_6_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getButtonSubmit_ValueKeyword_5_0ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,23,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1614:4: ( (lv_value_6_0= RULE_STRING ) )
                    // PsiInternalCalculatorForm.g:1615:5: (lv_value_6_0= RULE_STRING )
                    {
                    // PsiInternalCalculatorForm.g:1615:5: (lv_value_6_0= RULE_STRING )
                    // PsiInternalCalculatorForm.g:1616:6: lv_value_6_0= RULE_STRING
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
    // PsiInternalCalculatorForm.g:1636:1: entryRuleCalculate returns [Boolean current=false] : iv_ruleCalculate= ruleCalculate EOF ;
    public final Boolean entryRuleCalculate() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCalculate = null;


        try {
            // PsiInternalCalculatorForm.g:1636:51: (iv_ruleCalculate= ruleCalculate EOF )
            // PsiInternalCalculatorForm.g:1637:2: iv_ruleCalculate= ruleCalculate EOF
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
    // PsiInternalCalculatorForm.g:1643:1: ruleCalculate returns [Boolean current=false] : (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final Boolean ruleCalculate() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean lv_output_1_0 = null;

        Boolean lv_expression_3_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1644:1: ( (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // PsiInternalCalculatorForm.g:1645:2: (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // PsiInternalCalculatorForm.g:1645:2: (otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // PsiInternalCalculatorForm.g:1646:3: otherlv_0= 'calculate' ( (lv_output_1_0= ruleResultOutput ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCalculate_CalculateKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,36,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1653:3: ( (lv_output_1_0= ruleResultOutput ) )
            // PsiInternalCalculatorForm.g:1654:4: (lv_output_1_0= ruleResultOutput )
            {
            // PsiInternalCalculatorForm.g:1654:4: (lv_output_1_0= ruleResultOutput )
            // PsiInternalCalculatorForm.g:1655:5: lv_output_1_0= ruleResultOutput
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getCalculate_OutputResultOutputParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_51);
            lv_output_1_0=ruleResultOutput();

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

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCalculate_EqualsSignKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,37,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalCalculatorForm.g:1675:3: ( (lv_expression_3_0= ruleExpression ) )
            // PsiInternalCalculatorForm.g:1676:4: (lv_expression_3_0= ruleExpression )
            {
            // PsiInternalCalculatorForm.g:1676:4: (lv_expression_3_0= ruleExpression )
            // PsiInternalCalculatorForm.g:1677:5: lv_expression_3_0= ruleExpression
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


    // $ANTLR start "entryRuleResultOutput"
    // PsiInternalCalculatorForm.g:1694:1: entryRuleResultOutput returns [Boolean current=false] : iv_ruleResultOutput= ruleResultOutput EOF ;
    public final Boolean entryRuleResultOutput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleResultOutput = null;


        try {
            // PsiInternalCalculatorForm.g:1694:54: (iv_ruleResultOutput= ruleResultOutput EOF )
            // PsiInternalCalculatorForm.g:1695:2: iv_ruleResultOutput= ruleResultOutput EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getResultOutputElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResultOutput"


    // $ANTLR start "ruleResultOutput"
    // PsiInternalCalculatorForm.g:1701:1: ruleResultOutput returns [Boolean current=false] : (this_CalculateVariable_0= ruleCalculateVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) ) ;
    public final Boolean ruleResultOutput() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_CalculateVariable_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1702:1: ( (this_CalculateVariable_0= ruleCalculateVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) ) )
            // PsiInternalCalculatorForm.g:1703:2: (this_CalculateVariable_0= ruleCalculateVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) )
            {
            // PsiInternalCalculatorForm.g:1703:2: (this_CalculateVariable_0= ruleCalculateVariable | ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) ) )
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
                    // PsiInternalCalculatorForm.g:1704:3: this_CalculateVariable_0= ruleCalculateVariable
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getResultOutput_CalculateVariableParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CalculateVariable_0=ruleCalculateVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CalculateVariable_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:1713:3: ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) )
                    {
                    // PsiInternalCalculatorForm.g:1713:3: ( () otherlv_2= 'field' ( ( ruleQualifiedName ) ) )
                    // PsiInternalCalculatorForm.g:1714:4: () otherlv_2= 'field' ( ( ruleQualifiedName ) )
                    {
                    // PsiInternalCalculatorForm.g:1714:4: ()
                    // PsiInternalCalculatorForm.g:1715:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getResultOutput_OutputFieldAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getResultOutput_FieldKeyword_1_1ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,16,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalCalculatorForm.g:1728:4: ( ( ruleQualifiedName ) )
                    // PsiInternalCalculatorForm.g:1729:5: ( ruleQualifiedName )
                    {
                    // PsiInternalCalculatorForm.g:1729:5: ( ruleQualifiedName )
                    // PsiInternalCalculatorForm.g:1730:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getResultOutput_FieldFieldCrossReference_1_2_0ElementType());
                      					
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
    // $ANTLR end "ruleResultOutput"


    // $ANTLR start "entryRuleCalculateVariable"
    // PsiInternalCalculatorForm.g:1750:1: entryRuleCalculateVariable returns [Boolean current=false] : iv_ruleCalculateVariable= ruleCalculateVariable EOF ;
    public final Boolean entryRuleCalculateVariable() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCalculateVariable = null;


        try {
            // PsiInternalCalculatorForm.g:1750:59: (iv_ruleCalculateVariable= ruleCalculateVariable EOF )
            // PsiInternalCalculatorForm.g:1751:2: iv_ruleCalculateVariable= ruleCalculateVariable EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getCalculateVariableElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCalculateVariable=ruleCalculateVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCalculateVariable; 
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
    // $ANTLR end "entryRuleCalculateVariable"


    // $ANTLR start "ruleCalculateVariable"
    // PsiInternalCalculatorForm.g:1757:1: ruleCalculateVariable returns [Boolean current=false] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleCalculateVariable() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalCalculatorForm.g:1758:1: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalCalculatorForm.g:1759:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalCalculatorForm.g:1759:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalCalculatorForm.g:1760:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getCalculateVariable_VarKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalCalculatorForm.g:1767:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalCalculatorForm.g:1768:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalCalculatorForm.g:1768:4: (lv_name_1_0= RULE_ID )
            // PsiInternalCalculatorForm.g:1769:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getCalculateVariable_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // $ANTLR end "ruleCalculateVariable"


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalCalculatorForm.g:1788:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalCalculatorForm.g:1788:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalCalculatorForm.g:1789:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // PsiInternalCalculatorForm.g:1795:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalCalculatorForm.g:1796:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalCalculatorForm.g:1797:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalCalculatorForm.g:1797:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalCalculatorForm.g:1798:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
              		
            }
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_ID_0);
              		
            }
            // PsiInternalCalculatorForm.g:1805:3: (kw= '.' this_ID_2= RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==39) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1806:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	      			
            	    }
            	    kw=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(kw);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_ID_2);
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExpression"
    // PsiInternalCalculatorForm.g:1825:1: entryRuleExpression returns [Boolean current=false] : iv_ruleExpression= ruleExpression EOF ;
    public final Boolean entryRuleExpression() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExpression = null;


        try {
            // PsiInternalCalculatorForm.g:1825:52: (iv_ruleExpression= ruleExpression EOF )
            // PsiInternalCalculatorForm.g:1826:2: iv_ruleExpression= ruleExpression EOF
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
    // PsiInternalCalculatorForm.g:1832:1: ruleExpression returns [Boolean current=false] : this_Addition_0= ruleAddition ;
    public final Boolean ruleExpression() throws RecognitionException {
        Boolean current = false;

        Boolean this_Addition_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1833:1: (this_Addition_0= ruleAddition )
            // PsiInternalCalculatorForm.g:1834:2: this_Addition_0= ruleAddition
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
    // PsiInternalCalculatorForm.g:1845:1: entryRuleAddition returns [Boolean current=false] : iv_ruleAddition= ruleAddition EOF ;
    public final Boolean entryRuleAddition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAddition = null;


        try {
            // PsiInternalCalculatorForm.g:1845:50: (iv_ruleAddition= ruleAddition EOF )
            // PsiInternalCalculatorForm.g:1846:2: iv_ruleAddition= ruleAddition EOF
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
    // PsiInternalCalculatorForm.g:1852:1: ruleAddition returns [Boolean current=false] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final Boolean ruleAddition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean this_Multiplication_0 = null;

        Boolean lv_right_5_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1853:1: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // PsiInternalCalculatorForm.g:1854:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // PsiInternalCalculatorForm.g:1854:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // PsiInternalCalculatorForm.g:1855:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getAddition_MultiplicationParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_54);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Multiplication_0;
              			doneComposite();
              		
            }
            // PsiInternalCalculatorForm.g:1863:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=40 && LA58_0<=41)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1864:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // PsiInternalCalculatorForm.g:1864:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // PsiInternalCalculatorForm.g:1865:5: ( () otherlv_2= '+' )
            	            {
            	            // PsiInternalCalculatorForm.g:1865:5: ( () otherlv_2= '+' )
            	            // PsiInternalCalculatorForm.g:1866:6: () otherlv_2= '+'
            	            {
            	            // PsiInternalCalculatorForm.g:1866:6: ()
            	            // PsiInternalCalculatorForm.g:1867:7: 
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
            	            otherlv_2=(Token)match(input,40,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_2);
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalCalculatorForm.g:1882:5: ( () otherlv_4= '-' )
            	            {
            	            // PsiInternalCalculatorForm.g:1882:5: ( () otherlv_4= '-' )
            	            // PsiInternalCalculatorForm.g:1883:6: () otherlv_4= '-'
            	            {
            	            // PsiInternalCalculatorForm.g:1883:6: ()
            	            // PsiInternalCalculatorForm.g:1884:7: 
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
            	            otherlv_4=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_4);
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // PsiInternalCalculatorForm.g:1899:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // PsiInternalCalculatorForm.g:1900:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // PsiInternalCalculatorForm.g:1900:5: (lv_right_5_0= ruleMultiplication )
            	    // PsiInternalCalculatorForm.g:1901:6: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getAddition_RightMultiplicationParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // PsiInternalCalculatorForm.g:1919:1: entryRuleMultiplication returns [Boolean current=false] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final Boolean entryRuleMultiplication() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMultiplication = null;


        try {
            // PsiInternalCalculatorForm.g:1919:56: (iv_ruleMultiplication= ruleMultiplication EOF )
            // PsiInternalCalculatorForm.g:1920:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // PsiInternalCalculatorForm.g:1926:1: ruleMultiplication returns [Boolean current=false] : (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* ) ;
    public final Boolean ruleMultiplication() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean this_Prefixed_0 = null;

        Boolean lv_right_5_0 = null;


        try {
            // PsiInternalCalculatorForm.g:1927:1: ( (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* ) )
            // PsiInternalCalculatorForm.g:1928:2: (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* )
            {
            // PsiInternalCalculatorForm.g:1928:2: (this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )* )
            // PsiInternalCalculatorForm.g:1929:3: this_Prefixed_0= rulePrefixed ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getMultiplication_PrefixedParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_55);
            this_Prefixed_0=rulePrefixed();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Prefixed_0;
              			doneComposite();
              		
            }
            // PsiInternalCalculatorForm.g:1937:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=42 && LA60_0<=43)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // PsiInternalCalculatorForm.g:1938:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrefixed ) )
            	    {
            	    // PsiInternalCalculatorForm.g:1938:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
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
            	            // PsiInternalCalculatorForm.g:1939:5: ( () otherlv_2= '*' )
            	            {
            	            // PsiInternalCalculatorForm.g:1939:5: ( () otherlv_2= '*' )
            	            // PsiInternalCalculatorForm.g:1940:6: () otherlv_2= '*'
            	            {
            	            // PsiInternalCalculatorForm.g:1940:6: ()
            	            // PsiInternalCalculatorForm.g:1941:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getMultiplication_MultiLeftAction_1_0_0_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getMultiplication_AsteriskKeyword_1_0_0_1ElementType());
            	              					
            	            }
            	            otherlv_2=(Token)match(input,42,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_2);
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalCalculatorForm.g:1956:5: ( () otherlv_4= '/' )
            	            {
            	            // PsiInternalCalculatorForm.g:1956:5: ( () otherlv_4= '/' )
            	            // PsiInternalCalculatorForm.g:1957:6: () otherlv_4= '/'
            	            {
            	            // PsiInternalCalculatorForm.g:1957:6: ()
            	            // PsiInternalCalculatorForm.g:1958:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getMultiplication_DivLeftAction_1_0_1_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getMultiplication_SolidusKeyword_1_0_1_1ElementType());
            	              					
            	            }
            	            otherlv_4=(Token)match(input,43,FOLLOW_52); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_4);
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // PsiInternalCalculatorForm.g:1973:4: ( (lv_right_5_0= rulePrefixed ) )
            	    // PsiInternalCalculatorForm.g:1974:5: (lv_right_5_0= rulePrefixed )
            	    {
            	    // PsiInternalCalculatorForm.g:1974:5: (lv_right_5_0= rulePrefixed )
            	    // PsiInternalCalculatorForm.g:1975:6: lv_right_5_0= rulePrefixed
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getMultiplication_RightPrefixedParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_right_5_0=rulePrefixed();

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
            	    break loop60;
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
    // PsiInternalCalculatorForm.g:1993:1: entryRulePrefixed returns [Boolean current=false] : iv_rulePrefixed= rulePrefixed EOF ;
    public final Boolean entryRulePrefixed() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePrefixed = null;


        try {
            // PsiInternalCalculatorForm.g:1993:50: (iv_rulePrefixed= rulePrefixed EOF )
            // PsiInternalCalculatorForm.g:1994:2: iv_rulePrefixed= rulePrefixed EOF
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
    // PsiInternalCalculatorForm.g:2000:1: rulePrefixed returns [Boolean current=false] : (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic ) ;
    public final Boolean rulePrefixed() throws RecognitionException {
        Boolean current = false;

        Boolean this_UnaryOperation_0 = null;

        Boolean this_Atomic_1 = null;


        try {
            // PsiInternalCalculatorForm.g:2001:1: ( (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic ) )
            // PsiInternalCalculatorForm.g:2002:2: (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic )
            {
            // PsiInternalCalculatorForm.g:2002:2: (this_UnaryOperation_0= ruleUnaryOperation | this_Atomic_1= ruleAtomic )
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
                    // PsiInternalCalculatorForm.g:2003:3: this_UnaryOperation_0= ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPrefixed_UnaryOperationParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryOperation_0=ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnaryOperation_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:2012:3: this_Atomic_1= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPrefixed_AtomicParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_1=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_1;
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


    // $ANTLR start "entryRuleUnaryOperation"
    // PsiInternalCalculatorForm.g:2024:1: entryRuleUnaryOperation returns [Boolean current=false] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final Boolean entryRuleUnaryOperation() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUnaryOperation = null;


        try {
            // PsiInternalCalculatorForm.g:2024:56: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // PsiInternalCalculatorForm.g:2025:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getUnaryOperationElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // PsiInternalCalculatorForm.g:2031:1: ruleUnaryOperation returns [Boolean current=false] : ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) ) ;
    public final Boolean ruleUnaryOperation() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Boolean lv_expression_2_0 = null;

        Boolean lv_expression_5_0 = null;


        try {
            // PsiInternalCalculatorForm.g:2032:1: ( ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) ) )
            // PsiInternalCalculatorForm.g:2033:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) )
            {
            // PsiInternalCalculatorForm.g:2033:2: ( ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) ) )
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
                    // PsiInternalCalculatorForm.g:2034:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    {
                    // PsiInternalCalculatorForm.g:2034:3: ( () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) ) )
                    // PsiInternalCalculatorForm.g:2035:4: () ( ( '!' )=>otherlv_1= '!' ) ( (lv_expression_2_0= ruleAtomic ) )
                    {
                    // PsiInternalCalculatorForm.g:2035:4: ()
                    // PsiInternalCalculatorForm.g:2036:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getUnaryOperation_BooleanNegationAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2042:4: ( ( '!' )=>otherlv_1= '!' )
                    // PsiInternalCalculatorForm.g:2043:5: ( '!' )=>otherlv_1= '!'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getUnaryOperation_ExclamationMarkKeyword_0_1ElementType());
                      				
                    }
                    otherlv_1=(Token)match(input,44,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_1);
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2052:4: ( (lv_expression_2_0= ruleAtomic ) )
                    // PsiInternalCalculatorForm.g:2053:5: (lv_expression_2_0= ruleAtomic )
                    {
                    // PsiInternalCalculatorForm.g:2053:5: (lv_expression_2_0= ruleAtomic )
                    // PsiInternalCalculatorForm.g:2054:6: lv_expression_2_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getUnaryOperation_ExpressionAtomicParserRuleCall_0_2_0ElementType());
                      					
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
                    // PsiInternalCalculatorForm.g:2069:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    {
                    // PsiInternalCalculatorForm.g:2069:3: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) ) )
                    // PsiInternalCalculatorForm.g:2070:4: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtomic ) )
                    {
                    // PsiInternalCalculatorForm.g:2070:4: ()
                    // PsiInternalCalculatorForm.g:2071:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getUnaryOperation_ArithmeticSignedAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2077:4: ( ( '-' )=>otherlv_4= '-' )
                    // PsiInternalCalculatorForm.g:2078:5: ( '-' )=>otherlv_4= '-'
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getUnaryOperation_HyphenMinusKeyword_1_1ElementType());
                      				
                    }
                    otherlv_4=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_4);
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2087:4: ( (lv_expression_5_0= ruleAtomic ) )
                    // PsiInternalCalculatorForm.g:2088:5: (lv_expression_5_0= ruleAtomic )
                    {
                    // PsiInternalCalculatorForm.g:2088:5: (lv_expression_5_0= ruleAtomic )
                    // PsiInternalCalculatorForm.g:2089:6: lv_expression_5_0= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getUnaryOperation_ExpressionAtomicParserRuleCall_1_2_0ElementType());
                      					
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
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleAtomic"
    // PsiInternalCalculatorForm.g:2107:1: entryRuleAtomic returns [Boolean current=false] : iv_ruleAtomic= ruleAtomic EOF ;
    public final Boolean entryRuleAtomic() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAtomic = null;


        try {
            // PsiInternalCalculatorForm.g:2107:48: (iv_ruleAtomic= ruleAtomic EOF )
            // PsiInternalCalculatorForm.g:2108:2: iv_ruleAtomic= ruleAtomic EOF
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
    // PsiInternalCalculatorForm.g:2114:1: ruleAtomic returns [Boolean current=false] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) ;
    public final Boolean ruleAtomic() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean this_Expression_1 = null;

        Boolean this_Literal_3 = null;


        try {
            // PsiInternalCalculatorForm.g:2115:1: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral ) )
            // PsiInternalCalculatorForm.g:2116:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
            {
            // PsiInternalCalculatorForm.g:2116:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral )
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
                    // PsiInternalCalculatorForm.g:2117:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // PsiInternalCalculatorForm.g:2117:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // PsiInternalCalculatorForm.g:2118:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getAtomic_LeftParenthesisKeyword_0_0ElementType());
                      			
                    }
                    otherlv_0=(Token)match(input,45,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getAtomic_ExpressionParserRuleCall_0_1ElementType());
                      			
                    }
                    pushFollow(FOLLOW_56);
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
                    otherlv_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:2142:3: this_Literal_3= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getAtomic_LiteralParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_3;
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleLiteral"
    // PsiInternalCalculatorForm.g:2154:1: entryRuleLiteral returns [Boolean current=false] : iv_ruleLiteral= ruleLiteral EOF ;
    public final Boolean entryRuleLiteral() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLiteral = null;


        try {
            // PsiInternalCalculatorForm.g:2154:49: (iv_ruleLiteral= ruleLiteral EOF )
            // PsiInternalCalculatorForm.g:2155:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getLiteralElementType()); 
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
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // PsiInternalCalculatorForm.g:2161:1: ruleLiteral returns [Boolean current=false] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) ;
    public final Boolean ruleLiteral() throws RecognitionException {
        Boolean current = false;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;

        try {
            // PsiInternalCalculatorForm.g:2162:1: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) )
            // PsiInternalCalculatorForm.g:2163:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            {
            // PsiInternalCalculatorForm.g:2163:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_PERCENT ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
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
                    // PsiInternalCalculatorForm.g:2164:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // PsiInternalCalculatorForm.g:2164:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // PsiInternalCalculatorForm.g:2165:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // PsiInternalCalculatorForm.g:2165:4: ()
                    // PsiInternalCalculatorForm.g:2166:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getLiteral_NumberLiteralAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2172:4: ( (lv_value_1_0= RULE_INT ) )
                    // PsiInternalCalculatorForm.g:2173:5: (lv_value_1_0= RULE_INT )
                    {
                    // PsiInternalCalculatorForm.g:2173:5: (lv_value_1_0= RULE_INT )
                    // PsiInternalCalculatorForm.g:2174:6: lv_value_1_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getLiteral_ValueINTTerminalRuleCall_0_1_0ElementType());
                      					
                    }
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_1_0);
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalCalculatorForm.g:2191:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // PsiInternalCalculatorForm.g:2191:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // PsiInternalCalculatorForm.g:2192:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // PsiInternalCalculatorForm.g:2192:4: ()
                    // PsiInternalCalculatorForm.g:2193:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getLiteral_FloatLiteralAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2199:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // PsiInternalCalculatorForm.g:2200:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // PsiInternalCalculatorForm.g:2200:5: (lv_value_3_0= RULE_FLOAT )
                    // PsiInternalCalculatorForm.g:2201:6: lv_value_3_0= RULE_FLOAT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getLiteral_ValueFLOATTerminalRuleCall_1_1_0ElementType());
                      					
                    }
                    lv_value_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_3_0);
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalCalculatorForm.g:2218:3: ( () ( (lv_value_5_0= RULE_PERCENT ) ) )
                    {
                    // PsiInternalCalculatorForm.g:2218:3: ( () ( (lv_value_5_0= RULE_PERCENT ) ) )
                    // PsiInternalCalculatorForm.g:2219:4: () ( (lv_value_5_0= RULE_PERCENT ) )
                    {
                    // PsiInternalCalculatorForm.g:2219:4: ()
                    // PsiInternalCalculatorForm.g:2220:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getLiteral_PercentLiteralAction_2_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2226:4: ( (lv_value_5_0= RULE_PERCENT ) )
                    // PsiInternalCalculatorForm.g:2227:5: (lv_value_5_0= RULE_PERCENT )
                    {
                    // PsiInternalCalculatorForm.g:2227:5: (lv_value_5_0= RULE_PERCENT )
                    // PsiInternalCalculatorForm.g:2228:6: lv_value_5_0= RULE_PERCENT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getLiteral_ValuePERCENTTerminalRuleCall_2_1_0ElementType());
                      					
                    }
                    lv_value_5_0=(Token)match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_5_0);
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalCalculatorForm.g:2245:3: ( () ( ( ruleQualifiedName ) ) )
                    {
                    // PsiInternalCalculatorForm.g:2245:3: ( () ( ( ruleQualifiedName ) ) )
                    // PsiInternalCalculatorForm.g:2246:4: () ( ( ruleQualifiedName ) )
                    {
                    // PsiInternalCalculatorForm.g:2246:4: ()
                    // PsiInternalCalculatorForm.g:2247:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getLiteral_ReferenceLiteralAction_3_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalCalculatorForm.g:2253:4: ( ( ruleQualifiedName ) )
                    // PsiInternalCalculatorForm.g:2254:5: ( ruleQualifiedName )
                    {
                    // PsiInternalCalculatorForm.g:2254:5: ( ruleQualifiedName )
                    // PsiInternalCalculatorForm.g:2255:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getLiteral_RefInputVariableCrossReference_3_1_0ElementType());
                      					
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