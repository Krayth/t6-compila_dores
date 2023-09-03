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
		T__38=39, T__39=40, Comentario=41, WhiteSpace=42, NUM=43, NOME=44, ErroComentarioCodigo=45, 
		ErroAddComentario=46, ANY=47;
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
			"'Esporte'", "'Shounen'", "'Seinen'", "'Shoujo'", "'R18'", "'inicio'", 
			"'Nome'", "'Tipo'", "'Genero'", "'Quantidade_Eps'", "'Publico_Alvo'", 
			"'fim'", "'comeco_avaliacao'", "'Nota'", "'Status'", "'fim_avaliacao'", 
			"'Completo'", "'Assistindo'", "'Abandonado'", "'\\n'", "'\\r'", "'}'", 
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
			setState(42);
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
			setState(44);
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
			setState(46);
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
			} while ( _la==T__23 );
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
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
		enterRule(_localctx, 20, RULE_declare_anime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__23);
			setState(66);
			match(T__24);
			setState(67);
			match(T__0);
			setState(68);
			declare_nome();
			setState(69);
			match(T__25);
			setState(70);
			match(T__0);
			setState(71);
			tipo_anime();
			setState(72);
			match(T__26);
			setState(73);
			match(T__0);
			setState(74);
			genero();
			setState(75);
			match(T__27);
			setState(76);
			match(T__0);
			setState(77);
			total_eps();
			setState(78);
			match(T__28);
			setState(79);
			match(T__0);
			setState(80);
			publico_alvo();
			setState(81);
			match(T__29);
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
		enterRule(_localctx, 24, RULE_declare_avaliacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__30);
			setState(86);
			match(T__24);
			setState(87);
			match(T__0);
			setState(88);
			cmdAddNome();
			setState(89);
			match(T__31);
			setState(90);
			match(T__0);
			setState(91);
			cmdAddNota();
			setState(92);
			match(T__32);
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
			if (_la==ErroAddComentario) {
				{
				setState(98);
				cmdAddComentario();
				}
			}

			setState(101);
			match(T__33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAddStatusContext extends ParserRuleContext {
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
		enterRule(_localctx, 30, RULE_cmdAddStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAddComentarioContext extends ParserRuleContext {
		public List<TerminalNode> ErroAddComentario() { return getTokens(malParser.ErroAddComentario); }
		public TerminalNode ErroAddComentario(int i) {
			return getToken(malParser.ErroAddComentario, i);
		}
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
		enterRule(_localctx, 34, RULE_cmdAddComentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ErroAddComentario);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 209182087184382L) != 0) {
				{
				{
				setState(112);
				_la = _input.LA(1);
				if ( _la <= 0 || (((_la) & ~0x3f) == 0 && ((1L << _la) & 72292889526272L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__39);
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
		"\u0004\u0001/y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\t8\b\t\u000b\t\f\t9\u0001"+
		"\t\u0005\t=\b\t\n\t\f\t@\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\fa\b\f\u0001\f\u0003\fd\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011r\b\u0011\n\u0011\f\u0011u\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0005"+
		"\u0001\u0000\u0002\u0005\u0001\u0000\u0006\u0013\u0001\u0000\u0014\u0017"+
		"\u0001\u0000#%\u0002\u0000&(..k\u0000$\u0001\u0000\u0000\u0000\u0002&"+
		"\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006*\u0001\u0000"+
		"\u0000\u0000\b,\u0001\u0000\u0000\u0000\n.\u0001\u0000\u0000\u0000\f0"+
		"\u0001\u0000\u0000\u0000\u000e2\u0001\u0000\u0000\u0000\u00104\u0001\u0000"+
		"\u0000\u0000\u00127\u0001\u0000\u0000\u0000\u0014A\u0001\u0000\u0000\u0000"+
		"\u0016S\u0001\u0000\u0000\u0000\u0018U\u0001\u0000\u0000\u0000\u001ag"+
		"\u0001\u0000\u0000\u0000\u001ci\u0001\u0000\u0000\u0000\u001ek\u0001\u0000"+
		"\u0000\u0000 m\u0001\u0000\u0000\u0000\"o\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0001\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005+\u0000\u0000"+
		"\'\u0003\u0001\u0000\u0000\u0000()\u0005+\u0000\u0000)\u0005\u0001\u0000"+
		"\u0000\u0000*+\u0007\u0000\u0000\u0000+\u0007\u0001\u0000\u0000\u0000"+
		",-\u0007\u0001\u0000\u0000-\t\u0001\u0000\u0000\u0000./\u0007\u0002\u0000"+
		"\u0000/\u000b\u0001\u0000\u0000\u000001\u0005,\u0000\u00001\r\u0001\u0000"+
		"\u0000\u000023\u0003\f\u0006\u00003\u000f\u0001\u0000\u0000\u000045\u0003"+
		"\u0012\t\u00005\u0011\u0001\u0000\u0000\u000068\u0003\u0014\n\u000076"+
		"\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:>\u0001\u0000\u0000\u0000;=\u0003\u0018"+
		"\f\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0013\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000AB\u0005\u0018\u0000\u0000BC\u0005\u0019\u0000"+
		"\u0000CD\u0005\u0001\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005\u001a"+
		"\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0003\u0006\u0003\u0000HI\u0005"+
		"\u001b\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u0003\b\u0004\u0000KL\u0005"+
		"\u001c\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u0003\u0016\u000b\u0000"+
		"NO\u0005\u001d\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0003\n\u0005\u0000"+
		"QR\u0005\u001e\u0000\u0000R\u0015\u0001\u0000\u0000\u0000ST\u0003\u0004"+
		"\u0002\u0000T\u0017\u0001\u0000\u0000\u0000UV\u0005\u001f\u0000\u0000"+
		"VW\u0005\u0019\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0003\u001a\r\u0000"+
		"YZ\u0005 \u0000\u0000Z[\u0005\u0001\u0000\u0000[\\\u0003\u001c\u000e\u0000"+
		"\\]\u0005!\u0000\u0000]^\u0005\u0001\u0000\u0000^`\u0003\u001e\u000f\u0000"+
		"_a\u0003 \u0010\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ac\u0001\u0000\u0000\u0000bd\u0003\"\u0011\u0000cb\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\"\u0000\u0000"+
		"f\u0019\u0001\u0000\u0000\u0000gh\u0003\f\u0006\u0000h\u001b\u0001\u0000"+
		"\u0000\u0000ij\u0003\u0002\u0001\u0000j\u001d\u0001\u0000\u0000\u0000"+
		"kl\u0007\u0003\u0000\u0000l\u001f\u0001\u0000\u0000\u0000mn\u0003\u0004"+
		"\u0002\u0000n!\u0001\u0000\u0000\u0000os\u0005.\u0000\u0000pr\b\u0004"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vw\u0005(\u0000\u0000w#\u0001\u0000\u0000\u0000"+
		"\u00059>`cs";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}