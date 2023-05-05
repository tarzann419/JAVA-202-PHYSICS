public class Momentum extends Physics {

    public Momentum(double mass, double velocity) {
        super(mass, velocity);
    }

    public double calcMomentum(double mass, double velocity) {
        return mass * velocity;
    }

}