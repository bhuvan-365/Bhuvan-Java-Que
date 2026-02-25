//Qno.1 Create a class named 'student' with name and roll_no

class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ram";
        s.roll_no = 7;

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.roll_no);
    }
}