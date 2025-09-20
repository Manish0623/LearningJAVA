

import java.util.Scanner;
public class ReverseString{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);


System.out.println(" Enter a String :  ");
String original = sc.nextLine();


char[] characters = original.toCharArray();


int left = 0 ; 
int right = characters.length - 1 ;


while( left < right){
  char temp = characters[left];
characters[left] = characters[right];
characters[right] = temp;

left++;
right--;
}
String reversed = new String(characters);
System.out.println( " String after reversed : " + reversed );
sc.close();
    }

}