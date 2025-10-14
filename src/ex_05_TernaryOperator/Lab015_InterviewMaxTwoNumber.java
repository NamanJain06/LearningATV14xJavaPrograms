package ex_05_TernaryOperator;

public class Lab015_InterviewMaxTwoNumber {
    public static void main(String[] args) {
        // Find the Maximum number between two numbers.
        int x = 10;
        int y = 20;

        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
