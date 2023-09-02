package br.ufscar.dc.compiladores.mal;

import java.util.ArrayList;
import java.util.List;

public class SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();

    public static TabelaDeSimbolos.Tipo_anime getTipo_anime(TabelaDeSimbolos tabela, String nomeVar) {
        //TabelaDeSimbolos.Tipo_anime tipo_anime = TabelaDeSimbolos.Tipo_anime.INVALIDO ;

        switch (nomeVar) {
            case "TV":    return TabelaDeSimbolos.Tipo_anime.TV;
            case "Filme": return TabelaDeSimbolos.Tipo_anime.FILME;
            case "OVA": return TabelaDeSimbolos.Tipo_anime.OVA;
            case "Especial":      return TabelaDeSimbolos.Tipo_anime.ESPECIAL;                            
            default:
                //File.AddString("                    <div id=\"erros\">" + 
                    //"Erro: o Tipo de anime " + tipo_anime + " não existe!</div>\n");
                return TabelaDeSimbolos.Tipo_anime.INVALIDO;
        }
    }

    public static TabelaDeSimbolos.Tipo_anime verificarTipo_anime(TabelaDeSimbolos tabela, String nomeVar) {
        TabelaDeSimbolos.Tipo_anime tipo_anime = TabelaDeSimbolos.Tipo_anime.INVALIDO ;
        
        if(tabela.existe(nomeVar)) {
            return tabela.verificar_Tipo_anime(nomeVar);
        }

        return tipo_anime;
    }

    public static TabelaDeSimbolos.Genero getGenero_anime(TabelaDeSimbolos tabela, String nomeVar) {
        //TabelaDeSimbolos.Genero genero = TabelaDeSimbolos.Genero.INVALIDO ;

        switch (nomeVar) {
            case "Acao":    return TabelaDeSimbolos.Genero.ACAO;
            case "Aventura": return TabelaDeSimbolos.Genero.AVENTURA;
            case "Drama": return TabelaDeSimbolos.Genero.DRAMA;
            case "Comedia":      return TabelaDeSimbolos.Genero.COMEDIA;  
            case "Terror":      return TabelaDeSimbolos.Genero.TERROR;                            
            case "Fantasia":      return TabelaDeSimbolos.Genero.FANTASIA;                            
            case "Scifi":      return TabelaDeSimbolos.Genero.SCIFI;                            
            case "Romance":      return TabelaDeSimbolos.Genero.ROMANCE;                            
            case "Misterio":      return TabelaDeSimbolos.Genero.MISTERIO;                            
            case "SliceOfLife":      return TabelaDeSimbolos.Genero.SLICEOFLIFE;                            
            case "Sobrenatural":      return TabelaDeSimbolos.Genero.SOBRENATURAL;                            
            case "Suspense":      return TabelaDeSimbolos.Genero.SUSPENSE;                            
            case "Musical":      return TabelaDeSimbolos.Genero.MUSICAL;                            
            case "Esporte":      return TabelaDeSimbolos.Genero.ESPORTE;                                                     

            
            default:
                //File.AddString("                    <div id=\"erros\">" + 
                    //"Erro: o Genero de anime " + genero + " não existe!</div>\n");
                return TabelaDeSimbolos.Genero.INVALIDO;
        }
    }

    public static TabelaDeSimbolos.Genero verificarGenero(TabelaDeSimbolos tabela, String nomeVar) {
        TabelaDeSimbolos.Genero genero = TabelaDeSimbolos.Genero.INVALIDO ;
        
        if(tabela.existe(nomeVar)) {
            return tabela.verificar_Genero(nomeVar);
        }

        return genero;
    }

    public static TabelaDeSimbolos.Publico_alvo getPublico_alvo(TabelaDeSimbolos tabela, String nomeVar) {
        //TabelaDeSimbolos.Publico_alvo publico_alvo = TabelaDeSimbolos.Publico_alvo.INVALIDO ;

        switch (nomeVar) {
            case "Shounen":    return TabelaDeSimbolos.Publico_alvo.SHOUNEN;
            case "Seinen": return TabelaDeSimbolos.Publico_alvo.SEINEN;
            case "Shoujo": return TabelaDeSimbolos.Publico_alvo.SHOUJO;
            case "R18":      return TabelaDeSimbolos.Publico_alvo.R18;                                                    

            default:
                //File.AddString("                    <div id=\"erros\">" + 
                    //"Erro: o Publico Alvo de anime " + publico_alvo + " não existe!</div>\n");
                return TabelaDeSimbolos.Publico_alvo.INVALIDO;
        }
    }

    public static TabelaDeSimbolos.Publico_alvo verificarPublico_alvo(TabelaDeSimbolos tabela, String nomeVar) {
        TabelaDeSimbolos.Publico_alvo publico_alvo = TabelaDeSimbolos.Publico_alvo.INVALIDO ;
        
        if(tabela.existe(nomeVar)) {
            return tabela.verificar_Publico_alvo(nomeVar);
        }

        return publico_alvo;
    }

}
