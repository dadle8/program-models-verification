package tk.dadle8.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProLangParser#argDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDef(ProLangParser.ArgDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProLangParser#built}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt(ProLangParser.BuiltContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProLangParser#lit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(ProLangParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProLangParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(ProLangParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProLangParser#sourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceItem(ProLangParser.SourceItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProLangParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(ProLangParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProLangParser#funcSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncSignature(ProLangParser.FuncSignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ProLangParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code builtin}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin(ProLangParser.BuiltinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code custom}
	 * labeled alternative in {@link ProLangParser#typeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustom(ProLangParser.CustomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementVar}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementVar(ProLangParser.StatementVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(ProLangParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(ProLangParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(ProLangParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(ProLangParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ProLangParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ProLangParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unari}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnari(ProLangParser.UnariContext ctx);
	/**
	 * Visit a parse tree produced by the {@code place}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlace(ProLangParser.PlaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callOrIndexer}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallOrIndexer(ProLangParser.CallOrIndexerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code braces}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(ProLangParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal}
	 * labeled alternative in {@link ProLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ProLangParser.LiteralContext ctx);
}