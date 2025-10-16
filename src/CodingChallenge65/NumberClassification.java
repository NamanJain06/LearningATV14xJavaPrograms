package CodingChallenge65;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();

        if (userInput > 0){
            System.out.println(userInput + " is positive");
        } else if (userInput < 0) {
            System.out.println(userInput + " is negative");
        }
        else {
            System.out.println("The number is zero");
        }
        scanner.close();
    }
}
