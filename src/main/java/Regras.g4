lexer grammar Regras;

WS: [ \t\r\n]+ -> skip;
COMENTARIO: '/*' .*? '*/' -> skip;
COMENTARIO_LINA: '//' ~[\r\n]* -> skip;

PRINTLN: 'println';
FOR: 'for';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';


ACHAVE: '{';
FCHAVE: '}';
PV: ';';

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EQ: '=';

APARE: '(';
FPARE: ')';


ID: [a-zA-Z]+;
INT: [0-9]+;

CNEQ: '!=';
CEQL: '==';
CLEQ: '<=';
CGEQ: '>=';
CLES: '<';
CGRT: '>';

