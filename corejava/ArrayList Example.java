import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names. Type 'done' to finish:");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            names.add(input);
        }

        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
