package CodingChallenge65;

import java.util.Scanner;

public class OperatorPrecedenceAndTypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer a: ");
        int a = scanner.nextInt();

        System.out.println("Enter decimal b: ");
        double b = scanner.nextDouble();

        int result = a + (int) (b * 3) + 4 / 2 + 1;

        double implicitCasting = a + b;

        int explicitCasting = (int) b;

        System.out.println("Expression result: " + result);
        System.out.println("Implicit casting (a + b): " + implicitCasting);
        System.out.println("Explicit casting ((int) b): " + explicitCasting);

        scanner.close();
    }
}
