grammar ZooLogic

MAIN: 'selva';
FUNC: 'arvore';
IF: 'cobra';
ELSE: 'cauda';
ELIF: 'caudaCobra';
RET: 'desmatamento';
FOR: 'formiga';
TIPO: 'indio' | 'pato' | 'doisPato' | 'boi' | 'pe' | 'centopeia';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
ESC: 'lhama';
LER: 'porco';
VAR: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';
fragment DIGITO: [0-9];
OP_REL: |<| |<=| |>=| |>=| |<>|;
