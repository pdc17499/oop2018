package week7.task1;

public class Square extends Expression {

    private Expression expression;


    public Square (Expression expression){
        this.expression = expression;
    }


    @Override
    int evaluate() {
        return (int)Math.pow(expression.evaluate(),2);
    }


    @Override
    public String toString() {
        return expression.toString()+"^2";
    }
}