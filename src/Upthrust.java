public class Upthrust extends Physics {

    public Upthrust(double density, double volume) {
        super(density, volume);
    }

    public double calcUpthrust() {
        return density * 9.81 * volume;
    }

}