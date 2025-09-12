import java.util.Scanner;

public class SimpleRomanToInteger {

    public static int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));

            // Check if there's a next character and compare values
            if (i + 1 < s.length()) {
                int next = getValue(s.charAt(i + 1));

                if (current < next) {
                    total -= current; // Subtract if smaller before larger
                } else {
                    total += current;
                }
            } else {
                total += current; // Last character
            }
        }

        return total;
    }

    // Helper method to convert single Roman char to int
    public static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid character
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine().toUpperCase(); // Convert to uppercase

        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);
    }
}

