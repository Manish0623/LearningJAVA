

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        while (number > 0) {
            number = number & (number - 1);
            count++;
        }

        System.out.println("Number of set bits = " + count);
    }
}
