import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings({"unchecked", "rawtypes"})
public class EvalVisitor extends LinguagemBaseVisitor<Object> {
	public static HashMap<String, Object> VARIAVEIS = new HashMap<String, Object>();

	public static HashMap<String, Class> TIPOS = new HashMap<String, Class>();
	public static HashMap<String, Boolean> CONSTANTES = new HashMap<String, Boolean>();
	
	public static void ERRO(String mensagem) {
		System.out.println(mensagem);
		System.exit(1);
	}
	
	public static boolean testarNumero(Object left, Object right) {
		return left instanceof Number && right instanceof Number;
	}
	
	public static boolean valorBooleano(Object valor) {
		return valor != null && (valor instanceof Number && valorDouble(valor) >= 1);
	}
	
	public static Double valorDouble(Object valor) {
		if (valor instanceof Integer) {
			return ((Integer) valor).doubleValue();
		} 
		
		return (Double) valor;
	}
	
	public static Object validarTipo(Object valor, Class tipo) {
		if (valor instanceof Number && tipo.equals(String.class)) {
			ERRO("Conversão inválida!");
		}else if (valor instanceof String && tipo.equals(Integer.class)) {
			ERRO("Conversão inválida!");
		}else if (valor instanceof String && tipo.equals(Double.class)) {
			ERRO("Conversão inválida!");
		}else if (valor instanceof Double && tipo.equals(Integer.class)) {
			return ((Double) valor).intValue();
		}else if(valor instanceof Integer && tipo.equals(Double.class)) {
			return ((Integer) valor).doubleValue();
		}
		
		return valor;
	}
	
	
	@Override
	public Object visitArr_def(LinguagemParser.Arr_defContext ctx) {
		return Integer.parseInt(ctx.INT_LIT().getText());
	}
	

	@Override
	public Object visitLista_var(LinguagemParser.Lista_varContext ctx) {
		List<LinguagemParser.Var_defContext> var_defs = ctx.var_def();
		
		for (int i = 0; i<var_defs.size(); i++) {
			LinguagemParser.Var_defContext var_def = var_defs.get(i);
			
			
			String id = var_def.ID().getText();
			boolean csnt = var_def.CONST() != null;
			
			if (csnt) {
				CONSTANTES.put(id, csnt);
			}
			
			Object arr = ctx.arr_def(i);
			if (arr != null) {
				arr = visit(ctx.arr_def(i));
				
				ArrayList al = new ArrayList();
				if (var_def.op.getType() == LinguagemParser.INTEGER) {
					for (int j = 0; j<(Integer) arr; j++) {
						al.add(0);
					}
				} else if (var_def.op.getType() == LinguagemParser.FLOAT) {
					for (int j = 0; j<(Integer) arr; j++) {
						al.add(0.0);
					}
				} else if (var_def.op.getType() == LinguagemParser.STRING) {
					for (int j = 0; j<(Integer) arr; j++) {
						al.add("");
					}
				}
			
				VARIAVEIS.put(id, al);
			}
			
			if (TIPOS.containsKey(id)) {
				ERRO("Variável "+ id + " não pode ser redefinida!");
			}
			
			if (var_def.op.getType() == LinguagemParser.INTEGER)
				TIPOS.put(id, Integer.class);
			else if (var_def.op.getType() == LinguagemParser.FLOAT)
				TIPOS.put(id, Double.class);
			else if (var_def.op.getType() == LinguagemParser.STRING)
				TIPOS.put(id, String.class);
		}
		return null;
	}
	
	@Override
	public Object visitDefinicao(LinguagemParser.DefinicaoContext ctx) {
		String id = ctx.ID().getText();
		Object value = visit(ctx.expr());
		
		
		
		if (ctx.arr_def() != null) {
			Integer s = (Integer) visit(ctx.arr_def());
			if (TIPOS.containsKey(id)) {
				if (!(VARIAVEIS.get(id) instanceof ArrayList)) {
					ERRO("Variável "+ id + " não é array!");
				}
				value = validarTipo(value, TIPOS.get(id));
				((ArrayList) (VARIAVEIS.get(id))).set(s, value);
				
				return null;
			} else {
				ERRO("Variável "+ id + " não está definida!");
				return null;
			}
		}
		
		if (TIPOS.containsKey(id)) {
			if (CONSTANTES.containsKey(id)) {
				if (!VARIAVEIS.containsKey(id)) {
					value = validarTipo(value, TIPOS.get(id));
					VARIAVEIS.put(id, value);
				} else {
					ERRO("Constante "+ id + " não pode ser redeclarada!");
				}
			} else {
				value = validarTipo(value, TIPOS.get(id));
				VARIAVEIS.put(id, value);
			}
		} else {
			ERRO("Variável "+ id + " não está definida!");
			return null;
		}
		
		return value;
	}

	@Override
	public Object visitPrintln(LinguagemParser.PrintlnContext ctx) {
		Object value = visit(ctx.expr());
		System.out.println(value);
		
		return value;

	}

	@Override
	public Object visitIntFator(LinguagemParser.IntFatorContext ctx) {
		return Integer.valueOf(ctx.INT_LIT().getText());
	}
	
	@Override
	public Object visitFloatFator(LinguagemParser.FloatFatorContext ctx) {
		return Double.valueOf(ctx.FLOAT_LIT().getText());
	}
	
	@Override
	public Object visitStringFator(LinguagemParser.StringFatorContext ctx) {
		String lit = ctx.STRING_LIT().getText();
		
		return lit.substring(1, lit.length()-1);
	}

