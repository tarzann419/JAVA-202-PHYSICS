import java.util.Scanner;

public class KineticEnergy extends Physics {

    public KineticEnergy(double mass, double velocity) {
        super(mass, velocity);
    }

    public double calcKe(){
        return 0.5*getMass()*getVelocity()*getVelocity();
    }
}
