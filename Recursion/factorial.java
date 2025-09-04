import java.util.Scanner;

public class factorial {

    // Recursive method to calculate factorial
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        int result = fact(number);  // Correctly call the fact method

        System.out.printf("The factorial of %d is: %d%n", number, result);

        sc.close();  // Good practice to close the scanner
    }
}

