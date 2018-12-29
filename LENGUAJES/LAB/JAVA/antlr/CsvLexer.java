package antlr;

// Generated from CsvLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsvLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, INTRO=2, BARRA=3, JSON_EXTENSION=4, DOT_EXTENSION=5, SVG_EXTENSION=6, 
		FILE=7, COMILLAS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMA", "INTRO", "BARRA", "JSON_EXTENSION", "DOT_EXTENSION", "SVG_EXTENSION", 
		"FILE", "IDLETRA", "DIGITO", "PUNTUACION", "DOT", "COMILLAS"
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


	public CsvLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CsvLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nJ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\b\65\n\b\r\b\16\b"+
		"\66\3\b\3\b\5\b;\n\b\5\b=\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31"+
		"\n\3\2\b\4\2\f\f\17\17\4\2\61\61^^\20\2C\\c|\u00c3\u00c3\u00cb\u00cb\u00cf"+
		"\u00cf\u00d3\u00d3\u00d5\u00d5\u00dc\u00dc\u00e3\u00e3\u00eb\u00eb\u00ef"+
		"\u00ef\u00f3\u00f3\u00f5\u00f5\u00fc\u00fc\3\2\62;\6\2\"\"//<<aa\4\2$"+
		"$))\2J\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3"+
		"\2\2\2\t!\3\2\2\2\13\'\3\2\2\2\r,\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@"+
		"\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31F\3\2\2\2\33\34\7.\2\2\34\4\3\2\2\2"+
		"\35\36\t\2\2\2\36\6\3\2\2\2\37 \t\3\2\2 \b\3\2\2\2!\"\7\60\2\2\"#\7l\2"+
		"\2#$\7u\2\2$%\7q\2\2%&\7p\2\2&\n\3\2\2\2\'(\7\60\2\2()\7f\2\2)*\7q\2\2"+
		"*+\7v\2\2+\f\3\2\2\2,-\7\60\2\2-.\7u\2\2./\7x\2\2/\60\7i\2\2\60\16\3\2"+
		"\2\2\61\65\5\21\t\2\62\65\5\23\n\2\63\65\5\25\13\2\64\61\3\2\2\2\64\62"+
		"\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67=\3"+
		"\2\2\28:\5\27\f\29;\5\27\f\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<\64\3\2\2\2"+
		"<8\3\2\2\2=\20\3\2\2\2>?\t\4\2\2?\22\3\2\2\2@A\t\5\2\2A\24\3\2\2\2BC\t"+
		"\6\2\2C\26\3\2\2\2DE\7\60\2\2E\30\3\2\2\2FG\t\7\2\2GH\3\2\2\2HI\b\r\2"+
		"\2I\32\3\2\2\2\7\2\64\66:<\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}