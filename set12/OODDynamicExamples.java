

import java.util.Scanner;

// Abstraction
abstract class Vehicle {
    private String brand;  // Encapsulation

    // Setter and Getter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println(getBrand() + " is stopping...");
    }
}

// Inheritance + Polymorphism
class Car extends Vehicle {
    void start() {
        System.out.println(getBrand() + " Car is starting with a key ignition!");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println(getBrand() + " Bike is starting with a self-start button!");
    }
}

// Main class
public class OODDynamicExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Type (Car/Bike): ");
        String type = sc.nextLine();

        System.out.println("Enter Vehicle Brand: ");
        String brand = sc.nextLine();

        Vehicle v; // reference of abstract class

        // Polymorphism in action
        if (type.equalsIgnoreCase("Car")) {
            v = new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            v = new Bike();
        } else {
            System.out.println("Unknown vehicle type!");
            sc.close();
            return;
        }

        v.setBrand(brand);
        v.start();
        v.stop();

        sc.close();
    }
}
