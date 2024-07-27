grammar GrammarZooLogic;

prog:   (stmt)* EOF;

stmt:   mainStmt
    |   funcDef
    |   ifStmt
    |   forStmt
    |   whileStmt
    |   retStmt
    |   varDecl
    |   varAssign
    ;

mainStmt:   'main' '{' stmt* '}' ;
funcDef:    'func' VAR '(' paramList? ')' '{' stmt* '}' ;
ifStmt:     'if' '(' expr ')' '{' stmt* '}' (elifStmt)* (elseStmt)? ;
elifStmt:   'elif' '(' expr ')' '{' stmt* '}' ;
elseStmt:   'else' '{' stmt* '}' ;
forStmt:    'for' '(' varDecl expr ';' expr ')' '{' stmt* '}' ;
whileStmt:  'while' '(' expr ')' '{' stmt* '}' ;
retStmt:    'return' expr ';' ;
varDecl:    TIPO VAR ('=' expr)? ';' ;
varAssign:  VAR '=' expr ';' ;

paramList:  param (',' param)* ;
param:      TIPO VAR ;

expr:       expr OP_ARIT expr
    |       expr OP_REL expr
    |       expr OP_COND expr
    |       '(' expr ')'
    |       NUM
    |       STRING
    |       VAR
    |       'esc' expr
    |       'ler' expr
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
WS: [ \r\t\n]+ ->skip;
ErrorChar: . ;

