import java.util.Scanner;

public class Fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = s.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number");
        } else {
            System.out.println("Fibonacci: " + fib(n));
        }

        s.close();
    }
}
