



public class PalindromeString{
    public static boolean isPalindrome(String s ){
        int left = 0;
        int right = s.length() - 1 ;

        while(left < right){
            if( s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--; 

        }
return true;

    }
    public static void main(String[] args) {
        String str1 = " racecar ";
isPalindrome(str1);
        System.out.println( str1 + " after reversing " + isPalindrome(str1));
        System.out.println(str1);
    }}
