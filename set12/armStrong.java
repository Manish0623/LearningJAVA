


import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (isArmStrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }

    public static boolean isArmStrong(int num) {
        int original = num;
        int sum = 0;

    
        int digits = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        if (digits == 0) {
            digits = 1;
        }

       
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}
