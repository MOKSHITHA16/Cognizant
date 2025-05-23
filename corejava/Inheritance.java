import java.util.Scanner;
public class car {
    public static void main(String[] args) {
    private String make;
    private String model;
    private int year;
    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayDetails() {
        System.out.println("Car Details: " + year + " " + make + " " + model);
    }

    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);
        car1.displayDetails();
        car2.displayDetails();
    }
}
