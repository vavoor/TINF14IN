import ast.*;

class ASTGenerator extends PipifaxBaseVisitor<AST> {
	private Program program = new Program();

	public AST visitProgram(PipifaxParser.ProgramContext ctx) {
		visitChildren(ctx);
		return program;
	}

	public AST visitVar_decl(PipifaxParser.Var_declContext ctx) {
		return visitChildren(ctx);
	}

	public AST visitFunc_def(PipifaxParser.Func_defContext ctx) {
		return visitChildren(ctx);
	}
}
