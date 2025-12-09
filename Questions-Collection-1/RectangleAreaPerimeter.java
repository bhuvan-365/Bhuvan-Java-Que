// Write a Java program to print the area and perimeter of a rectangle.
public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        int length = 10, breadth = 5;

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
