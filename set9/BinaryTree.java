public class BinaryTree {

    // Binary Search method
    public static int findBinaryTree(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Element not found
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {10, 20, 40, 50, 60, 70};
        int target = 30;

        int result = findBinaryTree(array, target);

        if (result != -1)
            System.out.println("Element " + target + " found at index " + result);
        else
            System.out.println("Element " + target + " not found in the array.");
    }
}
 