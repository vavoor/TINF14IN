import java.util.List;
import java.util.LinkedList;

class ASTState extends AST {
  private String name;
  private String action;
  private List<ASTTransition> transitions = new LinkedList<ASTTransition>();

  public ASTState(String name, String action) {
    this.name = name;
    this.action = action;
  }

  public void add(ASTTransition tr) {
    transitions.add(tr);
  }
}