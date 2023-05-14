package GUI;

public class Physics {
    //lets define the common variables needed
    private double mass;
    private double velocity;
    private double density;
    private double volume;
    private double magnitude;
    private double distance;


    //lets create a constructor for the upthrust method
    public Physics(double density, double volume) {
        this.density = density;
        this.volume = volume;
    }

    //lets create a constructor
    public Physics(double mass, double velocity, double density, double volume){
        this.mass = mass;
        this.velocity = velocity;
        this.density = density;
        this.volume = volume;
    }


    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    //a get function for mass after we made it protected
    public double getMass(){
        return mass;
    }

    //were going to set the return type to void because it doesnt return a value instead it updates
    public void setMass(double mass){
        this.mass = mass;
    }


    public double getVelocity(){
        return velocity;
    }

    public void setVelocity(double velocity){
        this.velocity = velocity;
    }

    public double getMagnitude() {
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
}