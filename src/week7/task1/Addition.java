package week7.task1;

public class Addition extends  BinaryExpression{
    Expression left;
    Expression right;
    public  Addition(Expression a,Expression b){
        left=a;
        right=b;
    }
}
