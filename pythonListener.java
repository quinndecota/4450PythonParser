// Generated from python.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(pythonParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(pythonParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(pythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(pythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(pythonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(pythonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(pythonParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(pythonParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pythonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pythonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pythonParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pythonParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(pythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(pythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(pythonParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(pythonParser.Assign_opContext ctx);
}