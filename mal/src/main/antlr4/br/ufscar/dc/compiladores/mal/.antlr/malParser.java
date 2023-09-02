// Generated from c:\Users\fehie\OneDrive\Área de Trabalho\Faculdade\Compiladores\t3\t4-compila-dores\t6-compila_dores\mal\src\main\antlr4\br\u005Cufscar\dc\compiladores\mal\mal.g4 by ANTLR 4.9.2

  import br.ufscar.dc.compiladores.mal.File;

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
		Comentario=39, WhiteSpace=40, NUM=41, NOME=42, ErroComentarioCodigo=43, 
		ErroAddComentario=44, ANY=45;
	public static final int
		RULE_delimitador = 0, RULE_nota = 1, RULE_qtdEps = 2, RULE_tipo_anime = 3, 
		RULE_genero = 4, RULE_publico_alvo = 5, RULE_statusCompleto = 6, RULE_statusAssistindo = 7, 
		RULE_statusAbandonado = 8, RULE_nome_anime = 9, RULE_declare_nome = 10, 
		RULE_program = 11, RULE_corpo = 12, RULE_declare_anime = 13, RULE_total_eps = 14, 
		RULE_declare_avaliacao = 15, RULE_cmdAddNome = 16, RULE_cmdAddNota = 17, 
		RULE_cmdAddStatus = 18, RULE_cmdAddEps = 19, RULE_cmdAddComentario = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"delimitador", "nota", "qtdEps", "tipo_anime", "genero", "publico_alvo", 
			"statusCompleto", "statusAssistindo", "statusAbandonado", "nome_anime", 
			"declare_nome", "program", "corpo", "declare_anime", "total_eps", "declare_avaliacao", 
			"cmdAddNome", "cmdAddNota", "cmdAddStatus", "cmdAddEps", "cmdAddComentario"
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
			setState(42);
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
			setState(44);
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
			setState(46);
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
			setState(48);
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
			setState(50);
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
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class StatusCompletoContext extends ParserRuleContext {
		public StatusCompletoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusCompleto; }
	}

	public final StatusCompletoContext statusCompleto() throws RecognitionException {
		StatusCompletoContext _localctx = new StatusCompletoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statusCompleto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__23);
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

	public static class StatusAssistindoContext extends ParserRuleContext {
		public StatusAssistindoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusAssistindo; }
	}

	public final StatusAssistindoContext statusAssistindo() throws RecognitionException {
		StatusAssistindoContext _localctx = new StatusAssistindoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statusAssistindo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__24);
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

	public static class StatusAbandonadoContext extends ParserRuleContext {
		public StatusAbandonadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusAbandonado; }
	}

	public final StatusAbandonadoContext statusAbandonado() throws RecognitionException {
		StatusAbandonadoContext _localctx = new StatusAbandonadoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statusAbandonado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__25);
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
		enterRule(_localctx, 18, RULE_nome_anime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		enterRule(_localctx, 20, RULE_declare_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		enterRule(_localctx, 22, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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
		enterRule(_localctx, 24, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				declare_anime();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__26 );
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(71);
				declare_avaliacao();
				}
				}
				setState(76);
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
		enterRule(_localctx, 26, RULE_declare_anime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__26);
			setState(78);
			match(T__27);
			setState(79);
			match(T__0);
			setState(80);
			declare_nome();
			setState(81);
			match(T__28);
			setState(82);
			match(T__0);
			setState(83);
			tipo_anime();
			setState(84);
			match(T__29);
			setState(85);
			match(T__0);
			setState(86);
			genero();
			setState(87);
			match(T__30);
			setState(88);
			match(T__0);
			setState(89);
			total_eps();
			setState(90);
			match(T__31);
			setState(91);
			match(T__0);
			setState(92);
			publico_alvo();
			setState(93);
			match(T__32);
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
		enterRule(_localctx, 28, RULE_total_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 30, RULE_declare_avaliacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__33);
			setState(98);
			match(T__27);
			setState(99);
			match(T__0);
			setState(100);
			cmdAddNome();
			setState(101);
			match(T__34);
			setState(102);
			match(T__0);
			setState(103);
			cmdAddNota();
			setState(104);
			match(T__35);
			setState(105);
			match(T__0);
			setState(106);
			cmdAddStatus();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(107);
				cmdAddEps();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ErroAddComentario) {
				{
				setState(110);
				cmdAddComentario();
				}
			}

			setState(113);
			match(T__36);
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
		enterRule(_localctx, 32, RULE_cmdAddNome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 34, RULE_cmdAddNota);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		public StatusCompletoContext statusCompleto() {
			return getRuleContext(StatusCompletoContext.class,0);
		}
		public StatusAssistindoContext statusAssistindo() {
			return getRuleContext(StatusAssistindoContext.class,0);
		}
		public StatusAbandonadoContext statusAbandonado() {
			return getRuleContext(StatusAbandonadoContext.class,0);
		}
		public CmdAddStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddStatus; }
	}

	public final CmdAddStatusContext cmdAddStatus() throws RecognitionException {
		CmdAddStatusContext _localctx = new CmdAddStatusContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdAddStatus);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				statusCompleto();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				statusAssistindo();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				statusAbandonado();
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
		enterRule(_localctx, 38, RULE_cmdAddEps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		public List<TerminalNode> ErroAddComentario() { return getTokens(malParser.ErroAddComentario); }
		public TerminalNode ErroAddComentario(int i) {
			return getToken(malParser.ErroAddComentario, i);
		}
		public TerminalNode NOME() { return getToken(malParser.NOME, 0); }
		public CmdAddComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddComentario; }
	}

	public final CmdAddComentarioContext cmdAddComentario() throws RecognitionException {
		CmdAddComentarioContext _localctx = new CmdAddComentarioContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdAddComentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ErroAddComentario);
			setState(127);
			match(NOME);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << Comentario) | (1L << WhiteSpace) | (1L << NUM) | (1L << NOME) | (1L << ErroComentarioCodigo) | (1L << ANY))) != 0)) {
				{
				{
				setState(128);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__37 || _la==ErroAddComentario) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__37);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u008b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\6\16F\n\16\r\16\16\16G\3\16\7\16K\n\16\f\16\16\16N\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21o\n\21\3\21\5\21r\n\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\5\24}\n\24\3\25\3\25\3\26\3\26\3\26\7\26\u0084\n\26\f\26\16\26"+
		"\u0087\13\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\6\3\2\4\7\3\2\b\25\3\2\26\31\4\2((..\2|\2,\3\2\2\2\4.\3\2"+
		"\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\168\3\2\2\2\20"+
		":\3\2\2\2\22<\3\2\2\2\24>\3\2\2\2\26@\3\2\2\2\30B\3\2\2\2\32E\3\2\2\2"+
		"\34O\3\2\2\2\36a\3\2\2\2 c\3\2\2\2\"u\3\2\2\2$w\3\2\2\2&|\3\2\2\2(~\3"+
		"\2\2\2*\u0080\3\2\2\2,-\7\3\2\2-\3\3\2\2\2./\7+\2\2/\5\3\2\2\2\60\61\7"+
		"+\2\2\61\7\3\2\2\2\62\63\t\2\2\2\63\t\3\2\2\2\64\65\t\3\2\2\65\13\3\2"+
		"\2\2\66\67\t\4\2\2\67\r\3\2\2\289\7\32\2\29\17\3\2\2\2:;\7\33\2\2;\21"+
		"\3\2\2\2<=\7\34\2\2=\23\3\2\2\2>?\7,\2\2?\25\3\2\2\2@A\5\24\13\2A\27\3"+
		"\2\2\2BC\5\32\16\2C\31\3\2\2\2DF\5\34\17\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2HL\3\2\2\2IK\5 \21\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2M\33\3\2\2\2NL\3\2\2\2OP\7\35\2\2PQ\7\36\2\2QR\7\3\2\2RS\5\26\f\2ST"+
		"\7\37\2\2TU\7\3\2\2UV\5\b\5\2VW\7 \2\2WX\7\3\2\2XY\5\n\6\2YZ\7!\2\2Z["+
		"\7\3\2\2[\\\5\36\20\2\\]\7\"\2\2]^\7\3\2\2^_\5\f\7\2_`\7#\2\2`\35\3\2"+
		"\2\2ab\5\6\4\2b\37\3\2\2\2cd\7$\2\2de\7\36\2\2ef\7\3\2\2fg\5\"\22\2gh"+
		"\7%\2\2hi\7\3\2\2ij\5$\23\2jk\7&\2\2kl\7\3\2\2ln\5&\24\2mo\5(\25\2nm\3"+
		"\2\2\2no\3\2\2\2oq\3\2\2\2pr\5*\26\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7"+
		"\'\2\2t!\3\2\2\2uv\5\24\13\2v#\3\2\2\2wx\5\4\3\2x%\3\2\2\2y}\5\16\b\2"+
		"z}\5\20\t\2{}\5\22\n\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\'\3\2\2\2~\177\5"+
		"\6\4\2\177)\3\2\2\2\u0080\u0081\7.\2\2\u0081\u0085\7,\2\2\u0082\u0084"+
		"\n\5\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7("+
		"\2\2\u0089+\3\2\2\2\bGLnq|\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}