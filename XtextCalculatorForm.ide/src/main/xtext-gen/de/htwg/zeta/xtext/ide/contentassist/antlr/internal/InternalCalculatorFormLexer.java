package de.htwg.zeta.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCalculatorFormLexer extends Lexer {
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

    public InternalCalculatorFormLexer() {;} 
    public InternalCalculatorFormLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCalculatorFormLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCalculatorForm.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:11:7: ( 'form' )
            // InternalCalculatorForm.g:11:9: 'form'
            {
            match("form"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:12:7: ( '{' )
            // InternalCalculatorForm.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:13:7: ( '}' )
            // InternalCalculatorForm.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:14:7: ( 'field' )
            // InternalCalculatorForm.g:14:9: 'field'
            {
            match("field"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:15:7: ( 'label' )
            // InternalCalculatorForm.g:15:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:16:7: ( 'value' )
            // InternalCalculatorForm.g:16:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:17:7: ( 'dropdown' )
            // InternalCalculatorForm.g:17:9: 'dropdown'
            {
            match("dropdown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:18:7: ( 'size' )
            // InternalCalculatorForm.g:18:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:19:7: ( 'option' )
            // InternalCalculatorForm.g:19:9: 'option'
            {
            match("option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:20:7: ( 'text' )
            // InternalCalculatorForm.g:20:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:21:7: ( 'option-group' )
            // InternalCalculatorForm.g:21:9: 'option-group'
            {
            match("option-group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:22:7: ( 'choice' )
            // InternalCalculatorForm.g:22:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:23:7: ( 'group' )
            // InternalCalculatorForm.g:23:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:24:7: ( 'page' )
            // InternalCalculatorForm.g:24:9: 'page'
            {
            match("page"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:25:7: ( 'submit-button' )
            // InternalCalculatorForm.g:25:9: 'submit-button'
            {
            match("submit-button"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:26:7: ( 'calculate' )
            // InternalCalculatorForm.g:26:9: 'calculate'
            {
            match("calculate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:27:7: ( '=' )
            // InternalCalculatorForm.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:28:7: ( '.' )
            // InternalCalculatorForm.g:28:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:29:7: ( '+' )
            // InternalCalculatorForm.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:30:7: ( '-' )
            // InternalCalculatorForm.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:31:7: ( '*' )
            // InternalCalculatorForm.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:32:7: ( '/' )
            // InternalCalculatorForm.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:33:7: ( '!' )
            // InternalCalculatorForm.g:33:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:34:7: ( '(' )
            // InternalCalculatorForm.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:35:7: ( ')' )
            // InternalCalculatorForm.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:36:7: ( 'autofocus' )
            // InternalCalculatorForm.g:36:9: 'autofocus'
            {
            match("autofocus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:37:7: ( 'disabled' )
            // InternalCalculatorForm.g:37:9: 'disabled'
            {
            match("disabled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:38:7: ( 'notdisplayed' )
            // InternalCalculatorForm.g:38:9: 'notdisplayed'
            {
            match("notdisplayed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:39:7: ( 'readonly' )
            // InternalCalculatorForm.g:39:9: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:40:7: ( 'required' )
            // InternalCalculatorForm.g:40:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:41:7: ( 'multiple' )
            // InternalCalculatorForm.g:41:9: 'multiple'
            {
            match("multiple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:42:7: ( 'selected' )
            // InternalCalculatorForm.g:42:9: 'selected'
            {
            match("selected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:43:7: ( 'checked' )
            // InternalCalculatorForm.g:43:9: 'checked'
            {
            match("checked"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6127:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCalculatorForm.g:6127:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCalculatorForm.g:6127:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCalculatorForm.g:6127:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCalculatorForm.g:6127:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCalculatorForm.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6129:10: ( ( '0' .. '9' )+ )
            // InternalCalculatorForm.g:6129:12: ( '0' .. '9' )+
            {
            // InternalCalculatorForm.g:6129:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCalculatorForm.g:6129:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6131:12: ( RULE_INT '.' RULE_INT )
            // InternalCalculatorForm.g:6131:14: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6133:14: ( ( RULE_INT | RULE_FLOAT ) '%' )
            // InternalCalculatorForm.g:6133:16: ( RULE_INT | RULE_FLOAT ) '%'
            {
            // InternalCalculatorForm.g:6133:16: ( RULE_INT | RULE_FLOAT )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalCalculatorForm.g:6133:17: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:6133:26: RULE_FLOAT
                    {
                    mRULE_FLOAT(); 

                    }
                    break;

            }

            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6135:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCalculatorForm.g:6135:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCalculatorForm.g:6135:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCalculatorForm.g:6135:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCalculatorForm.g:6135:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCalculatorForm.g:6135:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCalculatorForm.g:6135:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCalculatorForm.g:6135:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCalculatorForm.g:6135:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCalculatorForm.g:6135:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCalculatorForm.g:6135:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6137:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCalculatorForm.g:6137:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCalculatorForm.g:6137:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCalculatorForm.g:6137:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6139:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCalculatorForm.g:6139:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCalculatorForm.g:6139:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCalculatorForm.g:6139:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCalculatorForm.g:6139:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCalculatorForm.g:6139:41: ( '\\r' )? '\\n'
                    {
                    // InternalCalculatorForm.g:6139:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCalculatorForm.g:6139:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6141:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCalculatorForm.g:6141:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCalculatorForm.g:6141:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCalculatorForm.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCalculatorForm.g:6143:16: ( . )
            // InternalCalculatorForm.g:6143:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCalculatorForm.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ID | RULE_INT | RULE_FLOAT | RULE_PERCENT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=42;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalCalculatorForm.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalCalculatorForm.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalCalculatorForm.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalCalculatorForm.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalCalculatorForm.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalCalculatorForm.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalCalculatorForm.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalCalculatorForm.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalCalculatorForm.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalCalculatorForm.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalCalculatorForm.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalCalculatorForm.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalCalculatorForm.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalCalculatorForm.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalCalculatorForm.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalCalculatorForm.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalCalculatorForm.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalCalculatorForm.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalCalculatorForm.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalCalculatorForm.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalCalculatorForm.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalCalculatorForm.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalCalculatorForm.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalCalculatorForm.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalCalculatorForm.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalCalculatorForm.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalCalculatorForm.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalCalculatorForm.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalCalculatorForm.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalCalculatorForm.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalCalculatorForm.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalCalculatorForm.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalCalculatorForm.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalCalculatorForm.g:1:208: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalCalculatorForm.g:1:216: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalCalculatorForm.g:1:225: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 37 :
                // InternalCalculatorForm.g:1:236: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 38 :
                // InternalCalculatorForm.g:1:249: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // InternalCalculatorForm.g:1:261: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // InternalCalculatorForm.g:1:277: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // InternalCalculatorForm.g:1:293: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // InternalCalculatorForm.g:1:301: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\4\uffff";
    static final String DFA4_minS =
        "\1\60\1\45\2\uffff";
    static final String DFA4_maxS =
        "\2\71\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\1",
            "\1\3\10\uffff\1\2\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "6133:16: ( RULE_INT | RULE_FLOAT )";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\1\43\2\uffff\11\43\5\uffff\1\72\3\uffff\4\43\1\40\1\uffff\1\102\2\40\2\uffff\2\43\3\uffff\15\43\13\uffff\4\43\2\uffff\1\102\3\uffff\25\43\1\163\1\164\5\43\1\172\3\43\1\176\4\43\1\u0083\5\43\2\uffff\1\u0089\1\u008a\1\u008b\2\43\1\uffff\3\43\1\uffff\3\43\1\u0094\1\uffff\5\43\3\uffff\4\43\1\u009f\1\u00a0\2\43\1\uffff\7\43\1\uffff\1\43\3\uffff\1\u00ab\6\43\1\u00b2\1\u00b3\1\u00b4\1\uffff\3\43\1\u00b8\1\u00b9\1\u00ba\3\uffff\1\u00bb\1\u00bc\1\43\5\uffff\2\43\1\u00c0\1\uffff";
    static final String DFA13_eofS =
        "\u00c1\uffff";
    static final String DFA13_minS =
        "\1\0\1\151\2\uffff\2\141\1\151\1\145\1\160\1\145\1\141\1\162\1\141\5\uffff\1\52\3\uffff\1\165\1\157\1\145\1\165\1\101\1\uffff\1\45\2\0\2\uffff\1\162\1\145\3\uffff\1\142\1\154\1\157\1\163\1\172\1\142\1\154\1\164\1\170\1\145\1\154\1\157\1\147\13\uffff\2\164\1\141\1\154\1\uffff\1\60\1\45\3\uffff\1\155\1\154\1\145\1\165\1\160\1\141\1\145\1\155\1\145\1\151\1\164\1\151\2\143\1\165\1\145\1\157\2\144\1\165\1\164\1\45\1\60\1\144\1\154\1\145\1\144\1\142\1\60\1\151\1\143\1\157\1\60\1\143\1\153\1\165\1\160\1\60\1\146\1\151\1\157\2\151\2\uffff\3\60\1\157\1\154\1\uffff\2\164\1\156\1\uffff\2\145\1\154\1\60\1\uffff\1\157\1\163\1\156\1\162\1\160\3\uffff\1\167\1\145\1\55\1\145\1\55\1\60\1\144\1\141\1\uffff\1\143\1\160\1\154\1\145\1\154\1\156\1\144\1\uffff\1\144\3\uffff\1\60\1\164\1\165\1\154\1\171\1\144\1\145\3\60\1\uffff\1\145\1\163\1\141\3\60\3\uffff\2\60\1\171\5\uffff\1\145\1\144\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\2\uffff\2\141\1\162\1\165\1\160\1\145\1\150\1\162\1\141\5\uffff\1\57\3\uffff\1\165\1\157\1\145\1\165\1\172\1\uffff\1\71\2\uffff\2\uffff\1\162\1\145\3\uffff\1\142\1\154\1\157\1\163\1\172\1\142\1\154\1\164\1\170\1\157\1\154\1\157\1\147\13\uffff\2\164\1\161\1\154\1\uffff\2\71\3\uffff\1\155\1\154\1\145\1\165\1\160\1\141\1\145\1\155\1\145\1\151\1\164\1\151\2\143\1\165\1\145\1\157\2\144\1\165\1\164\1\71\1\172\1\144\1\154\1\145\1\144\1\142\1\172\1\151\1\143\1\157\1\172\1\143\1\153\1\165\1\160\1\172\1\146\1\151\1\157\2\151\2\uffff\3\172\1\157\1\154\1\uffff\2\164\1\156\1\uffff\2\145\1\154\1\172\1\uffff\1\157\1\163\1\156\1\162\1\160\3\uffff\1\167\1\145\1\55\1\145\2\172\1\144\1\141\1\uffff\1\143\1\160\1\154\1\145\1\154\1\156\1\144\1\uffff\1\144\3\uffff\1\172\1\164\1\165\1\154\1\171\1\144\1\145\3\172\1\uffff\1\145\1\163\1\141\3\172\3\uffff\2\172\1\171\5\uffff\1\145\1\144\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\11\uffff\1\21\1\22\1\23\1\24\1\25\1\uffff\1\27\1\30\1\31\5\uffff\1\42\3\uffff\1\51\1\52\2\uffff\1\42\1\2\1\3\15\uffff\1\21\1\22\1\23\1\24\1\25\1\47\1\50\1\26\1\27\1\30\1\31\4\uffff\1\43\2\uffff\1\45\1\46\1\51\53\uffff\1\44\1\1\5\uffff\1\10\3\uffff\1\12\4\uffff\1\16\5\uffff\1\4\1\5\1\6\10\uffff\1\15\7\uffff\1\17\1\uffff\1\13\1\11\1\14\12\uffff\1\41\6\uffff\1\7\1\33\1\40\3\uffff\1\35\1\36\1\37\1\20\1\32\3\uffff\1\34";
    static final String DFA13_specialS =
        "\1\2\34\uffff\1\0\1\1\u00a2\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\23\1\35\4\40\1\36\1\24\1\25\1\21\1\17\1\40\1\20\1\16\1\22\12\34\3\40\1\15\3\40\32\33\3\40\1\32\1\33\1\40\1\26\1\33\1\12\1\6\1\33\1\1\1\13\4\33\1\4\1\31\1\27\1\10\1\14\1\33\1\30\1\7\1\11\1\33\1\5\4\33\1\2\1\40\1\3\uff82\40",
            "\1\42\5\uffff\1\41",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\51\10\uffff\1\50",
            "\1\54\3\uffff\1\52\13\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\60\6\uffff\1\57",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\105\10\uffff\1\103\1\uffff\12\104",
            "\0\106",
            "\0\106",
            "",
            "",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\124\11\uffff\1\123",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132\17\uffff\1\133",
            "\1\134",
            "",
            "\12\135",
            "\1\105\10\uffff\1\103\1\uffff\12\104",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\105\12\uffff\12\135",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00bd",
            "",
            "",
            "",
            "",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ID | RULE_INT | RULE_FLOAT | RULE_PERCENT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_29 = input.LA(1);

                        s = -1;
                        if ( ((LA13_29>='\u0000' && LA13_29<='\uFFFF')) ) {s = 70;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_30 = input.LA(1);

                        s = -1;
                        if ( ((LA13_30>='\u0000' && LA13_30<='\uFFFF')) ) {s = 70;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='f') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='l') ) {s = 4;}

                        else if ( (LA13_0=='v') ) {s = 5;}

                        else if ( (LA13_0=='d') ) {s = 6;}

                        else if ( (LA13_0=='s') ) {s = 7;}

                        else if ( (LA13_0=='o') ) {s = 8;}

                        else if ( (LA13_0=='t') ) {s = 9;}

                        else if ( (LA13_0=='c') ) {s = 10;}

                        else if ( (LA13_0=='g') ) {s = 11;}

                        else if ( (LA13_0=='p') ) {s = 12;}

                        else if ( (LA13_0=='=') ) {s = 13;}

                        else if ( (LA13_0=='.') ) {s = 14;}

                        else if ( (LA13_0=='+') ) {s = 15;}

                        else if ( (LA13_0=='-') ) {s = 16;}

                        else if ( (LA13_0=='*') ) {s = 17;}

                        else if ( (LA13_0=='/') ) {s = 18;}

                        else if ( (LA13_0=='!') ) {s = 19;}

                        else if ( (LA13_0=='(') ) {s = 20;}

                        else if ( (LA13_0==')') ) {s = 21;}

                        else if ( (LA13_0=='a') ) {s = 22;}

                        else if ( (LA13_0=='n') ) {s = 23;}

                        else if ( (LA13_0=='r') ) {s = 24;}

                        else if ( (LA13_0=='m') ) {s = 25;}

                        else if ( (LA13_0=='^') ) {s = 26;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='e'||(LA13_0>='h' && LA13_0<='k')||LA13_0=='q'||LA13_0=='u'||(LA13_0>='w' && LA13_0<='z')) ) {s = 27;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 28;}

                        else if ( (LA13_0=='\"') ) {s = 29;}

                        else if ( (LA13_0=='\'') ) {s = 30;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 31;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0==','||(LA13_0>=':' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}