package br.ufscar.dc.compiladores.mal;

import java.util.ArrayList;
import java.util.List;

public class SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();

    public static TabelaDeSimbolos.Tipo_anime verificarTipo_anime(TabelaDeSimbolos tabela, malParser.Declare_animeContext ctx) {
        String tipo_anime = ctx.tipo_anime().getText();

        switch (tipo_anime) {
            case "TV":          return TabelaDeSimbolos.Tipo_anime.TV;
            case "Filme":       return TabelaDeSimbolos.Tipo_anime.FILME;
            case "OVA":         return TabelaDeSimbolos.Tipo_anime.OVA;
            case "Especial":    return TabelaDeSimbolos.Tipo_anime.ESPECIAL;                            
            default:
                File.AddString("                    <div id=\"erros\">" + 
                    "Erro: o Tipo de anime " + tipo_anime + " não existe!</div>\n");
                return TabelaDeSimbolos.Tipo_anime.INVALIDO;
        }
    }

    public static TabelaDeSimbolos.Tipo_anime verificarTipo_anime(TabelaDeSimbolos tabela, String nomeAnime) {

        if(tabela.existe(nomeAnime)) {
            return tabela.verificar_Tipo_anime(nomeAnime);
        } else {
            return TabelaDeSimbolos.Tipo_anime.INVALIDO;
        }

    }

    public static TabelaDeSimbolos.Genero verificarGenero_anime(TabelaDeSimbolos tabela, malParser.Declare_animeContext ctx) {
        String genero_anime = ctx.genero().getText();

        switch (genero_anime) {
            case "Acao":            return TabelaDeSimbolos.Genero.ACAO;
            case "Aventura":        return TabelaDeSimbolos.Genero.AVENTURA;
            case "Drama":           return TabelaDeSimbolos.Genero.DRAMA;
            case "Comedia":         return TabelaDeSimbolos.Genero.COMEDIA;  
            case "Terror":          return TabelaDeSimbolos.Genero.TERROR;                            
            case "Fantasia":        return TabelaDeSimbolos.Genero.FANTASIA;                            
            case "Scifi":           return TabelaDeSimbolos.Genero.SCIFI;                            
            case "Romance":         return TabelaDeSimbolos.Genero.ROMANCE;                            
            case "Misterio":        return TabelaDeSimbolos.Genero.MISTERIO;                            
            case "SliceOfLife":     return TabelaDeSimbolos.Genero.SLICEOFLIFE;                            
            case "Sobrenatural":    return TabelaDeSimbolos.Genero.SOBRENATURAL;                            
            case "Suspense":        return TabelaDeSimbolos.Genero.SUSPENSE;                            
            case "Musical":         return TabelaDeSimbolos.Genero.MUSICAL;                            
            case "Esporte":         return TabelaDeSimbolos.Genero.ESPORTE;                                                     

            
            default:
                File.AddString("                    <div id=\"erros\">" + 
                    "Erro: o Genero de anime " + genero_anime + " não existe!</div>\n");
                return TabelaDeSimbolos.Genero.INVALIDO;
        }
    }

    public static TabelaDeSimbolos.Genero verificarGenero(TabelaDeSimbolos tabela, String nomeAnime) {
  
        if(tabela.existe(nomeAnime)) {
            return tabela.verificar_Genero(nomeAnime);
        } else {
            return TabelaDeSimbolos.Genero.INVALIDO ;
        }
 
    }

    public static TabelaDeSimbolos.Publico_alvo verificarPublico_alvo(TabelaDeSimbolos tabela, malParser.Declare_animeContext ctx) {;
        String publico_alvo_anime = ctx.publico_alvo().getText();

        switch (publico_alvo_anime) {
            case "Shounen": return TabelaDeSimbolos.Publico_alvo.SHOUNEN;
            case "Seinen":  return TabelaDeSimbolos.Publico_alvo.SEINEN;
            case "Shoujo":  return TabelaDeSimbolos.Publico_alvo.SHOUJO;
            case "R18":     return TabelaDeSimbolos.Publico_alvo.R18;                                                    

            default:
                File.AddString("                    <div id=\"erros\">" + 
                    "Erro: o Publico Alvo de anime " + publico_alvo_anime + " não existe!</div>\n");
                return TabelaDeSimbolos.Publico_alvo.INVALIDO;
        }
    }

    public static TabelaDeSimbolos.Publico_alvo verificarPublico_alvo(TabelaDeSimbolos tabela, String nomeAnime) {
    
        if(tabela.existe(nomeAnime)) {
            return tabela.verificar_Publico_alvo(nomeAnime);
        } else {
            return TabelaDeSimbolos.Publico_alvo.INVALIDO  ;
        }

    }

    public static TabelaDeSimbolos.Status verificarStatus(TabelaDeSimbolos tabela, malParser.Declare_avaliacaoContext ctx) {
        String status_anime = ctx.cmdAddStatus().getText();
        if (status_anime != null) {

            switch (status_anime) {
                case "Completo":   return TabelaDeSimbolos.Status.COMPLETO;
                case "Assistindo": return TabelaDeSimbolos.Status.ASSISTINDO;
                case "Abandonado": return TabelaDeSimbolos.Status.ABANDONADO;
    
                default:
                    File.AddString("                    <div id=\"erros\">" + 
                        "Erro: o Status de anime " + status_anime + " não existe!</div>\n");
                    return TabelaDeSimbolos.Status.INVALIDO;
            }
        } else {
            File.AddString("                    <div id=\"erros\">" + 
                        "Erro: o Status de anime não existe!</div>\n");
            return TabelaDeSimbolos.Status.INVALIDO;
        }
    }
}
