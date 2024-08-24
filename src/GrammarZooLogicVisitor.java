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
	 * Visit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GrammarZooLogicParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNInicio(GrammarZooLogicParser.NInicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarZooLogicParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarZooLogicParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NMain}
	 * labeled alternative in {@link GrammarZooLogicParser#mainStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNMain(GrammarZooLogicParser.NMainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link GrammarZooLogicParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNFuncao(GrammarZooLogicParser.NFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NIf}
	 * labeled alternative in {@link GrammarZooLogicParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIf(GrammarZooLogicParser.NIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NElseIf}
	 * labeled alternative in {@link GrammarZooLogicParser#elifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNElseIf(GrammarZooLogicParser.NElseIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NElse}
	 * labeled alternative in {@link GrammarZooLogicParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNElse(GrammarZooLogicParser.NElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NFOR}
	 * labeled alternative in {@link GrammarZooLogicParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNFOR(GrammarZooLogicParser.NFORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NWhile}
	 * labeled alternative in {@link GrammarZooLogicParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNWhile(GrammarZooLogicParser.NWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NReturn}
	 * labeled alternative in {@link GrammarZooLogicParser#retStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNReturn(GrammarZooLogicParser.NReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GrammarZooLogicParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracao(GrammarZooLogicParser.NDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GrammarZooLogicParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(GrammarZooLogicParser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOutput}
	 * labeled alternative in {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOutput(GrammarZooLogicParser.NOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NInput}
	 * labeled alternative in {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNInput(GrammarZooLogicParser.NInputContext ctx);
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