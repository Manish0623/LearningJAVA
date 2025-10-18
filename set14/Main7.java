
import java.util.Scanner;
public class Main7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number : ");
        int number = sc.nextInt();

      int result =   number << 2;
      int result1 = number >> 1;

      System.out.println(result);
        System.out.println(result1);
    }
}