// Generated from arithlang/parser/ArithLang.g4 by ANTLR 4.13.2
package arithlang.parser; import static arithlang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArithLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Dot=7, Number=8, Identifier=9, 
		Letter=10, LetterOrDigit=11, AT=12, ELLIPSIS=13, WS=14, Comment=15, Line_Comment=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Dot", "Number", "Identifier", 
			"Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", "Comment", 
			"Line_Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'('", "'+'", "')'", "'*'", "'/'", "'.'", null, null, null, 
			null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Dot", "Number", "Identifier", 
			"Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ArithLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArithLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 10:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0010u\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0004\u00073\b\u0007\u000b\u0007\f\u00074\u0001\b\u0001\b\u0005"+
		"\b9\b\b\n\b\f\b<\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tD\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nL\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0004\u000eW\b\u000e\u000b\u000e\f\u000eX\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fa\b\u000f"+
		"\n\u000f\f\u000fd\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"o\b\u0010\n\u0010\f\u0010r\t\u0010\u0001\u0010\u0001\u0010\u0001b\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0019\f\u001b"+
		"\r\u001d\u000e\u001f\u000f!\u0010\u0001\u0000\u0007\u0004\u0000$$AZ__"+
		"az\u0002\u0000\u0000\u00ff\u8000\ud800\u8000\udbff\u0001\u0000\u8000\ud800"+
		"\u8000\udbff\u0001\u0000\u8000\udc00\u8000\udfff\u0005\u0000$$09AZ__a"+
		"z\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\r|\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001"+
		"\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007)\u0001\u0000"+
		"\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000"+
		"\r/\u0001\u0000\u0000\u0000\u000f2\u0001\u0000\u0000\u0000\u00116\u0001"+
		"\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000"+
		"\u0000\u0017M\u0001\u0000\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001b"+
		"Q\u0001\u0000\u0000\u0000\u001dV\u0001\u0000\u0000\u0000\u001f\\\u0001"+
		"\u0000\u0000\u0000!j\u0001\u0000\u0000\u0000#$\u0005-\u0000\u0000$\u0002"+
		"\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0004\u0001\u0000\u0000"+
		"\u0000\'(\u0005+\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005)\u0000"+
		"\u0000*\b\u0001\u0000\u0000\u0000+,\u0005*\u0000\u0000,\n\u0001\u0000"+
		"\u0000\u0000-.\u0005/\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005."+
		"\u0000\u00000\u000e\u0001\u0000\u0000\u000013\u0003\u0017\u000b\u0000"+
		"21\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u00005\u0010\u0001\u0000\u0000\u00006:\u0003"+
		"\u0013\t\u000079\u0003\u0015\n\u000087\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";\u0012\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=D\u0007\u0000"+
		"\u0000\u0000>?\b\u0001\u0000\u0000?D\u0004\t\u0000\u0000@A\u0007\u0002"+
		"\u0000\u0000AB\u0007\u0003\u0000\u0000BD\u0004\t\u0001\u0000C=\u0001\u0000"+
		"\u0000\u0000C>\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000D\u0014"+
		"\u0001\u0000\u0000\u0000EL\u0007\u0004\u0000\u0000FG\b\u0001\u0000\u0000"+
		"GL\u0004\n\u0002\u0000HI\u0007\u0002\u0000\u0000IJ\u0007\u0003\u0000\u0000"+
		"JL\u0004\n\u0003\u0000KE\u0001\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000"+
		"KH\u0001\u0000\u0000\u0000L\u0016\u0001\u0000\u0000\u0000MN\u000209\u0000"+
		"N\u0018\u0001\u0000\u0000\u0000OP\u0005@\u0000\u0000P\u001a\u0001\u0000"+
		"\u0000\u0000QR\u0005.\u0000\u0000RS\u0005.\u0000\u0000ST\u0005.\u0000"+
		"\u0000T\u001c\u0001\u0000\u0000\u0000UW\u0007\u0005\u0000\u0000VU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0006\u000e\u0000"+
		"\u0000[\u001e\u0001\u0000\u0000\u0000\\]\u0005/\u0000\u0000]^\u0005*\u0000"+
		"\u0000^b\u0001\u0000\u0000\u0000_a\t\u0000\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005"+
		"*\u0000\u0000fg\u0005/\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\u000f"+
		"\u0000\u0000i \u0001\u0000\u0000\u0000jk\u0005/\u0000\u0000kl\u0005/\u0000"+
		"\u0000lp\u0001\u0000\u0000\u0000mo\b\u0006\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0006"+
		"\u0010\u0000\u0000t\"\u0001\u0000\u0000\u0000\b\u00004:CKXbp\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}