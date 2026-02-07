// Generated from arithlang/parser/ArithLang.g4 by ANTLR 4.13.2
package arithlang.parser; import static arithlang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArithLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Dot=5, P=6, N=7, Z=8, U=9, Identifier=10, 
		Letter=11, LetterOrDigit=12, AT=13, ELLIPSIS=14, WS=15, Comment=16, Line_Comment=17;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_numexp = 2, RULE_addexp = 3, RULE_multexp = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "numexp", "addexp", "multexp"
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

	@Override
	public String getGrammarFileName() { return "ArithLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((ProgramContext)_localctx).e = exp();
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).e.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public NumexpContext n;
		public AddexpContext a;
		public MultexpContext m;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				((ExpContext)_localctx).a = addexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				((ExpContext)_localctx).m = multexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public TerminalNode P() { return getToken(ArithLangParser.P, 0); }
		public TerminalNode N() { return getToken(ArithLangParser.N, 0); }
		public TerminalNode Z() { return getToken(ArithLangParser.Z, 0); }
		public TerminalNode U() { return getToken(ArithLangParser.U, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numexp);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(P);
				 ((NumexpContext)_localctx).ast =  new NumExp("p"); 
				}
				break;
			case N:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(N);
				 ((NumexpContext)_localctx).ast =  new NumExp("n"); 
				}
				break;
			case Z:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(Z);
				 ((NumexpContext)_localctx).ast =  new NumExp("z"); 
				}
				break;
			case U:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(U);
				 ((NumexpContext)_localctx).ast =  new NumExp("u"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddexpContext extends ParserRuleContext {
		public AddExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		AddexpContext _localctx = new AddexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addexp);
		 ((AddexpContext)_localctx).list =  new ArrayList<Exp>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(T__1);
			setState(36);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(38);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(40);
			match(T__2);
			 ((AddexpContext)_localctx).ast =  new AddExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		MultexpContext _localctx = new MultexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multexp);
		 ((MultexpContext)_localctx).list =  new ArrayList<Exp>(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(T__3);
			setState(45);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(47);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(49);
			match(T__2);
			 ((MultexpContext)_localctx).ast =  new MultExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00115\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0017\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u00004\u0000"+
		"\n\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004 "+
		"\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b+\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0006\u0000\uffff"+
		"\uffff\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0003\u0004\u0002"+
		"\u0000\u000e\u000f\u0006\u0001\uffff\uffff\u0000\u000f\u0017\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0003\u0006\u0003\u0000\u0011\u0012\u0006\u0001"+
		"\uffff\uffff\u0000\u0012\u0017\u0001\u0000\u0000\u0000\u0013\u0014\u0003"+
		"\b\u0004\u0000\u0014\u0015\u0006\u0001\uffff\uffff\u0000\u0015\u0017\u0001"+
		"\u0000\u0000\u0000\u0016\r\u0001\u0000\u0000\u0000\u0016\u0010\u0001\u0000"+
		"\u0000\u0000\u0016\u0013\u0001\u0000\u0000\u0000\u0017\u0003\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005\u0006\u0000\u0000\u0019!\u0006\u0002\uffff"+
		"\uffff\u0000\u001a\u001b\u0005\u0007\u0000\u0000\u001b!\u0006\u0002\uffff"+
		"\uffff\u0000\u001c\u001d\u0005\b\u0000\u0000\u001d!\u0006\u0002\uffff"+
		"\uffff\u0000\u001e\u001f\u0005\t\u0000\u0000\u001f!\u0006\u0002\uffff"+
		"\uffff\u0000 \u0018\u0001\u0000\u0000\u0000 \u001a\u0001\u0000\u0000\u0000"+
		" \u001c\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\u0005"+
		"\u0001\u0000\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0005\u0002\u0000"+
		"\u0000$%\u0003\u0002\u0001\u0000%&\u0006\u0003\uffff\uffff\u0000&\'\u0003"+
		"\u0002\u0001\u0000\'(\u0006\u0003\uffff\uffff\u0000()\u0005\u0003\u0000"+
		"\u0000)*\u0006\u0003\uffff\uffff\u0000*\u0007\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0001\u0000\u0000,-\u0005\u0004\u0000\u0000-.\u0003\u0002\u0001"+
		"\u0000./\u0006\u0004\uffff\uffff\u0000/0\u0003\u0002\u0001\u000001\u0006"+
		"\u0004\uffff\uffff\u000012\u0005\u0003\u0000\u000023\u0006\u0004\uffff"+
		"\uffff\u00003\t\u0001\u0000\u0000\u0000\u0002\u0016 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}