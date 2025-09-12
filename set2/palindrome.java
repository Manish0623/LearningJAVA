

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


System.out.println("Enter a number : ");
int number = sc.nextInt();


int Number = number;
int reverse = 0;


while( Number!=0){
    int digit = Number%10;
    reverse = reverse *10 + digit;
    Number = Number/10;
}


if( number == reverse ){
    System.out.println(number + " it is a palindrome. ");
}
else{
    System.out.println(number + " is not a palindrome.");
}
}
}

