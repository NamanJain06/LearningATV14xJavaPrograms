package CodingChallenge65;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0){
            System.out.println("Factorial is not defined for negative numbers.");
            scanner.close();
            return;
        }
        BigInteger factorial = BigInteger.ONE;
        int i = number;

        while (i > 1){
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i--;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
