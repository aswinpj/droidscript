/**
 * Created by Aswin P J on 08-Feb-16.
 */
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends calcBaseVisitor<Integer>{

    Map<String,Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitPrintExpression(calcParser.PrintExpressionContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitAssignment(calcParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Integer value = visit(ctx.expr());
        memory.put(id,value);
        return value;

    }

    @Override
    public Integer visitIdentifier(calcParser.IdentifierContext ctx) {
        String id = ctx.ID().getText();
        if(memory.containsKey(id))
        {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitMathematicalOperations(calcParser.MathematicalOperationsContext ctx) {
        int leftOperant = visit(ctx.expr(0));
        int rightOperant = visit(ctx.expr(1));
        switch (ctx.op.getType())
        {
            case calcParser.ADD:
                return leftOperant+rightOperant;


            case calcParser.SUB:
                return leftOperant-rightOperant;


            case calcParser.MUL:
                return leftOperant*rightOperant;


            case calcParser.DIV:
                return leftOperant/rightOperant;


        }
        return 0;
    }

    @Override
    public Integer visitInteger(calcParser.IntegerContext ctx) {

        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitParenthesis(calcParser.ParenthesisContext ctx) {
        return visit(ctx.expr());
    }
}
