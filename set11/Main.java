

abstract class Vehicle {
    abstract void accelerate();
    abstract void brake();

    void startEngine() {
        System.out.println("Engine will Start...");
    }
}

class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Accelerate to get top speed...");
    }

    @Override
    void brake() {
        System.out.println("Apply brake properly to avoid accident...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.accelerate();
        c.brake();
    }
}
