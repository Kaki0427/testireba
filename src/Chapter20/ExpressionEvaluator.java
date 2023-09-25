package Chapter20;

import javax.script.*;

public class ExpressionEvaluator {
    private String expression;

    public ExpressionEvaluator(String expression) {
        this.expression = expression;
    }

    public double evaluateExpression() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Object result = engine.eval(expression);
        if (result instanceof Number) {
            return ((Number) result).doubleValue();
        } else {
            throw new IllegalArgumentException("Invalid expression");
        }
    }
}

