package br.ufscar.dc.compiladores.mal;

import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Genero;
import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Publico_alvo;
import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Tipo_anime;

public class Semantico extends malBaseVisitor<Void>{
    
    TabelaDeSimbolos tabela;
    int num_animes = 0;
    int num_avaliacoes = 0;

    @Override
    public Void visitProgram(malParser.ProgramContext ctx) {
        tabela = new TabelaDeSimbolos();
        return super.visitProgram(ctx);
    }

    @Override
    public Void visitDeclare_anime(malParser.Declare_animeContext ctx) {
        if(ctx.tipo_anime() != null && ctx.genero() != null && ctx.publico_alvo()!= null){
            Tipo_anime tipo_anime = SemanticoUtils.verificarTipo_anime(tabela, ctx);
            String tipoAnimeDiv;
            String nome_anime = ctx.declare_nome().getText();
            
            // Tratamento para inserir o nome do TIPO do anime no arquivo HTML
            switch (tipo_anime) {
                case TV:
                    tipoAnimeDiv = "TV";
                    break;
                case FILME:
                    tipoAnimeDiv = "Filme";
                    break;
                case OVA:
                    tipoAnimeDiv = "OVA";
                    break;
                case ESPECIAL:
                    tipoAnimeDiv = "Especial";
                    break;
                default:
                    tipoAnimeDiv = "Tipo Inválido";
                    break;
            }

            Genero genero_anime = SemanticoUtils.verificarGenero_anime(tabela, ctx);
            String generoAnimeDiv;
            
            // Tratamento para inserir o nome do GENERO do anime no arquivo HTML
            switch (genero_anime) {
                case ACAO:
                    generoAnimeDiv = "Acao";
                    break;
                case AVENTURA:
                    generoAnimeDiv = "Aventura";
                    break;
                case DRAMA:
                    generoAnimeDiv = "Drama";
                    break;
                case COMEDIA:
                    generoAnimeDiv = "Comedia";
                    break;
                case TERROR:
                    generoAnimeDiv = "Terror";
                    break;
                case FANTASIA:
                    generoAnimeDiv = "Fantasia";
                    break;
                case SCIFI:
                    generoAnimeDiv = "Scifi";
                    break;
                case ROMANCE:
                    generoAnimeDiv = "Romance";
                    break;
                case MISTERIO:
                    generoAnimeDiv = "Misterio";
                    break;
                case SLICEOFLIFE:
                    generoAnimeDiv = "SliceOfLife";
                    break;
                case SOBRENATURAL:
                    generoAnimeDiv = "Sobrenatural";
                    break;
                case SUSPENSE:
                    generoAnimeDiv = "Suspense";
                    break;
                case MUSICAL:
                    generoAnimeDiv = "Musical";
                    break;
                case ESPORTE:
                    generoAnimeDiv = "Esporte";
                    break;
                default:
                    generoAnimeDiv = "Tipo Inválido";
                    break;
            }

            Publico_alvo publico_alvo_anime = SemanticoUtils.verificarPublico_alvo(tabela, ctx);
            String publico_alvoAnimeDiv;
            
            // Tratamento para inserir o nome do PUBLICO_ALVO do anime no arquivo HTML
            switch (publico_alvo_anime) {
                case SHOUNEN:
                    publico_alvoAnimeDiv = "Shounen";
                    break;
                case SEINEN:
                    publico_alvoAnimeDiv = "Seinen";
                    break;
                case SHOUJO:
                    publico_alvoAnimeDiv = "Shoujo";
                    break;
                case R18:
                    publico_alvoAnimeDiv = "R18";
                    break;
                default:
                    publico_alvoAnimeDiv = "Tipo Inválido";
                    break;
            }

            if (tabela.existe(nome_anime)) {
                File.AddString("                    <div id=\"erros\">" + 
                    "Atenção!! O Anime " + nome_anime + " já existe.</div>\n");
            }
            else {
                // String tipo_anime_string = ctx.tipo_anime().getText();
                int total_eps = ctx.total_eps().getAltNumber();
                // String genero_string = ctx.genero().getText();
                // String publico_alvo_string = ctx.publico_alvo().getText();
                tabela.adicionarAnime(nome_anime, tipo_anime, genero_anime, total_eps, publico_alvo_anime);

                String div = "                <td><div id=\"box\">\n"
                            + "                    <h1><font color=\"#077F09\">" + nome_anime + "</font></h1>\n"
                            + "                    <font color=\"#2D7F2F\">Tipo: " + tipoAnimeDiv + "</font><br>\n"
                            + "                    <font color=\"#2D7F2F\">Quantidade de Episódios: " + total_eps + "</font><p><p><p>\n"     
                            + "                    <font color=\"#2D7F2F\">Gênero: " + generoAnimeDiv + "</font><p><p><p>\n"
                            + "                    <font color=\"#2D7F2F\">Público Alvo: " + publico_alvoAnimeDiv + "</font><p><p><p>\n";
                    File.addDivAnime(div);
                    num_animes++;
            }
        }

        return super.visitDeclare_anime(ctx);
    }

    @Override
    public Void visitDeclare_avaliacao(malParser.Declare_avaliacaoContext ctx) {

        String nome_anime = ctx.cmdAddNome().nome_anime().getText();
        int nota_anime = ctx.cmdAddNota().nota().getAltNumber();
        String status = ctx.cmdAddStatus().getText();
        int eps_assistidos = ctx.cmdAddEps().qtdEps().getAltNumber();
        String comentario = ctx.cmdAddComentario().getText();

        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {
            if (status == "Completo"){
                //
            }
            String div = "                <td><div id=\"box\">\n"
                        + "                    <h1><font color=\"#077F09\">" + nome_anime + "</font></h1>\n"
                        + "                    <font color=\"#2D7F2F\">Tipo: " + nota_anime + "</font><br>\n"
                        + "                    <font color=\"#2D7F2F\">Quantidade de Episódios: " + status + "</font><p><p><p>\n"     
                        + "                    <font color=\"#2D7F2F\">Gênero: " + eps_assistidos + "</font><p><p><p>\n"
                        + "                    <font color=\"#2D7F2F\">Público Alvo: " + comentario + "</font><p><p><p>\n";
            File.addDivAvaliacao(div);
            num_avaliacoes++;

        }
        return super.visitDeclare_avaliacao(ctx);
    }
}