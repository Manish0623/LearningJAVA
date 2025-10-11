import java.util.*;

public class Amargam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = sc.next();
        System.out.println("Enter the second string:");
        String str2 = sc.next();

        sc.close();

        // Step 1: Check lengths
        if (str1.length() != str2.length()) {
            System.out.println("It's not an anagram");
            return;
        }

        // Step 2: Count letters
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++;
            count2[str2.charAt(i) - 'a']++;
        }

        // Step 3: Compare counts
        boolean anagram = true;
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                anagram = false;
                break;
            }
        }

        // Step 4: Print result
        if (anagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
