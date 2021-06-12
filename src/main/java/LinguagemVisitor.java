// Generated from Linguagem.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LinguagemParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(LinguagemParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao(LinguagemParser.AcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#lista_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_var(LinguagemParser.Lista_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicao(LinguagemParser.DefinicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(LinguagemParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#arr_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_def(LinguagemParser.Arr_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#if_acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_acao(LinguagemParser.If_acaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#for_acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_acao(LinguagemParser.For_acaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#while_acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_acao(LinguagemParser.While_acaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#acao_bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao_bloco(LinguagemParser.Acao_blocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(LinguagemParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LinguagemParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualidadeExpr}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualidadeExpr(LinguagemParser.IgualidadeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicaoExpr}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicaoExpr(LinguagemParser.MultiplicaoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somaExpr}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomaExpr(LinguagemParser.SomaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fatorExpr}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorExpr(LinguagemParser.FatorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relacionalExpr}
	 * labeled alternative in {@link LinguagemParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionalExpr(LinguagemParser.RelacionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pareFator}
	 * labeled alternative in {@link LinguagemParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPareFator(LinguagemParser.PareFatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intFator}
	 * labeled alternative in {@link LinguagemParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntFator(LinguagemParser.IntFatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFator}
	 * labeled alternative in {@link LinguagemParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFator(LinguagemParser.StringFatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatFator}
	 * labeled alternative in {@link LinguagemParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatFator(LinguagemParser.FloatFatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idFator}
	 * labeled alternative in {@link LinguagemParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFator(LinguagemParser.IdFatorContext ctx);
}