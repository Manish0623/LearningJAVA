public class subArray {
    public static long sumOfArrays(int[] arr) {
        int n = arr.length;
        long total = 0;

        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * (i + 1) * (n - i);
            total += contribution;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        System.out.println(sumOfArrays(arr1));
    }
}
