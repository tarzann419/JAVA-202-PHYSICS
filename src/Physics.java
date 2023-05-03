import java.util.Scanner;

public class Physics {
    //lets define the common variables needed
    protected double mass;
    protected double velocity = 10.00;

    //lets create a constructor
    public Physics(double mass, double velocity){
        this.mass = mass;
        this.velocity = velocity;
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
}
