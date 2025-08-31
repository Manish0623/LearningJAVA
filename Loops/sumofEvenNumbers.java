import java.util.Scanner;
public class sumofEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int sum = 0;
        System.out.println("Enter the numbers:");
        int number = sc.nextInt();

        for(int i=1;i<=number;i++){
            if(i%2==0){
            sum = sum + i;
           
            }
           
        }
         System.out.println("The sum of the N even numbers: " + sum);
        sc.close();
    }
}
