import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = s.nextInt();
        long factorial = 1;

        if (num < 0) {
            System.out.println("Oops! Factorial isn't defined for negative numbers");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }

        s.close();
    }
}
