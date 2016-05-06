// Generated from Ass.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssParser}.
 */
public interface AssListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AssParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AssParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(AssParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(AssParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(AssParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(AssParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AssParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AssParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssParser#reg}.
	 * @param ctx the parse tree
	 */
	void enterReg(AssParser.RegContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssParser#reg}.
	 * @param ctx the parse tree
	 */
	void exitReg(AssParser.RegContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssParser#opt_comment}.
	 * @param ctx the parse tree
	 */
	void enterOpt_comment(AssParser.Opt_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssParser#opt_comment}.
	 * @param ctx the parse tree
	 */
	void exitOpt_comment(AssParser.Opt_commentContext ctx);
}