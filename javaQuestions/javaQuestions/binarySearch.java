

// class binarySearch{
//     public static int searchTree(int[] arr , int target){
//         int left = 0 ; 
//         int right = arr.length - 1;
//         while(left <= right){
//             int mid = (left+right)/2;

//             if(arr[mid] == target){
//                 System.out.println(" Element at mid: " + mid);
//                 return mid ;
//             }
// else if(arr[mid]< target){
//     left = mid + 1;
// } else{
//     right = mid -1;
// }
//         }
// System.out.println("element not found in the array...");
// return -1;
//     }
// }

class binarySearch{
    public static int searchTree( int[] arr , int target){
        int left = 0;
         int right = arr.length - 1 ;

         while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                System.out.print(" The mid value is : " + mid);
                return mid;
            }else if(arr[mid]<target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
         }
         System.out.println("Element no found...");
         return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,12,51};
        int target = 13;

        int result = searchTree(arr , target);
        System.out.print(" The result is: " + result);
    }}
