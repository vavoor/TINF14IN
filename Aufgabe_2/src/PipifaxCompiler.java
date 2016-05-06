import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ast.AST;

class PipifaxCompiler {
  public static void main(String[] args) {
  	  try {
  	  	  FileInputStream is = new FileInputStream(args[0]);
  	  	  ANTLRInputStream input = new ANTLRInputStream(is);
  	  	  PipifaxLexer lexer = new PipifaxLexer(input);
  	  	  CommonTokenStream tokens = new CommonTokenStream(lexer);
  	  	  PipifaxParser parser = new PipifaxParser(tokens);
  	  	  ParseTree tree = parser.program();
  	  	  ASTGenerator astGen = new ASTGenerator();
  	  	  AST ast = astGen.visit(tree);
  	  }
  	  catch(Exception e) {
  	  	  e.printStackTrace();
  	  }
  }
}
