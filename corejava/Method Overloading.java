public class OverloadExample {
    
    // Method 1: Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Sum of 2.5 and 3.7: " + add(2.5, 3.7));
        System.out.println("Sum of 1, 2, and 3: " + add(1, 2, 3));
    }
}
