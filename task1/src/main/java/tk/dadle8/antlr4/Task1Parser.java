// Generated from Task1.g4 by ANTLR 4.7.2

package tk.dadle8.antlr4;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, CHAR=30, HEX=31, BITS=32, 
		BOOL=33, DEC=34, IDENTIFIER=35, STR=36, WS=37, COMMENT=38;
	public static final int
		RULE_argDef = 0, RULE_built = 1, RULE_binOp = 2, RULE_unOp = 3, RULE_lit = 4, 
		RULE_source = 5, RULE_sourceItem = 6, RULE_funcDef = 7, RULE_funcSignature = 8, 
		RULE_typeRef = 9, RULE_statement = 10, RULE_expr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"argDef", "built", "binOp", "unOp", "lit", "source", "sourceItem", "funcDef", 
			"funcSignature", "typeRef", "statement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'bool'", "'byte'", "'int'", "'uint'", "'long'", "'ulong'", 
			"'char'", "'string'", "'>'", "'<'", "'='", "'!'", "'function'", "'end'", 
			"'('", "','", "')'", "'dim'", "'if'", "'then'", "'else'", "'while'", 
			"'wend'", "'do'", "'loop'", "'until'", "'break'", "';'", "'[^']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CHAR", "HEX", "BITS", "BOOL", "DEC", 
			"IDENTIFIER", "STR", "WS", "COMMENT"
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
			setState(24);
			match(IDENTIFIER);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(25);
				match(T__0);
				setState(26);
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
			setState(29);
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

	public static class BinOpContext extends ParserRuleContext {
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitBinOp(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class UnOpContext extends ParserRuleContext {
		public UnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).enterUnOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task1Listener ) ((Task1Listener)listener).exitUnOp(this);
		}
	}

	public final UnOpContext unOp() throws RecognitionException {
		UnOpContext _localctx = new UnOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__12);
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
		enterRule(_localctx, 8, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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
		enterRule(_localctx, 10, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(37);
				sourceItem();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
		enterRule(_localctx, 12, RULE_sourceItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
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
		enterRule(_localctx, 14, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__13);
			setState(48);
			funcSignature();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR))) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__14);
			setState(56);
			match(T__13);
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
		enterRule(_localctx, 16, RULE_funcSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(T__15);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(60);
				argDef();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(61);
					match(T__16);
					setState(62);
					argDef();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(T__17);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(71);
				match(T__0);
				setState(72);
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
		public TerminalNode EOF() { return getToken(Task1Parser.EOF, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_typeRef, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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

				setState(76);
				built();
				setState(77);
				match(EOF);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new CustomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayContext(new TypeRefContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_typeRef);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					match(T__15);
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__16) {
						{
						{
						setState(84);
						match(T__16);
						}
						}
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(90);
					match(T__17);
					}
					}
				}
				setState(95);
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
		public TerminalNode EOF() { return getToken(Task1Parser.EOF, 0); }
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
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new StatementVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__18);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(97);
					match(IDENTIFIER);
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__16) {
						{
						{
						setState(98);
						match(T__16);
						setState(99);
						match(IDENTIFIER);
						}
						}
						setState(104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(107);
				match(T__0);
				setState(108);
				typeRef(0);
				setState(109);
				match(EOF);
				}
				break;
			case T__19:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__19);
				setState(112);
				expr(0);
				setState(113);
				match(T__20);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR))) != 0)) {
					{
					{
					setState(114);
					statement();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(120);
					match(T__21);
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR))) != 0)) {
						{
						{
						setState(121);
						statement();
						}
						}
						setState(126);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(129);
				match(T__14);
				setState(130);
				match(T__19);
				}
				break;
			case T__22:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__22);
				setState(133);
				expr(0);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR))) != 0)) {
					{
					{
					setState(134);
					statement();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new StatementDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__24);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR))) != 0)) {
					{
					{
					setState(143);
					statement();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(T__25);
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				expr(0);
				}
				break;
			case T__27:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(T__27);
				}
				break;
			case T__12:
			case T__15:
			case CHAR:
			case HEX:
			case BITS:
			case BOOL:
			case DEC:
			case IDENTIFIER:
			case STR:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				expr(0);
				setState(154);
				match(T__28);
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
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Task1Parser.EOF, 0); }
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
		public UnOpContext unOp() {
			return getRuleContext(UnOpContext.class,0);
		}
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				_localctx = new UnariContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				unOp();
				setState(160);
				expr(5);
				}
				break;
			case T__15:
				{
				_localctx = new BracesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__15);
				setState(163);
				expr(0);
				setState(164);
				match(T__17);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new PlaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
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
				setState(167);
				lit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(171);
						binOp();
						setState(172);
						expr(0);
						setState(173);
						match(EOF);
						}
						break;
					case 2:
						{
						_localctx = new CallOrIndexerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(176);
						match(T__15);
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__15) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR))) != 0)) {
							{
							setState(177);
							expr(0);
							setState(182);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__16) {
								{
								{
								setState(178);
								match(T__16);
								setState(179);
								expr(0);
								}
								}
								setState(184);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(187);
						match(T__17);
						}
						break;
					}
					} 
				}
				setState(192);
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
		case 9:
			return typeRef_sempred((TypeRefContext)_localctx, predIndex);
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\7\7)\n\7\f\7\16\7,\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t\65\n"+
		"\t\f\t\16\t8\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\nB\n\n\f\n\16\nE\13"+
		"\n\5\nG\n\n\3\n\3\n\3\n\5\nL\n\n\3\13\3\13\3\13\3\13\3\13\5\13S\n\13\3"+
		"\13\3\13\3\13\7\13X\n\13\f\13\16\13[\13\13\3\13\7\13^\n\13\f\13\16\13"+
		"a\13\13\3\f\3\f\3\f\3\f\7\fg\n\f\f\f\16\fj\13\f\5\fl\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\3\f\7\f}\n\f\f\f\16\f\u0080"+
		"\13\f\5\f\u0082\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d"+
		"\13\f\3\f\3\f\3\f\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00ab\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b7\n\r\f\r"+
		"\16\r\u00ba\13\r\5\r\u00bc\n\r\3\r\7\r\u00bf\n\r\f\r\16\r\u00c2\13\r\3"+
		"\r\2\4\24\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2\4\13\3\2\f\16\4"+
		"\2 $&&\4\2\31\31\35\35\2\u00d3\2\32\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b"+
		"#\3\2\2\2\n%\3\2\2\2\f*\3\2\2\2\16/\3\2\2\2\20\61\3\2\2\2\22<\3\2\2\2"+
		"\24R\3\2\2\2\26\u009e\3\2\2\2\30\u00aa\3\2\2\2\32\35\7%\2\2\33\34\7\3"+
		"\2\2\34\36\5\24\13\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \t\2"+
		"\2\2 \5\3\2\2\2!\"\t\3\2\2\"\7\3\2\2\2#$\7\17\2\2$\t\3\2\2\2%&\t\4\2\2"+
		"&\13\3\2\2\2\')\5\16\b\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3"+
		"\2\2\2,*\3\2\2\2-.\7\2\2\3.\r\3\2\2\2/\60\5\20\t\2\60\17\3\2\2\2\61\62"+
		"\7\20\2\2\62\66\5\22\n\2\63\65\5\26\f\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\21\2\2:;\7\20\2\2;"+
		"\21\3\2\2\2<=\7%\2\2=F\7\22\2\2>C\5\2\2\2?@\7\23\2\2@B\5\2\2\2A?\3\2\2"+
		"\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2FG\3\2\2"+
		"\2GH\3\2\2\2HK\7\24\2\2IJ\7\3\2\2JL\5\24\13\2KI\3\2\2\2KL\3\2\2\2L\23"+
		"\3\2\2\2MN\b\13\1\2NO\5\4\3\2OP\7\2\2\3PS\3\2\2\2QS\7%\2\2RM\3\2\2\2R"+
		"Q\3\2\2\2S_\3\2\2\2TU\f\3\2\2UY\7\22\2\2VX\7\23\2\2WV\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7\24\2\2]T\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`\25\3\2\2\2a_\3\2\2\2bk\7\25\2\2ch\7%\2\2d"+
		"e\7\23\2\2eg\7%\2\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2"+
		"jh\3\2\2\2kc\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\3\2\2no\5\24\13\2op\7\2\2"+
		"\3p\u009f\3\2\2\2qr\7\26\2\2rs\5\30\r\2sw\7\27\2\2tv\5\26\f\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u0081\3\2\2\2yw\3\2\2\2z~\7\30\2\2{"+
		"}\5\26\f\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081z\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0084\7\21\2\2\u0084\u0085\7\26\2\2\u0085\u009f\3\2\2\2\u0086"+
		"\u0087\7\31\2\2\u0087\u008b\5\30\r\2\u0088\u008a\5\26\f\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\32\2\2\u008f\u009f\3"+
		"\2\2\2\u0090\u0094\7\33\2\2\u0091\u0093\5\26\f\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\34\2\2\u0098\u0099\t\5\2\2\u0099"+
		"\u009f\5\30\r\2\u009a\u009f\7\36\2\2\u009b\u009c\5\30\r\2\u009c\u009d"+
		"\7\37\2\2\u009d\u009f\3\2\2\2\u009eb\3\2\2\2\u009eq\3\2\2\2\u009e\u0086"+
		"\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009f"+
		"\27\3\2\2\2\u00a0\u00a1\b\r\1\2\u00a1\u00a2\5\b\5\2\u00a2\u00a3\5\30\r"+
		"\7\u00a3\u00ab\3\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\5\30\r\2\u00a6"+
		"\u00a7\7\24\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00ab\7%\2\2\u00a9\u00ab\5\n"+
		"\6\2\u00aa\u00a0\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00c0\3\2\2\2\u00ac\u00ad\f\b\2\2\u00ad\u00ae\5\6"+
		"\4\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\2\2\3\u00b0\u00bf\3\2\2\2\u00b1"+
		"\u00b2\f\5\2\2\u00b2\u00bb\7\22\2\2\u00b3\u00b8\5\30\r\2\u00b4\u00b5\7"+
		"\23\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\7\24\2\2\u00be\u00ac\3\2\2\2\u00be\u00b1\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\31\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\30\35*\66CFKRY_hkw~\u0081\u008b\u0094\u009e\u00aa\u00b8"+
		"\u00bb\u00be\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}