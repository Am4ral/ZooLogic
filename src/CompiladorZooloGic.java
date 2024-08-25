import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class CompiladorZooloGic {

    public static void  main (String[] args){

        String filename = "F:\\Faculdade\\Matérias\\5 periodo\\Compiladores\\ZooLogic\\exemplos\\Soma-N-Termos-Fib";

        GrammarZooLogicParser parser = getParser(filename);

        GrammarZooLogicParser.ProgContext ast = parser.prog();

        System.out.println(ast.toStringTree());

        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, ast);

        System.out.println(listener.getScopeStack().toString());
    }


    private static GrammarZooLogicParser getParser(String fileName){

        GrammarZooLogicParser parser = null;

        try{
            CharStream input = CharStreams.fromFileName(fileName);
            GrammarZooLogicLexer lexer = new GrammarZooLogicLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GrammarZooLogicParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }
}