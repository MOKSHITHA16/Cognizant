public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 2 + 3 * 4 - 1;

        System.out.println("Result 1 (10 + 5 * 2): " + result1); // 10 + (5*2) = 20
        System.out.println("Result 2 ((10 + 5) * 2): " + result2); // (10+5)*2 = 30
        System.out.println("Result 3 (20 / 2 + 3 * 4 - 1): " + result3); // 10 + 12 - 1 = 21
    }
}
