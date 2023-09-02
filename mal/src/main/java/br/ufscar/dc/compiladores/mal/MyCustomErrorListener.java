package br.ufscar.dc.compiladores.mal;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class MyCustomErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, 
            int charPositionInLine, String msg, RecognitionException e) {

        Token t = (Token) offendingSymbol;
        String erro = t.getText();

        // Condicao de parada para interromper o programa
        if(!erro.equals("<EOF>")) 
            // Grava a mensagem de erro sintatico no arquivo
            File.AddString("                    <div id=\"erros\">" + 
                    "Erro sintático perto de: " + erro + "</div>\n");
    }
}
