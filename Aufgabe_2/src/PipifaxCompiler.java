
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

class PipifaxCompiler {
  public static void main(String[] args) {
    ANTLRInputStream input = new ANTLRInputStream(args[0]);
    PipifaxLexer lexer = new PipifaxLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    PipifaxParser parser = new PipifaxParser(tokens);
    ParseTree tree = parser.program();
  }
}
