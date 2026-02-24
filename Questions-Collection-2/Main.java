//Qno.8 Abstract class Shape with Triangle and Rectangle

abstract class Shape {
    abstract double area();
}

class RectangleShape extends Shape {
    double length, breadth;

    RectangleShape(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class TriangleShape extends Shape {
    double base, height;

    TriangleShape(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape r = new RectangleShape(5, 4);
        Shape t = new TriangleShape(6, 3);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}