interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    void blowHorn() {
        System.out.println("Blow horn");
    }

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake by " + decrement);
    }

    public void speedUp(int increment) {
        System.out.println("Speeding up by " + increment);
    }
}

public class Main {
    public static void main(String[] args) {
        AvonCycle myCycle = new AvonCycle();

        myCycle.blowHorn();
        myCycle.applyBrake(20);
        myCycle.speedUp(30);
    }
}





