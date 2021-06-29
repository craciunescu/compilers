import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class PolishMathListenerBasic extends PolishMathParserBaseListener {

    Stack<String> stack = new Stack<>();
    List<List<String>> functions = new ArrayList<>();

    @Override
    public void enterFunctionDeclaration(PolishMathParser.FunctionDeclarationContext ctx) {
        String scope = ctx.scopeModifier().getText();
        String id = ctx.runtimeFunctionIdentifier().getText();
        String parameters = ctx.parameters().parameterList().getText();

        List<String> functionDeclaration = new ArrayList<>();

        functionDeclaration.add(scope);
        functionDeclaration.add(id);
        functionDeclaration.add(parameters);

        functions.add(functionDeclaration);

        System.out.println("============================");
        System.out.println(functionDeclaration.toString());
        System.out.println("============================");
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        stack.push(PolishMathParser.ruleNames[ctx.getRuleIndex()]);

        for (int i=0; i < stack.size(); i++) System.out.println('/' + stack.get(i));
        System.out.println();
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        stack.pop();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        stack.push(PolishMathLexer.VOCABULARY.getSymbolicName(node.getSymbol().getType()) + ":" + node.getText());

        for (int i=0; i < stack.size(); i++) System.out.println('/' + stack.get(i));
        System.out.println();

        stack.pop();
    }
}