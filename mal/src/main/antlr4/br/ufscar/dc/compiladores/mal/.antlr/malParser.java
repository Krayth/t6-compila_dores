// Generated from c:\Users\Eduardo\Desktop\UFSCar\Compiladores\t6\t6\t6-compila_dores\mal\src\main\antlr4\br\u005Cufscar\dc\compiladores\mal\mal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class malParser extends Parser {
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
		T__38=39, Comentario=40, WhiteSpace=41, NUM=42, NOME=43, ErroComentarioCodigo=44, 
		ANY=45;
	public static final int
		RULE_delimitador = 0, RULE_nota = 1, RULE_qtdEps = 2, RULE_tipo_anime = 3, 
		RULE_genero = 4, RULE_publico_alvo = 5, RULE_nome_anime = 6, RULE_declare_nome = 7, 
		RULE_program = 8, RULE_corpo = 9, RULE_declare_anime = 10, RULE_total_eps = 11, 
		RULE_declare_avaliacao = 12, RULE_cmdAddNome = 13, RULE_cmdAddNota = 14, 
		RULE_cmdAddStatus = 15, RULE_cmdAddEps = 16, RULE_cmdAddComentario = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"delimitador", "nota", "qtdEps", "tipo_anime", "genero", "publico_alvo", 
			"nome_anime", "declare_nome", "program", "corpo", "declare_anime", "total_eps", 
			"declare_avaliacao", "cmdAddNome", "cmdAddNota", "cmdAddStatus", "cmdAddEps", 
			"cmdAddComentario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'TV'", "'Filme'", "'OVA'", "'Especial'", "'Acao'", "'Aventura'", 
			"'Drama'", "'Comedia'", "'Terror'", "'Fantasia'", "'Scifi'", "'Romance'", 
			"'Misterio'", "'SliceOfLife'", "'Sobrenatural'", "'Suspense'", "'Musical'", 
			"'Esporte'", "'Livre'", "'Shounen'", "'Seinen'", "'Shoujo'", "'R18'", 
			"'inicio'", "'Nome'", "'Tipo'", "'Genero'", "'Quantidade_Eps'", "'Publico_Alvo'", 
			"'fim'", "'comeco_avaliacao'", "'Nota'", "'Status'", "'fim_avaliacao'", 
			"'Completo'", "'Assistindo'", "'Abandonado'", "'\"'", null, null, null, 
			null, "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Comentario", "WhiteSpace", "NUM", "NOME", "ErroComentarioCodigo", 
			"ANY"
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
	public String getGrammarFileName() { return "mal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public malParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DelimitadorContext extends ParserRuleContext {
		public DelimitadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimitador; }
	}

	public final DelimitadorContext delimitador() throws RecognitionException {
		DelimitadorContext _localctx = new DelimitadorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_delimitador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
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

	public static class NotaContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(malParser.NUM, 0); }
		public NotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nota; }
	}

	public final NotaContext nota() throws RecognitionException {
		NotaContext _localctx = new NotaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nota);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NUM);
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

	public static class QtdEpsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(malParser.NUM, 0); }
		public QtdEpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtdEps; }
	}

	public final QtdEpsContext qtdEps() throws RecognitionException {
		QtdEpsContext _localctx = new QtdEpsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qtdEps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NUM);
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

	public static class Tipo_animeContext extends ParserRuleContext {
		public Tipo_animeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_anime; }
	}

	public final Tipo_animeContext tipo_anime() throws RecognitionException {
		Tipo_animeContext _localctx = new Tipo_animeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo_anime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class GeneroContext extends ParserRuleContext {
		public GeneroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genero; }
	}

	public final GeneroContext genero() throws RecognitionException {
		GeneroContext _localctx = new GeneroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Publico_alvoContext extends ParserRuleContext {
		public Publico_alvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publico_alvo; }
	}

	public final Publico_alvoContext publico_alvo() throws RecognitionException {
		Publico_alvoContext _localctx = new Publico_alvoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_publico_alvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Nome_animeContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(malParser.NOME, 0); }
		public Nome_animeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_anime; }
	}

	public final Nome_animeContext nome_anime() throws RecognitionException {
		Nome_animeContext _localctx = new Nome_animeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nome_anime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NOME);
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

	public static class Declare_nomeContext extends ParserRuleContext {
		public Nome_animeContext nome_anime() {
			return getRuleContext(Nome_animeContext.class,0);
		}
		public Declare_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_nome; }
	}

	public final Declare_nomeContext declare_nome() throws RecognitionException {
		Declare_nomeContext _localctx = new Declare_nomeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declare_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			nome_anime();
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

	public static class ProgramContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			corpo();
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

	public static class CorpoContext extends ParserRuleContext {
		public List<Declare_animeContext> declare_anime() {
			return getRuleContexts(Declare_animeContext.class);
		}
		public Declare_animeContext declare_anime(int i) {
			return getRuleContext(Declare_animeContext.class,i);
		}
		public List<Declare_avaliacaoContext> declare_avaliacao() {
			return getRuleContexts(Declare_avaliacaoContext.class);
		}
		public Declare_avaliacaoContext declare_avaliacao(int i) {
			return getRuleContext(Declare_avaliacaoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				declare_anime();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 );
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(59);
				declare_avaliacao();
				}
				}
				setState(64);
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

	public static class Declare_animeContext extends ParserRuleContext {
		public Declare_nomeContext declare_nome() {
			return getRuleContext(Declare_nomeContext.class,0);
		}
		public Tipo_animeContext tipo_anime() {
			return getRuleContext(Tipo_animeContext.class,0);
		}
		public GeneroContext genero() {
			return getRuleContext(GeneroContext.class,0);
		}
		public Total_epsContext total_eps() {
			return getRuleContext(Total_epsContext.class,0);
		}
		public Publico_alvoContext publico_alvo() {
			return getRuleContext(Publico_alvoContext.class,0);
		}
		public Declare_animeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_anime; }
	}

	public final Declare_animeContext declare_anime() throws RecognitionException {
		Declare_animeContext _localctx = new Declare_animeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declare_anime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__24);
			setState(66);
			match(T__25);
			setState(67);
			match(T__0);
			setState(68);
			declare_nome();
			setState(69);
			match(T__26);
			setState(70);
			match(T__0);
			setState(71);
			tipo_anime();
			setState(72);
			match(T__27);
			setState(73);
			match(T__0);
			setState(74);
			genero();
			setState(75);
			match(T__28);
			setState(76);
			match(T__0);
			setState(77);
			total_eps();
			setState(78);
			match(T__29);
			setState(79);
			match(T__0);
			setState(80);
			publico_alvo();
			setState(81);
			match(T__30);
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

	public static class Total_epsContext extends ParserRuleContext {
		public QtdEpsContext qtdEps() {
			return getRuleContext(QtdEpsContext.class,0);
		}
		public Total_epsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total_eps; }
	}

	public final Total_epsContext total_eps() throws RecognitionException {
		Total_epsContext _localctx = new Total_epsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_total_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			qtdEps();
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

	public static class Declare_avaliacaoContext extends ParserRuleContext {
		public CmdAddNomeContext cmdAddNome() {
			return getRuleContext(CmdAddNomeContext.class,0);
		}
		public CmdAddNotaContext cmdAddNota() {
			return getRuleContext(CmdAddNotaContext.class,0);
		}
		public CmdAddStatusContext cmdAddStatus() {
			return getRuleContext(CmdAddStatusContext.class,0);
		}
		public CmdAddEpsContext cmdAddEps() {
			return getRuleContext(CmdAddEpsContext.class,0);
		}
		public CmdAddComentarioContext cmdAddComentario() {
			return getRuleContext(CmdAddComentarioContext.class,0);
		}
		public Declare_avaliacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_avaliacao; }
	}

	public final Declare_avaliacaoContext declare_avaliacao() throws RecognitionException {
		Declare_avaliacaoContext _localctx = new Declare_avaliacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare_avaliacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__31);
			setState(86);
			match(T__25);
			setState(87);
			match(T__0);
			setState(88);
			cmdAddNome();
			setState(89);
			match(T__32);
			setState(90);
			match(T__0);
			setState(91);
			cmdAddNota();
			setState(92);
			match(T__33);
			setState(93);
			match(T__0);
			setState(94);
			cmdAddStatus();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(95);
				cmdAddEps();
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(98);
				cmdAddComentario();
				}
			}

			setState(101);
			match(T__34);
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

	public static class CmdAddNomeContext extends ParserRuleContext {
		public Nome_animeContext nome_anime() {
			return getRuleContext(Nome_animeContext.class,0);
		}
		public CmdAddNomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddNome; }
	}

	public final CmdAddNomeContext cmdAddNome() throws RecognitionException {
		CmdAddNomeContext _localctx = new CmdAddNomeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdAddNome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			nome_anime();
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

	public static class CmdAddNotaContext extends ParserRuleContext {
		public NotaContext nota() {
			return getRuleContext(NotaContext.class,0);
		}
		public CmdAddNotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddNota; }
	}

	public final CmdAddNotaContext cmdAddNota() throws RecognitionException {
		CmdAddNotaContext _localctx = new CmdAddNotaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdAddNota);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			nota();
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

	public static class CmdAddStatusContext extends ParserRuleContext {
		public CmdAddStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddStatus; }
	}

	public final CmdAddStatusContext cmdAddStatus() throws RecognitionException {
		CmdAddStatusContext _localctx = new CmdAddStatusContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdAddStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CmdAddEpsContext extends ParserRuleContext {
		public QtdEpsContext qtdEps() {
			return getRuleContext(QtdEpsContext.class,0);
		}
		public CmdAddEpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddEps; }
	}

	public final CmdAddEpsContext cmdAddEps() throws RecognitionException {
		CmdAddEpsContext _localctx = new CmdAddEpsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdAddEps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			qtdEps();
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

	public static class CmdAddComentarioContext extends ParserRuleContext {
		public CmdAddComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddComentario; }
	}

	public final CmdAddComentarioContext cmdAddComentario() throws RecognitionException {
		CmdAddComentarioContext _localctx = new CmdAddComentarioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdAddComentario);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__38);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(112);
					matchWildcard();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(118);
			match(T__38);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/{\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t"+
		"\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\6\13:\n\13\r\13\16\13;\3\13\7\13?\n\13\f\13\16\13B\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16c"+
		"\n\16\3\16\5\16f\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\7\23t\n\23\f\23\16\23w\13\23\3\23\3\23\3\23\3u\2\24\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\3\2\4\7\3\2\b\25\3\2\26\32\3\2"+
		"&(\2m\2&\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f\60\3\2"+
		"\2\2\16\62\3\2\2\2\20\64\3\2\2\2\22\66\3\2\2\2\249\3\2\2\2\26C\3\2\2\2"+
		"\30U\3\2\2\2\32W\3\2\2\2\34i\3\2\2\2\36k\3\2\2\2 m\3\2\2\2\"o\3\2\2\2"+
		"$q\3\2\2\2&\'\7\3\2\2\'\3\3\2\2\2()\7,\2\2)\5\3\2\2\2*+\7,\2\2+\7\3\2"+
		"\2\2,-\t\2\2\2-\t\3\2\2\2./\t\3\2\2/\13\3\2\2\2\60\61\t\4\2\2\61\r\3\2"+
		"\2\2\62\63\7-\2\2\63\17\3\2\2\2\64\65\5\16\b\2\65\21\3\2\2\2\66\67\5\24"+
		"\13\2\67\23\3\2\2\28:\5\26\f\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<@\3\2\2\2=?\5\32\16\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\25\3\2"+
		"\2\2B@\3\2\2\2CD\7\33\2\2DE\7\34\2\2EF\7\3\2\2FG\5\20\t\2GH\7\35\2\2H"+
		"I\7\3\2\2IJ\5\b\5\2JK\7\36\2\2KL\7\3\2\2LM\5\n\6\2MN\7\37\2\2NO\7\3\2"+
		"\2OP\5\30\r\2PQ\7 \2\2QR\7\3\2\2RS\5\f\7\2ST\7!\2\2T\27\3\2\2\2UV\5\6"+
		"\4\2V\31\3\2\2\2WX\7\"\2\2XY\7\34\2\2YZ\7\3\2\2Z[\5\34\17\2[\\\7#\2\2"+
		"\\]\7\3\2\2]^\5\36\20\2^_\7$\2\2_`\7\3\2\2`b\5 \21\2ac\5\"\22\2ba\3\2"+
		"\2\2bc\3\2\2\2ce\3\2\2\2df\5$\23\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7%"+
		"\2\2h\33\3\2\2\2ij\5\16\b\2j\35\3\2\2\2kl\5\4\3\2l\37\3\2\2\2mn\t\5\2"+
		"\2n!\3\2\2\2op\5\6\4\2p#\3\2\2\2qu\7)\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2"+
		"\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7)\2\2y%\3\2\2\2\7;@beu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}