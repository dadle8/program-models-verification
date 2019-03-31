package tk.dadle8.program.models.verification.task1.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProLangParser}.
 */
public interface ProLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProLangParser#argDef}.
	 * @param ctx the parse tree
	 */
	void enterArgDef(ProLangParser.ArgDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#argDef}.
	 * @param ctx the parse tree
	 */
	void exitArgDef(ProLangParser.ArgDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#built}.
	 * @param ctx the parse tree
	 */
	void enterBuilt(ProLangParser.BuiltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#built}.
	 * @param ctx the parse tree
	 */
	void exitBuilt(ProLangParser.BuiltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(ProLangParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(ProLangParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(ProLangParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(ProLangParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#sourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSourceItem(ProLangParser.SourceItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#sourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSourceItem(ProLangParser.SourceItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(ProLangParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(ProLangParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void enterFuncSignature(ProLangParser.FuncSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void exitFuncSignature(ProLangParser.FuncSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterArray(ProLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitArray(ProLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code builtin}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin(ProLangParser.BuiltinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code builtin}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin(ProLangParser.BuiltinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code custom}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterCustom(ProLangParser.CustomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code custom}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitCustom(ProLangParser.CustomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementVar}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVar(ProLangParser.StatementVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementVar}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVar(ProLangParser.StatementVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(ProLangParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(ProLangParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(ProLangParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(ProLangParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(ProLangParser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(ProLangParser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(ProLangParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(ProLangParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementExpr}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpr(ProLangParser.StatementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementExpr}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpr(ProLangParser.StatementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(ProLangParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(ProLangParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#thenStatements}.
	 * @param ctx the parse tree
	 */
	void enterThenStatements(ProLangParser.ThenStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#thenStatements}.
	 * @param ctx the parse tree
	 */
	void exitThenStatements(ProLangParser.ThenStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#elseStatements}.
	 * @param ctx the parse tree
	 */
	void enterElseStatements(ProLangParser.ElseStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#elseStatements}.
	 * @param ctx the parse tree
	 */
	void exitElseStatements(ProLangParser.ElseStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(ProLangParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(ProLangParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#whileStatements}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatements(ProLangParser.WhileStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#whileStatements}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatements(ProLangParser.WhileStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#doCondition}.
	 * @param ctx the parse tree
	 */
	void enterDoCondition(ProLangParser.DoConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#doCondition}.
	 * @param ctx the parse tree
	 */
	void exitDoCondition(ProLangParser.DoConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#doStatements}.
	 * @param ctx the parse tree
	 */
	void enterDoStatements(ProLangParser.DoStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#doStatements}.
	 * @param ctx the parse tree
	 */
	void exitDoStatements(ProLangParser.DoStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ProLangParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ProLangParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unari}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnari(ProLangParser.UnariContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unari}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnari(ProLangParser.UnariContext ctx);
	/**
	 * Enter a parse tree produced by the {@code place}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlace(ProLangParser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code place}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlace(ProLangParser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callOrIndexer}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallOrIndexer(ProLangParser.CallOrIndexerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callOrIndexer}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallOrIndexer(ProLangParser.CallOrIndexerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braces}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBraces(ProLangParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braces}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBraces(ProLangParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ProLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ProLangParser.LiteralContext ctx);
}