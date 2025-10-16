package CodingChallenge65;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int i = 5;
        int j;

        System.out.println("Initial Value of i: " + i);
        // Pre-Increment: increment first, then use
        j = ++i;
        System.out.println("After pre-increment (++i): j = " + j + ", i = " + i);

        // Post-increment: use first, then increment
        i = 5;
        j = i++;
        System.out.println("After post-increment (i++): j = " + j + ", i = " + i);

        // Pre-decrement: decrement first, then use
        i = 5;
        j = --i;
        System.out.println("After pre-decrement (--i): j = " + j + ", i = " + i);

        // Post-decrement: use first, then decremenet
        i = 5;
        j = i--;
        System.out.println("After post-decrement (i--): j = " + j + ", i = " + i);

    }
}
