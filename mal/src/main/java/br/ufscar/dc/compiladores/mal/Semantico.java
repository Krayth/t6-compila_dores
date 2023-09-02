package br.ufscar.dc.compiladores.mal;

import java.io.File;

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
                        + "                    <font color=\"#2D7F2F\">Quantidade de Episódios: " + total_eps + "</font><p><p><p>\n"     
                        + "                    <font color=\"#2D7F2F\">Gênero: " + genero + "</font><p><p><p>\n"
                        + "                    <font color=\"#2D7F2F\">Público Alvo: " + publico_alvo + "</font><p><p><p>\n";
                File.addDiv(div);
                num_animes++;
        }
        return super.visitDeclare_anime(ctx);
    }

    @Override
    public Void visitDeclare_avaliacao(malParser.Declare_avaliacaoContext ctx) {

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
        return super.visitDeclare_avaliacao(ctx);
    }

    @Override 
    public Void visitCmdAddNota(malParser.CmdAddNotaContext ctx) {

        String nome_anime = ctx.cmdAddNome().nome_anime.getText();
        int nota_anime = ctx.cmdAddNota().nota_anime.getText();

        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {
            if (nota_anime < 0 || nota_anime > 10) {
                File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! Nota inválida. Avalie entre 0 e 10.</div>\n");
            }
            else {
                String div = "                <td><div id=\"box\">\n"
                            + "                    <h1><font color=\"#077F09\">" + nota_anime + "</font></h1>\n";
                File.addDiv(div);
            }
        }
        return super.visitCmdAddNota(ctx);
        }

    @Override
    public Void visitCmdAddStatus(malParser.CmdAddStatusContext ctx) {

        String nome_anime = ctx.cmdAddNome().nome_anime.getText();

        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {
            String status = ctx.cmdAddStatus().getText();

        }
        return super.visitCmdAddStatus(ctx);
    }

    @Override
    public Void visitCmdAddEps(malParser.CmdAddEpsContext ctx) {

        String nome_anime = ctx.cmdAddNome().nome_anime.getText();
        int eps_anime = ctx.cmdAddEps().status_anime.getText();
        String status_anime = ctx.cmdAddStatus().status_anime.getText();

        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {
            //TODO
        }
        return super.visitCmdAddEps(ctx);
    }

    @Override
    public Void visitCmdAddComentario(malParser.CmdAddComentarioContext ctx) {

        String nome_anime = ctx.cmdAddNome().nome_anime.getText();
        String comentario_anime = ctx.cmdAddComentario().comentario_anime_anime.getText();

        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {
            String div = "                <td><div id=\"box\">\n"
                        + "                    <h1><font color=\"#077F09\">" + comentario_anime + "</font></h1>\n";
            File.addDiv(div);
        }
        return super.visitCmdAddComentario(ctx);
    }
}