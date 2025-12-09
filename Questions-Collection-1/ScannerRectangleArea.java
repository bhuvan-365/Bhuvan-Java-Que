// Write a program that takes length and breadth as input 
// and displays the area of a rectangle.
import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        System.out.println("Area = " + (l * b));
    }
}
