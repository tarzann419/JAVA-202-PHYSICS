public class Upthrust extends Physics {

    double density;
    double volume;
    public Upthrust(double mass, double velocity) {
        super(mass, velocity);
        this.density = density;
        this.volume = volume;
    }

    public static double calcUpthrust(double density, double volume){
        return density * 9.81 * volume;
    }
}
