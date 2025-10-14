package ex_05_TernaryOperator;

public class Exercise_20Sept {
    public static void main(String[] args) {
/*
        1. Check if the number is even or odd by using Ternary Operator.  (Notepad).
        2. Interview - Zeta → (AT) Ter nested → Max between 3 numbers →  int n1 = 2; int n2 = 9;  int n3 = -11;
        3. Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator
*/
        int num = 49;
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);

        int n1 = 2; int n2 = 9; int n3 = -11;
        int maxResult = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(maxResult);

        int age = 59;
        String category = age < 18 ? "Minor" : ((age > 18 && age < 30) ? "Adult" : "Sr Senior");
        System.out.println(category);

    }
}
