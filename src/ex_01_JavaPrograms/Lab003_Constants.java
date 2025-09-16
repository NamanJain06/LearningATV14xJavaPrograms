package ex_01_JavaPrograms;

public class Lab003_Constants {
    public static void main(String[] args) {

        //final is a keyword which make the variable Constant

        int a = 10;
        a = 11;
        System.out.println(a);

        final int b = 99;
        //b = 100; //java: cannot assign a value to final variable b

        final float PI = 3.14f;
        final int a1 = 10;

        System.out.println(b);
        System.out.println(PI);
        System.out.println(a1);
    }
}
