import java.util.Scanner;
public class tableusing{
    static void table(int n){
        System.out.println("The multiplication table of: "+ n);
        for(int i=1; i<=10;i++){
            System.out.printf("%d * %d = %d%n " ,n,i, n*i);
        }
       
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = sc.nextInt();
            table(number);
            
        }
}

