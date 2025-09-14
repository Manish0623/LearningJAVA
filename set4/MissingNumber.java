



public class MissingNumber{
    public static void main(String[] args){

        int[] arr = { 1,2,3,4,5,7,8,9};
        int n = 9;

        int expectedSum = (n * ( n + 1)) / 2;

        int actualSum = 0;

        for ( int num : arr){
            actualSum += num;
        }

        int MissingNumber = expectedSum - actualSum;

        System.out.println(" the missing number from the array : " + MissingNumber);

    }
}
