// Generated from Task1.g4 by ANTLR 4.7.2

package tk.dadle8.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Task1Parser}.
 */
public interface Task1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Task1Parser#argDef}.
	 * @param ctx the parse tree
	 */
	void enterArgDef(Task1Parser.ArgDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#argDef}.
	 * @param ctx the parse tree
	 */
	void exitArgDef(Task1Parser.ArgDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#built}.
	 * @param ctx the parse tree
	 */
	void enterBuilt(Task1Parser.BuiltContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#built}.
	 * @param ctx the parse tree
	 */
	void exitBuilt(Task1Parser.BuiltContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(Task1Parser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(Task1Parser.LitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(Task1Parser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(Task1Parser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#sourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSourceItem(Task1Parser.SourceItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#sourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSourceItem(Task1Parser.SourceItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(Task1Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(Task1Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Task1Parser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void enterFuncSignature(Task1Parser.FuncSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Task1Parser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void exitFuncSignature(Task1Parser.FuncSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link Task1Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterArray(Task1Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link Task1Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitArray(Task1Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code builtin}
	 * labeled alternative in {@link Task1Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin(Task1Parser.BuiltinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code builtin}
	 * labeled alternative in {@link Task1Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin(Task1Parser.BuiltinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code custom}
	 * labeled alternative in {@link Task1Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void enterCustom(Task1Parser.CustomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code custom}
	 * labeled alternative in {@link Task1Parser#typeRef}.
	 * @param ctx the parse tree
	 */
	void exitCustom(Task1Parser.CustomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementVar}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVar(Task1Parser.StatementVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementVar}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVar(Task1Parser.StatementVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(Task1Parser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(Task1Parser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(Task1Parser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(Task1Parser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(Task1Parser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(Task1Parser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(Task1Parser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(Task1Parser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExp(Task1Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link Task1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExp(Task1Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(Task1Parser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(Task1Parser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unari}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnari(Task1Parser.UnariContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unari}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnari(Task1Parser.UnariContext ctx);
	/**
	 * Enter a parse tree produced by the {@code place}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlace(Task1Parser.PlaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code place}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlace(Task1Parser.PlaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callOrIndexer}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallOrIndexer(Task1Parser.CallOrIndexerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callOrIndexer}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallOrIndexer(Task1Parser.CallOrIndexerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braces}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBraces(Task1Parser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braces}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBraces(Task1Parser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Task1Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link Task1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Task1Parser.LiteralContext ctx);
}