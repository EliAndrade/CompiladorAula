import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends LinguagemBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitDefinicao(LinguagemParser.DefinicaoContext ctx) {
        String id = ctx.ID().getText();

        int value = visit(ctx.expr());

        memory.put(id, value);
        return value;

    }

    @Override
    public Integer visitPrintln(LinguagemParser.PrintlnContext ctx) {
        int value = visit(ctx.expr());
        System.out.println(value);
        return value;

    }

    
    
    
    
    @Override
    public Integer visitIntFator(LinguagemParser.IntFatorContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitIdFator(LinguagemParser.IdFatorContext ctx) {
        String id = ctx.ID().getText();

        System.out.println(id);
        if(memory.containsKey(id)) return memory.get(id);

        return 0;
    }

    @Override
    public Integer visitMultiplicaoExpr(LinguagemParser.MultiplicaoExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == LinguagemParser.MUL) return left * right;

        return left / right;
    }

    @Override
    public Integer visitSomaExpr(LinguagemParser.SomaExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));


        if(ctx.op.getType() == LinguagemParser.ADD) return left + right;

        return left - right;

    }
    
    @Override
    public Integer visitRelacionalExpr(LinguagemParser.RelacionalExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == LinguagemParser.CLEQ) return left >= right ? 1 : 0;
        if(ctx.op.getType() == LinguagemParser.CGEQ) return left <= right? 1 : 0;
        if(ctx.op.getType() == LinguagemParser.CLES) return left < right ? 1 : 0;
        if(ctx.op.getType() == LinguagemParser.CGRT) return left > right ? 1 : 0;

        return 0;
    }
    
    @Override
    public Integer visitIgualidadeExpr(LinguagemParser.IgualidadeExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == LinguagemParser.CEQL) return left >= right ? 1 : 0;
        if(ctx.op.getType() == LinguagemParser.CNEQ) return left <= right? 1 : 0;

        return 0;
    }
    
    @Override
    public Integer visitPareFator(LinguagemParser.PareFatorContext ctx) {
        int i = visit(ctx.expr());

        return i;
    }
    
    @Override
    public Integer visitIf_acao(LinguagemParser.If_acaoContext ctx) {
    	List<LinguagemParser.CondicaoContext> condicoes = ctx.condicao();
        boolean testado = false;

        for (LinguagemParser.CondicaoContext condicao : condicoes) {
            Integer e = this.visit(condicao.expr());
            if (e != null && e >= 1) {
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
}