

public class LcmOfNumber{


static int lcm( int a , int b){
    int max = (a > b) ? a: b;


while(true){
    if ( max % a == 0 && max % b == 0 ){
        return max;
    }
    max++;
}
}

public static void main(String[] args) {
    int num1 = 20;
    int num2 = 11;

int result = lcm( num1 ,  num2 );

System.out.println(" The lcm of  " + num1 + " and  " + num2 + " is : " + result );

}}

