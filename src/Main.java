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

        System.out.print("Enter the value of density: ");
        double density = scanner.nextDouble();

        System.out.print("Enter the value of volume: ");
        double volume = scanner.nextDouble();

        System.out.println("Enter the value of magnitude: ");
        double magnitude = scanner.nextDouble();

        System.out.println("Enter the value of distance: ");
        double distance = scanner.nextDouble();

        System.out.println("Which energy do you want to calculate? ");
        System.out.println("1.Kinetic Energy");
        System.out.println("2.Potential Energy");
        System.out.println("3.Upthrust");
        System.out.println("4.Momentum");
        System.out.println("5.Moment");
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
            case 3:
                Upthrust upthrust = new Upthrust(density, volume);
                System.out.println("The value of the Upthrust is: " + upthrust.calcUpthrust(density, volume));
                break;
            case 4:
                Momentum Momentum = new Momentum(mass, velocity);
                System.out.println("The value of the Momentum is: " + Momentum.calcMomentum(mass, velocity));
                break;
            case 5:
                Moment Moment = new Moment(magnitude, distance);
                System.out.println("The value of the Moment is: " + Moment.calcMoment(magnitude, distance));
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
