package ex_04_TypeCasting;

public class Lab009_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Narrowing - Implicit casting - Not Valid
        byte b = (byte) val; // Narrowing - Explicit casting - Valid

        System.out.println(b);
    }
}
