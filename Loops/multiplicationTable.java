
import java.util.Scanner;
public class multiplicationTable {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = sc.nextInt();
System.out.println("The multiplication of the table:");
    for(int i=1; i<=10;i++){
        int multiply = (number * i);
        System.out.println( number + " X " + i +  " = " +  multiply);    
    }

}

}
