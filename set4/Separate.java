


public class Separate {
    public static void main(String[] args) {
        int[] arr = { 10,11,23,44,55,65,76,77};


System.out.print(" Number of even numbers from the array: ");
for ( int num : arr){
    if ( num % 2 == 0){
        System.out.print(num + " ");
    }
}
System.out.println();


System.out.print(" Number of odd Numbers from the array : ");
for( int num : arr){
    if( num % 2  !=0){
        System.out.print( num + " ");
    }
}

    }}

