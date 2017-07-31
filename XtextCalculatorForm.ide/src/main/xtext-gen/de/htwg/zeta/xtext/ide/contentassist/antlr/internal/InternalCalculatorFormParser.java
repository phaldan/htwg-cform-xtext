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

@SuppressWarnings("all")
public class InternalCalculatorFormParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'field'", "'form'", "'label'", "'value'", "'dropdown'", "'{'", "'}'", "'size'", "'option'", "'text'", "'option-group'", "'choice'", "'group'", "'page'", "'submit-button'", "'autofocus'", "'disabled'", "'notdisplayed'", "'readonly'", "'required'", "'multiple'", "'selected'", "'checked'"
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
    // InternalCalculatorForm.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:54:1: ( ruleModel EOF )
            // InternalCalculatorForm.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:62:1: ruleModel : ( ( rule__Model__FormElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:66:2: ( ( ( rule__Model__FormElementsAssignment )* ) )
            // InternalCalculatorForm.g:67:2: ( ( rule__Model__FormElementsAssignment )* )
            {
            // InternalCalculatorForm.g:67:2: ( ( rule__Model__FormElementsAssignment )* )
            // InternalCalculatorForm.g:68:3: ( rule__Model__FormElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getFormElementsAssignment()); 
            // InternalCalculatorForm.g:69:3: ( rule__Model__FormElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=22 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalculatorForm.g:69:4: rule__Model__FormElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FormElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFormElementsAssignment()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:78:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:79:1: ( ruleFormElement EOF )
            // InternalCalculatorForm.g:80:1: ruleFormElement EOF
            {
             before(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_1);
            ruleFormElement();

            state._fsp--;

             after(grammarAccess.getFormElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:87:1: ruleFormElement : ( ( rule__FormElement__Alternatives ) ) ;
    public final void ruleFormElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:91:2: ( ( ( rule__FormElement__Alternatives ) ) )
            // InternalCalculatorForm.g:92:2: ( ( rule__FormElement__Alternatives ) )
            {
            // InternalCalculatorForm.g:92:2: ( ( rule__FormElement__Alternatives ) )
            // InternalCalculatorForm.g:93:3: ( rule__FormElement__Alternatives )
            {
             before(grammarAccess.getFormElementAccess().getAlternatives()); 
            // InternalCalculatorForm.g:94:3: ( rule__FormElement__Alternatives )
            // InternalCalculatorForm.g:94:4: rule__FormElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormElementAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:103:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:104:1: ( ruleField EOF )
            // InternalCalculatorForm.g:105:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:112:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:116:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalCalculatorForm.g:117:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalCalculatorForm.g:117:2: ( ( rule__Field__Alternatives ) )
            // InternalCalculatorForm.g:118:3: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // InternalCalculatorForm.g:119:3: ( rule__Field__Alternatives )
            // InternalCalculatorForm.g:119:4: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:128:1: entryRuleFieldInput : ruleFieldInput EOF ;
    public final void entryRuleFieldInput() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:129:1: ( ruleFieldInput EOF )
            // InternalCalculatorForm.g:130:1: ruleFieldInput EOF
            {
             before(grammarAccess.getFieldInputRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldInput();

            state._fsp--;

             after(grammarAccess.getFieldInputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:137:1: ruleFieldInput : ( ( rule__FieldInput__Group__0 ) ) ;
    public final void ruleFieldInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:141:2: ( ( ( rule__FieldInput__Group__0 ) ) )
            // InternalCalculatorForm.g:142:2: ( ( rule__FieldInput__Group__0 ) )
            {
            // InternalCalculatorForm.g:142:2: ( ( rule__FieldInput__Group__0 ) )
            // InternalCalculatorForm.g:143:3: ( rule__FieldInput__Group__0 )
            {
             before(grammarAccess.getFieldInputAccess().getGroup()); 
            // InternalCalculatorForm.g:144:3: ( rule__FieldInput__Group__0 )
            // InternalCalculatorForm.g:144:4: rule__FieldInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldInputAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:153:1: entryRuleFieldSelect : ruleFieldSelect EOF ;
    public final void entryRuleFieldSelect() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:154:1: ( ruleFieldSelect EOF )
            // InternalCalculatorForm.g:155:1: ruleFieldSelect EOF
            {
             before(grammarAccess.getFieldSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldSelect();

            state._fsp--;

             after(grammarAccess.getFieldSelectRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:162:1: ruleFieldSelect : ( ( rule__FieldSelect__Group__0 ) ) ;
    public final void ruleFieldSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:166:2: ( ( ( rule__FieldSelect__Group__0 ) ) )
            // InternalCalculatorForm.g:167:2: ( ( rule__FieldSelect__Group__0 ) )
            {
            // InternalCalculatorForm.g:167:2: ( ( rule__FieldSelect__Group__0 ) )
            // InternalCalculatorForm.g:168:3: ( rule__FieldSelect__Group__0 )
            {
             before(grammarAccess.getFieldSelectAccess().getGroup()); 
            // InternalCalculatorForm.g:169:3: ( rule__FieldSelect__Group__0 )
            // InternalCalculatorForm.g:169:4: rule__FieldSelect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldSelectAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:178:1: entryRuleFieldSelectChild : ruleFieldSelectChild EOF ;
    public final void entryRuleFieldSelectChild() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:179:1: ( ruleFieldSelectChild EOF )
            // InternalCalculatorForm.g:180:1: ruleFieldSelectChild EOF
            {
             before(grammarAccess.getFieldSelectChildRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldSelectChild();

            state._fsp--;

             after(grammarAccess.getFieldSelectChildRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:187:1: ruleFieldSelectChild : ( ( rule__FieldSelectChild__Alternatives ) ) ;
    public final void ruleFieldSelectChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:191:2: ( ( ( rule__FieldSelectChild__Alternatives ) ) )
            // InternalCalculatorForm.g:192:2: ( ( rule__FieldSelectChild__Alternatives ) )
            {
            // InternalCalculatorForm.g:192:2: ( ( rule__FieldSelectChild__Alternatives ) )
            // InternalCalculatorForm.g:193:3: ( rule__FieldSelectChild__Alternatives )
            {
             before(grammarAccess.getFieldSelectChildAccess().getAlternatives()); 
            // InternalCalculatorForm.g:194:3: ( rule__FieldSelectChild__Alternatives )
            // InternalCalculatorForm.g:194:4: rule__FieldSelectChild__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelectChild__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldSelectChildAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:203:1: entryRuleFieldOption : ruleFieldOption EOF ;
    public final void entryRuleFieldOption() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:204:1: ( ruleFieldOption EOF )
            // InternalCalculatorForm.g:205:1: ruleFieldOption EOF
            {
             before(grammarAccess.getFieldOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldOption();

            state._fsp--;

             after(grammarAccess.getFieldOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:212:1: ruleFieldOption : ( ( rule__FieldOption__Group__0 ) ) ;
    public final void ruleFieldOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:216:2: ( ( ( rule__FieldOption__Group__0 ) ) )
            // InternalCalculatorForm.g:217:2: ( ( rule__FieldOption__Group__0 ) )
            {
            // InternalCalculatorForm.g:217:2: ( ( rule__FieldOption__Group__0 ) )
            // InternalCalculatorForm.g:218:3: ( rule__FieldOption__Group__0 )
            {
             before(grammarAccess.getFieldOptionAccess().getGroup()); 
            // InternalCalculatorForm.g:219:3: ( rule__FieldOption__Group__0 )
            // InternalCalculatorForm.g:219:4: rule__FieldOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldOptionAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:228:1: entryRuleFieldOptionGroup : ruleFieldOptionGroup EOF ;
    public final void entryRuleFieldOptionGroup() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:229:1: ( ruleFieldOptionGroup EOF )
            // InternalCalculatorForm.g:230:1: ruleFieldOptionGroup EOF
            {
             before(grammarAccess.getFieldOptionGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldOptionGroup();

            state._fsp--;

             after(grammarAccess.getFieldOptionGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:237:1: ruleFieldOptionGroup : ( ( rule__FieldOptionGroup__Group__0 ) ) ;
    public final void ruleFieldOptionGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:241:2: ( ( ( rule__FieldOptionGroup__Group__0 ) ) )
            // InternalCalculatorForm.g:242:2: ( ( rule__FieldOptionGroup__Group__0 ) )
            {
            // InternalCalculatorForm.g:242:2: ( ( rule__FieldOptionGroup__Group__0 ) )
            // InternalCalculatorForm.g:243:3: ( rule__FieldOptionGroup__Group__0 )
            {
             before(grammarAccess.getFieldOptionGroupAccess().getGroup()); 
            // InternalCalculatorForm.g:244:3: ( rule__FieldOptionGroup__Group__0 )
            // InternalCalculatorForm.g:244:4: rule__FieldOptionGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldOptionGroupAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:253:1: entryRuleFieldChoice : ruleFieldChoice EOF ;
    public final void entryRuleFieldChoice() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:254:1: ( ruleFieldChoice EOF )
            // InternalCalculatorForm.g:255:1: ruleFieldChoice EOF
            {
             before(grammarAccess.getFieldChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldChoice();

            state._fsp--;

             after(grammarAccess.getFieldChoiceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:262:1: ruleFieldChoice : ( ( rule__FieldChoice__Group__0 ) ) ;
    public final void ruleFieldChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:266:2: ( ( ( rule__FieldChoice__Group__0 ) ) )
            // InternalCalculatorForm.g:267:2: ( ( rule__FieldChoice__Group__0 ) )
            {
            // InternalCalculatorForm.g:267:2: ( ( rule__FieldChoice__Group__0 ) )
            // InternalCalculatorForm.g:268:3: ( rule__FieldChoice__Group__0 )
            {
             before(grammarAccess.getFieldChoiceAccess().getGroup()); 
            // InternalCalculatorForm.g:269:3: ( rule__FieldChoice__Group__0 )
            // InternalCalculatorForm.g:269:4: rule__FieldChoice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:278:1: entryRuleFieldChoiceOption : ruleFieldChoiceOption EOF ;
    public final void entryRuleFieldChoiceOption() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:279:1: ( ruleFieldChoiceOption EOF )
            // InternalCalculatorForm.g:280:1: ruleFieldChoiceOption EOF
            {
             before(grammarAccess.getFieldChoiceOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldChoiceOption();

            state._fsp--;

             after(grammarAccess.getFieldChoiceOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:287:1: ruleFieldChoiceOption : ( ( rule__FieldChoiceOption__Group__0 ) ) ;
    public final void ruleFieldChoiceOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:291:2: ( ( ( rule__FieldChoiceOption__Group__0 ) ) )
            // InternalCalculatorForm.g:292:2: ( ( rule__FieldChoiceOption__Group__0 ) )
            {
            // InternalCalculatorForm.g:292:2: ( ( rule__FieldChoiceOption__Group__0 ) )
            // InternalCalculatorForm.g:293:3: ( rule__FieldChoiceOption__Group__0 )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getGroup()); 
            // InternalCalculatorForm.g:294:3: ( rule__FieldChoiceOption__Group__0 )
            // InternalCalculatorForm.g:294:4: rule__FieldChoiceOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceOptionAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:303:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:304:1: ( ruleGroup EOF )
            // InternalCalculatorForm.g:305:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:312:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:316:2: ( ( ( rule__Group__Group__0 ) ) )
            // InternalCalculatorForm.g:317:2: ( ( rule__Group__Group__0 ) )
            {
            // InternalCalculatorForm.g:317:2: ( ( rule__Group__Group__0 ) )
            // InternalCalculatorForm.g:318:3: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // InternalCalculatorForm.g:319:3: ( rule__Group__Group__0 )
            // InternalCalculatorForm.g:319:4: rule__Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:328:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:329:1: ( rulePage EOF )
            // InternalCalculatorForm.g:330:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:337:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:341:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalCalculatorForm.g:342:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalCalculatorForm.g:342:2: ( ( rule__Page__Group__0 ) )
            // InternalCalculatorForm.g:343:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalCalculatorForm.g:344:3: ( rule__Page__Group__0 )
            // InternalCalculatorForm.g:344:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:353:1: entryRulePageChild : rulePageChild EOF ;
    public final void entryRulePageChild() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:354:1: ( rulePageChild EOF )
            // InternalCalculatorForm.g:355:1: rulePageChild EOF
            {
             before(grammarAccess.getPageChildRule()); 
            pushFollow(FOLLOW_1);
            rulePageChild();

            state._fsp--;

             after(grammarAccess.getPageChildRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:362:1: rulePageChild : ( ( rule__PageChild__Alternatives ) ) ;
    public final void rulePageChild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:366:2: ( ( ( rule__PageChild__Alternatives ) ) )
            // InternalCalculatorForm.g:367:2: ( ( rule__PageChild__Alternatives ) )
            {
            // InternalCalculatorForm.g:367:2: ( ( rule__PageChild__Alternatives ) )
            // InternalCalculatorForm.g:368:3: ( rule__PageChild__Alternatives )
            {
             before(grammarAccess.getPageChildAccess().getAlternatives()); 
            // InternalCalculatorForm.g:369:3: ( rule__PageChild__Alternatives )
            // InternalCalculatorForm.g:369:4: rule__PageChild__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PageChild__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPageChildAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:378:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:379:1: ( ruleButton EOF )
            // InternalCalculatorForm.g:380:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:387:1: ruleButton : ( ruleButtonSubmit ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:391:2: ( ( ruleButtonSubmit ) )
            // InternalCalculatorForm.g:392:2: ( ruleButtonSubmit )
            {
            // InternalCalculatorForm.g:392:2: ( ruleButtonSubmit )
            // InternalCalculatorForm.g:393:3: ruleButtonSubmit
            {
             before(grammarAccess.getButtonAccess().getButtonSubmitParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleButtonSubmit();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getButtonSubmitParserRuleCall()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:403:1: entryRuleButtonSubmit : ruleButtonSubmit EOF ;
    public final void entryRuleButtonSubmit() throws RecognitionException {
        try {
            // InternalCalculatorForm.g:404:1: ( ruleButtonSubmit EOF )
            // InternalCalculatorForm.g:405:1: ruleButtonSubmit EOF
            {
             before(grammarAccess.getButtonSubmitRule()); 
            pushFollow(FOLLOW_1);
            ruleButtonSubmit();

            state._fsp--;

             after(grammarAccess.getButtonSubmitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalCalculatorForm.g:412:1: ruleButtonSubmit : ( ( rule__ButtonSubmit__Group__0 ) ) ;
    public final void ruleButtonSubmit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:416:2: ( ( ( rule__ButtonSubmit__Group__0 ) ) )
            // InternalCalculatorForm.g:417:2: ( ( rule__ButtonSubmit__Group__0 ) )
            {
            // InternalCalculatorForm.g:417:2: ( ( rule__ButtonSubmit__Group__0 ) )
            // InternalCalculatorForm.g:418:3: ( rule__ButtonSubmit__Group__0 )
            {
             before(grammarAccess.getButtonSubmitAccess().getGroup()); 
            // InternalCalculatorForm.g:419:3: ( rule__ButtonSubmit__Group__0 )
            // InternalCalculatorForm.g:419:4: rule__ButtonSubmit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonSubmitAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__FormElement__Alternatives"
    // InternalCalculatorForm.g:427:1: rule__FormElement__Alternatives : ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) );
    public final void rule__FormElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:431:1: ( ( ruleField ) | ( ruleGroup ) | ( rulePage ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 15:
            case 22:
            case 25:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
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
                    // InternalCalculatorForm.g:432:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:432:2: ( ruleField )
                    // InternalCalculatorForm.g:433:3: ruleField
                    {
                     before(grammarAccess.getFormElementAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getFormElementAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:438:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:438:2: ( ruleGroup )
                    // InternalCalculatorForm.g:439:3: ruleGroup
                    {
                     before(grammarAccess.getFormElementAccess().getGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;

                     after(grammarAccess.getFormElementAccess().getGroupParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:444:2: ( rulePage )
                    {
                    // InternalCalculatorForm.g:444:2: ( rulePage )
                    // InternalCalculatorForm.g:445:3: rulePage
                    {
                     before(grammarAccess.getFormElementAccess().getPageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePage();

                    state._fsp--;

                     after(grammarAccess.getFormElementAccess().getPageParserRuleCall_2()); 

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
    // InternalCalculatorForm.g:454:1: rule__Field__Alternatives : ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:458:1: ( ( ruleFieldInput ) | ( ruleFieldSelect ) | ( ruleFieldChoice ) | ( ruleButton ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 25:
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
                    // InternalCalculatorForm.g:459:2: ( ruleFieldInput )
                    {
                    // InternalCalculatorForm.g:459:2: ( ruleFieldInput )
                    // InternalCalculatorForm.g:460:3: ruleFieldInput
                    {
                     before(grammarAccess.getFieldAccess().getFieldInputParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldInput();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getFieldInputParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:465:2: ( ruleFieldSelect )
                    {
                    // InternalCalculatorForm.g:465:2: ( ruleFieldSelect )
                    // InternalCalculatorForm.g:466:3: ruleFieldSelect
                    {
                     before(grammarAccess.getFieldAccess().getFieldSelectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldSelect();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getFieldSelectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCalculatorForm.g:471:2: ( ruleFieldChoice )
                    {
                    // InternalCalculatorForm.g:471:2: ( ruleFieldChoice )
                    // InternalCalculatorForm.g:472:3: ruleFieldChoice
                    {
                     before(grammarAccess.getFieldAccess().getFieldChoiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldChoice();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getFieldChoiceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCalculatorForm.g:477:2: ( ruleButton )
                    {
                    // InternalCalculatorForm.g:477:2: ( ruleButton )
                    // InternalCalculatorForm.g:478:3: ruleButton
                    {
                     before(grammarAccess.getFieldAccess().getButtonParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getButtonParserRuleCall_3()); 

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
    // InternalCalculatorForm.g:487:1: rule__FieldSelectChild__Alternatives : ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) );
    public final void rule__FieldSelectChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:491:1: ( ( ruleFieldOption ) | ( ruleFieldOptionGroup ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCalculatorForm.g:492:2: ( ruleFieldOption )
                    {
                    // InternalCalculatorForm.g:492:2: ( ruleFieldOption )
                    // InternalCalculatorForm.g:493:3: ruleFieldOption
                    {
                     before(grammarAccess.getFieldSelectChildAccess().getFieldOptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldOption();

                    state._fsp--;

                     after(grammarAccess.getFieldSelectChildAccess().getFieldOptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:498:2: ( ruleFieldOptionGroup )
                    {
                    // InternalCalculatorForm.g:498:2: ( ruleFieldOptionGroup )
                    // InternalCalculatorForm.g:499:3: ruleFieldOptionGroup
                    {
                     before(grammarAccess.getFieldSelectChildAccess().getFieldOptionGroupParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldOptionGroup();

                    state._fsp--;

                     after(grammarAccess.getFieldSelectChildAccess().getFieldOptionGroupParserRuleCall_1()); 

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
    // InternalCalculatorForm.g:508:1: rule__PageChild__Alternatives : ( ( ruleGroup ) | ( ruleField ) );
    public final void rule__PageChild__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:512:1: ( ( ruleGroup ) | ( ruleField ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==11||LA5_0==15||LA5_0==22||LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCalculatorForm.g:513:2: ( ruleGroup )
                    {
                    // InternalCalculatorForm.g:513:2: ( ruleGroup )
                    // InternalCalculatorForm.g:514:3: ruleGroup
                    {
                     before(grammarAccess.getPageChildAccess().getGroupParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGroup();

                    state._fsp--;

                     after(grammarAccess.getPageChildAccess().getGroupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:519:2: ( ruleField )
                    {
                    // InternalCalculatorForm.g:519:2: ( ruleField )
                    // InternalCalculatorForm.g:520:3: ruleField
                    {
                     before(grammarAccess.getPageChildAccess().getFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getPageChildAccess().getFieldParserRuleCall_1()); 

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


    // $ANTLR start "rule__FieldInput__Group__0"
    // InternalCalculatorForm.g:529:1: rule__FieldInput__Group__0 : rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 ;
    public final void rule__FieldInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:533:1: ( rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1 )
            // InternalCalculatorForm.g:534:2: rule__FieldInput__Group__0__Impl rule__FieldInput__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FieldInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:541:1: rule__FieldInput__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:545:1: ( ( 'field' ) )
            // InternalCalculatorForm.g:546:1: ( 'field' )
            {
            // InternalCalculatorForm.g:546:1: ( 'field' )
            // InternalCalculatorForm.g:547:2: 'field'
            {
             before(grammarAccess.getFieldInputAccess().getFieldKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getFieldKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:556:1: rule__FieldInput__Group__1 : rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 ;
    public final void rule__FieldInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:560:1: ( rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2 )
            // InternalCalculatorForm.g:561:2: rule__FieldInput__Group__1__Impl rule__FieldInput__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:568:1: rule__FieldInput__Group__1__Impl : ( ( rule__FieldInput__NameAssignment_1 ) ) ;
    public final void rule__FieldInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:572:1: ( ( ( rule__FieldInput__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:573:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:573:1: ( ( rule__FieldInput__NameAssignment_1 ) )
            // InternalCalculatorForm.g:574:2: ( rule__FieldInput__NameAssignment_1 )
            {
             before(grammarAccess.getFieldInputAccess().getNameAssignment_1()); 
            // InternalCalculatorForm.g:575:2: ( rule__FieldInput__NameAssignment_1 )
            // InternalCalculatorForm.g:575:3: rule__FieldInput__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldInputAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:583:1: rule__FieldInput__Group__2 : rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 ;
    public final void rule__FieldInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:587:1: ( rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3 )
            // InternalCalculatorForm.g:588:2: rule__FieldInput__Group__2__Impl rule__FieldInput__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:595:1: rule__FieldInput__Group__2__Impl : ( ( rule__FieldInput__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:599:1: ( ( ( rule__FieldInput__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:600:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:600:1: ( ( rule__FieldInput__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:601:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            {
             before(grammarAccess.getFieldInputAccess().getAutofocusAssignment_2()); 
            // InternalCalculatorForm.g:602:2: ( rule__FieldInput__AutofocusAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCalculatorForm.g:602:3: rule__FieldInput__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__AutofocusAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getAutofocusAssignment_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:610:1: rule__FieldInput__Group__3 : rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 ;
    public final void rule__FieldInput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:614:1: ( rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4 )
            // InternalCalculatorForm.g:615:2: rule__FieldInput__Group__3__Impl rule__FieldInput__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:622:1: rule__FieldInput__Group__3__Impl : ( ( rule__FieldInput__DisabledAssignment_3 )? ) ;
    public final void rule__FieldInput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:626:1: ( ( ( rule__FieldInput__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:627:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:627:1: ( ( rule__FieldInput__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:628:2: ( rule__FieldInput__DisabledAssignment_3 )?
            {
             before(grammarAccess.getFieldInputAccess().getDisabledAssignment_3()); 
            // InternalCalculatorForm.g:629:2: ( rule__FieldInput__DisabledAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCalculatorForm.g:629:3: rule__FieldInput__DisabledAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__DisabledAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getDisabledAssignment_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:637:1: rule__FieldInput__Group__4 : rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 ;
    public final void rule__FieldInput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:641:1: ( rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5 )
            // InternalCalculatorForm.g:642:2: rule__FieldInput__Group__4__Impl rule__FieldInput__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:649:1: rule__FieldInput__Group__4__Impl : ( ( rule__FieldInput__Group_4__0 )? ) ;
    public final void rule__FieldInput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:653:1: ( ( ( rule__FieldInput__Group_4__0 )? ) )
            // InternalCalculatorForm.g:654:1: ( ( rule__FieldInput__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:654:1: ( ( rule__FieldInput__Group_4__0 )? )
            // InternalCalculatorForm.g:655:2: ( rule__FieldInput__Group_4__0 )?
            {
             before(grammarAccess.getFieldInputAccess().getGroup_4()); 
            // InternalCalculatorForm.g:656:2: ( rule__FieldInput__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCalculatorForm.g:656:3: rule__FieldInput__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:664:1: rule__FieldInput__Group__5 : rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 ;
    public final void rule__FieldInput__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:668:1: ( rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6 )
            // InternalCalculatorForm.g:669:2: rule__FieldInput__Group__5__Impl rule__FieldInput__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__6();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:676:1: rule__FieldInput__Group__5__Impl : ( ( rule__FieldInput__Group_5__0 )? ) ;
    public final void rule__FieldInput__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:680:1: ( ( ( rule__FieldInput__Group_5__0 )? ) )
            // InternalCalculatorForm.g:681:1: ( ( rule__FieldInput__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:681:1: ( ( rule__FieldInput__Group_5__0 )? )
            // InternalCalculatorForm.g:682:2: ( rule__FieldInput__Group_5__0 )?
            {
             before(grammarAccess.getFieldInputAccess().getGroup_5()); 
            // InternalCalculatorForm.g:683:2: ( rule__FieldInput__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCalculatorForm.g:683:3: rule__FieldInput__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:691:1: rule__FieldInput__Group__6 : rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 ;
    public final void rule__FieldInput__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:695:1: ( rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7 )
            // InternalCalculatorForm.g:696:2: rule__FieldInput__Group__6__Impl rule__FieldInput__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__7();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:703:1: rule__FieldInput__Group__6__Impl : ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) ;
    public final void rule__FieldInput__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:707:1: ( ( ( rule__FieldInput__NotdisplayedAssignment_6 )? ) )
            // InternalCalculatorForm.g:708:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            {
            // InternalCalculatorForm.g:708:1: ( ( rule__FieldInput__NotdisplayedAssignment_6 )? )
            // InternalCalculatorForm.g:709:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            {
             before(grammarAccess.getFieldInputAccess().getNotdisplayedAssignment_6()); 
            // InternalCalculatorForm.g:710:2: ( rule__FieldInput__NotdisplayedAssignment_6 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCalculatorForm.g:710:3: rule__FieldInput__NotdisplayedAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__NotdisplayedAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getNotdisplayedAssignment_6()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:718:1: rule__FieldInput__Group__7 : rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 ;
    public final void rule__FieldInput__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:722:1: ( rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8 )
            // InternalCalculatorForm.g:723:2: rule__FieldInput__Group__7__Impl rule__FieldInput__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__8();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:730:1: rule__FieldInput__Group__7__Impl : ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) ;
    public final void rule__FieldInput__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:734:1: ( ( ( rule__FieldInput__ReadonlyAssignment_7 )? ) )
            // InternalCalculatorForm.g:735:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            {
            // InternalCalculatorForm.g:735:1: ( ( rule__FieldInput__ReadonlyAssignment_7 )? )
            // InternalCalculatorForm.g:736:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            {
             before(grammarAccess.getFieldInputAccess().getReadonlyAssignment_7()); 
            // InternalCalculatorForm.g:737:2: ( rule__FieldInput__ReadonlyAssignment_7 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:737:3: rule__FieldInput__ReadonlyAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__ReadonlyAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getReadonlyAssignment_7()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:745:1: rule__FieldInput__Group__8 : rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 ;
    public final void rule__FieldInput__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:749:1: ( rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9 )
            // InternalCalculatorForm.g:750:2: rule__FieldInput__Group__8__Impl rule__FieldInput__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__FieldInput__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__9();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:757:1: rule__FieldInput__Group__8__Impl : ( ( rule__FieldInput__RequiredAssignment_8 )? ) ;
    public final void rule__FieldInput__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:761:1: ( ( ( rule__FieldInput__RequiredAssignment_8 )? ) )
            // InternalCalculatorForm.g:762:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            {
            // InternalCalculatorForm.g:762:1: ( ( rule__FieldInput__RequiredAssignment_8 )? )
            // InternalCalculatorForm.g:763:2: ( rule__FieldInput__RequiredAssignment_8 )?
            {
             before(grammarAccess.getFieldInputAccess().getRequiredAssignment_8()); 
            // InternalCalculatorForm.g:764:2: ( rule__FieldInput__RequiredAssignment_8 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCalculatorForm.g:764:3: rule__FieldInput__RequiredAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__RequiredAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getRequiredAssignment_8()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:772:1: rule__FieldInput__Group__9 : rule__FieldInput__Group__9__Impl ;
    public final void rule__FieldInput__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:776:1: ( rule__FieldInput__Group__9__Impl )
            // InternalCalculatorForm.g:777:2: rule__FieldInput__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:783:1: rule__FieldInput__Group__9__Impl : ( ( rule__FieldInput__Group_9__0 )? ) ;
    public final void rule__FieldInput__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:787:1: ( ( ( rule__FieldInput__Group_9__0 )? ) )
            // InternalCalculatorForm.g:788:1: ( ( rule__FieldInput__Group_9__0 )? )
            {
            // InternalCalculatorForm.g:788:1: ( ( rule__FieldInput__Group_9__0 )? )
            // InternalCalculatorForm.g:789:2: ( rule__FieldInput__Group_9__0 )?
            {
             before(grammarAccess.getFieldInputAccess().getGroup_9()); 
            // InternalCalculatorForm.g:790:2: ( rule__FieldInput__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCalculatorForm.g:790:3: rule__FieldInput__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldInput__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldInputAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:799:1: rule__FieldInput__Group_4__0 : rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 ;
    public final void rule__FieldInput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:803:1: ( rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1 )
            // InternalCalculatorForm.g:804:2: rule__FieldInput__Group_4__0__Impl rule__FieldInput__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldInput__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:811:1: rule__FieldInput__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldInput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:815:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:816:1: ( 'form' )
            {
            // InternalCalculatorForm.g:816:1: ( 'form' )
            // InternalCalculatorForm.g:817:2: 'form'
            {
             before(grammarAccess.getFieldInputAccess().getFormKeyword_4_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getFormKeyword_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:826:1: rule__FieldInput__Group_4__1 : rule__FieldInput__Group_4__1__Impl ;
    public final void rule__FieldInput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:830:1: ( rule__FieldInput__Group_4__1__Impl )
            // InternalCalculatorForm.g:831:2: rule__FieldInput__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:837:1: rule__FieldInput__Group_4__1__Impl : ( ( rule__FieldInput__FormAssignment_4_1 ) ) ;
    public final void rule__FieldInput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:841:1: ( ( ( rule__FieldInput__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:842:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:842:1: ( ( rule__FieldInput__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:843:2: ( rule__FieldInput__FormAssignment_4_1 )
            {
             before(grammarAccess.getFieldInputAccess().getFormAssignment_4_1()); 
            // InternalCalculatorForm.g:844:2: ( rule__FieldInput__FormAssignment_4_1 )
            // InternalCalculatorForm.g:844:3: rule__FieldInput__FormAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__FormAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldInputAccess().getFormAssignment_4_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:853:1: rule__FieldInput__Group_5__0 : rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 ;
    public final void rule__FieldInput__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:857:1: ( rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1 )
            // InternalCalculatorForm.g:858:2: rule__FieldInput__Group_5__0__Impl rule__FieldInput__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldInput__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:865:1: rule__FieldInput__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldInput__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:869:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:870:1: ( 'label' )
            {
            // InternalCalculatorForm.g:870:1: ( 'label' )
            // InternalCalculatorForm.g:871:2: 'label'
            {
             before(grammarAccess.getFieldInputAccess().getLabelKeyword_5_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getLabelKeyword_5_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:880:1: rule__FieldInput__Group_5__1 : rule__FieldInput__Group_5__1__Impl ;
    public final void rule__FieldInput__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:884:1: ( rule__FieldInput__Group_5__1__Impl )
            // InternalCalculatorForm.g:885:2: rule__FieldInput__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:891:1: rule__FieldInput__Group_5__1__Impl : ( ( rule__FieldInput__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldInput__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:895:1: ( ( ( rule__FieldInput__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:896:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:896:1: ( ( rule__FieldInput__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:897:2: ( rule__FieldInput__LabelAssignment_5_1 )
            {
             before(grammarAccess.getFieldInputAccess().getLabelAssignment_5_1()); 
            // InternalCalculatorForm.g:898:2: ( rule__FieldInput__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:898:3: rule__FieldInput__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__LabelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldInputAccess().getLabelAssignment_5_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:907:1: rule__FieldInput__Group_9__0 : rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 ;
    public final void rule__FieldInput__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:911:1: ( rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1 )
            // InternalCalculatorForm.g:912:2: rule__FieldInput__Group_9__0__Impl rule__FieldInput__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldInput__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_9__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:919:1: rule__FieldInput__Group_9__0__Impl : ( 'value' ) ;
    public final void rule__FieldInput__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:923:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:924:1: ( 'value' )
            {
            // InternalCalculatorForm.g:924:1: ( 'value' )
            // InternalCalculatorForm.g:925:2: 'value'
            {
             before(grammarAccess.getFieldInputAccess().getValueKeyword_9_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getValueKeyword_9_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:934:1: rule__FieldInput__Group_9__1 : rule__FieldInput__Group_9__1__Impl ;
    public final void rule__FieldInput__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:938:1: ( rule__FieldInput__Group_9__1__Impl )
            // InternalCalculatorForm.g:939:2: rule__FieldInput__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__Group_9__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:945:1: rule__FieldInput__Group_9__1__Impl : ( ( rule__FieldInput__ValueAssignment_9_1 ) ) ;
    public final void rule__FieldInput__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:949:1: ( ( ( rule__FieldInput__ValueAssignment_9_1 ) ) )
            // InternalCalculatorForm.g:950:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            {
            // InternalCalculatorForm.g:950:1: ( ( rule__FieldInput__ValueAssignment_9_1 ) )
            // InternalCalculatorForm.g:951:2: ( rule__FieldInput__ValueAssignment_9_1 )
            {
             before(grammarAccess.getFieldInputAccess().getValueAssignment_9_1()); 
            // InternalCalculatorForm.g:952:2: ( rule__FieldInput__ValueAssignment_9_1 )
            // InternalCalculatorForm.g:952:3: rule__FieldInput__ValueAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldInput__ValueAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldInputAccess().getValueAssignment_9_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:961:1: rule__FieldSelect__Group__0 : rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 ;
    public final void rule__FieldSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:965:1: ( rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1 )
            // InternalCalculatorForm.g:966:2: rule__FieldSelect__Group__0__Impl rule__FieldSelect__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FieldSelect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:973:1: rule__FieldSelect__Group__0__Impl : ( 'dropdown' ) ;
    public final void rule__FieldSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:977:1: ( ( 'dropdown' ) )
            // InternalCalculatorForm.g:978:1: ( 'dropdown' )
            {
            // InternalCalculatorForm.g:978:1: ( 'dropdown' )
            // InternalCalculatorForm.g:979:2: 'dropdown'
            {
             before(grammarAccess.getFieldSelectAccess().getDropdownKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getDropdownKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:988:1: rule__FieldSelect__Group__1 : rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 ;
    public final void rule__FieldSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:992:1: ( rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2 )
            // InternalCalculatorForm.g:993:2: rule__FieldSelect__Group__1__Impl rule__FieldSelect__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1000:1: rule__FieldSelect__Group__1__Impl : ( ( rule__FieldSelect__NameAssignment_1 ) ) ;
    public final void rule__FieldSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1004:1: ( ( ( rule__FieldSelect__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1005:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1005:1: ( ( rule__FieldSelect__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1006:2: ( rule__FieldSelect__NameAssignment_1 )
            {
             before(grammarAccess.getFieldSelectAccess().getNameAssignment_1()); 
            // InternalCalculatorForm.g:1007:2: ( rule__FieldSelect__NameAssignment_1 )
            // InternalCalculatorForm.g:1007:3: rule__FieldSelect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSelectAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1015:1: rule__FieldSelect__Group__2 : rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 ;
    public final void rule__FieldSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1019:1: ( rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3 )
            // InternalCalculatorForm.g:1020:2: rule__FieldSelect__Group__2__Impl rule__FieldSelect__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1027:1: rule__FieldSelect__Group__2__Impl : ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1031:1: ( ( ( rule__FieldSelect__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:1032:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1032:1: ( ( rule__FieldSelect__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:1033:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            {
             before(grammarAccess.getFieldSelectAccess().getAutofocusAssignment_2()); 
            // InternalCalculatorForm.g:1034:2: ( rule__FieldSelect__AutofocusAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCalculatorForm.g:1034:3: rule__FieldSelect__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__AutofocusAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSelectAccess().getAutofocusAssignment_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1042:1: rule__FieldSelect__Group__3 : rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 ;
    public final void rule__FieldSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1046:1: ( rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4 )
            // InternalCalculatorForm.g:1047:2: rule__FieldSelect__Group__3__Impl rule__FieldSelect__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1054:1: rule__FieldSelect__Group__3__Impl : ( ( rule__FieldSelect__DisabledAssignment_3 )? ) ;
    public final void rule__FieldSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1058:1: ( ( ( rule__FieldSelect__DisabledAssignment_3 )? ) )
            // InternalCalculatorForm.g:1059:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1059:1: ( ( rule__FieldSelect__DisabledAssignment_3 )? )
            // InternalCalculatorForm.g:1060:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            {
             before(grammarAccess.getFieldSelectAccess().getDisabledAssignment_3()); 
            // InternalCalculatorForm.g:1061:2: ( rule__FieldSelect__DisabledAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCalculatorForm.g:1061:3: rule__FieldSelect__DisabledAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__DisabledAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSelectAccess().getDisabledAssignment_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1069:1: rule__FieldSelect__Group__4 : rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 ;
    public final void rule__FieldSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1073:1: ( rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5 )
            // InternalCalculatorForm.g:1074:2: rule__FieldSelect__Group__4__Impl rule__FieldSelect__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1081:1: rule__FieldSelect__Group__4__Impl : ( ( rule__FieldSelect__Group_4__0 )? ) ;
    public final void rule__FieldSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1085:1: ( ( ( rule__FieldSelect__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1086:1: ( ( rule__FieldSelect__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1086:1: ( ( rule__FieldSelect__Group_4__0 )? )
            // InternalCalculatorForm.g:1087:2: ( rule__FieldSelect__Group_4__0 )?
            {
             before(grammarAccess.getFieldSelectAccess().getGroup_4()); 
            // InternalCalculatorForm.g:1088:2: ( rule__FieldSelect__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCalculatorForm.g:1088:3: rule__FieldSelect__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSelectAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1096:1: rule__FieldSelect__Group__5 : rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 ;
    public final void rule__FieldSelect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1100:1: ( rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6 )
            // InternalCalculatorForm.g:1101:2: rule__FieldSelect__Group__5__Impl rule__FieldSelect__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__6();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1108:1: rule__FieldSelect__Group__5__Impl : ( ( rule__FieldSelect__Group_5__0 )? ) ;
    public final void rule__FieldSelect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1112:1: ( ( ( rule__FieldSelect__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1113:1: ( ( rule__FieldSelect__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1113:1: ( ( rule__FieldSelect__Group_5__0 )? )
            // InternalCalculatorForm.g:1114:2: ( rule__FieldSelect__Group_5__0 )?
            {
             before(grammarAccess.getFieldSelectAccess().getGroup_5()); 
            // InternalCalculatorForm.g:1115:2: ( rule__FieldSelect__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCalculatorForm.g:1115:3: rule__FieldSelect__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSelectAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1123:1: rule__FieldSelect__Group__6 : rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 ;
    public final void rule__FieldSelect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1127:1: ( rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7 )
            // InternalCalculatorForm.g:1128:2: rule__FieldSelect__Group__6__Impl rule__FieldSelect__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__7();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1135:1: rule__FieldSelect__Group__6__Impl : ( ( rule__FieldSelect__MultipleAssignment_6 )? ) ;
    public final void rule__FieldSelect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1139:1: ( ( ( rule__FieldSelect__MultipleAssignment_6 )? ) )
            // InternalCalculatorForm.g:1140:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            {
            // InternalCalculatorForm.g:1140:1: ( ( rule__FieldSelect__MultipleAssignment_6 )? )
            // InternalCalculatorForm.g:1141:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            {
             before(grammarAccess.getFieldSelectAccess().getMultipleAssignment_6()); 
            // InternalCalculatorForm.g:1142:2: ( rule__FieldSelect__MultipleAssignment_6 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCalculatorForm.g:1142:3: rule__FieldSelect__MultipleAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__MultipleAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSelectAccess().getMultipleAssignment_6()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1150:1: rule__FieldSelect__Group__7 : rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 ;
    public final void rule__FieldSelect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1154:1: ( rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8 )
            // InternalCalculatorForm.g:1155:2: rule__FieldSelect__Group__7__Impl rule__FieldSelect__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__8();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1162:1: rule__FieldSelect__Group__7__Impl : ( ( rule__FieldSelect__RequiredAssignment_7 )? ) ;
    public final void rule__FieldSelect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1166:1: ( ( ( rule__FieldSelect__RequiredAssignment_7 )? ) )
            // InternalCalculatorForm.g:1167:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            {
            // InternalCalculatorForm.g:1167:1: ( ( rule__FieldSelect__RequiredAssignment_7 )? )
            // InternalCalculatorForm.g:1168:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            {
             before(grammarAccess.getFieldSelectAccess().getRequiredAssignment_7()); 
            // InternalCalculatorForm.g:1169:2: ( rule__FieldSelect__RequiredAssignment_7 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCalculatorForm.g:1169:3: rule__FieldSelect__RequiredAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__RequiredAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSelectAccess().getRequiredAssignment_7()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1177:1: rule__FieldSelect__Group__8 : rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 ;
    public final void rule__FieldSelect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1181:1: ( rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9 )
            // InternalCalculatorForm.g:1182:2: rule__FieldSelect__Group__8__Impl rule__FieldSelect__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__FieldSelect__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__9();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1189:1: rule__FieldSelect__Group__8__Impl : ( ( rule__FieldSelect__Group_8__0 )? ) ;
    public final void rule__FieldSelect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1193:1: ( ( ( rule__FieldSelect__Group_8__0 )? ) )
            // InternalCalculatorForm.g:1194:1: ( ( rule__FieldSelect__Group_8__0 )? )
            {
            // InternalCalculatorForm.g:1194:1: ( ( rule__FieldSelect__Group_8__0 )? )
            // InternalCalculatorForm.g:1195:2: ( rule__FieldSelect__Group_8__0 )?
            {
             before(grammarAccess.getFieldSelectAccess().getGroup_8()); 
            // InternalCalculatorForm.g:1196:2: ( rule__FieldSelect__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCalculatorForm.g:1196:3: rule__FieldSelect__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldSelect__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldSelectAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1204:1: rule__FieldSelect__Group__9 : rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 ;
    public final void rule__FieldSelect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1208:1: ( rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10 )
            // InternalCalculatorForm.g:1209:2: rule__FieldSelect__Group__9__Impl rule__FieldSelect__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__FieldSelect__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__10();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1216:1: rule__FieldSelect__Group__9__Impl : ( '{' ) ;
    public final void rule__FieldSelect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1220:1: ( ( '{' ) )
            // InternalCalculatorForm.g:1221:1: ( '{' )
            {
            // InternalCalculatorForm.g:1221:1: ( '{' )
            // InternalCalculatorForm.g:1222:2: '{'
            {
             before(grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1231:1: rule__FieldSelect__Group__10 : rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 ;
    public final void rule__FieldSelect__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1235:1: ( rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11 )
            // InternalCalculatorForm.g:1236:2: rule__FieldSelect__Group__10__Impl rule__FieldSelect__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__FieldSelect__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__11();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1243:1: rule__FieldSelect__Group__10__Impl : ( ( rule__FieldSelect__ChildsAssignment_10 )* ) ;
    public final void rule__FieldSelect__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1247:1: ( ( ( rule__FieldSelect__ChildsAssignment_10 )* ) )
            // InternalCalculatorForm.g:1248:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            {
            // InternalCalculatorForm.g:1248:1: ( ( rule__FieldSelect__ChildsAssignment_10 )* )
            // InternalCalculatorForm.g:1249:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            {
             before(grammarAccess.getFieldSelectAccess().getChildsAssignment_10()); 
            // InternalCalculatorForm.g:1250:2: ( rule__FieldSelect__ChildsAssignment_10 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19||LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCalculatorForm.g:1250:3: rule__FieldSelect__ChildsAssignment_10
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__FieldSelect__ChildsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFieldSelectAccess().getChildsAssignment_10()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1258:1: rule__FieldSelect__Group__11 : rule__FieldSelect__Group__11__Impl ;
    public final void rule__FieldSelect__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1262:1: ( rule__FieldSelect__Group__11__Impl )
            // InternalCalculatorForm.g:1263:2: rule__FieldSelect__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1269:1: rule__FieldSelect__Group__11__Impl : ( '}' ) ;
    public final void rule__FieldSelect__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1273:1: ( ( '}' ) )
            // InternalCalculatorForm.g:1274:1: ( '}' )
            {
            // InternalCalculatorForm.g:1274:1: ( '}' )
            // InternalCalculatorForm.g:1275:2: '}'
            {
             before(grammarAccess.getFieldSelectAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1285:1: rule__FieldSelect__Group_4__0 : rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 ;
    public final void rule__FieldSelect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1289:1: ( rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1 )
            // InternalCalculatorForm.g:1290:2: rule__FieldSelect__Group_4__0__Impl rule__FieldSelect__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldSelect__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1297:1: rule__FieldSelect__Group_4__0__Impl : ( 'form' ) ;
    public final void rule__FieldSelect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1301:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:1302:1: ( 'form' )
            {
            // InternalCalculatorForm.g:1302:1: ( 'form' )
            // InternalCalculatorForm.g:1303:2: 'form'
            {
             before(grammarAccess.getFieldSelectAccess().getFormKeyword_4_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getFormKeyword_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1312:1: rule__FieldSelect__Group_4__1 : rule__FieldSelect__Group_4__1__Impl ;
    public final void rule__FieldSelect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1316:1: ( rule__FieldSelect__Group_4__1__Impl )
            // InternalCalculatorForm.g:1317:2: rule__FieldSelect__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1323:1: rule__FieldSelect__Group_4__1__Impl : ( ( rule__FieldSelect__FormAssignment_4_1 ) ) ;
    public final void rule__FieldSelect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1327:1: ( ( ( rule__FieldSelect__FormAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1328:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1328:1: ( ( rule__FieldSelect__FormAssignment_4_1 ) )
            // InternalCalculatorForm.g:1329:2: ( rule__FieldSelect__FormAssignment_4_1 )
            {
             before(grammarAccess.getFieldSelectAccess().getFormAssignment_4_1()); 
            // InternalCalculatorForm.g:1330:2: ( rule__FieldSelect__FormAssignment_4_1 )
            // InternalCalculatorForm.g:1330:3: rule__FieldSelect__FormAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__FormAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSelectAccess().getFormAssignment_4_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1339:1: rule__FieldSelect__Group_5__0 : rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 ;
    public final void rule__FieldSelect__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1343:1: ( rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1 )
            // InternalCalculatorForm.g:1344:2: rule__FieldSelect__Group_5__0__Impl rule__FieldSelect__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldSelect__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1351:1: rule__FieldSelect__Group_5__0__Impl : ( 'label' ) ;
    public final void rule__FieldSelect__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1355:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1356:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1356:1: ( 'label' )
            // InternalCalculatorForm.g:1357:2: 'label'
            {
             before(grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getLabelKeyword_5_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1366:1: rule__FieldSelect__Group_5__1 : rule__FieldSelect__Group_5__1__Impl ;
    public final void rule__FieldSelect__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1370:1: ( rule__FieldSelect__Group_5__1__Impl )
            // InternalCalculatorForm.g:1371:2: rule__FieldSelect__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1377:1: rule__FieldSelect__Group_5__1__Impl : ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) ;
    public final void rule__FieldSelect__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1381:1: ( ( ( rule__FieldSelect__LabelAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:1382:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:1382:1: ( ( rule__FieldSelect__LabelAssignment_5_1 ) )
            // InternalCalculatorForm.g:1383:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            {
             before(grammarAccess.getFieldSelectAccess().getLabelAssignment_5_1()); 
            // InternalCalculatorForm.g:1384:2: ( rule__FieldSelect__LabelAssignment_5_1 )
            // InternalCalculatorForm.g:1384:3: rule__FieldSelect__LabelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__LabelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSelectAccess().getLabelAssignment_5_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1393:1: rule__FieldSelect__Group_8__0 : rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 ;
    public final void rule__FieldSelect__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1397:1: ( rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1 )
            // InternalCalculatorForm.g:1398:2: rule__FieldSelect__Group_8__0__Impl rule__FieldSelect__Group_8__1
            {
            pushFollow(FOLLOW_10);
            rule__FieldSelect__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_8__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1405:1: rule__FieldSelect__Group_8__0__Impl : ( 'size' ) ;
    public final void rule__FieldSelect__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1409:1: ( ( 'size' ) )
            // InternalCalculatorForm.g:1410:1: ( 'size' )
            {
            // InternalCalculatorForm.g:1410:1: ( 'size' )
            // InternalCalculatorForm.g:1411:2: 'size'
            {
             before(grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getSizeKeyword_8_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1420:1: rule__FieldSelect__Group_8__1 : rule__FieldSelect__Group_8__1__Impl ;
    public final void rule__FieldSelect__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1424:1: ( rule__FieldSelect__Group_8__1__Impl )
            // InternalCalculatorForm.g:1425:2: rule__FieldSelect__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__Group_8__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1431:1: rule__FieldSelect__Group_8__1__Impl : ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) ;
    public final void rule__FieldSelect__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1435:1: ( ( ( rule__FieldSelect__SizeAssignment_8_1 ) ) )
            // InternalCalculatorForm.g:1436:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            {
            // InternalCalculatorForm.g:1436:1: ( ( rule__FieldSelect__SizeAssignment_8_1 ) )
            // InternalCalculatorForm.g:1437:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            {
             before(grammarAccess.getFieldSelectAccess().getSizeAssignment_8_1()); 
            // InternalCalculatorForm.g:1438:2: ( rule__FieldSelect__SizeAssignment_8_1 )
            // InternalCalculatorForm.g:1438:3: rule__FieldSelect__SizeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldSelect__SizeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldSelectAccess().getSizeAssignment_8_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1447:1: rule__FieldOption__Group__0 : rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 ;
    public final void rule__FieldOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1451:1: ( rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1 )
            // InternalCalculatorForm.g:1452:2: rule__FieldOption__Group__0__Impl rule__FieldOption__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1459:1: rule__FieldOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1463:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:1464:1: ( 'option' )
            {
            // InternalCalculatorForm.g:1464:1: ( 'option' )
            // InternalCalculatorForm.g:1465:2: 'option'
            {
             before(grammarAccess.getFieldOptionAccess().getOptionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getOptionKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1474:1: rule__FieldOption__Group__1 : rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 ;
    public final void rule__FieldOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1478:1: ( rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2 )
            // InternalCalculatorForm.g:1479:2: rule__FieldOption__Group__1__Impl rule__FieldOption__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FieldOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1486:1: rule__FieldOption__Group__1__Impl : ( ( rule__FieldOption__TextAssignment_1 ) ) ;
    public final void rule__FieldOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1490:1: ( ( ( rule__FieldOption__TextAssignment_1 ) ) )
            // InternalCalculatorForm.g:1491:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1491:1: ( ( rule__FieldOption__TextAssignment_1 ) )
            // InternalCalculatorForm.g:1492:2: ( rule__FieldOption__TextAssignment_1 )
            {
             before(grammarAccess.getFieldOptionAccess().getTextAssignment_1()); 
            // InternalCalculatorForm.g:1493:2: ( rule__FieldOption__TextAssignment_1 )
            // InternalCalculatorForm.g:1493:3: rule__FieldOption__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldOptionAccess().getTextAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1501:1: rule__FieldOption__Group__2 : rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 ;
    public final void rule__FieldOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1505:1: ( rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3 )
            // InternalCalculatorForm.g:1506:2: rule__FieldOption__Group__2__Impl rule__FieldOption__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FieldOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1513:1: rule__FieldOption__Group__2__Impl : ( ( rule__FieldOption__DisabledAssignment_2 )? ) ;
    public final void rule__FieldOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1517:1: ( ( ( rule__FieldOption__DisabledAssignment_2 )? ) )
            // InternalCalculatorForm.g:1518:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            {
            // InternalCalculatorForm.g:1518:1: ( ( rule__FieldOption__DisabledAssignment_2 )? )
            // InternalCalculatorForm.g:1519:2: ( rule__FieldOption__DisabledAssignment_2 )?
            {
             before(grammarAccess.getFieldOptionAccess().getDisabledAssignment_2()); 
            // InternalCalculatorForm.g:1520:2: ( rule__FieldOption__DisabledAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCalculatorForm.g:1520:3: rule__FieldOption__DisabledAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__DisabledAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldOptionAccess().getDisabledAssignment_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1528:1: rule__FieldOption__Group__3 : rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 ;
    public final void rule__FieldOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1532:1: ( rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4 )
            // InternalCalculatorForm.g:1533:2: rule__FieldOption__Group__3__Impl rule__FieldOption__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FieldOption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1540:1: rule__FieldOption__Group__3__Impl : ( ( rule__FieldOption__SelectedAssignment_3 )? ) ;
    public final void rule__FieldOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1544:1: ( ( ( rule__FieldOption__SelectedAssignment_3 )? ) )
            // InternalCalculatorForm.g:1545:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:1545:1: ( ( rule__FieldOption__SelectedAssignment_3 )? )
            // InternalCalculatorForm.g:1546:2: ( rule__FieldOption__SelectedAssignment_3 )?
            {
             before(grammarAccess.getFieldOptionAccess().getSelectedAssignment_3()); 
            // InternalCalculatorForm.g:1547:2: ( rule__FieldOption__SelectedAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCalculatorForm.g:1547:3: rule__FieldOption__SelectedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__SelectedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldOptionAccess().getSelectedAssignment_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1555:1: rule__FieldOption__Group__4 : rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 ;
    public final void rule__FieldOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1559:1: ( rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5 )
            // InternalCalculatorForm.g:1560:2: rule__FieldOption__Group__4__Impl rule__FieldOption__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__FieldOption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1567:1: rule__FieldOption__Group__4__Impl : ( ( rule__FieldOption__Group_4__0 )? ) ;
    public final void rule__FieldOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1571:1: ( ( ( rule__FieldOption__Group_4__0 )? ) )
            // InternalCalculatorForm.g:1572:1: ( ( rule__FieldOption__Group_4__0 )? )
            {
            // InternalCalculatorForm.g:1572:1: ( ( rule__FieldOption__Group_4__0 )? )
            // InternalCalculatorForm.g:1573:2: ( rule__FieldOption__Group_4__0 )?
            {
             before(grammarAccess.getFieldOptionAccess().getGroup_4()); 
            // InternalCalculatorForm.g:1574:2: ( rule__FieldOption__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCalculatorForm.g:1574:3: rule__FieldOption__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldOptionAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1582:1: rule__FieldOption__Group__5 : rule__FieldOption__Group__5__Impl ;
    public final void rule__FieldOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1586:1: ( rule__FieldOption__Group__5__Impl )
            // InternalCalculatorForm.g:1587:2: rule__FieldOption__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1593:1: rule__FieldOption__Group__5__Impl : ( ( rule__FieldOption__Group_5__0 )? ) ;
    public final void rule__FieldOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1597:1: ( ( ( rule__FieldOption__Group_5__0 )? ) )
            // InternalCalculatorForm.g:1598:1: ( ( rule__FieldOption__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:1598:1: ( ( rule__FieldOption__Group_5__0 )? )
            // InternalCalculatorForm.g:1599:2: ( rule__FieldOption__Group_5__0 )?
            {
             before(grammarAccess.getFieldOptionAccess().getGroup_5()); 
            // InternalCalculatorForm.g:1600:2: ( rule__FieldOption__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCalculatorForm.g:1600:3: rule__FieldOption__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOption__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldOptionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1609:1: rule__FieldOption__Group_4__0 : rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 ;
    public final void rule__FieldOption__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1613:1: ( rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1 )
            // InternalCalculatorForm.g:1614:2: rule__FieldOption__Group_4__0__Impl rule__FieldOption__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldOption__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1621:1: rule__FieldOption__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__FieldOption__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1625:1: ( ( 'text' ) )
            // InternalCalculatorForm.g:1626:1: ( 'text' )
            {
            // InternalCalculatorForm.g:1626:1: ( 'text' )
            // InternalCalculatorForm.g:1627:2: 'text'
            {
             before(grammarAccess.getFieldOptionAccess().getTextKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getTextKeyword_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1636:1: rule__FieldOption__Group_4__1 : rule__FieldOption__Group_4__1__Impl ;
    public final void rule__FieldOption__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1640:1: ( rule__FieldOption__Group_4__1__Impl )
            // InternalCalculatorForm.g:1641:2: rule__FieldOption__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1647:1: rule__FieldOption__Group_4__1__Impl : ( ( rule__FieldOption__TextAssignment_4_1 ) ) ;
    public final void rule__FieldOption__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1651:1: ( ( ( rule__FieldOption__TextAssignment_4_1 ) ) )
            // InternalCalculatorForm.g:1652:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            {
            // InternalCalculatorForm.g:1652:1: ( ( rule__FieldOption__TextAssignment_4_1 ) )
            // InternalCalculatorForm.g:1653:2: ( rule__FieldOption__TextAssignment_4_1 )
            {
             before(grammarAccess.getFieldOptionAccess().getTextAssignment_4_1()); 
            // InternalCalculatorForm.g:1654:2: ( rule__FieldOption__TextAssignment_4_1 )
            // InternalCalculatorForm.g:1654:3: rule__FieldOption__TextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldOptionAccess().getTextAssignment_4_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1663:1: rule__FieldOption__Group_5__0 : rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 ;
    public final void rule__FieldOption__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1667:1: ( rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1 )
            // InternalCalculatorForm.g:1668:2: rule__FieldOption__Group_5__0__Impl rule__FieldOption__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldOption__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1675:1: rule__FieldOption__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__FieldOption__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1679:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:1680:1: ( 'value' )
            {
            // InternalCalculatorForm.g:1680:1: ( 'value' )
            // InternalCalculatorForm.g:1681:2: 'value'
            {
             before(grammarAccess.getFieldOptionAccess().getValueKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getValueKeyword_5_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1690:1: rule__FieldOption__Group_5__1 : rule__FieldOption__Group_5__1__Impl ;
    public final void rule__FieldOption__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1694:1: ( rule__FieldOption__Group_5__1__Impl )
            // InternalCalculatorForm.g:1695:2: rule__FieldOption__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1701:1: rule__FieldOption__Group_5__1__Impl : ( ( rule__FieldOption__ValueAssignment_5_1 ) ) ;
    public final void rule__FieldOption__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1705:1: ( ( ( rule__FieldOption__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:1706:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:1706:1: ( ( rule__FieldOption__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:1707:2: ( rule__FieldOption__ValueAssignment_5_1 )
            {
             before(grammarAccess.getFieldOptionAccess().getValueAssignment_5_1()); 
            // InternalCalculatorForm.g:1708:2: ( rule__FieldOption__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:1708:3: rule__FieldOption__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOption__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldOptionAccess().getValueAssignment_5_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1717:1: rule__FieldOptionGroup__Group__0 : rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 ;
    public final void rule__FieldOptionGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1721:1: ( rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1 )
            // InternalCalculatorForm.g:1722:2: rule__FieldOptionGroup__Group__0__Impl rule__FieldOptionGroup__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FieldOptionGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1729:1: rule__FieldOptionGroup__Group__0__Impl : ( 'option-group' ) ;
    public final void rule__FieldOptionGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1733:1: ( ( 'option-group' ) )
            // InternalCalculatorForm.g:1734:1: ( 'option-group' )
            {
            // InternalCalculatorForm.g:1734:1: ( 'option-group' )
            // InternalCalculatorForm.g:1735:2: 'option-group'
            {
             before(grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldOptionGroupAccess().getOptionGroupKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1744:1: rule__FieldOptionGroup__Group__1 : rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 ;
    public final void rule__FieldOptionGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1748:1: ( rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2 )
            // InternalCalculatorForm.g:1749:2: rule__FieldOptionGroup__Group__1__Impl rule__FieldOptionGroup__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__FieldOptionGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1756:1: rule__FieldOptionGroup__Group__1__Impl : ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) ;
    public final void rule__FieldOptionGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1760:1: ( ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? ) )
            // InternalCalculatorForm.g:1761:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            {
            // InternalCalculatorForm.g:1761:1: ( ( rule__FieldOptionGroup__DisabledAssignment_1 )? )
            // InternalCalculatorForm.g:1762:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            {
             before(grammarAccess.getFieldOptionGroupAccess().getDisabledAssignment_1()); 
            // InternalCalculatorForm.g:1763:2: ( rule__FieldOptionGroup__DisabledAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCalculatorForm.g:1763:3: rule__FieldOptionGroup__DisabledAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOptionGroup__DisabledAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldOptionGroupAccess().getDisabledAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1771:1: rule__FieldOptionGroup__Group__2 : rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 ;
    public final void rule__FieldOptionGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1775:1: ( rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3 )
            // InternalCalculatorForm.g:1776:2: rule__FieldOptionGroup__Group__2__Impl rule__FieldOptionGroup__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__FieldOptionGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1783:1: rule__FieldOptionGroup__Group__2__Impl : ( ( rule__FieldOptionGroup__Group_2__0 )? ) ;
    public final void rule__FieldOptionGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1787:1: ( ( ( rule__FieldOptionGroup__Group_2__0 )? ) )
            // InternalCalculatorForm.g:1788:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:1788:1: ( ( rule__FieldOptionGroup__Group_2__0 )? )
            // InternalCalculatorForm.g:1789:2: ( rule__FieldOptionGroup__Group_2__0 )?
            {
             before(grammarAccess.getFieldOptionGroupAccess().getGroup_2()); 
            // InternalCalculatorForm.g:1790:2: ( rule__FieldOptionGroup__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCalculatorForm.g:1790:3: rule__FieldOptionGroup__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldOptionGroup__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldOptionGroupAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1798:1: rule__FieldOptionGroup__Group__3 : rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 ;
    public final void rule__FieldOptionGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1802:1: ( rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4 )
            // InternalCalculatorForm.g:1803:2: rule__FieldOptionGroup__Group__3__Impl rule__FieldOptionGroup__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__FieldOptionGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1810:1: rule__FieldOptionGroup__Group__3__Impl : ( '{' ) ;
    public final void rule__FieldOptionGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1814:1: ( ( '{' ) )
            // InternalCalculatorForm.g:1815:1: ( '{' )
            {
            // InternalCalculatorForm.g:1815:1: ( '{' )
            // InternalCalculatorForm.g:1816:2: '{'
            {
             before(grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldOptionGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1825:1: rule__FieldOptionGroup__Group__4 : rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 ;
    public final void rule__FieldOptionGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1829:1: ( rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5 )
            // InternalCalculatorForm.g:1830:2: rule__FieldOptionGroup__Group__4__Impl rule__FieldOptionGroup__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__FieldOptionGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1837:1: rule__FieldOptionGroup__Group__4__Impl : ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) ;
    public final void rule__FieldOptionGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1841:1: ( ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* ) )
            // InternalCalculatorForm.g:1842:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:1842:1: ( ( rule__FieldOptionGroup__OptionsAssignment_4 )* )
            // InternalCalculatorForm.g:1843:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            {
             before(grammarAccess.getFieldOptionGroupAccess().getOptionsAssignment_4()); 
            // InternalCalculatorForm.g:1844:2: ( rule__FieldOptionGroup__OptionsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCalculatorForm.g:1844:3: rule__FieldOptionGroup__OptionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__FieldOptionGroup__OptionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getFieldOptionGroupAccess().getOptionsAssignment_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1852:1: rule__FieldOptionGroup__Group__5 : rule__FieldOptionGroup__Group__5__Impl ;
    public final void rule__FieldOptionGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1856:1: ( rule__FieldOptionGroup__Group__5__Impl )
            // InternalCalculatorForm.g:1857:2: rule__FieldOptionGroup__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1863:1: rule__FieldOptionGroup__Group__5__Impl : ( '}' ) ;
    public final void rule__FieldOptionGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1867:1: ( ( '}' ) )
            // InternalCalculatorForm.g:1868:1: ( '}' )
            {
            // InternalCalculatorForm.g:1868:1: ( '}' )
            // InternalCalculatorForm.g:1869:2: '}'
            {
             before(grammarAccess.getFieldOptionGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldOptionGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1879:1: rule__FieldOptionGroup__Group_2__0 : rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 ;
    public final void rule__FieldOptionGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1883:1: ( rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1 )
            // InternalCalculatorForm.g:1884:2: rule__FieldOptionGroup__Group_2__0__Impl rule__FieldOptionGroup__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldOptionGroup__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1891:1: rule__FieldOptionGroup__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__FieldOptionGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1895:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:1896:1: ( 'label' )
            {
            // InternalCalculatorForm.g:1896:1: ( 'label' )
            // InternalCalculatorForm.g:1897:2: 'label'
            {
             before(grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFieldOptionGroupAccess().getLabelKeyword_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1906:1: rule__FieldOptionGroup__Group_2__1 : rule__FieldOptionGroup__Group_2__1__Impl ;
    public final void rule__FieldOptionGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1910:1: ( rule__FieldOptionGroup__Group_2__1__Impl )
            // InternalCalculatorForm.g:1911:2: rule__FieldOptionGroup__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1917:1: rule__FieldOptionGroup__Group_2__1__Impl : ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) ;
    public final void rule__FieldOptionGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1921:1: ( ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:1922:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:1922:1: ( ( rule__FieldOptionGroup__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:1923:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            {
             before(grammarAccess.getFieldOptionGroupAccess().getLabelAssignment_2_1()); 
            // InternalCalculatorForm.g:1924:2: ( rule__FieldOptionGroup__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:1924:3: rule__FieldOptionGroup__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldOptionGroup__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldOptionGroupAccess().getLabelAssignment_2_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1933:1: rule__FieldChoice__Group__0 : rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 ;
    public final void rule__FieldChoice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1937:1: ( rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1 )
            // InternalCalculatorForm.g:1938:2: rule__FieldChoice__Group__0__Impl rule__FieldChoice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FieldChoice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1945:1: rule__FieldChoice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__FieldChoice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1949:1: ( ( 'choice' ) )
            // InternalCalculatorForm.g:1950:1: ( 'choice' )
            {
            // InternalCalculatorForm.g:1950:1: ( 'choice' )
            // InternalCalculatorForm.g:1951:2: 'choice'
            {
             before(grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getChoiceKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1960:1: rule__FieldChoice__Group__1 : rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 ;
    public final void rule__FieldChoice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1964:1: ( rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2 )
            // InternalCalculatorForm.g:1965:2: rule__FieldChoice__Group__1__Impl rule__FieldChoice__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1972:1: rule__FieldChoice__Group__1__Impl : ( ( rule__FieldChoice__NameAssignment_1 ) ) ;
    public final void rule__FieldChoice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1976:1: ( ( ( rule__FieldChoice__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:1977:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:1977:1: ( ( rule__FieldChoice__NameAssignment_1 ) )
            // InternalCalculatorForm.g:1978:2: ( rule__FieldChoice__NameAssignment_1 )
            {
             before(grammarAccess.getFieldChoiceAccess().getNameAssignment_1()); 
            // InternalCalculatorForm.g:1979:2: ( rule__FieldChoice__NameAssignment_1 )
            // InternalCalculatorForm.g:1979:3: rule__FieldChoice__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:1987:1: rule__FieldChoice__Group__2 : rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 ;
    public final void rule__FieldChoice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:1991:1: ( rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3 )
            // InternalCalculatorForm.g:1992:2: rule__FieldChoice__Group__2__Impl rule__FieldChoice__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:1999:1: rule__FieldChoice__Group__2__Impl : ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2003:1: ( ( ( rule__FieldChoice__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:2004:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2004:1: ( ( rule__FieldChoice__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:2005:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getAutofocusAssignment_2()); 
            // InternalCalculatorForm.g:2006:2: ( rule__FieldChoice__AutofocusAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCalculatorForm.g:2006:3: rule__FieldChoice__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__AutofocusAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getAutofocusAssignment_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2014:1: rule__FieldChoice__Group__3 : rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 ;
    public final void rule__FieldChoice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2018:1: ( rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4 )
            // InternalCalculatorForm.g:2019:2: rule__FieldChoice__Group__3__Impl rule__FieldChoice__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2026:1: rule__FieldChoice__Group__3__Impl : ( ( rule__FieldChoice__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2030:1: ( ( ( rule__FieldChoice__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2031:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2031:1: ( ( rule__FieldChoice__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:2032:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getCheckedAssignment_3()); 
            // InternalCalculatorForm.g:2033:2: ( rule__FieldChoice__CheckedAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCalculatorForm.g:2033:3: rule__FieldChoice__CheckedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__CheckedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getCheckedAssignment_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2041:1: rule__FieldChoice__Group__4 : rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 ;
    public final void rule__FieldChoice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2045:1: ( rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5 )
            // InternalCalculatorForm.g:2046:2: rule__FieldChoice__Group__4__Impl rule__FieldChoice__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2053:1: rule__FieldChoice__Group__4__Impl : ( ( rule__FieldChoice__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2057:1: ( ( ( rule__FieldChoice__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:2058:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:2058:1: ( ( rule__FieldChoice__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:2059:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getDisabledAssignment_4()); 
            // InternalCalculatorForm.g:2060:2: ( rule__FieldChoice__DisabledAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCalculatorForm.g:2060:3: rule__FieldChoice__DisabledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__DisabledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getDisabledAssignment_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2068:1: rule__FieldChoice__Group__5 : rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 ;
    public final void rule__FieldChoice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2072:1: ( rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6 )
            // InternalCalculatorForm.g:2073:2: rule__FieldChoice__Group__5__Impl rule__FieldChoice__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__6();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2080:1: rule__FieldChoice__Group__5__Impl : ( ( rule__FieldChoice__Group_5__0 )? ) ;
    public final void rule__FieldChoice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2084:1: ( ( ( rule__FieldChoice__Group_5__0 )? ) )
            // InternalCalculatorForm.g:2085:1: ( ( rule__FieldChoice__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:2085:1: ( ( rule__FieldChoice__Group_5__0 )? )
            // InternalCalculatorForm.g:2086:2: ( rule__FieldChoice__Group_5__0 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getGroup_5()); 
            // InternalCalculatorForm.g:2087:2: ( rule__FieldChoice__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCalculatorForm.g:2087:3: rule__FieldChoice__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2095:1: rule__FieldChoice__Group__6 : rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 ;
    public final void rule__FieldChoice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2099:1: ( rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7 )
            // InternalCalculatorForm.g:2100:2: rule__FieldChoice__Group__6__Impl rule__FieldChoice__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__7();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2107:1: rule__FieldChoice__Group__6__Impl : ( ( rule__FieldChoice__Group_6__0 )? ) ;
    public final void rule__FieldChoice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2111:1: ( ( ( rule__FieldChoice__Group_6__0 )? ) )
            // InternalCalculatorForm.g:2112:1: ( ( rule__FieldChoice__Group_6__0 )? )
            {
            // InternalCalculatorForm.g:2112:1: ( ( rule__FieldChoice__Group_6__0 )? )
            // InternalCalculatorForm.g:2113:2: ( rule__FieldChoice__Group_6__0 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getGroup_6()); 
            // InternalCalculatorForm.g:2114:2: ( rule__FieldChoice__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCalculatorForm.g:2114:3: rule__FieldChoice__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2122:1: rule__FieldChoice__Group__7 : rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 ;
    public final void rule__FieldChoice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2126:1: ( rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8 )
            // InternalCalculatorForm.g:2127:2: rule__FieldChoice__Group__7__Impl rule__FieldChoice__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__8();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2134:1: rule__FieldChoice__Group__7__Impl : ( ( rule__FieldChoice__MultipleAssignment_7 )? ) ;
    public final void rule__FieldChoice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2138:1: ( ( ( rule__FieldChoice__MultipleAssignment_7 )? ) )
            // InternalCalculatorForm.g:2139:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            {
            // InternalCalculatorForm.g:2139:1: ( ( rule__FieldChoice__MultipleAssignment_7 )? )
            // InternalCalculatorForm.g:2140:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getMultipleAssignment_7()); 
            // InternalCalculatorForm.g:2141:2: ( rule__FieldChoice__MultipleAssignment_7 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCalculatorForm.g:2141:3: rule__FieldChoice__MultipleAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__MultipleAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getMultipleAssignment_7()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2149:1: rule__FieldChoice__Group__8 : rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 ;
    public final void rule__FieldChoice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2153:1: ( rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9 )
            // InternalCalculatorForm.g:2154:2: rule__FieldChoice__Group__8__Impl rule__FieldChoice__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__9();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2161:1: rule__FieldChoice__Group__8__Impl : ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) ;
    public final void rule__FieldChoice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2165:1: ( ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? ) )
            // InternalCalculatorForm.g:2166:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            {
            // InternalCalculatorForm.g:2166:1: ( ( rule__FieldChoice__NotdisplayedAssignment_8 )? )
            // InternalCalculatorForm.g:2167:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getNotdisplayedAssignment_8()); 
            // InternalCalculatorForm.g:2168:2: ( rule__FieldChoice__NotdisplayedAssignment_8 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCalculatorForm.g:2168:3: rule__FieldChoice__NotdisplayedAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__NotdisplayedAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getNotdisplayedAssignment_8()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2176:1: rule__FieldChoice__Group__9 : rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 ;
    public final void rule__FieldChoice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2180:1: ( rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10 )
            // InternalCalculatorForm.g:2181:2: rule__FieldChoice__Group__9__Impl rule__FieldChoice__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__10();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2188:1: rule__FieldChoice__Group__9__Impl : ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) ;
    public final void rule__FieldChoice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2192:1: ( ( ( rule__FieldChoice__ReadonlyAssignment_9 )? ) )
            // InternalCalculatorForm.g:2193:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            {
            // InternalCalculatorForm.g:2193:1: ( ( rule__FieldChoice__ReadonlyAssignment_9 )? )
            // InternalCalculatorForm.g:2194:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getReadonlyAssignment_9()); 
            // InternalCalculatorForm.g:2195:2: ( rule__FieldChoice__ReadonlyAssignment_9 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCalculatorForm.g:2195:3: rule__FieldChoice__ReadonlyAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__ReadonlyAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getReadonlyAssignment_9()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2203:1: rule__FieldChoice__Group__10 : rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 ;
    public final void rule__FieldChoice__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2207:1: ( rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11 )
            // InternalCalculatorForm.g:2208:2: rule__FieldChoice__Group__10__Impl rule__FieldChoice__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__11();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2215:1: rule__FieldChoice__Group__10__Impl : ( ( rule__FieldChoice__RequiredAssignment_10 )? ) ;
    public final void rule__FieldChoice__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2219:1: ( ( ( rule__FieldChoice__RequiredAssignment_10 )? ) )
            // InternalCalculatorForm.g:2220:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            {
            // InternalCalculatorForm.g:2220:1: ( ( rule__FieldChoice__RequiredAssignment_10 )? )
            // InternalCalculatorForm.g:2221:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getRequiredAssignment_10()); 
            // InternalCalculatorForm.g:2222:2: ( rule__FieldChoice__RequiredAssignment_10 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCalculatorForm.g:2222:3: rule__FieldChoice__RequiredAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__RequiredAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getRequiredAssignment_10()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2230:1: rule__FieldChoice__Group__11 : rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 ;
    public final void rule__FieldChoice__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2234:1: ( rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12 )
            // InternalCalculatorForm.g:2235:2: rule__FieldChoice__Group__11__Impl rule__FieldChoice__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__FieldChoice__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__12();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2242:1: rule__FieldChoice__Group__11__Impl : ( ( rule__FieldChoice__Group_11__0 )? ) ;
    public final void rule__FieldChoice__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2246:1: ( ( ( rule__FieldChoice__Group_11__0 )? ) )
            // InternalCalculatorForm.g:2247:1: ( ( rule__FieldChoice__Group_11__0 )? )
            {
            // InternalCalculatorForm.g:2247:1: ( ( rule__FieldChoice__Group_11__0 )? )
            // InternalCalculatorForm.g:2248:2: ( rule__FieldChoice__Group_11__0 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getGroup_11()); 
            // InternalCalculatorForm.g:2249:2: ( rule__FieldChoice__Group_11__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCalculatorForm.g:2249:3: rule__FieldChoice__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getGroup_11()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2257:1: rule__FieldChoice__Group__12 : rule__FieldChoice__Group__12__Impl ;
    public final void rule__FieldChoice__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2261:1: ( rule__FieldChoice__Group__12__Impl )
            // InternalCalculatorForm.g:2262:2: rule__FieldChoice__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2268:1: rule__FieldChoice__Group__12__Impl : ( ( rule__FieldChoice__Group_12__0 )? ) ;
    public final void rule__FieldChoice__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2272:1: ( ( ( rule__FieldChoice__Group_12__0 )? ) )
            // InternalCalculatorForm.g:2273:1: ( ( rule__FieldChoice__Group_12__0 )? )
            {
            // InternalCalculatorForm.g:2273:1: ( ( rule__FieldChoice__Group_12__0 )? )
            // InternalCalculatorForm.g:2274:2: ( rule__FieldChoice__Group_12__0 )?
            {
             before(grammarAccess.getFieldChoiceAccess().getGroup_12()); 
            // InternalCalculatorForm.g:2275:2: ( rule__FieldChoice__Group_12__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCalculatorForm.g:2275:3: rule__FieldChoice__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoice__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceAccess().getGroup_12()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2284:1: rule__FieldChoice__Group_5__0 : rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 ;
    public final void rule__FieldChoice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2288:1: ( rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1 )
            // InternalCalculatorForm.g:2289:2: rule__FieldChoice__Group_5__0__Impl rule__FieldChoice__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldChoice__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2296:1: rule__FieldChoice__Group_5__0__Impl : ( 'form' ) ;
    public final void rule__FieldChoice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2300:1: ( ( 'form' ) )
            // InternalCalculatorForm.g:2301:1: ( 'form' )
            {
            // InternalCalculatorForm.g:2301:1: ( 'form' )
            // InternalCalculatorForm.g:2302:2: 'form'
            {
             before(grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getFormKeyword_5_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2311:1: rule__FieldChoice__Group_5__1 : rule__FieldChoice__Group_5__1__Impl ;
    public final void rule__FieldChoice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2315:1: ( rule__FieldChoice__Group_5__1__Impl )
            // InternalCalculatorForm.g:2316:2: rule__FieldChoice__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2322:1: rule__FieldChoice__Group_5__1__Impl : ( ( rule__FieldChoice__FormAssignment_5_1 ) ) ;
    public final void rule__FieldChoice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2326:1: ( ( ( rule__FieldChoice__FormAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:2327:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:2327:1: ( ( rule__FieldChoice__FormAssignment_5_1 ) )
            // InternalCalculatorForm.g:2328:2: ( rule__FieldChoice__FormAssignment_5_1 )
            {
             before(grammarAccess.getFieldChoiceAccess().getFormAssignment_5_1()); 
            // InternalCalculatorForm.g:2329:2: ( rule__FieldChoice__FormAssignment_5_1 )
            // InternalCalculatorForm.g:2329:3: rule__FieldChoice__FormAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__FormAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceAccess().getFormAssignment_5_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2338:1: rule__FieldChoice__Group_6__0 : rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 ;
    public final void rule__FieldChoice__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2342:1: ( rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1 )
            // InternalCalculatorForm.g:2343:2: rule__FieldChoice__Group_6__0__Impl rule__FieldChoice__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldChoice__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_6__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2350:1: rule__FieldChoice__Group_6__0__Impl : ( 'label' ) ;
    public final void rule__FieldChoice__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2354:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2355:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2355:1: ( 'label' )
            // InternalCalculatorForm.g:2356:2: 'label'
            {
             before(grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getLabelKeyword_6_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2365:1: rule__FieldChoice__Group_6__1 : rule__FieldChoice__Group_6__1__Impl ;
    public final void rule__FieldChoice__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2369:1: ( rule__FieldChoice__Group_6__1__Impl )
            // InternalCalculatorForm.g:2370:2: rule__FieldChoice__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2376:1: rule__FieldChoice__Group_6__1__Impl : ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) ;
    public final void rule__FieldChoice__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2380:1: ( ( ( rule__FieldChoice__LabelAssignment_6_1 ) ) )
            // InternalCalculatorForm.g:2381:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            {
            // InternalCalculatorForm.g:2381:1: ( ( rule__FieldChoice__LabelAssignment_6_1 ) )
            // InternalCalculatorForm.g:2382:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            {
             before(grammarAccess.getFieldChoiceAccess().getLabelAssignment_6_1()); 
            // InternalCalculatorForm.g:2383:2: ( rule__FieldChoice__LabelAssignment_6_1 )
            // InternalCalculatorForm.g:2383:3: rule__FieldChoice__LabelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__LabelAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceAccess().getLabelAssignment_6_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2392:1: rule__FieldChoice__Group_11__0 : rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 ;
    public final void rule__FieldChoice__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2396:1: ( rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1 )
            // InternalCalculatorForm.g:2397:2: rule__FieldChoice__Group_11__0__Impl rule__FieldChoice__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldChoice__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_11__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2404:1: rule__FieldChoice__Group_11__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoice__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2408:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:2409:1: ( 'value' )
            {
            // InternalCalculatorForm.g:2409:1: ( 'value' )
            // InternalCalculatorForm.g:2410:2: 'value'
            {
             before(grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getValueKeyword_11_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2419:1: rule__FieldChoice__Group_11__1 : rule__FieldChoice__Group_11__1__Impl ;
    public final void rule__FieldChoice__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2423:1: ( rule__FieldChoice__Group_11__1__Impl )
            // InternalCalculatorForm.g:2424:2: rule__FieldChoice__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_11__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2430:1: rule__FieldChoice__Group_11__1__Impl : ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) ;
    public final void rule__FieldChoice__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2434:1: ( ( ( rule__FieldChoice__ValueAssignment_11_1 ) ) )
            // InternalCalculatorForm.g:2435:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            {
            // InternalCalculatorForm.g:2435:1: ( ( rule__FieldChoice__ValueAssignment_11_1 ) )
            // InternalCalculatorForm.g:2436:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            {
             before(grammarAccess.getFieldChoiceAccess().getValueAssignment_11_1()); 
            // InternalCalculatorForm.g:2437:2: ( rule__FieldChoice__ValueAssignment_11_1 )
            // InternalCalculatorForm.g:2437:3: rule__FieldChoice__ValueAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__ValueAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceAccess().getValueAssignment_11_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2446:1: rule__FieldChoice__Group_12__0 : rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 ;
    public final void rule__FieldChoice__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2450:1: ( rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1 )
            // InternalCalculatorForm.g:2451:2: rule__FieldChoice__Group_12__0__Impl rule__FieldChoice__Group_12__1
            {
            pushFollow(FOLLOW_13);
            rule__FieldChoice__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_12__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2458:1: rule__FieldChoice__Group_12__0__Impl : ( '{' ) ;
    public final void rule__FieldChoice__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2462:1: ( ( '{' ) )
            // InternalCalculatorForm.g:2463:1: ( '{' )
            {
            // InternalCalculatorForm.g:2463:1: ( '{' )
            // InternalCalculatorForm.g:2464:2: '{'
            {
             before(grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getLeftCurlyBracketKeyword_12_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2473:1: rule__FieldChoice__Group_12__1 : rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 ;
    public final void rule__FieldChoice__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2477:1: ( rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2 )
            // InternalCalculatorForm.g:2478:2: rule__FieldChoice__Group_12__1__Impl rule__FieldChoice__Group_12__2
            {
            pushFollow(FOLLOW_13);
            rule__FieldChoice__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_12__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2485:1: rule__FieldChoice__Group_12__1__Impl : ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) ;
    public final void rule__FieldChoice__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2489:1: ( ( ( rule__FieldChoice__OptionsAssignment_12_1 )* ) )
            // InternalCalculatorForm.g:2490:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            {
            // InternalCalculatorForm.g:2490:1: ( ( rule__FieldChoice__OptionsAssignment_12_1 )* )
            // InternalCalculatorForm.g:2491:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            {
             before(grammarAccess.getFieldChoiceAccess().getOptionsAssignment_12_1()); 
            // InternalCalculatorForm.g:2492:2: ( rule__FieldChoice__OptionsAssignment_12_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCalculatorForm.g:2492:3: rule__FieldChoice__OptionsAssignment_12_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__FieldChoice__OptionsAssignment_12_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getFieldChoiceAccess().getOptionsAssignment_12_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2500:1: rule__FieldChoice__Group_12__2 : rule__FieldChoice__Group_12__2__Impl ;
    public final void rule__FieldChoice__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2504:1: ( rule__FieldChoice__Group_12__2__Impl )
            // InternalCalculatorForm.g:2505:2: rule__FieldChoice__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoice__Group_12__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2511:1: rule__FieldChoice__Group_12__2__Impl : ( '}' ) ;
    public final void rule__FieldChoice__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2515:1: ( ( '}' ) )
            // InternalCalculatorForm.g:2516:1: ( '}' )
            {
            // InternalCalculatorForm.g:2516:1: ( '}' )
            // InternalCalculatorForm.g:2517:2: '}'
            {
             before(grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getRightCurlyBracketKeyword_12_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2527:1: rule__FieldChoiceOption__Group__0 : rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 ;
    public final void rule__FieldChoiceOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2531:1: ( rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1 )
            // InternalCalculatorForm.g:2532:2: rule__FieldChoiceOption__Group__0__Impl rule__FieldChoiceOption__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldChoiceOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2539:1: rule__FieldChoiceOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__FieldChoiceOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2543:1: ( ( 'option' ) )
            // InternalCalculatorForm.g:2544:1: ( 'option' )
            {
            // InternalCalculatorForm.g:2544:1: ( 'option' )
            // InternalCalculatorForm.g:2545:2: 'option'
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getOptionKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2554:1: rule__FieldChoiceOption__Group__1 : rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 ;
    public final void rule__FieldChoiceOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2558:1: ( rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2 )
            // InternalCalculatorForm.g:2559:2: rule__FieldChoiceOption__Group__1__Impl rule__FieldChoiceOption__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FieldChoiceOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2566:1: rule__FieldChoiceOption__Group__1__Impl : ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) ;
    public final void rule__FieldChoiceOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2570:1: ( ( ( rule__FieldChoiceOption__LabelAssignment_1 ) ) )
            // InternalCalculatorForm.g:2571:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2571:1: ( ( rule__FieldChoiceOption__LabelAssignment_1 ) )
            // InternalCalculatorForm.g:2572:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getLabelAssignment_1()); 
            // InternalCalculatorForm.g:2573:2: ( rule__FieldChoiceOption__LabelAssignment_1 )
            // InternalCalculatorForm.g:2573:3: rule__FieldChoiceOption__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceOptionAccess().getLabelAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2581:1: rule__FieldChoiceOption__Group__2 : rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 ;
    public final void rule__FieldChoiceOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2585:1: ( rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3 )
            // InternalCalculatorForm.g:2586:2: rule__FieldChoiceOption__Group__2__Impl rule__FieldChoiceOption__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__FieldChoiceOption__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2593:1: rule__FieldChoiceOption__Group__2__Impl : ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) ;
    public final void rule__FieldChoiceOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2597:1: ( ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? ) )
            // InternalCalculatorForm.g:2598:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            {
            // InternalCalculatorForm.g:2598:1: ( ( rule__FieldChoiceOption__AutofocusAssignment_2 )? )
            // InternalCalculatorForm.g:2599:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAssignment_2()); 
            // InternalCalculatorForm.g:2600:2: ( rule__FieldChoiceOption__AutofocusAssignment_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCalculatorForm.g:2600:3: rule__FieldChoiceOption__AutofocusAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__AutofocusAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAssignment_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2608:1: rule__FieldChoiceOption__Group__3 : rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 ;
    public final void rule__FieldChoiceOption__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2612:1: ( rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4 )
            // InternalCalculatorForm.g:2613:2: rule__FieldChoiceOption__Group__3__Impl rule__FieldChoiceOption__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__FieldChoiceOption__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2620:1: rule__FieldChoiceOption__Group__3__Impl : ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) ;
    public final void rule__FieldChoiceOption__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2624:1: ( ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? ) )
            // InternalCalculatorForm.g:2625:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            {
            // InternalCalculatorForm.g:2625:1: ( ( rule__FieldChoiceOption__CheckedAssignment_3 )? )
            // InternalCalculatorForm.g:2626:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getCheckedAssignment_3()); 
            // InternalCalculatorForm.g:2627:2: ( rule__FieldChoiceOption__CheckedAssignment_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCalculatorForm.g:2627:3: rule__FieldChoiceOption__CheckedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__CheckedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getCheckedAssignment_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2635:1: rule__FieldChoiceOption__Group__4 : rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 ;
    public final void rule__FieldChoiceOption__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2639:1: ( rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5 )
            // InternalCalculatorForm.g:2640:2: rule__FieldChoiceOption__Group__4__Impl rule__FieldChoiceOption__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__FieldChoiceOption__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2647:1: rule__FieldChoiceOption__Group__4__Impl : ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) ;
    public final void rule__FieldChoiceOption__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2651:1: ( ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:2652:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:2652:1: ( ( rule__FieldChoiceOption__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:2653:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getDisabledAssignment_4()); 
            // InternalCalculatorForm.g:2654:2: ( rule__FieldChoiceOption__DisabledAssignment_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCalculatorForm.g:2654:3: rule__FieldChoiceOption__DisabledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__DisabledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getDisabledAssignment_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2662:1: rule__FieldChoiceOption__Group__5 : rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 ;
    public final void rule__FieldChoiceOption__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2666:1: ( rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6 )
            // InternalCalculatorForm.g:2667:2: rule__FieldChoiceOption__Group__5__Impl rule__FieldChoiceOption__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__FieldChoiceOption__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__6();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2674:1: rule__FieldChoiceOption__Group__5__Impl : ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) ;
    public final void rule__FieldChoiceOption__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2678:1: ( ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? ) )
            // InternalCalculatorForm.g:2679:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            {
            // InternalCalculatorForm.g:2679:1: ( ( rule__FieldChoiceOption__ReadonlyAssignment_5 )? )
            // InternalCalculatorForm.g:2680:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyAssignment_5()); 
            // InternalCalculatorForm.g:2681:2: ( rule__FieldChoiceOption__ReadonlyAssignment_5 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCalculatorForm.g:2681:3: rule__FieldChoiceOption__ReadonlyAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__ReadonlyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getReadonlyAssignment_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2689:1: rule__FieldChoiceOption__Group__6 : rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 ;
    public final void rule__FieldChoiceOption__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2693:1: ( rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7 )
            // InternalCalculatorForm.g:2694:2: rule__FieldChoiceOption__Group__6__Impl rule__FieldChoiceOption__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__FieldChoiceOption__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__7();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2701:1: rule__FieldChoiceOption__Group__6__Impl : ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) ;
    public final void rule__FieldChoiceOption__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2705:1: ( ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? ) )
            // InternalCalculatorForm.g:2706:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            {
            // InternalCalculatorForm.g:2706:1: ( ( rule__FieldChoiceOption__RequiredAssignment_6 )? )
            // InternalCalculatorForm.g:2707:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getRequiredAssignment_6()); 
            // InternalCalculatorForm.g:2708:2: ( rule__FieldChoiceOption__RequiredAssignment_6 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==30) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCalculatorForm.g:2708:3: rule__FieldChoiceOption__RequiredAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__RequiredAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getRequiredAssignment_6()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2716:1: rule__FieldChoiceOption__Group__7 : rule__FieldChoiceOption__Group__7__Impl ;
    public final void rule__FieldChoiceOption__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2720:1: ( rule__FieldChoiceOption__Group__7__Impl )
            // InternalCalculatorForm.g:2721:2: rule__FieldChoiceOption__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2727:1: rule__FieldChoiceOption__Group__7__Impl : ( ( rule__FieldChoiceOption__Group_7__0 )? ) ;
    public final void rule__FieldChoiceOption__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2731:1: ( ( ( rule__FieldChoiceOption__Group_7__0 )? ) )
            // InternalCalculatorForm.g:2732:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            {
            // InternalCalculatorForm.g:2732:1: ( ( rule__FieldChoiceOption__Group_7__0 )? )
            // InternalCalculatorForm.g:2733:2: ( rule__FieldChoiceOption__Group_7__0 )?
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getGroup_7()); 
            // InternalCalculatorForm.g:2734:2: ( rule__FieldChoiceOption__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCalculatorForm.g:2734:3: rule__FieldChoiceOption__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldChoiceOption__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2743:1: rule__FieldChoiceOption__Group_7__0 : rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 ;
    public final void rule__FieldChoiceOption__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2747:1: ( rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1 )
            // InternalCalculatorForm.g:2748:2: rule__FieldChoiceOption__Group_7__0__Impl rule__FieldChoiceOption__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__FieldChoiceOption__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group_7__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2755:1: rule__FieldChoiceOption__Group_7__0__Impl : ( 'value' ) ;
    public final void rule__FieldChoiceOption__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2759:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:2760:1: ( 'value' )
            {
            // InternalCalculatorForm.g:2760:1: ( 'value' )
            // InternalCalculatorForm.g:2761:2: 'value'
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getValueKeyword_7_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2770:1: rule__FieldChoiceOption__Group_7__1 : rule__FieldChoiceOption__Group_7__1__Impl ;
    public final void rule__FieldChoiceOption__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2774:1: ( rule__FieldChoiceOption__Group_7__1__Impl )
            // InternalCalculatorForm.g:2775:2: rule__FieldChoiceOption__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2781:1: rule__FieldChoiceOption__Group_7__1__Impl : ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) ;
    public final void rule__FieldChoiceOption__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2785:1: ( ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) ) )
            // InternalCalculatorForm.g:2786:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            {
            // InternalCalculatorForm.g:2786:1: ( ( rule__FieldChoiceOption__ValueAssignment_7_1 ) )
            // InternalCalculatorForm.g:2787:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getValueAssignment_7_1()); 
            // InternalCalculatorForm.g:2788:2: ( rule__FieldChoiceOption__ValueAssignment_7_1 )
            // InternalCalculatorForm.g:2788:3: rule__FieldChoiceOption__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldChoiceOption__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldChoiceOptionAccess().getValueAssignment_7_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2797:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2801:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // InternalCalculatorForm.g:2802:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2809:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2813:1: ( ( 'group' ) )
            // InternalCalculatorForm.g:2814:1: ( 'group' )
            {
            // InternalCalculatorForm.g:2814:1: ( 'group' )
            // InternalCalculatorForm.g:2815:2: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2824:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2828:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // InternalCalculatorForm.g:2829:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2836:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2840:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:2841:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:2841:1: ( ( rule__Group__NameAssignment_1 ) )
            // InternalCalculatorForm.g:2842:2: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // InternalCalculatorForm.g:2843:2: ( rule__Group__NameAssignment_1 )
            // InternalCalculatorForm.g:2843:3: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2851:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2855:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // InternalCalculatorForm.g:2856:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2863:1: rule__Group__Group__2__Impl : ( ( rule__Group__Group_2__0 )? ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2867:1: ( ( ( rule__Group__Group_2__0 )? ) )
            // InternalCalculatorForm.g:2868:1: ( ( rule__Group__Group_2__0 )? )
            {
            // InternalCalculatorForm.g:2868:1: ( ( rule__Group__Group_2__0 )? )
            // InternalCalculatorForm.g:2869:2: ( rule__Group__Group_2__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_2()); 
            // InternalCalculatorForm.g:2870:2: ( rule__Group__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==13) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCalculatorForm.g:2870:3: rule__Group__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Group__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2878:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2882:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // InternalCalculatorForm.g:2883:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2890:1: rule__Group__Group__3__Impl : ( '{' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2894:1: ( ( '{' ) )
            // InternalCalculatorForm.g:2895:1: ( '{' )
            {
            // InternalCalculatorForm.g:2895:1: ( '{' )
            // InternalCalculatorForm.g:2896:2: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2905:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2909:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // InternalCalculatorForm.g:2910:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2917:1: rule__Group__Group__4__Impl : ( ( rule__Group__FieldsAssignment_4 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2921:1: ( ( ( rule__Group__FieldsAssignment_4 )* ) )
            // InternalCalculatorForm.g:2922:1: ( ( rule__Group__FieldsAssignment_4 )* )
            {
            // InternalCalculatorForm.g:2922:1: ( ( rule__Group__FieldsAssignment_4 )* )
            // InternalCalculatorForm.g:2923:2: ( rule__Group__FieldsAssignment_4 )*
            {
             before(grammarAccess.getGroupAccess().getFieldsAssignment_4()); 
            // InternalCalculatorForm.g:2924:2: ( rule__Group__FieldsAssignment_4 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==11||LA48_0==15||LA48_0==22||LA48_0==25) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCalculatorForm.g:2924:3: rule__Group__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Group__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getFieldsAssignment_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2932:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2936:1: ( rule__Group__Group__5__Impl )
            // InternalCalculatorForm.g:2937:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2943:1: rule__Group__Group__5__Impl : ( '}' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2947:1: ( ( '}' ) )
            // InternalCalculatorForm.g:2948:1: ( '}' )
            {
            // InternalCalculatorForm.g:2948:1: ( '}' )
            // InternalCalculatorForm.g:2949:2: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2959:1: rule__Group__Group_2__0 : rule__Group__Group_2__0__Impl rule__Group__Group_2__1 ;
    public final void rule__Group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2963:1: ( rule__Group__Group_2__0__Impl rule__Group__Group_2__1 )
            // InternalCalculatorForm.g:2964:2: rule__Group__Group_2__0__Impl rule__Group__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Group__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Group__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2971:1: rule__Group__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__Group__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2975:1: ( ( 'label' ) )
            // InternalCalculatorForm.g:2976:1: ( 'label' )
            {
            // InternalCalculatorForm.g:2976:1: ( 'label' )
            // InternalCalculatorForm.g:2977:2: 'label'
            {
             before(grammarAccess.getGroupAccess().getLabelKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLabelKeyword_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:2986:1: rule__Group__Group_2__1 : rule__Group__Group_2__1__Impl ;
    public final void rule__Group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:2990:1: ( rule__Group__Group_2__1__Impl )
            // InternalCalculatorForm.g:2991:2: rule__Group__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Group__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:2997:1: rule__Group__Group_2__1__Impl : ( ( rule__Group__LabelAssignment_2_1 ) ) ;
    public final void rule__Group__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3001:1: ( ( ( rule__Group__LabelAssignment_2_1 ) ) )
            // InternalCalculatorForm.g:3002:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            {
            // InternalCalculatorForm.g:3002:1: ( ( rule__Group__LabelAssignment_2_1 ) )
            // InternalCalculatorForm.g:3003:2: ( rule__Group__LabelAssignment_2_1 )
            {
             before(grammarAccess.getGroupAccess().getLabelAssignment_2_1()); 
            // InternalCalculatorForm.g:3004:2: ( rule__Group__LabelAssignment_2_1 )
            // InternalCalculatorForm.g:3004:3: rule__Group__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Group__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getLabelAssignment_2_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3013:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3017:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalCalculatorForm.g:3018:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3025:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3029:1: ( ( 'page' ) )
            // InternalCalculatorForm.g:3030:1: ( 'page' )
            {
            // InternalCalculatorForm.g:3030:1: ( 'page' )
            // InternalCalculatorForm.g:3031:2: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3040:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3044:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalCalculatorForm.g:3045:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3052:1: rule__Page__Group__1__Impl : ( '{' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3056:1: ( ( '{' ) )
            // InternalCalculatorForm.g:3057:1: ( '{' )
            {
            // InternalCalculatorForm.g:3057:1: ( '{' )
            // InternalCalculatorForm.g:3058:2: '{'
            {
             before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3067:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3071:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // InternalCalculatorForm.g:3072:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3079:1: rule__Page__Group__2__Impl : ( ( rule__Page__ChildsAssignment_2 )* ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3083:1: ( ( ( rule__Page__ChildsAssignment_2 )* ) )
            // InternalCalculatorForm.g:3084:1: ( ( rule__Page__ChildsAssignment_2 )* )
            {
            // InternalCalculatorForm.g:3084:1: ( ( rule__Page__ChildsAssignment_2 )* )
            // InternalCalculatorForm.g:3085:2: ( rule__Page__ChildsAssignment_2 )*
            {
             before(grammarAccess.getPageAccess().getChildsAssignment_2()); 
            // InternalCalculatorForm.g:3086:2: ( rule__Page__ChildsAssignment_2 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==11||LA49_0==15||(LA49_0>=22 && LA49_0<=23)||LA49_0==25) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCalculatorForm.g:3086:3: rule__Page__ChildsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Page__ChildsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getChildsAssignment_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3094:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3098:1: ( rule__Page__Group__3__Impl )
            // InternalCalculatorForm.g:3099:2: rule__Page__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3105:1: rule__Page__Group__3__Impl : ( '}' ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3109:1: ( ( '}' ) )
            // InternalCalculatorForm.g:3110:1: ( '}' )
            {
            // InternalCalculatorForm.g:3110:1: ( '}' )
            // InternalCalculatorForm.g:3111:2: '}'
            {
             before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3121:1: rule__ButtonSubmit__Group__0 : rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 ;
    public final void rule__ButtonSubmit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3125:1: ( rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1 )
            // InternalCalculatorForm.g:3126:2: rule__ButtonSubmit__Group__0__Impl rule__ButtonSubmit__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ButtonSubmit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3133:1: rule__ButtonSubmit__Group__0__Impl : ( 'submit-button' ) ;
    public final void rule__ButtonSubmit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3137:1: ( ( 'submit-button' ) )
            // InternalCalculatorForm.g:3138:1: ( 'submit-button' )
            {
            // InternalCalculatorForm.g:3138:1: ( 'submit-button' )
            // InternalCalculatorForm.g:3139:2: 'submit-button'
            {
             before(grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getButtonSubmitAccess().getSubmitButtonKeyword_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3148:1: rule__ButtonSubmit__Group__1 : rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 ;
    public final void rule__ButtonSubmit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3152:1: ( rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2 )
            // InternalCalculatorForm.g:3153:2: rule__ButtonSubmit__Group__1__Impl rule__ButtonSubmit__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ButtonSubmit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__2();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3160:1: rule__ButtonSubmit__Group__1__Impl : ( ( rule__ButtonSubmit__NameAssignment_1 ) ) ;
    public final void rule__ButtonSubmit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3164:1: ( ( ( rule__ButtonSubmit__NameAssignment_1 ) ) )
            // InternalCalculatorForm.g:3165:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            {
            // InternalCalculatorForm.g:3165:1: ( ( rule__ButtonSubmit__NameAssignment_1 ) )
            // InternalCalculatorForm.g:3166:2: ( rule__ButtonSubmit__NameAssignment_1 )
            {
             before(grammarAccess.getButtonSubmitAccess().getNameAssignment_1()); 
            // InternalCalculatorForm.g:3167:2: ( rule__ButtonSubmit__NameAssignment_1 )
            // InternalCalculatorForm.g:3167:3: rule__ButtonSubmit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonSubmitAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3175:1: rule__ButtonSubmit__Group__2 : rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 ;
    public final void rule__ButtonSubmit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3179:1: ( rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3 )
            // InternalCalculatorForm.g:3180:2: rule__ButtonSubmit__Group__2__Impl rule__ButtonSubmit__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ButtonSubmit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3187:1: rule__ButtonSubmit__Group__2__Impl : ( ( rule__ButtonSubmit__TextAssignment_2 ) ) ;
    public final void rule__ButtonSubmit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3191:1: ( ( ( rule__ButtonSubmit__TextAssignment_2 ) ) )
            // InternalCalculatorForm.g:3192:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            {
            // InternalCalculatorForm.g:3192:1: ( ( rule__ButtonSubmit__TextAssignment_2 ) )
            // InternalCalculatorForm.g:3193:2: ( rule__ButtonSubmit__TextAssignment_2 )
            {
             before(grammarAccess.getButtonSubmitAccess().getTextAssignment_2()); 
            // InternalCalculatorForm.g:3194:2: ( rule__ButtonSubmit__TextAssignment_2 )
            // InternalCalculatorForm.g:3194:3: rule__ButtonSubmit__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonSubmitAccess().getTextAssignment_2()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3202:1: rule__ButtonSubmit__Group__3 : rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 ;
    public final void rule__ButtonSubmit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3206:1: ( rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4 )
            // InternalCalculatorForm.g:3207:2: rule__ButtonSubmit__Group__3__Impl rule__ButtonSubmit__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ButtonSubmit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__4();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3214:1: rule__ButtonSubmit__Group__3__Impl : ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) ;
    public final void rule__ButtonSubmit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3218:1: ( ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? ) )
            // InternalCalculatorForm.g:3219:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            {
            // InternalCalculatorForm.g:3219:1: ( ( rule__ButtonSubmit__AutofocusAssignment_3 )? )
            // InternalCalculatorForm.g:3220:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            {
             before(grammarAccess.getButtonSubmitAccess().getAutofocusAssignment_3()); 
            // InternalCalculatorForm.g:3221:2: ( rule__ButtonSubmit__AutofocusAssignment_3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==26) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCalculatorForm.g:3221:3: rule__ButtonSubmit__AutofocusAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ButtonSubmit__AutofocusAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonSubmitAccess().getAutofocusAssignment_3()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3229:1: rule__ButtonSubmit__Group__4 : rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 ;
    public final void rule__ButtonSubmit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3233:1: ( rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5 )
            // InternalCalculatorForm.g:3234:2: rule__ButtonSubmit__Group__4__Impl rule__ButtonSubmit__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ButtonSubmit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3241:1: rule__ButtonSubmit__Group__4__Impl : ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) ;
    public final void rule__ButtonSubmit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3245:1: ( ( ( rule__ButtonSubmit__DisabledAssignment_4 )? ) )
            // InternalCalculatorForm.g:3246:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            {
            // InternalCalculatorForm.g:3246:1: ( ( rule__ButtonSubmit__DisabledAssignment_4 )? )
            // InternalCalculatorForm.g:3247:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            {
             before(grammarAccess.getButtonSubmitAccess().getDisabledAssignment_4()); 
            // InternalCalculatorForm.g:3248:2: ( rule__ButtonSubmit__DisabledAssignment_4 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCalculatorForm.g:3248:3: rule__ButtonSubmit__DisabledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ButtonSubmit__DisabledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonSubmitAccess().getDisabledAssignment_4()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3256:1: rule__ButtonSubmit__Group__5 : rule__ButtonSubmit__Group__5__Impl ;
    public final void rule__ButtonSubmit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3260:1: ( rule__ButtonSubmit__Group__5__Impl )
            // InternalCalculatorForm.g:3261:2: rule__ButtonSubmit__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3267:1: rule__ButtonSubmit__Group__5__Impl : ( ( rule__ButtonSubmit__Group_5__0 )? ) ;
    public final void rule__ButtonSubmit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3271:1: ( ( ( rule__ButtonSubmit__Group_5__0 )? ) )
            // InternalCalculatorForm.g:3272:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            {
            // InternalCalculatorForm.g:3272:1: ( ( rule__ButtonSubmit__Group_5__0 )? )
            // InternalCalculatorForm.g:3273:2: ( rule__ButtonSubmit__Group_5__0 )?
            {
             before(grammarAccess.getButtonSubmitAccess().getGroup_5()); 
            // InternalCalculatorForm.g:3274:2: ( rule__ButtonSubmit__Group_5__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==14) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCalculatorForm.g:3274:3: rule__ButtonSubmit__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ButtonSubmit__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonSubmitAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3283:1: rule__ButtonSubmit__Group_5__0 : rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 ;
    public final void rule__ButtonSubmit__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3287:1: ( rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1 )
            // InternalCalculatorForm.g:3288:2: rule__ButtonSubmit__Group_5__0__Impl rule__ButtonSubmit__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ButtonSubmit__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group_5__1();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3295:1: rule__ButtonSubmit__Group_5__0__Impl : ( 'value' ) ;
    public final void rule__ButtonSubmit__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3299:1: ( ( 'value' ) )
            // InternalCalculatorForm.g:3300:1: ( 'value' )
            {
            // InternalCalculatorForm.g:3300:1: ( 'value' )
            // InternalCalculatorForm.g:3301:2: 'value'
            {
             before(grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getButtonSubmitAccess().getValueKeyword_5_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3310:1: rule__ButtonSubmit__Group_5__1 : rule__ButtonSubmit__Group_5__1__Impl ;
    public final void rule__ButtonSubmit__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3314:1: ( rule__ButtonSubmit__Group_5__1__Impl )
            // InternalCalculatorForm.g:3315:2: rule__ButtonSubmit__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCalculatorForm.g:3321:1: rule__ButtonSubmit__Group_5__1__Impl : ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) ;
    public final void rule__ButtonSubmit__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3325:1: ( ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) ) )
            // InternalCalculatorForm.g:3326:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            {
            // InternalCalculatorForm.g:3326:1: ( ( rule__ButtonSubmit__ValueAssignment_5_1 ) )
            // InternalCalculatorForm.g:3327:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            {
             before(grammarAccess.getButtonSubmitAccess().getValueAssignment_5_1()); 
            // InternalCalculatorForm.g:3328:2: ( rule__ButtonSubmit__ValueAssignment_5_1 )
            // InternalCalculatorForm.g:3328:3: rule__ButtonSubmit__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ButtonSubmit__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonSubmitAccess().getValueAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__FormElementsAssignment"
    // InternalCalculatorForm.g:3337:1: rule__Model__FormElementsAssignment : ( ruleFormElement ) ;
    public final void rule__Model__FormElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3341:1: ( ( ruleFormElement ) )
            // InternalCalculatorForm.g:3342:2: ( ruleFormElement )
            {
            // InternalCalculatorForm.g:3342:2: ( ruleFormElement )
            // InternalCalculatorForm.g:3343:3: ruleFormElement
            {
             before(grammarAccess.getModelAccess().getFormElementsFormElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFormElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormElementsFormElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormElementsAssignment"


    // $ANTLR start "rule__FieldInput__NameAssignment_1"
    // InternalCalculatorForm.g:3352:1: rule__FieldInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3356:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:3357:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:3357:2: ( RULE_ID )
            // InternalCalculatorForm.g:3358:3: RULE_ID
            {
             before(grammarAccess.getFieldInputAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3367:1: rule__FieldInput__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldInput__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3371:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:3372:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:3372:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:3373:3: ( 'autofocus' )
            {
             before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            // InternalCalculatorForm.g:3374:3: ( 'autofocus' )
            // InternalCalculatorForm.g:3375:4: 'autofocus'
            {
             before(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 

            }

             after(grammarAccess.getFieldInputAccess().getAutofocusAutofocusKeyword_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3386:1: rule__FieldInput__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldInput__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3390:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:3391:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:3391:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:3392:3: ( 'disabled' )
            {
             before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            // InternalCalculatorForm.g:3393:3: ( 'disabled' )
            // InternalCalculatorForm.g:3394:4: 'disabled'
            {
             before(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 

            }

             after(grammarAccess.getFieldInputAccess().getDisabledDisabledKeyword_3_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3405:1: rule__FieldInput__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3409:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3410:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3410:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3411:3: RULE_STRING
            {
             before(grammarAccess.getFieldInputAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3420:1: rule__FieldInput__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3424:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3425:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3425:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3426:3: RULE_STRING
            {
             before(grammarAccess.getFieldInputAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3435:1: rule__FieldInput__NotdisplayedAssignment_6 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldInput__NotdisplayedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3439:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:3440:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:3440:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:3441:3: ( 'notdisplayed' )
            {
             before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            // InternalCalculatorForm.g:3442:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:3443:4: 'notdisplayed'
            {
             before(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 

            }

             after(grammarAccess.getFieldInputAccess().getNotdisplayedNotdisplayedKeyword_6_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3454:1: rule__FieldInput__ReadonlyAssignment_7 : ( ( 'readonly' ) ) ;
    public final void rule__FieldInput__ReadonlyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3458:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:3459:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:3459:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:3460:3: ( 'readonly' )
            {
             before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            // InternalCalculatorForm.g:3461:3: ( 'readonly' )
            // InternalCalculatorForm.g:3462:4: 'readonly'
            {
             before(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 

            }

             after(grammarAccess.getFieldInputAccess().getReadonlyReadonlyKeyword_7_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3473:1: rule__FieldInput__RequiredAssignment_8 : ( ( 'required' ) ) ;
    public final void rule__FieldInput__RequiredAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3477:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:3478:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:3478:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:3479:3: ( 'required' )
            {
             before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            // InternalCalculatorForm.g:3480:3: ( 'required' )
            // InternalCalculatorForm.g:3481:4: 'required'
            {
             before(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 

            }

             after(grammarAccess.getFieldInputAccess().getRequiredRequiredKeyword_8_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3492:1: rule__FieldInput__ValueAssignment_9_1 : ( RULE_STRING ) ;
    public final void rule__FieldInput__ValueAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3496:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3497:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3497:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3498:3: RULE_STRING
            {
             before(grammarAccess.getFieldInputAccess().getValueSTRINGTerminalRuleCall_9_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldInputAccess().getValueSTRINGTerminalRuleCall_9_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3507:1: rule__FieldSelect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldSelect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3511:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:3512:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:3512:2: ( RULE_ID )
            // InternalCalculatorForm.g:3513:3: RULE_ID
            {
             before(grammarAccess.getFieldSelectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3522:1: rule__FieldSelect__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldSelect__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3526:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:3527:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:3527:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:3528:3: ( 'autofocus' )
            {
             before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            // InternalCalculatorForm.g:3529:3: ( 'autofocus' )
            // InternalCalculatorForm.g:3530:4: 'autofocus'
            {
             before(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 

            }

             after(grammarAccess.getFieldSelectAccess().getAutofocusAutofocusKeyword_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3541:1: rule__FieldSelect__DisabledAssignment_3 : ( ( 'disabled' ) ) ;
    public final void rule__FieldSelect__DisabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3545:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:3546:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:3546:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:3547:3: ( 'disabled' )
            {
             before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            // InternalCalculatorForm.g:3548:3: ( 'disabled' )
            // InternalCalculatorForm.g:3549:4: 'disabled'
            {
             before(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 

            }

             after(grammarAccess.getFieldSelectAccess().getDisabledDisabledKeyword_3_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3560:1: rule__FieldSelect__FormAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__FormAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3564:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3565:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3565:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3566:3: RULE_STRING
            {
             before(grammarAccess.getFieldSelectAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getFormSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3575:1: rule__FieldSelect__LabelAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldSelect__LabelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3579:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3580:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3580:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3581:3: RULE_STRING
            {
             before(grammarAccess.getFieldSelectAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3590:1: rule__FieldSelect__MultipleAssignment_6 : ( ( 'multiple' ) ) ;
    public final void rule__FieldSelect__MultipleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3594:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:3595:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:3595:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:3596:3: ( 'multiple' )
            {
             before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            // InternalCalculatorForm.g:3597:3: ( 'multiple' )
            // InternalCalculatorForm.g:3598:4: 'multiple'
            {
             before(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 

            }

             after(grammarAccess.getFieldSelectAccess().getMultipleMultipleKeyword_6_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3609:1: rule__FieldSelect__RequiredAssignment_7 : ( ( 'required' ) ) ;
    public final void rule__FieldSelect__RequiredAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3613:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:3614:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:3614:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:3615:3: ( 'required' )
            {
             before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            // InternalCalculatorForm.g:3616:3: ( 'required' )
            // InternalCalculatorForm.g:3617:4: 'required'
            {
             before(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 

            }

             after(grammarAccess.getFieldSelectAccess().getRequiredRequiredKeyword_7_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3628:1: rule__FieldSelect__SizeAssignment_8_1 : ( RULE_INT ) ;
    public final void rule__FieldSelect__SizeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3632:1: ( ( RULE_INT ) )
            // InternalCalculatorForm.g:3633:2: ( RULE_INT )
            {
            // InternalCalculatorForm.g:3633:2: ( RULE_INT )
            // InternalCalculatorForm.g:3634:3: RULE_INT
            {
             before(grammarAccess.getFieldSelectAccess().getSizeINTTerminalRuleCall_8_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldSelectAccess().getSizeINTTerminalRuleCall_8_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3643:1: rule__FieldSelect__ChildsAssignment_10 : ( ruleFieldSelectChild ) ;
    public final void rule__FieldSelect__ChildsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3647:1: ( ( ruleFieldSelectChild ) )
            // InternalCalculatorForm.g:3648:2: ( ruleFieldSelectChild )
            {
            // InternalCalculatorForm.g:3648:2: ( ruleFieldSelectChild )
            // InternalCalculatorForm.g:3649:3: ruleFieldSelectChild
            {
             before(grammarAccess.getFieldSelectAccess().getChildsFieldSelectChildParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSelectChild();

            state._fsp--;

             after(grammarAccess.getFieldSelectAccess().getChildsFieldSelectChildParserRuleCall_10_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3658:1: rule__FieldOption__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3662:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3663:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3663:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3664:3: RULE_STRING
            {
             before(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3673:1: rule__FieldOption__DisabledAssignment_2 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOption__DisabledAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3677:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:3678:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:3678:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:3679:3: ( 'disabled' )
            {
             before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            // InternalCalculatorForm.g:3680:3: ( 'disabled' )
            // InternalCalculatorForm.g:3681:4: 'disabled'
            {
             before(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 

            }

             after(grammarAccess.getFieldOptionAccess().getDisabledDisabledKeyword_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3692:1: rule__FieldOption__SelectedAssignment_3 : ( ( 'selected' ) ) ;
    public final void rule__FieldOption__SelectedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3696:1: ( ( ( 'selected' ) ) )
            // InternalCalculatorForm.g:3697:2: ( ( 'selected' ) )
            {
            // InternalCalculatorForm.g:3697:2: ( ( 'selected' ) )
            // InternalCalculatorForm.g:3698:3: ( 'selected' )
            {
             before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            // InternalCalculatorForm.g:3699:3: ( 'selected' )
            // InternalCalculatorForm.g:3700:4: 'selected'
            {
             before(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 

            }

             after(grammarAccess.getFieldOptionAccess().getSelectedSelectedKeyword_3_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3711:1: rule__FieldOption__TextAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3715:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3716:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3716:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3717:3: RULE_STRING
            {
             before(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getTextSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3726:1: rule__FieldOption__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldOption__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3730:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3731:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3731:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3732:3: RULE_STRING
            {
             before(grammarAccess.getFieldOptionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldOptionAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3741:1: rule__FieldOptionGroup__DisabledAssignment_1 : ( ( 'disabled' ) ) ;
    public final void rule__FieldOptionGroup__DisabledAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3745:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:3746:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:3746:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:3747:3: ( 'disabled' )
            {
             before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            // InternalCalculatorForm.g:3748:3: ( 'disabled' )
            // InternalCalculatorForm.g:3749:4: 'disabled'
            {
             before(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 

            }

             after(grammarAccess.getFieldOptionGroupAccess().getDisabledDisabledKeyword_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3760:1: rule__FieldOptionGroup__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FieldOptionGroup__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3764:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3765:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3765:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3766:3: RULE_STRING
            {
             before(grammarAccess.getFieldOptionGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldOptionGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3775:1: rule__FieldOptionGroup__OptionsAssignment_4 : ( ruleFieldOption ) ;
    public final void rule__FieldOptionGroup__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3779:1: ( ( ruleFieldOption ) )
            // InternalCalculatorForm.g:3780:2: ( ruleFieldOption )
            {
            // InternalCalculatorForm.g:3780:2: ( ruleFieldOption )
            // InternalCalculatorForm.g:3781:3: ruleFieldOption
            {
             before(grammarAccess.getFieldOptionGroupAccess().getOptionsFieldOptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldOption();

            state._fsp--;

             after(grammarAccess.getFieldOptionGroupAccess().getOptionsFieldOptionParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3790:1: rule__FieldChoice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FieldChoice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3794:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:3795:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:3795:2: ( RULE_ID )
            // InternalCalculatorForm.g:3796:3: RULE_ID
            {
             before(grammarAccess.getFieldChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3805:1: rule__FieldChoice__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoice__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3809:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:3810:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:3810:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:3811:3: ( 'autofocus' )
            {
             before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            // InternalCalculatorForm.g:3812:3: ( 'autofocus' )
            // InternalCalculatorForm.g:3813:4: 'autofocus'
            {
             before(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 

            }

             after(grammarAccess.getFieldChoiceAccess().getAutofocusAutofocusKeyword_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3824:1: rule__FieldChoice__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoice__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3828:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:3829:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:3829:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:3830:3: ( 'checked' )
            {
             before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            // InternalCalculatorForm.g:3831:3: ( 'checked' )
            // InternalCalculatorForm.g:3832:4: 'checked'
            {
             before(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 

            }

             after(grammarAccess.getFieldChoiceAccess().getCheckedCheckedKeyword_3_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3843:1: rule__FieldChoice__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoice__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3847:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:3848:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:3848:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:3849:3: ( 'disabled' )
            {
             before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            // InternalCalculatorForm.g:3850:3: ( 'disabled' )
            // InternalCalculatorForm.g:3851:4: 'disabled'
            {
             before(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 

            }

             after(grammarAccess.getFieldChoiceAccess().getDisabledDisabledKeyword_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3862:1: rule__FieldChoice__FormAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__FormAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3866:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3867:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3867:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3868:3: RULE_STRING
            {
             before(grammarAccess.getFieldChoiceAccess().getFormSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getFormSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3877:1: rule__FieldChoice__LabelAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__LabelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3881:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3882:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3882:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3883:3: RULE_STRING
            {
             before(grammarAccess.getFieldChoiceAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getLabelSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3892:1: rule__FieldChoice__MultipleAssignment_7 : ( ( 'multiple' ) ) ;
    public final void rule__FieldChoice__MultipleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3896:1: ( ( ( 'multiple' ) ) )
            // InternalCalculatorForm.g:3897:2: ( ( 'multiple' ) )
            {
            // InternalCalculatorForm.g:3897:2: ( ( 'multiple' ) )
            // InternalCalculatorForm.g:3898:3: ( 'multiple' )
            {
             before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            // InternalCalculatorForm.g:3899:3: ( 'multiple' )
            // InternalCalculatorForm.g:3900:4: 'multiple'
            {
             before(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 

            }

             after(grammarAccess.getFieldChoiceAccess().getMultipleMultipleKeyword_7_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3911:1: rule__FieldChoice__NotdisplayedAssignment_8 : ( ( 'notdisplayed' ) ) ;
    public final void rule__FieldChoice__NotdisplayedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3915:1: ( ( ( 'notdisplayed' ) ) )
            // InternalCalculatorForm.g:3916:2: ( ( 'notdisplayed' ) )
            {
            // InternalCalculatorForm.g:3916:2: ( ( 'notdisplayed' ) )
            // InternalCalculatorForm.g:3917:3: ( 'notdisplayed' )
            {
             before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            // InternalCalculatorForm.g:3918:3: ( 'notdisplayed' )
            // InternalCalculatorForm.g:3919:4: 'notdisplayed'
            {
             before(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 

            }

             after(grammarAccess.getFieldChoiceAccess().getNotdisplayedNotdisplayedKeyword_8_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3930:1: rule__FieldChoice__ReadonlyAssignment_9 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoice__ReadonlyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3934:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:3935:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:3935:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:3936:3: ( 'readonly' )
            {
             before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            // InternalCalculatorForm.g:3937:3: ( 'readonly' )
            // InternalCalculatorForm.g:3938:4: 'readonly'
            {
             before(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 

            }

             after(grammarAccess.getFieldChoiceAccess().getReadonlyReadonlyKeyword_9_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3949:1: rule__FieldChoice__RequiredAssignment_10 : ( ( 'required' ) ) ;
    public final void rule__FieldChoice__RequiredAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3953:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:3954:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:3954:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:3955:3: ( 'required' )
            {
             before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            // InternalCalculatorForm.g:3956:3: ( 'required' )
            // InternalCalculatorForm.g:3957:4: 'required'
            {
             before(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 

            }

             after(grammarAccess.getFieldChoiceAccess().getRequiredRequiredKeyword_10_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3968:1: rule__FieldChoice__ValueAssignment_11_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoice__ValueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3972:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:3973:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:3973:2: ( RULE_STRING )
            // InternalCalculatorForm.g:3974:3: RULE_STRING
            {
             before(grammarAccess.getFieldChoiceAccess().getValueSTRINGTerminalRuleCall_11_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceAccess().getValueSTRINGTerminalRuleCall_11_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3983:1: rule__FieldChoice__OptionsAssignment_12_1 : ( ruleFieldChoiceOption ) ;
    public final void rule__FieldChoice__OptionsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:3987:1: ( ( ruleFieldChoiceOption ) )
            // InternalCalculatorForm.g:3988:2: ( ruleFieldChoiceOption )
            {
            // InternalCalculatorForm.g:3988:2: ( ruleFieldChoiceOption )
            // InternalCalculatorForm.g:3989:3: ruleFieldChoiceOption
            {
             before(grammarAccess.getFieldChoiceAccess().getOptionsFieldChoiceOptionParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldChoiceOption();

            state._fsp--;

             after(grammarAccess.getFieldChoiceAccess().getOptionsFieldChoiceOptionParserRuleCall_12_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:3998:1: rule__FieldChoiceOption__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4002:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4003:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4003:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4004:3: RULE_STRING
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4013:1: rule__FieldChoiceOption__AutofocusAssignment_2 : ( ( 'autofocus' ) ) ;
    public final void rule__FieldChoiceOption__AutofocusAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4017:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:4018:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:4018:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:4019:3: ( 'autofocus' )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            // InternalCalculatorForm.g:4020:3: ( 'autofocus' )
            // InternalCalculatorForm.g:4021:4: 'autofocus'
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getAutofocusAutofocusKeyword_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4032:1: rule__FieldChoiceOption__CheckedAssignment_3 : ( ( 'checked' ) ) ;
    public final void rule__FieldChoiceOption__CheckedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4036:1: ( ( ( 'checked' ) ) )
            // InternalCalculatorForm.g:4037:2: ( ( 'checked' ) )
            {
            // InternalCalculatorForm.g:4037:2: ( ( 'checked' ) )
            // InternalCalculatorForm.g:4038:3: ( 'checked' )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            // InternalCalculatorForm.g:4039:3: ( 'checked' )
            // InternalCalculatorForm.g:4040:4: 'checked'
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getCheckedCheckedKeyword_3_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4051:1: rule__FieldChoiceOption__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__FieldChoiceOption__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4055:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:4056:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:4056:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:4057:3: ( 'disabled' )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            // InternalCalculatorForm.g:4058:3: ( 'disabled' )
            // InternalCalculatorForm.g:4059:4: 'disabled'
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getDisabledDisabledKeyword_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4070:1: rule__FieldChoiceOption__ReadonlyAssignment_5 : ( ( 'readonly' ) ) ;
    public final void rule__FieldChoiceOption__ReadonlyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4074:1: ( ( ( 'readonly' ) ) )
            // InternalCalculatorForm.g:4075:2: ( ( 'readonly' ) )
            {
            // InternalCalculatorForm.g:4075:2: ( ( 'readonly' ) )
            // InternalCalculatorForm.g:4076:3: ( 'readonly' )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            // InternalCalculatorForm.g:4077:3: ( 'readonly' )
            // InternalCalculatorForm.g:4078:4: 'readonly'
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getReadonlyReadonlyKeyword_5_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4089:1: rule__FieldChoiceOption__RequiredAssignment_6 : ( ( 'required' ) ) ;
    public final void rule__FieldChoiceOption__RequiredAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4093:1: ( ( ( 'required' ) ) )
            // InternalCalculatorForm.g:4094:2: ( ( 'required' ) )
            {
            // InternalCalculatorForm.g:4094:2: ( ( 'required' ) )
            // InternalCalculatorForm.g:4095:3: ( 'required' )
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            // InternalCalculatorForm.g:4096:3: ( 'required' )
            // InternalCalculatorForm.g:4097:4: 'required'
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 

            }

             after(grammarAccess.getFieldChoiceOptionAccess().getRequiredRequiredKeyword_6_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4108:1: rule__FieldChoiceOption__ValueAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__FieldChoiceOption__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4112:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4113:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4113:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4114:3: RULE_STRING
            {
             before(grammarAccess.getFieldChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4123:1: rule__Group__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4127:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4128:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4128:2: ( RULE_ID )
            // InternalCalculatorForm.g:4129:3: RULE_ID
            {
             before(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4138:1: rule__Group__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Group__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4142:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4143:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4143:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4144:3: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGroupAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4153:1: rule__Group__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Group__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4157:1: ( ( ruleField ) )
            // InternalCalculatorForm.g:4158:2: ( ruleField )
            {
            // InternalCalculatorForm.g:4158:2: ( ruleField )
            // InternalCalculatorForm.g:4159:3: ruleField
            {
             before(grammarAccess.getGroupAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4168:1: rule__Page__ChildsAssignment_2 : ( rulePageChild ) ;
    public final void rule__Page__ChildsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4172:1: ( ( rulePageChild ) )
            // InternalCalculatorForm.g:4173:2: ( rulePageChild )
            {
            // InternalCalculatorForm.g:4173:2: ( rulePageChild )
            // InternalCalculatorForm.g:4174:3: rulePageChild
            {
             before(grammarAccess.getPageAccess().getChildsPageChildParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePageChild();

            state._fsp--;

             after(grammarAccess.getPageAccess().getChildsPageChildParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4183:1: rule__ButtonSubmit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ButtonSubmit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4187:1: ( ( RULE_ID ) )
            // InternalCalculatorForm.g:4188:2: ( RULE_ID )
            {
            // InternalCalculatorForm.g:4188:2: ( RULE_ID )
            // InternalCalculatorForm.g:4189:3: RULE_ID
            {
             before(grammarAccess.getButtonSubmitAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonSubmitAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4198:1: rule__ButtonSubmit__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4202:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4203:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4203:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4204:3: RULE_STRING
            {
             before(grammarAccess.getButtonSubmitAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonSubmitAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4213:1: rule__ButtonSubmit__AutofocusAssignment_3 : ( ( 'autofocus' ) ) ;
    public final void rule__ButtonSubmit__AutofocusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4217:1: ( ( ( 'autofocus' ) ) )
            // InternalCalculatorForm.g:4218:2: ( ( 'autofocus' ) )
            {
            // InternalCalculatorForm.g:4218:2: ( ( 'autofocus' ) )
            // InternalCalculatorForm.g:4219:3: ( 'autofocus' )
            {
             before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            // InternalCalculatorForm.g:4220:3: ( 'autofocus' )
            // InternalCalculatorForm.g:4221:4: 'autofocus'
            {
             before(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 

            }

             after(grammarAccess.getButtonSubmitAccess().getAutofocusAutofocusKeyword_3_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4232:1: rule__ButtonSubmit__DisabledAssignment_4 : ( ( 'disabled' ) ) ;
    public final void rule__ButtonSubmit__DisabledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4236:1: ( ( ( 'disabled' ) ) )
            // InternalCalculatorForm.g:4237:2: ( ( 'disabled' ) )
            {
            // InternalCalculatorForm.g:4237:2: ( ( 'disabled' ) )
            // InternalCalculatorForm.g:4238:3: ( 'disabled' )
            {
             before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            // InternalCalculatorForm.g:4239:3: ( 'disabled' )
            // InternalCalculatorForm.g:4240:4: 'disabled'
            {
             before(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 

            }

             after(grammarAccess.getButtonSubmitAccess().getDisabledDisabledKeyword_4_0()); 

            }


            }

        }
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
    // InternalCalculatorForm.g:4251:1: rule__ButtonSubmit__ValueAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ButtonSubmit__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalculatorForm.g:4255:1: ( ( RULE_STRING ) )
            // InternalCalculatorForm.g:4256:2: ( RULE_STRING )
            {
            // InternalCalculatorForm.g:4256:2: ( RULE_STRING )
            // InternalCalculatorForm.g:4257:3: RULE_STRING
            {
             before(grammarAccess.getButtonSubmitAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonSubmitAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003C08802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000007C007000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000CC053000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000002A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000108104000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008012000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000002FC017000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000026C004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002428800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002408802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002C28800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002C08802L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C004000L});

}