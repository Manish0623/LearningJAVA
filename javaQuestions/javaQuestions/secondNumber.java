

// class secondNumber{
//     public static void main(String[] args){
//         int[] arr = { 1,2,3,4,5,6,7,8,9,2,3,1,5,4,3};
//          int max = Integer.MIN_VALUE;
//          int secondMax = Integer.MIN_VALUE;

//          for( int i= 0 ; i<arr.length ; i++){
//             if(arr[i]> max){
//                 secondMax = max;
//                 max = arr[i];
//             } else if(arr[i] > secondMax && arr[i] != max){
//                 secondMax = arr[i];
//             }
//          }
//          System.out.print(" second largest: " + secondMax);
//     }
// }

class secondNumber{
    public static void main(String[] args){
        int[] arr = {1,2,7,87,06, 90,2,32};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for(int i = 0; i <arr.length ; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
            secondMax = arr[i];
        }
        }
        System.out.print(" second Largest:" + secondMax);
    }
}