public class FindDublicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 5, 6, 7};
        System.out.println("Check Duplicates:");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;  // Optional optimization: stop inner loop once duplicate found
                }
            }

            if (isDuplicate && !isAlreadyPrinted(arr, i)) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static boolean isAlreadyPrinted(int[] arr, int index) {
        for (int k = 0; k < index; k++) {
            if (arr[k] == arr[index]) {
                return true;
            }
        }
        return false;
    }
}
