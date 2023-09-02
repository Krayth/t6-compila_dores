package br.ufscar.dc.compiladores.mal;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufscar.dc.compiladores.mal.malParser.ProgramContext;

public class App {

    
    public static void main(String args[]) throws IOException {
        // Cria um objeto para escrever no arquivo
        try {
            File.criaArquivo(args[1]);

            // args[0] é o primeiro argumento da linha de comando
            // Ler o arquivo com o path que está em args[0]
            CharStream cs = CharStreams.fromFileName(args[0]);
            //Cria o lexer
            malLexer lex = new malLexer(cs);
            //Cria o parser
            CommonTokenStream tokens = new CommonTokenStream(lex);
            
            //Remove tratamento padrão
            malParser parser = new malParser(tokens);
            
            //Chamada do tratador de erros
            MyCustomErrorListener mcel = new MyCustomErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(mcel);
            
            // ProgramContext arvore = parser.program();
            // Semantico as = new Semantico();
            // as.visitProgram(arvore);

            parser.program();

            File.gravaArquivo();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}

