package week5_6;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layer;


    public Diagram(ArrayList<Layer> layer) {
        this.layer= layer;
    }

    public Diagram() {
        this.layer = new ArrayList<>();
    }

    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayers(ArrayList<Layer> layer) {
        this.layer = layer;
    }

    public void addLayer(Layer layer) {
        this.layer.add(layer);
    }

    public void removeCircle() {
        for (Layer k : layer ) {

            k.removeCircle();
        }
    }


}