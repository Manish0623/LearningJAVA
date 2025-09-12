




class Base {
    int x;

    public int get() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("This code is an example of constructor...");
    }
}


class Derived extends Base {
    int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.print();

        Derived d = new Derived();
        d.setx(10);
        d.sety(20);

        System.out.println("x = " + d.get());   
        System.out.println("y = " + d.gety());  
    }
}

