import java.util.Scanner;

public class printSubstrings {

    static void printSet(String input, String output, int index) {
        if (index == input.length()) {
            System.out.println("\"" + output + "\"");
            return;
        }

        // Exclude current character
        printSet(input, output, index + 1);

        // Include current character
        printSet(input, output + input.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String alpha = sc.next();

        System.out.print("All subsets of \"" + alpha + "\":");
        printSet(alpha, "", 0);
    }
}


