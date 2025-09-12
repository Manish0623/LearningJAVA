package set3;



import java.util.Scanner;
public class NumberInterchange {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

System.out.println(" Enter the first number : ");
int a = sc.nextInt();

System.out.println(" Enter the second number: ");
int b = sc.nextInt();


System.out.println(" the value of a is  " + a + " and value of b is :" + b);

a = a+b;
b = a-b;
a = a-b;

System.out.println(" after changing the value of a is " + a + " and the value of b is " + b );

    }
}
