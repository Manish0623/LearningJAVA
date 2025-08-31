import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int factorial = 1;

        System.out.println(" Enter a number");
        int number = sc.nextInt();

        for ( int i= 1 ;i<=number ;i++){
            factorial =  factorial * i;
        }
System.out.println(" The factorial of " + number + " is : " + factorial );
    }
}
