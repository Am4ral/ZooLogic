// Generated from F:/Faculdade/Matérias/5 periodo/Compiladores/ZooLogic/src/GrammarZooLogic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarZooLogicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarZooLogicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarZooLogicParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarZooLogicParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#mainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStmt(GrammarZooLogicParser.MainStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(GrammarZooLogicParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GrammarZooLogicParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#elifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStmt(GrammarZooLogicParser.ElifStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(GrammarZooLogicParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(GrammarZooLogicParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(GrammarZooLogicParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#retStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(GrammarZooLogicParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(GrammarZooLogicParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(GrammarZooLogicParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputOutput(GrammarZooLogicParser.InputOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(GrammarZooLogicParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(GrammarZooLogicParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GrammarZooLogicParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarZooLogicParser.ExprContext ctx);
}