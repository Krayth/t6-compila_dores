package br.ufscar.dc.compiladores.mal;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufscar.dc.compiladores.mal.malParser.ProgramContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class App {

    
    public static void main(String[] args) {
        // Cria um objeto para escrever no arquivo
        try(PrintWriter pw = new PrintWriter(new File(args[1]))) {

            try {
                
                // args[0] é o primeiro argumento da linha de comando
                // Ler o arquivo com o path que está em args[0]
                CharStream cs = CharStreams.fromFileName(args[0]);
                //Cria o lexer
                malLexer lex = new malLexer(cs);
                //Cria o parser
                CommonTokenStream tokens = new CommonTokenStream(lex);

                malParser parser = new malParser(tokens);
                //Remove tratamento padrão
                parser.removeErrorListeners();

                //Contador de erros para condicao de parada do detector de erros
                Integer contador_erro = 0;

                //Chamada do tratador de erros
                MyCustomErrorListener mcel = new MyCustomErrorListener(pw,contador_erro);
                parser.addErrorListener(mcel);
                
                ProgramContext arvore = parser.program();
                Semantico as = new Semantico();
                as.visitProgram(arvore);

                parser.program();

                // Arquivo.gravaArquivo();
            } catch (IOException error) {
                error.printStackTrace();
            }
        } catch(FileNotFoundException fnfe) {
            // Caso o arquivo de saída não existir
            System.err.println("O arquivo/diretório não existe:"+args[1]);
        }

    }
}

