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
		T__0=1, T__1=2, T__2=3, T__3=4, Dot=5, P=6, N=7, Z=8, U=9, Identifier=10, 
		Letter=11, LetterOrDigit=12, AT=13, ELLIPSIS=14, WS=15, Comment=16, Line_Comment=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "Dot", "P", "N", "Z", "U", "Identifier", 
			"Letter", "LetterOrDigit", "DIGIT", "AT", "ELLIPSIS", "WS", "Comment", 
			"Line_Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'+'", "')'", "'*'", "'.'", "'p'", "'n'", "'z'", "'u'", 
			null, null, null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Dot", "P", "N", "Z", "U", "Identifier", 
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
		case 10:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 11:
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
		"\u0004\u0000\u0011v\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\t:\b\t\n\t\f\t=\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\nE\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bM\b\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f"+
		"X\b\u000f\u000b\u000f\f\u000fY\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010b\b\u0010\n\u0010\f\u0010e\t"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011p\b\u0011\n\u0011"+
		"\f\u0011s\t\u0011\u0001\u0011\u0001\u0011\u0001c\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\u0000\u001b\r\u001d\u000e"+
		"\u001f\u000f!\u0010#\u0011\u0001\u0000\u0007\u0004\u0000$$AZ__az\u0002"+
		"\u0000\u0000\u00ff\u8000\ud800\u8000\udbff\u0001\u0000\u8000\ud800\u8000"+
		"\udbff\u0001\u0000\u8000\udc00\u8000\udfff\u0005\u0000$$09AZ__az\u0003"+
		"\u0000\t\n\f\r  \u0002\u0000\n\n\r\r|\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000"+
		"\u0007+\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b/\u0001"+
		"\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000"+
		"\u0000\u00115\u0001\u0000\u0000\u0000\u00137\u0001\u0000\u0000\u0000\u0015"+
		"D\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019N\u0001"+
		"\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000"+
		"\u0000\u001fW\u0001\u0000\u0000\u0000!]\u0001\u0000\u0000\u0000#k\u0001"+
		"\u0000\u0000\u0000%&\u0005(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000"+
		"\'(\u0005+\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005)\u0000\u0000"+
		"*\u0006\u0001\u0000\u0000\u0000+,\u0005*\u0000\u0000,\b\u0001\u0000\u0000"+
		"\u0000-.\u0005.\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005p\u0000"+
		"\u00000\f\u0001\u0000\u0000\u000012\u0005n\u0000\u00002\u000e\u0001\u0000"+
		"\u0000\u000034\u0005z\u0000\u00004\u0010\u0001\u0000\u0000\u000056\u0005"+
		"u\u0000\u00006\u0012\u0001\u0000\u0000\u00007;\u0003\u0015\n\u00008:\u0003"+
		"\u0017\u000b\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0014\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>E\u0007\u0000\u0000\u0000?@\b\u0001"+
		"\u0000\u0000@E\u0004\n\u0000\u0000AB\u0007\u0002\u0000\u0000BC\u0007\u0003"+
		"\u0000\u0000CE\u0004\n\u0001\u0000D>\u0001\u0000\u0000\u0000D?\u0001\u0000"+
		"\u0000\u0000DA\u0001\u0000\u0000\u0000E\u0016\u0001\u0000\u0000\u0000"+
		"FM\u0007\u0004\u0000\u0000GH\b\u0001\u0000\u0000HM\u0004\u000b\u0002\u0000"+
		"IJ\u0007\u0002\u0000\u0000JK\u0007\u0003\u0000\u0000KM\u0004\u000b\u0003"+
		"\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LI\u0001\u0000"+
		"\u0000\u0000M\u0018\u0001\u0000\u0000\u0000NO\u000209\u0000O\u001a\u0001"+
		"\u0000\u0000\u0000PQ\u0005@\u0000\u0000Q\u001c\u0001\u0000\u0000\u0000"+
		"RS\u0005.\u0000\u0000ST\u0005.\u0000\u0000TU\u0005.\u0000\u0000U\u001e"+
		"\u0001\u0000\u0000\u0000VX\u0007\u0005\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006\u000f\u0000\u0000\\ \u0001"+
		"\u0000\u0000\u0000]^\u0005/\u0000\u0000^_\u0005*\u0000\u0000_c\u0001\u0000"+
		"\u0000\u0000`b\t\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005*\u0000\u0000gh\u0005"+
		"/\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0006\u0010\u0000\u0000j\"\u0001"+
		"\u0000\u0000\u0000kl\u0005/\u0000\u0000lm\u0005/\u0000\u0000mq\u0001\u0000"+
		"\u0000\u0000np\b\u0006\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0006\u0011\u0000\u0000"+
		"u$\u0001\u0000\u0000\u0000\u0007\u0000;DLYcq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}