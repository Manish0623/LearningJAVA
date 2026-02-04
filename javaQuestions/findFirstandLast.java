

class findFirstandLast {

    public static int findFirst(int[] arr , int target){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                result = mid;
                right = mid - 1;  
            }
            else if(arr[mid] < target){
                left = mid + 1;    
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }

    public static int findLast(int[] arr , int target){
        int left = 0;
        int right  = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                result = mid;
                left = mid + 1;   // move right side
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 1;

        int result1 = findFirst(arr, target);
        int result2 = findLast(arr , target);

        System.out.println("First occurrence: " + result1);
        System.out.println("Last occurrence: " + result2);
    }
}

