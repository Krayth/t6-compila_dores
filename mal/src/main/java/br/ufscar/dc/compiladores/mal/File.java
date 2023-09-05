package br.ufscar.dc.compiladores.mal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File {

    public static StringBuffer File = new StringBuffer();
    public static String pathFile; // variavel para guardar o caminho do arquivo
    
    // Lista que separa cada div pelo Anime e avaliação
    public static List<String> divAnime = new ArrayList<String>();
    public static List<String> divAvaliacao = new ArrayList<String>();

    public static void AddString(String str) {
        File.append(str).append("\n");
    }

    public static String getText() {
        return File.toString();
    }

    // Geracao de codigo
    // A funcao criaArquivo cria o escopo do codigo html junto com o estilo CSS
    public static void criaArquivo(String path) {
        pathFile = path;
        File.append("<html>\n" +
                "    <head>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "        <title>Catálogo de animes com avaliações</title>\n" +
                "        <style type=\"text/css\">\n" +
                "            html {\n" +
                "                background: url('https://wallpapercave.com/wp/wp3209489.jpg') no-repeat center center fixed;\n" +
                "                -webkit-background-size: cover;"+  
                "                -moz-background-size: cover;"+
                "                -o-background-size: cover;"+
                "                background-size: cover;"+
                "            }\n" +
                "            table {\n" +
                "               table-layout: fixed;\n" +
                "               width: 100%;\n;"+
                "            }\n" +                               
                "            h1 {\n" +
                "                text-align: center;\n" +
                "                color: #fff;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold; \n" +
                "            }"+
                "            th, td {\n" +
                "                vertical-align: top;\n" +
                "                word-wrap: break-word;\n"+
                "            }\n" +
                "            #box {\n" +
                "                width: 300px;\n" +
                "                min-height: 200px;\n" +
                "                max-height: 400px;\n" +
                "                border-style: solid;\n" +
                "                border-color: #350A58;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #db8630;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #8d91d0;\n" +
                "            }\n" +
                "\n" +
                "            #erros {\n" +
                "                margin: 0 auto;\n" +
                "                border-style: solid;\n" +
                "                border-color: #350A58;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #900c3f;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #8d91d0;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip {\n" +
                "                position: relative;\n" +
                "                display: inline-block;\n" +
                "                cursor: help;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip .tooltiptext {\n" +
                "                visibility: hidden;\n" +
                "                width: 120px;\n" +
                "                text-align: center;\n" +
                "                border-radius: 6px;\n" +
                "                padding: 5px 0;\n" +
                "                position: absolute;\n" +
                "                z-index: 1;\n" +
                "                top: -5px;\n" +
                "                left: 105%;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip:hover .tooltiptext {\n" +
                "                visibility: visible;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "         \n" +
                "    <body>\n" +
                "<h1><font color=#1d0530>Catálogo de Animes com Avaliações</h1>" +
                "        <table>\n" +
                "            <tr>\n");
    }
    
    // Criacao da div do anime
    public static void addDivAnime(String info) {
        divAnime.add(info);
    }

    public static void addDivAvaliacao(String info) {
        divAvaliacao.add(info);
    }
        
    // Concatena div de um Anime
    public static void appendDivAnime(int codigo_anime, String infoNova) {
        String infoAnterior = divAnime.get(codigo_anime);
        String infoConcat = infoAnterior.concat(infoNova);
        
        divAnime.set(codigo_anime, infoConcat);
    }

    public static void appendDivAvaliacao(int codigo_avaliacoes, String infoNova) {
        String infoAnterior = divAvaliacao.get(codigo_avaliacoes);
        String infoConcat = infoAnterior.concat(infoNova);

        divAvaliacao.set(codigo_avaliacoes, infoConcat);
    }

    // Grava todas as info concatenadas no arquivo de saida
    public static void gravaArquivo() {
        for(int i = 0; i < divAnime.size(); i++) {
            appendDivAnime(i, "                </td></div>\n\n");
            File.append(divAnime.get(i));

            if(i == 3){
                File.append("            <tr>\n");
            }
        }
        
        File.append("            </tr>\n");
        File.append("            <tr>\n");
        for(int i = 0; i < divAvaliacao.size(); i++) {
            appendDivAvaliacao(i, "                </td></div>\n\n");
            File.append(divAvaliacao.get(i));

            if(i == 3){
                File.append("            <tr>\n");
            }
        }

        File.append("            </tr>\n" +
                "        </table>\n" +
                "    </body>\n" +
                "</html>");

        try {
            Files.writeString(Paths.get(pathFile), getText());
        } catch (IOException e) {
        }
        System.exit(0);
    }
}