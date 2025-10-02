


interface SampleInterface {
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface {
    void meth3();
    void meth4();
}

class MySampleClass implements ChildSampleInterface {
    public void meth3() {
        System.out.println("Meth3");
    }

    public void meth4() {
        System.out.println("Meth4");
    }

    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }
}

public class inheritance_inheritance {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

