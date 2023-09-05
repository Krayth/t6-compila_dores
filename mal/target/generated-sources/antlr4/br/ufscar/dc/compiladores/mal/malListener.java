// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.mal;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link malParser}.
 */
public interface malListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link malParser#delimitador}.
	 * @param ctx the parse tree
	 */
	void enterDelimitador(malParser.DelimitadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#delimitador}.
	 * @param ctx the parse tree
	 */
	void exitDelimitador(malParser.DelimitadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#nota}.
	 * @param ctx the parse tree
	 */
	void enterNota(malParser.NotaContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#nota}.
	 * @param ctx the parse tree
	 */
	void exitNota(malParser.NotaContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#qtdEps}.
	 * @param ctx the parse tree
	 */
	void enterQtdEps(malParser.QtdEpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#qtdEps}.
	 * @param ctx the parse tree
	 */
	void exitQtdEps(malParser.QtdEpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#tipo_anime}.
	 * @param ctx the parse tree
	 */
	void enterTipo_anime(malParser.Tipo_animeContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#tipo_anime}.
	 * @param ctx the parse tree
	 */
	void exitTipo_anime(malParser.Tipo_animeContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#genero}.
	 * @param ctx the parse tree
	 */
	void enterGenero(malParser.GeneroContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#genero}.
	 * @param ctx the parse tree
	 */
	void exitGenero(malParser.GeneroContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#publico_alvo}.
	 * @param ctx the parse tree
	 */
	void enterPublico_alvo(malParser.Publico_alvoContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#publico_alvo}.
	 * @param ctx the parse tree
	 */
	void exitPublico_alvo(malParser.Publico_alvoContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#nome_anime}.
	 * @param ctx the parse tree
	 */
	void enterNome_anime(malParser.Nome_animeContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#nome_anime}.
	 * @param ctx the parse tree
	 */
	void exitNome_anime(malParser.Nome_animeContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#declare_nome}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_nome(malParser.Declare_nomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#declare_nome}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_nome(malParser.Declare_nomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(malParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(malParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(malParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(malParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#declare_anime}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_anime(malParser.Declare_animeContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#declare_anime}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_anime(malParser.Declare_animeContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#total_eps}.
	 * @param ctx the parse tree
	 */
	void enterTotal_eps(malParser.Total_epsContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#total_eps}.
	 * @param ctx the parse tree
	 */
	void exitTotal_eps(malParser.Total_epsContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#declare_avaliacao}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_avaliacao(malParser.Declare_avaliacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#declare_avaliacao}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_avaliacao(malParser.Declare_avaliacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#cmdAddNome}.
	 * @param ctx the parse tree
	 */
	void enterCmdAddNome(malParser.CmdAddNomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#cmdAddNome}.
	 * @param ctx the parse tree
	 */
	void exitCmdAddNome(malParser.CmdAddNomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#cmdAddNota}.
	 * @param ctx the parse tree
	 */
	void enterCmdAddNota(malParser.CmdAddNotaContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#cmdAddNota}.
	 * @param ctx the parse tree
	 */
	void exitCmdAddNota(malParser.CmdAddNotaContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#cmdAddStatus}.
	 * @param ctx the parse tree
	 */
	void enterCmdAddStatus(malParser.CmdAddStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#cmdAddStatus}.
	 * @param ctx the parse tree
	 */
	void exitCmdAddStatus(malParser.CmdAddStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#cmdAddEps}.
	 * @param ctx the parse tree
	 */
	void enterCmdAddEps(malParser.CmdAddEpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#cmdAddEps}.
	 * @param ctx the parse tree
	 */
	void exitCmdAddEps(malParser.CmdAddEpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link malParser#cmdAddComentario}.
	 * @param ctx the parse tree
	 */
	void enterCmdAddComentario(malParser.CmdAddComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link malParser#cmdAddComentario}.
	 * @param ctx the parse tree
	 */
	void exitCmdAddComentario(malParser.CmdAddComentarioContext ctx);
}