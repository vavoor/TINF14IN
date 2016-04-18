
class FSMGenVisitor extends FSMBaseVisitor<AST> {
  @Override
  public AST visitFsm(FSMParser.FsmContext ctx) {
    ASTFSM fsm = new ASTFSM(ctx.Name().getText());
    for (FSMParser.StateDefContext c : ctx.stateDef()) {
      ASTState state = (ASTState) visit(c);
      fsm.add(state);
    }
    return fsm;
  }

  @Override
  public AST visitStateDef(FSMParser.StateDefContext ctx) {
    String action = "";
    if (ctx.Name(1)!=null) {
      action = ctx.Name(1).getText();
    }

    ASTState state = new ASTState(ctx.Name(0).getText(),action);
    for (FSMParser.TransitionContext t : ctx.transition()) {
      ASTTransition tr = (ASTTransition) visit(t);
      state.add(tr);
    }
    return state;
  }

  @Override
  public AST visitTransition(FSMParser.TransitionContext ctx) {
    ASTTransition tr = new ASTTransition(ctx.Name(0).getText(),ctx.Name(1).getText());
    return tr;
  }
}
