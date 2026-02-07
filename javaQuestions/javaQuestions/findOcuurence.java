class FindOccurrence {

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;       // store index
                left = mid + 1;     // move right to find last occurrence
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,5,5,5};
        int target = 2;

        int index = lastOccurrence(arr, target);
        System.out.println("Last occurrence index: " + index);
    }
}
