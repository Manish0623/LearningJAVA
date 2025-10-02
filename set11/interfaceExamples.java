class Monkey {
    void jump() {
        System.out.println("The monkey is jumping...");
    }
    void bite() {
        System.out.println("If you act oversmart, the monkey will bite you...");
    }
}

interface BasicAnimals {
    void eats();
    void sleeps();
}

class Human extends Monkey implements BasicAnimals {
    public void eats() {
        System.out.println("Human also eats food...");
    }
    public void sleeps() {
        System.out.println("Human mostly sleeps at night...");
    }

    void speak() {
        System.out.println("Human can speak...");
    }
}

public class interfaceExamples {
    public static void main(String[] args) {
        Human h = new Human();
        h.eats();    // from BasicAnimals
        h.sleeps();  // from BasicAnimals
        h.jump();    // from Monkey
        h.bite();    // from Monkey
        h.speak();   // from Human
    }
}
