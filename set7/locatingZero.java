import java.util.Arrays;

public class locatingZero {
    public static void main(String[] args) {
        int[] arr = {10, 0, 0, 23, 0};

        int index = 0;

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        
        // Step 2: Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));
    }
}

