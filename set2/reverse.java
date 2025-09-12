
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


int reversed = 0;
System.out.println("Enter a number : ");
int number  = sc.nextInt();



for( ; number!=0;number = number /10){
    int digit = number % 10;
     reversed = reversed  * 10 + digit;
}

System.out.println(" number after reversing : " + reversed);
    }}

