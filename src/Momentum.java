public class Momentum extends Physics {

    public Momentum(double mass, double velocity) {
        super(mass, velocity);
    }

    public double calcMomentum(double mass, double velocity) {
        try{
        return mass * velocity;
        } catch (Exception e){
            System.out.println("error");
        }
        return 0;
    }

}