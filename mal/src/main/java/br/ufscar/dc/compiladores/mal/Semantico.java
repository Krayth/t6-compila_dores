package br.ufscar.dc.compiladores.mal;

import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Genero;
import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Publico_alvo;
import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Tipo_anime;

public class Semantico extends malBaseVisitor<Void>{
    
    TabelaDeSimbolos tabela;
    int codigo_anime = 0;
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
            } else if(ctx.total_eps() != null){
                String total_eps = ctx.total_eps().getText();
                
                tabela.adicionarAnime(nome_anime, tipo_anime, genero_anime, total_eps, publico_alvo_anime, codigo_anime);

                String div = "                <td><div id=\"box\">\n"
                            + "                    <h1><font color=\"#090820\">" + nome_anime + "</font></h1>\n"
                            + "                    <font color=\"#321239\">Tipo: " + tipoAnimeDiv + "</font><br>\n"
                            + "                    <font color=\"#321239\">Quantidade de Episódios: " + total_eps + "</font><p><p><p>\n"     
                            + "                    <font color=\"#321239\">Gênero: " + generoAnimeDiv + "</font><p><p><p>\n"
                            + "                    <font color=\"#321239\">Público Alvo: " + publico_alvoAnimeDiv + "</font><p><p><p>\n";
                File.addDivAnime(div);
                codigo_anime++;
            }
        }

        return super.visitDeclare_anime(ctx);
    }

    @Override
    public Void visitDeclare_avaliacao(malParser.Declare_avaliacaoContext ctx) {

        String nome_anime = ctx.cmdAddNome().nome_anime().getText();
        String nota_anime = ctx.cmdAddNota().nota().getText();
        String status = ctx.cmdAddStatus().getText();
        String eps_assistidos = ctx.cmdAddEps().qtdEps().getText();
        String comentario = ctx.cmdAddComentario().getText();

        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {
            int codigo_anime = tabela.verificarCodigo(nome_anime);
            int total_eps_anime =  Integer.parseInt(tabela.verificar_Total_eps(nome_anime));
            int eps_assistidos_int = ctx.cmdAddEps().getAltNumber();
            if (status == "Completo"){
                //
                if(eps_assistidos_int != total_eps_anime){
                    File.appendDivAvaliacao(codigo_anime,
                        "                    <font color=\"#321239\">Erro Semântico: Usuário não termino de assistir \"" + total_eps_anime + "\" episódios!</font><p>\n");
                } else {
                    File.appendDivAvaliacao(codigo_anime, 
                        "                    <font color=\"#321239\">Completou os\"" + total_eps_anime + "\" episódios do anime!</font><p>\n");
                }
            } else if (status == "Assistindo"){
                File.appendDivAvaliacao(codigo_anime, 
                    "                    <font color=\"#321239\">Está no episódio\"" + eps_assistidos_int + "\" do anime!</font><p>\n");
            } else if (status == "Abandonado"){
                File.appendDivAvaliacao(codigo_anime, 
                    "                    <font color=\"#321239\">Abandonou assistindo\"" + eps_assistidos_int + "\" episódios do anime!</font><p>\n");
            }
            String div = "                <td><div id=\"box\">\n"
                    + "                    <h1><font color=\"#090820\">Avaliação de " + nome_anime + "</font></h1>\n"
                    + "                    <font color=\"#321239\">Tipo: " + nota_anime + "</font><br>\n"
                    + "                    <font color=\"#321239\">Quantidade de Episódios: " + status + "</font><p><p><p>\n"     
                    + "                    <font color=\"#321239\">Gênero: " + eps_assistidos + "</font><p><p><p>\n"
                    + "                    <font color=\"#321239\">Público Alvo: " + comentario + "</font><p><p><p>\n";
            File.addDivAvaliacao(div);
            num_avaliacoes++;

        }
        return super.visitDeclare_avaliacao(ctx);
    }
}