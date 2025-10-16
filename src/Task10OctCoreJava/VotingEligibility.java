package Task10OctCoreJava;

import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Person is eligible to vote.");
        } else {
            System.out.println("Person is not eligible to vote.");
        }

        scanner.close();
    }
}
