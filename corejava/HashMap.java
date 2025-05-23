import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add student entries. Type '0' as ID to stop.");

        while (true) {
            System.out.print("Enter student ID (integer): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (id == 0) break;

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            students.put(id, name);
        }

        System.out.print("Enter an ID to retrieve the student name: ");
        int searchId = scanner.nextInt();

        String result = students.get(searchId);
        if (result != null) {
            System.out.println("Student Name: " + result);
        } else {
            System.out.println("No student found with ID " + searchId);
        }

        scanner.close();
    }
}
