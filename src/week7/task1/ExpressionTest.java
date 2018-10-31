package week7.task1;
class ExpresstionTest {
    public static void main(String args[]) {
        Numeral a1 = new Numeral (10);
        Numeral a2 = new Numeral (1);
        Numeral a3 = new Numeral (2);
        Numeral a4 = new Numeral (3);
        Square square1 = new Square (a1);
        Subtraction sub1 = new Subtraction (square1, a2);
        Multiplication multi1 = new Multiplication (a3, a4);
        Addition add2 = new Addition (sub1, multi1);
        Square square2 = new Square (add2);
        System.out.println (square2.evaluate ());

        Division div = new Division(new Numeral(40),new Numeral(0));
        try{
            double k;
            k= div.left().evaluate()/div.right().evaluate();
            System.out.println(k);
        }
        catch (ArithmeticException e){
            System.out.println("Khong the chia cho so 0");
        }
    }


}