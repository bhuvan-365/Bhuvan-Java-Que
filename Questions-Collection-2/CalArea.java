//Qno.6 Area of rectangle, triangle and circle using method overloading

class CalArea {

    int area(int l, int b) {
        return l * b;   // Rectangle
    }

    double area(double b, double h) {
        return 0.5 * b * h;   // Triangle
    }

    double area(double r) {
        return Math.PI * r * r;  // Circle
    }

    public static void main(String[] args) {

        CalArea c = new CalArea();

        System.out.println("Rectangle Area: " + c.area(5, 4));
        System.out.println("Triangle Area: " + c.area(5.0, 4.0));
        System.out.println("Circle Area: " + c.area(3.0));
    }
}