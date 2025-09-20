public class ReverseDigit{
    public static void main(String[] args) {
         int number = 23456;
         int rev = 0;

         while( number!=0){
            int digit = number % 10 ;
             rev = rev * 10 + digit;
              number = number / 10;



         }
         System.out.println(" Number after reversing : " + rev);
    }}
