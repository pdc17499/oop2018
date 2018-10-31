package week7.task1;

public class Numeral extends  Expression{
    private  int value;
    public  Numeral(){this.value=0;}
    public  Numeral(int a){
        this.value=a;
    }

    int evaluate() {
        return value;
    }

    public String toString() {
        String temp = this.value+"";
        return temp;
    }
}
