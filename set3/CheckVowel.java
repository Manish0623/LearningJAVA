package set3;
import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.println(" Enter a string :  ");
String str = sc.nextLine().toLowerCase();

boolean hasVowel = false;

for( int i =0;i<=str.length();i++){
char ch = str.charAt(i);

if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ){
    hasVowel = true;
    break;
}
}
if(hasVowel){
    System.out.println(" The string contain vowels. ");
}
else{
    System.out.println(" The string dosen't contain vowels. ");
}
sc.close();
    }
    
}
