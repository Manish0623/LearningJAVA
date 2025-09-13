package set3;

import java.util.Scanner;

public class findingFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long number = sc.nextLong();  

        long factorial = 1; 

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (long i = number; i >= 1; i--) { 
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
