// Generated from Linguagem.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMENTARIO=2, COMENTARIO_LINA=3, PRINTLN=4, IF=5, ELIF=6, ELSE=7, 
		ACHAVE=8, FCHAVE=9, PV=10, MUL=11, DIV=12, ADD=13, SUB=14, EQ=15, APARE=16, 
		FPARE=17, ID=18, INT=19, CNEQ=20, CEQL=21, CLEQ=22, CGEQ=23, CLES=24, 
		CGRT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMENTARIO", "COMENTARIO_LINA", "PRINTLN", "IF", "ELIF", "ELSE", 
			"ACHAVE", "FCHAVE", "PV", "MUL", "DIV", "ADD", "SUB", "EQ", "APARE", 
			"FPARE", "ID", "INT", "CNEQ", "CEQL", "CLEQ", "CGEQ", "CLES", "CGRT"
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


	public LinguagemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Linguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\6\2\67\n\2\r\2\16\28\3\2\3\2\3\3\3\3\3\3\3\3\7\3A"+
		"\n\3\f\3\16\3D\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23\u0080\n"+
		"\23\r\23\16\23\u0081\3\24\6\24\u0085\n\24\r\24\16\24\u0086\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"B\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\4\2C\\c|\3\2\62;\2\u009c\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\3\66\3\2\2\2\5<\3\2\2\2\7J\3\2\2\2\tU\3\2\2\2\13]\3\2\2\2\r`"+
		"\3\2\2\2\17e\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31"+
		"r\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%\177"+
		"\3\2\2\2\'\u0084\3\2\2\2)\u0088\3\2\2\2+\u008b\3\2\2\2-\u008e\3\2\2\2"+
		"/\u0091\3\2\2\2\61\u0094\3\2\2\2\63\u0096\3\2\2\2\65\67\t\2\2\2\66\65"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\2\2\2;\4\3\2"+
		"\2\2<=\7\61\2\2=>\7,\2\2>B\3\2\2\2?A\13\2\2\2@?\3\2\2\2AD\3\2\2\2BC\3"+
		"\2\2\2B@\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7,\2\2FG\7\61\2\2GH\3\2\2\2HI\b"+
		"\3\2\2I\6\3\2\2\2JK\7\61\2\2KL\7\61\2\2LP\3\2\2\2MO\n\3\2\2NM\3\2\2\2"+
		"OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\b\4\2\2T\b\3\2\2"+
		"\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z[\7n\2\2[\\\7p\2\2\\\n"+
		"\3\2\2\2]^\7k\2\2^_\7h\2\2_\f\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7k\2\2cd\7h"+
		"\2\2d\16\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\20\3\2\2\2jk\7}"+
		"\2\2k\22\3\2\2\2lm\7\177\2\2m\24\3\2\2\2no\7=\2\2o\26\3\2\2\2pq\7,\2\2"+
		"q\30\3\2\2\2rs\7\61\2\2s\32\3\2\2\2tu\7-\2\2u\34\3\2\2\2vw\7/\2\2w\36"+
		"\3\2\2\2xy\7?\2\2y \3\2\2\2z{\7*\2\2{\"\3\2\2\2|}\7+\2\2}$\3\2\2\2~\u0080"+
		"\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082&\3\2\2\2\u0083\u0085\t\5\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087(\3\2\2\2"+
		"\u0088\u0089\7#\2\2\u0089\u008a\7?\2\2\u008a*\3\2\2\2\u008b\u008c\7?\2"+
		"\2\u008c\u008d\7?\2\2\u008d,\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7"+
		"?\2\2\u0090.\3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093\7?\2\2\u0093\60\3"+
		"\2\2\2\u0094\u0095\7>\2\2\u0095\62\3\2\2\2\u0096\u0097\7@\2\2\u0097\64"+
		"\3\2\2\2\b\28BP\u0081\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}