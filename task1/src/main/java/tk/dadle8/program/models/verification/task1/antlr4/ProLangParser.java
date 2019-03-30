package tk.dadle8.program.models.verification.task1.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProLangParser extends Parser {
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
		RULE_ifexpr = 9, RULE_ifStatement = 10, RULE_elseStatement = 11, RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"argDef", "built", "lit", "source", "sourceItem", "funcDef", "funcSignature", 
			"typeRef", "statement", "ifexpr", "ifStatement", "elseStatement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'bool'", "'byte'", "'int'", "'uint'", "'long'", "'ulong'", 
			"'char'", "'string'", "'function'", "'end'", "'('", "','", "')'", "'dim'", 
			"'if'", "'while'", "'wend'", "'do'", "'loop'", "'until'", "'break'", 
			"';'", "'then'", "'else'", "'[^']'", null, null, null, null, null, null, 
			null, "'!'"
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
	public String getGrammarFileName() { return "ProLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ArgDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ProLangParser.IDENTIFIER, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterArgDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitArgDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitArgDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDefContext argDef() throws RecognitionException {
		ArgDefContext _localctx = new ArgDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_argDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(IDENTIFIER);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(27);
				match(T__0);
				setState(28);
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterBuilt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitBuilt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitBuilt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltContext built() throws RecognitionException {
		BuiltContext _localctx = new BuiltContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_built);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
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
		public TerminalNode BOOL() { return getToken(ProLangParser.BOOL, 0); }
		public TerminalNode STR() { return getToken(ProLangParser.STR, 0); }
		public TerminalNode CHAR() { return getToken(ProLangParser.CHAR, 0); }
		public TerminalNode HEX() { return getToken(ProLangParser.HEX, 0); }
		public TerminalNode BITS() { return getToken(ProLangParser.BITS, 0); }
		public TerminalNode DEC() { return getToken(ProLangParser.DEC, 0); }
		public LitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
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
		public TerminalNode EOF() { return getToken(ProLangParser.EOF, 0); }
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(35);
				sourceItem();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterSourceItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitSourceItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitSourceItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceItemContext sourceItem() throws RecognitionException {
		SourceItemContext _localctx = new SourceItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sourceItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__9);
			setState(46);
			funcSignature();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__10);
			setState(54);
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
		public TerminalNode IDENTIFIER() { return getToken(ProLangParser.IDENTIFIER, 0); }
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterFuncSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitFuncSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitFuncSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncSignatureContext funcSignature() throws RecognitionException {
		FuncSignatureContext _localctx = new FuncSignatureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIER);
			setState(57);
			match(T__11);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(58);
				argDef();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(59);
					match(T__12);
					setState(60);
					argDef();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(68);
			match(T__13);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(69);
				match(T__0);
				setState(70);
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BuiltinContext extends TypeRefContext {
		public BuiltContext built() {
			return getRuleContext(BuiltContext.class,0);
		}
		public BuiltinContext(TypeRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitBuiltin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitBuiltin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CustomContext extends TypeRefContext {
		public TerminalNode IDENTIFIER() { return getToken(ProLangParser.IDENTIFIER, 0); }
		public CustomContext(TypeRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitCustom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitCustom(this);
			else return visitor.visitChildren(this);
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
			setState(76);
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

				setState(74);
				built();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new CustomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
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
					setState(78);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(79);
					match(T__11);
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(80);
						match(T__12);
						}
						}
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(86);
					match(T__13);
					}
					} 
				}
				setState(91);
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
	public static class StatementExpContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementExpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterStatementExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitStatementExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitStatementExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementVarContext extends StatementContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ProLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ProLangParser.IDENTIFIER, i);
		}
		public StatementVarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterStatementVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitStatementVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitStatementVar(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterStatementDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitStatementDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitStatementDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBreakContext extends StatementContext {
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementIfContext extends StatementContext {
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				_localctx = new StatementVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__14);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(93);
					match(IDENTIFIER);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(94);
						match(T__12);
						setState(95);
						match(IDENTIFIER);
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(103);
				match(T__0);
				setState(104);
				typeRef(0);
				}
				break;
			case T__15:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__15);
				setState(106);
				ifexpr();
				setState(107);
				ifStatement();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(108);
					elseStatement();
					}
				}

				setState(111);
				match(T__10);
				setState(112);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__16);
				setState(115);
				expr(0);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
					{
					{
					setState(116);
					statement();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new StatementDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(T__18);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
					{
					{
					setState(125);
					statement();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__19);
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				expr(0);
				}
				break;
			case T__21:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(T__21);
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
				_localctx = new StatementExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				expr(0);
				setState(136);
				match(T__22);
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

	public static class IfexprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterIfexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitIfexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr(0);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__23);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
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

	public static class ElseStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__24);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
				{
				{
				setState(150);
				statement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public TerminalNode BINOP() { return getToken(ProLangParser.BINOP, 0); }
		public BinaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnariContext extends ExprContext {
		public TerminalNode UNOP() { return getToken(ProLangParser.UNOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnariContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterUnari(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitUnari(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitUnari(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlaceContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(ProLangParser.IDENTIFIER, 0); }
		public PlaceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitPlace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitPlace(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterCallOrIndexer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitCallOrIndexer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitCallOrIndexer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralContext extends ExprContext {
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public LiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProLangListener ) ((ProLangListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProLangVisitor ) return ((ProLangVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNOP:
				{
				_localctx = new UnariContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				match(UNOP);
				setState(158);
				expr(5);
				}
				break;
			case T__11:
				{
				_localctx = new BracesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__11);
				setState(160);
				expr(0);
				setState(161);
				match(T__13);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new PlaceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
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
				setState(164);
				lit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
						match(BINOP);
						setState(169);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new CallOrIndexerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(T__11);
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << CHAR) | (1L << HEX) | (1L << BITS) | (1L << BOOL) | (1L << DEC) | (1L << IDENTIFIER) | (1L << STR) | (1L << UNOP))) != 0)) {
							{
							setState(172);
							expr(0);
							setState(177);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(173);
								match(T__12);
								setState(174);
								expr(0);
								}
								}
								setState(179);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(182);
						match(T__13);
						}
						break;
					}
					} 
				}
				setState(187);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\4\3\4\3\5"+
		"\7\5\'\n\5\f\5\16\5*\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\63\n\7\f\7\16"+
		"\7\66\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b@\n\b\f\b\16\bC\13\b\5\b"+
		"E\n\b\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\5\tO\n\t\3\t\3\t\3\t\7\tT\n\t\f"+
		"\t\16\tW\13\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\n\3\n\7\nc\n\n\f\n"+
		"\16\nf\13\n\5\nh\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\n\3\n\3\n\3\n\7\n\u0081\n\n\f\n\16"+
		"\n\u0084\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\f"+
		"\3\f\7\f\u0093\n\f\f\f\16\f\u0096\13\f\3\r\3\r\7\r\u009a\n\r\f\r\16\r"+
		"\u009d\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a8\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b2\n\16\f\16\16\16"+
		"\u00b5\13\16\5\16\u00b7\n\16\3\16\7\16\u00ba\n\16\f\16\16\16\u00bd\13"+
		"\16\3\16\2\4\20\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\4\13\4"+
		"\2\34 \"\"\4\2\23\23\27\27\2\u00cd\2\34\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2"+
		"\b(\3\2\2\2\n-\3\2\2\2\f/\3\2\2\2\16:\3\2\2\2\20N\3\2\2\2\22\u008c\3\2"+
		"\2\2\24\u008e\3\2\2\2\26\u0090\3\2\2\2\30\u0097\3\2\2\2\32\u00a7\3\2\2"+
		"\2\34\37\7!\2\2\35\36\7\3\2\2\36 \5\20\t\2\37\35\3\2\2\2\37 \3\2\2\2 "+
		"\3\3\2\2\2!\"\t\2\2\2\"\5\3\2\2\2#$\t\3\2\2$\7\3\2\2\2%\'\5\n\6\2&%\3"+
		"\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\2\2\3,\t"+
		"\3\2\2\2-.\5\f\7\2.\13\3\2\2\2/\60\7\f\2\2\60\64\5\16\b\2\61\63\5\22\n"+
		"\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2"+
		"\2\66\64\3\2\2\2\678\7\r\2\289\7\f\2\29\r\3\2\2\2:;\7!\2\2;D\7\16\2\2"+
		"<A\5\2\2\2=>\7\17\2\2>@\5\2\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2"+
		"\2BE\3\2\2\2CA\3\2\2\2D<\3\2\2\2DE\3\2\2\2EF\3\2\2\2FI\7\20\2\2GH\7\3"+
		"\2\2HJ\5\20\t\2IG\3\2\2\2IJ\3\2\2\2J\17\3\2\2\2KL\b\t\1\2LO\5\4\3\2MO"+
		"\7!\2\2NK\3\2\2\2NM\3\2\2\2O[\3\2\2\2PQ\f\3\2\2QU\7\16\2\2RT\7\17\2\2"+
		"SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XZ\7\20\2"+
		"\2YP\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^g\7"+
		"\21\2\2_d\7!\2\2`a\7\17\2\2ac\7!\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2g_\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\3\2\2j\u008d"+
		"\5\20\t\2kl\7\22\2\2lm\5\24\13\2mo\5\26\f\2np\5\30\r\2on\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qr\7\r\2\2rs\7\22\2\2s\u008d\3\2\2\2tu\7\23\2\2uy\5\32\16"+
		"\2vx\5\22\n\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2"+
		"\2\2|}\7\24\2\2}\u008d\3\2\2\2~\u0082\7\25\2\2\177\u0081\5\22\n\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\26\2\2\u0086"+
		"\u0087\t\4\2\2\u0087\u008d\5\32\16\2\u0088\u008d\7\30\2\2\u0089\u008a"+
		"\5\32\16\2\u008a\u008b\7\31\2\2\u008b\u008d\3\2\2\2\u008c^\3\2\2\2\u008c"+
		"k\3\2\2\2\u008ct\3\2\2\2\u008c~\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089"+
		"\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\5\32\16\2\u008f\25\3\2\2\2\u0090"+
		"\u0094\7\32\2\2\u0091\u0093\5\22\n\2\u0092\u0091\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009b\7\33\2\2\u0098\u009a\5\22\n\2\u0099\u0098\3"+
		"\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\31\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\b\16\1\2\u009f\u00a0\7$\2"+
		"\2\u00a0\u00a8\5\32\16\7\u00a1\u00a2\7\16\2\2\u00a2\u00a3\5\32\16\2\u00a3"+
		"\u00a4\7\20\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a8\7!\2\2\u00a6\u00a8\5\6"+
		"\4\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00bb\3\2\2\2\u00a9\u00aa\f\b\2\2\u00aa\u00ab\7#"+
		"\2\2\u00ab\u00ba\5\32\16\t\u00ac\u00ad\f\5\2\2\u00ad\u00b6\7\16\2\2\u00ae"+
		"\u00b3\5\32\16\2\u00af\u00b0\7\17\2\2\u00b0\u00b2\5\32\16\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7\20\2\2\u00b9\u00a9\3\2\2\2\u00b9"+
		"\u00ac\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\33\3\2\2\2\u00bd\u00bb\3\2\2\2\30\37(\64ADINU[dgoy\u0082\u008c"+
		"\u0094\u009b\u00a7\u00b3\u00b6\u00b9\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}