package CodingChallenge65;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        boolean validOperation = true;

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("Error: Division by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOperation = false;
        }
        scanner.close();
    }
}
