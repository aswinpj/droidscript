/**
 * Created by Aswin P J on 08-Feb-16.
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class InterpreterLauncher {
    public static void main(String[] args) throws Exception {

        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream inputStream = new ANTLRInputStream(is);
        calcLexer lexer = new calcLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        calcParser parser = new calcParser(tokenStream);
        ParseTree parseTree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(parseTree);


    }
}
