
class ASTTransition extends AST {
  private String trigger;
  private String action;

  public ASTTransition(String trigger, String action) {
    this.trigger = trigger;
    this.action = action;
  }
}
