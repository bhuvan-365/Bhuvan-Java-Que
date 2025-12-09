// Write a program to find the sum of even and odd numbers from 1 to 100.
public class SumEvenOdd {
    public static void main(String[] args) {
        int even = 0, odd = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) even += i;
            else odd += i;
        }

        System.out.println("Sum of even numbers = " + even);
        System.out.println("Sum of odd numbers = " + odd);
    }
}
