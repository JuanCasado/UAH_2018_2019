package antlr;

// Generated from EntradaLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EntradaLexer extends Lexer {
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
		COMENTARIO_MULTILINEA_MODE=1, COMENTARIO_LINEA_MODE=2, CADENA_CARACTERES_MODE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_MULTILINEA_MODE", "COMENTARIO_LINEA_MODE", 
		"CADENA_CARACTERES_MODE"
	};

	public static final String[] ruleNames = {
		"COMENTARIOABRIR", "COMENTARIOLINEA", "CADENA_ABRIR", "INT", "LETRA", 
		"COMA", "DOBLEPUNTO", "PUNTO", "INTRO", "OPBLT", "OPBGT", "SAP", "SCP", 
		"ASIG", "OPASIG", "BBAJA", "COR_ABRIR", "COR_CERRAR", "KW_DOS_PUNTOS", 
		"TERMINADOR", "WS", "BARRA", "KW_JSON", "KW_DOT", "KW_SVG", "KW_CSV", 
		"LEN", "FONTCOLOR", "FONTNAME", "FONTSIZE", "ARROWSIZE", "ARROWCOLOR", 
		"PENWIDTH", "FILLCOLOR", "STYLE", "SHAPE", "EXTENSION_JSON", "EXTENSION_SVG", 
		"EXTENSION_DOT", "EXTENSION_CSV", "EDGE", "NODE", "RELATIONSHIP", "CLASS", 
		"PROPERTY", "INHERITANCE", "INDERECT_USE", "IDF", "ID_LETRA", "DIGITO", 
		"COMENTARIOCERRAR", "TEXTOCOMENTARIO_ML", "AUTHOR", "DESCRIPTION", "TARGET", 
		"FINAL_COMENTARIO_UL", "TEXTOCOMENTARIO_UL", "CADENA_CERRAR", "TEXTO_CADENA"
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


	public EntradaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EntradaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u01ca\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5"+
		"\u008c\n\5\r\5\16\5\u008d\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\6\n"+
		"\u009a\n\n\r\n\16\n\u009b\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\6\26\u00b6\n\26\r\26\16\26\u00b7\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\7\61\u0174\n\61\f\61\16\61\u0177"+
		"\13\61\3\62\5\62\u017a\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\6"+
		"\65\u0184\n\65\r\65\16\65\u0185\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\6\66\u0192\n\66\r\66\16\66\u0193\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\6\67\u01a7"+
		"\n\67\r\67\16\67\u01a8\38\38\38\38\38\38\38\38\38\68\u01b4\n8\r8\168\u01b5"+
		"\39\39\39\39\39\3:\6:\u01be\n:\r:\16:\u01bf\3;\3;\3;\3;\3<\6<\u01c7\n"+
		"<\r<\16<\u01c8\b\u0185\u0193\u01a8\u01b5\u01bf\u01c8\2=\6\3\b\4\n\5\f"+
		"\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24"+
		"*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!D\"F#H$J%L&N\'"+
		"P(R)T*V+X,Z-\\.^/`\60b\61d\62f\2h\2j\63l\64n\65p\66r\67t8v9x:z;\6\2\3"+
		"\4\5\7\3\2\62;\4\2C\\c|\4\2\f\f\17\17\4\2\61\61^^\20\2C\\c|\u00c3\u00c3"+
		"\u00cb\u00cb\u00cf\u00cf\u00d3\u00d3\u00dc\u00dc\u00e3\u00e3\u00eb\u00eb"+
		"\u00ef\u00ef\u00f3\u00f3\u00f5\u00f5\u00f8\u00f8\u00fc\u00fc\2\u01cf\2"+
		"\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2"+
		"\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2"+
		"\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2"+
		"\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2"+
		"\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2"+
		"\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L"+
		"\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2"+
		"\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2"+
		"\2\3j\3\2\2\2\3l\3\2\2\2\3n\3\2\2\2\3p\3\2\2\2\3r\3\2\2\2\4t\3\2\2\2\4"+
		"v\3\2\2\2\5x\3\2\2\2\5z\3\2\2\2\6|\3\2\2\2\b\u0081\3\2\2\2\n\u0086\3\2"+
		"\2\2\f\u008b\3\2\2\2\16\u008f\3\2\2\2\20\u0091\3\2\2\2\22\u0093\3\2\2"+
		"\2\24\u0096\3\2\2\2\26\u0099\3\2\2\2\30\u009d\3\2\2\2\32\u009f\3\2\2\2"+
		"\34\u00a1\3\2\2\2\36\u00a3\3\2\2\2 \u00a5\3\2\2\2\"\u00a7\3\2\2\2$\u00aa"+
		"\3\2\2\2&\u00ac\3\2\2\2(\u00ae\3\2\2\2*\u00b0\3\2\2\2,\u00b2\3\2\2\2."+
		"\u00b5\3\2\2\2\60\u00b9\3\2\2\2\62\u00bb\3\2\2\2\64\u00c0\3\2\2\2\66\u00c4"+
		"\3\2\2\28\u00c8\3\2\2\2:\u00cc\3\2\2\2<\u00d0\3\2\2\2>\u00da\3\2\2\2@"+
		"\u00e3\3\2\2\2B\u00ec\3\2\2\2D\u00f6\3\2\2\2F\u0101\3\2\2\2H\u010a\3\2"+
		"\2\2J\u0114\3\2\2\2L\u011a\3\2\2\2N\u0120\3\2\2\2P\u0125\3\2\2\2R\u0129"+
		"\3\2\2\2T\u012d\3\2\2\2V\u0131\3\2\2\2X\u0136\3\2\2\2Z\u013b\3\2\2\2\\"+
		"\u0148\3\2\2\2^\u014e\3\2\2\2`\u0157\3\2\2\2b\u0163\3\2\2\2d\u0170\3\2"+
		"\2\2f\u0179\3\2\2\2h\u017b\3\2\2\2j\u017d\3\2\2\2l\u0183\3\2\2\2n\u0187"+
		"\3\2\2\2p\u0197\3\2\2\2r\u01aa\3\2\2\2t\u01b7\3\2\2\2v\u01bd\3\2\2\2x"+
		"\u01c1\3\2\2\2z\u01c6\3\2\2\2|}\7\61\2\2}~\7,\2\2~\177\3\2\2\2\177\u0080"+
		"\b\2\2\2\u0080\7\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7\61\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\3\3\2\u0085\t\3\2\2\2\u0086\u0087\7$\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0089\b\4\4\2\u0089\13\3\2\2\2\u008a\u008c"+
		"\t\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\r\3\2\2\2\u008f\u0090\t\3\2\2\u0090\17\3\2\2\2\u0091"+
		"\u0092\7.\2\2\u0092\21\3\2\2\2\u0093\u0094\7\60\2\2\u0094\u0095\7\60\2"+
		"\2\u0095\23\3\2\2\2\u0096\u0097\7\60\2\2\u0097\25\3\2\2\2\u0098\u009a"+
		"\t\4\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009e\7>\2\2\u009e\31\3\2\2\2\u009f"+
		"\u00a0\7@\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\35\3\2\2\2\u00a3"+
		"\u00a4\7+\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6!\3\2\2\2\u00a7"+
		"\u00a8\7<\2\2\u00a8\u00a9\7?\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7a\2\2\u00ab"+
		"%\3\2\2\2\u00ac\u00ad\7]\2\2\u00ad\'\3\2\2\2\u00ae\u00af\7_\2\2\u00af"+
		")\3\2\2\2\u00b0\u00b1\7<\2\2\u00b1+\3\2\2\2\u00b2\u00b3\7=\2\2\u00b3-"+
		"\3\2\2\2\u00b4\u00b6\7\"\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8/\3\2\2\2\u00b9\u00ba\t\5\2\2"+
		"\u00ba\61\3\2\2\2\u00bb\u00bc\7L\2\2\u00bc\u00bd\7U\2\2\u00bd\u00be\7"+
		"Q\2\2\u00be\u00bf\7P\2\2\u00bf\63\3\2\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2"+
		"\7Q\2\2\u00c2\u00c3\7V\2\2\u00c3\65\3\2\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6"+
		"\7X\2\2\u00c6\u00c7\7I\2\2\u00c7\67\3\2\2\2\u00c8\u00c9\7E\2\2\u00c9\u00ca"+
		"\7U\2\2\u00ca\u00cb\7X\2\2\u00cb9\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7p\2\2\u00cf;\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7e\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2"+
		"\u00d9=\3\2\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7p\2"+
		"\2\u00dd\u00de\7v\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1"+
		"\7o\2\2\u00e1\u00e2\7g\2\2\u00e2?\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5"+
		"\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7|\2\2\u00ea\u00eb\7g\2\2\u00ebA\3\2\2\2\u00ec"+
		"\u00ed\7c\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7q\2\2"+
		"\u00f0\u00f1\7y\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4"+
		"\7|\2\2\u00f4\u00f5\7g\2\2\u00f5C\3\2\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7y\2\2\u00fb"+
		"\u00fc\7e\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7q\2\2"+
		"\u00ff\u0100\7t\2\2\u0100E\3\2\2\2\u0101\u0102\7r\2\2\u0102\u0103\7g\2"+
		"\2\u0103\u0104\7p\2\2\u0104\u0105\7y\2\2\u0105\u0106\7k\2\2\u0106\u0107"+
		"\7f\2\2\u0107\u0108\7v\2\2\u0108\u0109\7j\2\2\u0109G\3\2\2\2\u010a\u010b"+
		"\7h\2\2\u010b\u010c\7k\2\2\u010c\u010d\7n\2\2\u010d\u010e\7n\2\2\u010e"+
		"\u010f\7e\2\2\u010f\u0110\7q\2\2\u0110\u0111\7n\2\2\u0111\u0112\7q\2\2"+
		"\u0112\u0113\7t\2\2\u0113I\3\2\2\2\u0114\u0115\7u\2\2\u0115\u0116\7v\2"+
		"\2\u0116\u0117\7{\2\2\u0117\u0118\7n\2\2\u0118\u0119\7g\2\2\u0119K\3\2"+
		"\2\2\u011a\u011b\7u\2\2\u011b\u011c\7j\2\2\u011c\u011d\7c\2\2\u011d\u011e"+
		"\7r\2\2\u011e\u011f\7g\2\2\u011fM\3\2\2\2\u0120\u0121\7l\2\2\u0121\u0122"+
		"\7u\2\2\u0122\u0123\7q\2\2\u0123\u0124\7p\2\2\u0124O\3\2\2\2\u0125\u0126"+
		"\7u\2\2\u0126\u0127\7x\2\2\u0127\u0128\7i\2\2\u0128Q\3\2\2\2\u0129\u012a"+
		"\7f\2\2\u012a\u012b\7q\2\2\u012b\u012c\7v\2\2\u012cS\3\2\2\2\u012d\u012e"+
		"\7e\2\2\u012e\u012f\7u\2\2\u012f\u0130\7x\2\2\u0130U\3\2\2\2\u0131\u0132"+
		"\7g\2\2\u0132\u0133\7f\2\2\u0133\u0134\7i\2\2\u0134\u0135\7g\2\2\u0135"+
		"W\3\2\2\2\u0136\u0137\7p\2\2\u0137\u0138\7q\2\2\u0138\u0139\7f\2\2\u0139"+
		"\u013a\7g\2\2\u013aY\3\2\2\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2\u013d"+
		"\u013e\7n\2\2\u013e\u013f\7c\2\2\u013f\u0140\7v\2\2\u0140\u0141\7k\2\2"+
		"\u0141\u0142\7q\2\2\u0142\u0143\7p\2\2\u0143\u0144\7u\2\2\u0144\u0145"+
		"\7j\2\2\u0145\u0146\7k\2\2\u0146\u0147\7r\2\2\u0147[\3\2\2\2\u0148\u0149"+
		"\7e\2\2\u0149\u014a\7n\2\2\u014a\u014b\7c\2\2\u014b\u014c\7u\2\2\u014c"+
		"\u014d\7u\2\2\u014d]\3\2\2\2\u014e\u014f\7r\2\2\u014f\u0150\7t\2\2\u0150"+
		"\u0151\7q\2\2\u0151\u0152\7r\2\2\u0152\u0153\7g\2\2\u0153\u0154\7t\2\2"+
		"\u0154\u0155\7v\2\2\u0155\u0156\7{\2\2\u0156_\3\2\2\2\u0157\u0158\7k\2"+
		"\2\u0158\u0159\7p\2\2\u0159\u015a\7j\2\2\u015a\u015b\7g\2\2\u015b\u015c"+
		"\7t\2\2\u015c\u015d\7k\2\2\u015d\u015e\7v\2\2\u015e\u015f\7c\2\2\u015f"+
		"\u0160\7p\2\2\u0160\u0161\7e\2\2\u0161\u0162\7g\2\2\u0162a\3\2\2\2\u0163"+
		"\u0164\7k\2\2\u0164\u0165\7p\2\2\u0165\u0166\7f\2\2\u0166\u0167\7g\2\2"+
		"\u0167\u0168\7t\2\2\u0168\u0169\7g\2\2\u0169\u016a\7e\2\2\u016a\u016b"+
		"\7v\2\2\u016b\u016c\7a\2\2\u016c\u016d\7w\2\2\u016d\u016e\7u\2\2\u016e"+
		"\u016f\7g\2\2\u016fc\3\2\2\2\u0170\u0175\5f\62\2\u0171\u0174\5f\62\2\u0172"+
		"\u0174\5h\63\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176e\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u017a\t\6\2\2\u0179\u0178\3\2\2\2\u017ag\3\2\2\2\u017b"+
		"\u017c\t\2\2\2\u017ci\3\2\2\2\u017d\u017e\7,\2\2\u017e\u017f\7\61\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u0181\b\64\5\2\u0181k\3\2\2\2\u0182\u0184\13"+
		"\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186m\3\2\2\2\u0187\u0188\7B\2\2\u0188\u0189\7c\2\2\u0189"+
		"\u018a\7w\2\2\u018a\u018b\7v\2\2\u018b\u018c\7j\2\2\u018c\u018d\7q\2\2"+
		"\u018d\u018e\7t\2\2\u018e\u018f\7<\2\2\u018f\u0191\3\2\2\2\u0190\u0192"+
		"\13\2\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2"+
		"\u0193\u0191\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5\26\n\2\u0196o\3"+
		"\2\2\2\u0197\u0198\7B\2\2\u0198\u0199\7f\2\2\u0199\u019a\7g\2\2\u019a"+
		"\u019b\7u\2\2\u019b\u019c\7e\2\2\u019c\u019d\7t\2\2\u019d\u019e\7k\2\2"+
		"\u019e\u019f\7r\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2"+
		"\7q\2\2\u01a2\u01a3\7p\2\2\u01a3\u01a4\7<\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u01a7\13\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3"+
		"\2\2\2\u01a8\u01a6\3\2\2\2\u01a9q\3\2\2\2\u01aa\u01ab\7B\2\2\u01ab\u01ac"+
		"\7v\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7i\2\2\u01af"+
		"\u01b0\7g\2\2\u01b0\u01b1\7v\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b4\13\2"+
		"\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b6s\3\2\2\2\u01b7\u01b8\7\17\2\2\u01b8\u01b9\7\f\2\2"+
		"\u01b9\u01ba\3\2\2\2\u01ba\u01bb\b9\5\2\u01bbu\3\2\2\2\u01bc\u01be\13"+
		"\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0w\3\2\2\2\u01c1\u01c2\7$\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\b;\5\2\u01c4y\3\2\2\2\u01c5\u01c7\13\2\2\2\u01c6\u01c5\3\2\2\2"+
		"\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9{\3"+
		"\2\2\2\22\2\3\4\5\u008d\u009b\u00b7\u0173\u0175\u0179\u0185\u0193\u01a8"+
		"\u01b5\u01bf\u01c8\6\7\3\2\7\4\2\7\5\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}