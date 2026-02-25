//Qno.4 Area and perimeter of triangle

class Triangle {
    int a, b, c;

    Triangle(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    int Perimeter() {
        return a + b + c;
    }

    double Area() {
        double s = Perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {

        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Perimeter: " + t.Perimeter());
        System.out.println("Area: " + t.Area());
    }
}