public class Upthrust extends Physics {

    public Upthrust(double density, double volume) {
        super(density, volume);
    }

    public double calcUpthrust() {
        return getDensity() * 9.81 * getVolume();
    }

}