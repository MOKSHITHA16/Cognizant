import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = s.nextDouble();
        System.out.print("Enter second number: ");
        double b = s.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = s.next().charAt(0);

        double res = (op == '+') ? a + b :
                     (op == '-') ? a - b :
                     (op == '*') ? a * b :
                     (op == '/' && b != 0) ? a / b : Double.NaN;

        System.out.println("Result: " + res);
        s.close();
    }
}
