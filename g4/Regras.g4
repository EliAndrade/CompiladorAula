lexer grammar Regras;

WS: [ \t\r\n]+ -> skip;
COMENTARIO: '/*' .*? '*/' -> skip;
COMENTARIO_LINA: '//' ~[\r\n]* -> skip;

PRINTLN: 'println';
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';

INTEGER: 'int';
STRING: 'string';
FLOAT: 'float';
CONST: 'const';

VIRGULA: ',';

ACOLC: '[';
FCOLC: ']';

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
STRING_LIT: '\''(.)+?'\'';
INT_LIT: [0-9]+;
FLOAT_LIT: [0-9]+ '.' [0-9]* | '.' [0-9]+;

CNEQ: '!=';
CEQL: '==';
CLEQ: '<=';
CGEQ: '>=';
CLES: '<';
CGRT: '>';

