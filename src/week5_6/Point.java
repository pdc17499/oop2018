package week5_6;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }


    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public void moving(double direction) {
        double cos = Math.cos(direction * Math.PI / 180);
        double sin = Math.sin(direction * Math.PI / 180);
        x += 10 * cos;
        y += 10 * sin;
    }
}
