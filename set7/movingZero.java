public class movingZero{
    public static void moveToend( int[] arr ){
        int n = arr.length;
        int k = 0;
        for ( int i = 0 ; i<n ;i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }
          for( int i = k ;i<n ; i++){
                arr[i] = 0;
            }
    }
    public static void main(String[] args){
        int[] arr = {1,0,2,0,4,0,5,0};
moveToend(arr);
        for( int x : arr){
            System.out.print(x + " ");
        }
    }
}