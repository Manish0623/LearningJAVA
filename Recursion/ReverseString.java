import java.util.Scanner;

public class ReverseString {
    static void reverse(char[] chars, int left, int right) {
        if (left >= right) {
            return;
        }

        // Swap characters
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        // Recursive call: move towards the center
        reverse(chars, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] characters = input.toCharArray();

        System.out.println("Before reversing: " + input);

        reverse(characters, 0, characters.length - 1);

        System.out.println("After reversing: " + new String(characters));
    }
}

