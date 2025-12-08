// Write a program to find sum of elements of an array.
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = 0;

        for (int x : arr) sum += x;

        System.out.println("Sum = " + sum);
    }
}
