public class maxandMin {
    public static void main(String[] args) {
        long[] arr = {100,400,6000,1,20};

        long max = arr[0];
        long min = arr[0];

for( int i=1;i<arr.length;i++){
    if(arr[i]>max){
        max= arr[i];
    }
    if(arr[i]<min){
        min = arr[i];
    }
}
System.out.println(" Largest Element :" + max);
System.out.println(" smallest Element :" + min);
    }}

