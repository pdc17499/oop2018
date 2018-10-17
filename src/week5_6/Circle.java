package week5_6;


public class Circle extends Shape {
    final double PI = 3.14;
    private double radius;
    private Point center;
    public Circle() {

    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }


    public Circle(String color, boolean filled, double radius, Point center) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    //tinh dien tich
    public double getArea() {
        return PI * getRadius() * getRadius();


    }
    //tinh chu vi
    public double getPerimeter() {
        return 2 * PI * getRadius();

    }
}