package antlr;

// Generated from EntradaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EntradaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLINEA=2, CADENA_ABRIR=3, INT=4, LETRA=5, 
		COMA=6, DOBLEPUNTO=7, PUNTO=8, INTRO=9, OPBLT=10, OPBGT=11, SAP=12, SCP=13, 
		ASIG=14, OPASIG=15, BBAJA=16, COR_ABRIR=17, COR_CERRAR=18, KW_DOS_PUNTOS=19, 
		TERMINADOR=20, WS=21, BARRA=22, KW_JSON=23, KW_DOT=24, KW_SVG=25, KW_CSV=26, 
		LEN=27, FONTCOLOR=28, FONTNAME=29, FONTSIZE=30, ARROWSIZE=31, ARROWCOLOR=32, 
		PENWIDTH=33, FILLCOLOR=34, STYLE=35, SHAPE=36, EXTENSION_JSON=37, EXTENSION_SVG=38, 
		EXTENSION_DOT=39, EXTENSION_CSV=40, EDGE=41, NODE=42, RELATIONSHIP=43, 
		CLASS=44, PROPERTY=45, INHERITANCE=46, INDERECT_USE=47, IDF=48, COMENTARIOCERRAR=49, 
		TEXTOCOMENTARIO_ML=50, AUTHOR=51, DESCRIPTION=52, TARGET=53, FINAL_COMENTARIO_UL=54, 
		TEXTOCOMENTARIO_UL=55, CADENA_CERRAR=56, TEXTO_CADENA=57;
	public static final int
		RULE_init = 0, RULE_comentario = 1, RULE_authorcom = 2, RULE_descrcom = 3, 
		RULE_targcom = 4, RULE_texto_comen = 5, RULE_rutafichero = 6, RULE_tipo_archivo = 7, 
		RULE_json = 8, RULE_svg = 9, RULE_dot = 10, RULE_csv = 11, RULE_wsci = 12, 
		RULE_white_space = 13, RULE_barra = 14, RULE_intro = 15, RULE_letra = 16, 
		RULE_numero = 17, RULE_variable = 18, RULE_sap = 19, RULE_scp = 20, RULE_asig = 21, 
		RULE_opasig = 22, RULE_opblt = 23, RULE_opbgt = 24, RULE_coma = 25, RULE_dos_ptos = 26, 
		RULE_punto = 27, RULE_doblepunto = 28, RULE_texto_cadena = 29, RULE_cadena_abrir = 30, 
		RULE_cadena_cerrar = 31, RULE_cadena = 32, RULE_bbaja = 33, RULE_cor_abrir = 34, 
		RULE_cor_Cerrar = 35, RULE_kw_json = 36, RULE_extension_json = 37, RULE_kw_svg = 38, 
		RULE_extension_svg = 39, RULE_kw_dot = 40, RULE_extension_dot = 41, RULE_kw_csv = 42, 
		RULE_extension_csv = 43, RULE_parametros = 44, RULE_len = 45, RULE_fontcolor = 46, 
		RULE_fontname = 47, RULE_fontsize = 48, RULE_arrowsize = 49, RULE_arrowcolor = 50, 
		RULE_penwidth = 51, RULE_fillcolor = 52, RULE_style = 53, RULE_shape = 54, 
		RULE_tipo_estruc = 55, RULE_kw_edge = 56, RULE_kw_node = 57, RULE_kw_relationship = 58, 
		RULE_kw_class = 59, RULE_kw_property = 60, RULE_kw_inheritance = 61, RULE_kw_inderect_use = 62, 
		RULE_kw_len = 63, RULE_kw_fontcolor = 64, RULE_kw_fontname = 65, RULE_kw_fontsize = 66, 
		RULE_kw_arrowsize = 67, RULE_kw_arrowcolor = 68, RULE_kw_penwidth = 69, 
		RULE_kw_fillcolor = 70, RULE_kw_style = 71, RULE_kw_shape = 72;
	public static final String[] ruleNames = {
		"init", "comentario", "authorcom", "descrcom", "targcom", "texto_comen", 
		"rutafichero", "tipo_archivo", "json", "svg", "dot", "csv", "wsci", "white_space", 
		"barra", "intro", "letra", "numero", "variable", "sap", "scp", "asig", 
		"opasig", "opblt", "opbgt", "coma", "dos_ptos", "punto", "doblepunto", 
		"texto_cadena", "cadena_abrir", "cadena_cerrar", "cadena", "bbaja", "cor_abrir", 
		"cor_Cerrar", "kw_json", "extension_json", "kw_svg", "extension_svg", 
		"kw_dot", "extension_dot", "kw_csv", "extension_csv", "parametros", "len", 
		"fontcolor", "fontname", "fontsize", "arrowsize", "arrowcolor", "penwidth", 
		"fillcolor", "style", "shape", "tipo_estruc", "kw_edge", "kw_node", "kw_relationship", 
		"kw_class", "kw_property", "kw_inheritance", "kw_inderect_use", "kw_len", 
		"kw_fontcolor", "kw_fontname", "kw_fontsize", "kw_arrowsize", "kw_arrowcolor", 
		"kw_penwidth", "kw_fillcolor", "kw_style", "kw_shape"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/*'", "'//'", null, null, null, "','", "'..'", "'.'", null, "'<'", 
		"'>'", "'('", "')'", "'='", "':='", "'_'", "'['", "']'", "':'", "';'", 
		null, null, "'JSON'", "'DOT'", "'SVG'", "'CSV'", "'len'", "'fontcolor'", 
		"'fontname'", "'fontsize'", "'arrowsize'", "'arrowcolor'", "'penwidth'", 
		"'fillcolor'", "'style'", "'shape'", "'json'", "'svg'", "'dot'", "'csv'", 
		"'edge'", "'node'", "'relationship'", "'class'", "'property'", "'inheritance'", 
		"'inderect_use'", null, "'*/'", null, null, null, null, "'\r\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIOABRIR", "COMENTARIOLINEA", "CADENA_ABRIR", "INT", "LETRA", 
		"COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "OPBLT", "OPBGT", "SAP", "SCP", 
		"ASIG", "OPASIG", "BBAJA", "COR_ABRIR", "COR_CERRAR", "KW_DOS_PUNTOS", 
		"TERMINADOR", "WS", "BARRA", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", 
		"LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", 
		"PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", "EXTENSION_JSON", "EXTENSION_SVG", 
		"EXTENSION_DOT", "EXTENSION_CSV", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "IDF", "COMENTARIOCERRAR", 
		"TEXTOCOMENTARIO_ML", "AUTHOR", "DESCRIPTION", "TARGET", "FINAL_COMENTARIO_UL", 
		"TEXTOCOMENTARIO_UL", "CADENA_CERRAR", "TEXTO_CADENA"
	};
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
	public String getGrammarFileName() { return "EntradaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EntradaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<Tipo_archivoContext> tipo_archivo() {
			return getRuleContexts(Tipo_archivoContext.class);
		}
		public Tipo_archivoContext tipo_archivo(int i) {
			return getRuleContext(Tipo_archivoContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA) | (1L << INTRO) | (1L << WS) | (1L << KW_JSON) | (1L << KW_DOT) | (1L << KW_SVG) | (1L << KW_CSV) | (1L << LEN) | (1L << FONTCOLOR) | (1L << FONTNAME) | (1L << FONTSIZE) | (1L << ARROWSIZE) | (1L << ARROWCOLOR) | (1L << PENWIDTH) | (1L << FILLCOLOR) | (1L << STYLE) | (1L << SHAPE))) != 0)) {
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_JSON:
				case KW_DOT:
				case KW_SVG:
				case KW_CSV:
					{
					setState(146);
					tipo_archivo();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(147);
					comentario();
					}
					break;
				case INTRO:
				case WS:
					{
					setState(148);
					wsci();
					}
					break;
				case LEN:
				case FONTCOLOR:
				case FONTNAME:
				case FONTSIZE:
				case ARROWSIZE:
				case ARROWCOLOR:
				case PENWIDTH:
				case FILLCOLOR:
				case STYLE:
				case SHAPE:
					{
					setState(149);
					parametros();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(154);
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOABRIR() { return getToken(EntradaParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(EntradaParser.COMENTARIOCERRAR, 0); }
		public List<Texto_comenContext> texto_comen() {
			return getRuleContexts(Texto_comenContext.class);
		}
		public Texto_comenContext texto_comen(int i) {
			return getRuleContext(Texto_comenContext.class,i);
		}
		public List<AuthorcomContext> authorcom() {
			return getRuleContexts(AuthorcomContext.class);
		}
		public AuthorcomContext authorcom(int i) {
			return getRuleContext(AuthorcomContext.class,i);
		}
		public List<DescrcomContext> descrcom() {
			return getRuleContexts(DescrcomContext.class);
		}
		public DescrcomContext descrcom(int i) {
			return getRuleContext(DescrcomContext.class,i);
		}
		public List<TargcomContext> targcom() {
			return getRuleContexts(TargcomContext.class);
		}
		public TargcomContext targcom(int i) {
			return getRuleContext(TargcomContext.class,i);
		}
		public List<TerminalNode> INTRO() { return getTokens(EntradaParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(EntradaParser.INTRO, i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(EntradaParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(EntradaParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comentario);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(COMENTARIOABRIR);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIO_ML) | (1L << AUTHOR) | (1L << DESCRIPTION) | (1L << TARGET) | (1L << TEXTOCOMENTARIO_UL))) != 0)) {
					{
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIO_ML:
					case TEXTOCOMENTARIO_UL:
						{
						setState(156);
						texto_comen();
						}
						break;
					case AUTHOR:
						{
						setState(157);
						authorcom();
						}
						break;
					case DESCRIPTION:
						{
						setState(158);
						descrcom();
						}
						break;
					case TARGET:
						{
						setState(159);
						targcom();
						}
						break;
					case INTRO:
						{
						setState(160);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(COMENTARIOLINEA);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIO_ML || _la==TEXTOCOMENTARIO_UL) {
					{
					{
					setState(168);
					texto_comen();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(FINAL_COMENTARIO_UL);
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

	public static class AuthorcomContext extends ParserRuleContext {
		public List<TerminalNode> AUTHOR() { return getTokens(EntradaParser.AUTHOR); }
		public TerminalNode AUTHOR(int i) {
			return getToken(EntradaParser.AUTHOR, i);
		}
		public AuthorcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorcom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitAuthorcom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorcomContext authorcom() throws RecognitionException {
		AuthorcomContext _localctx = new AuthorcomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_authorcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(177);
					match(AUTHOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DescrcomContext extends ParserRuleContext {
		public List<TerminalNode> DESCRIPTION() { return getTokens(EntradaParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(EntradaParser.DESCRIPTION, i);
		}
		public DescrcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descrcom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitDescrcom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescrcomContext descrcom() throws RecognitionException {
		DescrcomContext _localctx = new DescrcomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descrcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					match(DESCRIPTION);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TargcomContext extends ParserRuleContext {
		public List<TerminalNode> TARGET() { return getTokens(EntradaParser.TARGET); }
		public TerminalNode TARGET(int i) {
			return getToken(EntradaParser.TARGET, i);
		}
		public TargcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targcom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitTargcom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargcomContext targcom() throws RecognitionException {
		TargcomContext _localctx = new TargcomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_targcom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(187);
					match(TARGET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Texto_comenContext extends ParserRuleContext {
		public List<TerminalNode> TEXTOCOMENTARIO_ML() { return getTokens(EntradaParser.TEXTOCOMENTARIO_ML); }
		public TerminalNode TEXTOCOMENTARIO_ML(int i) {
			return getToken(EntradaParser.TEXTOCOMENTARIO_ML, i);
		}
		public List<TerminalNode> TEXTOCOMENTARIO_UL() { return getTokens(EntradaParser.TEXTOCOMENTARIO_UL); }
		public TerminalNode TEXTOCOMENTARIO_UL(int i) {
			return getToken(EntradaParser.TEXTOCOMENTARIO_UL, i);
		}
		public Texto_comenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto_comen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitTexto_comen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Texto_comenContext texto_comen() throws RecognitionException {
		Texto_comenContext _localctx = new Texto_comenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_texto_comen);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192);
					_la = _input.LA(1);
					if ( !(_la==TEXTOCOMENTARIO_ML || _la==TEXTOCOMENTARIO_UL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class RutaficheroContext extends ParserRuleContext {
		public List<DoblepuntoContext> doblepunto() {
			return getRuleContexts(DoblepuntoContext.class);
		}
		public DoblepuntoContext doblepunto(int i) {
			return getRuleContext(DoblepuntoContext.class,i);
		}
		public List<PuntoContext> punto() {
			return getRuleContexts(PuntoContext.class);
		}
		public PuntoContext punto(int i) {
			return getRuleContext(PuntoContext.class,i);
		}
		public List<LetraContext> letra() {
			return getRuleContexts(LetraContext.class);
		}
		public LetraContext letra(int i) {
			return getRuleContext(LetraContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<BarraContext> barra() {
			return getRuleContexts(BarraContext.class);
		}
		public BarraContext barra(int i) {
			return getRuleContext(BarraContext.class,i);
		}
		public List<Dos_ptosContext> dos_ptos() {
			return getRuleContexts(Dos_ptosContext.class);
		}
		public Dos_ptosContext dos_ptos(int i) {
			return getRuleContext(Dos_ptosContext.class,i);
		}
		public RutaficheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutafichero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitRutafichero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaficheroContext rutafichero() throws RecognitionException {
		RutaficheroContext _localctx = new RutaficheroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rutafichero);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(205);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOBLEPUNTO:
						{
						setState(197);
						doblepunto();
						}
						break;
					case PUNTO:
						{
						setState(198);
						punto();
						}
						break;
					case LETRA:
						{
						setState(199);
						letra();
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_DOS_PUNTOS) {
							{
							setState(200);
							dos_ptos();
							}
						}

						}
						break;
					case IDF:
						{
						setState(203);
						variable();
						}
						break;
					case BARRA:
						{
						setState(204);
						barra();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(209);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_archivoContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public SvgContext svg() {
			return getRuleContext(SvgContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public CsvContext csv() {
			return getRuleContext(CsvContext.class,0);
		}
		public Tipo_archivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_archivo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitTipo_archivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_archivoContext tipo_archivo() throws RecognitionException {
		Tipo_archivoContext _localctx = new Tipo_archivoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_archivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_JSON:
				{
				setState(210);
				json();
				}
				break;
			case KW_SVG:
				{
				setState(211);
				svg();
				}
				break;
			case KW_DOT:
				{
				setState(212);
				dot();
				}
				break;
			case KW_CSV:
				{
				setState(213);
				csv();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class JsonContext extends ParserRuleContext {
		public Kw_jsonContext kw_json() {
			return getRuleContext(Kw_jsonContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_jsonContext extension_json() {
			return getRuleContext(Extension_jsonContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			kw_json();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(217);
				wsci();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			asig();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(224);
				wsci();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			rutafichero();
			setState(231);
			variable();
			setState(232);
			punto();
			setState(233);
			extension_json();
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

	public static class SvgContext extends ParserRuleContext {
		public Kw_svgContext kw_svg() {
			return getRuleContext(Kw_svgContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_svgContext extension_svg() {
			return getRuleContext(Extension_svgContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
		public SvgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitSvg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SvgContext svg() throws RecognitionException {
		SvgContext _localctx = new SvgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_svg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			kw_svg();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(236);
				wsci();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			asig();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(243);
				wsci();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			rutafichero();
			setState(250);
			variable();
			setState(251);
			punto();
			setState(252);
			extension_svg();
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

	public static class DotContext extends ParserRuleContext {
		public Kw_dotContext kw_dot() {
			return getRuleContext(Kw_dotContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_dotContext extension_dot() {
			return getRuleContext(Extension_dotContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			kw_dot();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(255);
				wsci();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			asig();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(262);
				wsci();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			rutafichero();
			setState(269);
			variable();
			setState(270);
			punto();
			setState(271);
			extension_dot();
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

	public static class CsvContext extends ParserRuleContext {
		public Kw_csvContext kw_csv() {
			return getRuleContext(Kw_csvContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public Extension_csvContext extension_csv() {
			return getRuleContext(Extension_csvContext.class,0);
		}
		public List<WsciContext> wsci() {
			return getRuleContexts(WsciContext.class);
		}
		public WsciContext wsci(int i) {
			return getRuleContext(WsciContext.class,i);
		}
		public CsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitCsv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsvContext csv() throws RecognitionException {
		CsvContext _localctx = new CsvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_csv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			kw_csv();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(274);
				wsci();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			asig();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRO || _la==WS) {
				{
				{
				setState(281);
				wsci();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			rutafichero();
			setState(288);
			variable();
			setState(289);
			punto();
			setState(290);
			extension_csv();
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

	public static class WsciContext extends ParserRuleContext {
		public White_spaceContext white_space() {
			return getRuleContext(White_spaceContext.class,0);
		}
		public IntroContext intro() {
			return getRuleContext(IntroContext.class,0);
		}
		public WsciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsci; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitWsci(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsciContext wsci() throws RecognitionException {
		WsciContext _localctx = new WsciContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wsci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WS:
				{
				setState(292);
				white_space();
				}
				break;
			case INTRO:
				{
				setState(293);
				intro();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class White_spaceContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(EntradaParser.WS, 0); }
		public White_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white_space; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitWhite_space(this);
			else return visitor.visitChildren(this);
		}
	}

	public final White_spaceContext white_space() throws RecognitionException {
		White_spaceContext _localctx = new White_spaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_white_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(WS);
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

	public static class BarraContext extends ParserRuleContext {
		public TerminalNode BARRA() { return getToken(EntradaParser.BARRA, 0); }
		public BarraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barra; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitBarra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BarraContext barra() throws RecognitionException {
		BarraContext _localctx = new BarraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_barra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(BARRA);
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

	public static class IntroContext extends ParserRuleContext {
		public TerminalNode INTRO() { return getToken(EntradaParser.INTRO, 0); }
		public IntroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitIntro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntroContext intro() throws RecognitionException {
		IntroContext _localctx = new IntroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(INTRO);
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

	public static class LetraContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(EntradaParser.LETRA, 0); }
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitLetra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_letra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(LETRA);
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EntradaParser.INT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(INT);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(EntradaParser.IDF, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IDF);
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

	public static class SapContext extends ParserRuleContext {
		public TerminalNode SAP() { return getToken(EntradaParser.SAP, 0); }
		public SapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sap; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitSap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SapContext sap() throws RecognitionException {
		SapContext _localctx = new SapContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SAP);
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

	public static class ScpContext extends ParserRuleContext {
		public TerminalNode SCP() { return getToken(EntradaParser.SCP, 0); }
		public ScpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitScp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScpContext scp() throws RecognitionException {
		ScpContext _localctx = new ScpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(SCP);
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

	public static class AsigContext extends ParserRuleContext {
		public TerminalNode ASIG() { return getToken(EntradaParser.ASIG, 0); }
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ASIG);
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

	public static class OpasigContext extends ParserRuleContext {
		public TerminalNode OPASIG() { return getToken(EntradaParser.OPASIG, 0); }
		public OpasigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opasig; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitOpasig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpasigContext opasig() throws RecognitionException {
		OpasigContext _localctx = new OpasigContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opasig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(OPASIG);
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

	public static class OpbltContext extends ParserRuleContext {
		public TerminalNode OPBLT() { return getToken(EntradaParser.OPBLT, 0); }
		public OpbltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opblt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitOpblt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpbltContext opblt() throws RecognitionException {
		OpbltContext _localctx = new OpbltContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opblt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(OPBLT);
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

	public static class OpbgtContext extends ParserRuleContext {
		public TerminalNode OPBGT() { return getToken(EntradaParser.OPBGT, 0); }
		public OpbgtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbgt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitOpbgt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpbgtContext opbgt() throws RecognitionException {
		OpbgtContext _localctx = new OpbgtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opbgt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(OPBGT);
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(EntradaParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(COMA);
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

	public static class Dos_ptosContext extends ParserRuleContext {
		public TerminalNode KW_DOS_PUNTOS() { return getToken(EntradaParser.KW_DOS_PUNTOS, 0); }
		public Dos_ptosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_ptos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitDos_ptos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dos_ptosContext dos_ptos() throws RecognitionException {
		Dos_ptosContext _localctx = new Dos_ptosContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dos_ptos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(KW_DOS_PUNTOS);
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

	public static class PuntoContext extends ParserRuleContext {
		public TerminalNode PUNTO() { return getToken(EntradaParser.PUNTO, 0); }
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitPunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(PUNTO);
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

	public static class DoblepuntoContext extends ParserRuleContext {
		public TerminalNode DOBLEPUNTO() { return getToken(EntradaParser.DOBLEPUNTO, 0); }
		public DoblepuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doblepunto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitDoblepunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoblepuntoContext doblepunto() throws RecognitionException {
		DoblepuntoContext _localctx = new DoblepuntoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doblepunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(DOBLEPUNTO);
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

	public static class Texto_cadenaContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO_CADENA() { return getTokens(EntradaParser.TEXTO_CADENA); }
		public TerminalNode TEXTO_CADENA(int i) {
			return getToken(EntradaParser.TEXTO_CADENA, i);
		}
		public Texto_cadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto_cadena; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitTexto_cadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Texto_cadenaContext texto_cadena() throws RecognitionException {
		Texto_cadenaContext _localctx = new Texto_cadenaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_texto_cadena);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(328);
					match(TEXTO_CADENA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Cadena_abrirContext extends ParserRuleContext {
		public TerminalNode CADENA_ABRIR() { return getToken(EntradaParser.CADENA_ABRIR, 0); }
		public Cadena_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena_abrir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitCadena_abrir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cadena_abrirContext cadena_abrir() throws RecognitionException {
		Cadena_abrirContext _localctx = new Cadena_abrirContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cadena_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(CADENA_ABRIR);
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

	public static class Cadena_cerrarContext extends ParserRuleContext {
		public TerminalNode CADENA_CERRAR() { return getToken(EntradaParser.CADENA_CERRAR, 0); }
		public Cadena_cerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena_cerrar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitCadena_cerrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cadena_cerrarContext cadena_cerrar() throws RecognitionException {
		Cadena_cerrarContext _localctx = new Cadena_cerrarContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cadena_cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(CADENA_CERRAR);
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

	public static class CadenaContext extends ParserRuleContext {
		public Cadena_abrirContext cadena_abrir() {
			return getRuleContext(Cadena_abrirContext.class,0);
		}
		public Cadena_cerrarContext cadena_cerrar() {
			return getRuleContext(Cadena_cerrarContext.class,0);
		}
		public List<Texto_cadenaContext> texto_cadena() {
			return getRuleContexts(Texto_cadenaContext.class);
		}
		public Texto_cadenaContext texto_cadena(int i) {
			return getRuleContext(Texto_cadenaContext.class,i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			cadena_abrir();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTO_CADENA) {
				{
				{
				setState(338);
				texto_cadena();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			cadena_cerrar();
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

	public static class BbajaContext extends ParserRuleContext {
		public TerminalNode BBAJA() { return getToken(EntradaParser.BBAJA, 0); }
		public BbajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbaja; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitBbaja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BbajaContext bbaja() throws RecognitionException {
		BbajaContext _localctx = new BbajaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bbaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(BBAJA);
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

	public static class Cor_abrirContext extends ParserRuleContext {
		public TerminalNode COR_ABRIR() { return getToken(EntradaParser.COR_ABRIR, 0); }
		public Cor_abrirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_abrir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitCor_abrir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cor_abrirContext cor_abrir() throws RecognitionException {
		Cor_abrirContext _localctx = new Cor_abrirContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cor_abrir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(COR_ABRIR);
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

	public static class Cor_CerrarContext extends ParserRuleContext {
		public TerminalNode COR_CERRAR() { return getToken(EntradaParser.COR_CERRAR, 0); }
		public Cor_CerrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cor_Cerrar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitCor_Cerrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cor_CerrarContext cor_Cerrar() throws RecognitionException {
		Cor_CerrarContext _localctx = new Cor_CerrarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cor_Cerrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(COR_CERRAR);
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

	public static class Kw_jsonContext extends ParserRuleContext {
		public TerminalNode KW_JSON() { return getToken(EntradaParser.KW_JSON, 0); }
		public Kw_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_json; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_jsonContext kw_json() throws RecognitionException {
		Kw_jsonContext _localctx = new Kw_jsonContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kw_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(KW_JSON);
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

	public static class Extension_jsonContext extends ParserRuleContext {
		public TerminalNode EXTENSION_JSON() { return getToken(EntradaParser.EXTENSION_JSON, 0); }
		public Extension_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_json; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitExtension_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_jsonContext extension_json() throws RecognitionException {
		Extension_jsonContext _localctx = new Extension_jsonContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_extension_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(EXTENSION_JSON);
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

	public static class Kw_svgContext extends ParserRuleContext {
		public TerminalNode KW_SVG() { return getToken(EntradaParser.KW_SVG, 0); }
		public Kw_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_svg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_svg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_svgContext kw_svg() throws RecognitionException {
		Kw_svgContext _localctx = new Kw_svgContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kw_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(KW_SVG);
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

	public static class Extension_svgContext extends ParserRuleContext {
		public TerminalNode EXTENSION_SVG() { return getToken(EntradaParser.EXTENSION_SVG, 0); }
		public Extension_svgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_svg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitExtension_svg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_svgContext extension_svg() throws RecognitionException {
		Extension_svgContext _localctx = new Extension_svgContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_extension_svg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(EXTENSION_SVG);
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

	public static class Kw_dotContext extends ParserRuleContext {
		public TerminalNode KW_DOT() { return getToken(EntradaParser.KW_DOT, 0); }
		public Kw_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_dot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_dotContext kw_dot() throws RecognitionException {
		Kw_dotContext _localctx = new Kw_dotContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kw_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(KW_DOT);
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

	public static class Extension_dotContext extends ParserRuleContext {
		public TerminalNode EXTENSION_DOT() { return getToken(EntradaParser.EXTENSION_DOT, 0); }
		public Extension_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_dot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitExtension_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_dotContext extension_dot() throws RecognitionException {
		Extension_dotContext _localctx = new Extension_dotContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_extension_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(EXTENSION_DOT);
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

	public static class Kw_csvContext extends ParserRuleContext {
		public TerminalNode KW_CSV() { return getToken(EntradaParser.KW_CSV, 0); }
		public Kw_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_csv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_csv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_csvContext kw_csv() throws RecognitionException {
		Kw_csvContext _localctx = new Kw_csvContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_kw_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(KW_CSV);
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

	public static class Extension_csvContext extends ParserRuleContext {
		public TerminalNode EXTENSION_CSV() { return getToken(EntradaParser.EXTENSION_CSV, 0); }
		public Extension_csvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_csv; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitExtension_csv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_csvContext extension_csv() throws RecognitionException {
		Extension_csvContext _localctx = new Extension_csvContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_extension_csv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(EXTENSION_CSV);
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

	public static class ParametrosContext extends ParserRuleContext {
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public FontcolorContext fontcolor() {
			return getRuleContext(FontcolorContext.class,0);
		}
		public FontnameContext fontname() {
			return getRuleContext(FontnameContext.class,0);
		}
		public FontsizeContext fontsize() {
			return getRuleContext(FontsizeContext.class,0);
		}
		public ArrowsizeContext arrowsize() {
			return getRuleContext(ArrowsizeContext.class,0);
		}
		public ArrowcolorContext arrowcolor() {
			return getRuleContext(ArrowcolorContext.class,0);
		}
		public PenwidthContext penwidth() {
			return getRuleContext(PenwidthContext.class,0);
		}
		public FillcolorContext fillcolor() {
			return getRuleContext(FillcolorContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				{
				setState(368);
				len();
				}
				break;
			case FONTCOLOR:
				{
				setState(369);
				fontcolor();
				}
				break;
			case FONTNAME:
				{
				setState(370);
				fontname();
				}
				break;
			case FONTSIZE:
				{
				setState(371);
				fontsize();
				}
				break;
			case ARROWSIZE:
				{
				setState(372);
				arrowsize();
				}
				break;
			case ARROWCOLOR:
				{
				setState(373);
				arrowcolor();
				}
				break;
			case PENWIDTH:
				{
				setState(374);
				penwidth();
				}
				break;
			case FILLCOLOR:
				{
				setState(375);
				fillcolor();
				}
				break;
			case STYLE:
				{
				setState(376);
				style();
				}
				break;
			case SHAPE:
				{
				setState(377);
				shape();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LenContext extends ParserRuleContext {
		public Kw_lenContext kw_len() {
			return getRuleContext(Kw_lenContext.class,0);
		}
		public BbajaContext bbaja() {
			return getRuleContext(BbajaContext.class,0);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			kw_len();
			setState(381);
			bbaja();
			setState(382);
			tipo_estruc();
			setState(383);
			asig();
			setState(384);
			numero();
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

	public static class FontcolorContext extends ParserRuleContext {
		public Kw_fontcolorContext kw_fontcolor() {
			return getRuleContext(Kw_fontcolorContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontcolor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitFontcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontcolorContext fontcolor() throws RecognitionException {
		FontcolorContext _localctx = new FontcolorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			kw_fontcolor();
			setState(387);
			bbaja();
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(388);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(389);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(392);
			bbaja();
			setState(393);
			tipo_estruc();
			setState(394);
			asig();
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(395);
				cadena();
				}
				break;
			case IDF:
				{
				setState(396);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FontnameContext extends ParserRuleContext {
		public Kw_fontnameContext kw_fontname() {
			return getRuleContext(Kw_fontnameContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitFontname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontnameContext fontname() throws RecognitionException {
		FontnameContext _localctx = new FontnameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			kw_fontname();
			setState(400);
			bbaja();
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(401);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(402);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(405);
			bbaja();
			setState(406);
			tipo_estruc();
			setState(407);
			asig();
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(408);
				cadena();
				}
				break;
			case IDF:
				{
				setState(409);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FontsizeContext extends ParserRuleContext {
		public Kw_fontsizeContext kw_fontsize() {
			return getRuleContext(Kw_fontsizeContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitFontsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			kw_fontsize();
			setState(413);
			bbaja();
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(414);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(415);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(418);
			bbaja();
			setState(419);
			tipo_estruc();
			setState(420);
			asig();
			setState(421);
			numero();
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

	public static class ArrowsizeContext extends ParserRuleContext {
		public Kw_arrowsizeContext kw_arrowsize() {
			return getRuleContext(Kw_arrowsizeContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public ArrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowsize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitArrowsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowsizeContext arrowsize() throws RecognitionException {
		ArrowsizeContext _localctx = new ArrowsizeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			kw_arrowsize();
			setState(424);
			bbaja();
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(425);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(426);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(429);
			bbaja();
			setState(430);
			tipo_estruc();
			setState(431);
			asig();
			setState(432);
			numero();
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

	public static class ArrowcolorContext extends ParserRuleContext {
		public Kw_arrowcolorContext kw_arrowcolor() {
			return getRuleContext(Kw_arrowcolorContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowcolor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitArrowcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowcolorContext arrowcolor() throws RecognitionException {
		ArrowcolorContext _localctx = new ArrowcolorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			kw_arrowcolor();
			setState(435);
			bbaja();
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(436);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(437);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(440);
			bbaja();
			setState(441);
			tipo_estruc();
			setState(442);
			asig();
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(443);
				cadena();
				}
				break;
			case IDF:
				{
				setState(444);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PenwidthContext extends ParserRuleContext {
		public Kw_penwidthContext kw_penwidth() {
			return getRuleContext(Kw_penwidthContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public PenwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penwidth; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitPenwidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenwidthContext penwidth() throws RecognitionException {
		PenwidthContext _localctx = new PenwidthContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			kw_penwidth();
			setState(448);
			bbaja();
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(449);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(450);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(453);
			bbaja();
			setState(454);
			tipo_estruc();
			setState(455);
			asig();
			setState(456);
			numero();
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

	public static class FillcolorContext extends ParserRuleContext {
		public Kw_fillcolorContext kw_fillcolor() {
			return getRuleContext(Kw_fillcolorContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillcolor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitFillcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillcolorContext fillcolor() throws RecognitionException {
		FillcolorContext _localctx = new FillcolorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			kw_fillcolor();
			setState(459);
			bbaja();
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(460);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(461);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(464);
			bbaja();
			setState(465);
			tipo_estruc();
			setState(466);
			asig();
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(467);
				cadena();
				}
				break;
			case IDF:
				{
				setState(468);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StyleContext extends ParserRuleContext {
		public Kw_styleContext kw_style() {
			return getRuleContext(Kw_styleContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			kw_style();
			setState(472);
			bbaja();
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(473);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(474);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(477);
			bbaja();
			setState(478);
			tipo_estruc();
			setState(479);
			asig();
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(480);
				cadena();
				}
				break;
			case IDF:
				{
				setState(481);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ShapeContext extends ParserRuleContext {
		public Kw_shapeContext kw_shape() {
			return getRuleContext(Kw_shapeContext.class,0);
		}
		public List<BbajaContext> bbaja() {
			return getRuleContexts(BbajaContext.class);
		}
		public BbajaContext bbaja(int i) {
			return getRuleContext(BbajaContext.class,i);
		}
		public Tipo_estrucContext tipo_estruc() {
			return getRuleContext(Tipo_estrucContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Kw_edgeContext kw_edge() {
			return getRuleContext(Kw_edgeContext.class,0);
		}
		public Kw_nodeContext kw_node() {
			return getRuleContext(Kw_nodeContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			kw_shape();
			setState(485);
			bbaja();
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EDGE:
				{
				setState(486);
				kw_edge();
				}
				break;
			case NODE:
				{
				setState(487);
				kw_node();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(490);
			bbaja();
			setState(491);
			tipo_estruc();
			setState(492);
			asig();
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADENA_ABRIR:
				{
				setState(493);
				cadena();
				}
				break;
			case IDF:
				{
				setState(494);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tipo_estrucContext extends ParserRuleContext {
		public Kw_relationshipContext kw_relationship() {
			return getRuleContext(Kw_relationshipContext.class,0);
		}
		public Kw_classContext kw_class() {
			return getRuleContext(Kw_classContext.class,0);
		}
		public Kw_inheritanceContext kw_inheritance() {
			return getRuleContext(Kw_inheritanceContext.class,0);
		}
		public Kw_inderect_useContext kw_inderect_use() {
			return getRuleContext(Kw_inderect_useContext.class,0);
		}
		public Tipo_estrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estruc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitTipo_estruc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estrucContext tipo_estruc() throws RecognitionException {
		Tipo_estrucContext _localctx = new Tipo_estrucContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tipo_estruc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATIONSHIP:
				{
				setState(497);
				kw_relationship();
				}
				break;
			case CLASS:
				{
				setState(498);
				kw_class();
				}
				break;
			case INHERITANCE:
				{
				setState(499);
				kw_inheritance();
				}
				break;
			case INDERECT_USE:
				{
				setState(500);
				kw_inderect_use();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Kw_edgeContext extends ParserRuleContext {
		public TerminalNode EDGE() { return getToken(EntradaParser.EDGE, 0); }
		public Kw_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_edge; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_edge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_edgeContext kw_edge() throws RecognitionException {
		Kw_edgeContext _localctx = new Kw_edgeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_kw_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(EDGE);
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

	public static class Kw_nodeContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(EntradaParser.NODE, 0); }
		public Kw_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_node; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_node(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_nodeContext kw_node() throws RecognitionException {
		Kw_nodeContext _localctx = new Kw_nodeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_kw_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(NODE);
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

	public static class Kw_relationshipContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(EntradaParser.RELATIONSHIP, 0); }
		public Kw_relationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_relationship; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_relationship(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_relationshipContext kw_relationship() throws RecognitionException {
		Kw_relationshipContext _localctx = new Kw_relationshipContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_kw_relationship);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(RELATIONSHIP);
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

	public static class Kw_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(EntradaParser.CLASS, 0); }
		public Kw_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_class; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_classContext kw_class() throws RecognitionException {
		Kw_classContext _localctx = new Kw_classContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_kw_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(CLASS);
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

	public static class Kw_propertyContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(EntradaParser.PROPERTY, 0); }
		public Kw_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_property; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_propertyContext kw_property() throws RecognitionException {
		Kw_propertyContext _localctx = new Kw_propertyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_kw_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(PROPERTY);
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

	public static class Kw_inheritanceContext extends ParserRuleContext {
		public TerminalNode INHERITANCE() { return getToken(EntradaParser.INHERITANCE, 0); }
		public Kw_inheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inheritance; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_inheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_inheritanceContext kw_inheritance() throws RecognitionException {
		Kw_inheritanceContext _localctx = new Kw_inheritanceContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_kw_inheritance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(INHERITANCE);
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

	public static class Kw_inderect_useContext extends ParserRuleContext {
		public TerminalNode INDERECT_USE() { return getToken(EntradaParser.INDERECT_USE, 0); }
		public Kw_inderect_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_inderect_use; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_inderect_use(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_inderect_useContext kw_inderect_use() throws RecognitionException {
		Kw_inderect_useContext _localctx = new Kw_inderect_useContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_kw_inderect_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(INDERECT_USE);
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

	public static class Kw_lenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(EntradaParser.LEN, 0); }
		public Kw_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_len; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_lenContext kw_len() throws RecognitionException {
		Kw_lenContext _localctx = new Kw_lenContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_kw_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(LEN);
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

	public static class Kw_fontcolorContext extends ParserRuleContext {
		public TerminalNode FONTCOLOR() { return getToken(EntradaParser.FONTCOLOR, 0); }
		public Kw_fontcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontcolor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_fontcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_fontcolorContext kw_fontcolor() throws RecognitionException {
		Kw_fontcolorContext _localctx = new Kw_fontcolorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_kw_fontcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(FONTCOLOR);
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

	public static class Kw_fontnameContext extends ParserRuleContext {
		public TerminalNode FONTNAME() { return getToken(EntradaParser.FONTNAME, 0); }
		public Kw_fontnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_fontname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_fontnameContext kw_fontname() throws RecognitionException {
		Kw_fontnameContext _localctx = new Kw_fontnameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_kw_fontname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(FONTNAME);
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

	public static class Kw_fontsizeContext extends ParserRuleContext {
		public TerminalNode FONTSIZE() { return getToken(EntradaParser.FONTSIZE, 0); }
		public Kw_fontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fontsize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_fontsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_fontsizeContext kw_fontsize() throws RecognitionException {
		Kw_fontsizeContext _localctx = new Kw_fontsizeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_kw_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(FONTSIZE);
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

	public static class Kw_arrowsizeContext extends ParserRuleContext {
		public TerminalNode ARROWSIZE() { return getToken(EntradaParser.ARROWSIZE, 0); }
		public Kw_arrowsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_arrowsize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_arrowsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_arrowsizeContext kw_arrowsize() throws RecognitionException {
		Kw_arrowsizeContext _localctx = new Kw_arrowsizeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_kw_arrowsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(ARROWSIZE);
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

	public static class Kw_arrowcolorContext extends ParserRuleContext {
		public TerminalNode ARROWCOLOR() { return getToken(EntradaParser.ARROWCOLOR, 0); }
		public Kw_arrowcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_arrowcolor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_arrowcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_arrowcolorContext kw_arrowcolor() throws RecognitionException {
		Kw_arrowcolorContext _localctx = new Kw_arrowcolorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_kw_arrowcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(ARROWCOLOR);
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

	public static class Kw_penwidthContext extends ParserRuleContext {
		public TerminalNode PENWIDTH() { return getToken(EntradaParser.PENWIDTH, 0); }
		public Kw_penwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_penwidth; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_penwidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_penwidthContext kw_penwidth() throws RecognitionException {
		Kw_penwidthContext _localctx = new Kw_penwidthContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_kw_penwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(PENWIDTH);
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

	public static class Kw_fillcolorContext extends ParserRuleContext {
		public TerminalNode FILLCOLOR() { return getToken(EntradaParser.FILLCOLOR, 0); }
		public Kw_fillcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_fillcolor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_fillcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_fillcolorContext kw_fillcolor() throws RecognitionException {
		Kw_fillcolorContext _localctx = new Kw_fillcolorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_kw_fillcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(FILLCOLOR);
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

	public static class Kw_styleContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(EntradaParser.STYLE, 0); }
		public Kw_styleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_style; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_style(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_styleContext kw_style() throws RecognitionException {
		Kw_styleContext _localctx = new Kw_styleContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_kw_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(STYLE);
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

	public static class Kw_shapeContext extends ParserRuleContext {
		public TerminalNode SHAPE() { return getToken(EntradaParser.SHAPE, 0); }
		public Kw_shapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_shape; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EntradaParserVisitor ) return ((EntradaParserVisitor<? extends T>)visitor).visitKw_shape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kw_shapeContext kw_shape() throws RecognitionException {
		Kw_shapeContext _localctx = new Kw_shapeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_kw_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(SHAPE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u021c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\7\2\u0099\n\2\f\2\16\2\u009c\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3\u00a4\n\3\f\3\16\3\u00a7\13\3\3\3\3\3\3\3\7\3\u00ac"+
		"\n\3\f\3\16\3\u00af\13\3\3\3\5\3\u00b2\n\3\3\4\6\4\u00b5\n\4\r\4\16\4"+
		"\u00b6\3\5\6\5\u00ba\n\5\r\5\16\5\u00bb\3\6\6\6\u00bf\n\6\r\6\16\6\u00c0"+
		"\3\7\6\7\u00c4\n\7\r\7\16\7\u00c5\3\b\3\b\3\b\3\b\5\b\u00cc\n\b\3\b\3"+
		"\b\7\b\u00d0\n\b\f\b\16\b\u00d3\13\b\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n"+
		"\3\n\7\n\u00dd\n\n\f\n\16\n\u00e0\13\n\3\n\3\n\7\n\u00e4\n\n\f\n\16\n"+
		"\u00e7\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\u00f0\n\13\f\13\16\13\u00f3"+
		"\13\13\3\13\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\7\f\u0103\n\f\f\f\16\f\u0106\13\f\3\f\3\f\7\f\u010a"+
		"\n\f\f\f\16\f\u010d\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u0116\n\r\f\r"+
		"\16\r\u0119\13\r\3\r\3\r\7\r\u011d\n\r\f\r\16\r\u0120\13\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\5\16\u0129\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u014c"+
		"\n\37\r\37\16\37\u014d\3 \3 \3!\3!\3\"\3\"\7\"\u0156\n\"\f\"\16\"\u0159"+
		"\13\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u017d\n.\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\5\60\u0189\n\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u0190\n\60\3\61\3\61\3\61\3\61\5\61\u0196\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u019d\n\61\3\62\3\62\3\62\3\62\5\62\u01a3\n\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u01ae\n\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\5\64\u01b9\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u01c0"+
		"\n\64\3\65\3\65\3\65\3\65\5\65\u01c6\n\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\5\66\u01d1\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u01d8\n"+
		"\66\3\67\3\67\3\67\3\67\5\67\u01de\n\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u01e5\n\67\38\38\38\38\58\u01eb\n8\38\38\38\38\38\58\u01f2\n8\39\39\3"+
		"9\39\59\u01f8\n9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\2\2K\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\2\3\4\2\64\6499\2\u0210\2\u009a\3\2\2\2\4\u00b1\3\2\2\2\6\u00b4"+
		"\3\2\2\2\b\u00b9\3\2\2\2\n\u00be\3\2\2\2\f\u00c3\3\2\2\2\16\u00d1\3\2"+
		"\2\2\20\u00d8\3\2\2\2\22\u00da\3\2\2\2\24\u00ed\3\2\2\2\26\u0100\3\2\2"+
		"\2\30\u0113\3\2\2\2\32\u0128\3\2\2\2\34\u012a\3\2\2\2\36\u012c\3\2\2\2"+
		" \u012e\3\2\2\2\"\u0130\3\2\2\2$\u0132\3\2\2\2&\u0134\3\2\2\2(\u0136\3"+
		"\2\2\2*\u0138\3\2\2\2,\u013a\3\2\2\2.\u013c\3\2\2\2\60\u013e\3\2\2\2\62"+
		"\u0140\3\2\2\2\64\u0142\3\2\2\2\66\u0144\3\2\2\28\u0146\3\2\2\2:\u0148"+
		"\3\2\2\2<\u014b\3\2\2\2>\u014f\3\2\2\2@\u0151\3\2\2\2B\u0153\3\2\2\2D"+
		"\u015c\3\2\2\2F\u015e\3\2\2\2H\u0160\3\2\2\2J\u0162\3\2\2\2L\u0164\3\2"+
		"\2\2N\u0166\3\2\2\2P\u0168\3\2\2\2R\u016a\3\2\2\2T\u016c\3\2\2\2V\u016e"+
		"\3\2\2\2X\u0170\3\2\2\2Z\u017c\3\2\2\2\\\u017e\3\2\2\2^\u0184\3\2\2\2"+
		"`\u0191\3\2\2\2b\u019e\3\2\2\2d\u01a9\3\2\2\2f\u01b4\3\2\2\2h\u01c1\3"+
		"\2\2\2j\u01cc\3\2\2\2l\u01d9\3\2\2\2n\u01e6\3\2\2\2p\u01f7\3\2\2\2r\u01f9"+
		"\3\2\2\2t\u01fb\3\2\2\2v\u01fd\3\2\2\2x\u01ff\3\2\2\2z\u0201\3\2\2\2|"+
		"\u0203\3\2\2\2~\u0205\3\2\2\2\u0080\u0207\3\2\2\2\u0082\u0209\3\2\2\2"+
		"\u0084\u020b\3\2\2\2\u0086\u020d\3\2\2\2\u0088\u020f\3\2\2\2\u008a\u0211"+
		"\3\2\2\2\u008c\u0213\3\2\2\2\u008e\u0215\3\2\2\2\u0090\u0217\3\2\2\2\u0092"+
		"\u0219\3\2\2\2\u0094\u0099\5\20\t\2\u0095\u0099\5\4\3\2\u0096\u0099\5"+
		"\32\16\2\u0097\u0099\5Z.\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\3\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a5"+
		"\7\3\2\2\u009e\u00a4\5\f\7\2\u009f\u00a4\5\6\4\2\u00a0\u00a4\5\b\5\2\u00a1"+
		"\u00a4\5\n\6\2\u00a2\u00a4\7\13\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3"+
		"\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b2\7\63\2\2\u00a9\u00ad\7\4\2\2\u00aa"+
		"\u00ac\5\f\7\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b2\78\2\2\u00b1\u009d\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b2\5\3\2\2\2"+
		"\u00b3\u00b5\7\65\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\7\3\2\2\2\u00b8\u00ba\7\66\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\t\3\2\2\2\u00bd\u00bf\7\67\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\13\3\2\2\2\u00c2"+
		"\u00c4\t\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\r\3\2\2\2\u00c7\u00d0\5:\36\2\u00c8\u00d0"+
		"\58\35\2\u00c9\u00cb\5\"\22\2\u00ca\u00cc\5\66\34\2\u00cb\u00ca\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00d0\5&\24\2\u00ce\u00d0"+
		"\5\36\20\2\u00cf\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\17\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d9\5\22\n\2\u00d5\u00d9\5\24\13\2\u00d6\u00d9\5\26\f\2\u00d7\u00d9"+
		"\5\30\r\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9\21\3\2\2\2\u00da\u00de\5J&\2\u00db\u00dd\5"+
		"\32\16\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\5,"+
		"\27\2\u00e2\u00e4\5\32\16\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e9\5\16\b\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\58\35\2\u00eb"+
		"\u00ec\5L\'\2\u00ec\23\3\2\2\2\u00ed\u00f1\5N(\2\u00ee\u00f0\5\32\16\2"+
		"\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\5,\27\2\u00f5"+
		"\u00f7\5\32\16\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\5\16\b\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\58\35\2\u00fe\u00ff\5"+
		"P)\2\u00ff\25\3\2\2\2\u0100\u0104\5R*\2\u0101\u0103\5\32\16\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010b\5,\27\2\u0108\u010a\5\32"+
		"\16\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5\16"+
		"\b\2\u010f\u0110\5&\24\2\u0110\u0111\58\35\2\u0111\u0112\5T+\2\u0112\27"+
		"\3\2\2\2\u0113\u0117\5V,\2\u0114\u0116\5\32\16\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011e\5,\27\2\u011b\u011d\5\32\16\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5\16\b\2\u0122"+
		"\u0123\5&\24\2\u0123\u0124\58\35\2\u0124\u0125\5X-\2\u0125\31\3\2\2\2"+
		"\u0126\u0129\5\34\17\2\u0127\u0129\5 \21\2\u0128\u0126\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\33\3\2\2\2\u012a\u012b\7\27\2\2\u012b\35\3\2\2\2\u012c"+
		"\u012d\7\30\2\2\u012d\37\3\2\2\2\u012e\u012f\7\13\2\2\u012f!\3\2\2\2\u0130"+
		"\u0131\7\7\2\2\u0131#\3\2\2\2\u0132\u0133\7\6\2\2\u0133%\3\2\2\2\u0134"+
		"\u0135\7\62\2\2\u0135\'\3\2\2\2\u0136\u0137\7\16\2\2\u0137)\3\2\2\2\u0138"+
		"\u0139\7\17\2\2\u0139+\3\2\2\2\u013a\u013b\7\20\2\2\u013b-\3\2\2\2\u013c"+
		"\u013d\7\21\2\2\u013d/\3\2\2\2\u013e\u013f\7\f\2\2\u013f\61\3\2\2\2\u0140"+
		"\u0141\7\r\2\2\u0141\63\3\2\2\2\u0142\u0143\7\b\2\2\u0143\65\3\2\2\2\u0144"+
		"\u0145\7\25\2\2\u0145\67\3\2\2\2\u0146\u0147\7\n\2\2\u01479\3\2\2\2\u0148"+
		"\u0149\7\t\2\2\u0149;\3\2\2\2\u014a\u014c\7;\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e=\3\2\2\2"+
		"\u014f\u0150\7\5\2\2\u0150?\3\2\2\2\u0151\u0152\7:\2\2\u0152A\3\2\2\2"+
		"\u0153\u0157\5> \2\u0154\u0156\5<\37\2\u0155\u0154\3\2\2\2\u0156\u0159"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015b\5@!\2\u015bC\3\2\2\2\u015c\u015d\7\22\2\2\u015d"+
		"E\3\2\2\2\u015e\u015f\7\23\2\2\u015fG\3\2\2\2\u0160\u0161\7\24\2\2\u0161"+
		"I\3\2\2\2\u0162\u0163\7\31\2\2\u0163K\3\2\2\2\u0164\u0165\7\'\2\2\u0165"+
		"M\3\2\2\2\u0166\u0167\7\33\2\2\u0167O\3\2\2\2\u0168\u0169\7(\2\2\u0169"+
		"Q\3\2\2\2\u016a\u016b\7\32\2\2\u016bS\3\2\2\2\u016c\u016d\7)\2\2\u016d"+
		"U\3\2\2\2\u016e\u016f\7\34\2\2\u016fW\3\2\2\2\u0170\u0171\7*\2\2\u0171"+
		"Y\3\2\2\2\u0172\u017d\5\\/\2\u0173\u017d\5^\60\2\u0174\u017d\5`\61\2\u0175"+
		"\u017d\5b\62\2\u0176\u017d\5d\63\2\u0177\u017d\5f\64\2\u0178\u017d\5h"+
		"\65\2\u0179\u017d\5j\66\2\u017a\u017d\5l\67\2\u017b\u017d\5n8\2\u017c"+
		"\u0172\3\2\2\2\u017c\u0173\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u0175\3\2"+
		"\2\2\u017c\u0176\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u0178\3\2\2\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d[\3\2\2\2"+
		"\u017e\u017f\5\u0080A\2\u017f\u0180\5D#\2\u0180\u0181\5p9\2\u0181\u0182"+
		"\5,\27\2\u0182\u0183\5$\23\2\u0183]\3\2\2\2\u0184\u0185\5\u0082B\2\u0185"+
		"\u0188\5D#\2\u0186\u0189\5r:\2\u0187\u0189\5t;\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5D#\2\u018b\u018c\5p9\2"+
		"\u018c\u018f\5,\27\2\u018d\u0190\5B\"\2\u018e\u0190\5&\24\2\u018f\u018d"+
		"\3\2\2\2\u018f\u018e\3\2\2\2\u0190_\3\2\2\2\u0191\u0192\5\u0084C\2\u0192"+
		"\u0195\5D#\2\u0193\u0196\5r:\2\u0194\u0196\5t;\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\5D#\2\u0198\u0199\5p9\2"+
		"\u0199\u019c\5,\27\2\u019a\u019d\5B\"\2\u019b\u019d\5&\24\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019da\3\2\2\2\u019e\u019f\5\u0086D\2\u019f"+
		"\u01a2\5D#\2\u01a0\u01a3\5r:\2\u01a1\u01a3\5t;\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5D#\2\u01a5\u01a6\5p9\2"+
		"\u01a6\u01a7\5,\27\2\u01a7\u01a8\5$\23\2\u01a8c\3\2\2\2\u01a9\u01aa\5"+
		"\u0088E\2\u01aa\u01ad\5D#\2\u01ab\u01ae\5r:\2\u01ac\u01ae\5t;\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\5D"+
		"#\2\u01b0\u01b1\5p9\2\u01b1\u01b2\5,\27\2\u01b2\u01b3\5$\23\2\u01b3e\3"+
		"\2\2\2\u01b4\u01b5\5\u008aF\2\u01b5\u01b8\5D#\2\u01b6\u01b9\5r:\2\u01b7"+
		"\u01b9\5t;\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2"+
		"\2\u01ba\u01bb\5D#\2\u01bb\u01bc\5p9\2\u01bc\u01bf\5,\27\2\u01bd\u01c0"+
		"\5B\"\2\u01be\u01c0\5&\24\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"g\3\2\2\2\u01c1\u01c2\5\u008cG\2\u01c2\u01c5\5D#\2\u01c3\u01c6\5r:\2\u01c4"+
		"\u01c6\5t;\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2"+
		"\2\u01c7\u01c8\5D#\2\u01c8\u01c9\5p9\2\u01c9\u01ca\5,\27\2\u01ca\u01cb"+
		"\5$\23\2\u01cbi\3\2\2\2\u01cc\u01cd\5\u008eH\2\u01cd\u01d0\5D#\2\u01ce"+
		"\u01d1\5r:\2\u01cf\u01d1\5t;\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2"+
		"\u01d1\u01d2\3\2\2\2\u01d2\u01d3\5D#\2\u01d3\u01d4\5p9\2\u01d4\u01d7\5"+
		",\27\2\u01d5\u01d8\5B\"\2\u01d6\u01d8\5&\24\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8k\3\2\2\2\u01d9\u01da\5\u0090I\2\u01da\u01dd\5D#\2"+
		"\u01db\u01de\5r:\2\u01dc\u01de\5t;\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3"+
		"\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\5D#\2\u01e0\u01e1\5p9\2\u01e1\u01e4"+
		"\5,\27\2\u01e2\u01e5\5B\"\2\u01e3\u01e5\5&\24\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e3\3\2\2\2\u01e5m\3\2\2\2\u01e6\u01e7\5\u0092J\2\u01e7\u01ea\5D#\2"+
		"\u01e8\u01eb\5r:\2\u01e9\u01eb\5t;\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3"+
		"\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\5D#\2\u01ed\u01ee\5p9\2\u01ee\u01f1"+
		"\5,\27\2\u01ef\u01f2\5B\"\2\u01f0\u01f2\5&\24\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2o\3\2\2\2\u01f3\u01f8\5v<\2\u01f4\u01f8\5x=\2\u01f5"+
		"\u01f8\5|?\2\u01f6\u01f8\5~@\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8q\3\2\2\2\u01f9\u01fa\7"+
		"+\2\2\u01fas\3\2\2\2\u01fb\u01fc\7,\2\2\u01fcu\3\2\2\2\u01fd\u01fe\7-"+
		"\2\2\u01few\3\2\2\2\u01ff\u0200\7.\2\2\u0200y\3\2\2\2\u0201\u0202\7/\2"+
		"\2\u0202{\3\2\2\2\u0203\u0204\7\60\2\2\u0204}\3\2\2\2\u0205\u0206\7\61"+
		"\2\2\u0206\177\3\2\2\2\u0207\u0208\7\35\2\2\u0208\u0081\3\2\2\2\u0209"+
		"\u020a\7\36\2\2\u020a\u0083\3\2\2\2\u020b\u020c\7\37\2\2\u020c\u0085\3"+
		"\2\2\2\u020d\u020e\7 \2\2\u020e\u0087\3\2\2\2\u020f\u0210\7!\2\2\u0210"+
		"\u0089\3\2\2\2\u0211\u0212\7\"\2\2\u0212\u008b\3\2\2\2\u0213\u0214\7#"+
		"\2\2\u0214\u008d\3\2\2\2\u0215\u0216\7$\2\2\u0216\u008f\3\2\2\2\u0217"+
		"\u0218\7%\2\2\u0218\u0091\3\2\2\2\u0219\u021a\7&\2\2\u021a\u0093\3\2\2"+
		"\2,\u0098\u009a\u00a3\u00a5\u00ad\u00b1\u00b6\u00bb\u00c0\u00c5\u00cb"+
		"\u00cf\u00d1\u00d8\u00de\u00e5\u00f1\u00f8\u0104\u010b\u0117\u011e\u0128"+
		"\u014d\u0157\u017c\u0188\u018f\u0195\u019c\u01a2\u01ad\u01b8\u01bf\u01c5"+
		"\u01d0\u01d7\u01dd\u01e4\u01ea\u01f1\u01f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}