package week4.task2;


public class Main {
    public static void main(String[] args) {
        Square k= new Square();

        k.setLength(2);
        k.setWidth(3);
        System.out.println(k.getArea());
        System.out.println(k.getPerimeter());


        Square kk = new Square(5,"orange",false);
        System.out.println(kk.getSide());
        System.out.println(kk.getColor());
        System.out.println(kk.isFilled());
        System.out.println('\n');

        Rectangle r = new Rectangle();
        r.setWidth(12);
        r.setLength(16);

        System.out.println(r.getPerimeter());




        System.out.println("\n");
        Circle n= new Circle();
        n.setRadius(7);
        System.out.println(n.getArea());
        System.out.println(n.getPerimeter());


    }
}

