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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'/'", "'field'", "'form'", "'label'", "'value'", "'dropdown'", "'{'", "'}'", "'size'", "'option'", "'text'", "'option-group'", "'choice'", "'group'", "'page'", "'submit-button'", "'calculate'", "'='", "'.'", "'+'", "'-'", "'!'", "'('", "')'", "'autofocus'", "'disabled'", "'notdisplayed'", "'readonly'", "'required'", "'multiple'", "'selected'", "'checked'"
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
    // InternalCalculatorForm.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalCalculatorForm.g:68:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalCalculatorForm.g:68:2: ( ( rule__Model__Group__0 ) )
            // InternalCalculatorForm.g:69:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:70:3: ( rule__Model__Group__0 )
            // InternalCalculatorForm.g:70:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFormElement"
    // InternalCalculatorForm.g:79:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:80:1: ( ruleFormElement EOF )
            // InternalCalculatorForm.g:81:1: ruleFormElement EOF
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
    // InternalCalculatorForm.g:88:1: ruleFormElement : ( ( rule__FormElement__Alternatives ) ) ;
    public final void ruleFormElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:92:2: ( ( ( rule__FormElement__Alternatives ) ) )
            // InternalCalculatorForm.g:93:2: ( ( rule__FormElement__Alternatives ) )
            {
            // InternalCalculatorForm.g:93:2: ( ( rule__FormElement__Alternatives ) )
            // InternalCalculatorForm.g:94:3: ( rule__FormElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormElementAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:95:3: ( rule__FormElement__Alternatives )
            // InternalCalculatorForm.g:95:4: rule__FormElement__Alternatives
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
    // InternalCalculatorForm.g:104:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:105:1: ( ruleField EOF )
            // InternalCalculatorForm.g:106:1: ruleField EOF
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
    // InternalCalculatorForm.g:113:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:117:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalCalculatorForm.g:118:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalCalculatorForm.g:118:2: ( ( rule__Field__Alternatives ) )
            // InternalCalculatorForm.g:119:3: ( rule__Field__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:120:3: ( rule__Field__Alternatives )
            // InternalCalculatorForm.g:120:4: rule__Field__Alternatives
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
    // InternalCalculatorForm.g:129:1: entryRuleFieldInput : ruleFieldInput EOF ;
    public final void entryRuleFieldInput() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:130:1: ( ruleFieldInput EOF )
            // InternalCalculatorForm.g:131:1: ruleFieldInput EOF
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
    // InternalCalculatorForm.g:138:1: ruleFieldInput : ( ( rule__FieldInput__Group__0 ) ) ;
    public final void ruleFieldInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:142:2: ( ( ( rule__FieldInput__Group__0 ) ) )
            // InternalCalculatorForm.g:143:2: ( ( rule__FieldInput__Group__0 ) )
            {
            // InternalCalculatorForm.g:143:2: ( ( rule__FieldInput__Group__0 ) )
            // InternalCalculatorForm.g:144:3: ( rule__FieldInput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:145:3: ( rule__FieldInput__Group__0 )
            // InternalCalculatorForm.g:145:4: rule__FieldInput__Group__0
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
    // InternalCalculatorForm.g:154:1: entryRuleFieldSelect : ruleFieldSelect EOF ;
    public final void entryRuleFieldSelect() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:155:1: ( ruleFieldSelect EOF )
            // InternalCalculatorForm.g:156:1: ruleFieldSelect EOF
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
    // InternalCalculatorForm.g:163:1: ruleFieldSelect : ( ( rule__FieldSelect__Group__0 ) ) ;
    public final void ruleFieldSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:167:2: ( ( ( rule__FieldSelect__Group__0 ) ) )
            // InternalCalculatorForm.g:168:2: ( ( rule__FieldSelect__Group__0 ) )
            {
            // InternalCalculatorForm.g:168:2: ( ( rule__FieldSelect__Group__0 ) )
            // InternalCalculatorForm.g:169:3: ( rule__FieldSelect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:170:3: ( rule__FieldSelect__Group__0 )
            // InternalCalculatorForm.g:170:4: rule__FieldSelect__Group__0
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
    // InternalCalculatorForm.g:179:1: entryRuleFieldSelectChild : ruleFieldSelectChild EOF ;
    public final void entryRuleFieldSelectChild() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:180:1: ( ruleFieldSelectChild EOF )
            // InternalCalculatorForm.g:181:1: ruleFieldSelectChild EOF
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
    // InternalCalculatorForm.g:188:1: ruleFieldSelectChild : ( ( rule__FieldSelectChild__Alternatives ) ) ;
    public final void ruleFieldSelectChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:192:2: ( ( ( rule__FieldSelectChild__Alternatives ) ) )
            // InternalCalculatorForm.g:193:2: ( ( rule__FieldSelectChild__Alternatives ) )
            {
            // InternalCalculatorForm.g:193:2: ( ( rule__FieldSelectChild__Alternatives ) )
            // InternalCalculatorForm.g:194:3: ( rule__FieldSelectChild__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectChildAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:195:3: ( rule__FieldSelectChild__Alternatives )
            // InternalCalculatorForm.g:195:4: rule__FieldSelectChild__Alternatives
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
    // InternalCalculatorForm.g:204:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:205:1: ( ruleFieldOption EOF )
            // InternalCalculatorForm.g:206:1: ruleFieldOption EOF
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
    // InternalCalculatorForm.g:213:1: ruleFieldOption : ( ( rule__FieldOption__Group__0 ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:217:2: ( ( ( rule__FieldOption__Group__0 ) ) )
            // InternalCalculatorForm.g:218:2: ( ( rule__FieldOption__Group__0 ) )
            {
            // InternalCalculatorForm.g:218:2: ( ( rule__FieldOption__Group__0 ) )
            // InternalCalculatorForm.g:219:3: ( rule__FieldOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:220:3: ( rule__FieldOption__Group__0 )
            // InternalCalculatorForm.g:220:4: rule__FieldOption__Group__0
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
    // InternalCalculatorForm.g:229:1: entryRuleFieldOptionGroup : ruleFieldOptionGroup EOF ;
    public final void entryRuleFieldOptionGroup() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:230:1: ( ruleFieldOptionGroup EOF )
            // InternalCalculatorForm.g:231:1: ruleFieldOptionGroup EOF
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
    // InternalCalculatorForm.g:238:1: ruleFieldOptionGroup : ( ( rule__FieldOptionGroup__Group__0 ) ) ;
    public final void ruleFieldOptionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:242:2: ( ( ( rule__FieldOptionGroup__Group__0 ) ) )
            // InternalCalculatorForm.g:243:2: ( ( rule__FieldOptionGroup__Group__0 ) )
            {
            // InternalCalculatorForm.g:243:2: ( ( rule__FieldOptionGroup__Group__0 ) )
            // InternalCalculatorForm.g:244:3: ( rule__FieldOptionGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:245:3: ( rule__FieldOptionGroup__Group__0 )
            // InternalCalculatorForm.g:245:4: rule__FieldOptionGroup__Group__0
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
    // InternalCalculatorForm.g:254:1: entryRuleFieldChoice : ruleFieldChoice EOF ;
    public final void entryRuleFieldChoice() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:255:1: ( ruleFieldChoice EOF )
            // InternalCalculatorForm.g:256:1: ruleFieldChoice EOF
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
    // InternalCalculatorForm.g:263:1: ruleFieldChoice : ( ( rule__FieldChoice__Group__0 ) ) ;
    public final void ruleFieldChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:267:2: ( ( ( rule__FieldChoice__Group__0 ) ) )
            // InternalCalculatorForm.g:268:2: ( ( rule__FieldChoice__Group__0 ) )
            {
            // InternalCalculatorForm.g:268:2: ( ( rule__FieldChoice__Group__0 ) )
            // InternalCalculatorForm.g:269:3: ( rule__FieldChoice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:270:3: ( rule__FieldChoice__Group__0 )
            // InternalCalculatorForm.g:270:4: rule__FieldChoice__Group__0
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
    // InternalCalculatorForm.g:279:1: entryRuleFieldChoiceOption : ruleFieldChoiceOption EOF ;
    public final void entryRuleFieldChoiceOption() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:280:1: ( ruleFieldChoiceOption EOF )
            // InternalCalculatorForm.g:281:1: ruleFieldChoiceOption EOF
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
    // InternalCalculatorForm.g:288:1: ruleFieldChoiceOption : ( ( rule__FieldChoiceOption__Group__0 ) ) ;
    public final void ruleFieldChoiceOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:292:2: ( ( ( rule__FieldChoiceOption__Group__0 ) ) )
            // InternalCalculatorForm.g:293:2: ( ( rule__FieldChoiceOption__Group__0 ) )
            {
            // InternalCalculatorForm.g:293:2: ( ( rule__FieldChoiceOption__Group__0 ) )
            // InternalCalculatorForm.g:294:3: ( rule__FieldChoiceOption__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:295:3: ( rule__FieldChoiceOption__Group__0 )
            // InternalCalculatorForm.g:295:4: rule__FieldChoiceOption__Group__0
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
    // InternalCalculatorForm.g:304:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:305:1: ( ruleGroup EOF )
            // InternalCalculatorForm.g:306:1: ruleGroup EOF
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
    // InternalCalculatorForm.g:313:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:317:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalCalculatorForm.g:318:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalCalculatorForm.g:318:2: ( ( rule__Group__Group__0 ) )
            // InternalCalculatorForm.g:319:3: ( rule__Group__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:320:3: ( rule__Group__Group__0 )
            // InternalCalculatorForm.g:320:4: rule__Group__Group__0
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
    // InternalCalculatorForm.g:329:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:330:1: ( rulePage EOF )
            // InternalCalculatorForm.g:331:1: rulePage EOF
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
    // InternalCalculatorForm.g:338:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:342:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalCalculatorForm.g:343:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalCalculatorForm.g:343:2: ( ( rule__Page__Group__0 ) )
            // InternalCalculatorForm.g:344:3: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:345:3: ( rule__Page__Group__0 )
            // InternalCalculatorForm.g:345:4: rule__Page__Group__0
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
    // InternalCalculatorForm.g:354:1: entryRulePageChild : rulePageChild EOF ;
    public final void entryRulePageChild() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:355:1: ( rulePageChild EOF )
            // InternalCalculatorForm.g:356:1: rulePageChild EOF
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
    // InternalCalculatorForm.g:363:1: rulePageChild : ( ( rule__PageChild__Alternatives ) ) ;
    public final void rulePageChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:367:2: ( ( ( rule__PageChild__Alternatives ) ) )
            // InternalCalculatorForm.g:368:2: ( ( rule__PageChild__Alternatives ) )
            {
            // InternalCalculatorForm.g:368:2: ( ( rule__PageChild__Alternatives ) )
            // InternalCalculatorForm.g:369:3: ( rule__PageChild__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageChildAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:370:3: ( rule__PageChild__Alternatives )
            // InternalCalculatorForm.g:370:4: rule__PageChild__Alternatives
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
    // InternalCalculatorForm.g:379:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:380:1: ( ruleButton EOF )
            // InternalCalculatorForm.g:381:1: ruleButton EOF
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
    // InternalCalculatorForm.g:388:1: ruleButton : ( ruleButtonSubmit ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:392:2: ( ( ruleButtonSubmit ) )
            // InternalCalculatorForm.g:393:2: ( ruleButtonSubmit )
            {
            // InternalCalculatorForm.g:393:2: ( ruleButtonSubmit )
            // InternalCalculatorForm.g:394:3: ruleButtonSubmit
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
    // InternalCalculatorForm.g:404:1: entryRuleButtonSubmit : ruleButtonSubmit EOF ;
    public final void entryRuleButtonSubmit() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:405:1: ( ruleButtonSubmit EOF )
            // InternalCalculatorForm.g:406:1: ruleButtonSubmit EOF
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
    // InternalCalculatorForm.g:413:1: ruleButtonSubmit : ( ( rule__ButtonSubmit__Group__0 ) ) ;
    public final void ruleButtonSubmit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:417:2: ( ( ( rule__ButtonSubmit__Group__0 ) ) )
            // InternalCalculatorForm.g:418:2: ( ( rule__ButtonSubmit__Group__0 ) )
            {
            // InternalCalculatorForm.g:418:2: ( ( rule__ButtonSubmit__Group__0 ) )
            // InternalCalculatorForm.g:419:3: ( rule__ButtonSubmit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:420:3: ( rule__ButtonSubmit__Group__0 )
            // InternalCalculatorForm.g:420:4: rule__ButtonSubmit__Group__0
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
    // InternalCalculatorForm.g:429:1: entryRuleCalculate : ruleCalculate EOF ;
    public final void entryRuleCalculate() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:430:1: ( ruleCalculate EOF )
            // InternalCalculatorForm.g:431:1: ruleCalculate EOF
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
    // InternalCalculatorForm.g:438:1: ruleCalculate : ( ( rule__Calculate__Group__0 ) ) ;
    public final void ruleCalculate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:442:2: ( ( ( rule__Calculate__Group__0 ) ) )
            // InternalCalculatorForm.g:443:2: ( ( rule__Calculate__Group__0 ) )
            {
            // InternalCalculatorForm.g:443:2: ( ( rule__Calculate__Group__0 ) )
            // InternalCalculatorForm.g:444:3: ( rule__Calculate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:445:3: ( rule__Calculate__Group__0 )
            // InternalCalculatorForm.g:445:4: rule__Calculate__Group__0
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
    // InternalCalculatorForm.g:454:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:455:1: ( ruleQualifiedName EOF )
            // InternalCalculatorForm.g:456:1: ruleQualifiedName EOF
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
    // InternalCalculatorForm.g:463:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:467:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalCalculatorForm.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalCalculatorForm.g:468:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalCalculatorForm.g:469:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:470:3: ( rule__QualifiedName__Group__0 )
            // InternalCalculatorForm.g:470:4: rule__QualifiedName__Group__0
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
    // InternalCalculatorForm.g:479:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:480:1: ( ruleExpression EOF )
            // InternalCalculatorForm.g:481:1: ruleExpression EOF
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
    // InternalCalculatorForm.g:488:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:492:2: ( ( ruleAddition ) )
            // InternalCalculatorForm.g:493:2: ( ruleAddition )
            {
            // InternalCalculatorForm.g:493:2: ( ruleAddition )
            // InternalCalculatorForm.g:494:3: ruleAddition
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
    // InternalCalculatorForm.g:504:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:505:1: ( ruleAddition EOF )
            // InternalCalculatorForm.g:506:1: ruleAddition EOF
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
    // InternalCalculatorForm.g:513:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:517:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalCalculatorForm.g:518:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalCalculatorForm.g:518:2: ( ( rule__Addition__Group__0 ) )
            // InternalCalculatorForm.g:519:3: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:520:3: ( rule__Addition__Group__0 )
            // InternalCalculatorForm.g:520:4: rule__Addition__Group__0
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
    // InternalCalculatorForm.g:529:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:530:1: ( ruleMultiplication EOF )
            // InternalCalculatorForm.g:531:1: ruleMultiplication EOF
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
    // InternalCalculatorForm.g:538:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:542:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalCalculatorForm.g:543:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalCalculatorForm.g:543:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalCalculatorForm.g:544:3: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalCalculatorForm.g:545:3: ( rule__Multiplication__Group__0 )
            // InternalCalculatorForm.g:545:4: rule__Multiplication__Group__0
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
    // InternalCalculatorForm.g:554:1: entryRulePrefixed : rulePrefixed EOF ;
    public final void entryRulePrefixed() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:555:1: ( rulePrefixed EOF )
            // InternalCalculatorForm.g:556:1: rulePrefixed EOF
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
    // InternalCalculatorForm.g:563:1: rulePrefixed : ( ( rule__Prefixed__Alternatives ) ) ;
    public final void rulePrefixed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:567:2: ( ( ( rule__Prefixed__Alternatives ) ) )
            // InternalCalculatorForm.g:568:2: ( ( rule__Prefixed__Alternatives ) )
            {
            // InternalCalculatorForm.g:568:2: ( ( rule__Prefixed__Alternatives ) )
            // InternalCalculatorForm.g:569:3: ( rule__Prefixed__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:570:3: ( rule__Prefixed__Alternatives )
            // InternalCalculatorForm.g:570:4: rule__Prefixed__Alternatives
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


    // $ANTLR start "entryRuleAtomic"
    // InternalCalculatorForm.g:579:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:580:1: ( ruleAtomic EOF )
            // InternalCalculatorForm.g:581:1: ruleAtomic EOF
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
    // InternalCalculatorForm.g:588:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:592:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalCalculatorForm.g:593:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalCalculatorForm.g:593:2: ( ( rule__Atomic__Alternatives ) )
            // InternalCalculatorForm.g:594:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalCalculatorForm.g:595:3: ( rule__Atomic__Alternatives )
            // InternalCalculatorForm.g:595:4: rule__Atomic__Alternatives
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


    // $ANTLR start "rule__FormElement__Alternatives"
    // InternalCalculatorForm.g:603:1: rule__FormElement__Alternatives : ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) );
    public final void rule__FormElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:607:1: ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
            case 18:
            case 25:
            case 28:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCalculatorForm.g:608:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:608:2: ( ruleField )
                    // InternalCalculatorForm.g:609:3: ruleField
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
                    // InternalCalculatorForm.g:614:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:614:2: ( ruleGroup )
                    // InternalCalculatorForm.g:615:3: ruleGroup
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
                    // InternalCalculatorForm.g:620:2: ( rulePage )
                    {
                    // InternalCalculatorForm.g:620:2: ( rulePage )
                    // InternalCalculatorForm.g:621:3: rulePage
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
    // InternalCalculatorForm.g:630:1: rule__Field__Alternatives : ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:634:1: ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
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
                    // InternalCalculatorForm.g:635:2: ( ruleFieldInput )
                    {
                    // InternalCalculatorForm.g:635:2: ( ruleFieldInput )
                    // InternalCalculatorForm.g:636:3: ruleFieldInput
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
                    // InternalCalculatorForm.g:641:2: ( ruleFieldSelect )
                    {
                    // InternalCalculatorForm.g:641:2: ( ruleFieldSelect )
                    // InternalCalculatorForm.g:642:3: ruleFieldSelect
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
                    // InternalCalculatorForm.g:647:2: ( ruleFieldChoice )
                    {
                    // InternalCalculatorForm.g:647:2: ( ruleFieldChoice )
                    // InternalCalculatorForm.g:648:3: ruleFieldChoice
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
                    // InternalCalculatorForm.g:653:2: ( ruleButton )
                    {
                    // InternalCalculatorForm.g:653:2: ( ruleButton )
                    // InternalCalculatorForm.g:654:3: ruleButton
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
    // InternalCalculatorForm.g:663:1: rule__FieldSelectChild__Alternatives : ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) );
    public final void rule__FieldSelectChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:667:1: ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCalculatorForm.g:668:2: ( ruleFieldOption )
                    {
                    // InternalCalculatorForm.g:668:2: ( ruleFieldOption )
                    // InternalCalculatorForm.g:669:3: ruleFieldOption
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
                    // InternalCalculatorForm.g:674:2: ( ruleFieldOptionGroup )
                    {
                    // InternalCalculatorForm.g:674:2: ( ruleFieldOptionGroup )
                    // InternalCalculatorForm.g:675:3: ruleFieldOptionGroup
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
    // InternalCalculatorForm.g:684:1: rule__PageChild__Alternatives : ( ( ruleGroup ) | ( ruleField ) );
    public final void rule__PageChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:688:1: ( ( ruleGroup ) | ( ruleField ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==14||LA4_0==18||LA4_0==25||LA4_0==28) ) {
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
                    // InternalCalculatorForm.g:689:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:689:2: ( ruleGroup )
                    // InternalCalculatorForm.g:690:3: ruleGroup
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
                    // InternalCalculatorForm.g:695:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:695:2: ( ruleField )
                    // InternalCalculatorForm.g:696:3: ruleField
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
    // InternalCalculatorForm.g:705:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:709:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
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
                    // InternalCalculatorForm.g:710:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalCalculatorForm.g:710:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalCalculatorForm.g:711:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // InternalCalculatorForm.g:712:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalCalculatorForm.g:712:4: rule__Addition__Group_1_0_0__0
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
                    // InternalCalculatorForm.g:716:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalCalculatorForm.g:716:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalCalculatorForm.g:717:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // InternalCalculatorForm.g:718:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalCalculatorForm.g:718:4: rule__Addition__Group_1_0_1__0
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


    // $ANTLR start "rule__Multiplication__OpAlternatives_1_0_1_0"
    // InternalCalculatorForm.g:726:1: rule__Multiplication__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:730:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
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
                    // InternalCalculatorForm.g:731:2: ( '*' )
                    {
                    // InternalCalculatorForm.g:731:2: ( '*' )
                    // InternalCalculatorForm.g:732:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:737:2: ( '/' )
                    {
                    // InternalCalculatorForm.g:737:2: ( '/' )
                    // InternalCalculatorForm.g:738:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
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
    // $ANTLR end "rule__Multiplication__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Prefixed__Alternatives"
    // InternalCalculatorForm.g:747:1: rule__Prefixed__Alternatives : ( ( ( rule__Prefixed__Group_0__0 ) ) | ( ( rule__Prefixed__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Prefixed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:751:1: ( ( ( rule__Prefixed__Group_0__0 ) ) | ( ( rule__Prefixed__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_FLOAT:
            case 35:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCalculatorForm.g:752:2: ( ( rule__Prefixed__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:752:2: ( ( rule__Prefixed__Group_0__0 ) )
                    // InternalCalculatorForm.g:753:3: ( rule__Prefixed__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:754:3: ( rule__Prefixed__Group_0__0 )
                    // InternalCalculatorForm.g:754:4: rule__Prefixed__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Prefixed__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:758:2: ( ( rule__Prefixed__Group_1__0 ) )
                    {
                    // InternalCalculatorForm.g:758:2: ( ( rule__Prefixed__Group_1__0 ) )
                    // InternalCalculatorForm.g:759:3: ( rule__Prefixed__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getGroup_1()); 
                    }
                    // InternalCalculatorForm.g:760:3: ( rule__Prefixed__Group_1__0 )
                    // InternalCalculatorForm.g:760:4: rule__Prefixed__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Prefixed__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:764:2: ( ruleAtomic )
                    {
                    // InternalCalculatorForm.g:764:2: ( ruleAtomic )
                    // InternalCalculatorForm.g:765:3: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixedAccess().getAtomicParserRuleCall_2()); 
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


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalCalculatorForm.g:774:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:778:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCalculatorForm.g:779:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalCalculatorForm.g:779:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalCalculatorForm.g:780:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalCalculatorForm.g:781:3: ( rule__Atomic__Group_0__0 )
                    // InternalCalculatorForm.g:781:4: rule__Atomic__Group_0__0
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
                    // InternalCalculatorForm.g:785:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalCalculatorForm.g:785:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalCalculatorForm.g:786:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalCalculatorForm.g:787:3: ( rule__Atomic__Group_1__0 )
                    // InternalCalculatorForm.g:787:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:791:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalCalculatorForm.g:791:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalCalculatorForm.g:792:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalCalculatorForm.g:793:3: ( rule__Atomic__Group_2__0 )
                    // InternalCalculatorForm.g:793:4: rule__Atomic__Group_2__0
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
                case 4 :
                    // InternalCalculatorForm.g:797:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalCalculatorForm.g:797:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalCalculatorForm.g:798:3: ( rule__Atomic__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    }
                    // InternalCalculatorForm.g:799:3: ( rule__Atomic__Group_3__0 )
                    // InternalCalculatorForm.g:799:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_3()); 
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalCalculatorForm.g:807:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:811:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCalculatorForm.g:812:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalCalculatorForm.g:819:1: rule__Model__Group__0__Impl : ( ( rule__Model__FormElementsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:823:1: ( ( ( rule__Model__FormElementsAssignment_0 )* ) )
            // InternalCalculatorForm.g:824:1: ( ( rule__Model__FormElementsAssignment_0 )* )
            {
            // InternalCalculatorForm.g:824:1: ( ( rule__Model__FormElementsAssignment_0 )* )
            // InternalCalculatorForm.g:825:2: ( rule__Model__FormElementsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFormElementsAssignment_0()); 
            }
            // InternalCalculatorForm.g:826:2: ( rule__Model__FormElementsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||LA9_0==18||(LA9_0>=25 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCalculatorForm.g:826:3: rule__Model__FormElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__FormElementsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFormElementsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalCalculatorForm.g:834:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:838:1: ( rule__Model__Group__1__Impl )
            // InternalCalculatorForm.g:839:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalCalculatorForm.g:845:1: rule__Model__Group__1__Impl : ( ( rule__Model__CalculationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:849:1: ( ( ( rule__Model__CalculationsAssignment_1 )* ) )
            // InternalCalculatorForm.g:850:1: ( ( rule__Model__CalculationsAssignment_1 )* )
            {
            // InternalCalculatorForm.g:850:1: ( ( rule__Model__CalculationsAssignment_1 )* )
            // InternalCalculatorForm.g:851:2: ( rule__Model__CalculationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCalculationsAssignment_1()); 
            }
            // InternalCalculatorForm.g:852:2: ( rule__Model__CalculationsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCalculatorForm.g:852:3: rule__Model__CalculationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__CalculationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getCalculationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__FieldInput__Group__0"
    // InternalCalculatorForm.g:861:1: rule__FieldInput__Group__0 : rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 ;
    public final void rule__FieldInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:865:1: ( rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 )
            // InternalCalculatorForm.g:866:2: rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCalculatorForm.g:873:1: rule__FieldInput__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:877:1: ( ( 'field' ) )
            // InternalCalculatorForm.g:878:1: ( 'field' )
            {
            // InternalCalculatorForm.g:878:1: ( 'field' )
            // InternalCalculatorForm.g:879:2: 'field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFieldKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:888:1: rule__FieldInput__Group__1 : rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 ;
    public final void rule__FieldInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:892:1: ( rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 )
            // InternalCalculatorForm.g:893:2: rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:900:1: rule__FieldInput__Group__1__Impl : ( ( rule__FieldInput__NameAssignment_1 ) ) ;
    public final void rule__FieldInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:904:1: ( ( ( rule__FieldInput__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:905:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:905:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            // InternalCalculatorForm.g:906:2: ( rule__FieldInput__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:907:2: ( rule__FieldInput__NameAssignment_1 )
            // InternalCalculatorForm.g:907:3: rule__FieldInput__NameAssignment_1
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
    // InternalCalculatorForm.g:915:1: rule__FieldInput__Group__2 : rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 ;
    public final void rule__FieldInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:919:1: ( rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 )
            // InternalCalculatorForm.g:920:2: rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:927:1: rule__FieldInput__Group__2__Impl : ( ( rule__FieldInput__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:931:1: ( ( ( rule__FieldInput__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:932:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:932:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:933:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:934:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:934:3: rule__FieldInput__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:942:1: rule__FieldInput__Group__3 : rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 ;
    public final void rule__FieldInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:946:1: ( rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 )
            // InternalCalculatorForm.g:947:2: rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:954:1: rule__FieldInput__Group__3__Impl : ( ( rule__FieldInput__DisabledAssignment_3 )? ) ;
    public final void rule__FieldInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:958:1: ( ( ( rule__FieldInput__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:959:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:959:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:960:2: ( rule__FieldInput__DisabledAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledAssignment_3()); 
            }
            // InternalCalculatorForm.g:961:2: ( rule__FieldInput__DisabledAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCalculatorForm.g:961:3: rule__FieldInput__DisabledAssignment_3
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
    // InternalCalculatorForm.g:969:1: rule__FieldInput__Group__4 : rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 ;
    public final void rule__FieldInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:973:1: ( rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 )
            // InternalCalculatorForm.g:974:2: rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:981:1: rule__FieldInput__Group__4__Impl : ( ( rule__FieldInput__Group_4__0 )? ) ;
    public final void rule__FieldInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:985:1: ( ( ( rule__FieldInput__Group_4__0 )? ) )
            // InternalCalculatorForm.g:986:1: ( ( rule__FieldInput__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:986:1: ( ( rule__FieldInput__Group_4__0 )? )
            // InternalCalculatorForm.g:987:2: ( rule__FieldInput__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:988:2: ( rule__FieldInput__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculatorForm.g:988:3: rule__FieldInput__Group_4__0
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
    // InternalCalculatorForm.g:996:1: rule__FieldInput__Group__5 : rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 ;
    public final void rule__FieldInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1000:1: ( rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 )
            // InternalCalculatorForm.g:1001:2: rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:1008:1: rule__FieldInput__Group__5__Impl : ( ( rule__FieldInput__Group_5__0 )? ) ;
    public final void rule__FieldInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1012:1: ( ( ( rule__FieldInput__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1013:1: ( ( rule__FieldInput__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1013:1: ( ( rule__FieldInput__Group_5__0 )? )
            // InternalCalculatorForm.g:1014:2: ( rule__FieldInput__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:1015:2: ( rule__FieldInput__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCalculatorForm.g:1015:3: rule__FieldInput__Group_5__0
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
    // InternalCalculatorForm.g:1023:1: rule__FieldInput__Group__6 : rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 ;
    public final void rule__FieldInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1027:1: ( rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 )
            // InternalCalculatorForm.g:1028:2: rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:1035:1: rule__FieldInput__Group__6__Impl : ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) ;
    public final void rule__FieldInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1039:1: ( ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) )
            // InternalCalculatorForm.g:1040:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            {
            // InternalCalculatorForm.g:1040:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            // InternalCalculatorForm.g:1041:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedAssignment_6()); 
            }
            // InternalCalculatorForm.g:1042:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatorForm.g:1042:3: rule__FieldInput__NotdisplayedAssignment_6
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
    // InternalCalculatorForm.g:1050:1: rule__FieldInput__Group__7 : rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 ;
    public final void rule__FieldInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1054:1: ( rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 )
            // InternalCalculatorForm.g:1055:2: rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:1062:1: rule__FieldInput__Group__7__Impl : ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) ;
    public final void rule__FieldInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1066:1: ( ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) )
            // InternalCalculatorForm.g:1067:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            {
            // InternalCalculatorForm.g:1067:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            // InternalCalculatorForm.g:1068:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyAssignment_7()); 
            }
            // InternalCalculatorForm.g:1069:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculatorForm.g:1069:3: rule__FieldInput__ReadonlyAssignment_7
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
    // InternalCalculatorForm.g:1077:1: rule__FieldInput__Group__8 : rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 ;
    public final void rule__FieldInput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1081:1: ( rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 )
            // InternalCalculatorForm.g:1082:2: rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalCalculatorForm.g:1089:1: rule__FieldInput__Group__8__Impl : ( ( rule__FieldInput__RequiredAssignment_8 )? ) ;
    public final void rule__FieldInput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1093:1: ( ( ( rule__FieldInput__RequiredAssignment_8 )? ) )
            // InternalCalculatorForm.g:1094:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            {
            // InternalCalculatorForm.g:1094:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            // InternalCalculatorForm.g:1095:2: ( rule__FieldInput__RequiredAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredAssignment_8()); 
            }
            // InternalCalculatorForm.g:1096:2: ( rule__FieldInput__RequiredAssignment_8 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCalculatorForm.g:1096:3: rule__FieldInput__RequiredAssignment_8
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
    // InternalCalculatorForm.g:1104:1: rule__FieldInput__Group__9 : rule__FieldInput__Group__9__Impl ;
    public final void rule__FieldInput__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1108:1: ( rule__FieldInput__Group__9__Impl )
            // InternalCalculatorForm.g:1109:2: rule__FieldInput__Group__9__Impl
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
    // InternalCalculatorForm.g:1115:1: rule__FieldInput__Group__9__Impl : ( ( rule__FieldInput__Group_9__0 )? ) ;
    public final void rule__FieldInput__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1119:1: ( ( ( rule__FieldInput__Group_9__0 )? ) )
            // InternalCalculatorForm.g:1120:1: ( ( rule__FieldInput__Group_9__0 )? )
            {
            // InternalCalculatorForm.g:1120:1: ( ( rule__FieldInput__Group_9__0 )? )
            // InternalCalculatorForm.g:1121:2: ( rule__FieldInput__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getGroup_9()); 
            }
            // InternalCalculatorForm.g:1122:2: ( rule__FieldInput__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculatorForm.g:1122:3: rule__FieldInput__Group_9__0
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
    // InternalCalculatorForm.g:1131:1: rule__FieldInput__Group_4__0 : rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 ;
    public final void rule__FieldInput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1135:1: ( rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 )
            // InternalCalculatorForm.g:1136:2: rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:1143:1: rule__FieldInput__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldInput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1147:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1148:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1148:1: ( 'form' )
            // InternalCalculatorForm.g:1149:2: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFormKeyword_4_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1158:1: rule__FieldInput__Group_4__1 : rule__FieldInput__Group_4__1__Impl ;
    public final void rule__FieldInput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1162:1: ( rule__FieldInput__Group_4__1__Impl )
            // InternalCalculatorForm.g:1163:2: rule__FieldInput__Group_4__1__Impl
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
    // InternalCalculatorForm.g:1169:1: rule__FieldInput__Group_4__1__Impl : ( ( rule__FieldInput__FormAssignment_4_1 ) ) ;
    public final void rule__FieldInput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1173:1: ( ( ( rule__FieldInput__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1174:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1174:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:1175:2: ( rule__FieldInput__FormAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getFormAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:1176:2: ( rule__FieldInput__FormAssignment_4_1 )
            // InternalCalculatorForm.g:1176:3: rule__FieldInput__FormAssignment_4_1
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
    // InternalCalculatorForm.g:1185:1: rule__FieldInput__Group_5__0 : rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 ;
    public final void rule__FieldInput__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1189:1: ( rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 )
            // InternalCalculatorForm.g:1190:2: rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:1197:1: rule__FieldInput__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldInput__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1201:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1202:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1202:1: ( 'label' )
            // InternalCalculatorForm.g:1203:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getLabelKeyword_5_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1212:1: rule__FieldInput__Group_5__1 : rule__FieldInput__Group_5__1__Impl ;
    public final void rule__FieldInput__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1216:1: ( rule__FieldInput__Group_5__1__Impl )
            // InternalCalculatorForm.g:1217:2: rule__FieldInput__Group_5__1__Impl
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
    // InternalCalculatorForm.g:1223:1: rule__FieldInput__Group_5__1__Impl : ( ( rule__FieldInput__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldInput__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1227:1: ( ( ( rule__FieldInput__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:1228:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:1228:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:1229:2: ( rule__FieldInput__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getLabelAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:1230:2: ( rule__FieldInput__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:1230:3: rule__FieldInput__LabelAssignment_5_1
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
    // InternalCalculatorForm.g:1239:1: rule__FieldInput__Group_9__0 : rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 ;
    public final void rule__FieldInput__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1243:1: ( rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 )
            // InternalCalculatorForm.g:1244:2: rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:1251:1: rule__FieldInput__Group_9__0__Impl : ( 'value' ) ;
    public final void rule__FieldInput__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1255:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:1256:1: ( 'value' )
            {
            // InternalCalculatorForm.g:1256:1: ( 'value' )
            // InternalCalculatorForm.g:1257:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getValueKeyword_9_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1266:1: rule__FieldInput__Group_9__1 : rule__FieldInput__Group_9__1__Impl ;
    public final void rule__FieldInput__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1270:1: ( rule__FieldInput__Group_9__1__Impl )
            // InternalCalculatorForm.g:1271:2: rule__FieldInput__Group_9__1__Impl
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
    // InternalCalculatorForm.g:1277:1: rule__FieldInput__Group_9__1__Impl : ( ( rule__FieldInput__ValueAssignment_9_1 ) ) ;
    public final void rule__FieldInput__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1281:1: ( ( ( rule__FieldInput__ValueAssignment_9_1 ) ) )
            // InternalCalculatorForm.g:1282:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            {
            // InternalCalculatorForm.g:1282:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            // InternalCalculatorForm.g:1283:2: ( rule__FieldInput__ValueAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getValueAssignment_9_1()); 
            }
            // InternalCalculatorForm.g:1284:2: ( rule__FieldInput__ValueAssignment_9_1 )
            // InternalCalculatorForm.g:1284:3: rule__FieldInput__ValueAssignment_9_1
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
    // InternalCalculatorForm.g:1293:1: rule__FieldSelect__Group__0 : rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 ;
    public final void rule__FieldSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1297:1: ( rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 )
            // InternalCalculatorForm.g:1298:2: rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCalculatorForm.g:1305:1: rule__FieldSelect__Group__0__Impl : ( 'dropdown' ) ;
    public final void rule__FieldSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1309:1: ( ( 'dropdown' ) )
            // InternalCalculatorForm.g:1310:1: ( 'dropdown' )
            {
            // InternalCalculatorForm.g:1310:1: ( 'dropdown' )
            // InternalCalculatorForm.g:1311:2: 'dropdown'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDropdownKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1320:1: rule__FieldSelect__Group__1 : rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 ;
    public final void rule__FieldSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1324:1: ( rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 )
            // InternalCalculatorForm.g:1325:2: rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1332:1: rule__FieldSelect__Group__1__Impl : ( ( rule__FieldSelect__NameAssignment_1 ) ) ;
    public final void rule__FieldSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1336:1: ( ( ( rule__FieldSelect__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1337:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1337:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1338:2: ( rule__FieldSelect__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:1339:2: ( rule__FieldSelect__NameAssignment_1 )
            // InternalCalculatorForm.g:1339:3: rule__FieldSelect__NameAssignment_1
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
    // InternalCalculatorForm.g:1347:1: rule__FieldSelect__Group__2 : rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 ;
    public final void rule__FieldSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1351:1: ( rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 )
            // InternalCalculatorForm.g:1352:2: rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1359:1: rule__FieldSelect__Group__2__Impl : ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1363:1: ( ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:1364:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1364:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:1365:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:1366:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCalculatorForm.g:1366:3: rule__FieldSelect__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:1374:1: rule__FieldSelect__Group__3 : rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 ;
    public final void rule__FieldSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1378:1: ( rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 )
            // InternalCalculatorForm.g:1379:2: rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1386:1: rule__FieldSelect__Group__3__Impl : ( ( rule__FieldSelect__DisabledAssignment_3 )? ) ;
    public final void rule__FieldSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1390:1: ( ( ( rule__FieldSelect__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:1391:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1391:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:1392:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledAssignment_3()); 
            }
            // InternalCalculatorForm.g:1393:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCalculatorForm.g:1393:3: rule__FieldSelect__DisabledAssignment_3
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
    // InternalCalculatorForm.g:1401:1: rule__FieldSelect__Group__4 : rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 ;
    public final void rule__FieldSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1405:1: ( rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 )
            // InternalCalculatorForm.g:1406:2: rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1413:1: rule__FieldSelect__Group__4__Impl : ( ( rule__FieldSelect__Group_4__0 )? ) ;
    public final void rule__FieldSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1417:1: ( ( ( rule__FieldSelect__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1418:1: ( ( rule__FieldSelect__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1418:1: ( ( rule__FieldSelect__Group_4__0 )? )
            // InternalCalculatorForm.g:1419:2: ( rule__FieldSelect__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:1420:2: ( rule__FieldSelect__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCalculatorForm.g:1420:3: rule__FieldSelect__Group_4__0
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
    // InternalCalculatorForm.g:1428:1: rule__FieldSelect__Group__5 : rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 ;
    public final void rule__FieldSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1432:1: ( rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 )
            // InternalCalculatorForm.g:1433:2: rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1440:1: rule__FieldSelect__Group__5__Impl : ( ( rule__FieldSelect__Group_5__0 )? ) ;
    public final void rule__FieldSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1444:1: ( ( ( rule__FieldSelect__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1445:1: ( ( rule__FieldSelect__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1445:1: ( ( rule__FieldSelect__Group_5__0 )? )
            // InternalCalculatorForm.g:1446:2: ( rule__FieldSelect__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:1447:2: ( rule__FieldSelect__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCalculatorForm.g:1447:3: rule__FieldSelect__Group_5__0
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
    // InternalCalculatorForm.g:1455:1: rule__FieldSelect__Group__6 : rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 ;
    public final void rule__FieldSelect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1459:1: ( rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 )
            // InternalCalculatorForm.g:1460:2: rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1467:1: rule__FieldSelect__Group__6__Impl : ( ( rule__FieldSelect__MultipleAssignment_6 )? ) ;
    public final void rule__FieldSelect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1471:1: ( ( ( rule__FieldSelect__MultipleAssignment_6 )? ) )
            // InternalCalculatorForm.g:1472:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            {
            // InternalCalculatorForm.g:1472:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            // InternalCalculatorForm.g:1473:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleAssignment_6()); 
            }
            // InternalCalculatorForm.g:1474:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCalculatorForm.g:1474:3: rule__FieldSelect__MultipleAssignment_6
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
    // InternalCalculatorForm.g:1482:1: rule__FieldSelect__Group__7 : rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 ;
    public final void rule__FieldSelect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1486:1: ( rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 )
            // InternalCalculatorForm.g:1487:2: rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1494:1: rule__FieldSelect__Group__7__Impl : ( ( rule__FieldSelect__RequiredAssignment_7 )? ) ;
    public final void rule__FieldSelect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1498:1: ( ( ( rule__FieldSelect__RequiredAssignment_7 )? ) )
            // InternalCalculatorForm.g:1499:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            {
            // InternalCalculatorForm.g:1499:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            // InternalCalculatorForm.g:1500:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredAssignment_7()); 
            }
            // InternalCalculatorForm.g:1501:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCalculatorForm.g:1501:3: rule__FieldSelect__RequiredAssignment_7
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
    // InternalCalculatorForm.g:1509:1: rule__FieldSelect__Group__8 : rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 ;
    public final void rule__FieldSelect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1513:1: ( rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 )
            // InternalCalculatorForm.g:1514:2: rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalCalculatorForm.g:1521:1: rule__FieldSelect__Group__8__Impl : ( ( rule__FieldSelect__Group_8__0 )? ) ;
    public final void rule__FieldSelect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1525:1: ( ( ( rule__FieldSelect__Group_8__0 )? ) )
            // InternalCalculatorForm.g:1526:1: ( ( rule__FieldSelect__Group_8__0 )? )
            {
            // InternalCalculatorForm.g:1526:1: ( ( rule__FieldSelect__Group_8__0 )? )
            // InternalCalculatorForm.g:1527:2: ( rule__FieldSelect__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getGroup_8()); 
            }
            // InternalCalculatorForm.g:1528:2: ( rule__FieldSelect__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCalculatorForm.g:1528:3: rule__FieldSelect__Group_8__0
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
    // InternalCalculatorForm.g:1536:1: rule__FieldSelect__Group__9 : rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 ;
    public final void rule__FieldSelect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1540:1: ( rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 )
            // InternalCalculatorForm.g:1541:2: rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10
            {
            pushFollow(FOLLOW_10);
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
    // InternalCalculatorForm.g:1548:1: rule__FieldSelect__Group__9__Impl : ( '{' ) ;
    public final void rule__FieldSelect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1552:1: ( ( '{' ) )
            // InternalCalculatorForm.g:1553:1: ( '{' )
            {
            // InternalCalculatorForm.g:1553:1: ( '{' )
            // InternalCalculatorForm.g:1554:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1563:1: rule__FieldSelect__Group__10 : rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 ;
    public final void rule__FieldSelect__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1567:1: ( rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 )
            // InternalCalculatorForm.g:1568:2: rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11
            {
            pushFollow(FOLLOW_10);
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
    // InternalCalculatorForm.g:1575:1: rule__FieldSelect__Group__10__Impl : ( ( rule__FieldSelect__ChildsAssignment_10 )* ) ;
    public final void rule__FieldSelect__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1579:1: ( ( ( rule__FieldSelect__ChildsAssignment_10 )* ) )
            // InternalCalculatorForm.g:1580:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            {
            // InternalCalculatorForm.g:1580:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            // InternalCalculatorForm.g:1581:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getChildsAssignment_10()); 
            }
            // InternalCalculatorForm.g:1582:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22||LA26_0==24) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCalculatorForm.g:1582:3: rule__FieldSelect__ChildsAssignment_10
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FieldSelect__ChildsAssignment_10();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalCalculatorForm.g:1590:1: rule__FieldSelect__Group__11 : rule__FieldSelect__Group__11__Impl ;
    public final void rule__FieldSelect__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1594:1: ( rule__FieldSelect__Group__11__Impl )
            // InternalCalculatorForm.g:1595:2: rule__FieldSelect__Group__11__Impl
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
    // InternalCalculatorForm.g:1601:1: rule__FieldSelect__Group__11__Impl : ( '}' ) ;
    public final void rule__FieldSelect__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1605:1: ( ( '}' ) )
            // InternalCalculatorForm.g:1606:1: ( '}' )
            {
            // InternalCalculatorForm.g:1606:1: ( '}' )
            // InternalCalculatorForm.g:1607:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1617:1: rule__FieldSelect__Group_4__0 : rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 ;
    public final void rule__FieldSelect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1621:1: ( rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 )
            // InternalCalculatorForm.g:1622:2: rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:1629:1: rule__FieldSelect__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldSelect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1633:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1634:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1634:1: ( 'form' )
            // InternalCalculatorForm.g:1635:2: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getFormKeyword_4_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1644:1: rule__FieldSelect__Group_4__1 : rule__FieldSelect__Group_4__1__Impl ;
    public final void rule__FieldSelect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1648:1: ( rule__FieldSelect__Group_4__1__Impl )
            // InternalCalculatorForm.g:1649:2: rule__FieldSelect__Group_4__1__Impl
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
    // InternalCalculatorForm.g:1655:1: rule__FieldSelect__Group_4__1__Impl : ( ( rule__FieldSelect__FormAssignment_4_1 ) ) ;
    public final void rule__FieldSelect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1659:1: ( ( ( rule__FieldSelect__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1660:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1660:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:1661:2: ( rule__FieldSelect__FormAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getFormAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:1662:2: ( rule__FieldSelect__FormAssignment_4_1 )
            // InternalCalculatorForm.g:1662:3: rule__FieldSelect__FormAssignment_4_1
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
    // InternalCalculatorForm.g:1671:1: rule__FieldSelect__Group_5__0 : rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 ;
    public final void rule__FieldSelect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1675:1: ( rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 )
            // InternalCalculatorForm.g:1676:2: rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:1683:1: rule__FieldSelect__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldSelect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1687:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1688:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1688:1: ( 'label' )
            // InternalCalculatorForm.g:1689:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1698:1: rule__FieldSelect__Group_5__1 : rule__FieldSelect__Group_5__1__Impl ;
    public final void rule__FieldSelect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1702:1: ( rule__FieldSelect__Group_5__1__Impl )
            // InternalCalculatorForm.g:1703:2: rule__FieldSelect__Group_5__1__Impl
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
    // InternalCalculatorForm.g:1709:1: rule__FieldSelect__Group_5__1__Impl : ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldSelect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1713:1: ( ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:1714:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:1714:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:1715:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getLabelAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:1716:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:1716:3: rule__FieldSelect__LabelAssignment_5_1
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
    // InternalCalculatorForm.g:1725:1: rule__FieldSelect__Group_8__0 : rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 ;
    public final void rule__FieldSelect__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1729:1: ( rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 )
            // InternalCalculatorForm.g:1730:2: rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCalculatorForm.g:1737:1: rule__FieldSelect__Group_8__0__Impl : ( 'size' ) ;
    public final void rule__FieldSelect__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1741:1: ( ( 'size' ) )
            // InternalCalculatorForm.g:1742:1: ( 'size' )
            {
            // InternalCalculatorForm.g:1742:1: ( 'size' )
            // InternalCalculatorForm.g:1743:2: 'size'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1752:1: rule__FieldSelect__Group_8__1 : rule__FieldSelect__Group_8__1__Impl ;
    public final void rule__FieldSelect__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1756:1: ( rule__FieldSelect__Group_8__1__Impl )
            // InternalCalculatorForm.g:1757:2: rule__FieldSelect__Group_8__1__Impl
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
    // InternalCalculatorForm.g:1763:1: rule__FieldSelect__Group_8__1__Impl : ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) ;
    public final void rule__FieldSelect__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1767:1: ( ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) )
            // InternalCalculatorForm.g:1768:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            {
            // InternalCalculatorForm.g:1768:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            // InternalCalculatorForm.g:1769:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getSizeAssignment_8_1()); 
            }
            // InternalCalculatorForm.g:1770:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            // InternalCalculatorForm.g:1770:3: rule__FieldSelect__SizeAssignment_8_1
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
    // InternalCalculatorForm.g:1779:1: rule__FieldOption__Group__0 : rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 ;
    public final void rule__FieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1783:1: ( rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 )
            // InternalCalculatorForm.g:1784:2: rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:1791:1: rule__FieldOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1795:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:1796:1: ( 'option' )
            {
            // InternalCalculatorForm.g:1796:1: ( 'option' )
            // InternalCalculatorForm.g:1797:2: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getOptionKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1806:1: rule__FieldOption__Group__1 : rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 ;
    public final void rule__FieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1810:1: ( rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 )
            // InternalCalculatorForm.g:1811:2: rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalCalculatorForm.g:1818:1: rule__FieldOption__Group__1__Impl : ( ( rule__FieldOption__TextAssignment_1 ) ) ;
    public final void rule__FieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1822:1: ( ( ( rule__FieldOption__TextAssignment_1 ) ) )
            // InternalCalculatorForm.g:1823:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1823:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            // InternalCalculatorForm.g:1824:2: ( rule__FieldOption__TextAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextAssignment_1()); 
            }
            // InternalCalculatorForm.g:1825:2: ( rule__FieldOption__TextAssignment_1 )
            // InternalCalculatorForm.g:1825:3: rule__FieldOption__TextAssignment_1
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
    // InternalCalculatorForm.g:1833:1: rule__FieldOption__Group__2 : rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 ;
    public final void rule__FieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1837:1: ( rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 )
            // InternalCalculatorForm.g:1838:2: rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCalculatorForm.g:1845:1: rule__FieldOption__Group__2__Impl : ( ( rule__FieldOption__DisabledAssignment_2 )? ) ;
    public final void rule__FieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1849:1: ( ( ( rule__FieldOption__DisabledAssignment_2 )? ) )
            // InternalCalculatorForm.g:1850:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1850:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            // InternalCalculatorForm.g:1851:2: ( rule__FieldOption__DisabledAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledAssignment_2()); 
            }
            // InternalCalculatorForm.g:1852:2: ( rule__FieldOption__DisabledAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCalculatorForm.g:1852:3: rule__FieldOption__DisabledAssignment_2
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
    // InternalCalculatorForm.g:1860:1: rule__FieldOption__Group__3 : rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 ;
    public final void rule__FieldOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1864:1: ( rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 )
            // InternalCalculatorForm.g:1865:2: rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalCalculatorForm.g:1872:1: rule__FieldOption__Group__3__Impl : ( ( rule__FieldOption__SelectedAssignment_3 )? ) ;
    public final void rule__FieldOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1876:1: ( ( ( rule__FieldOption__SelectedAssignment_3 )? ) )
            // InternalCalculatorForm.g:1877:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1877:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            // InternalCalculatorForm.g:1878:2: ( rule__FieldOption__SelectedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedAssignment_3()); 
            }
            // InternalCalculatorForm.g:1879:2: ( rule__FieldOption__SelectedAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCalculatorForm.g:1879:3: rule__FieldOption__SelectedAssignment_3
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
    // InternalCalculatorForm.g:1887:1: rule__FieldOption__Group__4 : rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 ;
    public final void rule__FieldOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1891:1: ( rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 )
            // InternalCalculatorForm.g:1892:2: rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalCalculatorForm.g:1899:1: rule__FieldOption__Group__4__Impl : ( ( rule__FieldOption__Group_4__0 )? ) ;
    public final void rule__FieldOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1903:1: ( ( ( rule__FieldOption__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1904:1: ( ( rule__FieldOption__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1904:1: ( ( rule__FieldOption__Group_4__0 )? )
            // InternalCalculatorForm.g:1905:2: ( rule__FieldOption__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup_4()); 
            }
            // InternalCalculatorForm.g:1906:2: ( rule__FieldOption__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCalculatorForm.g:1906:3: rule__FieldOption__Group_4__0
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
    // InternalCalculatorForm.g:1914:1: rule__FieldOption__Group__5 : rule__FieldOption__Group__5__Impl ;
    public final void rule__FieldOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1918:1: ( rule__FieldOption__Group__5__Impl )
            // InternalCalculatorForm.g:1919:2: rule__FieldOption__Group__5__Impl
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
    // InternalCalculatorForm.g:1925:1: rule__FieldOption__Group__5__Impl : ( ( rule__FieldOption__Group_5__0 )? ) ;
    public final void rule__FieldOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1929:1: ( ( ( rule__FieldOption__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1930:1: ( ( rule__FieldOption__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1930:1: ( ( rule__FieldOption__Group_5__0 )? )
            // InternalCalculatorForm.g:1931:2: ( rule__FieldOption__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:1932:2: ( rule__FieldOption__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCalculatorForm.g:1932:3: rule__FieldOption__Group_5__0
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
    // InternalCalculatorForm.g:1941:1: rule__FieldOption__Group_4__0 : rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 ;
    public final void rule__FieldOption__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1945:1: ( rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 )
            // InternalCalculatorForm.g:1946:2: rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:1953:1: rule__FieldOption__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__FieldOption__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1957:1: ( ( 'text' ) )
            // InternalCalculatorForm.g:1958:1: ( 'text' )
            {
            // InternalCalculatorForm.g:1958:1: ( 'text' )
            // InternalCalculatorForm.g:1959:2: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextKeyword_4_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:1968:1: rule__FieldOption__Group_4__1 : rule__FieldOption__Group_4__1__Impl ;
    public final void rule__FieldOption__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1972:1: ( rule__FieldOption__Group_4__1__Impl )
            // InternalCalculatorForm.g:1973:2: rule__FieldOption__Group_4__1__Impl
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
    // InternalCalculatorForm.g:1979:1: rule__FieldOption__Group_4__1__Impl : ( ( rule__FieldOption__TextAssignment_4_1 ) ) ;
    public final void rule__FieldOption__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1983:1: ( ( ( rule__FieldOption__TextAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1984:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1984:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            // InternalCalculatorForm.g:1985:2: ( rule__FieldOption__TextAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getTextAssignment_4_1()); 
            }
            // InternalCalculatorForm.g:1986:2: ( rule__FieldOption__TextAssignment_4_1 )
            // InternalCalculatorForm.g:1986:3: rule__FieldOption__TextAssignment_4_1
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
    // InternalCalculatorForm.g:1995:1: rule__FieldOption__Group_5__0 : rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 ;
    public final void rule__FieldOption__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1999:1: ( rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 )
            // InternalCalculatorForm.g:2000:2: rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:2007:1: rule__FieldOption__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__FieldOption__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2011:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:2012:1: ( 'value' )
            {
            // InternalCalculatorForm.g:2012:1: ( 'value' )
            // InternalCalculatorForm.g:2013:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getValueKeyword_5_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2022:1: rule__FieldOption__Group_5__1 : rule__FieldOption__Group_5__1__Impl ;
    public final void rule__FieldOption__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2026:1: ( rule__FieldOption__Group_5__1__Impl )
            // InternalCalculatorForm.g:2027:2: rule__FieldOption__Group_5__1__Impl
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
    // InternalCalculatorForm.g:2033:1: rule__FieldOption__Group_5__1__Impl : ( ( rule__FieldOption__ValueAssignment_5_1 ) ) ;
    public final void rule__FieldOption__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2037:1: ( ( ( rule__FieldOption__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2038:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2038:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:2039:2: ( rule__FieldOption__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getValueAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:2040:2: ( rule__FieldOption__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:2040:3: rule__FieldOption__ValueAssignment_5_1
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
    // InternalCalculatorForm.g:2049:1: rule__FieldOptionGroup__Group__0 : rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 ;
    public final void rule__FieldOptionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2053:1: ( rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 )
            // InternalCalculatorForm.g:2054:2: rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCalculatorForm.g:2061:1: rule__FieldOptionGroup__Group__0__Impl : ( 'option-group' ) ;
    public final void rule__FieldOptionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2065:1: ( ( 'option-group' ) )
            // InternalCalculatorForm.g:2066:1: ( 'option-group' )
            {
            // InternalCalculatorForm.g:2066:1: ( 'option-group' )
            // InternalCalculatorForm.g:2067:2: 'option-group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2076:1: rule__FieldOptionGroup__Group__1 : rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 ;
    public final void rule__FieldOptionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2080:1: ( rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 )
            // InternalCalculatorForm.g:2081:2: rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCalculatorForm.g:2088:1: rule__FieldOptionGroup__Group__1__Impl : ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) ;
    public final void rule__FieldOptionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2092:1: ( ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) )
            // InternalCalculatorForm.g:2093:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            {
            // InternalCalculatorForm.g:2093:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            // InternalCalculatorForm.g:2094:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledAssignment_1()); 
            }
            // InternalCalculatorForm.g:2095:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCalculatorForm.g:2095:3: rule__FieldOptionGroup__DisabledAssignment_1
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
    // InternalCalculatorForm.g:2103:1: rule__FieldOptionGroup__Group__2 : rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 ;
    public final void rule__FieldOptionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2107:1: ( rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 )
            // InternalCalculatorForm.g:2108:2: rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalCalculatorForm.g:2115:1: rule__FieldOptionGroup__Group__2__Impl : ( ( rule__FieldOptionGroup__Group_2__0 )? ) ;
    public final void rule__FieldOptionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2119:1: ( ( ( rule__FieldOptionGroup__Group_2__0 )? ) )
            // InternalCalculatorForm.g:2120:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:2120:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            // InternalCalculatorForm.g:2121:2: ( rule__FieldOptionGroup__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getGroup_2()); 
            }
            // InternalCalculatorForm.g:2122:2: ( rule__FieldOptionGroup__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCalculatorForm.g:2122:3: rule__FieldOptionGroup__Group_2__0
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
    // InternalCalculatorForm.g:2130:1: rule__FieldOptionGroup__Group__3 : rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 ;
    public final void rule__FieldOptionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2134:1: ( rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 )
            // InternalCalculatorForm.g:2135:2: rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCalculatorForm.g:2142:1: rule__FieldOptionGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldOptionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2146:1: ( ( '{' ) )
            // InternalCalculatorForm.g:2147:1: ( '{' )
            {
            // InternalCalculatorForm.g:2147:1: ( '{' )
            // InternalCalculatorForm.g:2148:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2157:1: rule__FieldOptionGroup__Group__4 : rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 ;
    public final void rule__FieldOptionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2161:1: ( rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 )
            // InternalCalculatorForm.g:2162:2: rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalCalculatorForm.g:2169:1: rule__FieldOptionGroup__Group__4__Impl : ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) ;
    public final void rule__FieldOptionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2173:1: ( ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) )
            // InternalCalculatorForm.g:2174:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:2174:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            // InternalCalculatorForm.g:2175:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getOptionsAssignment_4()); 
            }
            // InternalCalculatorForm.g:2176:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCalculatorForm.g:2176:3: rule__FieldOptionGroup__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FieldOptionGroup__OptionsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalCalculatorForm.g:2184:1: rule__FieldOptionGroup__Group__5 : rule__FieldOptionGroup__Group__5__Impl ;
    public final void rule__FieldOptionGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2188:1: ( rule__FieldOptionGroup__Group__5__Impl )
            // InternalCalculatorForm.g:2189:2: rule__FieldOptionGroup__Group__5__Impl
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
    // InternalCalculatorForm.g:2195:1: rule__FieldOptionGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldOptionGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2199:1: ( ( '}' ) )
            // InternalCalculatorForm.g:2200:1: ( '}' )
            {
            // InternalCalculatorForm.g:2200:1: ( '}' )
            // InternalCalculatorForm.g:2201:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2211:1: rule__FieldOptionGroup__Group_2__0 : rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 ;
    public final void rule__FieldOptionGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2215:1: ( rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 )
            // InternalCalculatorForm.g:2216:2: rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:2223:1: rule__FieldOptionGroup__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__FieldOptionGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2227:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2228:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2228:1: ( 'label' )
            // InternalCalculatorForm.g:2229:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2238:1: rule__FieldOptionGroup__Group_2__1 : rule__FieldOptionGroup__Group_2__1__Impl ;
    public final void rule__FieldOptionGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2242:1: ( rule__FieldOptionGroup__Group_2__1__Impl )
            // InternalCalculatorForm.g:2243:2: rule__FieldOptionGroup__Group_2__1__Impl
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
    // InternalCalculatorForm.g:2249:1: rule__FieldOptionGroup__Group_2__1__Impl : ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) ;
    public final void rule__FieldOptionGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2253:1: ( ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:2254:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:2254:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:2255:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getLabelAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:2256:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:2256:3: rule__FieldOptionGroup__LabelAssignment_2_1
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
    // InternalCalculatorForm.g:2265:1: rule__FieldChoice__Group__0 : rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 ;
    public final void rule__FieldChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2269:1: ( rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 )
            // InternalCalculatorForm.g:2270:2: rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCalculatorForm.g:2277:1: rule__FieldChoice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__FieldChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2281:1: ( ( 'choice' ) )
            // InternalCalculatorForm.g:2282:1: ( 'choice' )
            {
            // InternalCalculatorForm.g:2282:1: ( 'choice' )
            // InternalCalculatorForm.g:2283:2: 'choice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2292:1: rule__FieldChoice__Group__1 : rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 ;
    public final void rule__FieldChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2296:1: ( rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 )
            // InternalCalculatorForm.g:2297:2: rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2304:1: rule__FieldChoice__Group__1__Impl : ( ( rule__FieldChoice__NameAssignment_1 ) ) ;
    public final void rule__FieldChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2308:1: ( ( ( rule__FieldChoice__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:2309:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2309:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            // InternalCalculatorForm.g:2310:2: ( rule__FieldChoice__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:2311:2: ( rule__FieldChoice__NameAssignment_1 )
            // InternalCalculatorForm.g:2311:3: rule__FieldChoice__NameAssignment_1
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
    // InternalCalculatorForm.g:2319:1: rule__FieldChoice__Group__2 : rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 ;
    public final void rule__FieldChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2323:1: ( rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 )
            // InternalCalculatorForm.g:2324:2: rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2331:1: rule__FieldChoice__Group__2__Impl : ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2335:1: ( ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:2336:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2336:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:2337:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:2338:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCalculatorForm.g:2338:3: rule__FieldChoice__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:2346:1: rule__FieldChoice__Group__3 : rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 ;
    public final void rule__FieldChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2350:1: ( rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 )
            // InternalCalculatorForm.g:2351:2: rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2358:1: rule__FieldChoice__Group__3__Impl : ( ( rule__FieldChoice__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2362:1: ( ( ( rule__FieldChoice__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2363:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2363:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:2364:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedAssignment_3()); 
            }
            // InternalCalculatorForm.g:2365:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCalculatorForm.g:2365:3: rule__FieldChoice__CheckedAssignment_3
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
    // InternalCalculatorForm.g:2373:1: rule__FieldChoice__Group__4 : rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 ;
    public final void rule__FieldChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2377:1: ( rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 )
            // InternalCalculatorForm.g:2378:2: rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2385:1: rule__FieldChoice__Group__4__Impl : ( ( rule__FieldChoice__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2389:1: ( ( ( rule__FieldChoice__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:2390:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:2390:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:2391:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:2392:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCalculatorForm.g:2392:3: rule__FieldChoice__DisabledAssignment_4
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
    // InternalCalculatorForm.g:2400:1: rule__FieldChoice__Group__5 : rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 ;
    public final void rule__FieldChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2404:1: ( rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 )
            // InternalCalculatorForm.g:2405:2: rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2412:1: rule__FieldChoice__Group__5__Impl : ( ( rule__FieldChoice__Group_5__0 )? ) ;
    public final void rule__FieldChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2416:1: ( ( ( rule__FieldChoice__Group_5__0 )? ) )
            // InternalCalculatorForm.g:2417:1: ( ( rule__FieldChoice__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:2417:1: ( ( rule__FieldChoice__Group_5__0 )? )
            // InternalCalculatorForm.g:2418:2: ( rule__FieldChoice__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:2419:2: ( rule__FieldChoice__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCalculatorForm.g:2419:3: rule__FieldChoice__Group_5__0
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
    // InternalCalculatorForm.g:2427:1: rule__FieldChoice__Group__6 : rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 ;
    public final void rule__FieldChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2431:1: ( rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 )
            // InternalCalculatorForm.g:2432:2: rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2439:1: rule__FieldChoice__Group__6__Impl : ( ( rule__FieldChoice__Group_6__0 )? ) ;
    public final void rule__FieldChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2443:1: ( ( ( rule__FieldChoice__Group_6__0 )? ) )
            // InternalCalculatorForm.g:2444:1: ( ( rule__FieldChoice__Group_6__0 )? )
            {
            // InternalCalculatorForm.g:2444:1: ( ( rule__FieldChoice__Group_6__0 )? )
            // InternalCalculatorForm.g:2445:2: ( rule__FieldChoice__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_6()); 
            }
            // InternalCalculatorForm.g:2446:2: ( rule__FieldChoice__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCalculatorForm.g:2446:3: rule__FieldChoice__Group_6__0
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
    // InternalCalculatorForm.g:2454:1: rule__FieldChoice__Group__7 : rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 ;
    public final void rule__FieldChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2458:1: ( rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 )
            // InternalCalculatorForm.g:2459:2: rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2466:1: rule__FieldChoice__Group__7__Impl : ( ( rule__FieldChoice__MultipleAssignment_7 )? ) ;
    public final void rule__FieldChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2470:1: ( ( ( rule__FieldChoice__MultipleAssignment_7 )? ) )
            // InternalCalculatorForm.g:2471:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            {
            // InternalCalculatorForm.g:2471:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            // InternalCalculatorForm.g:2472:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleAssignment_7()); 
            }
            // InternalCalculatorForm.g:2473:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCalculatorForm.g:2473:3: rule__FieldChoice__MultipleAssignment_7
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
    // InternalCalculatorForm.g:2481:1: rule__FieldChoice__Group__8 : rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 ;
    public final void rule__FieldChoice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2485:1: ( rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 )
            // InternalCalculatorForm.g:2486:2: rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2493:1: rule__FieldChoice__Group__8__Impl : ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) ;
    public final void rule__FieldChoice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2497:1: ( ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) )
            // InternalCalculatorForm.g:2498:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            {
            // InternalCalculatorForm.g:2498:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            // InternalCalculatorForm.g:2499:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedAssignment_8()); 
            }
            // InternalCalculatorForm.g:2500:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCalculatorForm.g:2500:3: rule__FieldChoice__NotdisplayedAssignment_8
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
    // InternalCalculatorForm.g:2508:1: rule__FieldChoice__Group__9 : rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 ;
    public final void rule__FieldChoice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2512:1: ( rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 )
            // InternalCalculatorForm.g:2513:2: rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2520:1: rule__FieldChoice__Group__9__Impl : ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) ;
    public final void rule__FieldChoice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2524:1: ( ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) )
            // InternalCalculatorForm.g:2525:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            {
            // InternalCalculatorForm.g:2525:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            // InternalCalculatorForm.g:2526:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyAssignment_9()); 
            }
            // InternalCalculatorForm.g:2527:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCalculatorForm.g:2527:3: rule__FieldChoice__ReadonlyAssignment_9
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
    // InternalCalculatorForm.g:2535:1: rule__FieldChoice__Group__10 : rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 ;
    public final void rule__FieldChoice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2539:1: ( rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 )
            // InternalCalculatorForm.g:2540:2: rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2547:1: rule__FieldChoice__Group__10__Impl : ( ( rule__FieldChoice__RequiredAssignment_10 )? ) ;
    public final void rule__FieldChoice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2551:1: ( ( ( rule__FieldChoice__RequiredAssignment_10 )? ) )
            // InternalCalculatorForm.g:2552:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            {
            // InternalCalculatorForm.g:2552:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            // InternalCalculatorForm.g:2553:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredAssignment_10()); 
            }
            // InternalCalculatorForm.g:2554:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCalculatorForm.g:2554:3: rule__FieldChoice__RequiredAssignment_10
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
    // InternalCalculatorForm.g:2562:1: rule__FieldChoice__Group__11 : rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 ;
    public final void rule__FieldChoice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2566:1: ( rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 )
            // InternalCalculatorForm.g:2567:2: rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12
            {
            pushFollow(FOLLOW_17);
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
    // InternalCalculatorForm.g:2574:1: rule__FieldChoice__Group__11__Impl : ( ( rule__FieldChoice__Group_11__0 )? ) ;
    public final void rule__FieldChoice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2578:1: ( ( ( rule__FieldChoice__Group_11__0 )? ) )
            // InternalCalculatorForm.g:2579:1: ( ( rule__FieldChoice__Group_11__0 )? )
            {
            // InternalCalculatorForm.g:2579:1: ( ( rule__FieldChoice__Group_11__0 )? )
            // InternalCalculatorForm.g:2580:2: ( rule__FieldChoice__Group_11__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_11()); 
            }
            // InternalCalculatorForm.g:2581:2: ( rule__FieldChoice__Group_11__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==17) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCalculatorForm.g:2581:3: rule__FieldChoice__Group_11__0
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
    // InternalCalculatorForm.g:2589:1: rule__FieldChoice__Group__12 : rule__FieldChoice__Group__12__Impl ;
    public final void rule__FieldChoice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2593:1: ( rule__FieldChoice__Group__12__Impl )
            // InternalCalculatorForm.g:2594:2: rule__FieldChoice__Group__12__Impl
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
    // InternalCalculatorForm.g:2600:1: rule__FieldChoice__Group__12__Impl : ( ( rule__FieldChoice__Group_12__0 )? ) ;
    public final void rule__FieldChoice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2604:1: ( ( ( rule__FieldChoice__Group_12__0 )? ) )
            // InternalCalculatorForm.g:2605:1: ( ( rule__FieldChoice__Group_12__0 )? )
            {
            // InternalCalculatorForm.g:2605:1: ( ( rule__FieldChoice__Group_12__0 )? )
            // InternalCalculatorForm.g:2606:2: ( rule__FieldChoice__Group_12__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getGroup_12()); 
            }
            // InternalCalculatorForm.g:2607:2: ( rule__FieldChoice__Group_12__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCalculatorForm.g:2607:3: rule__FieldChoice__Group_12__0
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
    // InternalCalculatorForm.g:2616:1: rule__FieldChoice__Group_5__0 : rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 ;
    public final void rule__FieldChoice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2620:1: ( rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 )
            // InternalCalculatorForm.g:2621:2: rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:2628:1: rule__FieldChoice__Group_5__0__Impl : ( 'form' ) ;
    public final void rule__FieldChoice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2632:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:2633:1: ( 'form' )
            {
            // InternalCalculatorForm.g:2633:1: ( 'form' )
            // InternalCalculatorForm.g:2634:2: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2643:1: rule__FieldChoice__Group_5__1 : rule__FieldChoice__Group_5__1__Impl ;
    public final void rule__FieldChoice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2647:1: ( rule__FieldChoice__Group_5__1__Impl )
            // InternalCalculatorForm.g:2648:2: rule__FieldChoice__Group_5__1__Impl
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
    // InternalCalculatorForm.g:2654:1: rule__FieldChoice__Group_5__1__Impl : ( ( rule__FieldChoice__FormAssignment_5_1 ) ) ;
    public final void rule__FieldChoice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2658:1: ( ( ( rule__FieldChoice__FormAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2659:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2659:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            // InternalCalculatorForm.g:2660:2: ( rule__FieldChoice__FormAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getFormAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:2661:2: ( rule__FieldChoice__FormAssignment_5_1 )
            // InternalCalculatorForm.g:2661:3: rule__FieldChoice__FormAssignment_5_1
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
    // InternalCalculatorForm.g:2670:1: rule__FieldChoice__Group_6__0 : rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 ;
    public final void rule__FieldChoice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2674:1: ( rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 )
            // InternalCalculatorForm.g:2675:2: rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:2682:1: rule__FieldChoice__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__FieldChoice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2686:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2687:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2687:1: ( 'label' )
            // InternalCalculatorForm.g:2688:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2697:1: rule__FieldChoice__Group_6__1 : rule__FieldChoice__Group_6__1__Impl ;
    public final void rule__FieldChoice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2701:1: ( rule__FieldChoice__Group_6__1__Impl )
            // InternalCalculatorForm.g:2702:2: rule__FieldChoice__Group_6__1__Impl
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
    // InternalCalculatorForm.g:2708:1: rule__FieldChoice__Group_6__1__Impl : ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) ;
    public final void rule__FieldChoice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2712:1: ( ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) )
            // InternalCalculatorForm.g:2713:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            {
            // InternalCalculatorForm.g:2713:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            // InternalCalculatorForm.g:2714:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLabelAssignment_6_1()); 
            }
            // InternalCalculatorForm.g:2715:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            // InternalCalculatorForm.g:2715:3: rule__FieldChoice__LabelAssignment_6_1
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
    // InternalCalculatorForm.g:2724:1: rule__FieldChoice__Group_11__0 : rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 ;
    public final void rule__FieldChoice__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2728:1: ( rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 )
            // InternalCalculatorForm.g:2729:2: rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:2736:1: rule__FieldChoice__Group_11__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoice__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2740:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:2741:1: ( 'value' )
            {
            // InternalCalculatorForm.g:2741:1: ( 'value' )
            // InternalCalculatorForm.g:2742:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2751:1: rule__FieldChoice__Group_11__1 : rule__FieldChoice__Group_11__1__Impl ;
    public final void rule__FieldChoice__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2755:1: ( rule__FieldChoice__Group_11__1__Impl )
            // InternalCalculatorForm.g:2756:2: rule__FieldChoice__Group_11__1__Impl
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
    // InternalCalculatorForm.g:2762:1: rule__FieldChoice__Group_11__1__Impl : ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) ;
    public final void rule__FieldChoice__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2766:1: ( ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) )
            // InternalCalculatorForm.g:2767:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            {
            // InternalCalculatorForm.g:2767:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            // InternalCalculatorForm.g:2768:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getValueAssignment_11_1()); 
            }
            // InternalCalculatorForm.g:2769:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            // InternalCalculatorForm.g:2769:3: rule__FieldChoice__ValueAssignment_11_1
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
    // InternalCalculatorForm.g:2778:1: rule__FieldChoice__Group_12__0 : rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 ;
    public final void rule__FieldChoice__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2782:1: ( rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 )
            // InternalCalculatorForm.g:2783:2: rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCalculatorForm.g:2790:1: rule__FieldChoice__Group_12__0__Impl : ( '{' ) ;
    public final void rule__FieldChoice__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2794:1: ( ( '{' ) )
            // InternalCalculatorForm.g:2795:1: ( '{' )
            {
            // InternalCalculatorForm.g:2795:1: ( '{' )
            // InternalCalculatorForm.g:2796:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2805:1: rule__FieldChoice__Group_12__1 : rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 ;
    public final void rule__FieldChoice__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2809:1: ( rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 )
            // InternalCalculatorForm.g:2810:2: rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalCalculatorForm.g:2817:1: rule__FieldChoice__Group_12__1__Impl : ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) ;
    public final void rule__FieldChoice__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2821:1: ( ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) )
            // InternalCalculatorForm.g:2822:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            {
            // InternalCalculatorForm.g:2822:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            // InternalCalculatorForm.g:2823:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getOptionsAssignment_12_1()); 
            }
            // InternalCalculatorForm.g:2824:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==22) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCalculatorForm.g:2824:3: rule__FieldChoice__OptionsAssignment_12_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FieldChoice__OptionsAssignment_12_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalCalculatorForm.g:2832:1: rule__FieldChoice__Group_12__2 : rule__FieldChoice__Group_12__2__Impl ;
    public final void rule__FieldChoice__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2836:1: ( rule__FieldChoice__Group_12__2__Impl )
            // InternalCalculatorForm.g:2837:2: rule__FieldChoice__Group_12__2__Impl
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
    // InternalCalculatorForm.g:2843:1: rule__FieldChoice__Group_12__2__Impl : ( '}' ) ;
    public final void rule__FieldChoice__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2847:1: ( ( '}' ) )
            // InternalCalculatorForm.g:2848:1: ( '}' )
            {
            // InternalCalculatorForm.g:2848:1: ( '}' )
            // InternalCalculatorForm.g:2849:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2859:1: rule__FieldChoiceOption__Group__0 : rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 ;
    public final void rule__FieldChoiceOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2863:1: ( rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 )
            // InternalCalculatorForm.g:2864:2: rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:2871:1: rule__FieldChoiceOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldChoiceOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2875:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:2876:1: ( 'option' )
            {
            // InternalCalculatorForm.g:2876:1: ( 'option' )
            // InternalCalculatorForm.g:2877:2: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:2886:1: rule__FieldChoiceOption__Group__1 : rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 ;
    public final void rule__FieldChoiceOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2890:1: ( rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 )
            // InternalCalculatorForm.g:2891:2: rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCalculatorForm.g:2898:1: rule__FieldChoiceOption__Group__1__Impl : ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) ;
    public final void rule__FieldChoiceOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2902:1: ( ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) )
            // InternalCalculatorForm.g:2903:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2903:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            // InternalCalculatorForm.g:2904:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getLabelAssignment_1()); 
            }
            // InternalCalculatorForm.g:2905:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            // InternalCalculatorForm.g:2905:3: rule__FieldChoiceOption__LabelAssignment_1
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
    // InternalCalculatorForm.g:2913:1: rule__FieldChoiceOption__Group__2 : rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 ;
    public final void rule__FieldChoiceOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2917:1: ( rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 )
            // InternalCalculatorForm.g:2918:2: rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCalculatorForm.g:2925:1: rule__FieldChoiceOption__Group__2__Impl : ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoiceOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2929:1: ( ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:2930:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2930:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:2931:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAssignment_2()); 
            }
            // InternalCalculatorForm.g:2932:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCalculatorForm.g:2932:3: rule__FieldChoiceOption__AutofocusAssignment_2
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
    // InternalCalculatorForm.g:2940:1: rule__FieldChoiceOption__Group__3 : rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 ;
    public final void rule__FieldChoiceOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2944:1: ( rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 )
            // InternalCalculatorForm.g:2945:2: rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalCalculatorForm.g:2952:1: rule__FieldChoiceOption__Group__3__Impl : ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoiceOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2956:1: ( ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2957:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2957:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:2958:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedAssignment_3()); 
            }
            // InternalCalculatorForm.g:2959:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCalculatorForm.g:2959:3: rule__FieldChoiceOption__CheckedAssignment_3
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
    // InternalCalculatorForm.g:2967:1: rule__FieldChoiceOption__Group__4 : rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 ;
    public final void rule__FieldChoiceOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2971:1: ( rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 )
            // InternalCalculatorForm.g:2972:2: rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCalculatorForm.g:2979:1: rule__FieldChoiceOption__Group__4__Impl : ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoiceOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2983:1: ( ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:2984:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:2984:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:2985:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:2986:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCalculatorForm.g:2986:3: rule__FieldChoiceOption__DisabledAssignment_4
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
    // InternalCalculatorForm.g:2994:1: rule__FieldChoiceOption__Group__5 : rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 ;
    public final void rule__FieldChoiceOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2998:1: ( rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 )
            // InternalCalculatorForm.g:2999:2: rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalCalculatorForm.g:3006:1: rule__FieldChoiceOption__Group__5__Impl : ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) ;
    public final void rule__FieldChoiceOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3010:1: ( ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) )
            // InternalCalculatorForm.g:3011:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            {
            // InternalCalculatorForm.g:3011:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            // InternalCalculatorForm.g:3012:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyAssignment_5()); 
            }
            // InternalCalculatorForm.g:3013:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCalculatorForm.g:3013:3: rule__FieldChoiceOption__ReadonlyAssignment_5
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
    // InternalCalculatorForm.g:3021:1: rule__FieldChoiceOption__Group__6 : rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 ;
    public final void rule__FieldChoiceOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3025:1: ( rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 )
            // InternalCalculatorForm.g:3026:2: rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalCalculatorForm.g:3033:1: rule__FieldChoiceOption__Group__6__Impl : ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) ;
    public final void rule__FieldChoiceOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3037:1: ( ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) )
            // InternalCalculatorForm.g:3038:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            {
            // InternalCalculatorForm.g:3038:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            // InternalCalculatorForm.g:3039:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredAssignment_6()); 
            }
            // InternalCalculatorForm.g:3040:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==41) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCalculatorForm.g:3040:3: rule__FieldChoiceOption__RequiredAssignment_6
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
    // InternalCalculatorForm.g:3048:1: rule__FieldChoiceOption__Group__7 : rule__FieldChoiceOption__Group__7__Impl ;
    public final void rule__FieldChoiceOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3052:1: ( rule__FieldChoiceOption__Group__7__Impl )
            // InternalCalculatorForm.g:3053:2: rule__FieldChoiceOption__Group__7__Impl
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
    // InternalCalculatorForm.g:3059:1: rule__FieldChoiceOption__Group__7__Impl : ( ( rule__FieldChoiceOption__Group_7__0 )? ) ;
    public final void rule__FieldChoiceOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3063:1: ( ( ( rule__FieldChoiceOption__Group_7__0 )? ) )
            // InternalCalculatorForm.g:3064:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            {
            // InternalCalculatorForm.g:3064:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            // InternalCalculatorForm.g:3065:2: ( rule__FieldChoiceOption__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getGroup_7()); 
            }
            // InternalCalculatorForm.g:3066:2: ( rule__FieldChoiceOption__Group_7__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==17) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCalculatorForm.g:3066:3: rule__FieldChoiceOption__Group_7__0
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
    // InternalCalculatorForm.g:3075:1: rule__FieldChoiceOption__Group_7__0 : rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 ;
    public final void rule__FieldChoiceOption__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3079:1: ( rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 )
            // InternalCalculatorForm.g:3080:2: rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:3087:1: rule__FieldChoiceOption__Group_7__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoiceOption__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3091:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3092:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3092:1: ( 'value' )
            // InternalCalculatorForm.g:3093:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3102:1: rule__FieldChoiceOption__Group_7__1 : rule__FieldChoiceOption__Group_7__1__Impl ;
    public final void rule__FieldChoiceOption__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3106:1: ( rule__FieldChoiceOption__Group_7__1__Impl )
            // InternalCalculatorForm.g:3107:2: rule__FieldChoiceOption__Group_7__1__Impl
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
    // InternalCalculatorForm.g:3113:1: rule__FieldChoiceOption__Group_7__1__Impl : ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) ;
    public final void rule__FieldChoiceOption__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3117:1: ( ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) )
            // InternalCalculatorForm.g:3118:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            {
            // InternalCalculatorForm.g:3118:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            // InternalCalculatorForm.g:3119:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getValueAssignment_7_1()); 
            }
            // InternalCalculatorForm.g:3120:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            // InternalCalculatorForm.g:3120:3: rule__FieldChoiceOption__ValueAssignment_7_1
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
    // InternalCalculatorForm.g:3129:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3133:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalCalculatorForm.g:3134:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCalculatorForm.g:3141:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3145:1: ( ( 'group' ) )
            // InternalCalculatorForm.g:3146:1: ( 'group' )
            {
            // InternalCalculatorForm.g:3146:1: ( 'group' )
            // InternalCalculatorForm.g:3147:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3156:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3160:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalCalculatorForm.g:3161:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalCalculatorForm.g:3168:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3172:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:3173:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3173:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalCalculatorForm.g:3174:2: ( rule__Group__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:3175:2: ( rule__Group__NameAssignment_1 )
            // InternalCalculatorForm.g:3175:3: rule__Group__NameAssignment_1
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
    // InternalCalculatorForm.g:3183:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3187:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalCalculatorForm.g:3188:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalCalculatorForm.g:3195:1: rule__Group__Group__2__Impl : ( ( rule__Group__Group_2__0 )? ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3199:1: ( ( ( rule__Group__Group_2__0 )? ) )
            // InternalCalculatorForm.g:3200:1: ( ( rule__Group__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:3200:1: ( ( rule__Group__Group_2__0 )? )
            // InternalCalculatorForm.g:3201:2: ( rule__Group__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getGroup_2()); 
            }
            // InternalCalculatorForm.g:3202:2: ( rule__Group__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==16) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCalculatorForm.g:3202:3: rule__Group__Group_2__0
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
    // InternalCalculatorForm.g:3210:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3214:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalCalculatorForm.g:3215:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalCalculatorForm.g:3222:1: rule__Group__Group__3__Impl : ( '{' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3226:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3227:1: ( '{' )
            {
            // InternalCalculatorForm.g:3227:1: ( '{' )
            // InternalCalculatorForm.g:3228:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3237:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3241:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalCalculatorForm.g:3242:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalCalculatorForm.g:3249:1: rule__Group__Group__4__Impl : ( ( rule__Group__FieldsAssignment_4 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3253:1: ( ( ( rule__Group__FieldsAssignment_4 )* ) )
            // InternalCalculatorForm.g:3254:1: ( ( rule__Group__FieldsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:3254:1: ( ( rule__Group__FieldsAssignment_4 )* )
            // InternalCalculatorForm.g:3255:2: ( rule__Group__FieldsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getFieldsAssignment_4()); 
            }
            // InternalCalculatorForm.g:3256:2: ( rule__Group__FieldsAssignment_4 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==14||LA53_0==18||LA53_0==25||LA53_0==28) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalCalculatorForm.g:3256:3: rule__Group__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Group__FieldsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalCalculatorForm.g:3264:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3268:1: ( rule__Group__Group__5__Impl )
            // InternalCalculatorForm.g:3269:2: rule__Group__Group__5__Impl
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
    // InternalCalculatorForm.g:3275:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3279:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3280:1: ( '}' )
            {
            // InternalCalculatorForm.g:3280:1: ( '}' )
            // InternalCalculatorForm.g:3281:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3291:1: rule__Group__Group_2__0 : rule__Group__Group_2__0__Impl rule__Group__Group_2__1 ;
    public final void rule__Group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3295:1: ( rule__Group__Group_2__0__Impl rule__Group__Group_2__1 )
            // InternalCalculatorForm.g:3296:2: rule__Group__Group_2__0__Impl rule__Group__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:3303:1: rule__Group__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__Group__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3307:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:3308:1: ( 'label' )
            {
            // InternalCalculatorForm.g:3308:1: ( 'label' )
            // InternalCalculatorForm.g:3309:2: 'label'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLabelKeyword_2_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3318:1: rule__Group__Group_2__1 : rule__Group__Group_2__1__Impl ;
    public final void rule__Group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3322:1: ( rule__Group__Group_2__1__Impl )
            // InternalCalculatorForm.g:3323:2: rule__Group__Group_2__1__Impl
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
    // InternalCalculatorForm.g:3329:1: rule__Group__Group_2__1__Impl : ( ( rule__Group__LabelAssignment_2_1 ) ) ;
    public final void rule__Group__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3333:1: ( ( ( rule__Group__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:3334:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:3334:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:3335:2: ( rule__Group__LabelAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGroupAccess().getLabelAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:3336:2: ( rule__Group__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:3336:3: rule__Group__LabelAssignment_2_1
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
    // InternalCalculatorForm.g:3345:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3349:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalCalculatorForm.g:3350:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCalculatorForm.g:3357:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3361:1: ( ( 'page' ) )
            // InternalCalculatorForm.g:3362:1: ( 'page' )
            {
            // InternalCalculatorForm.g:3362:1: ( 'page' )
            // InternalCalculatorForm.g:3363:2: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3372:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3376:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalCalculatorForm.g:3377:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCalculatorForm.g:3384:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3388:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3389:1: ( '{' )
            {
            // InternalCalculatorForm.g:3389:1: ( '{' )
            // InternalCalculatorForm.g:3390:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3399:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3403:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalCalculatorForm.g:3404:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCalculatorForm.g:3411:1: rule__Page__Group__2__Impl : ( ( rule__Page__ChildsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3415:1: ( ( ( rule__Page__ChildsAssignment_2 )* ) )
            // InternalCalculatorForm.g:3416:1: ( ( rule__Page__ChildsAssignment_2 )* )
            {
            // InternalCalculatorForm.g:3416:1: ( ( rule__Page__ChildsAssignment_2 )* )
            // InternalCalculatorForm.g:3417:2: ( rule__Page__ChildsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getChildsAssignment_2()); 
            }
            // InternalCalculatorForm.g:3418:2: ( rule__Page__ChildsAssignment_2 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==14||LA54_0==18||(LA54_0>=25 && LA54_0<=26)||LA54_0==28) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalCalculatorForm.g:3418:3: rule__Page__ChildsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Page__ChildsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalCalculatorForm.g:3426:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3430:1: ( rule__Page__Group__3__Impl )
            // InternalCalculatorForm.g:3431:2: rule__Page__Group__3__Impl
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
    // InternalCalculatorForm.g:3437:1: rule__Page__Group__3__Impl : ( '}' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3441:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3442:1: ( '}' )
            {
            // InternalCalculatorForm.g:3442:1: ( '}' )
            // InternalCalculatorForm.g:3443:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3453:1: rule__ButtonSubmit__Group__0 : rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 ;
    public final void rule__ButtonSubmit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3457:1: ( rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 )
            // InternalCalculatorForm.g:3458:2: rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCalculatorForm.g:3465:1: rule__ButtonSubmit__Group__0__Impl : ( 'submit-button' ) ;
    public final void rule__ButtonSubmit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3469:1: ( ( 'submit-button' ) )
            // InternalCalculatorForm.g:3470:1: ( 'submit-button' )
            {
            // InternalCalculatorForm.g:3470:1: ( 'submit-button' )
            // InternalCalculatorForm.g:3471:2: 'submit-button'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3480:1: rule__ButtonSubmit__Group__1 : rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 ;
    public final void rule__ButtonSubmit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3484:1: ( rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 )
            // InternalCalculatorForm.g:3485:2: rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:3492:1: rule__ButtonSubmit__Group__1__Impl : ( ( rule__ButtonSubmit__NameAssignment_1 ) ) ;
    public final void rule__ButtonSubmit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3496:1: ( ( ( rule__ButtonSubmit__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:3497:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3497:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            // InternalCalculatorForm.g:3498:2: ( rule__ButtonSubmit__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getNameAssignment_1()); 
            }
            // InternalCalculatorForm.g:3499:2: ( rule__ButtonSubmit__NameAssignment_1 )
            // InternalCalculatorForm.g:3499:3: rule__ButtonSubmit__NameAssignment_1
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
    // InternalCalculatorForm.g:3507:1: rule__ButtonSubmit__Group__2 : rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 ;
    public final void rule__ButtonSubmit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3511:1: ( rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 )
            // InternalCalculatorForm.g:3512:2: rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalCalculatorForm.g:3519:1: rule__ButtonSubmit__Group__2__Impl : ( ( rule__ButtonSubmit__TextAssignment_2 ) ) ;
    public final void rule__ButtonSubmit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3523:1: ( ( ( rule__ButtonSubmit__TextAssignment_2 ) ) )
            // InternalCalculatorForm.g:3524:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            {
            // InternalCalculatorForm.g:3524:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            // InternalCalculatorForm.g:3525:2: ( rule__ButtonSubmit__TextAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getTextAssignment_2()); 
            }
            // InternalCalculatorForm.g:3526:2: ( rule__ButtonSubmit__TextAssignment_2 )
            // InternalCalculatorForm.g:3526:3: rule__ButtonSubmit__TextAssignment_2
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
    // InternalCalculatorForm.g:3534:1: rule__ButtonSubmit__Group__3 : rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 ;
    public final void rule__ButtonSubmit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3538:1: ( rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 )
            // InternalCalculatorForm.g:3539:2: rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCalculatorForm.g:3546:1: rule__ButtonSubmit__Group__3__Impl : ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) ;
    public final void rule__ButtonSubmit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3550:1: ( ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) )
            // InternalCalculatorForm.g:3551:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            {
            // InternalCalculatorForm.g:3551:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            // InternalCalculatorForm.g:3552:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAssignment_3()); 
            }
            // InternalCalculatorForm.g:3553:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCalculatorForm.g:3553:3: rule__ButtonSubmit__AutofocusAssignment_3
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
    // InternalCalculatorForm.g:3561:1: rule__ButtonSubmit__Group__4 : rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 ;
    public final void rule__ButtonSubmit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3565:1: ( rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 )
            // InternalCalculatorForm.g:3566:2: rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalCalculatorForm.g:3573:1: rule__ButtonSubmit__Group__4__Impl : ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) ;
    public final void rule__ButtonSubmit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3577:1: ( ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:3578:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:3578:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:3579:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledAssignment_4()); 
            }
            // InternalCalculatorForm.g:3580:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCalculatorForm.g:3580:3: rule__ButtonSubmit__DisabledAssignment_4
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
    // InternalCalculatorForm.g:3588:1: rule__ButtonSubmit__Group__5 : rule__ButtonSubmit__Group__5__Impl ;
    public final void rule__ButtonSubmit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3592:1: ( rule__ButtonSubmit__Group__5__Impl )
            // InternalCalculatorForm.g:3593:2: rule__ButtonSubmit__Group__5__Impl
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
    // InternalCalculatorForm.g:3599:1: rule__ButtonSubmit__Group__5__Impl : ( ( rule__ButtonSubmit__Group_5__0 )? ) ;
    public final void rule__ButtonSubmit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3603:1: ( ( ( rule__ButtonSubmit__Group_5__0 )? ) )
            // InternalCalculatorForm.g:3604:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:3604:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            // InternalCalculatorForm.g:3605:2: ( rule__ButtonSubmit__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getGroup_5()); 
            }
            // InternalCalculatorForm.g:3606:2: ( rule__ButtonSubmit__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==17) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCalculatorForm.g:3606:3: rule__ButtonSubmit__Group_5__0
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
    // InternalCalculatorForm.g:3615:1: rule__ButtonSubmit__Group_5__0 : rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 ;
    public final void rule__ButtonSubmit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3619:1: ( rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 )
            // InternalCalculatorForm.g:3620:2: rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCalculatorForm.g:3627:1: rule__ButtonSubmit__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__ButtonSubmit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3631:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3632:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3632:1: ( 'value' )
            // InternalCalculatorForm.g:3633:2: 'value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3642:1: rule__ButtonSubmit__Group_5__1 : rule__ButtonSubmit__Group_5__1__Impl ;
    public final void rule__ButtonSubmit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3646:1: ( rule__ButtonSubmit__Group_5__1__Impl )
            // InternalCalculatorForm.g:3647:2: rule__ButtonSubmit__Group_5__1__Impl
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
    // InternalCalculatorForm.g:3653:1: rule__ButtonSubmit__Group_5__1__Impl : ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) ;
    public final void rule__ButtonSubmit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3657:1: ( ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:3658:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:3658:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:3659:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getValueAssignment_5_1()); 
            }
            // InternalCalculatorForm.g:3660:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:3660:3: rule__ButtonSubmit__ValueAssignment_5_1
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
    // InternalCalculatorForm.g:3669:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3673:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalCalculatorForm.g:3674:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCalculatorForm.g:3681:1: rule__Calculate__Group__0__Impl : ( 'calculate' ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3685:1: ( ( 'calculate' ) )
            // InternalCalculatorForm.g:3686:1: ( 'calculate' )
            {
            // InternalCalculatorForm.g:3686:1: ( 'calculate' )
            // InternalCalculatorForm.g:3687:2: 'calculate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getCalculateKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3696:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl rule__Calculate__Group__2 ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3700:1: ( rule__Calculate__Group__1__Impl rule__Calculate__Group__2 )
            // InternalCalculatorForm.g:3701:2: rule__Calculate__Group__1__Impl rule__Calculate__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalCalculatorForm.g:3708:1: rule__Calculate__Group__1__Impl : ( ( rule__Calculate__ResultAssignment_1 ) ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3712:1: ( ( ( rule__Calculate__ResultAssignment_1 ) ) )
            // InternalCalculatorForm.g:3713:1: ( ( rule__Calculate__ResultAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3713:1: ( ( rule__Calculate__ResultAssignment_1 ) )
            // InternalCalculatorForm.g:3714:2: ( rule__Calculate__ResultAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getResultAssignment_1()); 
            }
            // InternalCalculatorForm.g:3715:2: ( rule__Calculate__ResultAssignment_1 )
            // InternalCalculatorForm.g:3715:3: rule__Calculate__ResultAssignment_1
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
    // InternalCalculatorForm.g:3723:1: rule__Calculate__Group__2 : rule__Calculate__Group__2__Impl rule__Calculate__Group__3 ;
    public final void rule__Calculate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3727:1: ( rule__Calculate__Group__2__Impl rule__Calculate__Group__3 )
            // InternalCalculatorForm.g:3728:2: rule__Calculate__Group__2__Impl rule__Calculate__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalCalculatorForm.g:3735:1: rule__Calculate__Group__2__Impl : ( '=' ) ;
    public final void rule__Calculate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3739:1: ( ( '=' ) )
            // InternalCalculatorForm.g:3740:1: ( '=' )
            {
            // InternalCalculatorForm.g:3740:1: ( '=' )
            // InternalCalculatorForm.g:3741:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getEqualsSignKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:3750:1: rule__Calculate__Group__3 : rule__Calculate__Group__3__Impl ;
    public final void rule__Calculate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3754:1: ( rule__Calculate__Group__3__Impl )
            // InternalCalculatorForm.g:3755:2: rule__Calculate__Group__3__Impl
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
    // InternalCalculatorForm.g:3761:1: rule__Calculate__Group__3__Impl : ( ( rule__Calculate__ExpressionAssignment_3 ) ) ;
    public final void rule__Calculate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3765:1: ( ( ( rule__Calculate__ExpressionAssignment_3 ) ) )
            // InternalCalculatorForm.g:3766:1: ( ( rule__Calculate__ExpressionAssignment_3 ) )
            {
            // InternalCalculatorForm.g:3766:1: ( ( rule__Calculate__ExpressionAssignment_3 ) )
            // InternalCalculatorForm.g:3767:2: ( rule__Calculate__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getExpressionAssignment_3()); 
            }
            // InternalCalculatorForm.g:3768:2: ( rule__Calculate__ExpressionAssignment_3 )
            // InternalCalculatorForm.g:3768:3: rule__Calculate__ExpressionAssignment_3
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
    // InternalCalculatorForm.g:3777:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3781:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalCalculatorForm.g:3782:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCalculatorForm.g:3789:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3793:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:3794:1: ( RULE_ID )
            {
            // InternalCalculatorForm.g:3794:1: ( RULE_ID )
            // InternalCalculatorForm.g:3795:2: RULE_ID
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
    // InternalCalculatorForm.g:3804:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3808:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalCalculatorForm.g:3809:2: rule__QualifiedName__Group__1__Impl
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
    // InternalCalculatorForm.g:3815:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3819:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalCalculatorForm.g:3820:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:3820:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalCalculatorForm.g:3821:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:3822:2: ( rule__QualifiedName__Group_1__0 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==31) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalCalculatorForm.g:3822:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalCalculatorForm.g:3831:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3835:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalCalculatorForm.g:3836:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCalculatorForm.g:3843:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3847:1: ( ( '.' ) )
            // InternalCalculatorForm.g:3848:1: ( '.' )
            {
            // InternalCalculatorForm.g:3848:1: ( '.' )
            // InternalCalculatorForm.g:3849:2: '.'
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
    // InternalCalculatorForm.g:3858:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3862:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalCalculatorForm.g:3863:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalCalculatorForm.g:3869:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3873:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:3874:1: ( RULE_ID )
            {
            // InternalCalculatorForm.g:3874:1: ( RULE_ID )
            // InternalCalculatorForm.g:3875:2: RULE_ID
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
    // InternalCalculatorForm.g:3885:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3889:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalCalculatorForm.g:3890:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCalculatorForm.g:3897:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3901:1: ( ( ruleMultiplication ) )
            // InternalCalculatorForm.g:3902:1: ( ruleMultiplication )
            {
            // InternalCalculatorForm.g:3902:1: ( ruleMultiplication )
            // InternalCalculatorForm.g:3903:2: ruleMultiplication
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
    // InternalCalculatorForm.g:3912:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3916:1: ( rule__Addition__Group__1__Impl )
            // InternalCalculatorForm.g:3917:2: rule__Addition__Group__1__Impl
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
    // InternalCalculatorForm.g:3923:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3927:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalCalculatorForm.g:3928:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:3928:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalCalculatorForm.g:3929:2: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:3930:2: ( rule__Addition__Group_1__0 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=32 && LA59_0<=33)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalCalculatorForm.g:3930:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
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
    // InternalCalculatorForm.g:3939:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3943:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalCalculatorForm.g:3944:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCalculatorForm.g:3951:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3955:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalCalculatorForm.g:3956:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalCalculatorForm.g:3956:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalCalculatorForm.g:3957:2: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // InternalCalculatorForm.g:3958:2: ( rule__Addition__Alternatives_1_0 )
            // InternalCalculatorForm.g:3958:3: rule__Addition__Alternatives_1_0
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
    // InternalCalculatorForm.g:3966:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3970:1: ( rule__Addition__Group_1__1__Impl )
            // InternalCalculatorForm.g:3971:2: rule__Addition__Group_1__1__Impl
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
    // InternalCalculatorForm.g:3977:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3981:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:3982:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:3982:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalCalculatorForm.g:3983:2: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:3984:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalCalculatorForm.g:3984:3: rule__Addition__RightAssignment_1_1
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
    // InternalCalculatorForm.g:3993:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3997:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalCalculatorForm.g:3998:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCalculatorForm.g:4005:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4009:1: ( ( () ) )
            // InternalCalculatorForm.g:4010:1: ( () )
            {
            // InternalCalculatorForm.g:4010:1: ( () )
            // InternalCalculatorForm.g:4011:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalCalculatorForm.g:4012:2: ()
            // InternalCalculatorForm.g:4012:3: 
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
    // InternalCalculatorForm.g:4020:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4024:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalCalculatorForm.g:4025:2: rule__Addition__Group_1_0_0__1__Impl
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
    // InternalCalculatorForm.g:4031:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4035:1: ( ( '+' ) )
            // InternalCalculatorForm.g:4036:1: ( '+' )
            {
            // InternalCalculatorForm.g:4036:1: ( '+' )
            // InternalCalculatorForm.g:4037:2: '+'
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
    // InternalCalculatorForm.g:4047:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4051:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalCalculatorForm.g:4052:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCalculatorForm.g:4059:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4063:1: ( ( () ) )
            // InternalCalculatorForm.g:4064:1: ( () )
            {
            // InternalCalculatorForm.g:4064:1: ( () )
            // InternalCalculatorForm.g:4065:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalCalculatorForm.g:4066:2: ()
            // InternalCalculatorForm.g:4066:3: 
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
    // InternalCalculatorForm.g:4074:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4078:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalCalculatorForm.g:4079:2: rule__Addition__Group_1_0_1__1__Impl
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
    // InternalCalculatorForm.g:4085:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4089:1: ( ( '-' ) )
            // InternalCalculatorForm.g:4090:1: ( '-' )
            {
            // InternalCalculatorForm.g:4090:1: ( '-' )
            // InternalCalculatorForm.g:4091:2: '-'
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
    // InternalCalculatorForm.g:4101:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4105:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalCalculatorForm.g:4106:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCalculatorForm.g:4113:1: rule__Multiplication__Group__0__Impl : ( rulePrefixed ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4117:1: ( ( rulePrefixed ) )
            // InternalCalculatorForm.g:4118:1: ( rulePrefixed )
            {
            // InternalCalculatorForm.g:4118:1: ( rulePrefixed )
            // InternalCalculatorForm.g:4119:2: rulePrefixed
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
    // InternalCalculatorForm.g:4128:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4132:1: ( rule__Multiplication__Group__1__Impl )
            // InternalCalculatorForm.g:4133:2: rule__Multiplication__Group__1__Impl
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
    // InternalCalculatorForm.g:4139:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4143:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalCalculatorForm.g:4144:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalCalculatorForm.g:4144:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalCalculatorForm.g:4145:2: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalCalculatorForm.g:4146:2: ( rule__Multiplication__Group_1__0 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=12 && LA60_0<=13)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalCalculatorForm.g:4146:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalCalculatorForm.g:4155:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4159:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalCalculatorForm.g:4160:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCalculatorForm.g:4167:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4171:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // InternalCalculatorForm.g:4172:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // InternalCalculatorForm.g:4172:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // InternalCalculatorForm.g:4173:2: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // InternalCalculatorForm.g:4174:2: ( rule__Multiplication__Group_1_0__0 )
            // InternalCalculatorForm.g:4174:3: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }

            }


            }

        }
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
    // InternalCalculatorForm.g:4182:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4186:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalCalculatorForm.g:4187:2: rule__Multiplication__Group_1__1__Impl
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
    // InternalCalculatorForm.g:4193:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4197:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:4198:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:4198:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalCalculatorForm.g:4199:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:4200:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalCalculatorForm.g:4200:3: rule__Multiplication__RightAssignment_1_1
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


    // $ANTLR start "rule__Multiplication__Group_1_0__0"
    // InternalCalculatorForm.g:4209:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4213:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // InternalCalculatorForm.g:4214:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0__0__Impl"
    // InternalCalculatorForm.g:4221:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4225:1: ( ( () ) )
            // InternalCalculatorForm.g:4226:1: ( () )
            {
            // InternalCalculatorForm.g:4226:1: ( () )
            // InternalCalculatorForm.g:4227:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0()); 
            }
            // InternalCalculatorForm.g:4228:2: ()
            // InternalCalculatorForm.g:4228:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiOrDivLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__1"
    // InternalCalculatorForm.g:4236:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4240:1: ( rule__Multiplication__Group_1_0__1__Impl )
            // InternalCalculatorForm.g:4241:2: rule__Multiplication__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0__1__Impl"
    // InternalCalculatorForm.g:4247:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4251:1: ( ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) )
            // InternalCalculatorForm.g:4252:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            {
            // InternalCalculatorForm.g:4252:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            // InternalCalculatorForm.g:4253:2: ( rule__Multiplication__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }
            // InternalCalculatorForm.g:4254:2: ( rule__Multiplication__OpAssignment_1_0_1 )
            // InternalCalculatorForm.g:4254:3: rule__Multiplication__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1__Impl"


    // $ANTLR start "rule__Prefixed__Group_0__0"
    // InternalCalculatorForm.g:4263:1: rule__Prefixed__Group_0__0 : rule__Prefixed__Group_0__0__Impl rule__Prefixed__Group_0__1 ;
    public final void rule__Prefixed__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4267:1: ( rule__Prefixed__Group_0__0__Impl rule__Prefixed__Group_0__1 )
            // InternalCalculatorForm.g:4268:2: rule__Prefixed__Group_0__0__Impl rule__Prefixed__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__Prefixed__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefixed__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__0"


    // $ANTLR start "rule__Prefixed__Group_0__0__Impl"
    // InternalCalculatorForm.g:4275:1: rule__Prefixed__Group_0__0__Impl : ( () ) ;
    public final void rule__Prefixed__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4279:1: ( ( () ) )
            // InternalCalculatorForm.g:4280:1: ( () )
            {
            // InternalCalculatorForm.g:4280:1: ( () )
            // InternalCalculatorForm.g:4281:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0()); 
            }
            // InternalCalculatorForm.g:4282:2: ()
            // InternalCalculatorForm.g:4282:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getBooleanNegationAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__0__Impl"


    // $ANTLR start "rule__Prefixed__Group_0__1"
    // InternalCalculatorForm.g:4290:1: rule__Prefixed__Group_0__1 : rule__Prefixed__Group_0__1__Impl rule__Prefixed__Group_0__2 ;
    public final void rule__Prefixed__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4294:1: ( rule__Prefixed__Group_0__1__Impl rule__Prefixed__Group_0__2 )
            // InternalCalculatorForm.g:4295:2: rule__Prefixed__Group_0__1__Impl rule__Prefixed__Group_0__2
            {
            pushFollow(FOLLOW_27);
            rule__Prefixed__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefixed__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__1"


    // $ANTLR start "rule__Prefixed__Group_0__1__Impl"
    // InternalCalculatorForm.g:4302:1: rule__Prefixed__Group_0__1__Impl : ( ( '!' ) ) ;
    public final void rule__Prefixed__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4306:1: ( ( ( '!' ) ) )
            // InternalCalculatorForm.g:4307:1: ( ( '!' ) )
            {
            // InternalCalculatorForm.g:4307:1: ( ( '!' ) )
            // InternalCalculatorForm.g:4308:2: ( '!' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1()); 
            }
            // InternalCalculatorForm.g:4309:2: ( '!' )
            // InternalCalculatorForm.g:4309:3: '!'
            {
            match(input,34,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExclamationMarkKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__1__Impl"


    // $ANTLR start "rule__Prefixed__Group_0__2"
    // InternalCalculatorForm.g:4317:1: rule__Prefixed__Group_0__2 : rule__Prefixed__Group_0__2__Impl ;
    public final void rule__Prefixed__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4321:1: ( rule__Prefixed__Group_0__2__Impl )
            // InternalCalculatorForm.g:4322:2: rule__Prefixed__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefixed__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__2"


    // $ANTLR start "rule__Prefixed__Group_0__2__Impl"
    // InternalCalculatorForm.g:4328:1: rule__Prefixed__Group_0__2__Impl : ( ( rule__Prefixed__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Prefixed__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4332:1: ( ( ( rule__Prefixed__ExpressionAssignment_0_2 ) ) )
            // InternalCalculatorForm.g:4333:1: ( ( rule__Prefixed__ExpressionAssignment_0_2 ) )
            {
            // InternalCalculatorForm.g:4333:1: ( ( rule__Prefixed__ExpressionAssignment_0_2 ) )
            // InternalCalculatorForm.g:4334:2: ( rule__Prefixed__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAssignment_0_2()); 
            }
            // InternalCalculatorForm.g:4335:2: ( rule__Prefixed__ExpressionAssignment_0_2 )
            // InternalCalculatorForm.g:4335:3: rule__Prefixed__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Prefixed__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_0__2__Impl"


    // $ANTLR start "rule__Prefixed__Group_1__0"
    // InternalCalculatorForm.g:4344:1: rule__Prefixed__Group_1__0 : rule__Prefixed__Group_1__0__Impl rule__Prefixed__Group_1__1 ;
    public final void rule__Prefixed__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4348:1: ( rule__Prefixed__Group_1__0__Impl rule__Prefixed__Group_1__1 )
            // InternalCalculatorForm.g:4349:2: rule__Prefixed__Group_1__0__Impl rule__Prefixed__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Prefixed__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefixed__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__0"


    // $ANTLR start "rule__Prefixed__Group_1__0__Impl"
    // InternalCalculatorForm.g:4356:1: rule__Prefixed__Group_1__0__Impl : ( () ) ;
    public final void rule__Prefixed__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4360:1: ( ( () ) )
            // InternalCalculatorForm.g:4361:1: ( () )
            {
            // InternalCalculatorForm.g:4361:1: ( () )
            // InternalCalculatorForm.g:4362:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0()); 
            }
            // InternalCalculatorForm.g:4363:2: ()
            // InternalCalculatorForm.g:4363:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getArithmeticSignedAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__0__Impl"


    // $ANTLR start "rule__Prefixed__Group_1__1"
    // InternalCalculatorForm.g:4371:1: rule__Prefixed__Group_1__1 : rule__Prefixed__Group_1__1__Impl rule__Prefixed__Group_1__2 ;
    public final void rule__Prefixed__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4375:1: ( rule__Prefixed__Group_1__1__Impl rule__Prefixed__Group_1__2 )
            // InternalCalculatorForm.g:4376:2: rule__Prefixed__Group_1__1__Impl rule__Prefixed__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Prefixed__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Prefixed__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__1"


    // $ANTLR start "rule__Prefixed__Group_1__1__Impl"
    // InternalCalculatorForm.g:4383:1: rule__Prefixed__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Prefixed__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4387:1: ( ( ( '-' ) ) )
            // InternalCalculatorForm.g:4388:1: ( ( '-' ) )
            {
            // InternalCalculatorForm.g:4388:1: ( ( '-' ) )
            // InternalCalculatorForm.g:4389:2: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getHyphenMinusKeyword_1_1()); 
            }
            // InternalCalculatorForm.g:4390:2: ( '-' )
            // InternalCalculatorForm.g:4390:3: '-'
            {
            match(input,33,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__1__Impl"


    // $ANTLR start "rule__Prefixed__Group_1__2"
    // InternalCalculatorForm.g:4398:1: rule__Prefixed__Group_1__2 : rule__Prefixed__Group_1__2__Impl ;
    public final void rule__Prefixed__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4402:1: ( rule__Prefixed__Group_1__2__Impl )
            // InternalCalculatorForm.g:4403:2: rule__Prefixed__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefixed__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__2"


    // $ANTLR start "rule__Prefixed__Group_1__2__Impl"
    // InternalCalculatorForm.g:4409:1: rule__Prefixed__Group_1__2__Impl : ( ( rule__Prefixed__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Prefixed__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4413:1: ( ( ( rule__Prefixed__ExpressionAssignment_1_2 ) ) )
            // InternalCalculatorForm.g:4414:1: ( ( rule__Prefixed__ExpressionAssignment_1_2 ) )
            {
            // InternalCalculatorForm.g:4414:1: ( ( rule__Prefixed__ExpressionAssignment_1_2 ) )
            // InternalCalculatorForm.g:4415:2: ( rule__Prefixed__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAssignment_1_2()); 
            }
            // InternalCalculatorForm.g:4416:2: ( rule__Prefixed__ExpressionAssignment_1_2 )
            // InternalCalculatorForm.g:4416:3: rule__Prefixed__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Prefixed__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalCalculatorForm.g:4425:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4429:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalCalculatorForm.g:4430:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCalculatorForm.g:4437:1: rule__Atomic__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4441:1: ( ( '(' ) )
            // InternalCalculatorForm.g:4442:1: ( '(' )
            {
            // InternalCalculatorForm.g:4442:1: ( '(' )
            // InternalCalculatorForm.g:4443:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4452:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4456:1: ( rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2 )
            // InternalCalculatorForm.g:4457:2: rule__Atomic__Group_0__1__Impl rule__Atomic__Group_0__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalCalculatorForm.g:4464:1: rule__Atomic__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4468:1: ( ( ruleExpression ) )
            // InternalCalculatorForm.g:4469:1: ( ruleExpression )
            {
            // InternalCalculatorForm.g:4469:1: ( ruleExpression )
            // InternalCalculatorForm.g:4470:2: ruleExpression
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
    // InternalCalculatorForm.g:4479:1: rule__Atomic__Group_0__2 : rule__Atomic__Group_0__2__Impl ;
    public final void rule__Atomic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4483:1: ( rule__Atomic__Group_0__2__Impl )
            // InternalCalculatorForm.g:4484:2: rule__Atomic__Group_0__2__Impl
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
    // InternalCalculatorForm.g:4490:1: rule__Atomic__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Atomic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4494:1: ( ( ')' ) )
            // InternalCalculatorForm.g:4495:1: ( ')' )
            {
            // InternalCalculatorForm.g:4495:1: ( ')' )
            // InternalCalculatorForm.g:4496:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalCalculatorForm.g:4506:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4510:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalCalculatorForm.g:4511:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalCalculatorForm.g:4518:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4522:1: ( ( () ) )
            // InternalCalculatorForm.g:4523:1: ( () )
            {
            // InternalCalculatorForm.g:4523:1: ( () )
            // InternalCalculatorForm.g:4524:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            }
            // InternalCalculatorForm.g:4525:2: ()
            // InternalCalculatorForm.g:4525:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalCalculatorForm.g:4533:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4537:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalCalculatorForm.g:4538:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalCalculatorForm.g:4544:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4548:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalCalculatorForm.g:4549:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalCalculatorForm.g:4549:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalCalculatorForm.g:4550:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }
            // InternalCalculatorForm.g:4551:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalCalculatorForm.g:4551:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalCalculatorForm.g:4560:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4564:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalCalculatorForm.g:4565:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalCalculatorForm.g:4572:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4576:1: ( ( () ) )
            // InternalCalculatorForm.g:4577:1: ( () )
            {
            // InternalCalculatorForm.g:4577:1: ( () )
            // InternalCalculatorForm.g:4578:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getFloatLiteralAction_2_0()); 
            }
            // InternalCalculatorForm.g:4579:2: ()
            // InternalCalculatorForm.g:4579:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getFloatLiteralAction_2_0()); 
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
    // InternalCalculatorForm.g:4587:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4591:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalCalculatorForm.g:4592:2: rule__Atomic__Group_2__1__Impl
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
    // InternalCalculatorForm.g:4598:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4602:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:4603:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:4603:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalCalculatorForm.g:4604:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }
            // InternalCalculatorForm.g:4605:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalCalculatorForm.g:4605:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalCalculatorForm.g:4614:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4618:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalCalculatorForm.g:4619:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_27);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalCalculatorForm.g:4626:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4630:1: ( ( () ) )
            // InternalCalculatorForm.g:4631:1: ( () )
            {
            // InternalCalculatorForm.g:4631:1: ( () )
            // InternalCalculatorForm.g:4632:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getFieldReferenceAction_3_0()); 
            }
            // InternalCalculatorForm.g:4633:2: ()
            // InternalCalculatorForm.g:4633:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getFieldReferenceAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalCalculatorForm.g:4641:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4645:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalCalculatorForm.g:4646:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalCalculatorForm.g:4652:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__RefAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4656:1: ( ( ( rule__Atomic__RefAssignment_3_1 ) ) )
            // InternalCalculatorForm.g:4657:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            {
            // InternalCalculatorForm.g:4657:1: ( ( rule__Atomic__RefAssignment_3_1 ) )
            // InternalCalculatorForm.g:4658:2: ( rule__Atomic__RefAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            }
            // InternalCalculatorForm.g:4659:2: ( rule__Atomic__RefAssignment_3_1 )
            // InternalCalculatorForm.g:4659:3: rule__Atomic__RefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__RefAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Model__FormElementsAssignment_0"
    // InternalCalculatorForm.g:4668:1: rule__Model__FormElementsAssignment_0 : ( ruleFormElement ) ;
    public final void rule__Model__FormElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4672:1: ( ( ruleFormElement ) )
            // InternalCalculatorForm.g:4673:2: ( ruleFormElement )
            {
            // InternalCalculatorForm.g:4673:2: ( ruleFormElement )
            // InternalCalculatorForm.g:4674:3: ruleFormElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFormElementsFormElementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFormElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFormElementsFormElementParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormElementsAssignment_0"


    // $ANTLR start "rule__Model__CalculationsAssignment_1"
    // InternalCalculatorForm.g:4683:1: rule__Model__CalculationsAssignment_1 : ( ruleCalculate ) ;
    public final void rule__Model__CalculationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4687:1: ( ( ruleCalculate ) )
            // InternalCalculatorForm.g:4688:2: ( ruleCalculate )
            {
            // InternalCalculatorForm.g:4688:2: ( ruleCalculate )
            // InternalCalculatorForm.g:4689:3: ruleCalculate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getCalculationsCalculateParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCalculate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getCalculationsCalculateParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CalculationsAssignment_1"


    // $ANTLR start "rule__FieldInput__NameAssignment_1"
    // InternalCalculatorForm.g:4698:1: rule__FieldInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4702:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4703:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4703:2: ( RULE_ID )
            // InternalCalculatorForm.g:4704:3: RULE_ID
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
    // InternalCalculatorForm.g:4713:1: rule__FieldInput__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldInput__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4717:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:4718:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:4718:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:4719:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:4720:3: ( 'autofocus' )
            // InternalCalculatorForm.g:4721:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4732:1: rule__FieldInput__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldInput__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4736:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:4737:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:4737:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:4738:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:4739:3: ( 'disabled' )
            // InternalCalculatorForm.g:4740:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4751:1: rule__FieldInput__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4755:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4756:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4756:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4757:3: RULE_STRING
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
    // InternalCalculatorForm.g:4766:1: rule__FieldInput__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4770:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4771:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4771:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4772:3: RULE_STRING
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
    // InternalCalculatorForm.g:4781:1: rule__FieldInput__NotdisplayedAssignment_6 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldInput__NotdisplayedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4785:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:4786:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:4786:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:4787:3: ( 'notdisplayed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:4788:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:4789:4: 'notdisplayed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4800:1: rule__FieldInput__ReadonlyAssignment_7 : ( ( 'readonly' ) ) ;
    public final void rule__FieldInput__ReadonlyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4804:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:4805:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:4805:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:4806:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:4807:3: ( 'readonly' )
            // InternalCalculatorForm.g:4808:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4819:1: rule__FieldInput__RequiredAssignment_8 : ( ( 'required' ) ) ;
    public final void rule__FieldInput__RequiredAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4823:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:4824:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:4824:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:4825:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }
            // InternalCalculatorForm.g:4826:3: ( 'required' )
            // InternalCalculatorForm.g:4827:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4838:1: rule__FieldInput__ValueAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__ValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4842:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4843:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4843:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4844:3: RULE_STRING
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
    // InternalCalculatorForm.g:4853:1: rule__FieldSelect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSelect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4857:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4858:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4858:2: ( RULE_ID )
            // InternalCalculatorForm.g:4859:3: RULE_ID
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
    // InternalCalculatorForm.g:4868:1: rule__FieldSelect__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldSelect__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4872:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:4873:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:4873:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:4874:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:4875:3: ( 'autofocus' )
            // InternalCalculatorForm.g:4876:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4887:1: rule__FieldSelect__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldSelect__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4891:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:4892:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:4892:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:4893:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:4894:3: ( 'disabled' )
            // InternalCalculatorForm.g:4895:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4906:1: rule__FieldSelect__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4910:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4911:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4911:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4912:3: RULE_STRING
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
    // InternalCalculatorForm.g:4921:1: rule__FieldSelect__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4925:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4926:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4926:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4927:3: RULE_STRING
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
    // InternalCalculatorForm.g:4936:1: rule__FieldSelect__MultipleAssignment_6 : ( ( 'multiple' ) ) ;
    public final void rule__FieldSelect__MultipleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4940:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:4941:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:4941:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:4942:3: ( 'multiple' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:4943:3: ( 'multiple' )
            // InternalCalculatorForm.g:4944:4: 'multiple'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4955:1: rule__FieldSelect__RequiredAssignment_7 : ( ( 'required' ) ) ;
    public final void rule__FieldSelect__RequiredAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4959:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:4960:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:4960:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:4961:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:4962:3: ( 'required' )
            // InternalCalculatorForm.g:4963:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:4974:1: rule__FieldSelect__SizeAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__FieldSelect__SizeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4978:1: ( ( RULE_INT ) )
            // InternalCalculatorForm.g:4979:2: ( RULE_INT )
            {
            // InternalCalculatorForm.g:4979:2: ( RULE_INT )
            // InternalCalculatorForm.g:4980:3: RULE_INT
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
    // InternalCalculatorForm.g:4989:1: rule__FieldSelect__ChildsAssignment_10 : ( ruleFieldSelectChild ) ;
    public final void rule__FieldSelect__ChildsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4993:1: ( ( ruleFieldSelectChild ) )
            // InternalCalculatorForm.g:4994:2: ( ruleFieldSelectChild )
            {
            // InternalCalculatorForm.g:4994:2: ( ruleFieldSelectChild )
            // InternalCalculatorForm.g:4995:3: ruleFieldSelectChild
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
    // InternalCalculatorForm.g:5004:1: rule__FieldOption__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5008:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5009:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5009:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5010:3: RULE_STRING
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
    // InternalCalculatorForm.g:5019:1: rule__FieldOption__DisabledAssignment_2 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOption__DisabledAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5023:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5024:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5024:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5025:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5026:3: ( 'disabled' )
            // InternalCalculatorForm.g:5027:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5038:1: rule__FieldOption__SelectedAssignment_3 : ( ( 'selected' ) ) ;
    public final void rule__FieldOption__SelectedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5042:1: ( ( ( 'selected' ) ) )
            // InternalCalculatorForm.g:5043:2: ( ( 'selected' ) )
            {
            // InternalCalculatorForm.g:5043:2: ( ( 'selected' ) )
            // InternalCalculatorForm.g:5044:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5045:3: ( 'selected' )
            // InternalCalculatorForm.g:5046:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5057:1: rule__FieldOption__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5061:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5062:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5062:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5063:3: RULE_STRING
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
    // InternalCalculatorForm.g:5072:1: rule__FieldOption__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5076:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5077:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5077:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5078:3: RULE_STRING
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
    // InternalCalculatorForm.g:5087:1: rule__FieldOptionGroup__DisabledAssignment_1 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOptionGroup__DisabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5091:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5092:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5092:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5093:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }
            // InternalCalculatorForm.g:5094:3: ( 'disabled' )
            // InternalCalculatorForm.g:5095:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5106:1: rule__FieldOptionGroup__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FieldOptionGroup__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5110:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5111:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5111:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5112:3: RULE_STRING
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
    // InternalCalculatorForm.g:5121:1: rule__FieldOptionGroup__OptionsAssignment_4 : ( ruleFieldOption ) ;
    public final void rule__FieldOptionGroup__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5125:1: ( ( ruleFieldOption ) )
            // InternalCalculatorForm.g:5126:2: ( ruleFieldOption )
            {
            // InternalCalculatorForm.g:5126:2: ( ruleFieldOption )
            // InternalCalculatorForm.g:5127:3: ruleFieldOption
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
    // InternalCalculatorForm.g:5136:1: rule__FieldChoice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldChoice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5140:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5141:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5141:2: ( RULE_ID )
            // InternalCalculatorForm.g:5142:3: RULE_ID
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
    // InternalCalculatorForm.g:5151:1: rule__FieldChoice__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoice__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5155:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5156:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5156:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5157:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5158:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5159:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5170:1: rule__FieldChoice__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoice__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5174:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:5175:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:5175:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:5176:3: ( 'checked' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5177:3: ( 'checked' )
            // InternalCalculatorForm.g:5178:4: 'checked'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5189:1: rule__FieldChoice__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoice__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5193:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5194:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5194:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5195:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5196:3: ( 'disabled' )
            // InternalCalculatorForm.g:5197:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5208:1: rule__FieldChoice__FormAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__FormAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5212:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5213:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5213:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5214:3: RULE_STRING
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
    // InternalCalculatorForm.g:5223:1: rule__FieldChoice__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5227:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5228:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5228:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5229:3: RULE_STRING
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
    // InternalCalculatorForm.g:5238:1: rule__FieldChoice__MultipleAssignment_7 : ( ( 'multiple' ) ) ;
    public final void rule__FieldChoice__MultipleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5242:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:5243:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:5243:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:5244:3: ( 'multiple' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }
            // InternalCalculatorForm.g:5245:3: ( 'multiple' )
            // InternalCalculatorForm.g:5246:4: 'multiple'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5257:1: rule__FieldChoice__NotdisplayedAssignment_8 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldChoice__NotdisplayedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5261:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:5262:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:5262:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:5263:3: ( 'notdisplayed' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }
            // InternalCalculatorForm.g:5264:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:5265:4: 'notdisplayed'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5276:1: rule__FieldChoice__ReadonlyAssignment_9 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoice__ReadonlyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5280:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5281:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5281:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5282:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }
            // InternalCalculatorForm.g:5283:3: ( 'readonly' )
            // InternalCalculatorForm.g:5284:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5295:1: rule__FieldChoice__RequiredAssignment_10 : ( ( 'required' ) ) ;
    public final void rule__FieldChoice__RequiredAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5299:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5300:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5300:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5301:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }
            // InternalCalculatorForm.g:5302:3: ( 'required' )
            // InternalCalculatorForm.g:5303:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5314:1: rule__FieldChoice__ValueAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__ValueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5318:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5319:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5319:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5320:3: RULE_STRING
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
    // InternalCalculatorForm.g:5329:1: rule__FieldChoice__OptionsAssignment_12_1 : ( ruleFieldChoiceOption ) ;
    public final void rule__FieldChoice__OptionsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5333:1: ( ( ruleFieldChoiceOption ) )
            // InternalCalculatorForm.g:5334:2: ( ruleFieldChoiceOption )
            {
            // InternalCalculatorForm.g:5334:2: ( ruleFieldChoiceOption )
            // InternalCalculatorForm.g:5335:3: ruleFieldChoiceOption
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
    // InternalCalculatorForm.g:5344:1: rule__FieldChoiceOption__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5348:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5349:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5349:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5350:3: RULE_STRING
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
    // InternalCalculatorForm.g:5359:1: rule__FieldChoiceOption__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoiceOption__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5363:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5364:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5364:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5365:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            // InternalCalculatorForm.g:5366:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5367:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5378:1: rule__FieldChoiceOption__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoiceOption__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5382:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:5383:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:5383:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:5384:3: ( 'checked' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5385:3: ( 'checked' )
            // InternalCalculatorForm.g:5386:4: 'checked'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5397:1: rule__FieldChoiceOption__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoiceOption__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5401:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5402:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5402:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5403:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5404:3: ( 'disabled' )
            // InternalCalculatorForm.g:5405:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5416:1: rule__FieldChoiceOption__ReadonlyAssignment_5 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoiceOption__ReadonlyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5420:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:5421:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:5421:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:5422:3: ( 'readonly' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }
            // InternalCalculatorForm.g:5423:3: ( 'readonly' )
            // InternalCalculatorForm.g:5424:4: 'readonly'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5435:1: rule__FieldChoiceOption__RequiredAssignment_6 : ( ( 'required' ) ) ;
    public final void rule__FieldChoiceOption__RequiredAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5439:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:5440:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:5440:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:5441:3: ( 'required' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }
            // InternalCalculatorForm.g:5442:3: ( 'required' )
            // InternalCalculatorForm.g:5443:4: 'required'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5454:1: rule__FieldChoiceOption__ValueAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5458:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5459:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5459:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5460:3: RULE_STRING
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
    // InternalCalculatorForm.g:5469:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5473:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5474:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5474:2: ( RULE_ID )
            // InternalCalculatorForm.g:5475:3: RULE_ID
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
    // InternalCalculatorForm.g:5484:1: rule__Group__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Group__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5488:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5489:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5489:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5490:3: RULE_STRING
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
    // InternalCalculatorForm.g:5499:1: rule__Group__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Group__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5503:1: ( ( ruleField ) )
            // InternalCalculatorForm.g:5504:2: ( ruleField )
            {
            // InternalCalculatorForm.g:5504:2: ( ruleField )
            // InternalCalculatorForm.g:5505:3: ruleField
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
    // InternalCalculatorForm.g:5514:1: rule__Page__ChildsAssignment_2 : ( rulePageChild ) ;
    public final void rule__Page__ChildsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5518:1: ( ( rulePageChild ) )
            // InternalCalculatorForm.g:5519:2: ( rulePageChild )
            {
            // InternalCalculatorForm.g:5519:2: ( rulePageChild )
            // InternalCalculatorForm.g:5520:3: rulePageChild
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
    // InternalCalculatorForm.g:5529:1: rule__ButtonSubmit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ButtonSubmit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5533:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:5534:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:5534:2: ( RULE_ID )
            // InternalCalculatorForm.g:5535:3: RULE_ID
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
    // InternalCalculatorForm.g:5544:1: rule__ButtonSubmit__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5548:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5549:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5549:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5550:3: RULE_STRING
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
    // InternalCalculatorForm.g:5559:1: rule__ButtonSubmit__AutofocusAssignment_3 : ( ( 'autofocus' ) ) ;
    public final void rule__ButtonSubmit__AutofocusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5563:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:5564:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:5564:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:5565:3: ( 'autofocus' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }
            // InternalCalculatorForm.g:5566:3: ( 'autofocus' )
            // InternalCalculatorForm.g:5567:4: 'autofocus'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5578:1: rule__ButtonSubmit__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__ButtonSubmit__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5582:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:5583:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:5583:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:5584:3: ( 'disabled' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }
            // InternalCalculatorForm.g:5585:3: ( 'disabled' )
            // InternalCalculatorForm.g:5586:4: 'disabled'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalCalculatorForm.g:5597:1: rule__ButtonSubmit__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5601:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:5602:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:5602:2: ( RULE_STRING )
            // InternalCalculatorForm.g:5603:3: RULE_STRING
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
    // InternalCalculatorForm.g:5612:1: rule__Calculate__ResultAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Calculate__ResultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5616:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCalculatorForm.g:5617:2: ( ( ruleQualifiedName ) )
            {
            // InternalCalculatorForm.g:5617:2: ( ( ruleQualifiedName ) )
            // InternalCalculatorForm.g:5618:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCalculateAccess().getResultFieldCrossReference_1_0()); 
            }
            // InternalCalculatorForm.g:5619:3: ( ruleQualifiedName )
            // InternalCalculatorForm.g:5620:4: ruleQualifiedName
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
    // InternalCalculatorForm.g:5631:1: rule__Calculate__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Calculate__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5635:1: ( ( ruleExpression ) )
            // InternalCalculatorForm.g:5636:2: ( ruleExpression )
            {
            // InternalCalculatorForm.g:5636:2: ( ruleExpression )
            // InternalCalculatorForm.g:5637:3: ruleExpression
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
    // InternalCalculatorForm.g:5646:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5650:1: ( ( ruleMultiplication ) )
            // InternalCalculatorForm.g:5651:2: ( ruleMultiplication )
            {
            // InternalCalculatorForm.g:5651:2: ( ruleMultiplication )
            // InternalCalculatorForm.g:5652:3: ruleMultiplication
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


    // $ANTLR start "rule__Multiplication__OpAssignment_1_0_1"
    // InternalCalculatorForm.g:5661:1: rule__Multiplication__OpAssignment_1_0_1 : ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5665:1: ( ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) )
            // InternalCalculatorForm.g:5666:2: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            {
            // InternalCalculatorForm.g:5666:2: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            // InternalCalculatorForm.g:5667:3: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // InternalCalculatorForm.g:5668:3: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            // InternalCalculatorForm.g:5668:4: rule__Multiplication__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OpAssignment_1_0_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalCalculatorForm.g:5676:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrefixed ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5680:1: ( ( rulePrefixed ) )
            // InternalCalculatorForm.g:5681:2: ( rulePrefixed )
            {
            // InternalCalculatorForm.g:5681:2: ( rulePrefixed )
            // InternalCalculatorForm.g:5682:3: rulePrefixed
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


    // $ANTLR start "rule__Prefixed__ExpressionAssignment_0_2"
    // InternalCalculatorForm.g:5691:1: rule__Prefixed__ExpressionAssignment_0_2 : ( ruleAtomic ) ;
    public final void rule__Prefixed__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5695:1: ( ( ruleAtomic ) )
            // InternalCalculatorForm.g:5696:2: ( ruleAtomic )
            {
            // InternalCalculatorForm.g:5696:2: ( ruleAtomic )
            // InternalCalculatorForm.g:5697:3: ruleAtomic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__ExpressionAssignment_0_2"


    // $ANTLR start "rule__Prefixed__ExpressionAssignment_1_2"
    // InternalCalculatorForm.g:5706:1: rule__Prefixed__ExpressionAssignment_1_2 : ( ruleAtomic ) ;
    public final void rule__Prefixed__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5710:1: ( ( ruleAtomic ) )
            // InternalCalculatorForm.g:5711:2: ( ruleAtomic )
            {
            // InternalCalculatorForm.g:5711:2: ( ruleAtomic )
            // InternalCalculatorForm.g:5712:3: ruleAtomic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixedAccess().getExpressionAtomicParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefixed__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalCalculatorForm.g:5721:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5725:1: ( ( RULE_INT ) )
            // InternalCalculatorForm.g:5726:2: ( RULE_INT )
            {
            // InternalCalculatorForm.g:5726:2: ( RULE_INT )
            // InternalCalculatorForm.g:5727:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalCalculatorForm.g:5736:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_FLOAT ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5740:1: ( ( RULE_FLOAT ) )
            // InternalCalculatorForm.g:5741:2: ( RULE_FLOAT )
            {
            // InternalCalculatorForm.g:5741:2: ( RULE_FLOAT )
            // InternalCalculatorForm.g:5742:3: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueFLOATTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__RefAssignment_3_1"
    // InternalCalculatorForm.g:5751:1: rule__Atomic__RefAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atomic__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:5755:1: ( ( ( ruleQualifiedName ) ) )
            // InternalCalculatorForm.g:5756:2: ( ( ruleQualifiedName ) )
            {
            // InternalCalculatorForm.g:5756:2: ( ( ruleQualifiedName ) )
            // InternalCalculatorForm.g:5757:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefFieldCrossReference_3_1_0()); 
            }
            // InternalCalculatorForm.g:5758:3: ( ruleQualifiedName )
            // InternalCalculatorForm.g:5759:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRefFieldQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefFieldQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRefFieldCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__RefAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001E044002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000003E000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000066000298000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000084000820000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000004000090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000017E0000B8000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000136000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000012144000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000012044002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000016144000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000016044002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E000000D0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});

}