package week5_6;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> layers;


    public Diagram(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public Diagram() {
        this.layers = new ArrayList<>();
    }

    public ArrayList<Layer> getLayers() {
        return layers;
    }

    public void setLayers(ArrayList<Layer> layers) {
        this.layers = layers;
    }

    public void addLayer(Layer layer) {
        this.layers.add(layer);
    }




}