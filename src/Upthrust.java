public class Upthrust extends Physics {

    public Upthrust(double density, double volume) {
        super(density, volume);
    }

    public double calcUpthrust() {
        try {
            return density * 9.81 * volume;
        } catch (Exception e){
            System.out.println("something went wrong");
        }
    }

}