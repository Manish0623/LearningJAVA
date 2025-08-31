import java.util.Scanner;
public class usingwhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
int number  = sc.nextInt();

int factorial = 1;
int i =1;

do{
    factorial = factorial * i;
    i++;
}
while( i <= number);
 System.out.println(" The factorial " + number + " is : " + factorial);
 sc.close();
    }

}
