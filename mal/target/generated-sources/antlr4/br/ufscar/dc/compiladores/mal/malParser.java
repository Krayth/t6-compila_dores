// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.mal;

  import br.ufscar.dc.compiladores.mal.File;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class malParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class DelimitadorContext extends ParserRuleContext {
		public DelimitadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimitador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterDelimitador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitDelimitador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitDelimitador(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotaContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(malParser.NUM, 0); }
		public NotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterNota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitNota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitNota(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class QtdEpsContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(malParser.NUM, 0); }
		public QtdEpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtdEps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterQtdEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitQtdEps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitQtdEps(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_animeContext extends ParserRuleContext {
		public Tipo_animeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_anime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterTipo_anime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitTipo_anime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitTipo_anime(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class GeneroContext extends ParserRuleContext {
		public GeneroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterGenero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitGenero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitGenero(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1048512L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Publico_alvoContext extends ParserRuleContext {
		public Publico_alvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publico_alvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterPublico_alvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitPublico_alvo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitPublico_alvo(this);
			else return visitor.visitChildren(this);
		}
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
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatusCompletoContext extends ParserRuleContext {
		public StatusCompletoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusCompleto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterStatusCompleto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitStatusCompleto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitStatusCompleto(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatusAssistindoContext extends ParserRuleContext {
		public StatusAssistindoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusAssistindo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterStatusAssistindo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitStatusAssistindo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitStatusAssistindo(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatusAbandonadoContext extends ParserRuleContext {
		public StatusAbandonadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusAbandonado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterStatusAbandonado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitStatusAbandonado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitStatusAbandonado(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nome_animeContext extends ParserRuleContext {
		public TerminalNode NOME() { return getToken(malParser.NOME, 0); }
		public Nome_animeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_anime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterNome_anime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitNome_anime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitNome_anime(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_nomeContext extends ParserRuleContext {
		public Nome_animeContext nome_anime() {
			return getRuleContext(Nome_animeContext.class,0);
		}
		public Declare_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterDeclare_nome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitDeclare_nome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitDeclare_nome(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterDeclare_anime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitDeclare_anime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitDeclare_anime(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Total_epsContext extends ParserRuleContext {
		public QtdEpsContext qtdEps() {
			return getRuleContext(QtdEpsContext.class,0);
		}
		public Total_epsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_total_eps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterTotal_eps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitTotal_eps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitTotal_eps(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterDeclare_avaliacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitDeclare_avaliacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitDeclare_avaliacao(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAddNomeContext extends ParserRuleContext {
		public Nome_animeContext nome_anime() {
			return getRuleContext(Nome_animeContext.class,0);
		}
		public CmdAddNomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddNome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterCmdAddNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitCmdAddNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitCmdAddNome(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAddNotaContext extends ParserRuleContext {
		public NotaContext nota() {
			return getRuleContext(NotaContext.class,0);
		}
		public CmdAddNotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddNota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterCmdAddNota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitCmdAddNota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitCmdAddNota(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterCmdAddStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitCmdAddStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitCmdAddStatus(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAddEpsContext extends ParserRuleContext {
		public QtdEpsContext qtdEps() {
			return getRuleContext(QtdEpsContext.class,0);
		}
		public CmdAddEpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAddEps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterCmdAddEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitCmdAddEps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitCmdAddEps(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).enterCmdAddComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof malListener ) ((malListener)listener).exitCmdAddComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof malVisitor ) return ((malVisitor<? extends T>)visitor).visitCmdAddComentario(this);
			else return visitor.visitChildren(this);
		}
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 52501680226302L) != 0) {
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
		"\u0004\u0001-\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0004\fD\b\f\u000b\f\f\fE\u0001\f\u0005"+
		"\fI\b\f\n\f\f\fL\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000fm\b\u000f\u0001\u000f\u0003"+
		"\u000fp\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012{\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0082\b\u0014\n\u0014\f\u0014\u0085\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0004\u0001\u0000"+
		"\u0002\u0005\u0001\u0000\u0006\u0013\u0001\u0000\u0014\u0017\u0002\u0000"+
		"&&,,z\u0000*\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004"+
		".\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b2\u0001\u0000"+
		"\u0000\u0000\n4\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000e"+
		"8\u0001\u0000\u0000\u0000\u0010:\u0001\u0000\u0000\u0000\u0012<\u0001"+
		"\u0000\u0000\u0000\u0014>\u0001\u0000\u0000\u0000\u0016@\u0001\u0000\u0000"+
		"\u0000\u0018C\u0001\u0000\u0000\u0000\u001aM\u0001\u0000\u0000\u0000\u001c"+
		"_\u0001\u0000\u0000\u0000\u001ea\u0001\u0000\u0000\u0000 s\u0001\u0000"+
		"\u0000\u0000\"u\u0001\u0000\u0000\u0000$z\u0001\u0000\u0000\u0000&|\u0001"+
		"\u0000\u0000\u0000(~\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000"+
		"+\u0001\u0001\u0000\u0000\u0000,-\u0005)\u0000\u0000-\u0003\u0001\u0000"+
		"\u0000\u0000./\u0005)\u0000\u0000/\u0005\u0001\u0000\u0000\u000001\u0007"+
		"\u0000\u0000\u00001\u0007\u0001\u0000\u0000\u000023\u0007\u0001\u0000"+
		"\u00003\t\u0001\u0000\u0000\u000045\u0007\u0002\u0000\u00005\u000b\u0001"+
		"\u0000\u0000\u000067\u0005\u0018\u0000\u00007\r\u0001\u0000\u0000\u0000"+
		"89\u0005\u0019\u0000\u00009\u000f\u0001\u0000\u0000\u0000:;\u0005\u001a"+
		"\u0000\u0000;\u0011\u0001\u0000\u0000\u0000<=\u0005*\u0000\u0000=\u0013"+
		"\u0001\u0000\u0000\u0000>?\u0003\u0012\t\u0000?\u0015\u0001\u0000\u0000"+
		"\u0000@A\u0003\u0018\f\u0000A\u0017\u0001\u0000\u0000\u0000BD\u0003\u001a"+
		"\r\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FJ\u0001\u0000\u0000\u0000GI\u0003"+
		"\u001e\u000f\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0019\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u001b\u0000\u0000NO\u0005"+
		"\u001c\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\u0014\n\u0000QR\u0005"+
		"\u001d\u0000\u0000RS\u0005\u0001\u0000\u0000ST\u0003\u0006\u0003\u0000"+
		"TU\u0005\u001e\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u0003\b\u0004\u0000"+
		"WX\u0005\u001f\u0000\u0000XY\u0005\u0001\u0000\u0000YZ\u0003\u001c\u000e"+
		"\u0000Z[\u0005 \u0000\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003\n\u0005"+
		"\u0000]^\u0005!\u0000\u0000^\u001b\u0001\u0000\u0000\u0000_`\u0003\u0004"+
		"\u0002\u0000`\u001d\u0001\u0000\u0000\u0000ab\u0005\"\u0000\u0000bc\u0005"+
		"\u001c\u0000\u0000cd\u0005\u0001\u0000\u0000de\u0003 \u0010\u0000ef\u0005"+
		"#\u0000\u0000fg\u0005\u0001\u0000\u0000gh\u0003\"\u0011\u0000hi\u0005"+
		"$\u0000\u0000ij\u0005\u0001\u0000\u0000jl\u0003$\u0012\u0000km\u0003&"+
		"\u0013\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001"+
		"\u0000\u0000\u0000np\u0003(\u0014\u0000on\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005%\u0000\u0000r\u001f"+
		"\u0001\u0000\u0000\u0000st\u0003\u0012\t\u0000t!\u0001\u0000\u0000\u0000"+
		"uv\u0003\u0002\u0001\u0000v#\u0001\u0000\u0000\u0000w{\u0003\f\u0006\u0000"+
		"x{\u0003\u000e\u0007\u0000y{\u0003\u0010\b\u0000zw\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{%\u0001\u0000\u0000"+
		"\u0000|}\u0003\u0004\u0002\u0000}\'\u0001\u0000\u0000\u0000~\u007f\u0005"+
		",\u0000\u0000\u007f\u0083\u0005*\u0000\u0000\u0080\u0082\b\u0003\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005&\u0000\u0000\u0087)\u0001\u0000\u0000\u0000\u0006"+
		"EJloz\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}