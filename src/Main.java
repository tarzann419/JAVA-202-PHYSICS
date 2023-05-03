//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the value of mass: ".toUpperCase());
//        double mass = scanner.nextDouble();
//
//        System.out.print("Enter the value of velocity: ".toUpperCase());
//        double velocity = scanner.nextDouble();
//
//
//        KineticEnergy ke = new KineticEnergy(mass, velocity);
//        System.out.println("the value of the kinetic energy is: ".toUpperCase() + ke.calcKe());
//
//        System.out.print("Enter the value of height: ");
//        double height = scanner.nextDouble();
//
////        KineticEnergy ke = new KineticEnergy(mass, velocity);
////        System.out.println(ke.calcKe());
//
//        PotentialEnergy pe = new PotentialEnergy(mass, velocity, height);
//        System.out.println(pe.calcPE());
//
//    }
//}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of mass: ");
        double mass = scanner.nextDouble();

        System.out.print("Enter the value of velocity: ");
        double velocity = scanner.nextDouble();

        System.out.print("Enter the value of height: ");
        double height = scanner.nextDouble();

        System.out.println("Which energy do you want to calculate? ");
        System.out.println("1. Kinetic Energy");
        System.out.println("2. Potential Energy");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                KineticEnergy ke = new KineticEnergy(mass, velocity);
                System.out.println("The value of the kinetic energy is: " + ke.calcKe());
                break;
            case 2:
                PotentialEnergy pe = new PotentialEnergy(mass, velocity, height);
                System.out.println("The value of the potential energy is: " + pe.calcPE());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
