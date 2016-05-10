// Generated from Pipifax.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PipifaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PipifaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PipifaxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(PipifaxParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(PipifaxParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_type}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_type(PipifaxParser.Int_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_type}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_type(PipifaxParser.Double_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_type}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_type(PipifaxParser.String_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_type}
	 * labeled alternative in {@link PipifaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(PipifaxParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(PipifaxParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PipifaxParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pass_through_type}
	 * labeled alternative in {@link PipifaxParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_through_type(PipifaxParser.Pass_through_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reference_type}
	 * labeled alternative in {@link PipifaxParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_type(PipifaxParser.Reference_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ref_to_array_type}
	 * labeled alternative in {@link PipifaxParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_to_array_type(PipifaxParser.Ref_to_array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PipifaxParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#block_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_decl(PipifaxParser.Block_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PipifaxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PipifaxParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PipifaxParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(PipifaxParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#func_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_stmt(PipifaxParser.Func_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(PipifaxParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(PipifaxParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(PipifaxParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PipifaxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PipifaxParser.ExprContext ctx);
}