package antlr;

// Generated from JsonLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SALLAVE=1, SCLLAVE=2, SACORCHETE=3, SCCORCHETE=4, COMA=5, DOS_PTOS=6, 
		COMILLAS=7, PUNTO=8, BARRA=9, ALM=10, BBAJA=11, ARROBA=12, KW_CONTEXT=13, 
		KW_WWW=14, KW_HTTP=15, KW_ID=16, KW_NAME=17, KW_PROPERTIES=18, KW_INHERITS=19, 
		KW_GRAPHS=20, KW_REVERSENAME=21, KW_LABELRN=22, KW_LANGUAGEDATA=23, KW_LANGUAGE=24, 
		KW_NUMBER=25, KW_WORDTYPE=26, KW_GENDER=27, KW_OPTIONAL=28, KW_LABEL=29, 
		KW_FROM=30, KW_TO=31, KW_TYPEOF=32, KW_USEDBY=33, KW_MULMAX=34, KW_MULMIN=35, 
		KW_ISLIST=36, KW_TRUE=37, KW_FALSE=38, NOMBRE=39, DIGITO=40, INTRO=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMA", "DOS_PTOS", 
		"COMILLAS", "PUNTO", "BARRA", "ALM", "BBAJA", "ARROBA", "KW_CONTEXT", 
		"KW_WWW", "KW_HTTP", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", 
		"KW_GRAPHS", "KW_REVERSENAME", "KW_LABELRN", "KW_LANGUAGEDATA", "KW_LANGUAGE", 
		"KW_NUMBER", "KW_WORDTYPE", "KW_GENDER", "KW_OPTIONAL", "KW_LABEL", "KW_FROM", 
		"KW_TO", "KW_TYPEOF", "KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", 
		"KW_TRUE", "KW_FALSE", "NOMBRE", "DIGITO", "INTRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "','", "':'", "'\"'", "'.'", "'/'", 
		"'#'", "'_'", "'@'", "'\"@context\":'", "'www.'", "'http://'", "'\"@id\":'", 
		"'\"name\":'", "'\"properties\":'", "'\"inherits\":'", "'\"graphs\":'", 
		"'\"reverseName\":'", "'\"labelReverseName\":'", "'\"languageData\":'", 
		"'\"language\":'", "'\"number\":'", "'\"wordType\":'", "'\"gender\":'", 
		"'\"optional\":'", "'\"label\":'", "'\"from\":'", "'\"to\":'", "'\"typeOf\":'", 
		"'\"usedby\":'", "'\"multiplicityMax\":'", "'\"multiplicityMin\":'", "'\"isList\":'", 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SALLAVE", "SCLLAVE", "SACORCHETE", "SCCORCHETE", "COMA", "DOS_PTOS", 
		"COMILLAS", "PUNTO", "BARRA", "ALM", "BBAJA", "ARROBA", "KW_CONTEXT", 
		"KW_WWW", "KW_HTTP", "KW_ID", "KW_NAME", "KW_PROPERTIES", "KW_INHERITS", 
		"KW_GRAPHS", "KW_REVERSENAME", "KW_LABELRN", "KW_LANGUAGEDATA", "KW_LANGUAGE", 
		"KW_NUMBER", "KW_WORDTYPE", "KW_GENDER", "KW_OPTIONAL", "KW_LABEL", "KW_FROM", 
		"KW_TO", "KW_TYPEOF", "KW_USEDBY", "KW_MULMAX", "KW_MULMIN", "KW_ISLIST", 
		"KW_TRUE", "KW_FALSE", "NOMBRE", "DIGITO", "INTRO"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0198\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\6(\u018c\n(\r(\16(\u018d\3)\6)\u0191"+
		"\n)\r)\16)\u0192\3*\3*\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\5\20\2"+
		"C\\c|\u00c3\u00c3\u00cb\u00cb\u00cf\u00cf\u00d3\u00d3\u00dc\u00dc\u00e3"+
		"\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3\u00f3\u00f5\u00f5\u00f8\u00f8\u00fc"+
		"\u00fc\3\2\62;\5\2\13\f\17\17\"\"\2\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2"+
		"\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2"+
		"\2\2\25g\3\2\2\2\27i\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35y\3\2\2\2\37~\3"+
		"\2\2\2!\u0086\3\2\2\2#\u008d\3\2\2\2%\u0095\3\2\2\2\'\u00a3\3\2\2\2)\u00af"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00c8\3\2\2\2/\u00dc\3\2\2\2\61\u00ec\3\2\2\2"+
		"\63\u00f8\3\2\2\2\65\u0102\3\2\2\2\67\u010e\3\2\2\29\u0118\3\2\2\2;\u0124"+
		"\3\2\2\2=\u012d\3\2\2\2?\u0135\3\2\2\2A\u013b\3\2\2\2C\u0145\3\2\2\2E"+
		"\u014f\3\2\2\2G\u0162\3\2\2\2I\u0175\3\2\2\2K\u017f\3\2\2\2M\u0184\3\2"+
		"\2\2O\u018b\3\2\2\2Q\u0190\3\2\2\2S\u0194\3\2\2\2UV\7}\2\2V\4\3\2\2\2"+
		"WX\7\177\2\2X\6\3\2\2\2YZ\7]\2\2Z\b\3\2\2\2[\\\7_\2\2\\\n\3\2\2\2]^\7"+
		".\2\2^\f\3\2\2\2_`\7<\2\2`\16\3\2\2\2ab\7$\2\2b\20\3\2\2\2cd\7\60\2\2"+
		"d\22\3\2\2\2ef\7\61\2\2f\24\3\2\2\2gh\7%\2\2h\26\3\2\2\2ij\7a\2\2j\30"+
		"\3\2\2\2kl\7B\2\2l\32\3\2\2\2mn\7$\2\2no\7B\2\2op\7e\2\2pq\7q\2\2qr\7"+
		"p\2\2rs\7v\2\2st\7g\2\2tu\7z\2\2uv\7v\2\2vw\7$\2\2wx\7<\2\2x\34\3\2\2"+
		"\2yz\7y\2\2z{\7y\2\2{|\7y\2\2|}\7\60\2\2}\36\3\2\2\2~\177\7j\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7v\2\2\u0081\u0082\7r\2\2\u0082\u0083\7<\2\2\u0083"+
		"\u0084\7\61\2\2\u0084\u0085\7\61\2\2\u0085 \3\2\2\2\u0086\u0087\7$\2\2"+
		"\u0087\u0088\7B\2\2\u0088\u0089\7k\2\2\u0089\u008a\7f\2\2\u008a\u008b"+
		"\7$\2\2\u008b\u008c\7<\2\2\u008c\"\3\2\2\2\u008d\u008e\7$\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7c\2\2\u0090\u0091\7o\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7$\2\2\u0093\u0094\7<\2\2\u0094$\3\2\2\2\u0095\u0096\7$\2\2\u0096"+
		"\u0097\7r\2\2\u0097\u0098\7t\2\2\u0098\u0099\7q\2\2\u0099\u009a\7r\2\2"+
		"\u009a\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c\u009d\7v\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7$\2\2\u00a1"+
		"\u00a2\7<\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7t\2\2"+
		"\u00a9\u00aa\7k\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad"+
		"\7$\2\2\u00ad\u00ae\7<\2\2\u00ae(\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\u00b1"+
		"\7i\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7r\2\2\u00b4"+
		"\u00b5\7j\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7$\2\2\u00b7\u00b8\7<\2\2"+
		"\u00b8*\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2"+
		"\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7P\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u00c4\7o\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7$\2\2\u00c6\u00c7\7<\2\2"+
		"\u00c7,\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7c\2"+
		"\2\u00cb\u00cc\7d\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf"+
		"\7T\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7x\2\2\u00d1\u00d2\7g\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7P\2\2"+
		"\u00d6\u00d7\7c\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da"+
		"\7$\2\2\u00da\u00db\7<\2\2\u00db.\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7i\2\2\u00e1"+
		"\u00e2\7w\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7i\2\2\u00e4\u00e5\7g\2\2"+
		"\u00e5\u00e6\7F\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\u00ea\7$\2\2\u00ea\u00eb\7<\2\2\u00eb\60\3\2\2\2\u00ec\u00ed"+
		"\7$\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\u00f1\7i\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7i\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\7<\2\2\u00f7\62\3\2"+
		"\2\2\u00f8\u00f9\7$\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc"+
		"\7o\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"\u0100\7$\2\2\u0100\u0101\7<\2\2\u0101\64\3\2\2\2\u0102\u0103\7$\2\2\u0103"+
		"\u0104\7y\2\2\u0104\u0105\7q\2\2\u0105\u0106\7t\2\2\u0106\u0107\7f\2\2"+
		"\u0107\u0108\7V\2\2\u0108\u0109\7{\2\2\u0109\u010a\7r\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7$\2\2\u010c\u010d\7<\2\2\u010d\66\3\2\2\2\u010e\u010f"+
		"\7$\2\2\u010f\u0110\7i\2\2\u0110\u0111\7g\2\2\u0111\u0112\7p\2\2\u0112"+
		"\u0113\7f\2\2\u0113\u0114\7g\2\2\u0114\u0115\7t\2\2\u0115\u0116\7$\2\2"+
		"\u0116\u0117\7<\2\2\u01178\3\2\2\2\u0118\u0119\7$\2\2\u0119\u011a\7q\2"+
		"\2\u011a\u011b\7r\2\2\u011b\u011c\7v\2\2\u011c\u011d\7k\2\2\u011d\u011e"+
		"\7q\2\2\u011e\u011f\7p\2\2\u011f\u0120\7c\2\2\u0120\u0121\7n\2\2\u0121"+
		"\u0122\7$\2\2\u0122\u0123\7<\2\2\u0123:\3\2\2\2\u0124\u0125\7$\2\2\u0125"+
		"\u0126\7n\2\2\u0126\u0127\7c\2\2\u0127\u0128\7d\2\2\u0128\u0129\7g\2\2"+
		"\u0129\u012a\7n\2\2\u012a\u012b\7$\2\2\u012b\u012c\7<\2\2\u012c<\3\2\2"+
		"\2\u012d\u012e\7$\2\2\u012e\u012f\7h\2\2\u012f\u0130\7t\2\2\u0130\u0131"+
		"\7q\2\2\u0131\u0132\7o\2\2\u0132\u0133\7$\2\2\u0133\u0134\7<\2\2\u0134"+
		">\3\2\2\2\u0135\u0136\7$\2\2\u0136\u0137\7v\2\2\u0137\u0138\7q\2\2\u0138"+
		"\u0139\7$\2\2\u0139\u013a\7<\2\2\u013a@\3\2\2\2\u013b\u013c\7$\2\2\u013c"+
		"\u013d\7v\2\2\u013d\u013e\7{\2\2\u013e\u013f\7r\2\2\u013f\u0140\7g\2\2"+
		"\u0140\u0141\7Q\2\2\u0141\u0142\7h\2\2\u0142\u0143\7$\2\2\u0143\u0144"+
		"\7<\2\2\u0144B\3\2\2\2\u0145\u0146\7$\2\2\u0146\u0147\7w\2\2\u0147\u0148"+
		"\7u\2\2\u0148\u0149\7g\2\2\u0149\u014a\7f\2\2\u014a\u014b\7d\2\2\u014b"+
		"\u014c\7{\2\2\u014c\u014d\7$\2\2\u014d\u014e\7<\2\2\u014eD\3\2\2\2\u014f"+
		"\u0150\7$\2\2\u0150\u0151\7o\2\2\u0151\u0152\7w\2\2\u0152\u0153\7n\2\2"+
		"\u0153\u0154\7v\2\2\u0154\u0155\7k\2\2\u0155\u0156\7r\2\2\u0156\u0157"+
		"\7n\2\2\u0157\u0158\7k\2\2\u0158\u0159\7e\2\2\u0159\u015a\7k\2\2\u015a"+
		"\u015b\7v\2\2\u015b\u015c\7{\2\2\u015c\u015d\7O\2\2\u015d\u015e\7c\2\2"+
		"\u015e\u015f\7z\2\2\u015f\u0160\7$\2\2\u0160\u0161\7<\2\2\u0161F\3\2\2"+
		"\2\u0162\u0163\7$\2\2\u0163\u0164\7o\2\2\u0164\u0165\7w\2\2\u0165\u0166"+
		"\7n\2\2\u0166\u0167\7v\2\2\u0167\u0168\7k\2\2\u0168\u0169\7r\2\2\u0169"+
		"\u016a\7n\2\2\u016a\u016b\7k\2\2\u016b\u016c\7e\2\2\u016c\u016d\7k\2\2"+
		"\u016d\u016e\7v\2\2\u016e\u016f\7{\2\2\u016f\u0170\7O\2\2\u0170\u0171"+
		"\7k\2\2\u0171\u0172\7p\2\2\u0172\u0173\7$\2\2\u0173\u0174\7<\2\2\u0174"+
		"H\3\2\2\2\u0175\u0176\7$\2\2\u0176\u0177\7k\2\2\u0177\u0178\7u\2\2\u0178"+
		"\u0179\7N\2\2\u0179\u017a\7k\2\2\u017a\u017b\7u\2\2\u017b\u017c\7v\2\2"+
		"\u017c\u017d\7$\2\2\u017d\u017e\7<\2\2\u017eJ\3\2\2\2\u017f\u0180\7v\2"+
		"\2\u0180\u0181\7t\2\2\u0181\u0182\7w\2\2\u0182\u0183\7g\2\2\u0183L\3\2"+
		"\2\2\u0184\u0185\7h\2\2\u0185\u0186\7c\2\2\u0186\u0187\7n\2\2\u0187\u0188"+
		"\7u\2\2\u0188\u0189\7g\2\2\u0189N\3\2\2\2\u018a\u018c\t\2\2\2\u018b\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"P\3\2\2\2\u018f\u0191\t\3\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2"+
		"\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193R\3\2\2\2\u0194\u0195\t"+
		"\4\2\2\u0195\u0196\3\2\2\2\u0196\u0197\b*\2\2\u0197T\3\2\2\2\6\2\u018b"+
		"\u018d\u0192\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}