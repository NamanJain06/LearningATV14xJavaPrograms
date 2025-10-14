package ex_04_TypeCasting;

public class Lab010_TypeCasting {
    public static void main(String[] args) {
        long phoneNo = 1234567891l;
        //short s = phoneNo; // Narrowing - implicit -> Not Valid
        short s = (short) phoneNo; // Narrowing - Explicit -> Valid
        System.out.println(s);
    }
}
