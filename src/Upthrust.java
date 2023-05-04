public class Upthrust extends Physics {

    public Upthrust(double density, double volume) {
        super(density, volume);
    }

    public double calcUpthrust() {
        try {
            return getDensity() * 9.81 * getVolume();
        } catch (Exception e){
            System.out.println("something went wrong");
        }
        return 0;
    }

}