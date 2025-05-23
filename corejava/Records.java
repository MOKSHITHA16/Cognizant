import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Define the record
    record Person(String name, int age) {}

    public static void main(String[] args) {
        // Create instances
        Person p1 = new Person("Ava", 22);
        Person p2 = new Person("Leo", 17);
        Person p3 = new Person("Zara", 25);

        // Put them in a list
        List<Person> people = List.of(p1, p2, p3);

        // Print all
        System.out.println("All People:");
        people.forEach(System.out::println);

        // Filter based on age
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("\nAdults (age 18+):");
        adults.forEach(System.out::println);
    }
}
