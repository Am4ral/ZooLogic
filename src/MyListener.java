import java.util.*;

public class MyListener extends GrammarZooLogicBaseListener {

    private final Map<String, String> symbolTable = new HashMap<>();
    private final Deque<Map<String, String>> scopeStack = new ArrayDeque<>();

    public MyListener() {
        // Inicializa o primeiro escopo global
        scopeStack.push(new HashMap<>());
    }

    @Override
    public void enterNDeclaracao(GrammarZooLogicParser.NDeclaracaoContext ctx) {
        String varName = ctx.VAR().getText();
        String varType = ctx.TIPO().getText();

        if (currentScope().containsKey(varName)) {
            throw new RuntimeException("Erro: Variável '" + varName + "' já foi declarada.");
        }

        currentScope().put(varName, varType);
    }

    @Override
    public void enterNAtribuicao(GrammarZooLogicParser.NAtribuicaoContext ctx) {
        String varName = ctx.VAR().getText();

        if (!isVariableDeclared(varName)) {
            throw new RuntimeException("Erro: Variável '" + varName + "' não foi declarada.");
        }
    }

    @Override
    public void enterNFuncao(GrammarZooLogicParser.NFuncaoContext ctx) {
        String funcName = ctx.VAR().getText();

        if (currentScope().containsKey(funcName)) {
            throw new RuntimeException("Erro: Função '" + funcName + "' já foi declarada.");
        }

        currentScope().put(funcName, ctx.TIPO().getText());

        // Novo escopo para os parâmetros e variáveis locais da função
        scopeStack.push(new HashMap<>());
    }

    @Override
    public void exitNFuncao(GrammarZooLogicParser.NFuncaoContext ctx) {
        // Retira o escopo da função
        scopeStack.pop();
    }

    @Override
    public void enterParam(GrammarZooLogicParser.ParamContext ctx) {
        String paramName = ctx.VAR().getText();
        String paramType = ctx.TIPO().getText();

        if (currentScope().containsKey(paramName)) {
            throw new RuntimeException("Erro: Parâmetro '" + paramName + "' já foi declarado.");
        }

        currentScope().put(paramName, paramType);
    }

    @Override
    public void enterNIf(GrammarZooLogicParser.NIfContext ctx) {
        // Novo escopo para o bloco 'if'
        scopeStack.push(new HashMap<>());
    }

    @Override
    public void exitNIf(GrammarZooLogicParser.NIfContext ctx) {
        // Retira o escopo do bloco 'if'
        scopeStack.pop();
    }

    @Override
    public void enterNWhile(GrammarZooLogicParser.NWhileContext ctx) {
        // Novo escopo para o bloco 'while'
        scopeStack.push(new HashMap<>());
    }

    @Override
    public void exitNWhile(GrammarZooLogicParser.NWhileContext ctx) {
        // Retira o escopo do bloco 'while'
        scopeStack.pop();
    }

    @Override
    public void enterNFOR(GrammarZooLogicParser.NFORContext ctx) {
        // Novo escopo para o bloco 'for'
        scopeStack.push(new HashMap<>());
    }

    @Override
    public void exitNFOR(GrammarZooLogicParser.NFORContext ctx) {
        // Retira o escopo do bloco 'for'
        scopeStack.pop();
    }

    private boolean isVariableDeclared(String varName) {
        for (Map<String, String> scope : scopeStack) {
            if (scope.containsKey(varName)) {
                return true;
            }
        }
        return false;
    }

    private Map<String, String> currentScope() {
        return scopeStack.peek();
    }

    public Deque<Map<String, String>> getScopeStack() {
        return scopeStack;
    }
}
