// Write a program to input and calculate product of mxn matrices.
import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] p = new int[2][2];

        System.out.println("Enter first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Product of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                p[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
    }
}
