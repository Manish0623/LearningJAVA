

class count{
    public static int list(int[] arr , int target){
        int count = 0;
        for( int i= 0 ; i<=arr.length - 1 ; i++){
            if( arr[i] == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,2,3,3,3,4,4,4,5,6,7};
        int target = 7;
        int result = list(arr, target);
        System.out.print(result);

    }
}