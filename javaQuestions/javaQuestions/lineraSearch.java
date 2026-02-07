
class main {
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; 
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8};
        int target = 4;
        System.out.print(linearSearch(arr, target)); 
    }
}
