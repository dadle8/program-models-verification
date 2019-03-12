// Generated from Task1.g4 by ANTLR 4.7.2

package tk.dadle8.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, CHAR=26, HEX=27, BITS=28, BOOL=29, DEC=30, IDENTIFIER=31, STR=32, 
		BINOP=33, UNOP=34, WS=35, COMMENT=36;
	public static final int
		RULE_argDef = 0, RULE_built = 1, RULE_lit = 2, RULE_source = 3, RULE_sourceItem = 4, 
		RULE_funcDef = 5, RULE_funcSignature = 6, RULE_typeRef = 7, RULE_statement = 8, 
		RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"argDef", "built", "lit", "source", "sourceItem", "funcDef", "funcSignature", 
			"typeRef", "statement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'bool'", "'byte'", "'int'", "'uint'", "'long'", "'ulong'", 
			"'char'", "'string'", "'function'", "'end'", "'('", "','", "')'", "'dim'", 
			"'if'", "'then'", "'else'", "'while'", "'wend'", "'do'", "'loop'", "'until'", 
			"'break'", "';'", "'[^']'", null, null, null, null, null, null, null, 
			"'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "CHAR", "HEX", "BITS", "BOOL", "DEC", "IDENTIFIER", "STR", 
			"BINOP", "UNOP", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Task1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Task1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ArgDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Task1Parser.IDENTIFIER, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterArgDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitArgDef(this);
		}
	}

	public final ArgDefContext argDef() throws RecognitionException {
		ArgDefContext _localctx = new ArgDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_argDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(IDENTIFIER);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(21);
				match(T__0);
				setState(22);
				typeRef(0);
				}
			}

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

	public static class BuiltContext extends ParserRuleContext {
		public BuiltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBuilt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBuilt(this);
		}
	}

	public final BuiltContext built() throws RecognitionException {
		BuiltContext _localctx = new BuiltContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_built);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LitContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(Task1Parser.BOOL, 0); }
		public TerminalNode STR() { return getToken(Task1Parser.STR, 0); }
		public TerminalNode CHAR() { return getToken(Task1Parser.CHAR, 0); }
		public TerminalNode HEX() { return getToken(Task1Parser.HEX, 0); }
		public TerminalNode BITS() { return getToken(Task1Parser.BITS, 0); }
		public TerminalNode DEC() { return getToken(Task1Parser.DEC, 0); }
		public LitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitLit(this);
		}
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << STR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Task1Parser.EOF, 0); }
		public List<SourceItemContext> sourceItem() {
			return getRuleContexts(SourceItemContext.class);
		}
		public SourceItemContext sourceItem(int i) {
			return getRuleContext(SourceItemContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(29);
				sourceItem();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
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

	public static class SourceItemContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public SourceItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterSourceItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitSourceItem(this);
		}
	}

	public final SourceItemContext sourceItem() throws RecognitionException {
		SourceItemContext _localctx = new SourceItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sourceItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			funcDef();
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncSignatureContext funcSignature() {
			return getRuleContext(FuncSignatureContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitFuncDef(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__9);
			setState(40);
			funcSignature();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
				{
				{
				setState(41);
				statement();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(T__10);
			setState(48);
			match(T__9);
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

	public static class FuncSignatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Task1Parser.IDENTIFIER, 0); }
		public List<ArgDefContext> argDef() {
			return getRuleContexts(ArgDefContext.class);
		}
		public ArgDefContext argDef(int i) {
			return getRuleContext(ArgDefContext.class,i);
		}
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public FuncSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterFuncSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitFuncSignature(this);
		}
	}

	public final FuncSignatureContext funcSignature() throws RecognitionException {
		FuncSignatureContext _localctx = new FuncSignatureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IDENTIFIER);
			setState(51);
			match(T__11);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(52);
				argDef();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(53);
					match(T__12);
					setState(54);
					argDef();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(62);
			match(T__13);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(63);
				match(T__0);
				setState(64);
				typeRef(0);
				}
			}

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

	public static class TypeRefContext extends ParserRuleContext {
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
	 
		public TypeRefContext() { }
		public void copyFrom(TypeRefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayContext extends TypeRefContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArrayContext(TypeRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitArray(this);
		}
	}
	public static class BuiltinContext extends TypeRefContext {
		public BuiltContext built() {
			return getRuleContext(BuiltContext.class,0);
		}
		public BuiltinContext(TypeRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBuiltin(this);
		}
	}
	public static class CustomContext extends TypeRefContext {
		public TerminalNode IDENTIFIER() { return getToken(Task1Parser.IDENTIFIER, 0); }
		public CustomContext(TypeRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitCustom(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		return typeRef(0);
	}

	private TypeRefContext typeRef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeRefContext _localctx = new TypeRefContext(_ctx, _parentState);
		TypeRefContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_typeRef, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				{
				_localctx = new BuiltinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				built();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new CustomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayContext(new TypeRefContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeRef);
					setState(72);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(73);
					match(T__11);
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(74);
						match(T__12);
						}
						}
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(80);
					match(T__13);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementVarContext extends StatementContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Task1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Task1Parser.IDENTIFIER, i);
		}
		public StatementVarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterStatementVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitStatementVar(this);
		}
	}
	public static class StatementDoContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementDoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterStatementDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitStatementDo(this);
		}
	}
	public static class StatementBreakContext extends StatementContext {
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitStatementBreak(this);
		}
	}
	public static class ExpContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitExp(this);
		}
	}
	public static class StatementWhileContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitStatementWhile(this);
		}
	}
	public static class StatementIfContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitStatementIf(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new StatementVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__14);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(87);
					match(IDENTIFIER);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(88);
						match(T__12);
						setState(89);
						match(IDENTIFIER);
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(97);
				match(T__0);
				setState(98);
				typeRef(0);
				}
				break;
			case T__15:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__15);
				setState(100);
				expr(0);
				setState(101);
				match(T__16);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
					{
					{
					setState(102);
					statement();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(108);
					match(T__17);
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
						{
						{
						setState(109);
						statement();
						}
						}
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(117);
				match(T__10);
				setState(118);
				match(T__15);
				}
				break;
			case T__18:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T__18);
				setState(121);
				expr(0);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
					{
					{
					setState(122);
					statement();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new StatementDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(T__20);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
					{
					{
					setState(131);
					statement();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__21);
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				expr(0);
				}
				break;
			case T__23:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(T__23);
				}
				break;
			case T__11:
			case CHAR:
			case HEX:
			case BITS:
			case BOOL:
			case DEC:
			case IDENTIFIER:
			case STR:
			case UNOP:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				expr(0);
				setState(142);
				match(T__24);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BINOP() { return getToken(Task1Parser.BINOP, 0); }
		public BinaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBinary(this);
		}
	}
	public static class UnariContext extends ExprContext {
		public TerminalNode UNOP() { return getToken(Task1Parser.UNOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnariContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterUnari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitUnari(this);
		}
	}
	public static class PlaceContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(Task1Parser.IDENTIFIER, 0); }
		public PlaceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitPlace(this);
		}
	}
	public static class CallOrIndexerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallOrIndexerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterCallOrIndexer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitCallOrIndexer(this);
		}
	}
	public static class BracesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBraces(this);
		}
	}
	public static class LiteralContext extends ExprContext {
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public LiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitLiteral(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNOP:
				{
				_localctx = new UnariContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(147);
				match(UNOP);
				setState(148);
				expr(5);
				}
				break;
			case T__11:
				{
				_localctx = new BracesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__11);
				setState(150);
				expr(0);
				setState(151);
				match(T__13);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new PlaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(IDENTIFIER);
				}
				break;
			case CHAR:
			case HEX:
			case BITS:
			case BOOL:
			case DEC:
			case STR:
				{
				_localctx = new LiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				lit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(158);
						match(BINOP);
						setState(159);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new CallOrIndexerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						match(T__11);
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
							{
							setState(162);
							expr(0);
							setState(167);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(163);
								match(T__12);
								setState(164);
								expr(0);
								}
								}
								setState(169);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(172);
						match(T__13);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return typeRef_sempred((TypeRefContext)_localctx, predIndex);
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeRef_sempred(TypeRefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\4\3\4\3\5\7\5!\n\5\f\5\16\5$\13\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7-\n\7\f\7\16\7\60\13\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\5\b?\n\b\3\b\3\b\3\b\5\bD\n\b"+
		"\3\t\3\t\3\t\5\tI\n\t\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\t\7\tT\n\t"+
		"\f\t\16\tW\13\t\3\n\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\5\nb\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\nj\n\n\f\n\16\nm\13\n\3\n\3\n\7\nq\n\n\f\n\16\nt"+
		"\13\n\5\nv\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0087\n\n\f\n\16\n\u008a\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0093\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u009e\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a8\n\13\f"+
		"\13\16\13\u00ab\13\13\5\13\u00ad\n\13\3\13\7\13\u00b0\n\13\f\13\16\13"+
		"\u00b3\13\13\3\13\2\4\20\24\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\4\13\4\2"+
		"\34 \"\"\4\2\25\25\31\31\2\u00c6\2\26\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2"+
		"\2\b\"\3\2\2\2\n\'\3\2\2\2\f)\3\2\2\2\16\64\3\2\2\2\20H\3\2\2\2\22\u0092"+
		"\3\2\2\2\24\u009d\3\2\2\2\26\31\7!\2\2\27\30\7\3\2\2\30\32\5\20\t\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\34\t\2\2\2\34\5\3\2\2\2\35\36"+
		"\t\3\2\2\36\7\3\2\2\2\37!\5\n\6\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#"+
		"\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\2\2\3&\t\3\2\2\2\'(\5\f\7\2(\13\3\2"+
		"\2\2)*\7\f\2\2*.\5\16\b\2+-\5\22\n\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2."+
		"/\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\r\2\2\62\63\7\f\2\2\63\r\3\2"+
		"\2\2\64\65\7!\2\2\65>\7\16\2\2\66;\5\2\2\2\678\7\17\2\28:\5\2\2\29\67"+
		"\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>\66\3\2\2\2"+
		">?\3\2\2\2?@\3\2\2\2@C\7\20\2\2AB\7\3\2\2BD\5\20\t\2CA\3\2\2\2CD\3\2\2"+
		"\2D\17\3\2\2\2EF\b\t\1\2FI\5\4\3\2GI\7!\2\2HE\3\2\2\2HG\3\2\2\2IU\3\2"+
		"\2\2JK\f\3\2\2KO\7\16\2\2LN\7\17\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2PR\3\2\2\2QO\3\2\2\2RT\7\20\2\2SJ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV"+
		"\3\2\2\2V\21\3\2\2\2WU\3\2\2\2Xa\7\21\2\2Y^\7!\2\2Z[\7\17\2\2[]\7!\2\2"+
		"\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2"+
		"\2ab\3\2\2\2bc\3\2\2\2cd\7\3\2\2d\u0093\5\20\t\2ef\7\22\2\2fg\5\24\13"+
		"\2gk\7\23\2\2hj\5\22\n\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lu\3\2"+
		"\2\2mk\3\2\2\2nr\7\24\2\2oq\5\22\n\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2sv\3\2\2\2tr\3\2\2\2un\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\r\2\2xy\7"+
		"\22\2\2y\u0093\3\2\2\2z{\7\25\2\2{\177\5\24\13\2|~\5\22\n\2}|\3\2\2\2"+
		"~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0083\7\26\2\2\u0083\u0093\3\2\2\2\u0084\u0088\7\27"+
		"\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008c\7\30\2\2\u008c\u008d\t\4\2\2\u008d\u0093\5\24\13\2\u008e"+
		"\u0093\7\32\2\2\u008f\u0090\5\24\13\2\u0090\u0091\7\33\2\2\u0091\u0093"+
		"\3\2\2\2\u0092X\3\2\2\2\u0092e\3\2\2\2\u0092z\3\2\2\2\u0092\u0084\3\2"+
		"\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0093\23\3\2\2\2\u0094\u0095"+
		"\b\13\1\2\u0095\u0096\7$\2\2\u0096\u009e\5\24\13\7\u0097\u0098\7\16\2"+
		"\2\u0098\u0099\5\24\13\2\u0099\u009a\7\20\2\2\u009a\u009e\3\2\2\2\u009b"+
		"\u009e\7!\2\2\u009c\u009e\5\6\4\2\u009d\u0094\3\2\2\2\u009d\u0097\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00b1\3\2\2\2\u009f"+
		"\u00a0\f\b\2\2\u00a0\u00a1\7#\2\2\u00a1\u00b0\5\24\13\t\u00a2\u00a3\f"+
		"\5\2\2\u00a3\u00ac\7\16\2\2\u00a4\u00a9\5\24\13\2\u00a5\u00a6\7\17\2\2"+
		"\u00a6\u00a8\5\24\13\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\7\20"+
		"\2\2\u00af\u009f\3\2\2\2\u00af\u00a2\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\25\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\30\31\".;>CHOU^akru\177\u0088\u0092\u009d\u00a9\u00ac\u00af\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}