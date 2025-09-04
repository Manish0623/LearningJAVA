import java.util.Scanner;
public class SumofNaturalNumbers {
    static int sum(int n){
if(n ==0){
    return 0;
}
else{
    return n + sum(n-1);
}
   } 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
System.out.println("Enter  a number:");
int number = sc.nextInt();
int result = sum(number);

System.out.printf("The sum of the %d is %d%n " , number,result);

   }}
    

