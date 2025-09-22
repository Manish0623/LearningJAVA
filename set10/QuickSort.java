public class QuickSort {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {8, 9, 10, 5, 6, 3, 99, 54};

        quickSort(arr, 0, n - 1);

        System.out.println("After Sorting:");
        printArray(arr); 
    }

   
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);   
            quickSort(arr, pi + 1, high);  
        }
    }

 
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = low - 1;    

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

             
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

   
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
