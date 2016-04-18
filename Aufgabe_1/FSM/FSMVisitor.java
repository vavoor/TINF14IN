// Generated from FSM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FSMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FSMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FSMParser#fsm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFsm(FSMParser.FsmContext ctx);
	/**
	 * Visit a parse tree produced by {@link FSMParser#stateDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDef(FSMParser.StateDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link FSMParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(FSMParser.TransitionContext ctx);
}