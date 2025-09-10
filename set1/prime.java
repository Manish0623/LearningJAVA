import java.util.Scanner;
public class prime{
    public static boolean isPrime(int n) {
        if( n<= 1) {
            return false;
        }


        for(int i=2;i<=Math.sqrt(n) ; i++){
            if(n % 2 ==0){
                return false;
            }
        }
return true;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");
int number = sc.nextInt();

if(isPrime(number)){
    System.out.println(number + " is a prime number. ");
} else{
    System.out.println(number + " is not a prime number. ");
}

}}

