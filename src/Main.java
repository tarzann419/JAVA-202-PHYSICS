import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of mass: ".toUpperCase());
        double mass = scanner.nextDouble();

        System.out.print("Enter the value of velocity: ".toUpperCase());
        double velocity = scanner.nextDouble();

<<<<<<< HEAD
        KineticEnergy ke = new KineticEnergy(mass, velocity);
        System.out.println("the value of the kinetic energy is: ".toUpperCase() + ke.calcKe());
=======
        System.out.print("Enter the value of height: ");
        double height = scanner.nextDouble();

//        KineticEnergy ke = new KineticEnergy(mass, velocity);
//        System.out.println(ke.calcKe());

        PotentialEnergy pe = new PotentialEnergy(mass, velocity, height);
        System.out.println(pe.calcPE());
>>>>>>> refs/remotes/origin/main

    }
}
