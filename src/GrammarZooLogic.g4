grammar GrammarZooLogic;

prog:   (stmt)*;

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

mainStmt:   'selva''()' '{' stmt* '}' ;
funcDef:    'arvore' TIPO '(' paramList? ')' '{' stmt* '}' ;
ifStmt:     'cobra' '(' expr ')' '{' stmt* '}' (elifStmt)* (elseStmt)? ;
elifStmt:   'caudaCobra' '(' expr ')' '{' stmt* '}' ;
elseStmt:   'cauda' '{' stmt* '}' ;
forStmt:    'formiga' '(' varDecl expr ';' expr ')' '{' stmt* '}' ;
whileStmt:  'baleia' '(' expr ')' '{' stmt* '}' ;
retStmt:    'desmatamento' expr ';' ;
varDecl:    TIPO VAR ('=' expr)? ';' ;
varAssign:  VAR '=' expr ';' ;

inputOutput: 'lhama' '(' (stringExpr | VAR | NUM) ')' ';'
           | 'porco' '(' VAR ')' ';'
           ;

stringExpr:  STRING
           | STRING OP_CONCAT (VAR | NUM | STRING | '(' expr ')')
           ;

paramList:  param (',' param)* ;
param:      TIPO VAR ;

expr:       expr OP_ARIT expr
    |       expr OP_REL expr
    |       expr OP_COND expr
    |       '(' expr ')'
    |       NUM
    |       STRING
    |       VAR
    |       'lhama' expr
    |       'porco' expr
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
VAR: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
OP_ARIT: '+'|'-'|'*'|'/'|'%';
OP_REL: '<'| '>'| '>='| '<='| '==' | '!=';
OP_COND: '&&' | '||';
OP_ATR: '=';
OP_CONCAT: '++';
WS: [ \r\t\n]+ ->skip;
ErrorChar: . ;

