

class linearSearch{
    public static int linearTree(int[] arr , int target){

        for( int i=0 ; i<arr.length ; i++){
            if(arr[i] == target){
                System.out.print(" element is at : " +i );
                return i;
            } 
        }
      System.out.print(" element is not present in the array...");
      System.out.print("\n");
              return -1;  
    }
    public static void main(String[] args) {
        int[] arr = {2,4,51,64,7,9,8};
        int target = 2;
        int result = linearTree(arr , target);
        System.out.print(" result: " + result);
    }}
