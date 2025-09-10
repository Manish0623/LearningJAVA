import java.util.Scanner;
public class numberInterChange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the first number :");
        int a = sc.nextInt();

        System.out.println(" Enter the second number: ");
        int c = sc.nextInt();

        int temp;

        temp = a;
        a = c;
        c = temp;
         

       System.out.println( "a - " + a);
       System.out.println(" c -" + c) ;
       sc.close();

        

        
    }
}
