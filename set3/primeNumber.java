package set3;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a <= 1) {
            System.out.println("Not a prime number.");
        } else if (isPrime(a)) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }

        sc.close();
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num == 2) return true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}

