import java.util.HashMap;
import java.util.Map;

public class MyListener extends GrammarZooLogicBaseListener{

    private Map<String,String> symbolTable = new HashMap<>();

//    @Override
//    public void enterEveryRule(ParserRuleContext ctx) {
//        System.out.println("Entrou na regra: " + ctx.getText());
//    }
//
//    @Override
//    public void exitEveryRule(ParserRuleContext ctx) {
//        System.out.println("Saiu da regra: " + ctx.getText());
//    }

    @Override
    public void enterNDeclaracao(GrammarZooLogicParser.NDeclaracaoContext ctx) {
        System.out.println("Entrou na regra: " + ctx.getText());
    }

    @Override
    public void exitNDeclaracao(GrammarZooLogicParser.NDeclaracaoContext ctx) {

        System.out.println("Saiu da regra: " + ctx.getText());

        //Verificando se tem variável já declarada
        String var = ctx.VAR().getText();
        String tipo = ctx.TIPO().getText();
        if(symbolTable.containsKey(var)){
            System.out.println("Variável " + var + " já declarada");
        } else {
            symbolTable.put(var, tipo);
        }

    }

//    @Override
//    public void enterNAtribuicao(GrammarZooLogicParser.NAtribuicaoContext ctx) {
//        System.out.println("Entrou na regra: " + ctx.getText());
//    }
//
//    @Override
//    public void exitNAtribuicao(GrammarZooLogicParser.NAtribuicaoContext ctx) {
//
//        System.out.println("Saiu da regra: " + ctx.getText());
//
//    }




    public Map<String, String> getSymbolTable() {
        return symbolTable;
    }


}
