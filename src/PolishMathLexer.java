// Generated from PolishMathLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolishMathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, VAR=2, FUN=3, ENDFUN=4, WHILE=5, DO=6, LOOP=7, IF=8, THEN=9, ELSE=10, 
		ENDIF=11, SCN=12, RETURN=13, TRUE=14, FALSE=15, DECIMAL_LITERAL=16, FLOAT_LITERAL=17, 
		STRING_LITERAL=18, LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, LBRACK=23, 
		RBRACK=24, SEMI=25, COMMA=26, DOT=27, ASSIGN=28, GT=29, LT=30, NOT=31, 
		EQ=32, LEQ=33, GEQ=34, NOTEQ=35, AND=36, OR=37, ADD=38, SUB=39, MUL=40, 
		DIV=41, POW=42, MOD=43, WS=44, COMMENT=45, LINE_COMMENT=46, IDENTIFIER=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "VAR", "FUN", "ENDFUN", "WHILE", "DO", "LOOP", "IF", "THEN", "ELSE", 
			"ENDIF", "SCN", "RETURN", "TRUE", "FALSE", "DECIMAL_LITERAL", "FLOAT_LITERAL", 
			"STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", "EQ", "LEQ", "GEQ", 
			"NOTEQ", "AND", "OR", "ADD", "SUB", "MUL", "DIV", "POW", "MOD", "WS", 
			"COMMENT", "LINE_COMMENT", "IDENTIFIER", "Digits", "EscapeSequence", 
			"LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'var'", "'fun'", "'endfun'", "'while'", "'do'", "'loop'", 
			"'if'", "'then'", "'else'", "'endif'", "'scn'", "'return'", "'true'", 
			"'false'", null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", "'>='", 
			"'!='", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'^'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "VAR", "FUN", "ENDFUN", "WHILE", "DO", "LOOP", "IF", "THEN", 
			"ELSE", "ENDIF", "SCN", "RETURN", "TRUE", "FALSE", "DECIMAL_LITERAL", 
			"FLOAT_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", 
			"EQ", "LEQ", "GEQ", "NOTEQ", "AND", "OR", "ADD", "SUB", "MUL", "DIV", 
			"POW", "MOD", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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


	public PolishMathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PolishMathLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00b7"+
		"\n\21\5\21\u00b9\n\21\3\22\3\22\3\22\5\22\u00be\n\22\3\22\3\22\5\22\u00c2"+
		"\n\22\3\23\3\23\3\23\7\23\u00c7\n\23\f\23\16\23\u00ca\13\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\6-\u0107\n-\r-\16-\u0108\3-\3-\3.\3.\3.\3.\7.\u0111\n"+
		".\f.\16.\u0114\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u011f\n/\f/\16/\u0122"+
		"\13/\3/\3/\3\60\3\60\7\60\u0128\n\60\f\60\16\60\u012b\13\60\3\61\3\61"+
		"\7\61\u012f\n\61\f\61\16\61\u0132\13\61\3\61\5\61\u0135\n\61\3\62\3\62"+
		"\3\62\3\63\3\63\5\63\u013c\n\63\3\64\3\64\3\u0112\2\65\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\2\3\2\t\3\2\63;\6\2\f\f\17\17$$^"+
		"^\5\2\13\f\16\17\"\"\4\2\f\f\17\17\3\2\62;\n\2$$))^^ddhhppttvv\4\2C\\"+
		"c|\2\u0147\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3i\3\2\2\2\5m\3\2\2\2\7q\3\2\2\2\tu\3\2\2\2\13|\3\2\2\2\r\u0082\3"+
		"\2\2\2\17\u0085\3\2\2\2\21\u008a\3\2\2\2\23\u008d\3\2\2\2\25\u0092\3\2"+
		"\2\2\27\u0097\3\2\2\2\31\u009d\3\2\2\2\33\u00a1\3\2\2\2\35\u00a8\3\2\2"+
		"\2\37\u00ad\3\2\2\2!\u00b8\3\2\2\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00cd"+
		"\3\2\2\2)\u00cf\3\2\2\2+\u00d1\3\2\2\2-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61"+
		"\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00db\3\2\2\2\67\u00dd\3\2\2\29\u00df"+
		"\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2\2\2A\u00e7\3\2\2\2C"+
		"\u00ea\3\2\2\2E\u00ed\3\2\2\2G\u00f0\3\2\2\2I\u00f3\3\2\2\2K\u00f6\3\2"+
		"\2\2M\u00f9\3\2\2\2O\u00fb\3\2\2\2Q\u00fd\3\2\2\2S\u00ff\3\2\2\2U\u0101"+
		"\3\2\2\2W\u0103\3\2\2\2Y\u0106\3\2\2\2[\u010c\3\2\2\2]\u011a\3\2\2\2_"+
		"\u0125\3\2\2\2a\u012c\3\2\2\2c\u0136\3\2\2\2e\u013b\3\2\2\2g\u013d\3\2"+
		"\2\2ij\7n\2\2jk\7g\2\2kl\7v\2\2l\4\3\2\2\2mn\7x\2\2no\7c\2\2op\7t\2\2"+
		"p\6\3\2\2\2qr\7h\2\2rs\7w\2\2st\7p\2\2t\b\3\2\2\2uv\7g\2\2vw\7p\2\2wx"+
		"\7f\2\2xy\7h\2\2yz\7w\2\2z{\7p\2\2{\n\3\2\2\2|}\7y\2\2}~\7j\2\2~\177\7"+
		"k\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\f\3\2\2\2\u0082\u0083"+
		"\7f\2\2\u0083\u0084\7q\2\2\u0084\16\3\2\2\2\u0085\u0086\7n\2\2\u0086\u0087"+
		"\7q\2\2\u0087\u0088\7q\2\2\u0088\u0089\7r\2\2\u0089\20\3\2\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7h\2\2\u008c\22\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f"+
		"\7j\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\24\3\2\2\2\u0092\u0093"+
		"\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096"+
		"\26\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\30\3\2\2\2\u009d\u009e\7u\2\2\u009e"+
		"\u009f\7e\2\2\u009f\u00a0\7p\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7t\2\2"+
		"\u00a6\u00a7\7p\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7"+
		"t\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7g\2\2\u00ac\36\3\2\2\2\u00ad\u00ae"+
		"\7h\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2 \3\2\2\2\u00b3\u00b9\7\62\2\2\u00b4\u00b6\t\2\2\2"+
		"\u00b5\u00b7\5a\61\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\"\3\2\2\2\u00ba"+
		"\u00bb\5a\61\2\u00bb\u00bd\7\60\2\2\u00bc\u00be\5a\61\2\u00bd\u00bc\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0"+
		"\u00c2\5a\61\2\u00c1\u00ba\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2$\3\2\2\2"+
		"\u00c3\u00c8\7$\2\2\u00c4\u00c7\n\3\2\2\u00c5\u00c7\5c\62\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7$"+
		"\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7+\2"+
		"\2\u00d0*\3\2\2\2\u00d1\u00d2\7}\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7\177"+
		"\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7]\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7"+
		"_\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7=\2\2\u00da\64\3\2\2\2\u00db\u00dc"+
		"\7.\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7\60\2\2\u00de8\3\2\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7"+
		">\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7#\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7?"+
		"\2\2\u00e8\u00e9\7?\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef\7?\2\2\u00efF\3"+
		"\2\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\7?\2\2\u00f2H\3\2\2\2\u00f3\u00f4"+
		"\7(\2\2\u00f4\u00f5\7(\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7~\2\2\u00f7\u00f8"+
		"\7~\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7-\2\2\u00faN\3\2\2\2\u00fb\u00fc\7"+
		"/\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7,\2\2\u00feR\3\2\2\2\u00ff\u0100\7\61"+
		"\2\2\u0100T\3\2\2\2\u0101\u0102\7`\2\2\u0102V\3\2\2\2\u0103\u0104\7^\2"+
		"\2\u0104X\3\2\2\2\u0105\u0107\t\4\2\2\u0106\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\b-\2\2\u010bZ\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7,\2\2\u010e"+
		"\u0112\3\2\2\2\u010f\u0111\13\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7\61\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\b.\2\2\u0119\\\3\2\2\2\u011a\u011b\7\61\2\2\u011b\u011c"+
		"\7\61\2\2\u011c\u0120\3\2\2\2\u011d\u011f\n\5\2\2\u011e\u011d\3\2\2\2"+
		"\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b/\2\2\u0124^\3\2\2\2\u0125\u0129"+
		"\5g\64\2\u0126\u0128\5e\63\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a`\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012c\u0134\t\6\2\2\u012d\u012f\t\6\2\2\u012e\u012d\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0135\t\6\2\2\u0134\u0130\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135b\3\2\2\2\u0136\u0137\7^\2\2\u0137\u0138\t\7\2\2\u0138d\3\2"+
		"\2\2\u0139\u013c\5g\64\2\u013a\u013c\t\6\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013cf\3\2\2\2\u013d\u013e\t\b\2\2\u013eh\3\2\2\2\20\2"+
		"\u00b6\u00b8\u00bd\u00c1\u00c6\u00c8\u0108\u0112\u0120\u0129\u0130\u0134"+
		"\u013b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}