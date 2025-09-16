package ex_01_JavaPrograms;

public class Lab_004_Local_Variable {
    public static void main(String[] args) {
     //Local variables are which are used inside the block and not anywhere else
        int a = 10, b = 23, c = 90;
        int _ = 10, $ = 11; //These are valid
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println($);


        int local; //Local variable we need to initiablize to use it
        local = 20;
        System.out.println(local);

        //There are 3 types of variable Local, Static, Instance Variable
        //There are no Global variable in Java we can make it by doing something
    }
}
