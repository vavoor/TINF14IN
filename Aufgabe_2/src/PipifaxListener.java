// Generated from src\Pipifax.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PipifaxParser}.
 */
public interface PipifaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PipifaxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PipifaxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(PipifaxParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(PipifaxParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(PipifaxParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(PipifaxParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PipifaxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PipifaxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(PipifaxParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(PipifaxParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PipifaxParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PipifaxParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#param_type}.
	 * @param ctx the parse tree
	 */
	void enterParam_type(PipifaxParser.Param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#param_type}.
	 * @param ctx the parse tree
	 */
	void exitParam_type(PipifaxParser.Param_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PipifaxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PipifaxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#block_decl}.
	 * @param ctx the parse tree
	 */
	void enterBlock_decl(PipifaxParser.Block_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#block_decl}.
	 * @param ctx the parse tree
	 */
	void exitBlock_decl(PipifaxParser.Block_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PipifaxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PipifaxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PipifaxParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PipifaxParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PipifaxParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PipifaxParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(PipifaxParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(PipifaxParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_stmt(PipifaxParser.Func_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_stmt(PipifaxParser.Func_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(PipifaxParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(PipifaxParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(PipifaxParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(PipifaxParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(PipifaxParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(PipifaxParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PipifaxParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PipifaxParser.ExprContext ctx);
}