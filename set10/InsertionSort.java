public class InsertionSort{
    public static void Insertion(int[] arr , int n){
        for ( int i = 0 ; i< n ; i++){
            int key = arr[i];
            int j= i -1 ;



            while( j >=0 && arr[j] > key){
                arr[ j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int n= 9 ; 
        int[] arr = {99,55,66,77,33,1,0,2,4};

System.out.println(" Original Array :");
for ( int i : arr){
    System.out.print( i + " ");
}

Insertion( arr , n);


System.out.println("\n\n After Insertion Sort : ");
for( int i : arr){
    System.out.print( i + " ");
}
    }}
