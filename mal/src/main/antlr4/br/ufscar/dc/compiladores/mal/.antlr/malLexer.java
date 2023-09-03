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
		T__38=39, T__39=40, Comentario=41, WhiteSpace=42, NUM=43, NOME=44, ErroComentarioCodigo=45, 
		ErroAddComentario=46, ANY=47;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "Comentario", 
			"WhiteSpace", "NUM", "NOME", "ErroComentarioCodigo", "ErroAddComentario", 
			"ANY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'TV'", "'Filme'", "'OVA'", "'Especial'", "'Acao'", "'Aventura'", 
			"'Drama'", "'Comedia'", "'Terror'", "'Fantasia'", "'Scifi'", "'Romance'", 
			"'Misterio'", "'SliceOfLife'", "'Sobrenatural'", "'Suspense'", "'Musical'", 
			"'Esporte'", "'Shounen'", "'Seinen'", "'Shoujo'", "'R18'", "'inicio'", 
			"'Nome'", "'Tipo'", "'Genero'", "'Quantidade_Eps'", "'Publico_Alvo'", 
			"'fim'", "'comeco_avaliacao'", "'Nota'", "'Status'", "'fim_avaliacao'", 
			"'Completo'", "'Assistindo'", "'Abandonado'", "'\n'", "'\r'", "'}'", 
			null, null, null, null, "'['", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "Comentario", "WhiteSpace", "NUM", "NOME", 
			"ErroComentarioCodigo", "ErroAddComentario", "ANY"
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
		case 40:
			Comentario_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			WhiteSpace_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			ErroComentarioCodigo_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			ErroAddComentario_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
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
			                    "Comentario de Código não Fechado.</div>\n");
			    File.gravaArquivo(); 
			break;
		}
	}
	private void ErroAddComentario_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 File.AddString("                    <div id=\"erros\">" + 
			                    "Comentario de Avaliação não Fechado.</div>\n");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\7*\u0193\n*\f*\16*\u0196\13*\3*\5*\u0199\n*\3*\3*\3*\3+\3"+
		"+\3+\3,\6,\u01a2\n,\r,\16,\u01a3\3-\5-\u01a7\n-\3-\7-\u01aa\n-\f-\16-"+
		"\u01ad\13-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61\3\2\7\6\2\f\f\17\17]]__\5\2\13\f\17\17\"\"\3"+
		"\2\62;\4\2\62;C\\\7\2\"\"//\62;C\\c|\2\u01ba\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7f\3\2\2"+
		"\2\tl\3\2\2\2\13p\3\2\2\2\ry\3\2\2\2\17~\3\2\2\2\21\u0087\3\2\2\2\23\u008d"+
		"\3\2\2\2\25\u0095\3\2\2\2\27\u009c\3\2\2\2\31\u00a5\3\2\2\2\33\u00ab\3"+
		"\2\2\2\35\u00b3\3\2\2\2\37\u00bc\3\2\2\2!\u00c8\3\2\2\2#\u00d5\3\2\2\2"+
		"%\u00de\3\2\2\2\'\u00e6\3\2\2\2)\u00ee\3\2\2\2+\u00f6\3\2\2\2-\u00fd\3"+
		"\2\2\2/\u0104\3\2\2\2\61\u0108\3\2\2\2\63\u010f\3\2\2\2\65\u0114\3\2\2"+
		"\2\67\u0119\3\2\2\29\u0120\3\2\2\2;\u012f\3\2\2\2=\u013c\3\2\2\2?\u0140"+
		"\3\2\2\2A\u0151\3\2\2\2C\u0156\3\2\2\2E\u015d\3\2\2\2G\u016b\3\2\2\2I"+
		"\u0174\3\2\2\2K\u017f\3\2\2\2M\u018a\3\2\2\2O\u018c\3\2\2\2Q\u018e\3\2"+
		"\2\2S\u0190\3\2\2\2U\u019d\3\2\2\2W\u01a1\3\2\2\2Y\u01a6\3\2\2\2[\u01ae"+
		"\3\2\2\2]\u01b1\3\2\2\2_\u01b4\3\2\2\2ab\7<\2\2b\4\3\2\2\2cd\7V\2\2de"+
		"\7X\2\2e\6\3\2\2\2fg\7H\2\2gh\7k\2\2hi\7n\2\2ij\7o\2\2jk\7g\2\2k\b\3\2"+
		"\2\2lm\7Q\2\2mn\7X\2\2no\7C\2\2o\n\3\2\2\2pq\7G\2\2qr\7u\2\2rs\7r\2\2"+
		"st\7g\2\2tu\7e\2\2uv\7k\2\2vw\7c\2\2wx\7n\2\2x\f\3\2\2\2yz\7C\2\2z{\7"+
		"e\2\2{|\7c\2\2|}\7q\2\2}\16\3\2\2\2~\177\7C\2\2\177\u0080\7x\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\u0084\7w\2\2"+
		"\u0084\u0085\7t\2\2\u0085\u0086\7c\2\2\u0086\20\3\2\2\2\u0087\u0088\7"+
		"F\2\2\u0088\u0089\7t\2\2\u0089\u008a\7c\2\2\u008a\u008b\7o\2\2\u008b\u008c"+
		"\7c\2\2\u008c\22\3\2\2\2\u008d\u008e\7E\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7o\2\2\u0090\u0091\7g\2\2\u0091\u0092\7f\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7c\2\2\u0094\24\3\2\2\2\u0095\u0096\7V\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7t\2\2\u0098\u0099\7t\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2"+
		"\u009b\26\3\2\2\2\u009c\u009d\7H\2\2\u009d\u009e\7c\2\2\u009e\u009f\7"+
		"p\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3"+
		"\7k\2\2\u00a3\u00a4\7c\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7U\2\2\u00a6\u00a7"+
		"\7e\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7o\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\34\3\2\2\2\u00b3\u00b4\7O\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7"+
		"u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00bb\7q\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7U\2\2\u00bd\u00be"+
		"\7n\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7Q\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7N\2\2\u00c4\u00c5\7k\2\2"+
		"\u00c5\u00c6\7h\2\2\u00c6\u00c7\7g\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7U\2"+
		"\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2"+
		"\u00d4\"\3\2\2\2\u00d5\u00d6\7U\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7u"+
		"\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc\u00dd\7g\2\2\u00dd$\3\2\2\2\u00de\u00df\7O\2\2\u00df\u00e0"+
		"\7w\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7e\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7G\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7t\2\2"+
		"\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed(\3\2\2\2\u00ee\u00ef\7U\2"+
		"\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3"+
		"\7p\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7p\2\2\u00f5*\3\2\2\2\u00f6\u00f7"+
		"\7U\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc,\3\2\2\2\u00fd\u00fe\7U\2\2\u00fe"+
		"\u00ff\7j\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7w\2\2\u0101\u0102\7l\2\2"+
		"\u0102\u0103\7q\2\2\u0103.\3\2\2\2\u0104\u0105\7T\2\2\u0105\u0106\7\63"+
		"\2\2\u0106\u0107\7:\2\2\u0107\60\3\2\2\2\u0108\u0109\7k\2\2\u0109\u010a"+
		"\7p\2\2\u010a\u010b\7k\2\2\u010b\u010c\7e\2\2\u010c\u010d\7k\2\2\u010d"+
		"\u010e\7q\2\2\u010e\62\3\2\2\2\u010f\u0110\7P\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7o\2\2\u0112\u0113\7g\2\2\u0113\64\3\2\2\2\u0114\u0115\7V\2\2\u0115"+
		"\u0116\7k\2\2\u0116\u0117\7r\2\2\u0117\u0118\7q\2\2\u0118\66\3\2\2\2\u0119"+
		"\u011a\7I\2\2\u011a\u011b\7g\2\2\u011b\u011c\7p\2\2\u011c\u011d\7g\2\2"+
		"\u011d\u011e\7t\2\2\u011e\u011f\7q\2\2\u011f8\3\2\2\2\u0120\u0121\7S\2"+
		"\2\u0121\u0122\7w\2\2\u0122\u0123\7c\2\2\u0123\u0124\7p\2\2\u0124\u0125"+
		"\7v\2\2\u0125\u0126\7k\2\2\u0126\u0127\7f\2\2\u0127\u0128\7c\2\2\u0128"+
		"\u0129\7f\2\2\u0129\u012a\7g\2\2\u012a\u012b\7a\2\2\u012b\u012c\7G\2\2"+
		"\u012c\u012d\7r\2\2\u012d\u012e\7u\2\2\u012e:\3\2\2\2\u012f\u0130\7R\2"+
		"\2\u0130\u0131\7w\2\2\u0131\u0132\7d\2\2\u0132\u0133\7n\2\2\u0133\u0134"+
		"\7k\2\2\u0134\u0135\7e\2\2\u0135\u0136\7q\2\2\u0136\u0137\7a\2\2\u0137"+
		"\u0138\7C\2\2\u0138\u0139\7n\2\2\u0139\u013a\7x\2\2\u013a\u013b\7q\2\2"+
		"\u013b<\3\2\2\2\u013c\u013d\7h\2\2\u013d\u013e\7k\2\2\u013e\u013f\7o\2"+
		"\2\u013f>\3\2\2\2\u0140\u0141\7e\2\2\u0141\u0142\7q\2\2\u0142\u0143\7"+
		"o\2\2\u0143\u0144\7g\2\2\u0144\u0145\7e\2\2\u0145\u0146\7q\2\2\u0146\u0147"+
		"\7a\2\2\u0147\u0148\7c\2\2\u0148\u0149\7x\2\2\u0149\u014a\7c\2\2\u014a"+
		"\u014b\7n\2\2\u014b\u014c\7k\2\2\u014c\u014d\7c\2\2\u014d\u014e\7e\2\2"+
		"\u014e\u014f\7c\2\2\u014f\u0150\7q\2\2\u0150@\3\2\2\2\u0151\u0152\7P\2"+
		"\2\u0152\u0153\7q\2\2\u0153\u0154\7v\2\2\u0154\u0155\7c\2\2\u0155B\3\2"+
		"\2\2\u0156\u0157\7U\2\2\u0157\u0158\7v\2\2\u0158\u0159\7c\2\2\u0159\u015a"+
		"\7v\2\2\u015a\u015b\7w\2\2\u015b\u015c\7u\2\2\u015cD\3\2\2\2\u015d\u015e"+
		"\7h\2\2\u015e\u015f\7k\2\2\u015f\u0160\7o\2\2\u0160\u0161\7a\2\2\u0161"+
		"\u0162\7c\2\2\u0162\u0163\7x\2\2\u0163\u0164\7c\2\2\u0164\u0165\7n\2\2"+
		"\u0165\u0166\7k\2\2\u0166\u0167\7c\2\2\u0167\u0168\7e\2\2\u0168\u0169"+
		"\7c\2\2\u0169\u016a\7q\2\2\u016aF\3\2\2\2\u016b\u016c\7E\2\2\u016c\u016d"+
		"\7q\2\2\u016d\u016e\7o\2\2\u016e\u016f\7r\2\2\u016f\u0170\7n\2\2\u0170"+
		"\u0171\7g\2\2\u0171\u0172\7v\2\2\u0172\u0173\7q\2\2\u0173H\3\2\2\2\u0174"+
		"\u0175\7C\2\2\u0175\u0176\7u\2\2\u0176\u0177\7u\2\2\u0177\u0178\7k\2\2"+
		"\u0178\u0179\7u\2\2\u0179\u017a\7v\2\2\u017a\u017b\7k\2\2\u017b\u017c"+
		"\7p\2\2\u017c\u017d\7f\2\2\u017d\u017e\7q\2\2\u017eJ\3\2\2\2\u017f\u0180"+
		"\7C\2\2\u0180\u0181\7d\2\2\u0181\u0182\7c\2\2\u0182\u0183\7p\2\2\u0183"+
		"\u0184\7f\2\2\u0184\u0185\7q\2\2\u0185\u0186\7p\2\2\u0186\u0187\7c\2\2"+
		"\u0187\u0188\7f\2\2\u0188\u0189\7q\2\2\u0189L\3\2\2\2\u018a\u018b\7\f"+
		"\2\2\u018bN\3\2\2\2\u018c\u018d\7\17\2\2\u018dP\3\2\2\2\u018e\u018f\7"+
		"\177\2\2\u018fR\3\2\2\2\u0190\u0194\7]\2\2\u0191\u0193\n\2\2\2\u0192\u0191"+
		"\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\7\17\2\2\u0198\u0197\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7_\2\2\u019b"+
		"\u019c\b*\2\2\u019cT\3\2\2\2\u019d\u019e\t\3\2\2\u019e\u019f\b+\3\2\u019f"+
		"V\3\2\2\2\u01a0\u01a2\t\4\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4X\3\2\2\2\u01a5\u01a7\t"+
		"\5\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01aa\t\6\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01acZ\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7]\2\2\u01af\u01b0"+
		"\b.\4\2\u01b0\\\3\2\2\2\u01b1\u01b2\7}\2\2\u01b2\u01b3\b/\5\2\u01b3^\3"+
		"\2\2\2\u01b4\u01b5\13\2\2\2\u01b5\u01b6\b\60\6\2\u01b6`\3\2\2\2\t\2\u0194"+
		"\u0198\u01a3\u01a6\u01a9\u01ab\7\3*\2\3+\3\3.\4\3/\5\3\60\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}