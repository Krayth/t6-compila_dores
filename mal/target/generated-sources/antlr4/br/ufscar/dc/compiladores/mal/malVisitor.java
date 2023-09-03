// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.mal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link malParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface malVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link malParser#delimitador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimitador(malParser.DelimitadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#nota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNota(malParser.NotaContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#qtdEps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtdEps(malParser.QtdEpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#tipo_anime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_anime(malParser.Tipo_animeContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#genero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenero(malParser.GeneroContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#publico_alvo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublico_alvo(malParser.Publico_alvoContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#statusCompleto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusCompleto(malParser.StatusCompletoContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#statusAssistindo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusAssistindo(malParser.StatusAssistindoContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#statusAbandonado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusAbandonado(malParser.StatusAbandonadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#nome_anime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_anime(malParser.Nome_animeContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#declare_nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_nome(malParser.Declare_nomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(malParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(malParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#declare_anime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_anime(malParser.Declare_animeContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#total_eps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotal_eps(malParser.Total_epsContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#declare_avaliacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_avaliacao(malParser.Declare_avaliacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#cmdAddNome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAddNome(malParser.CmdAddNomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#cmdAddNota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAddNota(malParser.CmdAddNotaContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#cmdAddStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAddStatus(malParser.CmdAddStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#cmdAddEps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAddEps(malParser.CmdAddEpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link malParser#cmdAddComentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAddComentario(malParser.CmdAddComentarioContext ctx);
}