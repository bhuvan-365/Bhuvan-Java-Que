// Write a program to input and display personal details.
import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("College Name: ");
        String college = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Gender: ");
        String gender = sc.nextLine();

        System.out.print("Date of Birth: ");
        String dob = sc.nextLine();

        System.out.println("\n--- Personal Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("College: " + college);
        System.out.println("Level: " + level);
        System.out.println("Gender: " + gender);
        System.out.println("DOB: " + dob);
    }
}
