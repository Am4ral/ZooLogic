// Generated from F:/Faculdade/Mat�rias/5 periodo/Compiladores/ZooLogic/src/GrammarZooLogic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarZooLogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MAIN=3, FUNC=4, IF=5, ELSE=6, ELIF=7, RET=8, FOR=9, WHILE=10, 
		TIPO=11, AP=12, FP=13, AC=14, FC=15, ASP=16, PV=17, COMEN=18, ESC=19, 
		LER=20, STRING=21, VAR=22, NUM=23, OP_ARIT=24, OP_REL=25, OP_COND=26, 
		OP_ATR=27, OP_CONCAT=28, WS=29;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_mainStmt = 2, RULE_funcDef = 3, RULE_ifStmt = 4, 
		RULE_elifStmt = 5, RULE_elseStmt = 6, RULE_forStmt = 7, RULE_whileStmt = 8, 
		RULE_retStmt = 9, RULE_varDecl = 10, RULE_varAssign = 11, RULE_inputOutput = 12, 
		RULE_stringExpr = 13, RULE_paramList = 14, RULE_param = 15, RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "mainStmt", "funcDef", "ifStmt", "elifStmt", "elseStmt", 
			"forStmt", "whileStmt", "retStmt", "varDecl", "varAssign", "inputOutput", 
			"stringExpr", "paramList", "param", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'()'", "','", "'selva'", "'arvore'", "'cobra'", "'cauda'", "'caudaCobra'", 
			"'desmatamento'", "'formiga'", "'baleia'", null, "'('", "')'", "'{'", 
			"'}'", "'\"'", "';'", "'//'", "'lhama'", "'porco'", null, null, null, 
			null, null, null, "'='", "'++'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MAIN", "FUNC", "IF", "ELSE", "ELIF", "RET", "FOR", 
			"WHILE", "TIPO", "AP", "FP", "AC", "FC", "ASP", "PV", "COMEN", "ESC", 
			"LER", "STRING", "VAR", "NUM", "OP_ARIT", "OP_REL", "OP_COND", "OP_ATR", 
			"OP_CONCAT", "WS"
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
	public String getGrammarFileName() { return "GrammarZooLogic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarZooLogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NInicioContext extends ProgContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NInicioContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new NInicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(34);
				stmt();
				}
				}
				setState(39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public MainStmtContext mainStmt() {
			return getRuleContext(MainStmtContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public InputOutputContext inputOutput() {
			return getRuleContext(InputOutputContext.class,0);
		}
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				mainStmt();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				funcDef();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				ifStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				forStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				whileStmt();
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				retStmt();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				varDecl();
				}
				break;
			case ESC:
			case LER:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				inputOutput();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				varAssign();
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
	public static class MainStmtContext extends ParserRuleContext {
		public MainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStmt; }
	 
		public MainStmtContext() { }
		public void copyFrom(MainStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NMainContext extends MainStmtContext {
		public TerminalNode MAIN() { return getToken(GrammarZooLogicParser.MAIN, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NMainContext(MainStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStmtContext mainStmt() throws RecognitionException {
		MainStmtContext _localctx = new MainStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainStmt);
		int _la;
		try {
			_localctx = new NMainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(MAIN);
			setState(52);
			match(T__0);
			setState(53);
			match(AC);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(54);
				stmt();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(FC);
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
	public static class FuncDefContext extends ParserRuleContext {
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	 
		public FuncDefContext() { }
		public void copyFrom(FuncDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NFuncaoContext extends FuncDefContext {
		public TerminalNode FUNC() { return getToken(GrammarZooLogicParser.FUNC, 0); }
		public TerminalNode TIPO() { return getToken(GrammarZooLogicParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NFuncaoContext(FuncDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDef);
		int _la;
		try {
			_localctx = new NFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(FUNC);
			setState(63);
			match(TIPO);
			setState(64);
			match(VAR);
			setState(65);
			match(AP);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(66);
				paramList();
				}
			}

			setState(69);
			match(FP);
			setState(70);
			match(AC);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(71);
				stmt();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(FC);
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
	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NIfContext extends IfStmtContext {
		public TerminalNode IF() { return getToken(GrammarZooLogicParser.IF, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<ElifStmtContext> elifStmt() {
			return getRuleContexts(ElifStmtContext.class);
		}
		public ElifStmtContext elifStmt(int i) {
			return getRuleContext(ElifStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public NIfContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStmt);
		int _la;
		try {
			_localctx = new NIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IF);
			setState(80);
			match(AP);
			setState(81);
			expr(0);
			setState(82);
			match(FP);
			setState(83);
			match(AC);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(84);
				stmt();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(FC);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(91);
				elifStmt();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(97);
				elseStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifStmtContext extends ParserRuleContext {
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	 
		public ElifStmtContext() { }
		public void copyFrom(ElifStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NElseIfContext extends ElifStmtContext {
		public TerminalNode ELIF() { return getToken(GrammarZooLogicParser.ELIF, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NElseIfContext(ElifStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elifStmt);
		int _la;
		try {
			_localctx = new NElseIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ELIF);
			setState(101);
			match(AP);
			setState(102);
			expr(0);
			setState(103);
			match(FP);
			setState(104);
			match(AC);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(105);
				stmt();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(FC);
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
	public static class ElseStmtContext extends ParserRuleContext {
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	 
		public ElseStmtContext() { }
		public void copyFrom(ElseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NElseContext extends ElseStmtContext {
		public TerminalNode ELSE() { return getToken(GrammarZooLogicParser.ELSE, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NElseContext(ElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStmt);
		int _la;
		try {
			_localctx = new NElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ELSE);
			setState(114);
			match(AC);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(115);
				stmt();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(FC);
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
	public static class ForStmtContext extends ParserRuleContext {
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	 
		public ForStmtContext() { }
		public void copyFrom(ForStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NFORContext extends ForStmtContext {
		public TerminalNode FOR() { return getToken(GrammarZooLogicParser.FOR, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NFORContext(ForStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNFOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNFOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNFOR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStmt);
		int _la;
		try {
			_localctx = new NFORContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FOR);
			setState(124);
			match(AP);
			setState(125);
			varDecl();
			setState(126);
			expr(0);
			setState(127);
			match(PV);
			setState(128);
			expr(0);
			setState(129);
			match(FP);
			setState(130);
			match(AC);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(131);
				stmt();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(FC);
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
	public static class WhileStmtContext extends ParserRuleContext {
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	 
		public WhileStmtContext() { }
		public void copyFrom(WhileStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NWhileContext extends WhileStmtContext {
		public TerminalNode WHILE() { return getToken(GrammarZooLogicParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public NWhileContext(WhileStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStmt);
		int _la;
		try {
			_localctx = new NWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHILE);
			setState(140);
			match(AP);
			setState(141);
			expr(0);
			setState(142);
			match(FP);
			setState(143);
			match(AC);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(144);
				stmt();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(FC);
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
	public static class RetStmtContext extends ParserRuleContext {
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
	 
		public RetStmtContext() { }
		public void copyFrom(RetStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NReturnContext extends RetStmtContext {
		public TerminalNode RET() { return getToken(GrammarZooLogicParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public NReturnContext(RetStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retStmt);
		try {
			_localctx = new NReturnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(RET);
			setState(153);
			expr(0);
			setState(154);
			match(PV);
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
	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NDeclaracaoContext extends VarDeclContext {
		public TerminalNode TIPO() { return getToken(GrammarZooLogicParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public TerminalNode OP_ATR() { return getToken(GrammarZooLogicParser.OP_ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NDeclaracaoContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		int _la;
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(TIPO);
			setState(157);
			match(VAR);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATR) {
				{
				setState(158);
				match(OP_ATR);
				setState(159);
				expr(0);
				}
			}

			setState(162);
			match(PV);
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
	public static class VarAssignContext extends ParserRuleContext {
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
	 
		public VarAssignContext() { }
		public void copyFrom(VarAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NAtribuicaoContext extends VarAssignContext {
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode OP_ATR() { return getToken(GrammarZooLogicParser.OP_ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public NAtribuicaoContext(VarAssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varAssign);
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(VAR);
			setState(165);
			match(OP_ATR);
			setState(166);
			expr(0);
			setState(167);
			match(PV);
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
	public static class InputOutputContext extends ParserRuleContext {
		public InputOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputOutput; }
	 
		public InputOutputContext() { }
		public void copyFrom(InputOutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOutputContext extends InputOutputContext {
		public TerminalNode ESC() { return getToken(GrammarZooLogicParser.ESC, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(GrammarZooLogicParser.NUM, 0); }
		public NOutputContext(InputOutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NInputContext extends InputOutputContext {
		public TerminalNode LER() { return getToken(GrammarZooLogicParser.LER, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public NInputContext(InputOutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterNInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitNInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitNInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputOutputContext inputOutput() throws RecognitionException {
		InputOutputContext _localctx = new InputOutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputOutput);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESC:
				_localctx = new NOutputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(ESC);
				setState(170);
				match(AP);
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(171);
					stringExpr();
					}
					break;
				case 2:
					{
					setState(172);
					match(VAR);
					}
					break;
				case 3:
					{
					setState(173);
					match(NUM);
					}
					break;
				}
				setState(176);
				match(FP);
				setState(177);
				match(PV);
				}
				break;
			case LER:
				_localctx = new NInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(LER);
				setState(179);
				match(AP);
				setState(180);
				match(VAR);
				setState(181);
				match(FP);
				setState(182);
				match(PV);
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
	public static class StringExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarZooLogicParser.STRING, 0); }
		public TerminalNode OP_CONCAT() { return getToken(GrammarZooLogicParser.OP_CONCAT, 0); }
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(GrammarZooLogicParser.NUM, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		StringExprContext _localctx = new StringExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringExpr);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(STRING);
				setState(187);
				match(OP_CONCAT);
				setState(188);
				stringExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(VAR);
				setState(190);
				match(OP_CONCAT);
				setState(191);
				stringExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(NUM);
				setState(193);
				match(OP_CONCAT);
				setState(194);
				stringExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(AP);
				setState(196);
				expr(0);
				setState(197);
				match(FP);
				setState(198);
				match(OP_CONCAT);
				setState(199);
				stringExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(VAR);
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
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			param();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(205);
				match(T__1);
				setState(206);
				param();
				}
				}
				setState(211);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GrammarZooLogicParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(TIPO);
			setState(213);
			match(VAR);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode NUM() { return getToken(GrammarZooLogicParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(GrammarZooLogicParser.STRING, 0); }
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode ESC() { return getToken(GrammarZooLogicParser.ESC, 0); }
		public TerminalNode LER() { return getToken(GrammarZooLogicParser.LER, 0); }
		public TerminalNode OP_ARIT() { return getToken(GrammarZooLogicParser.OP_ARIT, 0); }
		public TerminalNode OP_REL() { return getToken(GrammarZooLogicParser.OP_REL, 0); }
		public TerminalNode OP_COND() { return getToken(GrammarZooLogicParser.OP_COND, 0); }
		public TerminalNode OP_ATR() { return getToken(GrammarZooLogicParser.OP_ATR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(216);
				match(AP);
				setState(217);
				expr(0);
				setState(218);
				match(FP);
				}
				break;
			case 2:
				{
				setState(220);
				match(NUM);
				}
				break;
			case 3:
				{
				setState(221);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(222);
				match(VAR);
				}
				break;
			case 5:
				{
				setState(223);
				match(VAR);
				setState(224);
				match(AP);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16257024L) != 0)) {
					{
					setState(225);
					expr(0);
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(226);
						match(T__1);
						setState(227);
						expr(0);
						}
						}
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(235);
				match(FP);
				}
				break;
			case 6:
				{
				setState(236);
				match(ESC);
				setState(237);
				match(AP);
				setState(238);
				expr(0);
				setState(239);
				match(FP);
				}
				break;
			case 7:
				{
				setState(241);
				match(LER);
				setState(242);
				match(AP);
				setState(243);
				expr(0);
				setState(244);
				match(FP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(249);
						match(OP_ARIT);
						setState(250);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(252);
						match(OP_REL);
						setState(253);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(255);
						match(OP_COND);
						setState(256);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(258);
						match(OP_ATR);
						setState(259);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(264);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00028\b"+
		"\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003L\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004Y\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004]\b\u0004\n\u0004\f\u0004`\t"+
		"\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005k\b\u0005\n\u0005"+
		"\f\u0005n\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006u\b\u0006\n\u0006\f\u0006x\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0085\b\u0007\n"+
		"\u0007\f\u0007\u0088\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0092\b\b\n\b\f\b\u0095\t\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00a1\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00af\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00b8\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00cb\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d0"+
		"\b\u000e\n\u000e\f\u000e\u00d3\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00e5\b\u0010\n\u0010\f\u0010\u00e8\t\u0010\u0003"+
		"\u0010\u00ea\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00f7\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0105\b\u0010\n\u0010\f\u0010"+
		"\u0108\t\u0010\u0001\u0010\u0000\u0001 \u0011\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0000"+
		"\u0121\u0000%\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004"+
		"3\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bO\u0001\u0000"+
		"\u0000\u0000\nd\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000e"+
		"{\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012\u0098"+
		"\u0001\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u00a4"+
		"\u0001\u0000\u0000\u0000\u0018\u00b7\u0001\u0000\u0000\u0000\u001a\u00ca"+
		"\u0001\u0000\u0000\u0000\u001c\u00cc\u0001\u0000\u0000\u0000\u001e\u00d4"+
		"\u0001\u0000\u0000\u0000 \u00f6\u0001\u0000\u0000\u0000\"$\u0003\u0002"+
		"\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000(2\u0003\u0004\u0002\u0000)2\u0003\u0006"+
		"\u0003\u0000*2\u0003\b\u0004\u0000+2\u0003\u000e\u0007\u0000,2\u0003\u0010"+
		"\b\u0000-2\u0003\u0012\t\u0000.2\u0003\u0014\n\u0000/2\u0003\u0018\f\u0000"+
		"02\u0003\u0016\u000b\u00001(\u0001\u0000\u0000\u00001)\u0001\u0000\u0000"+
		"\u00001*\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001,\u0001\u0000"+
		"\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u000034\u0005\u0003\u0000\u000045\u0005\u0001\u0000\u000059\u0005\u000e"+
		"\u0000\u000068\u0003\u0002\u0001\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u000f\u0000"+
		"\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005\u0004\u0000\u0000?@\u0005"+
		"\u000b\u0000\u0000@A\u0005\u0016\u0000\u0000AC\u0005\f\u0000\u0000BD\u0003"+
		"\u001c\u000e\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0005\r\u0000\u0000FJ\u0005\u000e\u0000\u0000"+
		"GI\u0003\u0002\u0001\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u000f\u0000\u0000N\u0007"+
		"\u0001\u0000\u0000\u0000OP\u0005\u0005\u0000\u0000PQ\u0005\f\u0000\u0000"+
		"QR\u0003 \u0010\u0000RS\u0005\r\u0000\u0000SW\u0005\u000e\u0000\u0000"+
		"TV\u0003\u0002\u0001\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z^\u0005\u000f\u0000\u0000[]\u0003"+
		"\n\u0005\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ac\u0003\f\u0006\u0000ba\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\t\u0001\u0000\u0000\u0000de\u0005\u0007"+
		"\u0000\u0000ef\u0005\f\u0000\u0000fg\u0003 \u0010\u0000gh\u0005\r\u0000"+
		"\u0000hl\u0005\u000e\u0000\u0000ik\u0003\u0002\u0001\u0000ji\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0005\u000f\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0005\u0006"+
		"\u0000\u0000rv\u0005\u000e\u0000\u0000su\u0003\u0002\u0001\u0000ts\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000yz\u0005\u000f\u0000\u0000z\r\u0001\u0000\u0000\u0000{|\u0005\t"+
		"\u0000\u0000|}\u0005\f\u0000\u0000}~\u0003\u0014\n\u0000~\u007f\u0003"+
		" \u0010\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080\u0081\u0003 \u0010"+
		"\u0000\u0081\u0082\u0005\r\u0000\u0000\u0082\u0086\u0005\u000e\u0000\u0000"+
		"\u0083\u0085\u0003\u0002\u0001\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u000f\u0000\u0000"+
		"\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000\u008c"+
		"\u008d\u0005\f\u0000\u0000\u008d\u008e\u0003 \u0010\u0000\u008e\u008f"+
		"\u0005\r\u0000\u0000\u008f\u0093\u0005\u000e\u0000\u0000\u0090\u0092\u0003"+
		"\u0002\u0001\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u000f\u0000\u0000\u0097\u0011\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\b\u0000\u0000\u0099\u009a\u0003 "+
		"\u0010\u0000\u009a\u009b\u0005\u0011\u0000\u0000\u009b\u0013\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d\u00a0\u0005\u0016"+
		"\u0000\u0000\u009e\u009f\u0005\u001b\u0000\u0000\u009f\u00a1\u0003 \u0010"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0011\u0000"+
		"\u0000\u00a3\u0015\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0016\u0000"+
		"\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6\u00a7\u0003 \u0010\u0000"+
		"\u00a7\u00a8\u0005\u0011\u0000\u0000\u00a8\u0017\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0013\u0000\u0000\u00aa\u00ae\u0005\f\u0000\u0000\u00ab"+
		"\u00af\u0003\u001a\r\u0000\u00ac\u00af\u0005\u0016\u0000\u0000\u00ad\u00af"+
		"\u0005\u0017\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\r\u0000\u0000\u00b1\u00b8\u0005"+
		"\u0011\u0000\u0000\u00b2\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b4\u0005"+
		"\f\u0000\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00b6\u0005\r"+
		"\u0000\u0000\u00b6\u00b8\u0005\u0011\u0000\u0000\u00b7\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b8\u0019\u0001\u0000"+
		"\u0000\u0000\u00b9\u00cb\u0005\u0015\u0000\u0000\u00ba\u00bb\u0005\u0015"+
		"\u0000\u0000\u00bb\u00bc\u0005\u001c\u0000\u0000\u00bc\u00cb\u0003\u001a"+
		"\r\u0000\u00bd\u00be\u0005\u0016\u0000\u0000\u00be\u00bf\u0005\u001c\u0000"+
		"\u0000\u00bf\u00cb\u0003\u001a\r\u0000\u00c0\u00c1\u0005\u0017\u0000\u0000"+
		"\u00c1\u00c2\u0005\u001c\u0000\u0000\u00c2\u00cb\u0003\u001a\r\u0000\u00c3"+
		"\u00c4\u0005\f\u0000\u0000\u00c4\u00c5\u0003 \u0010\u0000\u00c5\u00c6"+
		"\u0005\r\u0000\u0000\u00c6\u00c7\u0005\u001c\u0000\u0000\u00c7\u00c8\u0003"+
		"\u001a\r\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005\u0016"+
		"\u0000\u0000\u00ca\u00b9\u0001\u0000\u0000\u0000\u00ca\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ca\u00bd\u0001\u0000\u0000\u0000\u00ca\u00c0\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c3\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u001b\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003\u001e"+
		"\u000f\u0000\u00cd\u00ce\u0005\u0002\u0000\u0000\u00ce\u00d0\u0003\u001e"+
		"\u000f\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u001d\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\u000b\u0000\u0000\u00d5\u00d6\u0005\u0016"+
		"\u0000\u0000\u00d6\u001f\u0001\u0000\u0000\u0000\u00d7\u00d8\u0006\u0010"+
		"\uffff\uffff\u0000\u00d8\u00d9\u0005\f\u0000\u0000\u00d9\u00da\u0003 "+
		"\u0010\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00f7\u0001\u0000\u0000"+
		"\u0000\u00dc\u00f7\u0005\u0017\u0000\u0000\u00dd\u00f7\u0005\u0015\u0000"+
		"\u0000\u00de\u00f7\u0005\u0016\u0000\u0000\u00df\u00e0\u0005\u0016\u0000"+
		"\u0000\u00e0\u00e9\u0005\f\u0000\u0000\u00e1\u00e6\u0003 \u0010\u0000"+
		"\u00e2\u00e3\u0005\u0002\u0000\u0000\u00e3\u00e5\u0003 \u0010\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f7\u0005\r\u0000\u0000\u00ec\u00ed"+
		"\u0005\u0013\u0000\u0000\u00ed\u00ee\u0005\f\u0000\u0000\u00ee\u00ef\u0003"+
		" \u0010\u0000\u00ef\u00f0\u0005\r\u0000\u0000\u00f0\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0005\u0014\u0000\u0000\u00f2\u00f3\u0005\f\u0000"+
		"\u0000\u00f3\u00f4\u0003 \u0010\u0000\u00f4\u00f5\u0005\r\u0000\u0000"+
		"\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00dc\u0001\u0000\u0000\u0000\u00f6\u00dd\u0001\u0000\u0000\u0000"+
		"\u00f6\u00de\u0001\u0000\u0000\u0000\u00f6\u00df\u0001\u0000\u0000\u0000"+
		"\u00f6\u00ec\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f7\u0106\u0001\u0000\u0000\u0000\u00f8\u00f9\n\u000b\u0000\u0000\u00f9"+
		"\u00fa\u0005\u0018\u0000\u0000\u00fa\u0105\u0003 \u0010\f\u00fb\u00fc"+
		"\n\n\u0000\u0000\u00fc\u00fd\u0005\u0019\u0000\u0000\u00fd\u0105\u0003"+
		" \u0010\u000b\u00fe\u00ff\n\t\u0000\u0000\u00ff\u0100\u0005\u001a\u0000"+
		"\u0000\u0100\u0105\u0003 \u0010\n\u0101\u0102\n\b\u0000\u0000\u0102\u0103"+
		"\u0005\u001b\u0000\u0000\u0103\u0105\u0003 \u0010\t\u0104\u00f8\u0001"+
		"\u0000\u0000\u0000\u0104\u00fb\u0001\u0000\u0000\u0000\u0104\u00fe\u0001"+
		"\u0000\u0000\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0105\u0108\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107!\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0016%19CJW^blv\u0086\u0093\u00a0\u00ae\u00b7\u00ca\u00d1"+
		"\u00e6\u00e9\u00f6\u0104\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}