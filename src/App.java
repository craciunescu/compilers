import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        String inputFile = null;

        if (args.length > 0) inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);

        CharStream input = CharStreams.fromStream(is);

        PolishMathLexer lexer = new PolishMathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PolishMathParser parser = new PolishMathParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        // Configure the listener
        PolishMathListenerBasic listener = new PolishMathListenerBasic();
        ParseTreeWalker walker = new ParseTreeWalker();

        // Go through the tree
        walker.walk(listener, tree);
    }
}
