package week5_6;

import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator<Shape> iter = shape.iterator();
        while (iter.hasNext()) {
            Shape item = iter.next();
            if (item instanceof Triangle) {
                iter.remove();
            }
        }
    }


    public void removeCircle() {
        Iterator<Shape> iter = shape.iterator();
        while (iter.hasNext()) {
            Shape item = iter.next();
            if (item instanceof Circle) {
                iter.remove();
            }
        }
    }




}
