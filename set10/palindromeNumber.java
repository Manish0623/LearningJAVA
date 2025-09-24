public class palindromeNumber{
    public static boolean ispalindrome(int num){
        int original = num;
        int reversed = 0;

while( num !=0){
    int digit = num % 10;
    reversed = reversed *10 + digit;
    num = num/10;
}

return original == reversed;

    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(" Is palindrome: " + ispalindrome(num));
    }}
