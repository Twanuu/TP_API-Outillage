package appSpringBoot.demo.model;

import java.util.List;

public class Geometry {
    private String type;
    private List<Double> coordinates;

    public String getType() {
        return type;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
