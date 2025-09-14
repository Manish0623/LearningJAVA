import java.util.Scanner;
public class SubString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.println(" Enter a String : ");
String str = sc.nextLine();

System.out.print(" SubString  " + str + ": ");

int length = str.length();
for ( int i =0 ;i<length ; i++){
    for ( int j = i +1 ; j<=length ; j++){
System.out.println(str.substring(i , j));
sc.close();
    }
}
    }}


