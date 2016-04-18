import java.util.List;
import java.util.LinkedList;

class ASTFSM extends AST {
  private String start;
  public List<ASTState> states = new LinkedList<ASTState>();

  public ASTFSM(String start) {
    this.start = start;
  }

  public void add(ASTState state) {
    states.add(state);
  }
}
