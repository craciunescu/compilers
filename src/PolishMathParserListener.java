// Generated from PolishMathParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolishMathParser}.
 */
public interface PolishMathParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PolishMathParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PolishMathParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(PolishMathParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(PolishMathParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PolishMathParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PolishMathParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PolishMathParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PolishMathParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PolishMathParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PolishMathParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PolishMathParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PolishMathParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PolishMathParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PolishMathParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PolishMathParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PolishMathParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PolishMathParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PolishMathParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PolishMathParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PolishMathParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PolishMathParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PolishMathParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#runtimeFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeFunctionIdentifier(PolishMathParser.RuntimeFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#runtimeFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeFunctionIdentifier(PolishMathParser.RuntimeFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(PolishMathParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(PolishMathParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PolishMathParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PolishMathParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#scopeModifier}.
	 * @param ctx the parse tree
	 */
	void enterScopeModifier(PolishMathParser.ScopeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#scopeModifier}.
	 * @param ctx the parse tree
	 */
	void exitScopeModifier(PolishMathParser.ScopeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(PolishMathParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(PolishMathParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PolishMathParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PolishMathParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PolishMathParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PolishMathParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#logicalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLogicalLiteral(PolishMathParser.LogicalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#logicalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLogicalLiteral(PolishMathParser.LogicalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#runtimeFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeFunctionCall(PolishMathParser.RuntimeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#runtimeFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeFunctionCall(PolishMathParser.RuntimeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#builtinFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinFunctionCall(PolishMathParser.BuiltinFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#builtinFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinFunctionCall(PolishMathParser.BuiltinFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#builtinFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinFunctionIdentifier(PolishMathParser.BuiltinFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#builtinFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinFunctionIdentifier(PolishMathParser.BuiltinFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#builtinFunction}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinFunction(PolishMathParser.BuiltinFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#builtinFunction}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinFunction(PolishMathParser.BuiltinFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#logicalNegation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNegation(PolishMathParser.LogicalNegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#logicalNegation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNegation(PolishMathParser.LogicalNegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#mathematicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperation(PolishMathParser.MathematicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#mathematicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperation(PolishMathParser.MathematicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolishMathParser#logicalComparison}.
	 * @param ctx the parse tree
	 */
	void enterLogicalComparison(PolishMathParser.LogicalComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolishMathParser#logicalComparison}.
	 * @param ctx the parse tree
	 */
	void exitLogicalComparison(PolishMathParser.LogicalComparisonContext ctx);
}