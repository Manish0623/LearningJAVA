
class findArray{
    public static boolean list(int[] arr , int target){
        for( int i= 0 ; i<= arr.length-1 ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;
        boolean result = list(arr, target);
        System.out.print(result);
    }}
