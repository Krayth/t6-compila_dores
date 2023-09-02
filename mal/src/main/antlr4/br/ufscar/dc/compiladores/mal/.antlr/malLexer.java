// Generated from c:\Users\fehie\OneDrive\�rea de Trabalho\Faculdade\Compiladores\t3\t4-compila-dores\t6-compila_dores\mal\src\main\antlr4\br\u005Cufscar\dc\compiladores\mal\mal.g4 by ANTLR 4.9.2

  import br.ufscar.dc.compiladores.mal.File;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class malLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		Comentario=39, WhiteSpace=40, NUM=41, NOME=42, ErroComentarioCodigo=43, 
		ErroAddComentario=44, ANY=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "Comentario", "WhiteSpace", 
			"NUM", "NOME", "ErroComentarioCodigo", "ErroAddComentario", "ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'TV'", "'Filme'", "'OVA'", "'Especial'", "'Acao'", "'Aventura'", 
			"'Drama'", "'Comedia'", "'Terror'", "'Fantasia'", "'Scifi'", "'Romance'", 
			"'Misterio'", "'SliceOfLife'", "'Sobrenatural'", "'Suspense'", "'Musical'", 
			"'Esporte'", "'Shounen'", "'Seinen'", "'Shoujo'", "'R18'", "'Completo'", 
			"'Assistindo'", "'Abandonado'", "'inicio'", "'Nome'", "'Tipo'", "'Genero'", 
			"'Quantidade_Eps'", "'Publico_Alvo'", "'fim'", "'comeco_avaliacao'", 
			"'Nota'", "'Status'", "'fim_avaliacao'", "'}'", null, null, null, null, 
			"'['", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Comentario", "WhiteSpace", "NUM", "NOME", "ErroComentarioCodigo", 
			"ErroAddComentario", "ANY"
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


	public malLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mal.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 38:
			Comentario_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			ErroComentarioCodigo_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			ErroAddComentario_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			ANY_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Comentario_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}
	private void ErroComentarioCodigo_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 File.AddString("                    <div id=\"erros\">" + 
			                    "Comentario nao fechado.</div>\n");
			    File.gravaArquivo(); 
			break;
		}
	}
	private void ErroAddComentario_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 File.AddString("                    <div id=\"erros\">" + 
			                    "Comentario nao fechado.</div>\n");
			    File.gravaArquivo(); 
			break;
		}
	}
	private void ANY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 File.AddString("                    <div id=\"erros\">" + 
			                    "Símbolo não identificado</div>\n");
			    File.gravaArquivo(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01af\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\7(\u018b\n(\f(\16(\u018e"+
		"\13(\3(\5(\u0191\n(\3(\3(\3(\3)\3)\3)\3*\6*\u019a\n*\r*\16*\u019b\3+\5"+
		"+\u019f\n+\3+\7+\u01a2\n+\f+\16+\u01a5\13+\3,\3,\3,\3-\3-\3-\3.\3.\3."+
		"\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\7\6\2\17\17]]__pp\5\2\13\f"+
		"\17\17\"\"\3\2\62;\4\2\62;C\\\7\2\"\"//\62;C\\c|\2\u01b2\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7b\3\2\2\2\th\3\2\2"+
		"\2\13l\3\2\2\2\ru\3\2\2\2\17z\3\2\2\2\21\u0083\3\2\2\2\23\u0089\3\2\2"+
		"\2\25\u0091\3\2\2\2\27\u0098\3\2\2\2\31\u00a1\3\2\2\2\33\u00a7\3\2\2\2"+
		"\35\u00af\3\2\2\2\37\u00b8\3\2\2\2!\u00c4\3\2\2\2#\u00d1\3\2\2\2%\u00da"+
		"\3\2\2\2\'\u00e2\3\2\2\2)\u00ea\3\2\2\2+\u00f2\3\2\2\2-\u00f9\3\2\2\2"+
		"/\u0100\3\2\2\2\61\u0104\3\2\2\2\63\u010d\3\2\2\2\65\u0118\3\2\2\2\67"+
		"\u0123\3\2\2\29\u012a\3\2\2\2;\u012f\3\2\2\2=\u0134\3\2\2\2?\u013b\3\2"+
		"\2\2A\u014a\3\2\2\2C\u0157\3\2\2\2E\u015b\3\2\2\2G\u016c\3\2\2\2I\u0171"+
		"\3\2\2\2K\u0178\3\2\2\2M\u0186\3\2\2\2O\u0188\3\2\2\2Q\u0195\3\2\2\2S"+
		"\u0199\3\2\2\2U\u019e\3\2\2\2W\u01a6\3\2\2\2Y\u01a9\3\2\2\2[\u01ac\3\2"+
		"\2\2]^\7<\2\2^\4\3\2\2\2_`\7V\2\2`a\7X\2\2a\6\3\2\2\2bc\7H\2\2cd\7k\2"+
		"\2de\7n\2\2ef\7o\2\2fg\7g\2\2g\b\3\2\2\2hi\7Q\2\2ij\7X\2\2jk\7C\2\2k\n"+
		"\3\2\2\2lm\7G\2\2mn\7u\2\2no\7r\2\2op\7g\2\2pq\7e\2\2qr\7k\2\2rs\7c\2"+
		"\2st\7n\2\2t\f\3\2\2\2uv\7C\2\2vw\7e\2\2wx\7c\2\2xy\7q\2\2y\16\3\2\2\2"+
		"z{\7C\2\2{|\7x\2\2|}\7g\2\2}~\7p\2\2~\177\7v\2\2\177\u0080\7w\2\2\u0080"+
		"\u0081\7t\2\2\u0081\u0082\7c\2\2\u0082\20\3\2\2\2\u0083\u0084\7F\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7c\2\2\u0086\u0087\7o\2\2\u0087\u0088\7c\2\2"+
		"\u0088\22\3\2\2\2\u0089\u008a\7E\2\2\u008a\u008b\7q\2\2\u008b\u008c\7"+
		"o\2\2\u008c\u008d\7g\2\2\u008d\u008e\7f\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7c\2\2\u0090\24\3\2\2\2\u0091\u0092\7V\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7t\2\2\u0094\u0095\7t\2\2\u0095\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097"+
		"\26\3\2\2\2\u0098\u0099\7H\2\2\u0099\u009a\7c\2\2\u009a\u009b\7p\2\2\u009b"+
		"\u009c\7v\2\2\u009c\u009d\7c\2\2\u009d\u009e\7u\2\2\u009e\u009f\7k\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a3\7"+
		"e\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7k\2\2\u00a6\32"+
		"\3\2\2\2\u00a7\u00a8\7T\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7o\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\34\3\2\2\2\u00af\u00b0\7O\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7"+
		"u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\7U\2\2\u00b9\u00ba"+
		"\7n\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7Q\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7N\2\2\u00c0\u00c1\7k\2\2"+
		"\u00c1\u00c2\7h\2\2\u00c2\u00c3\7g\2\2\u00c3 \3\2\2\2\u00c4\u00c5\7U\2"+
		"\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		"\u00cd\7w\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2"+
		"\u00d0\"\3\2\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7u"+
		"\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8"+
		"\7u\2\2\u00d8\u00d9\7g\2\2\u00d9$\3\2\2\2\u00da\u00db\7O\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7e\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7G\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7t\2\2"+
		"\u00e7\u00e8\7v\2\2\u00e8\u00e9\7g\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7U\2"+
		"\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1*\3\2\2\2\u00f2\u00f3"+
		"\7U\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7p\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7U\2\2\u00fa"+
		"\u00fb\7j\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7l\2\2"+
		"\u00fe\u00ff\7q\2\2\u00ff.\3\2\2\2\u0100\u0101\7T\2\2\u0101\u0102\7\63"+
		"\2\2\u0102\u0103\7:\2\2\u0103\60\3\2\2\2\u0104\u0105\7E\2\2\u0105\u0106"+
		"\7q\2\2\u0106\u0107\7o\2\2\u0107\u0108\7r\2\2\u0108\u0109\7n\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u010b\7v\2\2\u010b\u010c\7q\2\2\u010c\62\3\2\2\2\u010d"+
		"\u010e\7C\2\2\u010e\u010f\7u\2\2\u010f\u0110\7u\2\2\u0110\u0111\7k\2\2"+
		"\u0111\u0112\7u\2\2\u0112\u0113\7v\2\2\u0113\u0114\7k\2\2\u0114\u0115"+
		"\7p\2\2\u0115\u0116\7f\2\2\u0116\u0117\7q\2\2\u0117\64\3\2\2\2\u0118\u0119"+
		"\7C\2\2\u0119\u011a\7d\2\2\u011a\u011b\7c\2\2\u011b\u011c\7p\2\2\u011c"+
		"\u011d\7f\2\2\u011d\u011e\7q\2\2\u011e\u011f\7p\2\2\u011f\u0120\7c\2\2"+
		"\u0120\u0121\7f\2\2\u0121\u0122\7q\2\2\u0122\66\3\2\2\2\u0123\u0124\7"+
		"k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7k\2\2\u0126\u0127\7e\2\2\u0127\u0128"+
		"\7k\2\2\u0128\u0129\7q\2\2\u01298\3\2\2\2\u012a\u012b\7P\2\2\u012b\u012c"+
		"\7q\2\2\u012c\u012d\7o\2\2\u012d\u012e\7g\2\2\u012e:\3\2\2\2\u012f\u0130"+
		"\7V\2\2\u0130\u0131\7k\2\2\u0131\u0132\7r\2\2\u0132\u0133\7q\2\2\u0133"+
		"<\3\2\2\2\u0134\u0135\7I\2\2\u0135\u0136\7g\2\2\u0136\u0137\7p\2\2\u0137"+
		"\u0138\7g\2\2\u0138\u0139\7t\2\2\u0139\u013a\7q\2\2\u013a>\3\2\2\2\u013b"+
		"\u013c\7S\2\2\u013c\u013d\7w\2\2\u013d\u013e\7c\2\2\u013e\u013f\7p\2\2"+
		"\u013f\u0140\7v\2\2\u0140\u0141\7k\2\2\u0141\u0142\7f\2\2\u0142\u0143"+
		"\7c\2\2\u0143\u0144\7f\2\2\u0144\u0145\7g\2\2\u0145\u0146\7a\2\2\u0146"+
		"\u0147\7G\2\2\u0147\u0148\7r\2\2\u0148\u0149\7u\2\2\u0149@\3\2\2\2\u014a"+
		"\u014b\7R\2\2\u014b\u014c\7w\2\2\u014c\u014d\7d\2\2\u014d\u014e\7n\2\2"+
		"\u014e\u014f\7k\2\2\u014f\u0150\7e\2\2\u0150\u0151\7q\2\2\u0151\u0152"+
		"\7a\2\2\u0152\u0153\7C\2\2\u0153\u0154\7n\2\2\u0154\u0155\7x\2\2\u0155"+
		"\u0156\7q\2\2\u0156B\3\2\2\2\u0157\u0158\7h\2\2\u0158\u0159\7k\2\2\u0159"+
		"\u015a\7o\2\2\u015aD\3\2\2\2\u015b\u015c\7e\2\2\u015c\u015d\7q\2\2\u015d"+
		"\u015e\7o\2\2\u015e\u015f\7g\2\2\u015f\u0160\7e\2\2\u0160\u0161\7q\2\2"+
		"\u0161\u0162\7a\2\2\u0162\u0163\7c\2\2\u0163\u0164\7x\2\2\u0164\u0165"+
		"\7c\2\2\u0165\u0166\7n\2\2\u0166\u0167\7k\2\2\u0167\u0168\7c\2\2\u0168"+
		"\u0169\7e\2\2\u0169\u016a\7c\2\2\u016a\u016b\7q\2\2\u016bF\3\2\2\2\u016c"+
		"\u016d\7P\2\2\u016d\u016e\7q\2\2\u016e\u016f\7v\2\2\u016f\u0170\7c\2\2"+
		"\u0170H\3\2\2\2\u0171\u0172\7U\2\2\u0172\u0173\7v\2\2\u0173\u0174\7c\2"+
		"\2\u0174\u0175\7v\2\2\u0175\u0176\7w\2\2\u0176\u0177\7u\2\2\u0177J\3\2"+
		"\2\2\u0178\u0179\7h\2\2\u0179\u017a\7k\2\2\u017a\u017b\7o\2\2\u017b\u017c"+
		"\7a\2\2\u017c\u017d\7c\2\2\u017d\u017e\7x\2\2\u017e\u017f\7c\2\2\u017f"+
		"\u0180\7n\2\2\u0180\u0181\7k\2\2\u0181\u0182\7c\2\2\u0182\u0183\7e\2\2"+
		"\u0183\u0184\7c\2\2\u0184\u0185\7q\2\2\u0185L\3\2\2\2\u0186\u0187\7\177"+
		"\2\2\u0187N\3\2\2\2\u0188\u018c\7]\2\2\u0189\u018b\n\2\2\2\u018a\u0189"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\7\17\2\2\u0190\u018f\3"+
		"\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7_\2\2\u0193"+
		"\u0194\b(\2\2\u0194P\3\2\2\2\u0195\u0196\t\3\2\2\u0196\u0197\b)\3\2\u0197"+
		"R\3\2\2\2\u0198\u019a\t\4\2\2\u0199\u0198\3\2\2\2\u019a\u019b\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019cT\3\2\2\2\u019d\u019f\t"+
		"\5\2\2\u019e\u019d\3\2\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\t\6\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4V\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7]\2\2\u01a7\u01a8"+
		"\b,\4\2\u01a8X\3\2\2\2\u01a9\u01aa\7}\2\2\u01aa\u01ab\b-\5\2\u01abZ\3"+
		"\2\2\2\u01ac\u01ad\13\2\2\2\u01ad\u01ae\b.\6\2\u01ae\\\3\2\2\2\t\2\u018c"+
		"\u0190\u019b\u019e\u01a1\u01a3\7\3(\2\3)\3\3,\4\3-\5\3.\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}