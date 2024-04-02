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
ESC: 'lhama';
LER: 'porco';
VAR: LETRA(DIGITO|LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
