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
		WS=1, COMENTARIO=2, COMENTARIO_LINA=3, PRINTLN=4, FOR=5, WHILE=6, IF=7, 
		ELIF=8, ELSE=9, INTEGER=10, STRING=11, FLOAT=12, CONST=13, VIRGULA=14, 
		ACOLC=15, FCOLC=16, ACHAVE=17, FCHAVE=18, PV=19, MUL=20, DIV=21, ADD=22, 
		SUB=23, EQ=24, APARE=25, FPARE=26, ID=27, STRING_LIT=28, INT_LIT=29, FLOAT_LIT=30, 
		CNEQ=31, CEQL=32, CLEQ=33, CGEQ=34, CLES=35, CGRT=36;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_acao = 2, RULE_lista_var = 3, 
		RULE_definicao = 4, RULE_var_def = 5, RULE_arr_def = 6, RULE_if_acao = 7, 
		RULE_for_acao = 8, RULE_while_acao = 9, RULE_acao_bloco = 10, RULE_condicao = 11, 
		RULE_println = 12, RULE_expr = 13, RULE_fator = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "acao", "lista_var", "definicao", "var_def", "arr_def", 
			"if_acao", "for_acao", "while_acao", "acao_bloco", "condicao", "println", 
			"expr", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'println'", "'for'", "'while'", "'if'", "'elif'", 
			"'else'", "'int'", "'string'", "'float'", "'const'", "','", "'['", "']'", 
			"'{'", "'}'", "';'", "'*'", "'/'", "'+'", "'-'", "'='", "'('", "')'", 
			null, null, null, null, "'!='", "'=='", "'<='", "'>='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMENTARIO", "COMENTARIO_LINA", "PRINTLN", "FOR", "WHILE", 
			"IF", "ELIF", "ELSE", "INTEGER", "STRING", "FLOAT", "CONST", "VIRGULA", 
			"ACOLC", "FCOLC", "ACHAVE", "FCHAVE", "PV", "MUL", "DIV", "ADD", "SUB", 
			"EQ", "APARE", "FPARE", "ID", "STRING_LIT", "INT_LIT", "FLOAT_LIT", "CNEQ", 
			"CEQL", "CLEQ", "CGEQ", "CLES", "CGRT"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				acao();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << INTEGER) | (1L << STRING) | (1L << FLOAT) | (1L << CONST) | (1L << PV) | (1L << ID))) != 0) );
			setState(35);
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
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << INTEGER) | (1L << STRING) | (1L << FLOAT) | (1L << CONST) | (1L << PV) | (1L << ID))) != 0)) {
				{
				{
				setState(37);
				acao();
				}
				}
				setState(42);
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
		public For_acaoContext for_acao() {
			return getRuleContext(For_acaoContext.class,0);
		}
		public While_acaoContext while_acao() {
			return getRuleContext(While_acaoContext.class,0);
		}
		public Lista_varContext lista_var() {
			return getRuleContext(Lista_varContext.class,0);
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				println();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				if_acao();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				for_acao();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				while_acao();
				}
				break;
			case INTEGER:
			case STRING:
			case FLOAT:
			case CONST:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				lista_var();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				definicao();
				setState(49);
				match(PV);
				}
				break;
			case PV:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
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

	public static class Lista_varContext extends ParserRuleContext {
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public TerminalNode PV() { return getToken(LinguagemParser.PV, 0); }
		public List<Arr_defContext> arr_def() {
			return getRuleContexts(Arr_defContext.class);
		}
		public Arr_defContext arr_def(int i) {
			return getRuleContext(Arr_defContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(LinguagemParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LinguagemParser.VIRGULA, i);
		}
		public Lista_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitLista_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_varContext lista_var() throws RecognitionException {
		Lista_varContext _localctx = new Lista_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			var_def();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACOLC) {
				{
				setState(55);
				arr_def();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(58);
				match(VIRGULA);
				setState(59);
				var_def();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACOLC) {
					{
					setState(60);
					arr_def();
					}
				}

				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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

	public static class DefinicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LinguagemParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arr_defContext arr_def() {
			return getRuleContext(Arr_defContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_definicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACOLC) {
				{
				setState(71);
				arr_def();
				}
			}

			setState(74);
			match(EQ);
			setState(75);
			expr(0);
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

	public static class Var_defContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LinguagemParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(LinguagemParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(LinguagemParser.FLOAT, 0); }
		public TerminalNode CONST() { return getToken(LinguagemParser.CONST, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(77);
				match(CONST);
				}
			}

			setState(80);
			((Var_defContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
				((Var_defContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(81);
			match(ID);
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

	public static class Arr_defContext extends ParserRuleContext {
		public TerminalNode ACOLC() { return getToken(LinguagemParser.ACOLC, 0); }
		public TerminalNode INT_LIT() { return getToken(LinguagemParser.INT_LIT, 0); }
		public TerminalNode FCOLC() { return getToken(LinguagemParser.FCOLC, 0); }
		public Arr_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitArr_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_defContext arr_def() throws RecognitionException {
		Arr_defContext _localctx = new Arr_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arr_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ACOLC);
			setState(84);
			match(INT_LIT);
			setState(85);
			match(FCOLC);
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
		enterRule(_localctx, 14, RULE_if_acao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IF);
			setState(88);
			condicao();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					match(ELIF);
					setState(90);
					condicao();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(96);
				match(ELSE);
				setState(97);
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

	public static class For_acaoContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LinguagemParser.FOR, 0); }
		public TerminalNode APARE() { return getToken(LinguagemParser.APARE, 0); }
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LinguagemParser.EQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PV() { return getTokens(LinguagemParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(LinguagemParser.PV, i);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LinguagemParser.FPARE, 0); }
		public Acao_blocoContext acao_bloco() {
			return getRuleContext(Acao_blocoContext.class,0);
		}
		public For_acaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_acao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitFor_acao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_acaoContext for_acao() throws RecognitionException {
		For_acaoContext _localctx = new For_acaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_acao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(FOR);
			setState(101);
			match(APARE);
			setState(102);
			match(ID);
			setState(103);
			match(EQ);
			setState(104);
			expr(0);
			setState(105);
			match(PV);
			setState(106);
			expr(0);
			setState(107);
			match(PV);
			setState(108);
			definicao();
			setState(109);
			match(FPARE);
			setState(110);
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

	public static class While_acaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LinguagemParser.WHILE, 0); }
		public TerminalNode APARE() { return getToken(LinguagemParser.APARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LinguagemParser.FPARE, 0); }
		public Acao_blocoContext acao_bloco() {
			return getRuleContext(Acao_blocoContext.class,0);
		}
		public While_acaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_acao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitWhile_acao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_acaoContext while_acao() throws RecognitionException {
		While_acaoContext _localctx = new While_acaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_acao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WHILE);
			setState(113);
			match(APARE);
			setState(114);
			expr(0);
			setState(115);
			match(FPARE);
			setState(116);
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
		enterRule(_localctx, 20, RULE_acao_bloco);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ACHAVE);
				setState(119);
				bloco();
				setState(120);
				match(FCHAVE);
				}
				break;
			case PRINTLN:
			case FOR:
			case WHILE:
			case IF:
			case INTEGER:
			case STRING:
			case FLOAT:
			case CONST:
			case PV:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
		enterRule(_localctx, 22, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			expr(0);
			setState(126);
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
		enterRule(_localctx, 24, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(PRINTLN);
			setState(129);
			match(APARE);
			setState(130);
			expr(0);
			setState(131);
			match(FPARE);
			setState(132);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FatorExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(135);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicaoExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(138);
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
						setState(139);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SomaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
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
						setState(142);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new RelacionalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144);
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
						setState(145);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new IgualidadeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
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
						setState(148);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class StringFatorContext extends FatorContext {
		public TerminalNode STRING_LIT() { return getToken(LinguagemParser.STRING_LIT, 0); }
		public StringFatorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitStringFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdFatorContext extends FatorContext {
		public TerminalNode ID() { return getToken(LinguagemParser.ID, 0); }
		public Arr_defContext arr_def() {
			return getRuleContext(Arr_defContext.class,0);
		}
		public IdFatorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIdFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatFatorContext extends FatorContext {
		public TerminalNode FLOAT_LIT() { return getToken(LinguagemParser.FLOAT_LIT, 0); }
		public FloatFatorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitFloatFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntFatorContext extends FatorContext {
		public TerminalNode INT_LIT() { return getToken(LinguagemParser.INT_LIT, 0); }
		public IntFatorContext(FatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIntFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fator);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APARE:
				_localctx = new PareFatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(APARE);
				setState(155);
				expr(0);
				setState(156);
				match(FPARE);
				}
				break;
			case INT_LIT:
				_localctx = new IntFatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(INT_LIT);
				}
				break;
			case STRING_LIT:
				_localctx = new StringFatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(STRING_LIT);
				}
				break;
			case FLOAT_LIT:
				_localctx = new FloatFatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(FLOAT_LIT);
				}
				break;
			case ID:
				_localctx = new IdFatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(ID);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(162);
					arr_def();
					}
					break;
				}
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\2\3\2\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\67\n\4\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\5\5@\n\5\7\5B\n\5\f\5\16"+
		"\5E\13\5\3\5\3\5\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\7\5\7Q\n\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t\3\t\3\t\5\te"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f~\n\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0098\n\17\f\17\16\17\u009b\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\5\20\u00a8\n\20\3"+
		"\20\2\3\34\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\f\16\3\2"+
		"\26\27\3\2\30\31\3\2#&\3\2!\"\2\u00b3\2!\3\2\2\2\4*\3\2\2\2\6\66\3\2\2"+
		"\2\b8\3\2\2\2\nH\3\2\2\2\fP\3\2\2\2\16U\3\2\2\2\20Y\3\2\2\2\22f\3\2\2"+
		"\2\24r\3\2\2\2\26}\3\2\2\2\30\177\3\2\2\2\32\u0082\3\2\2\2\34\u0088\3"+
		"\2\2\2\36\u00a7\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3"+
		"\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\')\5\6\4\2(\'\3\2\2\2),\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2-\67\5\32\16\2.\67\5\20\t\2/"+
		"\67\5\22\n\2\60\67\5\24\13\2\61\67\5\b\5\2\62\63\5\n\6\2\63\64\7\25\2"+
		"\2\64\67\3\2\2\2\65\67\7\25\2\2\66-\3\2\2\2\66.\3\2\2\2\66/\3\2\2\2\66"+
		"\60\3\2\2\2\66\61\3\2\2\2\66\62\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\28:\5"+
		"\f\7\29;\5\16\b\2:9\3\2\2\2:;\3\2\2\2;C\3\2\2\2<=\7\20\2\2=?\5\f\7\2>"+
		"@\5\16\b\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2A<\3\2\2\2BE\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\25\2\2G\t\3\2\2\2HJ\7\35\2\2IK\5\16"+
		"\b\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\32\2\2MN\5\34\17\2N\13\3\2\2\2"+
		"OQ\7\17\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\t\2\2\2ST\7\35\2\2T\r\3\2"+
		"\2\2UV\7\21\2\2VW\7\37\2\2WX\7\22\2\2X\17\3\2\2\2YZ\7\t\2\2Z_\5\30\r\2"+
		"[\\\7\n\2\2\\^\5\30\r\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3\2"+
		"\2\2a_\3\2\2\2bc\7\13\2\2ce\5\26\f\2db\3\2\2\2de\3\2\2\2e\21\3\2\2\2f"+
		"g\7\7\2\2gh\7\33\2\2hi\7\35\2\2ij\7\32\2\2jk\5\34\17\2kl\7\25\2\2lm\5"+
		"\34\17\2mn\7\25\2\2no\5\n\6\2op\7\34\2\2pq\5\26\f\2q\23\3\2\2\2rs\7\b"+
		"\2\2st\7\33\2\2tu\5\34\17\2uv\7\34\2\2vw\5\26\f\2w\25\3\2\2\2xy\7\23\2"+
		"\2yz\5\4\3\2z{\7\24\2\2{~\3\2\2\2|~\5\6\4\2}x\3\2\2\2}|\3\2\2\2~\27\3"+
		"\2\2\2\177\u0080\5\34\17\2\u0080\u0081\5\26\f\2\u0081\31\3\2\2\2\u0082"+
		"\u0083\7\6\2\2\u0083\u0084\7\33\2\2\u0084\u0085\5\34\17\2\u0085\u0086"+
		"\7\34\2\2\u0086\u0087\7\25\2\2\u0087\33\3\2\2\2\u0088\u0089\b\17\1\2\u0089"+
		"\u008a\5\36\20\2\u008a\u0099\3\2\2\2\u008b\u008c\f\7\2\2\u008c\u008d\t"+
		"\3\2\2\u008d\u0098\5\34\17\b\u008e\u008f\f\6\2\2\u008f\u0090\t\4\2\2\u0090"+
		"\u0098\5\34\17\7\u0091\u0092\f\5\2\2\u0092\u0093\t\5\2\2\u0093\u0098\5"+
		"\34\17\6\u0094\u0095\f\4\2\2\u0095\u0096\t\6\2\2\u0096\u0098\5\34\17\5"+
		"\u0097\u008b\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\35\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\33\2\2\u009d\u009e\5\34"+
		"\17\2\u009e\u009f\7\34\2\2\u009f\u00a8\3\2\2\2\u00a0\u00a8\7\37\2\2\u00a1"+
		"\u00a8\7\36\2\2\u00a2\u00a8\7 \2\2\u00a3\u00a5\7\35\2\2\u00a4\u00a6\5"+
		"\16\b\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u009c\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2"+
		"\2\2\u00a7\u00a3\3\2\2\2\u00a8\37\3\2\2\2\21#*\66:?CJP_d}\u0097\u0099"+
		"\u00a5\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}