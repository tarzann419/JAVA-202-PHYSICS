import java.util.Scanner;

public class PotentialEnergy extends Physics {
    // dont forget that you always have to call the constructor from the superclass

    protected double height;
    public PotentialEnergy() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of mass: ");
        double mass = scanner.nextDouble();
        System.out.print("Enter the value of velocity: ");
        double velocity = scanner.nextDouble();
        System.out.print("Enter the value of height: ");
        double height = scanner.nextDouble();


        setMass(mass);
        setVelocity(velocity);
        this.height = height;

        super(mass, velocity);

    }

    //since its protected, we have to get it using the getter and setter

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    // now we define the main code to calculate the potential energy
    public String calcPE(){
        double result = mass*velocity*height;
        return "the value of the potential energy is: " + result;
    }

}
