package ex_02_Literals;

public class Lab005_Literals {
    public static void main(String[] args) {
        //Literals are the actual values assigned
        // Literals can be Numeric and Non-Numeric
        // In below example the 10 is the literal
        // data_types variable_name (identifier) = variable_value (literal)
        /* Types of Literals
                1. Boolean Literals - true/false
                2. Character literals
                3. String Literals
                4. Integral Literals
                5. Floating Literals
                6. null Literals, Scientific Literals
         */

        //Integral Literal
        int a = 10;
        int Enum = 9; //This is the valid variable because E is capital
        System.out.println("These are the integral literal = " + a + ", " + Enum);

        //Floating Literal
        float pi = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00F;
        System.out.println("These are the floating literal = " + pi + ", " +  pi2 + ", " + x);

        //Boolean Literals
        boolean is_married = true;
        boolean is_not_married = false;
        //boolean is_married_test = 123 //We cannot give any value to the boolean

        System.out.println("These are the boolean literals which have True and False = " + is_married + is_not_married);

        // Will not come in the automation
        // Binary Literal
        int binary_num = 0b1010; //Decimal System - 10 // It become binary by using 0b

        // Octal Base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface; // base 16 color combination are in hex - #28a745

        System.out.println("These are the binary, octal, hex literals but these will not come in the automation = "
                                + binary_num + ", " + octal + ", " + hex);

        // Character Literal
        char c1 = 'A'; //Character can be anything A-Z, a-z, and special character
        // "A" is the string
        char blankspace = ' ';
        // Whatever the character we are making will be in the ASCII format (Limited Numbers) - A -> 65
        // Escape Character Literals are
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        System.out.println("NamanJain");
        System.out.println("Naman"+new_line+"Jain");
        System.out.println("Naman\nJain");
        System.out.println("Naman"+tab_line+"Jain");
        System.out.println("Naman"+back_space+"Jain");
        System.out.println("Naman"+carriage_return+"Jain");

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smiley = '\u263A'; // :)
        System.out.println(my_laugh_smiley);

        // Non Primitve Literals: These are the datatypes which can be further broken down
        String name = "Naman"; //String is bunch of char.
        int[] arrays_of_items = new int[10];
    }
}
