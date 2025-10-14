package ex_05_TernaryOperator;

public class Lab_014_InterviewQuestion {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression2 : (condition2 ? expression2 : expression3);
        int age = 21;
        String result = (age > 18) ? (age > 25 ? "You can drink" : "You can't drink") : "No";
        System.out.println(result);
    }
}
