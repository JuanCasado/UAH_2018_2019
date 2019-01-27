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
		ASSIGN=5, END=6, RETURN_TYPE=7, RETURN=8, DECLARATION=9, SWITCH=10, DEFAULT=11, 
		END_SWITCH=12, CASE=13, BREAK=14, BODY_START=15, BODY_END=16, IF_START=17, 
		ELSE=18, IF_END=19, INTEGER=20, STRING=21, VOID=22, WHILE=23, IF=24, COS=25, 
		SEN=26, TAN=27, POW=28, SQRT=29, MUL=30, DIV=31, ADD=32, SUB=33, OR=34, 
		AND=35, OR_B=36, AND_B=37, MIN=38, MAX=39, MINEQ=40, MAXEQ=41, EQ=42, 
		NEQ=43, ARGUMENT_START=44, ARGUMENT_END=45, SEPARATOR=46, INT=47, FLOAT=48, 
		VAR=49, WS=50, STR_START=51, COMMENT_BLOCK_END=52, TXT_MULTILINE=53, INFORMATION_END=54, 
		TAG_START=55, TXT_INFORMATION=56, COMMENT_LINE_END=57, TXT_LINE=58, TAG_END=59, 
		TAG_ID=60, TAG_LIMIT=61, TXT_TAG=62, STR_END=63, ESC=64, STR_VAR=65, STR_TXT=66;
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
		RULE_system_function = 42, RULE_system_header = 43, RULE_while_header = 44, 
		RULE_if_header = 45, RULE_switch_header = 46, RULE_system_body = 47, RULE_while_body = 48, 
		RULE_if_body = 49, RULE_switch_body = 50, RULE_case_closure = 51, RULE_system_function_name = 52, 
		RULE_while_ = 53, RULE_if_ = 54, RULE_custom_function = 55, RULE_custom_header = 56, 
		RULE_custom_body = 57, RULE_custom_function_name = 58, RULE_parameter = 59, 
		RULE_dev = 60, RULE_separator = 61, RULE_return_type = 62, RULE_return_word = 63, 
		RULE_function_declaration = 64, RULE_argument_start = 65, RULE_argument_end = 66, 
		RULE_body_start = 67, RULE_if_start = 68, RULE_switch_ = 69, RULE_case_ = 70, 
		RULE_break_ = 71, RULE_deafault_ = 72, RULE_switch_end = 73, RULE_else_ = 74, 
		RULE_if_end = 75, RULE_body_end = 76, RULE_assign = 77, RULE_trash = 78;
	public static final String[] ruleNames = {
		"init", "information", "tag_name", "tag_content", "tag_start", "tag_end", 
		"comment", "comment_block_start", "comment_block_end", "information_start", 
		"information_end", "comment_line_start", "txt", "prog", "mem", "end_exp", 
		"exp", "mathL1", "mathL2", "mathL3", "logicL1", "logicL2", "logicL3", 
		"trig", "include", "include_start", "library", "assigment", "declaration", 
		"assigment_declaration", "var_type", "var_name", "lieteral", "number", 
		"str", "str_start", "str_end", "str_txt", "esc", "str_var", "function_call", 
		"function_name", "system_function", "system_header", "while_header", "if_header", 
		"switch_header", "system_body", "while_body", "if_body", "switch_body", 
		"case_closure", "system_function_name", "while_", "if_", "custom_function", 
		"custom_header", "custom_body", "custom_function_name", "parameter", "dev", 
		"separator", "return_type", "return_word", "function_declaration", "argument_start", 
		"argument_end", "body_start", "if_start", "switch_", "case_", "break_", 
		"deafault_", "switch_end", "else_", "if_end", "body_end", "assign", "trash"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/***'", null, "'//'", "'include'", "':='", "';'", null, "'devolver'", 
		"'function'", "'switch'", "'default'", "'endswitch'", "'case '", "'break'", 
		"'begin'", "'end'", "'then'", "'else'", "'endif'", "'numero'", "'cadena'", 
		"'void'", "'while'", "'if'", "'cos'", "'sen'", "'tan'", "'^'", null, "'*'", 
		"'/'", "'+'", "'-'", "'||'", "'&&'", "'|'", "'&'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'('", "')'", "','", null, null, null, null, null, 
		null, null, "'***/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INFORMATION_START", "COMMENT_BLOCK_START", "COMMENT_LINE_START", 
		"INCLUDE_START", "ASSIGN", "END", "RETURN_TYPE", "RETURN", "DECLARATION", 
		"SWITCH", "DEFAULT", "END_SWITCH", "CASE", "BREAK", "BODY_START", "BODY_END", 
		"IF_START", "ELSE", "IF_END", "INTEGER", "STRING", "VOID", "WHILE", "IF", 
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << INCLUDE_START) | (1L << DECLARATION) | (1L << SWITCH) | (1L << INTEGER) | (1L << STRING) | (1L << VOID) | (1L << WHILE) | (1L << IF) | (1L << VAR) | (1L << WS))) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(158);
					prog(0);
					}
					break;
				case 2:
					{
					setState(159);
					mem(0);
					}
					break;
				case 3:
					{
					setState(160);
					trash();
					}
					break;
				}
				}
				setState(165);
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
			setState(166);
			tag_start();
			setState(167);
			tag_name();
			setState(168);
			tag_end();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TAG_ID) | (1L << TXT_TAG))) != 0)) {
				{
				{
				setState(169);
				tag_content();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
			setState(177);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TXT_MULTILINE:
			case TXT_INFORMATION:
			case TXT_LINE:
			case TXT_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				txt();
				}
				break;
			case TAG_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
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
			setState(183);
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
			setState(185);
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
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT_BLOCK_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				comment_block_start();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TXT_TAG))) != 0)) {
					{
					{
					setState(188);
					txt();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				comment_block_end();
				}
				break;
			case COMMENT_LINE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				comment_line_start();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TXT_TAG))) != 0)) {
					{
					{
					setState(197);
					txt();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(COMMENT_LINE_END);
				}
				break;
			case INFORMATION_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				information_start();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TXT_MULTILINE) | (1L << TAG_START) | (1L << TXT_INFORMATION) | (1L << TXT_LINE) | (1L << TXT_TAG))) != 0)) {
					{
					setState(208);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_START:
						{
						setState(206);
						information();
						}
						break;
					case TXT_MULTILINE:
					case TXT_INFORMATION:
					case TXT_LINE:
					case TXT_TAG:
						{
						setState(207);
						txt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
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
			setState(217);
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
			setState(219);
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
			setState(221);
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
			setState(223);
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
			setState(225);
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
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
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
				setState(230); 
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(233);
				custom_function();
				}
				break;
			case 2:
				{
				setState(234);
				include();
				setState(235);
				end_exp();
				}
				break;
			case 3:
				{
				setState(237);
				trash();
				setState(238);
				prog(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
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
					setState(242);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(243);
					trash();
					}
					} 
				}
				setState(248);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(250);
				trash();
				setState(251);
				mem(7);
				}
				break;
			case 2:
				{
				setState(253);
				assigment();
				setState(254);
				end_exp();
				}
				break;
			case 3:
				{
				setState(256);
				declaration();
				setState(257);
				end_exp();
				}
				break;
			case 4:
				{
				setState(259);
				assigment_declaration();
				setState(260);
				end_exp();
				}
				break;
			case 5:
				{
				setState(262);
				function_call();
				setState(263);
				end_exp();
				}
				break;
			case 6:
				{
				setState(265);
				system_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
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
					setState(268);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(269);
					trash();
					}
					} 
				}
				setState(274);
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
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(275);
				trash();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(END);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					trash();
					}
					} 
				}
				setState(287);
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(289);
				trash();
				setState(290);
				exp(14);
				}
				break;
			case 2:
				{
				setState(292);
				argument_start();
				setState(293);
				exp(0);
				setState(294);
				argument_end();
				}
				break;
			case 3:
				{
				setState(296);
				parameter();
				}
				break;
			case 4:
				{
				setState(297);
				trig();
				setState(298);
				argument_start();
				setState(299);
				exp(0);
				setState(300);
				argument_end();
				}
				break;
			case 5:
				{
				setState(302);
				lieteral();
				}
				break;
			case 6:
				{
				setState(303);
				var_name();
				}
				break;
			case 7:
				{
				setState(304);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(307);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(308);
						mathL1();
						setState(309);
						exp(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(311);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(312);
						mathL2();
						setState(313);
						exp(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(315);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(316);
						mathL3();
						setState(317);
						exp(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(319);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(320);
						logicL1();
						setState(321);
						exp(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(323);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(324);
						logicL2();
						setState(325);
						exp(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(327);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(328);
						logicL3();
						setState(329);
						exp(6);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(331);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(332);
						trash();
						}
						break;
					}
					} 
				}
				setState(337);
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
			setState(338);
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
			setState(340);
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
			setState(342);
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
			setState(344);
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
			setState(346);
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
			setState(348);
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
			setState(350);
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
			setState(352);
			include_start();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(353);
				trash();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
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
			setState(361);
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
			setState(363);
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
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			var_name();
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					trash();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(372);
			assign();
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					trash();
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(379);
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
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			var_type();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(382);
				trash();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			var_type();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(391);
				trash();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			var_name();
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					trash();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(404);
			assign();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(405);
					trash();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(411);
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
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(413);
				trash();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRING) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					trash();
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(426);
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
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				number();
				}
				break;
			case STR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
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
			setState(432);
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
			setState(434);
			str_start();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ESC - 64)) | (1L << (STR_VAR - 64)) | (1L << (STR_TXT - 64)))) != 0)) {
				{
				setState(438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR_TXT:
					{
					setState(435);
					str_txt();
					}
					break;
				case ESC:
					{
					setState(436);
					esc();
					}
					break;
				case STR_VAR:
					{
					setState(437);
					str_var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
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
			setState(445);
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
			setState(447);
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
			setState(450); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(449);
					match(STR_TXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(452); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(454);
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
			setState(456);
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
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			function_name();
			setState(459);
			argument_start();
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(460);
				exp(0);
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(464);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
							{
							{
							setState(461);
							trash();
							}
							}
							setState(466);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(467);
						separator();
						setState(471);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(468);
								trash();
								}
								} 
							}
							setState(473);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
						}
						setState(474);
						exp(0);
						}
						} 
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			}
			setState(483);
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
			setState(485);
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
			setState(487);
			system_header();
			setState(488);
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
		public While_headerContext while_header() {
			return getRuleContext(While_headerContext.class,0);
		}
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
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
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFORMATION_START:
			case COMMENT_BLOCK_START:
			case COMMENT_LINE_START:
			case SWITCH:
			case WHILE:
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				while_header();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				if_header();
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

	public static class While_headerContext extends ParserRuleContext {
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
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
		public Switch_headerContext switch_header() {
			return getRuleContext(Switch_headerContext.class,0);
		}
		public While_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterWhile_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitWhile_header(this);
		}
	}

	public final While_headerContext while_header() throws RecognitionException {
		While_headerContext _localctx = new While_headerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_while_header);
		try {
			int _alt;
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				while_();
				setState(495);
				argument_start();
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(496);
						exp(0);
						}
						} 
					}
					setState(501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(502);
				argument_end();
				}
				break;
			case INFORMATION_START:
			case COMMENT_BLOCK_START:
			case COMMENT_LINE_START:
			case SWITCH:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				switch_header();
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

	public static class If_headerContext extends ParserRuleContext {
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
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
		public If_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterIf_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitIf_header(this);
		}
	}

	public final If_headerContext if_header() throws RecognitionException {
		If_headerContext _localctx = new If_headerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if_header);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			if_();
			setState(508);
			argument_start();
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(509);
					exp(0);
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(515);
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

	public static class Switch_headerContext extends ParserRuleContext {
		public Switch_Context switch_() {
			return getRuleContext(Switch_Context.class,0);
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
		public Switch_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSwitch_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSwitch_header(this);
		}
	}

	public final Switch_headerContext switch_header() throws RecognitionException {
		Switch_headerContext _localctx = new Switch_headerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_switch_header);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			switch_();
			setState(518);
			argument_start();
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					exp(0);
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(525);
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
		public While_bodyContext while_body() {
			return getRuleContext(While_bodyContext.class,0);
		}
		public If_bodyContext if_body() {
			return getRuleContext(If_bodyContext.class,0);
		}
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
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
		enterRule(_localctx, 94, RULE_system_body);
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				while_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				if_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				switch_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
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

	public static class While_bodyContext extends ParserRuleContext {
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
		public While_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterWhile_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitWhile_body(this);
		}
	}

	public final While_bodyContext while_body() throws RecognitionException {
		While_bodyContext _localctx = new While_bodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_while_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			body_start();
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					mem(0);
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(540);
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

	public static class If_bodyContext extends ParserRuleContext {
		public If_startContext if_start() {
			return getRuleContext(If_startContext.class,0);
		}
		public If_endContext if_end() {
			return getRuleContext(If_endContext.class,0);
		}
		public List<MemContext> mem() {
			return getRuleContexts(MemContext.class);
		}
		public MemContext mem(int i) {
			return getRuleContext(MemContext.class,i);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitIf_body(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_if_body);
		try {
			int _alt;
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				if_start();
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(543);
						mem(0);
						}
						} 
					}
					setState(548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(549);
				if_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				if_start();
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(552);
						mem(0);
						}
						} 
					}
					setState(557);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(558);
				else_();
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(559);
						mem(0);
						}
						} 
					}
					setState(564);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(565);
				if_end();
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public Switch_endContext switch_end() {
			return getRuleContext(Switch_endContext.class,0);
		}
		public List<Case_closureContext> case_closure() {
			return getRuleContexts(Case_closureContext.class);
		}
		public Case_closureContext case_closure(int i) {
			return getRuleContext(Case_closureContext.class,i);
		}
		public Deafault_Context deafault_() {
			return getRuleContext(Deafault_Context.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public End_expContext end_exp() {
			return getRuleContext(End_expContext.class,0);
		}
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Body_startContext body_start() {
			return getRuleContext(Body_startContext.class,0);
		}
		public List<MemContext> mem() {
			return getRuleContexts(MemContext.class);
		}
		public MemContext mem(int i) {
			return getRuleContext(MemContext.class,i);
		}
		public Break_Context break_() {
			return getRuleContext(Break_Context.class,0);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSwitch_body(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_switch_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(569);
					case_closure();
					}
					} 
				}
				setState(574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(575);
				deafault_();
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(576);
						trash();
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(582);
				return_type();
				setState(584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(583);
					body_start();
					}
					break;
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(586);
						mem(0);
						}
						} 
					}
					setState(591);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(592);
					break_();
					}
					break;
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(595);
						trash();
						}
						} 
					}
					setState(600);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(601);
				end_exp();
				}
				break;
			}
			setState(605);
			switch_end();
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

	public static class Case_closureContext extends ParserRuleContext {
		public Case_Context case_() {
			return getRuleContext(Case_Context.class,0);
		}
		public LieteralContext lieteral() {
			return getRuleContext(LieteralContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public End_expContext end_exp() {
			return getRuleContext(End_expContext.class,0);
		}
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Body_startContext body_start() {
			return getRuleContext(Body_startContext.class,0);
		}
		public List<MemContext> mem() {
			return getRuleContexts(MemContext.class);
		}
		public MemContext mem(int i) {
			return getRuleContext(MemContext.class,i);
		}
		public Break_Context break_() {
			return getRuleContext(Break_Context.class,0);
		}
		public Case_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterCase_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitCase_closure(this);
		}
	}

	public final Case_closureContext case_closure() throws RecognitionException {
		Case_closureContext _localctx = new Case_closureContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_case_closure);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			case_();
			setState(608);
			lieteral();
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(609);
					trash();
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(615);
			return_type();
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(616);
					trash();
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(622);
				body_start();
				}
				break;
			}
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					mem(0);
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(631);
				break_();
				}
				break;
			}
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(634);
					trash();
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(640);
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

	public static class System_function_nameContext extends ParserRuleContext {
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
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
		enterRule(_localctx, 104, RULE_system_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(642);
				trash();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				{
				setState(648);
				while_();
				}
				break;
			case IF:
				{
				setState(649);
				if_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(652);
				trash();
				}
				}
				setState(657);
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(gFiboParser.WHILE, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitWhile_(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(WHILE);
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gFiboParser.IF, 0); }
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(IF);
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
		enterRule(_localctx, 110, RULE_custom_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			custom_header();
			setState(663);
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
		enterRule(_localctx, 112, RULE_custom_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			function_declaration();
			setState(666);
			custom_function_name();
			setState(667);
			argument_start();
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(668);
				declaration();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(669);
					separator();
					setState(670);
					declaration();
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(679);
			argument_end();
			setState(680);
			return_type();
			setState(681);
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
		enterRule(_localctx, 114, RULE_custom_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			body_start();
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(684);
						mem(0);
						}
						break;
					case 2:
						{
						setState(685);
						custom_body();
						}
						break;
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(691);
				dev();
				}
				break;
			}
			setState(694);
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
		enterRule(_localctx, 116, RULE_custom_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
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
		enterRule(_localctx, 118, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			var_type();
			setState(699);
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
		enterRule(_localctx, 120, RULE_dev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			return_word();
			setState(702);
			argument_start();
			setState(703);
			exp(0);
			setState(704);
			argument_end();
			setState(705);
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
		enterRule(_localctx, 122, RULE_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
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
		enterRule(_localctx, 124, RULE_return_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(709);
				trash();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			match(RETURN_TYPE);
			setState(719);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(716);
					trash();
					}
					} 
				}
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 126, RULE_return_word);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(722);
				trash();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			match(RETURN);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(729);
					trash();
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 128, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(735);
				trash();
				}
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
			match(DECLARATION);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(742);
				trash();
				}
				}
				setState(747);
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
		enterRule(_localctx, 130, RULE_argument_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(748);
				trash();
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754);
			match(ARGUMENT_START);
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755);
					trash();
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 132, RULE_argument_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(761);
				trash();
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(767);
			match(ARGUMENT_END);
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(768);
					trash();
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 134, RULE_body_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(774);
				trash();
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			match(BODY_START);
			setState(784);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(781);
					trash();
					}
					} 
				}
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class If_startContext extends ParserRuleContext {
		public TerminalNode IF_START() { return getToken(gFiboParser.IF_START, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public If_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterIf_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitIf_start(this);
		}
	}

	public final If_startContext if_start() throws RecognitionException {
		If_startContext _localctx = new If_startContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_if_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(787);
				trash();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793);
			match(IF_START);
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(794);
					trash();
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class Switch_Context extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(gFiboParser.SWITCH, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Switch_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSwitch_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSwitch_(this);
		}
	}

	public final Switch_Context switch_() throws RecognitionException {
		Switch_Context _localctx = new Switch_Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(800);
				trash();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(SWITCH);
			setState(810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(807);
					trash();
					}
					} 
				}
				setState(812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class Case_Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(gFiboParser.CASE, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Case_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterCase_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitCase_(this);
		}
	}

	public final Case_Context case_() throws RecognitionException {
		Case_Context _localctx = new Case_Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_case_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(813);
				trash();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			match(CASE);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(820);
				trash();
				}
				}
				setState(825);
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

	public static class Break_Context extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(gFiboParser.BREAK, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Break_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterBreak_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitBreak_(this);
		}
	}

	public final Break_Context break_() throws RecognitionException {
		Break_Context _localctx = new Break_Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_break_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(826);
				trash();
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(832);
			match(BREAK);
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(833);
					trash();
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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

	public static class Deafault_Context extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(gFiboParser.DEFAULT, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Deafault_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deafault_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterDeafault_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitDeafault_(this);
		}
	}

	public final Deafault_Context deafault_() throws RecognitionException {
		Deafault_Context _localctx = new Deafault_Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_deafault_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(839);
				trash();
				}
				}
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			match(DEFAULT);
			setState(849);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(846);
					trash();
					}
					} 
				}
				setState(851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class Switch_endContext extends ParserRuleContext {
		public TerminalNode END_SWITCH() { return getToken(gFiboParser.END_SWITCH, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Switch_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterSwitch_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitSwitch_end(this);
		}
	}

	public final Switch_endContext switch_end() throws RecognitionException {
		Switch_endContext _localctx = new Switch_endContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_switch_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(852);
				trash();
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			match(END_SWITCH);
			setState(862);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(859);
					trash();
					}
					} 
				}
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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

	public static class Else_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(gFiboParser.ELSE, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitElse_(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_else_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(865);
				trash();
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(871);
			match(ELSE);
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(872);
					trash();
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	public static class If_endContext extends ParserRuleContext {
		public TerminalNode IF_END() { return getToken(gFiboParser.IF_END, 0); }
		public List<TrashContext> trash() {
			return getRuleContexts(TrashContext.class);
		}
		public TrashContext trash(int i) {
			return getRuleContext(TrashContext.class,i);
		}
		public If_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).enterIf_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gFiboParserListener ) ((gFiboParserListener)listener).exitIf_end(this);
		}
	}

	public final If_endContext if_end() throws RecognitionException {
		If_endContext _localctx = new If_endContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_if_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(878);
				trash();
				}
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884);
			match(IF_END);
			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(885);
					trash();
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		enterRule(_localctx, 152, RULE_body_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(891);
				trash();
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(897);
			match(BODY_END);
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(898);
					trash();
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 154, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFORMATION_START) | (1L << COMMENT_BLOCK_START) | (1L << COMMENT_LINE_START) | (1L << WS))) != 0)) {
				{
				{
				setState(904);
				trash();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910);
			match(ASSIGN);
			setState(914);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(911);
					trash();
					}
					} 
				}
				setState(916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
		enterRule(_localctx, 156, RULE_trash);
		try {
			setState(919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INFORMATION_START:
			case COMMENT_BLOCK_START:
			case COMMENT_LINE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				comment();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u039c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\7\2\u00a4\n"+
		"\2\f\2\16\2\u00a7\13\2\3\3\3\3\3\3\3\3\7\3\u00ad\n\3\f\3\16\3\u00b0\13"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00b8\n\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u00c0"+
		"\n\b\f\b\16\b\u00c3\13\b\3\b\3\b\3\b\3\b\7\b\u00c9\n\b\f\b\16\b\u00cc"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d3\n\b\f\b\16\b\u00d6\13\b\3\b\3\b\5"+
		"\b\u00da\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\u00e7"+
		"\n\16\r\16\16\16\u00e8\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f3"+
		"\n\17\3\17\3\17\7\17\u00f7\n\17\f\17\16\17\u00fa\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u010d\n\20\3\20\3\20\7\20\u0111\n\20\f\20\16\20\u0114\13\20\3\21"+
		"\7\21\u0117\n\21\f\21\16\21\u011a\13\21\3\21\3\21\7\21\u011e\n\21\f\21"+
		"\16\21\u0121\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0134\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0150\n\22\f\22\16\22\u0153"+
		"\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\7\32\u0165\n\32\f\32\16\32\u0168\13\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\7\35\u0172\n\35\f\35\16\35\u0175\13\35\3\35"+
		"\3\35\7\35\u0179\n\35\f\35\16\35\u017c\13\35\3\35\3\35\3\36\3\36\7\36"+
		"\u0182\n\36\f\36\16\36\u0185\13\36\3\36\3\36\3\37\3\37\7\37\u018b\n\37"+
		"\f\37\16\37\u018e\13\37\3\37\3\37\7\37\u0192\n\37\f\37\16\37\u0195\13"+
		"\37\3\37\3\37\7\37\u0199\n\37\f\37\16\37\u019c\13\37\3\37\3\37\3 \7 \u01a1"+
		"\n \f \16 \u01a4\13 \3 \3 \7 \u01a8\n \f \16 \u01ab\13 \3!\3!\3\"\3\""+
		"\5\"\u01b1\n\"\3#\3#\3$\3$\3$\3$\7$\u01b9\n$\f$\16$\u01bc\13$\3$\3$\3"+
		"%\3%\3&\3&\3\'\6\'\u01c5\n\'\r\'\16\'\u01c6\3(\3(\3)\3)\3*\3*\3*\3*\7"+
		"*\u01d1\n*\f*\16*\u01d4\13*\3*\3*\7*\u01d8\n*\f*\16*\u01db\13*\3*\3*\7"+
		"*\u01df\n*\f*\16*\u01e2\13*\5*\u01e4\n*\3*\3*\3+\3+\3,\3,\3,\3-\3-\5-"+
		"\u01ef\n-\3.\3.\3.\7.\u01f4\n.\f.\16.\u01f7\13.\3.\3.\3.\5.\u01fc\n.\3"+
		"/\3/\3/\7/\u0201\n/\f/\16/\u0204\13/\3/\3/\3\60\3\60\3\60\7\60\u020b\n"+
		"\60\f\60\16\60\u020e\13\60\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u0216\n"+
		"\61\3\62\3\62\7\62\u021a\n\62\f\62\16\62\u021d\13\62\3\62\3\62\3\63\3"+
		"\63\7\63\u0223\n\63\f\63\16\63\u0226\13\63\3\63\3\63\3\63\3\63\7\63\u022c"+
		"\n\63\f\63\16\63\u022f\13\63\3\63\3\63\7\63\u0233\n\63\f\63\16\63\u0236"+
		"\13\63\3\63\3\63\5\63\u023a\n\63\3\64\7\64\u023d\n\64\f\64\16\64\u0240"+
		"\13\64\3\64\3\64\7\64\u0244\n\64\f\64\16\64\u0247\13\64\3\64\3\64\5\64"+
		"\u024b\n\64\3\64\7\64\u024e\n\64\f\64\16\64\u0251\13\64\3\64\5\64\u0254"+
		"\n\64\3\64\7\64\u0257\n\64\f\64\16\64\u025a\13\64\3\64\3\64\5\64\u025e"+
		"\n\64\3\64\3\64\3\65\3\65\3\65\7\65\u0265\n\65\f\65\16\65\u0268\13\65"+
		"\3\65\3\65\7\65\u026c\n\65\f\65\16\65\u026f\13\65\3\65\5\65\u0272\n\65"+
		"\3\65\7\65\u0275\n\65\f\65\16\65\u0278\13\65\3\65\5\65\u027b\n\65\3\65"+
		"\7\65\u027e\n\65\f\65\16\65\u0281\13\65\3\65\3\65\3\66\7\66\u0286\n\66"+
		"\f\66\16\66\u0289\13\66\3\66\3\66\5\66\u028d\n\66\3\66\7\66\u0290\n\66"+
		"\f\66\16\66\u0293\13\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3:\3:\3:\3:"+
		"\7:\u02a3\n:\f:\16:\u02a6\13:\5:\u02a8\n:\3:\3:\3:\3:\3;\3;\3;\7;\u02b1"+
		"\n;\f;\16;\u02b4\13;\3;\5;\u02b7\n;\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3>\3"+
		">\3>\3?\3?\3@\7@\u02c9\n@\f@\16@\u02cc\13@\3@\3@\7@\u02d0\n@\f@\16@\u02d3"+
		"\13@\3A\7A\u02d6\nA\fA\16A\u02d9\13A\3A\3A\7A\u02dd\nA\fA\16A\u02e0\13"+
		"A\3B\7B\u02e3\nB\fB\16B\u02e6\13B\3B\3B\7B\u02ea\nB\fB\16B\u02ed\13B\3"+
		"C\7C\u02f0\nC\fC\16C\u02f3\13C\3C\3C\7C\u02f7\nC\fC\16C\u02fa\13C\3D\7"+
		"D\u02fd\nD\fD\16D\u0300\13D\3D\3D\7D\u0304\nD\fD\16D\u0307\13D\3E\7E\u030a"+
		"\nE\fE\16E\u030d\13E\3E\3E\7E\u0311\nE\fE\16E\u0314\13E\3F\7F\u0317\n"+
		"F\fF\16F\u031a\13F\3F\3F\7F\u031e\nF\fF\16F\u0321\13F\3G\7G\u0324\nG\f"+
		"G\16G\u0327\13G\3G\3G\7G\u032b\nG\fG\16G\u032e\13G\3H\7H\u0331\nH\fH\16"+
		"H\u0334\13H\3H\3H\7H\u0338\nH\fH\16H\u033b\13H\3I\7I\u033e\nI\fI\16I\u0341"+
		"\13I\3I\3I\7I\u0345\nI\fI\16I\u0348\13I\3J\7J\u034b\nJ\fJ\16J\u034e\13"+
		"J\3J\3J\7J\u0352\nJ\fJ\16J\u0355\13J\3K\7K\u0358\nK\fK\16K\u035b\13K\3"+
		"K\3K\7K\u035f\nK\fK\16K\u0362\13K\3L\7L\u0365\nL\fL\16L\u0368\13L\3L\3"+
		"L\7L\u036c\nL\fL\16L\u036f\13L\3M\7M\u0372\nM\fM\16M\u0375\13M\3M\3M\7"+
		"M\u0379\nM\fM\16M\u037c\13M\3N\7N\u037f\nN\fN\16N\u0382\13N\3N\3N\7N\u0386"+
		"\nN\fN\16N\u0389\13N\3O\7O\u038c\nO\fO\16O\u038f\13O\3O\3O\7O\u0393\n"+
		"O\fO\16O\u0396\13O\3P\3P\5P\u039a\nP\3P\2\5\34\36\"Q\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\2\f\6\2\67\67::<<@@\3\2\36\37\3\2"+
		" !\3\2\"#\3\2$%\3\2&\'\3\2(-\3\2\33\35\3\2\26\30\3\2\61\62\2\u03c5\2\u00a5"+
		"\3\2\2\2\4\u00a8\3\2\2\2\6\u00b3\3\2\2\2\b\u00b7\3\2\2\2\n\u00b9\3\2\2"+
		"\2\f\u00bb\3\2\2\2\16\u00d9\3\2\2\2\20\u00db\3\2\2\2\22\u00dd\3\2\2\2"+
		"\24\u00df\3\2\2\2\26\u00e1\3\2\2\2\30\u00e3\3\2\2\2\32\u00e6\3\2\2\2\34"+
		"\u00f2\3\2\2\2\36\u010c\3\2\2\2 \u0118\3\2\2\2\"\u0133\3\2\2\2$\u0154"+
		"\3\2\2\2&\u0156\3\2\2\2(\u0158\3\2\2\2*\u015a\3\2\2\2,\u015c\3\2\2\2."+
		"\u015e\3\2\2\2\60\u0160\3\2\2\2\62\u0162\3\2\2\2\64\u016b\3\2\2\2\66\u016d"+
		"\3\2\2\28\u016f\3\2\2\2:\u017f\3\2\2\2<\u0188\3\2\2\2>\u01a2\3\2\2\2@"+
		"\u01ac\3\2\2\2B\u01b0\3\2\2\2D\u01b2\3\2\2\2F\u01b4\3\2\2\2H\u01bf\3\2"+
		"\2\2J\u01c1\3\2\2\2L\u01c4\3\2\2\2N\u01c8\3\2\2\2P\u01ca\3\2\2\2R\u01cc"+
		"\3\2\2\2T\u01e7\3\2\2\2V\u01e9\3\2\2\2X\u01ee\3\2\2\2Z\u01fb\3\2\2\2\\"+
		"\u01fd\3\2\2\2^\u0207\3\2\2\2`\u0215\3\2\2\2b\u0217\3\2\2\2d\u0239\3\2"+
		"\2\2f\u023e\3\2\2\2h\u0261\3\2\2\2j\u0287\3\2\2\2l\u0294\3\2\2\2n\u0296"+
		"\3\2\2\2p\u0298\3\2\2\2r\u029b\3\2\2\2t\u02ad\3\2\2\2v\u02ba\3\2\2\2x"+
		"\u02bc\3\2\2\2z\u02bf\3\2\2\2|\u02c5\3\2\2\2~\u02ca\3\2\2\2\u0080\u02d7"+
		"\3\2\2\2\u0082\u02e4\3\2\2\2\u0084\u02f1\3\2\2\2\u0086\u02fe\3\2\2\2\u0088"+
		"\u030b\3\2\2\2\u008a\u0318\3\2\2\2\u008c\u0325\3\2\2\2\u008e\u0332\3\2"+
		"\2\2\u0090\u033f\3\2\2\2\u0092\u034c\3\2\2\2\u0094\u0359\3\2\2\2\u0096"+
		"\u0366\3\2\2\2\u0098\u0373\3\2\2\2\u009a\u0380\3\2\2\2\u009c\u038d\3\2"+
		"\2\2\u009e\u0399\3\2\2\2\u00a0\u00a4\5\34\17\2\u00a1\u00a4\5\36\20\2\u00a2"+
		"\u00a4\5\u009eP\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\n\6\2\u00a9\u00aa\5\6\4\2"+
		"\u00aa\u00ae\5\f\7\2\u00ab\u00ad\5\b\5\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\5\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4"+
		"\7\3\2\2\2\u00b5\u00b8\5\32\16\2\u00b6\u00b8\7>\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\t\3\2\2\2\u00b9\u00ba\79\2\2\u00ba\13\3\2"+
		"\2\2\u00bb\u00bc\7?\2\2\u00bc\r\3\2\2\2\u00bd\u00c1\5\20\t\2\u00be\u00c0"+
		"\5\32\16\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\5\22\n\2\u00c5\u00da\3\2\2\2\u00c6\u00ca\5\30\r\2\u00c7\u00c9\5\32\16"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7;\2\2\u00ce"+
		"\u00da\3\2\2\2\u00cf\u00d4\5\24\13\2\u00d0\u00d3\5\4\3\2\u00d1\u00d3\5"+
		"\32\16\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00da\3\2\2\2\u00d9\u00bd\3\2\2\2\u00d9"+
		"\u00c6\3\2\2\2\u00d9\u00cf\3\2\2\2\u00da\17\3\2\2\2\u00db\u00dc\7\4\2"+
		"\2\u00dc\21\3\2\2\2\u00dd\u00de\7\66\2\2\u00de\23\3\2\2\2\u00df\u00e0"+
		"\7\3\2\2\u00e0\25\3\2\2\2\u00e1\u00e2\78\2\2\u00e2\27\3\2\2\2\u00e3\u00e4"+
		"\7\5\2\2\u00e4\31\3\2\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\33\3\2\2"+
		"\2\u00ea\u00eb\b\17\1\2\u00eb\u00f3\5p9\2\u00ec\u00ed\5\62\32\2\u00ed"+
		"\u00ee\5 \21\2\u00ee\u00f3\3\2\2\2\u00ef\u00f0\5\u009eP\2\u00f0\u00f1"+
		"\5\34\17\4\u00f1\u00f3\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ec\3\2\2\2"+
		"\u00f2\u00ef\3\2\2\2\u00f3\u00f8\3\2\2\2\u00f4\u00f5\f\3\2\2\u00f5\u00f7"+
		"\5\u009eP\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2"+
		"\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc"+
		"\b\20\1\2\u00fc\u00fd\5\u009eP\2\u00fd\u00fe\5\36\20\t\u00fe\u010d\3\2"+
		"\2\2\u00ff\u0100\58\35\2\u0100\u0101\5 \21\2\u0101\u010d\3\2\2\2\u0102"+
		"\u0103\5:\36\2\u0103\u0104\5 \21\2\u0104\u010d\3\2\2\2\u0105\u0106\5<"+
		"\37\2\u0106\u0107\5 \21\2\u0107\u010d\3\2\2\2\u0108\u0109\5R*\2\u0109"+
		"\u010a\5 \21\2\u010a\u010d\3\2\2\2\u010b\u010d\5V,\2\u010c\u00fb\3\2\2"+
		"\2\u010c\u00ff\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u0108"+
		"\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u0112\3\2\2\2\u010e\u010f\f\b\2\2\u010f"+
		"\u0111\5\u009eP\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\37\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0117\5\u009eP\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011f\7\b\2\2\u011c\u011e\5\u009eP\2\u011d\u011c\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120!\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\b\22\1\2\u0123\u0124\5\u009eP\2\u0124\u0125"+
		"\5\"\22\20\u0125\u0134\3\2\2\2\u0126\u0127\5\u0084C\2\u0127\u0128\5\""+
		"\22\2\u0128\u0129\5\u0086D\2\u0129\u0134\3\2\2\2\u012a\u0134\5x=\2\u012b"+
		"\u012c\5\60\31\2\u012c\u012d\5\u0084C\2\u012d\u012e\5\"\22\2\u012e\u012f"+
		"\5\u0086D\2\u012f\u0134\3\2\2\2\u0130\u0134\5B\"\2\u0131\u0134\5@!\2\u0132"+
		"\u0134\5R*\2\u0133\u0122\3\2\2\2\u0133\u0126\3\2\2\2\u0133\u012a\3\2\2"+
		"\2\u0133\u012b\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0151\3\2\2\2\u0135\u0136\f\f\2\2\u0136\u0137\5$\23\2\u0137"+
		"\u0138\5\"\22\r\u0138\u0150\3\2\2\2\u0139\u013a\f\13\2\2\u013a\u013b\5"+
		"&\24\2\u013b\u013c\5\"\22\f\u013c\u0150\3\2\2\2\u013d\u013e\f\n\2\2\u013e"+
		"\u013f\5(\25\2\u013f\u0140\5\"\22\13\u0140\u0150\3\2\2\2\u0141\u0142\f"+
		"\t\2\2\u0142\u0143\5*\26\2\u0143\u0144\5\"\22\n\u0144\u0150\3\2\2\2\u0145"+
		"\u0146\f\b\2\2\u0146\u0147\5,\27\2\u0147\u0148\5\"\22\t\u0148\u0150\3"+
		"\2\2\2\u0149\u014a\f\7\2\2\u014a\u014b\5.\30\2\u014b\u014c\5\"\22\b\u014c"+
		"\u0150\3\2\2\2\u014d\u014e\f\17\2\2\u014e\u0150\5\u009eP\2\u014f\u0135"+
		"\3\2\2\2\u014f\u0139\3\2\2\2\u014f\u013d\3\2\2\2\u014f\u0141\3\2\2\2\u014f"+
		"\u0145\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152#\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0154\u0155\t\3\2\2\u0155%\3\2\2\2\u0156\u0157\t\4\2\2\u0157"+
		"\'\3\2\2\2\u0158\u0159\t\5\2\2\u0159)\3\2\2\2\u015a\u015b\t\6\2\2\u015b"+
		"+\3\2\2\2\u015c\u015d\t\7\2\2\u015d-\3\2\2\2\u015e\u015f\t\b\2\2\u015f"+
		"/\3\2\2\2\u0160\u0161\t\t\2\2\u0161\61\3\2\2\2\u0162\u0166\5\64\33\2\u0163"+
		"\u0165\5\u009eP\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\5\66\34\2\u016a\63\3\2\2\2\u016b\u016c\7\6\2\2\u016c\65\3\2\2\2"+
		"\u016d\u016e\7\63\2\2\u016e\67\3\2\2\2\u016f\u0173\5@!\2\u0170\u0172\5"+
		"\u009eP\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017a"+
		"\5\u009cO\2\u0177\u0179\5\u009eP\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017e\5\"\22\2\u017e9\3\2\2\2\u017f\u0183\5> \2\u0180"+
		"\u0182\5\u009eP\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0187\5@!\2\u0187;\3\2\2\2\u0188\u018c\5> \2\u0189\u018b\5\u009eP\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0193\5@!\2\u0190\u0192"+
		"\5\u009eP\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u019a"+
		"\5\u009cO\2\u0197\u0199\5\u009eP\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019e\5\"\22\2\u019e=\3\2\2\2\u019f\u01a1\5\u009e"+
		"P\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a9\t\n"+
		"\2\2\u01a6\u01a8\5\u009eP\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa?\3\2\2\2\u01ab\u01a9\3\2\2\2"+
		"\u01ac\u01ad\7\63\2\2\u01adA\3\2\2\2\u01ae\u01b1\5D#\2\u01af\u01b1\5F"+
		"$\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1C\3\2\2\2\u01b2\u01b3"+
		"\t\13\2\2\u01b3E\3\2\2\2\u01b4\u01ba\5H%\2\u01b5\u01b9\5L\'\2\u01b6\u01b9"+
		"\5N(\2\u01b7\u01b9\5P)\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\5J&\2\u01beG"+
		"\3\2\2\2\u01bf\u01c0\7\65\2\2\u01c0I\3\2\2\2\u01c1\u01c2\7A\2\2\u01c2"+
		"K\3\2\2\2\u01c3\u01c5\7D\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7M\3\2\2\2\u01c8\u01c9\7B\2\2\u01c9"+
		"O\3\2\2\2\u01ca\u01cb\7C\2\2\u01cbQ\3\2\2\2\u01cc\u01cd\5T+\2\u01cd\u01e3"+
		"\5\u0084C\2\u01ce\u01e0\5\"\22\2\u01cf\u01d1\5\u009eP\2\u01d0\u01cf\3"+
		"\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d9\5|?\2\u01d6\u01d8\5\u009e"+
		"P\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\5\""+
		"\22\2\u01dd\u01df\3\2\2\2\u01de\u01d2\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01ce\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e6\5\u0086D\2\u01e6S\3\2\2\2\u01e7\u01e8\7\63\2\2\u01e8U\3\2\2\2\u01e9"+
		"\u01ea\5X-\2\u01ea\u01eb\5`\61\2\u01ebW\3\2\2\2\u01ec\u01ef\5Z.\2\u01ed"+
		"\u01ef\5\\/\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01efY\3\2\2\2\u01f0"+
		"\u01f1\5l\67\2\u01f1\u01f5\5\u0084C\2\u01f2\u01f4\5\"\22\2\u01f3\u01f2"+
		"\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\5\u0086D\2\u01f9\u01fc"+
		"\3\2\2\2\u01fa\u01fc\5^\60\2\u01fb\u01f0\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"[\3\2\2\2\u01fd\u01fe\5n8\2\u01fe\u0202\5\u0084C\2\u01ff\u0201\5\"\22"+
		"\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\5\u0086D"+
		"\2\u0206]\3\2\2\2\u0207\u0208\5\u008cG\2\u0208\u020c\5\u0084C\2\u0209"+
		"\u020b\5\"\22\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3"+
		"\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f"+
		"\u0210\5\u0086D\2\u0210_\3\2\2\2\u0211\u0216\5b\62\2\u0212\u0216\5d\63"+
		"\2\u0213\u0216\5f\64\2\u0214\u0216\5\36\20\2\u0215\u0211\3\2\2\2\u0215"+
		"\u0212\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216a\3\2\2\2"+
		"\u0217\u021b\5\u0088E\2\u0218\u021a\5\36\20\2\u0219\u0218\3\2\2\2\u021a"+
		"\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021e\u021f\5\u009aN\2\u021fc\3\2\2\2\u0220\u0224"+
		"\5\u008aF\2\u0221\u0223\5\36\20\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2"+
		"\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0228\5\u0098M\2\u0228\u023a\3\2\2\2\u0229\u022d"+
		"\5\u008aF\2\u022a\u022c\5\36\20\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2"+
		"\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0234\5\u0096L\2\u0231\u0233\5\36\20\2\u0232\u0231"+
		"\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\5\u0098M\2\u0238\u023a"+
		"\3\2\2\2\u0239\u0220\3\2\2\2\u0239\u0229\3\2\2\2\u023ae\3\2\2\2\u023b"+
		"\u023d\5h\65\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u025d\3\2\2\2\u0240\u023e\3\2\2\2\u0241"+
		"\u0245\5\u0092J\2\u0242\u0244\5\u009eP\2\u0243\u0242\3\2\2\2\u0244\u0247"+
		"\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024a\5~@\2\u0249\u024b\5\u0088E\2\u024a\u0249\3"+
		"\2\2\2\u024a\u024b\3\2\2\2\u024b\u024f\3\2\2\2\u024c\u024e\5\36\20\2\u024d"+
		"\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0254\5\u0090I\2\u0253"+
		"\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0258\3\2\2\2\u0255\u0257\5\u009e"+
		"P\2\u0256\u0255\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\5 "+
		"\21\2\u025c\u025e\3\2\2\2\u025d\u0241\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025f\u0260\5\u0094K\2\u0260g\3\2\2\2\u0261\u0262\5\u008e"+
		"H\2\u0262\u0266\5B\"\2\u0263\u0265\5\u009eP\2\u0264\u0263\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2"+
		"\2\2\u0268\u0266\3\2\2\2\u0269\u026d\5~@\2\u026a\u026c\5\u009eP\2\u026b"+
		"\u026a\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272\5\u0088E\2\u0271"+
		"\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0276\3\2\2\2\u0273\u0275\5\36"+
		"\20\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\5\u0090"+
		"I\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027f\3\2\2\2\u027c"+
		"\u027e\5\u009eP\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d"+
		"\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281\u027f\3\2\2\2\u0282"+
		"\u0283\5 \21\2\u0283i\3\2\2\2\u0284\u0286\5\u009eP\2\u0285\u0284\3\2\2"+
		"\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028c"+
		"\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028d\5l\67\2\u028b\u028d\5n8\2\u028c"+
		"\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u0291\3\2\2\2\u028e\u0290\5\u009e"+
		"P\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292k\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0295\7\31\2\2"+
		"\u0295m\3\2\2\2\u0296\u0297\7\32\2\2\u0297o\3\2\2\2\u0298\u0299\5r:\2"+
		"\u0299\u029a\5t;\2\u029aq\3\2\2\2\u029b\u029c\5\u0082B\2\u029c\u029d\5"+
		"v<\2\u029d\u02a7\5\u0084C\2\u029e\u02a4\5:\36\2\u029f\u02a0\5|?\2\u02a0"+
		"\u02a1\5:\36\2\u02a1\u02a3\3\2\2\2\u02a2\u029f\3\2\2\2\u02a3\u02a6\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a7\u029e\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02aa\5\u0086D\2\u02aa\u02ab\5~@\2\u02ab\u02ac\5> \2\u02ac"+
		"s\3\2\2\2\u02ad\u02b2\5\u0088E\2\u02ae\u02b1\5\36\20\2\u02af\u02b1\5t"+
		";\2\u02b0\u02ae\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2"+
		"\2\2\u02b5\u02b7\5z>\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02b9\5\u009aN\2\u02b9u\3\2\2\2\u02ba\u02bb\7\63\2\2\u02bb"+
		"w\3\2\2\2\u02bc\u02bd\5> \2\u02bd\u02be\5@!\2\u02bey\3\2\2\2\u02bf\u02c0"+
		"\5\u0080A\2\u02c0\u02c1\5\u0084C\2\u02c1\u02c2\5\"\22\2\u02c2\u02c3\5"+
		"\u0086D\2\u02c3\u02c4\5 \21\2\u02c4{\3\2\2\2\u02c5\u02c6\7\60\2\2\u02c6"+
		"}\3\2\2\2\u02c7\u02c9\5\u009eP\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3\2\2"+
		"\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ca"+
		"\3\2\2\2\u02cd\u02d1\7\t\2\2\u02ce\u02d0\5\u009eP\2\u02cf\u02ce\3\2\2"+
		"\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\177"+
		"\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d6\5\u009eP\2\u02d5\u02d4\3\2\2"+
		"\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02de\7\n\2\2\u02db\u02dd\5\u009eP"+
		"\2\u02dc\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u0081\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\5\u009eP"+
		"\2\u02e2\u02e1\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5"+
		"\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02eb\7\13\2\2"+
		"\u02e8\u02ea\5\u009eP\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u0083\3\2\2\2\u02ed\u02eb\3\2"+
		"\2\2\u02ee\u02f0\5\u009eP\2\u02ef\u02ee\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1"+
		"\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f1\3\2"+
		"\2\2\u02f4\u02f8\7.\2\2\u02f5\u02f7\5\u009eP\2\u02f6\u02f5\3\2\2\2\u02f7"+
		"\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0085\3\2"+
		"\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fd\5\u009eP\2\u02fc\u02fb\3\2\2\2\u02fd"+
		"\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2"+
		"\2\2\u0300\u02fe\3\2\2\2\u0301\u0305\7/\2\2\u0302\u0304\5\u009eP\2\u0303"+
		"\u0302\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2"+
		"\2\2\u0306\u0087\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u030a\5\u009eP\2\u0309"+
		"\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2"+
		"\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0312\7\21\2\2\u030f"+
		"\u0311\5\u009eP\2\u0310\u030f\3\2\2\2\u0311\u0314\3\2\2\2\u0312\u0310"+
		"\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0089\3\2\2\2\u0314\u0312\3\2\2\2\u0315"+
		"\u0317\5\u009eP\2\u0316\u0315\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0318\3\2\2\2\u031b"+
		"\u031f\7\23\2\2\u031c\u031e\5\u009eP\2\u031d\u031c\3\2\2\2\u031e\u0321"+
		"\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u008b\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0322\u0324\5\u009eP\2\u0323\u0322\3\2\2\2\u0324\u0327"+
		"\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0328\u032c\7\f\2\2\u0329\u032b\5\u009eP\2\u032a\u0329"+
		"\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u008d\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u0331\5\u009eP\2\u0330\u032f"+
		"\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0339\7\17\2\2\u0336\u0338\5"+
		"\u009eP\2\u0337\u0336\3\2\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2"+
		"\u0339\u033a\3\2\2\2\u033a\u008f\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u033e"+
		"\5\u009eP\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2"+
		"\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0346"+
		"\7\20\2\2\u0343\u0345\5\u009eP\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2\2"+
		"\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0091\3\2\2\2\u0348\u0346"+
		"\3\2\2\2\u0349\u034b\5\u009eP\2\u034a\u0349\3\2\2\2\u034b\u034e\3\2\2"+
		"\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u034c"+
		"\3\2\2\2\u034f\u0353\7\r\2\2\u0350\u0352\5\u009eP\2\u0351\u0350\3\2\2"+
		"\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0093"+
		"\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0358\5\u009eP\2\u0357\u0356\3\2\2"+
		"\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c"+
		"\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u0360\7\16\2\2\u035d\u035f\5\u009e"+
		"P\2\u035e\u035d\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0095\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0365\5\u009e"+
		"P\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036d\7\24"+
		"\2\2\u036a\u036c\5\u009eP\2\u036b\u036a\3\2\2\2\u036c\u036f\3\2\2\2\u036d"+
		"\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0097\3\2\2\2\u036f\u036d\3\2"+
		"\2\2\u0370\u0372\5\u009eP\2\u0371\u0370\3\2\2\2\u0372\u0375\3\2\2\2\u0373"+
		"\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0373\3\2"+
		"\2\2\u0376\u037a\7\25\2\2\u0377\u0379\5\u009eP\2\u0378\u0377\3\2\2\2\u0379"+
		"\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0099\3\2"+
		"\2\2\u037c\u037a\3\2\2\2\u037d\u037f\5\u009eP\2\u037e\u037d\3\2\2\2\u037f"+
		"\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2"+
		"\2\2\u0382\u0380\3\2\2\2\u0383\u0387\7\22\2\2\u0384\u0386\5\u009eP\2\u0385"+
		"\u0384\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2"+
		"\2\2\u0388\u009b\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u038c\5\u009eP\2\u038b"+
		"\u038a\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0394\7\7\2\2\u0391"+
		"\u0393\5\u009eP\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u009d\3\2\2\2\u0396\u0394\3\2\2\2\u0397"+
		"\u039a\5\16\b\2\u0398\u039a\7\64\2\2\u0399\u0397\3\2\2\2\u0399\u0398\3"+
		"\2\2\2\u039a\u009f\3\2\2\2g\u00a3\u00a5\u00ae\u00b7\u00c1\u00ca\u00d2"+
		"\u00d4\u00d9\u00e8\u00f2\u00f8\u010c\u0112\u0118\u011f\u0133\u014f\u0151"+
		"\u0166\u0173\u017a\u0183\u018c\u0193\u019a\u01a2\u01a9\u01b0\u01b8\u01ba"+
		"\u01c6\u01d2\u01d9\u01e0\u01e3\u01ee\u01f5\u01fb\u0202\u020c\u0215\u021b"+
		"\u0224\u022d\u0234\u0239\u023e\u0245\u024a\u024f\u0253\u0258\u025d\u0266"+
		"\u026d\u0271\u0276\u027a\u027f\u0287\u028c\u0291\u02a4\u02a7\u02b0\u02b2"+
		"\u02b6\u02ca\u02d1\u02d7\u02de\u02e4\u02eb\u02f1\u02f8\u02fe\u0305\u030b"+
		"\u0312\u0318\u031f\u0325\u032c\u0332\u0339\u033f\u0346\u034c\u0353\u0359"+
		"\u0360\u0366\u036d\u0373\u037a\u0380\u0387\u038d\u0394\u0399";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}