import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class ExemploLexer {

    public static void  main (String[] args){
        String filename = "F:\\Faculdade\\5 periodo\\Compiladores\\Zoologic\\Soma-N-Termos-Fib";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            GrammarZooLogicLexer lexer = new GrammarZooLogicLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: <Classe: "+lexer.getVocabulary().getSymbolicName(token.getType()) +" ,Lexema: "+ token.getText() +">");
                }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
