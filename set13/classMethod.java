

public class classMethod{

    static void myStaticMethod(){
        System.out.println(" Learning to make static Methods.. ");
    }

    public void myMethod(){
        System.out.println(" It is created making methods..");
    }



    public static void main(String[] args) {
        myStaticMethod();

        classMethod New = new classMethod();
        New.myMethod();
    }}
