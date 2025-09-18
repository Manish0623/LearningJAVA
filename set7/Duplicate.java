//package PracticeSet;

public class Duplicate{
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,31,45};
        
        System.out.println("Diplicates Arrays:");

        for(int i=0;i<arr.length ; i++){
            for( int j= i+1 ; j<arr.length ; j++ ){
                if(arr[i] == arr[j]){
                    System.out.println( arr[i] + " ");
                    break;
                }
            }
        }

    }}


