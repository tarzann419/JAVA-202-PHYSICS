package GUI;

public class MomentGUI {
    double magnitude;

    double distance;

    public MomentGUI(double magnitude, double distance){
        this.magnitude= magnitude;
        this.distance = distance;
    }

    public double getMagnitude () {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double calcMoment(){
        return magnitude * distance;
    }
}
