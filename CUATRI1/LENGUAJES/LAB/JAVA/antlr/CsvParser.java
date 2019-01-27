package antlr;

// Generated from CsvParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, INTRO=2, BARRA=3, JSON_EXTENSION=4, DOT_EXTENSION=5, SVG_EXTENSION=6, 
		FILE=7, COMILLAS=8;
	public static final int
		RULE_init = 0, RULE_info = 1, RULE_row = 2, RULE_dir = 3, RULE_json_file = 4, 
		RULE_svg_file = 5, RULE_dot_file = 6, RULE_coma = 7, RULE_end = 8, RULE_filename = 9, 
		RULE_json_extension = 10, RULE_svg_extension = 11, RULE_dot_extension = 12, 
		RULE_nombre = 13, RULE_rutafichero = 14, RULE_rutaficherosalida = 15, 
		RULE_rutaficherografico = 16;
	public static final String[] ruleNames = {
		"init", "info", "row", "dir", "json_file", "svg_file", "dot_file", "coma", 
		"end", "filename", "json_extension", "svg_extension", "dot_extension", 
		"nombre", "rutafichero", "rutaficherosalida", "rutaficherografico"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, "'.json'", "'.dot'", "'.svg'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMA", "INTRO", "BARRA", "JSON_EXTENSION", "DOT_EXTENSION", "SVG_EXTENSION", 
		"FILE", "COMILLAS"
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
	public String getGrammarFileName() { return "CsvParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitInit(this);
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
			setState(34);
			info();
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				row();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA || _la==FILE );
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

	public static class InfoContext extends ParserRuleContext {
		public List<DirContext> dir() {
			return getRuleContexts(DirContext.class);
		}
		public DirContext dir(int i) {
			return getRuleContext(DirContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			dir();
			setState(41);
			coma();
			setState(42);
			dir();
			setState(43);
			coma();
			setState(44);
			dir();
			setState(45);
			coma();
			setState(46);
			dir();
			setState(47);
			end();
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

	public static class RowContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public RutaficheroContext rutafichero() {
			return getRuleContext(RutaficheroContext.class,0);
		}
		public RutaficherosalidaContext rutaficherosalida() {
			return getRuleContext(RutaficherosalidaContext.class,0);
		}
		public RutaficherograficoContext rutaficherografico() {
			return getRuleContext(RutaficherograficoContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			nombre();
			setState(50);
			rutafichero();
			setState(51);
			rutaficherosalida();
			setState(52);
			rutaficherografico();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTRO) {
				{
				setState(53);
				end();
				}
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

	public static class DirContext extends ParserRuleContext {
		public List<TerminalNode> FILE() { return getTokens(CsvParser.FILE); }
		public TerminalNode FILE(int i) {
			return getToken(CsvParser.FILE, i);
		}
		public List<TerminalNode> BARRA() { return getTokens(CsvParser.BARRA); }
		public TerminalNode BARRA(int i) {
			return getToken(CsvParser.BARRA, i);
		}
		public DirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirContext dir() throws RecognitionException {
		DirContext _localctx = new DirContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dir);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					match(FILE);
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BARRA) {
						{
						setState(57);
						match(BARRA);
						}
					}

					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Json_fileContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Json_extensionContext json_extension() {
			return getRuleContext(Json_extensionContext.class,0);
		}
		public Json_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitJson_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_fileContext json_file() throws RecognitionException {
		Json_fileContext _localctx = new Json_fileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_json_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(65);
				filename();
				setState(66);
				json_extension();
				}
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

	public static class Svg_fileContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Svg_extensionContext svg_extension() {
			return getRuleContext(Svg_extensionContext.class,0);
		}
		public Svg_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitSvg_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Svg_fileContext svg_file() throws RecognitionException {
		Svg_fileContext _localctx = new Svg_fileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_svg_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(70);
				filename();
				setState(71);
				svg_extension();
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

	public static class Dot_fileContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Dot_extensionContext dot_extension() {
			return getRuleContext(Dot_extensionContext.class,0);
		}
		public Dot_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitDot_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_fileContext dot_file() throws RecognitionException {
		Dot_fileContext _localctx = new Dot_fileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dot_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(75);
				filename();
				setState(76);
				dot_extension();
				}
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(CsvParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode INTRO() { return getToken(CsvParser.INTRO, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(CsvParser.FILE, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FILE);
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

	public static class Json_extensionContext extends ParserRuleContext {
		public TerminalNode JSON_EXTENSION() { return getToken(CsvParser.JSON_EXTENSION, 0); }
		public Json_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_extension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitJson_extension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_extensionContext json_extension() throws RecognitionException {
		Json_extensionContext _localctx = new Json_extensionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_json_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSON_EXTENSION) {
				{
				setState(86);
				match(JSON_EXTENSION);
				}
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

	public static class Svg_extensionContext extends ParserRuleContext {
		public TerminalNode SVG_EXTENSION() { return getToken(CsvParser.SVG_EXTENSION, 0); }
		public Svg_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svg_extension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitSvg_extension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Svg_extensionContext svg_extension() throws RecognitionException {
		Svg_extensionContext _localctx = new Svg_extensionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_svg_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SVG_EXTENSION) {
				{
				setState(89);
				match(SVG_EXTENSION);
				}
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

	public static class Dot_extensionContext extends ParserRuleContext {
		public TerminalNode DOT_EXTENSION() { return getToken(CsvParser.DOT_EXTENSION, 0); }
		public Dot_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_extension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitDot_extension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_extensionContext dot_extension() throws RecognitionException {
		Dot_extensionContext _localctx = new Dot_extensionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dot_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_EXTENSION) {
				{
				setState(92);
				match(DOT_EXTENSION);
				}
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

	public static class NombreContext extends ParserRuleContext {
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			dir();
			setState(96);
			coma();
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
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public Json_fileContext json_file() {
			return getRuleContext(Json_fileContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public RutaficheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutafichero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitRutafichero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaficheroContext rutafichero() throws RecognitionException {
		RutaficheroContext _localctx = new RutaficheroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rutafichero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			dir();
			setState(99);
			json_file();
			setState(100);
			coma();
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

	public static class RutaficherosalidaContext extends ParserRuleContext {
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public Dot_fileContext dot_file() {
			return getRuleContext(Dot_fileContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public RutaficherosalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaficherosalida; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitRutaficherosalida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaficherosalidaContext rutaficherosalida() throws RecognitionException {
		RutaficherosalidaContext _localctx = new RutaficherosalidaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rutaficherosalida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			dir();
			setState(103);
			dot_file();
			setState(104);
			coma();
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

	public static class RutaficherograficoContext extends ParserRuleContext {
		public DirContext dir() {
			return getRuleContext(DirContext.class,0);
		}
		public Svg_fileContext svg_file() {
			return getRuleContext(Svg_fileContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public RutaficherograficoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaficherografico; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsvParserVisitor ) return ((CsvParserVisitor<? extends T>)visitor).visitRutaficherografico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaficherograficoContext rutaficherografico() throws RecognitionException {
		RutaficherograficoContext _localctx = new RutaficherograficoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rutaficherografico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			dir();
			setState(107);
			svg_file();
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(108);
				coma();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\nr\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\49\n\4\3\5\3\5\5\5=\n\5\7\5?\n\5\f\5\16\5B\13\5\3\6\3\6\3\6"+
		"\5\6G\n\6\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\5\fZ\n\f\3\r\5\r]\n\r\3\16\5\16`\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22p\n\22\3\22\2\2"+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2k\2$\3\2\2\2\4*\3\2"+
		"\2\2\6\63\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\fK\3\2\2\2\16P\3\2\2\2\20R\3\2"+
		"\2\2\22T\3\2\2\2\24V\3\2\2\2\26Y\3\2\2\2\30\\\3\2\2\2\32_\3\2\2\2\34a"+
		"\3\2\2\2\36d\3\2\2\2 h\3\2\2\2\"l\3\2\2\2$&\5\4\3\2%\'\5\6\4\2&%\3\2\2"+
		"\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*+\5\b\5\2+,\5\20\t\2,-\5"+
		"\b\5\2-.\5\20\t\2./\5\b\5\2/\60\5\20\t\2\60\61\5\b\5\2\61\62\5\22\n\2"+
		"\62\5\3\2\2\2\63\64\5\34\17\2\64\65\5\36\20\2\65\66\5 \21\2\668\5\"\22"+
		"\2\679\5\22\n\28\67\3\2\2\289\3\2\2\29\7\3\2\2\2:<\7\t\2\2;=\7\5\2\2<"+
		";\3\2\2\2<=\3\2\2\2=?\3\2\2\2>:\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"A\t\3\2\2\2B@\3\2\2\2CD\5\24\13\2DE\5\26\f\2EG\3\2\2\2FC\3\2\2\2FG\3\2"+
		"\2\2G\13\3\2\2\2HI\5\24\13\2IJ\5\30\r\2JL\3\2\2\2KH\3\2\2\2KL\3\2\2\2"+
		"L\r\3\2\2\2MN\5\24\13\2NO\5\32\16\2OQ\3\2\2\2PM\3\2\2\2PQ\3\2\2\2Q\17"+
		"\3\2\2\2RS\7\3\2\2S\21\3\2\2\2TU\7\4\2\2U\23\3\2\2\2VW\7\t\2\2W\25\3\2"+
		"\2\2XZ\7\6\2\2YX\3\2\2\2YZ\3\2\2\2Z\27\3\2\2\2[]\7\b\2\2\\[\3\2\2\2\\"+
		"]\3\2\2\2]\31\3\2\2\2^`\7\7\2\2_^\3\2\2\2_`\3\2\2\2`\33\3\2\2\2ab\5\b"+
		"\5\2bc\5\20\t\2c\35\3\2\2\2de\5\b\5\2ef\5\n\6\2fg\5\20\t\2g\37\3\2\2\2"+
		"hi\5\b\5\2ij\5\16\b\2jk\5\20\t\2k!\3\2\2\2lm\5\b\5\2mo\5\f\7\2np\5\20"+
		"\t\2on\3\2\2\2op\3\2\2\2p#\3\2\2\2\r(8<@FKPY\\_o";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}