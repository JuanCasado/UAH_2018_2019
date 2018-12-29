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
		"END", "RETURN_TYPE", "RETURN", "DECLARATION", "SWITCH", "DEFAULT", "END_SWITCH", 
		"CASE", "BREAK", "BODY_START", "BODY_END", "IF_START", "ELSE", "IF_END", 
		"INTEGER", "STRING", "VOID", "WHILE", "IF", "COS", "SEN", "TAN", "POW", 
		"SQRT", "MUL", "DIV", "ADD", "SUB", "OR", "AND", "OR_B", "AND_B", "MIN", 
		"MAX", "MINEQ", "MAXEQ", "EQ", "NEQ", "ARGUMENT_START", "ARGUMENT_END", 
		"SEPARATOR", "INT", "FLOAT", "VAR", "LETTER", "NUMBER", "UNDER", "WS", 
		"STR_START", "COMMENT_BLOCK_END", "COMMENT_BLOCK_END_DOUBLE", "COMMENT_BLOCK_END_SIMPLE", 
		"TXT_MULTILINE", "INFORMATION_END", "TAG_START", "TXT_INFORMATION", "COMMENT_LINE_END", 
		"TXT_LINE", "TAG_END", "TAG_ID", "AUTHOR", "DESCRIPTION", "TARGET", "TAG_LIMIT", 
		"TXT_TAG", "STR_END", "ESC", "STR_VAR", "INICIO_STR_VAR", "STR_TXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u0212\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t"+
		"\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t"+
		":\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4"+
		"F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\5\3\u00ac\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\6\62\u0171\n\62\r"+
		"\62\16\62\u0172\3\63\6\63\u0176\n\63\r\63\16\63\u0177\3\63\3\63\7\63\u017c"+
		"\n\63\f\63\16\63\u017f\13\63\3\63\7\63\u0182\n\63\f\63\16\63\u0185\13"+
		"\63\3\63\3\63\6\63\u0189\n\63\r\63\16\63\u018a\5\63\u018d\n\63\3\64\3"+
		"\64\3\64\3\64\7\64\u0193\n\64\f\64\16\64\u0196\13\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\38\68\u019f\n8\r8\168\u01a0\39\39\39\39\3:\3:\5:\u01a9\n"+
		":\3:\3:\3;\3;\3;\3;\3<\3<\3<\3=\6=\u01b5\n=\r=\16=\u01b6\3>\3>\3>\3>\3"+
		">\3>\3>\3?\3?\3?\3?\3@\6@\u01c5\n@\r@\16@\u01c6\3A\6A\u01ca\nA\rA\16A"+
		"\u01cb\3A\3A\3B\6B\u01d1\nB\rB\16B\u01d2\3C\6C\u01d6\nC\rC\16C\u01d7\3"+
		"C\3C\3D\3D\3D\5D\u01df\nD\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3I\6I\u01fe\nI\rI\16I\u01ff\3"+
		"J\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3N\6N\u020f\nN\rN\16N\u0210\7\u01b6"+
		"\u01c6\u01d2\u01ff\u0210\2O\b\3\n\4\f\2\16\2\20\5\22\6\24\7\26\b\30\t"+
		"\32\n\34\13\36\f \r\"\16$\17&\20(\21*\22,\23.\24\60\25\62\26\64\27\66"+
		"\308\31:\32<\33>\34@\35B\36D\37F H!J\"L#N$P%R&T\'V(X)Z*\\+^,`-b.d/f\60"+
		"h\61j\62l\63n\2p\2r\2t\64v\65x\66z\2|\2~\67\u00808\u00829\u0084:\u0086"+
		";\u0088<\u008a=\u008c>\u008e\2\u0090\2\u0092\2\u0094?\u0096@\u0098A\u009a"+
		"B\u009cC\u009e\2\u00a0D\b\2\3\4\5\6\7\7\4\2C\\c|\3\2\62;\5\2\n\f\17\17"+
		"\"\"\4\2\f\f\17\17\b\2$$^^ddppttvv\2\u0216\2\b\3\2\2\2\2\n\3\2\2\2\2\20"+
		"\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2"+
		"\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3"+
		"\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3"+
		"\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3"+
		"\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2"+
		"\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2"+
		"X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3"+
		"\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2t\3\2\2\2\2v\3\2\2"+
		"\2\3x\3\2\2\2\3~\3\2\2\2\4\u0080\3\2\2\2\4\u0082\3\2\2\2\4\u0084\3\2\2"+
		"\2\5\u0086\3\2\2\2\5\u0088\3\2\2\2\6\u008a\3\2\2\2\6\u008c\3\2\2\2\6\u0094"+
		"\3\2\2\2\6\u0096\3\2\2\2\7\u0098\3\2\2\2\7\u009a\3\2\2\2\7\u009c\3\2\2"+
		"\2\7\u00a0\3\2\2\2\b\u00a2\3\2\2\2\n\u00ab\3\2\2\2\f\u00af\3\2\2\2\16"+
		"\u00b3\3\2\2\2\20\u00b6\3\2\2\2\22\u00bb\3\2\2\2\24\u00c3\3\2\2\2\26\u00c6"+
		"\3\2\2\2\30\u00c8\3\2\2\2\32\u00ca\3\2\2\2\34\u00d3\3\2\2\2\36\u00dc\3"+
		"\2\2\2 \u00e3\3\2\2\2\"\u00eb\3\2\2\2$\u00f5\3\2\2\2&\u00fb\3\2\2\2(\u0101"+
		"\3\2\2\2*\u0107\3\2\2\2,\u010b\3\2\2\2.\u0110\3\2\2\2\60\u0115\3\2\2\2"+
		"\62\u011b\3\2\2\2\64\u0122\3\2\2\2\66\u0129\3\2\2\28\u012e\3\2\2\2:\u0134"+
		"\3\2\2\2<\u0137\3\2\2\2>\u013b\3\2\2\2@\u013f\3\2\2\2B\u0143\3\2\2\2D"+
		"\u0145\3\2\2\2F\u0147\3\2\2\2H\u0149\3\2\2\2J\u014b\3\2\2\2L\u014d\3\2"+
		"\2\2N\u014f\3\2\2\2P\u0152\3\2\2\2R\u0155\3\2\2\2T\u0157\3\2\2\2V\u0159"+
		"\3\2\2\2X\u015b\3\2\2\2Z\u015d\3\2\2\2\\\u0160\3\2\2\2^\u0163\3\2\2\2"+
		"`\u0166\3\2\2\2b\u0169\3\2\2\2d\u016b\3\2\2\2f\u016d\3\2\2\2h\u0170\3"+
		"\2\2\2j\u018c\3\2\2\2l\u018e\3\2\2\2n\u0197\3\2\2\2p\u0199\3\2\2\2r\u019b"+
		"\3\2\2\2t\u019e\3\2\2\2v\u01a2\3\2\2\2x\u01a8\3\2\2\2z\u01ac\3\2\2\2|"+
		"\u01b0\3\2\2\2~\u01b4\3\2\2\2\u0080\u01b8\3\2\2\2\u0082\u01bf\3\2\2\2"+
		"\u0084\u01c4\3\2\2\2\u0086\u01c9\3\2\2\2\u0088\u01d0\3\2\2\2\u008a\u01d5"+
		"\3\2\2\2\u008c\u01de\3\2\2\2\u008e\u01e0\3\2\2\2\u0090\u01e7\3\2\2\2\u0092"+
		"\u01f3\3\2\2\2\u0094\u01fa\3\2\2\2\u0096\u01fd\3\2\2\2\u0098\u0201\3\2"+
		"\2\2\u009a\u0205\3\2\2\2\u009c\u0208\3\2\2\2\u009e\u020b\3\2\2\2\u00a0"+
		"\u020e\3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7,"+
		"\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\2\2\2\u00a8"+
		"\t\3\2\2\2\u00a9\u00ac\5\f\4\2\u00aa\u00ac\5\16\5\2\u00ab\u00a9\3\2\2"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\3\3\2\u00ae\13"+
		"\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7,\2\2\u00b1\u00b2\7,\2\2\u00b2"+
		"\r\3\2\2\2\u00b3\u00b4\7\61\2\2\u00b4\u00b5\7,\2\2\u00b5\17\3\2\2\2\u00b6"+
		"\u00b7\7\61\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b"+
		"\6\4\2\u00ba\21\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be"+
		"\7e\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7f\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		"\25\3\2\2\2\u00c6\u00c7\7=\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\7<\2\2\u00c9"+
		"\31\3\2\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7x\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7x\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7"+
		"w\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db\35\3\2\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00de\7y\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\u00e1\7e\2\2\u00e1\u00e2\7j\2\2\u00e2\37\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7w\2\2"+
		"\u00e8\u00e9\7n\2\2\u00e9\u00ea\7v\2\2\u00ea!\3\2\2\2\u00eb\u00ec\7g\2"+
		"\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0"+
		"\7y\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7e\2\2\u00f3"+
		"\u00f4\7j\2\2\u00f4#\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7c\2\2\u00f7"+
		"\u00f8\7u\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7\"\2\2\u00fa%\3\2\2\2\u00fb"+
		"\u00fc\7d\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7c\2\2"+
		"\u00ff\u0100\7m\2\2\u0100\'\3\2\2\2\u0101\u0102\7d\2\2\u0102\u0103\7g"+
		"\2\2\u0103\u0104\7i\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106)\3"+
		"\2\2\2\u0107\u0108\7g\2\2\u0108\u0109\7p\2\2\u0109\u010a\7f\2\2\u010a"+
		"+\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7j\2\2\u010d\u010e\7g\2\2\u010e"+
		"\u010f\7p\2\2\u010f-\3\2\2\2\u0110\u0111\7g\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114/\3\2\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7p\2\2\u0117\u0118\7f\2\2\u0118\u0119\7k\2\2\u0119\u011a\7h\2\2"+
		"\u011a\61\3\2\2\2\u011b\u011c\7p\2\2\u011c\u011d\7w\2\2\u011d\u011e\7"+
		"o\2\2\u011e\u011f\7g\2\2\u011f\u0120\7t\2\2\u0120\u0121\7q\2\2\u0121\63"+
		"\3\2\2\2\u0122\u0123\7e\2\2\u0123\u0124\7c\2\2\u0124\u0125\7f\2\2\u0125"+
		"\u0126\7g\2\2\u0126\u0127\7p\2\2\u0127\u0128\7c\2\2\u0128\65\3\2\2\2\u0129"+
		"\u012a\7x\2\2\u012a\u012b\7q\2\2\u012b\u012c\7k\2\2\u012c\u012d\7f\2\2"+
		"\u012d\67\3\2\2\2\u012e\u012f\7y\2\2\u012f\u0130\7j\2\2\u0130\u0131\7"+
		"k\2\2\u0131\u0132\7n\2\2\u0132\u0133\7g\2\2\u01339\3\2\2\2\u0134\u0135"+
		"\7k\2\2\u0135\u0136\7h\2\2\u0136;\3\2\2\2\u0137\u0138\7e\2\2\u0138\u0139"+
		"\7q\2\2\u0139\u013a\7u\2\2\u013a=\3\2\2\2\u013b\u013c\7u\2\2\u013c\u013d"+
		"\7g\2\2\u013d\u013e\7p\2\2\u013e?\3\2\2\2\u013f\u0140\7v\2\2\u0140\u0141"+
		"\7c\2\2\u0141\u0142\7p\2\2\u0142A\3\2\2\2\u0143\u0144\7`\2\2\u0144C\3"+
		"\2\2\2\u0145\u0146\7B\2\2\u0146E\3\2\2\2\u0147\u0148\7,\2\2\u0148G\3\2"+
		"\2\2\u0149\u014a\7\61\2\2\u014aI\3\2\2\2\u014b\u014c\7-\2\2\u014cK\3\2"+
		"\2\2\u014d\u014e\7/\2\2\u014eM\3\2\2\2\u014f\u0150\7~\2\2\u0150\u0151"+
		"\7~\2\2\u0151O\3\2\2\2\u0152\u0153\7(\2\2\u0153\u0154\7(\2\2\u0154Q\3"+
		"\2\2\2\u0155\u0156\7~\2\2\u0156S\3\2\2\2\u0157\u0158\7(\2\2\u0158U\3\2"+
		"\2\2\u0159\u015a\7>\2\2\u015aW\3\2\2\2\u015b\u015c\7@\2\2\u015cY\3\2\2"+
		"\2\u015d\u015e\7>\2\2\u015e\u015f\7?\2\2\u015f[\3\2\2\2\u0160\u0161\7"+
		"@\2\2\u0161\u0162\7?\2\2\u0162]\3\2\2\2\u0163\u0164\7?\2\2\u0164\u0165"+
		"\7?\2\2\u0165_\3\2\2\2\u0166\u0167\7#\2\2\u0167\u0168\7?\2\2\u0168a\3"+
		"\2\2\2\u0169\u016a\7*\2\2\u016ac\3\2\2\2\u016b\u016c\7+\2\2\u016ce\3\2"+
		"\2\2\u016d\u016e\7.\2\2\u016eg\3\2\2\2\u016f\u0171\5p\66\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"i\3\2\2\2\u0174\u0176\5p\66\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017d"+
		"\7\60\2\2\u017a\u017c\5p\66\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2"+
		"\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u018d\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u0180\u0182\5p\66\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2"+
		"\2\2\u0186\u0188\7\60\2\2\u0187\u0189\5p\66\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u0175\3\2\2\2\u018c\u0183\3\2\2\2\u018dk\3\2\2\2\u018e\u0194"+
		"\5n\65\2\u018f\u0193\5n\65\2\u0190\u0193\5p\66\2\u0191\u0193\5r\67\2\u0192"+
		"\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195m\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0197\u0198\t\2\2\2\u0198o\3\2\2\2\u0199\u019a\t\3\2\2\u019a"+
		"q\3\2\2\2\u019b\u019c\7a\2\2\u019cs\3\2\2\2\u019d\u019f\t\4\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1u\3\2\2\2\u01a2\u01a3\7$\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\b9\5\2\u01a5w\3\2\2\2\u01a6\u01a9\5z;\2\u01a7\u01a9\5|<\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b:\6\2\u01ab"+
		"y\3\2\2\2\u01ac\u01ad\7,\2\2\u01ad\u01ae\7,\2\2\u01ae\u01af\7\61\2\2\u01af"+
		"{\3\2\2\2\u01b0\u01b1\7,\2\2\u01b1\u01b2\7\61\2\2\u01b2}\3\2\2\2\u01b3"+
		"\u01b5\13\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3"+
		"\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\177\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9"+
		"\u01ba\7,\2\2\u01ba\u01bb\7,\2\2\u01bb\u01bc\7\61\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01be\b>\6\2\u01be\u0081\3\2\2\2\u01bf\u01c0\7B\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\u01c2\b?\7\2\u01c2\u0083\3\2\2\2\u01c3\u01c5\13\2\2\2\u01c4"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u0085\3\2\2\2\u01c8\u01ca\t\5\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01ce\bA\6\2\u01ce\u0087\3\2\2\2\u01cf\u01d1\13\2\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u0089\3\2\2\2\u01d4\u01d6\t\5\2\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\bC\6\2\u01da\u008b\3\2\2\2\u01db\u01df\5\u008eE\2\u01dc"+
		"\u01df\5\u0090F\2\u01dd\u01df\5\u0092G\2\u01de\u01db\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u008d\3\2\2\2\u01e0\u01e1\7c\2\2\u01e1"+
		"\u01e2\7w\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\7j\2\2\u01e4\u01e5\7q\2\2"+
		"\u01e5\u01e6\7t\2\2\u01e6\u008f\3\2\2\2\u01e7\u01e8\7f\2\2\u01e8\u01e9"+
		"\7g\2\2\u01e9\u01ea\7u\2\2\u01ea\u01eb\7e\2\2\u01eb\u01ec\7t\2\2\u01ec"+
		"\u01ed\7k\2\2\u01ed\u01ee\7r\2\2\u01ee\u01ef\7v\2\2\u01ef\u01f0\7k\2\2"+
		"\u01f0\u01f1\7q\2\2\u01f1\u01f2\7p\2\2\u01f2\u0091\3\2\2\2\u01f3\u01f4"+
		"\7v\2\2\u01f4\u01f5\7c\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7\7i\2\2\u01f7"+
		"\u01f8\7g\2\2\u01f8\u01f9\7v\2\2\u01f9\u0093\3\2\2\2\u01fa\u01fb\7<\2"+
		"\2\u01fb\u0095\3\2\2\2\u01fc\u01fe\13\2\2\2\u01fd\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0097\3\2"+
		"\2\2\u0201\u0202\7$\2\2\u0202\u0203\3\2\2\2\u0203\u0204\bJ\6\2\u0204\u0099"+
		"\3\2\2\2\u0205\u0206\7^\2\2\u0206\u0207\t\6\2\2\u0207\u009b\3\2\2\2\u0208"+
		"\u0209\5\u009eM\2\u0209\u020a\t\2\2\2\u020a\u009d\3\2\2\2\u020b\u020c"+
		"\7\'\2\2\u020c\u009f\3\2\2\2\u020d\u020f\13\2\2\2\u020e\u020d\3\2\2\2"+
		"\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u00a1"+
		"\3\2\2\2\33\2\3\4\5\6\7\u00ab\u0172\u0177\u017d\u0183\u018a\u018c\u0192"+
		"\u0194\u01a0\u01a8\u01b6\u01c6\u01cb\u01d2\u01d7\u01de\u01ff\u0210\b\7"+
		"\4\2\7\3\2\7\5\2\7\7\2\6\2\2\7\6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}