package set3;

public class FindingList {

    // Helper method to check if all elements are odd
    public static boolean allOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return false;  // Found an even number
            }
        }
        return true;  // All are odd
    }

    public static void main(String[] args) {
        int[] arr = {11, 13, 15, 16, 17, 19, 21, 23};

        if (allOdd(arr)) {
            System.out.println(" All elements are odd.");
        } else {
            System.out.println(" The list contains even numbers.");
        }
    }
}


