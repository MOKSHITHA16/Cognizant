public class Main {
    public static void main(String[] args) {
        printTypeInfo("Java");
        printTypeInfo(42);
        printTypeInfo(3.14);
        printTypeInfo(true);
    }

    static void printTypeInfo(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case Boolean b -> System.out.println("It's a Boolean: " + b);
            default -> System.out.println("Unknown type: " + obj);
        }
    }
}
