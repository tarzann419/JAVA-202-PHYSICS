import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the mass of the object: ");
//        double mass = scanner.nextDouble();
//
//        System.out.print("Enter the velocity of the object: ");
//        double velocity = scanner.nextDouble();
//
//        System.out.print("Enter the height of the object: ");
        double height = scanner.nextDouble();

        PotentialEnergy pe = new PotentialEnergy();
        String peValue = pe.calcPE();
        System.out.println("Potential energy: " + peValue);
    }
}