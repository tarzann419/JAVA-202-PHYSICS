package GUI;

public class PotentialEnergy extends PhysicsUI {
    // don't forget that you always have to call the constructor from the superclass

    private double height;
    protected double gravity = 10;

    public PotentialEnergy(double mass, double height) {
        super();
        this.height = height;
    }

    //since its protected, we have to get it using the getter and setter

    public int getHeight() {
        return (int) height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // now we define the main code to calculate the potential energy


    public double calcPE(double mass) {
        try {
            return mass * gravity * getHeight();
        } catch (Exception e) {
            System.out.println("something went wrong");
        }

        return mass;
    }
}