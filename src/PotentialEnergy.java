public class PotentialEnergy extends Physics {
    // dont forget that you always have to call the constructor from the superclass

    protected double height;
    public PotentialEnergy(double mass, double velocity, double height) {
        super(mass, velocity);
        this.height = height;
    }

    //since its protected, we have to get it using the getter and setter

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    // now we define the main code to calculate the potential energy

    public double calcPE(){
        return mass * velocity * height;
    }

}
