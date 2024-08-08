import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class CompiladorZooloGic {

    public static void  main (String[] args){
        String filename = "F:\\Faculdade\\Matérias\\5 periodo\\Compiladores\\ZooLogic\\exemplos\\Soma-N-Termos-Fib";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            GrammarZooLogicLexer lexer = new GrammarZooLogicLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarZooLogicParser parser = new GrammarZooLogicParser(tokens);

            GrammarZooLogicParser.ProgContext ast = parser.prog();

            System.out.println(ast.toStringTree(parser));





            //Exemplo para exercitar o uso do lexer
            //Token token;
//            while (!lexer._hitEOF){
//                token = lexer.nextToken();
//                System.out.println("Token: <Classe: "+lexer.getVocabulary().getSymbolicName(token.getType()) +" ,Lexema: "+ token.getText() +">");
//                }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
