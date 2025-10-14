package ex_04_TypeCasting;

public class Lab008_TypeCasting {
    public static void main(String[] args) {
/*
         TypeCasting is to convert one datatype to another datatype
         There are two types of type casting:
         widening: Explicit, Implicit
         narrowing: Explicit, Implicit
         Widening: Widening casting, also known as implicit casting, occurs when converting a smaller data type to
         a larger one
         This type of casting is performed automatically by Java compiler and considered to be safe as there is no risk
         of data loss
*/

        byte b = 10;
        int a = b; // Valid Syntax -> Widening -> Implicit casting - Automatically done
        int c = (int)b; // Valid Syntax -> Widening -> Explicit casting - Not Required

//        int c = 300;
//        byte d = c;

    }
}
