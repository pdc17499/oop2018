package week5_6;


public class Square extends Rectangle {

    public Square(Point center, double side) {
        super(center, side, side);
    }

    public Square(String color, boolean filled, Point center, double side) {
        super(color, filled, center, side, side);
    }
    public double getSide(){
        return super.getWidth();
    }


    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }



    public void setWidth(double side){

        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }

    public String toString(){
        return "Square";
    }
}
