import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

class FSMGen {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
    FSMLexer lexer = new FSMLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    FSMParser parser = new FSMParser(tokens);
    ParseTree tree = parser.fsm();

    FSMGenVisitor v = new FSMGenVisitor();
    v.visit(tree);

    // System.out.println(tree.toStringTree(parser));
  }
}
