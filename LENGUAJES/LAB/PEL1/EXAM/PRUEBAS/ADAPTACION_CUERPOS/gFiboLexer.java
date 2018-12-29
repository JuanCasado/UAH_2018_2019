// Generated from gFiboLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gFiboLexer extends Lexer {
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
		COMMENT_MULTILINE=1, INFORMATION=2, COMMENT_LINE=3, TAG=4, STR_MODE=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMMENT_MULTILINE", "INFORMATION", "COMMENT_LINE", "TAG", 
		"STR_MODE"
	};

	public static final String[] ruleNames = {
		"INFORMATION_START", "COMMENT_BLOCK_START", "COMMENT_BLOCK_START_DOUBLE", 
		"COMMENT_BLOCK_START_SIMPLE", "COMMENT_LINE_START", "INCLUDE_START", "ASSIGN", 
		"END", "RETURN_TYPE", "RETURN", "DECLARATION", "BODY_START", "BODY_END", 
		"INTEGER", "STRING", "VOID", "WHILE", "IF", "COS", "SEN", "TAN", "POW", 
		"SQRT", "MUL", "DIV", "ADD", "SUB", "OR", "AND", "OR_B", "AND_B", "MIN", 
		"MAX", "MINEQ", "MAXEQ", "EQ", "NEQ", "ARGUMENT_START", "ARGUMENT_END", 
		"SEPARATOR", "INT", "FLOAT", "VAR", "LETTER", "NUMBER", "WS", "STR_START", 
		"COMMENT_BLOCK_END", "COMMENT_BLOCK_END_DOUBLE", "COMMENT_BLOCK_END_SIMPLE", 
		"TXT_MULTILINE", "INFORMATION_END", "TAG_START", "TXT_INFORMATION", "COMMENT_LINE_END", 
		"TXT_LINE", "TAG_END", "TAG_ID", "AUTHOR", "DESCRIPTION", "TARGET", "TAG_LIMIT", 
		"TXT_TAG", "STR_END", "ESC", "STR_VAR", "INICIO_STR_VAR", "STR_TXT"
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


	public gFiboLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gFiboLexer.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01c8\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t"+
		"\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t"+
		":\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\u009a\n\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u012a\n*\r*\16*\u012b\3+\6"+
		"+\u012f\n+\r+\16+\u0130\3+\3+\7+\u0135\n+\f+\16+\u0138\13+\3+\7+\u013b"+
		"\n+\f+\16+\u013e\13+\3+\3+\6+\u0142\n+\r+\16+\u0143\5+\u0146\n+\3,\3,"+
		"\3,\7,\u014b\n,\f,\16,\u014e\13,\3-\3-\3.\3.\3/\6/\u0155\n/\r/\16/\u0156"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u015f\n\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\6\64\u016b\n\64\r\64\16\64\u016c\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\6\67\u017b\n\67\r\67"+
		"\16\67\u017c\38\68\u0180\n8\r8\168\u0181\38\38\39\69\u0187\n9\r9\169\u0188"+
		"\3:\6:\u018c\n:\r:\16:\u018d\3:\3:\3;\3;\3;\5;\u0195\n;\3<\3<\3<\3<\3"+
		"<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3"+
		"?\3@\6@\u01b4\n@\r@\16@\u01b5\3A\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\6"+
		"E\u01c5\nE\rE\16E\u01c6\7\u016c\u017c\u0188\u01b5\u01c6\2F\b\3\n\4\f\2"+
		"\16\2\20\5\22\6\24\7\26\b\30\t\32\n\34\13\36\f \r\"\16$\17&\20(\21*\22"+
		",\23.\24\60\25\62\26\64\27\66\308\31:\32<\33>\34@\35B\36D\37F H!J\"L#"+
		"N$P%R&T\'V(X)Z*\\+^\2`\2b,d-f.h\2j\2l/n\60p\61r\62t\63v\64x\65z\66|\2"+
		"~\2\u0080\2\u0082\67\u00848\u00869\u0088:\u008a;\u008c\2\u008e<\b\2\3"+
		"\4\5\6\7\7\4\2C\\c|\3\2\62;\5\2\n\f\17\17\"\"\4\2\f\f\17\17\b\2$$^^dd"+
		"ppttvv\2\u01cc\2\b\3\2\2\2\2\n\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2"+
		"\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2"+
		"\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3"+
		"\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2"+
		"\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2"+
		"P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3"+
		"\2\2\2\2b\3\2\2\2\2d\3\2\2\2\3f\3\2\2\2\3l\3\2\2\2\4n\3\2\2\2\4p\3\2\2"+
		"\2\4r\3\2\2\2\5t\3\2\2\2\5v\3\2\2\2\6x\3\2\2\2\6z\3\2\2\2\6\u0082\3\2"+
		"\2\2\6\u0084\3\2\2\2\7\u0086\3\2\2\2\7\u0088\3\2\2\2\7\u008a\3\2\2\2\7"+
		"\u008e\3\2\2\2\b\u0090\3\2\2\2\n\u0099\3\2\2\2\f\u009d\3\2\2\2\16\u00a1"+
		"\3\2\2\2\20\u00a4\3\2\2\2\22\u00a9\3\2\2\2\24\u00b1\3\2\2\2\26\u00b4\3"+
		"\2\2\2\30\u00b6\3\2\2\2\32\u00b8\3\2\2\2\34\u00c1\3\2\2\2\36\u00ca\3\2"+
		"\2\2 \u00d0\3\2\2\2\"\u00d4\3\2\2\2$\u00db\3\2\2\2&\u00e2\3\2\2\2(\u00e7"+
		"\3\2\2\2*\u00ed\3\2\2\2,\u00f0\3\2\2\2.\u00f4\3\2\2\2\60\u00f8\3\2\2\2"+
		"\62\u00fc\3\2\2\2\64\u00fe\3\2\2\2\66\u0100\3\2\2\28\u0102\3\2\2\2:\u0104"+
		"\3\2\2\2<\u0106\3\2\2\2>\u0108\3\2\2\2@\u010b\3\2\2\2B\u010e\3\2\2\2D"+
		"\u0110\3\2\2\2F\u0112\3\2\2\2H\u0114\3\2\2\2J\u0116\3\2\2\2L\u0119\3\2"+
		"\2\2N\u011c\3\2\2\2P\u011f\3\2\2\2R\u0122\3\2\2\2T\u0124\3\2\2\2V\u0126"+
		"\3\2\2\2X\u0129\3\2\2\2Z\u0145\3\2\2\2\\\u0147\3\2\2\2^\u014f\3\2\2\2"+
		"`\u0151\3\2\2\2b\u0154\3\2\2\2d\u0158\3\2\2\2f\u015e\3\2\2\2h\u0162\3"+
		"\2\2\2j\u0166\3\2\2\2l\u016a\3\2\2\2n\u016e\3\2\2\2p\u0175\3\2\2\2r\u017a"+
		"\3\2\2\2t\u017f\3\2\2\2v\u0186\3\2\2\2x\u018b\3\2\2\2z\u0194\3\2\2\2|"+
		"\u0196\3\2\2\2~\u019d\3\2\2\2\u0080\u01a9\3\2\2\2\u0082\u01b0\3\2\2\2"+
		"\u0084\u01b3\3\2\2\2\u0086\u01b7\3\2\2\2\u0088\u01bb\3\2\2\2\u008a\u01be"+
		"\3\2\2\2\u008c\u01c1\3\2\2\2\u008e\u01c4\3\2\2\2\u0090\u0091\7\61\2\2"+
		"\u0091\u0092\7,\2\2\u0092\u0093\7,\2\2\u0093\u0094\7,\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\b\2\2\2\u0096\t\3\2\2\2\u0097\u009a\5\f\4\2\u0098"+
		"\u009a\5\16\5\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\b\3\3\2\u009c\13\3\2\2\2\u009d\u009e\7\61\2\2\u009e"+
		"\u009f\7,\2\2\u009f\u00a0\7,\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\7\61\2\2"+
		"\u00a2\u00a3\7,\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6"+
		"\7\61\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\6\4\2\u00a8\21\3\2\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7n\2\2"+
		"\u00ad\u00ae\7w\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2\u00b0\23\3\2"+
		"\2\2\u00b1\u00b2\7<\2\2\u00b2\u00b3\7?\2\2\u00b3\25\3\2\2\2\u00b4\u00b5"+
		"\7=\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7<\2\2\u00b7\31\3\2\2\2\u00b8\u00b9"+
		"\7f\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7x\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2"+
		"\u00c0\33\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7"+
		"p\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7p\2\2\u00c9\35\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\37\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7f\2\2\u00d3"+
		"!\3\2\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7o\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7q\2\2\u00da#\3\2\2\2\u00db"+
		"\u00dc\7e\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7g\2\2"+
		"\u00df\u00e0\7p\2\2\u00e0\u00e1\7c\2\2\u00e1%\3\2\2\2\u00e2\u00e3\7x\2"+
		"\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7f\2\2\u00e6\'\3"+
		"\2\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea\7k\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7g\2\2\u00ec)\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7h\2\2\u00ef+\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7u\2\2\u00f3-\3\2\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7/\3\2\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7c\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\61\3\2\2\2\u00fc\u00fd\7`\2\2\u00fd\63\3\2\2\2\u00fe"+
		"\u00ff\7B\2\2\u00ff\65\3\2\2\2\u0100\u0101\7,\2\2\u0101\67\3\2\2\2\u0102"+
		"\u0103\7\61\2\2\u01039\3\2\2\2\u0104\u0105\7-\2\2\u0105;\3\2\2\2\u0106"+
		"\u0107\7/\2\2\u0107=\3\2\2\2\u0108\u0109\7~\2\2\u0109\u010a\7~\2\2\u010a"+
		"?\3\2\2\2\u010b\u010c\7(\2\2\u010c\u010d\7(\2\2\u010dA\3\2\2\2\u010e\u010f"+
		"\7~\2\2\u010fC\3\2\2\2\u0110\u0111\7(\2\2\u0111E\3\2\2\2\u0112\u0113\7"+
		">\2\2\u0113G\3\2\2\2\u0114\u0115\7@\2\2\u0115I\3\2\2\2\u0116\u0117\7>"+
		"\2\2\u0117\u0118\7?\2\2\u0118K\3\2\2\2\u0119\u011a\7@\2\2\u011a\u011b"+
		"\7?\2\2\u011bM\3\2\2\2\u011c\u011d\7?\2\2\u011d\u011e\7?\2\2\u011eO\3"+
		"\2\2\2\u011f\u0120\7#\2\2\u0120\u0121\7?\2\2\u0121Q\3\2\2\2\u0122\u0123"+
		"\7*\2\2\u0123S\3\2\2\2\u0124\u0125\7+\2\2\u0125U\3\2\2\2\u0126\u0127\7"+
		".\2\2\u0127W\3\2\2\2\u0128\u012a\5`.\2\u0129\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012cY\3\2\2\2\u012d"+
		"\u012f\5`.\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2"+
		"\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0136\7\60\2\2\u0133"+
		"\u0135\5`.\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137\u0146\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b"+
		"\5`.\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\60"+
		"\2\2\u0140\u0142\5`.\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u012e\3\2\2\2\u0145"+
		"\u013c\3\2\2\2\u0146[\3\2\2\2\u0147\u014c\5^-\2\u0148\u014b\5^-\2\u0149"+
		"\u014b\5`.\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d]\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0150\t\2\2\2\u0150_\3\2\2\2\u0151\u0152\t\3\2\2\u0152"+
		"a\3\2\2\2\u0153\u0155\t\4\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2"+
		"\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157c\3\2\2\2\u0158\u0159\7"+
		"$\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\60\5\2\u015be\3\2\2\2\u015c\u015f"+
		"\5h\62\2\u015d\u015f\5j\63\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\b\61\6\2\u0161g\3\2\2\2\u0162\u0163\7,\2\2"+
		"\u0163\u0164\7,\2\2\u0164\u0165\7\61\2\2\u0165i\3\2\2\2\u0166\u0167\7"+
		",\2\2\u0167\u0168\7\61\2\2\u0168k\3\2\2\2\u0169\u016b\13\2\2\2\u016a\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"m\3\2\2\2\u016e\u016f\7,\2\2\u016f\u0170\7,\2\2\u0170\u0171\7,\2\2\u0171"+
		"\u0172\7\61\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b\65\6\2\u0174o\3\2\2"+
		"\2\u0175\u0176\7B\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\66\7\2\u0178q"+
		"\3\2\2\2\u0179\u017b\13\2\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017ds\3\2\2\2\u017e\u0180\t"+
		"\5\2\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b8\6\2\u0184u\3\2\2\2\u0185"+
		"\u0187\13\2\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3"+
		"\2\2\2\u0188\u0186\3\2\2\2\u0189w\3\2\2\2\u018a\u018c\t\5\2\2\u018b\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\b:\6\2\u0190y\3\2\2\2\u0191\u0195\5|<\2\u0192"+
		"\u0195\5~=\2\u0193\u0195\5\u0080>\2\u0194\u0191\3\2\2\2\u0194\u0192\3"+
		"\2\2\2\u0194\u0193\3\2\2\2\u0195{\3\2\2\2\u0196\u0197\7c\2\2\u0197\u0198"+
		"\7w\2\2\u0198\u0199\7v\2\2\u0199\u019a\7j\2\2\u019a\u019b\7q\2\2\u019b"+
		"\u019c\7t\2\2\u019c}\3\2\2\2\u019d\u019e\7f\2\2\u019e\u019f\7g\2\2\u019f"+
		"\u01a0\7u\2\2\u01a0\u01a1\7e\2\2\u01a1\u01a2\7t\2\2\u01a2\u01a3\7k\2\2"+
		"\u01a3\u01a4\7r\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7"+
		"\7q\2\2\u01a7\u01a8\7p\2\2\u01a8\177\3\2\2\2\u01a9\u01aa\7v\2\2\u01aa"+
		"\u01ab\7c\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7i\2\2\u01ad\u01ae\7g\2\2"+
		"\u01ae\u01af\7v\2\2\u01af\u0081\3\2\2\2\u01b0\u01b1\7<\2\2\u01b1\u0083"+
		"\3\2\2\2\u01b2\u01b4\13\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2"+
		"\u01b5\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u0085\3\2\2\2\u01b7\u01b8"+
		"\7$\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\bA\6\2\u01ba\u0087\3\2\2\2\u01bb"+
		"\u01bc\7^\2\2\u01bc\u01bd\t\6\2\2\u01bd\u0089\3\2\2\2\u01be\u01bf\5\u008c"+
		"D\2\u01bf\u01c0\t\2\2\2\u01c0\u008b\3\2\2\2\u01c1\u01c2\7\'\2\2\u01c2"+
		"\u008d\3\2\2\2\u01c3\u01c5\13\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3"+
		"\2\2\2\u01c6\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u008f\3\2\2\2\33"+
		"\2\3\4\5\6\7\u0099\u012b\u0130\u0136\u013c\u0143\u0145\u014a\u014c\u0156"+
		"\u015e\u016c\u017c\u0181\u0188\u018d\u0194\u01b5\u01c6\b\7\4\2\7\3\2\7"+
		"\5\2\7\7\2\6\2\2\7\6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}