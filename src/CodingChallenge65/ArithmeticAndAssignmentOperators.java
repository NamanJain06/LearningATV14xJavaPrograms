package CodingChallenge65;

import java.util.Scanner;

public class ArithmeticAndAssignmentOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Input Num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Please Input Num2: ");
        int num2 = scanner.nextInt();

        int addition = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1/num2;
        int modules = num1%num2;

        System.out.println("Addition: " + addition);
        System.out.println("Substraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modules: " + modules);
    }
}
