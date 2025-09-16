package ex_03_Operators;

public class Lab006_Operators {
    public static void main(String[] args) {
        /* Operators
            1. An operator is a special symbol
            2. Tells the compiler to perform the specific mathematical or logical operations on operands.
            3. Operators are used to perform operations by using operands. (variabl names) -> age
            Unary operator which required with single operand
            Binary operator which required with the two operands
            Ternary operator which required three operands
         */
        // New Operator
        String s1= new String("Naman");
        System.out.println(s1);

        // Instance of operator
        // Increament and Decrement

        // Unary Operators // a1 is the operand
        int a1 = +10;
        int a2 = -110;
        int result = a1+a2;
        System.out.println(result);

        //int a = 10; // = is the assignment operator // Right hand value to Left hand value
        // Assignment operator
        int age = 90; // Assingment Operator, int -> datatype, age -> identifier, = -> Assignment operator, 90 -> Literal
        System.out.println(age);

        // Arithmatic Operators -> Used for basic mathematical operations
        /* 1. + (Addition)
           2. - (Subtraction)
           3. * (Multiplication)
           4. / (Division)
           5. % (Modulus)
         */

        int a = 10;
        int b = 30;
        float c = 3.0f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println("a+b");
        System.out.println(a+b);
        System.out.println(a%b); // % is the modulus it gives the reminder

        // Relational Operators -> Used to compare two values
        /* 1. < (Less than)
           2. <= (Less than or equal to)
           3. > (Greater than)
           4. >= (Greater than or equal to)
           5. = (Equal to)
           6. != (Not equal to)
         */
        boolean d = a > b;
        System.out.println(d);

        int age_test = 33;
        int age_test1 = 34;
        boolean result1 = age_test1 >= age_test;
        System.out.println(result1);

        // Logical Operators -> Digiatal Electronics
        /* 1. && (And)
           2. || (OR)
           3. ! (Not) - Reverse
         */

        // Check the AND Gate and the OR Gate
        boolean a3 = true;
        System.out.println(!a3);

        boolean b2 = true;
        System.out.println(!!b2);

        boolean c1 = true || false;
        System.out.println(c1);

        boolean d1 = false && true;
        System.out.println(d1);

        // Compound Assingment Operators
        /* 1. +=
           2. -=
           3. /=
           4. *=
         */

        // BODMAS is an acronym that helps people remember the order of mathematial operations
        /* 1. B: Brackets
           2. O: Order (power, indices, or roots)
           3. D: Division
           4. M: Multiplication
           5. A: Addition
           6. S: Subtraction
         */
    }
}
