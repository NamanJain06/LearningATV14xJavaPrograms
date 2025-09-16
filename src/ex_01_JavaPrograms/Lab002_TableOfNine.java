package ex_01_JavaPrograms;

public class Lab002_TableOfNine {
    public static void main(String[] args) {

// %d -> int, byte, long, short, - data type
// %s -> String
// %f -> float, double,
// %b ->boolean
// \n used for new line

// pritnln -> it will add a extra new line in the end
// print -> it will not add any extra line
// printf -> c -> c++, Basically used to format the output

        int n = 9;
        System.out.printf("%d x 1 = %d\n", n, n);
        System.out.printf("%d x 2 = %d\n", n, n*2);
        System.out.printf("%d x 3 = %d\n", n, n*3);
        System.out.printf("%d x 4 = %d\n", n, n*4);
        System.out.printf("%d x 5 = %d\n", n, n*5);
        System.out.printf("%d x 6 = %d\n", n, n*6);
        System.out.printf("%d x 7 = %d\n", n, n*7);
        System.out.printf("%d x 8 = %d\n", n, n*8);
        System.out.printf("%d x 9 = %d\n", n, n*9);
        System.out.printf("%d x 10 = %d\n", n, n*10);
    }
}
