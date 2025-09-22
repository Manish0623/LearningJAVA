public class SelectionSort {
    
    // Selection sort method
    public static void selection(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {9, 10, 56, 45, 32, 12, 43, 55};

        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    
        selection(arr, n);

        System.out.println("\n\nAfter Selection Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}



    
