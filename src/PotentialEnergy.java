public class PotentialEnergy extends Physics {
    // dont forget that you always have to call the constructor from the superclass

    private double height;
    protected double gravity = 10;

    public PotentialEnergy(double mass, double height) {
        super(mass, height);
        this.height = height;
    }

    //since its protected, we have to get it using the getter and setter

    public double getHeight() {
        return height;
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