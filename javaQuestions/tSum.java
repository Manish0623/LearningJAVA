

import java.util.Arrays;
class tSum{
    public static int[] twoSum(int[] num , int target){
for(int i= 0 ; i<num.length ; i++){
    for(int j = i+1 ; j<num.length ; j++){
        if(num[i] + num[j] == target){
            return new int[]{i , j};
        }
    }
}
return new int[]{};
    }
    public static void main(String[] args) {
        int[] num = {2,3,4,1,6};
        int target = 5;

        int result[] = twoSum(num , target);
        System.out.print(Arrays.toString(result));
    }}
