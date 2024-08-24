grammar GrammarZooLogic;

prog:   (stmt)* #NInicio;

stmt:   mainStmt
    |   funcDef
    |   ifStmt
    |   forStmt
    |   whileStmt
    |   retStmt
    |   varDecl
    |   inputOutput
    |   varAssign
    ;

mainStmt:   'selva''()' '{' stmt* '}' #NMain;
funcDef:    'arvore' TIPO VAR'(' paramList? ')' '{' stmt* '}' #NFuncao;
ifStmt:     'cobra' '(' expr ')' '{' stmt* '}' (elifStmt)* (elseStmt)? #NIf;
elifStmt:   'caudaCobra' '(' expr ')' '{' stmt* '}' #NElseIf;
elseStmt:   'cauda' '{' stmt* '}' #NElse;
forStmt:    'formiga' '(' varDecl expr ';' expr')' '{' stmt* '}' #NFOR;
whileStmt:  'baleia' '(' expr ')' '{' stmt* '}' #NWhile;
retStmt:    'desmatamento' expr ';' #NReturn;
varDecl:    TIPO VAR ('=' expr)? ';' #NDeclaracao;
varAssign:  VAR '=' expr ';' #NAtribuicao;

inputOutput: 'lhama' '(' (stringExpr | VAR | NUM) ')' ';' #NOutput
           | 'porco' '(' VAR ')' ';' #NInput
           ;

stringExpr:  STRING
           | STRING OP_CONCAT stringExpr
           | VAR OP_CONCAT stringExpr
           | NUM OP_CONCAT stringExpr
           | '(' expr ')' OP_CONCAT stringExpr
           | VAR
           ;


paramList:  param (',' param)* ;
param:      TIPO VAR ;

expr:       expr OP_ARIT expr
    |       expr OP_REL expr
    |       expr OP_COND expr
    |       expr OP_ATR expr
    |       '(' expr ')'
    |       NUM
    |       STRING
    |       VAR
    |       VAR '(' (expr (',' expr)*)? ')'
    |       'lhama' '(' expr ')'
    |       'porco' '(' expr ')'
    ;

MAIN: 'selva';
FUNC: 'arvore';
IF: 'cobra';
ELSE: 'cauda';
ELIF: 'caudaCobra';
RET: 'desmatamento';
FOR: 'formiga';
WHILE: 'baleia';
TIPO: 'indio' | 'pato' | 'boi' | 'pe' | 'centopeia';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
ASP: '"';
PV: ';';
COMEN: '//';
ESC: 'lhama';
LER: 'porco';
STRING: ASP (~["\r\n] | '\\' .)* ASP;
VAR: LETRA (DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
OP_ARIT: '+'|'-'|'*'|'/'|'%';
OP_REL: '<'| '>'| '>='| '<='| '==' | '!=';
OP_COND: '&&' | '||';
OP_ATR: '=';
OP_CONCAT: '++';
WS: [ \r\t\n]+ -> skip;
//ErrorChar: . ;
