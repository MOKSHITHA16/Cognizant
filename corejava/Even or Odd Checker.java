import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = s.nextInt();
        System.out.println(num + " is " + (num % 2 == 0 ? "even." : "odd."));
        s.close();
    }
}
