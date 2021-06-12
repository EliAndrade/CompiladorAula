grammar Linguagem;

import Regras;



programa: acao+ EOF;
bloco: acao*;


acao: println 
	| if_acao
	| definicao
	| PV;


definicao: ID EQ expr PV;
if_acao: 
	IF condicao
	(ELIF condicao)* 
	(ELSE acao_bloco)?;


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
	| INT                               # intFator
	| ID								# idFator;