

class ifSorted{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,910,10,9,8,7,6,5,4,3,2,1};
        boolean isSorted = true;

        for( int i= 0 ;i<=arr.length - 1 ; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
if(isSorted){
    System.out.print(" It is sorted...");
}else{
    System.out.print(" it is not sorted...");
}
    }}
