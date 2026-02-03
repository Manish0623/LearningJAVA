public class concat{
    public static void main(String[] args) {
        int[] arr1  ={1,2,3};
        int[] arr2 = { 4,5,6};

        int len1 = arr1.length;
        int len2 = arr2.length;

int[] result = new int[len1 + len2];


for( int i=  0 ; i<len1 ; i++){
    result[i] = arr1[i];
}
for( int i= 0 ; i<len2 ; i++){
    result[len1 + i] = arr2[i];
}
for( int num : result){
    System.out.print(num + " ");
}
    }}
