grammar Linguagem;

import Regras;



programa: acao+ EOF;
bloco: acao*;


acao: println 
	| if_acao
	| for_acao
	| while_acao
	| lista_var
	| definicao PV
	| PV;

lista_var: var_def  (arr_def)? (VIRGULA var_def (arr_def)?)* PV;
definicao: ID(arr_def)? EQ expr;

var_def: (CONST)? op=(STRING | INTEGER | FLOAT) ID;
arr_def: ACOLC INT_LIT FCOLC;

if_acao: 
	IF condicao
	(ELIF condicao)* 
	(ELSE acao_bloco)?;

for_acao: FOR APARE ID EQ expr PV expr PV definicao FPARE acao_bloco;	
while_acao: WHILE APARE expr FPARE acao_bloco;

acao_bloco: ACHAVE bloco FCHAVE | acao;
condicao: expr acao_bloco;
println: PRINTLN APARE expr FPARE PV;


expr: expr op = (MUL | DIV ) expr					# multiplicaoExpr
	| expr op = (ADD | SUB) expr					# somaExpr
	| expr op = (CLEQ | CGEQ | CLES | CGRT) expr	# relacionalExpr
	| expr op = (CEQL | CNEQ) expr					# igualidadeExpr
	| fator											# fatorExpr;

fator:
	APARE expr FPARE					# pareFator
	| INT_LIT                           # intFator
	| STRING_LIT                        # stringFator
	| FLOAT_LIT                         # floatFator
	| ID (arr_def)?						# idFator;