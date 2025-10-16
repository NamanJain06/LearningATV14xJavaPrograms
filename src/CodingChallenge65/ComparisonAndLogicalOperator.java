package CodingChallenge65;
import java.util.Scanner;

public class ComparisonAndLogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value for a: ");
        int a = scanner.nextInt();

        System.out.println("Enter Value for b: ");
        int b = scanner.nextInt();

        System.out.println("\n--- Comparison Operators ---");
        System.out.println("a == b: " + (a == b));
        System.out.println("a ! b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
        System.out.println("!(a > b): " + (!(a > b)));

        scanner.close();

    }
}
