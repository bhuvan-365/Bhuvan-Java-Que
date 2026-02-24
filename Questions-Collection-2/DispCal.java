//Qno.7 Interface Calculation with sum and multiplication

interface Calculation {
    int sum(int x, int y);
    int mul(int x, int y);
}

class DispCal implements Calculation {

    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {

        DispCal d = new DispCal();

        System.out.println("Sum: " + d.sum(5, 3));
        System.out.println("Multiplication: " + d.mul(5, 3));
    }
}