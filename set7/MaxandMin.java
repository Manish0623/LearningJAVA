//package PracticeSet;

public class MaxandMin {
    public static void main(String[] args) {
        
int[] arr = {10,20,66,99,21,34};

int max = arr[0];
int min=arr[0];

for ( int i=1 ; i<arr.length ; i++){
    if(arr[i] > max){
max = arr[i];
    }
    if(arr[i]<min){
        min = arr[i];
    }
}
System.out.println("The maximum array is : " + max);
System.out.println("The minimum array is : " + min);
    }}

