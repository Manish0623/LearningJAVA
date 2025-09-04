import java.util.Scanner;
public class functionPower{
    static int power(int a , int b){
        if ( b == 0){
            return 1;
        }
        else{
            return  a * power(a,  b - 1 );
        }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter the two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = power(num1 , num2);

        System.out.println(" a " + " ^ " + " b " + result);
    }
} 