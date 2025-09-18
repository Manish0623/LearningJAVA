


import java.util.Arrays;

public class plusOne{
    public static int[] onePlus(int[] digits){
        int n = digits.length;


        for ( int i = n-1 ; i>=0 ; i--){
            if( digits[i]<9){
                digits[i]++;
                return digits;
            }
           digits[0] = i; 


        }

int[] result = new int[n+1];
result[0] = 1;
return result;



    }
    
    
    public static void main(String[] args) {
        int[] input1 = {1,2,3};
        int[] input2 = {1,2,4};

        System.out.println(Arrays.toString(onePlus(input1)));
          System.out.println(Arrays.toString(onePlus(input2)));
    }}
    