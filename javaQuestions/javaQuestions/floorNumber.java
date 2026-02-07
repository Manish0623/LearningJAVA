

class floorNumber{
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6,7,8,9};
        int target = 6;
        int result = floor(arr, target);
        System.out.print(result);

    }
    static int floor(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1 ;
int answer = -1;
while(start <= end){
    int mid = start + (end - start)/2;

    if(arr[mid] == target){
        return mid;
    }
else if(arr[mid]< target){
    answer = mid;
    start = mid+1;
}else{
    end = mid - 1;
}
}
return answer;
    }
}