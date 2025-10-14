package ex_04_TypeCasting;

public class Lab011_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100; // Smaller Bucket
        float GST = 18.45f; // Bigger Bucket
        //int total = course+GST; // Narrowing - Implicit -> Invalid. Because we are storing bigger into the smaller
        int total = course+(int) GST;
        System.out.println(total);

        float total2 = course+GST; // Widening - auto - implicit -> Valid
        System.out.println(total2);
        // When perfroming the automation always use the bigger basket means big datatype

    }
}
