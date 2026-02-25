//Qno.5 Read student name and roll from command line

class StudentCommand {
    String name;
    int roll;

    StudentCommand(String n, int r) {
        name = n;
        roll = r;
    }

    public static void main(String[] args) {

        String name = args[0];
        int roll = Integer.parseInt(args[1]);

        StudentCommand s = new StudentCommand(name, roll);

        System.out.println("Name: " + s.name);
        System.out.println("Roll: " + s.roll);
    }
}