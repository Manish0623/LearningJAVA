import java.util.Scanner;
public class Reverse {
    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
       return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int number = sc.nextInt();
int REV = reverse(number, 0);

        System.out.println("Reversed number: " + REV);
        sc.close();
    }
}
