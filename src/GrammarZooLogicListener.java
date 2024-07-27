// Generated from F:/Faculdade/Matérias/5 periodo/Compiladores/ZooLogic/src/GrammarZooLogic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarZooLogicParser}.
 */
public interface GrammarZooLogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarZooLogicParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarZooLogicParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GrammarZooLogicParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GrammarZooLogicParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#mainStmt}.
	 * @param ctx the parse tree
	 */
	void enterMainStmt(GrammarZooLogicParser.MainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#mainStmt}.
	 * @param ctx the parse tree
	 */
	void exitMainStmt(GrammarZooLogicParser.MainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(GrammarZooLogicParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(GrammarZooLogicParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(GrammarZooLogicParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(GrammarZooLogicParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElifStmt(GrammarZooLogicParser.ElifStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElifStmt(GrammarZooLogicParser.ElifStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(GrammarZooLogicParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(GrammarZooLogicParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(GrammarZooLogicParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(GrammarZooLogicParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(GrammarZooLogicParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(GrammarZooLogicParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(GrammarZooLogicParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(GrammarZooLogicParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(GrammarZooLogicParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(GrammarZooLogicParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(GrammarZooLogicParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(GrammarZooLogicParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 */
	void enterInputOutput(GrammarZooLogicParser.InputOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 */
	void exitInputOutput(GrammarZooLogicParser.InputOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(GrammarZooLogicParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(GrammarZooLogicParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(GrammarZooLogicParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(GrammarZooLogicParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammarZooLogicParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammarZooLogicParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarZooLogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarZooLogicParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarZooLogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarZooLogicParser.ExprContext ctx);
}