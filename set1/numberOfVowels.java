import java.util.Scanner;
public class numberOfVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.println(" Enter the string ");
String str = sc.nextLine();
int count = 0;
for (int i=0;i<str.length();i++){
char ch = str.charAt(i);
if(Character.isDigit(ch)){
    count++;
}
}
System.out.println(" number of vowels in the string : " + count);
sc.close();
    }
}
