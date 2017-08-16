package de.htwg.zeta.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.htwg.zeta.xtext.services.CalculatorFormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCalculatorFormParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_PERCENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'{'", "'}'", "'field'", "'label'", "'value'", "'dropdown'", "'size'", "'option'", "'text'", "'option-group'", "'choice'", "'group'", "'page'", "'submit-button'", "'calculate'", "'='", "'var'", "'.'", "'+'", "'-'", "'*'", "'/'", "'!'", "'('", "')'", "'autofocus'", "'disabled'", "'notdisplayed'", "'readonly'", "'required'", "'multiple'", "'selected'", "'checked'"
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

    	public void setGrammarAccess(CalculatorFormGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalCalculatorForm.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:55:1: ( ruleModel EOF )
            // InternalCalculatorForm.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCalculatorForm.g:63:1: ruleModel : ( ( rule__Model__FormsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:67:2: ( ( ( rule__Model__FormsAssignment )* ) )
            // InternalCalculatorForm.g:68:2: ( ( rule__Model__FormsAssignment )* )
            {
            // InternalCalculatorForm.g:68:2: ( ( rule__Model__FormsAssignment )* )
            // InternalCalculatorForm.g:69:3: ( rule__Model__FormsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFormsAssignment()); 
            }
            // InternalCalculatorForm.g:70:3: ( rule__Model__FormsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculatorForm.g:70:4: rule__Model__FormsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FormsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFormsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleForm"
    // InternalCalculatorForm.g:79:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:80:1: ( ruleForm EOF )
            // InternalCalculatorForm.g:81:1: ruleForm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalCalculatorForm.g:88:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:92:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalCalculatorForm.g:93:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalCalculatorForm.g:93:2: ( ( rule__Form__Group__0 ) )
            // InternalCalculatorForm.g:94:3: ( rule__Form__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:95:3: ( rule__Form__Group__0 )
            // InternalCalculatorForm.g:95:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleFormElement"
    // InternalCalculatorForm.g:104:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:105:1: ( ruleFormElement EOF )
            // InternalCalculatorForm.g:106:1: ruleFormElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFormElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormElement"


    // $ANTLR start "ruleFormElement"
    // InternalCalculatorForm.g:113:1: ruleFormElement : ( ( rule__FormElement__Alternatives ) ) ;
    public final void ruleFormElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:117:2: ( ( ( rule__FormElement__Alternatives ) ) )
            // InternalCalculatorForm.g:118:2: ( ( rule__FormElement__Alternatives ) )
            {
            // InternalCalculatorForm.g:118:2: ( ( rule__FormElement__Alternatives ) )
            // InternalCalculatorForm.g:119:3: ( rule__FormElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormElementAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:120:3: ( rule__FormElement__Alternatives )
            // InternalCalculatorForm.g:120:4: rule__FormElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormElement"


    // $ANTLR start "entryRuleField"
    // InternalCalculatorForm.g:129:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:130:1: ( ruleField EOF )
            // InternalCalculatorForm.g:131:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalCalculatorForm.g:138:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:142:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalCalculatorForm.g:143:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalCalculatorForm.g:143:2: ( ( rule__Field__Alternatives ) )
            // InternalCalculatorForm.g:144:3: ( rule__Field__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:145:3: ( rule__Field__Alternatives )
            // InternalCalculatorForm.g:145:4: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldInput"
    // InternalCalculatorForm.g:154:1: entryRuleFieldInput : ruleFieldInput EOF ;
    public final void entryRuleFieldInput() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:155:1: ( ruleFieldInput EOF )
            // InternalCalculatorForm.g:156:1: ruleFieldInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldInput"


    // $ANTLR start "ruleFieldInput"
    // InternalCalculatorForm.g:163:1: ruleFieldInput : ( ( rule__FieldInput__Group__0 ) ) ;
    public final void ruleFieldInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:167:2: ( ( ( rule__FieldInput__Group__0 ) ) )
            // InternalCalculatorForm.g:168:2: ( ( rule__FieldInput__Group__0 ) )
            {
            // InternalCalculatorForm.g:168:2: ( ( rule__FieldInput__Group__0 ) )
            // InternalCalculatorForm.g:169:3: ( rule__FieldInput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:170:3: ( rule__FieldInput__Group__0 )
            // InternalCalculatorForm.g:170:4: rule__FieldInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldInput"


    // $ANTLR start "entryRuleFieldSelect"
    // InternalCalculatorForm.g:179:1: entryRuleFieldSelect : ruleFieldSelect EOF ;
    public final void entryRuleFieldSelect() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:180:1: ( ruleFieldSelect EOF )
            // InternalCalculatorForm.g:181:1: ruleFieldSelect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldSelect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldSelect"


    // $ANTLR start "ruleFieldSelect"
    // InternalCalculatorForm.g:188:1: ruleFieldSelect : ( ( rule__FieldSelect__Group__0 ) ) ;
    public final void ruleFieldSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:192:2: ( ( ( rule__FieldSelect__Group__0 ) ) )
            // InternalCalculatorForm.g:193:2: ( ( rule__FieldSelect__Group__0 ) )
            {
            // InternalCalculatorForm.g:193:2: ( ( rule__FieldSelect__Group__0 ) )
            // InternalCalculatorForm.g:194:3: ( rule__FieldSelect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:195:3: ( rule__FieldSelect__Group__0 )
            // InternalCalculatorForm.g:195:4: rule__FieldSelect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldSelect"


    // $ANTLR start "entryRuleFieldSelectChild"
    // InternalCalculatorForm.g:204:1: entryRuleFieldSelectChild : ruleFieldSelectChild EOF ;
    public final void entryRuleFieldSelectChild() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:205:1: ( ruleFieldSelectChild EOF )
            // InternalCalculatorForm.g:206:1: ruleFieldSelectChild EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectChildRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldSelectChild();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectChildRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldSelectChild"


    // $ANTLR start "ruleFieldSelectChild"
    // InternalCalculatorForm.g:213:1: ruleFieldSelectChild : ( ( rule__FieldSelectChild__Alternatives ) ) ;
    public final void ruleFieldSelectChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:217:2: ( ( ( rule__FieldSelectChild__Alternatives ) ) )
            // InternalCalculatorForm.g:218:2: ( ( rule__FieldSelectChild__Alternatives ) )
            {
            // InternalCalculatorForm.g:218:2: ( ( rule__FieldSelectChild__Alternatives ) )
            // InternalCalculatorForm.g:219:3: ( rule__FieldSelectChild__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectChildAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:220:3: ( rule__FieldSelectChild__Alternatives )
            // InternalCalculatorForm.g:220:4: rule__FieldSelectChild__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelectChild__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectChildAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldSelectChild"


    // $ANTLR start "entryRuleFieldOption"
    // InternalCalculatorForm.g:229:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:230:1: ( ruleFieldOption EOF )
            // InternalCalculatorForm.g:231:1: ruleFieldOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldOption"


    // $ANTLR start "ruleFieldOption"
    // InternalCalculatorForm.g:238:1: ruleFieldOption : ( ( rule__FieldOption__Group__0 ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:242:2: ( ( ( rule__FieldOption__Group__0 ) ) )
            // InternalCalculatorForm.g:243:2: ( ( rule__FieldOption__Group__0 ) )
            {
            // InternalCalculatorForm.g:243:2: ( ( rule__FieldOption__Group__0 ) )
            // InternalCalculatorForm.g:244:3: ( rule__FieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:245:3: ( rule__FieldOption__Group__0 )
            // InternalCalculatorForm.g:245:4: rule__FieldOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldOption"


    // $ANTLR start "entryRuleFieldOptionGroup"
    // InternalCalculatorForm.g:254:1: entryRuleFieldOptionGroup : ruleFieldOptionGroup EOF ;
    public final void entryRuleFieldOptionGroup() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:255:1: ( ruleFieldOptionGroup EOF )
            // InternalCalculatorForm.g:256:1: ruleFieldOptionGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldOptionGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldOptionGroup"


    // $ANTLR start "ruleFieldOptionGroup"
    // InternalCalculatorForm.g:263:1: ruleFieldOptionGroup : ( ( rule__FieldOptionGroup__Group__0 ) ) ;
    public final void ruleFieldOptionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:267:2: ( ( ( rule__FieldOptionGroup__Group__0 ) ) )
            // InternalCalculatorForm.g:268:2: ( ( rule__FieldOptionGroup__Group__0 ) )
            {
            // InternalCalculatorForm.g:268:2: ( ( rule__FieldOptionGroup__Group__0 ) )
            // InternalCalculatorForm.g:269:3: ( rule__FieldOptionGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:270:3: ( rule__FieldOptionGroup__Group__0 )
            // InternalCalculatorForm.g:270:4: rule__FieldOptionGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldOptionGroup"


    // $ANTLR start "entryRuleFieldChoice"
    // InternalCalculatorForm.g:279:1: entryRuleFieldChoice : ruleFieldChoice EOF ;
    public final void entryRuleFieldChoice() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:280:1: ( ruleFieldChoice EOF )
            // InternalCalculatorForm.g:281:1: ruleFieldChoice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldChoice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldChoice"


    // $ANTLR start "ruleFieldChoice"
    // InternalCalculatorForm.g:288:1: ruleFieldChoice : ( ( rule__FieldChoice__Group__0 ) ) ;
    public final void ruleFieldChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:292:2: ( ( ( rule__FieldChoice__Group__0 ) ) )
            // InternalCalculatorForm.g:293:2: ( ( rule__FieldChoice__Group__0 ) )
            {
            // InternalCalculatorForm.g:293:2: ( ( rule__FieldChoice__Group__0 ) )
            // InternalCalculatorForm.g:294:3: ( rule__FieldChoice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:295:3: ( rule__FieldChoice__Group__0 )
            // InternalCalculatorForm.g:295:4: rule__FieldChoice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldChoice"


    // $ANTLR start "entryRuleFieldChoiceOption"
    // InternalCalculatorForm.g:304:1: entryRuleFieldChoiceOption : ruleFieldChoiceOption EOF ;
    public final void entryRuleFieldChoiceOption() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:305:1: ( ruleFieldChoiceOption EOF )
            // InternalCalculatorForm.g:306:1: ruleFieldChoiceOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFieldChoiceOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldChoiceOption"


    // $ANTLR start "ruleFieldChoiceOption"
    // InternalCalculatorForm.g:313:1: ruleFieldChoiceOption : ( ( rule__FieldChoiceOption__Group__0 ) ) ;
    public final void ruleFieldChoiceOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:317:2: ( ( ( rule__FieldChoiceOption__Group__0 ) ) )
            // InternalCalculatorForm.g:318:2: ( ( rule__FieldChoiceOption__Group__0 ) )
            {
            // InternalCalculatorForm.g:318:2: ( ( rule__FieldChoiceOption__Group__0 ) )
            // InternalCalculatorForm.g:319:3: ( rule__FieldChoiceOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:320:3: ( rule__FieldChoiceOption__Group__0 )
            // InternalCalculatorForm.g:320:4: rule__FieldChoiceOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldChoiceOption"


    // $ANTLR start "entryRuleGroup"
    // InternalCalculatorForm.g:329:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:330:1: ( ruleGroup EOF )
            // InternalCalculatorForm.g:331:1: ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalCalculatorForm.g:338:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:342:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalCalculatorForm.g:343:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalCalculatorForm.g:343:2: ( ( rule__Group__Group__0 ) )
            // InternalCalculatorForm.g:344:3: ( rule__Group__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:345:3: ( rule__Group__Group__0 )
            // InternalCalculatorForm.g:345:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRulePage"
    // InternalCalculatorForm.g:354:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:355:1: ( rulePage EOF )
            // InternalCalculatorForm.g:356:1: rulePage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalCalculatorForm.g:363:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:367:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalCalculatorForm.g:368:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalCalculatorForm.g:368:2: ( ( rule__Page__Group__0 ) )
            // InternalCalculatorForm.g:369:3: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:370:3: ( rule__Page__Group__0 )
            // InternalCalculatorForm.g:370:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRulePageChild"
    // InternalCalculatorForm.g:379:1: entryRulePageChild : rulePageChild EOF ;
    public final void entryRulePageChild() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:380:1: ( rulePageChild EOF )
            // InternalCalculatorForm.g:381:1: rulePageChild EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageChildRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePageChild();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageChildRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageChild"


    // $ANTLR start "rulePageChild"
    // InternalCalculatorForm.g:388:1: rulePageChild : ( ( rule__PageChild__Alternatives ) ) ;
    public final void rulePageChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:392:2: ( ( ( rule__PageChild__Alternatives ) ) )
            // InternalCalculatorForm.g:393:2: ( ( rule__PageChild__Alternatives ) )
            {
            // InternalCalculatorForm.g:393:2: ( ( rule__PageChild__Alternatives ) )
            // InternalCalculatorForm.g:394:3: ( rule__PageChild__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageChildAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:395:3: ( rule__PageChild__Alternatives )
            // InternalCalculatorForm.g:395:4: rule__PageChild__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PageChild__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageChildAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageChild"


    // $ANTLR start "entryRuleButton"
    // InternalCalculatorForm.g:404:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:405:1: ( ruleButton EOF )
            // InternalCalculatorForm.g:406:1: ruleButton EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalCalculatorForm.g:413:1: ruleButton : ( ruleButtonSubmit ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:417:2: ( ( ruleButtonSubmit ) )
            // InternalCalculatorForm.g:418:2: ( ruleButtonSubmit )
            {
            // InternalCalculatorForm.g:418:2: ( ruleButtonSubmit )
            // InternalCalculatorForm.g:419:3: ruleButtonSubmit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonAccess().getButtonSubmitParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleButtonSubmit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonAccess().getButtonSubmitParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleButtonSubmit"
    // InternalCalculatorForm.g:429:1: entryRuleButtonSubmit : ruleButtonSubmit EOF ;
    public final void entryRuleButtonSubmit() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:430:1: ( ruleButtonSubmit EOF )
            // InternalCalculatorForm.g:431:1: ruleButtonSubmit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleButtonSubmit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButtonSubmit"


    // $ANTLR start "ruleButtonSubmit"
    // InternalCalculatorForm.g:438:1: ruleButtonSubmit : ( ( rule__ButtonSubmit__Group__0 ) ) ;
    public final void ruleButtonSubmit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:442:2: ( ( ( rule__ButtonSubmit__Group__0 ) ) )
            // InternalCalculatorForm.g:443:2: ( ( rule__ButtonSubmit__Group__0 ) )
            {
            // InternalCalculatorForm.g:443:2: ( ( rule__ButtonSubmit__Group__0 ) )
            // InternalCalculatorForm.g:444:3: ( rule__ButtonSubmit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:445:3: ( rule__ButtonSubmit__Group__0 )
            // InternalCalculatorForm.g:445:4: rule__ButtonSubmit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonSubmit"


    // $ANTLR start "entryRuleCalculate"
    // InternalCalculatorForm.g:454:1: entryRuleCalculate : ruleCalculate EOF ;
    public final void entryRuleCalculate() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:455:1: ( ruleCalculate EOF )
            // InternalCalculatorForm.g:456:1: ruleCalculate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCalculate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalculate"


    // $ANTLR start "ruleCalculate"
    // InternalCalculatorForm.g:463:1: ruleCalculate : ( ( rule__Calculate__Group__0 ) ) ;
    public final void ruleCalculate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:467:2: ( ( ( rule__Calculate__Group__0 ) ) )
            // InternalCalculatorForm.g:468:2: ( ( rule__Calculate__Group__0 ) )
            {
            // InternalCalculatorForm.g:468:2: ( ( rule__Calculate__Group__0 ) )
            // InternalCalculatorForm.g:469:3: ( rule__Calculate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:470:3: ( rule__Calculate__Group__0 )
            // InternalCalculatorForm.g:470:4: rule__Calculate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculate"


    // $ANTLR start "entryRuleResultOutput"
    // InternalCalculatorForm.g:479:1: entryRuleResultOutput : ruleResultOutput EOF ;
    public final void entryRuleResultOutput() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:480:1: ( ruleResultOutput EOF )
            // InternalCalculatorForm.g:481:1: ruleResultOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleResultOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultOutputRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultOutput"


    // $ANTLR start "ruleResultOutput"
    // InternalCalculatorForm.g:488:1: ruleResultOutput : ( ( rule__ResultOutput__Alternatives ) ) ;
    public final void ruleResultOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:492:2: ( ( ( rule__ResultOutput__Alternatives ) ) )
            // InternalCalculatorForm.g:493:2: ( ( rule__ResultOutput__Alternatives ) )
            {
            // InternalCalculatorForm.g:493:2: ( ( rule__ResultOutput__Alternatives ) )
            // InternalCalculatorForm.g:494:3: ( rule__ResultOutput__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultOutputAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:495:3: ( rule__ResultOutput__Alternatives )
            // InternalCalculatorForm.g:495:4: rule__ResultOutput__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResultOutput__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultOutputAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultOutput"


    // $ANTLR start "entryRuleCalculateVariable"
    // InternalCalculatorForm.g:504:1: entryRuleCalculateVariable : ruleCalculateVariable EOF ;
    public final void entryRuleCalculateVariable() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:505:1: ( ruleCalculateVariable EOF )
            // InternalCalculatorForm.g:506:1: ruleCalculateVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCalculateVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalculateVariable"


    // $ANTLR start "ruleCalculateVariable"
    // InternalCalculatorForm.g:513:1: ruleCalculateVariable : ( ( rule__CalculateVariable__Group__0 ) ) ;
    public final void ruleCalculateVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:517:2: ( ( ( rule__CalculateVariable__Group__0 ) ) )
            // InternalCalculatorForm.g:518:2: ( ( rule__CalculateVariable__Group__0 ) )
            {
            // InternalCalculatorForm.g:518:2: ( ( rule__CalculateVariable__Group__0 ) )
            // InternalCalculatorForm.g:519:3: ( rule__CalculateVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateVariableAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:520:3: ( rule__CalculateVariable__Group__0 )
            // InternalCalculatorForm.g:520:4: rule__CalculateVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CalculateVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculateVariable"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCalculatorForm.g:529:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:530:1: ( ruleQualifiedName EOF )
            // InternalCalculatorForm.g:531:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalCalculatorForm.g:538:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:542:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCalculatorForm.g:543:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCalculatorForm.g:543:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCalculatorForm.g:544:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:545:3: ( rule__QualifiedName__Group__0 )
            // InternalCalculatorForm.g:545:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleExpression"
    // InternalCalculatorForm.g:554:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:555:1: ( ruleExpression EOF )
            // InternalCalculatorForm.g:556:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCalculatorForm.g:563:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:567:2: ( ( ruleAddition ) )
            // InternalCalculatorForm.g:568:2: ( ruleAddition )
            {
            // InternalCalculatorForm.g:568:2: ( ruleAddition )
            // InternalCalculatorForm.g:569:3: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalCalculatorForm.g:579:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:580:1: ( ruleAddition EOF )
            // InternalCalculatorForm.g:581:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalCalculatorForm.g:588:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:592:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalCalculatorForm.g:593:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalCalculatorForm.g:593:2: ( ( rule__Addition__Group__0 ) )
            // InternalCalculatorForm.g:594:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:595:3: ( rule__Addition__Group__0 )
            // InternalCalculatorForm.g:595:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalCalculatorForm.g:604:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:605:1: ( ruleMultiplication EOF )
            // InternalCalculatorForm.g:606:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalCalculatorForm.g:613:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:617:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalCalculatorForm.g:618:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalCalculatorForm.g:618:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalCalculatorForm.g:619:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:620:3: ( rule__Multiplication__Group__0 )
            // InternalCalculatorForm.g:620:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrefixed"
    // InternalCalculatorForm.g:629:1: entryRulePrefixed : rulePrefixed EOF ;
    public final void entryRulePrefixed() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:630:1: ( rulePrefixed EOF )
            // InternalCalculatorForm.g:631:1: rulePrefixed EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefixed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefixed"


    // $ANTLR start "rulePrefixed"
    // InternalCalculatorForm.g:638:1: rulePrefixed : ( ( rule__Prefixed__Alternatives ) ) ;
    public final void rulePrefixed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:642:2: ( ( ( rule__Prefixed__Alternatives ) ) )
            // InternalCalculatorForm.g:643:2: ( ( rule__Prefixed__Alternatives ) )
            {
            // InternalCalculatorForm.g:643:2: ( ( rule__Prefixed__Alternatives ) )
            // InternalCalculatorForm.g:644:3: ( rule__Prefixed__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:645:3: ( rule__Prefixed__Alternatives )
            // InternalCalculatorForm.g:645:4: rule__Prefixed__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Prefixed__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefixed"


    // $ANTLR start "entryRuleUnaryOperation"
    // InternalCalculatorForm.g:654:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:655:1: ( ruleUnaryOperation EOF )
            // InternalCalculatorForm.g:656:1: ruleUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnaryOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // InternalCalculatorForm.g:663:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Alternatives ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:667:2: ( ( ( rule__UnaryOperation__Alternatives ) ) )
            // InternalCalculatorForm.g:668:2: ( ( rule__UnaryOperation__Alternatives ) )
            {
            // InternalCalculatorForm.g:668:2: ( ( rule__UnaryOperation__Alternatives ) )
            // InternalCalculatorForm.g:669:3: ( rule__UnaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:670:3: ( rule__UnaryOperation__Alternatives )
            // InternalCalculatorForm.g:670:4: rule__UnaryOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleAtomic"
    // InternalCalculatorForm.g:679:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:680:1: ( ruleAtomic EOF )
            // InternalCalculatorForm.g:681:1: ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalCalculatorForm.g:688:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:692:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalCalculatorForm.g:693:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalCalculatorForm.g:693:2: ( ( rule__Atomic__Alternatives ) )
            // InternalCalculatorForm.g:694:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:695:3: ( rule__Atomic__Alternatives )
            // InternalCalculatorForm.g:695:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleLiteral"
    // InternalCalculatorForm.g:704:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:705:1: ( ruleLiteral EOF )
            // InternalCalculatorForm.g:706:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalCalculatorForm.g:713:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:717:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalCalculatorForm.g:718:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalCalculatorForm.g:718:2: ( ( rule__Literal__Alternatives ) )
            // InternalCalculatorForm.g:719:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:720:3: ( rule__Literal__Alternatives )
            // InternalCalculatorForm.g:720:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "rule__FormElement__Alternatives"
    // InternalCalculatorForm.g:728:1: rule__FormElement__Alternatives : ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) );
    public final void rule__FormElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:732:1: ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
            case 19:
            case 24:
            case 27:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCalculatorForm.g:733:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:733:2: ( ruleField )
                    // InternalCalculatorForm.g:734:3: ruleField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormElementAccess().getFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormElementAccess().getFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:739:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:739:2: ( ruleGroup )
                    // InternalCalculatorForm.g:740:3: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormElementAccess().getGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormElementAccess().getGroupParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:745:2: ( rulePage )
                    {
                    // InternalCalculatorForm.g:745:2: ( rulePage )
                    // InternalCalculatorForm.g:746:3: rulePage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFormElementAccess().getPageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFormElementAccess().getPageParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Alternatives"


    // $ANTLR start "rule__Field__Alternatives"
    // InternalCalculatorForm.g:755:1: rule__Field__Alternatives : ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:759:1: ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCalculatorForm.g:760:2: ( ruleFieldInput )
                    {
                    // InternalCalculatorForm.g:760:2: ( ruleFieldInput )
                    // InternalCalculatorForm.g:761:3: ruleFieldInput
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getFieldInputParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldInput();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getFieldInputParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:766:2: ( ruleFieldSelect )
                    {
                    // InternalCalculatorForm.g:766:2: ( ruleFieldSelect )
                    // InternalCalculatorForm.g:767:3: ruleFieldSelect
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getFieldSelectParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldSelect();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getFieldSelectParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:772:2: ( ruleFieldChoice )
                    {
                    // InternalCalculatorForm.g:772:2: ( ruleFieldChoice )
                    // InternalCalculatorForm.g:773:3: ruleFieldChoice
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getFieldChoiceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldChoice();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getFieldChoiceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCalculatorForm.g:778:2: ( ruleButton )
                    {
                    // InternalCalculatorForm.g:778:2: ( ruleButton )
                    // InternalCalculatorForm.g:779:3: ruleButton
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getButtonParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getButtonParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives"


    // $ANTLR start "rule__FieldSelectChild__Alternatives"
    // InternalCalculatorForm.g:788:1: rule__FieldSelectChild__Alternatives : ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) );
    public final void rule__FieldSelectChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:792:1: ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCalculatorForm.g:793:2: ( ruleFieldOption )
                    {
                    // InternalCalculatorForm.g:793:2: ( ruleFieldOption )
                    // InternalCalculatorForm.g:794:3: ruleFieldOption
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldSelectChildAccess().getFieldOptionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldOption();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldSelectChildAccess().getFieldOptionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:799:2: ( ruleFieldOptionGroup )
                    {
                    // InternalCalculatorForm.g:799:2: ( ruleFieldOptionGroup )
                    // InternalCalculatorForm.g:800:3: ruleFieldOptionGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldSelectChildAccess().getFieldOptionGroupParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFieldOptionGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldSelectChildAccess().getFieldOptionGroupParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelectChild__Alternatives"


    // $ANTLR start "rule__PageChild__Alternatives"
    // InternalCalculatorForm.g:809:1: rule__PageChild__Alternatives : ( ( ruleGroup ) | ( ruleField ) );
    public final void rule__PageChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:813:1: ( ( ruleGroup ) | ( ruleField ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==16||LA5_0==19||LA5_0==24||LA5_0==27) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCalculatorForm.g:814:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:814:2: ( ruleGroup )
                    // InternalCalculatorForm.g:815:3: ruleGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageChildAccess().getGroupParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageChildAccess().getGroupParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:820:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:820:2: ( ruleField )
                    // InternalCalculatorForm.g:821:3: ruleField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageChildAccess().getFieldParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageChildAccess().getFieldParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageChild__Alternatives"


    // $ANTLR start "rule__ResultOutput__Alternatives"
    // InternalCalculatorForm.g:830:1: rule__ResultOutput__Alternatives : ( ( ruleCalculateVariable ) | ( ( rule__ResultOutput__Group_1__0 ) ) );
    public final void rule__ResultOutput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:834:1: ( ( ruleCalculateVariable ) | ( ( rule__ResultOutput__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculatorForm.g:835:2: ( ruleCalculateVariable )
                    {
                    // InternalCalculatorForm.g:835:2: ( ruleCalculateVariable )
                    // InternalCalculatorForm.g:836:3: ruleCalculateVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultOutputAccess().getCalculateVariableParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCalculateVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getResultOutputAccess().getCalculateVariableParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:841:2: ( ( rule__ResultOutput__Group_1__0 ) )
                    {
                    // InternalCalculatorForm.g:841:2: ( ( rule__ResultOutput__Group_1__0 ) )
                    // InternalCalculatorForm.g:842:3: ( rule__ResultOutput__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getResultOutputAccess().getGroup_1()); 
                    }
                    // InternalCalculatorForm.g:843:3: ( rule__ResultOutput__Group_1__0 )
                    // InternalCalculatorForm.g:843:4: rule__ResultOutput__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ResultOutput__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getResultOutputAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalCalculatorForm.g:851:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:855:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==33) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCalculatorForm.g:856:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalCalculatorForm.g:856:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalCalculatorForm.g:857:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // InternalCalculatorForm.g:858:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalCalculatorForm.g:858:4: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:862:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalCalculatorForm.g:862:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalCalculatorForm.g:863:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // InternalCalculatorForm.g:864:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalCalculatorForm.g:864:4: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // InternalCalculatorForm.g:872:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:876:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            else if ( (LA8_0==35) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculatorForm.g:877:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalCalculatorForm.g:877:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalCalculatorForm.g:878:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // InternalCalculatorForm.g:879:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalCalculatorForm.g:879:4: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:883:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalCalculatorForm.g:883:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalCalculatorForm.g:884:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // InternalCalculatorForm.g:885:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalCalculatorForm.g:885:4: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__Prefixed__Alternatives"
    // InternalCalculatorForm.g:893:1: rule__Prefixed__Alternatives : ( ( ruleUnaryOperation ) | ( ruleAtomic ) );
    public final void rule__Prefixed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:897:1: ( ( ruleUnaryOperation ) | ( ruleAtomic ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33||LA9_0==36) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||(LA9_0>=RULE_INT && LA9_0<=RULE_PERCENT)||LA9_0==37) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCalculatorForm.g:898:2: ( ruleUnaryOperation )
                    {
                    // InternalCalculatorForm.g:898:2: ( ruleUnaryOperation )
                    // InternalCalculatorForm.g:899:3: ruleUnaryOperation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getUnaryOperationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUnaryOperation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getUnaryOperationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:904:2: ( ruleAtomic )
                    {
                    // InternalCalculatorForm.g:904:2: ( ruleAtomic )
                    // InternalCalculatorForm.g:905:3: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Alternatives"


    // $ANTLR start "rule__UnaryOperation__Alternatives"
    // InternalCalculatorForm.g:914:1: rule__UnaryOperation__Alternatives : ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( ( rule__UnaryOperation__Group_1__0 ) ) );
    public final void rule__UnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:918:1: ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( ( rule__UnaryOperation__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCalculatorForm.g:919:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:919:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    // InternalCalculatorForm.g:920:3: ( rule__UnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:921:3: ( rule__UnaryOperation__Group_0__0 )
                    // InternalCalculatorForm.g:921:4: rule__UnaryOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryOperation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:925:2: ( ( rule__UnaryOperation__Group_1__0 ) )
                    {
                    // InternalCalculatorForm.g:925:2: ( ( rule__UnaryOperation__Group_1__0 ) )
                    // InternalCalculatorForm.g:926:3: ( rule__UnaryOperation__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_1()); 
                    }
                    // InternalCalculatorForm.g:927:3: ( rule__UnaryOperation__Group_1__0 )
                    // InternalCalculatorForm.g:927:4: rule__UnaryOperation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryOperation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryOperationAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalCalculatorForm.g:935:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLiteral ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:939:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLiteral ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||(LA11_0>=RULE_INT && LA11_0<=RULE_PERCENT)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:940:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:940:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalCalculatorForm.g:941:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:942:3: ( rule__Atomic__Group_0__0 )
                    // InternalCalculatorForm.g:942:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:946:2: ( ruleLiteral )
                    {
                    // InternalCalculatorForm.g:946:2: ( ruleLiteral )
                    // InternalCalculatorForm.g:947:3: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalCalculatorForm.g:956:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:960:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt12=2;
                }
                break;
            case RULE_PERCENT:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalCalculatorForm.g:961:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:961:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalCalculatorForm.g:962:3: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:963:3: ( rule__Literal__Group_0__0 )
                    // InternalCalculatorForm.g:963:4: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:967:2: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // InternalCalculatorForm.g:967:2: ( ( rule__Literal__Group_1__0 ) )
                    // InternalCalculatorForm.g:968:3: ( rule__Literal__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    }
                    // InternalCalculatorForm.g:969:3: ( rule__Literal__Group_1__0 )
                    // InternalCalculatorForm.g:969:4: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:973:2: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // InternalCalculatorForm.g:973:2: ( ( rule__Literal__Group_2__0 ) )
                    // InternalCalculatorForm.g:974:3: ( rule__Literal__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    }
                    // InternalCalculatorForm.g:975:3: ( rule__Literal__Group_2__0 )
                    // InternalCalculatorForm.g:975:4: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCalculatorForm.g:979:2: ( ( rule__Literal__Group_3__0 ) )
                    {
                    // InternalCalculatorForm.g:979:2: ( ( rule__Literal__Group_3__0 ) )
                    // InternalCalculatorForm.g:980:3: ( rule__Literal__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_3()); 
                    }
                    // InternalCalculatorForm.g:981:3: ( rule__Literal__Group_3__0 )
                    // InternalCalculatorForm.g:981:4: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Form__Group__0"
    // InternalCalculatorForm.g:989:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:993:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalCalculatorForm.g:994:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Form__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalCalculatorForm.g:1001:1: rule__Form__Group__0__Impl : ( 'form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1005:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1006:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1006:1: ( 'form' )
            // InternalCalculatorForm.g:1007:2: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getFormKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalCalculatorForm.g:1016:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1020:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalCalculatorForm.g:1021:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Form__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalCalculatorForm.g:1028:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1032:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1033:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1033:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1034:2: ( rule__Form__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:1035:2: ( rule__Form__NameAssignment_1 )
            // InternalCalculatorForm.g:1035:3: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalCalculatorForm.g:1043:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1047:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // InternalCalculatorForm.g:1048:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Form__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Form__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalCalculatorForm.g:1055:1: rule__Form__Group__2__Impl : ( '{' ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1059:1: ( ( '{' ) )
            // InternalCalculatorForm.g:1060:1: ( '{' )
            {
            // InternalCalculatorForm.g:1060:1: ( '{' )
            // InternalCalculatorForm.g:1061:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // InternalCalculatorForm.g:1070:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1074:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // InternalCalculatorForm.g:1075:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Form__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Form__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // InternalCalculatorForm.g:1082:1: rule__Form__Group__3__Impl : ( ( rule__Form__FormElementsAssignment_3 )* ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1086:1: ( ( ( rule__Form__FormElementsAssignment_3 )* ) )
            // InternalCalculatorForm.g:1087:1: ( ( rule__Form__FormElementsAssignment_3 )* )
            {
            // InternalCalculatorForm.g:1087:1: ( ( rule__Form__FormElementsAssignment_3 )* )
            // InternalCalculatorForm.g:1088:2: ( rule__Form__FormElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getFormElementsAssignment_3()); 
            }
            // InternalCalculatorForm.g:1089:2: ( rule__Form__FormElementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16||LA13_0==19||(LA13_0>=24 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCalculatorForm.g:1089:3: rule__Form__FormElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Form__FormElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getFormElementsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // InternalCalculatorForm.g:1097:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1101:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // InternalCalculatorForm.g:1102:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Form__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Form__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // InternalCalculatorForm.g:1109:1: rule__Form__Group__4__Impl : ( ( rule__Form__CalculationsAssignment_4 )* ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1113:1: ( ( ( rule__Form__CalculationsAssignment_4 )* ) )
            // InternalCalculatorForm.g:1114:1: ( ( rule__Form__CalculationsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:1114:1: ( ( rule__Form__CalculationsAssignment_4 )* )
            // InternalCalculatorForm.g:1115:2: ( rule__Form__CalculationsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getCalculationsAssignment_4()); 
            }
            // InternalCalculatorForm.g:1116:2: ( rule__Form__CalculationsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCalculatorForm.g:1116:3: rule__Form__CalculationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Form__CalculationsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getCalculationsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // InternalCalculatorForm.g:1124:1: rule__Form__Group__5 : rule__Form__Group__5__Impl ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1128:1: ( rule__Form__Group__5__Impl )
            // InternalCalculatorForm.g:1129:2: rule__Form__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // InternalCalculatorForm.g:1135:1: rule__Form__Group__5__Impl : ( '}' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1139:1: ( ( '}' ) )
            // InternalCalculatorForm.g:1140:1: ( '}' )
            {
            // InternalCalculatorForm.g:1140:1: ( '}' )
            // InternalCalculatorForm.g:1141:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__FieldInput__Group__0"
    // InternalCalculatorForm.g:1151:1: rule__FieldInput__Group__0 : rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 ;
    public final void rule__FieldInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1155:1: ( rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 )
            // InternalCalculatorForm.g:1156:2: rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FieldInput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__0"


    // $ANTLR start "rule__FieldInput__Group__0__Impl"
    // InternalCalculatorForm.g:1163:1: rule__FieldInput__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1167:1: ( ( 'field' ) )
            // InternalCalculatorForm.g:1168:1: ( 'field' )
            {
            // InternalCalculatorForm.g:1168:1: ( 'field' )
            // InternalCalculatorForm.g:1169:2: 'field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFieldKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__0__Impl"


    // $ANTLR start "rule__FieldInput__Group__1"
    // InternalCalculatorForm.g:1178:1: rule__FieldInput__Group__1 : rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 ;
    public final void rule__FieldInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1182:1: ( rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 )
            // InternalCalculatorForm.g:1183:2: rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__1"


    // $ANTLR start "rule__FieldInput__Group__1__Impl"
    // InternalCalculatorForm.g:1190:1: rule__FieldInput__Group__1__Impl : ( ( rule__FieldInput__NameAssignment_1 ) ) ;
    public final void rule__FieldInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1194:1: ( ( ( rule__FieldInput__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1195:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1195:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1196:2: ( rule__FieldInput__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:1197:2: ( rule__FieldInput__NameAssignment_1 )
            // InternalCalculatorForm.g:1197:3: rule__FieldInput__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__1__Impl"


    // $ANTLR start "rule__FieldInput__Group__2"
    // InternalCalculatorForm.g:1205:1: rule__FieldInput__Group__2 : rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 ;
    public final void rule__FieldInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1209:1: ( rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 )
            // InternalCalculatorForm.g:1210:2: rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__2"


    // $ANTLR start "rule__FieldInput__Group__2__Impl"
    // InternalCalculatorForm.g:1217:1: rule__FieldInput__Group__2__Impl : ( ( rule__FieldInput__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1221:1: ( ( ( rule__FieldInput__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:1222:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1222:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:1223:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:1224:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatorForm.g:1224:3: rule__FieldInput__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__AutofocusAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getAutofocusAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__2__Impl"


    // $ANTLR start "rule__FieldInput__Group__3"
    // InternalCalculatorForm.g:1232:1: rule__FieldInput__Group__3 : rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 ;
    public final void rule__FieldInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1236:1: ( rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 )
            // InternalCalculatorForm.g:1237:2: rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__3"


    // $ANTLR start "rule__FieldInput__Group__3__Impl"
    // InternalCalculatorForm.g:1244:1: rule__FieldInput__Group__3__Impl : ( ( rule__FieldInput__DisabledAssignment_3 )? ) ;
    public final void rule__FieldInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1248:1: ( ( ( rule__FieldInput__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:1249:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1249:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:1250:2: ( rule__FieldInput__DisabledAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledAssignment_3()); 
            }
            // InternalCalculatorForm.g:1251:2: ( rule__FieldInput__DisabledAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculatorForm.g:1251:3: rule__FieldInput__DisabledAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__DisabledAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getDisabledAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__3__Impl"


    // $ANTLR start "rule__FieldInput__Group__4"
    // InternalCalculatorForm.g:1259:1: rule__FieldInput__Group__4 : rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 ;
    public final void rule__FieldInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1263:1: ( rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 )
            // InternalCalculatorForm.g:1264:2: rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__4"


    // $ANTLR start "rule__FieldInput__Group__4__Impl"
    // InternalCalculatorForm.g:1271:1: rule__FieldInput__Group__4__Impl : ( ( rule__FieldInput__Group_4__0 )? ) ;
    public final void rule__FieldInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1275:1: ( ( ( rule__FieldInput__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1276:1: ( ( rule__FieldInput__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1276:1: ( ( rule__FieldInput__Group_4__0 )? )
            // InternalCalculatorForm.g:1277:2: ( rule__FieldInput__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:1278:2: ( rule__FieldInput__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCalculatorForm.g:1278:3: rule__FieldInput__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__4__Impl"


    // $ANTLR start "rule__FieldInput__Group__5"
    // InternalCalculatorForm.g:1286:1: rule__FieldInput__Group__5 : rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 ;
    public final void rule__FieldInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1290:1: ( rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 )
            // InternalCalculatorForm.g:1291:2: rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__5"


    // $ANTLR start "rule__FieldInput__Group__5__Impl"
    // InternalCalculatorForm.g:1298:1: rule__FieldInput__Group__5__Impl : ( ( rule__FieldInput__Group_5__0 )? ) ;
    public final void rule__FieldInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1302:1: ( ( ( rule__FieldInput__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1303:1: ( ( rule__FieldInput__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1303:1: ( ( rule__FieldInput__Group_5__0 )? )
            // InternalCalculatorForm.g:1304:2: ( rule__FieldInput__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:1305:2: ( rule__FieldInput__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculatorForm.g:1305:3: rule__FieldInput__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__5__Impl"


    // $ANTLR start "rule__FieldInput__Group__6"
    // InternalCalculatorForm.g:1313:1: rule__FieldInput__Group__6 : rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 ;
    public final void rule__FieldInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1317:1: ( rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 )
            // InternalCalculatorForm.g:1318:2: rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__6"


    // $ANTLR start "rule__FieldInput__Group__6__Impl"
    // InternalCalculatorForm.g:1325:1: rule__FieldInput__Group__6__Impl : ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) ;
    public final void rule__FieldInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1329:1: ( ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) )
            // InternalCalculatorForm.g:1330:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            {
            // InternalCalculatorForm.g:1330:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            // InternalCalculatorForm.g:1331:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedAssignment_6()); 
            }
            // InternalCalculatorForm.g:1332:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCalculatorForm.g:1332:3: rule__FieldInput__NotdisplayedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__NotdisplayedAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getNotdisplayedAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__6__Impl"


    // $ANTLR start "rule__FieldInput__Group__7"
    // InternalCalculatorForm.g:1340:1: rule__FieldInput__Group__7 : rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 ;
    public final void rule__FieldInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1344:1: ( rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 )
            // InternalCalculatorForm.g:1345:2: rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__7"


    // $ANTLR start "rule__FieldInput__Group__7__Impl"
    // InternalCalculatorForm.g:1352:1: rule__FieldInput__Group__7__Impl : ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) ;
    public final void rule__FieldInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1356:1: ( ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) )
            // InternalCalculatorForm.g:1357:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            {
            // InternalCalculatorForm.g:1357:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            // InternalCalculatorForm.g:1358:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyAssignment_7()); 
            }
            // InternalCalculatorForm.g:1359:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCalculatorForm.g:1359:3: rule__FieldInput__ReadonlyAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__ReadonlyAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getReadonlyAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__7__Impl"


    // $ANTLR start "rule__FieldInput__Group__8"
    // InternalCalculatorForm.g:1367:1: rule__FieldInput__Group__8 : rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 ;
    public final void rule__FieldInput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1371:1: ( rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 )
            // InternalCalculatorForm.g:1372:2: rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__FieldInput__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__8"


    // $ANTLR start "rule__FieldInput__Group__8__Impl"
    // InternalCalculatorForm.g:1379:1: rule__FieldInput__Group__8__Impl : ( ( rule__FieldInput__RequiredAssignment_8 )? ) ;
    public final void rule__FieldInput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1383:1: ( ( ( rule__FieldInput__RequiredAssignment_8 )? ) )
            // InternalCalculatorForm.g:1384:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            {
            // InternalCalculatorForm.g:1384:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            // InternalCalculatorForm.g:1385:2: ( rule__FieldInput__RequiredAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredAssignment_8()); 
            }
            // InternalCalculatorForm.g:1386:2: ( rule__FieldInput__RequiredAssignment_8 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCalculatorForm.g:1386:3: rule__FieldInput__RequiredAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__RequiredAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getRequiredAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__8__Impl"


    // $ANTLR start "rule__FieldInput__Group__9"
    // InternalCalculatorForm.g:1394:1: rule__FieldInput__Group__9 : rule__FieldInput__Group__9__Impl ;
    public final void rule__FieldInput__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1398:1: ( rule__FieldInput__Group__9__Impl )
            // InternalCalculatorForm.g:1399:2: rule__FieldInput__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__9"


    // $ANTLR start "rule__FieldInput__Group__9__Impl"
    // InternalCalculatorForm.g:1405:1: rule__FieldInput__Group__9__Impl : ( ( rule__FieldInput__Group_9__0 )? ) ;
    public final void rule__FieldInput__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1409:1: ( ( ( rule__FieldInput__Group_9__0 )? ) )
            // InternalCalculatorForm.g:1410:1: ( ( rule__FieldInput__Group_9__0 )? )
            {
            // InternalCalculatorForm.g:1410:1: ( ( rule__FieldInput__Group_9__0 )? )
            // InternalCalculatorForm.g:1411:2: ( rule__FieldInput__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_9()); 
            }
            // InternalCalculatorForm.g:1412:2: ( rule__FieldInput__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCalculatorForm.g:1412:3: rule__FieldInput__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group__9__Impl"


    // $ANTLR start "rule__FieldInput__Group_4__0"
    // InternalCalculatorForm.g:1421:1: rule__FieldInput__Group_4__0 : rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 ;
    public final void rule__FieldInput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1425:1: ( rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 )
            // InternalCalculatorForm.g:1426:2: rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldInput__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_4__0"


    // $ANTLR start "rule__FieldInput__Group_4__0__Impl"
    // InternalCalculatorForm.g:1433:1: rule__FieldInput__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldInput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1437:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1438:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1438:1: ( 'form' )
            // InternalCalculatorForm.g:1439:2: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFormKeyword_4_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getFormKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_4__0__Impl"


    // $ANTLR start "rule__FieldInput__Group_4__1"
    // InternalCalculatorForm.g:1448:1: rule__FieldInput__Group_4__1 : rule__FieldInput__Group_4__1__Impl ;
    public final void rule__FieldInput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1452:1: ( rule__FieldInput__Group_4__1__Impl )
            // InternalCalculatorForm.g:1453:2: rule__FieldInput__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_4__1"


    // $ANTLR start "rule__FieldInput__Group_4__1__Impl"
    // InternalCalculatorForm.g:1459:1: rule__FieldInput__Group_4__1__Impl : ( ( rule__FieldInput__FormAssignment_4_1 ) ) ;
    public final void rule__FieldInput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1463:1: ( ( ( rule__FieldInput__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1464:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1464:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:1465:2: ( rule__FieldInput__FormAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFormAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:1466:2: ( rule__FieldInput__FormAssignment_4_1 )
            // InternalCalculatorForm.g:1466:3: rule__FieldInput__FormAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__FormAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getFormAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_4__1__Impl"


    // $ANTLR start "rule__FieldInput__Group_5__0"
    // InternalCalculatorForm.g:1475:1: rule__FieldInput__Group_5__0 : rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 ;
    public final void rule__FieldInput__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1479:1: ( rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 )
            // InternalCalculatorForm.g:1480:2: rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldInput__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_5__0"


    // $ANTLR start "rule__FieldInput__Group_5__0__Impl"
    // InternalCalculatorForm.g:1487:1: rule__FieldInput__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldInput__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1491:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1492:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1492:1: ( 'label' )
            // InternalCalculatorForm.g:1493:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getLabelKeyword_5_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getLabelKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_5__0__Impl"


    // $ANTLR start "rule__FieldInput__Group_5__1"
    // InternalCalculatorForm.g:1502:1: rule__FieldInput__Group_5__1 : rule__FieldInput__Group_5__1__Impl ;
    public final void rule__FieldInput__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1506:1: ( rule__FieldInput__Group_5__1__Impl )
            // InternalCalculatorForm.g:1507:2: rule__FieldInput__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_5__1"


    // $ANTLR start "rule__FieldInput__Group_5__1__Impl"
    // InternalCalculatorForm.g:1513:1: rule__FieldInput__Group_5__1__Impl : ( ( rule__FieldInput__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldInput__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1517:1: ( ( ( rule__FieldInput__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:1518:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:1518:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:1519:2: ( rule__FieldInput__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getLabelAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:1520:2: ( rule__FieldInput__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:1520:3: rule__FieldInput__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__LabelAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getLabelAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_5__1__Impl"


    // $ANTLR start "rule__FieldInput__Group_9__0"
    // InternalCalculatorForm.g:1529:1: rule__FieldInput__Group_9__0 : rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 ;
    public final void rule__FieldInput__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1533:1: ( rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 )
            // InternalCalculatorForm.g:1534:2: rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldInput__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_9__0"


    // $ANTLR start "rule__FieldInput__Group_9__0__Impl"
    // InternalCalculatorForm.g:1541:1: rule__FieldInput__Group_9__0__Impl : ( 'value' ) ;
    public final void rule__FieldInput__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1545:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:1546:1: ( 'value' )
            {
            // InternalCalculatorForm.g:1546:1: ( 'value' )
            // InternalCalculatorForm.g:1547:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getValueKeyword_9_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getValueKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_9__0__Impl"


    // $ANTLR start "rule__FieldInput__Group_9__1"
    // InternalCalculatorForm.g:1556:1: rule__FieldInput__Group_9__1 : rule__FieldInput__Group_9__1__Impl ;
    public final void rule__FieldInput__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1560:1: ( rule__FieldInput__Group_9__1__Impl )
            // InternalCalculatorForm.g:1561:2: rule__FieldInput__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_9__1"


    // $ANTLR start "rule__FieldInput__Group_9__1__Impl"
    // InternalCalculatorForm.g:1567:1: rule__FieldInput__Group_9__1__Impl : ( ( rule__FieldInput__ValueAssignment_9_1 ) ) ;
    public final void rule__FieldInput__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1571:1: ( ( ( rule__FieldInput__ValueAssignment_9_1 ) ) )
            // InternalCalculatorForm.g:1572:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            {
            // InternalCalculatorForm.g:1572:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            // InternalCalculatorForm.g:1573:2: ( rule__FieldInput__ValueAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getValueAssignment_9_1()); 
            }
            // InternalCalculatorForm.g:1574:2: ( rule__FieldInput__ValueAssignment_9_1 )
            // InternalCalculatorForm.g:1574:3: rule__FieldInput__ValueAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__ValueAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getValueAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__Group_9__1__Impl"


    // $ANTLR start "rule__FieldSelect__Group__0"
    // InternalCalculatorForm.g:1583:1: rule__FieldSelect__Group__0 : rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 ;
    public final void rule__FieldSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1587:1: ( rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 )
            // InternalCalculatorForm.g:1588:2: rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FieldSelect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__0"


    // $ANTLR start "rule__FieldSelect__Group__0__Impl"
    // InternalCalculatorForm.g:1595:1: rule__FieldSelect__Group__0__Impl : ( 'dropdown' ) ;
    public final void rule__FieldSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1599:1: ( ( 'dropdown' ) )
            // InternalCalculatorForm.g:1600:1: ( 'dropdown' )
            {
            // InternalCalculatorForm.g:1600:1: ( 'dropdown' )
            // InternalCalculatorForm.g:1601:2: 'dropdown'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDropdownKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getDropdownKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__0__Impl"


    // $ANTLR start "rule__FieldSelect__Group__1"
    // InternalCalculatorForm.g:1610:1: rule__FieldSelect__Group__1 : rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 ;
    public final void rule__FieldSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1614:1: ( rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 )
            // InternalCalculatorForm.g:1615:2: rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__1"


    // $ANTLR start "rule__FieldSelect__Group__1__Impl"
    // InternalCalculatorForm.g:1622:1: rule__FieldSelect__Group__1__Impl : ( ( rule__FieldSelect__NameAssignment_1 ) ) ;
    public final void rule__FieldSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1626:1: ( ( ( rule__FieldSelect__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1627:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1627:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1628:2: ( rule__FieldSelect__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:1629:2: ( rule__FieldSelect__NameAssignment_1 )
            // InternalCalculatorForm.g:1629:3: rule__FieldSelect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__1__Impl"


    // $ANTLR start "rule__FieldSelect__Group__2"
    // InternalCalculatorForm.g:1637:1: rule__FieldSelect__Group__2 : rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 ;
    public final void rule__FieldSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1641:1: ( rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 )
            // InternalCalculatorForm.g:1642:2: rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__2"


    // $ANTLR start "rule__FieldSelect__Group__2__Impl"
    // InternalCalculatorForm.g:1649:1: rule__FieldSelect__Group__2__Impl : ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1653:1: ( ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:1654:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1654:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:1655:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:1656:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCalculatorForm.g:1656:3: rule__FieldSelect__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__AutofocusAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getAutofocusAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__2__Impl"


    // $ANTLR start "rule__FieldSelect__Group__3"
    // InternalCalculatorForm.g:1664:1: rule__FieldSelect__Group__3 : rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 ;
    public final void rule__FieldSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1668:1: ( rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 )
            // InternalCalculatorForm.g:1669:2: rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__3"


    // $ANTLR start "rule__FieldSelect__Group__3__Impl"
    // InternalCalculatorForm.g:1676:1: rule__FieldSelect__Group__3__Impl : ( ( rule__FieldSelect__DisabledAssignment_3 )? ) ;
    public final void rule__FieldSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1680:1: ( ( ( rule__FieldSelect__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:1681:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1681:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:1682:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledAssignment_3()); 
            }
            // InternalCalculatorForm.g:1683:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCalculatorForm.g:1683:3: rule__FieldSelect__DisabledAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__DisabledAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getDisabledAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__3__Impl"


    // $ANTLR start "rule__FieldSelect__Group__4"
    // InternalCalculatorForm.g:1691:1: rule__FieldSelect__Group__4 : rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 ;
    public final void rule__FieldSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1695:1: ( rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 )
            // InternalCalculatorForm.g:1696:2: rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__4"


    // $ANTLR start "rule__FieldSelect__Group__4__Impl"
    // InternalCalculatorForm.g:1703:1: rule__FieldSelect__Group__4__Impl : ( ( rule__FieldSelect__Group_4__0 )? ) ;
    public final void rule__FieldSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1707:1: ( ( ( rule__FieldSelect__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1708:1: ( ( rule__FieldSelect__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1708:1: ( ( rule__FieldSelect__Group_4__0 )? )
            // InternalCalculatorForm.g:1709:2: ( rule__FieldSelect__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:1710:2: ( rule__FieldSelect__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCalculatorForm.g:1710:3: rule__FieldSelect__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__4__Impl"


    // $ANTLR start "rule__FieldSelect__Group__5"
    // InternalCalculatorForm.g:1718:1: rule__FieldSelect__Group__5 : rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 ;
    public final void rule__FieldSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1722:1: ( rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 )
            // InternalCalculatorForm.g:1723:2: rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__5"


    // $ANTLR start "rule__FieldSelect__Group__5__Impl"
    // InternalCalculatorForm.g:1730:1: rule__FieldSelect__Group__5__Impl : ( ( rule__FieldSelect__Group_5__0 )? ) ;
    public final void rule__FieldSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1734:1: ( ( ( rule__FieldSelect__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1735:1: ( ( rule__FieldSelect__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1735:1: ( ( rule__FieldSelect__Group_5__0 )? )
            // InternalCalculatorForm.g:1736:2: ( rule__FieldSelect__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:1737:2: ( rule__FieldSelect__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCalculatorForm.g:1737:3: rule__FieldSelect__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__5__Impl"


    // $ANTLR start "rule__FieldSelect__Group__6"
    // InternalCalculatorForm.g:1745:1: rule__FieldSelect__Group__6 : rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 ;
    public final void rule__FieldSelect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1749:1: ( rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 )
            // InternalCalculatorForm.g:1750:2: rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__6"


    // $ANTLR start "rule__FieldSelect__Group__6__Impl"
    // InternalCalculatorForm.g:1757:1: rule__FieldSelect__Group__6__Impl : ( ( rule__FieldSelect__MultipleAssignment_6 )? ) ;
    public final void rule__FieldSelect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1761:1: ( ( ( rule__FieldSelect__MultipleAssignment_6 )? ) )
            // InternalCalculatorForm.g:1762:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            {
            // InternalCalculatorForm.g:1762:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            // InternalCalculatorForm.g:1763:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleAssignment_6()); 
            }
            // InternalCalculatorForm.g:1764:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCalculatorForm.g:1764:3: rule__FieldSelect__MultipleAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__MultipleAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getMultipleAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__6__Impl"


    // $ANTLR start "rule__FieldSelect__Group__7"
    // InternalCalculatorForm.g:1772:1: rule__FieldSelect__Group__7 : rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 ;
    public final void rule__FieldSelect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1776:1: ( rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 )
            // InternalCalculatorForm.g:1777:2: rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__7"


    // $ANTLR start "rule__FieldSelect__Group__7__Impl"
    // InternalCalculatorForm.g:1784:1: rule__FieldSelect__Group__7__Impl : ( ( rule__FieldSelect__RequiredAssignment_7 )? ) ;
    public final void rule__FieldSelect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1788:1: ( ( ( rule__FieldSelect__RequiredAssignment_7 )? ) )
            // InternalCalculatorForm.g:1789:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            {
            // InternalCalculatorForm.g:1789:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            // InternalCalculatorForm.g:1790:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredAssignment_7()); 
            }
            // InternalCalculatorForm.g:1791:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCalculatorForm.g:1791:3: rule__FieldSelect__RequiredAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__RequiredAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getRequiredAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__7__Impl"


    // $ANTLR start "rule__FieldSelect__Group__8"
    // InternalCalculatorForm.g:1799:1: rule__FieldSelect__Group__8 : rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 ;
    public final void rule__FieldSelect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1803:1: ( rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 )
            // InternalCalculatorForm.g:1804:2: rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__FieldSelect__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__8"


    // $ANTLR start "rule__FieldSelect__Group__8__Impl"
    // InternalCalculatorForm.g:1811:1: rule__FieldSelect__Group__8__Impl : ( ( rule__FieldSelect__Group_8__0 )? ) ;
    public final void rule__FieldSelect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1815:1: ( ( ( rule__FieldSelect__Group_8__0 )? ) )
            // InternalCalculatorForm.g:1816:1: ( ( rule__FieldSelect__Group_8__0 )? )
            {
            // InternalCalculatorForm.g:1816:1: ( ( rule__FieldSelect__Group_8__0 )? )
            // InternalCalculatorForm.g:1817:2: ( rule__FieldSelect__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_8()); 
            }
            // InternalCalculatorForm.g:1818:2: ( rule__FieldSelect__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCalculatorForm.g:1818:3: rule__FieldSelect__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__8__Impl"


    // $ANTLR start "rule__FieldSelect__Group__9"
    // InternalCalculatorForm.g:1826:1: rule__FieldSelect__Group__9 : rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 ;
    public final void rule__FieldSelect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1830:1: ( rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 )
            // InternalCalculatorForm.g:1831:2: rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__FieldSelect__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__9"


    // $ANTLR start "rule__FieldSelect__Group__9__Impl"
    // InternalCalculatorForm.g:1838:1: rule__FieldSelect__Group__9__Impl : ( '{' ) ;
    public final void rule__FieldSelect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1842:1: ( ( '{' ) )
            // InternalCalculatorForm.g:1843:1: ( '{' )
            {
            // InternalCalculatorForm.g:1843:1: ( '{' )
            // InternalCalculatorForm.g:1844:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__9__Impl"


    // $ANTLR start "rule__FieldSelect__Group__10"
    // InternalCalculatorForm.g:1853:1: rule__FieldSelect__Group__10 : rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 ;
    public final void rule__FieldSelect__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1857:1: ( rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 )
            // InternalCalculatorForm.g:1858:2: rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__FieldSelect__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__10"


    // $ANTLR start "rule__FieldSelect__Group__10__Impl"
    // InternalCalculatorForm.g:1865:1: rule__FieldSelect__Group__10__Impl : ( ( rule__FieldSelect__ChildsAssignment_10 )* ) ;
    public final void rule__FieldSelect__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1869:1: ( ( ( rule__FieldSelect__ChildsAssignment_10 )* ) )
            // InternalCalculatorForm.g:1870:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            {
            // InternalCalculatorForm.g:1870:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            // InternalCalculatorForm.g:1871:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getChildsAssignment_10()); 
            }
            // InternalCalculatorForm.g:1872:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21||LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCalculatorForm.g:1872:3: rule__FieldSelect__ChildsAssignment_10
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FieldSelect__ChildsAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getChildsAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__10__Impl"


    // $ANTLR start "rule__FieldSelect__Group__11"
    // InternalCalculatorForm.g:1880:1: rule__FieldSelect__Group__11 : rule__FieldSelect__Group__11__Impl ;
    public final void rule__FieldSelect__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1884:1: ( rule__FieldSelect__Group__11__Impl )
            // InternalCalculatorForm.g:1885:2: rule__FieldSelect__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__11"


    // $ANTLR start "rule__FieldSelect__Group__11__Impl"
    // InternalCalculatorForm.g:1891:1: rule__FieldSelect__Group__11__Impl : ( '}' ) ;
    public final void rule__FieldSelect__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1895:1: ( ( '}' ) )
            // InternalCalculatorForm.g:1896:1: ( '}' )
            {
            // InternalCalculatorForm.g:1896:1: ( '}' )
            // InternalCalculatorForm.g:1897:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getRightCurlyBracketKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group__11__Impl"


    // $ANTLR start "rule__FieldSelect__Group_4__0"
    // InternalCalculatorForm.g:1907:1: rule__FieldSelect__Group_4__0 : rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 ;
    public final void rule__FieldSelect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1911:1: ( rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 )
            // InternalCalculatorForm.g:1912:2: rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldSelect__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_4__0"


    // $ANTLR start "rule__FieldSelect__Group_4__0__Impl"
    // InternalCalculatorForm.g:1919:1: rule__FieldSelect__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldSelect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1923:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1924:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1924:1: ( 'form' )
            // InternalCalculatorForm.g:1925:2: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getFormKeyword_4_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getFormKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_4__0__Impl"


    // $ANTLR start "rule__FieldSelect__Group_4__1"
    // InternalCalculatorForm.g:1934:1: rule__FieldSelect__Group_4__1 : rule__FieldSelect__Group_4__1__Impl ;
    public final void rule__FieldSelect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1938:1: ( rule__FieldSelect__Group_4__1__Impl )
            // InternalCalculatorForm.g:1939:2: rule__FieldSelect__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_4__1"


    // $ANTLR start "rule__FieldSelect__Group_4__1__Impl"
    // InternalCalculatorForm.g:1945:1: rule__FieldSelect__Group_4__1__Impl : ( ( rule__FieldSelect__FormAssignment_4_1 ) ) ;
    public final void rule__FieldSelect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1949:1: ( ( ( rule__FieldSelect__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1950:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1950:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:1951:2: ( rule__FieldSelect__FormAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getFormAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:1952:2: ( rule__FieldSelect__FormAssignment_4_1 )
            // InternalCalculatorForm.g:1952:3: rule__FieldSelect__FormAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__FormAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getFormAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_4__1__Impl"


    // $ANTLR start "rule__FieldSelect__Group_5__0"
    // InternalCalculatorForm.g:1961:1: rule__FieldSelect__Group_5__0 : rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 ;
    public final void rule__FieldSelect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1965:1: ( rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 )
            // InternalCalculatorForm.g:1966:2: rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldSelect__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_5__0"


    // $ANTLR start "rule__FieldSelect__Group_5__0__Impl"
    // InternalCalculatorForm.g:1973:1: rule__FieldSelect__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldSelect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1977:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1978:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1978:1: ( 'label' )
            // InternalCalculatorForm.g:1979:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_5__0__Impl"


    // $ANTLR start "rule__FieldSelect__Group_5__1"
    // InternalCalculatorForm.g:1988:1: rule__FieldSelect__Group_5__1 : rule__FieldSelect__Group_5__1__Impl ;
    public final void rule__FieldSelect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1992:1: ( rule__FieldSelect__Group_5__1__Impl )
            // InternalCalculatorForm.g:1993:2: rule__FieldSelect__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_5__1"


    // $ANTLR start "rule__FieldSelect__Group_5__1__Impl"
    // InternalCalculatorForm.g:1999:1: rule__FieldSelect__Group_5__1__Impl : ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldSelect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2003:1: ( ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2004:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2004:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:2005:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLabelAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:2006:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:2006:3: rule__FieldSelect__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__LabelAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getLabelAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_5__1__Impl"


    // $ANTLR start "rule__FieldSelect__Group_8__0"
    // InternalCalculatorForm.g:2015:1: rule__FieldSelect__Group_8__0 : rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 ;
    public final void rule__FieldSelect__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2019:1: ( rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 )
            // InternalCalculatorForm.g:2020:2: rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__FieldSelect__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_8__0"


    // $ANTLR start "rule__FieldSelect__Group_8__0__Impl"
    // InternalCalculatorForm.g:2027:1: rule__FieldSelect__Group_8__0__Impl : ( 'size' ) ;
    public final void rule__FieldSelect__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2031:1: ( ( 'size' ) )
            // InternalCalculatorForm.g:2032:1: ( 'size' )
            {
            // InternalCalculatorForm.g:2032:1: ( 'size' )
            // InternalCalculatorForm.g:2033:2: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_8__0__Impl"


    // $ANTLR start "rule__FieldSelect__Group_8__1"
    // InternalCalculatorForm.g:2042:1: rule__FieldSelect__Group_8__1 : rule__FieldSelect__Group_8__1__Impl ;
    public final void rule__FieldSelect__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2046:1: ( rule__FieldSelect__Group_8__1__Impl )
            // InternalCalculatorForm.g:2047:2: rule__FieldSelect__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_8__1"


    // $ANTLR start "rule__FieldSelect__Group_8__1__Impl"
    // InternalCalculatorForm.g:2053:1: rule__FieldSelect__Group_8__1__Impl : ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) ;
    public final void rule__FieldSelect__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2057:1: ( ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) )
            // InternalCalculatorForm.g:2058:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            {
            // InternalCalculatorForm.g:2058:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            // InternalCalculatorForm.g:2059:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getSizeAssignment_8_1()); 
            }
            // InternalCalculatorForm.g:2060:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            // InternalCalculatorForm.g:2060:3: rule__FieldSelect__SizeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__SizeAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getSizeAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__Group_8__1__Impl"


    // $ANTLR start "rule__FieldOption__Group__0"
    // InternalCalculatorForm.g:2069:1: rule__FieldOption__Group__0 : rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 ;
    public final void rule__FieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2073:1: ( rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 )
            // InternalCalculatorForm.g:2074:2: rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__0"


    // $ANTLR start "rule__FieldOption__Group__0__Impl"
    // InternalCalculatorForm.g:2081:1: rule__FieldOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2085:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:2086:1: ( 'option' )
            {
            // InternalCalculatorForm.g:2086:1: ( 'option' )
            // InternalCalculatorForm.g:2087:2: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getOptionKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getOptionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__0__Impl"


    // $ANTLR start "rule__FieldOption__Group__1"
    // InternalCalculatorForm.g:2096:1: rule__FieldOption__Group__1 : rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 ;
    public final void rule__FieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2100:1: ( rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 )
            // InternalCalculatorForm.g:2101:2: rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FieldOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__1"


    // $ANTLR start "rule__FieldOption__Group__1__Impl"
    // InternalCalculatorForm.g:2108:1: rule__FieldOption__Group__1__Impl : ( ( rule__FieldOption__TextAssignment_1 ) ) ;
    public final void rule__FieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2112:1: ( ( ( rule__FieldOption__TextAssignment_1 ) ) )
            // InternalCalculatorForm.g:2113:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2113:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            // InternalCalculatorForm.g:2114:2: ( rule__FieldOption__TextAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextAssignment_1()); 
            }
            // InternalCalculatorForm.g:2115:2: ( rule__FieldOption__TextAssignment_1 )
            // InternalCalculatorForm.g:2115:3: rule__FieldOption__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__TextAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getTextAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__1__Impl"


    // $ANTLR start "rule__FieldOption__Group__2"
    // InternalCalculatorForm.g:2123:1: rule__FieldOption__Group__2 : rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 ;
    public final void rule__FieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2127:1: ( rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 )
            // InternalCalculatorForm.g:2128:2: rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__FieldOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__2"


    // $ANTLR start "rule__FieldOption__Group__2__Impl"
    // InternalCalculatorForm.g:2135:1: rule__FieldOption__Group__2__Impl : ( ( rule__FieldOption__DisabledAssignment_2 )? ) ;
    public final void rule__FieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2139:1: ( ( ( rule__FieldOption__DisabledAssignment_2 )? ) )
            // InternalCalculatorForm.g:2140:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2140:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            // InternalCalculatorForm.g:2141:2: ( rule__FieldOption__DisabledAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledAssignment_2()); 
            }
            // InternalCalculatorForm.g:2142:2: ( rule__FieldOption__DisabledAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCalculatorForm.g:2142:3: rule__FieldOption__DisabledAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__DisabledAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getDisabledAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__2__Impl"


    // $ANTLR start "rule__FieldOption__Group__3"
    // InternalCalculatorForm.g:2150:1: rule__FieldOption__Group__3 : rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 ;
    public final void rule__FieldOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2154:1: ( rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 )
            // InternalCalculatorForm.g:2155:2: rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FieldOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__3"


    // $ANTLR start "rule__FieldOption__Group__3__Impl"
    // InternalCalculatorForm.g:2162:1: rule__FieldOption__Group__3__Impl : ( ( rule__FieldOption__SelectedAssignment_3 )? ) ;
    public final void rule__FieldOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2166:1: ( ( ( rule__FieldOption__SelectedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2167:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2167:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            // InternalCalculatorForm.g:2168:2: ( rule__FieldOption__SelectedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedAssignment_3()); 
            }
            // InternalCalculatorForm.g:2169:2: ( rule__FieldOption__SelectedAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCalculatorForm.g:2169:3: rule__FieldOption__SelectedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__SelectedAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getSelectedAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__3__Impl"


    // $ANTLR start "rule__FieldOption__Group__4"
    // InternalCalculatorForm.g:2177:1: rule__FieldOption__Group__4 : rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 ;
    public final void rule__FieldOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2181:1: ( rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 )
            // InternalCalculatorForm.g:2182:2: rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__FieldOption__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__4"


    // $ANTLR start "rule__FieldOption__Group__4__Impl"
    // InternalCalculatorForm.g:2189:1: rule__FieldOption__Group__4__Impl : ( ( rule__FieldOption__Group_4__0 )? ) ;
    public final void rule__FieldOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2193:1: ( ( ( rule__FieldOption__Group_4__0 )? ) )
            // InternalCalculatorForm.g:2194:1: ( ( rule__FieldOption__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:2194:1: ( ( rule__FieldOption__Group_4__0 )? )
            // InternalCalculatorForm.g:2195:2: ( rule__FieldOption__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:2196:2: ( rule__FieldOption__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCalculatorForm.g:2196:3: rule__FieldOption__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__4__Impl"


    // $ANTLR start "rule__FieldOption__Group__5"
    // InternalCalculatorForm.g:2204:1: rule__FieldOption__Group__5 : rule__FieldOption__Group__5__Impl ;
    public final void rule__FieldOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2208:1: ( rule__FieldOption__Group__5__Impl )
            // InternalCalculatorForm.g:2209:2: rule__FieldOption__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__5"


    // $ANTLR start "rule__FieldOption__Group__5__Impl"
    // InternalCalculatorForm.g:2215:1: rule__FieldOption__Group__5__Impl : ( ( rule__FieldOption__Group_5__0 )? ) ;
    public final void rule__FieldOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2219:1: ( ( ( rule__FieldOption__Group_5__0 )? ) )
            // InternalCalculatorForm.g:2220:1: ( ( rule__FieldOption__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:2220:1: ( ( rule__FieldOption__Group_5__0 )? )
            // InternalCalculatorForm.g:2221:2: ( rule__FieldOption__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:2222:2: ( rule__FieldOption__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==18) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCalculatorForm.g:2222:3: rule__FieldOption__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group__5__Impl"


    // $ANTLR start "rule__FieldOption__Group_4__0"
    // InternalCalculatorForm.g:2231:1: rule__FieldOption__Group_4__0 : rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 ;
    public final void rule__FieldOption__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2235:1: ( rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 )
            // InternalCalculatorForm.g:2236:2: rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldOption__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_4__0"


    // $ANTLR start "rule__FieldOption__Group_4__0__Impl"
    // InternalCalculatorForm.g:2243:1: rule__FieldOption__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__FieldOption__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2247:1: ( ( 'text' ) )
            // InternalCalculatorForm.g:2248:1: ( 'text' )
            {
            // InternalCalculatorForm.g:2248:1: ( 'text' )
            // InternalCalculatorForm.g:2249:2: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextKeyword_4_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getTextKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_4__0__Impl"


    // $ANTLR start "rule__FieldOption__Group_4__1"
    // InternalCalculatorForm.g:2258:1: rule__FieldOption__Group_4__1 : rule__FieldOption__Group_4__1__Impl ;
    public final void rule__FieldOption__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2262:1: ( rule__FieldOption__Group_4__1__Impl )
            // InternalCalculatorForm.g:2263:2: rule__FieldOption__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_4__1"


    // $ANTLR start "rule__FieldOption__Group_4__1__Impl"
    // InternalCalculatorForm.g:2269:1: rule__FieldOption__Group_4__1__Impl : ( ( rule__FieldOption__TextAssignment_4_1 ) ) ;
    public final void rule__FieldOption__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2273:1: ( ( ( rule__FieldOption__TextAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:2274:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:2274:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            // InternalCalculatorForm.g:2275:2: ( rule__FieldOption__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:2276:2: ( rule__FieldOption__TextAssignment_4_1 )
            // InternalCalculatorForm.g:2276:3: rule__FieldOption__TextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__TextAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getTextAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_4__1__Impl"


    // $ANTLR start "rule__FieldOption__Group_5__0"
    // InternalCalculatorForm.g:2285:1: rule__FieldOption__Group_5__0 : rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 ;
    public final void rule__FieldOption__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2289:1: ( rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 )
            // InternalCalculatorForm.g:2290:2: rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldOption__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_5__0"


    // $ANTLR start "rule__FieldOption__Group_5__0__Impl"
    // InternalCalculatorForm.g:2297:1: rule__FieldOption__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__FieldOption__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2301:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:2302:1: ( 'value' )
            {
            // InternalCalculatorForm.g:2302:1: ( 'value' )
            // InternalCalculatorForm.g:2303:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getValueKeyword_5_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getValueKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_5__0__Impl"


    // $ANTLR start "rule__FieldOption__Group_5__1"
    // InternalCalculatorForm.g:2312:1: rule__FieldOption__Group_5__1 : rule__FieldOption__Group_5__1__Impl ;
    public final void rule__FieldOption__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2316:1: ( rule__FieldOption__Group_5__1__Impl )
            // InternalCalculatorForm.g:2317:2: rule__FieldOption__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_5__1"


    // $ANTLR start "rule__FieldOption__Group_5__1__Impl"
    // InternalCalculatorForm.g:2323:1: rule__FieldOption__Group_5__1__Impl : ( ( rule__FieldOption__ValueAssignment_5_1 ) ) ;
    public final void rule__FieldOption__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2327:1: ( ( ( rule__FieldOption__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2328:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2328:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:2329:2: ( rule__FieldOption__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getValueAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:2330:2: ( rule__FieldOption__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:2330:3: rule__FieldOption__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__Group_5__1__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group__0"
    // InternalCalculatorForm.g:2339:1: rule__FieldOptionGroup__Group__0 : rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 ;
    public final void rule__FieldOptionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2343:1: ( rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 )
            // InternalCalculatorForm.g:2344:2: rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FieldOptionGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__0"


    // $ANTLR start "rule__FieldOptionGroup__Group__0__Impl"
    // InternalCalculatorForm.g:2351:1: rule__FieldOptionGroup__Group__0__Impl : ( 'option-group' ) ;
    public final void rule__FieldOptionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2355:1: ( ( 'option-group' ) )
            // InternalCalculatorForm.g:2356:1: ( 'option-group' )
            {
            // InternalCalculatorForm.g:2356:1: ( 'option-group' )
            // InternalCalculatorForm.g:2357:2: 'option-group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__0__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group__1"
    // InternalCalculatorForm.g:2366:1: rule__FieldOptionGroup__Group__1 : rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 ;
    public final void rule__FieldOptionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2370:1: ( rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 )
            // InternalCalculatorForm.g:2371:2: rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FieldOptionGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__1"


    // $ANTLR start "rule__FieldOptionGroup__Group__1__Impl"
    // InternalCalculatorForm.g:2378:1: rule__FieldOptionGroup__Group__1__Impl : ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) ;
    public final void rule__FieldOptionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2382:1: ( ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) )
            // InternalCalculatorForm.g:2383:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            {
            // InternalCalculatorForm.g:2383:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            // InternalCalculatorForm.g:2384:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledAssignment_1()); 
            }
            // InternalCalculatorForm.g:2385:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCalculatorForm.g:2385:3: rule__FieldOptionGroup__DisabledAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOptionGroup__DisabledAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getDisabledAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__1__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group__2"
    // InternalCalculatorForm.g:2393:1: rule__FieldOptionGroup__Group__2 : rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 ;
    public final void rule__FieldOptionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2397:1: ( rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 )
            // InternalCalculatorForm.g:2398:2: rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__FieldOptionGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__2"


    // $ANTLR start "rule__FieldOptionGroup__Group__2__Impl"
    // InternalCalculatorForm.g:2405:1: rule__FieldOptionGroup__Group__2__Impl : ( ( rule__FieldOptionGroup__Group_2__0 )? ) ;
    public final void rule__FieldOptionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2409:1: ( ( ( rule__FieldOptionGroup__Group_2__0 )? ) )
            // InternalCalculatorForm.g:2410:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:2410:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            // InternalCalculatorForm.g:2411:2: ( rule__FieldOptionGroup__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getGroup_2()); 
            }
            // InternalCalculatorForm.g:2412:2: ( rule__FieldOptionGroup__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCalculatorForm.g:2412:3: rule__FieldOptionGroup__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOptionGroup__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__2__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group__3"
    // InternalCalculatorForm.g:2420:1: rule__FieldOptionGroup__Group__3 : rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 ;
    public final void rule__FieldOptionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2424:1: ( rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 )
            // InternalCalculatorForm.g:2425:2: rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__FieldOptionGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__3"


    // $ANTLR start "rule__FieldOptionGroup__Group__3__Impl"
    // InternalCalculatorForm.g:2432:1: rule__FieldOptionGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldOptionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2436:1: ( ( '{' ) )
            // InternalCalculatorForm.g:2437:1: ( '{' )
            {
            // InternalCalculatorForm.g:2437:1: ( '{' )
            // InternalCalculatorForm.g:2438:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__3__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group__4"
    // InternalCalculatorForm.g:2447:1: rule__FieldOptionGroup__Group__4 : rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 ;
    public final void rule__FieldOptionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2451:1: ( rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 )
            // InternalCalculatorForm.g:2452:2: rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__FieldOptionGroup__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__4"


    // $ANTLR start "rule__FieldOptionGroup__Group__4__Impl"
    // InternalCalculatorForm.g:2459:1: rule__FieldOptionGroup__Group__4__Impl : ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) ;
    public final void rule__FieldOptionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2463:1: ( ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) )
            // InternalCalculatorForm.g:2464:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:2464:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            // InternalCalculatorForm.g:2465:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getOptionsAssignment_4()); 
            }
            // InternalCalculatorForm.g:2466:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==21) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCalculatorForm.g:2466:3: rule__FieldOptionGroup__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FieldOptionGroup__OptionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getOptionsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__4__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group__5"
    // InternalCalculatorForm.g:2474:1: rule__FieldOptionGroup__Group__5 : rule__FieldOptionGroup__Group__5__Impl ;
    public final void rule__FieldOptionGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2478:1: ( rule__FieldOptionGroup__Group__5__Impl )
            // InternalCalculatorForm.g:2479:2: rule__FieldOptionGroup__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__5"


    // $ANTLR start "rule__FieldOptionGroup__Group__5__Impl"
    // InternalCalculatorForm.g:2485:1: rule__FieldOptionGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldOptionGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2489:1: ( ( '}' ) )
            // InternalCalculatorForm.g:2490:1: ( '}' )
            {
            // InternalCalculatorForm.g:2490:1: ( '}' )
            // InternalCalculatorForm.g:2491:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group__5__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group_2__0"
    // InternalCalculatorForm.g:2501:1: rule__FieldOptionGroup__Group_2__0 : rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 ;
    public final void rule__FieldOptionGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2505:1: ( rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 )
            // InternalCalculatorForm.g:2506:2: rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldOptionGroup__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group_2__0"


    // $ANTLR start "rule__FieldOptionGroup__Group_2__0__Impl"
    // InternalCalculatorForm.g:2513:1: rule__FieldOptionGroup__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__FieldOptionGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2517:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2518:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2518:1: ( 'label' )
            // InternalCalculatorForm.g:2519:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group_2__0__Impl"


    // $ANTLR start "rule__FieldOptionGroup__Group_2__1"
    // InternalCalculatorForm.g:2528:1: rule__FieldOptionGroup__Group_2__1 : rule__FieldOptionGroup__Group_2__1__Impl ;
    public final void rule__FieldOptionGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2532:1: ( rule__FieldOptionGroup__Group_2__1__Impl )
            // InternalCalculatorForm.g:2533:2: rule__FieldOptionGroup__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group_2__1"


    // $ANTLR start "rule__FieldOptionGroup__Group_2__1__Impl"
    // InternalCalculatorForm.g:2539:1: rule__FieldOptionGroup__Group_2__1__Impl : ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) ;
    public final void rule__FieldOptionGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2543:1: ( ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:2544:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:2544:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:2545:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLabelAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:2546:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:2546:3: rule__FieldOptionGroup__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__LabelAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getLabelAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__Group_2__1__Impl"


    // $ANTLR start "rule__FieldChoice__Group__0"
    // InternalCalculatorForm.g:2555:1: rule__FieldChoice__Group__0 : rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 ;
    public final void rule__FieldChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2559:1: ( rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 )
            // InternalCalculatorForm.g:2560:2: rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FieldChoice__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__0"


    // $ANTLR start "rule__FieldChoice__Group__0__Impl"
    // InternalCalculatorForm.g:2567:1: rule__FieldChoice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__FieldChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2571:1: ( ( 'choice' ) )
            // InternalCalculatorForm.g:2572:1: ( 'choice' )
            {
            // InternalCalculatorForm.g:2572:1: ( 'choice' )
            // InternalCalculatorForm.g:2573:2: 'choice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__0__Impl"


    // $ANTLR start "rule__FieldChoice__Group__1"
    // InternalCalculatorForm.g:2582:1: rule__FieldChoice__Group__1 : rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 ;
    public final void rule__FieldChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2586:1: ( rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 )
            // InternalCalculatorForm.g:2587:2: rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__1"


    // $ANTLR start "rule__FieldChoice__Group__1__Impl"
    // InternalCalculatorForm.g:2594:1: rule__FieldChoice__Group__1__Impl : ( ( rule__FieldChoice__NameAssignment_1 ) ) ;
    public final void rule__FieldChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2598:1: ( ( ( rule__FieldChoice__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:2599:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2599:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            // InternalCalculatorForm.g:2600:2: ( rule__FieldChoice__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:2601:2: ( rule__FieldChoice__NameAssignment_1 )
            // InternalCalculatorForm.g:2601:3: rule__FieldChoice__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__1__Impl"


    // $ANTLR start "rule__FieldChoice__Group__2"
    // InternalCalculatorForm.g:2609:1: rule__FieldChoice__Group__2 : rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 ;
    public final void rule__FieldChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2613:1: ( rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 )
            // InternalCalculatorForm.g:2614:2: rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__2"


    // $ANTLR start "rule__FieldChoice__Group__2__Impl"
    // InternalCalculatorForm.g:2621:1: rule__FieldChoice__Group__2__Impl : ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2625:1: ( ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:2626:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2626:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:2627:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:2628:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCalculatorForm.g:2628:3: rule__FieldChoice__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__AutofocusAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getAutofocusAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__2__Impl"


    // $ANTLR start "rule__FieldChoice__Group__3"
    // InternalCalculatorForm.g:2636:1: rule__FieldChoice__Group__3 : rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 ;
    public final void rule__FieldChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2640:1: ( rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 )
            // InternalCalculatorForm.g:2641:2: rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__3"


    // $ANTLR start "rule__FieldChoice__Group__3__Impl"
    // InternalCalculatorForm.g:2648:1: rule__FieldChoice__Group__3__Impl : ( ( rule__FieldChoice__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2652:1: ( ( ( rule__FieldChoice__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2653:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2653:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:2654:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedAssignment_3()); 
            }
            // InternalCalculatorForm.g:2655:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCalculatorForm.g:2655:3: rule__FieldChoice__CheckedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__CheckedAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getCheckedAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__3__Impl"


    // $ANTLR start "rule__FieldChoice__Group__4"
    // InternalCalculatorForm.g:2663:1: rule__FieldChoice__Group__4 : rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 ;
    public final void rule__FieldChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2667:1: ( rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 )
            // InternalCalculatorForm.g:2668:2: rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__4"


    // $ANTLR start "rule__FieldChoice__Group__4__Impl"
    // InternalCalculatorForm.g:2675:1: rule__FieldChoice__Group__4__Impl : ( ( rule__FieldChoice__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2679:1: ( ( ( rule__FieldChoice__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:2680:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:2680:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:2681:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:2682:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCalculatorForm.g:2682:3: rule__FieldChoice__DisabledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__DisabledAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getDisabledAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__4__Impl"


    // $ANTLR start "rule__FieldChoice__Group__5"
    // InternalCalculatorForm.g:2690:1: rule__FieldChoice__Group__5 : rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 ;
    public final void rule__FieldChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2694:1: ( rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 )
            // InternalCalculatorForm.g:2695:2: rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__5"


    // $ANTLR start "rule__FieldChoice__Group__5__Impl"
    // InternalCalculatorForm.g:2702:1: rule__FieldChoice__Group__5__Impl : ( ( rule__FieldChoice__Group_5__0 )? ) ;
    public final void rule__FieldChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2706:1: ( ( ( rule__FieldChoice__Group_5__0 )? ) )
            // InternalCalculatorForm.g:2707:1: ( ( rule__FieldChoice__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:2707:1: ( ( rule__FieldChoice__Group_5__0 )? )
            // InternalCalculatorForm.g:2708:2: ( rule__FieldChoice__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:2709:2: ( rule__FieldChoice__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCalculatorForm.g:2709:3: rule__FieldChoice__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__5__Impl"


    // $ANTLR start "rule__FieldChoice__Group__6"
    // InternalCalculatorForm.g:2717:1: rule__FieldChoice__Group__6 : rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 ;
    public final void rule__FieldChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2721:1: ( rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 )
            // InternalCalculatorForm.g:2722:2: rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__6"


    // $ANTLR start "rule__FieldChoice__Group__6__Impl"
    // InternalCalculatorForm.g:2729:1: rule__FieldChoice__Group__6__Impl : ( ( rule__FieldChoice__Group_6__0 )? ) ;
    public final void rule__FieldChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2733:1: ( ( ( rule__FieldChoice__Group_6__0 )? ) )
            // InternalCalculatorForm.g:2734:1: ( ( rule__FieldChoice__Group_6__0 )? )
            {
            // InternalCalculatorForm.g:2734:1: ( ( rule__FieldChoice__Group_6__0 )? )
            // InternalCalculatorForm.g:2735:2: ( rule__FieldChoice__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_6()); 
            }
            // InternalCalculatorForm.g:2736:2: ( rule__FieldChoice__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCalculatorForm.g:2736:3: rule__FieldChoice__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__6__Impl"


    // $ANTLR start "rule__FieldChoice__Group__7"
    // InternalCalculatorForm.g:2744:1: rule__FieldChoice__Group__7 : rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 ;
    public final void rule__FieldChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2748:1: ( rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 )
            // InternalCalculatorForm.g:2749:2: rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__7"


    // $ANTLR start "rule__FieldChoice__Group__7__Impl"
    // InternalCalculatorForm.g:2756:1: rule__FieldChoice__Group__7__Impl : ( ( rule__FieldChoice__MultipleAssignment_7 )? ) ;
    public final void rule__FieldChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2760:1: ( ( ( rule__FieldChoice__MultipleAssignment_7 )? ) )
            // InternalCalculatorForm.g:2761:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            {
            // InternalCalculatorForm.g:2761:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            // InternalCalculatorForm.g:2762:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleAssignment_7()); 
            }
            // InternalCalculatorForm.g:2763:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCalculatorForm.g:2763:3: rule__FieldChoice__MultipleAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__MultipleAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getMultipleAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__7__Impl"


    // $ANTLR start "rule__FieldChoice__Group__8"
    // InternalCalculatorForm.g:2771:1: rule__FieldChoice__Group__8 : rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 ;
    public final void rule__FieldChoice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2775:1: ( rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 )
            // InternalCalculatorForm.g:2776:2: rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__8"


    // $ANTLR start "rule__FieldChoice__Group__8__Impl"
    // InternalCalculatorForm.g:2783:1: rule__FieldChoice__Group__8__Impl : ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) ;
    public final void rule__FieldChoice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2787:1: ( ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) )
            // InternalCalculatorForm.g:2788:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            {
            // InternalCalculatorForm.g:2788:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            // InternalCalculatorForm.g:2789:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedAssignment_8()); 
            }
            // InternalCalculatorForm.g:2790:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCalculatorForm.g:2790:3: rule__FieldChoice__NotdisplayedAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__NotdisplayedAssignment_8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getNotdisplayedAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__8__Impl"


    // $ANTLR start "rule__FieldChoice__Group__9"
    // InternalCalculatorForm.g:2798:1: rule__FieldChoice__Group__9 : rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 ;
    public final void rule__FieldChoice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2802:1: ( rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 )
            // InternalCalculatorForm.g:2803:2: rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__9"


    // $ANTLR start "rule__FieldChoice__Group__9__Impl"
    // InternalCalculatorForm.g:2810:1: rule__FieldChoice__Group__9__Impl : ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) ;
    public final void rule__FieldChoice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2814:1: ( ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) )
            // InternalCalculatorForm.g:2815:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            {
            // InternalCalculatorForm.g:2815:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            // InternalCalculatorForm.g:2816:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyAssignment_9()); 
            }
            // InternalCalculatorForm.g:2817:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==42) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCalculatorForm.g:2817:3: rule__FieldChoice__ReadonlyAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__ReadonlyAssignment_9();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getReadonlyAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__9__Impl"


    // $ANTLR start "rule__FieldChoice__Group__10"
    // InternalCalculatorForm.g:2825:1: rule__FieldChoice__Group__10 : rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 ;
    public final void rule__FieldChoice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2829:1: ( rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 )
            // InternalCalculatorForm.g:2830:2: rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__10"


    // $ANTLR start "rule__FieldChoice__Group__10__Impl"
    // InternalCalculatorForm.g:2837:1: rule__FieldChoice__Group__10__Impl : ( ( rule__FieldChoice__RequiredAssignment_10 )? ) ;
    public final void rule__FieldChoice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2841:1: ( ( ( rule__FieldChoice__RequiredAssignment_10 )? ) )
            // InternalCalculatorForm.g:2842:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            {
            // InternalCalculatorForm.g:2842:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            // InternalCalculatorForm.g:2843:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredAssignment_10()); 
            }
            // InternalCalculatorForm.g:2844:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==43) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCalculatorForm.g:2844:3: rule__FieldChoice__RequiredAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__RequiredAssignment_10();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getRequiredAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__10__Impl"


    // $ANTLR start "rule__FieldChoice__Group__11"
    // InternalCalculatorForm.g:2852:1: rule__FieldChoice__Group__11 : rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 ;
    public final void rule__FieldChoice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2856:1: ( rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 )
            // InternalCalculatorForm.g:2857:2: rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__FieldChoice__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__11"


    // $ANTLR start "rule__FieldChoice__Group__11__Impl"
    // InternalCalculatorForm.g:2864:1: rule__FieldChoice__Group__11__Impl : ( ( rule__FieldChoice__Group_11__0 )? ) ;
    public final void rule__FieldChoice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2868:1: ( ( ( rule__FieldChoice__Group_11__0 )? ) )
            // InternalCalculatorForm.g:2869:1: ( ( rule__FieldChoice__Group_11__0 )? )
            {
            // InternalCalculatorForm.g:2869:1: ( ( rule__FieldChoice__Group_11__0 )? )
            // InternalCalculatorForm.g:2870:2: ( rule__FieldChoice__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_11()); 
            }
            // InternalCalculatorForm.g:2871:2: ( rule__FieldChoice__Group_11__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==18) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCalculatorForm.g:2871:3: rule__FieldChoice__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__11__Impl"


    // $ANTLR start "rule__FieldChoice__Group__12"
    // InternalCalculatorForm.g:2879:1: rule__FieldChoice__Group__12 : rule__FieldChoice__Group__12__Impl ;
    public final void rule__FieldChoice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2883:1: ( rule__FieldChoice__Group__12__Impl )
            // InternalCalculatorForm.g:2884:2: rule__FieldChoice__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__12"


    // $ANTLR start "rule__FieldChoice__Group__12__Impl"
    // InternalCalculatorForm.g:2890:1: rule__FieldChoice__Group__12__Impl : ( ( rule__FieldChoice__Group_12__0 )? ) ;
    public final void rule__FieldChoice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2894:1: ( ( ( rule__FieldChoice__Group_12__0 )? ) )
            // InternalCalculatorForm.g:2895:1: ( ( rule__FieldChoice__Group_12__0 )? )
            {
            // InternalCalculatorForm.g:2895:1: ( ( rule__FieldChoice__Group_12__0 )? )
            // InternalCalculatorForm.g:2896:2: ( rule__FieldChoice__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_12()); 
            }
            // InternalCalculatorForm.g:2897:2: ( rule__FieldChoice__Group_12__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCalculatorForm.g:2897:3: rule__FieldChoice__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_12__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group__12__Impl"


    // $ANTLR start "rule__FieldChoice__Group_5__0"
    // InternalCalculatorForm.g:2906:1: rule__FieldChoice__Group_5__0 : rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 ;
    public final void rule__FieldChoice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2910:1: ( rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 )
            // InternalCalculatorForm.g:2911:2: rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldChoice__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_5__0"


    // $ANTLR start "rule__FieldChoice__Group_5__0__Impl"
    // InternalCalculatorForm.g:2918:1: rule__FieldChoice__Group_5__0__Impl : ( 'form' ) ;
    public final void rule__FieldChoice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2922:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:2923:1: ( 'form' )
            {
            // InternalCalculatorForm.g:2923:1: ( 'form' )
            // InternalCalculatorForm.g:2924:2: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_5__0__Impl"


    // $ANTLR start "rule__FieldChoice__Group_5__1"
    // InternalCalculatorForm.g:2933:1: rule__FieldChoice__Group_5__1 : rule__FieldChoice__Group_5__1__Impl ;
    public final void rule__FieldChoice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2937:1: ( rule__FieldChoice__Group_5__1__Impl )
            // InternalCalculatorForm.g:2938:2: rule__FieldChoice__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_5__1"


    // $ANTLR start "rule__FieldChoice__Group_5__1__Impl"
    // InternalCalculatorForm.g:2944:1: rule__FieldChoice__Group_5__1__Impl : ( ( rule__FieldChoice__FormAssignment_5_1 ) ) ;
    public final void rule__FieldChoice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2948:1: ( ( ( rule__FieldChoice__FormAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2949:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2949:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            // InternalCalculatorForm.g:2950:2: ( rule__FieldChoice__FormAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getFormAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:2951:2: ( rule__FieldChoice__FormAssignment_5_1 )
            // InternalCalculatorForm.g:2951:3: rule__FieldChoice__FormAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__FormAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getFormAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_5__1__Impl"


    // $ANTLR start "rule__FieldChoice__Group_6__0"
    // InternalCalculatorForm.g:2960:1: rule__FieldChoice__Group_6__0 : rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 ;
    public final void rule__FieldChoice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2964:1: ( rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 )
            // InternalCalculatorForm.g:2965:2: rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldChoice__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_6__0"


    // $ANTLR start "rule__FieldChoice__Group_6__0__Impl"
    // InternalCalculatorForm.g:2972:1: rule__FieldChoice__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__FieldChoice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2976:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2977:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2977:1: ( 'label' )
            // InternalCalculatorForm.g:2978:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_6__0__Impl"


    // $ANTLR start "rule__FieldChoice__Group_6__1"
    // InternalCalculatorForm.g:2987:1: rule__FieldChoice__Group_6__1 : rule__FieldChoice__Group_6__1__Impl ;
    public final void rule__FieldChoice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2991:1: ( rule__FieldChoice__Group_6__1__Impl )
            // InternalCalculatorForm.g:2992:2: rule__FieldChoice__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_6__1"


    // $ANTLR start "rule__FieldChoice__Group_6__1__Impl"
    // InternalCalculatorForm.g:2998:1: rule__FieldChoice__Group_6__1__Impl : ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) ;
    public final void rule__FieldChoice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3002:1: ( ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) )
            // InternalCalculatorForm.g:3003:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            {
            // InternalCalculatorForm.g:3003:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            // InternalCalculatorForm.g:3004:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLabelAssignment_6_1()); 
            }
            // InternalCalculatorForm.g:3005:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            // InternalCalculatorForm.g:3005:3: rule__FieldChoice__LabelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__LabelAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getLabelAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_6__1__Impl"


    // $ANTLR start "rule__FieldChoice__Group_11__0"
    // InternalCalculatorForm.g:3014:1: rule__FieldChoice__Group_11__0 : rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 ;
    public final void rule__FieldChoice__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3018:1: ( rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 )
            // InternalCalculatorForm.g:3019:2: rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldChoice__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_11__0"


    // $ANTLR start "rule__FieldChoice__Group_11__0__Impl"
    // InternalCalculatorForm.g:3026:1: rule__FieldChoice__Group_11__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoice__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3030:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3031:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3031:1: ( 'value' )
            // InternalCalculatorForm.g:3032:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_11__0__Impl"


    // $ANTLR start "rule__FieldChoice__Group_11__1"
    // InternalCalculatorForm.g:3041:1: rule__FieldChoice__Group_11__1 : rule__FieldChoice__Group_11__1__Impl ;
    public final void rule__FieldChoice__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3045:1: ( rule__FieldChoice__Group_11__1__Impl )
            // InternalCalculatorForm.g:3046:2: rule__FieldChoice__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_11__1"


    // $ANTLR start "rule__FieldChoice__Group_11__1__Impl"
    // InternalCalculatorForm.g:3052:1: rule__FieldChoice__Group_11__1__Impl : ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) ;
    public final void rule__FieldChoice__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3056:1: ( ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) )
            // InternalCalculatorForm.g:3057:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            {
            // InternalCalculatorForm.g:3057:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            // InternalCalculatorForm.g:3058:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getValueAssignment_11_1()); 
            }
            // InternalCalculatorForm.g:3059:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            // InternalCalculatorForm.g:3059:3: rule__FieldChoice__ValueAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__ValueAssignment_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getValueAssignment_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_11__1__Impl"


    // $ANTLR start "rule__FieldChoice__Group_12__0"
    // InternalCalculatorForm.g:3068:1: rule__FieldChoice__Group_12__0 : rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 ;
    public final void rule__FieldChoice__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3072:1: ( rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 )
            // InternalCalculatorForm.g:3073:2: rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1
            {
            pushFollow(FOLLOW_17);
            rule__FieldChoice__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_12__0"


    // $ANTLR start "rule__FieldChoice__Group_12__0__Impl"
    // InternalCalculatorForm.g:3080:1: rule__FieldChoice__Group_12__0__Impl : ( '{' ) ;
    public final void rule__FieldChoice__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3084:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3085:1: ( '{' )
            {
            // InternalCalculatorForm.g:3085:1: ( '{' )
            // InternalCalculatorForm.g:3086:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_12__0__Impl"


    // $ANTLR start "rule__FieldChoice__Group_12__1"
    // InternalCalculatorForm.g:3095:1: rule__FieldChoice__Group_12__1 : rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 ;
    public final void rule__FieldChoice__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3099:1: ( rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 )
            // InternalCalculatorForm.g:3100:2: rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2
            {
            pushFollow(FOLLOW_17);
            rule__FieldChoice__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_12__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_12__1"


    // $ANTLR start "rule__FieldChoice__Group_12__1__Impl"
    // InternalCalculatorForm.g:3107:1: rule__FieldChoice__Group_12__1__Impl : ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) ;
    public final void rule__FieldChoice__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3111:1: ( ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) )
            // InternalCalculatorForm.g:3112:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            {
            // InternalCalculatorForm.g:3112:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            // InternalCalculatorForm.g:3113:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getOptionsAssignment_12_1()); 
            }
            // InternalCalculatorForm.g:3114:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==21) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCalculatorForm.g:3114:3: rule__FieldChoice__OptionsAssignment_12_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FieldChoice__OptionsAssignment_12_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getOptionsAssignment_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_12__1__Impl"


    // $ANTLR start "rule__FieldChoice__Group_12__2"
    // InternalCalculatorForm.g:3122:1: rule__FieldChoice__Group_12__2 : rule__FieldChoice__Group_12__2__Impl ;
    public final void rule__FieldChoice__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3126:1: ( rule__FieldChoice__Group_12__2__Impl )
            // InternalCalculatorForm.g:3127:2: rule__FieldChoice__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_12__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_12__2"


    // $ANTLR start "rule__FieldChoice__Group_12__2__Impl"
    // InternalCalculatorForm.g:3133:1: rule__FieldChoice__Group_12__2__Impl : ( '}' ) ;
    public final void rule__FieldChoice__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3137:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3138:1: ( '}' )
            {
            // InternalCalculatorForm.g:3138:1: ( '}' )
            // InternalCalculatorForm.g:3139:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__Group_12__2__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__0"
    // InternalCalculatorForm.g:3149:1: rule__FieldChoiceOption__Group__0 : rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 ;
    public final void rule__FieldChoiceOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3153:1: ( rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 )
            // InternalCalculatorForm.g:3154:2: rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldChoiceOption__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__0"


    // $ANTLR start "rule__FieldChoiceOption__Group__0__Impl"
    // InternalCalculatorForm.g:3161:1: rule__FieldChoiceOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldChoiceOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3165:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:3166:1: ( 'option' )
            {
            // InternalCalculatorForm.g:3166:1: ( 'option' )
            // InternalCalculatorForm.g:3167:2: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__0__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__1"
    // InternalCalculatorForm.g:3176:1: rule__FieldChoiceOption__Group__1 : rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 ;
    public final void rule__FieldChoiceOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3180:1: ( rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 )
            // InternalCalculatorForm.g:3181:2: rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__FieldChoiceOption__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__1"


    // $ANTLR start "rule__FieldChoiceOption__Group__1__Impl"
    // InternalCalculatorForm.g:3188:1: rule__FieldChoiceOption__Group__1__Impl : ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) ;
    public final void rule__FieldChoiceOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3192:1: ( ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) )
            // InternalCalculatorForm.g:3193:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3193:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            // InternalCalculatorForm.g:3194:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getLabelAssignment_1()); 
            }
            // InternalCalculatorForm.g:3195:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            // InternalCalculatorForm.g:3195:3: rule__FieldChoiceOption__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__LabelAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getLabelAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__1__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__2"
    // InternalCalculatorForm.g:3203:1: rule__FieldChoiceOption__Group__2 : rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 ;
    public final void rule__FieldChoiceOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3207:1: ( rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 )
            // InternalCalculatorForm.g:3208:2: rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__FieldChoiceOption__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__2"


    // $ANTLR start "rule__FieldChoiceOption__Group__2__Impl"
    // InternalCalculatorForm.g:3215:1: rule__FieldChoiceOption__Group__2__Impl : ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoiceOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3219:1: ( ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:3220:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:3220:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:3221:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:3222:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==39) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCalculatorForm.g:3222:3: rule__FieldChoiceOption__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__AutofocusAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__2__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__3"
    // InternalCalculatorForm.g:3230:1: rule__FieldChoiceOption__Group__3 : rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 ;
    public final void rule__FieldChoiceOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3234:1: ( rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 )
            // InternalCalculatorForm.g:3235:2: rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__FieldChoiceOption__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__3"


    // $ANTLR start "rule__FieldChoiceOption__Group__3__Impl"
    // InternalCalculatorForm.g:3242:1: rule__FieldChoiceOption__Group__3__Impl : ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoiceOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3246:1: ( ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:3247:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:3247:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:3248:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedAssignment_3()); 
            }
            // InternalCalculatorForm.g:3249:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCalculatorForm.g:3249:3: rule__FieldChoiceOption__CheckedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__CheckedAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getCheckedAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__3__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__4"
    // InternalCalculatorForm.g:3257:1: rule__FieldChoiceOption__Group__4 : rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 ;
    public final void rule__FieldChoiceOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3261:1: ( rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 )
            // InternalCalculatorForm.g:3262:2: rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__FieldChoiceOption__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__4"


    // $ANTLR start "rule__FieldChoiceOption__Group__4__Impl"
    // InternalCalculatorForm.g:3269:1: rule__FieldChoiceOption__Group__4__Impl : ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoiceOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3273:1: ( ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:3274:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:3274:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:3275:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:3276:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==40) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCalculatorForm.g:3276:3: rule__FieldChoiceOption__DisabledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__DisabledAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getDisabledAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__4__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__5"
    // InternalCalculatorForm.g:3284:1: rule__FieldChoiceOption__Group__5 : rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 ;
    public final void rule__FieldChoiceOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3288:1: ( rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 )
            // InternalCalculatorForm.g:3289:2: rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__FieldChoiceOption__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__5"


    // $ANTLR start "rule__FieldChoiceOption__Group__5__Impl"
    // InternalCalculatorForm.g:3296:1: rule__FieldChoiceOption__Group__5__Impl : ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) ;
    public final void rule__FieldChoiceOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3300:1: ( ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) )
            // InternalCalculatorForm.g:3301:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            {
            // InternalCalculatorForm.g:3301:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            // InternalCalculatorForm.g:3302:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyAssignment_5()); 
            }
            // InternalCalculatorForm.g:3303:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCalculatorForm.g:3303:3: rule__FieldChoiceOption__ReadonlyAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__ReadonlyAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getReadonlyAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__5__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__6"
    // InternalCalculatorForm.g:3311:1: rule__FieldChoiceOption__Group__6 : rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 ;
    public final void rule__FieldChoiceOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3315:1: ( rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 )
            // InternalCalculatorForm.g:3316:2: rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__FieldChoiceOption__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__6"


    // $ANTLR start "rule__FieldChoiceOption__Group__6__Impl"
    // InternalCalculatorForm.g:3323:1: rule__FieldChoiceOption__Group__6__Impl : ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) ;
    public final void rule__FieldChoiceOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3327:1: ( ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) )
            // InternalCalculatorForm.g:3328:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            {
            // InternalCalculatorForm.g:3328:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            // InternalCalculatorForm.g:3329:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredAssignment_6()); 
            }
            // InternalCalculatorForm.g:3330:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCalculatorForm.g:3330:3: rule__FieldChoiceOption__RequiredAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__RequiredAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getRequiredAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__6__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group__7"
    // InternalCalculatorForm.g:3338:1: rule__FieldChoiceOption__Group__7 : rule__FieldChoiceOption__Group__7__Impl ;
    public final void rule__FieldChoiceOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3342:1: ( rule__FieldChoiceOption__Group__7__Impl )
            // InternalCalculatorForm.g:3343:2: rule__FieldChoiceOption__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__7"


    // $ANTLR start "rule__FieldChoiceOption__Group__7__Impl"
    // InternalCalculatorForm.g:3349:1: rule__FieldChoiceOption__Group__7__Impl : ( ( rule__FieldChoiceOption__Group_7__0 )? ) ;
    public final void rule__FieldChoiceOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3353:1: ( ( ( rule__FieldChoiceOption__Group_7__0 )? ) )
            // InternalCalculatorForm.g:3354:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            {
            // InternalCalculatorForm.g:3354:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            // InternalCalculatorForm.g:3355:2: ( rule__FieldChoiceOption__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getGroup_7()); 
            }
            // InternalCalculatorForm.g:3356:2: ( rule__FieldChoiceOption__Group_7__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCalculatorForm.g:3356:3: rule__FieldChoiceOption__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group__7__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group_7__0"
    // InternalCalculatorForm.g:3365:1: rule__FieldChoiceOption__Group_7__0 : rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 ;
    public final void rule__FieldChoiceOption__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3369:1: ( rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 )
            // InternalCalculatorForm.g:3370:2: rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldChoiceOption__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group_7__0"


    // $ANTLR start "rule__FieldChoiceOption__Group_7__0__Impl"
    // InternalCalculatorForm.g:3377:1: rule__FieldChoiceOption__Group_7__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoiceOption__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3381:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3382:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3382:1: ( 'value' )
            // InternalCalculatorForm.g:3383:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group_7__0__Impl"


    // $ANTLR start "rule__FieldChoiceOption__Group_7__1"
    // InternalCalculatorForm.g:3392:1: rule__FieldChoiceOption__Group_7__1 : rule__FieldChoiceOption__Group_7__1__Impl ;
    public final void rule__FieldChoiceOption__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3396:1: ( rule__FieldChoiceOption__Group_7__1__Impl )
            // InternalCalculatorForm.g:3397:2: rule__FieldChoiceOption__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group_7__1"


    // $ANTLR start "rule__FieldChoiceOption__Group_7__1__Impl"
    // InternalCalculatorForm.g:3403:1: rule__FieldChoiceOption__Group_7__1__Impl : ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) ;
    public final void rule__FieldChoiceOption__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3407:1: ( ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) )
            // InternalCalculatorForm.g:3408:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            {
            // InternalCalculatorForm.g:3408:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            // InternalCalculatorForm.g:3409:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getValueAssignment_7_1()); 
            }
            // InternalCalculatorForm.g:3410:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            // InternalCalculatorForm.g:3410:3: rule__FieldChoiceOption__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__ValueAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getValueAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__Group_7__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // InternalCalculatorForm.g:3419:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3423:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalCalculatorForm.g:3424:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // InternalCalculatorForm.g:3431:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3435:1: ( ( 'group' ) )
            // InternalCalculatorForm.g:3436:1: ( 'group' )
            {
            // InternalCalculatorForm.g:3436:1: ( 'group' )
            // InternalCalculatorForm.g:3437:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // InternalCalculatorForm.g:3446:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3450:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalCalculatorForm.g:3451:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Group__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // InternalCalculatorForm.g:3458:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3462:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:3463:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3463:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalCalculatorForm.g:3464:2: ( rule__Group__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:3465:2: ( rule__Group__NameAssignment_1 )
            // InternalCalculatorForm.g:3465:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // InternalCalculatorForm.g:3473:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3477:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalCalculatorForm.g:3478:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Group__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // InternalCalculatorForm.g:3485:1: rule__Group__Group__2__Impl : ( ( rule__Group__Group_2__0 )? ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3489:1: ( ( ( rule__Group__Group_2__0 )? ) )
            // InternalCalculatorForm.g:3490:1: ( ( rule__Group__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:3490:1: ( ( rule__Group__Group_2__0 )? )
            // InternalCalculatorForm.g:3491:2: ( rule__Group__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup_2()); 
            }
            // InternalCalculatorForm.g:3492:2: ( rule__Group__Group_2__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==17) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCalculatorForm.g:3492:3: rule__Group__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // InternalCalculatorForm.g:3500:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3504:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalCalculatorForm.g:3505:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Group__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // InternalCalculatorForm.g:3512:1: rule__Group__Group__3__Impl : ( '{' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3516:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3517:1: ( '{' )
            {
            // InternalCalculatorForm.g:3517:1: ( '{' )
            // InternalCalculatorForm.g:3518:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // InternalCalculatorForm.g:3527:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3531:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalCalculatorForm.g:3532:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Group__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // InternalCalculatorForm.g:3539:1: rule__Group__Group__4__Impl : ( ( rule__Group__FieldsAssignment_4 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3543:1: ( ( ( rule__Group__FieldsAssignment_4 )* ) )
            // InternalCalculatorForm.g:3544:1: ( ( rule__Group__FieldsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:3544:1: ( ( rule__Group__FieldsAssignment_4 )* )
            // InternalCalculatorForm.g:3545:2: ( rule__Group__FieldsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getFieldsAssignment_4()); 
            }
            // InternalCalculatorForm.g:3546:2: ( rule__Group__FieldsAssignment_4 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==16||LA57_0==19||LA57_0==24||LA57_0==27) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalCalculatorForm.g:3546:3: rule__Group__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Group__FieldsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getFieldsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // InternalCalculatorForm.g:3554:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3558:1: ( rule__Group__Group__5__Impl )
            // InternalCalculatorForm.g:3559:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // InternalCalculatorForm.g:3565:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3569:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3570:1: ( '}' )
            {
            // InternalCalculatorForm.g:3570:1: ( '}' )
            // InternalCalculatorForm.g:3571:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_2__0"
    // InternalCalculatorForm.g:3581:1: rule__Group__Group_2__0 : rule__Group__Group_2__0__Impl rule__Group__Group_2__1 ;
    public final void rule__Group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3585:1: ( rule__Group__Group_2__0__Impl rule__Group__Group_2__1 )
            // InternalCalculatorForm.g:3586:2: rule__Group__Group_2__0__Impl rule__Group__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Group__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Group__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__0"


    // $ANTLR start "rule__Group__Group_2__0__Impl"
    // InternalCalculatorForm.g:3593:1: rule__Group__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__Group__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3597:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:3598:1: ( 'label' )
            {
            // InternalCalculatorForm.g:3598:1: ( 'label' )
            // InternalCalculatorForm.g:3599:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLabelKeyword_2_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getLabelKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__0__Impl"


    // $ANTLR start "rule__Group__Group_2__1"
    // InternalCalculatorForm.g:3608:1: rule__Group__Group_2__1 : rule__Group__Group_2__1__Impl ;
    public final void rule__Group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3612:1: ( rule__Group__Group_2__1__Impl )
            // InternalCalculatorForm.g:3613:2: rule__Group__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__1"


    // $ANTLR start "rule__Group__Group_2__1__Impl"
    // InternalCalculatorForm.g:3619:1: rule__Group__Group_2__1__Impl : ( ( rule__Group__LabelAssignment_2_1 ) ) ;
    public final void rule__Group__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3623:1: ( ( ( rule__Group__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:3624:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:3624:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:3625:2: ( rule__Group__LabelAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLabelAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:3626:2: ( rule__Group__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:3626:3: rule__Group__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__LabelAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getLabelAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_2__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // InternalCalculatorForm.g:3635:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3639:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalCalculatorForm.g:3640:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalCalculatorForm.g:3647:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3651:1: ( ( 'page' ) )
            // InternalCalculatorForm.g:3652:1: ( 'page' )
            {
            // InternalCalculatorForm.g:3652:1: ( 'page' )
            // InternalCalculatorForm.g:3653:2: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalCalculatorForm.g:3662:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3666:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalCalculatorForm.g:3667:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalCalculatorForm.g:3674:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3678:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3679:1: ( '{' )
            {
            // InternalCalculatorForm.g:3679:1: ( '{' )
            // InternalCalculatorForm.g:3680:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalCalculatorForm.g:3689:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3693:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalCalculatorForm.g:3694:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalCalculatorForm.g:3701:1: rule__Page__Group__2__Impl : ( ( rule__Page__ChildsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3705:1: ( ( ( rule__Page__ChildsAssignment_2 )* ) )
            // InternalCalculatorForm.g:3706:1: ( ( rule__Page__ChildsAssignment_2 )* )
            {
            // InternalCalculatorForm.g:3706:1: ( ( rule__Page__ChildsAssignment_2 )* )
            // InternalCalculatorForm.g:3707:2: ( rule__Page__ChildsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getChildsAssignment_2()); 
            }
            // InternalCalculatorForm.g:3708:2: ( rule__Page__ChildsAssignment_2 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==16||LA58_0==19||(LA58_0>=24 && LA58_0<=25)||LA58_0==27) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCalculatorForm.g:3708:3: rule__Page__ChildsAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Page__ChildsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getChildsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // InternalCalculatorForm.g:3716:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3720:1: ( rule__Page__Group__3__Impl )
            // InternalCalculatorForm.g:3721:2: rule__Page__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // InternalCalculatorForm.g:3727:1: rule__Page__Group__3__Impl : ( '}' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3731:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3732:1: ( '}' )
            {
            // InternalCalculatorForm.g:3732:1: ( '}' )
            // InternalCalculatorForm.g:3733:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group__0"
    // InternalCalculatorForm.g:3743:1: rule__ButtonSubmit__Group__0 : rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 ;
    public final void rule__ButtonSubmit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3747:1: ( rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 )
            // InternalCalculatorForm.g:3748:2: rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ButtonSubmit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__0"


    // $ANTLR start "rule__ButtonSubmit__Group__0__Impl"
    // InternalCalculatorForm.g:3755:1: rule__ButtonSubmit__Group__0__Impl : ( 'submit-button' ) ;
    public final void rule__ButtonSubmit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3759:1: ( ( 'submit-button' ) )
            // InternalCalculatorForm.g:3760:1: ( 'submit-button' )
            {
            // InternalCalculatorForm.g:3760:1: ( 'submit-button' )
            // InternalCalculatorForm.g:3761:2: 'submit-button'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__0__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group__1"
    // InternalCalculatorForm.g:3770:1: rule__ButtonSubmit__Group__1 : rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 ;
    public final void rule__ButtonSubmit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3774:1: ( rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 )
            // InternalCalculatorForm.g:3775:2: rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ButtonSubmit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__1"


    // $ANTLR start "rule__ButtonSubmit__Group__1__Impl"
    // InternalCalculatorForm.g:3782:1: rule__ButtonSubmit__Group__1__Impl : ( ( rule__ButtonSubmit__NameAssignment_1 ) ) ;
    public final void rule__ButtonSubmit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3786:1: ( ( ( rule__ButtonSubmit__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:3787:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3787:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            // InternalCalculatorForm.g:3788:2: ( rule__ButtonSubmit__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:3789:2: ( rule__ButtonSubmit__NameAssignment_1 )
            // InternalCalculatorForm.g:3789:3: rule__ButtonSubmit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__1__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group__2"
    // InternalCalculatorForm.g:3797:1: rule__ButtonSubmit__Group__2 : rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 ;
    public final void rule__ButtonSubmit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3801:1: ( rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 )
            // InternalCalculatorForm.g:3802:2: rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__ButtonSubmit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__2"


    // $ANTLR start "rule__ButtonSubmit__Group__2__Impl"
    // InternalCalculatorForm.g:3809:1: rule__ButtonSubmit__Group__2__Impl : ( ( rule__ButtonSubmit__TextAssignment_2 ) ) ;
    public final void rule__ButtonSubmit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3813:1: ( ( ( rule__ButtonSubmit__TextAssignment_2 ) ) )
            // InternalCalculatorForm.g:3814:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            {
            // InternalCalculatorForm.g:3814:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            // InternalCalculatorForm.g:3815:2: ( rule__ButtonSubmit__TextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getTextAssignment_2()); 
            }
            // InternalCalculatorForm.g:3816:2: ( rule__ButtonSubmit__TextAssignment_2 )
            // InternalCalculatorForm.g:3816:3: rule__ButtonSubmit__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__TextAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getTextAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__2__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group__3"
    // InternalCalculatorForm.g:3824:1: rule__ButtonSubmit__Group__3 : rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 ;
    public final void rule__ButtonSubmit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3828:1: ( rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 )
            // InternalCalculatorForm.g:3829:2: rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__ButtonSubmit__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__3"


    // $ANTLR start "rule__ButtonSubmit__Group__3__Impl"
    // InternalCalculatorForm.g:3836:1: rule__ButtonSubmit__Group__3__Impl : ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) ;
    public final void rule__ButtonSubmit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3840:1: ( ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) )
            // InternalCalculatorForm.g:3841:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            {
            // InternalCalculatorForm.g:3841:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            // InternalCalculatorForm.g:3842:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAssignment_3()); 
            }
            // InternalCalculatorForm.g:3843:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCalculatorForm.g:3843:3: rule__ButtonSubmit__AutofocusAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ButtonSubmit__AutofocusAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getAutofocusAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__3__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group__4"
    // InternalCalculatorForm.g:3851:1: rule__ButtonSubmit__Group__4 : rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 ;
    public final void rule__ButtonSubmit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3855:1: ( rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 )
            // InternalCalculatorForm.g:3856:2: rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__ButtonSubmit__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__4"


    // $ANTLR start "rule__ButtonSubmit__Group__4__Impl"
    // InternalCalculatorForm.g:3863:1: rule__ButtonSubmit__Group__4__Impl : ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) ;
    public final void rule__ButtonSubmit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3867:1: ( ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:3868:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:3868:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:3869:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:3870:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCalculatorForm.g:3870:3: rule__ButtonSubmit__DisabledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ButtonSubmit__DisabledAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getDisabledAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__4__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group__5"
    // InternalCalculatorForm.g:3878:1: rule__ButtonSubmit__Group__5 : rule__ButtonSubmit__Group__5__Impl ;
    public final void rule__ButtonSubmit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3882:1: ( rule__ButtonSubmit__Group__5__Impl )
            // InternalCalculatorForm.g:3883:2: rule__ButtonSubmit__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__5"


    // $ANTLR start "rule__ButtonSubmit__Group__5__Impl"
    // InternalCalculatorForm.g:3889:1: rule__ButtonSubmit__Group__5__Impl : ( ( rule__ButtonSubmit__Group_5__0 )? ) ;
    public final void rule__ButtonSubmit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3893:1: ( ( ( rule__ButtonSubmit__Group_5__0 )? ) )
            // InternalCalculatorForm.g:3894:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:3894:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            // InternalCalculatorForm.g:3895:2: ( rule__ButtonSubmit__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:3896:2: ( rule__ButtonSubmit__Group_5__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==18) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCalculatorForm.g:3896:3: rule__ButtonSubmit__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ButtonSubmit__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group__5__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group_5__0"
    // InternalCalculatorForm.g:3905:1: rule__ButtonSubmit__Group_5__0 : rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 ;
    public final void rule__ButtonSubmit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3909:1: ( rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 )
            // InternalCalculatorForm.g:3910:2: rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__ButtonSubmit__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group_5__0"


    // $ANTLR start "rule__ButtonSubmit__Group_5__0__Impl"
    // InternalCalculatorForm.g:3917:1: rule__ButtonSubmit__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__ButtonSubmit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3921:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3922:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3922:1: ( 'value' )
            // InternalCalculatorForm.g:3923:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group_5__0__Impl"


    // $ANTLR start "rule__ButtonSubmit__Group_5__1"
    // InternalCalculatorForm.g:3932:1: rule__ButtonSubmit__Group_5__1 : rule__ButtonSubmit__Group_5__1__Impl ;
    public final void rule__ButtonSubmit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3936:1: ( rule__ButtonSubmit__Group_5__1__Impl )
            // InternalCalculatorForm.g:3937:2: rule__ButtonSubmit__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group_5__1"


    // $ANTLR start "rule__ButtonSubmit__Group_5__1__Impl"
    // InternalCalculatorForm.g:3943:1: rule__ButtonSubmit__Group_5__1__Impl : ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) ;
    public final void rule__ButtonSubmit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3947:1: ( ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:3948:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:3948:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:3949:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getValueAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:3950:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:3950:3: rule__ButtonSubmit__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__ValueAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getValueAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__Group_5__1__Impl"


    // $ANTLR start "rule__Calculate__Group__0"
    // InternalCalculatorForm.g:3959:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3963:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalCalculatorForm.g:3964:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Calculate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__0"


    // $ANTLR start "rule__Calculate__Group__0__Impl"
    // InternalCalculatorForm.g:3971:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3975:1: ( ( 'calculate' ) )
            // InternalCalculatorForm.g:3976:1: ( 'calculate' )
            {
            // InternalCalculatorForm.g:3976:1: ( 'calculate' )
            // InternalCalculatorForm.g:3977:2: 'calculate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__0__Impl"


    // $ANTLR start "rule__Calculate__Group__1"
    // InternalCalculatorForm.g:3986:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3990:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalCalculatorForm.g:3991:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Calculate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__1"


    // $ANTLR start "rule__Calculate__Group__1__Impl"
    // InternalCalculatorForm.g:3998:1: rule__Calculate__Group__1__Impl : ( ( rule__Calculate__OutputAssignment_1 ) ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4002:1: ( ( ( rule__Calculate__OutputAssignment_1 ) ) )
            // InternalCalculatorForm.g:4003:1: ( ( rule__Calculate__OutputAssignment_1 ) )
            {
            // InternalCalculatorForm.g:4003:1: ( ( rule__Calculate__OutputAssignment_1 ) )
            // InternalCalculatorForm.g:4004:2: ( rule__Calculate__OutputAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getOutputAssignment_1()); 
            }
            // InternalCalculatorForm.g:4005:2: ( rule__Calculate__OutputAssignment_1 )
            // InternalCalculatorForm.g:4005:3: rule__Calculate__OutputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__OutputAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getOutputAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__1__Impl"


    // $ANTLR start "rule__Calculate__Group__2"
    // InternalCalculatorForm.g:4013:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4017:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalCalculatorForm.g:4018:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Calculate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__2"


    // $ANTLR start "rule__Calculate__Group__2__Impl"
    // InternalCalculatorForm.g:4025:1: rule__Calculate__Group__2__Impl : ( '=' ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4029:1: ( ( '=' ) )
            // InternalCalculatorForm.g:4030:1: ( '=' )
            {
            // InternalCalculatorForm.g:4030:1: ( '=' )
            // InternalCalculatorForm.g:4031:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getEqualsSignKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__2__Impl"


    // $ANTLR start "rule__Calculate__Group__3"
    // InternalCalculatorForm.g:4040:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4044:1: ( rule__Calculate__Group__3__Impl )
            // InternalCalculatorForm.g:4045:2: rule__Calculate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__3"


    // $ANTLR start "rule__Calculate__Group__3__Impl"
    // InternalCalculatorForm.g:4051:1: rule__Calculate__Group__3__Impl : ( ( rule__Calculate__ExpressionAssignment_3 ) ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4055:1: ( ( ( rule__Calculate__ExpressionAssignment_3 ) ) )
            // InternalCalculatorForm.g:4056:1: ( ( rule__Calculate__ExpressionAssignment_3 ) )
            {
            // InternalCalculatorForm.g:4056:1: ( ( rule__Calculate__ExpressionAssignment_3 ) )
            // InternalCalculatorForm.g:4057:2: ( rule__Calculate__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getExpressionAssignment_3()); 
            }
            // InternalCalculatorForm.g:4058:2: ( rule__Calculate__ExpressionAssignment_3 )
            // InternalCalculatorForm.g:4058:3: rule__Calculate__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__ExpressionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getExpressionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__3__Impl"


    // $ANTLR start "rule__ResultOutput__Group_1__0"
    // InternalCalculatorForm.g:4067:1: rule__ResultOutput__Group_1__0 : rule__ResultOutput__Group_1__0__Impl rule__ResultOutput__Group_1__1 ;
    public final void rule__ResultOutput__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4071:1: ( rule__ResultOutput__Group_1__0__Impl rule__ResultOutput__Group_1__1 )
            // InternalCalculatorForm.g:4072:2: rule__ResultOutput__Group_1__0__Impl rule__ResultOutput__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ResultOutput__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ResultOutput__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__Group_1__0"


    // $ANTLR start "rule__ResultOutput__Group_1__0__Impl"
    // InternalCalculatorForm.g:4079:1: rule__ResultOutput__Group_1__0__Impl : ( () ) ;
    public final void rule__ResultOutput__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4083:1: ( ( () ) )
            // InternalCalculatorForm.g:4084:1: ( () )
            {
            // InternalCalculatorForm.g:4084:1: ( () )
            // InternalCalculatorForm.g:4085:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultOutputAccess().getOutputFieldAction_1_0()); 
            }
            // InternalCalculatorForm.g:4086:2: ()
            // InternalCalculatorForm.g:4086:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultOutputAccess().getOutputFieldAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__Group_1__0__Impl"


    // $ANTLR start "rule__ResultOutput__Group_1__1"
    // InternalCalculatorForm.g:4094:1: rule__ResultOutput__Group_1__1 : rule__ResultOutput__Group_1__1__Impl rule__ResultOutput__Group_1__2 ;
    public final void rule__ResultOutput__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4098:1: ( rule__ResultOutput__Group_1__1__Impl rule__ResultOutput__Group_1__2 )
            // InternalCalculatorForm.g:4099:2: rule__ResultOutput__Group_1__1__Impl rule__ResultOutput__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__ResultOutput__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ResultOutput__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__Group_1__1"


    // $ANTLR start "rule__ResultOutput__Group_1__1__Impl"
    // InternalCalculatorForm.g:4106:1: rule__ResultOutput__Group_1__1__Impl : ( 'field' ) ;
    public final void rule__ResultOutput__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4110:1: ( ( 'field' ) )
            // InternalCalculatorForm.g:4111:1: ( 'field' )
            {
            // InternalCalculatorForm.g:4111:1: ( 'field' )
            // InternalCalculatorForm.g:4112:2: 'field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultOutputAccess().getFieldKeyword_1_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultOutputAccess().getFieldKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__Group_1__1__Impl"


    // $ANTLR start "rule__ResultOutput__Group_1__2"
    // InternalCalculatorForm.g:4121:1: rule__ResultOutput__Group_1__2 : rule__ResultOutput__Group_1__2__Impl ;
    public final void rule__ResultOutput__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4125:1: ( rule__ResultOutput__Group_1__2__Impl )
            // InternalCalculatorForm.g:4126:2: rule__ResultOutput__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResultOutput__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__Group_1__2"


    // $ANTLR start "rule__ResultOutput__Group_1__2__Impl"
    // InternalCalculatorForm.g:4132:1: rule__ResultOutput__Group_1__2__Impl : ( ( rule__ResultOutput__FieldAssignment_1_2 ) ) ;
    public final void rule__ResultOutput__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4136:1: ( ( ( rule__ResultOutput__FieldAssignment_1_2 ) ) )
            // InternalCalculatorForm.g:4137:1: ( ( rule__ResultOutput__FieldAssignment_1_2 ) )
            {
            // InternalCalculatorForm.g:4137:1: ( ( rule__ResultOutput__FieldAssignment_1_2 ) )
            // InternalCalculatorForm.g:4138:2: ( rule__ResultOutput__FieldAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultOutputAccess().getFieldAssignment_1_2()); 
            }
            // InternalCalculatorForm.g:4139:2: ( rule__ResultOutput__FieldAssignment_1_2 )
            // InternalCalculatorForm.g:4139:3: rule__ResultOutput__FieldAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ResultOutput__FieldAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultOutputAccess().getFieldAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__Group_1__2__Impl"


    // $ANTLR start "rule__CalculateVariable__Group__0"
    // InternalCalculatorForm.g:4148:1: rule__CalculateVariable__Group__0 : rule__CalculateVariable__Group__0__Impl rule__CalculateVariable__Group__1 ;
    public final void rule__CalculateVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4152:1: ( rule__CalculateVariable__Group__0__Impl rule__CalculateVariable__Group__1 )
            // InternalCalculatorForm.g:4153:2: rule__CalculateVariable__Group__0__Impl rule__CalculateVariable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CalculateVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CalculateVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateVariable__Group__0"


    // $ANTLR start "rule__CalculateVariable__Group__0__Impl"
    // InternalCalculatorForm.g:4160:1: rule__CalculateVariable__Group__0__Impl : ( 'var' ) ;
    public final void rule__CalculateVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4164:1: ( ( 'var' ) )
            // InternalCalculatorForm.g:4165:1: ( 'var' )
            {
            // InternalCalculatorForm.g:4165:1: ( 'var' )
            // InternalCalculatorForm.g:4166:2: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateVariableAccess().getVarKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateVariableAccess().getVarKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateVariable__Group__0__Impl"


    // $ANTLR start "rule__CalculateVariable__Group__1"
    // InternalCalculatorForm.g:4175:1: rule__CalculateVariable__Group__1 : rule__CalculateVariable__Group__1__Impl ;
    public final void rule__CalculateVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4179:1: ( rule__CalculateVariable__Group__1__Impl )
            // InternalCalculatorForm.g:4180:2: rule__CalculateVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalculateVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateVariable__Group__1"


    // $ANTLR start "rule__CalculateVariable__Group__1__Impl"
    // InternalCalculatorForm.g:4186:1: rule__CalculateVariable__Group__1__Impl : ( ( rule__CalculateVariable__NameAssignment_1 ) ) ;
    public final void rule__CalculateVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4190:1: ( ( ( rule__CalculateVariable__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:4191:1: ( ( rule__CalculateVariable__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:4191:1: ( ( rule__CalculateVariable__NameAssignment_1 ) )
            // InternalCalculatorForm.g:4192:2: ( rule__CalculateVariable__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateVariableAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:4193:2: ( rule__CalculateVariable__NameAssignment_1 )
            // InternalCalculatorForm.g:4193:3: rule__CalculateVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CalculateVariable__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateVariableAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateVariable__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCalculatorForm.g:4202:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4206:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCalculatorForm.g:4207:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalCalculatorForm.g:4214:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4218:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4219:1: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4219:1: ( RULE_ID )
            // InternalCalculatorForm.g:4220:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalCalculatorForm.g:4229:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4233:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCalculatorForm.g:4234:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalCalculatorForm.g:4240:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4244:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCalculatorForm.g:4245:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:4245:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCalculatorForm.g:4246:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:4247:2: ( rule__QualifiedName__Group_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==31) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCalculatorForm.g:4247:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalCalculatorForm.g:4256:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4260:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCalculatorForm.g:4261:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalCalculatorForm.g:4268:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4272:1: ( ( '.' ) )
            // InternalCalculatorForm.g:4273:1: ( '.' )
            {
            // InternalCalculatorForm.g:4273:1: ( '.' )
            // InternalCalculatorForm.g:4274:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalCalculatorForm.g:4283:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4287:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCalculatorForm.g:4288:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalCalculatorForm.g:4294:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4298:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4299:1: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4299:1: ( RULE_ID )
            // InternalCalculatorForm.g:4300:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalCalculatorForm.g:4310:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4314:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalCalculatorForm.g:4315:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalCalculatorForm.g:4322:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4326:1: ( ( ruleMultiplication ) )
            // InternalCalculatorForm.g:4327:1: ( ruleMultiplication )
            {
            // InternalCalculatorForm.g:4327:1: ( ruleMultiplication )
            // InternalCalculatorForm.g:4328:2: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalCalculatorForm.g:4337:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4341:1: ( rule__Addition__Group__1__Impl )
            // InternalCalculatorForm.g:4342:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalCalculatorForm.g:4348:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4352:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalCalculatorForm.g:4353:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:4353:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalCalculatorForm.g:4354:2: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:4355:2: ( rule__Addition__Group_1__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=32 && LA63_0<=33)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalCalculatorForm.g:4355:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalCalculatorForm.g:4364:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4368:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalCalculatorForm.g:4369:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalCalculatorForm.g:4376:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4380:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalCalculatorForm.g:4381:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalCalculatorForm.g:4381:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalCalculatorForm.g:4382:2: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // InternalCalculatorForm.g:4383:2: ( rule__Addition__Alternatives_1_0 )
            // InternalCalculatorForm.g:4383:3: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalCalculatorForm.g:4391:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4395:1: ( rule__Addition__Group_1__1__Impl )
            // InternalCalculatorForm.g:4396:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalCalculatorForm.g:4402:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4406:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:4407:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:4407:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalCalculatorForm.g:4408:2: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:4409:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalCalculatorForm.g:4409:3: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // InternalCalculatorForm.g:4418:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4422:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalCalculatorForm.g:4423:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // InternalCalculatorForm.g:4430:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4434:1: ( ( () ) )
            // InternalCalculatorForm.g:4435:1: ( () )
            {
            // InternalCalculatorForm.g:4435:1: ( () )
            // InternalCalculatorForm.g:4436:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalCalculatorForm.g:4437:2: ()
            // InternalCalculatorForm.g:4437:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // InternalCalculatorForm.g:4445:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4449:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalCalculatorForm.g:4450:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // InternalCalculatorForm.g:4456:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4460:1: ( ( '+' ) )
            // InternalCalculatorForm.g:4461:1: ( '+' )
            {
            // InternalCalculatorForm.g:4461:1: ( '+' )
            // InternalCalculatorForm.g:4462:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // InternalCalculatorForm.g:4472:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4476:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalCalculatorForm.g:4477:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // InternalCalculatorForm.g:4484:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4488:1: ( ( () ) )
            // InternalCalculatorForm.g:4489:1: ( () )
            {
            // InternalCalculatorForm.g:4489:1: ( () )
            // InternalCalculatorForm.g:4490:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalCalculatorForm.g:4491:2: ()
            // InternalCalculatorForm.g:4491:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // InternalCalculatorForm.g:4499:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4503:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalCalculatorForm.g:4504:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // InternalCalculatorForm.g:4510:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4514:1: ( ( '-' ) )
            // InternalCalculatorForm.g:4515:1: ( '-' )
            {
            // InternalCalculatorForm.g:4515:1: ( '-' )
            // InternalCalculatorForm.g:4516:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalCalculatorForm.g:4526:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4530:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalCalculatorForm.g:4531:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalCalculatorForm.g:4538:1: rule__Multiplication__Group__0__Impl : ( rulePrefixed ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4542:1: ( ( rulePrefixed ) )
            // InternalCalculatorForm.g:4543:1: ( rulePrefixed )
            {
            // InternalCalculatorForm.g:4543:1: ( rulePrefixed )
            // InternalCalculatorForm.g:4544:2: rulePrefixed
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPrefixedParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalCalculatorForm.g:4553:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4557:1: ( rule__Multiplication__Group__1__Impl )
            // InternalCalculatorForm.g:4558:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalCalculatorForm.g:4564:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4568:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalCalculatorForm.g:4569:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:4569:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalCalculatorForm.g:4570:2: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:4571:2: ( rule__Multiplication__Group_1__0 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=34 && LA64_0<=35)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalCalculatorForm.g:4571:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalCalculatorForm.g:4580:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4584:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalCalculatorForm.g:4585:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalCalculatorForm.g:4592:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4596:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalCalculatorForm.g:4597:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalCalculatorForm.g:4597:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalCalculatorForm.g:4598:2: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // InternalCalculatorForm.g:4599:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalCalculatorForm.g:4599:3: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalCalculatorForm.g:4607:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4611:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalCalculatorForm.g:4612:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalCalculatorForm.g:4618:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4622:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:4623:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:4623:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalCalculatorForm.g:4624:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:4625:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalCalculatorForm.g:4625:3: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // InternalCalculatorForm.g:4634:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4638:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalCalculatorForm.g:4639:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // InternalCalculatorForm.g:4646:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4650:1: ( ( () ) )
            // InternalCalculatorForm.g:4651:1: ( () )
            {
            // InternalCalculatorForm.g:4651:1: ( () )
            // InternalCalculatorForm.g:4652:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // InternalCalculatorForm.g:4653:2: ()
            // InternalCalculatorForm.g:4653:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // InternalCalculatorForm.g:4661:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4665:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalCalculatorForm.g:4666:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // InternalCalculatorForm.g:4672:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4676:1: ( ( '*' ) )
            // InternalCalculatorForm.g:4677:1: ( '*' )
            {
            // InternalCalculatorForm.g:4677:1: ( '*' )
            // InternalCalculatorForm.g:4678:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // InternalCalculatorForm.g:4688:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4692:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalCalculatorForm.g:4693:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // InternalCalculatorForm.g:4700:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4704:1: ( ( () ) )
            // InternalCalculatorForm.g:4705:1: ( () )
            {
            // InternalCalculatorForm.g:4705:1: ( () )
            // InternalCalculatorForm.g:4706:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // InternalCalculatorForm.g:4707:2: ()
            // InternalCalculatorForm.g:4707:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // InternalCalculatorForm.g:4715:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4719:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalCalculatorForm.g:4720:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // InternalCalculatorForm.g:4726:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4730:1: ( ( '/' ) )
            // InternalCalculatorForm.g:4731:1: ( '/' )
            {
            // InternalCalculatorForm.g:4731:1: ( '/' )
            // InternalCalculatorForm.g:4732:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__0"
    // InternalCalculatorForm.g:4742:1: rule__UnaryOperation__Group_0__0 : rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 ;
    public final void rule__UnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4746:1: ( rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 )
            // InternalCalculatorForm.g:4747:2: rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__UnaryOperation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__0"


    // $ANTLR start "rule__UnaryOperation__Group_0__0__Impl"
    // InternalCalculatorForm.g:4754:1: rule__UnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4758:1: ( ( () ) )
            // InternalCalculatorForm.g:4759:1: ( () )
            {
            // InternalCalculatorForm.g:4759:1: ( () )
            // InternalCalculatorForm.g:4760:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getBooleanNegationAction_0_0()); 
            }
            // InternalCalculatorForm.g:4761:2: ()
            // InternalCalculatorForm.g:4761:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getBooleanNegationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__1"
    // InternalCalculatorForm.g:4769:1: rule__UnaryOperation__Group_0__1 : rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 ;
    public final void rule__UnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4773:1: ( rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 )
            // InternalCalculatorForm.g:4774:2: rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2
            {
            pushFollow(FOLLOW_29);
            rule__UnaryOperation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__1"


    // $ANTLR start "rule__UnaryOperation__Group_0__1__Impl"
    // InternalCalculatorForm.g:4781:1: rule__UnaryOperation__Group_0__1__Impl : ( ( '!' ) ) ;
    public final void rule__UnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4785:1: ( ( ( '!' ) ) )
            // InternalCalculatorForm.g:4786:1: ( ( '!' ) )
            {
            // InternalCalculatorForm.g:4786:1: ( ( '!' ) )
            // InternalCalculatorForm.g:4787:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExclamationMarkKeyword_0_1()); 
            }
            // InternalCalculatorForm.g:4788:2: ( '!' )
            // InternalCalculatorForm.g:4788:3: '!'
            {
            match(input,36,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getExclamationMarkKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_0__2"
    // InternalCalculatorForm.g:4796:1: rule__UnaryOperation__Group_0__2 : rule__UnaryOperation__Group_0__2__Impl ;
    public final void rule__UnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4800:1: ( rule__UnaryOperation__Group_0__2__Impl )
            // InternalCalculatorForm.g:4801:2: rule__UnaryOperation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__2"


    // $ANTLR start "rule__UnaryOperation__Group_0__2__Impl"
    // InternalCalculatorForm.g:4807:1: rule__UnaryOperation__Group_0__2__Impl : ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4811:1: ( ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) ) )
            // InternalCalculatorForm.g:4812:1: ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) )
            {
            // InternalCalculatorForm.g:4812:1: ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) )
            // InternalCalculatorForm.g:4813:2: ( rule__UnaryOperation__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExpressionAssignment_0_2()); 
            }
            // InternalCalculatorForm.g:4814:2: ( rule__UnaryOperation__ExpressionAssignment_0_2 )
            // InternalCalculatorForm.g:4814:3: rule__UnaryOperation__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_0__2__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_1__0"
    // InternalCalculatorForm.g:4823:1: rule__UnaryOperation__Group_1__0 : rule__UnaryOperation__Group_1__0__Impl rule__UnaryOperation__Group_1__1 ;
    public final void rule__UnaryOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4827:1: ( rule__UnaryOperation__Group_1__0__Impl rule__UnaryOperation__Group_1__1 )
            // InternalCalculatorForm.g:4828:2: rule__UnaryOperation__Group_1__0__Impl rule__UnaryOperation__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__UnaryOperation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_1__0"


    // $ANTLR start "rule__UnaryOperation__Group_1__0__Impl"
    // InternalCalculatorForm.g:4835:1: rule__UnaryOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4839:1: ( ( () ) )
            // InternalCalculatorForm.g:4840:1: ( () )
            {
            // InternalCalculatorForm.g:4840:1: ( () )
            // InternalCalculatorForm.g:4841:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getArithmeticSignedAction_1_0()); 
            }
            // InternalCalculatorForm.g:4842:2: ()
            // InternalCalculatorForm.g:4842:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getArithmeticSignedAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_1__1"
    // InternalCalculatorForm.g:4850:1: rule__UnaryOperation__Group_1__1 : rule__UnaryOperation__Group_1__1__Impl rule__UnaryOperation__Group_1__2 ;
    public final void rule__UnaryOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4854:1: ( rule__UnaryOperation__Group_1__1__Impl rule__UnaryOperation__Group_1__2 )
            // InternalCalculatorForm.g:4855:2: rule__UnaryOperation__Group_1__1__Impl rule__UnaryOperation__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__UnaryOperation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_1__1"


    // $ANTLR start "rule__UnaryOperation__Group_1__1__Impl"
    // InternalCalculatorForm.g:4862:1: rule__UnaryOperation__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__UnaryOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4866:1: ( ( ( '-' ) ) )
            // InternalCalculatorForm.g:4867:1: ( ( '-' ) )
            {
            // InternalCalculatorForm.g:4867:1: ( ( '-' ) )
            // InternalCalculatorForm.g:4868:2: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getHyphenMinusKeyword_1_1()); 
            }
            // InternalCalculatorForm.g:4869:2: ( '-' )
            // InternalCalculatorForm.g:4869:3: '-'
            {
            match(input,33,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group_1__2"
    // InternalCalculatorForm.g:4877:1: rule__UnaryOperation__Group_1__2 : rule__UnaryOperation__Group_1__2__Impl ;
    public final void rule__UnaryOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4881:1: ( rule__UnaryOperation__Group_1__2__Impl )
            // InternalCalculatorForm.g:4882:2: rule__UnaryOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_1__2"


    // $ANTLR start "rule__UnaryOperation__Group_1__2__Impl"
    // InternalCalculatorForm.g:4888:1: rule__UnaryOperation__Group_1__2__Impl : ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) ) ;
    public final void rule__UnaryOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4892:1: ( ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) ) )
            // InternalCalculatorForm.g:4893:1: ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) )
            {
            // InternalCalculatorForm.g:4893:1: ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) )
            // InternalCalculatorForm.g:4894:2: ( rule__UnaryOperation__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExpressionAssignment_1_2()); 
            }
            // InternalCalculatorForm.g:4895:2: ( rule__UnaryOperation__ExpressionAssignment_1_2 )
            // InternalCalculatorForm.g:4895:3: rule__UnaryOperation__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryOperation__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalCalculatorForm.g:4904:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4908:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalCalculatorForm.g:4909:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalCalculatorForm.g:4916:1: rule__Atomic__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4920:1: ( ( '(' ) )
            // InternalCalculatorForm.g:4921:1: ( '(' )
            {
            // InternalCalculatorForm.g:4921:1: ( '(' )
            // InternalCalculatorForm.g:4922:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalCalculatorForm.g:4931:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4935:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // InternalCalculatorForm.g:4936:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_40);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalCalculatorForm.g:4943:1: rule__Atomic__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4947:1: ( ( ruleExpression ) )
            // InternalCalculatorForm.g:4948:1: ( ruleExpression )
            {
            // InternalCalculatorForm.g:4948:1: ( ruleExpression )
            // InternalCalculatorForm.g:4949:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_0__2"
    // InternalCalculatorForm.g:4958:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4962:1: ( rule__Atomic__Group_0__2__Impl )
            // InternalCalculatorForm.g:4963:2: rule__Atomic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__2"


    // $ANTLR start "rule__Atomic__Group_0__2__Impl"
    // InternalCalculatorForm.g:4969:1: rule__Atomic__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4973:1: ( ( ')' ) )
            // InternalCalculatorForm.g:4974:1: ( ')' )
            {
            // InternalCalculatorForm.g:4974:1: ( ')' )
            // InternalCalculatorForm.g:4975:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__2__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // InternalCalculatorForm.g:4985:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4989:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalCalculatorForm.g:4990:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // InternalCalculatorForm.g:4997:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5001:1: ( ( () ) )
            // InternalCalculatorForm.g:5002:1: ( () )
            {
            // InternalCalculatorForm.g:5002:1: ( () )
            // InternalCalculatorForm.g:5003:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNumberLiteralAction_0_0()); 
            }
            // InternalCalculatorForm.g:5004:2: ()
            // InternalCalculatorForm.g:5004:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNumberLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // InternalCalculatorForm.g:5012:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5016:1: ( rule__Literal__Group_0__1__Impl )
            // InternalCalculatorForm.g:5017:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // InternalCalculatorForm.g:5023:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__ValueAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5027:1: ( ( ( rule__Literal__ValueAssignment_0_1 ) ) )
            // InternalCalculatorForm.g:5028:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            {
            // InternalCalculatorForm.g:5028:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            // InternalCalculatorForm.g:5029:2: ( rule__Literal__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalCalculatorForm.g:5030:2: ( rule__Literal__ValueAssignment_0_1 )
            // InternalCalculatorForm.g:5030:3: rule__Literal__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // InternalCalculatorForm.g:5039:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5043:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // InternalCalculatorForm.g:5044:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_41);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // InternalCalculatorForm.g:5051:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5055:1: ( ( () ) )
            // InternalCalculatorForm.g:5056:1: ( () )
            {
            // InternalCalculatorForm.g:5056:1: ( () )
            // InternalCalculatorForm.g:5057:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getFloatLiteralAction_1_0()); 
            }
            // InternalCalculatorForm.g:5058:2: ()
            // InternalCalculatorForm.g:5058:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getFloatLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // InternalCalculatorForm.g:5066:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5070:1: ( rule__Literal__Group_1__1__Impl )
            // InternalCalculatorForm.g:5071:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // InternalCalculatorForm.g:5077:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__ValueAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5081:1: ( ( ( rule__Literal__ValueAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:5082:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:5082:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            // InternalCalculatorForm.g:5083:2: ( rule__Literal__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:5084:2: ( rule__Literal__ValueAssignment_1_1 )
            // InternalCalculatorForm.g:5084:3: rule__Literal__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // InternalCalculatorForm.g:5093:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5097:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // InternalCalculatorForm.g:5098:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_42);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // InternalCalculatorForm.g:5105:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5109:1: ( ( () ) )
            // InternalCalculatorForm.g:5110:1: ( () )
            {
            // InternalCalculatorForm.g:5110:1: ( () )
            // InternalCalculatorForm.g:5111:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getPercentLiteralAction_2_0()); 
            }
            // InternalCalculatorForm.g:5112:2: ()
            // InternalCalculatorForm.g:5112:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getPercentLiteralAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // InternalCalculatorForm.g:5120:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5124:1: ( rule__Literal__Group_2__1__Impl )
            // InternalCalculatorForm.g:5125:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // InternalCalculatorForm.g:5131:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__ValueAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5135:1: ( ( ( rule__Literal__ValueAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:5136:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:5136:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            // InternalCalculatorForm.g:5137:2: ( rule__Literal__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:5138:2: ( rule__Literal__ValueAssignment_2_1 )
            // InternalCalculatorForm.g:5138:3: rule__Literal__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group_3__0"
    // InternalCalculatorForm.g:5147:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5151:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // InternalCalculatorForm.g:5152:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__0"


    // $ANTLR start "rule__Literal__Group_3__0__Impl"
    // InternalCalculatorForm.g:5159:1: rule__Literal__Group_3__0__Impl : ( () ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5163:1: ( ( () ) )
            // InternalCalculatorForm.g:5164:1: ( () )
            {
            // InternalCalculatorForm.g:5164:1: ( () )
            // InternalCalculatorForm.g:5165:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getReferenceLiteralAction_3_0()); 
            }
            // InternalCalculatorForm.g:5166:2: ()
            // InternalCalculatorForm.g:5166:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getReferenceLiteralAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__0__Impl"


    // $ANTLR start "rule__Literal__Group_3__1"
    // InternalCalculatorForm.g:5174:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5178:1: ( rule__Literal__Group_3__1__Impl )
            // InternalCalculatorForm.g:5179:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__1"


    // $ANTLR start "rule__Literal__Group_3__1__Impl"
    // InternalCalculatorForm.g:5185:1: rule__Literal__Group_3__1__Impl : ( ( rule__Literal__RefAssignment_3_1 ) ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5189:1: ( ( ( rule__Literal__RefAssignment_3_1 ) ) )
            // InternalCalculatorForm.g:5190:1: ( ( rule__Literal__RefAssignment_3_1 ) )
            {
            // InternalCalculatorForm.g:5190:1: ( ( rule__Literal__RefAssignment_3_1 ) )
            // InternalCalculatorForm.g:5191:2: ( rule__Literal__RefAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getRefAssignment_3_1()); 
            }
            // InternalCalculatorForm.g:5192:2: ( rule__Literal__RefAssignment_3_1 )
            // InternalCalculatorForm.g:5192:3: rule__Literal__RefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__RefAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getRefAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__1__Impl"


    // $ANTLR start "rule__Model__FormsAssignment"
    // InternalCalculatorForm.g:5201:1: rule__Model__FormsAssignment : ( ruleForm ) ;
    public final void rule__Model__FormsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5205:1: ( ( ruleForm ) )
            // InternalCalculatorForm.g:5206:2: ( ruleForm )
            {
            // InternalCalculatorForm.g:5206:2: ( ruleForm )
            // InternalCalculatorForm.g:5207:3: ruleForm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFormsFormParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFormsFormParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormsAssignment"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalCalculatorForm.g:5216:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5220:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5221:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5221:2: ( RULE_ID )
            // InternalCalculatorForm.g:5222:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__FormElementsAssignment_3"
    // InternalCalculatorForm.g:5231:1: rule__Form__FormElementsAssignment_3 : ( ruleFormElement ) ;
    public final void rule__Form__FormElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5235:1: ( ( ruleFormElement ) )
            // InternalCalculatorForm.g:5236:2: ( ruleFormElement )
            {
            // InternalCalculatorForm.g:5236:2: ( ruleFormElement )
            // InternalCalculatorForm.g:5237:3: ruleFormElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getFormElementsFormElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFormElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getFormElementsFormElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__FormElementsAssignment_3"


    // $ANTLR start "rule__Form__CalculationsAssignment_4"
    // InternalCalculatorForm.g:5246:1: rule__Form__CalculationsAssignment_4 : ( ruleCalculate ) ;
    public final void rule__Form__CalculationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5250:1: ( ( ruleCalculate ) )
            // InternalCalculatorForm.g:5251:2: ( ruleCalculate )
            {
            // InternalCalculatorForm.g:5251:2: ( ruleCalculate )
            // InternalCalculatorForm.g:5252:3: ruleCalculate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getCalculationsCalculateParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCalculate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getCalculationsCalculateParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__CalculationsAssignment_4"


    // $ANTLR start "rule__FieldInput__NameAssignment_1"
    // InternalCalculatorForm.g:5261:1: rule__FieldInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5265:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5266:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5266:2: ( RULE_ID )
            // InternalCalculatorForm.g:5267:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__NameAssignment_1"


    // $ANTLR start "rule__FieldInput__AutofocusAssignment_2"
    // InternalCalculatorForm.g:5276:1: rule__FieldInput__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldInput__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5280:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5281:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5281:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5282:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5283:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5284:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__AutofocusAssignment_2"


    // $ANTLR start "rule__FieldInput__DisabledAssignment_3"
    // InternalCalculatorForm.g:5295:1: rule__FieldInput__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldInput__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5299:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5300:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5300:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5301:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5302:3: ( 'disabled' )
            // InternalCalculatorForm.g:5303:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__DisabledAssignment_3"


    // $ANTLR start "rule__FieldInput__FormAssignment_4_1"
    // InternalCalculatorForm.g:5314:1: rule__FieldInput__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5318:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5319:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5319:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5320:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__FormAssignment_4_1"


    // $ANTLR start "rule__FieldInput__LabelAssignment_5_1"
    // InternalCalculatorForm.g:5329:1: rule__FieldInput__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5333:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5334:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5334:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5335:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__LabelAssignment_5_1"


    // $ANTLR start "rule__FieldInput__NotdisplayedAssignment_6"
    // InternalCalculatorForm.g:5344:1: rule__FieldInput__NotdisplayedAssignment_6 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldInput__NotdisplayedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5348:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:5349:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:5349:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:5350:3: ( 'notdisplayed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:5351:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:5352:4: 'notdisplayed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__NotdisplayedAssignment_6"


    // $ANTLR start "rule__FieldInput__ReadonlyAssignment_7"
    // InternalCalculatorForm.g:5363:1: rule__FieldInput__ReadonlyAssignment_7 : ( ( 'readonly' ) ) ;
    public final void rule__FieldInput__ReadonlyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5367:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5368:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5368:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5369:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:5370:3: ( 'readonly' )
            // InternalCalculatorForm.g:5371:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__ReadonlyAssignment_7"


    // $ANTLR start "rule__FieldInput__RequiredAssignment_8"
    // InternalCalculatorForm.g:5382:1: rule__FieldInput__RequiredAssignment_8 : ( ( 'required' ) ) ;
    public final void rule__FieldInput__RequiredAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5386:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5387:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5387:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5388:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }
            // InternalCalculatorForm.g:5389:3: ( 'required' )
            // InternalCalculatorForm.g:5390:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__RequiredAssignment_8"


    // $ANTLR start "rule__FieldInput__ValueAssignment_9_1"
    // InternalCalculatorForm.g:5401:1: rule__FieldInput__ValueAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__ValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5405:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5406:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5406:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5407:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getValueSTRINGTerminalRuleCall_9_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldInputAccess().getValueSTRINGTerminalRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldInput__ValueAssignment_9_1"


    // $ANTLR start "rule__FieldSelect__NameAssignment_1"
    // InternalCalculatorForm.g:5416:1: rule__FieldSelect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSelect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5420:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5421:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5421:2: ( RULE_ID )
            // InternalCalculatorForm.g:5422:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__NameAssignment_1"


    // $ANTLR start "rule__FieldSelect__AutofocusAssignment_2"
    // InternalCalculatorForm.g:5431:1: rule__FieldSelect__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldSelect__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5435:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5436:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5436:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5437:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5438:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5439:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__AutofocusAssignment_2"


    // $ANTLR start "rule__FieldSelect__DisabledAssignment_3"
    // InternalCalculatorForm.g:5450:1: rule__FieldSelect__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldSelect__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5454:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5455:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5455:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5456:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5457:3: ( 'disabled' )
            // InternalCalculatorForm.g:5458:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__DisabledAssignment_3"


    // $ANTLR start "rule__FieldSelect__FormAssignment_4_1"
    // InternalCalculatorForm.g:5469:1: rule__FieldSelect__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5473:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5474:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5474:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5475:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__FormAssignment_4_1"


    // $ANTLR start "rule__FieldSelect__LabelAssignment_5_1"
    // InternalCalculatorForm.g:5484:1: rule__FieldSelect__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5488:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5489:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5489:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5490:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__LabelAssignment_5_1"


    // $ANTLR start "rule__FieldSelect__MultipleAssignment_6"
    // InternalCalculatorForm.g:5499:1: rule__FieldSelect__MultipleAssignment_6 : ( ( 'multiple' ) ) ;
    public final void rule__FieldSelect__MultipleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5503:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:5504:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:5504:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:5505:3: ( 'multiple' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:5506:3: ( 'multiple' )
            // InternalCalculatorForm.g:5507:4: 'multiple'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__MultipleAssignment_6"


    // $ANTLR start "rule__FieldSelect__RequiredAssignment_7"
    // InternalCalculatorForm.g:5518:1: rule__FieldSelect__RequiredAssignment_7 : ( ( 'required' ) ) ;
    public final void rule__FieldSelect__RequiredAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5522:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5523:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5523:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5524:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:5525:3: ( 'required' )
            // InternalCalculatorForm.g:5526:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__RequiredAssignment_7"


    // $ANTLR start "rule__FieldSelect__SizeAssignment_8_1"
    // InternalCalculatorForm.g:5537:1: rule__FieldSelect__SizeAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__FieldSelect__SizeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5541:1: ( ( RULE_INT ) )
            // InternalCalculatorForm.g:5542:2: ( RULE_INT )
            {
            // InternalCalculatorForm.g:5542:2: ( RULE_INT )
            // InternalCalculatorForm.g:5543:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getSizeINTTerminalRuleCall_8_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getSizeINTTerminalRuleCall_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__SizeAssignment_8_1"


    // $ANTLR start "rule__FieldSelect__ChildsAssignment_10"
    // InternalCalculatorForm.g:5552:1: rule__FieldSelect__ChildsAssignment_10 : ( ruleFieldSelectChild ) ;
    public final void rule__FieldSelect__ChildsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5556:1: ( ( ruleFieldSelectChild ) )
            // InternalCalculatorForm.g:5557:2: ( ruleFieldSelectChild )
            {
            // InternalCalculatorForm.g:5557:2: ( ruleFieldSelectChild )
            // InternalCalculatorForm.g:5558:3: ruleFieldSelectChild
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getChildsFieldSelectChildParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFieldSelectChild();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldSelectAccess().getChildsFieldSelectChildParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSelect__ChildsAssignment_10"


    // $ANTLR start "rule__FieldOption__TextAssignment_1"
    // InternalCalculatorForm.g:5567:1: rule__FieldOption__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5571:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5572:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5572:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5573:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__TextAssignment_1"


    // $ANTLR start "rule__FieldOption__DisabledAssignment_2"
    // InternalCalculatorForm.g:5582:1: rule__FieldOption__DisabledAssignment_2 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOption__DisabledAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5586:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5587:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5587:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5588:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5589:3: ( 'disabled' )
            // InternalCalculatorForm.g:5590:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__DisabledAssignment_2"


    // $ANTLR start "rule__FieldOption__SelectedAssignment_3"
    // InternalCalculatorForm.g:5601:1: rule__FieldOption__SelectedAssignment_3 : ( ( 'selected' ) ) ;
    public final void rule__FieldOption__SelectedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5605:1: ( ( ( 'selected' ) ) )
            // InternalCalculatorForm.g:5606:2: ( ( 'selected' ) )
            {
            // InternalCalculatorForm.g:5606:2: ( ( 'selected' ) )
            // InternalCalculatorForm.g:5607:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5608:3: ( 'selected' )
            // InternalCalculatorForm.g:5609:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__SelectedAssignment_3"


    // $ANTLR start "rule__FieldOption__TextAssignment_4_1"
    // InternalCalculatorForm.g:5620:1: rule__FieldOption__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5624:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5625:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5625:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5626:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__TextAssignment_4_1"


    // $ANTLR start "rule__FieldOption__ValueAssignment_5_1"
    // InternalCalculatorForm.g:5635:1: rule__FieldOption__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5639:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5640:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5640:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5641:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOption__ValueAssignment_5_1"


    // $ANTLR start "rule__FieldOptionGroup__DisabledAssignment_1"
    // InternalCalculatorForm.g:5650:1: rule__FieldOptionGroup__DisabledAssignment_1 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOptionGroup__DisabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5654:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5655:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5655:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5656:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }
            // InternalCalculatorForm.g:5657:3: ( 'disabled' )
            // InternalCalculatorForm.g:5658:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__DisabledAssignment_1"


    // $ANTLR start "rule__FieldOptionGroup__LabelAssignment_2_1"
    // InternalCalculatorForm.g:5669:1: rule__FieldOptionGroup__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FieldOptionGroup__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5673:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5674:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5674:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5675:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__LabelAssignment_2_1"


    // $ANTLR start "rule__FieldOptionGroup__OptionsAssignment_4"
    // InternalCalculatorForm.g:5684:1: rule__FieldOptionGroup__OptionsAssignment_4 : ( ruleFieldOption ) ;
    public final void rule__FieldOptionGroup__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5688:1: ( ( ruleFieldOption ) )
            // InternalCalculatorForm.g:5689:2: ( ruleFieldOption )
            {
            // InternalCalculatorForm.g:5689:2: ( ruleFieldOption )
            // InternalCalculatorForm.g:5690:3: ruleFieldOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getOptionsFieldOptionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFieldOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldOptionGroupAccess().getOptionsFieldOptionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldOptionGroup__OptionsAssignment_4"


    // $ANTLR start "rule__FieldChoice__NameAssignment_1"
    // InternalCalculatorForm.g:5699:1: rule__FieldChoice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldChoice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5703:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5704:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5704:2: ( RULE_ID )
            // InternalCalculatorForm.g:5705:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__NameAssignment_1"


    // $ANTLR start "rule__FieldChoice__AutofocusAssignment_2"
    // InternalCalculatorForm.g:5714:1: rule__FieldChoice__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoice__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5718:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5719:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5719:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5720:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5721:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5722:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__AutofocusAssignment_2"


    // $ANTLR start "rule__FieldChoice__CheckedAssignment_3"
    // InternalCalculatorForm.g:5733:1: rule__FieldChoice__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoice__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5737:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:5738:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:5738:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:5739:3: ( 'checked' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5740:3: ( 'checked' )
            // InternalCalculatorForm.g:5741:4: 'checked'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__CheckedAssignment_3"


    // $ANTLR start "rule__FieldChoice__DisabledAssignment_4"
    // InternalCalculatorForm.g:5752:1: rule__FieldChoice__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoice__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5756:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5757:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5757:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5758:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5759:3: ( 'disabled' )
            // InternalCalculatorForm.g:5760:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__DisabledAssignment_4"


    // $ANTLR start "rule__FieldChoice__FormAssignment_5_1"
    // InternalCalculatorForm.g:5771:1: rule__FieldChoice__FormAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__FormAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5775:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5776:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5776:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5777:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getFormSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getFormSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__FormAssignment_5_1"


    // $ANTLR start "rule__FieldChoice__LabelAssignment_6_1"
    // InternalCalculatorForm.g:5786:1: rule__FieldChoice__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5790:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5791:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5791:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5792:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__LabelAssignment_6_1"


    // $ANTLR start "rule__FieldChoice__MultipleAssignment_7"
    // InternalCalculatorForm.g:5801:1: rule__FieldChoice__MultipleAssignment_7 : ( ( 'multiple' ) ) ;
    public final void rule__FieldChoice__MultipleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5805:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:5806:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:5806:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:5807:3: ( 'multiple' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:5808:3: ( 'multiple' )
            // InternalCalculatorForm.g:5809:4: 'multiple'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__MultipleAssignment_7"


    // $ANTLR start "rule__FieldChoice__NotdisplayedAssignment_8"
    // InternalCalculatorForm.g:5820:1: rule__FieldChoice__NotdisplayedAssignment_8 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldChoice__NotdisplayedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5824:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:5825:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:5825:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:5826:3: ( 'notdisplayed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }
            // InternalCalculatorForm.g:5827:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:5828:4: 'notdisplayed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__NotdisplayedAssignment_8"


    // $ANTLR start "rule__FieldChoice__ReadonlyAssignment_9"
    // InternalCalculatorForm.g:5839:1: rule__FieldChoice__ReadonlyAssignment_9 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoice__ReadonlyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5843:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5844:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5844:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5845:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }
            // InternalCalculatorForm.g:5846:3: ( 'readonly' )
            // InternalCalculatorForm.g:5847:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__ReadonlyAssignment_9"


    // $ANTLR start "rule__FieldChoice__RequiredAssignment_10"
    // InternalCalculatorForm.g:5858:1: rule__FieldChoice__RequiredAssignment_10 : ( ( 'required' ) ) ;
    public final void rule__FieldChoice__RequiredAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5862:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5863:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5863:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5864:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }
            // InternalCalculatorForm.g:5865:3: ( 'required' )
            // InternalCalculatorForm.g:5866:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__RequiredAssignment_10"


    // $ANTLR start "rule__FieldChoice__ValueAssignment_11_1"
    // InternalCalculatorForm.g:5877:1: rule__FieldChoice__ValueAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__ValueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5881:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5882:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5882:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5883:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getValueSTRINGTerminalRuleCall_11_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getValueSTRINGTerminalRuleCall_11_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__ValueAssignment_11_1"


    // $ANTLR start "rule__FieldChoice__OptionsAssignment_12_1"
    // InternalCalculatorForm.g:5892:1: rule__FieldChoice__OptionsAssignment_12_1 : ( ruleFieldChoiceOption ) ;
    public final void rule__FieldChoice__OptionsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5896:1: ( ( ruleFieldChoiceOption ) )
            // InternalCalculatorForm.g:5897:2: ( ruleFieldChoiceOption )
            {
            // InternalCalculatorForm.g:5897:2: ( ruleFieldChoiceOption )
            // InternalCalculatorForm.g:5898:3: ruleFieldChoiceOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getOptionsFieldChoiceOptionParserRuleCall_12_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFieldChoiceOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceAccess().getOptionsFieldChoiceOptionParserRuleCall_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoice__OptionsAssignment_12_1"


    // $ANTLR start "rule__FieldChoiceOption__LabelAssignment_1"
    // InternalCalculatorForm.g:5907:1: rule__FieldChoiceOption__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5911:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5912:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5912:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5913:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__LabelAssignment_1"


    // $ANTLR start "rule__FieldChoiceOption__AutofocusAssignment_2"
    // InternalCalculatorForm.g:5922:1: rule__FieldChoiceOption__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoiceOption__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5926:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5927:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5927:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5928:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5929:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5930:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__AutofocusAssignment_2"


    // $ANTLR start "rule__FieldChoiceOption__CheckedAssignment_3"
    // InternalCalculatorForm.g:5941:1: rule__FieldChoiceOption__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoiceOption__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5945:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:5946:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:5946:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:5947:3: ( 'checked' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5948:3: ( 'checked' )
            // InternalCalculatorForm.g:5949:4: 'checked'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__CheckedAssignment_3"


    // $ANTLR start "rule__FieldChoiceOption__DisabledAssignment_4"
    // InternalCalculatorForm.g:5960:1: rule__FieldChoiceOption__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoiceOption__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5964:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5965:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5965:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5966:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5967:3: ( 'disabled' )
            // InternalCalculatorForm.g:5968:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__DisabledAssignment_4"


    // $ANTLR start "rule__FieldChoiceOption__ReadonlyAssignment_5"
    // InternalCalculatorForm.g:5979:1: rule__FieldChoiceOption__ReadonlyAssignment_5 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoiceOption__ReadonlyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5983:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5984:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5984:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5985:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }
            // InternalCalculatorForm.g:5986:3: ( 'readonly' )
            // InternalCalculatorForm.g:5987:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__ReadonlyAssignment_5"


    // $ANTLR start "rule__FieldChoiceOption__RequiredAssignment_6"
    // InternalCalculatorForm.g:5998:1: rule__FieldChoiceOption__RequiredAssignment_6 : ( ( 'required' ) ) ;
    public final void rule__FieldChoiceOption__RequiredAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6002:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:6003:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:6003:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:6004:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:6005:3: ( 'required' )
            // InternalCalculatorForm.g:6006:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__RequiredAssignment_6"


    // $ANTLR start "rule__FieldChoiceOption__ValueAssignment_7_1"
    // InternalCalculatorForm.g:6017:1: rule__FieldChoiceOption__ValueAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6021:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:6022:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:6022:2: ( RULE_STRING )
            // InternalCalculatorForm.g:6023:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldChoiceOption__ValueAssignment_7_1"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // InternalCalculatorForm.g:6032:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6036:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:6037:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:6037:2: ( RULE_ID )
            // InternalCalculatorForm.g:6038:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__LabelAssignment_2_1"
    // InternalCalculatorForm.g:6047:1: rule__Group__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Group__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6051:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:6052:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:6052:2: ( RULE_STRING )
            // InternalCalculatorForm.g:6053:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__LabelAssignment_2_1"


    // $ANTLR start "rule__Group__FieldsAssignment_4"
    // InternalCalculatorForm.g:6062:1: rule__Group__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Group__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6066:1: ( ( ruleField ) )
            // InternalCalculatorForm.g:6067:2: ( ruleField )
            {
            // InternalCalculatorForm.g:6067:2: ( ruleField )
            // InternalCalculatorForm.g:6068:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getFieldsFieldParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGroupAccess().getFieldsFieldParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__FieldsAssignment_4"


    // $ANTLR start "rule__Page__ChildsAssignment_2"
    // InternalCalculatorForm.g:6077:1: rule__Page__ChildsAssignment_2 : ( rulePageChild ) ;
    public final void rule__Page__ChildsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6081:1: ( ( rulePageChild ) )
            // InternalCalculatorForm.g:6082:2: ( rulePageChild )
            {
            // InternalCalculatorForm.g:6082:2: ( rulePageChild )
            // InternalCalculatorForm.g:6083:3: rulePageChild
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getChildsPageChildParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePageChild();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getChildsPageChildParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ChildsAssignment_2"


    // $ANTLR start "rule__ButtonSubmit__NameAssignment_1"
    // InternalCalculatorForm.g:6092:1: rule__ButtonSubmit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ButtonSubmit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6096:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:6097:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:6097:2: ( RULE_ID )
            // InternalCalculatorForm.g:6098:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__NameAssignment_1"


    // $ANTLR start "rule__ButtonSubmit__TextAssignment_2"
    // InternalCalculatorForm.g:6107:1: rule__ButtonSubmit__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6111:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:6112:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:6112:2: ( RULE_STRING )
            // InternalCalculatorForm.g:6113:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__TextAssignment_2"


    // $ANTLR start "rule__ButtonSubmit__AutofocusAssignment_3"
    // InternalCalculatorForm.g:6122:1: rule__ButtonSubmit__AutofocusAssignment_3 : ( ( 'autofocus' ) ) ;
    public final void rule__ButtonSubmit__AutofocusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6126:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:6127:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:6127:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:6128:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:6129:3: ( 'autofocus' )
            // InternalCalculatorForm.g:6130:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__AutofocusAssignment_3"


    // $ANTLR start "rule__ButtonSubmit__DisabledAssignment_4"
    // InternalCalculatorForm.g:6141:1: rule__ButtonSubmit__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__ButtonSubmit__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6145:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:6146:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:6146:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:6147:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:6148:3: ( 'disabled' )
            // InternalCalculatorForm.g:6149:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__DisabledAssignment_4"


    // $ANTLR start "rule__ButtonSubmit__ValueAssignment_5_1"
    // InternalCalculatorForm.g:6160:1: rule__ButtonSubmit__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6164:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:6165:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:6165:2: ( RULE_STRING )
            // InternalCalculatorForm.g:6166:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getButtonSubmitAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonSubmit__ValueAssignment_5_1"


    // $ANTLR start "rule__Calculate__OutputAssignment_1"
    // InternalCalculatorForm.g:6175:1: rule__Calculate__OutputAssignment_1 : ( ruleResultOutput ) ;
    public final void rule__Calculate__OutputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6179:1: ( ( ruleResultOutput ) )
            // InternalCalculatorForm.g:6180:2: ( ruleResultOutput )
            {
            // InternalCalculatorForm.g:6180:2: ( ruleResultOutput )
            // InternalCalculatorForm.g:6181:3: ruleResultOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getOutputResultOutputParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleResultOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getOutputResultOutputParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__OutputAssignment_1"


    // $ANTLR start "rule__Calculate__ExpressionAssignment_3"
    // InternalCalculatorForm.g:6190:1: rule__Calculate__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Calculate__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6194:1: ( ( ruleExpression ) )
            // InternalCalculatorForm.g:6195:2: ( ruleExpression )
            {
            // InternalCalculatorForm.g:6195:2: ( ruleExpression )
            // InternalCalculatorForm.g:6196:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getExpressionExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getExpressionExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__ExpressionAssignment_3"


    // $ANTLR start "rule__ResultOutput__FieldAssignment_1_2"
    // InternalCalculatorForm.g:6205:1: rule__ResultOutput__FieldAssignment_1_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ResultOutput__FieldAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6209:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCalculatorForm.g:6210:2: ( ( ruleQualifiedName ) )
            {
            // InternalCalculatorForm.g:6210:2: ( ( ruleQualifiedName ) )
            // InternalCalculatorForm.g:6211:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultOutputAccess().getFieldFieldCrossReference_1_2_0()); 
            }
            // InternalCalculatorForm.g:6212:3: ( ruleQualifiedName )
            // InternalCalculatorForm.g:6213:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getResultOutputAccess().getFieldFieldQualifiedNameParserRuleCall_1_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultOutputAccess().getFieldFieldQualifiedNameParserRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getResultOutputAccess().getFieldFieldCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultOutput__FieldAssignment_1_2"


    // $ANTLR start "rule__CalculateVariable__NameAssignment_1"
    // InternalCalculatorForm.g:6224:1: rule__CalculateVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CalculateVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6228:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:6229:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:6229:2: ( RULE_ID )
            // InternalCalculatorForm.g:6230:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalculateVariable__NameAssignment_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalCalculatorForm.g:6239:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6243:1: ( ( ruleMultiplication ) )
            // InternalCalculatorForm.g:6244:2: ( ruleMultiplication )
            {
            // InternalCalculatorForm.g:6244:2: ( ruleMultiplication )
            // InternalCalculatorForm.g:6245:3: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalCalculatorForm.g:6254:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrefixed ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6258:1: ( ( rulePrefixed ) )
            // InternalCalculatorForm.g:6259:2: ( rulePrefixed )
            {
            // InternalCalculatorForm.g:6259:2: ( rulePrefixed )
            // InternalCalculatorForm.g:6260:3: rulePrefixed
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefixed();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightPrefixedParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryOperation__ExpressionAssignment_0_2"
    // InternalCalculatorForm.g:6269:1: rule__UnaryOperation__ExpressionAssignment_0_2 : ( ruleAtomic ) ;
    public final void rule__UnaryOperation__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6273:1: ( ( ruleAtomic ) )
            // InternalCalculatorForm.g:6274:2: ( ruleAtomic )
            {
            // InternalCalculatorForm.g:6274:2: ( ruleAtomic )
            // InternalCalculatorForm.g:6275:3: ruleAtomic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExpressionAtomicParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getExpressionAtomicParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__ExpressionAssignment_0_2"


    // $ANTLR start "rule__UnaryOperation__ExpressionAssignment_1_2"
    // InternalCalculatorForm.g:6284:1: rule__UnaryOperation__ExpressionAssignment_1_2 : ( ruleAtomic ) ;
    public final void rule__UnaryOperation__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6288:1: ( ( ruleAtomic ) )
            // InternalCalculatorForm.g:6289:2: ( ruleAtomic )
            {
            // InternalCalculatorForm.g:6289:2: ( ruleAtomic )
            // InternalCalculatorForm.g:6290:3: ruleAtomic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExpressionAtomicParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryOperationAccess().getExpressionAtomicParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Literal__ValueAssignment_0_1"
    // InternalCalculatorForm.g:6299:1: rule__Literal__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Literal__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6303:1: ( ( RULE_INT ) )
            // InternalCalculatorForm.g:6304:2: ( RULE_INT )
            {
            // InternalCalculatorForm.g:6304:2: ( RULE_INT )
            // InternalCalculatorForm.g:6305:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_0_1"


    // $ANTLR start "rule__Literal__ValueAssignment_1_1"
    // InternalCalculatorForm.g:6314:1: rule__Literal__ValueAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__Literal__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6318:1: ( ( RULE_FLOAT ) )
            // InternalCalculatorForm.g:6319:2: ( RULE_FLOAT )
            {
            // InternalCalculatorForm.g:6319:2: ( RULE_FLOAT )
            // InternalCalculatorForm.g:6320:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueFLOATTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueFLOATTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_1_1"


    // $ANTLR start "rule__Literal__ValueAssignment_2_1"
    // InternalCalculatorForm.g:6329:1: rule__Literal__ValueAssignment_2_1 : ( RULE_PERCENT ) ;
    public final void rule__Literal__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6333:1: ( ( RULE_PERCENT ) )
            // InternalCalculatorForm.g:6334:2: ( RULE_PERCENT )
            {
            // InternalCalculatorForm.g:6334:2: ( RULE_PERCENT )
            // InternalCalculatorForm.g:6335:3: RULE_PERCENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValuePERCENTTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_PERCENT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValuePERCENTTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_2_1"


    // $ANTLR start "rule__Literal__RefAssignment_3_1"
    // InternalCalculatorForm.g:6344:1: rule__Literal__RefAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Literal__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6348:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCalculatorForm.g:6349:2: ( ( ruleQualifiedName ) )
            {
            // InternalCalculatorForm.g:6349:2: ( ( ruleQualifiedName ) )
            // InternalCalculatorForm.g:6350:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getRefInputVariableCrossReference_3_1_0()); 
            }
            // InternalCalculatorForm.g:6351:3: ( ruleQualifiedName )
            // InternalCalculatorForm.g:6352:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getRefInputVariableQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getRefInputVariableQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getRefInputVariableCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__RefAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001F098000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000F090002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000F8000062000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000198000126000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000A08000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000210000440000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000024000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00005F8000066000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00004D8000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000009098000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000009090002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000B098000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000B090002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000018000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000032000001D0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000100L});

}