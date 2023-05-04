public class Momentum extends Physics {

    double velocity;
    double mass;

    public Momentum(double mass, double velocity) {
        super(mass, velocity);
    }

    public double calcMomentum() {
        return mass * velocity;
    }

}