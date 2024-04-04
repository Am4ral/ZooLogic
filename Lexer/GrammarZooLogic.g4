grammar ZooLogic

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
PV: ';'
COMEN: '//';
ESC: 'lhama';
LER: 'porco';
VAR: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
OP_ARIT: '+'|'-'|'*'|'/'|'%';
OP_REL: |<| |<=| |>=| |>=| |<>| |==|;
OP_COND: '&&' | '||';
OP_ATR: '==';

