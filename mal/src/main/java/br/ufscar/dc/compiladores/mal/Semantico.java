package br.ufscar.dc.compiladores.mal;

import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Tipo_anime;

public class Semantico extends malBaseVisitor<Void>{
    
    TabelaDeSimbolos tabela;
    int num_animes = 0;
    int num_avaliacoes = 0;

    @Override
    public Void visitPrograma(malParser.ProgramContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitProgram(ctx);
    }

    @Override
    public Void visitDeclare_anime(malParser.Declare_animeContext ctx) {

        String nome_anime = ctx.declare_nome().getText();
        if (tabela.existe(nome_anime)) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " já existe.</div>\n");
        }
        else {
            String tipo_anime = ctx.tipo_anime().getText();
            String total_eps = ctx.total_eps().getText();
            String genero = ctx.genero().getText();
            String publico_alvo = ctx.publico_alvo().getText();
            //tabela.adicionarAnime(nome_anime, tipo_anime, total_eps, genero, publico_alvo);
            String div = "                <td><div id=\"box\">\n"
                        + "                    <h1><font color=\"#077F09\">" + nome_anime + "</font></h1>\n"
                        + "                    <font color=\"#2D7F2F\">Tipo: " + tipo_anime + "</font><br>\n"
                        + "                    <font color=\"#2D7F2F\">Quantidade de Episodios: " + total_eps + "</font><p><p><p>\n"     
                        + "                    <font color=\"#2D7F2F\">Genero: " + genero + "</font><p><p><p>\n"
                        + "                    <font color=\"#2D7F2F\">Publico Alvo: " + publico_alvo + "</font><p><p><p>\n";
                File.addDiv(div);
                num_animes++;
        }

    @Override Void visitDeclare_avaliacao(malParser.Declare_avaliacaoContext ctx) {

        String nome_anime = ctx.cmdAddNome().nome_anime().getText();


        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {

            String div = "                <td><div id=\"box\">\n"
                        + "                    <h1><font color=\"#077F09\">" + nome_anime + "</font></h1>\n";
            File.addDiv(div);
            num_avaliacoes++;

        }
    }
}
