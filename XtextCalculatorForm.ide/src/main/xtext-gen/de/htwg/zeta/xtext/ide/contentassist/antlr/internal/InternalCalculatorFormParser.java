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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_PERCENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'{'", "'}'", "'field'", "'label'", "'value'", "'dropdown'", "'size'", "'option'", "'text'", "'option-group'", "'choice'", "'group'", "'page'", "'submit-button'", "'calculate'", "'='", "'.'", "'+'", "'-'", "'*'", "'/'", "'!'", "'('", "')'", "'autofocus'", "'disabled'", "'notdisplayed'", "'readonly'", "'required'", "'multiple'", "'selected'", "'checked'"
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCalculatorForm.g:479:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:480:1: ( ruleQualifiedName EOF )
            // InternalCalculatorForm.g:481:1: ruleQualifiedName EOF
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
    // InternalCalculatorForm.g:488:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:492:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCalculatorForm.g:493:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCalculatorForm.g:493:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCalculatorForm.g:494:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:495:3: ( rule__QualifiedName__Group__0 )
            // InternalCalculatorForm.g:495:4: rule__QualifiedName__Group__0
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
    // InternalCalculatorForm.g:504:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:505:1: ( ruleExpression EOF )
            // InternalCalculatorForm.g:506:1: ruleExpression EOF
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
    // InternalCalculatorForm.g:513:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:517:2: ( ( ruleAddition ) )
            // InternalCalculatorForm.g:518:2: ( ruleAddition )
            {
            // InternalCalculatorForm.g:518:2: ( ruleAddition )
            // InternalCalculatorForm.g:519:3: ruleAddition
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
    // InternalCalculatorForm.g:529:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:530:1: ( ruleAddition EOF )
            // InternalCalculatorForm.g:531:1: ruleAddition EOF
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
    // InternalCalculatorForm.g:538:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:542:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalCalculatorForm.g:543:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalCalculatorForm.g:543:2: ( ( rule__Addition__Group__0 ) )
            // InternalCalculatorForm.g:544:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:545:3: ( rule__Addition__Group__0 )
            // InternalCalculatorForm.g:545:4: rule__Addition__Group__0
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
    // InternalCalculatorForm.g:554:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:555:1: ( ruleMultiplication EOF )
            // InternalCalculatorForm.g:556:1: ruleMultiplication EOF
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
    // InternalCalculatorForm.g:563:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:567:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalCalculatorForm.g:568:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalCalculatorForm.g:568:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalCalculatorForm.g:569:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:570:3: ( rule__Multiplication__Group__0 )
            // InternalCalculatorForm.g:570:4: rule__Multiplication__Group__0
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
    // InternalCalculatorForm.g:579:1: entryRulePrefixed : rulePrefixed EOF ;
    public final void entryRulePrefixed() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:580:1: ( rulePrefixed EOF )
            // InternalCalculatorForm.g:581:1: rulePrefixed EOF
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
    // InternalCalculatorForm.g:588:1: rulePrefixed : ( ( rule__Prefixed__Alternatives ) ) ;
    public final void rulePrefixed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:592:2: ( ( ( rule__Prefixed__Alternatives ) ) )
            // InternalCalculatorForm.g:593:2: ( ( rule__Prefixed__Alternatives ) )
            {
            // InternalCalculatorForm.g:593:2: ( ( rule__Prefixed__Alternatives ) )
            // InternalCalculatorForm.g:594:3: ( rule__Prefixed__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:595:3: ( rule__Prefixed__Alternatives )
            // InternalCalculatorForm.g:595:4: rule__Prefixed__Alternatives
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
    // InternalCalculatorForm.g:604:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:605:1: ( ruleUnaryOperation EOF )
            // InternalCalculatorForm.g:606:1: ruleUnaryOperation EOF
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
    // InternalCalculatorForm.g:613:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Alternatives ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:617:2: ( ( ( rule__UnaryOperation__Alternatives ) ) )
            // InternalCalculatorForm.g:618:2: ( ( rule__UnaryOperation__Alternatives ) )
            {
            // InternalCalculatorForm.g:618:2: ( ( rule__UnaryOperation__Alternatives ) )
            // InternalCalculatorForm.g:619:3: ( rule__UnaryOperation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:620:3: ( rule__UnaryOperation__Alternatives )
            // InternalCalculatorForm.g:620:4: rule__UnaryOperation__Alternatives
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
    // InternalCalculatorForm.g:629:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:630:1: ( ruleAtomic EOF )
            // InternalCalculatorForm.g:631:1: ruleAtomic EOF
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
    // InternalCalculatorForm.g:638:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:642:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalCalculatorForm.g:643:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalCalculatorForm.g:643:2: ( ( rule__Atomic__Alternatives ) )
            // InternalCalculatorForm.g:644:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:645:3: ( rule__Atomic__Alternatives )
            // InternalCalculatorForm.g:645:4: rule__Atomic__Alternatives
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
    // InternalCalculatorForm.g:654:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:655:1: ( ruleLiteral EOF )
            // InternalCalculatorForm.g:656:1: ruleLiteral EOF
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
    // InternalCalculatorForm.g:663:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:667:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalCalculatorForm.g:668:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalCalculatorForm.g:668:2: ( ( rule__Literal__Alternatives ) )
            // InternalCalculatorForm.g:669:3: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:670:3: ( rule__Literal__Alternatives )
            // InternalCalculatorForm.g:670:4: rule__Literal__Alternatives
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
    // InternalCalculatorForm.g:678:1: rule__FormElement__Alternatives : ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) );
    public final void rule__FormElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:682:1: ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) )
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
                    // InternalCalculatorForm.g:683:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:683:2: ( ruleField )
                    // InternalCalculatorForm.g:684:3: ruleField
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
                    // InternalCalculatorForm.g:689:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:689:2: ( ruleGroup )
                    // InternalCalculatorForm.g:690:3: ruleGroup
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
                    // InternalCalculatorForm.g:695:2: ( rulePage )
                    {
                    // InternalCalculatorForm.g:695:2: ( rulePage )
                    // InternalCalculatorForm.g:696:3: rulePage
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
    // InternalCalculatorForm.g:705:1: rule__Field__Alternatives : ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:709:1: ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) )
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
                    // InternalCalculatorForm.g:710:2: ( ruleFieldInput )
                    {
                    // InternalCalculatorForm.g:710:2: ( ruleFieldInput )
                    // InternalCalculatorForm.g:711:3: ruleFieldInput
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
                    // InternalCalculatorForm.g:716:2: ( ruleFieldSelect )
                    {
                    // InternalCalculatorForm.g:716:2: ( ruleFieldSelect )
                    // InternalCalculatorForm.g:717:3: ruleFieldSelect
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
                    // InternalCalculatorForm.g:722:2: ( ruleFieldChoice )
                    {
                    // InternalCalculatorForm.g:722:2: ( ruleFieldChoice )
                    // InternalCalculatorForm.g:723:3: ruleFieldChoice
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
                    // InternalCalculatorForm.g:728:2: ( ruleButton )
                    {
                    // InternalCalculatorForm.g:728:2: ( ruleButton )
                    // InternalCalculatorForm.g:729:3: ruleButton
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
    // InternalCalculatorForm.g:738:1: rule__FieldSelectChild__Alternatives : ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) );
    public final void rule__FieldSelectChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:742:1: ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) )
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
                    // InternalCalculatorForm.g:743:2: ( ruleFieldOption )
                    {
                    // InternalCalculatorForm.g:743:2: ( ruleFieldOption )
                    // InternalCalculatorForm.g:744:3: ruleFieldOption
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
                    // InternalCalculatorForm.g:749:2: ( ruleFieldOptionGroup )
                    {
                    // InternalCalculatorForm.g:749:2: ( ruleFieldOptionGroup )
                    // InternalCalculatorForm.g:750:3: ruleFieldOptionGroup
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
    // InternalCalculatorForm.g:759:1: rule__PageChild__Alternatives : ( ( ruleGroup ) | ( ruleField ) );
    public final void rule__PageChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:763:1: ( ( ruleGroup ) | ( ruleField ) )
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
                    // InternalCalculatorForm.g:764:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:764:2: ( ruleGroup )
                    // InternalCalculatorForm.g:765:3: ruleGroup
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
                    // InternalCalculatorForm.g:770:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:770:2: ( ruleField )
                    // InternalCalculatorForm.g:771:3: ruleField
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


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalCalculatorForm.g:780:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:784:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
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
                    // InternalCalculatorForm.g:785:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalCalculatorForm.g:785:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalCalculatorForm.g:786:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // InternalCalculatorForm.g:787:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalCalculatorForm.g:787:4: rule__Addition__Group_1_0_0__0
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
                    // InternalCalculatorForm.g:791:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalCalculatorForm.g:791:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalCalculatorForm.g:792:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // InternalCalculatorForm.g:793:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalCalculatorForm.g:793:4: rule__Addition__Group_1_0_1__0
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
    // InternalCalculatorForm.g:801:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:805:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
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
                    // InternalCalculatorForm.g:806:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalCalculatorForm.g:806:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalCalculatorForm.g:807:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // InternalCalculatorForm.g:808:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalCalculatorForm.g:808:4: rule__Multiplication__Group_1_0_0__0
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
                    // InternalCalculatorForm.g:812:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalCalculatorForm.g:812:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalCalculatorForm.g:813:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // InternalCalculatorForm.g:814:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalCalculatorForm.g:814:4: rule__Multiplication__Group_1_0_1__0
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
    // InternalCalculatorForm.g:822:1: rule__Prefixed__Alternatives : ( ( ruleUnaryOperation ) | ( ruleAtomic ) );
    public final void rule__Prefixed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:826:1: ( ( ruleUnaryOperation ) | ( ruleAtomic ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32||LA8_0==35) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||(LA8_0>=RULE_INT && LA8_0<=RULE_PERCENT)||LA8_0==36) ) {
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
                    // InternalCalculatorForm.g:827:2: ( ruleUnaryOperation )
                    {
                    // InternalCalculatorForm.g:827:2: ( ruleUnaryOperation )
                    // InternalCalculatorForm.g:828:3: ruleUnaryOperation
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
                    // InternalCalculatorForm.g:833:2: ( ruleAtomic )
                    {
                    // InternalCalculatorForm.g:833:2: ( ruleAtomic )
                    // InternalCalculatorForm.g:834:3: ruleAtomic
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
    // InternalCalculatorForm.g:843:1: rule__UnaryOperation__Alternatives : ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( ( rule__UnaryOperation__Group_1__0 ) ) );
    public final void rule__UnaryOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:847:1: ( ( ( rule__UnaryOperation__Group_0__0 ) ) | ( ( rule__UnaryOperation__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
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
                    // InternalCalculatorForm.g:848:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:848:2: ( ( rule__UnaryOperation__Group_0__0 ) )
                    // InternalCalculatorForm.g:849:3: ( rule__UnaryOperation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:850:3: ( rule__UnaryOperation__Group_0__0 )
                    // InternalCalculatorForm.g:850:4: rule__UnaryOperation__Group_0__0
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
                    // InternalCalculatorForm.g:854:2: ( ( rule__UnaryOperation__Group_1__0 ) )
                    {
                    // InternalCalculatorForm.g:854:2: ( ( rule__UnaryOperation__Group_1__0 ) )
                    // InternalCalculatorForm.g:855:3: ( rule__UnaryOperation__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryOperationAccess().getGroup_1()); 
                    }
                    // InternalCalculatorForm.g:856:3: ( rule__UnaryOperation__Group_1__0 )
                    // InternalCalculatorForm.g:856:4: rule__UnaryOperation__Group_1__0
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
    // InternalCalculatorForm.g:864:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLiteral ) | ( ( rule__Atomic__Group_2__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:868:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLiteral ) | ( ( rule__Atomic__Group_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_PERCENT:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCalculatorForm.g:869:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:869:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalCalculatorForm.g:870:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:871:3: ( rule__Atomic__Group_0__0 )
                    // InternalCalculatorForm.g:871:4: rule__Atomic__Group_0__0
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
                    // InternalCalculatorForm.g:875:2: ( ruleLiteral )
                    {
                    // InternalCalculatorForm.g:875:2: ( ruleLiteral )
                    // InternalCalculatorForm.g:876:3: ruleLiteral
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
                case 3 :
                    // InternalCalculatorForm.g:881:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalCalculatorForm.g:881:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalCalculatorForm.g:882:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalCalculatorForm.g:883:3: ( rule__Atomic__Group_2__0 )
                    // InternalCalculatorForm.g:883:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_2()); 
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
    // InternalCalculatorForm.g:891:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:895:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt11=2;
                }
                break;
            case RULE_PERCENT:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:896:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:896:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalCalculatorForm.g:897:3: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:898:3: ( rule__Literal__Group_0__0 )
                    // InternalCalculatorForm.g:898:4: rule__Literal__Group_0__0
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
                    // InternalCalculatorForm.g:902:2: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // InternalCalculatorForm.g:902:2: ( ( rule__Literal__Group_1__0 ) )
                    // InternalCalculatorForm.g:903:3: ( rule__Literal__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    }
                    // InternalCalculatorForm.g:904:3: ( rule__Literal__Group_1__0 )
                    // InternalCalculatorForm.g:904:4: rule__Literal__Group_1__0
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
                    // InternalCalculatorForm.g:908:2: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // InternalCalculatorForm.g:908:2: ( ( rule__Literal__Group_2__0 ) )
                    // InternalCalculatorForm.g:909:3: ( rule__Literal__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    }
                    // InternalCalculatorForm.g:910:3: ( rule__Literal__Group_2__0 )
                    // InternalCalculatorForm.g:910:4: rule__Literal__Group_2__0
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

            }
        }
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
    // InternalCalculatorForm.g:918:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:922:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalCalculatorForm.g:923:2: rule__Form__Group__0__Impl rule__Form__Group__1
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
    // InternalCalculatorForm.g:930:1: rule__Form__Group__0__Impl : ( 'form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:934:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:935:1: ( 'form' )
            {
            // InternalCalculatorForm.g:935:1: ( 'form' )
            // InternalCalculatorForm.g:936:2: 'form'
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
    // InternalCalculatorForm.g:945:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:949:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalCalculatorForm.g:950:2: rule__Form__Group__1__Impl rule__Form__Group__2
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
    // InternalCalculatorForm.g:957:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:961:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:962:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:962:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalCalculatorForm.g:963:2: ( rule__Form__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:964:2: ( rule__Form__NameAssignment_1 )
            // InternalCalculatorForm.g:964:3: rule__Form__NameAssignment_1
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
    // InternalCalculatorForm.g:972:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:976:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // InternalCalculatorForm.g:977:2: rule__Form__Group__2__Impl rule__Form__Group__3
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
    // InternalCalculatorForm.g:984:1: rule__Form__Group__2__Impl : ( '{' ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:988:1: ( ( '{' ) )
            // InternalCalculatorForm.g:989:1: ( '{' )
            {
            // InternalCalculatorForm.g:989:1: ( '{' )
            // InternalCalculatorForm.g:990:2: '{'
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
    // InternalCalculatorForm.g:999:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1003:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // InternalCalculatorForm.g:1004:2: rule__Form__Group__3__Impl rule__Form__Group__4
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
    // InternalCalculatorForm.g:1011:1: rule__Form__Group__3__Impl : ( ( rule__Form__FormElementsAssignment_3 )* ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1015:1: ( ( ( rule__Form__FormElementsAssignment_3 )* ) )
            // InternalCalculatorForm.g:1016:1: ( ( rule__Form__FormElementsAssignment_3 )* )
            {
            // InternalCalculatorForm.g:1016:1: ( ( rule__Form__FormElementsAssignment_3 )* )
            // InternalCalculatorForm.g:1017:2: ( rule__Form__FormElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getFormElementsAssignment_3()); 
            }
            // InternalCalculatorForm.g:1018:2: ( rule__Form__FormElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16||LA12_0==19||(LA12_0>=24 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCalculatorForm.g:1018:3: rule__Form__FormElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Form__FormElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalCalculatorForm.g:1026:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1030:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // InternalCalculatorForm.g:1031:2: rule__Form__Group__4__Impl rule__Form__Group__5
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
    // InternalCalculatorForm.g:1038:1: rule__Form__Group__4__Impl : ( ( rule__Form__CalculationsAssignment_4 )* ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1042:1: ( ( ( rule__Form__CalculationsAssignment_4 )* ) )
            // InternalCalculatorForm.g:1043:1: ( ( rule__Form__CalculationsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:1043:1: ( ( rule__Form__CalculationsAssignment_4 )* )
            // InternalCalculatorForm.g:1044:2: ( rule__Form__CalculationsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getCalculationsAssignment_4()); 
            }
            // InternalCalculatorForm.g:1045:2: ( rule__Form__CalculationsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCalculatorForm.g:1045:3: rule__Form__CalculationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Form__CalculationsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCalculatorForm.g:1053:1: rule__Form__Group__5 : rule__Form__Group__5__Impl ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1057:1: ( rule__Form__Group__5__Impl )
            // InternalCalculatorForm.g:1058:2: rule__Form__Group__5__Impl
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
    // InternalCalculatorForm.g:1064:1: rule__Form__Group__5__Impl : ( '}' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1068:1: ( ( '}' ) )
            // InternalCalculatorForm.g:1069:1: ( '}' )
            {
            // InternalCalculatorForm.g:1069:1: ( '}' )
            // InternalCalculatorForm.g:1070:2: '}'
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
    // InternalCalculatorForm.g:1080:1: rule__FieldInput__Group__0 : rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 ;
    public final void rule__FieldInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1084:1: ( rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 )
            // InternalCalculatorForm.g:1085:2: rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1
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
    // InternalCalculatorForm.g:1092:1: rule__FieldInput__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1096:1: ( ( 'field' ) )
            // InternalCalculatorForm.g:1097:1: ( 'field' )
            {
            // InternalCalculatorForm.g:1097:1: ( 'field' )
            // InternalCalculatorForm.g:1098:2: 'field'
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
    // InternalCalculatorForm.g:1107:1: rule__FieldInput__Group__1 : rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 ;
    public final void rule__FieldInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1111:1: ( rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 )
            // InternalCalculatorForm.g:1112:2: rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2
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
    // InternalCalculatorForm.g:1119:1: rule__FieldInput__Group__1__Impl : ( ( rule__FieldInput__NameAssignment_1 ) ) ;
    public final void rule__FieldInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1123:1: ( ( ( rule__FieldInput__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1124:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1124:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1125:2: ( rule__FieldInput__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:1126:2: ( rule__FieldInput__NameAssignment_1 )
            // InternalCalculatorForm.g:1126:3: rule__FieldInput__NameAssignment_1
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
    // InternalCalculatorForm.g:1134:1: rule__FieldInput__Group__2 : rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 ;
    public final void rule__FieldInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1138:1: ( rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 )
            // InternalCalculatorForm.g:1139:2: rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3
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
    // InternalCalculatorForm.g:1146:1: rule__FieldInput__Group__2__Impl : ( ( rule__FieldInput__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1150:1: ( ( ( rule__FieldInput__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:1151:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1151:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:1152:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:1153:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCalculatorForm.g:1153:3: rule__FieldInput__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:1161:1: rule__FieldInput__Group__3 : rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 ;
    public final void rule__FieldInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1165:1: ( rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 )
            // InternalCalculatorForm.g:1166:2: rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4
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
    // InternalCalculatorForm.g:1173:1: rule__FieldInput__Group__3__Impl : ( ( rule__FieldInput__DisabledAssignment_3 )? ) ;
    public final void rule__FieldInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1177:1: ( ( ( rule__FieldInput__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:1178:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1178:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:1179:2: ( rule__FieldInput__DisabledAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledAssignment_3()); 
            }
            // InternalCalculatorForm.g:1180:2: ( rule__FieldInput__DisabledAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatorForm.g:1180:3: rule__FieldInput__DisabledAssignment_3
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
    // InternalCalculatorForm.g:1188:1: rule__FieldInput__Group__4 : rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 ;
    public final void rule__FieldInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1192:1: ( rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 )
            // InternalCalculatorForm.g:1193:2: rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5
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
    // InternalCalculatorForm.g:1200:1: rule__FieldInput__Group__4__Impl : ( ( rule__FieldInput__Group_4__0 )? ) ;
    public final void rule__FieldInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1204:1: ( ( ( rule__FieldInput__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1205:1: ( ( rule__FieldInput__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1205:1: ( ( rule__FieldInput__Group_4__0 )? )
            // InternalCalculatorForm.g:1206:2: ( rule__FieldInput__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:1207:2: ( rule__FieldInput__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculatorForm.g:1207:3: rule__FieldInput__Group_4__0
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
    // InternalCalculatorForm.g:1215:1: rule__FieldInput__Group__5 : rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 ;
    public final void rule__FieldInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1219:1: ( rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 )
            // InternalCalculatorForm.g:1220:2: rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6
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
    // InternalCalculatorForm.g:1227:1: rule__FieldInput__Group__5__Impl : ( ( rule__FieldInput__Group_5__0 )? ) ;
    public final void rule__FieldInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1231:1: ( ( ( rule__FieldInput__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1232:1: ( ( rule__FieldInput__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1232:1: ( ( rule__FieldInput__Group_5__0 )? )
            // InternalCalculatorForm.g:1233:2: ( rule__FieldInput__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:1234:2: ( rule__FieldInput__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCalculatorForm.g:1234:3: rule__FieldInput__Group_5__0
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
    // InternalCalculatorForm.g:1242:1: rule__FieldInput__Group__6 : rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 ;
    public final void rule__FieldInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1246:1: ( rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 )
            // InternalCalculatorForm.g:1247:2: rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7
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
    // InternalCalculatorForm.g:1254:1: rule__FieldInput__Group__6__Impl : ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) ;
    public final void rule__FieldInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1258:1: ( ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) )
            // InternalCalculatorForm.g:1259:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            {
            // InternalCalculatorForm.g:1259:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            // InternalCalculatorForm.g:1260:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedAssignment_6()); 
            }
            // InternalCalculatorForm.g:1261:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculatorForm.g:1261:3: rule__FieldInput__NotdisplayedAssignment_6
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
    // InternalCalculatorForm.g:1269:1: rule__FieldInput__Group__7 : rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 ;
    public final void rule__FieldInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1273:1: ( rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 )
            // InternalCalculatorForm.g:1274:2: rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8
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
    // InternalCalculatorForm.g:1281:1: rule__FieldInput__Group__7__Impl : ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) ;
    public final void rule__FieldInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1285:1: ( ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) )
            // InternalCalculatorForm.g:1286:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            {
            // InternalCalculatorForm.g:1286:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            // InternalCalculatorForm.g:1287:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyAssignment_7()); 
            }
            // InternalCalculatorForm.g:1288:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCalculatorForm.g:1288:3: rule__FieldInput__ReadonlyAssignment_7
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
    // InternalCalculatorForm.g:1296:1: rule__FieldInput__Group__8 : rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 ;
    public final void rule__FieldInput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1300:1: ( rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 )
            // InternalCalculatorForm.g:1301:2: rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9
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
    // InternalCalculatorForm.g:1308:1: rule__FieldInput__Group__8__Impl : ( ( rule__FieldInput__RequiredAssignment_8 )? ) ;
    public final void rule__FieldInput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1312:1: ( ( ( rule__FieldInput__RequiredAssignment_8 )? ) )
            // InternalCalculatorForm.g:1313:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            {
            // InternalCalculatorForm.g:1313:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            // InternalCalculatorForm.g:1314:2: ( rule__FieldInput__RequiredAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredAssignment_8()); 
            }
            // InternalCalculatorForm.g:1315:2: ( rule__FieldInput__RequiredAssignment_8 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCalculatorForm.g:1315:3: rule__FieldInput__RequiredAssignment_8
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
    // InternalCalculatorForm.g:1323:1: rule__FieldInput__Group__9 : rule__FieldInput__Group__9__Impl ;
    public final void rule__FieldInput__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1327:1: ( rule__FieldInput__Group__9__Impl )
            // InternalCalculatorForm.g:1328:2: rule__FieldInput__Group__9__Impl
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
    // InternalCalculatorForm.g:1334:1: rule__FieldInput__Group__9__Impl : ( ( rule__FieldInput__Group_9__0 )? ) ;
    public final void rule__FieldInput__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1338:1: ( ( ( rule__FieldInput__Group_9__0 )? ) )
            // InternalCalculatorForm.g:1339:1: ( ( rule__FieldInput__Group_9__0 )? )
            {
            // InternalCalculatorForm.g:1339:1: ( ( rule__FieldInput__Group_9__0 )? )
            // InternalCalculatorForm.g:1340:2: ( rule__FieldInput__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_9()); 
            }
            // InternalCalculatorForm.g:1341:2: ( rule__FieldInput__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCalculatorForm.g:1341:3: rule__FieldInput__Group_9__0
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
    // InternalCalculatorForm.g:1350:1: rule__FieldInput__Group_4__0 : rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 ;
    public final void rule__FieldInput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1354:1: ( rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 )
            // InternalCalculatorForm.g:1355:2: rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1
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
    // InternalCalculatorForm.g:1362:1: rule__FieldInput__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldInput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1366:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1367:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1367:1: ( 'form' )
            // InternalCalculatorForm.g:1368:2: 'form'
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
    // InternalCalculatorForm.g:1377:1: rule__FieldInput__Group_4__1 : rule__FieldInput__Group_4__1__Impl ;
    public final void rule__FieldInput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1381:1: ( rule__FieldInput__Group_4__1__Impl )
            // InternalCalculatorForm.g:1382:2: rule__FieldInput__Group_4__1__Impl
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
    // InternalCalculatorForm.g:1388:1: rule__FieldInput__Group_4__1__Impl : ( ( rule__FieldInput__FormAssignment_4_1 ) ) ;
    public final void rule__FieldInput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1392:1: ( ( ( rule__FieldInput__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1393:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1393:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:1394:2: ( rule__FieldInput__FormAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFormAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:1395:2: ( rule__FieldInput__FormAssignment_4_1 )
            // InternalCalculatorForm.g:1395:3: rule__FieldInput__FormAssignment_4_1
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
    // InternalCalculatorForm.g:1404:1: rule__FieldInput__Group_5__0 : rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 ;
    public final void rule__FieldInput__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1408:1: ( rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 )
            // InternalCalculatorForm.g:1409:2: rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1
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
    // InternalCalculatorForm.g:1416:1: rule__FieldInput__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldInput__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1420:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1421:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1421:1: ( 'label' )
            // InternalCalculatorForm.g:1422:2: 'label'
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
    // InternalCalculatorForm.g:1431:1: rule__FieldInput__Group_5__1 : rule__FieldInput__Group_5__1__Impl ;
    public final void rule__FieldInput__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1435:1: ( rule__FieldInput__Group_5__1__Impl )
            // InternalCalculatorForm.g:1436:2: rule__FieldInput__Group_5__1__Impl
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
    // InternalCalculatorForm.g:1442:1: rule__FieldInput__Group_5__1__Impl : ( ( rule__FieldInput__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldInput__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1446:1: ( ( ( rule__FieldInput__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:1447:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:1447:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:1448:2: ( rule__FieldInput__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getLabelAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:1449:2: ( rule__FieldInput__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:1449:3: rule__FieldInput__LabelAssignment_5_1
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
    // InternalCalculatorForm.g:1458:1: rule__FieldInput__Group_9__0 : rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 ;
    public final void rule__FieldInput__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1462:1: ( rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 )
            // InternalCalculatorForm.g:1463:2: rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1
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
    // InternalCalculatorForm.g:1470:1: rule__FieldInput__Group_9__0__Impl : ( 'value' ) ;
    public final void rule__FieldInput__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1474:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:1475:1: ( 'value' )
            {
            // InternalCalculatorForm.g:1475:1: ( 'value' )
            // InternalCalculatorForm.g:1476:2: 'value'
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
    // InternalCalculatorForm.g:1485:1: rule__FieldInput__Group_9__1 : rule__FieldInput__Group_9__1__Impl ;
    public final void rule__FieldInput__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1489:1: ( rule__FieldInput__Group_9__1__Impl )
            // InternalCalculatorForm.g:1490:2: rule__FieldInput__Group_9__1__Impl
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
    // InternalCalculatorForm.g:1496:1: rule__FieldInput__Group_9__1__Impl : ( ( rule__FieldInput__ValueAssignment_9_1 ) ) ;
    public final void rule__FieldInput__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1500:1: ( ( ( rule__FieldInput__ValueAssignment_9_1 ) ) )
            // InternalCalculatorForm.g:1501:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            {
            // InternalCalculatorForm.g:1501:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            // InternalCalculatorForm.g:1502:2: ( rule__FieldInput__ValueAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getValueAssignment_9_1()); 
            }
            // InternalCalculatorForm.g:1503:2: ( rule__FieldInput__ValueAssignment_9_1 )
            // InternalCalculatorForm.g:1503:3: rule__FieldInput__ValueAssignment_9_1
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
    // InternalCalculatorForm.g:1512:1: rule__FieldSelect__Group__0 : rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 ;
    public final void rule__FieldSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1516:1: ( rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 )
            // InternalCalculatorForm.g:1517:2: rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1
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
    // InternalCalculatorForm.g:1524:1: rule__FieldSelect__Group__0__Impl : ( 'dropdown' ) ;
    public final void rule__FieldSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1528:1: ( ( 'dropdown' ) )
            // InternalCalculatorForm.g:1529:1: ( 'dropdown' )
            {
            // InternalCalculatorForm.g:1529:1: ( 'dropdown' )
            // InternalCalculatorForm.g:1530:2: 'dropdown'
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
    // InternalCalculatorForm.g:1539:1: rule__FieldSelect__Group__1 : rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 ;
    public final void rule__FieldSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1543:1: ( rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 )
            // InternalCalculatorForm.g:1544:2: rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2
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
    // InternalCalculatorForm.g:1551:1: rule__FieldSelect__Group__1__Impl : ( ( rule__FieldSelect__NameAssignment_1 ) ) ;
    public final void rule__FieldSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1555:1: ( ( ( rule__FieldSelect__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1556:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1556:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1557:2: ( rule__FieldSelect__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:1558:2: ( rule__FieldSelect__NameAssignment_1 )
            // InternalCalculatorForm.g:1558:3: rule__FieldSelect__NameAssignment_1
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
    // InternalCalculatorForm.g:1566:1: rule__FieldSelect__Group__2 : rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 ;
    public final void rule__FieldSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1570:1: ( rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 )
            // InternalCalculatorForm.g:1571:2: rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3
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
    // InternalCalculatorForm.g:1578:1: rule__FieldSelect__Group__2__Impl : ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1582:1: ( ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:1583:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1583:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:1584:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:1585:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCalculatorForm.g:1585:3: rule__FieldSelect__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:1593:1: rule__FieldSelect__Group__3 : rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 ;
    public final void rule__FieldSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1597:1: ( rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 )
            // InternalCalculatorForm.g:1598:2: rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4
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
    // InternalCalculatorForm.g:1605:1: rule__FieldSelect__Group__3__Impl : ( ( rule__FieldSelect__DisabledAssignment_3 )? ) ;
    public final void rule__FieldSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1609:1: ( ( ( rule__FieldSelect__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:1610:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1610:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:1611:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledAssignment_3()); 
            }
            // InternalCalculatorForm.g:1612:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCalculatorForm.g:1612:3: rule__FieldSelect__DisabledAssignment_3
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
    // InternalCalculatorForm.g:1620:1: rule__FieldSelect__Group__4 : rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 ;
    public final void rule__FieldSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1624:1: ( rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 )
            // InternalCalculatorForm.g:1625:2: rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5
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
    // InternalCalculatorForm.g:1632:1: rule__FieldSelect__Group__4__Impl : ( ( rule__FieldSelect__Group_4__0 )? ) ;
    public final void rule__FieldSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1636:1: ( ( ( rule__FieldSelect__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1637:1: ( ( rule__FieldSelect__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1637:1: ( ( rule__FieldSelect__Group_4__0 )? )
            // InternalCalculatorForm.g:1638:2: ( rule__FieldSelect__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:1639:2: ( rule__FieldSelect__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCalculatorForm.g:1639:3: rule__FieldSelect__Group_4__0
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
    // InternalCalculatorForm.g:1647:1: rule__FieldSelect__Group__5 : rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 ;
    public final void rule__FieldSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1651:1: ( rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 )
            // InternalCalculatorForm.g:1652:2: rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6
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
    // InternalCalculatorForm.g:1659:1: rule__FieldSelect__Group__5__Impl : ( ( rule__FieldSelect__Group_5__0 )? ) ;
    public final void rule__FieldSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1663:1: ( ( ( rule__FieldSelect__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1664:1: ( ( rule__FieldSelect__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1664:1: ( ( rule__FieldSelect__Group_5__0 )? )
            // InternalCalculatorForm.g:1665:2: ( rule__FieldSelect__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:1666:2: ( rule__FieldSelect__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCalculatorForm.g:1666:3: rule__FieldSelect__Group_5__0
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
    // InternalCalculatorForm.g:1674:1: rule__FieldSelect__Group__6 : rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 ;
    public final void rule__FieldSelect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1678:1: ( rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 )
            // InternalCalculatorForm.g:1679:2: rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7
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
    // InternalCalculatorForm.g:1686:1: rule__FieldSelect__Group__6__Impl : ( ( rule__FieldSelect__MultipleAssignment_6 )? ) ;
    public final void rule__FieldSelect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1690:1: ( ( ( rule__FieldSelect__MultipleAssignment_6 )? ) )
            // InternalCalculatorForm.g:1691:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            {
            // InternalCalculatorForm.g:1691:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            // InternalCalculatorForm.g:1692:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleAssignment_6()); 
            }
            // InternalCalculatorForm.g:1693:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCalculatorForm.g:1693:3: rule__FieldSelect__MultipleAssignment_6
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
    // InternalCalculatorForm.g:1701:1: rule__FieldSelect__Group__7 : rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 ;
    public final void rule__FieldSelect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1705:1: ( rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 )
            // InternalCalculatorForm.g:1706:2: rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8
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
    // InternalCalculatorForm.g:1713:1: rule__FieldSelect__Group__7__Impl : ( ( rule__FieldSelect__RequiredAssignment_7 )? ) ;
    public final void rule__FieldSelect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1717:1: ( ( ( rule__FieldSelect__RequiredAssignment_7 )? ) )
            // InternalCalculatorForm.g:1718:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            {
            // InternalCalculatorForm.g:1718:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            // InternalCalculatorForm.g:1719:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredAssignment_7()); 
            }
            // InternalCalculatorForm.g:1720:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCalculatorForm.g:1720:3: rule__FieldSelect__RequiredAssignment_7
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
    // InternalCalculatorForm.g:1728:1: rule__FieldSelect__Group__8 : rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 ;
    public final void rule__FieldSelect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1732:1: ( rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 )
            // InternalCalculatorForm.g:1733:2: rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9
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
    // InternalCalculatorForm.g:1740:1: rule__FieldSelect__Group__8__Impl : ( ( rule__FieldSelect__Group_8__0 )? ) ;
    public final void rule__FieldSelect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1744:1: ( ( ( rule__FieldSelect__Group_8__0 )? ) )
            // InternalCalculatorForm.g:1745:1: ( ( rule__FieldSelect__Group_8__0 )? )
            {
            // InternalCalculatorForm.g:1745:1: ( ( rule__FieldSelect__Group_8__0 )? )
            // InternalCalculatorForm.g:1746:2: ( rule__FieldSelect__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_8()); 
            }
            // InternalCalculatorForm.g:1747:2: ( rule__FieldSelect__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCalculatorForm.g:1747:3: rule__FieldSelect__Group_8__0
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
    // InternalCalculatorForm.g:1755:1: rule__FieldSelect__Group__9 : rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 ;
    public final void rule__FieldSelect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1759:1: ( rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 )
            // InternalCalculatorForm.g:1760:2: rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10
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
    // InternalCalculatorForm.g:1767:1: rule__FieldSelect__Group__9__Impl : ( '{' ) ;
    public final void rule__FieldSelect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1771:1: ( ( '{' ) )
            // InternalCalculatorForm.g:1772:1: ( '{' )
            {
            // InternalCalculatorForm.g:1772:1: ( '{' )
            // InternalCalculatorForm.g:1773:2: '{'
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
    // InternalCalculatorForm.g:1782:1: rule__FieldSelect__Group__10 : rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 ;
    public final void rule__FieldSelect__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1786:1: ( rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 )
            // InternalCalculatorForm.g:1787:2: rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11
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
    // InternalCalculatorForm.g:1794:1: rule__FieldSelect__Group__10__Impl : ( ( rule__FieldSelect__ChildsAssignment_10 )* ) ;
    public final void rule__FieldSelect__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1798:1: ( ( ( rule__FieldSelect__ChildsAssignment_10 )* ) )
            // InternalCalculatorForm.g:1799:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            {
            // InternalCalculatorForm.g:1799:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            // InternalCalculatorForm.g:1800:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getChildsAssignment_10()); 
            }
            // InternalCalculatorForm.g:1801:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21||LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCalculatorForm.g:1801:3: rule__FieldSelect__ChildsAssignment_10
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FieldSelect__ChildsAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalCalculatorForm.g:1809:1: rule__FieldSelect__Group__11 : rule__FieldSelect__Group__11__Impl ;
    public final void rule__FieldSelect__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1813:1: ( rule__FieldSelect__Group__11__Impl )
            // InternalCalculatorForm.g:1814:2: rule__FieldSelect__Group__11__Impl
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
    // InternalCalculatorForm.g:1820:1: rule__FieldSelect__Group__11__Impl : ( '}' ) ;
    public final void rule__FieldSelect__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1824:1: ( ( '}' ) )
            // InternalCalculatorForm.g:1825:1: ( '}' )
            {
            // InternalCalculatorForm.g:1825:1: ( '}' )
            // InternalCalculatorForm.g:1826:2: '}'
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
    // InternalCalculatorForm.g:1836:1: rule__FieldSelect__Group_4__0 : rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 ;
    public final void rule__FieldSelect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1840:1: ( rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 )
            // InternalCalculatorForm.g:1841:2: rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1
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
    // InternalCalculatorForm.g:1848:1: rule__FieldSelect__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldSelect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1852:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1853:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1853:1: ( 'form' )
            // InternalCalculatorForm.g:1854:2: 'form'
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
    // InternalCalculatorForm.g:1863:1: rule__FieldSelect__Group_4__1 : rule__FieldSelect__Group_4__1__Impl ;
    public final void rule__FieldSelect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1867:1: ( rule__FieldSelect__Group_4__1__Impl )
            // InternalCalculatorForm.g:1868:2: rule__FieldSelect__Group_4__1__Impl
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
    // InternalCalculatorForm.g:1874:1: rule__FieldSelect__Group_4__1__Impl : ( ( rule__FieldSelect__FormAssignment_4_1 ) ) ;
    public final void rule__FieldSelect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1878:1: ( ( ( rule__FieldSelect__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1879:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1879:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:1880:2: ( rule__FieldSelect__FormAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getFormAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:1881:2: ( rule__FieldSelect__FormAssignment_4_1 )
            // InternalCalculatorForm.g:1881:3: rule__FieldSelect__FormAssignment_4_1
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
    // InternalCalculatorForm.g:1890:1: rule__FieldSelect__Group_5__0 : rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 ;
    public final void rule__FieldSelect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1894:1: ( rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 )
            // InternalCalculatorForm.g:1895:2: rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1
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
    // InternalCalculatorForm.g:1902:1: rule__FieldSelect__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldSelect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1906:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1907:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1907:1: ( 'label' )
            // InternalCalculatorForm.g:1908:2: 'label'
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
    // InternalCalculatorForm.g:1917:1: rule__FieldSelect__Group_5__1 : rule__FieldSelect__Group_5__1__Impl ;
    public final void rule__FieldSelect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1921:1: ( rule__FieldSelect__Group_5__1__Impl )
            // InternalCalculatorForm.g:1922:2: rule__FieldSelect__Group_5__1__Impl
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
    // InternalCalculatorForm.g:1928:1: rule__FieldSelect__Group_5__1__Impl : ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldSelect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1932:1: ( ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:1933:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:1933:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:1934:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLabelAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:1935:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:1935:3: rule__FieldSelect__LabelAssignment_5_1
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
    // InternalCalculatorForm.g:1944:1: rule__FieldSelect__Group_8__0 : rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 ;
    public final void rule__FieldSelect__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1948:1: ( rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 )
            // InternalCalculatorForm.g:1949:2: rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1
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
    // InternalCalculatorForm.g:1956:1: rule__FieldSelect__Group_8__0__Impl : ( 'size' ) ;
    public final void rule__FieldSelect__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1960:1: ( ( 'size' ) )
            // InternalCalculatorForm.g:1961:1: ( 'size' )
            {
            // InternalCalculatorForm.g:1961:1: ( 'size' )
            // InternalCalculatorForm.g:1962:2: 'size'
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
    // InternalCalculatorForm.g:1971:1: rule__FieldSelect__Group_8__1 : rule__FieldSelect__Group_8__1__Impl ;
    public final void rule__FieldSelect__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1975:1: ( rule__FieldSelect__Group_8__1__Impl )
            // InternalCalculatorForm.g:1976:2: rule__FieldSelect__Group_8__1__Impl
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
    // InternalCalculatorForm.g:1982:1: rule__FieldSelect__Group_8__1__Impl : ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) ;
    public final void rule__FieldSelect__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1986:1: ( ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) )
            // InternalCalculatorForm.g:1987:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            {
            // InternalCalculatorForm.g:1987:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            // InternalCalculatorForm.g:1988:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getSizeAssignment_8_1()); 
            }
            // InternalCalculatorForm.g:1989:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            // InternalCalculatorForm.g:1989:3: rule__FieldSelect__SizeAssignment_8_1
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
    // InternalCalculatorForm.g:1998:1: rule__FieldOption__Group__0 : rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 ;
    public final void rule__FieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2002:1: ( rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 )
            // InternalCalculatorForm.g:2003:2: rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1
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
    // InternalCalculatorForm.g:2010:1: rule__FieldOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2014:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:2015:1: ( 'option' )
            {
            // InternalCalculatorForm.g:2015:1: ( 'option' )
            // InternalCalculatorForm.g:2016:2: 'option'
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
    // InternalCalculatorForm.g:2025:1: rule__FieldOption__Group__1 : rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 ;
    public final void rule__FieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2029:1: ( rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 )
            // InternalCalculatorForm.g:2030:2: rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2
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
    // InternalCalculatorForm.g:2037:1: rule__FieldOption__Group__1__Impl : ( ( rule__FieldOption__TextAssignment_1 ) ) ;
    public final void rule__FieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2041:1: ( ( ( rule__FieldOption__TextAssignment_1 ) ) )
            // InternalCalculatorForm.g:2042:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2042:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            // InternalCalculatorForm.g:2043:2: ( rule__FieldOption__TextAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextAssignment_1()); 
            }
            // InternalCalculatorForm.g:2044:2: ( rule__FieldOption__TextAssignment_1 )
            // InternalCalculatorForm.g:2044:3: rule__FieldOption__TextAssignment_1
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
    // InternalCalculatorForm.g:2052:1: rule__FieldOption__Group__2 : rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 ;
    public final void rule__FieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2056:1: ( rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 )
            // InternalCalculatorForm.g:2057:2: rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3
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
    // InternalCalculatorForm.g:2064:1: rule__FieldOption__Group__2__Impl : ( ( rule__FieldOption__DisabledAssignment_2 )? ) ;
    public final void rule__FieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2068:1: ( ( ( rule__FieldOption__DisabledAssignment_2 )? ) )
            // InternalCalculatorForm.g:2069:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2069:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            // InternalCalculatorForm.g:2070:2: ( rule__FieldOption__DisabledAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledAssignment_2()); 
            }
            // InternalCalculatorForm.g:2071:2: ( rule__FieldOption__DisabledAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCalculatorForm.g:2071:3: rule__FieldOption__DisabledAssignment_2
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
    // InternalCalculatorForm.g:2079:1: rule__FieldOption__Group__3 : rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 ;
    public final void rule__FieldOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2083:1: ( rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 )
            // InternalCalculatorForm.g:2084:2: rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4
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
    // InternalCalculatorForm.g:2091:1: rule__FieldOption__Group__3__Impl : ( ( rule__FieldOption__SelectedAssignment_3 )? ) ;
    public final void rule__FieldOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2095:1: ( ( ( rule__FieldOption__SelectedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2096:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2096:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            // InternalCalculatorForm.g:2097:2: ( rule__FieldOption__SelectedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedAssignment_3()); 
            }
            // InternalCalculatorForm.g:2098:2: ( rule__FieldOption__SelectedAssignment_3 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCalculatorForm.g:2098:3: rule__FieldOption__SelectedAssignment_3
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
    // InternalCalculatorForm.g:2106:1: rule__FieldOption__Group__4 : rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 ;
    public final void rule__FieldOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2110:1: ( rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 )
            // InternalCalculatorForm.g:2111:2: rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5
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
    // InternalCalculatorForm.g:2118:1: rule__FieldOption__Group__4__Impl : ( ( rule__FieldOption__Group_4__0 )? ) ;
    public final void rule__FieldOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2122:1: ( ( ( rule__FieldOption__Group_4__0 )? ) )
            // InternalCalculatorForm.g:2123:1: ( ( rule__FieldOption__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:2123:1: ( ( rule__FieldOption__Group_4__0 )? )
            // InternalCalculatorForm.g:2124:2: ( rule__FieldOption__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:2125:2: ( rule__FieldOption__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCalculatorForm.g:2125:3: rule__FieldOption__Group_4__0
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
    // InternalCalculatorForm.g:2133:1: rule__FieldOption__Group__5 : rule__FieldOption__Group__5__Impl ;
    public final void rule__FieldOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2137:1: ( rule__FieldOption__Group__5__Impl )
            // InternalCalculatorForm.g:2138:2: rule__FieldOption__Group__5__Impl
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
    // InternalCalculatorForm.g:2144:1: rule__FieldOption__Group__5__Impl : ( ( rule__FieldOption__Group_5__0 )? ) ;
    public final void rule__FieldOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2148:1: ( ( ( rule__FieldOption__Group_5__0 )? ) )
            // InternalCalculatorForm.g:2149:1: ( ( rule__FieldOption__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:2149:1: ( ( rule__FieldOption__Group_5__0 )? )
            // InternalCalculatorForm.g:2150:2: ( rule__FieldOption__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:2151:2: ( rule__FieldOption__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCalculatorForm.g:2151:3: rule__FieldOption__Group_5__0
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
    // InternalCalculatorForm.g:2160:1: rule__FieldOption__Group_4__0 : rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 ;
    public final void rule__FieldOption__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2164:1: ( rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 )
            // InternalCalculatorForm.g:2165:2: rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1
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
    // InternalCalculatorForm.g:2172:1: rule__FieldOption__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__FieldOption__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2176:1: ( ( 'text' ) )
            // InternalCalculatorForm.g:2177:1: ( 'text' )
            {
            // InternalCalculatorForm.g:2177:1: ( 'text' )
            // InternalCalculatorForm.g:2178:2: 'text'
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
    // InternalCalculatorForm.g:2187:1: rule__FieldOption__Group_4__1 : rule__FieldOption__Group_4__1__Impl ;
    public final void rule__FieldOption__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2191:1: ( rule__FieldOption__Group_4__1__Impl )
            // InternalCalculatorForm.g:2192:2: rule__FieldOption__Group_4__1__Impl
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
    // InternalCalculatorForm.g:2198:1: rule__FieldOption__Group_4__1__Impl : ( ( rule__FieldOption__TextAssignment_4_1 ) ) ;
    public final void rule__FieldOption__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2202:1: ( ( ( rule__FieldOption__TextAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:2203:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:2203:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            // InternalCalculatorForm.g:2204:2: ( rule__FieldOption__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:2205:2: ( rule__FieldOption__TextAssignment_4_1 )
            // InternalCalculatorForm.g:2205:3: rule__FieldOption__TextAssignment_4_1
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
    // InternalCalculatorForm.g:2214:1: rule__FieldOption__Group_5__0 : rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 ;
    public final void rule__FieldOption__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2218:1: ( rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 )
            // InternalCalculatorForm.g:2219:2: rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1
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
    // InternalCalculatorForm.g:2226:1: rule__FieldOption__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__FieldOption__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2230:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:2231:1: ( 'value' )
            {
            // InternalCalculatorForm.g:2231:1: ( 'value' )
            // InternalCalculatorForm.g:2232:2: 'value'
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
    // InternalCalculatorForm.g:2241:1: rule__FieldOption__Group_5__1 : rule__FieldOption__Group_5__1__Impl ;
    public final void rule__FieldOption__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2245:1: ( rule__FieldOption__Group_5__1__Impl )
            // InternalCalculatorForm.g:2246:2: rule__FieldOption__Group_5__1__Impl
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
    // InternalCalculatorForm.g:2252:1: rule__FieldOption__Group_5__1__Impl : ( ( rule__FieldOption__ValueAssignment_5_1 ) ) ;
    public final void rule__FieldOption__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2256:1: ( ( ( rule__FieldOption__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2257:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2257:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:2258:2: ( rule__FieldOption__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getValueAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:2259:2: ( rule__FieldOption__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:2259:3: rule__FieldOption__ValueAssignment_5_1
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
    // InternalCalculatorForm.g:2268:1: rule__FieldOptionGroup__Group__0 : rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 ;
    public final void rule__FieldOptionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2272:1: ( rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 )
            // InternalCalculatorForm.g:2273:2: rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1
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
    // InternalCalculatorForm.g:2280:1: rule__FieldOptionGroup__Group__0__Impl : ( 'option-group' ) ;
    public final void rule__FieldOptionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2284:1: ( ( 'option-group' ) )
            // InternalCalculatorForm.g:2285:1: ( 'option-group' )
            {
            // InternalCalculatorForm.g:2285:1: ( 'option-group' )
            // InternalCalculatorForm.g:2286:2: 'option-group'
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
    // InternalCalculatorForm.g:2295:1: rule__FieldOptionGroup__Group__1 : rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 ;
    public final void rule__FieldOptionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2299:1: ( rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 )
            // InternalCalculatorForm.g:2300:2: rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2
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
    // InternalCalculatorForm.g:2307:1: rule__FieldOptionGroup__Group__1__Impl : ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) ;
    public final void rule__FieldOptionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2311:1: ( ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) )
            // InternalCalculatorForm.g:2312:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            {
            // InternalCalculatorForm.g:2312:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            // InternalCalculatorForm.g:2313:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledAssignment_1()); 
            }
            // InternalCalculatorForm.g:2314:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCalculatorForm.g:2314:3: rule__FieldOptionGroup__DisabledAssignment_1
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
    // InternalCalculatorForm.g:2322:1: rule__FieldOptionGroup__Group__2 : rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 ;
    public final void rule__FieldOptionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2326:1: ( rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 )
            // InternalCalculatorForm.g:2327:2: rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3
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
    // InternalCalculatorForm.g:2334:1: rule__FieldOptionGroup__Group__2__Impl : ( ( rule__FieldOptionGroup__Group_2__0 )? ) ;
    public final void rule__FieldOptionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2338:1: ( ( ( rule__FieldOptionGroup__Group_2__0 )? ) )
            // InternalCalculatorForm.g:2339:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:2339:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            // InternalCalculatorForm.g:2340:2: ( rule__FieldOptionGroup__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getGroup_2()); 
            }
            // InternalCalculatorForm.g:2341:2: ( rule__FieldOptionGroup__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCalculatorForm.g:2341:3: rule__FieldOptionGroup__Group_2__0
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
    // InternalCalculatorForm.g:2349:1: rule__FieldOptionGroup__Group__3 : rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 ;
    public final void rule__FieldOptionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2353:1: ( rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 )
            // InternalCalculatorForm.g:2354:2: rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4
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
    // InternalCalculatorForm.g:2361:1: rule__FieldOptionGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldOptionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2365:1: ( ( '{' ) )
            // InternalCalculatorForm.g:2366:1: ( '{' )
            {
            // InternalCalculatorForm.g:2366:1: ( '{' )
            // InternalCalculatorForm.g:2367:2: '{'
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
    // InternalCalculatorForm.g:2376:1: rule__FieldOptionGroup__Group__4 : rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 ;
    public final void rule__FieldOptionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2380:1: ( rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 )
            // InternalCalculatorForm.g:2381:2: rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5
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
    // InternalCalculatorForm.g:2388:1: rule__FieldOptionGroup__Group__4__Impl : ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) ;
    public final void rule__FieldOptionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2392:1: ( ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) )
            // InternalCalculatorForm.g:2393:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:2393:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            // InternalCalculatorForm.g:2394:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getOptionsAssignment_4()); 
            }
            // InternalCalculatorForm.g:2395:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalCalculatorForm.g:2395:3: rule__FieldOptionGroup__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FieldOptionGroup__OptionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalCalculatorForm.g:2403:1: rule__FieldOptionGroup__Group__5 : rule__FieldOptionGroup__Group__5__Impl ;
    public final void rule__FieldOptionGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2407:1: ( rule__FieldOptionGroup__Group__5__Impl )
            // InternalCalculatorForm.g:2408:2: rule__FieldOptionGroup__Group__5__Impl
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
    // InternalCalculatorForm.g:2414:1: rule__FieldOptionGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldOptionGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2418:1: ( ( '}' ) )
            // InternalCalculatorForm.g:2419:1: ( '}' )
            {
            // InternalCalculatorForm.g:2419:1: ( '}' )
            // InternalCalculatorForm.g:2420:2: '}'
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
    // InternalCalculatorForm.g:2430:1: rule__FieldOptionGroup__Group_2__0 : rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 ;
    public final void rule__FieldOptionGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2434:1: ( rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 )
            // InternalCalculatorForm.g:2435:2: rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1
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
    // InternalCalculatorForm.g:2442:1: rule__FieldOptionGroup__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__FieldOptionGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2446:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2447:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2447:1: ( 'label' )
            // InternalCalculatorForm.g:2448:2: 'label'
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
    // InternalCalculatorForm.g:2457:1: rule__FieldOptionGroup__Group_2__1 : rule__FieldOptionGroup__Group_2__1__Impl ;
    public final void rule__FieldOptionGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2461:1: ( rule__FieldOptionGroup__Group_2__1__Impl )
            // InternalCalculatorForm.g:2462:2: rule__FieldOptionGroup__Group_2__1__Impl
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
    // InternalCalculatorForm.g:2468:1: rule__FieldOptionGroup__Group_2__1__Impl : ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) ;
    public final void rule__FieldOptionGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2472:1: ( ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:2473:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:2473:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:2474:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLabelAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:2475:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:2475:3: rule__FieldOptionGroup__LabelAssignment_2_1
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
    // InternalCalculatorForm.g:2484:1: rule__FieldChoice__Group__0 : rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 ;
    public final void rule__FieldChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2488:1: ( rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 )
            // InternalCalculatorForm.g:2489:2: rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1
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
    // InternalCalculatorForm.g:2496:1: rule__FieldChoice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__FieldChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2500:1: ( ( 'choice' ) )
            // InternalCalculatorForm.g:2501:1: ( 'choice' )
            {
            // InternalCalculatorForm.g:2501:1: ( 'choice' )
            // InternalCalculatorForm.g:2502:2: 'choice'
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
    // InternalCalculatorForm.g:2511:1: rule__FieldChoice__Group__1 : rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 ;
    public final void rule__FieldChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2515:1: ( rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 )
            // InternalCalculatorForm.g:2516:2: rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2
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
    // InternalCalculatorForm.g:2523:1: rule__FieldChoice__Group__1__Impl : ( ( rule__FieldChoice__NameAssignment_1 ) ) ;
    public final void rule__FieldChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2527:1: ( ( ( rule__FieldChoice__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:2528:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2528:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            // InternalCalculatorForm.g:2529:2: ( rule__FieldChoice__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:2530:2: ( rule__FieldChoice__NameAssignment_1 )
            // InternalCalculatorForm.g:2530:3: rule__FieldChoice__NameAssignment_1
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
    // InternalCalculatorForm.g:2538:1: rule__FieldChoice__Group__2 : rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 ;
    public final void rule__FieldChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2542:1: ( rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 )
            // InternalCalculatorForm.g:2543:2: rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3
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
    // InternalCalculatorForm.g:2550:1: rule__FieldChoice__Group__2__Impl : ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2554:1: ( ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:2555:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2555:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:2556:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:2557:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCalculatorForm.g:2557:3: rule__FieldChoice__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:2565:1: rule__FieldChoice__Group__3 : rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 ;
    public final void rule__FieldChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2569:1: ( rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 )
            // InternalCalculatorForm.g:2570:2: rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4
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
    // InternalCalculatorForm.g:2577:1: rule__FieldChoice__Group__3__Impl : ( ( rule__FieldChoice__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2581:1: ( ( ( rule__FieldChoice__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2582:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2582:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:2583:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedAssignment_3()); 
            }
            // InternalCalculatorForm.g:2584:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCalculatorForm.g:2584:3: rule__FieldChoice__CheckedAssignment_3
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
    // InternalCalculatorForm.g:2592:1: rule__FieldChoice__Group__4 : rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 ;
    public final void rule__FieldChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2596:1: ( rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 )
            // InternalCalculatorForm.g:2597:2: rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5
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
    // InternalCalculatorForm.g:2604:1: rule__FieldChoice__Group__4__Impl : ( ( rule__FieldChoice__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2608:1: ( ( ( rule__FieldChoice__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:2609:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:2609:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:2610:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:2611:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCalculatorForm.g:2611:3: rule__FieldChoice__DisabledAssignment_4
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
    // InternalCalculatorForm.g:2619:1: rule__FieldChoice__Group__5 : rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 ;
    public final void rule__FieldChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2623:1: ( rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 )
            // InternalCalculatorForm.g:2624:2: rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6
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
    // InternalCalculatorForm.g:2631:1: rule__FieldChoice__Group__5__Impl : ( ( rule__FieldChoice__Group_5__0 )? ) ;
    public final void rule__FieldChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2635:1: ( ( ( rule__FieldChoice__Group_5__0 )? ) )
            // InternalCalculatorForm.g:2636:1: ( ( rule__FieldChoice__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:2636:1: ( ( rule__FieldChoice__Group_5__0 )? )
            // InternalCalculatorForm.g:2637:2: ( rule__FieldChoice__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:2638:2: ( rule__FieldChoice__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==13) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCalculatorForm.g:2638:3: rule__FieldChoice__Group_5__0
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
    // InternalCalculatorForm.g:2646:1: rule__FieldChoice__Group__6 : rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 ;
    public final void rule__FieldChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2650:1: ( rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 )
            // InternalCalculatorForm.g:2651:2: rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7
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
    // InternalCalculatorForm.g:2658:1: rule__FieldChoice__Group__6__Impl : ( ( rule__FieldChoice__Group_6__0 )? ) ;
    public final void rule__FieldChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2662:1: ( ( ( rule__FieldChoice__Group_6__0 )? ) )
            // InternalCalculatorForm.g:2663:1: ( ( rule__FieldChoice__Group_6__0 )? )
            {
            // InternalCalculatorForm.g:2663:1: ( ( rule__FieldChoice__Group_6__0 )? )
            // InternalCalculatorForm.g:2664:2: ( rule__FieldChoice__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_6()); 
            }
            // InternalCalculatorForm.g:2665:2: ( rule__FieldChoice__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==17) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCalculatorForm.g:2665:3: rule__FieldChoice__Group_6__0
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
    // InternalCalculatorForm.g:2673:1: rule__FieldChoice__Group__7 : rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 ;
    public final void rule__FieldChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2677:1: ( rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 )
            // InternalCalculatorForm.g:2678:2: rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8
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
    // InternalCalculatorForm.g:2685:1: rule__FieldChoice__Group__7__Impl : ( ( rule__FieldChoice__MultipleAssignment_7 )? ) ;
    public final void rule__FieldChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2689:1: ( ( ( rule__FieldChoice__MultipleAssignment_7 )? ) )
            // InternalCalculatorForm.g:2690:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            {
            // InternalCalculatorForm.g:2690:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            // InternalCalculatorForm.g:2691:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleAssignment_7()); 
            }
            // InternalCalculatorForm.g:2692:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCalculatorForm.g:2692:3: rule__FieldChoice__MultipleAssignment_7
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
    // InternalCalculatorForm.g:2700:1: rule__FieldChoice__Group__8 : rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 ;
    public final void rule__FieldChoice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2704:1: ( rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 )
            // InternalCalculatorForm.g:2705:2: rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9
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
    // InternalCalculatorForm.g:2712:1: rule__FieldChoice__Group__8__Impl : ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) ;
    public final void rule__FieldChoice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2716:1: ( ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) )
            // InternalCalculatorForm.g:2717:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            {
            // InternalCalculatorForm.g:2717:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            // InternalCalculatorForm.g:2718:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedAssignment_8()); 
            }
            // InternalCalculatorForm.g:2719:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCalculatorForm.g:2719:3: rule__FieldChoice__NotdisplayedAssignment_8
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
    // InternalCalculatorForm.g:2727:1: rule__FieldChoice__Group__9 : rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 ;
    public final void rule__FieldChoice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2731:1: ( rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 )
            // InternalCalculatorForm.g:2732:2: rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10
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
    // InternalCalculatorForm.g:2739:1: rule__FieldChoice__Group__9__Impl : ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) ;
    public final void rule__FieldChoice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2743:1: ( ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) )
            // InternalCalculatorForm.g:2744:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            {
            // InternalCalculatorForm.g:2744:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            // InternalCalculatorForm.g:2745:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyAssignment_9()); 
            }
            // InternalCalculatorForm.g:2746:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCalculatorForm.g:2746:3: rule__FieldChoice__ReadonlyAssignment_9
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
    // InternalCalculatorForm.g:2754:1: rule__FieldChoice__Group__10 : rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 ;
    public final void rule__FieldChoice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2758:1: ( rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 )
            // InternalCalculatorForm.g:2759:2: rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11
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
    // InternalCalculatorForm.g:2766:1: rule__FieldChoice__Group__10__Impl : ( ( rule__FieldChoice__RequiredAssignment_10 )? ) ;
    public final void rule__FieldChoice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2770:1: ( ( ( rule__FieldChoice__RequiredAssignment_10 )? ) )
            // InternalCalculatorForm.g:2771:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            {
            // InternalCalculatorForm.g:2771:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            // InternalCalculatorForm.g:2772:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredAssignment_10()); 
            }
            // InternalCalculatorForm.g:2773:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==42) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCalculatorForm.g:2773:3: rule__FieldChoice__RequiredAssignment_10
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
    // InternalCalculatorForm.g:2781:1: rule__FieldChoice__Group__11 : rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 ;
    public final void rule__FieldChoice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2785:1: ( rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 )
            // InternalCalculatorForm.g:2786:2: rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12
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
    // InternalCalculatorForm.g:2793:1: rule__FieldChoice__Group__11__Impl : ( ( rule__FieldChoice__Group_11__0 )? ) ;
    public final void rule__FieldChoice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2797:1: ( ( ( rule__FieldChoice__Group_11__0 )? ) )
            // InternalCalculatorForm.g:2798:1: ( ( rule__FieldChoice__Group_11__0 )? )
            {
            // InternalCalculatorForm.g:2798:1: ( ( rule__FieldChoice__Group_11__0 )? )
            // InternalCalculatorForm.g:2799:2: ( rule__FieldChoice__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_11()); 
            }
            // InternalCalculatorForm.g:2800:2: ( rule__FieldChoice__Group_11__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==18) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCalculatorForm.g:2800:3: rule__FieldChoice__Group_11__0
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
    // InternalCalculatorForm.g:2808:1: rule__FieldChoice__Group__12 : rule__FieldChoice__Group__12__Impl ;
    public final void rule__FieldChoice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2812:1: ( rule__FieldChoice__Group__12__Impl )
            // InternalCalculatorForm.g:2813:2: rule__FieldChoice__Group__12__Impl
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
    // InternalCalculatorForm.g:2819:1: rule__FieldChoice__Group__12__Impl : ( ( rule__FieldChoice__Group_12__0 )? ) ;
    public final void rule__FieldChoice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2823:1: ( ( ( rule__FieldChoice__Group_12__0 )? ) )
            // InternalCalculatorForm.g:2824:1: ( ( rule__FieldChoice__Group_12__0 )? )
            {
            // InternalCalculatorForm.g:2824:1: ( ( rule__FieldChoice__Group_12__0 )? )
            // InternalCalculatorForm.g:2825:2: ( rule__FieldChoice__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_12()); 
            }
            // InternalCalculatorForm.g:2826:2: ( rule__FieldChoice__Group_12__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==14) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCalculatorForm.g:2826:3: rule__FieldChoice__Group_12__0
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
    // InternalCalculatorForm.g:2835:1: rule__FieldChoice__Group_5__0 : rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 ;
    public final void rule__FieldChoice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2839:1: ( rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 )
            // InternalCalculatorForm.g:2840:2: rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1
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
    // InternalCalculatorForm.g:2847:1: rule__FieldChoice__Group_5__0__Impl : ( 'form' ) ;
    public final void rule__FieldChoice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2851:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:2852:1: ( 'form' )
            {
            // InternalCalculatorForm.g:2852:1: ( 'form' )
            // InternalCalculatorForm.g:2853:2: 'form'
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
    // InternalCalculatorForm.g:2862:1: rule__FieldChoice__Group_5__1 : rule__FieldChoice__Group_5__1__Impl ;
    public final void rule__FieldChoice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2866:1: ( rule__FieldChoice__Group_5__1__Impl )
            // InternalCalculatorForm.g:2867:2: rule__FieldChoice__Group_5__1__Impl
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
    // InternalCalculatorForm.g:2873:1: rule__FieldChoice__Group_5__1__Impl : ( ( rule__FieldChoice__FormAssignment_5_1 ) ) ;
    public final void rule__FieldChoice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2877:1: ( ( ( rule__FieldChoice__FormAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2878:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2878:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            // InternalCalculatorForm.g:2879:2: ( rule__FieldChoice__FormAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getFormAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:2880:2: ( rule__FieldChoice__FormAssignment_5_1 )
            // InternalCalculatorForm.g:2880:3: rule__FieldChoice__FormAssignment_5_1
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
    // InternalCalculatorForm.g:2889:1: rule__FieldChoice__Group_6__0 : rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 ;
    public final void rule__FieldChoice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2893:1: ( rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 )
            // InternalCalculatorForm.g:2894:2: rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1
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
    // InternalCalculatorForm.g:2901:1: rule__FieldChoice__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__FieldChoice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2905:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2906:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2906:1: ( 'label' )
            // InternalCalculatorForm.g:2907:2: 'label'
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
    // InternalCalculatorForm.g:2916:1: rule__FieldChoice__Group_6__1 : rule__FieldChoice__Group_6__1__Impl ;
    public final void rule__FieldChoice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2920:1: ( rule__FieldChoice__Group_6__1__Impl )
            // InternalCalculatorForm.g:2921:2: rule__FieldChoice__Group_6__1__Impl
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
    // InternalCalculatorForm.g:2927:1: rule__FieldChoice__Group_6__1__Impl : ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) ;
    public final void rule__FieldChoice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2931:1: ( ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) )
            // InternalCalculatorForm.g:2932:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            {
            // InternalCalculatorForm.g:2932:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            // InternalCalculatorForm.g:2933:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLabelAssignment_6_1()); 
            }
            // InternalCalculatorForm.g:2934:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            // InternalCalculatorForm.g:2934:3: rule__FieldChoice__LabelAssignment_6_1
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
    // InternalCalculatorForm.g:2943:1: rule__FieldChoice__Group_11__0 : rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 ;
    public final void rule__FieldChoice__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2947:1: ( rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 )
            // InternalCalculatorForm.g:2948:2: rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1
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
    // InternalCalculatorForm.g:2955:1: rule__FieldChoice__Group_11__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoice__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2959:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:2960:1: ( 'value' )
            {
            // InternalCalculatorForm.g:2960:1: ( 'value' )
            // InternalCalculatorForm.g:2961:2: 'value'
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
    // InternalCalculatorForm.g:2970:1: rule__FieldChoice__Group_11__1 : rule__FieldChoice__Group_11__1__Impl ;
    public final void rule__FieldChoice__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2974:1: ( rule__FieldChoice__Group_11__1__Impl )
            // InternalCalculatorForm.g:2975:2: rule__FieldChoice__Group_11__1__Impl
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
    // InternalCalculatorForm.g:2981:1: rule__FieldChoice__Group_11__1__Impl : ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) ;
    public final void rule__FieldChoice__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2985:1: ( ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) )
            // InternalCalculatorForm.g:2986:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            {
            // InternalCalculatorForm.g:2986:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            // InternalCalculatorForm.g:2987:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getValueAssignment_11_1()); 
            }
            // InternalCalculatorForm.g:2988:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            // InternalCalculatorForm.g:2988:3: rule__FieldChoice__ValueAssignment_11_1
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
    // InternalCalculatorForm.g:2997:1: rule__FieldChoice__Group_12__0 : rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 ;
    public final void rule__FieldChoice__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3001:1: ( rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 )
            // InternalCalculatorForm.g:3002:2: rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1
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
    // InternalCalculatorForm.g:3009:1: rule__FieldChoice__Group_12__0__Impl : ( '{' ) ;
    public final void rule__FieldChoice__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3013:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3014:1: ( '{' )
            {
            // InternalCalculatorForm.g:3014:1: ( '{' )
            // InternalCalculatorForm.g:3015:2: '{'
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
    // InternalCalculatorForm.g:3024:1: rule__FieldChoice__Group_12__1 : rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 ;
    public final void rule__FieldChoice__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3028:1: ( rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 )
            // InternalCalculatorForm.g:3029:2: rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2
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
    // InternalCalculatorForm.g:3036:1: rule__FieldChoice__Group_12__1__Impl : ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) ;
    public final void rule__FieldChoice__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3040:1: ( ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) )
            // InternalCalculatorForm.g:3041:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            {
            // InternalCalculatorForm.g:3041:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            // InternalCalculatorForm.g:3042:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getOptionsAssignment_12_1()); 
            }
            // InternalCalculatorForm.g:3043:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==21) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCalculatorForm.g:3043:3: rule__FieldChoice__OptionsAssignment_12_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FieldChoice__OptionsAssignment_12_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalCalculatorForm.g:3051:1: rule__FieldChoice__Group_12__2 : rule__FieldChoice__Group_12__2__Impl ;
    public final void rule__FieldChoice__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3055:1: ( rule__FieldChoice__Group_12__2__Impl )
            // InternalCalculatorForm.g:3056:2: rule__FieldChoice__Group_12__2__Impl
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
    // InternalCalculatorForm.g:3062:1: rule__FieldChoice__Group_12__2__Impl : ( '}' ) ;
    public final void rule__FieldChoice__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3066:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3067:1: ( '}' )
            {
            // InternalCalculatorForm.g:3067:1: ( '}' )
            // InternalCalculatorForm.g:3068:2: '}'
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
    // InternalCalculatorForm.g:3078:1: rule__FieldChoiceOption__Group__0 : rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 ;
    public final void rule__FieldChoiceOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3082:1: ( rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 )
            // InternalCalculatorForm.g:3083:2: rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1
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
    // InternalCalculatorForm.g:3090:1: rule__FieldChoiceOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldChoiceOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3094:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:3095:1: ( 'option' )
            {
            // InternalCalculatorForm.g:3095:1: ( 'option' )
            // InternalCalculatorForm.g:3096:2: 'option'
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
    // InternalCalculatorForm.g:3105:1: rule__FieldChoiceOption__Group__1 : rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 ;
    public final void rule__FieldChoiceOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3109:1: ( rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 )
            // InternalCalculatorForm.g:3110:2: rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2
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
    // InternalCalculatorForm.g:3117:1: rule__FieldChoiceOption__Group__1__Impl : ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) ;
    public final void rule__FieldChoiceOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3121:1: ( ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) )
            // InternalCalculatorForm.g:3122:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3122:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            // InternalCalculatorForm.g:3123:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getLabelAssignment_1()); 
            }
            // InternalCalculatorForm.g:3124:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            // InternalCalculatorForm.g:3124:3: rule__FieldChoiceOption__LabelAssignment_1
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
    // InternalCalculatorForm.g:3132:1: rule__FieldChoiceOption__Group__2 : rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 ;
    public final void rule__FieldChoiceOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3136:1: ( rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 )
            // InternalCalculatorForm.g:3137:2: rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3
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
    // InternalCalculatorForm.g:3144:1: rule__FieldChoiceOption__Group__2__Impl : ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoiceOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3148:1: ( ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:3149:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:3149:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:3150:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:3151:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCalculatorForm.g:3151:3: rule__FieldChoiceOption__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:3159:1: rule__FieldChoiceOption__Group__3 : rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 ;
    public final void rule__FieldChoiceOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3163:1: ( rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 )
            // InternalCalculatorForm.g:3164:2: rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4
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
    // InternalCalculatorForm.g:3171:1: rule__FieldChoiceOption__Group__3__Impl : ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoiceOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3175:1: ( ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:3176:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:3176:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:3177:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedAssignment_3()); 
            }
            // InternalCalculatorForm.g:3178:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCalculatorForm.g:3178:3: rule__FieldChoiceOption__CheckedAssignment_3
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
    // InternalCalculatorForm.g:3186:1: rule__FieldChoiceOption__Group__4 : rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 ;
    public final void rule__FieldChoiceOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3190:1: ( rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 )
            // InternalCalculatorForm.g:3191:2: rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5
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
    // InternalCalculatorForm.g:3198:1: rule__FieldChoiceOption__Group__4__Impl : ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoiceOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3202:1: ( ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:3203:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:3203:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:3204:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:3205:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCalculatorForm.g:3205:3: rule__FieldChoiceOption__DisabledAssignment_4
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
    // InternalCalculatorForm.g:3213:1: rule__FieldChoiceOption__Group__5 : rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 ;
    public final void rule__FieldChoiceOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3217:1: ( rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 )
            // InternalCalculatorForm.g:3218:2: rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6
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
    // InternalCalculatorForm.g:3225:1: rule__FieldChoiceOption__Group__5__Impl : ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) ;
    public final void rule__FieldChoiceOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3229:1: ( ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) )
            // InternalCalculatorForm.g:3230:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            {
            // InternalCalculatorForm.g:3230:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            // InternalCalculatorForm.g:3231:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyAssignment_5()); 
            }
            // InternalCalculatorForm.g:3232:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCalculatorForm.g:3232:3: rule__FieldChoiceOption__ReadonlyAssignment_5
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
    // InternalCalculatorForm.g:3240:1: rule__FieldChoiceOption__Group__6 : rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 ;
    public final void rule__FieldChoiceOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3244:1: ( rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 )
            // InternalCalculatorForm.g:3245:2: rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7
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
    // InternalCalculatorForm.g:3252:1: rule__FieldChoiceOption__Group__6__Impl : ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) ;
    public final void rule__FieldChoiceOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3256:1: ( ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) )
            // InternalCalculatorForm.g:3257:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            {
            // InternalCalculatorForm.g:3257:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            // InternalCalculatorForm.g:3258:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredAssignment_6()); 
            }
            // InternalCalculatorForm.g:3259:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCalculatorForm.g:3259:3: rule__FieldChoiceOption__RequiredAssignment_6
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
    // InternalCalculatorForm.g:3267:1: rule__FieldChoiceOption__Group__7 : rule__FieldChoiceOption__Group__7__Impl ;
    public final void rule__FieldChoiceOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3271:1: ( rule__FieldChoiceOption__Group__7__Impl )
            // InternalCalculatorForm.g:3272:2: rule__FieldChoiceOption__Group__7__Impl
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
    // InternalCalculatorForm.g:3278:1: rule__FieldChoiceOption__Group__7__Impl : ( ( rule__FieldChoiceOption__Group_7__0 )? ) ;
    public final void rule__FieldChoiceOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3282:1: ( ( ( rule__FieldChoiceOption__Group_7__0 )? ) )
            // InternalCalculatorForm.g:3283:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            {
            // InternalCalculatorForm.g:3283:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            // InternalCalculatorForm.g:3284:2: ( rule__FieldChoiceOption__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getGroup_7()); 
            }
            // InternalCalculatorForm.g:3285:2: ( rule__FieldChoiceOption__Group_7__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==18) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCalculatorForm.g:3285:3: rule__FieldChoiceOption__Group_7__0
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
    // InternalCalculatorForm.g:3294:1: rule__FieldChoiceOption__Group_7__0 : rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 ;
    public final void rule__FieldChoiceOption__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3298:1: ( rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 )
            // InternalCalculatorForm.g:3299:2: rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1
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
    // InternalCalculatorForm.g:3306:1: rule__FieldChoiceOption__Group_7__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoiceOption__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3310:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3311:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3311:1: ( 'value' )
            // InternalCalculatorForm.g:3312:2: 'value'
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
    // InternalCalculatorForm.g:3321:1: rule__FieldChoiceOption__Group_7__1 : rule__FieldChoiceOption__Group_7__1__Impl ;
    public final void rule__FieldChoiceOption__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3325:1: ( rule__FieldChoiceOption__Group_7__1__Impl )
            // InternalCalculatorForm.g:3326:2: rule__FieldChoiceOption__Group_7__1__Impl
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
    // InternalCalculatorForm.g:3332:1: rule__FieldChoiceOption__Group_7__1__Impl : ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) ;
    public final void rule__FieldChoiceOption__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3336:1: ( ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) )
            // InternalCalculatorForm.g:3337:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            {
            // InternalCalculatorForm.g:3337:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            // InternalCalculatorForm.g:3338:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getValueAssignment_7_1()); 
            }
            // InternalCalculatorForm.g:3339:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            // InternalCalculatorForm.g:3339:3: rule__FieldChoiceOption__ValueAssignment_7_1
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
    // InternalCalculatorForm.g:3348:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3352:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalCalculatorForm.g:3353:2: rule__Group__Group__0__Impl rule__Group__Group__1
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
    // InternalCalculatorForm.g:3360:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3364:1: ( ( 'group' ) )
            // InternalCalculatorForm.g:3365:1: ( 'group' )
            {
            // InternalCalculatorForm.g:3365:1: ( 'group' )
            // InternalCalculatorForm.g:3366:2: 'group'
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
    // InternalCalculatorForm.g:3375:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3379:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalCalculatorForm.g:3380:2: rule__Group__Group__1__Impl rule__Group__Group__2
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
    // InternalCalculatorForm.g:3387:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3391:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:3392:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3392:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalCalculatorForm.g:3393:2: ( rule__Group__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:3394:2: ( rule__Group__NameAssignment_1 )
            // InternalCalculatorForm.g:3394:3: rule__Group__NameAssignment_1
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
    // InternalCalculatorForm.g:3402:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3406:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalCalculatorForm.g:3407:2: rule__Group__Group__2__Impl rule__Group__Group__3
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
    // InternalCalculatorForm.g:3414:1: rule__Group__Group__2__Impl : ( ( rule__Group__Group_2__0 )? ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3418:1: ( ( ( rule__Group__Group_2__0 )? ) )
            // InternalCalculatorForm.g:3419:1: ( ( rule__Group__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:3419:1: ( ( rule__Group__Group_2__0 )? )
            // InternalCalculatorForm.g:3420:2: ( rule__Group__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup_2()); 
            }
            // InternalCalculatorForm.g:3421:2: ( rule__Group__Group_2__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==17) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCalculatorForm.g:3421:3: rule__Group__Group_2__0
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
    // InternalCalculatorForm.g:3429:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3433:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalCalculatorForm.g:3434:2: rule__Group__Group__3__Impl rule__Group__Group__4
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
    // InternalCalculatorForm.g:3441:1: rule__Group__Group__3__Impl : ( '{' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3445:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3446:1: ( '{' )
            {
            // InternalCalculatorForm.g:3446:1: ( '{' )
            // InternalCalculatorForm.g:3447:2: '{'
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
    // InternalCalculatorForm.g:3456:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3460:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalCalculatorForm.g:3461:2: rule__Group__Group__4__Impl rule__Group__Group__5
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
    // InternalCalculatorForm.g:3468:1: rule__Group__Group__4__Impl : ( ( rule__Group__FieldsAssignment_4 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3472:1: ( ( ( rule__Group__FieldsAssignment_4 )* ) )
            // InternalCalculatorForm.g:3473:1: ( ( rule__Group__FieldsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:3473:1: ( ( rule__Group__FieldsAssignment_4 )* )
            // InternalCalculatorForm.g:3474:2: ( rule__Group__FieldsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getFieldsAssignment_4()); 
            }
            // InternalCalculatorForm.g:3475:2: ( rule__Group__FieldsAssignment_4 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==16||LA56_0==19||LA56_0==24||LA56_0==27) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCalculatorForm.g:3475:3: rule__Group__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Group__FieldsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalCalculatorForm.g:3483:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3487:1: ( rule__Group__Group__5__Impl )
            // InternalCalculatorForm.g:3488:2: rule__Group__Group__5__Impl
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
    // InternalCalculatorForm.g:3494:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3498:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3499:1: ( '}' )
            {
            // InternalCalculatorForm.g:3499:1: ( '}' )
            // InternalCalculatorForm.g:3500:2: '}'
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
    // InternalCalculatorForm.g:3510:1: rule__Group__Group_2__0 : rule__Group__Group_2__0__Impl rule__Group__Group_2__1 ;
    public final void rule__Group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3514:1: ( rule__Group__Group_2__0__Impl rule__Group__Group_2__1 )
            // InternalCalculatorForm.g:3515:2: rule__Group__Group_2__0__Impl rule__Group__Group_2__1
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
    // InternalCalculatorForm.g:3522:1: rule__Group__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__Group__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3526:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:3527:1: ( 'label' )
            {
            // InternalCalculatorForm.g:3527:1: ( 'label' )
            // InternalCalculatorForm.g:3528:2: 'label'
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
    // InternalCalculatorForm.g:3537:1: rule__Group__Group_2__1 : rule__Group__Group_2__1__Impl ;
    public final void rule__Group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3541:1: ( rule__Group__Group_2__1__Impl )
            // InternalCalculatorForm.g:3542:2: rule__Group__Group_2__1__Impl
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
    // InternalCalculatorForm.g:3548:1: rule__Group__Group_2__1__Impl : ( ( rule__Group__LabelAssignment_2_1 ) ) ;
    public final void rule__Group__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3552:1: ( ( ( rule__Group__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:3553:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:3553:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:3554:2: ( rule__Group__LabelAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLabelAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:3555:2: ( rule__Group__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:3555:3: rule__Group__LabelAssignment_2_1
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
    // InternalCalculatorForm.g:3564:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3568:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalCalculatorForm.g:3569:2: rule__Page__Group__0__Impl rule__Page__Group__1
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
    // InternalCalculatorForm.g:3576:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3580:1: ( ( 'page' ) )
            // InternalCalculatorForm.g:3581:1: ( 'page' )
            {
            // InternalCalculatorForm.g:3581:1: ( 'page' )
            // InternalCalculatorForm.g:3582:2: 'page'
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
    // InternalCalculatorForm.g:3591:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3595:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalCalculatorForm.g:3596:2: rule__Page__Group__1__Impl rule__Page__Group__2
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
    // InternalCalculatorForm.g:3603:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3607:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3608:1: ( '{' )
            {
            // InternalCalculatorForm.g:3608:1: ( '{' )
            // InternalCalculatorForm.g:3609:2: '{'
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
    // InternalCalculatorForm.g:3618:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3622:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalCalculatorForm.g:3623:2: rule__Page__Group__2__Impl rule__Page__Group__3
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
    // InternalCalculatorForm.g:3630:1: rule__Page__Group__2__Impl : ( ( rule__Page__ChildsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3634:1: ( ( ( rule__Page__ChildsAssignment_2 )* ) )
            // InternalCalculatorForm.g:3635:1: ( ( rule__Page__ChildsAssignment_2 )* )
            {
            // InternalCalculatorForm.g:3635:1: ( ( rule__Page__ChildsAssignment_2 )* )
            // InternalCalculatorForm.g:3636:2: ( rule__Page__ChildsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getChildsAssignment_2()); 
            }
            // InternalCalculatorForm.g:3637:2: ( rule__Page__ChildsAssignment_2 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==16||LA57_0==19||(LA57_0>=24 && LA57_0<=25)||LA57_0==27) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalCalculatorForm.g:3637:3: rule__Page__ChildsAssignment_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Page__ChildsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalCalculatorForm.g:3645:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3649:1: ( rule__Page__Group__3__Impl )
            // InternalCalculatorForm.g:3650:2: rule__Page__Group__3__Impl
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
    // InternalCalculatorForm.g:3656:1: rule__Page__Group__3__Impl : ( '}' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3660:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3661:1: ( '}' )
            {
            // InternalCalculatorForm.g:3661:1: ( '}' )
            // InternalCalculatorForm.g:3662:2: '}'
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
    // InternalCalculatorForm.g:3672:1: rule__ButtonSubmit__Group__0 : rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 ;
    public final void rule__ButtonSubmit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3676:1: ( rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 )
            // InternalCalculatorForm.g:3677:2: rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1
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
    // InternalCalculatorForm.g:3684:1: rule__ButtonSubmit__Group__0__Impl : ( 'submit-button' ) ;
    public final void rule__ButtonSubmit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3688:1: ( ( 'submit-button' ) )
            // InternalCalculatorForm.g:3689:1: ( 'submit-button' )
            {
            // InternalCalculatorForm.g:3689:1: ( 'submit-button' )
            // InternalCalculatorForm.g:3690:2: 'submit-button'
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
    // InternalCalculatorForm.g:3699:1: rule__ButtonSubmit__Group__1 : rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 ;
    public final void rule__ButtonSubmit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3703:1: ( rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 )
            // InternalCalculatorForm.g:3704:2: rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2
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
    // InternalCalculatorForm.g:3711:1: rule__ButtonSubmit__Group__1__Impl : ( ( rule__ButtonSubmit__NameAssignment_1 ) ) ;
    public final void rule__ButtonSubmit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3715:1: ( ( ( rule__ButtonSubmit__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:3716:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3716:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            // InternalCalculatorForm.g:3717:2: ( rule__ButtonSubmit__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:3718:2: ( rule__ButtonSubmit__NameAssignment_1 )
            // InternalCalculatorForm.g:3718:3: rule__ButtonSubmit__NameAssignment_1
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
    // InternalCalculatorForm.g:3726:1: rule__ButtonSubmit__Group__2 : rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 ;
    public final void rule__ButtonSubmit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3730:1: ( rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 )
            // InternalCalculatorForm.g:3731:2: rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3
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
    // InternalCalculatorForm.g:3738:1: rule__ButtonSubmit__Group__2__Impl : ( ( rule__ButtonSubmit__TextAssignment_2 ) ) ;
    public final void rule__ButtonSubmit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3742:1: ( ( ( rule__ButtonSubmit__TextAssignment_2 ) ) )
            // InternalCalculatorForm.g:3743:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            {
            // InternalCalculatorForm.g:3743:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            // InternalCalculatorForm.g:3744:2: ( rule__ButtonSubmit__TextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getTextAssignment_2()); 
            }
            // InternalCalculatorForm.g:3745:2: ( rule__ButtonSubmit__TextAssignment_2 )
            // InternalCalculatorForm.g:3745:3: rule__ButtonSubmit__TextAssignment_2
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
    // InternalCalculatorForm.g:3753:1: rule__ButtonSubmit__Group__3 : rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 ;
    public final void rule__ButtonSubmit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3757:1: ( rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 )
            // InternalCalculatorForm.g:3758:2: rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4
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
    // InternalCalculatorForm.g:3765:1: rule__ButtonSubmit__Group__3__Impl : ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) ;
    public final void rule__ButtonSubmit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3769:1: ( ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) )
            // InternalCalculatorForm.g:3770:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            {
            // InternalCalculatorForm.g:3770:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            // InternalCalculatorForm.g:3771:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAssignment_3()); 
            }
            // InternalCalculatorForm.g:3772:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCalculatorForm.g:3772:3: rule__ButtonSubmit__AutofocusAssignment_3
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
    // InternalCalculatorForm.g:3780:1: rule__ButtonSubmit__Group__4 : rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 ;
    public final void rule__ButtonSubmit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3784:1: ( rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 )
            // InternalCalculatorForm.g:3785:2: rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5
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
    // InternalCalculatorForm.g:3792:1: rule__ButtonSubmit__Group__4__Impl : ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) ;
    public final void rule__ButtonSubmit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3796:1: ( ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:3797:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:3797:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:3798:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:3799:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCalculatorForm.g:3799:3: rule__ButtonSubmit__DisabledAssignment_4
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
    // InternalCalculatorForm.g:3807:1: rule__ButtonSubmit__Group__5 : rule__ButtonSubmit__Group__5__Impl ;
    public final void rule__ButtonSubmit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3811:1: ( rule__ButtonSubmit__Group__5__Impl )
            // InternalCalculatorForm.g:3812:2: rule__ButtonSubmit__Group__5__Impl
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
    // InternalCalculatorForm.g:3818:1: rule__ButtonSubmit__Group__5__Impl : ( ( rule__ButtonSubmit__Group_5__0 )? ) ;
    public final void rule__ButtonSubmit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3822:1: ( ( ( rule__ButtonSubmit__Group_5__0 )? ) )
            // InternalCalculatorForm.g:3823:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:3823:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            // InternalCalculatorForm.g:3824:2: ( rule__ButtonSubmit__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:3825:2: ( rule__ButtonSubmit__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==18) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCalculatorForm.g:3825:3: rule__ButtonSubmit__Group_5__0
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
    // InternalCalculatorForm.g:3834:1: rule__ButtonSubmit__Group_5__0 : rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 ;
    public final void rule__ButtonSubmit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3838:1: ( rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 )
            // InternalCalculatorForm.g:3839:2: rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1
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
    // InternalCalculatorForm.g:3846:1: rule__ButtonSubmit__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__ButtonSubmit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3850:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3851:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3851:1: ( 'value' )
            // InternalCalculatorForm.g:3852:2: 'value'
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
    // InternalCalculatorForm.g:3861:1: rule__ButtonSubmit__Group_5__1 : rule__ButtonSubmit__Group_5__1__Impl ;
    public final void rule__ButtonSubmit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3865:1: ( rule__ButtonSubmit__Group_5__1__Impl )
            // InternalCalculatorForm.g:3866:2: rule__ButtonSubmit__Group_5__1__Impl
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
    // InternalCalculatorForm.g:3872:1: rule__ButtonSubmit__Group_5__1__Impl : ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) ;
    public final void rule__ButtonSubmit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3876:1: ( ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:3877:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:3877:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:3878:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getValueAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:3879:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:3879:3: rule__ButtonSubmit__ValueAssignment_5_1
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
    // InternalCalculatorForm.g:3888:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3892:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalCalculatorForm.g:3893:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalCalculatorForm.g:3900:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3904:1: ( ( 'calculate' ) )
            // InternalCalculatorForm.g:3905:1: ( 'calculate' )
            {
            // InternalCalculatorForm.g:3905:1: ( 'calculate' )
            // InternalCalculatorForm.g:3906:2: 'calculate'
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
    // InternalCalculatorForm.g:3915:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3919:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalCalculatorForm.g:3920:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalCalculatorForm.g:3927:1: rule__Calculate__Group__1__Impl : ( ( rule__Calculate__ResultAssignment_1 ) ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3931:1: ( ( ( rule__Calculate__ResultAssignment_1 ) ) )
            // InternalCalculatorForm.g:3932:1: ( ( rule__Calculate__ResultAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3932:1: ( ( rule__Calculate__ResultAssignment_1 ) )
            // InternalCalculatorForm.g:3933:2: ( rule__Calculate__ResultAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getResultAssignment_1()); 
            }
            // InternalCalculatorForm.g:3934:2: ( rule__Calculate__ResultAssignment_1 )
            // InternalCalculatorForm.g:3934:3: rule__Calculate__ResultAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__ResultAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getResultAssignment_1()); 
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
    // InternalCalculatorForm.g:3942:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3946:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalCalculatorForm.g:3947:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalCalculatorForm.g:3954:1: rule__Calculate__Group__2__Impl : ( '=' ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3958:1: ( ( '=' ) )
            // InternalCalculatorForm.g:3959:1: ( '=' )
            {
            // InternalCalculatorForm.g:3959:1: ( '=' )
            // InternalCalculatorForm.g:3960:2: '='
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
    // InternalCalculatorForm.g:3969:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3973:1: ( rule__Calculate__Group__3__Impl )
            // InternalCalculatorForm.g:3974:2: rule__Calculate__Group__3__Impl
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
    // InternalCalculatorForm.g:3980:1: rule__Calculate__Group__3__Impl : ( ( rule__Calculate__ExpressionAssignment_3 ) ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3984:1: ( ( ( rule__Calculate__ExpressionAssignment_3 ) ) )
            // InternalCalculatorForm.g:3985:1: ( ( rule__Calculate__ExpressionAssignment_3 ) )
            {
            // InternalCalculatorForm.g:3985:1: ( ( rule__Calculate__ExpressionAssignment_3 ) )
            // InternalCalculatorForm.g:3986:2: ( rule__Calculate__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getExpressionAssignment_3()); 
            }
            // InternalCalculatorForm.g:3987:2: ( rule__Calculate__ExpressionAssignment_3 )
            // InternalCalculatorForm.g:3987:3: rule__Calculate__ExpressionAssignment_3
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalCalculatorForm.g:3996:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4000:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCalculatorForm.g:4001:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalCalculatorForm.g:4008:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4012:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4013:1: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4013:1: ( RULE_ID )
            // InternalCalculatorForm.g:4014:2: RULE_ID
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
    // InternalCalculatorForm.g:4023:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4027:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCalculatorForm.g:4028:2: rule__QualifiedName__Group__1__Impl
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
    // InternalCalculatorForm.g:4034:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4038:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCalculatorForm.g:4039:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:4039:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCalculatorForm.g:4040:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:4041:2: ( rule__QualifiedName__Group_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==30) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalCalculatorForm.g:4041:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalCalculatorForm.g:4050:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4054:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCalculatorForm.g:4055:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalCalculatorForm.g:4062:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4066:1: ( ( '.' ) )
            // InternalCalculatorForm.g:4067:1: ( '.' )
            {
            // InternalCalculatorForm.g:4067:1: ( '.' )
            // InternalCalculatorForm.g:4068:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4077:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4081:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCalculatorForm.g:4082:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalCalculatorForm.g:4088:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4092:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4093:1: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4093:1: ( RULE_ID )
            // InternalCalculatorForm.g:4094:2: RULE_ID
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
    // InternalCalculatorForm.g:4104:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4108:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalCalculatorForm.g:4109:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalCalculatorForm.g:4116:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4120:1: ( ( ruleMultiplication ) )
            // InternalCalculatorForm.g:4121:1: ( ruleMultiplication )
            {
            // InternalCalculatorForm.g:4121:1: ( ruleMultiplication )
            // InternalCalculatorForm.g:4122:2: ruleMultiplication
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
    // InternalCalculatorForm.g:4131:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4135:1: ( rule__Addition__Group__1__Impl )
            // InternalCalculatorForm.g:4136:2: rule__Addition__Group__1__Impl
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
    // InternalCalculatorForm.g:4142:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4146:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalCalculatorForm.g:4147:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:4147:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalCalculatorForm.g:4148:2: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:4149:2: ( rule__Addition__Group_1__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=31 && LA62_0<=32)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCalculatorForm.g:4149:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalCalculatorForm.g:4158:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4162:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalCalculatorForm.g:4163:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCalculatorForm.g:4170:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4174:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalCalculatorForm.g:4175:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalCalculatorForm.g:4175:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalCalculatorForm.g:4176:2: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // InternalCalculatorForm.g:4177:2: ( rule__Addition__Alternatives_1_0 )
            // InternalCalculatorForm.g:4177:3: rule__Addition__Alternatives_1_0
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
    // InternalCalculatorForm.g:4185:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4189:1: ( rule__Addition__Group_1__1__Impl )
            // InternalCalculatorForm.g:4190:2: rule__Addition__Group_1__1__Impl
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
    // InternalCalculatorForm.g:4196:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4200:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:4201:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:4201:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalCalculatorForm.g:4202:2: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:4203:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalCalculatorForm.g:4203:3: rule__Addition__RightAssignment_1_1
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
    // InternalCalculatorForm.g:4212:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4216:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalCalculatorForm.g:4217:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCalculatorForm.g:4224:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4228:1: ( ( () ) )
            // InternalCalculatorForm.g:4229:1: ( () )
            {
            // InternalCalculatorForm.g:4229:1: ( () )
            // InternalCalculatorForm.g:4230:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalCalculatorForm.g:4231:2: ()
            // InternalCalculatorForm.g:4231:3: 
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
    // InternalCalculatorForm.g:4239:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4243:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalCalculatorForm.g:4244:2: rule__Addition__Group_1_0_0__1__Impl
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
    // InternalCalculatorForm.g:4250:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4254:1: ( ( '+' ) )
            // InternalCalculatorForm.g:4255:1: ( '+' )
            {
            // InternalCalculatorForm.g:4255:1: ( '+' )
            // InternalCalculatorForm.g:4256:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4266:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4270:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalCalculatorForm.g:4271:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalCalculatorForm.g:4278:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4282:1: ( ( () ) )
            // InternalCalculatorForm.g:4283:1: ( () )
            {
            // InternalCalculatorForm.g:4283:1: ( () )
            // InternalCalculatorForm.g:4284:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalCalculatorForm.g:4285:2: ()
            // InternalCalculatorForm.g:4285:3: 
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
    // InternalCalculatorForm.g:4293:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4297:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalCalculatorForm.g:4298:2: rule__Addition__Group_1_0_1__1__Impl
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
    // InternalCalculatorForm.g:4304:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4308:1: ( ( '-' ) )
            // InternalCalculatorForm.g:4309:1: ( '-' )
            {
            // InternalCalculatorForm.g:4309:1: ( '-' )
            // InternalCalculatorForm.g:4310:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4320:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4324:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalCalculatorForm.g:4325:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalCalculatorForm.g:4332:1: rule__Multiplication__Group__0__Impl : ( rulePrefixed ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4336:1: ( ( rulePrefixed ) )
            // InternalCalculatorForm.g:4337:1: ( rulePrefixed )
            {
            // InternalCalculatorForm.g:4337:1: ( rulePrefixed )
            // InternalCalculatorForm.g:4338:2: rulePrefixed
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
    // InternalCalculatorForm.g:4347:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4351:1: ( rule__Multiplication__Group__1__Impl )
            // InternalCalculatorForm.g:4352:2: rule__Multiplication__Group__1__Impl
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
    // InternalCalculatorForm.g:4358:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4362:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalCalculatorForm.g:4363:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:4363:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalCalculatorForm.g:4364:2: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:4365:2: ( rule__Multiplication__Group_1__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=33 && LA63_0<=34)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalCalculatorForm.g:4365:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // InternalCalculatorForm.g:4374:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4378:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalCalculatorForm.g:4379:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCalculatorForm.g:4386:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4390:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalCalculatorForm.g:4391:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalCalculatorForm.g:4391:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalCalculatorForm.g:4392:2: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // InternalCalculatorForm.g:4393:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalCalculatorForm.g:4393:3: rule__Multiplication__Alternatives_1_0
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
    // InternalCalculatorForm.g:4401:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4405:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalCalculatorForm.g:4406:2: rule__Multiplication__Group_1__1__Impl
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
    // InternalCalculatorForm.g:4412:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4416:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:4417:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:4417:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalCalculatorForm.g:4418:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:4419:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalCalculatorForm.g:4419:3: rule__Multiplication__RightAssignment_1_1
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
    // InternalCalculatorForm.g:4428:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4432:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalCalculatorForm.g:4433:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCalculatorForm.g:4440:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4444:1: ( ( () ) )
            // InternalCalculatorForm.g:4445:1: ( () )
            {
            // InternalCalculatorForm.g:4445:1: ( () )
            // InternalCalculatorForm.g:4446:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // InternalCalculatorForm.g:4447:2: ()
            // InternalCalculatorForm.g:4447:3: 
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
    // InternalCalculatorForm.g:4455:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4459:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalCalculatorForm.g:4460:2: rule__Multiplication__Group_1_0_0__1__Impl
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
    // InternalCalculatorForm.g:4466:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4470:1: ( ( '*' ) )
            // InternalCalculatorForm.g:4471:1: ( '*' )
            {
            // InternalCalculatorForm.g:4471:1: ( '*' )
            // InternalCalculatorForm.g:4472:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4482:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4486:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalCalculatorForm.g:4487:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalCalculatorForm.g:4494:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4498:1: ( ( () ) )
            // InternalCalculatorForm.g:4499:1: ( () )
            {
            // InternalCalculatorForm.g:4499:1: ( () )
            // InternalCalculatorForm.g:4500:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // InternalCalculatorForm.g:4501:2: ()
            // InternalCalculatorForm.g:4501:3: 
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
    // InternalCalculatorForm.g:4509:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4513:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalCalculatorForm.g:4514:2: rule__Multiplication__Group_1_0_1__1__Impl
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
    // InternalCalculatorForm.g:4520:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4524:1: ( ( '/' ) )
            // InternalCalculatorForm.g:4525:1: ( '/' )
            {
            // InternalCalculatorForm.g:4525:1: ( '/' )
            // InternalCalculatorForm.g:4526:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4536:1: rule__UnaryOperation__Group_0__0 : rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 ;
    public final void rule__UnaryOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4540:1: ( rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1 )
            // InternalCalculatorForm.g:4541:2: rule__UnaryOperation__Group_0__0__Impl rule__UnaryOperation__Group_0__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalCalculatorForm.g:4548:1: rule__UnaryOperation__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4552:1: ( ( () ) )
            // InternalCalculatorForm.g:4553:1: ( () )
            {
            // InternalCalculatorForm.g:4553:1: ( () )
            // InternalCalculatorForm.g:4554:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getBooleanNegationAction_0_0()); 
            }
            // InternalCalculatorForm.g:4555:2: ()
            // InternalCalculatorForm.g:4555:3: 
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
    // InternalCalculatorForm.g:4563:1: rule__UnaryOperation__Group_0__1 : rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 ;
    public final void rule__UnaryOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4567:1: ( rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2 )
            // InternalCalculatorForm.g:4568:2: rule__UnaryOperation__Group_0__1__Impl rule__UnaryOperation__Group_0__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCalculatorForm.g:4575:1: rule__UnaryOperation__Group_0__1__Impl : ( ( '!' ) ) ;
    public final void rule__UnaryOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4579:1: ( ( ( '!' ) ) )
            // InternalCalculatorForm.g:4580:1: ( ( '!' ) )
            {
            // InternalCalculatorForm.g:4580:1: ( ( '!' ) )
            // InternalCalculatorForm.g:4581:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExclamationMarkKeyword_0_1()); 
            }
            // InternalCalculatorForm.g:4582:2: ( '!' )
            // InternalCalculatorForm.g:4582:3: '!'
            {
            match(input,35,FOLLOW_2); if (state.failed) return ;

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
    // InternalCalculatorForm.g:4590:1: rule__UnaryOperation__Group_0__2 : rule__UnaryOperation__Group_0__2__Impl ;
    public final void rule__UnaryOperation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4594:1: ( rule__UnaryOperation__Group_0__2__Impl )
            // InternalCalculatorForm.g:4595:2: rule__UnaryOperation__Group_0__2__Impl
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
    // InternalCalculatorForm.g:4601:1: rule__UnaryOperation__Group_0__2__Impl : ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) ) ;
    public final void rule__UnaryOperation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4605:1: ( ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) ) )
            // InternalCalculatorForm.g:4606:1: ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) )
            {
            // InternalCalculatorForm.g:4606:1: ( ( rule__UnaryOperation__ExpressionAssignment_0_2 ) )
            // InternalCalculatorForm.g:4607:2: ( rule__UnaryOperation__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExpressionAssignment_0_2()); 
            }
            // InternalCalculatorForm.g:4608:2: ( rule__UnaryOperation__ExpressionAssignment_0_2 )
            // InternalCalculatorForm.g:4608:3: rule__UnaryOperation__ExpressionAssignment_0_2
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
    // InternalCalculatorForm.g:4617:1: rule__UnaryOperation__Group_1__0 : rule__UnaryOperation__Group_1__0__Impl rule__UnaryOperation__Group_1__1 ;
    public final void rule__UnaryOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4621:1: ( rule__UnaryOperation__Group_1__0__Impl rule__UnaryOperation__Group_1__1 )
            // InternalCalculatorForm.g:4622:2: rule__UnaryOperation__Group_1__0__Impl rule__UnaryOperation__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalCalculatorForm.g:4629:1: rule__UnaryOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4633:1: ( ( () ) )
            // InternalCalculatorForm.g:4634:1: ( () )
            {
            // InternalCalculatorForm.g:4634:1: ( () )
            // InternalCalculatorForm.g:4635:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getArithmeticSignedAction_1_0()); 
            }
            // InternalCalculatorForm.g:4636:2: ()
            // InternalCalculatorForm.g:4636:3: 
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
    // InternalCalculatorForm.g:4644:1: rule__UnaryOperation__Group_1__1 : rule__UnaryOperation__Group_1__1__Impl rule__UnaryOperation__Group_1__2 ;
    public final void rule__UnaryOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4648:1: ( rule__UnaryOperation__Group_1__1__Impl rule__UnaryOperation__Group_1__2 )
            // InternalCalculatorForm.g:4649:2: rule__UnaryOperation__Group_1__1__Impl rule__UnaryOperation__Group_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCalculatorForm.g:4656:1: rule__UnaryOperation__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__UnaryOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4660:1: ( ( ( '-' ) ) )
            // InternalCalculatorForm.g:4661:1: ( ( '-' ) )
            {
            // InternalCalculatorForm.g:4661:1: ( ( '-' ) )
            // InternalCalculatorForm.g:4662:2: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getHyphenMinusKeyword_1_1()); 
            }
            // InternalCalculatorForm.g:4663:2: ( '-' )
            // InternalCalculatorForm.g:4663:3: '-'
            {
            match(input,32,FOLLOW_2); if (state.failed) return ;

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
    // InternalCalculatorForm.g:4671:1: rule__UnaryOperation__Group_1__2 : rule__UnaryOperation__Group_1__2__Impl ;
    public final void rule__UnaryOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4675:1: ( rule__UnaryOperation__Group_1__2__Impl )
            // InternalCalculatorForm.g:4676:2: rule__UnaryOperation__Group_1__2__Impl
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
    // InternalCalculatorForm.g:4682:1: rule__UnaryOperation__Group_1__2__Impl : ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) ) ;
    public final void rule__UnaryOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4686:1: ( ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) ) )
            // InternalCalculatorForm.g:4687:1: ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) )
            {
            // InternalCalculatorForm.g:4687:1: ( ( rule__UnaryOperation__ExpressionAssignment_1_2 ) )
            // InternalCalculatorForm.g:4688:2: ( rule__UnaryOperation__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryOperationAccess().getExpressionAssignment_1_2()); 
            }
            // InternalCalculatorForm.g:4689:2: ( rule__UnaryOperation__ExpressionAssignment_1_2 )
            // InternalCalculatorForm.g:4689:3: rule__UnaryOperation__ExpressionAssignment_1_2
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
    // InternalCalculatorForm.g:4698:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4702:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalCalculatorForm.g:4703:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCalculatorForm.g:4710:1: rule__Atomic__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4714:1: ( ( '(' ) )
            // InternalCalculatorForm.g:4715:1: ( '(' )
            {
            // InternalCalculatorForm.g:4715:1: ( '(' )
            // InternalCalculatorForm.g:4716:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4725:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4729:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // InternalCalculatorForm.g:4730:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalCalculatorForm.g:4737:1: rule__Atomic__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4741:1: ( ( ruleExpression ) )
            // InternalCalculatorForm.g:4742:1: ( ruleExpression )
            {
            // InternalCalculatorForm.g:4742:1: ( ruleExpression )
            // InternalCalculatorForm.g:4743:2: ruleExpression
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
    // InternalCalculatorForm.g:4752:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4756:1: ( rule__Atomic__Group_0__2__Impl )
            // InternalCalculatorForm.g:4757:2: rule__Atomic__Group_0__2__Impl
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
    // InternalCalculatorForm.g:4763:1: rule__Atomic__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4767:1: ( ( ')' ) )
            // InternalCalculatorForm.g:4768:1: ( ')' )
            {
            // InternalCalculatorForm.g:4768:1: ( ')' )
            // InternalCalculatorForm.g:4769:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalCalculatorForm.g:4779:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4783:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalCalculatorForm.g:4784:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalCalculatorForm.g:4791:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4795:1: ( ( () ) )
            // InternalCalculatorForm.g:4796:1: ( () )
            {
            // InternalCalculatorForm.g:4796:1: ( () )
            // InternalCalculatorForm.g:4797:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getFieldReferenceAction_2_0()); 
            }
            // InternalCalculatorForm.g:4798:2: ()
            // InternalCalculatorForm.g:4798:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getFieldReferenceAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalCalculatorForm.g:4806:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4810:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalCalculatorForm.g:4811:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalCalculatorForm.g:4817:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__RefAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4821:1: ( ( ( rule__Atomic__RefAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:4822:1: ( ( rule__Atomic__RefAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:4822:1: ( ( rule__Atomic__RefAssignment_2_1 ) )
            // InternalCalculatorForm.g:4823:2: ( rule__Atomic__RefAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:4824:2: ( rule__Atomic__RefAssignment_2_1 )
            // InternalCalculatorForm.g:4824:3: rule__Atomic__RefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__RefAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefAssignment_2_1()); 
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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // InternalCalculatorForm.g:4833:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4837:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalCalculatorForm.g:4838:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
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
    // InternalCalculatorForm.g:4845:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4849:1: ( ( () ) )
            // InternalCalculatorForm.g:4850:1: ( () )
            {
            // InternalCalculatorForm.g:4850:1: ( () )
            // InternalCalculatorForm.g:4851:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNumberLiteralAction_0_0()); 
            }
            // InternalCalculatorForm.g:4852:2: ()
            // InternalCalculatorForm.g:4852:3: 
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
    // InternalCalculatorForm.g:4860:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4864:1: ( rule__Literal__Group_0__1__Impl )
            // InternalCalculatorForm.g:4865:2: rule__Literal__Group_0__1__Impl
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
    // InternalCalculatorForm.g:4871:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__ValueAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4875:1: ( ( ( rule__Literal__ValueAssignment_0_1 ) ) )
            // InternalCalculatorForm.g:4876:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            {
            // InternalCalculatorForm.g:4876:1: ( ( rule__Literal__ValueAssignment_0_1 ) )
            // InternalCalculatorForm.g:4877:2: ( rule__Literal__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_0_1()); 
            }
            // InternalCalculatorForm.g:4878:2: ( rule__Literal__ValueAssignment_0_1 )
            // InternalCalculatorForm.g:4878:3: rule__Literal__ValueAssignment_0_1
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
    // InternalCalculatorForm.g:4887:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4891:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // InternalCalculatorForm.g:4892:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalCalculatorForm.g:4899:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4903:1: ( ( () ) )
            // InternalCalculatorForm.g:4904:1: ( () )
            {
            // InternalCalculatorForm.g:4904:1: ( () )
            // InternalCalculatorForm.g:4905:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getFloatLiteralAction_1_0()); 
            }
            // InternalCalculatorForm.g:4906:2: ()
            // InternalCalculatorForm.g:4906:3: 
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
    // InternalCalculatorForm.g:4914:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4918:1: ( rule__Literal__Group_1__1__Impl )
            // InternalCalculatorForm.g:4919:2: rule__Literal__Group_1__1__Impl
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
    // InternalCalculatorForm.g:4925:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__ValueAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4929:1: ( ( ( rule__Literal__ValueAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:4930:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:4930:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            // InternalCalculatorForm.g:4931:2: ( rule__Literal__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:4932:2: ( rule__Literal__ValueAssignment_1_1 )
            // InternalCalculatorForm.g:4932:3: rule__Literal__ValueAssignment_1_1
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
    // InternalCalculatorForm.g:4941:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4945:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // InternalCalculatorForm.g:4946:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalCalculatorForm.g:4953:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4957:1: ( ( () ) )
            // InternalCalculatorForm.g:4958:1: ( () )
            {
            // InternalCalculatorForm.g:4958:1: ( () )
            // InternalCalculatorForm.g:4959:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getPercentLiteralAction_2_0()); 
            }
            // InternalCalculatorForm.g:4960:2: ()
            // InternalCalculatorForm.g:4960:3: 
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
    // InternalCalculatorForm.g:4968:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4972:1: ( rule__Literal__Group_2__1__Impl )
            // InternalCalculatorForm.g:4973:2: rule__Literal__Group_2__1__Impl
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
    // InternalCalculatorForm.g:4979:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__ValueAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4983:1: ( ( ( rule__Literal__ValueAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:4984:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:4984:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            // InternalCalculatorForm.g:4985:2: ( rule__Literal__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:4986:2: ( rule__Literal__ValueAssignment_2_1 )
            // InternalCalculatorForm.g:4986:3: rule__Literal__ValueAssignment_2_1
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


    // $ANTLR start "rule__Model__FormsAssignment"
    // InternalCalculatorForm.g:4995:1: rule__Model__FormsAssignment : ( ruleForm ) ;
    public final void rule__Model__FormsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4999:1: ( ( ruleForm ) )
            // InternalCalculatorForm.g:5000:2: ( ruleForm )
            {
            // InternalCalculatorForm.g:5000:2: ( ruleForm )
            // InternalCalculatorForm.g:5001:3: ruleForm
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
    // InternalCalculatorForm.g:5010:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5014:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5015:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5015:2: ( RULE_ID )
            // InternalCalculatorForm.g:5016:3: RULE_ID
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
    // InternalCalculatorForm.g:5025:1: rule__Form__FormElementsAssignment_3 : ( ruleFormElement ) ;
    public final void rule__Form__FormElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5029:1: ( ( ruleFormElement ) )
            // InternalCalculatorForm.g:5030:2: ( ruleFormElement )
            {
            // InternalCalculatorForm.g:5030:2: ( ruleFormElement )
            // InternalCalculatorForm.g:5031:3: ruleFormElement
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
    // InternalCalculatorForm.g:5040:1: rule__Form__CalculationsAssignment_4 : ( ruleCalculate ) ;
    public final void rule__Form__CalculationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5044:1: ( ( ruleCalculate ) )
            // InternalCalculatorForm.g:5045:2: ( ruleCalculate )
            {
            // InternalCalculatorForm.g:5045:2: ( ruleCalculate )
            // InternalCalculatorForm.g:5046:3: ruleCalculate
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
    // InternalCalculatorForm.g:5055:1: rule__FieldInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5059:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5060:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5060:2: ( RULE_ID )
            // InternalCalculatorForm.g:5061:3: RULE_ID
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
    // InternalCalculatorForm.g:5070:1: rule__FieldInput__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldInput__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5074:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5075:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5075:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5076:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5077:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5078:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5089:1: rule__FieldInput__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldInput__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5093:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5094:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5094:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5095:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5096:3: ( 'disabled' )
            // InternalCalculatorForm.g:5097:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5108:1: rule__FieldInput__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5112:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5113:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5113:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5114:3: RULE_STRING
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
    // InternalCalculatorForm.g:5123:1: rule__FieldInput__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5127:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5128:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5128:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5129:3: RULE_STRING
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
    // InternalCalculatorForm.g:5138:1: rule__FieldInput__NotdisplayedAssignment_6 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldInput__NotdisplayedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5142:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:5143:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:5143:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:5144:3: ( 'notdisplayed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:5145:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:5146:4: 'notdisplayed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5157:1: rule__FieldInput__ReadonlyAssignment_7 : ( ( 'readonly' ) ) ;
    public final void rule__FieldInput__ReadonlyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5161:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5162:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5162:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5163:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:5164:3: ( 'readonly' )
            // InternalCalculatorForm.g:5165:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5176:1: rule__FieldInput__RequiredAssignment_8 : ( ( 'required' ) ) ;
    public final void rule__FieldInput__RequiredAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5180:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5181:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5181:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5182:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }
            // InternalCalculatorForm.g:5183:3: ( 'required' )
            // InternalCalculatorForm.g:5184:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5195:1: rule__FieldInput__ValueAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__ValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5199:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5200:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5200:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5201:3: RULE_STRING
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
    // InternalCalculatorForm.g:5210:1: rule__FieldSelect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSelect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5214:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5215:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5215:2: ( RULE_ID )
            // InternalCalculatorForm.g:5216:3: RULE_ID
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
    // InternalCalculatorForm.g:5225:1: rule__FieldSelect__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldSelect__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5229:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5230:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5230:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5231:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5232:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5233:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5244:1: rule__FieldSelect__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldSelect__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5248:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5249:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5249:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5250:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5251:3: ( 'disabled' )
            // InternalCalculatorForm.g:5252:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5263:1: rule__FieldSelect__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5267:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5268:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5268:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5269:3: RULE_STRING
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
    // InternalCalculatorForm.g:5278:1: rule__FieldSelect__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5282:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5283:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5283:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5284:3: RULE_STRING
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
    // InternalCalculatorForm.g:5293:1: rule__FieldSelect__MultipleAssignment_6 : ( ( 'multiple' ) ) ;
    public final void rule__FieldSelect__MultipleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5297:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:5298:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:5298:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:5299:3: ( 'multiple' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:5300:3: ( 'multiple' )
            // InternalCalculatorForm.g:5301:4: 'multiple'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5312:1: rule__FieldSelect__RequiredAssignment_7 : ( ( 'required' ) ) ;
    public final void rule__FieldSelect__RequiredAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5316:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5317:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5317:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5318:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:5319:3: ( 'required' )
            // InternalCalculatorForm.g:5320:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5331:1: rule__FieldSelect__SizeAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__FieldSelect__SizeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5335:1: ( ( RULE_INT ) )
            // InternalCalculatorForm.g:5336:2: ( RULE_INT )
            {
            // InternalCalculatorForm.g:5336:2: ( RULE_INT )
            // InternalCalculatorForm.g:5337:3: RULE_INT
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
    // InternalCalculatorForm.g:5346:1: rule__FieldSelect__ChildsAssignment_10 : ( ruleFieldSelectChild ) ;
    public final void rule__FieldSelect__ChildsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5350:1: ( ( ruleFieldSelectChild ) )
            // InternalCalculatorForm.g:5351:2: ( ruleFieldSelectChild )
            {
            // InternalCalculatorForm.g:5351:2: ( ruleFieldSelectChild )
            // InternalCalculatorForm.g:5352:3: ruleFieldSelectChild
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
    // InternalCalculatorForm.g:5361:1: rule__FieldOption__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5365:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5366:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5366:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5367:3: RULE_STRING
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
    // InternalCalculatorForm.g:5376:1: rule__FieldOption__DisabledAssignment_2 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOption__DisabledAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5380:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5381:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5381:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5382:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5383:3: ( 'disabled' )
            // InternalCalculatorForm.g:5384:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5395:1: rule__FieldOption__SelectedAssignment_3 : ( ( 'selected' ) ) ;
    public final void rule__FieldOption__SelectedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5399:1: ( ( ( 'selected' ) ) )
            // InternalCalculatorForm.g:5400:2: ( ( 'selected' ) )
            {
            // InternalCalculatorForm.g:5400:2: ( ( 'selected' ) )
            // InternalCalculatorForm.g:5401:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5402:3: ( 'selected' )
            // InternalCalculatorForm.g:5403:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5414:1: rule__FieldOption__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5418:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5419:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5419:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5420:3: RULE_STRING
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
    // InternalCalculatorForm.g:5429:1: rule__FieldOption__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5433:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5434:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5434:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5435:3: RULE_STRING
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
    // InternalCalculatorForm.g:5444:1: rule__FieldOptionGroup__DisabledAssignment_1 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOptionGroup__DisabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5448:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5449:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5449:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5450:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }
            // InternalCalculatorForm.g:5451:3: ( 'disabled' )
            // InternalCalculatorForm.g:5452:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5463:1: rule__FieldOptionGroup__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FieldOptionGroup__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5467:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5468:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5468:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5469:3: RULE_STRING
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
    // InternalCalculatorForm.g:5478:1: rule__FieldOptionGroup__OptionsAssignment_4 : ( ruleFieldOption ) ;
    public final void rule__FieldOptionGroup__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5482:1: ( ( ruleFieldOption ) )
            // InternalCalculatorForm.g:5483:2: ( ruleFieldOption )
            {
            // InternalCalculatorForm.g:5483:2: ( ruleFieldOption )
            // InternalCalculatorForm.g:5484:3: ruleFieldOption
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
    // InternalCalculatorForm.g:5493:1: rule__FieldChoice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldChoice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5497:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5498:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5498:2: ( RULE_ID )
            // InternalCalculatorForm.g:5499:3: RULE_ID
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
    // InternalCalculatorForm.g:5508:1: rule__FieldChoice__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoice__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5512:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5513:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5513:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5514:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5515:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5516:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5527:1: rule__FieldChoice__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoice__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5531:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:5532:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:5532:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:5533:3: ( 'checked' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5534:3: ( 'checked' )
            // InternalCalculatorForm.g:5535:4: 'checked'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5546:1: rule__FieldChoice__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoice__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5550:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5551:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5551:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5552:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5553:3: ( 'disabled' )
            // InternalCalculatorForm.g:5554:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5565:1: rule__FieldChoice__FormAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__FormAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5569:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5570:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5570:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5571:3: RULE_STRING
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
    // InternalCalculatorForm.g:5580:1: rule__FieldChoice__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5584:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5585:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5585:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5586:3: RULE_STRING
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
    // InternalCalculatorForm.g:5595:1: rule__FieldChoice__MultipleAssignment_7 : ( ( 'multiple' ) ) ;
    public final void rule__FieldChoice__MultipleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5599:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:5600:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:5600:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:5601:3: ( 'multiple' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:5602:3: ( 'multiple' )
            // InternalCalculatorForm.g:5603:4: 'multiple'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5614:1: rule__FieldChoice__NotdisplayedAssignment_8 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldChoice__NotdisplayedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5618:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:5619:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:5619:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:5620:3: ( 'notdisplayed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }
            // InternalCalculatorForm.g:5621:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:5622:4: 'notdisplayed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5633:1: rule__FieldChoice__ReadonlyAssignment_9 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoice__ReadonlyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5637:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5638:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5638:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5639:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }
            // InternalCalculatorForm.g:5640:3: ( 'readonly' )
            // InternalCalculatorForm.g:5641:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5652:1: rule__FieldChoice__RequiredAssignment_10 : ( ( 'required' ) ) ;
    public final void rule__FieldChoice__RequiredAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5656:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5657:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5657:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5658:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }
            // InternalCalculatorForm.g:5659:3: ( 'required' )
            // InternalCalculatorForm.g:5660:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5671:1: rule__FieldChoice__ValueAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__ValueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5675:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5676:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5676:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5677:3: RULE_STRING
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
    // InternalCalculatorForm.g:5686:1: rule__FieldChoice__OptionsAssignment_12_1 : ( ruleFieldChoiceOption ) ;
    public final void rule__FieldChoice__OptionsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5690:1: ( ( ruleFieldChoiceOption ) )
            // InternalCalculatorForm.g:5691:2: ( ruleFieldChoiceOption )
            {
            // InternalCalculatorForm.g:5691:2: ( ruleFieldChoiceOption )
            // InternalCalculatorForm.g:5692:3: ruleFieldChoiceOption
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
    // InternalCalculatorForm.g:5701:1: rule__FieldChoiceOption__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5705:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5706:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5706:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5707:3: RULE_STRING
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
    // InternalCalculatorForm.g:5716:1: rule__FieldChoiceOption__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoiceOption__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5720:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5721:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5721:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5722:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5723:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5724:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5735:1: rule__FieldChoiceOption__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoiceOption__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5739:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:5740:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:5740:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:5741:3: ( 'checked' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5742:3: ( 'checked' )
            // InternalCalculatorForm.g:5743:4: 'checked'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5754:1: rule__FieldChoiceOption__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoiceOption__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5758:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5759:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5759:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5760:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5761:3: ( 'disabled' )
            // InternalCalculatorForm.g:5762:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5773:1: rule__FieldChoiceOption__ReadonlyAssignment_5 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoiceOption__ReadonlyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5777:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5778:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5778:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5779:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }
            // InternalCalculatorForm.g:5780:3: ( 'readonly' )
            // InternalCalculatorForm.g:5781:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5792:1: rule__FieldChoiceOption__RequiredAssignment_6 : ( ( 'required' ) ) ;
    public final void rule__FieldChoiceOption__RequiredAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5796:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5797:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5797:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5798:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:5799:3: ( 'required' )
            // InternalCalculatorForm.g:5800:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5811:1: rule__FieldChoiceOption__ValueAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5815:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5816:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5816:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5817:3: RULE_STRING
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
    // InternalCalculatorForm.g:5826:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5830:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5831:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5831:2: ( RULE_ID )
            // InternalCalculatorForm.g:5832:3: RULE_ID
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
    // InternalCalculatorForm.g:5841:1: rule__Group__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Group__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5845:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5846:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5846:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5847:3: RULE_STRING
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
    // InternalCalculatorForm.g:5856:1: rule__Group__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Group__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5860:1: ( ( ruleField ) )
            // InternalCalculatorForm.g:5861:2: ( ruleField )
            {
            // InternalCalculatorForm.g:5861:2: ( ruleField )
            // InternalCalculatorForm.g:5862:3: ruleField
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
    // InternalCalculatorForm.g:5871:1: rule__Page__ChildsAssignment_2 : ( rulePageChild ) ;
    public final void rule__Page__ChildsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5875:1: ( ( rulePageChild ) )
            // InternalCalculatorForm.g:5876:2: ( rulePageChild )
            {
            // InternalCalculatorForm.g:5876:2: ( rulePageChild )
            // InternalCalculatorForm.g:5877:3: rulePageChild
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
    // InternalCalculatorForm.g:5886:1: rule__ButtonSubmit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ButtonSubmit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5890:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5891:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5891:2: ( RULE_ID )
            // InternalCalculatorForm.g:5892:3: RULE_ID
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
    // InternalCalculatorForm.g:5901:1: rule__ButtonSubmit__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5905:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5906:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5906:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5907:3: RULE_STRING
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
    // InternalCalculatorForm.g:5916:1: rule__ButtonSubmit__AutofocusAssignment_3 : ( ( 'autofocus' ) ) ;
    public final void rule__ButtonSubmit__AutofocusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5920:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5921:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5921:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5922:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5923:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5924:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5935:1: rule__ButtonSubmit__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__ButtonSubmit__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5939:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5940:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5940:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5941:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5942:3: ( 'disabled' )
            // InternalCalculatorForm.g:5943:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5954:1: rule__ButtonSubmit__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5958:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5959:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5959:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5960:3: RULE_STRING
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


    // $ANTLR start "rule__Calculate__ResultAssignment_1"
    // InternalCalculatorForm.g:5969:1: rule__Calculate__ResultAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Calculate__ResultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5973:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCalculatorForm.g:5974:2: ( ( ruleQualifiedName ) )
            {
            // InternalCalculatorForm.g:5974:2: ( ( ruleQualifiedName ) )
            // InternalCalculatorForm.g:5975:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getResultFieldCrossReference_1_0()); 
            }
            // InternalCalculatorForm.g:5976:3: ( ruleQualifiedName )
            // InternalCalculatorForm.g:5977:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getResultFieldQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getResultFieldQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCalculateAccess().getResultFieldCrossReference_1_0()); 
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
    // $ANTLR end "rule__Calculate__ResultAssignment_1"


    // $ANTLR start "rule__Calculate__ExpressionAssignment_3"
    // InternalCalculatorForm.g:5988:1: rule__Calculate__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Calculate__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5992:1: ( ( ruleExpression ) )
            // InternalCalculatorForm.g:5993:2: ( ruleExpression )
            {
            // InternalCalculatorForm.g:5993:2: ( ruleExpression )
            // InternalCalculatorForm.g:5994:3: ruleExpression
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


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalCalculatorForm.g:6003:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6007:1: ( ( ruleMultiplication ) )
            // InternalCalculatorForm.g:6008:2: ( ruleMultiplication )
            {
            // InternalCalculatorForm.g:6008:2: ( ruleMultiplication )
            // InternalCalculatorForm.g:6009:3: ruleMultiplication
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
    // InternalCalculatorForm.g:6018:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrefixed ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6022:1: ( ( rulePrefixed ) )
            // InternalCalculatorForm.g:6023:2: ( rulePrefixed )
            {
            // InternalCalculatorForm.g:6023:2: ( rulePrefixed )
            // InternalCalculatorForm.g:6024:3: rulePrefixed
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
    // InternalCalculatorForm.g:6033:1: rule__UnaryOperation__ExpressionAssignment_0_2 : ( ruleAtomic ) ;
    public final void rule__UnaryOperation__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6037:1: ( ( ruleAtomic ) )
            // InternalCalculatorForm.g:6038:2: ( ruleAtomic )
            {
            // InternalCalculatorForm.g:6038:2: ( ruleAtomic )
            // InternalCalculatorForm.g:6039:3: ruleAtomic
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
    // InternalCalculatorForm.g:6048:1: rule__UnaryOperation__ExpressionAssignment_1_2 : ( ruleAtomic ) ;
    public final void rule__UnaryOperation__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6052:1: ( ( ruleAtomic ) )
            // InternalCalculatorForm.g:6053:2: ( ruleAtomic )
            {
            // InternalCalculatorForm.g:6053:2: ( ruleAtomic )
            // InternalCalculatorForm.g:6054:3: ruleAtomic
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


    // $ANTLR start "rule__Atomic__RefAssignment_2_1"
    // InternalCalculatorForm.g:6063:1: rule__Atomic__RefAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atomic__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6067:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCalculatorForm.g:6068:2: ( ( ruleQualifiedName ) )
            {
            // InternalCalculatorForm.g:6068:2: ( ( ruleQualifiedName ) )
            // InternalCalculatorForm.g:6069:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefFieldCrossReference_2_1_0()); 
            }
            // InternalCalculatorForm.g:6070:3: ( ruleQualifiedName )
            // InternalCalculatorForm.g:6071:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefFieldQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefFieldQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefFieldCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Atomic__RefAssignment_2_1"


    // $ANTLR start "rule__Literal__ValueAssignment_0_1"
    // InternalCalculatorForm.g:6082:1: rule__Literal__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Literal__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6086:1: ( ( RULE_INT ) )
            // InternalCalculatorForm.g:6087:2: ( RULE_INT )
            {
            // InternalCalculatorForm.g:6087:2: ( RULE_INT )
            // InternalCalculatorForm.g:6088:3: RULE_INT
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
    // InternalCalculatorForm.g:6097:1: rule__Literal__ValueAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__Literal__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6101:1: ( ( RULE_FLOAT ) )
            // InternalCalculatorForm.g:6102:2: ( RULE_FLOAT )
            {
            // InternalCalculatorForm.g:6102:2: ( RULE_FLOAT )
            // InternalCalculatorForm.g:6103:3: RULE_FLOAT
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
    // InternalCalculatorForm.g:6112:1: rule__Literal__ValueAssignment_2_1 : ( RULE_PERCENT ) ;
    public final void rule__Literal__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:6116:1: ( ( RULE_PERCENT ) )
            // InternalCalculatorForm.g:6117:2: ( RULE_PERCENT )
            {
            // InternalCalculatorForm.g:6117:2: ( RULE_PERCENT )
            // InternalCalculatorForm.g:6118:3: RULE_PERCENT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001F098000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000F090002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000007C000062000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000CC000126000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000A08000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000108000440000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000024000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00002FC000066000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000026C000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000009098000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000009090002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000B098000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000B090002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000019000001D0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000000001C0L});

}