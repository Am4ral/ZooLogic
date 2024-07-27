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
		OP_ATR=27, OP_CONCAT=28, WS=29, ErrorChar=30;
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
			"OP_CONCAT", "WS", "ErrorChar"
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
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
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
		public TerminalNode MAIN() { return getToken(GrammarZooLogicParser.MAIN, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public MainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterMainStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitMainStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitMainStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStmtContext mainStmt() throws RecognitionException {
		MainStmtContext _localctx = new MainStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainStmt);
		int _la;
		try {
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
		public TerminalNode FUNC() { return getToken(GrammarZooLogicParser.FUNC, 0); }
		public TerminalNode TIPO() { return getToken(GrammarZooLogicParser.TIPO, 0); }
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
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(FUNC);
			setState(63);
			match(TIPO);
			setState(64);
			match(AP);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(65);
				paramList();
				}
			}

			setState(68);
			match(FP);
			setState(69);
			match(AC);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(70);
				stmt();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IF);
			setState(79);
			match(AP);
			setState(80);
			expr(0);
			setState(81);
			match(FP);
			setState(82);
			match(AC);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(83);
				stmt();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(FC);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(90);
				elifStmt();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(96);
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
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterElifStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitElifStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitElifStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ELIF);
			setState(100);
			match(AP);
			setState(101);
			expr(0);
			setState(102);
			match(FP);
			setState(103);
			match(AC);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(104);
				stmt();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
		public TerminalNode ELSE() { return getToken(GrammarZooLogicParser.ELSE, 0); }
		public TerminalNode AC() { return getToken(GrammarZooLogicParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarZooLogicParser.FC, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ELSE);
			setState(113);
			match(AC);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(114);
				stmt();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(FOR);
			setState(123);
			match(AP);
			setState(124);
			varDecl();
			setState(125);
			expr(0);
			setState(126);
			match(PV);
			setState(127);
			expr(0);
			setState(128);
			match(FP);
			setState(129);
			match(AC);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(130);
				stmt();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WHILE);
			setState(139);
			match(AP);
			setState(140);
			expr(0);
			setState(141);
			match(FP);
			setState(142);
			match(AC);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5771064L) != 0)) {
				{
				{
				setState(143);
				stmt();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
		public TerminalNode RET() { return getToken(GrammarZooLogicParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterRetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitRetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_retStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(RET);
			setState(152);
			expr(0);
			setState(153);
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
		public TerminalNode TIPO() { return getToken(GrammarZooLogicParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public TerminalNode OP_ATR() { return getToken(GrammarZooLogicParser.OP_ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(TIPO);
			setState(156);
			match(VAR);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATR) {
				{
				setState(157);
				match(OP_ATR);
				setState(158);
				expr(0);
				}
			}

			setState(161);
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
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode OP_ATR() { return getToken(GrammarZooLogicParser.OP_ATR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(VAR);
			setState(164);
			match(OP_ATR);
			setState(165);
			expr(0);
			setState(166);
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
		public TerminalNode ESC() { return getToken(GrammarZooLogicParser.ESC, 0); }
		public TerminalNode AP() { return getToken(GrammarZooLogicParser.AP, 0); }
		public TerminalNode FP() { return getToken(GrammarZooLogicParser.FP, 0); }
		public TerminalNode PV() { return getToken(GrammarZooLogicParser.PV, 0); }
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(GrammarZooLogicParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(GrammarZooLogicParser.NUM, 0); }
		public TerminalNode LER() { return getToken(GrammarZooLogicParser.LER, 0); }
		public InputOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).enterInputOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarZooLogicListener ) ((GrammarZooLogicListener)listener).exitInputOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarZooLogicVisitor ) return ((GrammarZooLogicVisitor<? extends T>)visitor).visitInputOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputOutputContext inputOutput() throws RecognitionException {
		InputOutputContext _localctx = new InputOutputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputOutput);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESC:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(ESC);
				setState(169);
				match(AP);
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(170);
					stringExpr();
					}
					break;
				case VAR:
					{
					setState(171);
					match(VAR);
					}
					break;
				case NUM:
					{
					setState(172);
					match(NUM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175);
				match(FP);
				setState(176);
				match(PV);
				}
				break;
			case LER:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(LER);
				setState(178);
				match(AP);
				setState(179);
				match(VAR);
				setState(180);
				match(FP);
				setState(181);
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
		public List<TerminalNode> STRING() { return getTokens(GrammarZooLogicParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrammarZooLogicParser.STRING, i);
		}
		public TerminalNode OP_CONCAT() { return getToken(GrammarZooLogicParser.OP_CONCAT, 0); }
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(STRING);
				setState(186);
				match(OP_CONCAT);
				setState(194);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(187);
					match(VAR);
					}
					break;
				case NUM:
					{
					setState(188);
					match(NUM);
					}
					break;
				case STRING:
					{
					setState(189);
					match(STRING);
					}
					break;
				case AP:
					{
					setState(190);
					match(AP);
					setState(191);
					expr(0);
					setState(192);
					match(FP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
			setState(198);
			param();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(199);
				match(T__1);
				setState(200);
				param();
				}
				}
				setState(205);
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
			setState(206);
			match(TIPO);
			setState(207);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AP:
				{
				setState(210);
				match(AP);
				setState(211);
				expr(0);
				setState(212);
				match(FP);
				}
				break;
			case NUM:
				{
				setState(214);
				match(NUM);
				}
				break;
			case STRING:
				{
				setState(215);
				match(STRING);
				}
				break;
			case VAR:
				{
				setState(216);
				match(VAR);
				}
				break;
			case ESC:
				{
				setState(217);
				match(ESC);
				setState(218);
				expr(2);
				}
				break;
			case LER:
				{
				setState(219);
				match(LER);
				setState(220);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(224);
						match(OP_ARIT);
						setState(225);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(227);
						match(OP_REL);
						setState(228);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(230);
						match(OP_COND);
						setState(231);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00028\b"+
		"\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004U\b\u0004\n\u0004\f\u0004X\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\\\b\u0004\n\u0004\f\u0004_\t\u0004\u0001"+
		"\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005j\b\u0005\n\u0005\f\u0005m\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006t\b\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0084\b\u0007\n\u0007\f\u0007"+
		"\u0087\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u0091\b\b\n\b\f\b\u0094\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a0"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b7\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00c3\b\r\u0003\r\u00c5\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00ca\b\u000e\n\u000e\f\u000e\u00cd\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00de\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00e9\b\u0010\n\u0010\f\u0010\u00ec\t\u0010\u0001\u0010"+
		"\u0000\u0001 \u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \u0000\u0000\u0100\u0000%\u0001\u0000\u0000"+
		"\u0000\u00021\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006"+
		">\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000"+
		"\u0000\fp\u0001\u0000\u0000\u0000\u000ez\u0001\u0000\u0000\u0000\u0010"+
		"\u008a\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000\u0014"+
		"\u009b\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000\u0000\u0000\u0018"+
		"\u00b6\u0001\u0000\u0000\u0000\u001a\u00c4\u0001\u0000\u0000\u0000\u001c"+
		"\u00c6\u0001\u0000\u0000\u0000\u001e\u00ce\u0001\u0000\u0000\u0000 \u00dd"+
		"\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"(2\u0003\u0004\u0002\u0000)2\u0003\u0006\u0003\u0000*2\u0003\b\u0004\u0000"+
		"+2\u0003\u000e\u0007\u0000,2\u0003\u0010\b\u0000-2\u0003\u0012\t\u0000"+
		".2\u0003\u0014\n\u0000/2\u0003\u0018\f\u000002\u0003\u0016\u000b\u0000"+
		"1(\u0001\u0000\u0000\u00001)\u0001\u0000\u0000\u00001*\u0001\u0000\u0000"+
		"\u00001+\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000"+
		"\u0000\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001"+
		"\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0005\u0003\u0000"+
		"\u000045\u0005\u0001\u0000\u000059\u0005\u000e\u0000\u000068\u0003\u0002"+
		"\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<=\u0005\u000f\u0000\u0000=\u0005\u0001\u0000"+
		"\u0000\u0000>?\u0005\u0004\u0000\u0000?@\u0005\u000b\u0000\u0000@B\u0005"+
		"\f\u0000\u0000AC\u0003\u001c\u000e\u0000BA\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\r\u0000\u0000EI\u0005"+
		"\u000e\u0000\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u000f"+
		"\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0005\u0005\u0000\u0000"+
		"OP\u0005\f\u0000\u0000PQ\u0003 \u0010\u0000QR\u0005\r\u0000\u0000RV\u0005"+
		"\u000e\u0000\u0000SU\u0003\u0002\u0001\u0000TS\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y]\u0005\u000f"+
		"\u0000\u0000Z\\\u0003\n\u0005\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0003\f\u0006\u0000"+
		"a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000"+
		"\u0000cd\u0005\u0007\u0000\u0000de\u0005\f\u0000\u0000ef\u0003 \u0010"+
		"\u0000fg\u0005\r\u0000\u0000gk\u0005\u000e\u0000\u0000hj\u0003\u0002\u0001"+
		"\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000no\u0005\u000f\u0000\u0000o\u000b\u0001\u0000\u0000"+
		"\u0000pq\u0005\u0006\u0000\u0000qu\u0005\u000e\u0000\u0000rt\u0003\u0002"+
		"\u0001\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000xy\u0005\u000f\u0000\u0000y\r\u0001\u0000\u0000"+
		"\u0000z{\u0005\t\u0000\u0000{|\u0005\f\u0000\u0000|}\u0003\u0014\n\u0000"+
		"}~\u0003 \u0010\u0000~\u007f\u0005\u0011\u0000\u0000\u007f\u0080\u0003"+
		" \u0010\u0000\u0080\u0081\u0005\r\u0000\u0000\u0081\u0085\u0005\u000e"+
		"\u0000\u0000\u0082\u0084\u0003\u0002\u0001\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000f"+
		"\u0000\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008b\u0005\n\u0000"+
		"\u0000\u008b\u008c\u0005\f\u0000\u0000\u008c\u008d\u0003 \u0010\u0000"+
		"\u008d\u008e\u0005\r\u0000\u0000\u008e\u0092\u0005\u000e\u0000\u0000\u008f"+
		"\u0091\u0003\u0002\u0001\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096"+
		"\u0011\u0001\u0000\u0000\u0000\u0097\u0098\u0005\b\u0000\u0000\u0098\u0099"+
		"\u0003 \u0010\u0000\u0099\u009a\u0005\u0011\u0000\u0000\u009a\u0013\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\u000b\u0000\u0000\u009c\u009f\u0005"+
		"\u0016\u0000\u0000\u009d\u009e\u0005\u001b\u0000\u0000\u009e\u00a0\u0003"+
		" \u0010\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0011"+
		"\u0000\u0000\u00a2\u0015\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0016"+
		"\u0000\u0000\u00a4\u00a5\u0005\u001b\u0000\u0000\u00a5\u00a6\u0003 \u0010"+
		"\u0000\u00a6\u00a7\u0005\u0011\u0000\u0000\u00a7\u0017\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0013\u0000\u0000\u00a9\u00ad\u0005\f\u0000\u0000"+
		"\u00aa\u00ae\u0003\u001a\r\u0000\u00ab\u00ae\u0005\u0016\u0000\u0000\u00ac"+
		"\u00ae\u0005\u0017\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\r\u0000\u0000\u00b0\u00b7"+
		"\u0005\u0011\u0000\u0000\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00b3"+
		"\u0005\f\u0000\u0000\u00b3\u00b4\u0005\u0016\u0000\u0000\u00b4\u00b5\u0005"+
		"\r\u0000\u0000\u00b5\u00b7\u0005\u0011\u0000\u0000\u00b6\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b7\u0019\u0001\u0000"+
		"\u0000\u0000\u00b8\u00c5\u0005\u0015\u0000\u0000\u00b9\u00ba\u0005\u0015"+
		"\u0000\u0000\u00ba\u00c2\u0005\u001c\u0000\u0000\u00bb\u00c3\u0005\u0016"+
		"\u0000\u0000\u00bc\u00c3\u0005\u0017\u0000\u0000\u00bd\u00c3\u0005\u0015"+
		"\u0000\u0000\u00be\u00bf\u0005\f\u0000\u0000\u00bf\u00c0\u0003 \u0010"+
		"\u0000\u00c0\u00c1\u0005\r\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00b8\u0001\u0000\u0000\u0000"+
		"\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c5\u001b\u0001\u0000\u0000\u0000"+
		"\u00c6\u00cb\u0003\u001e\u000f\u0000\u00c7\u00c8\u0005\u0002\u0000\u0000"+
		"\u00c8\u00ca\u0003\u001e\u000f\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u001d\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u000b\u0000\u0000"+
		"\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0006\u0010\uffff\uffff\u0000\u00d2\u00d3\u0005\f\u0000\u0000"+
		"\u00d3\u00d4\u0003 \u0010\u0000\u00d4\u00d5\u0005\r\u0000\u0000\u00d5"+
		"\u00de\u0001\u0000\u0000\u0000\u00d6\u00de\u0005\u0017\u0000\u0000\u00d7"+
		"\u00de\u0005\u0015\u0000\u0000\u00d8\u00de\u0005\u0016\u0000\u0000\u00d9"+
		"\u00da\u0005\u0013\u0000\u0000\u00da\u00de\u0003 \u0010\u0002\u00db\u00dc"+
		"\u0005\u0014\u0000\u0000\u00dc\u00de\u0003 \u0010\u0001\u00dd\u00d1\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d6\u0001\u0000\u0000\u0000\u00dd\u00d7\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00dd\u00d9\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00ea\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\n\t\u0000\u0000\u00e0\u00e1\u0005\u0018"+
		"\u0000\u0000\u00e1\u00e9\u0003 \u0010\n\u00e2\u00e3\n\b\u0000\u0000\u00e3"+
		"\u00e4\u0005\u0019\u0000\u0000\u00e4\u00e9\u0003 \u0010\t\u00e5\u00e6"+
		"\n\u0007\u0000\u0000\u00e6\u00e7\u0005\u001a\u0000\u0000\u00e7\u00e9\u0003"+
		" \u0010\b\u00e8\u00df\u0001\u0000\u0000\u0000\u00e8\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb!\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u0015%19BIV]aku\u0085\u0092\u009f\u00ad\u00b6\u00c2\u00c4\u00cb"+
		"\u00dd\u00e8\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}