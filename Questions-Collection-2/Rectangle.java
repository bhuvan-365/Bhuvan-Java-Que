//Qno.3 Area and perimeter of rectangles

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int Area() {
        return length * breadth;
    }

    int Perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Rectangle 1 Area: " + r1.Area());
        System.out.println("Rectangle 1 Perimeter: " + r1.Perimeter());

        System.out.println("Rectangle 2 Area: " + r2.Area());
        System.out.println("Rectangle 2 Perimeter: " + r2.Perimeter());
    }
}