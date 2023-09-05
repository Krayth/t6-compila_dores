package br.ufscar.dc.compiladores.mal;

import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Genero;
import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Publico_alvo;
import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Status;
import br.ufscar.dc.compiladores.mal.TabelaDeSimbolos.Tipo_anime;

public class Semantico extends malBaseVisitor<Void>{
    
    TabelaDeSimbolos tabela;
    int codigo_anime = 0;
    int codigo_avaliacoes = 0;

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
                case LIVRE:
                    publico_alvoAnimeDiv = "Livre";
                    break;
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

            // Verifica se anime ja foi declarado com mesmo nome
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
        Status status = SemanticoUtils.verificarStatus(tabela, ctx);
        String eps_assistidos = ctx.cmdAddEps().qtdEps().getText();
        String comentario = ctx.cmdAddComentario().getText();

        String statusDiv = "Erro";

        // Verifica se o anime avaliado foi declarado
        if (!(tabela.existe(nome_anime))) {
            File.AddString("                    <div id=\"erros\">" + 
            "Atenção!! O Anime " + nome_anime + " não existe.</div>\n");
        }
        else {
            int total_eps_anime =  Integer.parseInt(tabela.verificar_Total_eps(nome_anime));
            int eps_assistidos_int = Integer.parseInt(eps_assistidos);
            
            // Verifica se a nota esta entre 0 e 10
            if (Integer.parseInt(nota_anime) < 0 || Integer.parseInt(nota_anime) > 10) {
                File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! Erro Semântico: Nota "+ nota_anime + " inválida. Selecione um valor entre 0 e 10</div>\n");
            }

            // Verifica se o numero de episodios assistidos e menor que o numero total
            else if (eps_assistidos_int > total_eps_anime) {
                File.AddString("                    <div id=\"erros\">" + 
                "Atenção!! Erro Semântico: "+ eps_assistidos + " episódios assistidos maior do que o total.</div>\n");

            // Tratamento para inserir o nome do STATUS da avaliacao no arquivo HTML
            } else {
                switch (status) {
                    case COMPLETO:
                        if(eps_assistidos_int < total_eps_anime){
                            File.AddString("                    <div id=\"erros\">" + 
                                "Atenção!! Erro Semântico: " + eps_assistidos + " episódios assistidos. NÃO TERMINOU DE ASSISTIR.</div>\n");
                                statusDiv = "Completo mas não assistiu tudo???";
                        } else{
                            statusDiv = "Completo";
                        }
                        break;
                    case ABANDONADO:
                        if(eps_assistidos_int == total_eps_anime){
                            File.AddString("                    <div id=\"erros\">" + 
                                "Atenção!! Erro Semântico: Usuário abandonou assistindo todos os \"" + total_eps_anime + "\" episódios do anime !</font><p>\n");
                            statusDiv = "Abandonado, mas assistiu todos os eps??";
                        } else{
                            statusDiv = "Abandonado";
                        }
                        break;
                    case ASSISTINDO:
                        statusDiv = "Assistindo";
                        break;
                    default:
                        statusDiv = "Tipo Inválido";
                        break;
                }
                 
                String div = "                <td><div id=\"box\">\n"
                        + "                    <h1><font color=\"#090820\">Avaliação de " + nome_anime + "</font></h1>\n"
                        + "                    <font color=\"#321239\">Nota: " + nota_anime + "</font><br>\n"
                        + "                    <font color=\"#321239\">Status: " + statusDiv + "</font><p><p><p>\n"     
                        + "                    <font color=\"#321239\">Episódios assistidos: " + eps_assistidos + "</font><p><p><p>\n"
                        + "                    <font color=\"#321239\">Comentário: " + comentario + "</font><p><p><p>\n";
                File.addDivAvaliacao(div);
                codigo_avaliacoes++;
            }
            
        }

        return super.visitDeclare_avaliacao(ctx);
    }
}