import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(String[] nums) {
        // No need to copy, but if you want to keep original array untouched, copy
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // Trim spaces in case input has spaces around numbers
            arr[i] = nums[i].trim();
        }

        // Sort with custom comparator to form largest number
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", all are zeros
        if (arr[0].equals("0")) return "0";

        // Join all strings
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();

        // Remove spaces inside strings for accurate comparison
        String[] arr = {"2", "99", "54", "21", "9"};

        System.out.println("Largest Number: " + ln.largestNumber(arr));
    }
}
