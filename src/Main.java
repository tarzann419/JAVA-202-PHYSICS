import GUI.*;

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        EnergyCalculatorGUI energyCalculatorGUI = new EnergyCalculatorGUI();
        energyCalculatorGUI.setVisible(true);
    }
}

//public class Main1 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Which energy do you want to calculate? ");
//        System.out.println("1. Kinetic Energy");
//        System.out.println("2. Potential Energy");
//        System.out.println("3. Upthrust");
//        System.out.println("4. Momentum");
//        System.out.println("5. Moment");
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                System.out.print("Enter the value of mass: ");
//                double mass = scanner.nextDouble();
//
//                System.out.print("Enter the value of velocity: ");
//                double velocity = scanner.nextDouble();
//
//                KineticEnergy ke = new KineticEnergy(mass, velocity);
//                System.out.println("The value of the kinetic energy is: ".toUpperCase() + ke.calcKe() + "J");
//                break;
//            case 2:
//                System.out.print("Enter the value of mass: ");
//                double mass1 = scanner.nextDouble();
//
//                System.out.print("Enter the value of height: ");
//                double height = scanner.nextDouble();
//
//                PotentialEnergy pe = new PotentialEnergy(mass1, height);
//                System.out.println("The value of the potential energy is: ".toUpperCase() + pe.calcPE(mass1) + "J");
//                break;
//            case 3:
//                System.out.print("Enter the value of density: ");
//                double density = scanner.nextDouble();
//
//                System.out.print("Enter the value of volume: ");
//                double volume = scanner.nextDouble();
//
//                Upthrust upthrust = new Upthrust(density, volume);
//                System.out.println("The value of the Upthrust is: ".toUpperCase() + upthrust.calcUpthrust() + "g/cm3");
//                break;
//            case 4:
//                System.out.print("Enter the value of mass: ");
//                double mass2 = scanner.nextDouble();
//
//                System.out.print("Enter the value of velocity: ");
//                double velocity2 = scanner.nextDouble();
//
//                Momentum momentum = new Momentum(mass2, velocity2);
//                System.out.println("The value of the Momentum is: ".toUpperCase() + momentum.calcMomentum(mass2, velocity2) + "kgm/s");
//                break;
//            case 5:
//                System.out.print("Enter the value of magnitude: ");
//                double magnitude = scanner.nextDouble();
//
//                System.out.print("Enter the value of distance: ");
//                double distance = scanner.nextDouble();
//
//                Moment moment = new Moment(magnitude, distance);
//                System.out.println("The value of the Moment is: ".toUpperCase() + moment.calcMoment(magnitude, distance) + "g/cm3");
//                break;
//            default:
//                System.out.println("Invalid choice!");
//                break;
//        }
//    }
//}
//
