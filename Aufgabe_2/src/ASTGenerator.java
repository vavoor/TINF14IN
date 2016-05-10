import ast.*;
import java.util.List;

class ASTGenerator extends PipifaxBaseVisitor<AST> {
	private Program program = new Program();

	public AST visitProgram(PipifaxParser.ProgramContext ctx) {
		visitChildren(ctx);
		return program;
	}

	public AST visitVar_decl(PipifaxParser.Var_declContext ctx) {
		Type t = (Type) visit(ctx.type());
		VarDeclaration d = new VarDeclaration(ctx.ID().getText(),t);
		program.addGlobalVariable(d);
		return null;
	}

	public AST visitFunc_def(PipifaxParser.Func_defContext ctx) {
		Type t = VoidType.instance();
		if (ctx.type()!=null) {
			t = (Type) visit(ctx.type());
		}
		Block block = (Block) visit(ctx.block());
		FuncDefinition f = new FuncDefinition(ctx.ID().getText(),t);
		List<PipifaxParser.ParamContext> params = ctx.param_list().param();
		for (PipifaxParser.ParamContext p : params) {
			VarDeclaration d = (VarDeclaration) visit(p);
			f.addParameter(d);
		}
		return f;
	}

	public AST visitParam(PipifaxParser.ParamContext ctx) {
		Type t = (Type) visit(ctx.param_type());
		VarDeclaration p = new VarDeclaration(ctx.ID().getText(),t);
		return p;
	}

	public AST visitInt_type(PipifaxParser.Int_typeContext ctx) {
		return IntType.instance();
	}

	public AST visitDouble_type(PipifaxParser.Double_typeContext ctx) {
		return DoubleType.instance();
	}

	public AST visitString_type(PipifaxParser.String_typeContext ctx) {
		return StringType.instance();
	}

	public AST visitArray_type(PipifaxParser.Array_typeContext ctx) {
		Type t = (Type) visit(ctx.type());
		int l = Integer.parseInt(ctx.INT().getText());
		return new ArrayType(l,t);
	}

	public AST visitPass_through_type(PipifaxParser.Pass_through_typeContext ctx) {
		return visit(ctx.type());
	}

	public AST visitReference_type(PipifaxParser.Reference_typeContext ctx) {
		return new ReferenceType((Type)visit(ctx.type()));
	}

	public AST visitRef_to_array_type(PipifaxParser.Ref_to_array_typeContext ctx) {
		return new ReferenceType(new ArrayType((Type)visit(ctx.type())));
	}

	public AST visitBlock(PipifaxParser.BlockContext ctx) {
		Block b = new Block();
		for (PipifaxParser.Block_declContext c : ctx.block_decl()) {
			b.add(visit(c));
		}
		return b;
	}
}