	@Override
	public Object visitIdFator(LinguagemParser.IdFatorContext ctx) {
		String id = ctx.ID().getText();
		if (VARIAVEIS.containsKey(id)) {
			if (ctx.arr_def() != null) {
				Integer s = (Integer) visit(ctx.arr_def());
				
				if (!(VARIAVEIS.get(id) instanceof ArrayList)) {
					ERRO("Variável "+ id + " não é array!");
				}
				
				return ((ArrayList) (VARIAVEIS.get(id))).get(s);
			} else {
				return VARIAVEIS.get(id);
			}
		} else
			ERRO("Variável: "+id+" não declarada!");
		
		
		return 0;
	}

	@Override
	public Object visitMultiplicaoExpr(LinguagemParser.MultiplicaoExprContext ctx) {
		Object left = visit(ctx.expr(0));
		Object right = visit(ctx.expr(1));

		if (testarNumero(left, right)) {
			if (ctx.op.getType() == LinguagemParser.MUL) {
				return (valorDouble(left) * valorDouble(right));
			} else {
				return (valorDouble(left) / valorDouble(right));
			}
		}
		
		ERRO("Erro aritmético: "+left.toString() + " & "+right.toString());
		
		return null;
	}

	@Override
	public Object visitSomaExpr(LinguagemParser.SomaExprContext ctx) {
		Object left = visit(ctx.expr(0));
		Object right = visit(ctx.expr(1));

		if (testarNumero(left, right)) {
			if (ctx.op.getType() == LinguagemParser.ADD) {
				return (valorDouble(left) + valorDouble(right));
			} else if (ctx.op.getType() == LinguagemParser.SUB) {
				return (valorDouble(left) - valorDouble(right));
			}
		} else if (left instanceof String) {
			if (ctx.op.getType() == LinguagemParser.ADD) {
				return left.toString() + right.toString();
			} else {
				ERRO("Erro de concatenação: "+left.toString() + " & "+right.toString());
				return null;
			}
		}
		
		ERRO("Erro aritmético: "+left.toString() + " & "+right.toString());
		return null;
	}

	@Override
	public Object visitRelacionalExpr(LinguagemParser.RelacionalExprContext ctx) {
		Object left = visit(ctx.expr(0));
		Object right = visit(ctx.expr(1));

		if (testarNumero(left, right)) {
			if (ctx.op.getType() == LinguagemParser.CLEQ)
				return valorDouble(left) <= valorDouble(right) ? 1 : 0;
			if (ctx.op.getType() == LinguagemParser.CGEQ)
				return valorDouble(left) >= valorDouble(right) ? 1 : 0;
			if (ctx.op.getType() == LinguagemParser.CLES)
				return valorDouble(left) < valorDouble(right) ? 1 : 0;
			if (ctx.op.getType() == LinguagemParser.CGRT)
				return valorDouble(left) > valorDouble(right) ? 1 : 0;
		}

		ERRO("Erro comparativo: "+left.toString() + " & "+right.toString());
		
		return 0;
	}

	@Override
	public Object visitIgualidadeExpr(LinguagemParser.IgualidadeExprContext ctx) {
		Object left = visit(ctx.expr(0));
		Object right = visit(ctx.expr(1));
		
		if (testarNumero(left, right)) {
			if (ctx.op.getType() == LinguagemParser.CEQL)
				return valorDouble(left) > valorDouble(right) ? 1 : 0;
			if (ctx.op.getType() == LinguagemParser.CNEQ)
				return valorDouble(left) > valorDouble(right) ? 1 : 0;
		} else if (left instanceof String && right instanceof String) {
			if (ctx.op.getType() == LinguagemParser.CEQL)
				return valorDouble(left) > valorDouble(right) ? 1 : 0;
			if (ctx.op.getType() == LinguagemParser.CNEQ)
				return valorDouble(left) > valorDouble(right) ? 1 : 0;
		}
		
		ERRO("Erro comparativo: "+left.toString() + " & "+right.toString());
		
		return 0;
	}

	@Override
	public Object visitPareFator(LinguagemParser.PareFatorContext ctx) {
		Object i = visit(ctx.expr());

		return i;
	}

	@Override
	public Object visitIf_acao(LinguagemParser.If_acaoContext ctx) {
		List<LinguagemParser.CondicaoContext> condicoes = ctx.condicao();
		boolean testado = false;

		for (LinguagemParser.CondicaoContext condicao : condicoes) {
			Object e = this.visit(condicao.expr());
			
			if (valorBooleano(e)) {
				testado = true;
				this.visit(condicao.acao_bloco());
				break;
			}
		}

		if (!testado && ctx.acao_bloco() != null) {
			this.visit(ctx.acao_bloco());
		}

		return 0;
	}

	@Override
	public Object visitFor_acao(LinguagemParser.For_acaoContext ctx) {
		String id = ctx.ID().getText();
		Object value = visit(ctx.expr(0));
		VARIAVEIS.put(id, value);

		Object e = this.visit(ctx.expr(1));
		while (valorBooleano(e)) {
			this.visit(ctx.acao_bloco());
			this.visit(ctx.definicao());

			e = this.visit(ctx.expr(1));
		}

		return 0;
	}

	@Override
	public Object visitWhile_acao(LinguagemParser.While_acaoContext ctx) {
		Object e = this.visit(ctx.expr());
		while (valorBooleano(e)) {
			this.visit(ctx.acao_bloco());
			e = this.visit(ctx.expr());
		}

		return 0;
	}
}