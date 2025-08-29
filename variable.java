/* 


literals in java....


*/ 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the 1st number...");
//         int a = sc.nextInt();

//         System.out.println("Enter the 2nd number...");
//         int b = sc.nextInt();

//         int sum = a + b;
//         System.out.println("The sum of the numbers is: " + sum);

//         // Example of checking next input
//         System.out.println("Enter another number (optional): ");
//         boolean b1 = sc.hasNextInt(); // Will check if next input is int
//         System.out.println("The value of b1: " + b1);

//         sc.close();
//     }
// }
import java.util.Scanner;

public class variable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 5 subjects...");

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total marks obtained is :" + total);

        int percentage = (total)/5;
        System.out.println("The percentage obtained is :" + percentage + "%");
    }
}


// using Scanner class....


