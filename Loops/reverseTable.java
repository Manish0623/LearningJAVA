import java.util.Scanner;
public class reverseTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number ");
        int number  = sc.nextInt();

        System.out.println(" The reverse table of " + number +  ":");

        for(int i=10;i>=1;i--){
            int multiply = (number * i);
            System.out.println(number + " x " + i + " = " + multiply);
        }
  sc.close();
}

    }
  
