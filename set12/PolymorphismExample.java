// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a; // reference of parent class

        a = new Dog(); // Dog object
        a.sound(); // Calls Dog's sound() — runtime polymorphism

        a = new Cat(); // Cat object
        a.sound(); // Calls Cat's sound()
    }
}
