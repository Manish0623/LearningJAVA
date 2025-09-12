package set3;

import java.util.Scanner;

public class FibinocciSeries {

    public static int fibinocci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibinocci(n - 1) + fibinocci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibinocci(i) + " ");
        }

        sc.close();
    }
}


