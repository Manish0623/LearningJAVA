

// class peakMountain{
//     public static void main(String[] args){
//         int[] arr = {1,2,5,6,4,7,8};
//         System.out.print(peak(arr));
//     }
//      static int peak(int[] arr){
//         int start = 0;
//         int end = arr.length - 1 ;

//         while(start < end){
// int mid = start + (end - start) / 2;
// if(arr[mid] > arr[mid + 1]){
// end = mid;
// }
//         }
//         return start;
//      } 
// }

class peakMountain{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,4,6,7};
        System.out.print(peak(arr));
    }
    static int peak(int[] arr){
        int start = 0;
        int end  = arr.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}