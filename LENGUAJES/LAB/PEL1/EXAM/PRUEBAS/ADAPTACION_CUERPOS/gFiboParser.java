// Generated from gFiboParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gFiboParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INFORMATION_START=1, COMMENT_BLOCK_START=2, COMMENT_LINE_START=3, INCLUDE_START=4, 
		ASSIGN=5, END=6, RETURN_TYPE=7, RETURN=8, DECLARATION=9, BODY_START=10, 
		BODY_END=11, INTEGER=12, STRING=13, VOID=14, WHILE=15, IF=16, COS=17, 
		SEN=18, TAN=19, POW=20, SQRT=21, MUL=22, DIV=23, ADD=24, SUB=25, OR=26, 
		AND=27, OR_B=28, AND_B=29, MIN=30, MAX=31, MINEQ=32, MAXEQ=33, EQ=34, 
		NEQ=35, ARGUMENT_START=36, ARGUMENT_END=37, SEPARATOR=38, INT=39, FLOAT=40, 
		VAR=41, WS=42, STR_START=43, COMMENT_BLOCK_END=44, TXT_MULTILINE=45, INFORMATION_END=46, 
		TAG_START=47, TXT_INFORMATION=48, COMMENT_LINE_END=49, TXT_LINE=50, TAG_END=51, 
		TAG_ID=52, TAG_LIMIT=53, TXT_TAG=54, STR_END=55, ESC=56, STR_VAR=57, STR_TXT=58;
	public static final int
		RULE_init = 0, RULE_information = 1, RULE_tag_name = 2, RULE_tag_content = 3, 
		RULE_tag_start = 4, RULE_tag_end = 5, RULE_comment = 6, RULE_comment_block_start = 7, 
		RULE_comment_block_end = 8, RULE_information_start = 9, RULE_information_end = 10, 
		RULE_comment_line_start = 11, RULE_txt = 12, RULE_prog = 13, RULE_mem = 14, 
		RULE_end_exp = 15, RULE_exp = 16, RULE_mathL1 = 17, RULE_mathL2 = 18, 
		RULE_mathL3 = 19, RULE_logicL1 = 20, RULE_logicL2 = 21, RULE_logicL3 = 22, 
		RULE_trig = 23, RULE_include = 24, RULE_include_start = 25, RULE_library = 26, 
		RULE_assigment = 27, RULE_declaration = 28, RULE_assigment_declaration = 29, 
		RULE_var_type = 30, RULE_var_name = 31, RULE_lieteral = 32, RULE_number = 33, 
		RULE_str = 34, RULE_str_start = 35, RULE_str_end = 36, RULE_str_txt = 37, 
		RULE_esc = 38, RULE_str_var = 39, RULE_function_call = 40, RULE_function_name = 41, 
		RULE_system_function = 42, RULE_system_header = 43, RULE_system_body = 44, 
		RULE_system_function_name = 45, RULE_custom_function = 46, RULE_custom_header = 47, 
		RULE_custom_body = 48, RULE_custom_function_name = 49, RULE_parameter = 50, 
		RULE_dev = 51, RULE_separator = 52, RULE_return_type = 53, RULE_return_word = 54, 
		RULE_function_declaration = 55, RULE_argument_start = 56, RULE_argument_end = 57, 
		RULE_body_start = 58, RULE_body_end = 59, RULE_assign = 60, RULE_trash = 61;
	public static final String[] ruleNames = {
		"init", "information", "tag_name", "tag_content", "tag_start", "tag_end", 
		"comment", "comment_block_start", "comment_block_end", "information_start", 
		"information_end", "comment_line_start", "txt", "prog", "mem", "end_exp", 
		"exp", "mathL1", "mathL2", "mathL3", "logicL1", "logicL2", "logicL3", 
		"trig", "include", "include_start", "library", "assigment", "declaration", 
		"assigment_declaration", "var_type", "var_name", "lieteral", "number", 
		"str", "str_start", "str_end", "str_txt", "esc", "str_var", "function_call", 
		"function_name", "system_function", "system_header", "system_body", "system_function_name", 
		"custom_function", "custom_header", "custom_body", "custom_function_name", 
		"parameter", "dev", "separator", "return_type", "return_word", "function_declaration", 
		"argument_start", "argument_end", "body_start", "body_end", "assign", 
		"trash"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/***'", null, "'//'", "'include'", "':='", "';'", null, "'devolver'", 
		"'function'", "'begin'", "'end'", "'numero'", "'cadena'", "'void'", "'while'", 
		"'if'", "'cos'", "'sen'", "'tan'", "'^'", null, "'*'", "'/'", "'+'", "'-'", 
		"'||'", "'&&'", "'|'", "'&'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
		"'('", "')'", "','", null, null, null, null, null, null, null, "'***/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INFORMATION_START", "COMMENT_BLOCK_START", "COMMENT_LINE_START", 
		"INCLUDE_START", "ASSIGN", "END", "RETURN_TYPE", "RETURN", "DECLARATION", 
		"BODY_START", "BODY_END", "INTEGER", "STRING", "VOID", "WHILE", "IF", 
		"COS", "SEN", "TAN", "POW", "SQRT", "MUL", "DIV", "ADD", "SUB", "OR", 
		"AND", "OR_B", "AND_B", "MIN", "MAX", "MINEQ", "MAXEQ", "EQ", "NEQ", "ARGUMENT_START", 
		"ARGUMENT_END", "SEPARATOR", "INT", "FLOAT", "VAR", "WS", "STR_START", 
		"COMMENT_BLOCK_END", "TXT_MULTILINE", "INFORMATION_END", "TAG_START", 
		"TXT_INFORMATION", "COMMENT_LINE_END", "TXT_LINE", "TAG_END", "TAG_ID", 
		"TAG_LIMIT", "TXT_TAG", "STR_END", "ESC", "STR_VAR", "STR_TXT"
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
	public String getGrammarFileName() { return "gFiboParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gFiboParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public List<MemContext> mem() {
			return getRuleContexts(MemContext.class);
		}
		public MemContext mem(int i) {
			return getRuleContext(MemContext.class,i);
		}
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << INCLUDE_START) | (1L << DECLARATION) | (1L << INTEGER) | (1L << STRING) | (1L << VOID) | (1L << WHILE) | (1L << IF) | (1L << VAR) | (1L << WS))) != 0)) {
				{
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(124);
					prog(0);
					}
					break;
				case 2:
					{
					setState(125);
					mem(0);
					}
					break;
				case 3:
					{
					setState(126);
					trash();
					}
					break;
				}
				}
				setState(131);
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

	public static class InformationContext extends ParserRuleContext {
		public Tag_startContext tag_start() {
			return getRuleContext(Tag_startContext.class,0);
		}
		public Tag_nameContext tag_name() {
			return getRuleContext(Tag_nameContext.class,0);
		}
		public Tag_endContext tag_end() {
			return getRuleContext(Tag_endContext.class,0);
		}
		public TerminalNode TAG_END() { return getToken(gFiboParser.TAG_END, 0); }
		public List<Tag_contentContext> tag_content() {
			return getRuleContexts(Tag_contentContext.class);
		}
		public Tag_contentContext tag_content(int i) {
			return getRuleContext(Tag_contentContext.class,i);
		}
		public InformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_information; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterInformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitInformation(this);
		}
	}

	public final InformationContext information() throws RecognitionException {
		InformationContext _localctx = new InformationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_information);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			tag_start();
			setState(133);
			tag_name();
			setState(134);
			tag_end();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TAG_ID) | (1L << TXT_TAG))) != 0)) {
				{
				{
				setState(135);
				tag_content();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(TAG_END);
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

	public static class Tag_nameContext extends ParserRuleContext {
		public TerminalNode TAG_ID() { return getToken(gFiboParser.TAG_ID, 0); }
		public Tag_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterTag_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitTag_name(this);
		}
	}

	public final Tag_nameContext tag_name() throws RecognitionException {
		Tag_nameContext _localctx = new Tag_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(TAG_ID);
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

	public static class Tag_contentContext extends ParserRuleContext {
		public TxtContext txt() {
			return getRuleContext(TxtContext.class,0);
		}
		public TerminalNode TAG_ID() { return getToken(gFiboParser.TAG_ID, 0); }
		public Tag_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterTag_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitTag_content(this);
		}
	}

	public final Tag_contentContext tag_content() throws RecognitionException {
		Tag_contentContext _localctx = new Tag_contentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_content);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT_MULTILINE:
			case TXT_INFORMATION:
			case TXT_LINE:
			case TXT_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				txt();
				}
				break;
			case TAG_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(TAG_ID);
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

	public static class Tag_startContext extends ParserRuleContext {
		public TerminalNode TAG_START() { return getToken(gFiboParser.TAG_START, 0); }
		public Tag_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterTag_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitTag_start(this);
		}
	}

	public final Tag_startContext tag_start() throws RecognitionException {
		Tag_startContext _localctx = new Tag_startContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tag_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TAG_START);
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

	public static class Tag_endContext extends ParserRuleContext {
		public TerminalNode TAG_LIMIT() { return getToken(gFiboParser.TAG_LIMIT, 0); }
		public Tag_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterTag_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitTag_end(this);
		}
	}

	public final Tag_endContext tag_end() throws RecognitionException {
		Tag_endContext _localctx = new Tag_endContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tag_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TAG_LIMIT);
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

	public static class CommentContext extends ParserRuleContext {
		public Comment_block_startContext comment_block_start() {
			return getRuleContext(Comment_block_startContext.class,0);
		}
		public Comment_block_endContext comment_block_end() {
			return getRuleContext(Comment_block_endContext.class,0);
		}
		public List<TxtContext> txt() {
			return getRuleContexts(TxtContext.class);
		}
		public TxtContext txt(int i) {
			return getRuleContext(TxtContext.class,i);
		}
		public Comment_line_startContext comment_line_start() {
			return getRuleContext(Comment_line_startContext.class,0);
		}
		public TerminalNode COMMENT_LINE_END() { return getToken(gFiboParser.COMMENT_LINE_END, 0); }
		public Information_startContext information_start() {
			return getRuleContext(Information_startContext.class,0);
		}
		public Information_endContext information_end() {
			return getRuleContext(Information_endContext.class,0);
		}
		public List<InformationContext> information() {
			return getRuleContexts(InformationContext.class);
		}
		public InformationContext information(int i) {
			return getRuleContext(InformationContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comment);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT_BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				comment_block_start();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TXT_TAG))) != 0)) {
					{
					{
					setState(154);
					txt();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				comment_block_end();
				}
				break;
			case COMMENT_LINE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				comment_line_start();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TXT_TAG))) != 0)) {
					{
					{
					setState(163);
					txt();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(COMMENT_LINE_END);
				}
				break;
			case INFORMATION_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				information_start();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TAG_START) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TXT_TAG))) != 0)) {
					{
					setState(174);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_START:
						{
						setState(172);
						information();
						}
						break;
					case TXT_MULTILINE:
					case TXT_INFORMATION:
					case TXT_LINE:
					case TXT_TAG:
						{
						setState(173);
						txt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				information_end();
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

	public static class Comment_block_startContext extends ParserRuleContext {
		public TerminalNode COMMENT_BLOCK_START() { return getToken(gFiboParser.COMMENT_BLOCK_START, 0); }
		public Comment_block_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_block_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterComment_block_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitComment_block_start(this);
		}
	}

	public final Comment_block_startContext comment_block_start() throws RecognitionException {
		Comment_block_startContext _localctx = new Comment_block_startContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment_block_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(COMMENT_BLOCK_START);
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

	public static class Comment_block_endContext extends ParserRuleContext {
		public TerminalNode COMMENT_BLOCK_END() { return getToken(gFiboParser.COMMENT_BLOCK_END, 0); }
		public Comment_block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterComment_block_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitComment_block_end(this);
		}
	}

	public final Comment_block_endContext comment_block_end() throws RecognitionException {
		Comment_block_endContext _localctx = new Comment_block_endContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comment_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(COMMENT_BLOCK_END);
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

	public static class Information_startContext extends ParserRuleContext {
		public TerminalNode INFORMATION_START() { return getToken(gFiboParser.INFORMATION_START, 0); }
		public Information_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_information_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterInformation_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitInformation_start(this);
		}
	}

	public final Information_startContext information_start() throws RecognitionException {
		Information_startContext _localctx = new Information_startContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_information_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(INFORMATION_START);
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

	public static class Information_endContext extends ParserRuleContext {
		public TerminalNode INFORMATION_END() { return getToken(gFiboParser.INFORMATION_END, 0); }
		public Information_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_information_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterInformation_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitInformation_end(this);
		}
	}

	public final Information_endContext information_end() throws RecognitionException {
		Information_endContext _localctx = new Information_endContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_information_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(INFORMATION_END);
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

	public static class Comment_line_startContext extends ParserRuleContext {
		public TerminalNode COMMENT_LINE_START() { return getToken(gFiboParser.COMMENT_LINE_START, 0); }
		public Comment_line_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_line_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterComment_line_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitComment_line_start(this);
		}
	}

	public final Comment_line_startContext comment_line_start() throws RecognitionException {
		Comment_line_startContext _localctx = new Comment_line_startContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment_line_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(COMMENT_LINE_START);
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

	public static class TxtContext extends ParserRuleContext {
		public List<TerminalNode> TXT_LINE() { return getTokens(gFiboParser.TXT_LINE); }
		public TerminalNode TXT_LINE(int i) {
			return getToken(gFiboParser.TXT_LINE, i);
		}
		public List<TerminalNode> TXT_MULTILINE() { return getTokens(gFiboParser.TXT_MULTILINE); }
		public TerminalNode TXT_MULTILINE(int i) {
			return getToken(gFiboParser.TXT_MULTILINE, i);
		}
		public List<TerminalNode> TXT_INFORMATION() { return getTokens(gFiboParser.TXT_INFORMATION); }
		public TerminalNode TXT_INFORMATION(int i) {
			return getToken(gFiboParser.TXT_INFORMATION, i);
		}
		public List<TerminalNode> TXT_TAG() { return getTokens(gFiboParser.TXT_TAG); }
		public TerminalNode TXT_TAG(int i) {
			return getToken(gFiboParser.TXT_TAG, i);
		}
		public TxtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterTxt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitTxt(this);
		}
	}

	public final TxtContext txt() throws RecognitionException {
		TxtContext _localctx = new TxtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_txt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(193);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TXT_TAG))) != 0)) ) {
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
				setState(196); 
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

	public static class ProgContext extends ParserRuleContext {
		public Custom_functionContext custom_function() {
			return getRuleContext(Custom_functionContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public End_expContext end_exp() {
			return getRuleContext(End_expContext.class,0);
		}
		public TrashContext trash() {
			return getRuleContext(TrashContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		return prog(0);
	}

	private ProgContext prog(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgContext _localctx = new ProgContext(_ctx, _parentState);
		ProgContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_prog, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(199);
				custom_function();
				}
				break;
			case 2:
				{
				setState(200);
				include();
				setState(201);
				end_exp();
				}
				break;
			case 3:
				{
				setState(203);
				trash();
				setState(204);
				prog(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_prog);
					setState(208);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(209);
					trash();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class MemContext extends ParserRuleContext {
		public TrashContext trash() {
			return getRuleContext(TrashContext.class,0);
		}
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public End_expContext end_exp() {
			return getRuleContext(End_expContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Assigment_declarationContext assigment_declaration() {
			return getRuleContext(Assigment_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public System_functionContext system_function() {
			return getRuleContext(System_functionContext.class,0);
		}
		public MemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitMem(this);
		}
	}

	public final MemContext mem() throws RecognitionException {
		return mem(0);
	}

	private MemContext mem(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemContext _localctx = new MemContext(_ctx, _parentState);
		MemContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_mem, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(216);
				trash();
				setState(217);
				mem(7);
				}
				break;
			case 2:
				{
				setState(219);
				assigment();
				setState(220);
				end_exp();
				}
				break;
			case 3:
				{
				setState(222);
				declaration();
				setState(223);
				end_exp();
				}
				break;
			case 4:
				{
				setState(225);
				assigment_declaration();
				setState(226);
				end_exp();
				}
				break;
			case 5:
				{
				setState(228);
				function_call();
				setState(229);
				end_exp();
				}
				break;
			case 6:
				{
				setState(231);
				system_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mem);
					setState(234);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(235);
					trash();
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class End_expContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(gFiboParser.END, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public End_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterEnd_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitEnd_exp(this);
		}
	}

	public final End_expContext end_exp() throws RecognitionException {
		End_expContext _localctx = new End_expContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_end_exp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(241);
				trash();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(END);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					trash();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ExpContext extends ParserRuleContext {
		public TrashContext trash() {
			return getRuleContext(TrashContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Argument_startContext argument_start() {
			return getRuleContext(Argument_startContext.class,0);
		}
		public Argument_endContext argument_end() {
			return getRuleContext(Argument_endContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TrigContext trig() {
			return getRuleContext(TrigContext.class,0);
		}
		public LieteralContext lieteral() {
			return getRuleContext(LieteralContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public MathL1Context mathL1() {
			return getRuleContext(MathL1Context.class,0);
		}
		public MathL2Context mathL2() {
			return getRuleContext(MathL2Context.class,0);
		}
		public MathL3Context mathL3() {
			return getRuleContext(MathL3Context.class,0);
		}
		public LogicL1Context logicL1() {
			return getRuleContext(LogicL1Context.class,0);
		}
		public LogicL2Context logicL2() {
			return getRuleContext(LogicL2Context.class,0);
		}
		public LogicL3Context logicL3() {
			return getRuleContext(LogicL3Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(255);
				trash();
				setState(256);
				exp(14);
				}
				break;
			case 2:
				{
				setState(258);
				argument_start();
				setState(259);
				exp(0);
				setState(260);
				argument_end();
				}
				break;
			case 3:
				{
				setState(262);
				parameter();
				}
				break;
			case 4:
				{
				setState(263);
				trig();
				setState(264);
				argument_start();
				setState(265);
				exp(0);
				setState(266);
				argument_end();
				}
				break;
			case 5:
				{
				setState(268);
				lieteral();
				}
				break;
			case 6:
				{
				setState(269);
				var_name();
				}
				break;
			case 7:
				{
				setState(270);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(273);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(274);
						mathL1();
						setState(275);
						exp(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(277);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(278);
						mathL2();
						setState(279);
						exp(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(281);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(282);
						mathL3();
						setState(283);
						exp(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(285);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(286);
						logicL1();
						setState(287);
						exp(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(289);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(290);
						logicL2();
						setState(291);
						exp(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(293);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(294);
						logicL3();
						setState(295);
						exp(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(297);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(298);
						trash();
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class MathL1Context extends ParserRuleContext {
		public TerminalNode POW() { return getToken(gFiboParser.POW, 0); }
		public TerminalNode SQRT() { return getToken(gFiboParser.SQRT, 0); }
		public MathL1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathL1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterMathL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitMathL1(this);
		}
	}

	public final MathL1Context mathL1() throws RecognitionException {
		MathL1Context _localctx = new MathL1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_mathL1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==POW || _la==SQRT) ) {
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

	public static class MathL2Context extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(gFiboParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(gFiboParser.DIV, 0); }
		public MathL2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathL2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterMathL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitMathL2(this);
		}
	}

	public final MathL2Context mathL2() throws RecognitionException {
		MathL2Context _localctx = new MathL2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_mathL2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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

	public static class MathL3Context extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(gFiboParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(gFiboParser.SUB, 0); }
		public MathL3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathL3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterMathL3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitMathL3(this);
		}
	}

	public final MathL3Context mathL3() throws RecognitionException {
		MathL3Context _localctx = new MathL3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_mathL3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
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

	public static class LogicL1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(gFiboParser.OR, 0); }
		public TerminalNode AND() { return getToken(gFiboParser.AND, 0); }
		public LogicL1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicL1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterLogicL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitLogicL1(this);
		}
	}

	public final LogicL1Context logicL1() throws RecognitionException {
		LogicL1Context _localctx = new LogicL1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicL1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	public static class LogicL2Context extends ParserRuleContext {
		public TerminalNode OR_B() { return getToken(gFiboParser.OR_B, 0); }
		public TerminalNode AND_B() { return getToken(gFiboParser.AND_B, 0); }
		public LogicL2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicL2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterLogicL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitLogicL2(this);
		}
	}

	public final LogicL2Context logicL2() throws RecognitionException {
		LogicL2Context _localctx = new LogicL2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicL2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==OR_B || _la==AND_B) ) {
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

	public static class LogicL3Context extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(gFiboParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(gFiboParser.MAX, 0); }
		public TerminalNode MINEQ() { return getToken(gFiboParser.MINEQ, 0); }
		public TerminalNode MAXEQ() { return getToken(gFiboParser.MAXEQ, 0); }
		public TerminalNode EQ() { return getToken(gFiboParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(gFiboParser.NEQ, 0); }
		public LogicL3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicL3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterLogicL3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitLogicL3(this);
		}
	}

	public final LogicL3Context logicL3() throws RecognitionException {
		LogicL3Context _localctx = new LogicL3Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_logicL3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MIN) | (1L << MAX) | (1L << MINEQ) | (1L << MAXEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
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

	public static class TrigContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(gFiboParser.COS, 0); }
		public TerminalNode SEN() { return getToken(gFiboParser.SEN, 0); }
		public TerminalNode TAN() { return getToken(gFiboParser.TAN, 0); }
		public TrigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterTrig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitTrig(this);
		}
	}

	public final TrigContext trig() throws RecognitionException {
		TrigContext _localctx = new TrigContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SEN) | (1L << TAN))) != 0)) ) {
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

	public static class IncludeContext extends ParserRuleContext {
		public Include_startContext include_start() {
			return getRuleContext(Include_startContext.class,0);
		}
		public LibraryContext library() {
			return getRuleContext(LibraryContext.class,0);
		}
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_include);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			include_start();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(319);
				trash();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			library();
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

	public static class Include_startContext extends ParserRuleContext {
		public TerminalNode INCLUDE_START() { return getToken(gFiboParser.INCLUDE_START, 0); }
		public Include_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterInclude_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitInclude_start(this);
		}
	}

	public final Include_startContext include_start() throws RecognitionException {
		Include_startContext _localctx = new Include_startContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_include_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(INCLUDE_START);
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

	public static class LibraryContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gFiboParser.VAR, 0); }
		public LibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitLibrary(this);
		}
	}

	public final LibraryContext library() throws RecognitionException {
		LibraryContext _localctx = new LibraryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_library);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(VAR);
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

	public static class AssigmentContext extends ParserRuleContext {
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitAssigment(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			var_name();
			setState(332);
			assign();
			setState(333);
			exp(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			var_type();
			setState(336);
			var_name();
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

	public static class Assigment_declarationContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Assigment_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterAssigment_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitAssigment_declaration(this);
		}
	}

	public final Assigment_declarationContext assigment_declaration() throws RecognitionException {
		Assigment_declarationContext _localctx = new Assigment_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assigment_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			var_type();
			setState(339);
			var_name();
			setState(340);
			assign();
			setState(341);
			exp(0);
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(gFiboParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(gFiboParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(gFiboParser.VOID, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_var_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(343);
				trash();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(350);
					trash();
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gFiboParser.VAR, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitVar_name(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(VAR);
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

	public static class LieteralContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public LieteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lieteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterLieteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitLieteral(this);
		}
	}

	public final LieteralContext lieteral() throws RecognitionException {
		LieteralContext _localctx = new LieteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lieteral);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				number();
				}
				break;
			case STR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				str();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gFiboParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gFiboParser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	public static class StrContext extends ParserRuleContext {
		public Str_startContext str_start() {
			return getRuleContext(Str_startContext.class,0);
		}
		public Str_endContext str_end() {
			return getRuleContext(Str_endContext.class,0);
		}
		public List<Str_txtContext> str_txt() {
			return getRuleContexts(Str_txtContext.class);
		}
		public Str_txtContext str_txt(int i) {
			return getRuleContext(Str_txtContext.class,i);
		}
		public List<EscContext> esc() {
			return getRuleContexts(EscContext.class);
		}
		public EscContext esc(int i) {
			return getRuleContext(EscContext.class,i);
		}
		public List<Str_varContext> str_var() {
			return getRuleContexts(Str_varContext.class);
		}
		public Str_varContext str_var(int i) {
			return getRuleContext(Str_varContext.class,i);
		}
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_str);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			str_start();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESC) | (1L << STR_VAR) | (1L << STR_TXT))) != 0)) {
				{
				setState(368);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR_TXT:
					{
					setState(365);
					str_txt();
					}
					break;
				case ESC:
					{
					setState(366);
					esc();
					}
					break;
				case STR_VAR:
					{
					setState(367);
					str_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			str_end();
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

	public static class Str_startContext extends ParserRuleContext {
		public TerminalNode STR_START() { return getToken(gFiboParser.STR_START, 0); }
		public Str_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterStr_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitStr_start(this);
		}
	}

	public final Str_startContext str_start() throws RecognitionException {
		Str_startContext _localctx = new Str_startContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_str_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(STR_START);
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

	public static class Str_endContext extends ParserRuleContext {
		public TerminalNode STR_END() { return getToken(gFiboParser.STR_END, 0); }
		public Str_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterStr_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitStr_end(this);
		}
	}

	public final Str_endContext str_end() throws RecognitionException {
		Str_endContext _localctx = new Str_endContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_str_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(STR_END);
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

	public static class Str_txtContext extends ParserRuleContext {
		public List<TerminalNode> STR_TXT() { return getTokens(gFiboParser.STR_TXT); }
		public TerminalNode STR_TXT(int i) {
			return getToken(gFiboParser.STR_TXT, i);
		}
		public Str_txtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_txt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterStr_txt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitStr_txt(this);
		}
	}

	public final Str_txtContext str_txt() throws RecognitionException {
		Str_txtContext _localctx = new Str_txtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_str_txt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(379);
					match(STR_TXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class EscContext extends ParserRuleContext {
		public TerminalNode ESC() { return getToken(gFiboParser.ESC, 0); }
		public EscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterEsc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitEsc(this);
		}
	}

	public final EscContext esc() throws RecognitionException {
		EscContext _localctx = new EscContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_esc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ESC);
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

	public static class Str_varContext extends ParserRuleContext {
		public TerminalNode STR_VAR() { return getToken(gFiboParser.STR_VAR, 0); }
		public Str_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterStr_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitStr_var(this);
		}
	}

	public final Str_varContext str_var() throws RecognitionException {
		Str_varContext _localctx = new Str_varContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_str_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(STR_VAR);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Argument_startContext argument_start() {
			return getRuleContext(Argument_startContext.class,0);
		}
		public Argument_endContext argument_end() {
			return getRuleContext(Argument_endContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			function_name();
			setState(389);
			argument_start();
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(390);
				exp(0);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(391);
					separator();
					setState(392);
					exp(0);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(401);
			argument_end();
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gFiboParser.VAR, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(VAR);
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

	public static class System_functionContext extends ParserRuleContext {
		public System_headerContext system_header() {
			return getRuleContext(System_headerContext.class,0);
		}
		public System_bodyContext system_body() {
			return getRuleContext(System_bodyContext.class,0);
		}
		public System_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSystem_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSystem_function(this);
		}
	}

	public final System_functionContext system_function() throws RecognitionException {
		System_functionContext _localctx = new System_functionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_system_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			system_header();
			setState(406);
			system_body();
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

	public static class System_headerContext extends ParserRuleContext {
		public System_function_nameContext system_function_name() {
			return getRuleContext(System_function_nameContext.class,0);
		}
		public Argument_startContext argument_start() {
			return getRuleContext(Argument_startContext.class,0);
		}
		public Argument_endContext argument_end() {
			return getRuleContext(Argument_endContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public System_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSystem_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSystem_header(this);
		}
	}

	public final System_headerContext system_header() throws RecognitionException {
		System_headerContext _localctx = new System_headerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_system_header);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			system_function_name();
			setState(409);
			argument_start();
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					exp(0);
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(416);
			argument_end();
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

	public static class System_bodyContext extends ParserRuleContext {
		public Body_startContext body_start() {
			return getRuleContext(Body_startContext.class,0);
		}
		public Body_endContext body_end() {
			return getRuleContext(Body_endContext.class,0);
		}
		public List<MemContext> mem() {
			return getRuleContexts(MemContext.class);
		}
		public MemContext mem(int i) {
			return getRuleContext(MemContext.class,i);
		}
		public System_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSystem_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSystem_body(this);
		}
	}

	public final System_bodyContext system_body() throws RecognitionException {
		System_bodyContext _localctx = new System_bodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_system_body);
		try {
			int _alt;
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				body_start();
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(419);
						mem(0);
						}
						} 
					}
					setState(424);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(425);
				body_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				mem(0);
				}
				break;
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

	public static class System_function_nameContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gFiboParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(gFiboParser.IF, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public System_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSystem_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSystem_function_name(this);
		}
	}

	public final System_function_nameContext system_function_name() throws RecognitionException {
		System_function_nameContext _localctx = new System_function_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_system_function_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(430);
				trash();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
			_la = _input.LA(1);
			if ( !(_la==WHILE || _la==IF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					trash();
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Custom_functionContext extends ParserRuleContext {
		public Custom_headerContext custom_header() {
			return getRuleContext(Custom_headerContext.class,0);
		}
		public Custom_bodyContext custom_body() {
			return getRuleContext(Custom_bodyContext.class,0);
		}
		public Custom_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterCustom_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitCustom_function(this);
		}
	}

	public final Custom_functionContext custom_function() throws RecognitionException {
		Custom_functionContext _localctx = new Custom_functionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_custom_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			custom_header();
			setState(444);
			custom_body();
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

	public static class Custom_headerContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Custom_function_nameContext custom_function_name() {
			return getRuleContext(Custom_function_nameContext.class,0);
		}
		public Argument_startContext argument_start() {
			return getRuleContext(Argument_startContext.class,0);
		}
		public Argument_endContext argument_end() {
			return getRuleContext(Argument_endContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public Custom_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterCustom_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitCustom_header(this);
		}
	}

	public final Custom_headerContext custom_header() throws RecognitionException {
		Custom_headerContext _localctx = new Custom_headerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_custom_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			function_declaration();
			setState(447);
			custom_function_name();
			setState(448);
			argument_start();
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(449);
				exp(0);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(450);
					separator();
					setState(451);
					exp(0);
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(460);
			argument_end();
			setState(461);
			return_type();
			setState(462);
			var_type();
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

	public static class Custom_bodyContext extends ParserRuleContext {
		public Body_startContext body_start() {
			return getRuleContext(Body_startContext.class,0);
		}
		public Body_endContext body_end() {
			return getRuleContext(Body_endContext.class,0);
		}
		public List<MemContext> mem() {
			return getRuleContexts(MemContext.class);
		}
		public MemContext mem(int i) {
			return getRuleContext(MemContext.class,i);
		}
		public List<Custom_bodyContext> custom_body() {
			return getRuleContexts(Custom_bodyContext.class);
		}
		public Custom_bodyContext custom_body(int i) {
			return getRuleContext(Custom_bodyContext.class,i);
		}
		public DevContext dev() {
			return getRuleContext(DevContext.class,0);
		}
		public Custom_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterCustom_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitCustom_body(this);
		}
	}

	public final Custom_bodyContext custom_body() throws RecognitionException {
		Custom_bodyContext _localctx = new Custom_bodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_custom_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			body_start();
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(467);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(465);
						mem(0);
						}
						break;
					case 2:
						{
						setState(466);
						custom_body();
						}
						break;
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(472);
				dev();
				}
				break;
			}
			setState(475);
			body_end();
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

	public static class Custom_function_nameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gFiboParser.VAR, 0); }
		public Custom_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterCustom_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitCustom_function_name(this);
		}
	}

	public final Custom_function_nameContext custom_function_name() throws RecognitionException {
		Custom_function_nameContext _localctx = new Custom_function_nameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_custom_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(VAR);
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

	public static class ParameterContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			var_type();
			setState(480);
			var_name();
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

	public static class DevContext extends ParserRuleContext {
		public Return_wordContext return_word() {
			return getRuleContext(Return_wordContext.class,0);
		}
		public Argument_startContext argument_start() {
			return getRuleContext(Argument_startContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Argument_endContext argument_end() {
			return getRuleContext(Argument_endContext.class,0);
		}
		public End_expContext end_exp() {
			return getRuleContext(End_expContext.class,0);
		}
		public DevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterDev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitDev(this);
		}
	}

	public final DevContext dev() throws RecognitionException {
		DevContext _localctx = new DevContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			return_word();
			setState(483);
			argument_start();
			setState(484);
			exp(0);
			setState(485);
			argument_end();
			setState(486);
			end_exp();
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

	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(gFiboParser.SEPARATOR, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(SEPARATOR);
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

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode RETURN_TYPE() { return getToken(gFiboParser.RETURN_TYPE, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_return_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(490);
				trash();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(RETURN_TYPE);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(497);
					trash();
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Return_wordContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gFiboParser.RETURN, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Return_wordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterReturn_word(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitReturn_word(this);
		}
	}

	public final Return_wordContext return_word() throws RecognitionException {
		Return_wordContext _localctx = new Return_wordContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_return_word);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(503);
				trash();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(RETURN);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					trash();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode DECLARATION() { return getToken(gFiboParser.DECLARATION, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(516);
				trash();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(DECLARATION);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(523);
				trash();
				}
				}
				setState(528);
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

	public static class Argument_startContext extends ParserRuleContext {
		public TerminalNode ARGUMENT_START() { return getToken(gFiboParser.ARGUMENT_START, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Argument_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterArgument_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitArgument_start(this);
		}
	}

	public final Argument_startContext argument_start() throws RecognitionException {
		Argument_startContext _localctx = new Argument_startContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_argument_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(529);
				trash();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			match(ARGUMENT_START);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					trash();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class Argument_endContext extends ParserRuleContext {
		public TerminalNode ARGUMENT_END() { return getToken(gFiboParser.ARGUMENT_END, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Argument_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterArgument_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitArgument_end(this);
		}
	}

	public final Argument_endContext argument_end() throws RecognitionException {
		Argument_endContext _localctx = new Argument_endContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_argument_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(542);
				trash();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			match(ARGUMENT_END);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					trash();
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class Body_startContext extends ParserRuleContext {
		public TerminalNode BODY_START() { return getToken(gFiboParser.BODY_START, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Body_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterBody_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitBody_start(this);
		}
	}

	public final Body_startContext body_start() throws RecognitionException {
		Body_startContext _localctx = new Body_startContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_body_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(555);
				trash();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(BODY_START);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(562);
					trash();
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class Body_endContext extends ParserRuleContext {
		public TerminalNode BODY_END() { return getToken(gFiboParser.BODY_END, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Body_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterBody_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitBody_end(this);
		}
	}

	public final Body_endContext body_end() throws RecognitionException {
		Body_endContext _localctx = new Body_endContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_body_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(568);
				trash();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(BODY_END);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(575);
					trash();
					}
					} 
				}
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(gFiboParser.ASSIGN, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(581);
				trash();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			match(ASSIGN);
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					trash();
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class TrashContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode WS() { return getToken(gFiboParser.WS, 0); }
		public TrashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterTrash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitTrash(this);
		}
	}

	public final TrashContext trash() throws RecognitionException {
		TrashContext _localctx = new TrashContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_trash);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFORMATION_START:
			case COMMENT_BLOCK_START:
			case COMMENT_LINE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				comment();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(WS);
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
			return prog_sempred((ProgContext)_localctx, predIndex);
		case 14:
			return mem_sempred((MemContext)_localctx, predIndex);
		case 16:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean prog_sempred(ProgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mem_sempred(MemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0259\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3\3\3\3\3\3"+
		"\3\3\7\3\u008b\n\3\f\3\16\3\u008e\13\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u0096"+
		"\n\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b1"+
		"\n\b\f\b\16\b\u00b4\13\b\3\b\3\b\5\b\u00b8\n\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\6\16\u00c5\n\16\r\16\16\16\u00c6\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d1\n\17\3\17\3\17\7\17\u00d5\n\17"+
		"\f\17\16\17\u00d8\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00eb\n\20\3\20\3\20\7\20"+
		"\u00ef\n\20\f\20\16\20\u00f2\13\20\3\21\7\21\u00f5\n\21\f\21\16\21\u00f8"+
		"\13\21\3\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0112\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u012e\n\22\f\22\16\22\u0131\13\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u0143\n\32"+
		"\f\32\16\32\u0146\13\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \7 \u015b\n \f \16 \u015e"+
		"\13 \3 \3 \7 \u0162\n \f \16 \u0165\13 \3!\3!\3\"\3\"\5\"\u016b\n\"\3"+
		"#\3#\3$\3$\3$\3$\7$\u0173\n$\f$\16$\u0176\13$\3$\3$\3%\3%\3&\3&\3\'\6"+
		"\'\u017f\n\'\r\'\16\'\u0180\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\7*\u018d\n*"+
		"\f*\16*\u0190\13*\5*\u0192\n*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\7-\u019e\n"+
		"-\f-\16-\u01a1\13-\3-\3-\3.\3.\7.\u01a7\n.\f.\16.\u01aa\13.\3.\3.\3.\5"+
		".\u01af\n.\3/\7/\u01b2\n/\f/\16/\u01b5\13/\3/\3/\7/\u01b9\n/\f/\16/\u01bc"+
		"\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u01c8\n\61"+
		"\f\61\16\61\u01cb\13\61\5\61\u01cd\n\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\7\62\u01d6\n\62\f\62\16\62\u01d9\13\62\3\62\5\62\u01dc\n\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\67\7\67\u01ee\n\67\f\67\16\67\u01f1\13\67\3\67\3\67\7\67\u01f5\n\67"+
		"\f\67\16\67\u01f8\13\67\38\78\u01fb\n8\f8\168\u01fe\138\38\38\78\u0202"+
		"\n8\f8\168\u0205\138\39\79\u0208\n9\f9\169\u020b\139\39\39\79\u020f\n"+
		"9\f9\169\u0212\139\3:\7:\u0215\n:\f:\16:\u0218\13:\3:\3:\7:\u021c\n:\f"+
		":\16:\u021f\13:\3;\7;\u0222\n;\f;\16;\u0225\13;\3;\3;\7;\u0229\n;\f;\16"+
		";\u022c\13;\3<\7<\u022f\n<\f<\16<\u0232\13<\3<\3<\7<\u0236\n<\f<\16<\u0239"+
		"\13<\3=\7=\u023c\n=\f=\16=\u023f\13=\3=\3=\7=\u0243\n=\f=\16=\u0246\13"+
		"=\3>\7>\u0249\n>\f>\16>\u024c\13>\3>\3>\7>\u0250\n>\f>\16>\u0253\13>\3"+
		"?\3?\5?\u0257\n?\3?\2\5\34\36\"@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\r\6\2//\62"+
		"\62\64\6488\3\2\26\27\3\2\30\31\3\2\32\33\3\2\34\35\3\2\36\37\3\2 %\3"+
		"\2\23\25\3\2\16\20\3\2)*\3\2\21\22\2\u0263\2\u0083\3\2\2\2\4\u0086\3\2"+
		"\2\2\6\u0091\3\2\2\2\b\u0095\3\2\2\2\n\u0097\3\2\2\2\f\u0099\3\2\2\2\16"+
		"\u00b7\3\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00bd\3\2\2\2\26\u00bf"+
		"\3\2\2\2\30\u00c1\3\2\2\2\32\u00c4\3\2\2\2\34\u00d0\3\2\2\2\36\u00ea\3"+
		"\2\2\2 \u00f6\3\2\2\2\"\u0111\3\2\2\2$\u0132\3\2\2\2&\u0134\3\2\2\2(\u0136"+
		"\3\2\2\2*\u0138\3\2\2\2,\u013a\3\2\2\2.\u013c\3\2\2\2\60\u013e\3\2\2\2"+
		"\62\u0140\3\2\2\2\64\u0149\3\2\2\2\66\u014b\3\2\2\28\u014d\3\2\2\2:\u0151"+
		"\3\2\2\2<\u0154\3\2\2\2>\u015c\3\2\2\2@\u0166\3\2\2\2B\u016a\3\2\2\2D"+
		"\u016c\3\2\2\2F\u016e\3\2\2\2H\u0179\3\2\2\2J\u017b\3\2\2\2L\u017e\3\2"+
		"\2\2N\u0182\3\2\2\2P\u0184\3\2\2\2R\u0186\3\2\2\2T\u0195\3\2\2\2V\u0197"+
		"\3\2\2\2X\u019a\3\2\2\2Z\u01ae\3\2\2\2\\\u01b3\3\2\2\2^\u01bd\3\2\2\2"+
		"`\u01c0\3\2\2\2b\u01d2\3\2\2\2d\u01df\3\2\2\2f\u01e1\3\2\2\2h\u01e4\3"+
		"\2\2\2j\u01ea\3\2\2\2l\u01ef\3\2\2\2n\u01fc\3\2\2\2p\u0209\3\2\2\2r\u0216"+
		"\3\2\2\2t\u0223\3\2\2\2v\u0230\3\2\2\2x\u023d\3\2\2\2z\u024a\3\2\2\2|"+
		"\u0256\3\2\2\2~\u0082\5\34\17\2\177\u0082\5\36\20\2\u0080\u0082\5|?\2"+
		"\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\3\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\5\n\6\2\u0087\u0088\5\6\4\2\u0088\u008c\5\f\7\2\u0089"+
		"\u008b\5\b\5\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\7\65\2\2\u0090\5\3\2\2\2\u0091\u0092\7\66\2\2\u0092\7\3\2\2\2\u0093"+
		"\u0096\5\32\16\2\u0094\u0096\7\66\2\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\t\3\2\2\2\u0097\u0098\7\61\2\2\u0098\13\3\2\2\2\u0099\u009a"+
		"\7\67\2\2\u009a\r\3\2\2\2\u009b\u009f\5\20\t\2\u009c\u009e\5\32\16\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5\22\n\2\u00a3"+
		"\u00b8\3\2\2\2\u00a4\u00a8\5\30\r\2\u00a5\u00a7\5\32\16\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\63\2\2\u00ac\u00b8\3"+
		"\2\2\2\u00ad\u00b2\5\24\13\2\u00ae\u00b1\5\4\3\2\u00af\u00b1\5\32\16\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\5\26\f\2\u00b6\u00b8\3\2\2\2\u00b7\u009b\3\2\2\2\u00b7\u00a4\3"+
		"\2\2\2\u00b7\u00ad\3\2\2\2\u00b8\17\3\2\2\2\u00b9\u00ba\7\4\2\2\u00ba"+
		"\21\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\23\3\2\2\2\u00bd\u00be\7\3\2\2\u00be"+
		"\25\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0\27\3\2\2\2\u00c1\u00c2\7\5\2\2"+
		"\u00c2\31\3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\33\3\2\2\2\u00c8"+
		"\u00c9\b\17\1\2\u00c9\u00d1\5^\60\2\u00ca\u00cb\5\62\32\2\u00cb\u00cc"+
		"\5 \21\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\5|?\2\u00ce\u00cf\5\34\17\4\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2"+
		"\2\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\f\3\2\2\u00d3\u00d5\5|?\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\35\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\b\20\1\2\u00da\u00db\5|?\2"+
		"\u00db\u00dc\5\36\20\t\u00dc\u00eb\3\2\2\2\u00dd\u00de\58\35\2\u00de\u00df"+
		"\5 \21\2\u00df\u00eb\3\2\2\2\u00e0\u00e1\5:\36\2\u00e1\u00e2\5 \21\2\u00e2"+
		"\u00eb\3\2\2\2\u00e3\u00e4\5<\37\2\u00e4\u00e5\5 \21\2\u00e5\u00eb\3\2"+
		"\2\2\u00e6\u00e7\5R*\2\u00e7\u00e8\5 \21\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb"+
		"\5V,\2\u00ea\u00d9\3\2\2\2\u00ea\u00dd\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea"+
		"\u00e3\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00f0\3\2"+
		"\2\2\u00ec\u00ed\f\b\2\2\u00ed\u00ef\5|?\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f5\5|?\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\u00fd\7\b\2\2\u00fa\u00fc\5|?\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe!\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u0100\u0101\b\22\1\2\u0101\u0102\5|?\2\u0102\u0103"+
		"\5\"\22\20\u0103\u0112\3\2\2\2\u0104\u0105\5r:\2\u0105\u0106\5\"\22\2"+
		"\u0106\u0107\5t;\2\u0107\u0112\3\2\2\2\u0108\u0112\5f\64\2\u0109\u010a"+
		"\5\60\31\2\u010a\u010b\5r:\2\u010b\u010c\5\"\22\2\u010c\u010d\5t;\2\u010d"+
		"\u0112\3\2\2\2\u010e\u0112\5B\"\2\u010f\u0112\5@!\2\u0110\u0112\5R*\2"+
		"\u0111\u0100\3\2\2\2\u0111\u0104\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u0109"+
		"\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u012f\3\2\2\2\u0113\u0114\f\f\2\2\u0114\u0115\5$\23\2\u0115\u0116\5\""+
		"\22\r\u0116\u012e\3\2\2\2\u0117\u0118\f\13\2\2\u0118\u0119\5&\24\2\u0119"+
		"\u011a\5\"\22\f\u011a\u012e\3\2\2\2\u011b\u011c\f\n\2\2\u011c\u011d\5"+
		"(\25\2\u011d\u011e\5\"\22\13\u011e\u012e\3\2\2\2\u011f\u0120\f\t\2\2\u0120"+
		"\u0121\5*\26\2\u0121\u0122\5\"\22\n\u0122\u012e\3\2\2\2\u0123\u0124\f"+
		"\b\2\2\u0124\u0125\5,\27\2\u0125\u0126\5\"\22\t\u0126\u012e\3\2\2\2\u0127"+
		"\u0128\f\7\2\2\u0128\u0129\5.\30\2\u0129\u012a\5\"\22\b\u012a\u012e\3"+
		"\2\2\2\u012b\u012c\f\17\2\2\u012c\u012e\5|?\2\u012d\u0113\3\2\2\2\u012d"+
		"\u0117\3\2\2\2\u012d\u011b\3\2\2\2\u012d\u011f\3\2\2\2\u012d\u0123\3\2"+
		"\2\2\u012d\u0127\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130#\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0132\u0133\t\3\2\2\u0133%\3\2\2\2\u0134\u0135\t\4\2\2\u0135\'\3\2\2"+
		"\2\u0136\u0137\t\5\2\2\u0137)\3\2\2\2\u0138\u0139\t\6\2\2\u0139+\3\2\2"+
		"\2\u013a\u013b\t\7\2\2\u013b-\3\2\2\2\u013c\u013d\t\b\2\2\u013d/\3\2\2"+
		"\2\u013e\u013f\t\t\2\2\u013f\61\3\2\2\2\u0140\u0144\5\64\33\2\u0141\u0143"+
		"\5|?\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\5\66"+
		"\34\2\u0148\63\3\2\2\2\u0149\u014a\7\6\2\2\u014a\65\3\2\2\2\u014b\u014c"+
		"\7+\2\2\u014c\67\3\2\2\2\u014d\u014e\5@!\2\u014e\u014f\5z>\2\u014f\u0150"+
		"\5\"\22\2\u01509\3\2\2\2\u0151\u0152\5> \2\u0152\u0153\5@!\2\u0153;\3"+
		"\2\2\2\u0154\u0155\5> \2\u0155\u0156\5@!\2\u0156\u0157\5z>\2\u0157\u0158"+
		"\5\"\22\2\u0158=\3\2\2\2\u0159\u015b\5|?\2\u015a\u0159\3\2\2\2\u015b\u015e"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015f\u0163\t\n\2\2\u0160\u0162\5|?\2\u0161\u0160\3\2\2"+
		"\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164?"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7+\2\2\u0167A\3\2\2\2\u0168\u016b"+
		"\5D#\2\u0169\u016b\5F$\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b"+
		"C\3\2\2\2\u016c\u016d\t\13\2\2\u016dE\3\2\2\2\u016e\u0174\5H%\2\u016f"+
		"\u0173\5L\'\2\u0170\u0173\5N(\2\u0171\u0173\5P)\2\u0172\u016f\3\2\2\2"+
		"\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\5J&\2\u0178G\3\2\2\2\u0179\u017a\7-\2\2\u017aI\3\2\2\2\u017b\u017c"+
		"\79\2\2\u017cK\3\2\2\2\u017d\u017f\7<\2\2\u017e\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181M\3\2\2\2\u0182"+
		"\u0183\7:\2\2\u0183O\3\2\2\2\u0184\u0185\7;\2\2\u0185Q\3\2\2\2\u0186\u0187"+
		"\5T+\2\u0187\u0191\5r:\2\u0188\u018e\5\"\22\2\u0189\u018a\5j\66\2\u018a"+
		"\u018b\5\"\22\2\u018b\u018d\3\2\2\2\u018c\u0189\3\2\2\2\u018d\u0190\3"+
		"\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0188\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0194\5t;\2\u0194S\3\2\2\2\u0195\u0196\7+\2\2\u0196U\3\2\2"+
		"\2\u0197\u0198\5X-\2\u0198\u0199\5Z.\2\u0199W\3\2\2\2\u019a\u019b\5\\"+
		"/\2\u019b\u019f\5r:\2\u019c\u019e\5\"\22\2\u019d\u019c\3\2\2\2\u019e\u01a1"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\5t;\2\u01a3Y\3\2\2\2\u01a4\u01a8\5v<\2\u01a5"+
		"\u01a7\5\36\20\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ac\5x=\2\u01ac\u01af\3\2\2\2\u01ad\u01af\5\36\20\2\u01ae\u01a4\3\2"+
		"\2\2\u01ae\u01ad\3\2\2\2\u01af[\3\2\2\2\u01b0\u01b2\5|?\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ba\t\f\2\2\u01b7\u01b9\5|"+
		"?\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb]\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\5`\61\2"+
		"\u01be\u01bf\5b\62\2\u01bf_\3\2\2\2\u01c0\u01c1\5p9\2\u01c1\u01c2\5d\63"+
		"\2\u01c2\u01cc\5r:\2\u01c3\u01c9\5\"\22\2\u01c4\u01c5\5j\66\2\u01c5\u01c6"+
		"\5\"\22\2\u01c6\u01c8\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c8\u01cb\3\2\2\2"+
		"\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cc\u01c3\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\5t;\2\u01cf\u01d0\5l\67\2\u01d0\u01d1\5> \2\u01d1a\3\2\2\2\u01d2"+
		"\u01d7\5v<\2\u01d3\u01d6\5\36\20\2\u01d4\u01d6\5b\62\2\u01d5\u01d3\3\2"+
		"\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\5h"+
		"\65\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\5x=\2\u01dec\3\2\2\2\u01df\u01e0\7+\2\2\u01e0e\3\2\2\2\u01e1\u01e2"+
		"\5> \2\u01e2\u01e3\5@!\2\u01e3g\3\2\2\2\u01e4\u01e5\5n8\2\u01e5\u01e6"+
		"\5r:\2\u01e6\u01e7\5\"\22\2\u01e7\u01e8\5t;\2\u01e8\u01e9\5 \21\2\u01e9"+
		"i\3\2\2\2\u01ea\u01eb\7(\2\2\u01ebk\3\2\2\2\u01ec\u01ee\5|?\2\u01ed\u01ec"+
		"\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f6\7\t\2\2\u01f3\u01f5\5|"+
		"?\2\u01f4\u01f3\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7m\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fb\5|?\2\u01fa"+
		"\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0203\7\n\2\2\u0200"+
		"\u0202\5|?\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2"+
		"\2\u0203\u0204\3\2\2\2\u0204o\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208"+
		"\5|?\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0210\7\13"+
		"\2\2\u020d\u020f\5|?\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211q\3\2\2\2\u0212\u0210\3\2\2\2\u0213"+
		"\u0215\5|?\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021d"+
		"\7&\2\2\u021a\u021c\5|?\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021es\3\2\2\2\u021f\u021d\3\2\2\2"+
		"\u0220\u0222\5|?\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226"+
		"\u022a\7\'\2\2\u0227\u0229\5|?\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2"+
		"\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bu\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022d\u022f\5|?\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0233\u0237\7\f\2\2\u0234\u0236\5|?\2\u0235\u0234\3\2\2\2\u0236\u0239"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238w\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023c\5|?\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2"+
		"\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0244\7\r\2\2\u0241\u0243\5|?\2\u0242\u0241\3\2\2\2\u0243"+
		"\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245y\3\2\2\2"+
		"\u0246\u0244\3\2\2\2\u0247\u0249\5|?\2\u0248\u0247\3\2\2\2\u0249\u024c"+
		"\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024d\u0251\7\7\2\2\u024e\u0250\5|?\2\u024f\u024e\3\2\2"+
		"\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252{"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0257\5\16\b\2\u0255\u0257\7,\2\2\u0256"+
		"\u0254\3\2\2\2\u0256\u0255\3\2\2\2\u0257}\3\2\2\29\u0081\u0083\u008c\u0095"+
		"\u009f\u00a8\u00b0\u00b2\u00b7\u00c6\u00d0\u00d6\u00ea\u00f0\u00f6\u00fd"+
		"\u0111\u012d\u012f\u0144\u015c\u0163\u016a\u0172\u0174\u0180\u018e\u0191"+
		"\u019f\u01a8\u01ae\u01b3\u01ba\u01c9\u01cc\u01d5\u01d7\u01db\u01ef\u01f6"+
		"\u01fc\u0203\u0209\u0210\u0216\u021d\u0223\u022a\u0230\u0237\u023d\u0244"+
		"\u024a\u0251\u0256";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}