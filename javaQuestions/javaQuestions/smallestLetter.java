

class smallestLetter{
    public static void main(String[] args){
        char[] arr = {'a','c','e','f','f','k'};
        char target = 'f';
        char result = smallest(arr,  target);
            System.out.print(result);
        
    } 
    static char smallest(char[] arr , char target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return arr[start% arr.length];
    }
    }