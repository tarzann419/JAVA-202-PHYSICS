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

//        KineticEnergy ke = new KineticEnergy(mass, velocity);
//        System.out.println(ke.calcKe());

        PotentialEnergy pe = new PotentialEnergy(mass, velocity, height);
        System.out.println(pe.calcPE());

    }
}
