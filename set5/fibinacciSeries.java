import java.util.Scanner;

public class fibinacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int number = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series: ");

        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");

            int next = a + b;  // generate next number
            a = b;             // move b to a
            b = next;          // update b to next
        }

        sc.close();
    }
}
