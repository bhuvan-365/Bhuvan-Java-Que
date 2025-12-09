// Write a Java program that takes two numbers as input and displays 
// sum, product, quotient, remainder and average.
import java.util.Scanner;

public class ScannerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Product = " + (a * b));
        System.out.println("Quotient = " + (a / b));
        System.out.println("Remainder = " + (a % b));
        System.out.println("Average = " + ((a + b) / 2.0));
    }
}
