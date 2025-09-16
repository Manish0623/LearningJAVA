import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second Number: ");
        int b = sc.nextInt();

        int sum = 0;
        if (a == 0 && b == 0) {
            System.out.println("The sum of numbers: 0");
        } else {
            sum = a + b;
            System.out.println("The sum of numbers: " + sum);
        }

        sc.close();
    }
}

