// Generated from Linguagem.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMENTARIO=2, COMENTARIO_LINA=3, PRINTLN=4, IF=5, ELIF=6, ELSE=7, 
		ACHAVE=8, FCHAVE=9, PV=10, MUL=11, DIV=12, ADD=13, SUB=14, EQ=15, APARE=16, 
		FPARE=17, ID=18, INT=19, CNEQ=20, CEQL=21, CLEQ=22, CGEQ=23, CLES=24, 
		CGRT=25;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_acao = 2, RULE_definicao = 3, 
		RULE_if_acao = 4, RULE_acao_bloco = 5, RULE_condicao = 6, RULE_println = 7, 
		RULE_expr = 8, RULE_fator = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "acao", "definicao", "if_acao", "acao_bloco", "condicao", 
			"println", "expr", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'println'", "'if'", "'elif'", "'else'", "'{'", 
			"'}'", "';'", "'*'", "'/'", "'+'", "'-'", "'='", "'('", "')'", null, 
			null, "'!='", "'=='", "'<='", "'>='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "COMENTARIO_LINA", "PRINTLN", "IF", "ELIF", 
			"ELSE", "ACHAVE", "FCHAVE", "PV", "MUL", "DIV", "ADD", "SUB", "EQ", "APARE", 
			"FPARE", "ID", "INT", "CNEQ", "CEQL", "CLEQ", "CGEQ", "CLES", "CGRT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Linguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LinguagemParser.EOF, 0); }
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				acao();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << IF) | (1L << PV) | (1L << ID))) != 0) );
			setState(25);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<AcaoContext> acao() {
			return getRuleContexts(AcaoContext.class);
		}
		public AcaoContext acao(int i) {
			return getRuleContext(AcaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << IF) | (1L << PV) | (1L << ID))) != 0)) {
				{
				{
				setState(27);
				acao();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AcaoContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public If_acaoContext if_acao() {
			return getRuleContext(If_acaoContext.class,0);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public TerminalNode PV() { return getToken(LinguagemParser.PV, 0); }
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitAcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_acao);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				println();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				if_acao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				definicao();
				}
				break;
			case PV:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(PV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LinguagemParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(LinguagemParser.PV, 0); }
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDefinicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			match(EQ);
			setState(41);
			expr(0);
			setState(42);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_acaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguagemParser.IF, 0); }
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(LinguagemParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(LinguagemParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(LinguagemParser.ELSE, 0); }
		public Acao_blocoContext acao_bloco() {
			return getRuleContext(Acao_blocoContext.class,0);
		}
		public If_acaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_acao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIf_acao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_acaoContext if_acao() throws RecognitionException {
		If_acaoContext _localctx = new If_acaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_acao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IF);
			setState(45);
			condicao();
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(ELIF);
					setState(47);
					condicao();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(53);
				match(ELSE);
				setState(54);
				acao_bloco();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Acao_blocoContext extends ParserRuleContext {
		public TerminalNode ACHAVE() { return getToken(LinguagemParser.ACHAVE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FCHAVE() { return getToken(LinguagemParser.FCHAVE, 0); }
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public Acao_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao_bloco; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitAcao_bloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Acao_blocoContext acao_bloco() throws RecognitionException {
		Acao_blocoContext _localctx = new Acao_blocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_acao_bloco);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ACHAVE);
				setState(58);
				bloco();
				setState(59);
				match(FCHAVE);
				}
				break;
			case PRINTLN:
			case IF:
			case PV:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				acao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Acao_blocoContext acao_bloco() {
			return getRuleContext(Acao_blocoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			expr(0);
			setState(65);
			acao_bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(LinguagemParser.PRINTLN, 0); }
		public TerminalNode APARE() { return getToken(LinguagemParser.APARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LinguagemParser.FPARE, 0); }
		public TerminalNode PV() { return getToken(LinguagemParser.PV, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PRINTLN);
			setState(68);
			match(APARE);
			setState(69);
			expr(0);
			setState(70);
			match(FPARE);
			setState(71);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IgualidadeExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CEQL() { return getToken(LinguagemParser.CEQL, 0); }
		public TerminalNode CNEQ() { return getToken(LinguagemParser.CNEQ, 0); }
		public IgualidadeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIgualidadeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicaoExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LinguagemParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LinguagemParser.DIV, 0); }
		public MultiplicaoExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitMultiplicaoExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomaExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LinguagemParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LinguagemParser.SUB, 0); }
		public SomaExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitSomaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorExprContext extends ExprContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitFatorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelacionalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLEQ() { return getToken(LinguagemParser.CLEQ, 0); }
		public TerminalNode CGEQ() { return getToken(LinguagemParser.CGEQ, 0); }
		public TerminalNode CLES() { return getToken(LinguagemParser.CLES, 0); }
		public TerminalNode CGRT() { return getToken(LinguagemParser.CGRT, 0); }
		public RelacionalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitRelacionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FatorExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(74);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicaoExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(77);
						((MultiplicaoExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MultiplicaoExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SomaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(80);
						((SomaExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((SomaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new RelacionalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(83);
						((RelacionalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLEQ) | (1L << CGEQ) | (1L << CLES) | (1L << CGRT))) != 0)) ) {
							((RelacionalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new IgualidadeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(86);
						((IgualidadeExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==CNEQ || _la==CEQL) ) {
							((IgualidadeExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	 
		public FatorContext() { }
		public void copyFrom(FatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PareFatorContext extends FatorContext {
		public TerminalNode APARE() { return getToken(LinguagemParser.APARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LinguagemParser.FPARE, 0); }
		public PareFatorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitPareFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdFatorContext extends FatorContext {
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public IdFatorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIdFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntFatorContext extends FatorContext {
		public TerminalNode INT() { return getToken(LinguagemParser.INT, 0); }
		public IntFatorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIntFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fator);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APARE:
				_localctx = new PareFatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(APARE);
				setState(94);
				expr(0);
				setState(95);
				match(FPARE);
				}
				break;
			case INT:
				_localctx = new IntFatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(INT);
				}
				break;
			case ID:
				_localctx = new IdFatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3"+
		"\4\3\4\3\4\5\4(\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\63\n\6\f\6"+
		"\16\6\66\13\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13f\n\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\r\16\3\2\17"+
		"\20\3\2\30\33\3\2\26\27\2k\2\27\3\2\2\2\4 \3\2\2\2\6\'\3\2\2\2\b)\3\2"+
		"\2\2\n.\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20E\3\2\2\2\22K\3\2\2\2\24e\3\2"+
		"\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\37\5\6\4\2\36\35\3\2"+
		"\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#(\5\20\t"+
		"\2$(\5\n\6\2%(\5\b\5\2&(\7\f\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3"+
		"\2\2\2(\7\3\2\2\2)*\7\24\2\2*+\7\21\2\2+,\5\22\n\2,-\7\f\2\2-\t\3\2\2"+
		"\2./\7\7\2\2/\64\5\16\b\2\60\61\7\b\2\2\61\63\5\16\b\2\62\60\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\66\64\3\2\2\2\678"+
		"\7\t\2\28:\5\f\7\29\67\3\2\2\29:\3\2\2\2:\13\3\2\2\2;<\7\n\2\2<=\5\4\3"+
		"\2=>\7\13\2\2>A\3\2\2\2?A\5\6\4\2@;\3\2\2\2@?\3\2\2\2A\r\3\2\2\2BC\5\22"+
		"\n\2CD\5\f\7\2D\17\3\2\2\2EF\7\6\2\2FG\7\22\2\2GH\5\22\n\2HI\7\23\2\2"+
		"IJ\7\f\2\2J\21\3\2\2\2KL\b\n\1\2LM\5\24\13\2M\\\3\2\2\2NO\f\7\2\2OP\t"+
		"\2\2\2P[\5\22\n\bQR\f\6\2\2RS\t\3\2\2S[\5\22\n\7TU\f\5\2\2UV\t\4\2\2V"+
		"[\5\22\n\6WX\f\4\2\2XY\t\5\2\2Y[\5\22\n\5ZN\3\2\2\2ZQ\3\2\2\2ZT\3\2\2"+
		"\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\23\3\2\2\2^\\\3\2\2\2_`"+
		"\7\22\2\2`a\5\22\n\2ab\7\23\2\2bf\3\2\2\2cf\7\25\2\2df\7\24\2\2e_\3\2"+
		"\2\2ec\3\2\2\2ed\3\2\2\2f\25\3\2\2\2\13\31 \'\649@Z\\e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}