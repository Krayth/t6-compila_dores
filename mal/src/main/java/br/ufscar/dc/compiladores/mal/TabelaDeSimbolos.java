package br.ufscar.dc.compiladores.mal;

import java.util.HashMap;
import java.util.Map;


public class TabelaDeSimbolos {
    public enum Tipo_anime {
        TV,
        FILME,
        OVA,
        ESPECIAL,
        INVALIDO
    }

    public enum Genero {
        ACAO, AVENTURA, DRAMA,
        COMEDIA, TERROR, FANTASIA,
        SCIFI, ROMANCE, MISTERIO,
        SLICEOFLIFE, SOBRENATURAL, SUSPENSE,
        MUSICAL, ESPORTE, INVALIDO
    }

    public enum Publico_alvo {
        LIVRE,
        SHOUNEN,
        SEINEN,
        SHOUJO,
        R18,
        INVALIDO   
    }

    public enum Status {
        COMPLETO,
        ASSISTINDO,
        ABANDONADO,
        INVALIDO   
    }

    class EntradaTabelaSimbolos {
        String nome_anime;
        Tipo_anime tipo_anime;
        Genero genero;
        String total_eps;
        Publico_alvo publico_alvo;
        int codigo;
    
        private EntradaTabelaSimbolos(String nome_anime, Tipo_anime tipo_anime,
            Genero genero, String total_eps, Publico_alvo publico_alvo, int codigo) {
                this.nome_anime = nome_anime;
                this.tipo_anime = tipo_anime;
                this.genero = genero;
                this.total_eps = total_eps;
                this.publico_alvo = publico_alvo;
                this.codigo = codigo;
        }
    }

    private final Map<String, EntradaTabelaSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void adicionarAnime(String nome_anime, Tipo_anime tipo_anime,
            Genero genero, String total_eps, Publico_alvo publico_alvo, int codigo) {
        
        tabela.put(nome_anime, new EntradaTabelaSimbolos(nome_anime, tipo_anime, genero, total_eps, publico_alvo, codigo));
    }

    public void adicionarAvaliacao(String nome, int nota, String status, String eps, 
        String comentario) {

    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public Tipo_anime verificar_Tipo_anime(String nome) {
        return tabela.get(nome).tipo_anime;
    }

    public Genero verificar_Genero(String nome) {
        return tabela.get(nome).genero;
    }

    public String verificar_Total_eps(String nome){
        return tabela.get(nome).total_eps;
    }

    public Publico_alvo verificar_Publico_alvo(String nome) {
        return tabela.get(nome).publico_alvo;
    }

    public int verificarCodigo(String nome) {
        return tabela.get(nome).codigo;
    }
}
