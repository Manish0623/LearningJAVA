


// class twoSum{
//     public static void main(String[] args){
// int[] arr = {1,2,6,8,11};
// int target = 8;
// for( int i=  0; i<arr.length ; i++){
//     for (int  j = i+1 ; j<arr.length ; j++){
//         if(arr[i] + arr[j] == target){
//             System.out.print("indices are: " + i + " and" + j);
//         }
//     }
// }
//     }
// }


class twoSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 8, 11};
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices are: " + i + " and " + j);
                }
            }
        }
    }
}
