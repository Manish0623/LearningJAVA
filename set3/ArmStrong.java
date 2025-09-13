import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;
        int digits = 0;
        int temp = number;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * digit;  
            }
            sum = sum + power;
            temp = temp / 10;
        }


        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
