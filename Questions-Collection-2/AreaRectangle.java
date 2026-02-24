//Qno.2 Area of rectangle using constructor

import java.util.Scanner;

class AreaRectangle {
    int length, breadth;

    AreaRectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        AreaRectangle obj = new AreaRectangle(l, b);
        System.out.println("Area of rectangle: " + obj.returnArea());
    }
}