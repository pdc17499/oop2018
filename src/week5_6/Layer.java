package week5_6;

import java.util.ArrayList;


public class Layer {
    private ArrayList<Shape> shape;

    public Layer(ArrayList<Shape> sh) {
        this.shape = sh;

    }

    public Layer() {
        this.shape= new ArrayList<>();

    }


    public ArrayList<Shape> getShapes() {
        return shape ;
    }

    public void setShapes(ArrayList<Shape> sh) {
        this.shape = sh;
    }




    public void addShape(Shape shape) {
        this.shape.add(shape);
    }

    public void removeTriangle() {

    }






}
