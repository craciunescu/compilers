// Generated from PolishMathParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolishMathParser extends Parser {
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
	public static final int
		RULE_file = 0, RULE_parExpression = 1, RULE_parameters = 2, RULE_parameterList = 3, 
		RULE_parameter = 4, RULE_block = 5, RULE_statement = 6, RULE_ifStatement = 7, 
		RULE_whileStatement = 8, RULE_returnStatement = 9, RULE_functionDeclaration = 10, 
		RULE_runtimeFunctionIdentifier = 11, RULE_functionBody = 12, RULE_variableDeclaration = 13, 
		RULE_scopeModifier = 14, RULE_variableIdentifier = 15, RULE_expression = 16, 
		RULE_literal = 17, RULE_logicalLiteral = 18, RULE_runtimeFunctionCall = 19, 
		RULE_builtinFunctionCall = 20, RULE_builtinFunctionIdentifier = 21, RULE_builtinFunction = 22, 
		RULE_logicalNegation = 23, RULE_mathematicalOperation = 24, RULE_logicalComparison = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "parExpression", "parameters", "parameterList", "parameter", 
			"block", "statement", "ifStatement", "whileStatement", "returnStatement", 
			"functionDeclaration", "runtimeFunctionIdentifier", "functionBody", "variableDeclaration", 
			"scopeModifier", "variableIdentifier", "expression", "literal", "logicalLiteral", 
			"runtimeFunctionCall", "builtinFunctionCall", "builtinFunctionIdentifier", 
			"builtinFunction", "logicalNegation", "mathematicalOperation", "logicalComparison"
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

	@Override
	public String getGrammarFileName() { return "PolishMathParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolishMathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PolishMathParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << VAR) | (1L << FUN) | (1L << WHILE) | (1L << IF) | (1L << SCN) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << GT) | (1L << LT) | (1L << NOT) | (1L << EQ) | (1L << LEQ) | (1L << GEQ) | (1L << NOTEQ) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << POW) | (1L << MOD) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(EOF);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PolishMathParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PolishMathParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(LPAREN);
			setState(61);
			expression(0);
			setState(62);
			match(RPAREN);
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PolishMathParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PolishMathParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LPAREN);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCN) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << GT) | (1L << LT) | (1L << NOT) | (1L << EQ) | (1L << LEQ) | (1L << GEQ) | (1L << NOTEQ) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << POW) | (1L << MOD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(65);
				parameterList();
				}
			}

			setState(68);
			match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PolishMathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PolishMathParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			parameter();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				parameter();
				}
				}
				setState(77);
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

	public static class ParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			expression(0);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PolishMathParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PolishMathParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(LBRACE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << VAR) | (1L << FUN) | (1L << WHILE) | (1L << IF) | (1L << SCN) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << GT) | (1L << LT) | (1L << NOT) | (1L << EQ) | (1L << LEQ) | (1L << GEQ) | (1L << NOTEQ) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << POW) | (1L << MOD) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(81);
				statement();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext statExpression;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PolishMathParser.SEMI, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				returnStatement();
				setState(93);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				functionDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				variableDeclaration();
				setState(97);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				((StatementContext)_localctx).statExpression = expression(0);
				setState(100);
				match(SEMI);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PolishMathParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PolishMathParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(PolishMathParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(PolishMathParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IF);
			setState(105);
			parExpression();
			setState(106);
			match(THEN);
			setState(107);
			statement();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(108);
				match(ELSE);
				setState(109);
				statement();
				}
			}

			setState(112);
			match(ENDIF);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PolishMathParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PolishMathParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(PolishMathParser.LOOP, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WHILE);
			setState(115);
			parExpression();
			setState(116);
			match(DO);
			setState(117);
			statement();
			setState(118);
			match(LOOP);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PolishMathParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(RETURN);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCN) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << GT) | (1L << LT) | (1L << NOT) | (1L << EQ) | (1L << LEQ) | (1L << GEQ) | (1L << NOTEQ) | (1L << AND) | (1L << OR) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << POW) | (1L << MOD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(121);
				expression(0);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(PolishMathParser.FUN, 0); }
		public RuntimeFunctionIdentifierContext runtimeFunctionIdentifier() {
			return getRuleContext(RuntimeFunctionIdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode ENDFUN() { return getToken(PolishMathParser.ENDFUN, 0); }
		public ScopeModifierContext scopeModifier() {
			return getRuleContext(ScopeModifierContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET || _la==VAR) {
				{
				setState(124);
				scopeModifier();
				}
			}

			setState(127);
			match(FUN);
			setState(128);
			runtimeFunctionIdentifier();
			setState(129);
			parameters();
			setState(130);
			functionBody();
			setState(131);
			match(ENDFUN);
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

	public static class RuntimeFunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PolishMathParser.IDENTIFIER, 0); }
		public RuntimeFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterRuntimeFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitRuntimeFunctionIdentifier(this);
		}
	}

	public final RuntimeFunctionIdentifierContext runtimeFunctionIdentifier() throws RecognitionException {
		RuntimeFunctionIdentifierContext _localctx = new RuntimeFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_runtimeFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IDENTIFIER);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			block();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public ScopeModifierContext scopeModifier() {
			return getRuleContext(ScopeModifierContext.class,0);
		}
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PolishMathParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			scopeModifier();
			setState(138);
			variableIdentifier();
			setState(139);
			match(ASSIGN);
			setState(140);
			expression(0);
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

	public static class ScopeModifierContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(PolishMathParser.LET, 0); }
		public TerminalNode VAR() { return getToken(PolishMathParser.VAR, 0); }
		public ScopeModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterScopeModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitScopeModifier(this);
		}
	}

	public final ScopeModifierContext scopeModifier() throws RecognitionException {
		ScopeModifierContext _localctx = new ScopeModifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scopeModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==VAR) ) {
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

	public static class VariableIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PolishMathParser.IDENTIFIER, 0); }
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitVariableIdentifier(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IDENTIFIER);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RuntimeFunctionCallContext runtimeFunctionCall() {
			return getRuleContext(RuntimeFunctionCallContext.class,0);
		}
		public BuiltinFunctionCallContext builtinFunctionCall() {
			return getRuleContext(BuiltinFunctionCallContext.class,0);
		}
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public LogicalNegationContext logicalNegation() {
			return getRuleContext(LogicalNegationContext.class,0);
		}
		public MathematicalOperationContext mathematicalOperation() {
			return getRuleContext(MathematicalOperationContext.class,0);
		}
		public LogicalComparisonContext logicalComparison() {
			return getRuleContext(LogicalComparisonContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PolishMathParser.ASSIGN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(147);
				literal();
				}
				break;
			case 2:
				{
				setState(148);
				runtimeFunctionCall();
				}
				break;
			case 3:
				{
				setState(149);
				builtinFunctionCall();
				}
				break;
			case 4:
				{
				setState(150);
				variableIdentifier();
				}
				break;
			case 5:
				{
				setState(151);
				logicalNegation();
				}
				break;
			case 6:
				{
				setState(152);
				mathematicalOperation();
				}
				break;
			case 7:
				{
				setState(153);
				logicalComparison();
				}
				break;
			case 8:
				{
				setState(154);
				parExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(157);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(158);
					match(ASSIGN);
					setState(159);
					expression(1);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public LogicalLiteralContext logicalLiteral() {
			return getRuleContext(LogicalLiteralContext.class,0);
		}
		public TerminalNode DECIMAL_LITERAL() { return getToken(PolishMathParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(PolishMathParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PolishMathParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				logicalLiteral();
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(DECIMAL_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(FLOAT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(STRING_LITERAL);
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

	public static class LogicalLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PolishMathParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PolishMathParser.FALSE, 0); }
		public LogicalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterLogicalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitLogicalLiteral(this);
		}
	}

	public final LogicalLiteralContext logicalLiteral() throws RecognitionException {
		LogicalLiteralContext _localctx = new LogicalLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class RuntimeFunctionCallContext extends ParserRuleContext {
		public RuntimeFunctionIdentifierContext runtimeFunctionIdentifier() {
			return getRuleContext(RuntimeFunctionIdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public RuntimeFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterRuntimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitRuntimeFunctionCall(this);
		}
	}

	public final RuntimeFunctionCallContext runtimeFunctionCall() throws RecognitionException {
		RuntimeFunctionCallContext _localctx = new RuntimeFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_runtimeFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			runtimeFunctionIdentifier();
			setState(174);
			parameters();
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

	public static class BuiltinFunctionCallContext extends ParserRuleContext {
		public BuiltinFunctionIdentifierContext builtinFunctionIdentifier() {
			return getRuleContext(BuiltinFunctionIdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BuiltinFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterBuiltinFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitBuiltinFunctionCall(this);
		}
	}

	public final BuiltinFunctionCallContext builtinFunctionCall() throws RecognitionException {
		BuiltinFunctionCallContext _localctx = new BuiltinFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_builtinFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			builtinFunctionIdentifier();
			setState(177);
			parameters();
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

	public static class BuiltinFunctionIdentifierContext extends ParserRuleContext {
		public BuiltinFunctionContext builtinFunction() {
			return getRuleContext(BuiltinFunctionContext.class,0);
		}
		public BuiltinFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterBuiltinFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitBuiltinFunctionIdentifier(this);
		}
	}

	public final BuiltinFunctionIdentifierContext builtinFunctionIdentifier() throws RecognitionException {
		BuiltinFunctionIdentifierContext _localctx = new BuiltinFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_builtinFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			builtinFunction();
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

	public static class BuiltinFunctionContext extends ParserRuleContext {
		public TerminalNode SCN() { return getToken(PolishMathParser.SCN, 0); }
		public BuiltinFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterBuiltinFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitBuiltinFunction(this);
		}
	}

	public final BuiltinFunctionContext builtinFunction() throws RecognitionException {
		BuiltinFunctionContext _localctx = new BuiltinFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_builtinFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			match(SCN);
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

	public static class LogicalNegationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PolishMathParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterLogicalNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitLogicalNegation(this);
		}
	}

	public final LogicalNegationContext logicalNegation() throws RecognitionException {
		LogicalNegationContext _localctx = new LogicalNegationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logicalNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(NOT);
			setState(184);
			expression(0);
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

	public static class MathematicalOperationContext extends ParserRuleContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(PolishMathParser.POW, 0); }
		public TerminalNode MOD() { return getToken(PolishMathParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(PolishMathParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PolishMathParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(PolishMathParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PolishMathParser.SUB, 0); }
		public MathematicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterMathematicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitMathematicalOperation(this);
		}
	}

	public final MathematicalOperationContext mathematicalOperation() throws RecognitionException {
		MathematicalOperationContext _localctx = new MathematicalOperationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mathematicalOperation);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POW:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				((MathematicalOperationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==POW || _la==MOD) ) {
					((MathematicalOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				expression(0);
				setState(188);
				expression(0);
				}
				break;
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				((MathematicalOperationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((MathematicalOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				expression(0);
				setState(192);
				expression(0);
				}
				break;
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				((MathematicalOperationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((MathematicalOperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				expression(0);
				setState(196);
				expression(0);
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

	public static class LogicalComparisonContext extends ParserRuleContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PolishMathParser.AND, 0); }
		public TerminalNode OR() { return getToken(PolishMathParser.OR, 0); }
		public TerminalNode EQ() { return getToken(PolishMathParser.EQ, 0); }
		public TerminalNode NOTEQ() { return getToken(PolishMathParser.NOTEQ, 0); }
		public TerminalNode LEQ() { return getToken(PolishMathParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(PolishMathParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(PolishMathParser.GT, 0); }
		public TerminalNode LT() { return getToken(PolishMathParser.LT, 0); }
		public LogicalComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).enterLogicalComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishMathParserListener ) ((PolishMathParserListener)listener).exitLogicalComparison(this);
		}
	}

	public final LogicalComparisonContext logicalComparison() throws RecognitionException {
		LogicalComparisonContext _localctx = new LogicalComparisonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalComparison);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((LogicalComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((LogicalComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				expression(0);
				setState(202);
				expression(0);
				}
				break;
			case EQ:
			case NOTEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((LogicalComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NOTEQ) ) {
					((LogicalComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				expression(0);
				setState(206);
				expression(0);
				}
				break;
			case LEQ:
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				((LogicalComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LEQ || _la==GEQ) ) {
					((LogicalComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				expression(0);
				setState(210);
				expression(0);
				}
				break;
			case GT:
			case LT:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				((LogicalComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GT || _la==LT) ) {
					((LogicalComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(213);
				expression(0);
				setState(214);
				expression(0);
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\5\4E\n\4\3\4\3\4\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\3"+
		"\6\3\7\3\7\7\7U\n\7\f\7\16\7X\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13}\n\13\3\f\5\f\u0080\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009e"+
		"\n\22\3\22\3\22\3\22\7\22\u00a3\n\22\f\22\16\22\u00a6\13\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00ac\n\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00c9\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00db\n\33\3\33\2\3"+
		"\"\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\13\3"+
		"\2\3\4\3\2\20\21\3\2,-\3\2*+\3\2()\3\2&\'\4\2\"\"%%\3\2#$\3\2\37 \2\u00df"+
		"\29\3\2\2\2\4>\3\2\2\2\6B\3\2\2\2\bH\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16"+
		"h\3\2\2\2\20j\3\2\2\2\22t\3\2\2\2\24z\3\2\2\2\26\177\3\2\2\2\30\u0087"+
		"\3\2\2\2\32\u0089\3\2\2\2\34\u008b\3\2\2\2\36\u0090\3\2\2\2 \u0092\3\2"+
		"\2\2\"\u009d\3\2\2\2$\u00ab\3\2\2\2&\u00ad\3\2\2\2(\u00af\3\2\2\2*\u00b2"+
		"\3\2\2\2,\u00b5\3\2\2\2.\u00b7\3\2\2\2\60\u00b9\3\2\2\2\62\u00c8\3\2\2"+
		"\2\64\u00da\3\2\2\2\668\5\16\b\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29"+
		":\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\2\2\3=\3\3\2\2\2>?\7\25\2\2?@\5\"\22"+
		"\2@A\7\26\2\2A\5\3\2\2\2BD\7\25\2\2CE\5\b\5\2DC\3\2\2\2DE\3\2\2\2EF\3"+
		"\2\2\2FG\7\26\2\2G\7\3\2\2\2HM\5\n\6\2IJ\7\34\2\2JL\5\n\6\2KI\3\2\2\2"+
		"LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM\3\2\2\2PQ\5\"\22\2Q\13\3\2"+
		"\2\2RV\7\27\2\2SU\5\16\b\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3"+
		"\2\2\2XV\3\2\2\2YZ\7\30\2\2Z\r\3\2\2\2[i\5\f\7\2\\i\5\20\t\2]i\5\22\n"+
		"\2^_\5\24\13\2_`\7\33\2\2`i\3\2\2\2ai\5\26\f\2bc\5\34\17\2cd\7\33\2\2"+
		"di\3\2\2\2ef\5\"\22\2fg\7\33\2\2gi\3\2\2\2h[\3\2\2\2h\\\3\2\2\2h]\3\2"+
		"\2\2h^\3\2\2\2ha\3\2\2\2hb\3\2\2\2he\3\2\2\2i\17\3\2\2\2jk\7\n\2\2kl\5"+
		"\4\3\2lm\7\13\2\2mp\5\16\b\2no\7\f\2\2oq\5\16\b\2pn\3\2\2\2pq\3\2\2\2"+
		"qr\3\2\2\2rs\7\r\2\2s\21\3\2\2\2tu\7\7\2\2uv\5\4\3\2vw\7\b\2\2wx\5\16"+
		"\b\2xy\7\t\2\2y\23\3\2\2\2z|\7\17\2\2{}\5\"\22\2|{\3\2\2\2|}\3\2\2\2}"+
		"\25\3\2\2\2~\u0080\5\36\20\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u0083\5\30\r\2\u0083\u0084\5\6\4\2"+
		"\u0084\u0085\5\32\16\2\u0085\u0086\7\6\2\2\u0086\27\3\2\2\2\u0087\u0088"+
		"\7\61\2\2\u0088\31\3\2\2\2\u0089\u008a\5\f\7\2\u008a\33\3\2\2\2\u008b"+
		"\u008c\5\36\20\2\u008c\u008d\5 \21\2\u008d\u008e\7\36\2\2\u008e\u008f"+
		"\5\"\22\2\u008f\35\3\2\2\2\u0090\u0091\t\2\2\2\u0091\37\3\2\2\2\u0092"+
		"\u0093\7\61\2\2\u0093!\3\2\2\2\u0094\u0095\b\22\1\2\u0095\u009e\5$\23"+
		"\2\u0096\u009e\5(\25\2\u0097\u009e\5*\26\2\u0098\u009e\5 \21\2\u0099\u009e"+
		"\5\60\31\2\u009a\u009e\5\62\32\2\u009b\u009e\5\64\33\2\u009c\u009e\5\4"+
		"\3\2\u009d\u0094\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0097\3\2\2\2\u009d"+
		"\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a4\3\2\2\2\u009f\u00a0\f\3\2\2\u00a0"+
		"\u00a1\7\36\2\2\u00a1\u00a3\5\"\22\3\u00a2\u009f\3\2\2\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5#\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00ac\5&\24\2\u00a8\u00ac\7\22\2\2\u00a9\u00ac\7\23\2\2"+
		"\u00aa\u00ac\7\24\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac%\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae"+
		"\'\3\2\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\5\6\4\2\u00b1)\3\2\2\2\u00b2"+
		"\u00b3\5,\27\2\u00b3\u00b4\5\6\4\2\u00b4+\3\2\2\2\u00b5\u00b6\5.\30\2"+
		"\u00b6-\3\2\2\2\u00b7\u00b8\7\16\2\2\u00b8/\3\2\2\2\u00b9\u00ba\7!\2\2"+
		"\u00ba\u00bb\5\"\22\2\u00bb\61\3\2\2\2\u00bc\u00bd\t\4\2\2\u00bd\u00be"+
		"\5\"\22\2\u00be\u00bf\5\"\22\2\u00bf\u00c9\3\2\2\2\u00c0\u00c1\t\5\2\2"+
		"\u00c1\u00c2\5\"\22\2\u00c2\u00c3\5\"\22\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5"+
		"\t\6\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7\5\"\22\2\u00c7\u00c9\3\2\2\2"+
		"\u00c8\u00bc\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\63"+
		"\3\2\2\2\u00ca\u00cb\t\7\2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd\5\"\22\2"+
		"\u00cd\u00db\3\2\2\2\u00ce\u00cf\t\b\2\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1"+
		"\5\"\22\2\u00d1\u00db\3\2\2\2\u00d2\u00d3\t\t\2\2\u00d3\u00d4\5\"\22\2"+
		"\u00d4\u00d5\5\"\22\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\t\n\2\2\u00d7\u00d8"+
		"\5\"\22\2\u00d8\u00d9\5\"\22\2\u00d9\u00db\3\2\2\2\u00da\u00ca\3\2\2\2"+
		"\u00da\u00ce\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\65"+
		"\3\2\2\2\179DMVhp|\177\u009d\u00a4\u00ab\u00c8\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}