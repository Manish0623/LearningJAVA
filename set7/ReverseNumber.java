


public class ReverseNumber{
    public static void reverse(int num){
        if( num <0){
            System.out.println(0);
            return;
        }



int reversed = 0;
while( num != 0){
    int digit = num % 10;
    reversed = reversed * 10 + digit;
num = num /10;
}

System.out.println(" After reversing " + reversed);
    }
    public static void main(String[] args){
  reverse(123);



}
}