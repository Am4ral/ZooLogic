// Generated from F:/Faculdade/Matérias/5 periodo/Compiladores/ZooLogic/src/GrammarZooLogic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarZooLogicParser}.
 */
public interface GrammarZooLogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GrammarZooLogicParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterNInicio(GrammarZooLogicParser.NInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link GrammarZooLogicParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitNInicio(GrammarZooLogicParser.NInicioContext ctx);
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
	 * Enter a parse tree produced by the {@code NMain}
	 * labeled alternative in {@link GrammarZooLogicParser#mainStmt}.
	 * @param ctx the parse tree
	 */
	void enterNMain(GrammarZooLogicParser.NMainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NMain}
	 * labeled alternative in {@link GrammarZooLogicParser#mainStmt}.
	 * @param ctx the parse tree
	 */
	void exitNMain(GrammarZooLogicParser.NMainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link GrammarZooLogicParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterNFuncao(GrammarZooLogicParser.NFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link GrammarZooLogicParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitNFuncao(GrammarZooLogicParser.NFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NIf}
	 * labeled alternative in {@link GrammarZooLogicParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterNIf(GrammarZooLogicParser.NIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NIf}
	 * labeled alternative in {@link GrammarZooLogicParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitNIf(GrammarZooLogicParser.NIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NElseIf}
	 * labeled alternative in {@link GrammarZooLogicParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterNElseIf(GrammarZooLogicParser.NElseIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NElseIf}
	 * labeled alternative in {@link GrammarZooLogicParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitNElseIf(GrammarZooLogicParser.NElseIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NElse}
	 * labeled alternative in {@link GrammarZooLogicParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterNElse(GrammarZooLogicParser.NElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NElse}
	 * labeled alternative in {@link GrammarZooLogicParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitNElse(GrammarZooLogicParser.NElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFOR}
	 * labeled alternative in {@link GrammarZooLogicParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterNFOR(GrammarZooLogicParser.NFORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFOR}
	 * labeled alternative in {@link GrammarZooLogicParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitNFOR(GrammarZooLogicParser.NFORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NWhile}
	 * labeled alternative in {@link GrammarZooLogicParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterNWhile(GrammarZooLogicParser.NWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NWhile}
	 * labeled alternative in {@link GrammarZooLogicParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitNWhile(GrammarZooLogicParser.NWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NReturn}
	 * labeled alternative in {@link GrammarZooLogicParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterNReturn(GrammarZooLogicParser.NReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NReturn}
	 * labeled alternative in {@link GrammarZooLogicParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitNReturn(GrammarZooLogicParser.NReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GrammarZooLogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(GrammarZooLogicParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GrammarZooLogicParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(GrammarZooLogicParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GrammarZooLogicParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(GrammarZooLogicParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GrammarZooLogicParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(GrammarZooLogicParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOutput}
	 * labeled alternative in {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 */
	void enterNOutput(GrammarZooLogicParser.NOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOutput}
	 * labeled alternative in {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 */
	void exitNOutput(GrammarZooLogicParser.NOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NInput}
	 * labeled alternative in {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 */
	void enterNInput(GrammarZooLogicParser.NInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInput}
	 * labeled alternative in {@link GrammarZooLogicParser#inputOutput}.
	 * @param ctx the parse tree
	 */
	void exitNInput(GrammarZooLogicParser.NInputContext ctx);
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