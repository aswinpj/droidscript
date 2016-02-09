// Generated from D:/Projects/Java/DroidScript/src\calc.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(calcParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(calcParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(calcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(calcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(calcParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(calcParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(calcParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(calcParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathematicalOperations}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperations(calcParser.MathematicalOperationsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathematicalOperations}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperations(calcParser.MathematicalOperationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInteger(calcParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInteger(calcParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(calcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(calcParser.ParenthesisContext ctx);
}